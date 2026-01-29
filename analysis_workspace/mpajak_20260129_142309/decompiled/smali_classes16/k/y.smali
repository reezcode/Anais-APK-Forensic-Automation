.class public final Lk/y;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static a:Lk/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/y;

    invoke-direct {v0}, Lk/y;-><init>()V

    sput-object v0, Lk/y;->a:Lk/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 9

    iget-object p5, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    sget-object p1, Lk/b1;->i:Lk/b1;

    invoke-virtual {p5, p1}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    sget-object v1, Lk/b1;->p:Lk/b1;

    invoke-virtual {p5, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    instance-of v1, p4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_1

    check-cast p4, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p4

    aget-object v0, p4, v2

    :cond_1
    move-object p4, p2

    check-cast p4, Ljava/util/Enumeration;

    iget-object v1, p1, Lk/g0;->o:Lk/v0;

    invoke-virtual {p1, v1, p2, p3}, Lk/g0;->o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p2, 0x5b

    :try_start_0
    invoke-virtual {p5, p2}, Lk/a1;->write(I)V

    :goto_0
    invoke-interface {p4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 p2, v2, 0x1

    if-eqz v2, :cond_2

    const/16 p3, 0x2c

    invoke-virtual {p5, p3}, Lk/a1;->write(I)V

    :cond_2
    if-nez v5, :cond_3

    invoke-virtual {p5}, Lk/a1;->E()V

    goto :goto_1

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v3

    add-int/lit8 p3, p2, -0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x0

    move-object v4, p1

    move-object v7, v0

    invoke-interface/range {v3 .. v8}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    :goto_1
    move v2, p2

    goto :goto_0

    :cond_4
    const/16 p2, 0x5d

    invoke-virtual {p5, p2}, Lk/a1;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p1, Lk/g0;->o:Lk/v0;

    return-void

    :catchall_0
    move-exception p2

    iput-object v1, p1, Lk/g0;->o:Lk/v0;

    throw p2
.end method
