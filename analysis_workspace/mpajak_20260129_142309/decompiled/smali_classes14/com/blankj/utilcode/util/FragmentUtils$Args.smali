.class Lcom/blankj/utilcode/util/FragmentUtils$Args;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/FragmentUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Args"
.end annotation


# instance fields
.field public final id:I

.field public final isAddStack:Z

.field public final isHide:Z

.field public final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/blankj/utilcode/util/FragmentUtils$Args;->id:I

    iput-object p2, p0, Lcom/blankj/utilcode/util/FragmentUtils$Args;->tag:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/blankj/utilcode/util/FragmentUtils$Args;->isHide:Z

    iput-boolean p4, p0, Lcom/blankj/utilcode/util/FragmentUtils$Args;->isAddStack:Z

    return-void
.end method

.method public constructor <init>(IZZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/blankj/utilcode/util/FragmentUtils$Args;-><init>(ILjava/lang/String;ZZ)V

    return-void
.end method
