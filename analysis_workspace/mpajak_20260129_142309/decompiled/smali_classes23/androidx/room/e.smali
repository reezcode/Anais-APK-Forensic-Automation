.class public final synthetic Landroidx/room/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/room/QueryInterceptorDatabase;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/QueryInterceptorDatabase;I)V
    .locals 0

    iput p2, p0, Landroidx/room/e;->b:I

    iput-object p1, p0, Landroidx/room/e;->c:Landroidx/room/QueryInterceptorDatabase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Landroidx/room/e;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Landroidx/room/e;->c:Landroidx/room/QueryInterceptorDatabase;

    invoke-static {v0}, Landroidx/room/QueryInterceptorDatabase;->w(Landroidx/room/QueryInterceptorDatabase;)V

    return-void

    :goto_0
    iget-object v0, p0, Landroidx/room/e;->c:Landroidx/room/QueryInterceptorDatabase;

    invoke-static {v0}, Landroidx/room/QueryInterceptorDatabase;->n(Landroidx/room/QueryInterceptorDatabase;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
