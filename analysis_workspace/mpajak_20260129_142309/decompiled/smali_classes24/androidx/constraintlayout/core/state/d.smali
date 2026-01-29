.class public final synthetic Landroidx/constraintlayout/core/state/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/constraintlayout/core/state/Interpolator;
.implements Lorg/apache/commons/io/function/IOConsumer;


# static fields
.field public static final synthetic a:Landroidx/constraintlayout/core/state/d;

.field public static final synthetic b:Landroidx/constraintlayout/core/state/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/constraintlayout/core/state/d;

    invoke-direct {v0}, Landroidx/constraintlayout/core/state/d;-><init>()V

    sput-object v0, Landroidx/constraintlayout/core/state/d;->a:Landroidx/constraintlayout/core/state/d;

    new-instance v0, Landroidx/constraintlayout/core/state/d;

    invoke-direct {v0}, Landroidx/constraintlayout/core/state/d;-><init>()V

    sput-object v0, Landroidx/constraintlayout/core/state/d;->b:Landroidx/constraintlayout/core/state/d;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Li4/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;
    .locals 0

    invoke-static {p0, p1}, Li4/b;->a(Lorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final getInterpolation(F)F
    .locals 0

    invoke-static {p1}, Landroidx/constraintlayout/core/state/Transition;->d(F)F

    move-result p1

    return p1
.end method
