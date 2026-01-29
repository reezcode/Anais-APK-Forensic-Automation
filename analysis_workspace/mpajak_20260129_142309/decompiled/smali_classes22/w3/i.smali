.class public final Lw3/i;
.super Le4/d$c;


# instance fields
.field public final synthetic e:Lw3/c;

.field public final synthetic f:Lf4/h;

.field public final synthetic g:Lf4/g;


# direct methods
.method public constructor <init>(Lw3/c;Lf4/h;Lf4/g;Lf4/h;Lf4/g;)V
    .locals 0

    iput-object p1, p0, Lw3/i;->e:Lw3/c;

    iput-object p2, p0, Lw3/i;->f:Lf4/h;

    iput-object p3, p0, Lw3/i;->g:Lf4/g;

    invoke-direct {p0, p4, p5}, Le4/d$c;-><init>(Lf4/h;Lf4/g;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Lw3/i;->e:Lw3/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v1, v2}, Lw3/c;->a(ZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method
