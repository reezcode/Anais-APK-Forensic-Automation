.class public Lcom/superbock/bean/DInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private da:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private du:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private id:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private nu:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDa()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/DInfo;->da:J

    return-wide v0
.end method

.method public getDu()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/DInfo;->du:J

    return-wide v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/DInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/DInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getNu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/DInfo;->nu:Ljava/lang/String;

    return-object v0
.end method

.method public getTy()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/DInfo;->ty:I

    return v0
.end method

.method public getUp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/DInfo;->up:I

    return v0
.end method

.method public setDa(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/DInfo;->da:J

    return-void
.end method

.method public setDu(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/DInfo;->du:J

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/DInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/DInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setNu(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/DInfo;->nu:Ljava/lang/String;

    return-void
.end method

.method public setTy(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/DInfo;->ty:I

    return-void
.end method

.method public setUp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/DInfo;->up:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "DInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/DInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", nu=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/DInfo;->nu:Ljava/lang/String;

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/DInfo;->na:Ljava/lang/String;

    const-string v3, ", da="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-wide v1, p0, Lcom/superbock/bean/DInfo;->da:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", du="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/superbock/bean/DInfo;->du:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ty="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/DInfo;->ty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", up="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/DInfo;->up:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
