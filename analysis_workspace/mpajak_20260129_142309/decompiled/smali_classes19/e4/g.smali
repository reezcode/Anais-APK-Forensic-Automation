.class public final Le4/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/g$a;
    }
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public d:J

.field public e:Z

.field public f:Z

.field public g:Z

.field public final h:Lf4/f;

.field public final i:Lf4/f;

.field public j:Le4/c;

.field public final k:[B

.field public final l:Lf4/f$a;

.field public final m:Z

.field public final n:Lf4/h;

.field public final o:Le4/g$a;

.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(ZLf4/h;Le4/g$a;ZZ)V
    .locals 1

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le4/g;->m:Z

    iput-object p2, p0, Le4/g;->n:Lf4/h;

    iput-object p3, p0, Le4/g;->o:Le4/g$a;

    iput-boolean p4, p0, Le4/g;->p:Z

    iput-boolean p5, p0, Le4/g;->q:Z

    new-instance p2, Lf4/f;

    invoke-direct {p2}, Lf4/f;-><init>()V

    iput-object p2, p0, Le4/g;->h:Lf4/f;

    new-instance p2, Lf4/f;

    invoke-direct {p2}, Lf4/f;-><init>()V

    iput-object p2, p0, Le4/g;->i:Lf4/f;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    move-object p3, p2

    goto :goto_0

    :cond_0
    const/4 p3, 0x4

    new-array p3, p3, [B

    :goto_0
    iput-object p3, p0, Le4/g;->k:[B

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Lf4/f$a;

    invoke-direct {p2}, Lf4/f$a;-><init>()V

    :goto_1
    iput-object p2, p0, Le4/g;->l:Lf4/f$a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-wide v0, p0, Le4/g;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v4, p0, Le4/g;->n:Lf4/h;

    iget-object v5, p0, Le4/g;->h:Lf4/f;

    invoke-interface {v4, v5, v0, v1}, Lf4/h;->F(Lf4/f;J)V

    iget-boolean v0, p0, Le4/g;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Le4/g;->h:Lf4/f;

    iget-object v1, p0, Le4/g;->l:Lf4/f$a;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lf4/f;->f(Lf4/f$a;)Lf4/f$a;

    iget-object v0, p0, Le4/g;->l:Lf4/f$a;

    invoke-virtual {v0, v2, v3}, Lf4/f$a;->b(J)I

    iget-object v0, p0, Le4/g;->l:Lf4/f$a;

    iget-object v1, p0, Le4/g;->k:[B

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Li/g;->I(Lf4/f$a;[B)V

    iget-object v0, p0, Le4/g;->l:Lf4/f$a;

    invoke-virtual {v0}, Lf4/f$a;->close()V

    :cond_0
    iget v0, p0, Le4/g;->c:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unknown control opcode: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Le4/g;->c:I

    invoke-static {v2}, Lt3/c;->x(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Le4/g;->o:Le4/g$a;

    iget-object v1, p0, Le4/g;->h:Lf4/f;

    invoke-virtual {v1}, Lf4/f;->l()Lf4/i;

    move-result-object v1

    invoke-interface {v0, v1}, Le4/g$a;->e(Lf4/i;)V

    goto/16 :goto_5

    :pswitch_1
    iget-object v0, p0, Le4/g;->o:Le4/g$a;

    iget-object v1, p0, Le4/g;->h:Lf4/f;

    invoke-virtual {v1}, Lf4/f;->l()Lf4/i;

    move-result-object v1

    invoke-interface {v0, v1}, Le4/g$a;->c(Lf4/i;)V

    goto :goto_5

    :pswitch_2
    const/16 v0, 0x3ed

    iget-object v1, p0, Le4/g;->h:Lf4/f;

    iget-wide v4, v1, Lf4/f;->c:J

    const-wide/16 v6, 0x1

    cmp-long v8, v4, v6

    if-eqz v8, :cond_9

    cmp-long v6, v4, v2

    if-eqz v6, :cond_8

    invoke-virtual {v1}, Lf4/f;->readShort()S

    move-result v0

    iget-object v1, p0, Le4/g;->h:Lf4/f;

    invoke-virtual {v1}, Lf4/f;->q()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3e8

    if-lt v0, v2, :cond_6

    const/16 v2, 0x1388

    if-lt v0, v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x3ee

    const/16 v3, 0x3ec

    if-gt v3, v0, :cond_2

    if-ge v2, v0, :cond_4

    :cond_2
    const/16 v2, 0xbb7

    const/16 v3, 0x3f7

    if-le v3, v0, :cond_3

    goto :goto_0

    :cond_3
    if-lt v2, v0, :cond_5

    :cond_4
    const-string v2, "Code "

    const-string v3, " is reserved and may not be used."

    invoke-static {v2, v0, v3}, Landroidx/appcompat/graphics/drawable/a;->e(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    goto :goto_2

    :cond_5
    :goto_0
    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Code must be in range [1000,5000): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_3
    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const-string v1, ""

    :goto_4
    iget-object v2, p0, Le4/g;->o:Le4/g$a;

    invoke-interface {v2, v0, v1}, Le4/g$a;->f(ILjava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/g;->b:Z

    :goto_5
    return-void

    :cond_9
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed close payload length of 1."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 8

    iget-boolean v0, p0, Le4/g;->b:Z

    if-nez v0, :cond_16

    iget-object v0, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v0}, Lf4/a0;->i()Lf4/b0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/b0;->h()J

    move-result-wide v0

    iget-object v2, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v2}, Lf4/a0;->i()Lf4/b0;

    move-result-object v2

    invoke-virtual {v2}, Lf4/b0;->b()Lf4/b0;

    :try_start_0
    iget-object v2, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readByte()B

    move-result v2

    sget-object v3, Lt3/c;->a:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit16 v2, v2, 0xff

    iget-object v3, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v3}, Lf4/a0;->i()Lf4/b0;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    and-int/lit8 v0, v2, 0xf

    iput v0, p0, Le4/g;->c:I

    and-int/lit16 v1, v2, 0x80

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Le4/g;->e:Z

    and-int/lit8 v5, v2, 0x8

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    iput-boolean v5, p0, Le4/g;->f:Z

    if-eqz v5, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frames must be final."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    and-int/lit8 v1, v2, 0x40

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    const-string v5, "Unexpected rsv1 flag"

    if-eq v0, v4, :cond_6

    const/4 v4, 0x2

    if-eq v0, v4, :cond_6

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz v1, :cond_8

    iget-boolean v0, p0, Le4/g;->p:Z

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    invoke-direct {v0, v5}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Le4/g;->g:Z

    :goto_5
    and-int/lit8 v0, v2, 0x20

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    if-nez v0, :cond_15

    and-int/lit8 v0, v2, 0x10

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_7

    :cond_a
    const/4 v0, 0x0

    :goto_7
    if-nez v0, :cond_14

    iget-object v0, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v0}, Lf4/h;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_b

    const/4 v3, 0x1

    :cond_b
    iget-boolean v1, p0, Le4/g;->m:Z

    if-ne v3, v1, :cond_d

    new-instance v0, Ljava/net/ProtocolException;

    iget-boolean v1, p0, Le4/g;->m:Z

    if-eqz v1, :cond_c

    const-string v1, "Server-sent frames must not be masked."

    goto :goto_8

    :cond_c
    const-string v1, "Client-sent frames must be masked."

    :goto_8
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    const/16 v1, 0x7f

    and-int/2addr v0, v1

    int-to-long v4, v0

    iput-wide v4, p0, Le4/g;->d:J

    const/16 v0, 0x7e

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-nez v0, :cond_e

    iget-object v0, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v0}, Lf4/h;->readShort()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    iput-wide v0, p0, Le4/g;->d:J

    goto :goto_9

    :cond_e
    int-to-long v0, v1

    cmp-long v2, v4, v0

    if-nez v2, :cond_10

    iget-object v0, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v0}, Lf4/h;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Le4/g;->d:J

    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-ltz v2, :cond_f

    goto :goto_9

    :cond_f
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Frame length 0x"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Le4/g;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "java.lang.Long.toHexString(this)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " > 0x7FFFFFFFFFFFFFFF"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_9
    iget-boolean v0, p0, Le4/g;->f:Z

    if-eqz v0, :cond_12

    iget-wide v0, p0, Le4/g;->d:J

    const-wide/16 v4, 0x7d

    cmp-long v2, v0, v4

    if-gtz v2, :cond_11

    goto :goto_a

    :cond_11
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Control frame must be less than 125B."

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    :goto_a
    if-eqz v3, :cond_13

    iget-object v0, p0, Le4/g;->n:Lf4/h;

    iget-object v1, p0, Le4/g;->k:[B

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lf4/h;->readFully([B)V

    :cond_13
    return-void

    :cond_14
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv3 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected rsv2 flag"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Le4/g;->n:Lf4/h;

    invoke-interface {v3}, Lf4/a0;->i()Lf4/b0;

    move-result-object v3

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v0, v1, v4}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    throw v2

    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Le4/g;->j:Le4/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le4/c;->close()V

    :cond_0
    return-void
.end method
