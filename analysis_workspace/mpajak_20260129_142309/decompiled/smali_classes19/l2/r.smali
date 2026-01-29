.class public final Ll2/r;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# instance fields
.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Li2/z;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Li2/z;)V
    .locals 0

    iput-object p1, p0, Ll2/r;->b:Ljava/lang/Class;

    iput-object p2, p0, Ll2/r;->c:Li2/z;

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

    iget-object p2, p0, Ll2/r;->b:Ljava/lang/Class;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ll2/r;->c:Li2/z;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "Factory[type="

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ll2/r;->b:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll2/r;->c:Li2/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
