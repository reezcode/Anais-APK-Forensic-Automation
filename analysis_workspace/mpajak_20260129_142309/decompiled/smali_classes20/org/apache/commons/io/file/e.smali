.class public final synthetic Lorg/apache/commons/io/file/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lorg/apache/commons/io/file/PathFilter;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lorg/apache/commons/io/file/PathFilter;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/commons/io/file/e;->a:Lorg/apache/commons/io/file/PathFilter;

    iput-boolean p2, p0, Lorg/apache/commons/io/file/e;->b:Z

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lorg/apache/commons/io/file/e;->a:Lorg/apache/commons/io/file/PathFilter;

    iget-boolean v1, p0, Lorg/apache/commons/io/file/e;->b:Z

    check-cast p1, Ljava/nio/file/Path;

    invoke-static {v0, v1, p1}, Lorg/apache/commons/io/file/PathUtils;->a(Lorg/apache/commons/io/file/PathFilter;ZLjava/nio/file/Path;)Z

    move-result p1

    return p1
.end method
