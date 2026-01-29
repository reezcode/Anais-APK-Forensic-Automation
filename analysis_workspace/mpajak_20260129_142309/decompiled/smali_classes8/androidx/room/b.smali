.class public final synthetic Landroidx/room/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/room/b;->b:I

    iput-object p1, p0, Landroidx/room/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Landroidx/room/b;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Landroidx/room/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/room/QueryInterceptorStatement;

    invoke-static {v0}, Landroidx/room/QueryInterceptorStatement;->c(Landroidx/room/QueryInterceptorStatement;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/room/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/room/QueryInterceptorDatabase;

    invoke-static {v0}, Landroidx/room/QueryInterceptorDatabase;->l(Landroidx/room/QueryInterceptorDatabase;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/room/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/room/InvalidationTracker;

    invoke-virtual {v0}, Landroidx/room/InvalidationTracker;->onAutoCloseCallback$room_runtime_release()V

    return-void

    :goto_0
    iget-object v0, p0, Landroidx/room/b;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/work/impl/background/systemalarm/DelayMetCommandHandler;

    invoke-static {v0}, Landroidx/work/impl/background/systemalarm/DelayMetCommandHandler;->b(Landroidx/work/impl/background/systemalarm/DelayMetCommandHandler;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
