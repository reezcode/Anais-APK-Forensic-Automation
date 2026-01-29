.class public final Lz3/n;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f;)V
    .locals 0

    iput-object p2, p0, Lz3/n;->e:Lz3/f;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, Lz3/n;->e:Lz3/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, v1}, Lz3/f;->q(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
