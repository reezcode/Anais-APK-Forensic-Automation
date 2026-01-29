.class public final Lz3/h;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/q;

.field public final synthetic f:Lz3/f$e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/q;Lz3/f$e;)V
    .locals 0

    iput-object p2, p0, Lz3/h;->e:Lz3/q;

    iput-object p3, p0, Lz3/h;->f:Lz3/f$e;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lz3/h;->f:Lz3/f$e;

    iget-object v0, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v0, v0, Lz3/f;->c:Lz3/f$d;

    iget-object v1, p0, Lz3/h;->e:Lz3/q;

    invoke-virtual {v0, v1}, Lz3/f$d;->b(Lz3/q;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, La4/h;->c:La4/h$a;

    sget-object v1, La4/h;->a:La4/h;

    const-string v2, "Http2Connection.Listener failure for "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lz3/h;->f:Lz3/f$e;

    iget-object v3, v3, Lz3/f$e;->c:Lz3/f;

    iget-object v3, v3, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, La4/h;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, Lz3/h;->e:Lz3/q;

    sget-object v2, Lz3/b;->d:Lz3/b;

    invoke-virtual {v1, v2, v0}, Lz3/q;->c(Lz3/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
