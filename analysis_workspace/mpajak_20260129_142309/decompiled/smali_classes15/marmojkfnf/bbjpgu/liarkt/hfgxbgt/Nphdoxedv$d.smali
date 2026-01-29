.class public final Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$d;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv;->main([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = null
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$d;->a:Landroid/content/Context;

    iput-object p2, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$d;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
