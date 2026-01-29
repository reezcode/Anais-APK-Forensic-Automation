package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.activity.d;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes23.dex */
public final class UiMessageUtils implements Handler.Callback {
    private static final boolean DEBUG = UtilsBridge.isAppDebug();
    private static final String TAG = "UiMessageUtils";
    private final List<UiMessageCallback> mDefensiveCopyList;
    private final Handler mHandler;
    private final SparseArray<List<UiMessageCallback>> mListenersSpecific;
    private final List<UiMessageCallback> mListenersUniversal;
    private final UiMessage mMessage;

    public static final class LazyHolder {
        private static final UiMessageUtils INSTANCE = new UiMessageUtils();

        private LazyHolder() {
        }
    }

    /* loaded from: classes18.dex */
    public static final class UiMessage {
        private Message mMessage;

        private UiMessage(Message message) {
            this.mMessage = message;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(Message message) {
            this.mMessage = message;
        }

        public int getId() {
            return this.mMessage.what;
        }

        public Object getObject() {
            return this.mMessage.obj;
        }

        public String toString() {
            StringBuilder g5 = d.g("{ id=");
            g5.append(getId());
            g5.append(", obj=");
            g5.append(getObject());
            g5.append(" }");
            return g5.toString();
        }
    }

    public interface UiMessageCallback {
        void handleMessage(@NonNull UiMessage uiMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UiMessageUtils() {
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        this.mMessage = new UiMessage(null);
        this.mListenersSpecific = new SparseArray<>();
        this.mListenersUniversal = new ArrayList();
        this.mDefensiveCopyList = new ArrayList();
    }

    public static UiMessageUtils getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void logMessageHandling(@NonNull UiMessage uiMessage) {
        List<UiMessageCallback> list = this.mListenersSpecific.get(uiMessage.getId());
        if ((list == null || list.size() == 0) && this.mListenersUniversal.size() == 0) {
            StringBuilder g5 = d.g("Delivering FAILED for message ID ");
            g5.append(uiMessage.getId());
            g5.append(". No listeners. ");
            g5.append(uiMessage.toString());
            Log.w(TAG, g5.toString());
            return;
        }
        StringBuilder g6 = d.g("Delivering message ID ");
        g6.append(uiMessage.getId());
        g6.append(", Specific listeners: ");
        if (list == null || list.size() == 0) {
            g6.append(0);
        } else {
            g6.append(list.size());
            g6.append(" [");
            for (int i5 = 0; i5 < list.size(); i5++) {
                g6.append(list.get(i5).getClass().getSimpleName());
                if (i5 < list.size() - 1) {
                    g6.append(",");
                }
            }
            g6.append("]");
        }
        g6.append(", Universal listeners: ");
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() == 0) {
                g6.append(0);
            } else {
                g6.append(this.mListenersUniversal.size());
                g6.append(" [");
                for (int i6 = 0; i6 < this.mListenersUniversal.size(); i6++) {
                    g6.append(this.mListenersUniversal.get(i6).getClass().getSimpleName());
                    if (i6 < this.mListenersUniversal.size() - 1) {
                        g6.append(",");
                    }
                }
                g6.append("], Message: ");
            }
        }
        g6.append(uiMessage.toString());
        Log.v(TAG, g6.toString());
    }

    public void addListener(int i5, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> list = this.mListenersSpecific.get(i5);
            if (list == null) {
                list = new ArrayList<>();
                this.mListenersSpecific.put(i5, list);
            }
            if (!list.contains(uiMessageCallback)) {
                list.add(uiMessageCallback);
            }
        }
    }

    public void addListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            if (!this.mListenersUniversal.contains(uiMessageCallback)) {
                this.mListenersUniversal.add(uiMessageCallback);
            } else if (DEBUG) {
                Log.w(TAG, "Listener is already added. " + uiMessageCallback.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.mMessage.setMessage(message);
        if (DEBUG) {
            logMessageHandling(this.mMessage);
        }
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> list = this.mListenersSpecific.get(message.what);
            if (list != null) {
                if (list.size() == 0) {
                    this.mListenersSpecific.remove(message.what);
                } else {
                    this.mDefensiveCopyList.addAll(list);
                    Iterator<UiMessageCallback> it = this.mDefensiveCopyList.iterator();
                    while (it.hasNext()) {
                        it.next().handleMessage(this.mMessage);
                    }
                    this.mDefensiveCopyList.clear();
                }
            }
        }
        synchronized (this.mListenersUniversal) {
            if (this.mListenersUniversal.size() > 0) {
                this.mDefensiveCopyList.addAll(this.mListenersUniversal);
                Iterator<UiMessageCallback> it2 = this.mDefensiveCopyList.iterator();
                while (it2.hasNext()) {
                    it2.next().handleMessage(this.mMessage);
                }
                this.mDefensiveCopyList.clear();
            }
        }
        this.mMessage.setMessage(null);
        return true;
    }

    public void removeListener(int i5, @NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersSpecific) {
            List<UiMessageCallback> list = this.mListenersSpecific.get(i5);
            if (list == null || list.isEmpty()) {
                if (DEBUG) {
                    Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i5 + ", " + uiMessageCallback);
                }
            } else {
                if (DEBUG && !list.contains(uiMessageCallback)) {
                    Log.w(TAG, "Trying to remove specific listener that is not registered. ID " + i5 + ", " + uiMessageCallback);
                    return;
                }
                list.remove(uiMessageCallback);
            }
        }
    }

    public void removeListener(@NonNull UiMessageCallback uiMessageCallback) {
        synchronized (this.mListenersUniversal) {
            if (DEBUG && !this.mListenersUniversal.contains(uiMessageCallback)) {
                Log.w(TAG, "Trying to remove a listener that is not registered. " + uiMessageCallback.toString());
            }
            this.mListenersUniversal.remove(uiMessageCallback);
        }
    }

    public void removeListeners(int i5) {
        List<UiMessageCallback> list;
        if (DEBUG && ((list = this.mListenersSpecific.get(i5)) == null || list.size() == 0)) {
            Log.w(TAG, "Trying to remove specific listeners that are not registered. ID " + i5);
        }
        synchronized (this.mListenersSpecific) {
            this.mListenersSpecific.delete(i5);
        }
    }

    public final void send(int i5) {
        this.mHandler.sendEmptyMessage(i5);
    }

    public final void send(int i5, @NonNull Object obj) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i5, obj));
    }
}
