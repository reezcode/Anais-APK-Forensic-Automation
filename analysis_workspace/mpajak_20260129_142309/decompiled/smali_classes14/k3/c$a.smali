.class public final Lk3/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/c;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/c$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lk3/c$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 5
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls3/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p2}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    iget-object v1, p0, Lk3/c$a;->a:Ljava/lang/String;

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "https://api.ipquery.io/?format=json"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x6

    goto :goto_0

    :sswitch_1
    const-string v3, "https://api.ip.sb/geoip/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :sswitch_2
    const-string v3, "https://ipwhois.app/json/?format=json"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "https://api.ipbase.com/v1/json"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :sswitch_4
    const-string v3, "https://api.db-ip.com/v2/free/self"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x5

    goto :goto_0

    :sswitch_5
    const-string v3, "https://ipapi.co/json"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :sswitch_6
    const-string v3, "https://api.ip2location.io/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    const-string v3, "ip"

    const-string v4, "country_code"

    packed-switch v2, :pswitch_data_0

    move-object p2, v1

    goto :goto_2

    :pswitch_0
    :try_start_1
    invoke-virtual {p2, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "location"

    invoke-virtual {p2, v2}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object p2

    goto :goto_1

    :pswitch_1
    const-string v1, "ipAddress"

    invoke-virtual {p2, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "countryCode"

    goto :goto_1

    :pswitch_2
    invoke-virtual {p2, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p2, v4}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v2, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "area"

    invoke-virtual {v1, v2, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sput-boolean v0, Lk3/c;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    nop

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    :goto_3
    if-nez p1, :cond_2

    goto :goto_5

    :catchall_1
    const/4 p1, 0x0

    :goto_4
    if-nez p1, :cond_2

    :goto_5
    iget-object p1, p0, Lk3/c$a;->b:Ljava/util/List;

    invoke-static {p1}, Lk3/c;->a(Ljava/util/List;)V

    :cond_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4b4f6188 -> :sswitch_6
        -0x4122791f -> :sswitch_5
        -0x359e7e7b -> :sswitch_4
        -0x443b125 -> :sswitch_3
        0x2a8272cc -> :sswitch_2
        0x46855ad3 -> :sswitch_1
        0x4ceec1c8 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ls3/d;Ljava/io/IOException;)V
    .locals 0
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lk3/c$a;->b:Ljava/util/List;

    invoke-static {p1}, Lk3/c;->a(Ljava/util/List;)V

    return-void
.end method
