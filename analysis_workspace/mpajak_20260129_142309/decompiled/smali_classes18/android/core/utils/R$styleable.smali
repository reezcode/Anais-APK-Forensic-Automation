.class public final Landroid/core/utils/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/core/utils/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final AppWidgetAttrs:[I

.field public static final AppWidgetAttrs_appWidgetInnerRadius:I = 0x0

.field public static final AppWidgetAttrs_appWidgetPadding:I = 0x1

.field public static final AppWidgetAttrs_appWidgetRadius:I = 0x2


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroid/core/utils/R$styleable;->AppWidgetAttrs:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f030033
        0x7f030034
        0x7f030035
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
