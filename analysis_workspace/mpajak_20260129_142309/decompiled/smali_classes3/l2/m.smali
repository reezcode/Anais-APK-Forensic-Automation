.class public final Ll2/m;
.super Ll2/n$b;


# instance fields
.field public final synthetic d:Ljava/lang/reflect/Field;

.field public final synthetic e:Z

.field public final synthetic f:Li2/z;

.field public final synthetic g:Li2/i;

.field public final synthetic h:Lo2/a;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/reflect/Field;ZLi2/z;Li2/i;Lo2/a;Z)V
    .locals 0

    iput-object p4, p0, Ll2/m;->d:Ljava/lang/reflect/Field;

    iput-boolean p5, p0, Ll2/m;->e:Z

    iput-object p6, p0, Ll2/m;->f:Li2/z;

    iput-object p7, p0, Ll2/m;->g:Li2/i;

    iput-object p8, p0, Ll2/m;->h:Lo2/a;

    iput-boolean p9, p0, Ll2/m;->i:Z

    invoke-direct {p0, p1, p2, p3}, Ll2/n$b;-><init>(Ljava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll2/m;->f:Li2/z;

    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-boolean v0, p0, Ll2/m;->i:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ll2/m;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Ll2/m;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-boolean v0, p0, Ll2/m;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll2/m;->f:Li2/z;

    goto :goto_0

    :cond_0
    new-instance v0, Ll2/p;

    iget-object v1, p0, Ll2/m;->g:Li2/i;

    iget-object v2, p0, Ll2/m;->f:Li2/z;

    iget-object v3, p0, Ll2/m;->h:Lo2/a;

    iget-object v3, v3, Lo2/a;->b:Ljava/lang/reflect/Type;

    invoke-direct {v0, v1, v2, v3}, Ll2/p;-><init>(Li2/i;Li2/z;Ljava/lang/reflect/Type;)V

    :goto_0
    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Ll2/n$b;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll2/m;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
