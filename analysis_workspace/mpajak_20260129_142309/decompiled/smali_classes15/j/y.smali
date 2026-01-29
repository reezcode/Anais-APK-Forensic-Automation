.class public final Lj/y;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# static fields
.field public static final a:Lj/y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/y;

    invoke-direct {v0}, Lj/y;-><init>()V

    sput-object v0, Lj/y;->a:Lj/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
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

    iget-object p2, p1, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-ne p3, v1, :cond_0

    invoke-interface {p2}, Li/c;->y()V

    return-object v0

    :cond_0
    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/16 v2, 0xc

    const/16 v3, 0x10

    if-eq p3, v2, :cond_2

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    if-ne p3, v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lf/d;

    const-string p3, "syntax error: "

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-interface {p2}, Li/c;->q()I

    move-result p2

    invoke-static {p2}, Li/g;->w(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const/4 p3, 0x0

    move-object v2, v0

    move-object v4, v2

    move-object v5, v4

    :cond_3
    :goto_1
    iget-object v6, p1, Li/a;->c:Li/j;

    invoke-interface {p2, v6}, Li/c;->N(Li/j;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xd

    if-nez v6, :cond_5

    invoke-interface {p2}, Li/c;->q()I

    move-result v8

    if-ne v8, v7, :cond_4

    goto/16 :goto_5

    :cond_4
    invoke-interface {p2}, Li/c;->q()I

    move-result v8

    if-ne v8, v3, :cond_5

    sget-object v8, Li/b;->h:Li/b;

    invoke-interface {p2, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_1

    :cond_5
    const/4 v8, 0x4

    invoke-interface {p2}, Li/c;->H()V

    const-string v9, "className"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "syntax error"

    if-eqz v9, :cond_8

    invoke-interface {p2}, Li/c;->q()I

    move-result v2

    if-ne v2, v1, :cond_6

    move-object v2, v0

    goto/16 :goto_4

    :cond_6
    invoke-interface {p2}, Li/c;->q()I

    move-result v2

    if-ne v2, v8, :cond_7

    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_4

    :cond_7
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const-string v9, "methodName"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {p2}, Li/c;->q()I

    move-result v4

    if-ne v4, v1, :cond_9

    move-object v4, v0

    goto/16 :goto_4

    :cond_9
    invoke-interface {p2}, Li/c;->q()I

    move-result v4

    if-ne v4, v8, :cond_a

    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_4

    :cond_a
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    const-string v9, "fileName"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    invoke-interface {p2}, Li/c;->q()I

    move-result v5

    if-ne v5, v1, :cond_c

    move-object v5, v0

    goto/16 :goto_4

    :cond_c
    invoke-interface {p2}, Li/c;->q()I

    move-result v5

    if-ne v5, v8, :cond_d

    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_4

    :cond_d
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    const-string v9, "lineNumber"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    if-ne p3, v1, :cond_f

    const/4 p3, 0x0

    goto/16 :goto_4

    :cond_f
    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/4 v6, 0x2

    if-ne p3, v6, :cond_10

    invoke-interface {p2}, Li/c;->I()I

    move-result p3

    goto/16 :goto_4

    :cond_10
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    const-string v9, "nativeMethod"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v1, :cond_12

    goto :goto_2

    :cond_12
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    const/4 v8, 0x6

    if-ne v6, v8, :cond_13

    goto :goto_2

    :cond_13
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    const/4 v8, 0x7

    if-ne v6, v8, :cond_14

    :goto_2
    invoke-interface {p2, v3}, Li/c;->Q(I)V

    goto/16 :goto_4

    :cond_14
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    sget-object v9, Lf/a;->d:Ljava/lang/String;

    const-string v11, "syntax error : "

    if-ne v6, v9, :cond_19

    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v8, :cond_17

    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v6

    const-string v8, "java.lang.StackTraceElement"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    goto/16 :goto_4

    :cond_16
    new-instance p1, Lf/d;

    invoke-static {v11, v6}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v1, :cond_18

    goto :goto_4

    :cond_18
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_19
    const-string v9, "moduleName"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v1, :cond_1a

    goto :goto_4

    :cond_1a
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v8, :cond_1b

    goto :goto_3

    :cond_1b
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1c
    const-string v9, "moduleVersion"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1f

    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v1, :cond_1d

    goto :goto_4

    :cond_1d
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v8, :cond_1e

    goto :goto_3

    :cond_1e
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1f
    const-string v9, "classLoaderName"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v1, :cond_20

    goto :goto_4

    :cond_20
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v8, :cond_21

    :goto_3
    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    :goto_4
    invoke-interface {p2}, Li/c;->q()I

    move-result v6

    if-ne v6, v7, :cond_3

    :goto_5
    invoke-interface {p2, v3}, Li/c;->Q(I)V

    new-instance p1, Ljava/lang/StackTraceElement;

    invoke-direct {p1, v2, v4, v5, p3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p1

    :cond_21
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_22
    new-instance p1, Lf/d;

    invoke-static {v11, v6}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
