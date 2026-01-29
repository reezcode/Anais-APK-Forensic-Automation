.class public Lw2/q;
.super Lw2/b;


# static fields
.field public static final e:Lw2/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/q;

    invoke-direct {v0}, Lw2/q;-><init>()V

    sput-object v0, Lw2/q;->e:Lw2/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/util/Date;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lw2/b;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lw2/b;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    new-instance p1, Ljava/util/Date;

    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/util/Date;-><init>(J)V

    return-object p1
.end method

.method public N()Lw2/b$a;
    .locals 1

    sget-object v0, Lw2/b;->d:Lw2/b$a;

    return-object v0
.end method

.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types"

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/util/Date;

    new-instance p1, Ljava/sql/Timestamp;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    return-object p1
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lw2/q;->N()Lw2/b$a;

    move-result-object v0

    invoke-static {p1, v0}, Lw2/b;->M(Lv2/g;Lw2/b$a;)Lw2/b$a;

    move-result-object p1

    :try_start_0
    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Lw2/b$a;->a()Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Problems parsing default date string \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' using \'"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method
