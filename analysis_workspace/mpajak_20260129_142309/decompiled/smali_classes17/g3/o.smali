.class public final Lg3/o;
.super Lr2/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lr2/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final c(Lc3/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg3/o;->f(Lc3/c;)V

    return-void
.end method

.method public final e(Lc3/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg3/o;->l(Lc3/c;)V

    invoke-virtual {p0, p1}, Lg3/o;->f(Lc3/c;)V

    return-void
.end method

.method public final f(Lc3/c;)V
    .locals 1

    :try_start_0
    const-class v0, Lcom/superbock/bean/AdInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/AInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/BInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/CInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/DInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/EInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/FInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/GInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/HInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/IInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/JInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/KInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/LInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/MInfo;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/SysNews;

    invoke-static {p1, v0}, Ld3/d;->b(Lc3/c;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final l(Lc3/c;)V
    .locals 1

    :try_start_0
    const-class v0, Lcom/superbock/bean/AdInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/AInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/BInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/CInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/DInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/EInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/FInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/GInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/HInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/IInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/JInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/KInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/LInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/MInfo;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I

    const-class v0, Lcom/superbock/bean/SysNews;

    invoke-static {p1, v0}, Ld3/d;->g(Lc3/c;Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
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
    invoke-virtual {p0, p2}, Lg3/o;->l(Lc3/c;)V

    invoke-virtual {p0, p2}, Lg3/o;->f(Lc3/c;)V
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
