.class public final synthetic Landroidx/constraintlayout/core/state/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/constraintlayout/core/state/Interpolator;
.implements Lorg/apache/commons/io/output/AbstractByteArrayOutputStream$InputStreamConstructor;


# static fields
.field public static final synthetic a:Landroidx/constraintlayout/core/state/f;

.field public static final synthetic b:Landroidx/constraintlayout/core/state/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/constraintlayout/core/state/f;

    invoke-direct {v0}, Landroidx/constraintlayout/core/state/f;-><init>()V

    sput-object v0, Landroidx/constraintlayout/core/state/f;->a:Landroidx/constraintlayout/core/state/f;

    new-instance v0, Landroidx/constraintlayout/core/state/f;

    invoke-direct {v0}, Landroidx/constraintlayout/core/state/f;-><init>()V

    sput-object v0, Landroidx/constraintlayout/core/state/f;->b:Landroidx/constraintlayout/core/state/f;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final construct([BII)Ljava/io/InputStream;
    .locals 1

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1, p2, p3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-object v0
.end method

.method public final getInterpolation(F)F
    .locals 0

    invoke-static {p1}, Landroidx/constraintlayout/core/state/Transition;->g(F)F

    move-result p1

    return p1
.end method
