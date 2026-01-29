.class public final Lf4/v;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public b:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public c:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public d:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public e:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public f:Lf4/v;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public g:Lf4/v;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lf4/v;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf4/v;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf4/v;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/v;->a:[B

    iput p2, p0, Lf4/v;->b:I

    iput p3, p0, Lf4/v;->c:I

    iput-boolean p4, p0, Lf4/v;->d:Z

    iput-boolean p5, p0, Lf4/v;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lf4/v;
    .locals 4

    iget-object v0, p0, Lf4/v;->f:Lf4/v;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lf4/v;->g:Lf4/v;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lf4/v;->f:Lf4/v;

    iput-object v3, v2, Lf4/v;->f:Lf4/v;

    iget-object v2, p0, Lf4/v;->f:Lf4/v;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lf4/v;->g:Lf4/v;

    iput-object v3, v2, Lf4/v;->g:Lf4/v;

    iput-object v1, p0, Lf4/v;->f:Lf4/v;

    iput-object v1, p0, Lf4/v;->g:Lf4/v;

    return-object v0
.end method

.method public final b(Lf4/v;)Lf4/v;
    .locals 1

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lf4/v;->g:Lf4/v;

    iget-object v0, p0, Lf4/v;->f:Lf4/v;

    iput-object v0, p1, Lf4/v;->f:Lf4/v;

    iget-object v0, p0, Lf4/v;->f:Lf4/v;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p1, v0, Lf4/v;->g:Lf4/v;

    iput-object p1, p0, Lf4/v;->f:Lf4/v;

    return-object p1
.end method

.method public final c()Lf4/v;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf4/v;->d:Z

    new-instance v0, Lf4/v;

    iget-object v2, p0, Lf4/v;->a:[B

    iget v3, p0, Lf4/v;->b:I

    iget v4, p0, Lf4/v;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lf4/v;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final d(Lf4/v;I)V
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lf4/v;->e:Z

    if-eqz v0, :cond_3

    iget v0, p1, Lf4/v;->c:I

    add-int v1, v0, p2

    const/16 v2, 0x2000

    if-le v1, v2, :cond_2

    iget-boolean v3, p1, Lf4/v;->d:Z

    if-nez v3, :cond_1

    iget v3, p1, Lf4/v;->b:I

    sub-int/2addr v1, v3

    if-gt v1, v2, :cond_0

    iget-object v1, p1, Lf4/v;->a:[B

    invoke-static {v1, v1, v3, v0}, Lkotlin/collections/ArraysKt;->a([B[BII)[B

    iget v0, p1, Lf4/v;->c:I

    iget v1, p1, Lf4/v;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Lf4/v;->c:I

    const/4 v0, 0x0

    iput v0, p1, Lf4/v;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lf4/v;->a:[B

    iget-object v1, p1, Lf4/v;->a:[B

    iget v2, p1, Lf4/v;->c:I

    iget v3, p0, Lf4/v;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/collections/ArraysKt;->copyInto([B[BIII)[B

    iget v0, p1, Lf4/v;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Lf4/v;->c:I

    iget p1, p0, Lf4/v;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Lf4/v;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
