.class public final Li/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:[Ljava/lang/String;

.field public final b:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xfff

    iput v0, p0, Li/j;->b:I

    const/16 v0, 0x1000

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Li/j;->a:[Ljava/lang/String;

    const-string v0, "$ref"

    const/4 v1, 0x0

    const/4 v2, 0x4

    const v3, 0x1215ef

    invoke-virtual {p0, v0, v1, v2, v3}, Li/j;->a(Ljava/lang/String;III)Ljava/lang/String;

    sget-object v0, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sget-object v3, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Li/j;->a(Ljava/lang/String;III)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;III)Ljava/lang/String;
    .locals 3

    iget v0, p0, Li/j;->b:I

    and-int/2addr v0, p4

    iget-object v1, p0, Li/j;->a:[Ljava/lang/String;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    if-ne p4, v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p4

    if-ne p3, p4, :cond_0

    invoke-virtual {p1, v1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_1

    :cond_0
    new-array p4, p3, [C

    add-int/2addr p3, p2

    invoke-virtual {p1, p2, p3, p4, v2}, Ljava/lang/String;->getChars(II[CI)V

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p4}, Ljava/lang/String;-><init>([C)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-ne p3, p4, :cond_2

    goto :goto_0

    :cond_2
    new-array p4, p3, [C

    add-int/2addr p3, p2

    invoke-virtual {p1, p2, p3, p4, v2}, Ljava/lang/String;->getChars(II[CI)V

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p4}, Ljava/lang/String;-><init>([C)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Li/j;->a:[Ljava/lang/String;

    aput-object v1, p1, v0

    :goto_1
    return-object v1
.end method

.method public final b([CIII)Ljava/lang/String;
    .locals 4

    iget v0, p0, Li/j;->b:I

    and-int/2addr v0, p4

    iget-object v1, p0, Li/j;->a:[Ljava/lang/String;

    aget-object v1, v1, v0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v2, 0x0

    if-ne p4, v0, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p4

    if-ne p3, p4, :cond_2

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_1

    add-int v0, p2, p4

    aget-char v0, p1, v0

    invoke-virtual {v1, p4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v0, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    const/4 p4, 0x1

    const/4 v2, 0x1

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    return-object v1

    :cond_3
    new-instance p4, Ljava/lang/String;

    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    return-object p4

    :cond_4
    new-instance p4, Ljava/lang/String;

    invoke-direct {p4, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Li/j;->a:[Ljava/lang/String;

    aput-object p1, p2, v0

    return-object p1
.end method
