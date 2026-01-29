.class public final Ls3/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    if-ge p3, v0, :cond_1

    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {p2, v1}, Lkotlin/text/StringsKt;->b(Ljava/lang/CharSequence;C)Z

    move-result v1

    if-eqz v1, :cond_0

    return p3

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1
.end method

.method public final b(Ls3/r;)Ls3/c;
    .locals 27
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "headers"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Ls3/r;->b:[Ljava/lang/String;

    array-length v2, v2

    div-int/lit8 v2, v2, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, -0x1

    const/16 v19, -0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_0
    if-ge v7, v2, :cond_15

    invoke-virtual {v1, v7}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v7}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "Cache-Control"

    invoke-static {v10, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    move-object v9, v3

    goto :goto_2

    :cond_1
    const-string v5, "Pragma"

    invoke-static {v10, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    :goto_1
    const/4 v8, 0x0

    :goto_2
    const/4 v5, 0x0

    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v5, v10, :cond_14

    const-string v10, "=,;"

    invoke-virtual {v0, v3, v10, v5}, Ls3/c$a;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v10

    invoke-virtual {v3, v5, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-static {v5, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v10, v1, :cond_6

    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    move/from16 v25, v2

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_7

    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_2

    goto :goto_6

    :cond_2
    add-int/lit8 v10, v10, 0x1

    sget-object v1, Lt3/c;->a:[B

    const-string v1, "$this$indexOfNonWhitespace"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    :goto_4
    if-ge v10, v1, :cond_4

    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v26, v1

    const/16 v1, 0x20

    if-eq v2, v1, :cond_3

    const/16 v1, 0x9

    if-eq v2, v1, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v10, v10, 0x1

    move/from16 v1, v26

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v10

    :goto_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v10, v1, :cond_5

    invoke-virtual {v3, v10}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x22

    if-ne v1, v2, :cond_5

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x4

    invoke-static {v3, v2, v10, v1}, Lkotlin/text/StringsKt;->h(Ljava/lang/CharSequence;CII)I

    move-result v1

    invoke-virtual {v3, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v24, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_5
    const/16 v24, 0x1

    const-string v1, ",;"

    invoke-virtual {v0, v3, v1, v10}, Ls3/c$a;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v3, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_6
    move/from16 v25, v2

    :cond_7
    :goto_6
    const/16 v24, 0x1

    add-int/lit8 v10, v10, 0x1

    move v1, v10

    const/4 v2, 0x0

    :goto_7
    const-string v4, "no-cache"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, -0x1

    const/4 v11, 0x1

    goto/16 :goto_8

    :cond_8
    const-string v4, "no-store"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const/4 v12, 0x1

    goto/16 :goto_8

    :cond_9
    const-string v4, "max-age"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v4, -0x1

    invoke-static {v2, v4}, Lt3/c;->A(Ljava/lang/String;I)I

    move-result v13

    goto/16 :goto_8

    :cond_a
    const/4 v4, -0x1

    const-string v6, "s-maxage"

    invoke-static {v6, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-static {v2, v4}, Lt3/c;->A(Ljava/lang/String;I)I

    move-result v14

    goto :goto_8

    :cond_b
    const-string v4, "private"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v4, -0x1

    const/4 v15, 0x1

    goto :goto_8

    :cond_c
    const-string v4, "public"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, -0x1

    const/16 v16, 0x1

    goto :goto_8

    :cond_d
    const-string v4, "must-revalidate"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/4 v4, -0x1

    const/16 v17, 0x1

    goto :goto_8

    :cond_e
    const-string v4, "max-stale"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_f

    const v4, 0x7fffffff

    invoke-static {v2, v4}, Lt3/c;->A(Ljava/lang/String;I)I

    move-result v18

    const/4 v4, -0x1

    goto :goto_8

    :cond_f
    const-string v4, "min-fresh"

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v4, -0x1

    invoke-static {v2, v4}, Lt3/c;->A(Ljava/lang/String;I)I

    move-result v19

    goto :goto_8

    :cond_10
    const/4 v4, -0x1

    const-string v2, "only-if-cached"

    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/16 v20, 0x1

    goto :goto_8

    :cond_11
    const-string v2, "no-transform"

    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    const/16 v21, 0x1

    goto :goto_8

    :cond_12
    const-string v2, "immutable"

    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_13

    const/16 v22, 0x1

    :cond_13
    :goto_8
    move v5, v1

    move/from16 v2, v25

    move-object/from16 v1, p1

    goto/16 :goto_3

    :cond_14
    move/from16 v25, v2

    const/4 v4, -0x1

    const/16 v24, 0x1

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    move/from16 v2, v25

    goto/16 :goto_0

    :cond_15
    if-nez v8, :cond_16

    const/16 v23, 0x0

    goto :goto_9

    :cond_16
    move-object/from16 v23, v9

    :goto_9
    new-instance v1, Ls3/c;

    move-object v10, v1

    invoke-direct/range {v10 .. v23}, Ls3/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v1
.end method
