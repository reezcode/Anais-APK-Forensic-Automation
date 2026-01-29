.class public Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Turjlocq;
.end annotation


# instance fields
.field public contentText:Ljava/lang/CharSequence;

.field public contentTitle:Ljava/lang/CharSequence;

.field public customBigContentView:Landroid/widget/RemoteViews;

.field public customContentView:Landroid/widget/RemoteViews;

.field public customHeadsUpContentView:Landroid/widget/RemoteViews;

.field public duration:J

.field public largeIcon:Landroid/graphics/Bitmap;

.field public smallIcon:I

.field public style:Landroid/app/Notification$BigPictureStyle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6b

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/widget/RemoteViews;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;->duration:J

    iput-object p1, p0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;->customHeadsUpContentView:Landroid/widget/RemoteViews;

    return-void
.end method


# virtual methods
.method public native modify(Landroid/app/Notification$Builder;)Landroid/app/Notification;
.end method

.method public native setContentText(Ljava/lang/CharSequence;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setContentTitle(Ljava/lang/CharSequence;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setCustomBigContentView(Landroid/widget/RemoteViews;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setCustomContentView(Landroid/widget/RemoteViews;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setCustomHeadsUpContentView(Landroid/widget/RemoteViews;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setDuration(I)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setLargeIcon(Landroid/graphics/Bitmap;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setSmallIcon(I)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method

.method public native setStyle(Landroid/app/Notification$BigPictureStyle;)Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;
.end method
