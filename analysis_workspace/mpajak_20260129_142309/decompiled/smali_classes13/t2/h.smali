.class public final Lt2/h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt2/h$a;
    }
.end annotation


# static fields
.field public static a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lt2/h$a;",
            "Lt2/g<",
            "**>;>;"
        }
    .end annotation
.end field

.field public static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lt2/g<",
            "**>;>;"
        }
    .end annotation
.end field

.field public static c:Lx2/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lt2/h;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lt2/h;->c:Lx2/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a(Lc3/c;Ljava/lang/Class;)Lt2/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D::",
            "Lt2/g<",
            "TT;*>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc3/c;",
            "Ljava/lang/Class<",
            "TT;>;)TD;"
        }
    .end annotation

    const-class v0, Lt2/h;

    monitor-enter v0

    if-eqz p0, :cond_6

    :try_start_0
    new-instance v1, Lt2/h$a;

    invoke-direct {v1, p0, p1}, Lt2/h$a;-><init>(Lc3/c;Ljava/lang/Class;)V

    invoke-static {v1}, Lt2/h;->c(Lt2/h$a;)Lt2/g;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    const-class v1, Ld3/a;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ld3/a;

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ld3/a;->daoClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Void;

    if-eq v2, v3, :cond_4

    invoke-interface {v1}, Ld3/a;->daoClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lt2/a;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ld3/a;->daoClass()Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v4, 0x1

    aput-object p1, v2, v4

    invoke-static {v1, v2}, Lt2/h;->b(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    if-nez v5, :cond_3

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p0, v2, v3

    invoke-static {v1, v2}, Lt2/h;->b(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/sql/SQLException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find public constructor with ConnectionSource and optional Class parameters "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".  Missing static on class?"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_0
    :try_start_2
    invoke-virtual {v5, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt2/g;

    sget-object v3, Lt2/h;->c:Lx2/c;

    const-string v4, "created dao for class {} from constructor"

    invoke-virtual {v3, v4, p1}, Lx2/c;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catch_0
    move-exception p0

    :try_start_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not call the constructor in class "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p0

    throw p0

    :cond_4
    :goto_1
    move-object v1, p0

    check-cast v1, Lq2/b;

    iget-object v1, v1, Lq2/b;->d:Lu2/d;

    invoke-virtual {v1, p0, p1}, Lu2/d;->b(Lc3/c;Ljava/lang/Class;)Ld3/b;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object v1, Lt2/a;->j:Lt2/a$a;

    new-instance v1, Lt2/b;

    invoke-direct {v1, p0, p1}, Lt2/b;-><init>(Lc3/c;Ljava/lang/Class;)V

    move-object v2, v1

    goto :goto_2

    :cond_5
    sget-object v2, Lt2/a;->j:Lt2/a$a;

    new-instance v2, Lt2/c;

    invoke-direct {v2, p0, v1}, Lt2/c;-><init>(Lc3/c;Ld3/b;)V

    :goto_2
    sget-object v1, Lt2/h;->c:Lx2/c;

    const-string v3, "created dao for class {} with reflection"

    invoke-virtual {v1, v3, p1}, Lx2/c;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_3
    invoke-static {p0, v2}, Lt2/h;->d(Lc3/c;Lt2/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v2

    :cond_6
    :try_start_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "connectionSource argument cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static b(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/reflect/Constructor;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v5, v4

    array-length v6, p1

    if-ne v5, v6, :cond_2

    const/4 v5, 0x0

    :goto_1
    array-length v6, v4

    if-ge v5, v6, :cond_1

    aget-object v6, v4, v5

    aget-object v7, p1, v5

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_0

    const/4 v4, 0x0

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lt2/h$a;)Lt2/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt2/h$a;",
            ")",
            "Lt2/g<",
            "**>;"
        }
    .end annotation

    sget-object v0, Lt2/h;->a:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lt2/h;->a:Ljava/util/HashMap;

    :cond_0
    sget-object v0, Lt2/h;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt2/g;

    if-nez p0, :cond_1

    const/4 p0, 0x0

    :cond_1
    return-object p0
.end method

.method public static declared-synchronized d(Lc3/c;Lt2/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/c;",
            "Lt2/g<",
            "**>;)V"
        }
    .end annotation

    const-class v0, Lt2/h;

    monitor-enter v0

    if-eqz p0, :cond_1

    :try_start_0
    new-instance v1, Lt2/h$a;

    invoke-interface {p1}, Lt2/g;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lt2/h$a;-><init>(Lc3/c;Ljava/lang/Class;)V

    sget-object p0, Lt2/h;->a:Ljava/util/HashMap;

    if-nez p0, :cond_0

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    sput-object p0, Lt2/h;->a:Ljava/util/HashMap;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lt2/h;->a:Ljava/util/HashMap;

    invoke-virtual {p0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "connectionSource argument cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized e(Lc3/c;Lt2/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/c;",
            "Lt2/g<",
            "**>;)V"
        }
    .end annotation

    const-class v0, Lt2/h;

    monitor-enter v0

    if-eqz p0, :cond_1

    :try_start_0
    new-instance v1, Lt2/h$a;

    check-cast p1, Lt2/a;

    iget-object p1, p1, Lt2/a;->e:Ljava/lang/Class;

    invoke-direct {v1, p0, p1}, Lt2/h$a;-><init>(Lc3/c;Ljava/lang/Class;)V

    sget-object p0, Lt2/h;->a:Ljava/util/HashMap;

    if-eqz p0, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "connectionSource argument cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p0
.end method
