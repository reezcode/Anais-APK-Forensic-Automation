.class public final Lf/g$e;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JJZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$e;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$e;->b:J

    iput-wide p2, p0, Lf/g$e;->c:J

    iput-wide p4, p0, Lf/g$e;->d:J

    iput-boolean p6, p0, Lf/g$e;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lf/g$e;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$e;->b:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of p2, p1, Ljava/lang/Number;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    iget-wide v0, p0, Lf/g$e;->c:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    iget-wide v0, p0, Lf/g$e;->d:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    iget-boolean p1, p0, Lf/g$e;->e:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    iget-boolean p1, p0, Lf/g$e;->e:Z

    return p1
.end method
