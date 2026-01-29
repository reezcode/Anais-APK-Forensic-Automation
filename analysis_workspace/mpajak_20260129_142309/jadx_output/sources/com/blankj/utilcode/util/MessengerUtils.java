package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.a;
import com.blankj.utilcode.util.NotificationUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public class MessengerUtils {
    private static final String KEY_STRING = "MESSENGER_UTILS";
    private static final int WHAT_SEND = 2;
    private static final int WHAT_SUBSCRIBE = 0;
    private static final int WHAT_UNSUBSCRIBE = 1;
    private static Client sLocalClient;
    private static ConcurrentHashMap<String, MessageCallback> subscribers = new ConcurrentHashMap<>();
    private static Map<String, Client> sClientMap = new HashMap();

    /* loaded from: classes16.dex */
    public static class Client {
        public String mPkgName;
        public Messenger mServer;
        public LinkedList<Bundle> mCached = new LinkedList<>();

        @SuppressLint({"HandlerLeak"})
        public Handler mReceiveServeMsgHandler = new Handler() { // from class: com.blankj.utilcode.util.MessengerUtils.Client.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MessageCallback messageCallback;
                Bundle data = message.getData();
                data.setClassLoader(MessengerUtils.class.getClassLoader());
                String string = data.getString(MessengerUtils.KEY_STRING);
                if (string == null || (messageCallback = (MessageCallback) MessengerUtils.subscribers.get(string)) == null) {
                    return;
                }
                messageCallback.messageCall(data);
            }
        };
        public Messenger mClient = new Messenger(this.mReceiveServeMsgHandler);
        public ServiceConnection mConn = new ServiceConnection() { // from class: com.blankj.utilcode.util.MessengerUtils.Client.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Log.d("MessengerUtils", "client service connected " + componentName);
                Client.this.mServer = new Messenger(iBinder);
                Message obtain = Message.obtain(Client.this.mReceiveServeMsgHandler, 0, UtilsBridge.getCurrentProcessName().hashCode(), 0);
                obtain.getData().setClassLoader(MessengerUtils.class.getClassLoader());
                Client client = Client.this;
                obtain.replyTo = client.mClient;
                try {
                    client.mServer.send(obtain);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
                Client.this.sendCachedMsg2Server();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w("MessengerUtils", "client service disconnected:" + componentName);
                Client client = Client.this;
                client.mServer = null;
                if (client.bind()) {
                    return;
                }
                Log.e("MessengerUtils", "client service rebind failed: " + componentName);
            }
        };

        public Client(String str) {
            this.mPkgName = str;
        }

        private boolean send2Server(Bundle bundle) {
            Message obtain = Message.obtain(this.mReceiveServeMsgHandler, 2);
            bundle.setClassLoader(MessengerUtils.class.getClassLoader());
            obtain.setData(bundle);
            obtain.replyTo = this.mClient;
            try {
                this.mServer.send(obtain);
                return true;
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendCachedMsg2Server() {
            if (this.mCached.isEmpty()) {
                return;
            }
            for (int size = this.mCached.size() - 1; size >= 0; size--) {
                if (send2Server(this.mCached.get(size))) {
                    this.mCached.remove(size);
                }
            }
        }

        public boolean bind() {
            StringBuilder sb;
            String str;
            Intent intent;
            if (!TextUtils.isEmpty(this.mPkgName)) {
                if (!UtilsBridge.isAppInstalled(this.mPkgName)) {
                    sb = new StringBuilder();
                    str = "bind: the app is not installed -> ";
                } else if (UtilsBridge.isAppRunning(this.mPkgName)) {
                    intent = new Intent(a.c(new StringBuilder(), this.mPkgName, ".messenger"));
                    intent.setPackage(this.mPkgName);
                } else {
                    sb = new StringBuilder();
                    str = "bind: the app is not running -> ";
                }
                sb.append(str);
                sb.append(this.mPkgName);
                Log.e("MessengerUtils", sb.toString());
                return false;
            }
            intent = new Intent(Utils.getApp(), (Class<?>) ServerService.class);
            return Utils.getApp().bindService(intent, this.mConn, 1);
        }

        public void sendMsg2Server(Bundle bundle) {
            if (this.mServer != null) {
                sendCachedMsg2Server();
                if (send2Server(bundle)) {
                    return;
                }
                this.mCached.addFirst(bundle);
                return;
            }
            this.mCached.addFirst(bundle);
            Log.i("MessengerUtils", "save the bundle " + bundle);
        }

        public void unbind() {
            Message obtain = Message.obtain(this.mReceiveServeMsgHandler, 1, UtilsBridge.getCurrentProcessName().hashCode(), 0);
            obtain.replyTo = this.mClient;
            try {
                this.mServer.send(obtain);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
            try {
                Utils.getApp().unbindService(this.mConn);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface MessageCallback {
        void messageCall(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static class ServerService extends Service {
        private final ConcurrentHashMap<Integer, Messenger> mClientMap = new ConcurrentHashMap<>();

        @SuppressLint({"HandlerLeak"})
        private final Handler mReceiveClientMsgHandler;
        private final Messenger messenger;

        public ServerService() {
            Handler handler = new Handler() { // from class: com.blankj.utilcode.util.MessengerUtils.ServerService.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i5 = message.what;
                    if (i5 == 0) {
                        ServerService.this.mClientMap.put(Integer.valueOf(message.arg1), message.replyTo);
                        return;
                    }
                    if (i5 == 1) {
                        ServerService.this.mClientMap.remove(Integer.valueOf(message.arg1));
                    } else if (i5 != 2) {
                        super.handleMessage(message);
                    } else {
                        ServerService.this.sendMsg2Client(message);
                        ServerService.this.consumeServerProcessCallback(message);
                    }
                }
            };
            this.mReceiveClientMsgHandler = handler;
            this.messenger = new Messenger(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void consumeServerProcessCallback(Message message) {
            String string;
            MessageCallback messageCallback;
            Bundle data = message.getData();
            if (data == null || (string = data.getString(MessengerUtils.KEY_STRING)) == null || (messageCallback = (MessageCallback) MessengerUtils.subscribers.get(string)) == null) {
                return;
            }
            messageCallback.messageCall(data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendMsg2Client(Message message) {
            Message obtain = Message.obtain(message);
            for (Messenger messenger : this.mClientMap.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(obtain));
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            obtain.recycle();
        }

        @Override // android.app.Service
        @Nullable
        public IBinder onBind(Intent intent) {
            return this.messenger.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i5, int i6) {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, UtilsBridge.getNotification(NotificationUtils.ChannelConfig.DEFAULT_CHANNEL_CONFIG, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message obtain = Message.obtain(this.mReceiveClientMsgHandler, 2);
                obtain.replyTo = this.messenger;
                obtain.setData(extras);
                sendMsg2Client(obtain);
                consumeServerProcessCallback(obtain);
            }
            return 2;
        }
    }

    public static void post(@NonNull String str, @NonNull Bundle bundle) {
        bundle.putString(KEY_STRING, str);
        Client client = sLocalClient;
        if (client != null) {
            client.sendMsg2Server(bundle);
        } else {
            Intent intent = new Intent(Utils.getApp(), (Class<?>) ServerService.class);
            intent.putExtras(bundle);
            startServiceCompat(intent);
        }
        Iterator<Client> it = sClientMap.values().iterator();
        while (it.hasNext()) {
            it.next().sendMsg2Server(bundle);
        }
    }

    public static void register() {
        if (UtilsBridge.isMainProcess()) {
            if (UtilsBridge.isServiceRunning(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service is running.");
                return;
            } else {
                startServiceCompat(new Intent(Utils.getApp(), (Class<?>) ServerService.class));
                return;
            }
        }
        if (sLocalClient != null) {
            Log.i("MessengerUtils", "The client have been bind.");
            return;
        }
        Client client = new Client(null);
        if (client.bind()) {
            sLocalClient = client;
        } else {
            Log.e("MessengerUtils", "Bind service failed.");
        }
    }

    public static void register(String str) {
        if (sClientMap.containsKey(str)) {
            Log.i("MessengerUtils", "register: client registered: " + str);
            return;
        }
        Client client = new Client(str);
        if (client.bind()) {
            sClientMap.put(str, client);
            return;
        }
        Log.e("MessengerUtils", "register: client bind failed: " + str);
    }

    private static void startServiceCompat(Intent intent) {
        try {
            intent.setFlags(32);
            if (Build.VERSION.SDK_INT >= 26) {
                Utils.getApp().startForegroundService(intent);
            } else {
                Utils.getApp().startService(intent);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void subscribe(@NonNull String str, @NonNull MessageCallback messageCallback) {
        subscribers.put(str, messageCallback);
    }

    public static void unregister() {
        if (UtilsBridge.isMainProcess()) {
            if (!UtilsBridge.isServiceRunning(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service isn't running.");
                return;
            } else {
                Utils.getApp().stopService(new Intent(Utils.getApp(), (Class<?>) ServerService.class));
            }
        }
        Client client = sLocalClient;
        if (client != null) {
            client.unbind();
        }
    }

    public static void unregister(String str) {
        if (!sClientMap.containsKey(str)) {
            Log.i("MessengerUtils", "unregister: client didn't register: " + str);
            return;
        }
        Client client = sClientMap.get(str);
        sClientMap.remove(str);
        if (client != null) {
            client.unbind();
        }
    }

    public static void unsubscribe(@NonNull String str) {
        subscribers.remove(str);
    }
}
