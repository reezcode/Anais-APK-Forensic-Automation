package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes12.dex */
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    /* loaded from: classes22.dex */
    public class AnonymousClass1<In> implements Observer<In> {
        public Out mCurrentOutput = null;
        public final /* synthetic */ Object val$lock;
        public final /* synthetic */ Function val$mappingMethod;
        public final /* synthetic */ MediatorLiveData val$outputLiveData;
        public final /* synthetic */ TaskExecutor val$workTaskExecutor;

        public AnonymousClass1(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = function;
            this.val$outputLiveData = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable final In in) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    MediatorLiveData mediatorLiveData;
                    synchronized (AnonymousClass1.this.val$lock) {
                        ?? apply = AnonymousClass1.this.val$mappingMethod.apply(in);
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        Out out = anonymousClass1.mCurrentOutput;
                        if (out == 0 && apply != 0) {
                            anonymousClass1.mCurrentOutput = apply;
                            mediatorLiveData = anonymousClass1.val$outputLiveData;
                        } else if (out != 0 && !out.equals(apply)) {
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            anonymousClass12.mCurrentOutput = apply;
                            mediatorLiveData = anonymousClass12.val$outputLiveData;
                        }
                        mediatorLiveData.postValue(apply);
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new AnonymousClass1(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
