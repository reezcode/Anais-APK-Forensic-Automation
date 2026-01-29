.class public final Lk/f;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Lk/q0;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lk/q0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lk/q0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/f;->a:Ljava/lang/Class;

    iput-object p2, p0, Lk/f;->b:Lk/q0;

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 9

    iget-object p4, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    sget-object p1, Lk/b1;->i:Lk/b1;

    invoke-virtual {p4, p1}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_0
    move-object p5, p2

    check-cast p5, [Ljava/lang/Object;

    array-length v0, p5

    iget-object v1, p1, Lk/g0;->o:Lk/v0;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p2, p3}, Lk/g0;->o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p3, 0x5b

    :try_start_0
    invoke-virtual {p4, p3}, Lk/a1;->write(I)V

    :goto_0
    if-ge v2, v0, :cond_5

    if-eqz v2, :cond_1

    const/16 p3, 0x2c

    invoke-virtual {p4, p3}, Lk/a1;->write(I)V

    :cond_1
    aget-object v5, p5, v2

    if-nez v5, :cond_3

    sget-object p3, Lk/b1;->j:Lk/b1;

    invoke-virtual {p4, p3}, Lk/a1;->l(Lk/b1;)Z

    move-result p3

    if-eqz p3, :cond_2

    instance-of p3, p2, [Ljava/lang/String;

    if-eqz p3, :cond_2

    const-string p3, ""

    invoke-virtual {p4, p3}, Lk/a1;->J(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    const-string p3, "null"

    invoke-virtual {p4, p3}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    iget-object v3, p0, Lk/f;->a:Ljava/lang/Class;

    if-ne p3, v3, :cond_4

    iget-object p3, p0, Lk/f;->b:Lk/q0;

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v6, v3

    move-object v3, p3

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p1, p3}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object p3

    goto :goto_1

    :goto_2
    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-interface/range {v3 .. v8}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    const/16 p2, 0x5d

    invoke-virtual {p4, p2}, Lk/a1;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p1, Lk/g0;->o:Lk/v0;

    return-void

    :catchall_0
    move-exception p2

    iput-object v1, p1, Lk/g0;->o:Lk/v0;

    throw p2
.end method
