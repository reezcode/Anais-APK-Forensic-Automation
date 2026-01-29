.class public final Li2/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/i$a;
    }
.end annotation


# static fields
.field public static final l:Lo2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo2/a<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Lo2/a<",
            "*>;",
            "Li2/i$a<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lo2/a<",
            "*>;",
            "Li2/z<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lk2/e;

.field public final d:Ll2/e;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/a0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Li2/k<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Ljava/lang/Object;

    new-instance v1, Lo2/a;

    invoke-direct {v1, v0}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    sput-object v1, Li2/i;->l:Lo2/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    sget-object v1, Lk2/m;->d:Lk2/m;

    sget-object v2, Li2/b;->b:Li2/b$a;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v8, Li2/v;->b:Li2/v$a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    sget-object v10, Li2/w;->b:Li2/w$a;

    sget-object v11, Li2/w;->c:Li2/w$b;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Li2/i;-><init>(Lk2/m;Li2/c;Ljava/util/Map;ZZZZLi2/v;Ljava/util/List;Li2/x;Li2/x;)V

    return-void
.end method

.method public constructor <init>(Lk2/m;Li2/c;Ljava/util/Map;ZZZZLi2/v;Ljava/util/List;Li2/x;Li2/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/m;",
            "Li2/c;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Li2/k<",
            "*>;>;ZZZZZZZZ",
            "Li2/v;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Li2/a0;",
            ">;",
            "Ljava/util/List<",
            "Li2/a0;",
            ">;",
            "Ljava/util/List<",
            "Li2/a0;",
            ">;",
            "Li2/x;",
            "Li2/x;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Li2/i;->a:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Li2/i;->b:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p3, p0, Li2/i;->f:Ljava/util/Map;

    new-instance v0, Lk2/e;

    invoke-direct {v0, p3, p7}, Lk2/e;-><init>(Ljava/util/Map;Z)V

    iput-object v0, p0, Li2/i;->c:Lk2/e;

    iput-boolean p4, p0, Li2/i;->g:Z

    const/4 p3, 0x0

    iput-boolean p3, p0, Li2/i;->h:Z

    iput-boolean p5, p0, Li2/i;->i:Z

    iput-boolean p6, p0, Li2/i;->j:Z

    iput-boolean p3, p0, Li2/i;->k:Z

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    sget-object p4, Ll2/q;->W:Ll2/u;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Li2/w;->b:Li2/w$a;

    if-ne p10, p4, :cond_0

    sget-object p4, Ll2/l;->c:Ll2/k;

    goto :goto_0

    :cond_0
    new-instance p4, Ll2/k;

    invoke-direct {p4, p10}, Ll2/k;-><init>(Li2/x;)V

    :goto_0
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object p4, Ll2/q;->C:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->m:Ll2/s;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->g:Ll2/s;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->i:Ll2/s;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->k:Ll2/s;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Li2/v;->b:Li2/v$a;

    if-ne p8, p4, :cond_1

    sget-object p4, Ll2/q;->t:Ll2/q$b;

    goto :goto_1

    :cond_1
    new-instance p4, Li2/f;

    invoke-direct {p4}, Li2/f;-><init>()V

    :goto_1
    sget-object p5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Long;

    new-instance p7, Ll2/s;

    invoke-direct {p7, p5, p6, p4}, Ll2/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Double;

    new-instance p7, Li2/d;

    invoke-direct {p7}, Li2/d;-><init>()V

    new-instance p8, Ll2/s;

    invoke-direct {p8, p5, p6, p7}, Ll2/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Float;

    new-instance p7, Li2/e;

    invoke-direct {p7}, Li2/e;-><init>()V

    new-instance p8, Ll2/s;

    invoke-direct {p8, p5, p6, p7}, Ll2/s;-><init>(Ljava/lang/Class;Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Li2/w;->c:Li2/w$b;

    if-ne p11, p5, :cond_2

    sget-object p5, Ll2/j;->b:Ll2/i;

    goto :goto_2

    :cond_2
    new-instance p5, Ll2/j;

    invoke-direct {p5, p11}, Ll2/j;-><init>(Li2/x;)V

    new-instance p6, Ll2/i;

    invoke-direct {p6, p5}, Ll2/i;-><init>(Ll2/j;)V

    move-object p5, p6

    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ll2/q;->o:Ll2/r;

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ll2/q;->q:Ll2/r;

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class p5, Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p6, Li2/g;

    invoke-direct {p6, p4}, Li2/g;-><init>(Li2/z;)V

    new-instance p7, Li2/y;

    invoke-direct {p7, p6}, Li2/y;-><init>(Li2/z;)V

    new-instance p6, Ll2/r;

    invoke-direct {p6, p5, p7}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class p5, Ljava/util/concurrent/atomic/AtomicLongArray;

    new-instance p6, Li2/h;

    invoke-direct {p6, p4}, Li2/h;-><init>(Li2/z;)V

    new-instance p4, Li2/y;

    invoke-direct {p4, p6}, Li2/y;-><init>(Li2/z;)V

    new-instance p6, Ll2/r;

    invoke-direct {p6, p5, p4}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->s:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->x:Ll2/s;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->E:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->G:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class p4, Ljava/math/BigDecimal;

    sget-object p5, Ll2/q;->z:Ll2/q$g;

    new-instance p6, Ll2/r;

    invoke-direct {p6, p4, p5}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class p4, Ljava/math/BigInteger;

    sget-object p5, Ll2/q;->A:Ll2/q$h;

    new-instance p6, Ll2/r;

    invoke-direct {p6, p4, p5}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class p4, Lk2/o;

    sget-object p5, Ll2/q;->B:Ll2/q$i;

    new-instance p6, Ll2/r;

    invoke-direct {p6, p4, p5}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->I:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->K:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->O:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->Q:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->U:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->M:Ll2/u;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->d:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/c;->b:Ll2/c$a;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->S:Ll2/t;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-boolean p4, Ln2/d;->a:Z

    if-eqz p4, :cond_3

    sget-object p4, Ln2/d;->e:Ln2/b$a;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ln2/d;->d:Ln2/a$a;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ln2/d;->f:Ln2/c$a;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object p4, Ll2/a;->c:Ll2/a$a;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll2/q;->b:Ll2/r;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, Ll2/b;

    invoke-direct {p4, v0}, Ll2/b;-><init>(Lk2/e;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, Ll2/h;

    invoke-direct {p4, v0}, Ll2/h;-><init>(Lk2/e;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p4, Ll2/e;

    invoke-direct {p4, v0}, Ll2/e;-><init>(Lk2/e;)V

    iput-object p4, p0, Li2/i;->d:Ll2/e;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p5, Ll2/q;->X:Ll2/q$u;

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p5, Ll2/n;

    invoke-direct {p5, v0, p2, p1, p4}, Ll2/n;-><init>(Lk2/e;Li2/c;Lk2/m;Ll2/e;)V

    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Li2/i;->e:Ljava/util/List;

    return-void
.end method

.method public static a(Ljava/lang/Object;Lp2/a;)V
    .locals 0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lp2/a;->N()I

    move-result p0

    const/16 p1, 0xa

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Li2/o;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Li2/o;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lp2/c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Li2/o;

    invoke-direct {p1, p0}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Li2/u;

    invoke-direct {p1, p0}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static b(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    new-instance p1, Lp2/a;

    invoke-direct {p1, v0}, Lp2/a;-><init>(Ljava/io/Reader;)V

    iget-boolean v0, p0, Li2/i;->k:Z

    iput-boolean v0, p1, Lp2/a;->c:Z

    invoke-virtual {p0, p1, p2}, Li2/i;->d(Lp2/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Li2/i;->a(Ljava/lang/Object;Lp2/a;)V

    return-object p2
.end method

.method public final d(Lp2/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lp2/a;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p1, Lp2/a;->c:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lp2/a;->c:Z

    :try_start_0
    invoke-virtual {p1}, Lp2/a;->N()I

    const/4 v1, 0x0

    new-instance v2, Lo2/a;

    invoke-direct {v2, p2}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p0, v2}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object p2

    invoke-virtual {p2, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p1, Lp2/a;->c:Z

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :catch_1
    move-exception p2

    new-instance v1, Li2/u;

    invoke-direct {v1, p2}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p2

    new-instance v1, Li2/u;

    invoke-direct {v1, p2}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_3
    move-exception p2

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    iput-boolean v0, p1, Lp2/a;->c:Z

    return-object p2

    :cond_0
    :try_start_2
    new-instance v1, Li2/u;

    invoke-direct {v1, p2}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    iput-boolean v0, p1, Lp2/a;->c:Z

    throw p2
.end method

.method public final e(Lo2/a;)Li2/z;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo2/a<",
            "TT;>;)",
            "Li2/z<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Li2/i;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/z;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Li2/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Li2/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/i$a;

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    :try_start_0
    new-instance v2, Li2/i$a;

    invoke-direct {v2}, Li2/i$a;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Li2/i;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/a0;

    invoke-interface {v4, p0, p1}, Li2/a0;->a(Li2/i;Lo2/a;)Li2/z;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v3, v2, Li2/i$a;->a:Li2/z;

    if-nez v3, :cond_5

    iput-object v4, v2, Li2/i$a;->a:Li2/z;

    iget-object v2, p0, Li2/i;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_4

    iget-object p1, p0, Li2/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_4
    return-object v4

    :cond_5
    :try_start_1
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GSON (2.9.0) cannot handle "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_7

    iget-object p1, p0, Li2/i;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_7
    throw v2
.end method

.method public final f(Li2/a0;Lo2/a;)Li2/z;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li2/a0;",
            "Lo2/a<",
            "TT;>;)",
            "Li2/z<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Li2/i;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Li2/i;->d:Ll2/e;

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Li2/i;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/a0;

    if-nez v0, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Li2/a0;->a(Li2/i;Lo2/a;)Li2/z;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Ljava/io/Writer;)Lp2/b;
    .locals 1

    iget-boolean v0, p0, Li2/i;->h:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lp2/b;

    invoke-direct {v0, p1}, Lp2/b;-><init>(Ljava/io/Writer;)V

    iget-boolean p1, p0, Li2/i;->j:Z

    if-eqz p1, :cond_1

    const-string p1, "  "

    iput-object p1, v0, Lp2/b;->e:Ljava/lang/String;

    const-string p1, ": "

    iput-object p1, v0, Lp2/b;->f:Ljava/lang/String;

    :cond_1
    iget-boolean p1, p0, Li2/i;->i:Z

    iput-boolean p1, v0, Lp2/b;->h:Z

    iget-boolean p1, p0, Li2/i;->k:Z

    iput-boolean p1, v0, Lp2/b;->g:Z

    iget-boolean p1, p0, Li2/i;->g:Z

    iput-boolean p1, v0, Lp2/b;->j:Z

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/io/StringWriter;

    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1}, Li2/i;->g(Ljava/io/Writer;)Lp2/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Li2/i;->k(Lp2/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Li2/o;

    invoke-direct {v0, p1}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Li2/i;->i(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    :try_start_0
    invoke-virtual {p0, v0}, Li2/i;->g(Ljava/io/Writer;)Lp2/b;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1}, Li2/i;->j(Ljava/lang/Object;Ljava/lang/reflect/Type;Lp2/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Li2/o;

    invoke-direct {p2, p1}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/reflect/Type;Lp2/b;)V
    .locals 5

    new-instance v0, Lo2/a;

    invoke-direct {v0, p2}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p0, v0}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object p2

    iget-boolean v0, p3, Lp2/b;->g:Z

    const/4 v1, 0x1

    iput-boolean v1, p3, Lp2/b;->g:Z

    iget-boolean v1, p3, Lp2/b;->h:Z

    iget-boolean v2, p0, Li2/i;->i:Z

    iput-boolean v2, p3, Lp2/b;->h:Z

    iget-boolean v2, p3, Lp2/b;->j:Z

    iget-boolean v3, p0, Li2/i;->g:Z

    iput-boolean v3, p3, Lp2/b;->j:Z

    :try_start_0
    invoke-virtual {p2, p3, p1}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p3, Lp2/b;->g:Z

    iput-boolean v1, p3, Lp2/b;->h:Z

    iput-boolean v2, p3, Lp2/b;->j:Z

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Li2/o;

    invoke-direct {p2, p1}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v0, p3, Lp2/b;->g:Z

    iput-boolean v1, p3, Lp2/b;->h:Z

    iput-boolean v2, p3, Lp2/b;->j:Z

    throw p1
.end method

.method public final k(Lp2/b;)V
    .locals 7

    sget-object v0, Li2/p;->a:Li2/p;

    iget-boolean v1, p1, Lp2/b;->g:Z

    const/4 v2, 0x1

    iput-boolean v2, p1, Lp2/b;->g:Z

    iget-boolean v2, p1, Lp2/b;->h:Z

    iget-boolean v3, p0, Li2/i;->i:Z

    iput-boolean v3, p1, Lp2/b;->h:Z

    iget-boolean v3, p1, Lp2/b;->j:Z

    iget-boolean v4, p0, Li2/i;->g:Z

    iput-boolean v4, p1, Lp2/b;->j:Z

    :try_start_0
    invoke-static {v0, p1}, Lk/j0;->E(Li2/n;Lp2/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p1, Lp2/b;->g:Z

    iput-boolean v2, p1, Lp2/b;->h:Z

    iput-boolean v3, p1, Lp2/b;->j:Z

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AssertionError (GSON 2.9.0): "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v4

    :catch_1
    move-exception v0

    new-instance v4, Li2/o;

    invoke-direct {v4, v0}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-boolean v1, p1, Lp2/b;->g:Z

    iput-boolean v2, p1, Lp2/b;->h:Z

    iput-boolean v3, p1, Lp2/b;->j:Z

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Li2/i;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li2/i;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li2/i;->c:Lk2/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
