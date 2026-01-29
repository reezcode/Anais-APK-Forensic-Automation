.class public final synthetic Lorg/apache/commons/io/input/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/IntPredicate;


# static fields
.field public static final synthetic a:Lorg/apache/commons/io/input/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/input/a;

    invoke-direct {v0}, Lorg/apache/commons/io/input/a;-><init>()V

    sput-object v0, Lorg/apache/commons/io/input/a;->a:Lorg/apache/commons/io/input/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(I)Z
    .locals 0

    invoke-static {p1}, Lorg/apache/commons/io/input/AbstractCharacterFilterReader;->a(I)Z

    move-result p1

    return p1
.end method
