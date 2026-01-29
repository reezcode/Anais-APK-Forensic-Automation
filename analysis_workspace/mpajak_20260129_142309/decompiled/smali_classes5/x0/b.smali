.class public final Lx0/b;
.super Ljava/lang/Object;


# static fields
.field public static b:Lx0/b;


# instance fields
.field public a:Lx0/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/b;

    invoke-direct {v0}, Lx0/b;-><init>()V

    sput-object v0, Lx0/b;->b:Lx0/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/b;->a:Lx0/a;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lx0/a;
    .locals 2

    sget-object v0, Lx0/b;->b:Lx0/b;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lx0/b;->a:Lx0/a;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    new-instance v1, Lx0/a;

    invoke-direct {v1, p0}, Lx0/a;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lx0/b;->a:Lx0/a;

    :cond_1
    iget-object p0, v0, Lx0/b;->a:Lx0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
