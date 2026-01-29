.class public final Lv/f;
.super Ljava/lang/Object;

# interfaces
.implements Lv/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/f$b;,
        Lv/f$e;,
        Lv/f$a;,
        Lv/f$c;,
        Lv/f$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv/o<",
        "Ljava/io/File;",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final a:Lv/f$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/f$d<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv/f$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/f$d<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv/f;->a:Lv/f$d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILp/h;)Lv/o$a;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/io/File;

    new-instance p2, Lv/o$a;

    new-instance p3, Lk0/d;

    invoke-direct {p3, p1}, Lk0/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lv/f$c;

    iget-object v0, p0, Lv/f;->a:Lv/f$d;

    invoke-direct {p4, p1, v0}, Lv/f$c;-><init>(Ljava/io/File;Lv/f$d;)V

    invoke-direct {p2, p3, p4}, Lv/o$a;-><init>(Lp/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/io/File;

    const/4 p1, 0x1

    return p1
.end method
