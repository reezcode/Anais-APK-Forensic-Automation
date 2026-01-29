.class public abstract Lorg/apache/commons/io/input/ObservableInputStream$Observer;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/io/input/ObservableInputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Observer"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public closed()V
    .locals 0

    return-void
.end method

.method public data(I)V
    .locals 0

    return-void
.end method

.method public data([BII)V
    .locals 0

    return-void
.end method

.method public error(Ljava/io/IOException;)V
    .locals 0

    throw p1
.end method

.method public finished()V
    .locals 0

    return-void
.end method
