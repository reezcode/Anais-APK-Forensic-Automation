package com.blankj.utilcode.util;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.d;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.a;
import androidx.collection.SimpleArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.UtilsBridge;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes21.dex */
public final class LogUtils {
    public static final int A = 7;
    private static final String ARGS = "args";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_CORNER = "└";
    public static final int D = 3;
    public static final int E = 6;
    private static final int FILE = 16;
    public static final int I = 4;
    private static final int JSON = 32;
    private static final String LEFT_BORDER = "│ ";
    private static final int MAX_LEN = 1100;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String MIDDLE_CORNER = "├";
    private static final String MIDDLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String NOTHING = "log nothing";
    private static final String NULL = "null";
    private static final String PLACEHOLDER = " ";
    private static final String SIDE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String TOP_CORNER = "┌";
    public static final int V = 2;
    public static final int W = 5;
    private static final int XML = 48;
    private static SimpleDateFormat simpleDateFormat;
    private static final char[] T = {'V', 'D', 'I', 'W', 'E', 'A'};
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static final Config CONFIG = new Config();
    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    private static final SimpleArrayMap<Class, IFormatter> I_FORMATTER_MAP = new SimpleArrayMap<>();

    /* loaded from: classes6.dex */
    public static final class Config {
        private int mConsoleFilter;
        private String mDefaultDir;
        private String mDir;
        private String mFileExtension;
        private int mFileFilter;
        private UtilsBridge.FileHead mFileHead;
        private String mFilePrefix;
        private IFileWriter mFileWriter;
        private String mGlobalTag;
        private boolean mLog2ConsoleSwitch;
        private boolean mLog2FileSwitch;
        private boolean mLogBorderSwitch;
        private boolean mLogHeadSwitch;
        private boolean mLogSwitch;
        private OnConsoleOutputListener mOnConsoleOutputListener;
        private OnFileOutputListener mOnFileOutputListener;
        private String mProcessName;
        private int mSaveDays;
        private boolean mSingleTagSwitch;
        private int mStackDeep;
        private int mStackOffset;
        private boolean mTagIsSpace;

        private Config() {
            StringBuilder sb;
            File filesDir;
            this.mFilePrefix = "util";
            this.mFileExtension = ".txt";
            this.mLogSwitch = true;
            this.mLog2ConsoleSwitch = true;
            this.mGlobalTag = "";
            this.mTagIsSpace = true;
            this.mLogHeadSwitch = true;
            this.mLog2FileSwitch = false;
            this.mLogBorderSwitch = true;
            this.mSingleTagSwitch = true;
            this.mConsoleFilter = 2;
            this.mFileFilter = 2;
            this.mStackDeep = 1;
            this.mStackOffset = 0;
            this.mSaveDays = -1;
            this.mProcessName = UtilsBridge.getCurrentProcessName();
            this.mFileHead = new UtilsBridge.FileHead("Log");
            if (!UtilsBridge.isSDCardEnableByEnvironment() || Utils.getApp().getExternalFilesDir(null) == null) {
                sb = new StringBuilder();
                filesDir = Utils.getApp().getFilesDir();
            } else {
                sb = new StringBuilder();
                filesDir = Utils.getApp().getExternalFilesDir(null);
            }
            sb.append(filesDir);
            sb.append(LogUtils.FILE_SEP);
            sb.append("log");
            sb.append(LogUtils.FILE_SEP);
            this.mDefaultDir = sb.toString();
        }

        public final Config addFileExtraHead(String str, String str2) {
            this.mFileHead.append(str, str2);
            return this;
        }

        public final Config addFileExtraHead(Map<String, String> map) {
            this.mFileHead.append(map);
            return this;
        }

        public final <T> Config addFormatter(IFormatter<T> iFormatter) {
            if (iFormatter != null) {
                LogUtils.I_FORMATTER_MAP.put(LogUtils.getTypeClassFromParadigm(iFormatter), iFormatter);
            }
            return this;
        }

