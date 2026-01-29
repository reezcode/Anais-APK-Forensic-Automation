.class public final synthetic Landroidx/constraintlayout/core/state/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/constraintlayout/core/state/Interpolator;
.implements Lorg/apache/commons/io/function/IOConsumer;
.implements Lorg/apache/commons/io/function/IOFunction;


# static fields
.field public static final synthetic b:Landroidx/constraintlayout/core/state/e;

.field public static final synthetic c:Landroidx/constraintlayout/core/state/e;

.field public static final synthetic d:Landroidx/constraintlayout/core/state/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/constraintlayout/core/state/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/state/e;-><init>(I)V

    sput-object v0, Landroidx/constraintlayout/core/state/e;->b:Landroidx/constraintlayout/core/state/e;

    new-instance v0, Landroidx/constraintlayout/core/state/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/state/e;-><init>(I)V

    sput-object v0, Landroidx/constraintlayout/core/state/e;->c:Landroidx/constraintlayout/core/state/e;

    new-instance v0, Landroidx/constraintlayout/core/state/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/state/e;-><init>(I)V

    sput-object v0, Landroidx/constraintlayout/core/state/e;->d:Landroidx/constraintlayout/core/state/e;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/constraintlayout/core/state/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/apache/commons/io/output/ThresholdingOutputStream;

    invoke-static {p1}, Lorg/apache/commons/io/IOUtils;->a(Lorg/apache/commons/io/output/ThresholdingOutputStream;)V

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

    iget v0, p0, Landroidx/constraintlayout/core/state/e;->a:I

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
    .packed-switch 0x1
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
    .locals 0

    invoke-static {p1}, Li4/h;->r(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final getInterpolation(F)F
    .locals 0

    invoke-static {p1}, Landroidx/constraintlayout/core/state/Transition;->h(F)F

    move-result p1

    return p1
.end method
