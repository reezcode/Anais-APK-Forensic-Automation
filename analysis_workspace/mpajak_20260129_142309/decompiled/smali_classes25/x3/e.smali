.class public final Lx3/e;
.super Ljava/lang/Object;


# annotations
.annotation build Lkotlin/jvm/JvmName;
    name = "HttpHeaders"
.end annotation


# static fields
.field public static final a:Lf4/i;

.field public static final b:Lf4/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    const-string v1, "\"\\"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lx3/e;->a:Lf4/i;

    const-string v1, "\t ,="

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    sput-object v0, Lx3/e;->b:Lf4/i;

    return-void
.end method

.method public static final a(Ls3/b0;)Z
    .locals 8

    const-string v0, "$this$promisesBody"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls3/b0;->b:Ls3/y;

    iget-object v0, v0, Ls3/y;->c:Ljava/lang/String;

    const-string v1, "HEAD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Ls3/b0;->e:I

    const/16 v2, 0x64

    const/4 v3, 0x1

    if-lt v0, v2, :cond_1

    const/16 v2, 0xc8

    if-lt v0, v2, :cond_2

    :cond_1
    const/16 v2, 0xcc

    if-eq v0, v2, :cond_2

    const/16 v2, 0x130

    if-eq v0, v2, :cond_2

    return v3

    :cond_2
    invoke-static {p0}, Lt3/c;->l(Ls3/b0;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_4

    const-string v0, "Transfer-Encoding"

    invoke-static {p0, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "chunked"

    invoke-static {v0, p0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    :goto_0
    return v3
.end method

.method public static final b(Ls3/l;Ls3/s;Ls3/r;)V
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, "$this$receiveHeaders"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "url"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "headers"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ls3/l;->b:Ld1/d;

    if-ne v1, v5, :cond_0

    return-void

    :cond_0
    sget-object v5, Ls3/k;->n:Ls3/k$a;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "Set-Cookie"

    const-string v6, "name"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Ls3/r;->b:[Ljava/lang/String;

    array-length v6, v6

    const/4 v7, 0x2

    div-int/2addr v6, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v6, :cond_3

    invoke-virtual {v0, v10}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    if-nez v11, :cond_1

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v7}, Ljava/util/ArrayList;-><init>(I)V

    :cond_1
    invoke-virtual {v0, v10}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    if-eqz v11, :cond_4

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v4, "Collections.unmodifiableList(result)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_1
    move-object v4, v0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v10, v6, :cond_26

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCookie"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x3b

    const/4 v8, 0x6

    invoke-static {v12, v15, v9, v9, v8}, Lt3/c;->h(Ljava/lang/String;CIII)I

    move-result v0

    const/16 v8, 0x3d

    invoke-static {v12, v8, v9, v0, v7}, Lt3/c;->h(Ljava/lang/String;CIII)I

    move-result v15

    if-ne v15, v0, :cond_6

    :cond_5
    :goto_3
    move-object/from16 v37, v3

    move-object/from16 v16, v4

    move-object/from16 v38, v5

    :goto_4
    const/4 v8, 0x0

    goto/16 :goto_11

    :cond_6
    invoke-static {v12, v9, v15}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v17

    const/16 v19, 0x1

    if-nez v17, :cond_7

    const/16 v17, 0x1

    goto :goto_5

    :cond_7
    const/16 v17, 0x0

    :goto_5
    if-nez v17, :cond_5

    invoke-static/range {v18 .. v18}, Lt3/c;->n(Ljava/lang/String;)I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v15, v15, 0x1

    invoke-static {v12, v15, v0}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lt3/c;->n(Ljava/lang/String;)I

    move-result v15

    if-eq v15, v9, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v9

    const-wide v20, 0xe677d21fdbffL

    const-wide/16 v22, -0x1

    move-wide/from16 v30, v20

    move-wide/from16 v28, v22

    const/4 v15, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v32, 0x0

    :goto_6
    const-wide v33, 0x7fffffffffffffffL

    const-wide/high16 v35, -0x8000000000000000L

    move-object/from16 v37, v3

    move-object/from16 v16, v4

    if-ge v0, v9, :cond_16

    const/16 v3, 0x3b

    invoke-static {v12, v3, v0, v9}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v4

    invoke-static {v12, v8, v0, v4}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v3

    invoke-static {v12, v0, v3}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    if-ge v3, v4, :cond_a

    add-int/lit8 v3, v3, 0x1

    invoke-static {v12, v3, v4}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_a
    const-string v3, ""

    :goto_7
    const-string v8, "expires"

    invoke-static {v0, v8}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v5, v3, v0}, Ls3/k$a;->b(Ljava/lang/String;I)J

    move-result-wide v30
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v38, v5

    goto :goto_9

    :catch_0
    move-object/from16 v38, v5

    goto/16 :goto_a

    :cond_b
    const-string v8, "max-age"

    invoke-static {v0, v8}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_f

    :try_start_1
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v28
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const-wide/16 v33, 0x0

    cmp-long v0, v28, v33

    if-gtz v0, :cond_c

    goto :goto_8

    :cond_c
    move-wide/from16 v35, v28

    :goto_8
    move-object/from16 v38, v5

    move-wide/from16 v28, v35

    goto :goto_9

    :catch_1
    move-exception v0

    move-object v8, v0

    :try_start_2
    new-instance v0, Lkotlin/text/Regex;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v38, v5

    :try_start_3
    const-string v5, "-?\\d+"

    invoke-direct {v0, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "-"

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    move-wide/from16 v33, v35

    :cond_d
    move-wide/from16 v28, v33

    :goto_9
    const/16 v26, 0x1

    goto :goto_a

    :cond_e
    throw v8
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    :cond_f
    move-object/from16 v38, v5

    const-string v5, "domain"

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    :try_start_4
    const-string v0, "."

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_11

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li/g;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    move-object v15, v0

    const/16 v27, 0x0

    goto :goto_a

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "Failed requirement."

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_12
    const-string v5, "path"

    invoke-static {v0, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    move-object/from16 v32, v3

    goto :goto_a

    :cond_13
    const-string v3, "secure"

    invoke-static {v0, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    const/16 v24, 0x1

    goto :goto_a

    :cond_14
    const-string v3, "httponly"

    invoke-static {v0, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/16 v25, 0x1

    :catch_2
    :cond_15
    :goto_a
    add-int/lit8 v0, v4, 0x1

    move-object/from16 v4, v16

    move-object/from16 v3, v37

    move-object/from16 v5, v38

    const/16 v8, 0x3d

    goto/16 :goto_6

    :cond_16
    move-object/from16 v38, v5

    cmp-long v0, v28, v35

    if-nez v0, :cond_17

    move-wide/from16 v20, v35

    goto :goto_b

    :cond_17
    cmp-long v0, v28, v22

    if-eqz v0, :cond_1a

    const-wide v3, 0x20c49ba5e353f7L

    cmp-long v0, v28, v3

    if-gtz v0, :cond_18

    const/16 v0, 0x3e8

    int-to-long v3, v0

    mul-long v33, v28, v3

    :cond_18
    add-long v33, v13, v33

    cmp-long v0, v33, v13

    if-ltz v0, :cond_1b

    cmp-long v0, v33, v20

    if-lez v0, :cond_19

    goto :goto_b

    :cond_19
    move-wide/from16 v20, v33

    goto :goto_b

    :cond_1a
    move-wide/from16 v20, v30

    :cond_1b
    :goto_b
    iget-object v0, v2, Ls3/s;->e:Ljava/lang/String;

    if-nez v15, :cond_1c

    move-object v15, v0

    goto :goto_d

    :cond_1c
    invoke-static {v0, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    goto :goto_c

    :cond_1d
    invoke-static {v0, v15}, Lkotlin/text/StringsKt;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_1e

    sget-object v3, Lt3/c;->a:[B

    const-string v3, "$this$canParseAsIpAddress"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lt3/c;->f:Lkotlin/text/Regex;

    invoke-virtual {v3, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_c

    :cond_1e
    const/16 v19, 0x0

    :goto_c
    if-nez v19, :cond_1f

    goto :goto_e

    :cond_1f
    :goto_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v0, v3, :cond_20

    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->h:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;

    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->g:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    invoke-virtual {v0, v15}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_20

    :goto_e
    goto/16 :goto_4

    :cond_20
    const-string v0, "/"

    move-object/from16 v3, v32

    if-eqz v3, :cond_22

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_f

    :cond_21
    move-object/from16 v23, v3

    const/4 v8, 0x0

    goto :goto_10

    :cond_22
    :goto_f
    invoke-virtual/range {p1 .. p1}, Ls3/s;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x2f

    const/4 v5, 0x6

    const/4 v8, 0x0

    invoke-static {v3, v4, v8, v5}, Lkotlin/text/StringsKt;->j(Ljava/lang/CharSequence;CII)I

    move-result v4

    if-eqz v4, :cond_23

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v3, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_23
    move-object/from16 v23, v0

    :goto_10
    new-instance v0, Ls3/k;

    move-object/from16 v17, v0

    move-object/from16 v19, v7

    move-object/from16 v22, v15

    invoke-direct/range {v17 .. v27}, Ls3/k;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    goto :goto_12

    :goto_11
    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_25

    if-nez v11, :cond_24

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v3

    :cond_24
    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_25
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v4, v16

    move-object/from16 v3, v37

    move-object/from16 v5, v38

    const/4 v7, 0x2

    const/4 v9, 0x0

    goto/16 :goto_2

    :cond_26
    if-eqz v11, :cond_27

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v3, "Collections.unmodifiableList(cookies)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_13

    :cond_27
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_28

    return-void

    :cond_28
    invoke-interface {v1, v2, v0}, Ls3/l;->b(Ls3/s;Ljava/util/List;)V

    return-void
.end method
