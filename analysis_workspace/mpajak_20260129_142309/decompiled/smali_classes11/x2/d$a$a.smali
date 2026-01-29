.class public final enum Lx2/d$a$a;
.super Lx2/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "LOCAL"

    const/4 v1, 0x5

    invoke-direct {p0, v0, v1, p1, p2}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lx2/b;
    .locals 1

    new-instance v0, Lx2/a;

    invoke-direct {v0, p1}, Lx2/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
