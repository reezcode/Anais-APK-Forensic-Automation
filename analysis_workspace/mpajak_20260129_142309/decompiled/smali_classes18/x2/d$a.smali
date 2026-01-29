.class public enum Lx2/d$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx2/d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lx2/d$a$a;

.field public static final synthetic e:[Lx2/d$a;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const-class v0, Lx2/a;

    new-instance v1, Lx2/d$a;

    const-string v2, "ANDROID"

    const/4 v3, 0x0

    const-string v4, "android.util.Log"

    const-string v5, "com.j256.ormlite.android.AndroidLog"

    invoke-direct {v1, v2, v3, v4, v5}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lx2/d$a;

    const-string v4, "SLF4J"

    const/4 v5, 0x1

    const-string v6, "org.slf4j.LoggerFactory"

    const-string v7, "com.j256.ormlite.logger.Slf4jLoggingLog"

    invoke-direct {v2, v4, v5, v6, v7}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lx2/d$a;

    const-string v6, "COMMONS_LOGGING"

    const/4 v7, 0x2

    const-string v8, "org.apache.commons.logging.LogFactory"

    const-string v9, "com.j256.ormlite.logger.CommonsLoggingLog"

    invoke-direct {v4, v6, v7, v8, v9}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lx2/d$a;

    const-string v8, "LOG4J2"

    const/4 v9, 0x3

    const-string v10, "org.apache.logging.log4j.LogManager"

    const-string v11, "com.j256.ormlite.logger.Log4j2Log"

    invoke-direct {v6, v8, v9, v10, v11}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v8, Lx2/d$a;

    const-string v10, "LOG4J"

    const/4 v11, 0x4

    const-string v12, "org.apache.log4j.Logger"

    const-string v13, "com.j256.ormlite.logger.Log4jLog"

    invoke-direct {v8, v10, v11, v12, v13}, Lx2/d$a;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lx2/d$a$a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v12, v0}, Lx2/d$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v10, Lx2/d$a;->d:Lx2/d$a$a;

    const/4 v0, 0x6

    new-array v0, v0, [Lx2/d$a;

    aput-object v1, v0, v3

    aput-object v2, v0, v5

    aput-object v4, v0, v7

    aput-object v6, v0, v9

    aput-object v8, v0, v11

    const/4 v1, 0x5

    aput-object v10, v0, v1

    sput-object v0, Lx2/d$a;->e:[Lx2/d$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lx2/d$a;->b:Ljava/lang/String;

    iput-object p4, p0, Lx2/d$a;->c:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx2/d$a;
    .locals 1

    const-class v0, Lx2/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx2/d$a;

    return-object p0
.end method

.method public static values()[Lx2/d$a;
    .locals 1

    sget-object v0, Lx2/d$a;->e:[Lx2/d$a;

    invoke-virtual {v0}, [Lx2/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx2/d$a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lx2/b;
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1}, Lx2/d$a;->b(Ljava/lang/String;)Lx2/b;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Lx2/a;

    invoke-direct {v1, p1}, Lx2/a;-><init>(Ljava/lang/String;)V

    sget-object p1, Lx2/b$a;->f:Lx2/b$a;

    const-string v2, "Unable to call constructor with single String argument for class "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lx2/d$a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", so had to use local log: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lx2/a;->e(Lx2/b$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final b(Ljava/lang/String;)Lx2/b;
    .locals 5

    iget-object v0, p0, Lx2/d$a;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx2/b;

    return-object p1
.end method

.method public c()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lx2/d$a;->b:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lx2/d$a;->b(Ljava/lang/String;)Lx2/b;

    move-result-object v2

    sget-object v3, Lx2/b$a;->e:Lx2/b$a;

    invoke-interface {v2, v3}, Lx2/b;->b(Lx2/b$a;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return v1

    :catch_1
    return v0
.end method
