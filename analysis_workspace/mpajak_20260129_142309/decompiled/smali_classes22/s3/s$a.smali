.class public final Ls3/s$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ls3/s$a;->b:Ljava/lang/String;

    iput-object v0, p0, Ls3/s$a;->c:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, Ls3/s$a;->e:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Ls3/s;
    .locals 14

    iget-object v1, p0, Ls3/s$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v0, p0, Ls3/s$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v0, v2, v2, v2, v3}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Ls3/s$a;->c:Ljava/lang/String;

    invoke-static {v0, v2, v2, v2, v3}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Ls3/s$a;->d:Ljava/lang/String;

    if-eqz v6, :cond_5

    invoke-virtual {p0}, Ls3/s$a;->b()I

    move-result v7

    iget-object v0, p0, Ls3/s$a;->f:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->b(Ljava/lang/Iterable;)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9, v2, v2, v2, v3}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls3/s$a;->g:Ljava/util/ArrayList;

    const/4 v9, 0x0

    if-eqz v0, :cond_2

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->b(Ljava/lang/Iterable;)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_1

    const/4 v12, 0x1

    const/4 v13, 0x3

    invoke-static {v11, v2, v2, v12, v13}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_1
    move-object v11, v9

    :goto_2
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v10, v9

    :cond_3
    iget-object v0, p0, Ls3/s$a;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {v0, v2, v2, v2, v3}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    :cond_4
    invoke-virtual {p0}, Ls3/s$a;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ls3/s;

    move-object v0, v12

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move-object v6, v8

    move-object v7, v10

    move-object v8, v9

    move-object v9, v11

    invoke-direct/range {v0 .. v9}, Ls3/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()I
    .locals 4

    iget v0, p0, Ls3/s$a;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ls3/s$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "scheme"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x310888    # 4.503E-39f

    if-eq v2, v3, :cond_2

    const v3, 0x5f008eb

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x1bb

    goto :goto_1

    :cond_2
    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x50

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method public final c(Ljava/lang/String;)Ls3/s$a;
    .locals 11

    if-eqz p1, :cond_0

    sget-object v0, Ls3/s;->k:Ls3/s$b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xd3

    const-string v4, " \"\'<>#"

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ls3/s$b;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Ls3/s$a;->g:Ljava/util/ArrayList;

    return-object p0
.end method

