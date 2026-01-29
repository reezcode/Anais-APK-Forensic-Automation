.class public final Lk3/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v0, p0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->getSettingIconName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 2

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const-string v1, "com.superbock.ui.StartupActivity"

    invoke-virtual {v0, p0, v1, p1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->hdic(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->isAppInFront()Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 2

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const-string v1, "com.superbock.ui.StartupActivity"

    invoke-virtual {v0, p0, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->ishdic(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static e(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    sget-boolean v0, Le3/d;->b:Z

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, p1, v0}, Lk3/d;->f(Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method

.method public static f(Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 8

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    invoke-virtual/range {v0 .. v7}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->surprise(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ZZLmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Jehtxjp;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;)V

    return-void
.end method
