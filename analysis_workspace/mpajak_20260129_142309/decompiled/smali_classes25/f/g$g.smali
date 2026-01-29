.class public final Lf/g$g;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:[Ljava/lang/Long;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Long;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$g;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$g;->b:J

    iput-object p2, p0, Lf/g$g;->c:[Ljava/lang/Long;

    iput-boolean p3, p0, Lf/g$g;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 6

    iget-object v0, p0, Lf/g$g;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$g;->b:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lf/g$g;->c:[Ljava/lang/Long;

    array-length v0, p1

    :goto_0
    if-ge p2, v0, :cond_1

    aget-object v1, p1, p2

    if-nez v1, :cond_0

    :goto_1
    iget-boolean p1, p0, Lf/g$g;->d:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lf/g$g;->d:Z

    return p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_5

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lf/g$g;->c:[Ljava/lang/Long;

    array-length v2, p1

    :goto_2
    if-ge p2, v2, :cond_5

    aget-object v3, p1, p2

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v5, v3, v0

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    iget-boolean p1, p0, Lf/g$g;->d:Z

    return p1
.end method
