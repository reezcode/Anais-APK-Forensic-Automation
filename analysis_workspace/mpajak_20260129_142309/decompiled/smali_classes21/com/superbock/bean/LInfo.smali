.class public Lcom/superbock/bean/LInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private cid:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private fb:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private ms:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pid:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pk:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private sta:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private sto:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private tp:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private tt:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private ty:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private us:I
    .annotation runtime Lv2/d;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/superbock/bean/LInfo;

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getCid()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/LInfo;->cid:I

    return v0
.end method

.method public getFb()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/LInfo;->fb:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->ms:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getPid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->pid:Ljava/lang/String;

    return-object v0
.end method

.method public getPk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->pk:Ljava/lang/String;

    return-object v0
.end method

.method public getSta()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/LInfo;->sta:J

    return-wide v0
.end method

.method public getSto()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/LInfo;->sto:J

    return-wide v0
.end method

.method public getTp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/LInfo;->tp:I

    return v0
.end method

.method public getTt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->tt:Ljava/lang/String;

    return-object v0
.end method

.method public getTy()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/LInfo;->ty:I

    return v0
.end method

.method public getUs()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/LInfo;->us:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public setCid(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/LInfo;->cid:I

    return-void
.end method

.method public setFb(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/LInfo;->fb:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setMs(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->ms:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setPid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->pid:Ljava/lang/String;

    return-void
.end method

.method public setPk(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->pk:Ljava/lang/String;

    return-void
.end method

.method public setSta(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/LInfo;->sta:J

    return-void
.end method

.method public setSto(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/LInfo;->sto:J

    return-void
.end method

.method public setTp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/LInfo;->tp:I

    return-void
.end method

.method public setTt(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/LInfo;->tt:Ljava/lang/String;

    return-void
.end method

.method public setTy(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/LInfo;->ty:I

    return-void
.end method

.method public setUs(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/LInfo;->us:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "LInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", ty="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/LInfo;->ty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/LInfo;->sta:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sto="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/LInfo;->sto:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", fb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/LInfo;->fb:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pk=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->pk:Ljava/lang/String;

    const-string v3, ", tp="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/LInfo;->tp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tt=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->tt:Ljava/lang/String;

    const-string v3, ", ms=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->ms:Ljava/lang/String;

    const-string v3, ", us="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/LInfo;->us:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->pid:Ljava/lang/String;

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/LInfo;->na:Ljava/lang/String;

    const-string v3, ", cid="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/LInfo;->cid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
