.class public final Lg3/j;
.super Ljava/lang/Object;


# static fields
.field public static c:Lg3/j;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lg3/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v0, Lg3/o;

    sget-object v1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-direct {v0, v1}, Lg3/o;-><init>(Landroid/content/Context;)V

    const-class v1, Lcom/superbock/bean/IInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/j;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg3/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lg3/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lg3/j;
    .locals 2

    sget-object v0, Lg3/j;->c:Lg3/j;

    if-nez v0, :cond_1

    const-class v0, Lg3/j;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/j;->c:Lg3/j;

    if-nez v1, :cond_0

    new-instance v1, Lg3/j;

    invoke-direct {v1}, Lg3/j;-><init>()V

    sput-object v1, Lg3/j;->c:Lg3/j;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lg3/j;->c:Lg3/j;

    return-object v0
.end method


# virtual methods
.method public final finalize()V
    .locals 1

    iget v0, p0, Lg3/j;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
