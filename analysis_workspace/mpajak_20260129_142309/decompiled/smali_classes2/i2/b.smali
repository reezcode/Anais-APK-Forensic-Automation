.class public abstract enum Li2/b;
.super Ljava/lang/Enum;

# interfaces
.implements Li2/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li2/b;",
        ">;",
        "Li2/c;"
    }
.end annotation


# static fields
.field public static final enum b:Li2/b$a;

.field public static final enum c:Li2/b$b;

.field public static final enum d:Li2/b$c;

.field public static final enum e:Li2/b$d;

.field public static final enum f:Li2/b$e;

.field public static final enum g:Li2/b$f;

.field public static final enum h:Li2/b$g;

.field public static final synthetic i:[Li2/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Li2/b$a;

    invoke-direct {v0}, Li2/b$a;-><init>()V

    sput-object v0, Li2/b;->b:Li2/b$a;

    new-instance v1, Li2/b$b;

    const/4 v2, 0x1

    invoke-direct {v1}, Li2/b$b;-><init>()V

    sput-object v1, Li2/b;->c:Li2/b$b;

    new-instance v3, Li2/b$c;

    const/4 v4, 0x2

    invoke-direct {v3}, Li2/b$c;-><init>()V

    sput-object v3, Li2/b;->d:Li2/b$c;

    new-instance v5, Li2/b$d;

    const/4 v6, 0x3

    invoke-direct {v5}, Li2/b$d;-><init>()V

    sput-object v5, Li2/b;->e:Li2/b$d;

    new-instance v7, Li2/b$e;

    const/4 v8, 0x4

    invoke-direct {v7}, Li2/b$e;-><init>()V

    sput-object v7, Li2/b;->f:Li2/b$e;

    new-instance v9, Li2/b$f;

    const/4 v10, 0x5

    invoke-direct {v9}, Li2/b$f;-><init>()V

    sput-object v9, Li2/b;->g:Li2/b$f;

    new-instance v11, Li2/b$g;

    const/4 v12, 0x6

    invoke-direct {v11}, Li2/b$g;-><init>()V

    sput-object v11, Li2/b;->h:Li2/b$g;

    const/4 v13, 0x7

    new-array v13, v13, [Li2/b;

    const/4 v14, 0x0

    aput-object v0, v13, v14

    aput-object v1, v13, v2

    aput-object v3, v13, v4

    aput-object v5, v13, v6

    aput-object v7, v13, v8

    aput-object v9, v13, v10

    aput-object v11, v13, v12

    sput-object v13, Li2/b;->i:[Li2/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILi2/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static b(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    const/4 v3, 0x1

    if-nez v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Li2/b;
    .locals 1

    const-class v0, Li2/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li2/b;

    return-object p0
.end method

.method public static values()[Li2/b;
    .locals 1

    sget-object v0, Li2/b;->i:[Li2/b;

    invoke-virtual {v0}, [Li2/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li2/b;

    return-object v0
.end method
