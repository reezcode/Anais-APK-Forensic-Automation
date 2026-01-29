.class public final Ls3/j;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/j$a;
    }
.end annotation


# static fields
.field public static final e:Ls3/j;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final f:Ls3/j;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    const/16 v0, 0x9

    new-array v1, v0, [Ls3/h;

    sget-object v2, Ls3/h;->q:Ls3/h;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v4, Ls3/h;->r:Ls3/h;

    const/4 v5, 0x1

    aput-object v4, v1, v5

    sget-object v6, Ls3/h;->s:Ls3/h;

    const/4 v7, 0x2

    aput-object v6, v1, v7

    sget-object v8, Ls3/h;->k:Ls3/h;

    const/4 v9, 0x3

    aput-object v8, v1, v9

    sget-object v10, Ls3/h;->m:Ls3/h;

    const/4 v11, 0x4

    aput-object v10, v1, v11

    sget-object v12, Ls3/h;->l:Ls3/h;

    const/4 v13, 0x5

    aput-object v12, v1, v13

    sget-object v14, Ls3/h;->n:Ls3/h;

    const/4 v15, 0x6

    aput-object v14, v1, v15

    sget-object v16, Ls3/h;->p:Ls3/h;

    const/16 v17, 0x7

    aput-object v16, v1, v17

    sget-object v18, Ls3/h;->o:Ls3/h;

    const/16 v19, 0x8

    aput-object v18, v1, v19

    const/16 v0, 0x10

    new-array v15, v0, [Ls3/h;

    aput-object v2, v15, v3

    aput-object v4, v15, v5

    aput-object v6, v15, v7

    aput-object v8, v15, v9

    aput-object v10, v15, v11

    aput-object v12, v15, v13

    const/4 v2, 0x6

    aput-object v14, v15, v2

    aput-object v16, v15, v17

    aput-object v18, v15, v19

    sget-object v2, Ls3/h;->i:Ls3/h;

    const/16 v4, 0x9

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->j:Ls3/h;

    const/16 v4, 0xa

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->g:Ls3/h;

    const/16 v4, 0xb

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->h:Ls3/h;

    const/16 v4, 0xc

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->e:Ls3/h;

    const/16 v4, 0xd

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->f:Ls3/h;

    const/16 v4, 0xe

    aput-object v2, v15, v4

    sget-object v2, Ls3/h;->d:Ls3/h;

    const/16 v4, 0xf

    aput-object v2, v15, v4

    new-instance v2, Ls3/j$a;

    invoke-direct {v2}, Ls3/j$a;-><init>()V

    const/16 v4, 0x9

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ls3/h;

    invoke-virtual {v2, v1}, Ls3/j$a;->c([Ls3/h;)Ls3/j$a;

    new-array v1, v7, [Ls3/f0;

    sget-object v4, Ls3/f0;->c:Ls3/f0;

    aput-object v4, v1, v3

    sget-object v6, Ls3/f0;->d:Ls3/f0;

    aput-object v6, v1, v5

    invoke-virtual {v2, v1}, Ls3/j$a;->f([Ls3/f0;)Ls3/j$a;

    invoke-virtual {v2}, Ls3/j$a;->d()Ls3/j$a;

    invoke-virtual {v2}, Ls3/j$a;->a()Ls3/j;

    new-instance v1, Ls3/j$a;

    invoke-direct {v1}, Ls3/j$a;-><init>()V

    invoke-static {v15, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ls3/h;

    invoke-virtual {v1, v2}, Ls3/j$a;->c([Ls3/h;)Ls3/j$a;

    new-array v2, v7, [Ls3/f0;

    aput-object v4, v2, v3

    aput-object v6, v2, v5

    invoke-virtual {v1, v2}, Ls3/j$a;->f([Ls3/f0;)Ls3/j$a;

    invoke-virtual {v1}, Ls3/j$a;->d()Ls3/j$a;

    invoke-virtual {v1}, Ls3/j$a;->a()Ls3/j;

    move-result-object v1

    sput-object v1, Ls3/j;->e:Ls3/j;

    new-instance v1, Ls3/j$a;

    invoke-direct {v1}, Ls3/j$a;-><init>()V

    invoke-static {v15, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls3/h;

    invoke-virtual {v1, v0}, Ls3/j$a;->c([Ls3/h;)Ls3/j$a;

    new-array v0, v11, [Ls3/f0;

    aput-object v4, v0, v3

    aput-object v6, v0, v5

    sget-object v2, Ls3/f0;->e:Ls3/f0;

    aput-object v2, v0, v7

    sget-object v2, Ls3/f0;->f:Ls3/f0;

    aput-object v2, v0, v9

    invoke-virtual {v1, v0}, Ls3/j$a;->f([Ls3/f0;)Ls3/j$a;

    invoke-virtual {v1}, Ls3/j$a;->d()Ls3/j$a;

    invoke-virtual {v1}, Ls3/j$a;->a()Ls3/j;

    new-instance v0, Ls3/j;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v3, v1, v1}, Ls3/j;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Ls3/j;->f:Ls3/j;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls3/j;->a:Z

    iput-boolean p2, p0, Ls3/j;->b:Z

    iput-object p3, p0, Ls3/j;->c:[Ljava/lang/String;

    iput-object p4, p0, Ls3/j;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls3/h;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "cipherSuites"
    .end annotation

    iget-object v0, p0, Ls3/j;->c:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Ls3/h;->t:Ls3/h$b;

    invoke-virtual {v5, v4}, Ls3/h$b;->b(Ljava/lang/String;)Ls3/h;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Z
    .locals 4

    const-string v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ls3/j;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ls3/j;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkotlin/comparisons/ComparisonsKt;->naturalOrder()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lt3/c;->k([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Ls3/j;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ls3/h;->t:Ls3/h$b;

    sget-object v2, Ls3/h;->b:Ls3/h$a;

    sget-object v2, Ls3/h;->b:Ls3/h$a;

    invoke-static {v0, p1, v2}, Lt3/c;->k([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls3/f0;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "tlsVersions"
    .end annotation

    iget-object v0, p0, Ls3/j;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Ls3/f0;->i:Ls3/f0$a;

    invoke-virtual {v5, v4}, Ls3/f0$a;->a(Ljava/lang/String;)Ls3/f0;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Ls3/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    iget-boolean v2, p0, Ls3/j;->a:Z

    check-cast p1, Ls3/j;

    iget-boolean v3, p1, Ls3/j;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Ls3/j;->c:[Ljava/lang/String;

    iget-object v3, p1, Ls3/j;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Ls3/j;->d:[Ljava/lang/String;

    iget-object v3, p1, Ls3/j;->d:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Ls3/j;->b:Z

    iget-boolean p1, p1, Ls3/j;->b:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Ls3/j;->a:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x20f

    iget-object v1, p0, Ls3/j;->c:[Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/j;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls3/j;->b:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    const/16 v0, 0x11

    :goto_1
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Ls3/j;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    const-string v0, "ConnectionSpec("

    const-string v1, "cipherSuites="

    invoke-static {v0, v1}, Landroidx/activity/result/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ls3/j;->a()Ljava/util/List;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "tlsVersions="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ls3/j;->c()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ls3/j;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
