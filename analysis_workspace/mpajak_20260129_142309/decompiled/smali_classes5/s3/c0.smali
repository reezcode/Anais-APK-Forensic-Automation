.class public final Ls3/c0;
.super Ls3/d0;


# instance fields
.field public final synthetic b:Lf4/h;

.field public final synthetic c:Ls3/u;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lf4/h;Ls3/u;J)V
    .locals 0

    iput-object p1, p0, Ls3/c0;->b:Lf4/h;

    iput-object p2, p0, Ls3/c0;->c:Ls3/u;

    iput-wide p3, p0, Ls3/c0;->d:J

    invoke-direct {p0}, Ls3/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Ls3/c0;->d:J

    return-wide v0
.end method

.method public final b()Ls3/u;
    .locals 1

    iget-object v0, p0, Ls3/c0;->c:Ls3/u;

    return-object v0
.end method

.method public final c()Lf4/h;
    .locals 1

    iget-object v0, p0, Ls3/c0;->b:Lf4/h;

    return-object v0
.end method
