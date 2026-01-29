.class public final Lh/e;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:J

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Lh/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILh/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh/e;->a:I

    iget p1, p2, Lh/e;->b:I

    iput p1, p0, Lh/e;->b:I

    iget p1, p2, Lh/e;->c:I

    iput p1, p0, Lh/e;->c:I

    iget-wide v0, p2, Lh/e;->d:J

    iput-wide v0, p0, Lh/e;->d:J

    iget-object p1, p2, Lh/e;->e:Ljava/lang/String;

    iput-object p1, p0, Lh/e;->e:Ljava/lang/String;

    iget-object p1, p2, Lh/e;->f:Ljava/lang/String;

    iput-object p1, p0, Lh/e;->f:Ljava/lang/String;

    iget-object p1, p2, Lh/e;->g:Ljava/lang/String;

    iput-object p1, p0, Lh/e;->g:Ljava/lang/String;

    iget p1, p2, Lh/e;->h:I

    iput p1, p0, Lh/e;->h:I

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iput p1, p0, Lh/e;->b:I

    iput-object p2, p0, Lh/e;->e:Ljava/lang/String;

    iput-object p3, p0, Lh/e;->f:Ljava/lang/String;

    iput-object p4, p0, Lh/e;->g:Ljava/lang/String;

    const/4 v0, 0x1

    const v1, 0x7fffffff

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int p3, p3, p2

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result p2

    mul-int p2, p2, p3

    :goto_0
    add-int/2addr p2, p1

    and-int p1, p2, v1

    :goto_1
    iput p1, p0, Lh/e;->h:I

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int p3, p3, p2

    add-int/2addr p3, p1

    and-int p1, p3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    goto :goto_0
.end method
