.class public final Lr/n$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Lh0/g;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lh0/g;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/n$d;->a:Lh0/g;

    iput-object p2, p0, Lr/n$d;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lr/n$d;

    if-eqz v0, :cond_0

    check-cast p1, Lr/n$d;

    iget-object v0, p0, Lr/n$d;->a:Lh0/g;

    iget-object p1, p1, Lr/n$d;->a:Lh0/g;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lr/n$d;->a:Lh0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
