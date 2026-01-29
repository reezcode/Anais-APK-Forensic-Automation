.class public final Ld0/g;
.super Ljava/lang/Object;

# interfaces
.implements Ld0/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld0/e<",
        "TZ;TZ;>;"
    }
.end annotation


# static fields
.field public static final a:Ld0/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/g<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld0/g;

    invoke-direct {v0}, Ld0/g;-><init>()V

    sput-object v0, Ld0/g;->a:Ld0/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr/w;Lp/h;)Lr/w;
    .locals 0
    .param p1    # Lr/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "TZ;>;",
            "Lp/h;",
            ")",
            "Lr/w<",
            "TZ;>;"
        }
    .end annotation

    return-object p1
.end method
