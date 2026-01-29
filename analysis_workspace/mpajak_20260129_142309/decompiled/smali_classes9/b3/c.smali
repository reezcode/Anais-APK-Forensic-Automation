.class public final Lb3/c;
.super Lb3/a;


# direct methods
.method public constructor <init>(Lv2/g;)V
    .locals 2

    const-string v0, "receiptId"

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lb3/a;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "IS NOT NULL "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final d(Lu2/c;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
