.class public final Lf/g$i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:C

.field public d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lf/g$i;->d()V

    return-void
.end method

.method public static b(C)Z
    .locals 1

    const/16 v0, 0x2d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public final a(C)V
    .locals 3

    iget-char v0, p0, Lf/g$i;->c:C

    if-ne v0, p1, :cond_1

    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lf/g$i;->d()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lf/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expect \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, ", but \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char p1, p0, Lf/g$i;->c:C

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lf/g$i;->b:I

    iget-object v1, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lf/g$i;->a:Ljava/lang/String;

    iget v1, p0, Lf/g$i;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lf/g$i;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iput-char v0, p0, Lf/g$i;->c:C

    return-void
.end method

.method public final e(Z)Lf/g$r;
    .locals 16

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_0
    iget-char v1, v0, Lf/g$i;->c:C

    const/16 v2, 0x3f

    const/16 v3, 0x28

    const/16 v4, 0x2e

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v1, v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    invoke-virtual {v0, v3}, Lf/g$i;->a(C)V

    iget-char v1, v0, Lf/g$i;->c:C

    const/16 v2, 0x40

    if-ne v1, v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    invoke-virtual {v0, v4}, Lf/g$i;->a(C)V

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x27

    const/16 v3, 0x2c

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, -0x1

    const/16 v10, 0x5d

    if-nez v1, :cond_1d

    iget-char v11, v0, Lf/g$i;->c:C

    sget-object v12, Lm/e;->c:[Z

    array-length v13, v12

    if-ge v11, v13, :cond_3

    aget-boolean v11, v12, v11

    if-eqz v11, :cond_3

    const/4 v11, 0x1

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    :goto_1
    if-eqz v11, :cond_4

    goto/16 :goto_d

    :cond_4
    iget v11, v0, Lf/g$i;->b:I

    sub-int/2addr v11, v5

    :goto_2
    iget-char v12, v0, Lf/g$i;->c:C

    const/16 v13, 0x2f

    if-eq v12, v10, :cond_7

    if-eq v12, v13, :cond_7

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->c()Z

    move-result v12

    if-nez v12, :cond_7

    iget-char v12, v0, Lf/g$i;->c:C

    if-ne v12, v4, :cond_5

    if-nez v1, :cond_5

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    const/16 v13, 0x5c

    if-ne v12, v13, :cond_6

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    goto :goto_2

    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    iget-char v1, v0, Lf/g$i;->c:C

    if-eq v1, v13, :cond_a

    if-ne v1, v4, :cond_9

    goto :goto_4

    :cond_9
    iget v1, v0, Lf/g$i;->b:I

    goto :goto_5

    :cond_a
    :goto_4
    iget v1, v0, Lf/g$i;->b:I

    sub-int/2addr v1, v5

    :goto_5
    iget-object v4, v0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v4, v11, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\\."

    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    if-eq v11, v9, :cond_b

    const-string v2, "\\\\\\."

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lf/g$o;

    invoke-direct {v2, v1, v6}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    return-object v2

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    sub-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    const-string v14, ","

    if-le v13, v8, :cond_e

    if-ne v11, v2, :cond_e

    if-ne v12, v2, :cond_e

    if-ne v3, v9, :cond_c

    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lf/g$o;

    invoke-direct {v2, v1, v6}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    goto/16 :goto_c

    :cond_c
    invoke-virtual {v1, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    new-array v2, v2, [Ljava/lang/String;

    :goto_6
    array-length v3, v1

    if-ge v6, v3, :cond_d

    aget-object v3, v1, v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v5

    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_d
    new-instance v1, Lf/g$l;

    invoke-direct {v1, v2}, Lf/g$l;-><init>([Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v3, v9, :cond_10

    if-ne v2, v9, :cond_10

    invoke-static {v1}, Lm/j;->M(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    new-instance v3, Lf/g$a;

    invoke-direct {v3, v2}, Lf/g$a;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v3

    goto/16 :goto_c

    :catch_0
    new-instance v2, Lf/g$o;

    invoke-direct {v2, v1, v6}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    goto/16 :goto_c

    :cond_f
    new-instance v2, Lf/g$o;

    invoke-direct {v2, v1, v6}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    goto/16 :goto_c

    :cond_10
    if-eq v3, v9, :cond_12

    invoke-virtual {v1, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    new-array v2, v2, [I

    :goto_7
    array-length v3, v1

    if-ge v6, v3, :cond_11

    aget-object v3, v1, v6

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    aput v3, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_11
    new-instance v1, Lf/g$k;

    invoke-direct {v1, v2}, Lf/g$k;-><init>([I)V

    :goto_8
    move-object v2, v1

    goto :goto_c

    :cond_12
    if-eq v2, v9, :cond_1c

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    new-array v3, v2, [I

    const/4 v4, 0x0

    :goto_9
    array-length v11, v1

    if-ge v4, v11, :cond_15

    aget-object v11, v1, v4

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_14

    if-nez v4, :cond_13

    aput v6, v3, v4

    goto :goto_a

    :cond_13
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_14
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    aput v11, v3, v4

    :goto_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_15
    aget v1, v3, v6

    if-le v2, v5, :cond_16

    aget v9, v3, v5

    :cond_16
    if-ne v2, v7, :cond_17

    aget v5, v3, v8

    :cond_17
    if-ltz v9, :cond_19

    if-lt v9, v1, :cond_18

    goto :goto_b

    :cond_18
    new-instance v2, Ljava/lang/UnsupportedOperationException;

    const-string v3, "end must greater than or equals start. start "

    const-string v4, ",  end "

    invoke-static {v3, v1, v4, v9}, Landroidx/activity/d;->d(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_19
    :goto_b
    if-lez v5, :cond_1b

    new-instance v2, Lf/g$p;

    invoke-direct {v2, v1, v9, v5}, Lf/g$p;-><init>(III)V

    :goto_c
    if-eqz p1, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->c()Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-virtual {v0, v10}, Lf/g$i;->a(C)V

    :cond_1a
    return-object v2

    :cond_1b
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "step must greater than zero : "

    invoke-static {v2, v5}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_1d
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->j()V

    const/16 v5, 0x29

    if-eqz v1, :cond_1f

    iget-char v6, v0, Lf/g$i;->c:C

    if-ne v6, v5, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    if-eqz p1, :cond_1e

    invoke-virtual {v0, v10}, Lf/g$i;->a(C)V

    :cond_1e
    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$m;

    invoke-direct {v2, v3}, Lf/g$m;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_1f
    if-eqz p1, :cond_20

    iget-char v5, v0, Lf/g$i;->c:C

    if-ne v5, v10, :cond_20

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$m;

    invoke-direct {v2, v3}, Lf/g$m;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_20
    iget-char v5, v0, Lf/g$i;->c:C

    const/16 v6, 0x3d

    if-ne v5, v6, :cond_21

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    const/4 v5, 0x1

    goto :goto_e

    :cond_21
    const/16 v8, 0x21

    if-ne v5, v8, :cond_22

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    invoke-virtual {v0, v6}, Lf/g$i;->a(C)V

    const/4 v5, 0x2

    goto :goto_e

    :cond_22
    const/16 v8, 0x3c

    if-ne v5, v8, :cond_24

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    iget-char v5, v0, Lf/g$i;->c:C

    if-ne v5, v6, :cond_23

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    const/4 v5, 0x6

    goto :goto_e

    :cond_23
    const/4 v5, 0x5

    goto :goto_e

    :cond_24
    const/16 v8, 0x3e

    if-ne v5, v8, :cond_26

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    iget-char v5, v0, Lf/g$i;->c:C

    if-ne v5, v6, :cond_25

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    const/4 v5, 0x4

    goto :goto_e

    :cond_25
    const/4 v5, 0x3

    goto :goto_e

    :cond_26
    const/4 v5, 0x0

    :goto_e
    const/16 v6, 0xd

    const/16 v8, 0xb

    const/16 v10, 0xe

    const/16 v11, 0xc

    if-nez v5, :cond_30

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v5

    const-string v12, "not"

    invoke-virtual {v12, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    const-string v13, "between"

    const-string v14, "in"

    const-string v15, "rlike"

    const-string v7, "like"

    if-eqz v12, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->j()V

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_27

    const/16 v5, 0x8

    goto :goto_f

    :cond_27
    invoke-virtual {v15, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_28

    const/16 v5, 0xa

    goto :goto_f

    :cond_28
    invoke-virtual {v14, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_29

    const/16 v5, 0xc

    goto :goto_f

    :cond_29
    invoke-virtual {v13, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2a

    const/16 v5, 0xe

    goto :goto_f

    :cond_2a
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_2b
    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2c

    const/4 v5, 0x7

    goto :goto_f

    :cond_2c
    invoke-virtual {v15, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2d

    const/16 v5, 0x9

    goto :goto_f

    :cond_2d
    invoke-virtual {v14, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2e

    const/16 v5, 0xb

    goto :goto_f

    :cond_2e
    invoke-virtual {v13, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2f

    const/16 v5, 0xd

    goto :goto_f

    :cond_2f
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_30
    :goto_f
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->j()V

    if-eq v5, v6, :cond_6c

    if-ne v5, v10, :cond_31

    goto/16 :goto_22

    :cond_31
    if-eq v5, v8, :cond_57

    if-ne v5, v11, :cond_32

    goto/16 :goto_1a

    :cond_32
    iget-char v6, v0, Lf/g$i;->c:C

    if-eq v6, v2, :cond_46

    const/16 v2, 0x22

    if-ne v6, v2, :cond_33

    goto/16 :goto_12

    :cond_33
    invoke-static {v6}, Lf/g$i;->b(C)Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->f()J

    move-result-wide v6

    iget-char v2, v0, Lf/g$i;->c:C

    const-wide/16 v10, 0x0

    if-ne v2, v4, :cond_35

    iget v2, v0, Lf/g$i;->b:I

    add-int/2addr v2, v9

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    iget-char v4, v0, Lf/g$i;->c:C

    const/16 v8, 0x30

    if-lt v4, v8, :cond_34

    const/16 v8, 0x39

    if-gt v4, v8, :cond_34

    goto :goto_10

    :cond_34
    iget v4, v0, Lf/g$i;->b:I

    add-int/2addr v4, v9

    iget-object v8, v0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v8, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v8

    long-to-double v12, v6

    add-double/2addr v8, v12

    goto :goto_11

    :cond_35
    move-wide v8, v10

    :goto_11
    if-eqz v1, :cond_36

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_36
    if-eqz p1, :cond_37

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_37
    cmpl-double v1, v8, v10

    if-nez v1, :cond_38

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$h;

    invoke-direct {v2, v3, v6, v7, v5}, Lf/g$h;-><init>(Ljava/lang/String;JI)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_38
    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$b;

    invoke-direct {v2, v3, v8, v9, v5}, Lf/g$b;-><init>(Ljava/lang/String;DI)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_39
    iget-char v2, v0, Lf/g$i;->c:C

    const/16 v4, 0x6e

    if-ne v2, v4, :cond_3d

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v2

    const-string v4, "null"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_45

    if-eqz v1, :cond_3a

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_3a
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    const/4 v1, 0x1

    if-ne v5, v1, :cond_3b

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$n;

    invoke-direct {v2, v3}, Lf/g$n;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_3b
    const/4 v1, 0x2

    if-ne v5, v1, :cond_3c

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$m;

    invoke-direct {v2, v3}, Lf/g$m;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_3c
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_3d
    const/16 v4, 0x74

    if-ne v2, v4, :cond_41

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v2

    const-string v4, "true"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_45

    if-eqz v1, :cond_3e

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_3e
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    const/4 v1, 0x1

    if-ne v5, v1, :cond_3f

    new-instance v2, Lf/g$d;

    new-instance v4, Lf/g$v;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v4, v3, v5, v1}, Lf/g$v;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-direct {v2, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v2

    :cond_3f
    const/4 v1, 0x2

    if-ne v5, v1, :cond_40

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$v;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lf/g$v;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_40
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_41
    const/16 v4, 0x66

    if-ne v2, v4, :cond_45

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v2

    const-string v4, "false"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_45

    if-eqz v1, :cond_42

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_42
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    const/4 v1, 0x1

    if-ne v5, v1, :cond_43

    new-instance v2, Lf/g$d;

    new-instance v4, Lf/g$v;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v4, v3, v5, v1}, Lf/g$v;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-direct {v2, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v2

    :cond_43
    const/4 v1, 0x2

    if-ne v5, v1, :cond_44

    new-instance v1, Lf/g$d;

    new-instance v2, Lf/g$v;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lf/g$v;-><init>(Ljava/lang/String;Ljava/lang/Object;Z)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_44
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_45
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_46
    :goto_12
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_47

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_47
    if-eqz p1, :cond_48

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_48
    const/16 v1, 0x9

    if-ne v5, v1, :cond_49

    new-instance v1, Lf/g$d;

    new-instance v4, Lf/g$q;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v2, v5}, Lf/g$q;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v1, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_49
    const/16 v1, 0xa

    if-ne v5, v1, :cond_4a

    new-instance v1, Lf/g$d;

    new-instance v4, Lf/g$q;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v2, v5}, Lf/g$q;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v1, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_4a
    const/4 v1, 0x7

    if-eq v5, v1, :cond_4b

    const/16 v1, 0x8

    if-ne v5, v1, :cond_4f

    goto :goto_13

    :cond_4b
    const/16 v1, 0x8

    :goto_13
    const-string v4, "%%"

    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    const-string v7, "%"

    if-eq v6, v9, :cond_4c

    invoke-virtual {v2, v4, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :cond_4c
    if-ne v5, v1, :cond_4d

    const/4 v1, 0x1

    goto :goto_14

    :cond_4d
    const/4 v1, 0x0

    :goto_14
    const/16 v4, 0x25

    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ne v6, v9, :cond_50

    const/4 v1, 0x7

    if-ne v5, v1, :cond_4e

    const/4 v5, 0x1

    goto :goto_15

    :cond_4e
    const/4 v5, 0x2

    :cond_4f
    :goto_15
    new-instance v1, Lf/g$d;

    new-instance v4, Lf/g$u;

    invoke-direct {v4, v3, v2, v5}, Lf/g$u;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v1, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_50
    invoke-virtual {v2, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    if-nez v6, :cond_53

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_51

    array-length v2, v5

    sub-int/2addr v2, v7

    new-array v4, v2, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {v5, v7, v4, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v4

    goto :goto_16

    :cond_51
    const/4 v2, 0x0

    array-length v4, v5

    sub-int/2addr v4, v7

    aget-object v4, v5, v4

    array-length v6, v5

    const/4 v8, 0x2

    if-le v6, v8, :cond_52

    array-length v6, v5

    sub-int/2addr v6, v8

    new-array v8, v6, [Ljava/lang/String;

    invoke-static {v5, v7, v8, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v5, v4

    move-object v6, v8

    const/4 v4, 0x0

    goto :goto_19

    :cond_52
    move-object v5, v4

    const/4 v4, 0x0

    goto :goto_17

    :cond_53
    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    sub-int/2addr v8, v7

    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_54

    :goto_16
    move-object v6, v5

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto :goto_19

    :cond_54
    array-length v2, v5

    if-ne v2, v7, :cond_55

    aget-object v2, v5, v6

    move-object v4, v2

    const/4 v5, 0x0

    :goto_17
    const/4 v6, 0x0

    goto :goto_19

    :cond_55
    array-length v2, v5

    const/4 v4, 0x2

    if-ne v2, v4, :cond_56

    aget-object v2, v5, v6

    aget-object v4, v5, v7

    move-object v5, v4

    const/4 v6, 0x0

    goto :goto_18

    :cond_56
    aget-object v2, v5, v6

    array-length v8, v5

    sub-int/2addr v8, v7

    aget-object v8, v5, v8

    array-length v9, v5

    sub-int/2addr v9, v4

    new-array v4, v9, [Ljava/lang/String;

    invoke-static {v5, v7, v4, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v4

    move-object v5, v8

    :goto_18
    move-object v4, v2

    :goto_19
    new-instance v8, Lf/g$d;

    new-instance v9, Lf/g$j;

    move-object v2, v9

    move v7, v1

    invoke-direct/range {v2 .. v7}, Lf/g$j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V

    invoke-direct {v8, v9}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v8

    :cond_57
    :goto_1a
    const/4 v2, 0x2

    if-ne v5, v11, :cond_58

    const/4 v4, 0x1

    goto :goto_1b

    :cond_58
    const/4 v4, 0x0

    :goto_1b
    const/16 v5, 0x28

    invoke-virtual {v0, v5}, Lf/g$i;->a(C)V

    new-instance v6, Lf/b;

    invoke-direct {v6}, Lf/b;-><init>()V

    :goto_1c
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->i()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v5}, Lf/b;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->j()V

    iget-char v5, v0, Lf/g$i;->c:C

    const/16 v7, 0x2c

    if-eq v5, v7, :cond_6b

    const/16 v5, 0x29

    invoke-virtual {v0, v5}, Lf/g$i;->a(C)V

    if-eqz v1, :cond_59

    invoke-virtual {v0, v5}, Lf/g$i;->a(C)V

    :cond_59
    if-eqz p1, :cond_5a

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Lf/g$i;->a(C)V

    :cond_5a
    invoke-virtual {v6}, Lf/b;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    :cond_5b
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_5c

    if-eqz v8, :cond_5b

    const/4 v8, 0x0

    goto :goto_1d

    :cond_5c
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    if-eqz v8, :cond_5d

    const-class v10, Ljava/lang/Byte;

    if-eq v9, v10, :cond_5d

    const-class v10, Ljava/lang/Short;

    if-eq v9, v10, :cond_5d

    const-class v10, Ljava/lang/Integer;

    if-eq v9, v10, :cond_5d

    const-class v10, Ljava/lang/Long;

    if-eq v9, v10, :cond_5d

    const/4 v7, 0x0

    const/4 v8, 0x0

    :cond_5d
    if-eqz v5, :cond_5b

    const-class v10, Ljava/lang/String;

    if-eq v9, v10, :cond_5b

    const/4 v5, 0x0

    goto :goto_1d

    :cond_5e
    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    const/4 v9, 0x1

    if-ne v1, v9, :cond_60

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_60

    new-instance v1, Lf/g$d;

    if-eqz v4, :cond_5f

    new-instance v2, Lf/g$m;

    invoke-direct {v2, v3}, Lf/g$m;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_5f
    new-instance v2, Lf/g$n;

    invoke-direct {v2, v3}, Lf/g$n;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_60
    if-eqz v8, :cond_64

    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    const/4 v5, 0x1

    if-ne v1, v5, :cond_62

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    if-eqz v4, :cond_61

    goto :goto_1e

    :cond_61
    const/4 v2, 0x1

    :goto_1e
    new-instance v1, Lf/g$d;

    new-instance v4, Lf/g$h;

    invoke-direct {v4, v3, v5, v6, v2}, Lf/g$h;-><init>(Ljava/lang/String;JI)V

    invoke-direct {v1, v4}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_62
    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    new-array v2, v1, [J

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v1, :cond_63

    invoke-virtual {v6, v5}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    aput-wide v7, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    :cond_63
    new-instance v1, Lf/g$d;

    new-instance v5, Lf/g$f;

    invoke-direct {v5, v3, v2, v4}, Lf/g$f;-><init>(Ljava/lang/String;[JZ)V

    invoke-direct {v1, v5}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_64
    if-eqz v5, :cond_67

    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_66

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v4, :cond_65

    const/4 v2, 0x2

    goto :goto_20

    :cond_65
    const/4 v2, 0x1

    :goto_20
    new-instance v4, Lf/g$d;

    new-instance v5, Lf/g$u;

    invoke-direct {v5, v3, v1, v2}, Lf/g$u;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v4, v5}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v4

    :cond_66
    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v6, v1}, Lf/b;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-instance v2, Lf/g$d;

    new-instance v5, Lf/g$t;

    invoke-direct {v5, v3, v1, v4}, Lf/g$t;-><init>(Ljava/lang/String;[Ljava/lang/String;Z)V

    invoke-direct {v2, v5}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v2

    :cond_67
    if-eqz v7, :cond_6a

    invoke-virtual {v6}, Lf/b;->size()I

    move-result v1

    new-array v2, v1, [Ljava/lang/Long;

    const/4 v5, 0x0

    :goto_21
    if-ge v5, v1, :cond_69

    invoke-virtual {v6, v5}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    if-eqz v7, :cond_68

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v2, v5

    :cond_68
    add-int/lit8 v5, v5, 0x1

    goto :goto_21

    :cond_69
    new-instance v1, Lf/g$d;

    new-instance v5, Lf/g$g;

    invoke-direct {v5, v3, v2, v4}, Lf/g$g;-><init>(Ljava/lang/String;[Ljava/lang/Long;Z)V

    invoke-direct {v1, v5}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_6a
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1

    :cond_6b
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->d()V

    goto/16 :goto_1c

    :cond_6c
    :goto_22
    if-ne v5, v10, :cond_6d

    const/4 v1, 0x1

    const/4 v8, 0x1

    goto :goto_23

    :cond_6d
    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_23
    invoke-virtual/range {p0 .. p0}, Lf/g$i;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v2

    const-string v4, "and"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_70

    invoke-virtual/range {p0 .. p0}, Lf/g$i;->i()Ljava/lang/Object;

    move-result-object v2

    if-eqz v1, :cond_6f

    if-eqz v2, :cond_6f

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lf/g;->f(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_6e

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lf/g;->f(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_6e

    new-instance v9, Lf/g$e;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lf/g$e;-><init>(Ljava/lang/String;JJZ)V

    new-instance v1, Lf/g$d;

    invoke-direct {v1, v9}, Lf/g$d;-><init>(Lf/g$c;)V

    return-object v1

    :cond_6e
    new-instance v1, Lf/i;

    iget-object v2, v0, Lf/g$i;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6f
    new-instance v1, Lf/i;

    iget-object v2, v0, Lf/g$i;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_70
    new-instance v1, Lf/i;

    iget-object v2, v0, Lf/g$i;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final f()J
    .locals 3

    iget v0, p0, Lf/g$i;->b:I

    add-int/lit8 v0, v0, -0x1

    iget-char v1, p0, Lf/g$i;->c:C

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_0

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lf/g$i;->d()V

    :cond_1
    iget-char v1, p0, Lf/g$i;->c:C

    const/16 v2, 0x30

    if-lt v1, v2, :cond_2

    const/16 v2, 0x39

    if-gt v1, v2, :cond_2

    goto :goto_0

    :cond_2
    iget v1, p0, Lf/g$i;->b:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lf/g$i;->j()V

    iget-char v0, p0, Lf/g$i;->c:C

    const/16 v1, 0x5c

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    sget-object v3, Lm/e;->c:[Z

    array-length v4, v3

    if-ge v0, v4, :cond_0

    aget-boolean v0, v3, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lf/i;

    const-string v1, "illeal jsonpath syntax. "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result v3

    if-nez v3, :cond_7

    iget-char v3, p0, Lf/g$i;->c:C

    if-ne v3, v1, :cond_3

    invoke-virtual {p0}, Lf/g$i;->d()V

    iget-char v3, p0, Lf/g$i;->c:C

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_3
    sget-object v4, Lm/e;->d:[Z

    array-length v5, v4

    if-ge v3, v5, :cond_4

    aget-boolean v4, v4, v3

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p0}, Lf/g$i;->d()V

    goto :goto_2

    :cond_7
    :goto_4
    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-char v1, p0, Lf/g$i;->c:C

    sget-object v3, Lm/e;->d:[Z

    array-length v4, v3

    if-ge v1, v4, :cond_8

    aget-boolean v3, v3, v1

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    if-eqz v2, :cond_9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 4

    iget-char v0, p0, Lf/g$i;->c:C

    invoke-virtual {p0}, Lf/g$i;->d()V

    iget v1, p0, Lf/g$i;->b:I

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget-char v2, p0, Lf/g$i;->c:C

    if-eq v2, v0, :cond_0

    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lf/g$i;->d()V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lf/g$i;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, p0, Lf/g$i;->b:I

    goto :goto_1

    :cond_1
    iget v3, p0, Lf/g$i;->b:I

    add-int/lit8 v3, v3, -0x1

    :goto_1
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Lf/g$i;->a(C)V

    return-object v1
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lf/g$i;->j()V

    iget-char v0, p0, Lf/g$i;->c:C

    invoke-static {v0}, Lf/g$i;->b(C)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf/g$i;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    iget-char v0, p0, Lf/g$i;->c:C

    const/16 v1, 0x22

    if-eq v0, v1, :cond_4

    const/16 v1, 0x27

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x6e

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    new-instance v0, Lf/i;

    iget-object v1, p0, Lf/g$i;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lf/g$i;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()V
    .locals 2

    :goto_0
    iget-char v0, p0, Lf/g$i;->c:C

    const/16 v1, 0x20

    if-gt v0, v1, :cond_1

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lf/g$i;->d()V

    goto :goto_0

    :cond_1
    return-void
.end method
