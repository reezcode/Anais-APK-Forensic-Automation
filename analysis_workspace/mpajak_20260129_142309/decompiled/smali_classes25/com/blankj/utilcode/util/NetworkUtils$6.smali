.class Lcom/blankj/utilcode/util/NetworkUtils$6;
.super Lcom/blankj/utilcode/util/Utils$Task;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/NetworkUtils;->getDomainAddressAsync(Ljava/lang/String;Lcom/blankj/utilcode/util/Utils$Consumer;)Lcom/blankj/utilcode/util/Utils$Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/Utils$Task<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic val$domain:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/Utils$Consumer;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/blankj/utilcode/util/NetworkUtils$6;->val$domain:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/Utils$Task;-><init>(Lcom/blankj/utilcode/util/Utils$Consumer;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    invoke-virtual {p0}, Lcom/blankj/utilcode/util/NetworkUtils$6;->doInBackground()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    iget-object v0, p0, Lcom/blankj/utilcode/util/NetworkUtils$6;->val$domain:Ljava/lang/String;

    invoke-static {v0}, Lcom/blankj/utilcode/util/NetworkUtils;->getDomainAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
