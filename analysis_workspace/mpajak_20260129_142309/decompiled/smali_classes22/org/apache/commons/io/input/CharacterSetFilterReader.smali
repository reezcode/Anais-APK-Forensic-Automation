.class public Lorg/apache/commons/io/input/CharacterSetFilterReader;
.super Lorg/apache/commons/io/input/AbstractCharacterFilterReader;


# direct methods
.method public constructor <init>(Ljava/io/Reader;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/Reader;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2}, Lorg/apache/commons/io/input/CharacterSetFilterReader;->toIntPredicate(Ljava/util/Set;)Ljava/util/function/IntPredicate;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/apache/commons/io/input/AbstractCharacterFilterReader;-><init>(Ljava/io/Reader;Ljava/util/function/IntPredicate;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/io/Reader;[Ljava/lang/Integer;)V
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/input/CharacterSetFilterReader;-><init>(Ljava/io/Reader;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/Set;I)Z
    .locals 0

    invoke-static {p0, p1}, Lorg/apache/commons/io/input/CharacterSetFilterReader;->lambda$toIntPredicate$0(Ljava/util/Set;I)Z

    move-result p0

    return p0
.end method

.method private static synthetic lambda$toIntPredicate$0(Ljava/util/Set;I)Z
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static toIntPredicate(Ljava/util/Set;)Ljava/util/function/IntPredicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/function/IntPredicate;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lorg/apache/commons/io/input/AbstractCharacterFilterReader;->SKIP_NONE:Ljava/util/function/IntPredicate;

    return-object p0

    :cond_0
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    new-instance v0, Lorg/apache/commons/io/input/d;

    invoke-direct {v0, p0}, Lorg/apache/commons/io/input/d;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
