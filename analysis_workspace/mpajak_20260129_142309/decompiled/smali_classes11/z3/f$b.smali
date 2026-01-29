.class public final Lz3/f$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/net/Socket;

.field public b:Ljava/lang/String;

.field public c:Lf4/h;

.field public d:Lf4/g;

.field public e:Lz3/f$d;

.field public f:Li/g;

.field public g:I

.field public h:Z

.field public final i:Lv3/d;


# direct methods
.method public constructor <init>(Lv3/d;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz3/f$b;->h:Z

    iput-object p1, p0, Lz3/f$b;->i:Lv3/d;

    sget-object p1, Lz3/f$d;->a:Lz3/f$d$a;

    iput-object p1, p0, Lz3/f$b;->e:Lz3/f$d;

    sget-object p1, Lz3/t;->d:Li/g;

    iput-object p1, p0, Lz3/f$b;->f:Li/g;

    return-void
.end method
