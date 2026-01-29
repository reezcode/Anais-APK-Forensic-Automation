.class public final Lz3/f$d$a;
.super Lz3/f$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/f$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz3/f$d;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lz3/q;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz3/b;->g:Lz3/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lz3/q;->c(Lz3/b;Ljava/io/IOException;)V

    return-void
.end method
