.class public final Lm3/c;
.super Lm3/l0;


# instance fields
.field public final h:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lm3/l0;-><init>()V

    iput-object p1, p0, Lm3/c;->h:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public final J()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lm3/c;->h:Ljava/lang/Thread;

    return-object v0
.end method
