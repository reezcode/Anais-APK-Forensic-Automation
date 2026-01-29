.class public final Ll2/o;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll2/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Li2/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Li2/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/t<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Li2/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/m<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Li2/i;

.field public final d:Lo2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo2/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final e:Ll2/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll2/o<",
            "TT;>.a;"
        }
    .end annotation
.end field

.field public volatile f:Li2/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li2/t;Li2/m;Li2/i;Lo2/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/t<",
            "TT;>;",
            "Li2/m<",
            "TT;>;",
            "Li2/i;",
            "Lo2/a<",
            "TT;>;",
            "Li2/a0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Li2/z;-><init>()V

    new-instance v0, Ll2/o$a;

    invoke-direct {v0}, Ll2/o$a;-><init>()V

    iput-object v0, p0, Ll2/o;->e:Ll2/o$a;

    iput-object p1, p0, Ll2/o;->a:Li2/t;

    iput-object p2, p0, Ll2/o;->b:Li2/m;

    iput-object p3, p0, Ll2/o;->c:Li2/i;

    iput-object p4, p0, Ll2/o;->d:Lo2/a;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ll2/o;->b:Li2/m;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/o;->f:Li2/z;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll2/o;->c:Li2/i;

    iget-object v2, p0, Ll2/o;->d:Lo2/a;

    invoke-virtual {v0, v1, v2}, Li2/i;->f(Li2/a0;Lo2/a;)Li2/z;

    move-result-object v0

    iput-object v0, p0, Ll2/o;->f:Li2/z;

    :goto_0
    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lp2/a;->N()I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lp2/c; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v0, 0x0

    :try_start_1
    sget-object v2, Ll2/q;->V:Ll2/q$t;

    invoke-virtual {v2, p1}, Ll2/q$t;->c(Lp2/a;)Li2/n;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lp2/c; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance v0, Li2/u;

    invoke-direct {v0, p1}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    new-instance v0, Li2/o;

    invoke-direct {v0, p1}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    new-instance v0, Li2/u;

    invoke-direct {v0, p1}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_4
    move-exception p1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    sget-object p1, Li2/p;->a:Li2/p;

    :goto_2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p1, p1, Li2/p;

    if-eqz p1, :cond_2

    return-object v1

    :cond_2
    iget-object p1, p0, Ll2/o;->b:Li2/m;

    iget-object v0, p0, Ll2/o;->d:Lo2/a;

    iget-object v0, v0, Lo2/a;->b:Ljava/lang/reflect/Type;

    invoke-interface {p1}, Li2/m;->deserialize()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v0, Li2/u;

    invoke-direct {v0, p1}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/b;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ll2/o;->a:Li2/t;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/o;->f:Li2/z;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll2/o;->c:Li2/i;

    const/4 v1, 0x0

    iget-object v2, p0, Ll2/o;->d:Lo2/a;

    invoke-virtual {v0, v1, v2}, Li2/i;->f(Li2/a0;Lo2/a;)Li2/z;

    move-result-object v0

    iput-object v0, p0, Ll2/o;->f:Li2/z;

    :goto_0
    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    return-void

    :cond_2
    iget-object p2, p0, Ll2/o;->d:Lo2/a;

    iget-object p2, p2, Lo2/a;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0}, Li2/t;->serialize()Li2/n;

    move-result-object p2

    invoke-static {p2, p1}, Lk/j0;->E(Li2/n;Lp2/b;)V

    return-void
.end method
