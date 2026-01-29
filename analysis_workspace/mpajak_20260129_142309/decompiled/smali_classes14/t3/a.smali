.class public final Lt3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/o$b;


# instance fields
.field public final synthetic a:Ls3/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Ls3/o;->a:Ls3/o$a;

    iput-object v0, p0, Lt3/a;->a:Ls3/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;)Ls3/o;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lt3/a;->a:Ls3/o;

    return-object p1
.end method
