package com.tencent.smtt.export.external.extension.interfaces;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public interface IX5WebViewClientExtension {
    public static final int FRAME_LOADTYPE_BACK = 1;
    public static final int FRAME_LOADTYPE_BACKWMLDECKNOTACCESSIBLE = 10;
    public static final int FRAME_LOADTYPE_FORWARD = 2;
    public static final int FRAME_LOADTYPE_INDEXEDBACKFORWARD = 3;
    public static final int FRAME_LOADTYPE_PREREAD = 11;
    public static final int FRAME_LOADTYPE_REDIRECT = 7;
    public static final int FRAME_LOADTYPE_RELOAD = 4;
    public static final int FRAME_LOADTYPE_RELOADALLOWINGSTALEDATA = 5;
    public static final int FRAME_LOADTYPE_RELOADFROMORIGIN = 9;
    public static final int FRAME_LOADTYPE_REPLACE = 8;
    public static final int FRAME_LOADTYPE_SAME = 6;
    public static final int FRAME_LOADTYPE_STANDARD = 0;
    public static final int HTMLTYPE_JS_SCROLLTO = 1;

    boolean allowJavaScriptOpenWindowAutomatically(String str, String str2);

    void computeScroll(View view);

    void didFirstVisuallyNonEmptyPaint();

    boolean dispatchTouchEvent(MotionEvent motionEvent, View view);

    void documentAvailableInMainFrame();

    int getHostByName(String str, List<String> list);

    void handlePluginTag(String str, String str2, boolean z4, String str3);

    void hideAddressBar();

    void invalidate();

    boolean notifyAutoAudioPlay(String str, JsResult jsResult);

    boolean notifyJavaScriptOpenWindowsBlocked(String str, String[] strArr, ValueCallback<Boolean> valueCallback, boolean z4);

    void onCreateInputConnectionSetEditInfo(EditorInfo editorInfo);

    void onDoubleTapStart();

    void onFakeLoginRecognised(Bundle bundle);

    void onFlingScrollBegin(int i5, int i6, int i7);

    void onFlingScrollEnd();

    void onHideListBox();

    void onHistoryItemChanged();

    void onInputBoxTextChanged(IX5WebViewExtension iX5WebViewExtension, String str);

    boolean onInterceptTouchEvent(MotionEvent motionEvent, View view);

    void onMetricsSavedCountReceived(String str, boolean z4, long j5, String str2, int i5);

    Object onMiscCallBack(String str, Bundle bundle);

    Object onMiscCallBack(String str, Bundle bundle, Object obj, Object obj2, Object obj3, Object obj4);

    void onMissingPluginClicked(String str, String str2, String str3, int i5);

    void onNativeCrashReport(int i5, String str);

    void onOverScrolled(int i5, int i6, boolean z4, boolean z5, View view);

    void onPinchToZoomStart();

    void onPreReadFinished();

    void onPrefetchResourceHit(boolean z4);

    void onPreloadCallback(int i5, String str);

    void onPromptScaleSaved();

    void onReceivedSslErrorCancel();

    void onReceivedViewSource(String str);

    void onReportAdFilterInfo(int i5, int i6, String str, boolean z4);

    void onReportHtmlInfo(int i5, String str);

    void onReportMemoryCachedResponse(String str, int i5, HashMap<String, String> hashMap);

    void onReportResponseHeaders(String str, int i5, HashMap<String, String> hashMap);

    void onResponseReceived(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, int i5);

    void onScrollChanged(int i5, int i6, int i7, int i8);

    void onScrollChanged(int i5, int i6, int i7, int i8, View view);

    void onSetButtonStatus(boolean z4, boolean z5);

    void onShowListBox(String[] strArr, int[] iArr, int[] iArr2, int i5);

    boolean onShowLongClickPopupMenu();

    void onShowMutilListBox(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3);

    void onSlidingTitleOffScreen(int i5, int i6);

    void onSoftKeyBoardHide(int i5);

    void onSoftKeyBoardShow();

    boolean onTouchEvent(MotionEvent motionEvent, View view);

    void onTransitionToCommitted();

    void onUploadProgressChange(int i5, int i6, String str);

    void onUploadProgressStart(int i5);

    void onUrlChange(String str, String str2);

    boolean overScrollBy(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z4, View view);

    boolean preShouldOverrideUrlLoading(IX5WebViewExtension iX5WebViewExtension, String str);

    void showTranslateBubble(int i5, String str, String str2, int i6);
}
