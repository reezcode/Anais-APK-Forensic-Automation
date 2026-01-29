.class public final Lj/x;
.super Lj/b;


# static fields
.field public static final b:Lj/x;

.field public static final c:Lj/x;


# instance fields
.field public a:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/x;

    invoke-direct {v0}, Lj/x;-><init>()V

    sput-object v0, Lj/x;->b:Lj/x;

    new-instance v0, Lj/x;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj/x;-><init>(Z)V

    sput-object v0, Lj/x;->c:Lj/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj/b;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/x;->a:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lj/b;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj/x;->a:Z

    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final g(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-boolean p2, p0, Lj/x;->a:Z

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_6

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    instance-of p2, p3, Ljava/util/Date;

    if-eqz p2, :cond_1

    new-instance v1, Ljava/sql/Timestamp;

    check-cast p3, Ljava/util/Date;

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    invoke-direct {v1, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_1

    :cond_1
    instance-of p2, p3, Ljava/lang/Number;

    if-eqz p2, :cond_2

    new-instance v1, Ljava/sql/Timestamp;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-direct {v1, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_1

    :cond_2
    instance-of p2, p3, Ljava/lang/String;

    if-eqz p2, :cond_5

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    new-instance p2, Li/f;

    invoke-direct {p2, p3}, Li/f;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2, v0}, Li/f;->S0(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p2, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Li/a;->n()Ljava/text/DateFormat;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1, p3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    new-instance v1, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/sql/Timestamp;-><init>(J)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p2}, Li/d;->close()V

    goto :goto_1

    :catch_0
    :try_start_2
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    invoke-virtual {p2}, Li/d;->close()V

    new-instance p1, Ljava/sql/Timestamp;

    invoke-direct {p1, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    move-object v1, p1

    :goto_1
    return-object v1

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Li/d;->close()V

    throw p1

    :cond_5
    new-instance p1, Lf/d;

    const-string p2, "parse error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez p3, :cond_7

    return-object v1

    :cond_7
    instance-of p2, p3, Ljava/util/Date;

    if-eqz p2, :cond_8

    new-instance p1, Ljava/sql/Date;

    check-cast p3, Ljava/util/Date;

    invoke-virtual {p3}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/sql/Date;-><init>(J)V

    goto :goto_2

    :cond_8
    instance-of p2, p3, Ljava/lang/Number;

    if-eqz p2, :cond_9

    new-instance p1, Ljava/sql/Date;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/sql/Date;-><init>(J)V

    :goto_2
    return-object p1

    :cond_9
    instance-of p2, p3, Ljava/lang/String;

    if-eqz p2, :cond_c

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_a

    return-object v1

    :cond_a
    new-instance p2, Li/f;

    invoke-direct {p2, p3}, Li/f;-><init>(Ljava/lang/String;)V

    :try_start_3
    invoke-virtual {p2, v0}, Li/f;->S0(Z)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object p1, p2, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    goto :goto_3

    :cond_b
    invoke-virtual {p1}, Li/a;->n()Ljava/text/DateFormat;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p1, p3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    new-instance v0, Ljava/sql/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Date;-><init>(J)V
    :try_end_4
    .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-virtual {p2}, Li/d;->close()V

    return-object v0

    :catch_1
    :try_start_5
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    invoke-virtual {p2}, Li/d;->close()V

    new-instance p1, Ljava/sql/Date;

    invoke-direct {p1, v0, v1}, Ljava/sql/Date;-><init>(J)V

    return-object p1

    :catchall_1
    move-exception p1

    invoke-virtual {p2}, Li/d;->close()V

    throw p1

    :cond_c
    new-instance p1, Lf/d;

    const-string p2, "parse error : "

    invoke-static {p2, p3}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method
