.class public Lorg/apache/commons/io/file/NoopPathVisitor;
.super Lorg/apache/commons/io/file/SimplePathVisitor;


# static fields
.field public static final INSTANCE:Lorg/apache/commons/io/file/NoopPathVisitor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/file/NoopPathVisitor;

    invoke-direct {v0}, Lorg/apache/commons/io/file/NoopPathVisitor;-><init>()V

    sput-object v0, Lorg/apache/commons/io/file/NoopPathVisitor;->INSTANCE:Lorg/apache/commons/io/file/NoopPathVisitor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/commons/io/file/SimplePathVisitor;-><init>()V

    return-void
.end method
