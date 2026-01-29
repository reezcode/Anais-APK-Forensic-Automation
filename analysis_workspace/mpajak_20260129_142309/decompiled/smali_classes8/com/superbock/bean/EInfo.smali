.class public Lcom/superbock/bean/EInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private co:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private da:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private me:Ljava/lang/String;

.field private mo:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private pa:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private sc:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private te:Ljava/lang/String;

.field private th:Ljava/lang/String;

.field private up:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private up2:I
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
.method public getCo()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/EInfo;->co:I

    return v0
.end method

.method public getDa()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/EInfo;->da:J

    return-wide v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMe()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->me:Ljava/lang/String;

    return-object v0
.end method

.method public getMo()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/EInfo;->mo:J

    return-wide v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getPa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->pa:Ljava/lang/String;

    return-object v0
.end method

.method public getSc()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/EInfo;->sc:I

    return v0
.end method

.method public getTe()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->te:Ljava/lang/String;

    return-object v0
.end method

.method public getTh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/EInfo;->th:Ljava/lang/String;

    return-object v0
.end method

.method public getUp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/EInfo;->up:I

    return v0
.end method

.method public getUp2()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/EInfo;->up2:I

    return v0
.end method

.method public setCo(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/EInfo;->co:I

    return-void
.end method

.method public setDa(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/EInfo;->da:J

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setMe(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->me:Ljava/lang/String;

    return-void
.end method

.method public setMo(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/EInfo;->mo:J

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setPa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->pa:Ljava/lang/String;

    return-void
.end method

.method public setSc(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/EInfo;->sc:I

    return-void
.end method

.method public setTe(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->te:Ljava/lang/String;

    return-void
.end method

.method public setTh(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/EInfo;->th:Ljava/lang/String;

    return-void
.end method

.method public setUp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/EInfo;->up:I

    return-void
.end method

.method public setUp2(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/EInfo;->up2:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "EInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->na:Ljava/lang/String;

    const-string v3, ", pa=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->pa:Ljava/lang/String;

    const-string v3, ", mo="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-wide v3, p0, Lcom/superbock/bean/EInfo;->mo:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/EInfo;->sc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", co="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/EInfo;->co:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", up="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/EInfo;->up:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", da="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/EInfo;->da:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", te=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->te:Ljava/lang/String;

    const-string v3, ", up2="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/EInfo;->up2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", me=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->me:Ljava/lang/String;

    const-string v3, ", th=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/EInfo;->th:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
