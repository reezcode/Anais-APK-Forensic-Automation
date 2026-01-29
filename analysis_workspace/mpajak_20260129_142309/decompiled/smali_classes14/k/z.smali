.class public final Lk/z;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk/z$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lk/z;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lm/c;

.field public final c:Z

.field public d:I

.field public final e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Lk/j;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Lk/z$a;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lm/c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lm/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk/z;->j:Z

    iput-boolean v0, p0, Lk/z;->k:Z

    iput-boolean v0, p0, Lk/z;->l:Z

    iput-boolean v0, p0, Lk/z;->m:Z

    iput-boolean v0, p0, Lk/z;->n:Z

    iput-object p2, p0, Lk/z;->b:Lm/c;

    new-instance v1, Lk/j;

    invoke-direct {v1, p2}, Lk/j;-><init>(Lm/c;)V

    iput-object v1, p0, Lk/z;->h:Lk/j;

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    iget-boolean v2, p2, Lm/c;->q:Z

    if-eqz v2, :cond_3

    const-class v2, Lg/d;

    invoke-static {p1, v2}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p1

    check-cast p1, Lg/d;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lg/d;->serialzeFeatures()[Lk/b1;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, p1, v3

    sget-object v5, Lk/b1;->f:Lk/b1;

    if-ne v4, v5, :cond_0

    iput-boolean v1, p0, Lk/z;->j:Z

    goto :goto_1

    :cond_0
    sget-object v5, Lk/b1;->g:Lk/b1;

    if-ne v4, v5, :cond_1

    iput-boolean v1, p0, Lk/z;->k:Z

    goto :goto_1

    :cond_1
    sget-object v5, Lk/b1;->q:Lk/b1;

    if-ne v4, v5, :cond_2

    iput-boolean v1, p0, Lk/z;->l:Z

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p2, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p2, Lm/c;->d:Ljava/lang/reflect/Field;

    :goto_2
    invoke-static {p1}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p2, Lm/c;->b:Ljava/lang/String;

    const-string v3, "\":"

    invoke-static {p1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lk/z;->e:Ljava/lang/String;

    invoke-virtual {p2}, Lm/c;->c()Lg/b;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-interface {p1}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    iget v5, v5, Lk/b1;->b:I

    sget v6, Lk/b1;->F:I

    and-int/2addr v5, v6

    if-eqz v5, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_4
    invoke-interface {p1}, Lg/b;->format()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lk/z;->i:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_7

    const/4 v3, 0x0

    iput-object v3, p0, Lk/z;->i:Ljava/lang/String;

    :cond_7
    invoke-interface {p1}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v4, :cond_b

    aget-object v6, v3, v5

    sget-object v7, Lk/b1;->f:Lk/b1;

    if-ne v6, v7, :cond_8

    iput-boolean v1, p0, Lk/z;->j:Z

    goto :goto_6

    :cond_8
    sget-object v7, Lk/b1;->g:Lk/b1;

    if-ne v6, v7, :cond_9

    iput-boolean v1, p0, Lk/z;->k:Z

    goto :goto_6

    :cond_9
    sget-object v7, Lk/b1;->q:Lk/b1;

    if-ne v6, v7, :cond_a

    iput-boolean v1, p0, Lk/z;->l:Z

    :cond_a
    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    invoke-interface {p1}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object p1

    invoke-static {p1}, Lk/b1;->b([Lk/b1;)I

    move-result p1

    iput p1, p0, Lk/z;->d:I

    goto :goto_7

    :cond_c
    const/4 v2, 0x0

    :goto_7
    iput-boolean v2, p0, Lk/z;->c:Z

    iget-object p1, p2, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-static {p1}, Lm/j;->I(Ljava/lang/reflect/Method;)Z

    move-result p1

    if-nez p1, :cond_d

    iget-object p1, p2, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-static {p1}, Lm/j;->H(Ljava/lang/reflect/Method;)Z

    move-result p1

    if-eqz p1, :cond_e

    :cond_d
    const/4 v0, 0x1

    :cond_e
    iput-boolean v0, p0, Lk/z;->n:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v1, v0, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lk/z;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v0, v0, Lm/c;->f:Ljava/lang/Class;

    const-class v1, Ljava/util/Date;

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lk/z;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sget-object v1, Lf/a;->b:Ljava/util/TimeZone;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v1, v0, Lm/c;->c:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iget-boolean v0, p0, Lk/z;->n:Z

    if-eqz v0, :cond_4

    sget-boolean v0, Lm/j;->a:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    sget-object v1, Lm/j;->p:Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    if-nez v1, :cond_2

    sget-boolean v1, Lm/j;->q:Z

    if-nez v1, :cond_2

    :try_start_0
    const-string v1, "org.hibernate.Hibernate"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v4, "isInitialized"

    new-array v5, v3, [Ljava/lang/Class;

    const-class v6, Ljava/lang/Object;

    aput-object v6, v5, v2

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lm/j;->p:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    sput-boolean v3, Lm/j;->q:Z

    :cond_2
    :goto_1
    sget-object v1, Lm/j;->p:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_3

    :try_start_1
    new-array v4, v3, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    :cond_3
    const/4 v2, 0x1

    :goto_2
    if-nez v2, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method

.method public final c(Lk/g0;)V
    .locals 3

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    iget-boolean v0, p1, Lk/a1;->g:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lk/a1;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lk/z;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/z;->b:Lm/c;

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    const-string v2, "\':"

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk/z;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lk/z;->f:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk/z;->e:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lk/z;->g:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lk/z;->b:Lm/c;

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    const-string v2, ":"

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lk/z;->g:Ljava/lang/String;

    :cond_3
    iget-object v0, p0, Lk/z;->g:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v0}, Lk/a1;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lk/z;

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object p1, p1, Lk/z;->b:Lm/c;

    invoke-virtual {v0, p1}, Lm/c;->a(Lm/c;)I

    move-result p1

    return p1
.end method

.method public final d(Lk/g0;Ljava/lang/Object;)V
    .locals 10

    iget-object v0, p0, Lk/z;->o:Lk/z$a;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    if-nez p2, :cond_0

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v0, v0, Lm/c;->f:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lk/z;->b:Lm/c;

    invoke-virtual {v2}, Lm/c;->c()Lg/b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lg/b;->serializeUsing()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/lang/Void;

    if-eq v3, v4, :cond_1

    invoke-interface {v2}, Lg/b;->serializeUsing()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk/q0;

    const/4 v3, 0x1

    iput-boolean v3, p0, Lk/z;->m:Z

    goto :goto_4

    :cond_1
    iget-object v2, p0, Lk/z;->i:Ljava/lang/String;

    if-eqz v2, :cond_5

    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v0, v3, :cond_4

    const-class v3, Ljava/lang/Double;

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v0, v3, :cond_3

    const-class v3, Ljava/lang/Float;

    if-ne v0, v3, :cond_5

    :cond_3
    new-instance v3, Lk/a0;

    invoke-direct {v3, v2}, Lk/a0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    :goto_1
    new-instance v3, Lk/w;

    invoke-direct {v3, v2}, Lk/w;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v2, v3

    goto :goto_3

    :cond_5
    move-object v2, v1

    :goto_3
    if-nez v2, :cond_6

    invoke-virtual {p1, v0}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v2

    :cond_6
    :goto_4
    new-instance v3, Lk/z$a;

    invoke-direct {v3, v2, v0}, Lk/z$a;-><init>(Lk/q0;Ljava/lang/Class;)V

    iput-object v3, p0, Lk/z;->o:Lk/z$a;

    :cond_7
    iget-object v0, p0, Lk/z;->o:Lk/z$a;

    iget-boolean v2, p0, Lk/z;->l:Z

    if-eqz v2, :cond_8

    iget-object v2, p0, Lk/z;->b:Lm/c;

    iget v2, v2, Lm/c;->j:I

    sget-object v3, Lk/b1;->q:Lk/b1;

    iget v3, v3, Lk/b1;->b:I

    or-int/2addr v2, v3

    goto :goto_5

    :cond_8
    iget-object v2, p0, Lk/z;->b:Lm/c;

    iget v2, v2, Lm/c;->j:I

    :goto_5
    move v8, v2

    if-nez p2, :cond_f

    iget-object p2, p1, Lk/g0;->j:Lk/a1;

    iget-object v1, p0, Lk/z;->b:Lm/c;

    iget-object v1, v1, Lm/c;->f:Ljava/lang/Class;

    const-class v2, Ljava/lang/Object;

    if-ne v1, v2, :cond_9

    sget v1, Lk/b1;->F:I

    invoke-virtual {p2, v1}, Lk/a1;->f(I)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p2}, Lk/a1;->E()V

    return-void

    :cond_9
    iget-object v1, v0, Lk/z$a;->b:Ljava/lang/Class;

    const-class v2, Ljava/lang/Number;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget p1, p0, Lk/z;->d:I

    sget-object v0, Lk/b1;->k:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    invoke-virtual {p2, p1, v0}, Lk/a1;->H(II)V

    return-void

    :cond_a
    const-class v2, Ljava/lang/String;

    if-ne v2, v1, :cond_b

    iget p1, p0, Lk/z;->d:I

    sget-object v0, Lk/b1;->j:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    invoke-virtual {p2, p1, v0}, Lk/a1;->H(II)V

    return-void

    :cond_b
    const-class v2, Ljava/lang/Boolean;

    if-ne v2, v1, :cond_c

    iget p1, p0, Lk/z;->d:I

    sget-object v0, Lk/b1;->l:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    invoke-virtual {p2, p1, v0}, Lk/a1;->H(II)V

    return-void

    :cond_c
    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget p1, p0, Lk/z;->d:I

    sget-object v0, Lk/b1;->i:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    invoke-virtual {p2, p1, v0}, Lk/a1;->H(II)V

    return-void

    :cond_d
    iget-object v3, v0, Lk/z$a;->a:Lk/q0;

    sget v0, Lk/b1;->F:I

    invoke-virtual {p2, v0}, Lk/a1;->f(I)Z

    move-result v0

    if-eqz v0, :cond_e

    instance-of v0, v3, Lk/h0;

    if-eqz v0, :cond_e

    invoke-virtual {p2}, Lk/a1;->E()V

    return-void

    :cond_e
    const/4 v5, 0x0

    iget-object p2, p0, Lk/z;->b:Lm/c;

    iget-object v6, p2, Lm/c;->b:Ljava/lang/String;

    iget-object v7, p2, Lm/c;->g:Ljava/lang/reflect/Type;

    move-object v4, p1

    invoke-interface/range {v3 .. v8}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    return-void

    :cond_f
    iget-object v2, p0, Lk/z;->b:Lm/c;

    iget-boolean v2, v2, Lm/c;->q:Z

    if-eqz v2, :cond_11

    iget-boolean v2, p0, Lk/z;->k:Z

    if-eqz v2, :cond_10

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    return-void

    :cond_10
    iget-boolean v2, p0, Lk/z;->j:Z

    if-eqz v2, :cond_11

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    return-void

    :cond_11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v3, v0, Lk/z$a;->b:Ljava/lang/Class;

    if-eq v2, v3, :cond_13

    iget-boolean v3, p0, Lk/z;->m:Z

    if-eqz v3, :cond_12

    goto :goto_6

    :cond_12
    invoke-virtual {p1, v2}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v0

    goto :goto_7

    :cond_13
    :goto_6
    iget-object v0, v0, Lk/z$a;->a:Lk/q0;

    :goto_7
    move-object v3, v0

    iget-object v0, p0, Lk/z;->i:Ljava/lang/String;

    if-eqz v0, :cond_1c

    instance-of v4, v3, Lk/w;

    if-nez v4, :cond_1c

    instance-of v4, v3, Lk/a0;

    if-nez v4, :cond_1c

    instance-of v2, v3, Lk/t;

    if-eqz v2, :cond_14

    check-cast v3, Lk/t;

    iget-object v0, p0, Lk/z;->h:Lk/j;

    invoke-interface {v3, p1, p2, v0}, Lk/t;->b(Lk/g0;Ljava/lang/Object;Lk/j;)V

    goto/16 :goto_b

    :cond_14
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v2, p2, Ljava/util/Date;

    if-eqz v2, :cond_16

    iget-object v1, p1, Lk/g0;->m:Ljava/text/SimpleDateFormat;

    if-nez v1, :cond_15

    new-instance v1, Ljava/text/SimpleDateFormat;

    iget-object v2, p1, Lk/g0;->q:Ljava/util/Locale;

    invoke-direct {v1, v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object v0, p1, Lk/g0;->p:Ljava/util/TimeZone;

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_15
    check-cast p2, Ljava/util/Date;

    invoke-virtual {v1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    goto :goto_b

    :cond_16
    instance-of v2, p2, [B

    if-eqz v2, :cond_1b

    check-cast p2, [B

    const-string v2, "gzip"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    const-string v2, "gzip,base64"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_8

    :cond_17
    const-string v1, "hex"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    if-eqz v0, :cond_18

    invoke-virtual {p1, p2}, Lk/a1;->y([B)V

    goto :goto_b

    :cond_18
    invoke-virtual {p1, p2}, Lk/a1;->n([B)V

    goto :goto_b

    :cond_19
    :goto_8
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    array-length v2, p2

    const/16 v3, 0x200

    if-ge v2, v3, :cond_1a

    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    array-length v3, p2

    invoke-direct {v2, v0, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    goto :goto_9

    :cond_1a
    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v2, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_9
    move-object v1, v2

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->finish()V

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->n([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lm/e;->a(Ljava/io/Closeable;)V

    goto :goto_b

    :catchall_0
    move-exception p1

    goto :goto_a

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Lf/d;

    const-string v0, "write gzipBytes error"

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_a
    invoke-static {v1}, Lm/e;->a(Ljava/io/Closeable;)V

    throw p1

    :cond_1b
    invoke-virtual {p1, p2}, Lk/g0;->q(Ljava/lang/Object;)V

    :goto_b
    return-void

    :cond_1c
    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-boolean v1, v0, Lm/c;->s:Z

    if-eqz v1, :cond_1e

    instance-of v1, v3, Lk/h0;

    if-eqz v1, :cond_1d

    check-cast v3, Lk/h0;

    iget-object v6, v0, Lm/c;->b:Ljava/lang/String;

    iget-object v7, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    const/4 v9, 0x1

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v3 .. v9}, Lk/h0;->m(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void

    :cond_1d
    instance-of v1, v3, Lk/m0;

    if-eqz v1, :cond_1e

    check-cast v3, Lk/m0;

    iget-object v6, v0, Lm/c;->b:Ljava/lang/String;

    iget-object v7, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    const/4 v9, 0x1

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v3 .. v9}, Lk/m0;->i(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void

    :cond_1e
    iget v1, p0, Lk/z;->d:I

    sget-object v4, Lk/b1;->p:Lk/b1;

    iget v4, v4, Lk/b1;->b:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_1f

    iget-object v0, v0, Lm/c;->f:Ljava/lang/Class;

    if-eq v2, v0, :cond_1f

    const-class v0, Lk/h0;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    check-cast v3, Lk/h0;

    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v6, v0, Lm/c;->b:Ljava/lang/String;

    iget-object v7, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    const/4 v9, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v3 .. v9}, Lk/h0;->m(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void

    :cond_1f
    iget-object v0, p0, Lk/z;->b:Lm/c;

    iget-object v6, v0, Lm/c;->b:Ljava/lang/String;

    iget-object v7, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    move-object v4, p1

    move-object v5, p2

    invoke-interface/range {v3 .. v8}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    return-void
.end method
