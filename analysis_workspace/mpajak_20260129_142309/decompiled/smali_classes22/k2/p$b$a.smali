.class public final Lk2/p$b$a;
.super Lk2/p$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/p$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk2/p<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lk2/p$b;)V
    .locals 0

    iget-object p1, p1, Lk2/p$b;->b:Lk2/p;

    invoke-direct {p0, p1}, Lk2/p$d;-><init>(Lk2/p;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk2/p$d;->a()Lk2/p$e;

    move-result-object v0

    return-object v0
.end method
