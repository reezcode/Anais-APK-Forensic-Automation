.class public final Ll2/p;
.super Li2/z;


# annotations
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
.field public final a:Li2/i;

.field public final b:Li2/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Li2/i;Li2/z;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/i;",
            "Li2/z<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Li2/z;-><init>()V

    iput-object p1, p0, Ll2/p;->a:Li2/i;

    iput-object p2, p0, Ll2/p;->b:Li2/z;

    iput-object p3, p0, Ll2/p;->c:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ll2/p;->b:Li2/z;

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

    iget-object v0, p0, Ll2/p;->b:Li2/z;

    iget-object v1, p0, Ll2/p;->c:Ljava/lang/reflect/Type;

    if-eqz p2, :cond_1

    const-class v2, Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    instance-of v2, v1, Ljava/lang/reflect/TypeVariable;

    if-nez v2, :cond_0

    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    :cond_1
    iget-object v2, p0, Ll2/p;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_3

    iget-object v0, p0, Ll2/p;->a:Li2/i;

    new-instance v2, Lo2/a;

    invoke-direct {v2, v1}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v0, v2}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object v0

    instance-of v1, v0, Ll2/n$a;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ll2/p;->b:Li2/z;

    instance-of v2, v1, Ll2/n$a;

    if-nez v2, :cond_3

    move-object v0, v1

    :cond_3
    :goto_0
    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method
