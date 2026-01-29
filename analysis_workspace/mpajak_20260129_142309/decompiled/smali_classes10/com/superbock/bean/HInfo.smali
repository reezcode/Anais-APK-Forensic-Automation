.class public Lcom/superbock/bean/HInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private et:I
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

.field private pa:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pk:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private te:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private ti:J
    .annotation runtime Lv2/d;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/superbock/bean/HInfo;->id:Ljava/lang/String;

    iput p2, p0, Lcom/superbock/bean/HInfo;->et:I

    iput p3, p0, Lcom/superbock/bean/HInfo;->pa:I

    iput-wide p4, p0, Lcom/superbock/bean/HInfo;->ti:J

    iput-object p6, p0, Lcom/superbock/bean/HInfo;->te:Ljava/lang/String;

    iput-object p7, p0, Lcom/superbock/bean/HInfo;->pk:Ljava/lang/String;

    iput-object p8, p0, Lcom/superbock/bean/HInfo;->na:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEt()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/HInfo;->et:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/HInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/HInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getPa()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/HInfo;->pa:I

    return v0
.end method

.method public getPk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/HInfo;->pk:Ljava/lang/String;

    return-object v0
.end method

.method public getTe()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/HInfo;->te:Ljava/lang/String;

    return-object v0
.end method

.method public getTi()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/HInfo;->ti:J

    return-wide v0
.end method

.method public setEt(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/HInfo;->et:I

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/HInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/HInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setPa(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/HInfo;->pa:I

    return-void
.end method

.method public setPk(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/HInfo;->pk:Ljava/lang/String;

    return-void
.end method

.method public setTe(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/HInfo;->te:Ljava/lang/String;

    return-void
.end method

.method public setTi(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/HInfo;->ti:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "HInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/HInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", et="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/HInfo;->et:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pa="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/HInfo;->pa:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ti="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/HInfo;->ti:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", te=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/HInfo;->te:Ljava/lang/String;

    const-string v3, ", pk=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/HInfo;->pk:Ljava/lang/String;

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/HInfo;->na:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
