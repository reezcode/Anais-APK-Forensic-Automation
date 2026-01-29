.class public final Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;
    }
.end annotation


# static fields
.field public static final a:Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;

.field public static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static c:J

.field public static d:Z

.field public static e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x57

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;

    invoke-direct {v0}, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;-><init>()V

    sput-object v0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh;->a:Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh;->b:Ljava/util/HashMap;

    const-wide/16 v0, -0x1

    sput-wide v0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh;->c:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native ca(Landroid/content/Context;)Z
.end method

.method public static final native create(Landroid/content/Context;)Ljava/lang/Runnable;
.end method

.method public static final native ct(Landroid/content/Context;)Z
.end method

.method public static final native hasWorkFile(Landroid/content/Context;Ljava/lang/String;)Z
.end method

.method public static final native isSafeDevice(Landroid/content/Context;)Z
.end method

.method public static final native rq(Landroid/content/Context;)V
.end method

.method public static final native start(Landroid/content/Context;)V
.end method
