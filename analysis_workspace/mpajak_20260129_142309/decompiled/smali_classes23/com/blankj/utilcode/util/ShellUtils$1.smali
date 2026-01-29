.class Lcom/blankj/utilcode/util/ShellUtils$1;
.super Lcom/blankj/utilcode/util/Utils$Task;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/blankj/utilcode/util/ShellUtils;->execCmdAsync([Ljava/lang/String;ZZLcom/blankj/utilcode/util/Utils$Consumer;)Lcom/blankj/utilcode/util/Utils$Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/Utils$Task<",
        "Lcom/blankj/utilcode/util/ShellUtils$CommandResult;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic val$commands:[Ljava/lang/String;

.field public final synthetic val$isNeedResultMsg:Z

.field public final synthetic val$isRooted:Z


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/Utils$Consumer;[Ljava/lang/String;ZZ)V
    .locals 0

    iput-object p2, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$commands:[Ljava/lang/String;

    iput-boolean p3, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$isRooted:Z

    iput-boolean p4, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$isNeedResultMsg:Z

    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/Utils$Task;-><init>(Lcom/blankj/utilcode/util/Utils$Consumer;)V

    return-void
.end method


# virtual methods
.method public doInBackground()Lcom/blankj/utilcode/util/ShellUtils$CommandResult;
    .locals 3

    iget-object v0, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$commands:[Ljava/lang/String;

    iget-boolean v1, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$isRooted:Z

    iget-boolean v2, p0, Lcom/blankj/utilcode/util/ShellUtils$1;->val$isNeedResultMsg:Z

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/ShellUtils;->execCmd([Ljava/lang/String;ZZ)Lcom/blankj/utilcode/util/ShellUtils$CommandResult;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/blankj/utilcode/util/ShellUtils$1;->doInBackground()Lcom/blankj/utilcode/util/ShellUtils$CommandResult;

    move-result-object v0

    return-object v0
.end method
