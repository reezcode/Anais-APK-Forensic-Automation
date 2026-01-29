.class public final Lpl/droidsonroids/gif/a;
.super Lpl/droidsonroids/gif/f;


# instance fields
.field public final synthetic c:Lpl/droidsonroids/gif/b;


# direct methods
.method public constructor <init>(Lpl/droidsonroids/gif/b;Lpl/droidsonroids/gif/b;)V
    .locals 0

    iput-object p1, p0, Lpl/droidsonroids/gif/a;->c:Lpl/droidsonroids/gif/b;

    invoke-direct {p0, p2}, Lpl/droidsonroids/gif/f;-><init>(Lpl/droidsonroids/gif/b;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lpl/droidsonroids/gif/a;->c:Lpl/droidsonroids/gif/b;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/droidsonroids/gif/a;->c:Lpl/droidsonroids/gif/b;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/b;->start()V

    :cond_0
    return-void
.end method
