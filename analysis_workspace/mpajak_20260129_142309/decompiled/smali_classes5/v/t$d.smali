.class public final Lv/t$d;
.super Ljava/lang/Object;

# interfaces
.implements Lv/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv/p<",
        "Ljava/lang/Integer;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/t$d;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final b(Lv/s;)Lv/o;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/s;",
            ")",
            "Lv/o<",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance p1, Lv/t;

    iget-object v0, p0, Lv/t$d;->a:Landroid/content/res/Resources;

    sget-object v1, Lv/w;->a:Lv/w;

    invoke-direct {p1, v0, v1}, Lv/t;-><init>(Landroid/content/res/Resources;Lv/o;)V

    return-object p1
.end method
