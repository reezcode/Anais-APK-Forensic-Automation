.class public final Lw3/g;
.super Lkotlin/jvm/internal/Lambda;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "Ljava/security/cert/Certificate;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ls3/f;

.field public final synthetic c:Ls3/q;

.field public final synthetic d:Ls3/a;


# direct methods
.method public constructor <init>(Ls3/f;Ls3/q;Ls3/a;)V
    .locals 0

    iput-object p1, p0, Lw3/g;->b:Ls3/f;

    iput-object p2, p0, Lw3/g;->c:Ls3/q;

    iput-object p3, p0, Lw3/g;->d:Ls3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lw3/g;->b:Ls3/f;

    iget-object v0, v0, Ls3/f;->b:Ld1/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lw3/g;->c:Ls3/q;

    invoke-virtual {v1}, Ls3/q;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lw3/g;->d:Ls3/a;

    iget-object v2, v2, Ls3/a;->a:Ls3/s;

    iget-object v2, v2, Ls3/s;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ld1/f;->z(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
