.class public final synthetic Lorg/apache/commons/io/input/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/IntPredicate;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/apache/commons/io/input/c;->a:I

    return-void
.end method


# virtual methods
.method public final test(I)Z
    .locals 1

    iget v0, p0, Lorg/apache/commons/io/input/c;->a:I

    invoke-static {v0, p1}, Lorg/apache/commons/io/input/CharacterFilterReader;->b(II)Z

    move-result p1

    return p1
.end method
