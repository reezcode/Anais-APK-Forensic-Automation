package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.Apn;

@Deprecated
/* loaded from: classes7.dex */
public class TbsReaderView extends FrameLayout {
    public static final String IS_BAR_ANIMATING = "is_bar_animating";
    public static final String IS_BAR_SHOWING = "is_bar_show";
    public static final String IS_INTO_DOWNLOADING = "into_downloading";
    public static final String KEY_FILE_PATH = "filePath";
    public static final String KEY_TEMP_PATH = "tempPath";
    public static final int READER_CHANNEL_DOC_ID = 10965;
    public static final int READER_CHANNEL_PDF_ID = 10834;
    public static final int READER_CHANNEL_PPT_ID = 10833;
    public static final int READER_CHANNEL_TXT_ID = 10835;
    public static final String READER_STATISTICS_COUNT_CANCEL_LOADED_BTN = "AHNG802";
    public static final String READER_STATISTICS_COUNT_CLICK_LOADED_BTN = "AHNG801";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_BROWSER = "AHNG829";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DIALOG = "AHNG827";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DOWNLOAD = "AHNG828";
    public static final String READER_STATISTICS_COUNT_DOC_SEARCH_BTN = "AHNG826";
    public static final String READER_STATISTICS_COUNT_PDF_FOLDER_BTN = "AHNG810";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_BROWSER = "AHNG813";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DIALOG = "AHNG811";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DOWNLOAD = "AHNG812";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_BROWSER = "AHNG809";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DIALOG = "AHNG807";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DOWNLOAD = "AHNG808";
    public static final String READER_STATISTICS_COUNT_PPT_PLAY_BTN = "AHNG806";
    public static final String READER_STATISTICS_COUNT_RETRY_BTN = "AHNG803";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_BROWSER = "AHNG817";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DIALOG = "AHNG815";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DOWNLOAD = "AHNG816";
    public static final String READER_STATISTICS_COUNT_TXT_NOVEL_BTN = "AHNG814";
    public static final String TAG = "TbsReaderView";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1984f = false;
    public static String gReaderPackName = "";
    public static String gReaderPackVersion = "";

    /* renamed from: a, reason: collision with root package name */
    public Context f1985a;

    /* renamed from: b, reason: collision with root package name */
    public ReaderWizard f1986b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1987c;

    /* renamed from: d, reason: collision with root package name */
    public ReaderCallback f1988d;

    /* renamed from: e, reason: collision with root package name */
    public ReaderCallback f1989e;

    /* loaded from: classes4.dex */
    public interface ReaderCallback {
        public static final int COPY_SELECT_TEXT = 5003;
        public static final int GET_BAR_ANIMATING = 5000;
        public static final int GET_BAR_ISSHOWING = 5024;
        public static final int HIDDEN_BAR = 5001;
        public static final int INSTALL_QB = 5011;
        public static final int NOTIFY_CANDISPLAY = 12;
        public static final int NOTIFY_ERRORCODE = 19;
        public static final int READER_OPEN_QQ_FILE_LIST = 5031;
        public static final int READER_PDF_LIST = 5008;
        public static final int READER_PLUGIN_ACTIVITY_PAUSE = 5032;
        public static final int READER_PLUGIN_CANLOAD = 5013;
        public static final int READER_PLUGIN_COMMAND_FIXSCREEN = 5015;
        public static final int READER_PLUGIN_COMMAND_PDF_LIST = 5036;
        public static final int READER_PLUGIN_COMMAND_PPT_PLAYER = 5035;
        public static final int READER_PLUGIN_COMMAND_ROTATESCREEN = 5018;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND = 5038;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_CLEAR = 5041;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_NEXT = 5039;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_PREV = 5040;
        public static final int READER_PLUGIN_DOWNLOADING = 5014;
        public static final int READER_PLUGIN_RES_DOC_GUIDE = 5029;
        public static final int READER_PLUGIN_RES_FIXSCREEN_NORMAL = 5016;
        public static final int READER_PLUGIN_RES_FIXSCREEN_PRESS = 5017;
        public static final int READER_PLUGIN_RES_PDF_GUIDE = 5023;
        public static final int READER_PLUGIN_RES_PPT_GUIDE = 5021;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_NORMAL = 5019;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_PRESS = 5020;
        public static final int READER_PLUGIN_RES_TXT_GUIDE = 5022;
        public static final int READER_PLUGIN_SO_ERR = 5025;
        public static final int READER_PLUGIN_SO_INTO_START = 5027;
        public static final int READER_PLUGIN_SO_PROGRESS = 5028;
        public static final int READER_PLUGIN_SO_VERSION = 5030;
        public static final int READER_PLUGIN_STATUS = 5012;
        public static final int READER_PLUGIN_TEXT_FIND_RESULT = 5042;
        public static final int READER_PPT_PLAY_MODEL = 5009;
        public static final int READER_SEARCH_IN_DOCUMENT = 5026;
        public static final int READER_TOAST = 5005;
        public static final int READER_TXT_READING_MODEL = 5010;
        public static final int SEARCH_SELECT_TEXT = 5004;
        public static final int SHOW_BAR = 5002;
        public static final int SHOW_DIALOG = 5006;

