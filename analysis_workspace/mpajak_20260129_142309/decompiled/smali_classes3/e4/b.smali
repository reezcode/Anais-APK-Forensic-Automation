.class public final Le4/b;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf4/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    const-string v1, "000000ffff"

    invoke-virtual {v0, v1}, Lf4/i$a;->a(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    sput-object v0, Le4/b;->a:Lf4/i;

    return-void
.end method
