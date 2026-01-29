.class public final Lw2/o;
.super Lw2/b;


# static fields
.field public static final e:Lw2/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/o;

    invoke-direct {v0}, Lw2/o;-><init>()V

    sput-object v0, Lw2/o;->e:Lw2/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lw2/b;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/String;

    sget-object v0, Lw2/b;->d:Lw2/b$a;

    invoke-static {p1, v0}, Lw2/b;->M(Lv2/g;Lw2/b$a;)Lw2/b$a;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1}, Lw2/b$a;->a()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Problems with column "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " parsing date-string \'"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' using \'"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    invoke-virtual {p1, p2}, Lq2/d;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lw2/b;->d:Lw2/b$a;

    invoke-static {p1, v0}, Lw2/b;->M(Lv2/g;Lw2/b$a;)Lw2/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lw2/b$a;->a()Ljava/text/DateFormat;

    move-result-object p1

    check-cast p2, Ljava/util/Date;

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lv2/g;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p1, Lv2/g;->e:Lv2/e;

    iget-object p1, p1, Lv2/e;->p:Ljava/lang/String;

    if-nez p1, :cond_0

    sget-object p1, Lw2/b;->d:Lw2/b$a;

    return-object p1

    :cond_0
    new-instance v0, Lw2/b$a;

    invoke-direct {v0, p1}, Lw2/b$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final h()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, [B

    return-object v0
.end method

.method public final n()I
    .locals 1

    const/16 v0, 0x32

    return v0
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lw2/b;->d:Lw2/b$a;

    invoke-static {p1, v0}, Lw2/b;->M(Lv2/g;Lw2/b$a;)Lw2/b$a;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lw2/b$a;->a()Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Problems with field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " parsing default date-string \'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' using \'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method
