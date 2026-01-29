.class public final Lq3/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lq3/r;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/r;

    const-string v1, "NO_DECISION"

    invoke-direct {v0, v1}, Lq3/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq3/b;->a:Lq3/r;

    return-void
.end method
