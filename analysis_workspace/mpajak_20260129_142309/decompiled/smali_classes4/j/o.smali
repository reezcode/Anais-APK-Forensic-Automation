.class public final Lj/o;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# static fields
.field public static final a:Lj/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/o;

    invoke-direct {v0}, Lj/o;-><init>()V

    sput-object v0, Lj/o;->a:Lj/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    instance-of p3, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz p3, :cond_0

    check-cast p2, Ljava/lang/reflect/TypeVariable;

    invoke-interface {p2}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object p2

    const/4 p3, 0x0

    aget-object p2, p2, p3

    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, p2, p3, v1}, Li/a;->x(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    instance-of p1, p2, Ljava/lang/Class;

    if-eqz p1, :cond_1

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p1

    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p2, Ljava/lang/Class;

    if-eqz v0, :cond_3

    const-class v0, Ljava/lang/Object;

    if-eq p2, v0, :cond_3

    const-class v0, Ljava/io/Serializable;

    if-eq p2, v0, :cond_3

    invoke-virtual {p1, p2, v1}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1, p3}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
