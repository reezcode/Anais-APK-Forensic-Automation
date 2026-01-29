package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.d;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private Random mRandom = new Random();
    private final Map<Integer, String> mRcToKey = new HashMap();
    public final Map<String, Integer> mKeyToRc = new HashMap();
    private final Map<String, LifecycleContainer> mKeyToLifecycleContainers = new HashMap();
    public ArrayList<String> mLaunchedKeys = new ArrayList<>();
    public final transient Map<String, CallbackAndContract<?>> mKeyToCallback = new HashMap();
    public final Map<String, Object> mParsedPendingResults = new HashMap();
    public final Bundle mPendingResults = new Bundle();

    /* loaded from: classes18.dex */
    public static class CallbackAndContract<O> {
        public final ActivityResultCallback<O> mCallback;
        public final ActivityResultContract<?, O> mContract;

        public CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.mCallback = activityResultCallback;
            this.mContract = activityResultContract;
        }
    }

    /* loaded from: classes4.dex */
    public static class LifecycleContainer {
        public final Lifecycle mLifecycle;
        private final ArrayList<LifecycleEventObserver> mObservers = new ArrayList<>();

        public LifecycleContainer(@NonNull Lifecycle lifecycle) {
            this.mLifecycle = lifecycle;
        }

        public void addObserver(@NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle.addObserver(lifecycleEventObserver);
            this.mObservers.add(lifecycleEventObserver);
        }

        public void clearObservers() {
            Iterator<LifecycleEventObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                this.mLifecycle.removeObserver(it.next());
            }
            this.mObservers.clear();
        }
    }

    private void bindRcKey(int i5, String str) {
        this.mRcToKey.put(Integer.valueOf(i5), str);
        this.mKeyToRc.put(str, Integer.valueOf(i5));
    }

    private <O> void doDispatch(String str, int i5, @Nullable Intent intent, @Nullable CallbackAndContract<O> callbackAndContract) {
        if (callbackAndContract == null || callbackAndContract.mCallback == null || !this.mLaunchedKeys.contains(str)) {
            this.mParsedPendingResults.remove(str);
            this.mPendingResults.putParcelable(str, new ActivityResult(i5, intent));
        } else {
            callbackAndContract.mCallback.onActivityResult(callbackAndContract.mContract.parseResult(i5, intent));
            this.mLaunchedKeys.remove(str);
        }
    }

    private int generateRandomNumber() {
        int nextInt = this.mRandom.nextInt(2147418112);
        while (true) {
            int i5 = nextInt + 65536;
            if (!this.mRcToKey.containsKey(Integer.valueOf(i5))) {
                return i5;
            }
            nextInt = this.mRandom.nextInt(2147418112);
        }
    }

    private void registerKey(String str) {
        if (this.mKeyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i5, int i6, @Nullable Intent intent) {
        String str = this.mRcToKey.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        doDispatch(str, i6, intent, this.mKeyToCallback.get(str));
        return true;
    }

    @MainThread
    public final <O> boolean dispatchResult(int i5, @SuppressLint({"UnknownNullness"}) O o4) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.mRcToKey.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.mKeyToCallback.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.mCallback) == null) {
            this.mPendingResults.remove(str);
            this.mParsedPendingResults.put(str, o4);
            return true;
        }
        if (!this.mLaunchedKeys.remove(str)) {
            return true;
        }
        activityResultCallback.onActivityResult(o4);
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i5, @NonNull ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i6, @Nullable ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.mLaunchedKeys = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        this.mRandom = (Random) bundle.getSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT);
        this.mPendingResults.putAll(bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS));
        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
            String str = stringArrayList.get(i5);
            if (this.mKeyToRc.containsKey(str)) {
                Integer remove = this.mKeyToRc.remove(str);
                if (!this.mPendingResults.containsKey(str)) {
                    this.mRcToKey.remove(remove);
                }
            }
            bindRcKey(integerArrayList.get(i5).intValue(), stringArrayList.get(i5));
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.mKeyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.mKeyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.mLaunchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, (Bundle) this.mPendingResults.clone());
        bundle.putSerializable(KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT, this.mRandom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull final String str, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        registerKey(str);
        this.mKeyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.mParsedPendingResults.containsKey(str)) {
            Object obj = this.mParsedPendingResults.get(str);
            this.mParsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.mPendingResults.getParcelable(str);
        if (activityResult != null) {
            this.mPendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            @NonNull
            public ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i5, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Integer num = ActivityResultRegistry.this.mKeyToRc.get(str);
                if (num != null) {
                    ActivityResultRegistry.this.mLaunchedKeys.add(str);
                    ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i5, activityOptionsCompat);
                    return;
                }
                StringBuilder g5 = d.g("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                g5.append(activityResultContract);
                g5.append(" and input ");
                g5.append(i5);
                g5.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(g5.toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister(str);
            }
        };
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull final String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        registerKey(str);
        LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.mKeyToCallback.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.unregister(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.mKeyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
                if (ActivityResultRegistry.this.mParsedPendingResults.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.mParsedPendingResults.get(str);
                    ActivityResultRegistry.this.mParsedPendingResults.remove(str);
                    activityResultCallback.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.mPendingResults.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.mPendingResults.remove(str);
                    activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                }
            }
        });
        this.mKeyToLifecycleContainers.put(str, lifecycleContainer);
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            @NonNull
            public ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i5, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Integer num = ActivityResultRegistry.this.mKeyToRc.get(str);
                if (num != null) {
                    ActivityResultRegistry.this.mLaunchedKeys.add(str);
                    try {
                        ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i5, activityOptionsCompat);
                        return;
                    } catch (Exception e5) {
                        ActivityResultRegistry.this.mLaunchedKeys.remove(str);
                        throw e5;
                    }
                }
                StringBuilder g5 = d.g("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                g5.append(activityResultContract);
                g5.append(" and input ");
                g5.append(i5);
                g5.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(g5.toString());
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister(str);
            }
        };
    }

    @MainThread
    public final void unregister(@NonNull String str) {
        Integer remove;
        if (!this.mLaunchedKeys.contains(str) && (remove = this.mKeyToRc.remove(str)) != null) {
            this.mRcToKey.remove(remove);
        }
        this.mKeyToCallback.remove(str);
        if (this.mParsedPendingResults.containsKey(str)) {
            StringBuilder f5 = a.f("Dropping pending result for request ", str, ": ");
            f5.append(this.mParsedPendingResults.get(str));
            Log.w(LOG_TAG, f5.toString());
            this.mParsedPendingResults.remove(str);
        }
        if (this.mPendingResults.containsKey(str)) {
            StringBuilder f6 = a.f("Dropping pending result for request ", str, ": ");
            f6.append(this.mPendingResults.getParcelable(str));
            Log.w(LOG_TAG, f6.toString());
            this.mPendingResults.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.mKeyToLifecycleContainers.remove(str);
        }
    }
}
