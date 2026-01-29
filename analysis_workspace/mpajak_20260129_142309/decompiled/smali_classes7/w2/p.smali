.class public final Lw2/p;
.super Lw2/a;


# static fields
.field public static final d:Lw2/p;

.field public static e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static f:Ljava/lang/reflect/Method;

.field public static g:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public static final h:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/p;

    invoke-direct {v0}, Lw2/p;-><init>()V

    sput-object v0, Lw2/p;->d:Lw2/p;

    const/4 v0, 0x0

    sput-object v0, Lw2/p;->e:Ljava/lang/Class;

    sput-object v0, Lw2/p;->f:Ljava/lang/reflect/Method;

    sput-object v0, Lw2/p;->g:Ljava/lang/reflect/Constructor;

    const-string v0, "org.joda.time.DateTime"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw2/p;->h:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    const/16 v1, 0xa

    invoke-direct {p0, v1, v0}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    :try_start_0
    sget-object p1, Lw2/p;->g:Ljava/lang/reflect/Constructor;

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lw2/p;->M()Ljava/lang/Class;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, p3

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    sput-object p1, Lw2/p;->g:Ljava/lang/reflect/Constructor;

    :cond_0
    sget-object p1, Lw2/p;->g:Ljava/lang/reflect/Constructor;

    new-array v0, v0, [Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    aput-object p2, v0, p3

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "Could not use reflection to construct a Joda DateTime"

    invoke-static {p2, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

.method public final M()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lw2/p;->e:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.joda.time.DateTime"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lw2/p;->e:Ljava/lang/Class;

    :cond_0
    sget-object v0, Lw2/p;->e:Ljava/lang/Class;

    return-object v0
.end method

.method public final b()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lw2/p;->h:[Ljava/lang/String;

    return-object v0
.end method

.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    invoke-virtual {p1, p2}, Lq2/d;->d(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    sget-object p1, Lw2/p;->f:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lw2/p;->M()Ljava/lang/Class;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/Class;

    const-string v2, "getMillis"

    invoke-virtual {p1, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    sput-object p1, Lw2/p;->f:Ljava/lang/reflect/Method;

    :cond_0
    sget-object p1, Lw2/p;->f:Ljava/lang/reflect/Method;

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not use reflection to get millis from Joda DateTime: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
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

    :try_start_0
    invoke-virtual {p0}, Lw2/p;->M()Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
