.class public final La1/b;
.super Ljava/lang/Object;


# static fields
.field public static a:La1/b;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "SdkFlagFactory.class"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized b()La1/b;
    .locals 2

    const-class v0, La1/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, La1/b;->a:La1/b;

    if-nez v1, :cond_0

    new-instance v1, La1/b;

    invoke-direct {v1}, La1/b;-><init>()V

    sput-object v1, La1/b;->a:La1/b;

    :cond_0
    sget-object v1, La1/b;->a:La1/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a()Lg3/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lg3/a;"
        }
    .end annotation

    new-instance v0, Lg3/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg3/a;-><init>(Ljava/lang/Object;Li/g;)V

    return-object v0
.end method
