.class public final Lf/g$o;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "o"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$o;->a:Ljava/lang/String;

    invoke-static {p1}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lf/g$o;->b:J

    iput-boolean p2, p0, Lf/g$o;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-boolean p2, p0, Lf/g$o;->c:Z

    if-eqz p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lf/g$o;->a:Ljava/lang/String;

    invoke-virtual {p1, p3, v0, p2}, Lf/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V

    return-object p2

    :cond_0
    iget-object p2, p0, Lf/g$o;->a:Ljava/lang/String;

    iget-wide v0, p0, Lf/g$o;->b:J

    invoke-virtual {p1, p3, p2, v0, v1}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
