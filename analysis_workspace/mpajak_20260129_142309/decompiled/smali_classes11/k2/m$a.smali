.class public final Lk2/m$a;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/m;->a(Li2/i;Lo2/a;)Li2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Li2/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Li2/i;

.field public final synthetic e:Lo2/a;

.field public final synthetic f:Lk2/m;


# direct methods
.method public constructor <init>(Lk2/m;ZZLi2/i;Lo2/a;)V
    .locals 0

    iput-object p1, p0, Lk2/m$a;->f:Lk2/m;

    iput-boolean p2, p0, Lk2/m$a;->b:Z

    iput-boolean p3, p0, Lk2/m$a;->c:Z

    iput-object p4, p0, Lk2/m$a;->d:Li2/i;

    iput-object p5, p0, Lk2/m$a;->e:Lo2/a;

    invoke-direct {p0}, Li2/z;-><init>()V

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

    iget-boolean v0, p0, Lk2/m$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp2/a;->U()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lk2/m$a;->a:Li2/z;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk2/m$a;->d:Li2/i;

    iget-object v1, p0, Lk2/m$a;->f:Lk2/m;

    iget-object v2, p0, Lk2/m$a;->e:Lo2/a;

    invoke-virtual {v0, v1, v2}, Li2/i;->f(Li2/a0;Lo2/a;)Li2/z;

    move-result-object v0

    iput-object v0, p0, Lk2/m$a;->a:Li2/z;

    :goto_0
    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    iget-boolean v0, p0, Lk2/m$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    return-void

    :cond_0
    iget-object v0, p0, Lk2/m$a;->a:Li2/z;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk2/m$a;->d:Li2/i;

    iget-object v1, p0, Lk2/m$a;->f:Lk2/m;

    iget-object v2, p0, Lk2/m$a;->e:Lo2/a;

    invoke-virtual {v0, v1, v2}, Li2/i;->f(Li2/a0;Lo2/a;)Li2/z;

    move-result-object v0

    iput-object v0, p0, Lk2/m$a;->a:Li2/z;

    :goto_0
    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method
