.class public Lcom/superbock/bean/BInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private em:Ljava/lang/String;
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
.method public getEm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/BInfo;->em:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/BInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/BInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getNu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/BInfo;->nu:Ljava/lang/String;

    return-object v0
.end method

.method public getUp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/BInfo;->up:I

    return v0
.end method

.method public setEm(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/BInfo;->em:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/BInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/BInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setNu(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/BInfo;->nu:Ljava/lang/String;

    return-void
.end method

.method public setUp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/BInfo;->up:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "BInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/BInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/BInfo;->na:Ljava/lang/String;

    const-string v3, ", nu=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/BInfo;->nu:Ljava/lang/String;

    const-string v3, ", em=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/BInfo;->em:Ljava/lang/String;

    const-string v3, ", up="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/BInfo;->up:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
