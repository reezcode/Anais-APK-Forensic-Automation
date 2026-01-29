.class public final synthetic Lorg/apache/commons/io/input/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lorg/apache/commons/io/input/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/input/b;

    invoke-direct {v0}, Lorg/apache/commons/io/input/b;-><init>()V

    sput-object v0, Lorg/apache/commons/io/input/b;->b:Lorg/apache/commons/io/input/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/apache/commons/io/ByteOrderMark;

    check-cast p2, Lorg/apache/commons/io/ByteOrderMark;

    invoke-static {p1, p2}, Lorg/apache/commons/io/input/BOMInputStream;->a(Lorg/apache/commons/io/ByteOrderMark;Lorg/apache/commons/io/ByteOrderMark;)I

    move-result p1

    return p1
.end method
