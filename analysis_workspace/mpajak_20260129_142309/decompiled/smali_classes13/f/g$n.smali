.class public final Lf/g$n;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "n"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$n;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$n;->b:J

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lf/g$n;->a:Ljava/lang/String;

    iget-wide v1, p0, Lf/g$n;->b:J

    invoke-virtual {p1, p2, v0, v1, v2}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
