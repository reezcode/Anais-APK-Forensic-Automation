.class public final Lf/g$t;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "t"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:[Ljava/lang/String;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$t;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$t;->b:J

    iput-object p2, p0, Lf/g$t;->c:[Ljava/lang/String;

    iput-boolean p3, p0, Lf/g$t;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lf/g$t;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$t;->b:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lf/g$t;->c:[Ljava/lang/String;

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p2, v1

    if-ne v2, p1, :cond_0

    :goto_1
    iget-boolean p1, p0, Lf/g$t;->d:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p1, p0, Lf/g$t;->d:Z

    return p1
.end method
