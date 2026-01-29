.class Lcom/tencent/smtt/utils/e$h;
.super Lcom/tencent/smtt/utils/e$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/smtt/utils/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/tencent/smtt/utils/e$k;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-wide v0, p0, Lcom/tencent/smtt/utils/e$h;->d:J

    long-to-int v1, v0

    return v1
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/smtt/utils/e$h;->c:J

    return-wide v0
.end method
