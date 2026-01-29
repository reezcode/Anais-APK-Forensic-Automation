.class public final Lmarmojkfnf/dphnidckqxhm/c0;
.super Landroid/content/ContextWrapper;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x69

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lmarmojkfnf/dphnidckqxhm/c0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native getOpPackageName()Ljava/lang/String;
.end method

.method public final native getPackageName()Ljava/lang/String;
.end method
