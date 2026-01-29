package p0;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.ErrorDialogFragment;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4630b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final c f4631c = new c();

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes16.dex */
    public class a extends b1.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4632a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f4632a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i5 = message.what;
            boolean z4 = true;
            if (i5 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i5);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c5 = c.this.c(this.f4632a);
            Objects.requireNonNull(c.this);
            AtomicBoolean atomicBoolean = f.f4636a;
            if (c5 != 1 && c5 != 2 && c5 != 3 && c5 != 9) {
                z4 = false;
            }
            if (z4) {
                c cVar = c.this;
                Context context = this.f4632a;
                Intent a5 = cVar.a(context, c5, "n");
                cVar.e(context, c5, a5 != null ? PendingIntent.getActivity(context, 0, a5, 134217728) : null);
            }
        }
    }

    @VisibleForTesting
    public c() {
    }

    @Override // p0.d
    @Nullable
    public final Intent a(Context context, int i5, @Nullable String str) {
        return super.a(context, i5, str);
    }

    @Override // p0.d
    public final int b(Context context, int i5) {
        return super.b(context, i5);
    }

    public final int c(Context context) {
        return b(context, d.f4634a);
    }

    public final boolean d(Activity activity, int i5, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog create;
        s0.f fVar = new s0.f(super.a(activity, i5, "d"), activity);
        if (i5 == 0) {
            create = null;
        } else {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(activity);
            }
            builder.setMessage(s0.a.b(activity, i5));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            String string = activity.getResources().getString(i5 != 1 ? i5 != 2 ? i5 != 3 ? R.string.ok : comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_enable_button : comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_update_button : comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, fVar);
            }
            String c5 = s0.a.c(activity, i5);
            if (c5 != null) {
                builder.setTitle(c5);
            }
            create = builder.create();
        }
        if (create == null) {
            return false;
        }
        if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            h hVar = new h();
            create.setOnCancelListener(null);
            create.setOnDismissListener(null);
            hVar.f4639b = create;
            if (onCancelListener != null) {
                hVar.f4640c = onCancelListener;
            }
            hVar.show(supportFragmentManager, "GooglePlayServicesErrorDialog");
        } else {
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
            create.setOnCancelListener(null);
            create.setOnDismissListener(null);
            errorDialogFragment.f637b = create;
            if (onCancelListener != null) {
                errorDialogFragment.f638c = onCancelListener;
            }
            errorDialogFragment.show(fragmentManager, "GooglePlayServicesErrorDialog");
        }
        return true;
    }

    @TargetApi(20)
    public final void e(Context context, int i5, PendingIntent pendingIntent) {
        int i6;
        if (i5 == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i5 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String d5 = i5 == 6 ? s0.a.d(context, "common_google_play_services_resolution_required_title") : s0.a.c(context, i5);
        if (d5 == null) {
            d5 = context.getResources().getString(comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_notification_ticker);
        }
        String e5 = i5 == 6 ? s0.a.e(context, "common_google_play_services_resolution_required_text", s0.a.a(context)) : s0.a.b(context, i5);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(d5).setStyle(new NotificationCompat.BigTextStyle().bigText(e5));
        if (v0.a.a(context)) {
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (v0.a.b(context)) {
                style.addAction(comeliest.metempsychosis.pokelogan.R.drawable.common_full_open_on_phone, resources.getString(comeliest.metempsychosis.pokelogan.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(R.drawable.stat_sys_warning).setTicker(resources.getString(comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e5);
        }
        if (v0.b.a()) {
            if (!v0.b.a()) {
                throw new IllegalStateException();
            }
            synchronized (f4630b) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            SimpleArrayMap<String, String> simpleArrayMap = s0.a.f5119a;
            String string = context.getResources().getString(comeliest.metempsychosis.pokelogan.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
            } else {
                if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                }
                style.setChannelId("com.google.android.gms.availability");
            }
            notificationManager.createNotificationChannel(notificationChannel);
            style.setChannelId("com.google.android.gms.availability");
        }
        Notification build = style.build();
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i6 = 10436;
            f.f4636a.set(false);
        } else {
            i6 = 39789;
        }
        notificationManager.notify(i6, build);
    }
}
