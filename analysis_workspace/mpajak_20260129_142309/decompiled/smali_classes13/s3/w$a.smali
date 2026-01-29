.class public final Ls3/w$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public C:Lw3/m;

.field public a:Ls3/m;

.field public b:Lg3/d;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/t;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/t;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ls3/o$b;

.field public f:Z

.field public g:Ls3/b;

.field public h:Z

.field public i:Z

.field public j:Ls3/l;

.field public k:Ls3/n;

.field public l:Ljava/net/Proxy;

.field public m:Ljava/net/ProxySelector;

.field public n:Ls3/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/j;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ls3/x;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Ls3/f;

.field public v:Ld1/f;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls3/m;

    invoke-direct {v0}, Ls3/m;-><init>()V

    iput-object v0, p0, Ls3/w$a;->a:Ls3/m;

    new-instance v0, Lg3/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg3/d;-><init>(I)V

    iput-object v0, p0, Ls3/w$a;->b:Lg3/d;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls3/w$a;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls3/w$a;->d:Ljava/util/ArrayList;

    sget-object v0, Ls3/o;->a:Ls3/o$a;

    sget-object v2, Lt3/c;->a:[B

    const-string v2, "$this$asFactory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt3/a;

    invoke-direct {v0}, Lt3/a;-><init>()V

    iput-object v0, p0, Ls3/w$a;->e:Ls3/o$b;

    iput-boolean v1, p0, Ls3/w$a;->f:Z

    sget-object v0, Ls3/b;->a:Lf1/j;

    iput-object v0, p0, Ls3/w$a;->g:Ls3/b;

    iput-boolean v1, p0, Ls3/w$a;->h:Z

    iput-boolean v1, p0, Ls3/w$a;->i:Z

    sget-object v1, Ls3/l;->b:Ld1/d;

    iput-object v1, p0, Ls3/w$a;->j:Ls3/l;

    sget-object v1, Ls3/n;->c:Lk/j0;

    iput-object v1, p0, Ls3/w$a;->k:Ls3/n;

    iput-object v0, p0, Ls3/w$a;->n:Ls3/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "SocketFactory.getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ls3/w$a;->o:Ljavax/net/SocketFactory;

    sget-object v0, Ls3/w;->G:Ls3/w$b;

    sget-object v0, Ls3/w;->F:Ljava/util/List;

    iput-object v0, p0, Ls3/w$a;->r:Ljava/util/List;

    sget-object v0, Ls3/w;->E:Ljava/util/List;

    iput-object v0, p0, Ls3/w$a;->s:Ljava/util/List;

    sget-object v0, Ld4/c;->a:Ld4/c;

    iput-object v0, p0, Ls3/w$a;->t:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Ls3/f;->c:Ls3/f;

    iput-object v0, p0, Ls3/w$a;->u:Ls3/f;

    const/16 v0, 0x2710

    iput v0, p0, Ls3/w$a;->x:I

    iput v0, p0, Ls3/w$a;->y:I

    iput v0, p0, Ls3/w$a;->z:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, Ls3/w$a;->B:J

    return-void
.end method
