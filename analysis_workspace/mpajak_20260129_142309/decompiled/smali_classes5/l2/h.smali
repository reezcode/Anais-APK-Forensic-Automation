.class public final Ll2/h;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll2/h$a;
    }
.end annotation


# instance fields
.field public final b:Lk2/e;

.field public final c:Z


# direct methods
.method public constructor <init>(Lk2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/h;->b:Lk2/e;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll2/h;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li2/i;",
            "Lo2/a<",
            "TT;>;)",
            "Li2/z<",
            "TT;>;"
        }
    .end annotation

    iget-object v1, p2, Lo2/a;->b:Ljava/lang/reflect/Type;

    iget-object v3, p2, Lo2/a;->a:Ljava/lang/Class;

    const-class v4, Ljava/util/Map;

    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v1}, Lk2/a;->f(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/lang/Object;

    const-class v5, Ljava/lang/String;

    const-class v6, Ljava/util/Properties;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v1, v6, :cond_1

    new-array v1, v7, [Ljava/lang/reflect/Type;

    aput-object v5, v1, v8

    aput-object v5, v1, v9

    goto :goto_0

    :cond_1
    const-class v5, Ljava/util/Map;

    invoke-static {v1, v3, v5}, Lk2/a;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0

    :cond_2
    new-array v1, v7, [Ljava/lang/reflect/Type;

    aput-object v4, v1, v8

    aput-object v4, v1, v9

    :goto_0
    aget-object v3, v1, v8

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v3, v4, :cond_4

    const-class v4, Ljava/lang/Boolean;

    if-ne v3, v4, :cond_3

    goto :goto_1

    :cond_3
    new-instance v4, Lo2/a;

    invoke-direct {v4, v3}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v4}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object v3

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v3, Ll2/q;->f:Ll2/q$x;

    :goto_2
    move-object v4, v3

    aget-object v3, v1, v9

    new-instance v5, Lo2/a;

    invoke-direct {v5, v3}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v5}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object v6

    iget-object v3, p0, Ll2/h;->b:Lk2/e;

    invoke-virtual {v3, p2}, Lk2/e;->a(Lo2/a;)Lk2/q;

    move-result-object v7

    new-instance v10, Ll2/h$a;

    aget-object v3, v1, v8

    aget-object v5, v1, v9

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Ll2/h$a;-><init>(Ll2/h;Li2/i;Ljava/lang/reflect/Type;Li2/z;Ljava/lang/reflect/Type;Li2/z;Lk2/q;)V

    return-object v10
.end method