        public final char getConsoleFilter() {
            return LogUtils.T[this.mConsoleFilter - 2];
        }

        public final String getDefaultDir() {
            return this.mDefaultDir;
        }

        public final String getDir() {
            String str = this.mDir;
            return str == null ? this.mDefaultDir : str;
        }

        public final String getFileExtension() {
            return this.mFileExtension;
        }

        public final char getFileFilter() {
            return LogUtils.T[this.mFileFilter - 2];
        }

        public final String getFilePrefix() {
            return this.mFilePrefix;
        }

        public final String getGlobalTag() {
            return UtilsBridge.isSpace(this.mGlobalTag) ? "" : this.mGlobalTag;
        }

        public final String getProcessName() {
            String str = this.mProcessName;
            return str == null ? "" : str.replace(":", "_");
        }

        public final int getSaveDays() {
            return this.mSaveDays;
        }

        public final int getStackDeep() {
            return this.mStackDeep;
        }

        public final int getStackOffset() {
            return this.mStackOffset;
        }

        public final boolean haveSetOnConsoleOutputListener() {
            return this.mOnConsoleOutputListener != null;
        }

        public final boolean haveSetOnFileOutputListener() {
            return this.mOnFileOutputListener != null;
        }

        public final boolean isLog2ConsoleSwitch() {
            return this.mLog2ConsoleSwitch;
        }

        public final boolean isLog2FileSwitch() {
            return this.mLog2FileSwitch;
        }

        public final boolean isLogBorderSwitch() {
            return this.mLogBorderSwitch;
        }

        public final boolean isLogHeadSwitch() {
            return this.mLogHeadSwitch;
        }

        public final boolean isLogSwitch() {
            return this.mLogSwitch;
        }

        public final boolean isSingleTagSwitch() {
            return this.mSingleTagSwitch;
        }

        public final Config setBorderSwitch(boolean z4) {
            this.mLogBorderSwitch = z4;
            return this;
        }

        public final Config setConsoleFilter(int i5) {
            this.mConsoleFilter = i5;
            return this;
        }

        public final Config setConsoleSwitch(boolean z4) {
            this.mLog2ConsoleSwitch = z4;
            return this;
        }

        public final Config setDir(File file) {
            String str;
            if (file == null) {
                str = null;
            } else {
                str = file.getAbsolutePath() + LogUtils.FILE_SEP;
            }
            this.mDir = str;
            return this;
        }

        public final Config setDir(String str) {
            if (UtilsBridge.isSpace(str)) {
                str = null;
            } else if (!str.endsWith(LogUtils.FILE_SEP)) {
                StringBuilder g5 = d.g(str);
                g5.append(LogUtils.FILE_SEP);
                str = g5.toString();
            }
            this.mDir = str;
            return this;
        }

        public final Config setFileExtension(String str) {
            if (UtilsBridge.isSpace(str)) {
                str = ".txt";
            } else if (!str.startsWith(".")) {
                str = d.f(".", str);
            }
            this.mFileExtension = str;
            return this;
        }

        public final Config setFileFilter(int i5) {
            this.mFileFilter = i5;
            return this;
        }

        public final Config setFilePrefix(String str) {
            if (UtilsBridge.isSpace(str)) {
                str = "util";
            }
            this.mFilePrefix = str;
            return this;
        }

        public final Config setFileWriter(IFileWriter iFileWriter) {
            this.mFileWriter = iFileWriter;
            return this;
        }

        public final Config setGlobalTag(String str) {
            boolean z4;
            if (UtilsBridge.isSpace(str)) {
                this.mGlobalTag = "";
                z4 = true;
            } else {
                this.mGlobalTag = str;
                z4 = false;
            }
            this.mTagIsSpace = z4;
            return this;
        }

        public final Config setLog2FileSwitch(boolean z4) {
            this.mLog2FileSwitch = z4;
            return this;
        }

