.class public abstract Lr2/b;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# static fields
.field public static d:Lx2/c;


# instance fields
.field public b:Lq2/b;

.field public volatile c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lr2/b;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lr2/b;->d:Lx2/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "mydb.db"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    new-instance p1, Lq2/b;

    invoke-direct {p1, p0}, Lq2/b;-><init>(Landroid/database/sqlite/SQLiteOpenHelper;)V

    iput-object p1, p0, Lr2/b;->b:Lq2/b;

    iput-boolean v2, p0, Lr2/b;->c:Z

    sget-object p1, Lr2/b;->d:Lx2/c;

    iget-object v0, p0, Lr2/b;->b:Lq2/b;

    const-string v1, "{}: constructed connectionSource {}"

    invoke-virtual {p1, v1, p0, v0}, Lx2/c;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Lc3/c;
    .locals 9

    iget-boolean v0, p0, Lr2/b;->c:Z

    if-nez v0, :cond_0

    sget-object v1, Lr2/b;->d:Lx2/c;

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3}, Ljava/lang/IllegalStateException;-><init>()V

    sget-object v2, Lx2/b$a;->f:Lx2/b$a;

    sget-object v7, Lx2/c;->b:Ljava/lang/Object;

    const/4 v8, 0x0

    const-string v4, "Getting connectionSource was called after closed"

    move-object v5, v7

    move-object v6, v7

    invoke-virtual/range {v1 .. v8}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lr2/b;->b:Lq2/b;

    return-object v0
.end method

.method public final b(Ljava/lang/Class;)Lt2/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D::",
            "Lt2/g<",
            "TT;*>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TD;"
        }
    .end annotation

    invoke-virtual {p0}, Lr2/b;->a()Lc3/c;

    move-result-object v0

    invoke-static {v0, p1}, Lt2/h;->a(Lc3/c;Ljava/lang/Class;)Lt2/g;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Lc3/c;)V
.end method

.method public final close()V
    .locals 1

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v0, p0, Lr2/b;->b:Lq2/b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr2/b;->c:Z

    return-void
.end method

.method public abstract e(Lc3/c;)V
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    invoke-virtual {p0}, Lr2/b;->a()Lc3/c;

    move-result-object v0

    check-cast v0, Lc3/a;

    invoke-virtual {v0}, Lc3/a;->a()Lc3/d;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lq2/c;

    invoke-direct {v1, p1}, Lq2/c;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    :try_start_0
    move-object p1, v0

    check-cast p1, Lq2/b;

    invoke-virtual {p1, v1}, Lq2/b;->d(Lc3/d;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not save special connection"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {p0, v0}, Lr2/b;->c(Lc3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    check-cast v0, Lq2/b;

    invoke-virtual {v0, v1}, Lq2/b;->b(Lc3/d;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v2

    if-eqz p1, :cond_2

    check-cast v0, Lq2/b;

    invoke-virtual {v0, v1}, Lq2/b;->b(Lc3/d;)V

    :cond_2
    throw v2
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    invoke-virtual {p0}, Lr2/b;->a()Lc3/c;

    move-result-object p2

    check-cast p2, Lc3/a;

    invoke-virtual {p2}, Lc3/a;->a()Lc3/d;

    move-result-object p3

    if-nez p3, :cond_0

    new-instance p3, Lq2/c;

    invoke-direct {p3, p1}, Lq2/c;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    :try_start_0
    move-object p1, p2

    check-cast p1, Lq2/b;

    invoke-virtual {p1, p3}, Lq2/b;->d(Lc3/d;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Could not save special connection"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {p0, p2}, Lr2/b;->e(Lc3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    check-cast p2, Lq2/b;

    invoke-virtual {p2, p3}, Lq2/b;->b(Lc3/d;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_2

    check-cast p2, Lq2/b;

    invoke-virtual {p2, p3}, Lq2/b;->b(Lc3/d;)V

    :cond_2
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
