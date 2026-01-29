.class public final Lc0/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lp/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/g<",
            "Lp/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lp/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lp/b;->b:Lp/b;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    invoke-static {v1, v0}, Lp/g;->a(Ljava/lang/String;Ljava/lang/Object;)Lp/g;

    move-result-object v0

    sput-object v0, Lc0/i;->a:Lp/g;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    invoke-static {v1, v0}, Lp/g;->a(Ljava/lang/String;Ljava/lang/Object;)Lp/g;

    move-result-object v0

    sput-object v0, Lc0/i;->b:Lp/g;

    return-void
.end method
