.class public Lcom/superbock/bean/KInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private id:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private js:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pk:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private ti:J
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/superbock/bean/KInfo;->id:Ljava/lang/String;

    iput p2, p0, Lcom/superbock/bean/KInfo;->ty:I

    iput-object p3, p0, Lcom/superbock/bean/KInfo;->js:Ljava/lang/String;

    iput-object p4, p0, Lcom/superbock/bean/KInfo;->pk:Ljava/lang/String;

    iput-object p5, p0, Lcom/superbock/bean/KInfo;->na:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/superbock/bean/KInfo;->ti:J

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/KInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getJs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/KInfo;->js:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/KInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getPk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/KInfo;->pk:Ljava/lang/String;

    return-object v0
.end method

.method public getTi()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/KInfo;->ti:J

    return-wide v0
.end method

.method public getTy()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/KInfo;->ty:I

    return v0
.end method

.method public getUp()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/KInfo;->up:I

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/KInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setJs(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/KInfo;->js:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/KInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setPk(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/KInfo;->pk:Ljava/lang/String;

    return-void
.end method

.method public setTi(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/KInfo;->ti:J

    return-void
.end method

.method public setTy(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/KInfo;->ty:I

    return-void
.end method

.method public setUp(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/KInfo;->up:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "KInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/KInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", ty="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/KInfo;->ty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ti="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/KInfo;->ti:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", js=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/KInfo;->js:Ljava/lang/String;

    const-string v3, ", pk=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/KInfo;->pk:Ljava/lang/String;

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/KInfo;->na:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
