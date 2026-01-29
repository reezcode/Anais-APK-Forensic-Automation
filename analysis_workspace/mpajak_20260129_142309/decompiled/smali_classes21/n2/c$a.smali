.class public final Ln2/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 2
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

    const-class v0, Ljava/sql/Timestamp;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    const-class p2, Ljava/util/Date;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lo2/a;

    invoke-direct {v0, p2}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v0}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object p1

    new-instance p2, Ln2/c;

    invoke-direct {p2, p1, v1}, Ln2/c;-><init>(Li2/z;Ln2/c$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
