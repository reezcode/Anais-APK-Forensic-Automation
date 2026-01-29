.class public final Lx2/c;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ljava/lang/Object;


# instance fields
.field public final a:Lx2/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx2/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/c;->a:Lx2/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lx2/c;->b:Ljava/lang/Object;

    if-ne p2, v0, :cond_0

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    const-string p2, "null"

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->d:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->d:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->d:Lx2/b$a;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->e:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lx2/c;->a:Lx2/b;

    invoke-interface {v0, p1}, Lx2/b;->b(Lx2/b$a;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "{}"

    invoke-virtual {p3, v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_2

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    invoke-virtual {v0, p3, v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    :goto_1
    if-nez p2, :cond_1

    iget-object p2, p0, Lx2/c;->a:Lx2/b;

    invoke-interface {p2, p1, p3}, Lx2/b;->a(Lx2/b$a;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    iget-object p4, p0, Lx2/c;->a:Lx2/b;

    invoke-interface {p4, p1, p3, p2}, Lx2/b;->c(Lx2/b$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_2
    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v4, 0x80

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_3
    invoke-virtual {v0, p3, v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v3, 0x2

    if-nez p7, :cond_6

    if-nez v2, :cond_4

    invoke-virtual {p0, v0, p4}, Lx2/c;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-virtual {p0, v0, p5}, Lx2/c;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    const/4 v3, 0x2

    if-ne v2, v3, :cond_7

    invoke-virtual {p0, v0, p6}, Lx2/c;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    array-length v3, p7

    if-ge v2, v3, :cond_7

    aget-object v3, p7, v2

    invoke-virtual {p0, v0, v3}, Lx2/c;->a(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    :goto_3
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->c:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, v6

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->c:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    sget-object v1, Lx2/b$a;->c:Lx2/b$a;

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    return-void
.end method
