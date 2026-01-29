.class public final Lx2/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/d$a;
    }
.end annotation


# static fields
.field public static a:Lx2/d$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lx2/c;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lx2/c;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lx2/d;->a:Lx2/d$a;

    if-nez v0, :cond_3

    const-string v0, "com.j256.ormlite.logger.type"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Lx2/d$a;->valueOf(Ljava/lang/String;)Lx2/d$a;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance v1, Lx2/a;

    const-class v2, Lx2/d;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lx2/a;-><init>(Ljava/lang/String;)V

    sget-object v2, Lx2/b$a;->f:Lx2/b$a;

    const-string v3, "Could not find valid log-type from system property \'com.j256.ormlite.logger.type\', value \'"

    const-string v4, "\'"

    invoke-static {v3, v0, v4}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lx2/a;->e(Lx2/b$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {}, Lx2/d$a;->values()[Lx2/d$a;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lx2/d$a;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v0, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lx2/d$a;->d:Lx2/d$a$a;

    :goto_1
    sput-object v0, Lx2/d;->a:Lx2/d$a;

    :cond_3
    new-instance v0, Lx2/c;

    sget-object v1, Lx2/d;->a:Lx2/d$a;

    invoke-virtual {v1, p0}, Lx2/d$a;->a(Ljava/lang/String;)Lx2/b;

    move-result-object p0

    invoke-direct {v0, p0}, Lx2/c;-><init>(Lx2/b;)V

    return-object v0
.end method