        void onCallBackAction(Integer num, Object obj, Object obj2);
    }

    public TbsReaderView(Context context, ReaderCallback readerCallback) {
        super(context.getApplicationContext());
        this.f1985a = null;
        this.f1986b = null;
        this.f1987c = null;
        this.f1988d = null;
        this.f1989e = null;
        throw new IllegalAccessError("Current SDK not support TbsReaderView.");
    }

    public static boolean a(Context context) {
        if (!f1984f) {
            f.a(true).a(context.getApplicationContext(), true, false);
            f1984f = f.a(false).b();
        }
        return f1984f;
    }

    public static Drawable getResDrawable(Context context, int i5) {
        if (a(context)) {
            return ReaderWizard.getResDrawable(i5);
        }
        return null;
    }

    public static String getResString(Context context, int i5) {
        return a(context) ? ReaderWizard.getResString(i5) : "";
    }

    public static boolean isSupportExt(Context context, String str) {
        return a(context) && ReaderWizard.isSupportCurrentPlatform(context) && ReaderWizard.isSupportExt(str);
    }

    public boolean a() {
        try {
            if (this.f1986b == null) {
                this.f1986b = new ReaderWizard(this.f1989e);
            }
            if (this.f1987c == null) {
                this.f1987c = this.f1986b.getTbsReader();
            }
            Object obj = this.f1987c;
            if (obj != null) {
                return this.f1986b.initTbsReader(obj, this.f1985a);
            }
            return false;
        } catch (NullPointerException unused) {
            Log.e(TAG, "Unexpect null object!");
            return false;
        }
    }

    public void doCommand(Integer num, Object obj, Object obj2) {
        Object obj3;
        ReaderWizard readerWizard = this.f1986b;
        if (readerWizard == null || (obj3 = this.f1987c) == null) {
            return;
        }
        readerWizard.doCommand(obj3, num, obj, obj2);
    }

    public boolean downloadPlugin(String str) {
        Object obj = this.f1987c;
        if (obj != null) {
            return this.f1986b.checkPlugin(obj, this.f1985a, str, true);
        }
        Log.e(TAG, "downloadPlugin failed!");
        return false;
    }

    public void onSizeChanged(int i5, int i6) {
        Object obj;
        ReaderWizard readerWizard = this.f1986b;
        if (readerWizard == null || (obj = this.f1987c) == null) {
            return;
        }
        readerWizard.onSizeChanged(obj, i5, i6);
    }

    public void onStop() {
        ReaderWizard readerWizard = this.f1986b;
        if (readerWizard != null) {
            readerWizard.destroy(this.f1987c);
            this.f1987c = null;
        }
        this.f1985a = null;
        f1984f = false;
    }

    public void openFile(Bundle bundle) {
        if (this.f1987c == null || bundle == null) {
            Log.e(TAG, "init failed!");
            return;
        }
        bundle.putBoolean("browser6.0", MttLoader.isBrowserInstalledEx(this.f1985a) | (!MttLoader.isBrowserInstalled(this.f1985a)));
        bundle.putBoolean("browser6.1", MttLoader.isGreatBrowserVer(this.f1985a, 6101625L, 610000L) | (!MttLoader.isBrowserInstalled(this.f1985a)));
        if (this.f1986b.openFile(this.f1987c, this.f1985a, bundle, this)) {
            return;
        }
        Log.e(TAG, "OpenFile failed!");
    }

    public boolean preOpen(String str, boolean z4) {
        if (!isSupportExt(this.f1985a, str)) {
            Log.e(TAG, "not supported by:" + str);
            return false;
        }
        boolean a5 = a(this.f1985a);
        if (!a5) {
            return a5;
        }
        boolean a6 = a();
        if (z4 && a6) {
            return this.f1986b.checkPlugin(this.f1987c, this.f1985a, str, Apn.getApnType(this.f1985a) == 3);
        }
        return a6;
    }

    public void userStatistics(String str) {
        ReaderWizard readerWizard = this.f1986b;
        if (readerWizard != null) {
            readerWizard.userStatistics(this.f1987c, str);
        }
    }
}
