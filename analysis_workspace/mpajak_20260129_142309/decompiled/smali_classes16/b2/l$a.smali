.class public final Lb2/l$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lb2/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb2/l;

    invoke-direct {v0}, Lb2/l;-><init>()V

    sput-object v0, Lb2/l$a;->a:Lb2/l;

    return-void
.end method
