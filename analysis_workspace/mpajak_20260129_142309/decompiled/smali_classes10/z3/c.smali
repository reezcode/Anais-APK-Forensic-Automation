.class public final Lz3/c;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final e:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final f:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final g:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final h:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final i:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# instance fields
.field public final a:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final b:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final c:Lf4/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lz3/c;->d:Lf4/i;

    const-string v1, ":status"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lz3/c;->e:Lf4/i;

    const-string v1, ":method"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lz3/c;->f:Lf4/i;

    const-string v1, ":path"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lz3/c;->g:Lf4/i;

    const-string v1, ":scheme"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v1

    sput-object v1, Lz3/c;->h:Lf4/i;

    const-string v1, ":authority"

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    sput-object v0, Lz3/c;->i:Lf4/i;

    return-void
.end method

.method public constructor <init>(Lf4/i;Lf4/i;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/c;->b:Lf4/i;

    iput-object p2, p0, Lz3/c;->c:Lf4/i;

    invoke-virtual {p1}, Lf4/i;->c()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lf4/i;->c()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Lz3/c;->a:I

    return-void
.end method

.method public constructor <init>(Lf4/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    invoke-virtual {v0, p2}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    invoke-virtual {v0, p1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object p1

    invoke-virtual {v0, p2}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lz3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lz3/c;

    iget-object v0, p0, Lz3/c;->b:Lf4/i;

    iget-object v1, p1, Lz3/c;->b:Lf4/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz3/c;->c:Lf4/i;

    iget-object p1, p1, Lz3/c;->c:Lf4/i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lz3/c;->b:Lf4/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf4/i;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lz3/c;->c:Lf4/i;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lf4/i;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lz3/c;->b:Lf4/i;

    invoke-virtual {v1}, Lf4/i;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz3/c;->c:Lf4/i;

    invoke-virtual {v1}, Lf4/i;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
