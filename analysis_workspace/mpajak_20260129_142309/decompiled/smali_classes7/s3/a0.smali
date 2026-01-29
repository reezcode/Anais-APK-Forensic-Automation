.class public final Ls3/a0;
.super Ld1/f;


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Ls3/u;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>([BLs3/u;II)V
    .locals 0

    iput-object p1, p0, Ls3/a0;->b:[B

    iput-object p2, p0, Ls3/a0;->c:Ls3/u;

    iput p3, p0, Ls3/a0;->d:I

    iput p4, p0, Ls3/a0;->e:I

    invoke-direct {p0}, Ld1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    iget v0, p0, Ls3/a0;->d:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final B()Ls3/u;
    .locals 1

    iget-object v0, p0, Ls3/a0;->c:Ls3/u;

    return-object v0
.end method

.method public final K(Lf4/g;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls3/a0;->b:[B

    iget v1, p0, Ls3/a0;->e:I

    iget v2, p0, Ls3/a0;->d:I

    invoke-interface {p1, v0, v1, v2}, Lf4/g;->j([BII)Lf4/g;

    return-void
.end method
