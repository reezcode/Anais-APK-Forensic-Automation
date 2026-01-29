.class public abstract Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;
.super Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x71

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native onBroadcastReceivedEvent(Landroid/content/Intent;)V
.end method

.method public native onTiming()V
.end method

.method public native onTrack(Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public native reportException(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method
