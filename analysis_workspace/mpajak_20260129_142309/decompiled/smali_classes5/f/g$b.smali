.class public final Lf/g$b;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:D

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;DI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$b;->a:Ljava/lang/String;

    iput-wide p2, p0, Lf/g$b;->b:D

    iput p4, p0, Lf/g$b;->c:I

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Lf/g$b;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 5

    iget-object v0, p0, Lf/g$b;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$b;->d:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    :cond_0
    instance-of v0, p1, Ljava/lang/Number;

    if-nez v0, :cond_1

    return p2

    :cond_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget p1, p0, Lf/g$b;->c:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_3

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpl-double p1, v0, v3

    if-nez p1, :cond_2

    const/4 p2, 0x1

    :cond_2
    return p2

    :cond_3
    const/4 v3, 0x2

    if-ne p1, v3, :cond_5

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpl-double p1, v0, v3

    if-eqz p1, :cond_4

    const/4 p2, 0x1

    :cond_4
    return p2

    :cond_5
    const/4 v3, 0x4

    if-ne p1, v3, :cond_7

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpl-double p1, v0, v3

    if-ltz p1, :cond_6

    const/4 p2, 0x1

    :cond_6
    return p2

    :cond_7
    const/4 v3, 0x3

    if-ne p1, v3, :cond_9

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpl-double p1, v0, v3

    if-lez p1, :cond_8

    const/4 p2, 0x1

    :cond_8
    return p2

    :cond_9
    const/4 v3, 0x6

    if-ne p1, v3, :cond_b

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpg-double p1, v0, v3

    if-gtz p1, :cond_a

    const/4 p2, 0x1

    :cond_a
    return p2

    :cond_b
    const/4 v3, 0x5

    if-ne p1, v3, :cond_c

    iget-wide v3, p0, Lf/g$b;->b:D

    cmpg-double p1, v0, v3

    if-gez p1, :cond_c

    const/4 p2, 0x1

    :cond_c
    return p2
.end method
