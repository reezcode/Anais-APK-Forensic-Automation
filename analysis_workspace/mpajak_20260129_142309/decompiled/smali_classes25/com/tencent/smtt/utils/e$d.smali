.class Lcom/tencent/smtt/utils/e$d;
.super Lcom/tencent/smtt/utils/e$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/smtt/utils/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/smtt/utils/e$k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/tencent/smtt/utils/e$d;->d:I

    return v0
.end method

.method public b()J
    .locals 2

    iget v0, p0, Lcom/tencent/smtt/utils/e$d;->c:I

    int-to-long v0, v0

    return-wide v0
.end method
