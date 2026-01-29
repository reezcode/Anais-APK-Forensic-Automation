.class public final Ld4/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljavax/net/ssl/HostnameVerifier;


# static fields
.field public static final a:Ld4/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld4/c;

    invoke-direct {v0}, Ld4/c;-><init>()V

    sput-object v0, Ld4/c;->a:Ld4/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Ld4/c;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "Locale.US"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final b(Ljava/security/cert/X509Certificate;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/security/cert/X509Certificate;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ge v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 13

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "$this$utf8Size"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ltz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_c

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v1, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_b

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v1, :cond_9

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x80

    const-wide/16 v8, 0x1

    if-ge v6, v7, :cond_2

    add-long/2addr v3, v8

    goto :goto_7

    :cond_2
    const/16 v7, 0x800

    if-ge v6, v7, :cond_3

    const/4 v6, 0x2

    goto :goto_6

    :cond_3
    const v7, 0xd800

    if-lt v6, v7, :cond_8

    const v7, 0xdfff

    if-le v6, v7, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v10, v5, 0x1

    if-ge v10, v1, :cond_5

    invoke-virtual {p1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    :goto_3
    const v12, 0xdbff

    if-gt v6, v12, :cond_7

    const v6, 0xdc00

    if-lt v11, v6, :cond_7

    if-le v11, v7, :cond_6

    goto :goto_4

    :cond_6
    const/4 v6, 0x4

    int-to-long v6, v6

    add-long/2addr v3, v6

    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_7
    :goto_4
    add-long/2addr v3, v8

    move v5, v10

    goto :goto_2

    :cond_8
    :goto_5
    const/4 v6, 0x3

    :goto_6
    int-to-long v6, v6

    add-long/2addr v3, v6

    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    long-to-int p1, v3

    if-ne v0, p1, :cond_a

    goto :goto_8

    :cond_a
    const/4 v2, 0x0

    :goto_8
    return v2

    :cond_b
    const-string v0, "endIndex > string.length: "

    const-string v2, " > "

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->e(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    const-string p1, "endIndex < beginIndex: "

    const-string v0, " < "

    invoke-static {p1, v1, v0, v3}, Landroidx/activity/d;->d(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
    .locals 9

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "certificate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->a:[B

    const-string v0, "$this$canParseAsIpAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->f:Lkotlin/text/Regex;

    invoke-virtual {v0, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-static {p1}, Li/g;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x7

    invoke-virtual {p0, p2, v0}, Ld4/c;->b(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p2

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_8

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Li/g;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_7

    :cond_2
    invoke-virtual {p0, p1}, Ld4/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-virtual {p0, p2, v0}, Ld4/c;->b(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p2

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto/16 :goto_8

    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v3, Ld4/c;->a:Ld4/c;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v4, 0x1

    :goto_1
    if-nez v4, :cond_13

    const-string v4, "."

    invoke-static {p1, v4}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_13

    const-string v5, ".."

    invoke-static {p1, v5}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    const/4 v6, 0x0

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-nez v6, :cond_13

    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_13

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto/16 :goto_5

    :cond_a
    invoke-static {p1, v4}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_b

    invoke-static {p1, v4}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_b
    move-object v5, p1

    :goto_4
    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    invoke-static {v0, v4}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_c
    invoke-virtual {v3, v0}, Ld4/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "*"

    invoke-static {v0, v3}, Lkotlin/text/StringsKt;->c(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_d

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_6

    :cond_d
    const-string v3, "*."

    invoke-static {v0, v3}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    const/16 v4, 0x2a

    const/4 v6, 0x4

    invoke-static {v0, v4, v2, v6}, Lkotlin/text/StringsKt;->h(Ljava/lang/CharSequence;CII)I

    move-result v4

    const/4 v7, -0x1

    if-eq v4, v7, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v4, v8, :cond_f

    goto :goto_5

    :cond_f
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_5

    :cond_10
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "(this as java.lang.String).substring(startIndex)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v0}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_5

    :cond_11
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v3, v0

    if-lez v3, :cond_12

    const/16 v0, 0x2e

    add-int/lit8 v3, v3, -0x1

    invoke-static {v5, v0, v3, v6}, Lkotlin/text/StringsKt;->j(Ljava/lang/CharSequence;CII)I

    move-result v0

    if-eq v0, v7, :cond_12

    goto :goto_5

    :cond_12
    const/4 v0, 0x1

    goto :goto_6

    :cond_13
    :goto_5
    const/4 v0, 0x0

    :goto_6
    if-eqz v0, :cond_4

    :goto_7
    const/4 v1, 0x1

    :cond_14
    :goto_8
    return v1
.end method

.method public final verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z
    .locals 2

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ld4/c;->c(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {p2}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object p2

    aget-object p2, p2, v1

    if-eqz p2, :cond_1

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, p1, p2}, Ld4/c;->d(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    move v1, p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return v1
.end method
