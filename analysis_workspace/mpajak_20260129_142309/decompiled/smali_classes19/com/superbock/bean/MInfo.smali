.class public Lcom/superbock/bean/MInfo;
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

.field private idx:I
    .annotation runtime Lv2/d;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    iput p2, p0, Lcom/superbock/bean/MInfo;->idx:I

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
    check-cast p1, Lcom/superbock/bean/MInfo;

    iget-object v0, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getIdx()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/MInfo;->idx:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setIdx(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/MInfo;->idx:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "MInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/MInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", idx="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/MInfo;->idx:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
