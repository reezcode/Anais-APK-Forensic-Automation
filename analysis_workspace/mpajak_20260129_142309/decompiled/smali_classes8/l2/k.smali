.class public final Ll2/k;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic b:Li2/x;


# direct methods
.method public constructor <init>(Li2/x;)V
    .locals 0

    iput-object p1, p0, Ll2/k;->b:Li2/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li2/i;",
            "Lo2/a<",
            "TT;>;)",
            "Li2/z<",
            "TT;>;"
        }
    .end annotation

    iget-object p2, p2, Lo2/a;->a:Ljava/lang/Class;

    const-class v0, Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    new-instance p2, Ll2/l;

    iget-object v0, p0, Ll2/k;->b:Li2/x;

    invoke-direct {p2, p1, v0}, Ll2/l;-><init>(Li2/i;Li2/x;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
