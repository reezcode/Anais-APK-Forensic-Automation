.class public final Le3/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    sget-wide v0, Lcom/superbock/auto/BaseService;->T:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v1, ";"

    const-string v4, "com.android.systemui"

    const/4 v5, 0x4

    const-string v6, ""

    if-nez v0, :cond_3

    sget-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v5, :cond_7

    sget-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v13, v6

    move-object v14, v13

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf3/n;

    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-static {v13, v1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    :cond_1
    invoke-static {v13}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, v5, Lf3/n;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v14}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v5, v5, Lf3/n;->a:I

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    goto :goto_0

    :cond_2
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v0

    new-instance v1, Lcom/superbock/bean/JInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    sget-wide v9, Lcom/superbock/auto/BaseService;->T:J

    const/4 v12, 0x1

    sget-object v5, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Ljava/lang/String;

    const-string v11, "com.android.systemui"

    move-object v7, v1

    invoke-direct/range {v7 .. v15}, Lcom/superbock/bean/JInfo;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg3/k;->a(Lcom/superbock/bean/JInfo;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto/16 :goto_2

    :cond_3
    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v5, :cond_7

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v13, v6

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-static {v13, v1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    :cond_4
    invoke-static {v13, v5}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_5
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v0

    new-instance v1, Lcom/superbock/bean/JInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    sget-wide v9, Lcom/superbock/auto/BaseService;->T:J

    const/4 v12, 0x2

    sget-object v14, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v5, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Ljava/lang/String;

    const-string v11, "com.android.systemui"

    move-object v7, v1

    invoke-direct/range {v7 .. v15}, Lcom/superbock/bean/JInfo;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg3/k;->a(Lcom/superbock/bean/JInfo;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sput-object v6, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    goto :goto_2

    :cond_6
    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, v5, :cond_7

    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v0

    new-instance v1, Lcom/superbock/bean/JInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    sget-wide v9, Lcom/superbock/auto/BaseService;->T:J

    const/4 v12, 0x3

    sget-object v13, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    sget-object v5, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    const-string v11, "com.android.systemui"

    move-object v7, v1

    invoke-direct/range {v7 .. v14}, Lcom/superbock/bean/JInfo;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lg3/k;->a(Lcom/superbock/bean/JInfo;)V

    sput-object v6, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    :goto_2
    sput-wide v2, Lcom/superbock/auto/BaseService;->T:J

    :cond_7
    return-void
.end method
