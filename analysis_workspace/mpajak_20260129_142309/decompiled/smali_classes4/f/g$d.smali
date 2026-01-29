.class public final Lf/g$d;
.super Ljava/lang/Object;

# interfaces
.implements Lf/g$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Lf/g$c;


# direct methods
.method public constructor <init>(Lf/g$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/g$d;->a:Lf/g$c;

    return-void
.end method


# virtual methods
.method public final a(Lf/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const/4 p2, 0x0

    if-nez p3, :cond_0

    return-object p2

    :cond_0
    new-instance v0, Lf/b;

    invoke-direct {v0}, Lf/b;-><init>()V

    instance-of v1, p3, Ljava/lang/Iterable;

    if-eqz v1, :cond_3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    iget-object v1, p0, Lf/g$d;->a:Lf/g$c;

    invoke-interface {v1, p1, p3}, Lf/g$c;->a(Lf/g;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p3}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    iget-object v0, p0, Lf/g$d;->a:Lf/g$c;

    invoke-interface {v0, p1, p3}, Lf/g$c;->a(Lf/g;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object p3

    :cond_4
    return-object p2
.end method
