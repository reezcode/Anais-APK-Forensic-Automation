.class public final Lv2/e;
.super Ljava/lang/Object;


# static fields
.field public static final L:Lv2/c;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Z

.field public C:Z

.field public D:Ljava/lang/String;

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:I

.field public I:Ljava/lang/String;

.field public J:Z

.field public K:Ljava/lang/String;

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lv2/c;

.field public d:Lv2/a;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation
.end field

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/String;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Ljava/lang/String;

.field public u:Z

.field public v:Ljava/lang/String;

.field public w:Z

.field public x:I

.field public y:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lv2/a;",
            ">;"
        }
    .end annotation
.end field

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lv2/c;->e:Lv2/c;

    sput-object v0, Lv2/e;->L:Lv2/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv2/e;->L:Lv2/c;

    iput-object v0, p0, Lv2/e;->c:Lv2/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv2/e;->g:Z

    iput-boolean v0, p0, Lv2/e;->o:Z

    const/4 v1, -0x1

    iput v1, p0, Lv2/e;->x:I

    const-class v1, Lw2/k0;

    iput-object v1, p0, Lv2/e;->y:Ljava/lang/Class;

    iput v0, p0, Lv2/e;->H:I

    iput-boolean v0, p0, Lv2/e;->J:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv2/e;->L:Lv2/c;

    iput-object v0, p0, Lv2/e;->c:Lv2/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv2/e;->g:Z

    iput-boolean v0, p0, Lv2/e;->o:Z

    const/4 v1, -0x1

    iput v1, p0, Lv2/e;->x:I

    const-class v1, Lw2/k0;

    iput-object v1, p0, Lv2/e;->y:Ljava/lang/Class;

    iput v0, p0, Lv2/e;->H:I

    iput-boolean v0, p0, Lv2/e;->J:Z

    iput-object p1, p0, Lv2/e;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
    .locals 5

    const-string v0, "get"

    invoke-static {p0, v0}, Lv2/e;->g(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Return type of get method "

    const-string v2, " does not return "

    invoke-static {v1, v0, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object v2

    :catch_0
    nop

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find appropriate get method for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Enum;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknwown enum unknown name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for field "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;
    .locals 6

    const-string v0, "set"

    invoke-static {p0, v0}, Lv2/e;->g(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Return type of set method "

    const-string v2, " returns "

    invoke-static {v1, v0, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " instead of void"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-object p0

    :catch_0
    nop

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find appropriate set method for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static e(Lu2/c;Ljava/lang/reflect/Field;)Lv2/e;
    .locals 18

    move-object/from16 v1, p1

    const-class v0, Lv2/d;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lv2/d;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lv2/d;->persisted()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v2, Lv2/e;

    invoke-direct {v2}, Lv2/e;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lv2/e;->a:Ljava/lang/String;

    invoke-static/range {p0 .. p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lv2/d;->columnName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lv2/e;->b:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->dataType()Lv2/c;

    move-result-object v3

    iput-object v3, v2, Lv2/e;->c:Lv2/c;

    invoke-interface {v0}, Lv2/d;->defaultValue()Ljava/lang/String;

    move-result-object v3

    const-string v4, "__ormlite__ no default value string was specified"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iput-object v3, v2, Lv2/e;->e:Ljava/lang/String;

    :cond_0
    invoke-interface {v0}, Lv2/d;->width()I

    move-result v3

    iput v3, v2, Lv2/e;->f:I

    invoke-interface {v0}, Lv2/d;->canBeNull()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->g:Z

    invoke-interface {v0}, Lv2/d;->id()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->h:Z

    invoke-interface {v0}, Lv2/d;->generatedId()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->i:Z

    invoke-interface {v0}, Lv2/d;->generatedIdSequence()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lv2/e;->j:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->foreign()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->k:Z

    invoke-interface {v0}, Lv2/d;->useGetSet()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->l:Z

    invoke-interface {v0}, Lv2/d;->unknownEnumName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lv2/e;->c(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->m:Ljava/lang/Enum;

    invoke-interface {v0}, Lv2/d;->throwIfNull()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->n:Z

    invoke-interface {v0}, Lv2/d;->format()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->p:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->unique()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->q:Z

    invoke-interface {v0}, Lv2/d;->uniqueCombo()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->r:Z

    invoke-interface {v0}, Lv2/d;->index()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->s:Z

    invoke-interface {v0}, Lv2/d;->indexName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->t:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->uniqueIndex()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->u:Z

    invoke-interface {v0}, Lv2/d;->uniqueIndexName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->v:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->foreignAutoRefresh()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->w:Z

    invoke-interface {v0}, Lv2/d;->maxForeignAutoRefreshLevel()I

    move-result v1

    iput v1, v2, Lv2/e;->x:I

    invoke-interface {v0}, Lv2/d;->persisterClass()Ljava/lang/Class;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->y:Ljava/lang/Class;

    invoke-interface {v0}, Lv2/d;->allowGeneratedIdInsert()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->z:Z

    invoke-interface {v0}, Lv2/d;->columnDefinition()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->A:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->foreignAutoCreate()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->B:Z

    invoke-interface {v0}, Lv2/d;->version()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->C:Z

    invoke-interface {v0}, Lv2/d;->foreignColumnName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->D:Ljava/lang/String;

    invoke-interface {v0}, Lv2/d;->readOnly()Z

    move-result v0

    iput-boolean v0, v2, Lv2/e;->E:Z

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return-object v2

    :cond_2
    const-class v0, Lv2/h;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lv2/h;

    const/4 v3, 0x1

    if-eqz v0, :cond_6

    new-instance v2, Lv2/e;

    invoke-direct {v2}, Lv2/e;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->a:Ljava/lang/String;

    invoke-interface {v0}, Lv2/h;->columnName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    invoke-interface {v0}, Lv2/h;->columnName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->b:Ljava/lang/String;

    :cond_3
    iput-boolean v3, v2, Lv2/e;->F:Z

    invoke-interface {v0}, Lv2/h;->eager()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->G:Z

    invoke-interface {v0}, Lv2/h;->maxEagerForeignCollectionLevel()I

    move-result v1

    if-eq v1, v3, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Lv2/h;->maxEagerLevel()I

    move-result v1

    :goto_1
    iput v1, v2, Lv2/e;->H:I

    invoke-interface {v0}, Lv2/h;->orderColumnName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lv2/e;->I:Ljava/lang/String;

    invoke-interface {v0}, Lv2/h;->orderAscending()Z

    move-result v1

    iput-boolean v1, v2, Lv2/e;->J:Z

    invoke-interface {v0}, Lv2/h;->columnName()Ljava/lang/String;

    invoke-interface {v0}, Lv2/h;->foreignFieldName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-interface {v0}, Lv2/h;->foreignColumnName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv2/e;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_5
    iput-object v1, v2, Lv2/e;->K:Ljava/lang/String;

    return-object v2

    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_2
    if-ge v6, v4, :cond_10

    aget-object v16, v0, v6

    invoke-interface/range {v16 .. v16}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.Column"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v7, v16

    :cond_7
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.Basic"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v8, v16

    :cond_8
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.Id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object/from16 v9, v16

    :cond_9
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.GeneratedValue"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    move-object/from16 v14, v16

    :cond_a
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.OneToOne"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move-object/from16 v10, v16

    :cond_b
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.ManyToOne"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move-object/from16 v11, v16

    :cond_c
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.JoinColumn"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    move-object/from16 v15, v16

    :cond_d
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.Enumerated"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move-object/from16 v12, v16

    :cond_e
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "javax.persistence.Version"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    move-object/from16 v13, v16

    :cond_f
    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x1

    goto/16 :goto_2

    :cond_10
    if-nez v7, :cond_11

    if-nez v8, :cond_11

    if-nez v9, :cond_11

    if-nez v10, :cond_11

    if-nez v11, :cond_11

    if-nez v12, :cond_11

    if-nez v13, :cond_11

    const/4 v2, 0x0

    goto/16 :goto_b

    :cond_11
    new-instance v2, Lv2/e;

    invoke-direct {v2}, Lv2/e;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, v2, Lv2/e;->a:Ljava/lang/String;

    const-string v0, "unique"

    const-string v3, "nullable"

    const-string v4, "name"

    if-eqz v7, :cond_15

    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v16, v13

    new-array v13, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v4, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v13, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_12

    iput-object v6, v2, Lv2/e;->b:Ljava/lang/String;

    :cond_12
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v13, "columnDefinition"

    move-object/from16 v17, v12

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v13, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_13

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_13

    iput-object v6, v2, Lv2/e;->A:Ljava/lang/String;

    :cond_13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v12, "length"

    new-array v13, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v2, Lv2/e;->f:I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v3, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_14

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iput-boolean v6, v2, Lv2/e;->g:Z

    :cond_14
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v0, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v12, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v7, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_16

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iput-boolean v6, v2, Lv2/e;->q:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problem accessing fields from the @Column annotation for field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_15
    move-object/from16 v17, v12

    move-object/from16 v16, v13

    :cond_16
    :goto_3
    if-eqz v8, :cond_18

    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "optional"

    new-array v12, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v7, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    new-array v7, v5, [Ljava/lang/Object;

    invoke-virtual {v6, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-nez v6, :cond_17

    const/4 v7, 0x1

    iput-boolean v7, v2, Lv2/e;->g:Z

    goto :goto_4

    :cond_17
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iput-boolean v6, v2, Lv2/e;->g:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problem accessing fields from the @Basic annotation for field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_18
    :goto_4
    if-eqz v9, :cond_1a

    if-nez v14, :cond_19

    const/4 v6, 0x1

    iput-boolean v6, v2, Lv2/e;->h:Z

    goto :goto_5

    :cond_19
    const/4 v6, 0x1

    iput-boolean v6, v2, Lv2/e;->i:Z

    :cond_1a
    :goto_5
    if-nez v10, :cond_1b

    if-eqz v11, :cond_20

    :cond_1b
    const-class v6, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    const-string v7, "Problem accessing fields from the @JoinColumn annotation for field "

    if-nez v6, :cond_1f

    const-class v6, Lt2/k;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_1c

    goto :goto_6

    :cond_1c
    const/4 v6, 0x1

    iput-boolean v6, v2, Lv2/e;->k:Z

    if-eqz v15, :cond_20

    :try_start_2
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-array v8, v5, [Ljava/lang/Class;

    invoke-virtual {v6, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {v4, v15, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_1d

    iput-object v4, v2, Lv2/e;->b:Ljava/lang/String;

    :cond_1d
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v4, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v15, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iput-boolean v3, v2, Lv2/e;->g:Z

    :cond_1e
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v15, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v2, Lv2/e;->q:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_1f
    :goto_6
    const/4 v0, 0x1

    iput-boolean v0, v2, Lv2/e;->F:Z

    if-eqz v15, :cond_20

    :try_start_3
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v15, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "fetch"

    new-array v4, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v15, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "EAGER"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, 0x1

    iput-boolean v0, v2, Lv2/e;->G:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_20
    :goto_7
    if-eqz v17, :cond_22

    :try_start_4
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "value"

    new-array v4, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    move-object/from16 v12, v17

    invoke-virtual {v0, v12, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "STRING"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    sget-object v0, Lv2/c;->c:Lv2/c;

    goto :goto_8

    :cond_21
    sget-object v0, Lv2/c;->d:Lv2/c;

    :goto_8
    iput-object v0, v2, Lv2/e;->c:Lv2/c;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_9

    :catch_4
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problem accessing fields from the @Enumerated annotation for field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_22
    :goto_9
    const/4 v0, 0x1

    if-eqz v16, :cond_23

    iput-boolean v0, v2, Lv2/e;->C:Z

    :cond_23
    invoke-virtual {v2}, Lv2/e;->f()Lv2/a;

    move-result-object v3

    if-nez v3, :cond_24

    invoke-static/range {p1 .. p1}, Lv2/b;->a(Ljava/lang/reflect/Field;)Lv2/a;

    move-result-object v3

    iput-object v3, v2, Lv2/e;->d:Lv2/a;

    :cond_24
    invoke-static {v1, v5}, Lv2/e;->a(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-static {v1, v5}, Lv2/e;->d(Ljava/lang/reflect/Field;Z)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_25

    const/4 v3, 0x1

    goto :goto_a

    :cond_25
    const/4 v3, 0x0

    :goto_a
    iput-boolean v3, v2, Lv2/e;->l:Z

    :goto_b
    return-object v2
.end method

.method public static g(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lv2/e;->b:Ljava/lang/String;

    const-string v1, "_idx"

    const-string v2, "_"

    if-nez v0, :cond_0

    invoke-static {p1, v2}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lv2/e;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-static {p1, v2}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Lv2/e;->b:Ljava/lang/String;

    :goto_0
    invoke-static {p1, v0, v1}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f()Lv2/a;
    .locals 1

    iget-object v0, p0, Lv2/e;->d:Lv2/a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lv2/e;->c:Lv2/c;

    iget-object v0, v0, Lv2/c;->b:Lv2/a;

    :cond_0
    return-object v0
.end method
