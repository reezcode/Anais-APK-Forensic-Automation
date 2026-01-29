.class public final Ll2/i;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic b:Ll2/j;


# direct methods
.method public constructor <init>(Ll2/j;)V
    .locals 0

    iput-object p1, p0, Ll2/i;->b:Ll2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 0
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

    iget-object p1, p2, Lo2/a;->a:Ljava/lang/Class;

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ll2/i;->b:Ll2/j;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