.method public final d(Ls3/s;Ljava/lang/String;)Ls3/s$a;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p2

    const-string v2, "input"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lt3/c;->a:[B

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v11, v3, v2}, Lt3/c;->o(Ljava/lang/String;II)I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v11, v2, v4}, Lt3/c;->p(Ljava/lang/String;II)I

    move-result v12

    sub-int v4, v12, v2

    const/16 v5, 0x3a

    const/4 v6, -0x1

    const/4 v7, 0x2

    if-ge v4, v7, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v8, 0x61

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v9

    const/16 v10, 0x7a

    const/16 v13, 0x41

    const/16 v14, 0x5a

    if-ltz v9, :cond_1

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v9

    if-lez v9, :cond_2

    :cond_1
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v9

    if-ltz v9, :cond_c

    invoke-static {v4, v14}, Lkotlin/jvm/internal/Intrinsics;->compare(II)I

    move-result v4

    if-lez v4, :cond_2

    goto :goto_5

    :cond_2
    move v4, v2

    :goto_0
    add-int/lit8 v4, v4, 0x1

    if-ge v4, v12, :cond_c

    invoke-virtual {v11, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-le v8, v9, :cond_3

    goto :goto_1

    :cond_3
    if-lt v10, v9, :cond_4

    goto :goto_4

    :cond_4
    :goto_1
    if-le v13, v9, :cond_5

    goto :goto_2

    :cond_5
    if-lt v14, v9, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    const/16 v8, 0x39

    const/16 v10, 0x30

    if-le v10, v9, :cond_7

    goto :goto_3

    :cond_7
    if-lt v8, v9, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    const/16 v8, 0x2b

    if-ne v9, v8, :cond_9

    goto :goto_4

    :cond_9
    const/16 v8, 0x2d

    if-ne v9, v8, :cond_a

    goto :goto_4

    :cond_a
    const/16 v8, 0x2e

    if-ne v9, v8, :cond_b

    :goto_4
    const/16 v8, 0x61

    const/16 v10, 0x7a

    goto :goto_0

    :cond_b
    if-ne v9, v5, :cond_c

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v4, -0x1

    :goto_6
    const-string v13, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    const-string v14, "http"

    const-string v15, "https"

    if-eq v4, v6, :cond_f

    const-string v5, "https:"

    invoke-static {v11, v5, v2}, Lkotlin/text/StringsKt;->s(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_d

    iput-object v15, v0, Ls3/s$a;->a:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x6

    goto :goto_7

    :cond_d
    const-string v5, "http:"

    invoke-static {v11, v5, v2}, Lkotlin/text/StringsKt;->s(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_e

    iput-object v14, v0, Ls3/s$a;->a:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x5

    goto :goto_7

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    if-eqz v1, :cond_3d

    iget-object v3, v1, Ls3/s;->b:Ljava/lang/String;

    iput-object v3, v0, Ls3/s$a;->a:Ljava/lang/String;

    :goto_7
    const/4 v3, 0x0

    move v4, v2

    :goto_8
    const/16 v5, 0x5c

    const/16 v8, 0x2f

    if-ge v4, v12, :cond_11

    invoke-virtual {v11, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v5, :cond_10

    if-ne v9, v8, :cond_11

    :cond_10
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_11
    const/16 v4, 0x23

    if-ge v3, v7, :cond_15

    if-eqz v1, :cond_15

    iget-object v7, v1, Ls3/s;->b:Ljava/lang/String;

    iget-object v9, v0, Ls3/s$a;->a:Ljava/lang/String;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    if-eqz v7, :cond_12

    goto :goto_9

    :cond_12
    invoke-virtual/range {p1 .. p1}, Ls3/s;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ls3/s$a;->b:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Ls3/s;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ls3/s$a;->c:Ljava/lang/String;

    iget-object v3, v1, Ls3/s;->e:Ljava/lang/String;

    iput-object v3, v0, Ls3/s$a;->d:Ljava/lang/String;

    iget v3, v1, Ls3/s;->f:I

    iput v3, v0, Ls3/s$a;->e:I

    iget-object v3, v0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual/range {p1 .. p1}, Ls3/s;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eq v2, v12, :cond_13

    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v4, :cond_14

    :cond_13
    invoke-virtual/range {p1 .. p1}, Ls3/s;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/s$a;->c(Ljava/lang/String;)Ls3/s$a;

    :cond_14
    const/4 v1, 0x1

    move/from16 v18, v12

    goto/16 :goto_19

    :cond_15
    :goto_9
    add-int/2addr v2, v3

    const/4 v1, 0x0

    const/4 v3, 0x0

    move v10, v2

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_a
    const-string v1, "@/\\?#"

    invoke-static {v11, v1, v10, v12}, Lt3/c;->g(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v9

    if-eq v9, v12, :cond_16

    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_b

    :cond_16
    const/4 v1, -0x1

    :goto_b
    if-eq v1, v6, :cond_1b

    if-eq v1, v4, :cond_1b

    if-eq v1, v8, :cond_1b

    if-eq v1, v5, :cond_1b

    const/16 v2, 0x3f

    if-eq v1, v2, :cond_1b

    const/16 v2, 0x40

    if-eq v1, v2, :cond_17

    move/from16 v18, v12

    goto/16 :goto_e

    :cond_17
    const-string v8, "%40"

    if-nez v16, :cond_1a

    const/16 v1, 0x3a

    invoke-static {v11, v1, v10, v9}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v7

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xf0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move v2, v10

    move v3, v7

    move v10, v7

    move/from16 v7, v18

    move-object/from16 v22, v8

    move/from16 v8, v19

    move/from16 v23, v9

    move-object/from16 v9, v20

    move/from16 v18, v12

    move v12, v10

    move/from16 v10, v21

    invoke-static/range {v1 .. v10}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v1

    if-eqz v17, :cond_18

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Ls3/s$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_18
    iput-object v1, v0, Ls3/s$a;->b:Ljava/lang/String;

    move/from16 v10, v23

    if-eq v12, v10, :cond_19

    add-int/lit8 v2, v12, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v12, 0xf0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move v3, v10

    move/from16 v23, v10

    move v10, v12

    invoke-static/range {v1 .. v10}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3/s$a;->c:Ljava/lang/String;

    const/16 v16, 0x1

    goto :goto_c

    :cond_19
    move/from16 v23, v10

    :goto_c
    const/16 v17, 0x1

    goto :goto_d

    :cond_1a
    move-object v3, v8

    move/from16 v23, v9

    move/from16 v18, v12

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Ls3/s$a;->c:Ljava/lang/String;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v19, 0xf0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    move-object/from16 v1, p2

    move v2, v10

    move/from16 v3, v23

    move/from16 v10, v19

    invoke-static/range {v1 .. v10}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3/s$a;->c:Ljava/lang/String;

    :goto_d
    move/from16 v12, v23

    add-int/lit8 v10, v12, 0x1

    :goto_e
    const/16 v4, 0x23

    const/16 v5, 0x5c

    const/16 v8, 0x2f

    const/4 v6, -0x1

    move/from16 v12, v18

    goto/16 :goto_a

    :cond_1b
    move/from16 v18, v12

    move v12, v9

    const/4 v9, 0x1

    move v1, v10

    :goto_f
    if-ge v1, v12, :cond_1f

    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3a

    if-eq v2, v3, :cond_1e

    const/16 v3, 0x5b

    if-eq v2, v3, :cond_1c

    goto :goto_10

    :cond_1c
    add-int/2addr v1, v9

    if-ge v1, v12, :cond_1d

    invoke-virtual {v11, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5d

    if-ne v2, v3, :cond_1c

    :cond_1d
    :goto_10
    add-int/2addr v1, v9

    goto :goto_f

    :cond_1e
    move v8, v1

    goto :goto_11

    :cond_1f
    move v8, v12

    :goto_11
    add-int/lit8 v7, v8, 0x1

    const/4 v1, 0x4

    if-ge v7, v12, :cond_24

    const/4 v2, 0x0

    invoke-static {v11, v10, v8, v2, v1}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Li/g;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3/s$a;->d:Ljava/lang/String;

    :try_start_0
    const-string v4, ""
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xf8

    move-object/from16 v1, p2

    move v2, v7

    move v3, v12

    move/from16 v24, v7

    move v7, v14

    move v14, v8

    move v8, v15

    const/4 v15, 0x1

    move-object/from16 v9, v16

    move/from16 v25, v10

    move/from16 v10, v17

    :try_start_1
    invoke-static/range {v1 .. v10}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const v2, 0xffff

    if-le v15, v1, :cond_20

    goto :goto_12

    :cond_20
    if-lt v2, v1, :cond_21

    goto :goto_13

    :catch_0
    move/from16 v24, v7

    move v14, v8

    move/from16 v25, v10

    const/4 v15, 0x1

    :catch_1
    :cond_21
    :goto_12
    const/4 v1, -0x1

    :goto_13
    iput v1, v0, Ls3/s$a;->e:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_22

    const/4 v1, 0x1

    goto :goto_14

    :cond_22
    const/4 v1, 0x0

    :goto_14
    if-eqz v1, :cond_23

    move v3, v14

    move/from16 v10, v25

    const/4 v2, 0x1

    goto :goto_17

    :cond_23
    const-string v1, "Invalid URL port: \""

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v8, v24

    invoke-virtual {v11, v8, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_24
    move v3, v8

    move/from16 v25, v10

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-static {v11, v10, v3, v4, v1}, Ls3/s$b;->d(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Li/g;->E(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ls3/s$a;->d:Ljava/lang/String;

    iget-object v1, v0, Ls3/s$a;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v4, "scheme"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v5, 0x310888    # 4.503E-39f

    if-eq v4, v5, :cond_26

    const v5, 0x5f008eb

    if-eq v4, v5, :cond_25

    goto :goto_15

    :cond_25
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    const/16 v1, 0x1bb

    goto :goto_16

    :cond_26
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    const/16 v1, 0x50

    goto :goto_16

    :cond_27
    :goto_15
    const/4 v1, -0x1

    :goto_16
    iput v1, v0, Ls3/s$a;->e:I

    :goto_17
    iget-object v1, v0, Ls3/s$a;->d:Ljava/lang/String;

    if-eqz v1, :cond_28

    const/4 v1, 0x1

    goto :goto_18

    :cond_28
    const/4 v1, 0x0

    :goto_18
    if-eqz v1, :cond_3c

    move v2, v12

    const/4 v1, 0x1

    :goto_19
    const-string v3, "?#"

    move/from16 v4, v18

    invoke-static {v11, v3, v2, v4}, Lt3/c;->g(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v3

    if-ne v2, v3, :cond_29

    move-object v13, v0

    move v0, v4

    move-object v1, v11

    move-object v12, v1

    goto/16 :goto_26

    :cond_29
    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const-string v6, ""

    const/16 v7, 0x2f

    if-eq v5, v7, :cond_2b

    const/16 v7, 0x5c

    if-ne v5, v7, :cond_2a

    goto :goto_1a

    :cond_2a
    iget-object v5, v0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-virtual {v5, v7, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-object v10, v0

    move-object/from16 v16, v10

    move v13, v1

    move v14, v3

    move v15, v14

    move/from16 v17, v4

    move-object v1, v11

    move-object v9, v1

    move-object v12, v9

    move v3, v2

    move-object v11, v6

    goto :goto_1c

    :cond_2b
    :goto_1a
    iget-object v5, v0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    iget-object v5, v0, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v0

    move-object v9, v8

    move v5, v3

    move v12, v4

    move-object v7, v6

    move v4, v2

    move v6, v5

    move-object v2, v11

    move v3, v1

    move-object v1, v2

    :goto_1b
    add-int/2addr v4, v3

    move v13, v3

    move v3, v4

    move v14, v5

    move v15, v6

    move-object/from16 v16, v8

    move-object v10, v9

    move-object v9, v11

    move/from16 v17, v12

    move-object v12, v2

    move-object v11, v7

    :goto_1c
    if-ge v3, v15, :cond_39

    const-string v2, "/\\"

    invoke-static {v9, v2, v3, v15}, Lt3/c;->g(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v8

    if-ge v8, v15, :cond_2c

    const/4 v2, 0x1

    const/16 v18, 0x1

    goto :goto_1d

    :cond_2c
    const/4 v2, 0x0

    const/16 v18, 0x0

    :goto_1d
    const/4 v6, 0x1

    const/4 v7, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xf0

    const-string v5, " \"<>^`{}|/\\?#"

    move-object v2, v9

    move v4, v8

    move/from16 v23, v8

    move/from16 v8, v19

    move-object/from16 v19, v9

    move/from16 v9, v20

    move-object/from16 v26, v10

    move-object/from16 v10, v21

    move-object v0, v11

    move/from16 v11, v22

    invoke-static/range {v2 .. v11}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    const-string v3, "%2e"

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    goto :goto_1e

    :cond_2d
    const/4 v3, 0x0

    goto :goto_1f

    :cond_2e
    :goto_1e
    const/4 v3, 0x1

    :goto_1f
    if-eqz v3, :cond_2f

    move-object/from16 v9, v26

    goto/16 :goto_25

    :cond_2f
    const-string v3, ".."

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_31

    const-string v3, "%2e."

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_31

    const-string v3, ".%2e"

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_31

    const-string v3, "%2e%2e"

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_30

    goto :goto_20

    :cond_30
    const/4 v3, 0x0

    goto :goto_21

    :cond_31
    :goto_20
    const/4 v3, 0x1

    :goto_21
    if-eqz v3, :cond_34

    move-object/from16 v9, v26

    iget-object v2, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v13

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_32

    const/4 v2, 0x1

    goto :goto_22

    :cond_32
    const/4 v2, 0x0

    :goto_22
    if-eqz v2, :cond_33

    iget-object v2, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v13

    if-eqz v2, :cond_33

    iget-object v2, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v13

    invoke-virtual {v2, v3, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_25

    :cond_33
    iget-object v2, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_34
    move-object/from16 v9, v26

    iget-object v3, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_35

    const/4 v3, 0x1

    goto :goto_23

    :cond_35
    const/4 v3, 0x0

    :goto_23
    iget-object v4, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    if-eqz v3, :cond_36

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v13

    invoke-virtual {v4, v3, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_24

    :cond_36
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_24
    if-eqz v18, :cond_37

    iget-object v2, v9, Ls3/s$a;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_37
    :goto_25
    if-eqz v18, :cond_38

    move-object v7, v0

    move-object v2, v12

    move v3, v13

    move v5, v14

    move v6, v15

    move-object/from16 v8, v16

    move/from16 v12, v17

    move-object/from16 v11, v19

    move/from16 v4, v23

    move-object/from16 v0, p0

    goto/16 :goto_1b

    :cond_38
    move-object v11, v0

    move-object v10, v9

    move-object/from16 v9, v19

    move/from16 v3, v23

    move-object/from16 v0, p0

    goto/16 :goto_1c

    :cond_39
    move v3, v14

    move-object/from16 v13, v16

    move/from16 v0, v17

    :goto_26
    if-ge v3, v0, :cond_3a

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x3f

    if-ne v2, v4, :cond_3a

    const/16 v2, 0x23

    invoke-static {v1, v2, v3, v0}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v14

    sget-object v15, Ls3/s;->k:Ls3/s$b;

    add-int/lit8 v3, v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xd0

    const-string v5, " \"\'<>#"

    move-object v2, v12

    move v4, v14

    invoke-static/range {v2 .. v11}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ls3/s$b;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    iput-object v2, v13, Ls3/s$a;->g:Ljava/util/ArrayList;

    move v3, v14

    :cond_3a
    if-ge v3, v0, :cond_3b

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    if-ne v1, v2, :cond_3b

    add-int/lit8 v3, v3, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/16 v11, 0xb0

    const-string v5, ""

    move-object v2, v12

    move v4, v0

    invoke-static/range {v2 .. v11}, Ls3/s$b;->a(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Ls3/s$a;->h:Ljava/lang/String;

    :cond_3b
    return-object v13

    :cond_3c
    const-string v0, "Invalid URL host: \""

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v11, v10, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expected URL scheme \'http\' or \'https\' but no colon was found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ls3/s$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    goto :goto_0

    :cond_0
    const-string v1, "//"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/s$a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const/16 v4, 0x3a

    if-nez v1, :cond_3

    iget-object v1, p0, Ls3/s$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_6

    :cond_3
    iget-object v1, p0, Ls3/s$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/s$a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/s$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Ls3/s$a;->d:Ljava/lang/String;

    if-eqz v1, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1, v4}, Lkotlin/text/StringsKt;->b(Ljava/lang/CharSequence;C)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/s$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_7
    iget-object v1, p0, Ls3/s$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    :goto_4
    iget v1, p0, Ls3/s$a;->e:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_9

    iget-object v1, p0, Ls3/s$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_e

    :cond_9
    invoke-virtual {p0}, Ls3/s$a;->b()I

    move-result v1

    iget-object v5, p0, Ls3/s$a;->a:Ljava/lang/String;

    if-eqz v5, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v6, "scheme"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, 0x310888    # 4.503E-39f

    if-eq v6, v7, :cond_b

    const v7, 0x5f008eb

    if-eq v6, v7, :cond_a

    goto :goto_5

    :cond_a
    const-string v6, "https"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/16 v3, 0x1bb

    goto :goto_5

    :cond_b
    const-string v6, "http"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/16 v3, 0x50

    :cond_c
    :goto_5
    if-eq v1, v3, :cond_e

    :cond_d
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_e
    iget-object v1, p0, Ls3/s$a;->f:Ljava/util/ArrayList;

    const-string v3, "$this$toPathString"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "out"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_6
    if-ge v2, v3, :cond_f

    const/16 v4, 0x2f

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_f
    iget-object v1, p0, Ls3/s$a;->g:Ljava/util/ArrayList;

    if-eqz v1, :cond_10

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Ls3/s;->k:Ls3/s$b;

    iget-object v2, p0, Ls3/s$a;->g:Ljava/util/ArrayList;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, Ls3/s$b;->f(Ljava/util/List;Ljava/lang/StringBuilder;)V

    :cond_10
    iget-object v1, p0, Ls3/s$a;->h:Ljava/lang/String;

    if-eqz v1, :cond_11

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/s$a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
