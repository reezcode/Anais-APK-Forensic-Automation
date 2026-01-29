.class public final Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a;
.super Landroid/content/AbstractThreadedSyncAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a$a;
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x67

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/content/AbstractThreadedSyncAdapter;-><init>(Landroid/content/Context;Z)V

    return-void
.end method


# virtual methods
.method public final native onPerformSync(Landroid/accounts/Account;Landroid/os/Bundle;Ljava/lang/String;Landroid/content/ContentProviderClient;Landroid/content/SyncResult;)V
.end method
