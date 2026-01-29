package marmojkfnf.huflnkmt.ncagri.jdtuadkc;

import android.app.Notification;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import fmfjq.twyvy.xjhbp;
import marmojkfnf.mnhosc.cswoel.wvfxxn.Turjlocq;

@Turjlocq
/* loaded from: classes14.dex */
public class Hbkffen {
    public CharSequence contentText;
    public CharSequence contentTitle;
    public RemoteViews customBigContentView;
    public RemoteViews customContentView;
    public RemoteViews customHeadsUpContentView;
    public long duration = -1;
    public Bitmap largeIcon;
    public int smallIcon;
    public Notification.BigPictureStyle style;

    static {
        xjhbp.classescxclcy(107);
    }

    public Hbkffen(RemoteViews remoteViews) {
        this.customHeadsUpContentView = remoteViews;
    }

    public native Notification modify(Notification.Builder builder);

    public native Hbkffen setContentText(CharSequence charSequence);

    public native Hbkffen setContentTitle(CharSequence charSequence);

    public native Hbkffen setCustomBigContentView(RemoteViews remoteViews);

    public native Hbkffen setCustomContentView(RemoteViews remoteViews);

    public native Hbkffen setCustomHeadsUpContentView(RemoteViews remoteViews);

    public native Hbkffen setDuration(int i5);

    public native Hbkffen setLargeIcon(Bitmap bitmap);

    public native Hbkffen setSmallIcon(int i5);

    public native Hbkffen setStyle(Notification.BigPictureStyle bigPictureStyle);
}
