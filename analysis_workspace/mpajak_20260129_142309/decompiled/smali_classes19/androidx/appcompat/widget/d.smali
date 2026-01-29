.class public final synthetic Landroidx/appcompat/widget/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/appcompat/widget/TooltipCompatHandler;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/TooltipCompatHandler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/d;->b:Landroidx/appcompat/widget/TooltipCompatHandler;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/d;->b:Landroidx/appcompat/widget/TooltipCompatHandler;

    invoke-static {v0}, Landroidx/appcompat/widget/TooltipCompatHandler;->a(Landroidx/appcompat/widget/TooltipCompatHandler;)V

    return-void
.end method
