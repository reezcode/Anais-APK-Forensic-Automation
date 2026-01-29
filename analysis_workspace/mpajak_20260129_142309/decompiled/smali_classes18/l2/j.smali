.class public final Ll2/j;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ll2/i;


# instance fields
.field public final a:Li2/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Li2/w;->c:Li2/w$b;

    new-instance v1, Ll2/j;

    invoke-direct {v1, v0}, Ll2/j;-><init>(Li2/x;)V

    new-instance v0, Ll2/i;

    invoke-direct {v0, v1}, Ll2/i;-><init>(Ll2/j;)V

    sput-object v0, Ll2/j;->b:Ll2/i;

    return-void
.end method

.method public constructor <init>(Li2/x;)V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    iput-object p1, p0, Ll2/j;->a:Li2/x;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    invoke-static {v0}, Lf/h;->a(I)I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Li2/u;

    const-string v2, "Expecting number, got: "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lp2/a;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Li2/u;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Ll2/j;->a:Li2/x;

    invoke-interface {v0, p1}, Li2/x;->a(Lp2/a;)Ljava/lang/Number;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p1, p2}, Lp2/b;->A(Ljava/lang/Number;)Lp2/b;

    return-void
.end method
