package com.tencent.smtt.export.external.extension.interfaces;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import com.tencent.smtt.export.external.interfaces.IX5ScrollListener;
import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardListClient;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IX5WebViewExtension {
    public static final int HANDLEVIEW_ALIGNMENT_CENTER = 1;
    public static final int HANDLEVIEW_ALIGNMENT_RIGHT = 2;
    public static final int HANDLEVIEW_POSITION_CENTER = 1;
    public static final int HANDLEVIEW_POSITION_RIGHT = 2;
    public static final int HANLDEVIEW_ALIGNMENT_LEFT = 0;
    public static final int HANLDEVIEW_POSITION_LEFT = 0;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int RENDER_MODE_DEFAULT = 0;
    public static final int RENDER_MODE_SMOOTHNESS_AGGRESSIVE = 2;
    public static final int RENDER_MODE_SMOOTHNESS_NORMAL = 1;

    void active();

    void cancelLongPress();

    boolean capturePageToFile(Bitmap.Config config, String str, boolean z4, int i5, int i6);

    void clearServiceWorkerCache();

    void clearTextEntry();

    void clearTextFieldLongPressStatus();

    void copyText();

    void cutText(CharSequence charSequence);

    void deactive();

    void doFingerSearchIfNeed();

    void doTranslateAction(int i5);

    void documentAsText(Message message);

    void documentDumpRenderTree(Message message);

    boolean drawPreReadBaseLayer(Canvas canvas, boolean z4);

    void dumpDisplayTree();

    void dumpViewportForLayoutTest(Message message);

    void enterSelectionMode(boolean z4);

    void exitPluginFullScreen();

    void focusAndPopupIM(String str);

    void forceSyncOffsetToCore();

    ArrayList<IX5WebViewBase.ImageInfo> getAllImageInfo();

    Bitmap getBitmapByIndex(int i5);

    int getCurrentHistoryItemIndex();

    String getDocumentOuterHTML();

    boolean getDrawWithBuffer();

    void getFakeLoginStatus(Bundle bundle, ValueCallback<Bundle> valueCallback);

    String getFocusCandidateText();

    IX5WebHistoryItem getHistoryItem(int i5);

    int getQQBrowserVersion();

    int getScrollX();

    int getScrollY();

    Bundle getSdkQBStatisticsInfo();

    String getSelectionText();

    IX5WebSettingsExtension getSettingsExtension();

    int getSharedVideoTime();

    Point getSinglePressPoint();

    int getSniffVideoID();

    String getSniffVideoRefer();

    boolean getSolarMode();

    int getTitleHeight();

    IX5WebChromeClient getWebChromeClient();

    IX5WebChromeClientExtension getWebChromeClientExtension();

    int getWebTextScrollDis();

    IX5WebViewClient getWebViewClient();

    IX5WebViewClientExtension getWebViewClientExtension();

    boolean inFullScreenMode();

    boolean inputNodeIsPasswordType();

    boolean inputNodeIsPhoneType();

    void invalidateContent();

    Object invokeMiscMethod(String str, Bundle bundle);

    boolean isActive();

    boolean isEditingMode();

    boolean isEnableSetFont();

    boolean isHorizontalScrollBarEnabled();

    boolean isMobileSite();

    boolean isPluginFullScreen();

    boolean isPreReadCanGoForward();

    boolean isSelectionMode();

    boolean isVerticalScrollBarEnabled();

    boolean isX5CoreSandboxMode();

    void leaveSelectionMode();

    void loadDataWithBaseURLWithHeaders(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    void loaddataWithHeaders(String str, String str2, String str3, Map<String, String> map);

    boolean needSniff();

    void onAppExit();

    void onFingerSearchResult(String str, int i5, int i6);

    void onPageTransFormationSettingChanged(boolean z4);

    void onPauseActiveDomObject();

    void onPauseNativeVideo();

    void onResumeActiveDomObject();

    void pasteText(CharSequence charSequence);

    void pauseAudio();

    void playAudio();

    void preConnectQProxy();

    void preLoad(String str, int i5, int i6, Map<String, String> map);

    void pruneMemoryCache();

    boolean registerEmbeddedWidget(String[] strArr, Object obj);

    void registerServiceWorkerBackground(String str, String str2);

    void registerServiceWorkerOffline(String str, List<String> list, boolean z4);

    void reloadCustomMetaData();

    void removeHistoryItem(int i5);

    void replaceAllInputText(String str);

    void replyListBox(int i5);

    void replyMultiListBox(int i5, boolean[] zArr);

    boolean requestFocusForInputNode(int i5);

    void retrieveFingerSearchContext(int i5);

    void savePageToDisk(String str, Message message);

    void savePageToDisk(String str, boolean z4, int i5, ValueCallback<String> valueCallback);

    void scrollBy(int i5, int i6);

    void scrollTo(int i5, int i6);

    int seletionStatus();

    void sendNeverRememberMsg(String str, String str2, String str3, Message message);

    void sendRememberMsg(String str, String str2, String str3, Message message);

    void sendRememberMsg(String str, String str2, String str3, String str4, String str5);

    void sendResumeMsg(String str, String str2, String str3, Message message);

    void setAudioAutoPlayNotify(boolean z4);

    void setBackFromSystem();

    void setDisableDrawingWhileLosingFocus(boolean z4);

    void setDrawWithBuffer(boolean z4);

    void setEmbTitleView(View view, ViewGroup.LayoutParams layoutParams);

    void setFakeLoginParams(Bundle bundle);

    void setForceEnableZoom(boolean z4);

    void setHandleViewBitmap(Bitmap bitmap, Bitmap bitmap2, int i5, int i6);

    void setHandleViewLineColor(int i5, int i6);

    void setHandleViewLineIsShowing(boolean z4, int i5);

    void setHandleViewSelectionColor(int i5, int i6);

    void setHorizontalScrollBarDrawable(Drawable drawable);

    void setHorizontalScrollBarEnabled(boolean z4);

    void setHorizontalTrackDrawable(Drawable drawable);

    void setIsForVideoSniff(boolean z4);

    void setLongPressTextExtensionMenu(int i5);

    void setOrientation(int i5);

    void setOverScrollParams(int i5, int i6, int i7, int i8, int i9, int i10, Drawable drawable, Drawable drawable2, Drawable drawable3);

    void setRenderMode(int i5);

    void setScreenState(int i5);

    void setScrollBarDefaultDelayBeforeFade(int i5);

    void setScrollBarFadeDuration(int i5);

    void setScrollBarFadingEnabled(boolean z4);

    void setScrollBarSize(int i5);

    void setScrollListener(IX5ScrollListener iX5ScrollListener);

    void setSelectListener(ISelectionInterface iSelectionInterface);

    void setSharedVideoTime(int i5);

    void setSniffVideoInfo(String str, int i5, String str2, String str3);

    void setTextFieldInLongPressStatus(boolean z4);

    void setVerticalScrollBarDrawable(Drawable drawable);

    void setVerticalScrollBarEnabled(boolean z4);

    void setVerticalTrackDrawable(Drawable drawable);

    void setWebBackForwardListClient(IX5WebBackForwardListClient iX5WebBackForwardListClient);

    void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension);

    void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension);

    boolean shouldFitScreenLayout();

    void showImage(int i5, int i6);

    Drawable snapshot(int i5, boolean z4);

    void snapshotVisible(Bitmap bitmap, boolean z4, boolean z5, boolean z6, boolean z7, float f5, float f6, Runnable runnable);

    void snapshotVisible(Canvas canvas, boolean z4, boolean z5, boolean z6, boolean z7);

    void snapshotWholePage(Canvas canvas, boolean z4, boolean z5);

    void snapshotWholePage(Canvas canvas, boolean z4, boolean z5, Runnable runnable);

    void stopPreLoad(String str);

    void trimMemory(int i5);

    void unRegisterServiceWorker(String str, boolean z4);

    void updateContext(Context context);

    void updateImageList(int i5, int i6, boolean z4);

    void updateSelectionPosition();

    void updateServiceWorkerBackground(String str);

    void waitSWInstalled(String str, Message message);

    @Deprecated
    Drawable wrapDrawableWithNativeBitmap(Drawable drawable, int i5, Bitmap.Config config);
}
