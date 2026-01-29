.class public final Lk3/f$j;
.super Ljava/lang/Object;

# interfaces
.implements Lm4/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->r(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/bean/EInfo;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/f$j;->a:Lcom/superbock/bean/EInfo;

    iput-object p2, p0, Lk3/f$j;->b:Landroid/content/Context;

    iput-object p3, p0, Lk3/f$j;->c:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
