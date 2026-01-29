.class Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->removeActivityLifecycleCallbacks(Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

.field public final synthetic val$activity:Landroid/app/Activity;

.field public final synthetic val$callbacks:Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
    .locals 0

    iput-object p1, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->this$0:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    iput-object p2, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->val$activity:Landroid/app/Activity;

    iput-object p3, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->val$callbacks:Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->this$0:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    iget-object v1, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl$3;->val$callbacks:Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->access$200(Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V

    return-void
.end method
