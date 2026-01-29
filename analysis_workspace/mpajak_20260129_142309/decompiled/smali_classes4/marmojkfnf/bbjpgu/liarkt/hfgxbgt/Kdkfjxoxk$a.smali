.class public final Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Kdkfjxoxk$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Kdkfjxoxk;->main([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = null
.end annotation


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Kdkfjxoxk$a;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Kdkfjxoxk$a;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
