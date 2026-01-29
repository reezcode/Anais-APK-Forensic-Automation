.class public final Lf4/a;
.super Ljava/lang/Object;


# annotations
.annotation build Lkotlin/jvm/JvmName;
    name = "-Base64"
.end annotation


# static fields
.field public static final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    iget-object v1, v1, Lf4/i;->d:[B

    sput-object v1, Lf4/a;->a:[B

    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    return-void
.end method
