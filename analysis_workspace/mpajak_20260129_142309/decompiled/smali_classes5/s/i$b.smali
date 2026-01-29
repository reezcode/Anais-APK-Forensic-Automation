.class public final Ls/i$b;
.super Ls/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls/c<",
        "Ls/i$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ls/l;
    .locals 1

    new-instance v0, Ls/i$a;

    invoke-direct {v0, p0}, Ls/i$a;-><init>(Ls/i$b;)V

    return-object v0
.end method

.method public final d(ILjava/lang/Class;)Ls/i$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Ls/i$a;"
        }
    .end annotation

    invoke-virtual {p0}, Ls/c;->b()Ls/l;

    move-result-object v0

    check-cast v0, Ls/i$a;

    iput p1, v0, Ls/i$a;->b:I

    iput-object p2, v0, Ls/i$a;->c:Ljava/lang/Class;

    return-object v0
.end method
