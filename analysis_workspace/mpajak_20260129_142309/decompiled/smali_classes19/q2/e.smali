.class public final Lq2/e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/e$a;
    }
.end annotation


# static fields
.field public static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static b:Ljava/lang/reflect/Field;

.field public static c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static d:Ljava/lang/reflect/Field;

.field public static e:Ljava/lang/reflect/Field;

.field public static final f:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "org.apache.harmony.lang.annotation.AnnotationFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lq2/e;->a:Ljava/lang/Class;

    const-string v1, "org.apache.harmony.lang.annotation.AnnotationMember"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lq2/e;->c:Ljava/lang/Class;

    const-string v1, "[Lorg.apache.harmony.lang.annotation.AnnotationMember;"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v2, Lq2/e;->a:Ljava/lang/Class;

    const-string v3, "elements"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lq2/e;->b:Ljava/lang/reflect/Field;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v2, Lq2/e;->c:Ljava/lang/Class;

    const-string v4, "name"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lq2/e;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v2, Lq2/e;->c:Ljava/lang/Class;

    const-string v4, "value"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lq2/e;->e:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-class v2, Lq2/e$a;

    const-string v3, "a"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_0

    const-class v3, Lv2/d;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lv2/d;

    invoke-static {v2}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lq2/e;->a:Ljava/lang/Class;

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    :try_start_2
    sget-object v3, Lq2/e;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v3, v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast v2, [Ljava/lang/Object;

    array-length v1, v2

    new-array v1, v1, [I

    const/4 v3, 0x0

    :goto_0
    array-length v4, v2

    if-ge v3, v4, :cond_2

    sget-object v4, Lq2/e;->d:Ljava/lang/reflect/Field;

    aget-object v5, v2, v3

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lq2/e;->b(Ljava/lang/String;)I

    move-result v4

    aput v4, v1, v3
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v1

    :catch_0
    :cond_3
    :goto_1
    sput-object v0, Lq2/e;->f:[I

    return-void
.end method

.method public static a(Lv2/d;Ljava/lang/reflect/Field;)Lv2/e;
    .locals 5

    invoke-static {p0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lq2/e;->a:Ljava/lang/Class;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    sget-object v0, Lq2/e;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v2

    :cond_1
    new-instance v0, Lv2/e;

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lv2/e;-><init>(Ljava/lang/String;)V

    check-cast p0, [Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lq2/e;->f:[I

    array-length v3, v2

    if-ge v1, v3, :cond_3

    sget-object v3, Lq2/e;->e:Ljava/lang/reflect/Field;

    aget-object v4, p0, v1

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    aget v2, v2, v1

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Could not find support for DatabaseField number "

    invoke-static {p1, v2}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->E:Z

    goto/16 :goto_1

    :pswitch_1
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->D:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_2
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->C:Z

    goto/16 :goto_1

    :pswitch_3
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->B:Z

    goto/16 :goto_1

    :pswitch_4
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->A:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_5
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->z:Z

    goto/16 :goto_1

    :pswitch_6
    check-cast v3, Ljava/lang/Class;

    iput-object v3, v0, Lv2/e;->y:Ljava/lang/Class;

    goto/16 :goto_1

    :pswitch_7
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lv2/e;->x:I

    goto/16 :goto_1

    :pswitch_8
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->w:Z

    goto/16 :goto_1

    :pswitch_9
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->v:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_a
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->t:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_b
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->u:Z

    goto/16 :goto_1

    :pswitch_c
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->s:Z

    goto/16 :goto_1

    :pswitch_d
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->r:Z

    goto/16 :goto_1

    :pswitch_e
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->q:Z

    goto/16 :goto_1

    :pswitch_f
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->p:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_10
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->o:Z

    goto/16 :goto_1

    :pswitch_11
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->n:Z

    goto :goto_1

    :pswitch_12
    check-cast v3, Ljava/lang/String;

    invoke-static {p1, v3}, Lv2/e;->c(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->m:Ljava/lang/Enum;

    goto :goto_1

    :pswitch_13
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->l:Z

    goto :goto_1

    :pswitch_14
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->k:Z

    goto :goto_1

    :pswitch_15
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->j:Ljava/lang/String;

    goto :goto_1

    :pswitch_16
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->i:Z

    goto :goto_1

    :pswitch_17
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->h:Z

    goto :goto_1

    :pswitch_18
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v0, Lv2/e;->g:Z

    goto :goto_1

    :pswitch_19
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lv2/e;->f:I

    goto :goto_1

    :pswitch_1a
    check-cast v3, Ljava/lang/String;

    const-string v2, "__ormlite__ no default value string was specified"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iput-object v3, v0, Lv2/e;->e:Ljava/lang/String;

    goto :goto_1

    :pswitch_1b
    check-cast v3, Lv2/c;

    iput-object v3, v0, Lv2/e;->c:Lv2/c;

    goto :goto_1

    :pswitch_1c
    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lq2/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lv2/e;->b:Ljava/lang/String;

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)I
    .locals 2

    const-string v0, "columnName"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "dataType"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "defaultValue"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x3

    return p0

    :cond_2
    const-string v0, "width"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x4

    return p0

    :cond_3
    const-string v0, "canBeNull"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x5

    return p0

    :cond_4
    const-string v0, "id"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p0, 0x6

    return p0

    :cond_5
    const-string v0, "generatedId"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p0, 0x7

    return p0

    :cond_6
    const-string v0, "generatedIdSequence"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 p0, 0x8

    return p0

    :cond_7
    const-string v0, "foreign"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 p0, 0x9

    return p0

    :cond_8
    const-string v0, "useGetSet"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/16 p0, 0xa

    return p0

    :cond_9
    const-string v0, "unknownEnumName"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 p0, 0xb

    return p0

    :cond_a
    const-string v0, "throwIfNull"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 p0, 0xc

    return p0

    :cond_b
    const-string v0, "persisted"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 p0, 0xd

    return p0

    :cond_c
    const-string v0, "format"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 p0, 0xe

    return p0

    :cond_d
    const-string v0, "unique"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const/16 p0, 0xf

    return p0

    :cond_e
    const-string v0, "uniqueCombo"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/16 p0, 0x10

    return p0

    :cond_f
    const-string v0, "index"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/16 p0, 0x11

    return p0

    :cond_10
    const-string v0, "uniqueIndex"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/16 p0, 0x12

    return p0

    :cond_11
    const-string v0, "indexName"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/16 p0, 0x13

    return p0

    :cond_12
    const-string v0, "uniqueIndexName"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/16 p0, 0x14

    return p0

    :cond_13
    const-string v0, "foreignAutoRefresh"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/16 p0, 0x15

    return p0

    :cond_14
    const-string v0, "maxForeignAutoRefreshLevel"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/16 p0, 0x16

    return p0

    :cond_15
    const-string v0, "persisterClass"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/16 p0, 0x17

    return p0

    :cond_16
    const-string v0, "allowGeneratedIdInsert"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    const/16 p0, 0x18

    return p0

    :cond_17
    const-string v0, "columnDefinition"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    const/16 p0, 0x19

    return p0

    :cond_18
    const-string v0, "foreignAutoCreate"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/16 p0, 0x1a

    return p0

    :cond_19
    const-string v0, "version"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const/16 p0, 0x1b

    return p0

    :cond_1a
    const-string v0, "foreignColumnName"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const/16 p0, 0x1c

    return p0

    :cond_1b
    const-string v0, "readOnly"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/16 p0, 0x1d

    return p0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not find support for DatabaseField "

    invoke-static {v1, p0}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method
