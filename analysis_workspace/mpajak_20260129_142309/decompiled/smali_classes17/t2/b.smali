.class public final Lt2/b;
.super Lt2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt2/a<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lc3/c;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lt2/a;-><init>(Lc3/c;Ljava/lang/Class;Ld3/b;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lt2/a;->r()Lt2/f;

    move-result-object v0

    return-object v0
.end method
