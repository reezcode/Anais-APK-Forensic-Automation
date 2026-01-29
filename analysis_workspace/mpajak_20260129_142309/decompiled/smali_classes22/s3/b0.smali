.class public final Ls3/b0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/b0$a;
    }
.end annotation


# instance fields
.field public final b:Ls3/y;

.field public final c:Ls3/x;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ls3/q;

.field public final g:Ls3/r;

.field public final h:Ls3/d0;

.field public final i:Ls3/b0;

.field public final j:Ls3/b0;

.field public final k:Ls3/b0;

.field public final l:J

.field public final m:J

.field public final n:Lw3/c;


# direct methods
.method public constructor <init>(Ls3/y;Ls3/x;Ljava/lang/String;ILs3/q;Ls3/r;Ls3/d0;Ls3/b0;Ls3/b0;Ls3/b0;JJLw3/c;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    const-string v5, "request"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "protocol"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "message"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "headers"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ls3/b0;->b:Ls3/y;

    iput-object v2, v0, Ls3/b0;->c:Ls3/x;

    iput-object v3, v0, Ls3/b0;->d:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Ls3/b0;->e:I

    move-object v1, p5

    iput-object v1, v0, Ls3/b0;->f:Ls3/q;

    iput-object v4, v0, Ls3/b0;->g:Ls3/r;

    move-object v1, p7

    iput-object v1, v0, Ls3/b0;->h:Ls3/d0;

    move-object v1, p8

    iput-object v1, v0, Ls3/b0;->i:Ls3/b0;

    move-object v1, p9

    iput-object v1, v0, Ls3/b0;->j:Ls3/b0;

    move-object/from16 v1, p10

    iput-object v1, v0, Ls3/b0;->k:Ls3/b0;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Ls3/b0;->l:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Ls3/b0;->m:J

    move-object/from16 v1, p15

    iput-object v1, v0, Ls3/b0;->n:Lw3/c;

    return-void
.end method

.method public static a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "name"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ls3/b0;->g:Ls3/r;

    invoke-virtual {p0, p1}, Ls3/r;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    move-object v0, p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget v0, p0, Ls3/b0;->e:I

    const/16 v1, 0xc8

    if-le v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x12b

    if-lt v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Ls3/b0;->h:Ls3/d0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls3/d0;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "Response{protocol="

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ls3/b0;->c:Ls3/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ls3/b0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/b0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls3/b0;->b:Ls3/y;

    iget-object v1, v1, Ls3/y;->b:Ls3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
