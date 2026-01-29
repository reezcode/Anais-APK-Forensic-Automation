.class public final Lk3/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "a41c3402eb0b4983a325a12cde17fc96m2p6"

    invoke-static {v0}, Lh3/a;->a(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "+3YHfs7VdJGzxblNMt4BzvHoTyGsBJyf43f9JQAFOWJIOY6RIwDqyq+4kJSfGnMG"

    invoke-static {v1, v0}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh3/a;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lk3/i;->a:[B

    return-void
.end method

.method public static a(Lf/e;Ls3/e;)V
    .locals 6

    invoke-static {}, Lk/j0;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lk3/i;->a:[B

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    const-string v2, "AES"

    :try_start_0
    array-length v3, v1

    const/16 v4, 0x10

    if-eq v3, v4, :cond_0

    const/4 v3, 0x0

    invoke-static {v1, v3, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    :cond_0
    invoke-static {v2}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    new-instance v3, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v3, v1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v2, 0x1

    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v5, Ld1/c;->g:[B

    invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v1, v2, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Lf4/i;->e:Lf4/i;

    const-string v1, "data"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lf4/i;

    array-length v3, p0

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    const-string v3, "java.util.Arrays.copyOf(this, size)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lf4/i;-><init>([B)V

    invoke-virtual {v2}, Lf4/i;->a()Ljava/lang/String;

    move-result-object p0

    sget-object v2, Lk3/b;->a:Ls3/w;

    new-instance v2, Ls3/p$a;

    invoke-direct {v2}, Ls3/p$a;-><init>()V

    invoke-virtual {v2, v1, p0}, Ls3/p$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/p$a;

    const-string p0, "deptId"

    const-string v1, "a41c3402eb0b4983a325a12cde17fc96"

    invoke-virtual {v2, p0, v1}, Ls3/p$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/p$a;

    invoke-static {}, Lk3/b;->a()Ls3/w;

    move-result-object p0

    new-instance v1, Ls3/y$a;

    invoke-direct {v1}, Ls3/y$a;-><init>()V

    invoke-virtual {v1, v0}, Ls3/y$a;->e(Ljava/lang/String;)Ls3/y$a;

    new-instance v0, Ls3/p;

    iget-object v3, v2, Ls3/p$a;->a:Ljava/util/ArrayList;

    iget-object v2, v2, Ls3/p$a;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v3, v2}, Ls3/p;-><init>(Ljava/util/List;Ljava/util/List;)V

    const-string v2, "body"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "POST"

    invoke-virtual {v1, v2, v0}, Ls3/y$a;->c(Ljava/lang/String;Ld1/f;)Ls3/y$a;

    const-string v0, "User-Agent"

    const-string v2, "WebCtrl/Android"

    invoke-virtual {v1, v0, v2}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v1}, Ls3/y$a;->a()Ls3/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Ls3/w;->a(Ls3/y;)Ls3/d;

    move-result-object p0

    check-cast p0, Lw3/e;

    invoke-virtual {p0, p1}, Lw3/e;->e(Ls3/e;)V

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
