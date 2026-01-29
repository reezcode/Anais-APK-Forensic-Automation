package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.tencent.smtt.sdk.TbsReaderView;
import java.util.LinkedList;

/* loaded from: classes17.dex */
public class TbsReaderPredownload {
    public static final int READER_SO_SUCCESS = 2;
    public static final int READER_WAIT_IN_QUEUE = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1973b = {"docx", "pptx", "xlsx", "pdf", "epub", "txt"};

    /* renamed from: a, reason: collision with root package name */
    public Handler f1974a = null;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList<String> f1975c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1976d = false;

    /* renamed from: e, reason: collision with root package name */
    public ReaderWizard f1977e = null;

    /* renamed from: f, reason: collision with root package name */
    public TbsReaderView.ReaderCallback f1978f = null;

    /* renamed from: g, reason: collision with root package name */
    public Object f1979g = null;

    /* renamed from: h, reason: collision with root package name */
    public Context f1980h = null;

    /* renamed from: i, reason: collision with root package name */
    public ReaderPreDownloadCallback f1981i = null;

    /* renamed from: j, reason: collision with root package name */
    public String f1982j = "";

    /* loaded from: classes24.dex */
    public interface ReaderPreDownloadCallback {
        public static final int NOTIFY_PLUGIN_FAILED = -1;
        public static final int NOTIFY_PLUGIN_SUCCESS = 0;

        void onEvent(String str, int i5, boolean z4);
    }

    public TbsReaderPredownload(ReaderPreDownloadCallback readerPreDownloadCallback) {
        throw new IllegalAccessError("Current SDK not support Reader.");
    }

    private void a() {
        b(3);
    }

    public void a(int i5) {
        if (this.f1981i != null) {
            this.f1981i.onEvent(this.f1982j, i5, this.f1975c.isEmpty());
        }
    }

    public void a(int i5, int i6) {
        this.f1974a.sendMessageDelayed(this.f1974a.obtainMessage(i5), i6);
    }

    public void b(int i5) {
        this.f1974a.removeMessages(i5);
    }

    public boolean c(int i5) {
        return this.f1974a.hasMessages(i5);
    }

    public boolean init(Context context) {
        if (context == null) {
            return false;
        }
        this.f1980h = context.getApplicationContext();
        boolean a5 = TbsReaderView.a(context.getApplicationContext());
        TbsReaderView.ReaderCallback readerCallback = new TbsReaderView.ReaderCallback() { // from class: com.tencent.smtt.sdk.TbsReaderPredownload.1
            @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
            public void onCallBackAction(Integer num, Object obj, Object obj2) {
                int intValue;
                if (num.intValue() == 5012 && 5014 != (intValue = ((Integer) obj).intValue())) {
                    if (5013 == intValue || intValue == 0) {
                        TbsReaderPredownload.this.a(0);
                    } else {
                        TbsReaderPredownload.this.a(-1);
                    }
                    TbsReaderPredownload tbsReaderPredownload = TbsReaderPredownload.this;
                    tbsReaderPredownload.f1982j = "";
                    tbsReaderPredownload.a(3, 100);
                }
            }
        };
        this.f1978f = readerCallback;
        try {
            if (this.f1977e == null) {
                this.f1977e = new ReaderWizard(readerCallback);
            }
            if (this.f1979g == null) {
                this.f1979g = this.f1977e.getTbsReader();
            }
            Object obj = this.f1979g;
            return obj != null ? this.f1977e.initTbsReader(obj, context.getApplicationContext()) : a5;
        } catch (NullPointerException unused) {
            Log.e("TbsReaderPredownload", "Unexpect null object!");
            return false;
        }
    }

    public void pause() {
        this.f1976d = true;
    }

    public void shutdown() {
        this.f1981i = null;
        this.f1976d = false;
        this.f1975c.clear();
        a();
        ReaderWizard readerWizard = this.f1977e;
        if (readerWizard != null) {
            readerWizard.destroy(this.f1979g);
            this.f1979g = null;
        }
        this.f1980h = null;
    }

    public void start(String str) {
        this.f1976d = false;
        b(3);
        this.f1975c.add(str);
        a(3, 100);
    }

    public void startAll() {
        this.f1976d = false;
        if (!false && !c(3)) {
            a(3, 100);
        }
    }
}
