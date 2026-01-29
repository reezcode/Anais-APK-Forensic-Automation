.class public final Lz2/c;
.super Lz2/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lz2/k<",
        "TT;TID;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lu2/c;Ld3/c;Lt2/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Lt2/g<",
            "TT;TID;>;)V"
        }
    .end annotation

    const/4 v0, 0x5

    invoke-direct {p0, p1, p2, p3, v0}, Lz2/k;-><init>(Lu2/c;Ld3/c;Lt2/g;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final b(Ljava/lang/StringBuilder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "DELETE FROM "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/k;->a:Ld3/c;

    iget-object v1, v1, Ld3/c;->c:Ljava/lang/String;

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p1, v1}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
