.class public final Lk0/a;
.super Ljava/lang/Object;

# interfaces
.implements Lp/f;


# instance fields
.field public final b:I

.field public final c:Lp/f;


# direct methods
.method public constructor <init>(ILp/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk0/a;->b:I

    iput-object p2, p0, Lk0/a;->c:Lp/f;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 2
    .param p1    # Ljava/security/MessageDigest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lk0/a;->c:Lp/f;

    invoke-interface {v0, p1}, Lp/f;->a(Ljava/security/MessageDigest;)V

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, Lk0/a;->b:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lk0/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lk0/a;

    iget v0, p0, Lk0/a;->b:I

    iget v2, p1, Lk0/a;->b:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lk0/a;->c:Lp/f;

    iget-object p1, p1, Lk0/a;->c:Lp/f;

    invoke-interface {v0, p1}, Lp/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lk0/a;->c:Lp/f;

    iget v1, p0, Lk0/a;->b:I

    invoke-static {v0, v1}, Ll0/k;->g(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method
