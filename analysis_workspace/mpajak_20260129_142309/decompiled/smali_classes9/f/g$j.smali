.class public final Lf/g$j;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:[Ljava/lang/String;

.field public final f:I

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$j;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$j;->b:J

    iput-object p2, p0, Lf/g$j;->c:Ljava/lang/String;

    iput-object p3, p0, Lf/g$j;->d:Ljava/lang/String;

    iput-object p4, p0, Lf/g$j;->e:[Ljava/lang/String;

    iput-boolean p5, p0, Lf/g$j;->g:Z

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p2, p3

    :cond_1
    if-eqz p4, :cond_2

    array-length p3, p4

    :goto_1
    if-ge p1, p3, :cond_2

    aget-object p5, p4, p1

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p5

    add-int/2addr p2, p5

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    iput p2, p0, Lf/g$j;->f:I

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 5

    iget-object v0, p0, Lf/g$j;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$j;->b:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lf/g$j;->f:I

    if-ge v0, v1, :cond_1

    iget-boolean p1, p0, Lf/g$j;->g:Z

    return p1

    :cond_1
    iget-object v0, p0, Lf/g$j;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean p1, p0, Lf/g$j;->g:Z

    return p1

    :cond_2
    iget-object v0, p0, Lf/g$j;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p2

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lf/g$j;->e:[Ljava/lang/String;

    if-eqz v1, :cond_5

    array-length v2, v1

    :goto_1
    if-ge p2, v2, :cond_5

    aget-object v3, v1, p2

    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    const/4 v4, -0x1

    if-ne v0, v4, :cond_4

    iget-boolean p1, p0, Lf/g$j;->g:Z

    return p1

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v0, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_5
    iget-object p2, p0, Lf/g$j;->d:Ljava/lang/String;

    if-eqz p2, :cond_6

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-boolean p1, p0, Lf/g$j;->g:Z

    return p1

    :cond_6
    iget-boolean p1, p0, Lf/g$j;->g:Z

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
