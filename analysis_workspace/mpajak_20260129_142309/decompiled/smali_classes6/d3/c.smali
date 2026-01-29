.class public final Ld3/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final j:[Lv2/g;


# instance fields
.field public final a:Lt2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/a<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public final d:[Lv2/g;

.field public final e:[Lv2/g;

.field public final f:Lv2/g;

.field public final g:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final h:Z

.field public i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lv2/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lv2/g;

    sput-object v0, Ld3/c;->j:[Lv2/g;

    return-void
.end method

.method public constructor <init>(Lc3/c;Lt2/a;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/c;",
            "Lt2/a<",
            "TT;TID;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lq2/b;

    iget-object v1, v0, Lq2/b;->d:Lu2/d;

    invoke-static {p3}, Ld3/b;->c(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lq2/b;->d:Lu2/d;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ld3/b;

    invoke-static {p1, p3, v1}, Ld3/b;->b(Lc3/c;Ljava/lang/Class;Ljava/lang/String;)[Lv2/g;

    move-result-object p1

    invoke-direct {v0, p3, v1, p1}, Ld3/b;-><init>(Ljava/lang/Class;Ljava/lang/String;[Lv2/g;)V

    invoke-direct {p0, p2, v0}, Ld3/c;-><init>(Lt2/a;Ld3/b;)V

    return-void
.end method

.method public constructor <init>(Lt2/a;Ld3/b;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Lt2/a<",
            "TT;TID;>;",
            "Ld3/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/c;->a:Lt2/a;

    iget-object p1, p2, Ld3/b;->a:Ljava/lang/Class;

    iput-object p1, p0, Ld3/c;->b:Ljava/lang/Class;

    iget-object p1, p2, Ld3/b;->b:Ljava/lang/String;

    iput-object p1, p0, Ld3/c;->c:Ljava/lang/String;

    iget-object p1, p2, Ld3/b;->d:[Lv2/g;

    if-eqz p1, :cond_e

    iput-object p1, p0, Ld3/c;->d:[Lv2/g;

    const/4 v0, 0x0

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x1

    if-ge v3, v1, :cond_5

    aget-object v6, p1, v3

    iget-boolean v7, v6, Lv2/g;->f:Z

    if-nez v7, :cond_0

    iget-boolean v7, v6, Lv2/g;->g:Z

    if-nez v7, :cond_0

    invoke-virtual {v6}, Lv2/g;->m()Z

    move-result v7

    if-eqz v7, :cond_1

    :cond_0
    if-nez v0, :cond_4

    move-object v0, v6

    :cond_1
    iget-object v6, v6, Lv2/g;->e:Lv2/e;

    iget-boolean v7, v6, Lv2/e;->B:Z

    if-eqz v7, :cond_2

    const/4 v5, 0x1

    :cond_2
    iget-boolean v6, v6, Lv2/e;->F:Z

    if-eqz v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "More than 1 idField configured for class "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v1, p0, Ld3/c;->b:Ljava/lang/Class;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iput-object v0, p0, Ld3/c;->f:Lv2/g;

    iget-object p1, p2, Ld3/b;->e:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_a

    iget-object p1, p2, Ld3/b;->a:Ljava/lang/Class;

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_8

    aget-object v7, v0, v3

    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v8, v8

    if-nez v8, :cond_7

    invoke-virtual {v7}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v0

    if-nez v0, :cond_6

    :try_start_1
    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Could not open access to constructor for "

    invoke-static {v0, p1}, Landroidx/activity/d;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_2
    iput-object v7, p2, Ld3/b;->e:Ljava/lang/reflect/Constructor;

    goto :goto_3

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object p2

    const-string v0, "Can\'t find a no-arg constructor for "

    if-nez p2, :cond_9

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-static {v0, p1}, Landroidx/activity/d;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".  Missing static on inner class?"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_1
    move-exception p2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t lookup declared constructors for "

    invoke-static {v1, p1}, Landroidx/activity/d;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_a
    :goto_3
    iget-object p1, p2, Ld3/b;->e:Ljava/lang/reflect/Constructor;

    iput-object p1, p0, Ld3/c;->g:Ljava/lang/reflect/Constructor;

    iput-boolean v5, p0, Ld3/c;->h:Z

    if-nez v4, :cond_b

    sget-object p1, Ld3/c;->j:[Lv2/g;

    iput-object p1, p0, Ld3/c;->e:[Lv2/g;

    goto :goto_5

    :cond_b
    new-array p1, v4, [Lv2/g;

    iput-object p1, p0, Ld3/c;->e:[Lv2/g;

    iget-object p1, p0, Ld3/c;->d:[Lv2/g;

    array-length p2, p1

    const/4 v0, 0x0

    :goto_4
    if-ge v2, p2, :cond_d

    aget-object v1, p1, v2

    iget-object v3, v1, Lv2/g;->e:Lv2/e;

    iget-boolean v3, v3, Lv2/e;->F:Z

    if-eqz v3, :cond_c

    iget-object v3, p0, Ld3/c;->e:[Lv2/g;

    aput-object v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_d
    :goto_5
    return-void

    :cond_e
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "Field types have not been extracted in table config"

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ld3/c;->a:Lt2/a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Ld3/c;->g:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/a;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ly2/a;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not create object for "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ld3/c;->g:Ljava/lang/reflect/Constructor;

    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lv2/g;
    .locals 7

    iget-object v0, p0, Ld3/c;->i:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Ld3/c;->d:[Lv2/g;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    iget-object v6, v5, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Ld3/c;->i:Ljava/util/HashMap;

    :cond_1
    iget-object v0, p0, Ld3/c;->i:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv2/g;

    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    iget-object v0, p0, Ld3/c;->d:[Lv2/g;

    array-length v2, v0

    :goto_1
    if-ge v1, v2, :cond_4

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lv2/g;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You should use columnName \'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v3, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' for table "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld3/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " instead of fieldName \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lv2/g;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown column name \'"

    const-string v2, "\' in table "

    invoke-static {v1, p1, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v1, p0, Ld3/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
