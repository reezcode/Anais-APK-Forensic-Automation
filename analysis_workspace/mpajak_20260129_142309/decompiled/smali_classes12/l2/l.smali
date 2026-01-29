.class public final Ll2/l;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ll2/k;


# instance fields
.field public final a:Li2/i;

.field public final b:Li2/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Li2/w;->b:Li2/w$a;

    new-instance v1, Ll2/k;

    invoke-direct {v1, v0}, Ll2/k;-><init>(Li2/x;)V

    sput-object v1, Ll2/l;->c:Ll2/k;

    return-void
.end method

.method public constructor <init>(Li2/i;Li2/x;)V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    iput-object p1, p0, Ll2/l;->a:Li2/i;

    iput-object p2, p0, Ll2/l;->b:Li2/x;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    invoke-static {v0}, Lf/h;->a(I)I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lp2/a;->x()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Ll2/l;->b:Li2/x;

    invoke-interface {v0, p1}, Li2/x;->a(Lp2/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v0, Lk2/p;

    invoke-direct {v0}, Lk2/p;-><init>()V

    invoke-virtual {p1}, Lp2/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lp2/a;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Ll2/l;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lk2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lp2/a;->l()V

    return-object v0

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lp2/a;->a()V

    :goto_1
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, Ll2/l;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lp2/a;->f()V

    return-object v0
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    return-void

    :cond_0
    iget-object v0, p0, Ll2/l;->a:Li2/i;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lo2/a;

    invoke-direct {v2, v1}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v0, v2}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object v0

    instance-of v1, v0, Ll2/l;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lp2/b;->c()Lp2/b;

    invoke-virtual {p1}, Lp2/b;->l()Lp2/b;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method
