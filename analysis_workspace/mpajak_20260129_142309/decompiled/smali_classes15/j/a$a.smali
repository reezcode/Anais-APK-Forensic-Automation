.class public final Lj/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lm/g;

.field public final e:Ljava/lang/String;

.field public f:[Lm/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm/g;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lj/a$a;->a:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    iput-object p1, p0, Lj/a$a;->e:Ljava/lang/String;

    iget-object p1, p2, Lm/g;->a:Ljava/lang/Class;

    iput-object p1, p0, Lj/a$a;->c:Ljava/lang/Class;

    iput p3, p0, Lj/a$a;->a:I

    iput-object p2, p0, Lj/a$a;->d:Lm/g;

    iget-object p1, p2, Lm/g;->h:[Lm/c;

    iput-object p1, p0, Lj/a$a;->f:[Lm/c;

    return-void
.end method

.method public static synthetic a(Lj/a$a;)I
    .locals 0

    iget p0, p0, Lj/a$a;->a:I

    return p0
.end method

.method public static synthetic b(Lj/a$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lj/a$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lj/a$a;)Ljava/lang/Class;
    .locals 0

    iget-object p0, p0, Lj/a$a;->c:Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method public final d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lj/a$a;->d:Lm/g;

    iget-object v0, v0, Lm/g;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/a$a;->c:Ljava/lang/Class;

    :cond_0
    return-object v0
.end method

.method public final e(Ljava/lang/String;)I
    .locals 2

    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    iget v1, p0, Lj/a$a;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lj/a$a;->a:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lj/a$a;->a:I

    :cond_0
    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    iget v1, p0, Lj/a$a;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj/a$a;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lj/a$a;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
