.class public final Lc0/b;
.super Ljava/lang/Object;

# interfaces
.implements Lo/a$a;


# instance fields
.field public final a:Ls/d;

.field public final b:Ls/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls/d;Ls/b;)V
    .locals 0
    .param p2    # Ls/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc0/b;->a:Ls/d;

    iput-object p2, p0, Lc0/b;->b:Ls/b;

    return-void
.end method


# virtual methods
.method public final a(I)[B
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lc0/b;->b:Ls/b;

    if-nez v0, :cond_0

    new-array p1, p1, [B

    return-object p1

    :cond_0
    const-class v1, [B

    invoke-interface {v0, p1, v1}, Ls/b;->b(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method
