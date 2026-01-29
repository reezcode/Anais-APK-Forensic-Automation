.class public final Ls3/w;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/w$a;,
        Ls3/w$b;
    }
.end annotation


# static fields
.field public static final E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Ls3/w$b;


# instance fields
.field public final A:I

.field public final B:I

.field public final C:J

.field public final D:Lw3/m;

.field public final b:Ls3/m;

.field public final c:Lg3/d;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/t;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/t;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ls3/o$b;

.field public final g:Z

.field public final h:Ls3/b;

.field public final i:Z

.field public final j:Z

.field public final k:Ls3/l;

.field public final l:Ls3/n;

.field public final m:Ljava/net/Proxy;

.field public final n:Ljava/net/ProxySelector;

.field public final o:Ls3/b;

.field public final p:Ljavax/net/SocketFactory;

.field public final q:Ljavax/net/ssl/SSLSocketFactory;

.field public final r:Ljavax/net/ssl/X509TrustManager;

.field public final s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/j;",
            ">;"
        }
    .end annotation
.end field

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/x;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Ljavax/net/ssl/HostnameVerifier;

.field public final v:Ls3/f;

.field public final w:Ld1/f;

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Ls3/w$b;

    invoke-direct {v0}, Ls3/w$b;-><init>()V

    sput-object v0, Ls3/w;->G:Ls3/w$b;

    const/4 v0, 0x2

    new-array v1, v0, [Ls3/x;

    sget-object v2, Ls3/x;->f:Ls3/x;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ls3/x;->d:Ls3/x;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lt3/c;->m([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Ls3/w;->E:Ljava/util/List;

    new-array v0, v0, [Ls3/j;

    sget-object v1, Ls3/j;->e:Ls3/j;

    aput-object v1, v0, v3

    sget-object v1, Ls3/j;->f:Ls3/j;

    aput-object v1, v0, v4

    invoke-static {v0}, Lt3/c;->m([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ls3/w;->F:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Ls3/w$a;

    invoke-direct {v0}, Ls3/w$a;-><init>()V

    invoke-direct {p0, v0}, Ls3/w;-><init>(Ls3/w$a;)V

    return-void
.end method

.method public constructor <init>(Ls3/w$a;)V
    .locals 4

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls3/w$a;->a:Ls3/m;

    iput-object v0, p0, Ls3/w;->b:Ls3/m;

    iget-object v0, p1, Ls3/w$a;->b:Lg3/d;

    iput-object v0, p0, Ls3/w;->c:Lg3/d;

    iget-object v0, p1, Ls3/w$a;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lt3/c;->z(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ls3/w;->d:Ljava/util/List;

    iget-object v0, p1, Ls3/w$a;->d:Ljava/util/ArrayList;

    invoke-static {v0}, Lt3/c;->z(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ls3/w;->e:Ljava/util/List;

    iget-object v0, p1, Ls3/w$a;->e:Ls3/o$b;

    iput-object v0, p0, Ls3/w;->f:Ls3/o$b;

    iget-boolean v0, p1, Ls3/w$a;->f:Z

    iput-boolean v0, p0, Ls3/w;->g:Z

    iget-object v0, p1, Ls3/w$a;->g:Ls3/b;

    iput-object v0, p0, Ls3/w;->h:Ls3/b;

    iget-boolean v0, p1, Ls3/w$a;->h:Z

    iput-boolean v0, p0, Ls3/w;->i:Z

    iget-boolean v0, p1, Ls3/w$a;->i:Z

    iput-boolean v0, p0, Ls3/w;->j:Z

    iget-object v0, p1, Ls3/w$a;->j:Ls3/l;

    iput-object v0, p0, Ls3/w;->k:Ls3/l;

    iget-object v0, p1, Ls3/w$a;->k:Ls3/n;

    iput-object v0, p0, Ls3/w;->l:Ls3/n;

    iget-object v0, p1, Ls3/w$a;->l:Ljava/net/Proxy;

    iput-object v0, p0, Ls3/w;->m:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Ls3/w$a;->m:Ljava/net/ProxySelector;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v0, Lc4/a;->a:Lc4/a;

    :goto_2
    iput-object v0, p0, Ls3/w;->n:Ljava/net/ProxySelector;

    iget-object v0, p1, Ls3/w$a;->n:Ls3/b;

    iput-object v0, p0, Ls3/w;->o:Ls3/b;

    iget-object v0, p1, Ls3/w$a;->o:Ljavax/net/SocketFactory;

    iput-object v0, p0, Ls3/w;->p:Ljavax/net/SocketFactory;

    iget-object v0, p1, Ls3/w$a;->r:Ljava/util/List;

    iput-object v0, p0, Ls3/w;->s:Ljava/util/List;

    iget-object v1, p1, Ls3/w$a;->s:Ljava/util/List;

    iput-object v1, p0, Ls3/w;->t:Ljava/util/List;

    iget-object v1, p1, Ls3/w$a;->t:Ljavax/net/ssl/HostnameVerifier;

    iput-object v1, p0, Ls3/w;->u:Ljavax/net/ssl/HostnameVerifier;

    iget v1, p1, Ls3/w$a;->w:I

    iput v1, p0, Ls3/w;->x:I

    iget v1, p1, Ls3/w$a;->x:I

    iput v1, p0, Ls3/w;->y:I

    iget v1, p1, Ls3/w$a;->y:I

    iput v1, p0, Ls3/w;->z:I

    iget v1, p1, Ls3/w$a;->z:I

    iput v1, p0, Ls3/w;->A:I

    iget v1, p1, Ls3/w$a;->A:I

    iput v1, p0, Ls3/w;->B:I

    iget-wide v1, p1, Ls3/w$a;->B:J

    iput-wide v1, p0, Ls3/w;->C:J

    iget-object v1, p1, Ls3/w$a;->C:Lw3/m;

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    new-instance v1, Lw3/m;

    invoke-direct {v1}, Lw3/m;-><init>()V

    :goto_3
    iput-object v1, p0, Ls3/w;->D:Lw3/m;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3/j;

    iget-boolean v1, v1, Ls3/j;->a:Z

    if-eqz v1, :cond_5

    const/4 v0, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v0, 0x1

    :goto_5
    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iput-object v1, p0, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v1, p0, Ls3/w;->w:Ld1/f;

    iput-object v1, p0, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    sget-object p1, Ls3/f;->c:Ls3/f;

    goto :goto_7

    :cond_7
    iget-object v0, p1, Ls3/w$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_8

    iput-object v0, p0, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Ls3/w$a;->v:Ld1/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v0, p0, Ls3/w;->w:Ld1/f;

    iget-object v3, p1, Ls3/w$a;->q:Ljavax/net/ssl/X509TrustManager;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v3, p0, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    goto :goto_6

    :cond_8
    sget-object v0, La4/h;->c:La4/h$a;

    sget-object v0, La4/h;->a:La4/h;

    invoke-virtual {v0}, La4/h;->n()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    sget-object v3, La4/h;->a:La4/h;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, La4/h;->m(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iput-object v3, p0, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "trustManager"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, La4/h;->a:La4/h;

    invoke-virtual {v3, v0}, La4/h;->b(Ljavax/net/ssl/X509TrustManager;)Ld1/f;

    move-result-object v0

    iput-object v0, p0, Ls3/w;->w:Ld1/f;

    :goto_6
    iget-object p1, p1, Ls3/w$a;->u:Ls3/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ls3/f;->b(Ld1/f;)Ls3/f;

    move-result-object p1

    :goto_7
    iput-object p1, p0, Ls3/w;->v:Ls3/f;

    iget-object p1, p0, Ls3/w;->d:Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_18

    iget-object p1, p0, Ls3/w;->e:Ljava/util/List;

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_17

    iget-object p1, p0, Ls3/w;->s:Ljava/util/List;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_8

    :cond_9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/j;

    iget-boolean v0, v0, Ls3/j;->a:Z

    if-eqz v0, :cond_a

    const/4 p1, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    const/4 p1, 0x1

    :goto_9
    if-eqz p1, :cond_13

    iget-object p1, p0, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-nez p1, :cond_c

    const/4 p1, 0x1

    goto :goto_a

    :cond_c
    const/4 p1, 0x0

    :goto_a
    const-string v0, "Check failed."

    if-eqz p1, :cond_12

    iget-object p1, p0, Ls3/w;->w:Ld1/f;

    if-nez p1, :cond_d

    const/4 p1, 0x1

    goto :goto_b

    :cond_d
    const/4 p1, 0x0

    :goto_b
    if-eqz p1, :cond_11

    iget-object p1, p0, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    if-nez p1, :cond_e

    const/4 v2, 0x1

    :cond_e
    if-eqz v2, :cond_10

    iget-object p1, p0, Ls3/w;->v:Ls3/f;

    sget-object v1, Ls3/f;->c:Ls3/f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_c

    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    iget-object p1, p0, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz p1, :cond_16

    iget-object p1, p0, Ls3/w;->w:Ld1/f;

    if-eqz p1, :cond_15

    iget-object p1, p0, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    if-eqz p1, :cond_14

    :goto_c
    return-void

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    const-string p1, "Null network interceptor: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Ls3/w;->e:Ljava/util/List;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    const-string p1, "Null interceptor: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, p0, Ls3/w;->d:Ljava/util/List;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Ls3/y;)Ls3/d;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw3/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lw3/e;-><init>(Ls3/w;Ls3/y;Z)V

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
