.class public final Lj/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# static fields
.field public static final a:Lj/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/a0;

    invoke-direct {v0}, Lj/a0;-><init>()V

    sput-object v0, Lj/a0;->a:Lj/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-object p2, p1, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/16 v0, 0x10

    if-ne p3, v0, :cond_3

    const/4 p1, 0x4

    invoke-interface {p2, p1}, Li/c;->Q(I)V

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const-string v1, "syntax error"

    if-ne p3, p1, :cond_2

    const/4 p1, 0x2

    invoke-interface {p2}, Li/c;->H()V

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    if-ne p3, p1, :cond_1

    invoke-interface {p2}, Li/c;->e()J

    move-result-wide v2

    const/16 p1, 0xd

    invoke-interface {p2, p1}, Li/c;->Q(I)V

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    if-ne p3, p1, :cond_0

    invoke-interface {p2, v0}, Li/c;->Q(I)V

    new-instance p1, Ljava/sql/Time;

    invoke-direct {p1, v2, v3}, Ljava/sql/Time;-><init>(J)V

    return-object p1

    :cond_0
    new-instance p1, Lf/d;

    invoke-direct {p1, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lf/d;

    invoke-direct {p1, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lf/d;

    invoke-direct {p1, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    return-object p2

    :cond_4
    instance-of p3, p1, Ljava/sql/Time;

    if-eqz p3, :cond_5

    return-object p1

    :cond_5
    instance-of p3, p1, Ljava/lang/Number;

    if-eqz p3, :cond_6

    new-instance p2, Ljava/sql/Time;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ljava/sql/Time;-><init>(J)V

    return-object p2

    :cond_6
    instance-of p3, p1, Ljava/lang/String;

    if-eqz p3, :cond_d

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-nez p3, :cond_7

    return-object p2

    :cond_7
    new-instance p2, Li/f;

    invoke-direct {p2, p1}, Li/f;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Li/f;->S0(Z)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p2, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_b

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_a

    const/16 v3, 0x39

    if-le v2, v3, :cond_9

    goto :goto_1

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_a
    :goto_1
    const/4 p3, 0x0

    :cond_b
    if-nez p3, :cond_c

    invoke-virtual {p2}, Li/d;->close()V

    invoke-static {p1}, Ljava/sql/Time;->valueOf(Ljava/lang/String;)Ljava/sql/Time;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_2
    invoke-virtual {p2}, Li/d;->close()V

    new-instance p1, Ljava/sql/Time;

    invoke-direct {p1, v0, v1}, Ljava/sql/Time;-><init>(J)V

    return-object p1

    :cond_d
    new-instance p1, Lf/d;

    const-string p2, "parse error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
