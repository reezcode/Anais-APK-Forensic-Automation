.class public final synthetic Li4/a;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/commons/io/function/IOConsumer;
.implements Lorg/apache/commons/io/function/IOFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Li4/a;->a:I

    iput-object p1, p0, Li4/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Li4/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Li4/a;->b:Ljava/lang/Object;

    check-cast v0, Lorg/apache/commons/io/function/IOConsumer;

    iget-object v1, p0, Li4/a;->c:Ljava/lang/Object;

    check-cast v1, Lorg/apache/commons/io/function/IOConsumer;

    invoke-static {v0, v1, p1}, Li4/b;->b(Lorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOConsumer;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/Consumer;)Lorg/apache/commons/io/function/IOConsumer;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->a(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Consumer;)Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;
    .locals 1

    iget v0, p0, Li4/a;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p0, p1}, Li4/b;->a(Lorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p1

    return-object p1

    :goto_0
    invoke-static {p0, p1}, Li4/h;->b(Lorg/apache/commons/io/function/IOFunction;Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Ljava/util/function/Function;)Lorg/apache/commons/io/function/IOFunction;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->c(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Function;)Lorg/apache/commons/io/function/IOFunction;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic andThen(Lorg/apache/commons/io/function/IOFunction;)Lorg/apache/commons/io/function/IOFunction;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->d(Lorg/apache/commons/io/function/IOFunction;Lorg/apache/commons/io/function/IOFunction;)Lorg/apache/commons/io/function/IOFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li4/a;->b:Ljava/lang/Object;

    check-cast v0, Lorg/apache/commons/io/function/IOFunction;

    iget-object v1, p0, Li4/a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/function/Function;

    invoke-static {v0, v1, p1}, Li4/h;->n(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Function;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compose(Ljava/util/function/Function;)Lorg/apache/commons/io/function/IOFunction;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->e(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Function;)Lorg/apache/commons/io/function/IOFunction;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compose(Lorg/apache/commons/io/function/IOFunction;)Lorg/apache/commons/io/function/IOFunction;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->f(Lorg/apache/commons/io/function/IOFunction;Lorg/apache/commons/io/function/IOFunction;)Lorg/apache/commons/io/function/IOFunction;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compose(Ljava/util/function/Supplier;)Lorg/apache/commons/io/function/IOSupplier;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->g(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Supplier;)Lorg/apache/commons/io/function/IOSupplier;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compose(Lorg/apache/commons/io/function/IOSupplier;)Lorg/apache/commons/io/function/IOSupplier;
    .locals 0

    invoke-static {p0, p1}, Li4/h;->h(Lorg/apache/commons/io/function/IOFunction;Lorg/apache/commons/io/function/IOSupplier;)Lorg/apache/commons/io/function/IOSupplier;

    move-result-object p1

    return-object p1
.end method
