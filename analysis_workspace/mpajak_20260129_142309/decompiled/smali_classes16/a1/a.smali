.class public final La1/a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final b:Lg3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg3/a;"
        }
    .end annotation
.end field

.field public static c:Landroidx/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "La1/a;",
            ">;"
        }
    .end annotation
.end field

.field public static d:La1/d;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, La1/b;->b()La1/b;

    move-result-object v0

    invoke-virtual {v0}, La1/b;->a()Lg3/a;

    move-result-object v0

    sput-object v0, La1/a;->b:Lg3/a;

    new-instance v0, Landroidx/collection/ArrayMap;

    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    sput-object v0, La1/a;->c:Landroidx/collection/ArrayMap;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x7

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, La1/a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    iput-object p2, p0, La1/a;->a:Ljava/lang/String;

    return-void
.end method
