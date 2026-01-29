.class public final Lj/f;
.super Lj/k;


# instance fields
.field public c:Lj/s;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lm/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i;",
            "Ljava/lang/Class<",
            "*>;",
            "Lm/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lj/k;-><init>(Ljava/lang/Class;Lm/c;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lj/f;->c:Lj/s;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lj/s;->e()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public final b(Li/a;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lj/f;->c:Lj/s;

    if-nez v0, :cond_0

    iget-object v0, p1, Li/a;->d:Li/i;

    invoke-virtual {p0, v0}, Lj/f;->e(Li/i;)Lj/s;

    :cond_0
    iget-object v0, p0, Lj/f;->c:Lj/s;

    iget-object v1, p0, Lj/k;->a:Lm/c;

    iget-object v1, v1, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v2, p3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_2

    iget-object v2, p1, Li/a;->h:Li/h;

    if-eqz v2, :cond_1

    iput-object p3, v2, Li/h;->d:Ljava/lang/reflect/Type;

    :cond_1
    if-eq v1, p3, :cond_2

    iget-object v0, p0, Lj/k;->b:Ljava/lang/Class;

    invoke-static {v0, p3, v1}, Lm/c;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object p3, p1, Li/a;->d:Li/i;

    invoke-virtual {p3, v1}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v0

    :cond_2
    instance-of p3, v0, Lj/n;

    if-eqz p3, :cond_3

    iget-object p3, p0, Lj/k;->a:Lm/c;

    iget v2, p3, Lm/c;->k:I

    if-eqz v2, :cond_3

    check-cast v0, Lj/n;

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, p3, v2}, Lj/n;->f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_3
    iget-object p3, p0, Lj/k;->a:Lm/c;

    iget-object v2, p3, Lm/c;->t:Ljava/lang/String;

    if-eqz v2, :cond_4

    instance-of v3, v0, Lj/e;

    if-eqz v3, :cond_4

    check-cast v0, Lj/e;

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, p3, v2}, Lj/e;->f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_4
    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-interface {v0, p1, v1, p3}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :goto_0
    instance-of v0, p3, [B

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lj/k;->a:Lm/c;

    iget-object v0, v0, Lm/c;->t:Ljava/lang/String;

    const-string v2, "gzip"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lj/k;->a:Lm/c;

    iget-object v0, v0, Lm/c;->t:Ljava/lang/String;

    const-string v2, "gzip,base64"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_5
    check-cast p3, [B

    :try_start_0
    new-instance v0, Ljava/util/zip/GZIPInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance p3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :cond_6
    :goto_1
    const/16 v2, 0x400

    new-array v2, v2, [B

    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_7

    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p3

    goto :goto_2

    :cond_7
    if-lez v3, :cond_6

    invoke-virtual {p3, v2, v1, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Lf/d;

    const-string p3, "unzip bytes error."

    invoke-direct {p2, p3, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_8
    :goto_2
    iget v0, p1, Li/a;->l:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_9

    invoke-virtual {p1}, Li/a;->p()Li/a$a;

    move-result-object p2

    iput-object p0, p2, Li/a$a;->c:Lj/k;

    iget-object p3, p1, Li/a;->h:Li/h;

    iput-object p3, p2, Li/a$a;->d:Li/h;

    iput v1, p1, Li/a;->l:I

    goto :goto_3

    :cond_9
    if-nez p2, :cond_a

    iget-object p1, p0, Lj/k;->a:Lm/c;

    iget-object p1, p1, Lm/c;->b:Ljava/lang/String;

    invoke-interface {p4, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_a
    invoke-virtual {p0, p2, p3}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    return-void
.end method

.method public final e(Li/i;)Lj/s;
    .locals 3

    iget-object v0, p0, Lj/f;->c:Lj/s;

    if-nez v0, :cond_1

    iget-object v0, p0, Lj/k;->a:Lm/c;

    invoke-virtual {v0}, Lm/c;->c()Lg/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lg/b;->deserializeUsing()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    if-eq v1, v2, :cond_0

    invoke-interface {v0}, Lg/b;->deserializeUsing()Ljava/lang/Class;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/s;

    iput-object p1, p0, Lj/f;->c:Lj/s;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lf/d;

    const-string v1, "create deserializeUsing ObjectDeserializer error"

    invoke-direct {v0, v1, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lj/k;->a:Lm/c;

    iget-object v1, v0, Lm/c;->f:Ljava/lang/Class;

    iget-object v0, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    invoke-virtual {p1, v1, v0}, Li/i;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    iput-object p1, p0, Lj/f;->c:Lj/s;

    :cond_1
    :goto_0
    iget-object p1, p0, Lj/f;->c:Lj/s;

    return-object p1
.end method
