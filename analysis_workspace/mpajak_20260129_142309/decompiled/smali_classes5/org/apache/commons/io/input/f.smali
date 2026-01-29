.class public final synthetic Lorg/apache/commons/io/input/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# static fields
.field public static final synthetic b:Lorg/apache/commons/io/input/f;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/input/f;

    invoke-direct {v0}, Lorg/apache/commons/io/input/f;-><init>()V

    sput-object v0, Lorg/apache/commons/io/input/f;->b:Lorg/apache/commons/io/input/f;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p1}, Lorg/apache/commons/io/input/ReadAheadInputStream;->a(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    return-object p1
.end method
