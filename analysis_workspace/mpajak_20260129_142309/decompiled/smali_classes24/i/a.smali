.class public final Li/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li/a$a;
    }
.end annotation


# static fields
.field public static final p:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Li/j;

.field public d:Li/i;

.field public e:Ljava/lang/String;

.field public f:Ljava/text/SimpleDateFormat;

.field public final g:Li/c;

.field public h:Li/h;

.field public i:[Li/h;

.field public j:I

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public l:I

.field public m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/j;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj/i;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lj/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Li/a;->p:Ljava/util/HashSet;

    const/16 v0, 0x11

    new-array v1, v0, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x2

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x3

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x4

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x5

    aput-object v2, v1, v4

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x6

    aput-object v2, v1, v4

    const/4 v2, 0x7

    const-class v4, Ljava/lang/Boolean;

    aput-object v4, v1, v2

    const/16 v2, 0x8

    const-class v4, Ljava/lang/Byte;

    aput-object v4, v1, v2

    const/16 v2, 0x9

    const-class v4, Ljava/lang/Short;

    aput-object v4, v1, v2

    const/16 v2, 0xa

    const-class v4, Ljava/lang/Integer;

    aput-object v4, v1, v2

    const/16 v2, 0xb

    const-class v4, Ljava/lang/Long;

    aput-object v4, v1, v2

    const/16 v2, 0xc

    const-class v4, Ljava/lang/Float;

    aput-object v4, v1, v2

    const/16 v2, 0xd

    const-class v4, Ljava/lang/Double;

    aput-object v4, v1, v2

    const/16 v2, 0xe

    const-class v4, Ljava/math/BigInteger;

    aput-object v4, v1, v2

    const/16 v2, 0xf

    const-class v4, Ljava/math/BigDecimal;

    aput-object v4, v1, v2

    const/16 v2, 0x10

    const-class v4, Ljava/lang/String;

    aput-object v4, v1, v2

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v2, v1, v3

    sget-object v4, Li/a;->p:Ljava/util/HashSet;

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Li/c;Li/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf/a;->f:Ljava/lang/String;

    iput-object v0, p0, Li/a;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Li/a;->j:I

    iput v0, p0, Li/a;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Li/a;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Li/a;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Li/a;->o:Lj/l;

    iput-object p2, p0, Li/a;->g:Li/c;

    iput-object p1, p0, Li/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Li/a;->d:Li/i;

    iget-object p1, p3, Li/i;->c:Li/j;

    iput-object p1, p0, Li/a;->c:Li/j;

    move-object p1, p2

    check-cast p1, Li/d;

    iget-char p3, p1, Li/d;->e:C

    const/16 v0, 0x7b

    if-ne p3, v0, :cond_0

    move-object p1, p2

    check-cast p1, Li/f;

    invoke-virtual {p1}, Li/f;->next()C

    check-cast p2, Li/d;

    const/16 p1, 0xc

    goto :goto_0

    :cond_0
    const/16 v0, 0x5b

    if-ne p3, v0, :cond_1

    move-object p1, p2

    check-cast p1, Li/f;

    invoke-virtual {p1}, Li/f;->next()C

    check-cast p2, Li/d;

    const/16 p1, 0xe

    :goto_0
    iput p1, p2, Li/d;->b:I

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Li/d;->y()V

    :goto_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1}, Li/c;->y()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const-class v0, [B

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1}, Li/c;->a0()[B

    move-result-object p1

    iget-object p2, p0, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->y()V

    return-object p1

    :cond_1
    const-class v0, [C

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1}, Li/c;->k0()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->y()V

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Li/a;->d:Li/i;

    invoke-virtual {v0, p1}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, p0, p1, p2}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lf/d; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    new-instance p2, Lf/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final E(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const-class v0, Ljava/lang/Integer;

    const-string v1, "parse number key error"

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-ne v3, v5, :cond_0

    invoke-interface {v2}, Li/c;->y()V

    return-object v4

    :cond_0
    invoke-interface {v2}, Li/c;->q()I

    move-result v3

    const/16 v4, 0xd

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Li/c;->y()V

    return-object p1

    :cond_1
    invoke-interface {v2}, Li/c;->q()I

    move-result v3

    const/16 v4, 0xc

    const/16 v5, 0x10

    if-eq v3, v4, :cond_3

    invoke-interface {v2}, Li/c;->q()I

    move-result v3

    if-ne v3, v5, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lf/d;

    const-string p2, "syntax error, expect {, actual "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-interface {v2}, Li/c;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v3, p0, Li/a;->h:Li/h;

    :try_start_0
    instance-of v4, p1, Lf/e;

    if-eqz v4, :cond_4

    move-object v4, p1

    check-cast v4, Lf/e;

    iget-object v4, v4, Lf/e;->i:Ljava/util/Map;

    goto :goto_1

    :cond_4
    move-object v4, p1

    :goto_1
    const/4 v5, 0x0

    :goto_2
    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v6

    sget-object v7, Li/b;->h:Li/b;

    invoke-interface {v2, v7}, Li/c;->A(Li/b;)Z

    move-result v7

    const/16 v8, 0x2c

    if-eqz v7, :cond_5

    :goto_3
    if-ne v6, v8, :cond_5

    invoke-interface {v2}, Li/c;->next()C

    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_5
    const-string v7, ", name "

    const-string v8, "expect \':\' at "

    const/16 v9, 0x3a

    const-string v10, "syntax error"

    const/16 v11, 0x22

    const/4 v12, 0x1

    if-ne v6, v11, :cond_7

    :try_start_1
    iget-object v6, p0, Li/a;->c:Li/j;

    invoke-interface {v2, v6, v11}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v11

    if-ne v11, v9, :cond_6

    goto/16 :goto_6

    :cond_6
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const/16 v11, 0x7d

    if-ne v6, v11, :cond_a

    invoke-interface {v2}, Li/c;->next()C

    invoke-interface {v2}, Li/c;->K()V

    invoke-interface {v2}, Li/c;->y()V

    if-nez v5, :cond_9

    iget-object v0, p0, Li/a;->h:Li/h;

    if-eqz v0, :cond_8

    iget-object v1, v0, Li/h;->c:Ljava/lang/Object;

    if-ne p2, v1, :cond_8

    iget-object v1, v0, Li/h;->a:Ljava/lang/Object;

    if-ne p1, v1, :cond_8

    move-object v3, v0

    goto :goto_4

    :cond_8
    invoke-virtual {p0, p1, p2}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_9

    move-object v3, p2

    :cond_9
    :goto_4
    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_a
    const/16 v11, 0x27

    if-ne v6, v11, :cond_d

    :try_start_2
    sget-object v6, Li/b;->e:Li/b;

    invoke-interface {v2, v6}, Li/c;->A(Li/b;)Z

    move-result v6

    if-eqz v6, :cond_c

    iget-object v6, p0, Li/a;->c:Li/j;

    invoke-interface {v2, v6, v11}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v11

    if-ne v11, v9, :cond_b

    goto/16 :goto_6

    :cond_b
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    const/16 v11, 0x1a

    if-eq v6, v11, :cond_52

    const/16 v11, 0x2c

    if-eq v6, v11, :cond_51

    const/16 v11, 0x30

    if-lt v6, v11, :cond_e

    const/16 v11, 0x39

    if-le v6, v11, :cond_f

    :cond_e
    const/16 v11, 0x2d

    if-ne v6, v11, :cond_12

    :cond_f
    invoke-interface {v2}, Li/c;->K()V

    invoke-interface {v2}, Li/c;->M()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v2}, Li/c;->q()I

    move-result v6

    const/4 v8, 0x2

    if-ne v6, v8, :cond_10

    invoke-interface {v2}, Li/c;->f()Ljava/lang/Number;

    move-result-object v6

    goto :goto_5

    :cond_10
    invoke-interface {v2, v12}, Li/c;->Z(Z)Ljava/lang/Number;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    :try_start_4
    invoke-interface {v2}, Li/c;->z()C

    move-result v8

    if-ne v8, v9, :cond_11

    goto :goto_6

    :cond_11
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    const/16 v11, 0x7b

    if-eq v6, v11, :cond_16

    const/16 v11, 0x5b

    if-ne v6, v11, :cond_13

    goto :goto_7

    :cond_13
    sget-object v6, Li/b;->d:Li/b;

    invoke-interface {v2, v6}, Li/c;->A(Li/b;)Z

    move-result v6

    if-eqz v6, :cond_15

    iget-object v6, p0, Li/a;->c:Li/j;

    invoke-interface {v2, v6}, Li/c;->W(Li/j;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v11

    if-ne v11, v9, :cond_14

    :goto_6
    const/4 v8, 0x0

    goto :goto_8

    :cond_14
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", actual "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    :goto_7
    invoke-interface {v2}, Li/c;->y()V

    const/4 v6, 0x0

    invoke-virtual {p0, v6}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x1

    :goto_8
    if-nez v8, :cond_17

    invoke-interface {v2}, Li/c;->next()C

    invoke-interface {v2}, Li/c;->J()V

    :cond_17
    invoke-interface {v2}, Li/c;->z()C

    move-result v8

    invoke-interface {v2}, Li/c;->K()V

    sget-object v9, Lf/a;->d:Ljava/lang/String;

    if-ne v6, v9, :cond_24

    sget-object v9, Li/b;->p:Li/b;

    invoke-interface {v2, v9}, Li/c;->A(Li/b;)Z

    move-result v9

    if-nez v9, :cond_24

    iget-object v6, p0, Li/a;->c:Li/j;

    const/16 v7, 0x22

    invoke-interface {v2, v6, v7}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Li/b;->s:Li/b;

    invoke-interface {v2, v7}, Li/c;->A(Li/b;)Z

    move-result v7

    if-eqz v7, :cond_18

    goto/16 :goto_2

    :cond_18
    if-eqz p1, :cond_19

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    goto :goto_9

    :cond_19
    iget-object v7, p0, Li/a;->d:Li/i;

    const/4 v8, 0x0

    invoke-virtual {v7, v6, v8}, Li/i;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    :goto_9
    if-nez v7, :cond_1a

    sget-object v7, Lf/a;->d:Ljava/lang/String;

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    :cond_1a
    const/16 v0, 0x10

    invoke-interface {v2, v0}, Li/c;->Q(I)V

    invoke-interface {v2}, Li/c;->q()I

    move-result v1

    const/16 v5, 0xd

    if-ne v1, v5, :cond_21

    invoke-interface {v2, v0}, Li/c;->Q(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object p1, p0, Li/a;->d:Li/i;

    invoke-virtual {p1, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    instance-of p2, p1, Lj/n;

    if-eqz p2, :cond_1c

    check-cast p1, Lj/n;

    invoke-virtual {p1, p0, v7}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_1b

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v4}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, p2, v1}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_1c
    const/4 p2, 0x0

    :cond_1d
    if-nez p2, :cond_20

    const-class p1, Ljava/lang/Cloneable;

    if-ne v7, p1, :cond_1e

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    goto :goto_b

    :cond_1e
    const-string p1, "java.util.Collections$EmptyMap"

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1f

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    goto :goto_b

    :cond_1f
    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_20
    :goto_b
    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p2

    :catch_1
    move-exception p1

    :try_start_6
    new-instance p2, Lf/d;

    const-string v0, "create instance error"

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_21
    const/4 v0, 0x2

    iput v0, p0, Li/a;->l:I

    iget-object v0, p0, Li/a;->h:Li/h;

    if-eqz v0, :cond_22

    if-eqz p2, :cond_22

    instance-of v1, p2, Ljava/lang/Integer;

    if-nez v1, :cond_22

    iget-object v0, v0, Li/h;->c:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Integer;

    if-nez v0, :cond_22

    invoke-virtual {p0}, Li/a;->J()V

    :cond_22
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_23

    iget-object p2, p0, Li/a;->d:Li/i;

    invoke-static {p1, v7, p2}, Lm/j;->b(Ljava/lang/Object;Ljava/lang/Class;Li/i;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Li/a;->I(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_23
    :try_start_7
    iget-object p1, p0, Li/a;->d:Li/i;

    invoke-virtual {p1, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    invoke-interface {p1, p0, v7, p2}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_24
    :try_start_8
    const-string v9, "$ref"

    if-ne v6, v9, :cond_30

    if-eqz v3, :cond_30

    sget-object v9, Li/b;->p:Li/b;

    invoke-interface {v2, v9}, Li/c;->A(Li/b;)Z

    move-result v9

    if-nez v9, :cond_30

    const/4 p1, 0x4

    invoke-interface {v2, p1}, Li/c;->Q(I)V

    invoke-interface {v2}, Li/c;->q()I

    move-result p2

    if-ne p2, p1, :cond_2f

    invoke-interface {v2}, Li/c;->k0()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0xd

    invoke-interface {v2, p2}, Li/c;->Q(I)V

    const-string p2, "@"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_26

    iget-object p1, p0, Li/a;->h:Li/h;

    if-eqz p1, :cond_2d

    iget-object p2, p1, Li/h;->a:Ljava/lang/Object;

    instance-of v0, p2, [Ljava/lang/Object;

    if-nez v0, :cond_27

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_25

    goto :goto_c

    :cond_25
    iget-object p1, p1, Li/h;->b:Li/h;

    if-eqz p1, :cond_2d

    iget-object p1, p1, Li/h;->a:Ljava/lang/Object;

    goto :goto_10

    :cond_26
    const-string p2, ".."

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_29

    iget-object p2, v3, Li/h;->a:Ljava/lang/Object;

    if-eqz p2, :cond_28

    :cond_27
    :goto_c
    move-object p1, p2

    goto :goto_10

    :cond_28
    new-instance p2, Li/a$a;

    invoke-direct {p2, v3, p1}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    goto :goto_e

    :cond_29
    const-string p2, "$"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2c

    move-object p2, v3

    :goto_d
    iget-object v0, p2, Li/h;->b:Li/h;

    if-eqz v0, :cond_2a

    move-object p2, v0

    goto :goto_d

    :cond_2a
    iget-object v0, p2, Li/h;->a:Ljava/lang/Object;

    if-eqz v0, :cond_2b

    move-object p1, v0

    goto :goto_10

    :cond_2b
    new-instance v0, Li/a$a;

    invoke-direct {v0, p2, p1}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Li/a;->b(Li/a$a;)V

    goto :goto_f

    :cond_2c
    new-instance p2, Li/a$a;

    invoke-direct {p2, v3, p1}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    :goto_e
    invoke-virtual {p0, p2}, Li/a;->b(Li/a$a;)V

    :goto_f
    iput v12, p0, Li/a;->l:I

    :cond_2d
    const/4 p1, 0x0

    :goto_10
    invoke-interface {v2}, Li/c;->q()I

    move-result p2

    const/16 v0, 0xd

    if-ne p2, v0, :cond_2e

    const/16 p2, 0x10

    invoke-interface {v2, p2}, Li/c;->Q(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_2e
    :try_start_9
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2f
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "illegal ref, "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->q()I

    move-result v0

    invoke-static {v0}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_30
    if-nez v5, :cond_33

    iget-object v9, p0, Li/a;->h:Li/h;

    if-eqz v9, :cond_31

    iget-object v11, v9, Li/h;->c:Ljava/lang/Object;

    if-ne p2, v11, :cond_31

    iget-object v11, v9, Li/h;->a:Ljava/lang/Object;

    if-ne p1, v11, :cond_31

    move-object v3, v9

    goto :goto_11

    :cond_31
    invoke-virtual {p0, p1, p2}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object v5

    if-nez v3, :cond_32

    move-object v3, v5

    :cond_32
    const/4 v5, 0x1

    :cond_33
    :goto_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-class v11, Lf/e;

    if-ne v9, v11, :cond_34

    if-nez v6, :cond_34

    const-string v6, "null"
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_34
    const-string v9, "syntax error, position at "

    const/16 v11, 0x22

    if-ne v8, v11, :cond_36

    :try_start_a
    invoke-interface {v2}, Li/c;->E()V

    invoke-interface {v2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v8

    sget-object v10, Li/b;->g:Li/b;

    invoke-interface {v2, v10}, Li/c;->A(Li/b;)Z

    move-result v10

    if-eqz v10, :cond_3a

    new-instance v10, Li/f;

    invoke-direct {v10, v8}, Li/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v12}, Li/f;->S0(Z)Z

    move-result v11

    if-eqz v11, :cond_35

    iget-object v8, v10, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {v8}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    :cond_35
    invoke-virtual {v10}, Li/d;->close()V

    goto :goto_12

    :cond_36
    const/16 v11, 0x30

    if-lt v8, v11, :cond_37

    const/16 v11, 0x39

    if-le v8, v11, :cond_38

    :cond_37
    const/16 v11, 0x2d

    if-ne v8, v11, :cond_3d

    :cond_38
    invoke-interface {v2}, Li/c;->M()V

    invoke-interface {v2}, Li/c;->q()I

    move-result v8

    const/4 v10, 0x2

    if-ne v8, v10, :cond_39

    invoke-interface {v2}, Li/c;->f()Ljava/lang/Number;

    move-result-object v8

    goto :goto_12

    :cond_39
    sget-object v8, Li/b;->i:Li/b;

    invoke-interface {v2, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    invoke-interface {v2, v8}, Li/c;->Z(Z)Ljava/lang/Number;

    move-result-object v8

    :cond_3a
    :goto_12
    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Li/c;->J()V

    invoke-interface {v2}, Li/c;->z()C

    move-result v10

    const/16 v11, 0x2c

    if-ne v10, v11, :cond_3b

    invoke-interface {v2}, Li/c;->next()C

    goto/16 :goto_2

    :cond_3b
    const/16 p2, 0x7d

    if-ne v10, p2, :cond_3c

    invoke-interface {v2}, Li/c;->next()C

    invoke-interface {v2}, Li/c;->K()V

    invoke-interface {v2}, Li/c;->y()V

    invoke-virtual {p0, v8, v6}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_3c
    :try_start_b
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3d
    const/16 v11, 0x5b

    if-ne v8, v11, :cond_42

    invoke-interface {v2}, Li/c;->y()V

    new-instance v7, Lf/b;

    invoke-direct {v7}, Lf/b;-><init>()V

    if-nez p2, :cond_3e

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    :cond_3e
    invoke-virtual {p0, v7, v6}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    sget-object v8, Li/b;->q:Li/b;

    invoke-interface {v2, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    if-eqz v8, :cond_3f

    invoke-virtual {v7}, Lf/b;->toArray()[Ljava/lang/Object;

    move-result-object v7

    :cond_3f
    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Li/c;->q()I

    move-result v6

    const/16 v7, 0xd

    if-ne v6, v7, :cond_40

    invoke-interface {v2}, Li/c;->y()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_40
    :try_start_c
    invoke-interface {v2}, Li/c;->q()I

    move-result v6

    const/16 v7, 0x10

    if-ne v6, v7, :cond_41

    goto/16 :goto_2

    :cond_41
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_42
    const/16 v10, 0x7b

    if-ne v8, v10, :cond_4e

    invoke-interface {v2}, Li/c;->y()V

    if-eqz p2, :cond_43

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    if-ne v7, v0, :cond_43

    const/4 v7, 0x1

    goto :goto_13

    :cond_43
    const/4 v7, 0x0

    :goto_13
    new-instance v8, Lf/e;

    sget-object v9, Li/b;->o:Li/b;

    invoke-interface {v2, v9}, Li/c;->A(Li/b;)Z

    move-result v9

    invoke-direct {v8, v9}, Lf/e;-><init>(Z)V

    if-nez v7, :cond_44

    invoke-virtual {p0, v3, v8, v6}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object v9

    goto :goto_14

    :cond_44
    const/4 v9, 0x0

    :goto_14
    iget-object v10, p0, Li/a;->o:Lj/l;

    if-eqz v10, :cond_46

    if-eqz v6, :cond_45

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_45
    iget-object v10, p0, Li/a;->o:Lj/l;

    invoke-interface {v10}, Lj/l;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    if-eqz v10, :cond_46

    iget-object v11, p0, Li/a;->d:Li/i;

    invoke-virtual {v11, v10}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v11

    invoke-interface {v11, p0, v10, v6}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_15

    :cond_46
    const/4 v12, 0x0

    const/4 v10, 0x0

    :goto_15
    if-nez v12, :cond_47

    invoke-virtual {p0, v8, v6}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    :cond_47
    if-eqz v9, :cond_48

    if-eq v8, v10, :cond_48

    iput-object p1, v9, Li/h;->a:Ljava/lang/Object;

    :cond_48
    if-eqz v6, :cond_49

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, p1, v8}, Li/a;->e(Ljava/util/Map;Ljava/lang/Object;)V

    :cond_49
    invoke-interface {v4, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v7, :cond_4a

    invoke-virtual {p0, v10, v6}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    :cond_4a
    invoke-interface {v2}, Li/c;->q()I

    move-result v6

    const/16 v8, 0xd

    if-ne v6, v8, :cond_4b

    invoke-interface {v2}, Li/c;->y()V

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_4b
    :try_start_d
    invoke-interface {v2}, Li/c;->q()I

    move-result v6

    const/16 v8, 0x10

    if-ne v6, v8, :cond_4d

    if-eqz v7, :cond_4c

    invoke-virtual {p0}, Li/a;->J()V

    goto/16 :goto_2

    :cond_4c
    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    goto/16 :goto_2

    :cond_4d
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "syntax error, "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4e
    invoke-interface {v2}, Li/c;->y()V

    const/4 v8, 0x0

    invoke-virtual {p0, v8}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Li/c;->q()I

    move-result v8

    const/16 v10, 0xd

    if-ne v8, v10, :cond_4f

    invoke-interface {v2}, Li/c;->y()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-object p1

    :cond_4f
    :try_start_e
    invoke-interface {v2}, Li/c;->q()I

    move-result v8

    const/16 v10, 0x10

    if-ne v8, v10, :cond_50

    goto/16 :goto_2

    :cond_50
    new-instance p1, Lf/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_51
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_52
    new-instance p1, Lf/d;

    invoke-direct {p1, v10}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    throw p1
.end method

.method public final I(Ljava/lang/Object;)V
    .locals 9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Li/a;->d:Li/i;

    invoke-virtual {v1, v0}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v1

    instance-of v2, v1, Lj/n;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lj/n;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    const/16 v4, 0xc

    const/16 v5, 0x10

    if-eq v2, v4, :cond_2

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    if-ne v2, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lf/d;

    const-string v0, "syntax error, expect {, actual "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object v2, p0, Li/a;->g:Li/c;

    iget-object v4, p0, Li/a;->c:Li/j;

    invoke-interface {v2, v4}, Li/c;->N(Li/j;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xd

    if-nez v2, :cond_4

    iget-object v6, p0, Li/a;->g:Li/c;

    invoke-interface {v6}, Li/c;->q()I

    move-result v6

    if-ne v6, v4, :cond_3

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1, v5}, Li/c;->Q(I)V

    return-void

    :cond_3
    iget-object v6, p0, Li/a;->g:Li/c;

    invoke-interface {v6}, Li/c;->q()I

    move-result v6

    if-ne v6, v5, :cond_4

    iget-object v6, p0, Li/a;->g:Li/c;

    sget-object v7, Li/b;->h:Li/b;

    invoke-interface {v6, v7}, Li/c;->A(Li/b;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1, v2, v3}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v6

    goto :goto_2

    :cond_5
    move-object v6, v3

    :goto_2
    if-nez v6, :cond_7

    iget-object v6, p0, Li/a;->g:Li/c;

    sget-object v7, Li/b;->j:Li/b;

    invoke-interface {v6, v7}, Li/c;->A(Li/b;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->S()V

    invoke-virtual {p0}, Li/a;->s()Ljava/lang/Object;

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    if-ne v2, v4, :cond_2

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1}, Li/c;->y()V

    return-void

    :cond_6
    new-instance p1, Lf/d;

    const-string v1, "setter not found, class "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", property "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v2, v6, Lj/k;->a:Lm/c;

    iget-object v7, v2, Lm/c;->f:Ljava/lang/Class;

    iget-object v2, v2, Lm/c;->g:Ljava/lang/reflect/Type;

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v7, v8, :cond_8

    iget-object v7, p0, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->H()V

    sget-object v7, Lk/c0;->a:Lk/c0;

    invoke-virtual {v7, p0, v2, v3}, Lk/c0;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    :cond_8
    const-class v8, Ljava/lang/String;

    if-ne v7, v8, :cond_9

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->H()V

    invoke-static {p0}, Lk/c1;->f(Li/a;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    :cond_9
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v7, v8, :cond_a

    iget-object v7, p0, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->H()V

    sget-object v7, Lk/l0;->a:Lk/l0;

    invoke-virtual {v7, p0, v2, v3}, Lk/l0;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    :cond_a
    iget-object v8, p0, Li/a;->d:Li/i;

    invoke-virtual {v8, v7, v2}, Li/i;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v7

    iget-object v8, p0, Li/a;->g:Li/c;

    invoke-interface {v7}, Lj/s;->e()I

    invoke-interface {v8}, Li/c;->H()V

    invoke-interface {v7, p0, v2, v3}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_3
    invoke-virtual {v6, p1, v2}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    if-ne v2, v5, :cond_b

    goto/16 :goto_1

    :cond_b
    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    if-ne v2, v4, :cond_2

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1, v5}, Li/c;->Q(I)V

    return-void
.end method

.method public final J()V
    .locals 3

    iget-object v0, p0, Li/a;->g:Li/c;

    sget-object v1, Li/b;->l:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li/a;->h:Li/h;

    iget-object v0, v0, Li/h;->b:Li/h;

    iput-object v0, p0, Li/a;->h:Li/h;

    iget v0, p0, Li/a;->j:I

    if-gtz v0, :cond_1

    return-void

    :cond_1
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Li/a;->j:I

    iget-object v1, p0, Li/a;->i:[Li/h;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    return-void
.end method

.method public final K(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Li/a;->i:[Li/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Li/a;->i:[Li/h;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    iget v3, p0, Li/a;->j:I

    if-ge v0, v3, :cond_2

    aget-object v2, v2, v0

    invoke-virtual {v2}, Li/h;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, v2, Li/h;->a:Ljava/lang/Object;

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;
    .locals 3

    iget-object v0, p0, Li/a;->g:Li/c;

    sget-object v1, Li/b;->l:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Li/h;

    invoke-direct {v0, p1, p2, p3}, Li/h;-><init>(Li/h;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Li/a;->h:Li/h;

    iget p1, p0, Li/a;->j:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Li/a;->j:I

    iget-object p2, p0, Li/a;->i:[Li/h;

    if-nez p2, :cond_1

    const/16 p2, 0x8

    new-array p2, p2, [Li/h;

    iput-object p2, p0, Li/a;->i:[Li/h;

    goto :goto_0

    :cond_1
    array-length p3, p2

    if-lt p1, p3, :cond_2

    array-length p3, p2

    mul-int/lit8 p3, p3, 0x3

    div-int/lit8 p3, p3, 0x2

    new-array p3, p3, [Li/h;

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, p3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p3, p0, Li/a;->i:[Li/h;

    :cond_2
    :goto_0
    iget-object p2, p0, Li/a;->i:[Li/h;

    aput-object v0, p2, p1

    iget-object p1, p0, Li/a;->h:Li/h;

    return-object p1
.end method

.method public final N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;
    .locals 2

    iget-object v0, p0, Li/a;->g:Li/c;

    sget-object v1, Li/b;->l:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Li/a;->h:Li/h;

    invoke-virtual {p0, v0, p1, p2}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object p1

    return-object p1
.end method

.method public final P(Li/h;)V
    .locals 2

    iget-object v0, p0, Li/a;->g:Li/c;

    sget-object v1, Li/b;->l:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Li/a;->h:Li/h;

    return-void
.end method

.method public final a(I)V
    .locals 3

    iget-object v0, p0, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    if-ne v1, p1, :cond_0

    invoke-interface {v0}, Li/c;->y()V

    return-void

    :cond_0
    new-instance v1, Lf/d;

    const-string v2, "syntax error, expect "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Li/g;->w(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", actual "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Li/c;->q()I

    move-result p1

    invoke-static {p1}, Li/g;->w(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b(Li/a$a;)V
    .locals 2

    iget-object v0, p0, Li/a;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Li/a;->k:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Li/a;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Ljava/util/Collection;)V
    .locals 4

    iget v0, p0, Li/a;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    instance-of v0, p1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    sub-int/2addr v0, v1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0}, Li/a;->p()Li/a$a;

    move-result-object v1

    new-instance v3, Lj/w;

    invoke-direct {v3, p0, p1, v0}, Lj/w;-><init>(Li/a;Ljava/util/List;I)V

    iput-object v3, v1, Li/a$a;->c:Lj/k;

    iget-object p1, p0, Li/a;->h:Li/h;

    iput-object p1, v1, Li/a$a;->d:Li/h;

    :goto_0
    iput v2, p0, Li/a;->l:I

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Li/a;->p()Li/a$a;

    move-result-object v0

    new-instance v1, Lj/w;

    invoke-direct {v1, p1}, Lj/w;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Li/a$a;->c:Lj/k;

    iget-object p1, p0, Li/a;->h:Li/h;

    iput-object p1, v0, Li/a$a;->d:Li/h;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Li/a;->g:Li/c;

    :try_start_0
    sget-object v1, Li/b;->c:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0x14

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lf/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "not close json text, token : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Li/c;->q()I

    move-result v3

    invoke-static {v3}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    invoke-interface {v0}, Li/c;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Li/c;->close()V

    throw v1
.end method

.method public final e(Ljava/util/Map;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Li/a;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lj/w;

    invoke-direct {v0, p1, p2}, Lj/w;-><init>(Ljava/util/Map;Ljava/lang/Object;)V

    invoke-virtual {p0}, Li/a;->p()Li/a$a;

    move-result-object p1

    iput-object v0, p1, Li/a$a;->c:Lj/k;

    iget-object p2, p0, Li/a;->h:Li/h;

    iput-object p2, p1, Li/a$a;->d:Li/h;

    const/4 p1, 0x0

    iput p1, p0, Li/a;->l:I

    :cond_0
    return-void
.end method

.method public final f()Li/i;
    .locals 1

    iget-object v0, p0, Li/a;->d:Li/i;

    return-object v0
.end method

.method public final l()Li/h;
    .locals 1

    iget-object v0, p0, Li/a;->h:Li/h;

    return-object v0
.end method

.method public final n()Ljava/text/DateFormat;
    .locals 3

    iget-object v0, p0, Li/a;->f:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Li/a;->e:Ljava/lang/String;

    iget-object v2, p0, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->f0()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Li/a;->f:Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->l0()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    iget-object v0, p0, Li/a;->f:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public final p()Li/a$a;
    .locals 2

    iget-object v0, p0, Li/a;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li/a$a;

    return-object v0
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, Li/a;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_8

    iget-object v3, p0, Li/a;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li/a$a;

    iget-object v4, v3, Li/a$a;->b:Ljava/lang/String;

    iget-object v5, v3, Li/a$a;->d:Li/h;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    iget-object v5, v5, Li/h;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v5, v6

    :goto_1
    const-string v7, "$"

    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    :goto_2
    iget v8, p0, Li/a;->j:I

    if-ge v7, v8, :cond_3

    iget-object v8, p0, Li/a;->i:[Li/h;

    aget-object v8, v8, v7

    invoke-virtual {v8}, Li/h;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v6, p0, Li/a;->i:[Li/h;

    aget-object v6, v6, v7

    iget-object v6, v6, Li/h;->a:Ljava/lang/Object;

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v6, :cond_5

    :try_start_0
    invoke-static {p1, v4}, Lf/g;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6
    :try_end_0
    .catch Lf/i; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    goto :goto_4

    :cond_4
    iget-object v6, v3, Li/a$a;->a:Li/h;

    iget-object v6, v6, Li/h;->a:Ljava/lang/Object;

    :cond_5
    :goto_4
    iget-object v3, v3, Li/a$a;->c:Lj/k;

    if-eqz v3, :cond_7

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Lf/e;

    if-ne v7, v8, :cond_6

    iget-object v7, v3, Lj/k;->a:Lm/c;

    if-eqz v7, :cond_6

    const-class v8, Ljava/util/Map;

    iget-object v7, v7, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_6

    iget-object v6, p0, Li/a;->i:[Li/h;

    aget-object v6, v6, v1

    iget-object v6, v6, Li/h;->a:Ljava/lang/Object;

    invoke-static {v6, v4}, Lf/g;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    :cond_6
    invoke-virtual {v3, v5, v6}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final r(Li/b;)Z
    .locals 1

    iget-object v0, p0, Li/a;->g:Li/c;

    invoke-interface {v0, p1}, Li/c;->A(Li/b;)Z

    move-result p1

    return p1
.end method

.method public final s()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final w(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_c

    const/4 v3, 0x3

    if-eq v1, v3, :cond_b

    const/4 v3, 0x4

    if-eq v1, v3, :cond_8

    const/16 v3, 0xc

    if-eq v1, v3, :cond_7

    const/16 v3, 0xe

    if-eq v1, v3, :cond_5

    const-string v3, "syntax error, "

    const/16 v4, 0x12

    const/4 v5, 0x0

    if-eq v1, v4, :cond_3

    const/16 v6, 0x1a

    if-eq v1, v6, :cond_2

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    new-instance p1, Lf/d;

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-interface {v0, v4}, Li/c;->Q(I)V

    invoke-interface {v0}, Li/c;->q()I

    move-result p1

    if-ne p1, v4, :cond_0

    const/16 p1, 0xa

    invoke-interface {v0, p1}, Li/c;->Q(I)V

    invoke-virtual {p0, p1}, Li/a;->a(I)V

    invoke-interface {v0}, Li/c;->f()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v2}, Li/a;->a(I)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1}, Li/a;->a(I)V

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1

    :cond_0
    new-instance p1, Lf/d;

    const-string v0, "syntax error"

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    invoke-interface {v0}, Li/c;->y()V

    return-object v5

    :pswitch_2
    invoke-interface {v0}, Li/c;->y()V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_3
    invoke-interface {v0}, Li/c;->y()V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_4
    invoke-interface {v0}, Li/c;->y()V

    return-object v5

    :pswitch_5
    invoke-interface {v0}, Li/c;->y()V

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    goto :goto_0

    :pswitch_6
    invoke-interface {v0}, Li/c;->y()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    invoke-virtual {p0, v0, p1}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    return-object v0

    :pswitch_7
    invoke-interface {v0}, Li/c;->n()Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v5

    :cond_1
    new-instance p1, Lf/d;

    const-string v1, "unterminated json string, "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {v0}, Li/c;->a0()[B

    move-result-object p1

    invoke-interface {v0}, Li/c;->y()V

    return-object p1

    :cond_3
    invoke-interface {v0}, Li/c;->k0()Ljava/lang/String;

    move-result-object p1

    const-string v1, "NaN"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v0}, Li/c;->y()V

    return-object v5

    :cond_4
    new-instance p1, Lf/d;

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance v1, Lf/b;

    invoke-direct {v1}, Lf/b;-><init>()V

    invoke-virtual {p0, v1, p1}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    sget-object p1, Li/b;->q:Li/b;

    invoke-interface {v0, p1}, Li/c;->A(Li/b;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v1}, Lf/b;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v1

    :cond_7
    new-instance v1, Lf/e;

    sget-object v2, Li/b;->o:Li/b;

    invoke-interface {v0, v2}, Li/c;->A(Li/b;)Z

    move-result v0

    invoke-direct {v1, v0}, Lf/e;-><init>(Z)V

    invoke-virtual {p0, v1, p1}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-interface {v0}, Li/c;->k0()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Li/c;->Q(I)V

    sget-object v1, Li/b;->g:Li/b;

    invoke-interface {v0, v1}, Li/c;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Li/f;

    invoke-direct {v0, p1}, Li/f;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v0, v1}, Li/f;->S0(Z)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object p1, v0, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Li/d;->close()V

    return-object p1

    :cond_9
    invoke-virtual {v0}, Li/d;->close()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Li/d;->close()V

    throw p1

    :cond_a
    :goto_1
    return-object p1

    :cond_b
    sget-object p1, Li/b;->i:Li/b;

    invoke-interface {v0, p1}, Li/c;->A(Li/b;)Z

    move-result p1

    invoke-interface {v0, p1}, Li/c;->Z(Z)Ljava/lang/Number;

    move-result-object p1

    invoke-interface {v0}, Li/c;->y()V

    return-object p1

    :cond_c
    invoke-interface {v0}, Li/c;->f()Ljava/lang/Number;

    move-result-object p1

    invoke-interface {v0}, Li/c;->y()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final x(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V
    .locals 8

    const-class v0, Ljava/lang/String;

    iget-object v1, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->q()I

    move-result v1

    const/16 v2, 0x15

    if-eq v1, v2, :cond_0

    const/16 v2, 0x16

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->y()V

    iget-object v1, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->q()I

    move-result v1

    :cond_1
    const/16 v2, 0xe

    if-ne v1, v2, :cond_c

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x4

    if-ne v1, p1, :cond_2

    sget-object v1, Lk/c0;->a:Lk/c0;

    iget-object v3, p0, Li/a;->g:Li/c;

    const/4 v4, 0x2

    goto :goto_0

    :cond_2
    if-ne v0, p1, :cond_3

    sget-object v1, Lk/c1;->a:Lk/c1;

    iget-object v3, p0, Li/a;->g:Li/c;

    invoke-interface {v3, v2}, Li/c;->Q(I)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Li/a;->d:Li/i;

    invoke-virtual {v1, p1}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v1

    iget-object v3, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Lj/s;->e()I

    move-result v4

    :goto_0
    invoke-interface {v3, v4}, Li/c;->Q(I)V

    :goto_1
    iget-object v3, p0, Li/a;->h:Li/h;

    invoke-virtual {p0, p2, p3}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    const/4 p3, 0x0

    :goto_2
    :try_start_0
    iget-object v4, p0, Li/a;->g:Li/c;

    sget-object v5, Li/b;->h:Li/b;

    invoke-interface {v4, v5}, Li/c;->A(Li/b;)Z

    move-result v4

    const/16 v5, 0x10

    if-eqz v4, :cond_4

    :goto_3
    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v4

    if-ne v4, v5, :cond_4

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->y()V

    goto :goto_3

    :cond_4
    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v6, 0xf

    if-ne v4, v6, :cond_5

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    iget-object p1, p0, Li/a;->g:Li/c;

    invoke-interface {p1, v5}, Li/c;->Q(I)V

    return-void

    :cond_5
    :try_start_1
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    if-ne v4, p1, :cond_6

    sget-object v4, Lk/c0;->a:Lk/c0;

    invoke-virtual {v4, p0, v6, v6}, Lk/c0;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    if-ne v0, p1, :cond_9

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v4

    if-ne v4, v2, :cond_7

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->k0()Ljava/lang/String;

    move-result-object v6

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4, v5}, Li/c;->Q(I)V

    goto :goto_4

    :cond_7
    invoke-virtual {p0, v6}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-interface {p2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v4

    const/16 v7, 0x8

    if-ne v4, v7, :cond_a

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->y()V

    goto :goto_5

    :cond_a
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, p0, p1, v4}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_5
    invoke-interface {p2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Li/a;->c(Ljava/util/Collection;)V

    :goto_6
    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v4

    if-ne v4, v5, :cond_b

    iget-object v4, p0, Li/a;->g:Li/c;

    invoke-interface {v1}, Lj/s;->e()I

    move-result v5

    invoke-interface {v4, v5}, Li/c;->Q(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    throw p1

    :cond_c
    new-instance p1, Lf/d;

    const-string p2, "exepct \'[\', but "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {v1}, Li/g;->w(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Li/a;->g:Li/c;

    invoke-interface {p3}, Li/c;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(Ljava/util/Collection;Ljava/lang/Object;)V
    .locals 10

    iget-object v0, p0, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0x15

    if-eq v1, v2, :cond_0

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0x16

    if-ne v1, v2, :cond_1

    :cond_0
    invoke-interface {v0}, Li/c;->y()V

    :cond_1
    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0xe

    if-ne v1, v2, :cond_11

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Li/c;->Q(I)V

    iget-object v3, p0, Li/a;->h:Li/h;

    invoke-virtual {p0, p1, p2}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    const/4 p2, 0x0

    const/4 v4, 0x0

    :goto_0
    :try_start_0
    sget-object v5, Li/b;->h:Li/b;

    invoke-interface {v0, v5}, Li/c;->A(Li/b;)Z

    move-result v5

    const/16 v6, 0x10

    if-eqz v5, :cond_2

    :goto_1
    invoke-interface {v0}, Li/c;->q()I

    move-result v5

    if-ne v5, v6, :cond_2

    invoke-interface {v0}, Li/c;->y()V

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Li/c;->q()I

    move-result v5

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eq v5, v7, :cond_e

    const/4 v7, 0x3

    const/4 v9, 0x1

    if-eq v5, v7, :cond_c

    if-eq v5, v1, :cond_a

    const/4 v7, 0x6

    if-eq v5, v7, :cond_9

    const/4 v7, 0x7

    if-eq v5, v7, :cond_8

    const/16 v7, 0x8

    if-eq v5, v7, :cond_7

    const/16 v7, 0xc

    if-eq v5, v7, :cond_6

    const/16 v7, 0x14

    if-eq v5, v7, :cond_5

    const/16 v7, 0x17

    if-eq v5, v7, :cond_7

    if-eq v5, v2, :cond_4

    const/16 v7, 0xf

    if-eq v5, v7, :cond_3

    invoke-virtual {p0, v8}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    goto/16 :goto_3

    :cond_3
    invoke-interface {v0, v6}, Li/c;->Q(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    return-void

    :cond_4
    :try_start_1
    new-instance v8, Lf/b;

    invoke-direct {v8}, Lf/b;-><init>()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, v8, v5}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    sget-object v5, Li/b;->q:Li/b;

    invoke-interface {v0, v5}, Li/c;->A(Li/b;)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-virtual {v8}, Lf/b;->toArray()[Ljava/lang/Object;

    move-result-object v8

    goto :goto_3

    :cond_5
    new-instance p1, Lf/d;

    const-string p2, "unclosed jsonArray"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance v5, Lf/e;

    sget-object v7, Li/b;->o:Li/b;

    invoke-interface {v0, v7}, Li/c;->A(Li/b;)Z

    move-result v7

    invoke-direct {v5, v7}, Lf/e;-><init>(Z)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p0, v5, v7}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_3

    :cond_7
    invoke-interface {v0, v1}, Li/c;->Q(I)V

    goto :goto_3

    :cond_8
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_9
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_a
    invoke-interface {v0}, Li/c;->k0()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v6}, Li/c;->Q(I)V

    sget-object v5, Li/b;->g:Li/b;

    invoke-interface {v0, v5}, Li/c;->A(Li/b;)Z

    move-result v5

    if-eqz v5, :cond_f

    new-instance v5, Li/f;

    invoke-direct {v5, v8}, Li/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Li/f;->S0(Z)Z

    move-result v7

    if-eqz v7, :cond_b

    iget-object v7, v5, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v7

    move-object v8, v7

    :cond_b
    invoke-virtual {v5}, Li/d;->close()V

    goto :goto_3

    :cond_c
    sget-object v5, Li/b;->i:Li/b;

    invoke-interface {v0, v5}, Li/c;->A(Li/b;)Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0, v9}, Li/c;->Z(Z)Ljava/lang/Number;

    move-result-object v5

    goto :goto_2

    :cond_d
    invoke-interface {v0, p2}, Li/c;->Z(Z)Ljava/lang/Number;

    move-result-object v5

    goto :goto_2

    :cond_e
    invoke-interface {v0}, Li/c;->f()Ljava/lang/Number;

    move-result-object v5

    :goto_2
    move-object v8, v5

    invoke-interface {v0, v6}, Li/c;->Q(I)V

    :cond_f
    :goto_3
    invoke-interface {p1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Li/a;->c(Ljava/util/Collection;)V

    invoke-interface {v0}, Li/c;->q()I

    move-result v5

    if-ne v5, v6, :cond_10

    invoke-interface {v0, v1}, Li/c;->Q(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_10
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v3}, Li/a;->P(Li/h;)V

    throw p1

    :cond_11
    new-instance p1, Lf/d;

    const-string v1, "syntax error, expect [, actual "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Li/c;->q()I

    move-result v2

    invoke-static {v2}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", pos "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Li/c;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fieldName "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    iget-object p2, p0, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->S()V

    iget-object p2, p0, Li/a;->m:Ljava/util/ArrayList;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v1, v0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/j;

    invoke-interface {v1}, Lj/j;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :cond_1
    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1, v0}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    instance-of p2, p1, Lj/h;

    if-eqz p2, :cond_3

    check-cast p1, Lj/h;

    invoke-interface {p1}, Lj/h;->a()V

    return-void

    :cond_3
    iget-object p1, p0, Li/a;->n:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj/i;

    invoke-interface {p2}, Lj/i;->a()V

    goto :goto_2

    :cond_4
    iget p1, p0, Li/a;->l:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    const/4 p1, 0x0

    iput p1, p0, Li/a;->l:I

    :cond_5
    return-void
.end method