        public final Config setLogHeadSwitch(boolean z4) {
            this.mLogHeadSwitch = z4;
            return this;
        }

        public final Config setLogSwitch(boolean z4) {
            this.mLogSwitch = z4;
            return this;
        }

        public final Config setOnConsoleOutputListener(OnConsoleOutputListener onConsoleOutputListener) {
            this.mOnConsoleOutputListener = onConsoleOutputListener;
            return this;
        }

        public final Config setOnFileOutputListener(OnFileOutputListener onFileOutputListener) {
            this.mOnFileOutputListener = onFileOutputListener;
            return this;
        }

        public final Config setSaveDays(@IntRange(from = 1) int i5) {
            this.mSaveDays = i5;
            return this;
        }

        public final Config setSingleTagSwitch(boolean z4) {
            this.mSingleTagSwitch = z4;
            return this;
        }

        public final Config setStackDeep(@IntRange(from = 1) int i5) {
            this.mStackDeep = i5;
            return this;
        }

        public final Config setStackOffset(@IntRange(from = 0) int i5) {
            this.mStackOffset = i5;
            return this;
        }

        public String toString() {
            StringBuilder g5 = d.g("process: ");
            g5.append(getProcessName());
            g5.append(LogUtils.LINE_SEP);
            g5.append("logSwitch: ");
            g5.append(isLogSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("consoleSwitch: ");
            g5.append(isLog2ConsoleSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("tag: ");
            g5.append(getGlobalTag().equals("") ? LogUtils.NULL : getGlobalTag());
            g5.append(LogUtils.LINE_SEP);
            g5.append("headSwitch: ");
            g5.append(isLogHeadSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("fileSwitch: ");
            g5.append(isLog2FileSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("dir: ");
            g5.append(getDir());
            g5.append(LogUtils.LINE_SEP);
            g5.append("filePrefix: ");
            g5.append(getFilePrefix());
            g5.append(LogUtils.LINE_SEP);
            g5.append("borderSwitch: ");
            g5.append(isLogBorderSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("singleTagSwitch: ");
            g5.append(isSingleTagSwitch());
            g5.append(LogUtils.LINE_SEP);
            g5.append("consoleFilter: ");
            g5.append(getConsoleFilter());
            g5.append(LogUtils.LINE_SEP);
            g5.append("fileFilter: ");
            g5.append(getFileFilter());
            g5.append(LogUtils.LINE_SEP);
            g5.append("stackDeep: ");
            g5.append(getStackDeep());
            g5.append(LogUtils.LINE_SEP);
            g5.append("stackOffset: ");
            g5.append(getStackOffset());
            g5.append(LogUtils.LINE_SEP);
            g5.append("saveDays: ");
            g5.append(getSaveDays());
            g5.append(LogUtils.LINE_SEP);
            g5.append("formatter: ");
            g5.append(LogUtils.I_FORMATTER_MAP);
            g5.append(LogUtils.LINE_SEP);
            g5.append("fileWriter: ");
            g5.append(this.mFileWriter);
            g5.append(LogUtils.LINE_SEP);
            g5.append("onConsoleOutputListener: ");
            g5.append(this.mOnConsoleOutputListener);
            g5.append(LogUtils.LINE_SEP);
            g5.append("onFileOutputListener: ");
            g5.append(this.mOnFileOutputListener);
            g5.append(LogUtils.LINE_SEP);
            g5.append("fileExtraHeader: ");
            g5.append(this.mFileHead.getAppended());
            return g5.toString();
        }
    }

    /* loaded from: classes3.dex */
    public interface IFileWriter {
        void write(String str, String str2);
    }

    /* loaded from: classes6.dex */
    public static abstract class IFormatter<T> {
        public abstract String format(T t4);
    }

    /* loaded from: classes7.dex */
    public static final class LogFormatter {
        private LogFormatter() {
        }

        private static String array2String(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            StringBuilder g5 = d.g("Array has incompatible type: ");
            g5.append(obj.getClass());
            throw new IllegalArgumentException(g5.toString());
        }

        private static String bundle2String(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                sb.append(obj instanceof Bundle ? obj == bundle ? "(this Bundle)" : bundle2String((Bundle) obj) : LogUtils.formatObject(obj));
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        @RequiresApi(api = 16)
        private static void clipData2String(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:");
                sb.append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent == null) {
                sb.append("NULL");
                sb.append("}");
            } else {
                sb.append("I:");
                sb.append(intent2String(intent));
                sb.append("}");
            }
        }

        private static String formatJson(String str) {
            try {
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = str.charAt(i5);
                    if (charAt == '{') {
                        return new JSONObject(str).toString(2);
                    }
                    if (charAt == '[') {
                        return new JSONArray(str).toString(2);
                    }
                    if (!Character.isWhitespace(charAt)) {
                        return str;
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            return str;
        }

        private static String formatXml(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", ExifInterface.GPS_MEASUREMENT_2D);
                newTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + LogUtils.LINE_SEP);
            } catch (Exception e5) {
                e5.printStackTrace();
                return str;
            }
        }

        private static String intent2String(Intent intent) {
            boolean z4;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z5 = true;
            boolean z6 = false;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z4 = false;
            } else {
                z4 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z5) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z5 = false;
                }
                sb.append("]");
                z4 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z4 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z4 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z4 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z4 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z4 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z4 = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z4) {
                    sb.append(' ');
                }
                clipData2String(clipData, sb);
                z4 = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(bundle2String(extras));
                sb.append('}');
            } else {
                z6 = z4;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z6) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : intent2String(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        private static String object2Json(Object obj) {
            if (obj instanceof CharSequence) {
                return UtilsBridge.formatJson(obj.toString());
            }
            try {
                return UtilsBridge.getGson4LogUtils().h(obj);
            } catch (Throwable unused) {
                return obj.toString();
            }
        }

        public static String object2String(Object obj) {
            return object2String(obj, -1);
        }

        public static String object2String(Object obj, int i5) {
            if (obj.getClass().isArray()) {
                return array2String(obj);
            }
            if (obj instanceof Throwable) {
                return UtilsBridge.getFullStackTrace((Throwable) obj);
            }
            if (obj instanceof Bundle) {
                return bundle2String((Bundle) obj);
            }
            if (obj instanceof Intent) {
                return intent2String((Intent) obj);
            }
            if (i5 == 32) {
                return object2Json(obj);
            }
            String obj2 = obj.toString();
            return i5 == 48 ? formatXml(obj2) : obj2;
        }
    }

    /* loaded from: classes23.dex */
    public interface OnConsoleOutputListener {
        void onConsoleOutput(int i5, String str, String str2);
    }

    /* loaded from: classes10.dex */
    public interface OnFileOutputListener {
        void onFileOutput(String str, String str2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes23.dex */
    public @interface TYPE {
    }

    /* loaded from: classes24.dex */
    public static final class TagHead {
        public String[] consoleHead;
        public String fileHead;
        public String tag;

        public TagHead(String str, String[] strArr, String str2) {
            this.tag = str;
            this.consoleHead = strArr;
            this.fileHead = str2;
        }
    }

    private LogUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(Object... objArr) {
        log(7, CONFIG.getGlobalTag(), objArr);
    }

    public static void aTag(String str, Object... objArr) {
        log(7, str, objArr);
    }

    private static boolean createOrExistsFile(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!UtilsBridge.createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            deleteDueLogs(str, str2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                printDeviceInfo(str, str2);
            }
            return createNewFile;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void d(Object... objArr) {
        log(3, CONFIG.getGlobalTag(), objArr);
    }

    public static void dTag(String str, Object... objArr) {
        log(3, str, objArr);
    }

    private static void deleteDueLogs(String str, String str2) {
        File[] listFiles;
        if (CONFIG.getSaveDays() > 0 && (listFiles = new File(str).getParentFile().listFiles(new FilenameFilter() { // from class: com.blankj.utilcode.util.LogUtils.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str3) {
                return LogUtils.isMatchLogFileName(str3);
            }
        })) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat2.parse(str2).getTime() - (r0.getSaveDays() * 86400000);
                for (final File file : listFiles) {
                    String name = file.getName();
                    Objects.requireNonNull(name);
                    if (simpleDateFormat2.parse(findDate(name)).getTime() <= time) {
                        EXECUTOR.execute(new Runnable() { // from class: com.blankj.utilcode.util.LogUtils.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (file.delete()) {
                                    return;
                                }
                                StringBuilder g5 = d.g("delete ");
                                g5.append(file);
                                g5.append(" failed!");
                                Log.e("LogUtils", g5.toString());
                            }
                        });
                    }
                }
            } catch (ParseException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void e(Object... objArr) {
        log(6, CONFIG.getGlobalTag(), objArr);
    }

    public static void eTag(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public static void file(int i5, Object obj) {
        log(i5 | 16, CONFIG.getGlobalTag(), obj);
    }

    public static void file(int i5, String str, Object obj) {
        log(i5 | 16, str, obj);
    }

    public static void file(Object obj) {
        log(19, CONFIG.getGlobalTag(), obj);
    }

    public static void file(String str, Object obj) {
        log(19, str, obj);
    }

    private static String findDate(String str) {
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        return matcher.find() ? matcher.group() : "";
    }

    private static String formatObject(int i5, Object obj) {
        return obj == null ? NULL : i5 == 32 ? LogFormatter.object2String(obj, 32) : i5 == 48 ? LogFormatter.object2String(obj, 48) : formatObject(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatObject(Object obj) {
        IFormatter iFormatter;
        if (obj == null) {
            return NULL;
        }
        SimpleArrayMap<Class, IFormatter> simpleArrayMap = I_FORMATTER_MAP;
        return (simpleArrayMap.isEmpty() || (iFormatter = simpleArrayMap.get(getClassFromObject(obj))) == null) ? LogFormatter.object2String(obj) : iFormatter.format(obj);
    }

    private static Class getClassFromObject(Object obj) {
        Type genericSuperclass;
        int i5;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                genericSuperclass = genericInterfaces[0];
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
            } else {
                genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
            }
            String obj2 = genericSuperclass.toString();
            try {
                if (!obj2.startsWith("class ")) {
                    i5 = obj2.startsWith("interface ") ? 10 : 6;
                    return Class.forName(obj2);
                }
                return Class.forName(obj2);
            } catch (ClassNotFoundException e5) {
                e5.printStackTrace();
            }
            obj2 = obj2.substring(i5);
        }
        return cls;
    }

    public static Config getConfig() {
        return CONFIG;
    }

    public static String getCurrentLogFilePath() {
        return getCurrentLogFilePath(new Date());
    }

    private static String getCurrentLogFilePath(Date date) {
        String substring = getSdf().format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        Config config = CONFIG;
        sb.append(config.getDir());
        sb.append(config.getFilePrefix());
        sb.append("_");
        sb.append(substring);
        sb.append("_");
        sb.append(config.getProcessName());
        sb.append(config.getFileExtension());
        return sb.toString();
    }

    private static String getFileName(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return d.f(className, ".java");
    }

    public static List<File> getLogFiles() {
        File file = new File(CONFIG.getDir());
        if (!file.exists()) {
            return new ArrayList();
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.blankj.utilcode.util.LogUtils.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return LogUtils.isMatchLogFileName(str);
            }
        });
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, listFiles);
        return arrayList;
    }

    private static SimpleDateFormat getSdf() {
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.getDefault());
        }
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Class getTypeClassFromParadigm(IFormatter<T> iFormatter) {
        int i5;
        Type[] genericInterfaces = iFormatter.getClass().getGenericInterfaces();
        Type type = ((ParameterizedType) (genericInterfaces.length == 1 ? genericInterfaces[0] : iFormatter.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
        while (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        String obj = type.toString();
        try {
            if (!obj.startsWith("class ")) {
                i5 = obj.startsWith("interface ") ? 10 : 6;
                return Class.forName(obj);
            }
            return Class.forName(obj);
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
        obj = obj.substring(i5);
    }

    public static void i(Object... objArr) {
        log(4, CONFIG.getGlobalTag(), objArr);
    }

    public static void iTag(String str, Object... objArr) {
        log(4, str, objArr);
    }

    private static void input2File(String str, String str2) {
        Config config = CONFIG;
        if (config.mFileWriter == null) {
            UtilsBridge.writeFileFromString(str, str2, true);
        } else {
            config.mFileWriter.write(str, str2);
        }
        if (config.mOnFileOutputListener != null) {
            config.mOnFileOutputListener.onFileOutput(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMatchLogFileName(String str) {
        StringBuilder g5 = d.g("^");
        g5.append(CONFIG.getFilePrefix());
        g5.append("_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
        return str.matches(g5.toString());
    }

    public static void json(int i5, Object obj) {
        log(i5 | 32, CONFIG.getGlobalTag(), obj);
    }

    public static void json(int i5, String str, Object obj) {
        log(i5 | 32, str, obj);
    }

    public static void json(Object obj) {
        log(35, CONFIG.getGlobalTag(), obj);
    }

    public static void json(String str, Object obj) {
        log(35, str, obj);
    }

    public static void log(int i5, String str, Object... objArr) {
        Config config = CONFIG;
        if (config.isLogSwitch()) {
            final int i6 = i5 & 15;
            int i7 = i5 & TbsListener.ErrorCode.TPATCH_VERSION_FAILED;
            if (config.isLog2ConsoleSwitch() || config.isLog2FileSwitch() || i7 == 16) {
                if (i6 >= config.mConsoleFilter || i6 >= config.mFileFilter) {
                    final TagHead processTagAndHead = processTagAndHead(str);
                    final String processBody = processBody(i7, objArr);
                    if (config.isLog2ConsoleSwitch() && i7 != 16 && i6 >= config.mConsoleFilter) {
                        print2Console(i6, processTagAndHead.tag, processTagAndHead.consoleHead, processBody);
                    }
                    if ((config.isLog2FileSwitch() || i7 == 16) && i6 >= config.mFileFilter) {
                        EXECUTOR.execute(new Runnable() { // from class: com.blankj.utilcode.util.LogUtils.1
                            @Override // java.lang.Runnable
                            public void run() {
                                LogUtils.print2File(i6, processTagAndHead.tag, processTagAndHead.fileHead + processBody);
                            }
                        });
                    }
                }
            }
        }
    }

    private static void print2Console(int i5, String str, String str2) {
        Log.println(i5, str, str2);
        Config config = CONFIG;
        if (config.mOnConsoleOutputListener != null) {
            config.mOnConsoleOutputListener.onConsoleOutput(i5, str, str2);
        }
    }

    private static void print2Console(int i5, String str, String[] strArr, String str2) {
        if (CONFIG.isSingleTagSwitch()) {
            printSingleTagMsg(i5, str, processSingleTagMsg(i5, str, strArr, str2));
            return;
        }
        printBorder(i5, str, true);
        printHead(i5, str, strArr);
        printMsg(i5, str, str2);
        printBorder(i5, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void print2File(int i5, String str, String str2) {
        Date date = new Date();
        String format = getSdf().format(date);
        String substring = format.substring(0, 10);
        String currentLogFilePath = getCurrentLogFilePath(date);
        if (!createOrExistsFile(currentLogFilePath, substring)) {
            Log.e("LogUtils", "create " + currentLogFilePath + " failed!");
            return;
        }
        StringBuilder g5 = d.g(format.substring(11));
        g5.append(T[i5 - 2]);
        g5.append("/");
        g5.append(str);
        g5.append(str2);
        g5.append(LINE_SEP);
        input2File(currentLogFilePath, g5.toString());
    }

    private static void printBorder(int i5, String str, boolean z4) {
        if (CONFIG.isLogBorderSwitch()) {
            print2Console(i5, str, z4 ? TOP_BORDER : BOTTOM_BORDER);
        }
    }

    private static void printDeviceInfo(String str, String str2) {
        Config config = CONFIG;
        config.mFileHead.addFirst("Date of Log", str2);
        input2File(str, config.mFileHead.toString());
    }

    private static void printHead(int i5, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (CONFIG.isLogBorderSwitch()) {
                    str2 = d.f(LEFT_BORDER, str2);
                }
                print2Console(i5, str, str2);
            }
            if (CONFIG.isLogBorderSwitch()) {
                print2Console(i5, str, MIDDLE_BORDER);
            }
        }
    }

    private static void printMsg(int i5, String str, String str2) {
        int length = str2.length();
        int i6 = length / MAX_LEN;
        if (i6 > 0) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = i8 + MAX_LEN;
                printSubMsg(i5, str, str2.substring(i8, i9));
                i7++;
                i8 = i9;
            }
            if (i8 == length) {
                return;
            } else {
                str2 = str2.substring(i8, length);
            }
        }
        printSubMsg(i5, str, str2);
    }

    private static void printSingleTagMsg(int i5, String str, String str2) {
        int length = str2.length();
        Config config = CONFIG;
        boolean isLogBorderSwitch = config.isLogBorderSwitch();
        int i6 = MAX_LEN;
        int i7 = isLogBorderSwitch ? (length - 113) / MAX_LEN : length / MAX_LEN;
        if (i7 > 0) {
            int i8 = 1;
            if (config.isLogBorderSwitch()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2.substring(0, MAX_LEN));
                print2Console(i5, str, a.c(sb, LINE_SEP, BOTTOM_BORDER));
                while (i8 < i7) {
                    StringBuilder g5 = d.g(PLACEHOLDER);
                    String str3 = LINE_SEP;
                    g5.append(str3);
                    g5.append(TOP_BORDER);
                    g5.append(str3);
                    g5.append(LEFT_BORDER);
                    int i9 = i6 + MAX_LEN;
                    g5.append(str2.substring(i6, i9));
                    g5.append(str3);
                    g5.append(BOTTOM_BORDER);
                    print2Console(i5, str, g5.toString());
                    i8++;
                    i6 = i9;
                }
                if (i6 == length - 113) {
                    return;
                }
                StringBuilder g6 = d.g(PLACEHOLDER);
                String str4 = LINE_SEP;
                g6.append(str4);
                g6.append(TOP_BORDER);
                g6.append(str4);
                g6.append(LEFT_BORDER);
                g6.append(str2.substring(i6, length));
                str2 = g6.toString();
            } else {
                print2Console(i5, str, str2.substring(0, MAX_LEN));
                while (i8 < i7) {
                    StringBuilder g7 = d.g(PLACEHOLDER);
                    g7.append(LINE_SEP);
                    int i10 = i6 + MAX_LEN;
                    g7.append(str2.substring(i6, i10));
                    print2Console(i5, str, g7.toString());
                    i8++;
                    i6 = i10;
                }
                if (i6 == length) {
                    return;
                }
                StringBuilder g8 = d.g(PLACEHOLDER);
                g8.append(LINE_SEP);
                g8.append(str2.substring(i6, length));
                str2 = g8.toString();
            }
        }
        print2Console(i5, str, str2);
    }

    private static void printSubMsg(int i5, String str, String str2) {
        if (!CONFIG.isLogBorderSwitch()) {
            print2Console(i5, str, str2);
            return;
        }
        for (String str3 : str2.split(LINE_SEP)) {
            print2Console(i5, str, d.f(LEFT_BORDER, str3));
        }
    }

    private static String processBody(int i5, Object... objArr) {
        String str;
        if (objArr != null) {
            if (objArr.length == 1) {
                str = formatObject(i5, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    Object obj = objArr[i6];
                    sb.append(ARGS);
                    sb.append("[");
                    sb.append(i6);
                    sb.append("]");
                    sb.append(" = ");
                    sb.append(formatObject(obj));
                    sb.append(LINE_SEP);
                }
                str = sb.toString();
            }
        } else {
            str = NULL;
        }
        return str.length() == 0 ? NOTHING : str;
    }

    private static String processSingleTagMsg(int i5, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        if (CONFIG.isLogBorderSwitch()) {
            sb.append(PLACEHOLDER);
            String str3 = LINE_SEP;
            sb.append(str3);
            sb.append(TOP_BORDER);
            sb.append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append(LEFT_BORDER);
                    sb.append(str4);
                    sb.append(LINE_SEP);
                }
                sb.append(MIDDLE_BORDER);
                sb.append(LINE_SEP);
            }
            String[] split = str2.split(LINE_SEP);
            int length = split.length;
            while (i6 < length) {
                String str5 = split[i6];
                sb.append(LEFT_BORDER);
                sb.append(str5);
                sb.append(LINE_SEP);
                i6++;
            }
            sb.append(BOTTOM_BORDER);
        } else {
            if (strArr != null) {
                sb.append(PLACEHOLDER);
                sb.append(LINE_SEP);
                int length2 = strArr.length;
                while (i6 < length2) {
                    sb.append(strArr[i6]);
                    sb.append(LINE_SEP);
                    i6++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static TagHead processTagAndHead(String str) {
        String str2;
        String str3;
        String str4;
        Config config = CONFIG;
        if (config.mTagIsSpace || config.isLogHeadSwitch()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int stackOffset = config.getStackOffset() + 3;
            if (stackOffset >= stackTrace.length) {
                String fileName = getFileName(stackTrace[3]);
                if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                    int indexOf = fileName.indexOf(46);
                    str4 = indexOf == -1 ? fileName : fileName.substring(0, indexOf);
                } else {
                    str4 = str;
                }
                return new TagHead(str4, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[stackOffset];
            String fileName2 = getFileName(stackTraceElement);
            if (config.mTagIsSpace && UtilsBridge.isSpace(str)) {
                int indexOf2 = fileName2.indexOf(46);
                str2 = indexOf2 == -1 ? fileName2 : fileName2.substring(0, indexOf2);
            } else {
                str2 = str;
            }
            if (config.isLogHeadSwitch()) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), fileName2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String j5 = androidx.appcompat.widget.a.j(" [", formatter, "]: ");
                if (config.getStackDeep() <= 1) {
                    return new TagHead(str2, new String[]{formatter}, j5);
                }
                int min = Math.min(config.getStackDeep(), stackTrace.length - stackOffset);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                String formatter2 = new Formatter().format(d.c("%", name.length() + 2, "s"), "").toString();
                for (int i5 = 1; i5 < min; i5++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i5 + stackOffset];
                    strArr[i5] = new Formatter().format("%s%s.%s(%s:%d)", formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), getFileName(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new TagHead(str2, strArr, j5);
            }
            str3 = str2;
        } else {
            str3 = config.getGlobalTag();
        }
        return new TagHead(str3, null, ": ");
    }

    public static void v(Object... objArr) {
        log(2, CONFIG.getGlobalTag(), objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    public static void w(Object... objArr) {
        log(5, CONFIG.getGlobalTag(), objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void xml(int i5, String str) {
        log(i5 | 48, CONFIG.getGlobalTag(), str);
    }

    public static void xml(int i5, String str, String str2) {
        log(i5 | 48, str, str2);
    }

    public static void xml(String str) {
        log(51, CONFIG.getGlobalTag(), str);
    }

    public static void xml(String str, String str2) {
        log(51, str, str2);
    }
}
