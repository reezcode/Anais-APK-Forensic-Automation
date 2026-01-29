.class public final Lq2/b;
.super Lc3/a;


# static fields
.field public static final e:Lx2/c;


# instance fields
.field public final b:Landroid/database/sqlite/SQLiteOpenHelper;

.field public c:Lq2/c;

.field public final d:Lu2/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lq2/b;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lq2/b;->e:Lx2/c;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteOpenHelper;)V
    .locals 1

    invoke-direct {p0}, Lc3/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lq2/b;->c:Lq2/c;

    new-instance v0, Lu2/d;

    invoke-direct {v0}, Lu2/d;-><init>()V

    iput-object v0, p0, Lq2/b;->d:Lu2/d;

    iput-object p1, p0, Lq2/b;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    return-void
.end method


# virtual methods
.method public final b(Lc3/d;)V
    .locals 8

    sget-object v0, Lq2/b;->e:Lx2/c;

    sget-object v1, Lx2/b$a;->g:Lx2/b$a;

    iget-object v2, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc3/a$a;

    if-nez v2, :cond_0

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    const-string v3, "no connection has been saved when clear() called"

    move-object v4, v6

    move-object v5, v6

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v4, v2, Lc3/a$a;->a:Lc3/d;

    if-ne v4, p1, :cond_1

    iget p1, v2, Lc3/a$a;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, v2, Lc3/a$a;->b:I

    if-nez p1, :cond_2

    iget-object p1, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    const-string v3, "connection saved {} is not the one being cleared {}"

    move-object v5, p1

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final c()Lc3/d;
    .locals 5

    iget-object v0, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc3/a$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lc3/a$a;->a:Lc3/d;

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lq2/b;->c:Lq2/c;

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lq2/b;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lq2/c;

    invoke-direct {v1, v0}, Lq2/c;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v1, p0, Lq2/b;->c:Lq2/c;

    sget-object v2, Lq2/b;->e:Lx2/c;

    iget-object v3, p0, Lq2/b;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    const-string v4, "created connection {} for db {}, helper {}"

    invoke-virtual {v2, v4, v1, v0, v3}, Lx2/c;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "Getting a writable database from helper "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lq2/b;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0

    :cond_2
    sget-object v1, Lq2/b;->e:Lx2/c;

    iget-object v2, p0, Lq2/b;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    const-string v3, "{}: returning read-write connection {}, helper {}"

    invoke-virtual {v1, v3, p0, v0, v2}, Lx2/c;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, p0, Lq2/b;->c:Lq2/c;

    return-object v0
.end method

.method public final d(Lc3/d;)Z
    .locals 4

    iget-object v0, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc3/a$a;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    new-instance v2, Lc3/a$a;

    invoke-direct {v2, p1}, Lc3/a$a;-><init>(Lc3/d;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lc3/a$a;->a:Lc3/d;

    if-ne v2, p1, :cond_1

    iget p1, v0, Lc3/a$a;->b:I

    add-int/2addr p1, v1

    iput p1, v0, Lc3/a$a;->b:I

    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    new-instance v1, Ljava/sql/SQLException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "trying to save connection "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but already have saved connection "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Lc3/a$a;->a:Lc3/d;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lq2/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
