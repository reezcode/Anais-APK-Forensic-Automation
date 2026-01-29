.class public final Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$b;
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
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lmarmojkfnf/bbjpgu/liarkt/hfgxbgt/Nphdoxedv$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
