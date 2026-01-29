.class public abstract Lv3/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Lv3/c;

.field public b:J

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/a;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lv3/a;->d:Z

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lv3/a;->b:J

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv3/a;->c:Ljava/lang/String;

    return-object v0
.end method
