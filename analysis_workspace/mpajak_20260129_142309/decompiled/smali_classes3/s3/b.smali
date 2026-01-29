.class public interface abstract Ls3/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf1/j;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf1/j;

    invoke-direct {v0}, Lf1/j;-><init>()V

    sput-object v0, Ls3/b;->a:Lf1/j;

    sget-object v0, Ls3/n;->c:Lk/j0;

    const-string v1, "defaultDns"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ls3/e0;Ls3/b0;)V
.end method
