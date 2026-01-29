.class public final Lh/d;
.super Ljava/lang/Object;


# instance fields
.field public a:Lh/d;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lh/c;->n:Lh/d;

    if-nez v0, :cond_0

    iput-object p0, p1, Lh/c;->n:Lh/d;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lh/c;->o:Lh/d;

    iput-object p0, v0, Lh/d;->a:Lh/d;

    :goto_0
    iput-object p0, p1, Lh/c;->o:Lh/d;

    invoke-virtual {p1, p2}, Lh/c;->d(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lh/d;->b:I

    invoke-virtual {p1, p3}, Lh/c;->d(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lh/d;->c:I

    return-void
.end method
