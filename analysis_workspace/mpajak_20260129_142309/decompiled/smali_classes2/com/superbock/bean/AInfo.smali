.class public Lcom/superbock/bean/AInfo;
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

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private ni:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pk:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private th:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private ty:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

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

    iget v0, p0, Lcom/superbock/bean/AInfo;->co:I

    return v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getNi()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AInfo;->ni:I

    return v0
.end method

.method public getPk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AInfo;->pk:Ljava/lang/String;

    return-object v0
.end method

.method public getTh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AInfo;->th:Ljava/lang/String;

    return-object v0
.end method

.method public getTy()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AInfo;->ty:I

    return v0
.end method

.method public getUp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AInfo;->up:I

    return v0
.end method

.method public getUp2()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AInfo;->up2:I

    return v0
.end method

.method public setCo(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AInfo;->co:I

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setNi(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AInfo;->ni:I

    return-void
.end method

.method public setPk(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AInfo;->pk:Ljava/lang/String;

    return-void
.end method

.method public setTh(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AInfo;->th:Ljava/lang/String;

    return-void
.end method

.method public setTy(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AInfo;->ty:I

    return-void
.end method

.method public setUp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AInfo;->up:I

    return-void
.end method

.method public setUp2(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AInfo;->up2:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "AInfo{pk=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/AInfo;->pk:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AInfo;->na:Ljava/lang/String;

    const-string v3, ", ty="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AInfo;->ty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", up="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AInfo;->up:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ni="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AInfo;->ni:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", th=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AInfo;->th:Ljava/lang/String;

    const-string v3, ", up2="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AInfo;->up2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", co="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AInfo;->co:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
