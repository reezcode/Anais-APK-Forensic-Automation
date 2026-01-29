.class public final Lk/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lm/c;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lm/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lm/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/j;->a:Lm/c;

    iget-object p1, p1, Lm/c;->t:Ljava/lang/String;

    iput-object p1, p0, Lk/j;->b:Ljava/lang/String;

    return-void
.end method
