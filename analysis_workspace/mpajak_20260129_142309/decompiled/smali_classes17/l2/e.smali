.class public final Ll2/e;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# instance fields
.field public final b:Lk2/e;


# direct methods
.method public constructor <init>(Lk2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/e;->b:Lk2/e;

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 2
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

    iget-object v0, p2, Lo2/a;->a:Ljava/lang/Class;

    const-class v1, Lj2/a;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lj2/a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Ll2/e;->b:Lk2/e;

    invoke-virtual {p0, v1, p1, p2, v0}, Ll2/e;->b(Lk2/e;Li2/i;Lo2/a;Lj2/a;)Li2/z;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lk2/e;Li2/i;Lo2/a;Lj2/a;)Li2/z;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/e;",
            "Li2/i;",
            "Lo2/a<",
            "*>;",
            "Lj2/a;",
            ")",
            "Li2/z<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Lj2/a;->value()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lo2/a;

    invoke-direct {v1, v0}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v1}, Lk2/e;->a(Lo2/a;)Lk2/q;

    move-result-object p1

    invoke-interface {p1}, Lk2/q;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Li2/z;

    if-eqz v0, :cond_0

    check-cast p1, Li2/z;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Li2/a0;

    if-eqz v0, :cond_1

    check-cast p1, Li2/a0;

    invoke-interface {p1, p2, p3}, Li2/a0;->a(Li2/i;Lo2/a;)Li2/z;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Li2/t;

    if-nez v0, :cond_3

    instance-of v1, p1, Li2/m;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p4, "Invalid attempt to bind an instance of "

    invoke-static {p4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lo2/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Li2/t;

    goto :goto_1

    :cond_4
    move-object v0, v1

    :goto_1
    instance-of v2, p1, Li2/m;

    if-eqz v2, :cond_5

    move-object v1, p1

    check-cast v1, Li2/m;

    :cond_5
    new-instance p1, Ll2/o;

    invoke-direct {p1, v0, v1, p2, p3}, Ll2/o;-><init>(Li2/t;Li2/m;Li2/i;Lo2/a;)V

    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p4}, Lj2/a;->nullSafe()Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p2, Li2/y;

    invoke-direct {p2, p1}, Li2/y;-><init>(Li2/z;)V

    move-object p1, p2

    :cond_6
    return-object p1
.end method
