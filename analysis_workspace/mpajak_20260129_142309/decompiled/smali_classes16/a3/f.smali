.class public final La3/f;
.super La3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "La3/a<",
        "TT;TID;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            "[",
            "Lv2/g;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, La3/a;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;)V

    return-void
.end method

.method public static f(Lu2/c;Ld3/c;Lv2/g;)La3/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Lv2/g;",
            ")",
            "La3/f<",
            "TT;TID;>;"
        }
    .end annotation

    if-nez p2, :cond_1

    iget-object p2, p1, Ld3/c;->f:Lv2/g;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/sql/SQLException;

    const-string p2, "Cannot query-for-id with "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object p1, p1, Ld3/c;->b:Ljava/lang/Class;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because it doesn\'t have an id field"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v1, p1, Ld3/c;->c:Ljava/lang/String;

    const-string v2, "SELECT * FROM "

    invoke-static {p0, v0, v2, v1}, La3/b;->c(Lu2/c;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p2, v0}, La3/b;->d(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, La3/f;

    const/4 v1, 0x1

    new-array v1, v1, [Lv2/g;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    iget-object p2, p1, Ld3/c;->d:[Lv2/g;

    invoke-direct {v0, p1, p0, v1, p2}, La3/f;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;)V

    return-object v0
.end method


# virtual methods
.method public final g(Lc3/d;Ljava/lang/Object;Lt2/m;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "TID;",
            "Lt2/m;",
            ")TT;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-interface {p3}, Lt2/m;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, La3/b;->c:Lv2/g;

    invoke-virtual {v3, p2}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    aput-object p2, v1, v2

    iget-object p2, p0, La3/b;->d:Ljava/lang/String;

    check-cast p1, Lq2/c;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p1, Lq2/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1, v1}, Lq2/c;->e([Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, p2, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v4, Lq2/d;

    invoke-direct {v4, v3, p3}, Lq2/d;-><init>(Landroid/database/Cursor;Lt2/m;)V

    sget-object p3, Lq2/c;->d:Lx2/c;

    const-string v5, "{}: queried for one result: {}"

    invoke-virtual {p3, v5, p1, p2}, Lx2/c;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lq2/d;->b()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v4}, La3/a;->a(Lc3/e;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4}, Lq2/d;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object v2, Lc3/d;->a:Ljava/lang/Object;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    const-string p1, "{} arguments: {}"

    const-string p2, "query-for-id"

    if-nez v2, :cond_3

    sget-object p3, La3/b;->f:Lx2/c;

    iget-object v3, p0, La3/b;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "{} using \'{}\' and {} args, got no results"

    goto :goto_1

    :cond_3
    sget-object p3, Lc3/d;->a:Ljava/lang/Object;

    if-eq v2, p3, :cond_4

    sget-object p3, La3/b;->f:Lx2/c;

    iget-object v3, p0, La3/b;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v4, "{} using \'{}\' and {} args, got 1 result"

    :goto_1
    invoke-virtual {p3, v4, p2, v3, v0}, Lx2/c;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p3, La3/b;->f:Lx2/c;

    invoke-virtual {p3, p1, p2, v1}, Lx2/c;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_4
    sget-object v3, La3/b;->f:Lx2/c;

    iget-object v8, p0, La3/b;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    sget-object v4, Lx2/b$a;->g:Lx2/b$a;

    const/4 v5, 0x0

    const/4 v10, 0x0

    const-string v6, "{} using \'{}\' and {} args, got >1 results"

    const-string v7, "query-for-id"

    invoke-virtual/range {v3 .. v10}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    sget-object p3, La3/b;->f:Lx2/c;

    invoke-virtual {p3, p1, p2, v1}, Lx2/c;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ljava/sql/SQLException;

    const-string p3, " got more than 1 result: "

    invoke-static {p2, p3}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object p3, p0, La3/b;->d:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    move-object v2, v3

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :goto_2
    :try_start_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "queryForOne from database failed: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    move-object v3, v2

    :goto_4
    if-eqz v3, :cond_5

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_5
    throw p1
.end method
