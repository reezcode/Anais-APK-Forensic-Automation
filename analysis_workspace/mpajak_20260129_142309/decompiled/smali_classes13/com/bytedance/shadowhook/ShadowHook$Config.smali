.class public Lcom/bytedance/shadowhook/ShadowHook$Config;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/shadowhook/ShadowHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Config"
.end annotation


# instance fields
.field private debuggable:Z

.field private libLoader:Lcom/bytedance/shadowhook/ShadowHook$ILibLoader;

.field private mode:I

.field private recordable:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDebuggable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->debuggable:Z

    return v0
.end method

.method public getLibLoader()Lcom/bytedance/shadowhook/ShadowHook$ILibLoader;
    .locals 1

    iget-object v0, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->libLoader:Lcom/bytedance/shadowhook/ShadowHook$ILibLoader;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->mode:I

    return v0
.end method

.method public getRecordable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->recordable:Z

    return v0
.end method

.method public setDebuggable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->debuggable:Z

    return-void
.end method

.method public setLibLoader(Lcom/bytedance/shadowhook/ShadowHook$ILibLoader;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->libLoader:Lcom/bytedance/shadowhook/ShadowHook$ILibLoader;

    return-void
.end method

.method public setMode(I)V
    .locals 0

    iput p1, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->mode:I

    return-void
.end method

.method public setRecordable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bytedance/shadowhook/ShadowHook$Config;->recordable:Z

    return-void
.end method
