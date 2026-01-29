.class public final Lo3/b;
.super Ljava/lang/Object;

# interfaces
.implements Lo3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo3/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lo3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo3/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo3/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/c<",
            "+TT;>;",
            "Lm3/u0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/b;->a:Lo3/c;

    return-void
.end method
