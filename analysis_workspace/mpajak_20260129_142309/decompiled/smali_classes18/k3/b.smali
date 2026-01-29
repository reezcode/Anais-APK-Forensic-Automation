.class public final Lk3/b;
.super Ljava/lang/Object;


# static fields
.field public static a:Ls3/w;

.field public static final b:Ls3/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Ls3/u;->f:Ls3/u$a;

    const-string v1, "application/json"

    invoke-virtual {v0, v1}, Ls3/u$a;->a(Ljava/lang/String;)Ls3/u;

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, Ls3/u$a;->b(Ljava/lang/String;)Ls3/u;

    move-result-object v0

    sput-object v0, Lk3/b;->b:Ls3/u;

    return-void
.end method

.method public static a()Ls3/w;
    .locals 4

    sget-object v0, Lk3/b;->a:Ls3/w;

    if-nez v0, :cond_0

    new-instance v0, Ls3/w$a;

    invoke-direct {v0}, Ls3/w$a;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "unit"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lt3/c;->b()I

    move-result v3

    iput v3, v0, Ls3/w$a;->x:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lt3/c;->b()I

    move-result v1

    iput v1, v0, Ls3/w$a;->y:I

    new-instance v1, Ls3/w;

    invoke-direct {v1, v0}, Ls3/w;-><init>(Ls3/w$a;)V

    sput-object v1, Lk3/b;->a:Ls3/w;

    :cond_0
    sget-object v0, Lk3/b;->a:Ls3/w;

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/io/File;Ls3/e;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "UUID.randomUUID().toString()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "boundary"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lf4/i;->f:Lf4/i$a;

    invoke-virtual {v3, v2}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v2

    sget-object v3, Ls3/v;->f:Ls3/u;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-object v4, Ls3/v;->g:Ls3/u;

    const-string v5, "type"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v4, Ls3/u;->b:Ljava/lang/String;

    const-string v6, "multipart"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "media"

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lk3/b;->b:Ls3/u;

    const-string v8, "file"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "$this$asRequestBody"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ls3/z;

    invoke-direct {v8, v1, v7}, Ls3/z;-><init>(Ljava/io/File;Ls3/u;)V

    const-string v1, "name"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "body"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Ls3/v$b;->c:Ls3/v$b$a;

    invoke-virtual {v9, v5, v6, v8}, Ls3/v$b$a;->a(Ljava/lang/String;Ljava/lang/String;Ld1/f;)Ls3/v$b;

    move-result-object v5

    const-string v6, "part"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v5, "key"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "value"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "$this$toRequestBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v8, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    int-to-long v10, v1

    const/4 v1, 0x0

    int-to-long v12, v1

    int-to-long v14, v8

    invoke-static/range {v10 .. v15}, Lt3/c;->c(JJJ)V

    new-instance v10, Ls3/a0;

    const/4 v11, 0x0

    invoke-direct {v10, v0, v11, v8, v1}, Ls3/a0;-><init>([BLs3/u;II)V

    invoke-virtual {v9, v5, v11, v10}, Ls3/v$b$a;->a(Ljava/lang/String;Ljava/lang/String;Ld1/f;)Ls3/v$b;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lk3/b;->a()Ls3/w;

    move-result-object v0

    new-instance v1, Ls3/y$a;

    invoke-direct {v1}, Ls3/y$a;-><init>()V

    const-string v5, "https://thumbsnap.com/api/upload"

    invoke-virtual {v1, v5}, Ls3/y$a;->e(Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_0

    new-instance v5, Ls3/v;

    invoke-static {v3}, Lt3/c;->z(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v5, v2, v4, v3}, Ls3/v;-><init>(Lf4/i;Ls3/u;Ljava/util/List;)V

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "POST"

    invoke-virtual {v1, v2, v5}, Ls3/y$a;->c(Ljava/lang/String;Ld1/f;)Ls3/y$a;

    invoke-virtual {v1}, Ls3/y$a;->a()Ls3/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/w;->a(Ls3/y;)Ls3/d;

    move-result-object v0

    check-cast v0, Lw3/e;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lw3/e;->e(Ls3/e;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart body must have at least one part."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "multipart != "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
