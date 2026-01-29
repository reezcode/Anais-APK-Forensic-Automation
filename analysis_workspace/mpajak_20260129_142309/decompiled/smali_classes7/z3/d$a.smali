.class public final Lz3/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz3/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lf4/u;

.field public c:[Lz3/c;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public d:I

.field public e:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public f:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final g:I

.field public h:I


# direct methods
.method public constructor <init>(Lf4/a0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    iput v0, p0, Lz3/d$a;->g:I

    iput v0, p0, Lz3/d$a;->h:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz3/d$a;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object p1

    check-cast p1, Lf4/u;

    iput-object p1, p0, Lz3/d$a;->b:Lf4/u;

    const/16 p1, 0x8

    new-array p1, p1, [Lz3/c;

    iput-object p1, p0, Lz3/d$a;->c:[Lz3/c;

    const/4 p1, 0x7

    iput p1, p0, Lz3/d$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lz3/d$a;->c:[Lz3/c;

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->c([Ljava/lang/Object;)V

    iget-object v0, p0, Lz3/d$a;->c:[Lz3/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lz3/d$a;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lz3/d$a;->e:I

    iput v0, p0, Lz3/d$a;->f:I

    return-void
.end method

.method public final b(I)I
    .locals 4

    const/4 v0, 0x0

    if-lez p1, :cond_1

    iget-object v1, p0, Lz3/d$a;->c:[Lz3/c;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    iget v2, p0, Lz3/d$a;->d:I

    if-lt v1, v2, :cond_0

    if-lez p1, :cond_0

    iget-object v2, p0, Lz3/d$a;->c:[Lz3/c;

    aget-object v2, v2, v1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v2, v2, Lz3/c;->a:I

    sub-int/2addr p1, v2

    iget v3, p0, Lz3/d$a;->f:I

    sub-int/2addr v3, v2

    iput v3, p0, Lz3/d$a;->f:I

    iget v2, p0, Lz3/d$a;->e:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lz3/d$a;->e:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz3/d$a;->c:[Lz3/c;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, Lz3/d$a;->e:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lz3/d$a;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Lz3/d$a;->d:I

    :cond_1
    return v0
.end method

.method public final c(I)Lf4/i;
    .locals 3

    if-ltz p1, :cond_0

    sget-object v0, Lz3/d;->c:Lz3/d;

    sget-object v0, Lz3/d;->a:[Lz3/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    sget-object v0, Lz3/d;->c:Lz3/d;

    sget-object v0, Lz3/d;->a:[Lz3/c;

    aget-object p1, v0, p1

    goto :goto_1

    :cond_1
    sget-object v0, Lz3/d;->c:Lz3/d;

    sget-object v0, Lz3/d;->a:[Lz3/c;

    array-length v0, v0

    sub-int v0, p1, v0

    iget v1, p0, Lz3/d$a;->d:I

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v0

    if-ltz v1, :cond_2

    iget-object v0, p0, Lz3/d$a;->c:[Lz3/c;

    array-length v2, v0

    if-ge v1, v2, :cond_2

    aget-object p1, v0, v1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_1
    iget-object p1, p1, Lz3/c;->b:Lf4/i;

    return-object p1

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Header index too large "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Lz3/c;)V
    .locals 6

    iget-object v0, p0, Lz3/d$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p1, Lz3/c;->a:I

    iget v1, p0, Lz3/d$a;->h:I

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lz3/d$a;->a()V

    return-void

    :cond_0
    iget v2, p0, Lz3/d$a;->f:I

    add-int/2addr v2, v0

    sub-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lz3/d$a;->b(I)I

    iget v1, p0, Lz3/d$a;->e:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lz3/d$a;->c:[Lz3/c;

    array-length v3, v2

    if-le v1, v3, :cond_1

    array-length v1, v2

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [Lz3/c;

    const/4 v3, 0x0

    array-length v4, v2

    array-length v5, v2

    invoke-static {v2, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lz3/d$a;->c:[Lz3/c;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lz3/d$a;->d:I

    iput-object v1, p0, Lz3/d$a;->c:[Lz3/c;

    :cond_1
    iget v1, p0, Lz3/d$a;->d:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lz3/d$a;->d:I

    iget-object v2, p0, Lz3/d$a;->c:[Lz3/c;

    aput-object p1, v2, v1

    iget p1, p0, Lz3/d$a;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz3/d$a;->e:I

    iget p1, p0, Lz3/d$a;->f:I

    add-int/2addr p1, v0

    iput p1, p0, Lz3/d$a;->f:I

    return-void
.end method

.method public final e()Lf4/i;
    .locals 11

    iget-object v0, p0, Lz3/d$a;->b:Lf4/u;

    invoke-virtual {v0}, Lf4/u;->readByte()B

    move-result v0

    sget-object v1, Lt3/c;->a:[B

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    const/16 v2, 0x80

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x7f

    invoke-virtual {p0, v0, v2}, Lz3/d$a;->f(II)I

    move-result v0

    int-to-long v4, v0

    if-eqz v1, :cond_6

    new-instance v0, Lf4/f;

    invoke-direct {v0}, Lf4/f;-><init>()V

    sget-object v1, Lz3/s;->d:Lz3/s;

    iget-object v1, p0, Lz3/d$a;->b:Lf4/u;

    const-string v2, "source"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sink"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lz3/s;->c:Lz3/s$a;

    const-wide/16 v6, 0x0

    move-wide v7, v6

    const/4 v6, 0x0

    :goto_1
    cmp-long v9, v7, v4

    if-gez v9, :cond_3

    invoke-virtual {v1}, Lf4/u;->readByte()B

    move-result v9

    sget-object v10, Lt3/c;->a:[B

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v3, v9

    add-int/lit8 v6, v6, 0x8

    :goto_2
    const/16 v9, 0x8

    if-lt v6, v9, :cond_2

    add-int/lit8 v9, v6, -0x8

    ushr-int v10, v3, v9

    and-int/lit16 v10, v10, 0xff

    iget-object v2, v2, Lz3/s$a;->a:[Lz3/s$a;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v2, v2, v10

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v10, v2, Lz3/s$a;->a:[Lz3/s$a;

    if-nez v10, :cond_1

    iget v9, v2, Lz3/s$a;->b:I

    invoke-virtual {v0, v9}, Lf4/f;->A(I)Lf4/f;

    iget v2, v2, Lz3/s$a;->c:I

    sub-int/2addr v6, v2

    sget-object v2, Lz3/s;->c:Lz3/s$a;

    goto :goto_2

    :cond_1
    move v6, v9

    goto :goto_2

    :cond_2
    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    goto :goto_1

    :cond_3
    :goto_3
    if-lez v6, :cond_5

    rsub-int/lit8 v1, v6, 0x8

    shl-int v1, v3, v1

    and-int/lit16 v1, v1, 0xff

    iget-object v2, v2, Lz3/s$a;->a:[Lz3/s$a;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aget-object v1, v2, v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, v1, Lz3/s$a;->a:[Lz3/s$a;

    if-nez v2, :cond_5

    iget v2, v1, Lz3/s$a;->c:I

    if-le v2, v6, :cond_4

    goto :goto_4

    :cond_4
    iget v2, v1, Lz3/s$a;->b:I

    invoke-virtual {v0, v2}, Lf4/f;->A(I)Lf4/f;

    iget v1, v1, Lz3/s$a;->c:I

    sub-int/2addr v6, v1

    sget-object v2, Lz3/s;->c:Lz3/s$a;

    goto :goto_3

    :cond_5
    :goto_4
    invoke-virtual {v0}, Lf4/f;->l()Lf4/i;

    move-result-object v0

    goto :goto_5

    :cond_6
    iget-object v0, p0, Lz3/d$a;->b:Lf4/u;

    invoke-virtual {v0, v4, v5}, Lf4/u;->d(J)Lf4/i;

    move-result-object v0

    :goto_5
    return-object v0
.end method

.method public final f(II)I
    .locals 2

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lz3/d$a;->b:Lf4/u;

    invoke-virtual {v0}, Lf4/u;->readByte()B

    move-result v0

    sget-object v1, Lt3/c;->a:[B

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, p1

    add-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_1
    shl-int p1, v0, p1

    add-int/2addr p2, p1

    return p2
.end method
