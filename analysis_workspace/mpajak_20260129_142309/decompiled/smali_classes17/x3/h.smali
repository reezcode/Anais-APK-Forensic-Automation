.class public final Lx3/h;
.super Ls3/d0;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Lf4/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLf4/h;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ls3/d0;-><init>()V

    iput-object p1, p0, Lx3/h;->b:Ljava/lang/String;

    iput-wide p2, p0, Lx3/h;->c:J

    iput-object p4, p0, Lx3/h;->d:Lf4/h;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lx3/h;->c:J

    return-wide v0
.end method

.method public final b()Ls3/u;
    .locals 2

    iget-object v0, p0, Lx3/h;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Ls3/u;->f:Ls3/u$a;

    invoke-virtual {v1, v0}, Ls3/u$a;->b(Ljava/lang/String;)Ls3/u;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Lf4/h;
    .locals 1

    iget-object v0, p0, Lx3/h;->d:Lf4/h;

    return-object v0
.end method
