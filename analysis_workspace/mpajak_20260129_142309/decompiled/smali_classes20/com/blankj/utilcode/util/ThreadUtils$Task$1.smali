.class Lcom/blankj/utilcode/util/ThreadUtils$Task$1;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/ThreadUtils$Task;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V
    .locals 0

    iput-object p1, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->access$400(Lcom/blankj/utilcode/util/ThreadUtils$Task;)Lcom/blankj/utilcode/util/ThreadUtils$Task$OnTimeoutListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->access$500(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    iget-object v0, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->access$400(Lcom/blankj/utilcode/util/ThreadUtils$Task;)Lcom/blankj/utilcode/util/ThreadUtils$Task$OnTimeoutListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task$OnTimeoutListener;->onTimeout()V

    iget-object v0, p0, Lcom/blankj/utilcode/util/ThreadUtils$Task$1;->this$0:Lcom/blankj/utilcode/util/ThreadUtils$Task;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/ThreadUtils$Task;->onDone()V

    :cond_0
    return-void
.end method
