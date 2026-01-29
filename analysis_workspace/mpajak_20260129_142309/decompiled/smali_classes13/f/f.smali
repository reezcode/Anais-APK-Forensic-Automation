.class public final Lf/f;
.super Ljava/lang/Object;

# interfaces
.implements Lk/e0;


# static fields
.field public static final c:I


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk/b1;->y:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    sput v0, Lf/f;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf/f;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf/f;->b:Ljava/util/ArrayList;

    iput-object p1, p0, Lf/f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lk/g0;I)V
    .locals 2

    iget-object v0, p1, Lk/g0;->j:Lk/a1;

    sget v1, Lf/f;->c:I

    and-int/2addr p2, v1

    if-nez p2, :cond_0

    invoke-virtual {v0, v1}, Lk/a1;->f(I)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    const-string p2, "/**/"

    invoke-virtual {v0, p2}, Lk/a1;->write(Ljava/lang/String;)V

    :cond_1
    iget-object p2, p0, Lf/f;->a:Ljava/lang/String;

    invoke-virtual {v0, p2}, Lk/a1;->write(Ljava/lang/String;)V

    const/16 p2, 0x28

    invoke-virtual {v0, p2}, Lk/a1;->write(I)V

    const/4 p2, 0x0

    :goto_0
    iget-object v1, p0, Lf/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_3

    if-eqz p2, :cond_2

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Lk/a1;->write(I)V

    :cond_2
    iget-object v1, p0, Lf/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Lk/g0;->q(Ljava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Lk/a1;->write(I)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
