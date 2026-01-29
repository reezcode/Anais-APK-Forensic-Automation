.class public final Ls3/b0$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ls3/y;

.field public b:Ls3/x;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ls3/q;

.field public f:Ls3/r$a;

.field public g:Ls3/d0;

.field public h:Ls3/b0;

.field public i:Ls3/b0;

.field public j:Ls3/b0;

.field public k:J

.field public l:J

.field public m:Lw3/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ls3/b0$a;->c:I

    new-instance v0, Ls3/r$a;

    invoke-direct {v0}, Ls3/r$a;-><init>()V

    iput-object v0, p0, Ls3/b0$a;->f:Ls3/r$a;

    return-void
.end method

.method public constructor <init>(Ls3/b0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Ls3/b0$a;->c:I

    iget-object v0, p1, Ls3/b0;->b:Ls3/y;

    iput-object v0, p0, Ls3/b0$a;->a:Ls3/y;

    iget-object v0, p1, Ls3/b0;->c:Ls3/x;

    iput-object v0, p0, Ls3/b0$a;->b:Ls3/x;

    iget v0, p1, Ls3/b0;->e:I

    iput v0, p0, Ls3/b0$a;->c:I

    iget-object v0, p1, Ls3/b0;->d:Ljava/lang/String;

    iput-object v0, p0, Ls3/b0$a;->d:Ljava/lang/String;

    iget-object v0, p1, Ls3/b0;->f:Ls3/q;

    iput-object v0, p0, Ls3/b0$a;->e:Ls3/q;

    iget-object v0, p1, Ls3/b0;->g:Ls3/r;

    invoke-virtual {v0}, Ls3/r;->s()Ls3/r$a;

    move-result-object v0

    iput-object v0, p0, Ls3/b0$a;->f:Ls3/r$a;

    iget-object v0, p1, Ls3/b0;->h:Ls3/d0;

    iput-object v0, p0, Ls3/b0$a;->g:Ls3/d0;

    iget-object v0, p1, Ls3/b0;->i:Ls3/b0;

    iput-object v0, p0, Ls3/b0$a;->h:Ls3/b0;

    iget-object v0, p1, Ls3/b0;->j:Ls3/b0;

    iput-object v0, p0, Ls3/b0$a;->i:Ls3/b0;

    iget-object v0, p1, Ls3/b0;->k:Ls3/b0;

    iput-object v0, p0, Ls3/b0$a;->j:Ls3/b0;

    iget-wide v0, p1, Ls3/b0;->l:J

    iput-wide v0, p0, Ls3/b0$a;->k:J

    iget-wide v0, p1, Ls3/b0;->m:J

    iput-wide v0, p0, Ls3/b0$a;->l:J

    iget-object p1, p1, Ls3/b0;->n:Lw3/c;

    iput-object p1, p0, Ls3/b0$a;->m:Lw3/c;

    return-void
.end method


# virtual methods
.method public final a()Ls3/b0;
    .locals 18

    move-object/from16 v0, p0

    iget v5, v0, Ls3/b0$a;->c:I

    if-ltz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    iget-object v2, v0, Ls3/b0$a;->a:Ls3/y;

    if-eqz v2, :cond_3

    iget-object v3, v0, Ls3/b0$a;->b:Ls3/x;

    if-eqz v3, :cond_2

    iget-object v4, v0, Ls3/b0$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v6, v0, Ls3/b0$a;->e:Ls3/q;

    iget-object v1, v0, Ls3/b0$a;->f:Ls3/r$a;

    invoke-virtual {v1}, Ls3/r$a;->b()Ls3/r;

    move-result-object v7

    iget-object v8, v0, Ls3/b0$a;->g:Ls3/d0;

    iget-object v9, v0, Ls3/b0$a;->h:Ls3/b0;

    iget-object v10, v0, Ls3/b0$a;->i:Ls3/b0;

    iget-object v11, v0, Ls3/b0$a;->j:Ls3/b0;

    iget-wide v12, v0, Ls3/b0$a;->k:J

    iget-wide v14, v0, Ls3/b0$a;->l:J

    iget-object v1, v0, Ls3/b0$a;->m:Lw3/c;

    new-instance v17, Ls3/b0;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, Ls3/b0;-><init>(Ls3/y;Ls3/x;Ljava/lang/String;ILs3/q;Ls3/r;Ls3/d0;Ls3/b0;Ls3/b0;Ls3/b0;JJLw3/c;)V

    return-object v17

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    const-string v1, "code < 0: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v0, Ls3/b0$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final b(Ls3/b0;)Ls3/b0$a;
    .locals 1

    const-string v0, "cacheResponse"

    invoke-virtual {p0, v0, p1}, Ls3/b0$a;->c(Ljava/lang/String;Ls3/b0;)V

    iput-object p1, p0, Ls3/b0$a;->i:Ls3/b0;

    return-object p0
.end method

.method public final c(Ljava/lang/String;Ls3/b0;)V
    .locals 2

    if-eqz p2, :cond_8

    iget-object v0, p2, Ls3/b0;->h:Ls3/d0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    iget-object v0, p2, Ls3/b0;->i:Ls3/b0;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_6

    iget-object v0, p2, Ls3/b0;->j:Ls3/b0;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_5

    iget-object p2, p2, Ls3/b0;->k:Ls3/b0;

    if-nez p2, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string p2, ".priorResponse != null"

    invoke-static {p1, p2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    const-string p2, ".cacheResponse != null"

    invoke-static {p1, p2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p2, ".networkResponse != null"

    invoke-static {p1, p2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    const-string p2, ".body != null"

    invoke-static {p1, p2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    :goto_3
    return-void
.end method

.method public final d(Ls3/r;)Ls3/b0$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls3/r;->s()Ls3/r$a;

    move-result-object p1

    iput-object p1, p0, Ls3/b0$a;->f:Ls3/r$a;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Ls3/b0$a;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ls3/b0$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final f(Ls3/x;)Ls3/b0$a;
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ls3/b0$a;->b:Ls3/x;

    return-object p0
.end method

.method public final g(Ls3/y;)Ls3/b0$a;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ls3/b0$a;->a:Ls3/y;

    return-object p0
.end method
