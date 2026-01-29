.class public final Lv/w;
.super Ljava/lang/Object;

# interfaces
.implements Lv/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/w$a;,
        Lv/w$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv/o<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Lv/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/w<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/w;

    invoke-direct {v0}, Lv/w;-><init>()V

    sput-object v0, Lv/w;->a:Lv/w;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILp/h;)Lv/o$a;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Lp/h;",
            ")",
            "Lv/o$a<",
            "TModel;>;"
        }
    .end annotation

    new-instance p2, Lv/o$a;

    new-instance p3, Lk0/d;

    invoke-direct {p3, p1}, Lk0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lv/w$b;

    invoke-direct {p4, p1}, Lv/w$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Lv/o$a;-><init>(Lp/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method
