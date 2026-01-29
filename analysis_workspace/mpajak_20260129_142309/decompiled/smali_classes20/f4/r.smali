.class public final Lf4/r;
.super Lkotlin/collections/AbstractList;

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/r$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/collections/AbstractList<",
        "Lf4/i;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final d:Lf4/r$a;


# instance fields
.field public final b:[Lf4/i;

.field public final c:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/r$a;

    invoke-direct {v0}, Lf4/r$a;-><init>()V

    sput-object v0, Lf4/r;->d:Lf4/r$a;

    return-void
.end method

.method public constructor <init>([Lf4/i;[I)V
    .locals 0

    invoke-direct {p0}, Lkotlin/collections/AbstractList;-><init>()V

    iput-object p1, p0, Lf4/r;->b:[Lf4/i;

    iput-object p2, p0, Lf4/r;->c:[I

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lf4/i;

    if-eqz v0, :cond_0

    check-cast p1, Lf4/i;

    invoke-super {p0, p1}, Lkotlin/collections/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf4/r;->b:[Lf4/i;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lf4/r;->b:[Lf4/i;

    array-length v0, v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lf4/i;

    if-eqz v0, :cond_0

    check-cast p1, Lf4/i;

    invoke-super {p0, p1}, Lkotlin/collections/AbstractList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lf4/i;

    if-eqz v0, :cond_0

    check-cast p1, Lf4/i;

    invoke-super {p0, p1}, Lkotlin/collections/AbstractList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
