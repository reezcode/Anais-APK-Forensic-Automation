.class public final Ly3/a;
.super Ljava/lang/Object;


# instance fields
.field public a:J

.field public final b:Lf4/h;


# direct methods
.method public constructor <init>(Lf4/h;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/a;->b:Lf4/h;

    const/high16 p1, 0x40000

    int-to-long v0, p1

    iput-wide v0, p0, Ly3/a;->a:J

    return-void
.end method


# virtual methods
.method public final a()Ls3/r;
    .locals 8

    new-instance v0, Ls3/r$a;

    invoke-direct {v0}, Ls3/r$a;-><init>()V

    :goto_0
    iget-object v1, p0, Ly3/a;->b:Lf4/h;

    iget-wide v2, p0, Ly3/a;->a:J

    invoke-interface {v1, v2, v3}, Lf4/h;->O(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Ly3/a;->a:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Ly3/a;->a:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ls3/r$a;->b()Ls3/r;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v2, "line"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    const/16 v5, 0x3a

    invoke-static {v1, v5, v4, v2}, Lkotlin/text/StringsKt;->h(Ljava/lang/CharSequence;CII)I

    move-result v2

    const-string v6, "(this as java.lang.String).substring(startIndex)"

    const/4 v7, -0x1

    if-eq v2, v7, :cond_2

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Ls3/r$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/r$a;

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_3

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    const-string v2, ""

    invoke-virtual {v0, v2, v1}, Ls3/r$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/r$a;

    goto :goto_0
.end method
