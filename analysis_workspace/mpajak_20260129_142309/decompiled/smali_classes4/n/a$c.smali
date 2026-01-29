.class public final Ln/a$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Ln/a$d;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Ln/a;


# direct methods
.method public constructor <init>(Ln/a;Ln/a$d;)V
    .locals 0

    iput-object p1, p0, Ln/a$c;->d:Ln/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln/a$c;->a:Ln/a$d;

    iget-boolean p2, p2, Ln/a$d;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p1, Ln/a;->h:I

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Ln/a$c;->b:[Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ln/a$c;->d:Ln/a;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ln/a;->a(Ln/a;Ln/a$c;Z)V

    return-void
.end method

.method public final b()Ljava/io/File;
    .locals 5

    iget-object v0, p0, Ln/a$c;->d:Ln/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln/a$c;->a:Ln/a$d;

    iget-object v2, v1, Ln/a$d;->f:Ln/a$c;

    if-ne v2, p0, :cond_1

    iget-boolean v2, v1, Ln/a$d;->e:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, Ln/a$c;->b:[Z

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    :cond_0
    iget-object v1, v1, Ln/a$d;->d:[Ljava/io/File;

    aget-object v1, v1, v3

    iget-object v2, p0, Ln/a$c;->d:Ln/a;

    iget-object v2, v2, Ln/a;->b:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
