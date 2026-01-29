.class public final Lm/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:[Lm/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lm/f$a<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1fff

    iput v0, p0, Lm/f;->b:I

    const/16 v0, 0x2000

    new-array v0, v0, [Lm/f$a;

    iput-object v0, p0, Lm/f;->a:[Lm/f$a;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x1fff

    iput p1, p0, Lm/f;->b:I

    const/16 p1, 0x2000

    new-array p1, p1, [Lm/f$a;

    iput-object p1, p0, Lm/f;->a:[Lm/f$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lm/f;->b:I

    and-int/2addr v0, v1

    iget-object v1, p0, Lm/f;->a:[Lm/f$a;

    aget-object v0, v1, v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lm/f$a;->a:Ljava/lang/Object;

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Lm/f$a;->b:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v0, v0, Lm/f$a;->c:Lm/f$a;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lm/f;->b:I

    and-int/2addr v0, v1

    iget-object v1, p0, Lm/f;->a:[Lm/f$a;

    aget-object v1, v1, v0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, v1, Lm/f$a;->a:Ljava/lang/Object;

    if-ne p1, v2, :cond_0

    iput-object p2, v1, Lm/f$a;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v1, v1, Lm/f$a;->c:Lm/f$a;

    goto :goto_0

    :cond_1
    new-instance v1, Lm/f$a;

    iget-object v2, p0, Lm/f;->a:[Lm/f$a;

    aget-object v3, v2, v0

    invoke-direct {v1, p1, p2, v3}, Lm/f$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lm/f$a;)V

    aput-object v1, v2, v0

    const/4 p1, 0x0

    return p1
.end method
