.class public final Lj/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/a$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lm/a;

.field public final b:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Li/a;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lj/a;->c:Ljava/lang/String;

    const-class v0, Li/d;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lj/a;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lj/a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    check-cast p1, Lm/a;

    iput-object p1, p0, Lj/a;->a:Lm/a;

    return-void
.end method


# virtual methods
.method public final a(Lj/a$a;Lh/h;Z)V
    .locals 12

    iget-object v0, p1, Lj/a$a;->f:[Lm/c;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_e

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const/16 v3, 0x15

    if-eqz p3, :cond_0

    const-string v4, "_asm_flag_"

    invoke-static {v4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    div-int/lit8 v5, v1, 0x20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    const/4 v4, 0x1

    shl-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p2, v4}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v4, 0x7e

    invoke-virtual {p2, v4}, Lh/h;->c(I)V

    const/16 v4, 0x99

    invoke-virtual {p2, v4, v2}, Lh/h;->e(ILh/f;)V

    :cond_0
    iget-object v4, p1, Lj/a$a;->f:[Lm/c;

    aget-object v4, v4, v1

    const-class v5, Ljava/lang/String;

    iget-object v6, v4, Lm/c;->f:Ljava/lang/Class;

    iget-object v7, v4, Lm/c;->g:Ljava/lang/reflect/Type;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v9, "instance"

    const-string v10, "_asm"

    const/16 v11, 0x19

    if-ne v6, v8, :cond_1

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p2, v11, v5}, Lh/h;->k(II)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_3

    :cond_1
    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v6, v8, :cond_b

    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v6, v8, :cond_b

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v6, v8, :cond_b

    sget-object v8, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v6, v8, :cond_2

    goto/16 :goto_2

    :cond_2
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v6, v3, :cond_4

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    const/16 v3, 0x16

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v4, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p2, v3, v5}, Lh/h;->k(II)V

    iget-object v3, v4, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_3

    const/16 v3, 0xb6

    invoke-virtual {p1}, Lj/a$a;->d()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    iget-object v7, v4, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-static {v7}, Lm/b;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v3, v5, v6, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v4, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    const/16 v3, 0x57

    invoke-virtual {p2, v3}, Lh/h;->c(I)V

    goto/16 :goto_6

    :cond_3
    const/16 v3, 0xb5

    iget-object v5, v4, Lm/c;->h:Ljava/lang/Class;

    invoke-static {v5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v4, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    iget-object v4, v4, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v3, v5, v6, v4}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_4
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v6, v3, :cond_5

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    const/16 v3, 0x17

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_3

    :cond_5
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v6, v3, :cond_6

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    const/16 v3, 0x18

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v4, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v5

    goto/16 :goto_4

    :cond_6
    if-ne v6, v5, :cond_7

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :cond_7
    invoke-virtual {v6}, Ljava/lang/Class;->isEnum()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :cond_8
    const-class v3, Ljava/util/Collection;

    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    invoke-static {v7}, Lm/j;->x(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v5, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v4, Lm/c;->b:Ljava/lang/String;

    invoke-static {v3, v5, v10, p1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    const/16 v3, 0xc0

    invoke-static {v6}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v3, v5}, Lh/h;->j(ILjava/lang/String;)V

    goto :goto_5

    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_1

    :cond_a
    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    iget-object v5, v4, Lm/c;->b:Ljava/lang/String;

    invoke-static {v3, v5, v10, p1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v3

    invoke-virtual {p2, v11, v3}, Lh/h;->k(II)V

    goto :goto_5

    :cond_b
    :goto_2
    invoke-virtual {p1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p2, v11, v5}, Lh/h;->k(II)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    :goto_3
    iget-object v6, v4, Lm/c;->b:Ljava/lang/String;

    invoke-static {v5, v6, v10, p1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v5

    :goto_4
    invoke-virtual {p2, v3, v5}, Lh/h;->k(II)V

    :goto_5
    invoke-virtual {p0, p2, v4}, Lj/a;->m(Lh/h;Lm/c;)V

    :cond_c
    :goto_6
    if-eqz p3, :cond_d

    invoke-virtual {p2, v2}, Lh/h;->f(Lh/f;)V

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_e
    return-void
.end method

.method public final b(Lj/a$a;Lh/h;)V
    .locals 6

    const-class v0, Lj/n;

    iget-object v1, p1, Lj/a$a;->d:Lm/g;

    iget-object v1, v1, Lm/g;->c:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    const/16 v3, 0xb7

    if-eqz v2, :cond_0

    const/16 v0, 0xbb

    invoke-virtual {p1}, Lj/a$a;->d()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v0, 0x59

    invoke-virtual {p2, v0}, Lh/h;->c(I)V

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    const-string v2, "()V"

    invoke-virtual {p2, v3, v0, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    const/4 v4, 0x1

    invoke-virtual {p2, v1, v4}, Lh/h;->k(II)V

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    const/16 v1, 0xb4

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "clazz"

    const-string v5, "Ljava/lang/Class;"

    invoke-virtual {p2, v1, v2, v4, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(L"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lj/a;->c:Ljava/lang/String;

    const-string v4, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-static {v1, v2, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "createInstance"

    invoke-virtual {p2, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xc0

    invoke-virtual {p1}, Lj/a$a;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lh/h;->j(ILjava/lang/String;)V

    :goto_0
    const-string v0, "instance"

    invoke-virtual {p1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0x3a

    invoke-virtual {p2, v0, p1}, Lh/h;->k(II)V

    return-void
.end method

.method public final c(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/a$a;",
            "Lh/h;",
            "Lm/c;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-class v3, Lj/n;

    invoke-virtual/range {p0 .. p3}, Lj/a;->i(Lj/a$a;Lh/h;Lm/c;)V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    iget v6, v2, Lm/c;->k:I

    sget-object v7, Li/b;->n:Li/b;

    iget v7, v7, Li/b;->b:I

    and-int/2addr v6, v7

    const/4 v7, 0x1

    const-string v8, "_asm"

    const-string v9, "(L"

    const-string v10, "deserialze"

    const-string v11, "(I)Ljava/lang/reflect/Type;"

    const-string v12, "getFieldType"

    const/16 v13, 0xc0

    const/16 v14, 0x19

    if-eqz v6, :cond_1

    const/16 v6, 0x59

    invoke-virtual {v1, v6}, Lh/h;->c(I)V

    const/16 v6, 0xc1

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v6, v15}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v6, 0x99

    invoke-virtual {v1, v6, v4}, Lh/h;->e(ILh/f;)V

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v13, v6}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {v1, v14, v7}, Lh/h;->k(II)V

    iget-object v6, v2, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v6, v6, Ljava/lang/Class;

    if-eqz v6, :cond_0

    iget-object v6, v2, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v6}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v6

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    invoke-virtual {v1, v14, v6}, Lh/h;->k(II)V

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb6

    invoke-virtual {v1, v7, v6, v12, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v6, v2, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    iget v6, v2, Lm/c;->k:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v9}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v15, Lj/a;->c:Ljava/lang/String;

    const-string v14, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    invoke-static {v7, v15, v14}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v14, 0xb6

    invoke-virtual {v1, v14, v6, v10, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p4 .. p4}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v13, v6}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lm/c;->b:Ljava/lang/String;

    invoke-static {v6, v7, v8, v0}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-virtual {v1, v7, v6}, Lh/h;->k(II)V

    const/16 v6, 0xa7

    invoke-virtual {v1, v6, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v4}, Lh/h;->f(Lh/f;)V

    :cond_1
    const/4 v4, 0x1

    const/16 v6, 0x19

    invoke-virtual {v1, v6, v4}, Lh/h;->k(II)V

    iget-object v4, v2, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v4, v4, Ljava/lang/Class;

    if-eqz v4, :cond_2

    iget-object v3, v2, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    invoke-virtual {v1, v6, v4}, Lh/h;->k(II)V

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb6

    invoke-virtual {v1, v4, v3, v12, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v3, v2, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xb9

    const-class v4, Lj/s;

    invoke-static {v4}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v9}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lj/a;->c:Ljava/lang/String;

    const-string v9, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-static {v6, v7, v9}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v3, v4, v10, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p4 .. p4}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v13, v3}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lm/c;->b:Ljava/lang/String;

    invoke-static {v3, v2, v8, v0}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v1, v5}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final d(Lj/a$a;Lh/h;Lh/f;)V
    .locals 4

    const-string v0, "matchedCount"

    invoke-virtual {p1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x15

    invoke-virtual {p2, v1, v0}, Lh/h;->d(II)V

    const/16 v0, 0x9e

    invoke-virtual {p2, v0, p3}, Lh/h;->e(ILh/f;)V

    const-string v0, "lexer"

    invoke-virtual {p1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {p2, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v1, 0xb6

    const-string v2, "token"

    const-string v3, "()I"

    invoke-virtual {p2, v1, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xd

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {p2, v0, p3}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p0, p1, p2}, Lj/a;->l(Lj/a$a;Lh/h;)V

    return-void
.end method

.method public final e(Lh/c;Lj/a$a;)V
    .locals 26

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    const-class v0, Li/h;

    iget-object v1, v9, Lj/a$a;->f:[Lm/c;

    array-length v2, v1

    if-nez v2, :cond_0

    return-void

    :cond_0
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v1, v4

    iget-object v6, v5, Lm/c;->f:Ljava/lang/Class;

    iget-object v5, v5, Lm/c;->g:Ljava/lang/reflect/Type;

    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_1

    return-void

    :cond_1
    const-class v7, Ljava/util/Collection;

    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_3

    instance-of v6, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_2

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    aget-object v5, v5, v3

    instance-of v5, v5, Ljava/lang/Class;

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    iget-object v1, v9, Lj/a$a;->d:Lm/g;

    iget-object v2, v1, Lm/g;->i:[Lm/c;

    iput-object v2, v9, Lj/a$a;->f:[Lm/c;

    new-instance v10, Lh/h;

    const-string v11, "(L"

    invoke-static {v11}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lj/a;->c:Ljava/lang/String;

    const-string v4, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    invoke-static {v2, v3, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const-string v5, "deserialze"

    move-object/from16 v6, p1

    invoke-direct {v10, v6, v5, v2, v4}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    new-instance v13, Lh/f;

    invoke-direct {v13}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    new-instance v15, Lh/f;

    invoke-direct {v15}, Lh/f;-><init>()V

    invoke-virtual {v8, v9, v10}, Lj/a;->q(Lj/a$a;Lh/h;)V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const-string v7, "lexer"

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x19

    invoke-virtual {v10, v5, v4}, Lh/h;->k(II)V

    sget-object v4, Lj/a;->d:Ljava/lang/String;

    const/16 v5, 0xb6

    const-string v6, "token"

    move-object/from16 p1, v15

    const-string v15, "()I"

    invoke-virtual {v10, v5, v4, v6, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xe

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v10, v5}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v5, 0xa0

    invoke-virtual {v10, v5, v2}, Lh/h;->e(ILh/f;)V

    iget v1, v1, Lm/g;->j:I

    sget-object v5, Li/b;->n:Li/b;

    iget v6, v5, Li/b;->b:I

    and-int/2addr v1, v6

    const-string v6, "isEnabled"

    if-nez v1, :cond_5

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v15, 0x19

    invoke-virtual {v10, v15, v1}, Lh/h;->k(II)V

    const/4 v1, 0x4

    const/16 v15, 0x15

    invoke-virtual {v10, v15, v1}, Lh/h;->k(II)V

    iget v1, v5, Li/b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v1, "(II)Z"

    const/16 v5, 0xb6

    invoke-virtual {v10, v5, v4, v6, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x99

    invoke-virtual {v10, v1, v2}, Lh/h;->e(ILh/f;)V

    :cond_5
    const/16 v15, 0x19

    const/4 v1, 0x0

    invoke-virtual {v10, v15, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    invoke-virtual {v10, v15, v1}, Lh/h;->k(II)V

    const/4 v5, 0x2

    invoke-virtual {v10, v15, v5}, Lh/h;->k(II)V

    const/4 v5, 0x3

    invoke-virtual {v10, v15, v5}, Lh/h;->k(II)V

    invoke-virtual {v10, v1}, Lh/h;->c(I)V

    const/16 v1, 0xb7

    iget-object v5, v9, Lj/a$a;->e:Ljava/lang/String;

    const-string v15, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-static {v11, v3, v15}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v12

    const-string v12, "deserialzeArrayMapping"

    invoke-virtual {v10, v1, v5, v12, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xb0

    invoke-virtual {v10, v1}, Lh/h;->c(I)V

    invoke-virtual {v10, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    sget-object v1, Li/b;->k:Li/b;

    iget v1, v1, Li/b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v1, "(I)Z"

    const/16 v5, 0xb6

    invoke-virtual {v10, v5, v4, v6, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x99

    invoke-virtual {v10, v1, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    iget-object v1, v9, Lj/a$a;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v1, "scanType"

    const-string v2, "(Ljava/lang/String;)I"

    invoke-virtual {v10, v5, v4, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v1, 0x9f

    invoke-virtual {v10, v1, v13}, Lh/h;->e(ILh/f;)V

    const/4 v1, 0x1

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "()"

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getContext"

    invoke-virtual {v10, v5, v3, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mark_context"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v10, v1}, Lh/h;->c(I)V

    const-string v1, "matchedCount"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v5, 0x36

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    invoke-virtual {v8, v9, v10}, Lj/a;->b(Lj/a$a;Lh/h;)V

    const/4 v1, 0x1

    const/16 v5, 0x19

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "getContext"

    const/16 v15, 0xb6

    invoke-virtual {v10, v15, v3, v5, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    const/16 v5, 0x19

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    const-string v1, "context"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    const-string v1, "instance"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v10, v5, v1}, Lh/h;->k(II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "("

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Ljava/lang/Object;Ljava/lang/Object;)"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setContext"

    const/16 v5, 0xb6

    invoke-virtual {v10, v5, v3, v1, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "childContext"

    invoke-virtual {v9, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const-string v15, "matchStat"

    const-string v5, "I"

    const/16 v0, 0xb4

    invoke-virtual {v10, v0, v4, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0x9f

    invoke-virtual {v10, v0, v14}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x3

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    invoke-virtual {v9, v15}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x36

    invoke-virtual {v10, v2, v1}, Lh/h;->d(II)V

    iget-object v1, v9, Lj/a$a;->f:[Lm/c;

    array-length v4, v1

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v4, :cond_6

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_asm_flag_"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 v2, v1, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x36

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    add-int/lit8 v1, v1, 0x20

    const/4 v0, 0x3

    goto :goto_2

    :cond_6
    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Li/b;->m:Li/b;

    iget v0, v0, Li/b;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "(I)Z"

    const/16 v2, 0xb6

    invoke-virtual {v10, v2, v0, v6, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "initStringFieldAsEmpty"

    invoke-virtual {v9, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x36

    invoke-virtual {v10, v1, v0}, Lh/h;->d(II)V

    const/4 v0, 0x0

    :goto_3
    const-string v6, "_asm"

    if-ge v0, v4, :cond_d

    iget-object v1, v9, Lj/a$a;->f:[Lm/c;

    aget-object v1, v1, v0

    iget-object v2, v1, Lm/c;->f:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_c

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_c

    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_c

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_7

    goto/16 :goto_7

    :cond_7
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_8

    const/16 v2, 0x9

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    const/16 v2, 0x37

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_4

    :cond_8
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_9

    const/16 v2, 0xb

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    const/16 v2, 0x38

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    invoke-static {v3, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    goto :goto_5

    :cond_9
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_a

    const/16 v2, 0xe

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    const/16 v2, 0x39

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_4
    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v1

    :goto_5
    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    move-object/from16 v20, v11

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    goto/16 :goto_9

    :cond_a
    const-class v3, Ljava/lang/String;

    if-ne v2, v3, :cond_b

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    move-object/from16 v17, v13

    new-instance v13, Lh/f;

    invoke-direct {v13}, Lh/f;-><init>()V

    move-object/from16 v18, v12

    const-string v12, "initStringFieldAsEmpty"

    invoke-virtual {v9, v12}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v19, v14

    const/16 v14, 0x15

    invoke-virtual {v10, v14, v12}, Lh/h;->k(II)V

    const/16 v12, 0x99

    invoke-virtual {v10, v12, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v10, v9, v0}, Lj/a;->o(Lh/h;Lj/a$a;I)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v12

    const/16 v14, 0x19

    invoke-virtual {v10, v14, v12}, Lh/h;->k(II)V

    sget-object v12, Lj/a;->d:Ljava/lang/String;

    const-string v14, "stringDefaultValue"

    move-object/from16 v20, v11

    const-string v11, "()Ljava/lang/String;"

    const/16 v8, 0xb6

    invoke-virtual {v10, v8, v12, v14, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0xa7

    invoke-virtual {v10, v8, v3}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v10, v13}, Lh/h;->f(Lh/f;)V

    const/4 v8, 0x1

    invoke-virtual {v10, v8}, Lh/h;->c(I)V

    invoke-virtual {v10, v3}, Lh/h;->f(Lh/f;)V

    goto :goto_6

    :cond_b
    move-object/from16 v20, v11

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    const/4 v3, 0x1

    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    :goto_6
    const/16 v3, 0xc0

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v3, v2}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v20, v11

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    const/4 v2, 0x3

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x36

    :goto_8
    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    :goto_9
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v8, p0

    move-object/from16 v13, v17

    move-object/from16 v12, v18

    move-object/from16 v14, v19

    move-object/from16 v11, v20

    goto/16 :goto_3

    :cond_d
    move-object/from16 v20, v11

    move-object/from16 v18, v12

    move-object/from16 v17, v13

    move-object/from16 v19, v14

    const/4 v0, 0x0

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v4, :cond_28

    iget-object v0, v9, Lj/a$a;->f:[Lm/c;

    aget-object v11, v0, v8

    iget-object v12, v11, Lm/c;->f:Ljava/lang/Class;

    iget-object v0, v11, Lm/c;->g:Ljava/lang/reflect/Type;

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v3, "[C"

    const-string v13, "_asm_prefix__"

    if-ne v12, v2, :cond_e

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    iget-object v0, v9, Lj/a$a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v12, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0xb4

    invoke-virtual {v10, v12, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanFieldBoolean"

    const-string v3, "([C)Z"

    const/16 v12, 0xb6

    invoke-static {v10, v12, v0, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x36

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    move/from16 v21, v4

    goto :goto_b

    :cond_e
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-string v14, "([C)I"

    move/from16 v21, v4

    const-string v4, "scanFieldInt"

    if-ne v12, v2, :cond_f

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    iget-object v0, v9, Lj/a$a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v12, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0xb4

    invoke-virtual {v10, v12, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v2, 0xb6

    invoke-static {v10, v2, v0, v4, v14}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x36

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    :goto_b
    move-object/from16 v22, v1

    move/from16 v23, v8

    goto/16 :goto_13

    :cond_f
    const-class v2, Ljava/lang/Byte;

    move-object/from16 v22, v1

    const-string v1, "valueOf"

    move/from16 v23, v8

    const/16 v8, 0xb8

    const/16 v24, 0x5

    if-ne v12, v2, :cond_10

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    iget-object v0, v9, Lj/a$a;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v12, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0xb4

    invoke-virtual {v10, v12, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v2, 0xb6

    invoke-virtual {v10, v2, v0, v4, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Byte"

    const-string v3, "(B)Ljava/lang/Byte;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_f

    :cond_10
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v12, v2, :cond_11

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    iget-object v0, v9, Lj/a$a;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_c
    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v1, 0xb6

    invoke-static {v10, v1, v0, v4, v14}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto/16 :goto_d

    :cond_11
    const-class v2, Ljava/lang/Short;

    if-ne v12, v2, :cond_12

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v12, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0xb4

    invoke-virtual {v10, v12, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v2, 0xb6

    invoke-virtual {v10, v2, v0, v4, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Short"

    const-string v3, "(S)Ljava/lang/Short;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_f

    :cond_12
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v12, v2, :cond_13

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_c

    :goto_d
    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x36

    goto/16 :goto_12

    :cond_13
    const-class v2, Ljava/lang/Integer;

    if-ne v12, v2, :cond_14

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v12, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0xb4

    invoke-virtual {v10, v12, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v2, 0xb6

    invoke-virtual {v10, v2, v0, v4, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Integer"

    const-string v3, "(I)Ljava/lang/Integer;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_f

    :cond_14
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v2, :cond_15

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldLong"

    const-string v2, "([C)J"

    const/16 v3, 0xb6

    const/16 v4, 0x37

    invoke-static {v10, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v0

    goto/16 :goto_e

    :cond_15
    const-class v2, Ljava/lang/Long;

    if-ne v12, v2, :cond_16

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v4, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb4

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanFieldLong"

    const-string v3, "([C)J"

    const/16 v4, 0xb6

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Long"

    const-string v3, "(J)Ljava/lang/Long;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_f

    :cond_16
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v12, v2, :cond_17

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldFloat"

    const-string v2, "([C)F"

    const/16 v3, 0xb6

    const/16 v4, 0x38

    invoke-static {v10, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    goto/16 :goto_e

    :cond_17
    const-class v2, Ljava/lang/Float;

    if-ne v12, v2, :cond_18

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v4, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb4

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanFieldFloat"

    const-string v3, "([C)F"

    const/16 v4, 0xb6

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Float"

    const-string v3, "(F)Ljava/lang/Float;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_f

    :cond_18
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v12, v2, :cond_19

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldDouble"

    const-string v2, "([C)D"

    const/16 v3, 0xb6

    const/16 v4, 0x39

    invoke-static {v10, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v0

    :goto_e
    invoke-virtual {v10, v4, v0}, Lh/h;->k(II)V

    goto/16 :goto_13

    :cond_19
    const-class v2, Ljava/lang/Double;

    if-ne v12, v2, :cond_1a

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v4, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb4

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanFieldDouble"

    const-string v3, "([C)D"

    const/16 v4, 0xb6

    invoke-virtual {v10, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Double"

    const-string v3, "(D)Ljava/lang/Double;"

    invoke-static {v10, v8, v2, v1, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_f
    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v10, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v10, v1}, Lh/h;->f(Lh/f;)V

    goto/16 :goto_13

    :cond_1a
    const-class v1, Ljava/lang/String;

    if-ne v12, v1, :cond_1b

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldString"

    const-string v2, "([C)Ljava/lang/String;"

    :goto_10
    const/16 v3, 0xb6

    invoke-static {v10, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto/16 :goto_11

    :cond_1b
    const-class v1, Ljava/util/Date;

    if-ne v12, v1, :cond_1c

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldDate"

    const-string v2, "([C)Ljava/util/Date;"

    goto :goto_10

    :cond_1c
    const-class v1, Ljava/util/UUID;

    if-ne v12, v1, :cond_1d

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldUUID"

    const-string v2, "([C)Ljava/util/UUID;"

    goto :goto_10

    :cond_1d
    const-class v1, Ljava/math/BigDecimal;

    if-ne v12, v1, :cond_1e

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldDecimal"

    const-string v2, "([C)Ljava/math/BigDecimal;"

    goto/16 :goto_10

    :cond_1e
    const-class v1, Ljava/math/BigInteger;

    if-ne v12, v1, :cond_1f

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldBigInteger"

    const-string v2, "([C)Ljava/math/BigInteger;"

    goto/16 :goto_10

    :cond_1f
    const-class v1, [I

    if-ne v12, v1, :cond_20

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldIntArray"

    const-string v2, "([C)[I"

    goto/16 :goto_10

    :cond_20
    const-class v1, [F

    if-ne v12, v1, :cond_21

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldFloatArray"

    const-string v2, "([C)[F"

    goto/16 :goto_10

    :cond_21
    const-class v1, [[F

    if-ne v12, v1, :cond_22

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFieldFloatArray2"

    const-string v2, "([C)[[F"

    goto/16 :goto_10

    :goto_11
    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x3a

    :goto_12
    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    :goto_13
    move-object/from16 v8, p0

    goto/16 :goto_15

    :cond_22
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_23

    const/4 v0, 0x0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v8, p0

    invoke-virtual {v8, v9, v10, v11}, Lj/a;->i(Lj/a$a;Lh/h;Lm/c;)V

    const-class v0, Lj/n;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lj/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";[C"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v2, Lj/s;

    invoke-static {v2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")Ljava/lang/Enum;"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "scanEnum"

    const/16 v3, 0xb6

    invoke-virtual {v10, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xc0

    invoke-static {v12}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_14

    :cond_23
    move-object/from16 v8, p0

    const-class v1, Ljava/util/Collection;

    invoke-virtual {v1, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x0

    invoke-virtual {v10, v2, v1}, Lh/h;->k(II)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->b(Lj/a$a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v2, v4, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb4

    invoke-virtual {v10, v4, v1, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lm/j;->x(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v13

    const-class v0, Ljava/lang/String;

    if-ne v13, v0, :cond_25

    invoke-static {v12}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "([CLjava/lang/Class;)"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-static {v2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "scanFieldStringArray"

    const/16 v3, 0xb6

    invoke-virtual {v10, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_14
    iget-object v1, v11, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v6, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x3a

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    :goto_15
    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v2, 0xb4

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    const/16 v4, 0x9e

    invoke-virtual {v10, v4, v3}, Lh/h;->e(ILh/f;)V

    move/from16 v14, v23

    invoke-virtual {v8, v10, v9, v14}, Lj/a;->o(Lh/h;Lj/a$a;I)V

    invoke-virtual {v10, v3}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v10, v1, v3}, Lh/h;->k(II)V

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x59

    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    invoke-virtual {v9, v15}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x36

    invoke-virtual {v10, v4, v3}, Lh/h;->k(II)V

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v10, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0x9f

    move-object/from16 v4, v16

    invoke-virtual {v10, v3, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v10, v1, v3}, Lh/h;->k(II)V

    invoke-virtual {v10, v2, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x9e

    move-object/from16 v2, v22

    invoke-virtual {v10, v1, v2}, Lh/h;->e(ILh/f;)V

    const-string v1, "matchedCount"

    invoke-virtual {v9, v1}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x15

    invoke-virtual {v10, v3, v1}, Lh/h;->k(II)V

    const/4 v1, 0x4

    invoke-virtual {v10, v1}, Lh/h;->c(I)V

    const/16 v3, 0x60

    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    const-string v3, "matchedCount"

    invoke-virtual {v9, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v11, 0x36

    invoke-virtual {v10, v11, v3}, Lh/h;->k(II)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v11, 0x19

    invoke-virtual {v10, v11, v3}, Lh/h;->k(II)V

    const/16 v3, 0xb4

    invoke-virtual {v10, v3, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v1, 0x9f

    move-object/from16 v12, p1

    invoke-virtual {v10, v1, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v10, v2}, Lh/h;->f(Lh/f;)V

    add-int/lit8 v1, v21, -0x1

    if-ne v14, v1, :cond_24

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v10, v11, v1}, Lh/h;->k(II)V

    invoke-virtual {v10, v3, v0, v15, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v10, v0, v4}, Lh/h;->e(ILh/f;)V

    :cond_24
    move-object/from16 v22, v5

    move-object/from16 v23, v6

    move-object v13, v7

    move-object/from16 v16, v12

    move-object/from16 p1, v15

    move-object v15, v4

    goto :goto_17

    :cond_25
    move-object/from16 v3, p1

    move-object/from16 v4, v16

    move/from16 v14, v23

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object v2, v10

    move-object/from16 p1, v15

    move-object v15, v3

    move-object v3, v4

    move-object/from16 v16, v15

    move-object v15, v4

    move-object v4, v11

    move-object/from16 v22, v5

    move-object v5, v12

    move-object/from16 v23, v6

    move-object v6, v13

    move-object v13, v7

    move v7, v14

    invoke-virtual/range {v0 .. v7}, Lj/a;->f(Lj/a$a;Lh/h;Lh/f;Lm/c;Ljava/lang/Class;Ljava/lang/Class;I)V

    add-int/lit8 v4, v21, -0x1

    if-ne v14, v4, :cond_27

    goto :goto_16

    :cond_26
    move-object/from16 v22, v5

    move-object v13, v7

    move/from16 v14, v23

    move-object/from16 v23, v6

    move-object/from16 v25, v16

    move-object/from16 v16, p1

    move-object/from16 p1, v15

    move-object/from16 v15, v25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v5, v14

    invoke-virtual/range {v0 .. v5}, Lj/a;->g(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;I)V

    add-int/lit8 v4, v21, -0x1

    if-ne v14, v4, :cond_27

    :goto_16
    invoke-virtual {v8, v9, v10, v15}, Lj/a;->d(Lj/a$a;Lh/h;Lh/f;)V

    :cond_27
    :goto_17
    add-int/lit8 v0, v14, 0x1

    move v8, v0

    move-object v7, v13

    move/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v25, v15

    move-object/from16 v15, p1

    move-object/from16 p1, v16

    move-object/from16 v16, v25

    goto/16 :goto_a

    :cond_28
    move-object/from16 v8, p0

    move/from16 v21, v4

    move-object/from16 v15, v16

    move-object/from16 v16, p1

    const/4 v0, 0x1

    const/16 v1, 0x19

    move-object/from16 v2, v16

    invoke-virtual {v10, v2}, Lh/h;->f(Lh/f;)V

    iget-object v2, v9, Lj/a$a;->c:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    move-result v2

    if-nez v2, :cond_29

    iget-object v2, v9, Lj/a$a;->c:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v2

    if-nez v2, :cond_29

    invoke-virtual {v8, v9, v10, v0}, Lj/a;->a(Lj/a$a;Lh/h;Z)V

    :cond_29
    move-object/from16 v2, v19

    invoke-virtual {v10, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v9, v10}, Lj/a;->n(Lj/a$a;Lh/h;)V

    const-string v2, "instance"

    invoke-virtual {v9, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    iget-object v2, v9, Lj/a$a;->d:Lm/g;

    iget-object v2, v2, Lm/g;->f:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_2a

    invoke-virtual/range {p2 .. p2}, Lj/a$a;->d()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v18 .. v18}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0xb6

    invoke-virtual {v10, v5, v3, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2a
    const/16 v2, 0xb0

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    invoke-virtual {v10, v15}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v9, v10, v0}, Lj/a;->a(Lj/a$a;Lh/h;Z)V

    const/4 v2, 0x0

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v2, 0x2

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    const/4 v2, 0x3

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    const-string v2, "instance"

    invoke-virtual {v9, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    const/4 v2, 0x4

    const/16 v3, 0x15

    invoke-virtual {v10, v3, v2}, Lh/h;->k(II)V

    div-int/lit8 v4, v21, 0x20

    if-eqz v21, :cond_2b

    rem-int/lit8 v2, v21, 0x20

    if-eqz v2, :cond_2b

    add-int/lit8 v4, v4, 0x1

    :cond_2b
    if-ne v4, v0, :cond_2c

    const/4 v2, 0x4

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    goto :goto_18

    :cond_2c
    const/16 v2, 0x10

    invoke-virtual {v10, v2, v4}, Lh/h;->d(II)V

    :goto_18
    const/16 v2, 0xbc

    const/16 v3, 0xa

    invoke-virtual {v10, v2, v3}, Lh/h;->d(II)V

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v4, :cond_2f

    const/16 v3, 0x59

    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    if-nez v2, :cond_2d

    const/4 v3, 0x3

    goto :goto_1a

    :cond_2d
    if-ne v2, v0, :cond_2e

    const/4 v3, 0x4

    :goto_1a
    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    goto :goto_1b

    :cond_2e
    const/16 v3, 0x10

    invoke-virtual {v10, v3, v2}, Lh/h;->d(II)V

    :goto_1b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "_asm_flag_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x15

    invoke-virtual {v10, v5, v3}, Lh/h;->k(II)V

    const/16 v3, 0x4f

    invoke-virtual {v10, v3}, Lh/h;->c(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    :cond_2f
    const-class v2, Lj/n;

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {v20 .. v20}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lj/a;->c:Ljava/lang/String;

    const-string v5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;"

    invoke-static {v3, v4, v5}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "parseRest"

    const/16 v6, 0xb6

    invoke-virtual {v10, v6, v2, v5, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xc0

    invoke-static/range {p2 .. p2}, Lj/a$a;->c(Lj/a$a;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v2, v3}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v2, 0xb0

    invoke-virtual {v10, v2}, Lh/h;->c(I)V

    move-object/from16 v2, v17

    invoke-virtual {v10, v2}, Lh/h;->f(Lh/f;)V

    const/4 v2, 0x0

    invoke-virtual {v10, v1, v2}, Lh/h;->k(II)V

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x3

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x4

    const/16 v1, 0x15

    invoke-virtual {v10, v1, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb7

    const-class v1, Lj/n;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    move-object/from16 v3, v20

    invoke-static {v3, v4, v2}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "deserialze"

    invoke-virtual {v10, v0, v1, v3, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb0

    invoke-virtual {v10, v0}, Lh/h;->c(I)V

    invoke-static/range {p2 .. p2}, Lj/a$a;->a(Lj/a$a;)I

    move-result v0

    invoke-virtual {v10, v0}, Lh/h;->h(I)V

    return-void
.end method

.method public final f(Lj/a$a;Lh/h;Lh/f;Lm/c;Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/a$a;",
            "Lh/h;",
            "Lh/f;",
            "Lm/c;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    const-class v8, Li/h;

    const-class v9, Lj/s;

    new-instance v10, Lh/f;

    invoke-direct {v10}, Lh/f;-><init>()V

    sget-object v11, Lj/a;->d:Ljava/lang/String;

    const/16 v12, 0xb6

    const-string v13, "matchField"

    const-string v14, "([C)Z"

    invoke-virtual {v2, v12, v11, v13, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v12, 0x99

    invoke-virtual {v2, v12, v10}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v2, v1, v7}, Lj/a;->o(Lh/h;Lj/a$a;I)V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    const-string v13, "lexer"

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v14

    const/16 v15, 0x19

    invoke-virtual {v2, v15, v14}, Lh/h;->k(II)V

    const-string v14, "token"

    const-string v15, "()I"

    move-object/from16 v16, v8

    const/16 v8, 0xb6

    invoke-virtual {v2, v8, v11, v14, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0x8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v8, 0xa0

    invoke-virtual {v2, v8, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v8

    move-object/from16 v17, v9

    const/16 v9, 0x19

    invoke-virtual {v2, v9, v8}, Lh/h;->k(II)V

    const/16 v8, 0x10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v2, v8}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v9, "nextToken"

    move-object/from16 v18, v8

    const-string v8, "(I)V"

    const/16 v6, 0xb6

    invoke-virtual {v2, v6, v11, v9, v8}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xa7

    invoke-virtual {v2, v6, v10}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v2, v12}, Lh/h;->f(Lh/f;)V

    new-instance v6, Lh/f;

    invoke-direct {v6}, Lh/f;-><init>()V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    move-object/from16 v19, v10

    new-instance v10, Lh/f;

    invoke-direct {v10}, Lh/f;-><init>()V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v3, 0x19

    invoke-virtual {v2, v3, v4}, Lh/h;->k(II)V

    const/16 v3, 0xb6

    invoke-virtual {v2, v3, v11, v14, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    invoke-virtual {v2, v3, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v2, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0xe

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v4, 0xb6

    invoke-virtual {v2, v4, v11, v9, v8}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-virtual {v0, v2, v5, v7, v4}, Lj/a;->j(Lh/h;Ljava/lang/Class;IZ)V

    const/16 v4, 0xa7

    invoke-virtual {v2, v4, v6}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v2, v12}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x19

    invoke-virtual {v2, v12, v4}, Lh/h;->k(II)V

    const/16 v4, 0xb6

    invoke-virtual {v2, v4, v11, v14, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0x9f

    invoke-virtual {v2, v3, v10}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v12, v3}, Lh/h;->k(II)V

    invoke-virtual {v2, v4, v11, v14, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xc

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v4, 0xa0

    move-object/from16 v12, p3

    invoke-virtual {v2, v4, v12}, Lh/h;->e(ILh/f;)V

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v5, v7, v4}, Lj/a;->j(Lh/h;Ljava/lang/Class;IZ)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v12, p4

    move-object/from16 v20, v14

    iget-object v14, v12, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v21, v3

    const-string v3, "_asm"

    invoke-static {v4, v14, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v4

    const/16 v14, 0x3a

    invoke-virtual {v2, v14, v4}, Lh/h;->k(II)V

    move-object/from16 v4, p6

    invoke-virtual {v0, v1, v2, v12, v4}, Lj/a;->h(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V

    const/4 v14, 0x1

    move-object/from16 v22, v8

    const/16 v8, 0x19

    invoke-virtual {v2, v8, v14}, Lh/h;->k(II)V

    invoke-static/range {p6 .. p6}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v8

    invoke-virtual {v2, v8}, Lh/h;->g(Ljava/lang/Object;)V

    const/4 v8, 0x3

    invoke-virtual {v2, v8}, Lh/h;->c(I)V

    const/16 v8, 0xb8

    const-string v14, "java/lang/Integer"

    move-object/from16 v23, v9

    const-string v9, "valueOf"

    move-object/from16 v24, v11

    const-string v11, "(I)Ljava/lang/Integer;"

    invoke-virtual {v2, v8, v14, v9, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v17 .. v17}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    const-string v25, "(L"

    move-object/from16 v26, v9

    invoke-static/range {v25 .. v25}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    move-object/from16 v25, v11

    sget-object v11, Lj/a;->c:Ljava/lang/String;

    move-object/from16 v27, v14

    const-string v14, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-static {v9, v11, v14}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v14, 0xb9

    move-object/from16 v28, v11

    const-string v11, "deserialze"

    invoke-virtual {v2, v14, v8, v11, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "list_item_value"

    invoke-virtual {v1, v8}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v9

    const/16 v11, 0x3a

    invoke-virtual {v2, v11, v9}, Lh/h;->k(II)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v12, Lm/c;->b:Ljava/lang/String;

    invoke-static {v9, v11, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v9

    const/16 v11, 0x19

    invoke-virtual {v2, v11, v9}, Lh/h;->k(II)V

    invoke-virtual {v1, v8}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v2, v11, v9}, Lh/h;->k(II)V

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Class;->isInterface()Z

    move-result v9

    const-string v11, "(Ljava/lang/Object;)Z"

    const-string v14, "add"

    if-eqz v9, :cond_0

    invoke-static/range {p5 .. p5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v29, v8

    const/16 v8, 0xb9

    invoke-virtual {v2, v8, v9, v14, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object/from16 v29, v8

    invoke-static/range {p5 .. p5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xb6

    invoke-virtual {v2, v9, v8, v14, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/16 v8, 0x57

    invoke-virtual {v2, v8}, Lh/h;->c(I)V

    const/16 v8, 0xa7

    move-object/from16 v9, v19

    invoke-virtual {v2, v8, v9}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v2, v10}, Lh/h;->f(Lh/f;)V

    const/4 v8, 0x0

    invoke-virtual {v0, v2, v5, v7, v8}, Lj/a;->j(Lh/h;Ljava/lang/Class;IZ)V

    invoke-virtual {v2, v6}, Lh/h;->f(Lh/f;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v12, Lm/c;->b:Ljava/lang/String;

    invoke-static {v6, v7, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-virtual {v2, v7, v6}, Lh/h;->k(II)V

    iget-object v6, v12, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v6}, Li/i;->e(Ljava/lang/Class;)Z

    move-result v6

    invoke-virtual {v0, v1, v2, v12, v4}, Lj/a;->h(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V

    const-string v7, "fastMatchToken"

    if-eqz v6, :cond_1

    invoke-static/range {v17 .. v17}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "getFastMatchToken"

    const/16 v4, 0xb9

    invoke-virtual {v2, v4, v8, v10, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v8, 0x36

    invoke-virtual {v2, v8, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v8, 0x19

    invoke-virtual {v2, v8, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v8, 0x15

    invoke-virtual {v2, v8, v4}, Lh/h;->k(II)V

    const/16 v4, 0xb6

    move-object/from16 v5, v22

    move-object/from16 v10, v23

    move-object/from16 v8, v24

    invoke-virtual {v2, v4, v8, v10, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v19, v9

    goto :goto_1

    :cond_1
    move-object/from16 v5, v22

    move-object/from16 v10, v23

    move-object/from16 v8, v24

    const/16 v4, 0x57

    invoke-virtual {v2, v4}, Lh/h;->c(I)V

    move-object/from16 v4, v21

    invoke-virtual {v2, v4}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v19, v9

    const/16 v9, 0x36

    invoke-virtual {v2, v9, v4}, Lh/h;->k(II)V

    const/16 v4, 0xc

    invoke-virtual {v0, v1, v2, v4}, Lj/a;->k(Lj/a$a;Lh/h;I)V

    :goto_1
    const/4 v4, 0x1

    const/16 v9, 0x19

    invoke-virtual {v2, v9, v4}, Lh/h;->k(II)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "()"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v9, "getContext"

    const/16 v0, 0xb6

    move-object/from16 v22, v5

    move-object/from16 v5, v28

    invoke-virtual {v2, v0, v5, v9, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "listContext"

    invoke-virtual {v1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v4, 0x3a

    invoke-virtual {v2, v4, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    const/16 v4, 0x19

    invoke-virtual {v2, v4, v0}, Lh/h;->k(II)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v12, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v9, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    invoke-virtual {v2, v4, v0}, Lh/h;->k(II)V

    iget-object v0, v12, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "(Ljava/lang/Object;Ljava/lang/Object;)"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "setContext"

    const/16 v9, 0xb6

    invoke-virtual {v2, v9, v5, v4, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x57

    invoke-virtual {v2, v0}, Lh/h;->c(I)V

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    const/4 v9, 0x3

    invoke-virtual {v2, v9}, Lh/h;->c(I)V

    const-string v9, "i"

    move-object/from16 v23, v10

    invoke-virtual {v1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    move-object/from16 p7, v7

    const/16 v7, 0x36

    invoke-virtual {v2, v7, v10}, Lh/h;->k(II)V

    invoke-virtual {v2, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v7

    const/16 v10, 0x19

    invoke-virtual {v2, v10, v7}, Lh/h;->k(II)V

    const/16 v7, 0xb6

    move-object/from16 v10, v20

    invoke-virtual {v2, v7, v8, v10, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0xf

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v7, 0x9f

    invoke-virtual {v2, v7, v4}, Lh/h;->e(ILh/f;)V

    const/4 v7, 0x0

    move-object/from16 v20, v4

    const/16 v4, 0x19

    invoke-virtual {v2, v4, v7}, Lh/h;->k(II)V

    iget-object v4, v1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v21, v6

    iget-object v6, v12, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v24, v0

    const-string v0, "_asm_list_item_deser__"

    invoke-static {v7, v6, v0}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-virtual {v2, v7, v4, v0, v6}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/16 v4, 0x19

    invoke-virtual {v2, v4, v0}, Lh/h;->k(II)V

    invoke-static/range {p6 .. p6}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v2, v0}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v4, 0x15

    invoke-virtual {v2, v4, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb8

    move-object/from16 v7, v25

    move-object/from16 v6, v26

    move-object/from16 v4, v27

    invoke-virtual {v2, v0, v4, v6, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v17 .. v17}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "(L"

    const-string v6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-static {v4, v5, v6}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "deserialze"

    const/16 v7, 0xb9

    invoke-virtual {v2, v7, v0, v6, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v29

    invoke-virtual {v1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v6, 0x3a

    invoke-virtual {v2, v6, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v9}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Lh/h;->b(I)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v12, Lm/c;->b:Ljava/lang/String;

    invoke-static {v4, v6, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v4

    const/16 v6, 0x19

    invoke-virtual {v2, v6, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static/range {p5 .. p5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-static/range {p5 .. p5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const/16 v7, 0xb6

    :goto_2
    invoke-virtual {v2, v7, v0, v14, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x57

    invoke-virtual {v2, v0}, Lh/h;->c(I)V

    const/4 v0, 0x1

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v12, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v4, v3, v1}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    const-string v0, "checkListResolve"

    const-string v3, "(Ljava/util/Collection;)V"

    const/16 v4, 0xb6

    invoke-virtual {v2, v4, v5, v0, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    invoke-virtual {v2, v4, v8, v10, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    move-object/from16 v3, v24

    invoke-virtual {v2, v0, v3}, Lh/h;->e(ILh/f;)V

    if-eqz v21, :cond_3

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    move-object/from16 v0, p7

    invoke-virtual {v1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v7, 0x15

    invoke-virtual {v2, v7, v0}, Lh/h;->k(II)V

    move-object/from16 v7, v22

    move-object/from16 v0, v23

    invoke-virtual {v2, v4, v8, v0, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa7

    move-object/from16 v4, p0

    goto :goto_3

    :cond_3
    const/16 v0, 0xc

    move-object/from16 v4, p0

    invoke-virtual {v4, v1, v2, v0}, Lj/a;->k(Lj/a$a;Lh/h;I)V

    const/16 v0, 0xa7

    :goto_3
    invoke-virtual {v2, v0, v3}, Lh/h;->e(ILh/f;)V

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Lh/h;->f(Lh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    const-string v0, "listContext"

    invoke-virtual {v1, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lh/h;->k(II)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")V"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "setContext"

    const/16 v6, 0xb6

    invoke-virtual {v2, v6, v5, v3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v3, 0x19

    invoke-virtual {v2, v3, v0}, Lh/h;->k(II)V

    invoke-virtual {v2, v6, v8, v10, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    move-object/from16 v3, p3

    invoke-virtual {v2, v0, v3}, Lh/h;->e(ILh/f;)V

    invoke-virtual/range {p0 .. p2}, Lj/a;->l(Lj/a$a;Lh/h;)V

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final g(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/a$a;",
            "Lh/h;",
            "Lh/f;",
            "Lm/c;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-class v3, Lj/k;

    const-class v4, Li/h;

    const-class v5, Li/a$a;

    new-instance v6, Lh/f;

    invoke-direct {v6}, Lh/f;-><init>()V

    new-instance v7, Lh/f;

    invoke-direct {v7}, Lh/f;-><init>()V

    const-string v8, "lexer"

    invoke-virtual {v0, v8}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v8

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    const/4 v8, 0x0

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    iget-object v8, v0, Lj/a$a;->e:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v2, Lm/c;->b:Ljava/lang/String;

    const-string v12, "_asm_prefix__"

    invoke-static {v10, v11, v12}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0xb4

    const-string v12, "[C"

    invoke-virtual {v1, v11, v8, v10, v12}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v8, Lj/a;->d:Ljava/lang/String;

    const/16 v10, 0xb6

    const-string v11, "matchField"

    const-string v12, "([C)Z"

    invoke-virtual {v1, v10, v8, v11, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0x9a

    invoke-virtual {v1, v8, v6}, Lh/h;->e(ILh/f;)V

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Lh/h;->c(I)V

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v2, Lm/c;->b:Ljava/lang/String;

    const-string v13, "_asm"

    invoke-static {v11, v12, v13, v0}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v11

    const/16 v12, 0x3a

    invoke-virtual {v1, v12, v11}, Lh/h;->k(II)V

    const/16 v11, 0xa7

    invoke-virtual {v1, v11, v7}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v6}, Lh/h;->f(Lh/f;)V

    move-object/from16 v6, p0

    move/from16 v11, p5

    invoke-virtual {v6, v1, v0, v11}, Lj/a;->o(Lh/h;Lj/a$a;I)V

    const-string v13, "matchedCount"

    invoke-virtual {v0, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v14

    const/16 v15, 0x15

    invoke-virtual {v1, v15, v14}, Lh/h;->k(II)V

    const/4 v14, 0x4

    invoke-virtual {v1, v14}, Lh/h;->c(I)V

    const/16 v14, 0x60

    invoke-virtual {v1, v14}, Lh/h;->c(I)V

    invoke-virtual {v0, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x36

    invoke-virtual {v1, v14, v13}, Lh/h;->k(II)V

    invoke-virtual/range {p0 .. p5}, Lj/a;->c(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;I)V

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    sget-object v11, Lj/a;->c:Ljava/lang/String;

    const-string v13, "getResolveStatus"

    const-string v14, "()I"

    invoke-virtual {v1, v10, v11, v13, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v1, v13}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v13, 0xa0

    invoke-virtual {v1, v13, v7}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "()"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v15, "getLastResolveTask"

    invoke-virtual {v1, v10, v11, v15, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v13, "resolveTask"

    invoke-virtual {v0, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v1, v12, v15}, Lh/h;->k(II)V

    invoke-virtual {v0, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v1, v9, v12}, Lh/h;->k(II)V

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v14, "getContext"

    invoke-virtual {v1, v10, v11, v14, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    const/16 v14, 0xb5

    const-string v15, "ownerContext"

    invoke-virtual {v1, v14, v12, v15, v4}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v9, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v1, v9, v0}, Lh/h;->k(II)V

    iget-object v0, v2, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const-class v0, Lj/n;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "(Ljava/lang/String;)"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "getFieldDeserializer"

    invoke-virtual {v1, v10, v0, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "fieldDeserializer"

    invoke-virtual {v1, v14, v0, v3, v2}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v0, "setResolveStatus"

    const-string v2, "(I)V"

    invoke-virtual {v1, v10, v11, v0, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final h(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/a$a;",
            "Lh/h;",
            "Lm/c;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-class v0, Li/i;

    const-class v1, Lj/s;

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const/16 v3, 0x19

    const/4 v4, 0x0

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    iget-object v5, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p3, Lm/c;->b:Ljava/lang/String;

    const-string v8, "_asm_list_item_deser__"

    invoke-static {v6, v7, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0xb4

    invoke-virtual {p2, v9, v5, v6, v7}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xc7

    invoke-virtual {p2, v5, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    const/4 v5, 0x1

    invoke-virtual {p2, v3, v5}, Lh/h;->k(II)V

    sget-object v5, Lj/a;->c:Ljava/lang/String;

    const-string v6, "()"

    invoke-static {v6}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb6

    const-string v10, "getConfig"

    invoke-virtual {p2, v7, v5, v10, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object p4

    invoke-virtual {p2, p4}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    const-string v0, "(Ljava/lang/reflect/Type;)"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "getDeserializer"

    invoke-virtual {p2, v7, p4, v5, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v5, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0xb5

    invoke-virtual {p2, v6, p4, v0, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    iget-object p1, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {p4, p3, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, v9, p1, p3, p4}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Lj/a$a;Lh/h;Lm/c;)V
    .locals 11

    const-class v0, Li/i;

    const-class v1, Lj/s;

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const/16 v3, 0x19

    const/4 v4, 0x0

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    iget-object v5, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p3, Lm/c;->b:Ljava/lang/String;

    const-string v8, "_asm_deser__"

    invoke-static {v6, v7, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0xb4

    invoke-virtual {p2, v9, v5, v6, v7}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xc7

    invoke-virtual {p2, v5, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    const/4 v5, 0x1

    invoke-virtual {p2, v3, v5}, Lh/h;->k(II)V

    sget-object v5, Lj/a;->c:Ljava/lang/String;

    const-string v6, "()"

    invoke-static {v6}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb6

    const-string v10, "getConfig"

    invoke-virtual {p2, v7, v5, v10, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p3, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v5}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v5

    invoke-virtual {p2, v5}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "(Ljava/lang/reflect/Type;)"

    invoke-static {v5}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getDeserializer"

    invoke-virtual {p2, v7, v0, v6, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v5, v6, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb5

    invoke-virtual {p2, v7, v0, v5, v6}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p2, v3, v4}, Lh/h;->k(II)V

    iget-object p1, p1, Lj/a$a;->e:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, p3, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v9, p1, p3, v0}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final j(Lh/h;Ljava/lang/Class;IZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh/h;",
            "Ljava/lang/Class<",
            "*>;IZ)V"
        }
    .end annotation

    const-class v0, Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const/16 v1, 0x59

    const/16 v2, 0xbb

    if-eqz v0, :cond_0

    if-nez p4, :cond_0

    const-string p3, "java/util/ArrayList"

    invoke-virtual {p1, v2, p3}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Lh/h;->c(I)V

    goto :goto_2

    :cond_0
    const-class v0, Ljava/util/LinkedList;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p4, :cond_1

    const-class p3, Ljava/util/LinkedList;

    invoke-static {p3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v2, p3}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Lh/h;->c(I)V

    const-class p3, Ljava/util/LinkedList;

    goto :goto_1

    :cond_1
    const-class v0, Ljava/util/HashSet;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const-class v0, Ljava/util/TreeSet;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-class p3, Ljava/util/TreeSet;

    invoke-static {p3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v2, p3}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Lh/h;->c(I)V

    const-class p3, Ljava/util/TreeSet;

    goto :goto_1

    :cond_3
    const-class v0, Ljava/util/LinkedHashSet;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-class p3, Ljava/util/LinkedHashSet;

    invoke-static {p3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v2, p3}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Lh/h;->c(I)V

    const-class p3, Ljava/util/LinkedHashSet;

    goto :goto_1

    :cond_4
    if-eqz p4, :cond_5

    :goto_0
    const-class p3, Ljava/util/HashSet;

    invoke-static {p3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, v2, p3}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Lh/h;->c(I)V

    const-class p3, Ljava/util/HashSet;

    :goto_1
    invoke-static {p3}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    :goto_2
    const/16 p4, 0xb7

    const-string v0, "<init>"

    const-string v1, "()V"

    invoke-virtual {p1, p4, p3, v0, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    const/16 p4, 0x19

    const/4 v0, 0x0

    invoke-virtual {p1, p4, v0}, Lh/h;->k(II)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 p3, 0xb6

    const-class p4, Lj/n;

    invoke-static {p4}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    const-string v0, "getFieldType"

    const-string v1, "(I)Ljava/lang/reflect/Type;"

    invoke-virtual {p1, p3, p4, v0, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p3, 0xb8

    const-class p4, Lm/j;

    invoke-static {p4}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    const-string v0, "createCollection"

    const-string v1, "(Ljava/lang/reflect/Type;)Ljava/util/Collection;"

    invoke-virtual {p1, p3, p4, v0, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    const/16 p3, 0xc0

    invoke-static {p2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lh/h;->j(ILjava/lang/String;)V

    return-void
.end method

.method public final k(Lj/a$a;Lh/h;I)V
    .locals 9

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    const-string v2, "lexer"

    invoke-virtual {p1, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {p2, v4, v3}, Lh/h;->k(II)V

    sget-object v3, Lj/a;->d:Ljava/lang/String;

    const/16 v5, 0xb6

    const-string v6, "getCurrent"

    const-string v7, "()C"

    invoke-virtual {p2, v5, v3, v6, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xc

    if-ne p3, v6, :cond_0

    const/16 v6, 0x7b

    goto :goto_0

    :cond_0
    const/16 v6, 0xe

    if-ne p3, v6, :cond_1

    const/16 v6, 0x5b

    :goto_0
    const/16 v8, 0x10

    invoke-virtual {p2, v8, v6}, Lh/h;->k(II)V

    const/16 v6, 0xa0

    invoke-virtual {p2, v6, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p1, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {p2, v4, v6}, Lh/h;->k(II)V

    const-string v6, "next"

    invoke-virtual {p2, v5, v3, v6, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x57

    invoke-virtual {p2, v6}, Lh/h;->c(I)V

    invoke-virtual {p1, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {p2, v4, v6}, Lh/h;->k(II)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p2, v6}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v6, "(I)V"

    const-string v7, "setToken"

    invoke-virtual {p2, v5, v3, v7, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0xa7

    invoke-virtual {p2, v7, v1}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p2, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p1, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, v4, p1}, Lh/h;->k(II)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lh/h;->g(Ljava/lang/Object;)V

    const-string p1, "nextToken"

    invoke-virtual {p2, v5, v3, p1, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lh/h;->f(Lh/f;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final l(Lj/a$a;Lh/h;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    new-instance v6, Lh/f;

    invoke-direct {v6}, Lh/f;-><init>()V

    const-string v7, "lexer"

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v8

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    sget-object v8, Lj/a;->d:Ljava/lang/String;

    const/16 v10, 0xb6

    const-string v11, "getCurrent"

    const-string v12, "()C"

    invoke-virtual {v1, v10, v8, v11, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0x59

    invoke-virtual {v1, v11}, Lh/h;->c(I)V

    const-string v11, "ch"

    invoke-virtual {v0, v11}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x36

    invoke-virtual {v1, v14, v13}, Lh/h;->k(II)V

    const/16 v13, 0x10

    const/16 v14, 0x2c

    invoke-virtual {v1, v13, v14}, Lh/h;->k(II)V

    const/16 v14, 0xa0

    invoke-virtual {v1, v14, v3}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v1, v9, v15}, Lh/h;->k(II)V

    const-string v15, "next"

    invoke-virtual {v1, v10, v8, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v14, 0x57

    invoke-virtual {v1, v14}, Lh/h;->c(I)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v1, v9, v14}, Lh/h;->k(II)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v1, v14}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v14, "setToken"

    const-string v9, "(I)V"

    invoke-virtual {v1, v10, v8, v14, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0xa7

    invoke-virtual {v1, v10, v6}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v3}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v0, v11}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v10, 0x15

    invoke-virtual {v1, v10, v3}, Lh/h;->k(II)V

    const/16 v3, 0x7d

    invoke-virtual {v1, v13, v3}, Lh/h;->k(II)V

    const/16 v3, 0xa0

    invoke-virtual {v1, v3, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-virtual {v1, v13, v3}, Lh/h;->k(II)V

    const/16 v3, 0xb6

    invoke-virtual {v1, v3, v8, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x57

    invoke-virtual {v1, v10}, Lh/h;->c(I)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v1, v13, v10}, Lh/h;->k(II)V

    const/16 v10, 0xd

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1, v10}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v8, v14, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0xa7

    invoke-virtual {v1, v10, v6}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v4}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v0, v11}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v10, 0x15

    invoke-virtual {v1, v10, v4}, Lh/h;->k(II)V

    const/16 v4, 0x5d

    const/16 v10, 0x10

    invoke-virtual {v1, v10, v4}, Lh/h;->k(II)V

    const/16 v4, 0xa0

    invoke-virtual {v1, v4, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    const/16 v10, 0x19

    invoke-virtual {v1, v10, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v3, v8, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x57

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v10, v4}, Lh/h;->k(II)V

    const/16 v4, 0xf

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3, v8, v14, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xa7

    invoke-virtual {v1, v3, v6}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v5}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v0, v11}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x15

    invoke-virtual {v1, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0x1a

    const/16 v4, 0x10

    invoke-virtual {v1, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0xa0

    invoke-virtual {v1, v3, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v1, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xb6

    invoke-virtual {v1, v3, v8, v14, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xa7

    invoke-virtual {v1, v5, v6}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v0, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    const-string v0, "nextToken"

    const-string v2, "()V"

    invoke-virtual {v1, v3, v8, v0, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final m(Lh/h;Lm/c;)V
    .locals 4

    iget-object v0, p2, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xb9

    goto :goto_0

    :cond_0
    const/16 v1, 0xb6

    :goto_0
    iget-object v2, p2, Lm/c;->h:Ljava/lang/Class;

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lm/b;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v2, v3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p2, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    const/16 p2, 0x57

    invoke-virtual {p1, p2}, Lh/h;->c(I)V

    goto :goto_1

    :cond_1
    const/16 v0, 0xb5

    iget-object v1, p2, Lm/c;->h:Ljava/lang/Class;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p2, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object p2, p2, Lm/c;->f:Ljava/lang/Class;

    invoke-static {p2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, v1, v2, p2}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final n(Lj/a$a;Lh/h;)V
    .locals 6

    const-class v0, Li/h;

    const/16 v1, 0x19

    const/4 v2, 0x1

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    const-string v2, "context"

    invoke-virtual {p1, v2}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    sget-object v2, Lj/a;->c:Ljava/lang/String;

    const-string v3, "("

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")V"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb6

    const-string v5, "setContext"

    invoke-virtual {p2, v4, v2, v5, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const-string v3, "childContext"

    invoke-virtual {p1, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p2, v1, v4}, Lh/h;->k(II)V

    const/16 v4, 0xc6

    invoke-virtual {p2, v4, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p1, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p2, v1, v3}, Lh/h;->k(II)V

    const-string v3, "instance"

    invoke-virtual {p1, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p2, v1, p1}, Lh/h;->k(II)V

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xb5

    const-string v1, "object"

    const-string v3, "Ljava/lang/Object;"

    invoke-virtual {p2, v0, p1, v1, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final o(Lh/h;Lj/a$a;I)V
    .locals 3

    const-string v0, "_asm_flag_"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    div-int/lit8 v1, p3, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x15

    invoke-virtual {p1, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    shl-int p3, v1, p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 p3, 0x80

    invoke-virtual {p1, p3}, Lh/h;->c(I)V

    invoke-virtual {p2, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result p2

    const/16 p3, 0x36

    invoke-virtual {p1, p3, p2}, Lh/h;->k(II)V

    return-void
.end method

.method public final p(Li/i;Lm/g;)Lj/s;
    .locals 31

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    const-class v8, Lj/n;

    iget-object v0, v7, Lm/g;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_25

    const-string v1, "FastjsonASMDeserializer_"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v6, Lj/a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lj/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    invoke-static {v1, v3, v0}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lh/c;

    invoke-direct {v10}, Lh/c;-><init>()V

    invoke-static {v8}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v10, v2, v0, v1}, Lh/c;->g(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v0, v7, Lm/g;->h:[Lm/c;

    const-class v1, Lj/s;

    const-class v3, Lm/g;

    const-class v4, Li/i;

    array-length v5, v0

    const/4 v11, 0x0

    :goto_0
    const-string v12, "[C"

    const-string v13, "_asm_prefix__"

    if-ge v11, v5, :cond_0

    aget-object v14, v0, v11

    new-instance v15, Lh/d;

    move/from16 v16, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v14, v14, Lm/c;->b:Ljava/lang/String;

    invoke-static {v5, v14, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v15, v10, v5, v12}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v5, v16

    goto :goto_0

    :cond_0
    array-length v5, v0

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v5, :cond_3

    aget-object v14, v0, v11

    iget-object v15, v14, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    move-result v16

    if-eqz v16, :cond_1

    move/from16 v16, v5

    move-object/from16 v17, v9

    goto :goto_2

    :cond_1
    move/from16 v16, v5

    const-class v5, Ljava/util/Collection;

    invoke-virtual {v5, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, Lh/d;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v14, v14, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v17, v9

    const-string v9, "_asm_list_item_deser__"

    invoke-static {v15, v14, v9}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v5, v10, v9, v14}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object/from16 v17, v9

    new-instance v5, Lh/d;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v14, v14, Lm/c;->b:Ljava/lang/String;

    const-string v15, "_asm_deser__"

    invoke-static {v9, v14, v15}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v5, v10, v9, v14}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    add-int/lit8 v11, v11, 0x1

    move/from16 v5, v16

    move-object/from16 v9, v17

    goto :goto_1

    :cond_3
    move-object/from16 v17, v9

    new-instance v1, Lh/h;

    const-string v5, "("

    invoke-static {v5}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ")V"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v14, "<init>"

    const/4 v15, 0x0

    invoke-direct {v1, v10, v14, v9, v15}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v9, 0x19

    const/4 v15, 0x0

    invoke-virtual {v1, v9, v15}, Lh/h;->k(II)V

    const/4 v15, 0x1

    invoke-virtual {v1, v9, v15}, Lh/h;->k(II)V

    const/4 v15, 0x2

    invoke-virtual {v1, v9, v15}, Lh/h;->k(II)V

    invoke-static {v8}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v5}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb7

    invoke-virtual {v1, v4, v9, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    array-length v3, v0

    const/4 v4, 0x0

    :goto_3
    const/16 v5, 0xb6

    if-ge v4, v3, :cond_4

    aget-object v9, v0, v4

    const/16 v11, 0x19

    const/4 v15, 0x0

    invoke-virtual {v1, v11, v15}, Lh/h;->k(II)V

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\""

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v9, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "\":"

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v11, "java/lang/String"

    const-string v15, "toCharArray"

    move-object/from16 v16, v0

    const-string v0, "()[C"

    move/from16 v18, v3

    const/16 v3, 0xb5

    invoke-static {v1, v5, v11, v15, v0}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v5, v9, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v5, v13}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v2, v0, v12}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v16

    move/from16 v3, v18

    goto :goto_3

    :cond_4
    const/16 v0, 0xb1

    invoke-virtual {v1, v0}, Lh/h;->c(I)V

    const/4 v0, 0x4

    iput v0, v1, Lh/h;->h:I

    iput v0, v1, Lh/h;->i:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v0, v7, Lm/g;->a:Ljava/lang/Class;

    iget-object v1, v7, Lm/g;->c:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    const/16 v3, 0x59

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v1, Lh/h;

    const-string v4, "(L"

    invoke-static {v4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lj/a;->c:Ljava/lang/String;

    const-string v9, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-static {v4, v5, v9}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "createInstance"

    const/4 v9, 0x0

    invoke-direct {v1, v10, v5, v4, v9}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v4, 0xbb

    iget-object v5, v7, Lm/g;->b:Ljava/lang/Class;

    if-nez v5, :cond_6

    move-object v5, v0

    :cond_6
    invoke-static {v5}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {v1, v3}, Lh/h;->c(I)V

    iget-object v3, v7, Lm/g;->b:Ljava/lang/Class;

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "()V"

    const/16 v4, 0xb7

    invoke-virtual {v1, v4, v0, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb0

    invoke-virtual {v1, v0}, Lh/h;->c(I)V

    const/4 v0, 0x3

    iput v0, v1, Lh/h;->h:I

    iput v0, v1, Lh/h;->i:I

    :goto_5
    new-instance v0, Lj/a$a;

    const/4 v1, 0x5

    invoke-direct {v0, v2, v7, v1}, Lj/a$a;-><init>(Ljava/lang/String;Lm/g;I)V

    invoke-virtual {v6, v10, v0}, Lj/a;->e(Lh/c;Lj/a$a;)V

    new-instance v9, Lj/a$a;

    const/4 v0, 0x4

    invoke-direct {v9, v2, v7, v0}, Lj/a$a;-><init>(Ljava/lang/String;Lm/g;I)V

    new-instance v11, Lh/h;

    const-string v0, "(L"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lj/a;->c:Ljava/lang/String;

    const-string v2, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "deserialzeArrayMapping"

    const/4 v2, 0x0

    invoke-direct {v11, v10, v1, v0, v2}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    invoke-virtual {v6, v9, v11}, Lj/a;->q(Lj/a$a;Lh/h;)V

    invoke-virtual {v6, v9, v11}, Lj/a;->b(Lj/a$a;Lh/h;)V

    iget-object v0, v9, Lj/a$a;->d:Lm/g;

    iget-object v12, v0, Lm/g;->i:[Lm/c;

    array-length v13, v12

    const/4 v0, 0x0

    move-object v0, v6

    const/4 v15, 0x0

    :goto_6
    const-string v1, "ch"

    const-string v2, "(I)V"

    const-string v3, "()C"

    const-string v5, "lexer"

    const-string v4, "setToken"

    const-string v7, "next"

    move-object/from16 v16, v10

    const-string v10, "getCurrent"

    if-ge v15, v13, :cond_24

    move-object/from16 v18, v0

    add-int/lit8 v0, v13, -0x1

    if-ne v15, v0, :cond_8

    const/4 v0, 0x1

    const/16 v19, 0x1

    goto :goto_7

    :cond_8
    const/4 v0, 0x0

    const/16 v19, 0x0

    :goto_7
    if-eqz v19, :cond_9

    const/16 v0, 0x5d

    goto :goto_8

    :cond_9
    const/16 v0, 0x2c

    :goto_8
    move/from16 v20, v13

    aget-object v13, v12, v15

    move-object/from16 v21, v12

    iget-object v12, v13, Lm/c;->f:Ljava/lang/Class;

    move-object/from16 v22, v14

    iget-object v14, v13, Lm/c;->g:Ljava/lang/reflect/Type;

    move-object/from16 v23, v4

    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    move-object/from16 v24, v7

    const-string v7, "_asm"

    move-object/from16 v25, v2

    const-string v2, "(C)I"

    move/from16 v26, v15

    const-string v15, "scanInt"

    if-eq v12, v4, :cond_23

    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v12, v4, :cond_23

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v12, v4, :cond_a

    goto/16 :goto_1b

    :cond_a
    const-class v4, Ljava/lang/Byte;

    move-object/from16 v27, v14

    const-string v14, "I"

    move-object/from16 v28, v8

    const-string v8, "matchStat"

    const-string v6, "valueOf"

    move-object/from16 v29, v1

    const/16 v1, 0xb8

    if-ne v12, v4, :cond_b

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v11, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v15, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Byte"

    const-string v3, "(B)Ljava/lang/Byte;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_d

    :cond_b
    const-class v4, Ljava/lang/Short;

    if-ne v12, v4, :cond_c

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v11, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v15, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Short"

    const-string v3, "(S)Ljava/lang/Short;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_d

    :cond_c
    const-class v4, Ljava/lang/Integer;

    if-ne v12, v4, :cond_d

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v11, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v15, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Integer"

    const-string v3, "(I)Ljava/lang/Integer;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_d

    :cond_d
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v4, :cond_e

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanLong"

    const-string v2, "(C)J"

    const/16 v3, 0xb6

    const/16 v4, 0x37

    :goto_9
    invoke-static {v11, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto/16 :goto_c

    :cond_e
    const-class v4, Ljava/lang/Long;

    if-ne v12, v4, :cond_f

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0x10

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanLong"

    const-string v3, "(C)J"

    const/16 v4, 0xb6

    invoke-virtual {v11, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Long"

    const-string v3, "(J)Ljava/lang/Long;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_d

    :cond_f
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v12, v4, :cond_10

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanBoolean"

    const-string v2, "(C)Z"

    const/16 v3, 0xb6

    :goto_a
    invoke-static {v11, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto/16 :goto_e

    :cond_10
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v12, v4, :cond_11

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanFloat"

    const-string v2, "(C)F"

    const/16 v3, 0xb6

    invoke-static {v11, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x38

    :goto_b
    move-object/from16 v12, p0

    goto/16 :goto_12

    :cond_11
    const-class v4, Ljava/lang/Float;

    if-ne v12, v4, :cond_12

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0x10

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanFloat"

    const-string v3, "(C)F"

    const/16 v4, 0xb6

    invoke-virtual {v11, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Float"

    const-string v3, "(F)Ljava/lang/Float;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_d

    :cond_12
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v12, v4, :cond_13

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanDouble"

    const-string v2, "(C)D"

    const/16 v3, 0xb6

    const/16 v4, 0x39

    goto/16 :goto_9

    :goto_c
    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lj/a$a;->e(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v12, p0

    move v1, v4

    goto/16 :goto_12

    :cond_13
    const-class v4, Ljava/lang/Double;

    if-ne v12, v4, :cond_14

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0x10

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "scanDouble"

    const-string v3, "(C)D"

    const/16 v4, 0xb6

    invoke-virtual {v11, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "java/lang/Double"

    const-string v3, "(D)Ljava/lang/Double;"

    invoke-static {v11, v1, v2, v6, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v11, v3, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_d
    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v11, v1}, Lh/h;->f(Lh/f;)V

    goto/16 :goto_11

    :cond_14
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v12, v1, :cond_15

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanString"

    const-string v2, "(C)Ljava/lang/String;"

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    const-string v0, "java/lang/String"

    const-string v1, "charAt"

    const-string v2, "(I)C"

    goto/16 :goto_a

    :goto_e
    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x36

    goto/16 :goto_b

    :cond_15
    const-class v1, Ljava/lang/String;

    if-ne v12, v1, :cond_16

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanString"

    const-string v2, "(C)Ljava/lang/String;"

    :goto_f
    const/16 v3, 0xb6

    invoke-static {v11, v3, v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto :goto_10

    :cond_16
    const-class v1, Ljava/math/BigDecimal;

    if-ne v12, v1, :cond_17

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanDecimal"

    const-string v2, "(C)Ljava/math/BigDecimal;"

    goto :goto_f

    :cond_17
    const-class v1, Ljava/util/Date;

    if-ne v12, v1, :cond_18

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanDate"

    const-string v2, "(C)Ljava/util/Date;"

    goto :goto_f

    :cond_18
    const-class v1, Ljava/util/UUID;

    if-ne v12, v1, :cond_19

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanUUID"

    const-string v2, "(C)Ljava/util/UUID;"

    goto :goto_f

    :goto_10
    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v7, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x3a

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    :goto_11
    move-object/from16 v12, p0

    goto/16 :goto_15

    :cond_19
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_1a

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v8, Lh/f;

    invoke-direct {v8}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    move-object/from16 v18, v6

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v6

    move-object/from16 v30, v7

    const/16 v7, 0x19

    invoke-virtual {v11, v7, v6}, Lh/h;->k(II)V

    sget-object v6, Lj/a;->d:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-virtual {v11, v7, v6, v10, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x59

    invoke-virtual {v11, v3}, Lh/h;->c(I)V

    move-object/from16 v7, v29

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v10, 0x36

    invoke-virtual {v11, v10, v3}, Lh/h;->k(II)V

    const/16 v3, 0x6e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0x9f

    invoke-virtual {v11, v3, v14}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v10, 0x15

    invoke-virtual {v11, v10, v3}, Lh/h;->k(II)V

    const/16 v3, 0x22

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    invoke-virtual {v11, v3, v1}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v14}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v10, 0x19

    invoke-virtual {v11, v10, v3}, Lh/h;->k(II)V

    invoke-static {v12}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v11, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-virtual {v11, v10, v3}, Lh/h;->k(II)V

    sget-object v3, Lj/a;->c:Ljava/lang/String;

    const-string v10, "()"

    invoke-static {v10}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-class v14, Li/j;

    invoke-static {v14}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v14, "getSymbolTable"

    move-object/from16 v29, v12

    const/16 v12, 0xb6

    invoke-virtual {v11, v12, v3, v14, v10}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "(Ljava/lang/Class;"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v10, Li/j;

    invoke-static {v10}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "C)Ljava/lang/Enum;"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v10, "scanEnum"

    invoke-virtual {v11, v12, v6, v10, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xa7

    invoke-virtual {v11, v3, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v1}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x15

    invoke-virtual {v11, v3, v1}, Lh/h;->k(II)V

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v1, 0xa1

    invoke-virtual {v11, v1, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v11, v3, v1}, Lh/h;->k(II)V

    const/16 v1, 0x39

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v1, 0xa3

    invoke-virtual {v11, v1, v4}, Lh/h;->e(ILh/f;)V

    move-object/from16 v12, p0

    move-object/from16 v1, v18

    invoke-virtual {v12, v9, v11, v13}, Lj/a;->i(Lj/a$a;Lh/h;Lm/c;)V

    const/16 v3, 0xc0

    const-class v7, Lj/g;

    invoke-static {v7}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v3, v7}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v7, 0x19

    invoke-virtual {v11, v7, v3}, Lh/h;->k(II)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    const/16 v10, 0xb6

    invoke-virtual {v11, v10, v6, v15, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-class v2, Lj/g;

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const-string v14, "(I)Ljava/lang/Enum;"

    invoke-virtual {v11, v10, v2, v1, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xa7

    invoke-virtual {v11, v1, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v4}, Lh/h;->f(Lh/f;)V

    const/4 v1, 0x0

    invoke-virtual {v11, v7, v1}, Lh/h;->k(II)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v11, v7, v1}, Lh/h;->k(II)V

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    invoke-static/range {v28 .. v28}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(L"

    const-string v2, ";C)Ljava/lang/Enum;"

    invoke-static {v1, v6, v2}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "scanEnum"

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Lh/h;->f(Lh/f;)V

    const/16 v0, 0xc0

    invoke-static/range {v29 .. v29}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v4, v30

    invoke-static {v0, v1, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x3a

    :goto_12
    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    goto/16 :goto_15

    :cond_1a
    move-object v4, v7

    move-object/from16 v29, v12

    move-object/from16 v12, p0

    const-class v1, Ljava/util/Collection;

    move-object/from16 v6, v29

    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const-string v7, "token"

    if-eqz v1, :cond_1f

    invoke-static/range {v27 .. v27}, Lm/j;->x(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    if-ne v1, v2, :cond_1d

    const-class v1, Ljava/util/List;

    if-eq v6, v1, :cond_1c

    const-class v1, Ljava/util/Collections;

    if-eq v6, v1, :cond_1c

    const-class v1, Ljava/util/ArrayList;

    if-ne v6, v1, :cond_1b

    goto :goto_13

    :cond_1b
    invoke-static {v6}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v1

    invoke-virtual {v11, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const-class v1, Lm/j;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "createCollection"

    const-string v3, "(Ljava/lang/Class;)Ljava/util/Collection;"

    const/16 v6, 0xb8

    goto :goto_14

    :cond_1c
    :goto_13
    const/16 v1, 0xbb

    const-class v2, Ljava/util/ArrayList;

    invoke-static {v2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v1, v2}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v1, 0x59

    invoke-virtual {v11, v1}, Lh/h;->c(I)V

    const-class v1, Ljava/util/ArrayList;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "()V"

    const/16 v6, 0xb7

    move-object/from16 v2, v22

    :goto_14
    invoke-static {v11, v6, v1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v2, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v1, v3, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v1

    invoke-virtual {v11, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x10

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v1, "scanStringArray"

    const-string v3, "(Ljava/util/Collection;C)V"

    const/16 v6, 0xb6

    invoke-virtual {v11, v6, v0, v1, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v11, v2, v3}, Lh/h;->k(II)V

    const/16 v2, 0xb4

    invoke-virtual {v11, v2, v0, v8, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa0

    invoke-virtual {v11, v0, v1}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v11, v1}, Lh/h;->f(Lh/f;)V

    :goto_15
    move/from16 v8, v26

    goto/16 :goto_17

    :cond_1d
    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v8, 0x19

    invoke-virtual {v11, v8, v2}, Lh/h;->k(II)V

    sget-object v2, Lj/a;->d:Ljava/lang/String;

    const-string v8, "()I"

    const/16 v14, 0xb6

    invoke-virtual {v11, v14, v2, v7, v8}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v8

    const/16 v14, 0x36

    invoke-virtual {v11, v14, v8}, Lh/h;->k(II)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v8

    const/16 v14, 0x15

    invoke-virtual {v11, v14, v8}, Lh/h;->k(II)V

    if-nez v26, :cond_1e

    const/16 v8, 0xe

    goto :goto_16

    :cond_1e
    const/16 v8, 0x10

    :goto_16
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v11, v8}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v8, 0x9f

    invoke-virtual {v11, v8, v0}, Lh/h;->e(ILh/f;)V

    const/16 v8, 0x19

    const/4 v15, 0x1

    invoke-virtual {v11, v8, v15}, Lh/h;->k(II)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v11, v14, v7}, Lh/h;->k(II)V

    sget-object v7, Lj/a;->c:Ljava/lang/String;

    const-string v8, "throwException"

    const/16 v14, 0xb6

    move-object/from16 v15, v25

    invoke-virtual {v11, v14, v7, v8, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lh/h;->f(Lh/f;)V

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v8, Lh/f;

    invoke-direct {v8}, Lh/f;-><init>()V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v14

    move-object/from16 v19, v7

    const/16 v7, 0x19

    invoke-virtual {v11, v7, v14}, Lh/h;->k(II)V

    const/16 v14, 0xb6

    invoke-virtual {v11, v14, v2, v10, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x5b

    const/16 v14, 0x10

    invoke-virtual {v11, v14, v10}, Lh/h;->k(II)V

    const/16 v10, 0xa0

    invoke-virtual {v11, v10, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v11, v7, v10}, Lh/h;->k(II)V

    move-object/from16 v14, v24

    const/16 v10, 0xb6

    invoke-virtual {v11, v10, v2, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x57

    invoke-virtual {v11, v3}, Lh/h;->c(I)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v11, v7, v3}, Lh/h;->k(II)V

    const/16 v3, 0xe

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v14}, Lh/h;->g(Ljava/lang/Object;)V

    move-object/from16 v14, v23

    invoke-virtual {v11, v10, v2, v14, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v14, 0xa7

    invoke-virtual {v11, v14, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v7, v0}, Lh/h;->k(II)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v0, "nextToken"

    invoke-virtual {v11, v10, v2, v0, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Lh/h;->f(Lh/f;)V

    const/4 v0, 0x0

    move/from16 v8, v26

    invoke-virtual {v12, v11, v6, v8, v0}, Lj/a;->j(Lh/h;Ljava/lang/Class;IZ)V

    const/16 v0, 0x59

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v12, v9, v11, v13, v1}, Lj/a;->h(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V

    const/4 v0, 0x1

    const/16 v2, 0x19

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    invoke-static/range {v28 .. v28}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(Ljava/util/Collection;"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Lj/s;

    invoke-static {v2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "L"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v19

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "parseArray"

    const/16 v3, 0xb8

    invoke-virtual {v11, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_17
    move-object/from16 v10, v22

    goto/16 :goto_1a

    :cond_1f
    move-object/from16 v15, v25

    move/from16 v8, v26

    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    const/16 v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "nextToken"

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v2, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static/range {v28 .. v28}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getFieldType"

    const-string v2, "(I)Ljava/lang/reflect/Type;"

    invoke-virtual {v11, v3, v0, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->c:Ljava/lang/String;

    const-string v1, "parseObject"

    const-string v2, "(Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-virtual {v11, v3, v0, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xc0

    invoke-static {v6}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lh/h;->j(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x3a

    move-object/from16 v18, v12

    move-object/from16 v10, v22

    goto/16 :goto_1c

    :cond_20
    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    const-class v2, Ljava/util/Date;

    if-ne v6, v2, :cond_21

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v15, 0x19

    invoke-virtual {v11, v15, v2}, Lh/h;->k(II)V

    sget-object v2, Lj/a;->d:Ljava/lang/String;

    const/16 v15, 0xb6

    invoke-virtual {v11, v15, v2, v10, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x31

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    invoke-virtual {v11, v3, v1}, Lh/h;->e(ILh/f;)V

    const/16 v3, 0xbb

    const-class v10, Ljava/util/Date;

    invoke-static {v10}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v3, v10}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v3, 0x59

    invoke-virtual {v11, v3}, Lh/h;->c(I)V

    invoke-virtual {v9, v5}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v10, 0x19

    invoke-virtual {v11, v10, v3}, Lh/h;->k(II)V

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v0}, Lh/h;->k(II)V

    const-string v0, "scanLong"

    const-string v3, "(C)J"

    const/16 v10, 0xb6

    invoke-virtual {v11, v10, v2, v0, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, Ljava/util/Date;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "(J)V"

    const/16 v3, 0xb7

    move-object/from16 v10, v22

    invoke-virtual {v11, v3, v0, v10, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v2, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v2, 0x3a

    invoke-virtual {v11, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0xa7

    invoke-virtual {v11, v0, v14}, Lh/h;->e(ILh/f;)V

    goto :goto_18

    :cond_21
    move-object/from16 v10, v22

    :goto_18
    invoke-virtual {v11, v1}, Lh/h;->f(Lh/f;)V

    const/16 v0, 0xe

    invoke-virtual {v12, v9, v11, v0}, Lj/a;->k(Lj/a$a;Lh/h;I)V

    move-object/from16 v0, p0

    move-object v1, v9

    move-object v2, v11

    move-object v3, v13

    move-object v4, v6

    move-object v6, v5

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Lj/a;->c(Lj/a$a;Lh/h;Lm/c;Ljava/lang/Class;I)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const-string v2, "()I"

    const/16 v3, 0xb6

    invoke-virtual {v11, v3, v0, v7, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0x9f

    invoke-virtual {v11, v0, v14}, Lh/h;->e(ILh/f;)V

    const/4 v0, 0x0

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    if-nez v19, :cond_22

    const/16 v0, 0x10

    goto :goto_19

    :cond_22
    const/16 v0, 0xf

    :goto_19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-static/range {v28 .. v28}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "("

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-class v2, Li/c;

    invoke-static {v2}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "I)V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "check"

    const/16 v3, 0xb7

    invoke-virtual {v11, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v14}, Lh/h;->f(Lh/f;)V

    :goto_1a
    move-object v0, v12

    goto :goto_1d

    :cond_23
    :goto_1b
    move-object v12, v6

    move-object v4, v7

    move-object/from16 v28, v8

    move-object/from16 v10, v22

    move/from16 v8, v26

    move-object v6, v5

    const/16 v1, 0x10

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x19

    invoke-virtual {v11, v5, v3}, Lh/h;->k(II)V

    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v1, 0xb6

    invoke-static {v11, v1, v0, v15, v2}, Landroidx/appcompat/graphics/drawable/a;->d(Lh/h;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v13, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v4, v9}, Landroidx/appcompat/widget/a;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lj/a$a;)I

    move-result v0

    const/16 v1, 0x36

    :goto_1c
    invoke-virtual {v11, v1, v0}, Lh/h;->k(II)V

    move-object/from16 v0, v18

    :goto_1d
    add-int/lit8 v15, v8, 0x1

    move-object/from16 v7, p2

    move-object v14, v10

    move-object v6, v12

    move-object/from16 v10, v16

    move/from16 v13, v20

    move-object/from16 v12, v21

    move-object/from16 v8, v28

    goto/16 :goto_6

    :cond_24
    move-object/from16 v18, v0

    move-object v15, v2

    move-object v12, v6

    move-object v14, v7

    move-object v7, v1

    move-object v1, v4

    move-object v6, v5

    const/4 v0, 0x0

    move-object/from16 v4, v18

    invoke-virtual {v4, v9, v11, v0}, Lj/a;->a(Lj/a$a;Lh/h;Z)V

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    new-instance v8, Lh/f;

    invoke-direct {v8}, Lh/f;-><init>()V

    new-instance v13, Lh/f;

    invoke-direct {v13}, Lh/f;-><init>()V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v2

    const/16 v12, 0x19

    invoke-virtual {v11, v12, v2}, Lh/h;->k(II)V

    sget-object v2, Lj/a;->d:Ljava/lang/String;

    const/16 v12, 0xb6

    invoke-virtual {v11, v12, v2, v10, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x59

    invoke-virtual {v11, v10}, Lh/h;->c(I)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x36

    invoke-virtual {v11, v12, v10}, Lh/h;->k(II)V

    const/16 v10, 0x2c

    const/16 v12, 0x10

    invoke-virtual {v11, v12, v10}, Lh/h;->k(II)V

    const/16 v10, 0xa0

    invoke-virtual {v11, v10, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-virtual {v11, v12, v10}, Lh/h;->k(II)V

    const/16 v10, 0xb6

    invoke-virtual {v11, v10, v2, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x57

    invoke-virtual {v11, v10}, Lh/h;->c(I)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v11, v12, v10}, Lh/h;->k(II)V

    const/16 v10, 0x10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v12}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v12, 0xb6

    invoke-virtual {v11, v12, v2, v1, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v12, 0xa7

    invoke-virtual {v11, v12, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v5}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v5

    const/16 v12, 0x15

    invoke-virtual {v11, v12, v5}, Lh/h;->k(II)V

    const/16 v5, 0x5d

    invoke-virtual {v11, v10, v5}, Lh/h;->k(II)V

    const/16 v5, 0xa0

    invoke-virtual {v11, v5, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v5

    const/16 v10, 0x19

    invoke-virtual {v11, v10, v5}, Lh/h;->k(II)V

    const/16 v5, 0xb6

    invoke-virtual {v11, v5, v2, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v12, 0x57

    invoke-virtual {v11, v12}, Lh/h;->c(I)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v11, v10, v12}, Lh/h;->k(II)V

    const/16 v10, 0xf

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v11, v10}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v11, v5, v2, v1, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0xa7

    invoke-virtual {v11, v10, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v8}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v7}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v7

    const/16 v8, 0x15

    invoke-virtual {v11, v8, v7}, Lh/h;->k(II)V

    const/16 v7, 0x1a

    const/16 v8, 0x10

    invoke-virtual {v11, v8, v7}, Lh/h;->k(II)V

    const/16 v7, 0xa0

    invoke-virtual {v11, v7, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v7

    const/16 v8, 0x19

    invoke-virtual {v11, v8, v7}, Lh/h;->k(II)V

    invoke-virtual {v11, v5, v2, v14, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x57

    invoke-virtual {v11, v3}, Lh/h;->c(I)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v11, v8, v3}, Lh/h;->k(II)V

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v11, v3}, Lh/h;->g(Ljava/lang/Object;)V

    invoke-virtual {v11, v5, v2, v1, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xa7

    invoke-virtual {v11, v1, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v9, v6}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v8, v0}, Lh/h;->k(II)V

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v11, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v0, "nextToken"

    invoke-virtual {v11, v5, v2, v0, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v13}, Lh/h;->f(Lh/f;)V

    const-string v0, "instance"

    invoke-virtual {v9, v0}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v11, v8, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb0

    invoke-virtual {v11, v0}, Lh/h;->c(I)V

    iget v0, v9, Lj/a$a;->a:I

    const/4 v1, 0x5

    iput v1, v11, Lh/h;->h:I

    iput v0, v11, Lh/h;->i:I

    invoke-virtual/range {v16 .. v16}, Lh/c;->f()[B

    move-result-object v0

    iget-object v1, v4, Lj/a;->a:Lm/a;

    array-length v2, v0

    move-object/from16 v3, v17

    invoke-virtual {v1, v3, v0, v2}, Lm/a;->a(Ljava/lang/String;[BI)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Li/i;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Lm/g;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    aput-object p2, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/s;

    return-object v0

    :cond_25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "not support type :"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final q(Lj/a$a;Lh/h;)V
    .locals 4

    const/16 v0, 0x19

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Lh/h;->k(II)V

    sget-object v0, Lj/a;->c:Ljava/lang/String;

    const-class v1, Li/c;

    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb4

    const-string v3, "lexer"

    invoke-virtual {p2, v2, v0, v3, v1}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lj/a;->d:Ljava/lang/String;

    const/16 v1, 0xc0

    invoke-virtual {p2, v1, v0}, Lh/h;->j(ILjava/lang/String;)V

    invoke-virtual {p1, v3}, Lj/a$a;->f(Ljava/lang/String;)I

    move-result p1

    const/16 v0, 0x3a

    invoke-virtual {p2, v0, p1}, Lh/h;->k(II)V

    return-void
.end method
