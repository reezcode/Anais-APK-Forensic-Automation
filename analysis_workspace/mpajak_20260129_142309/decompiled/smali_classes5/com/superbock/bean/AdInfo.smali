.class public Lcom/superbock/bean/AdInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Ld3/a;
.end annotation


# instance fields
.field private aiLink:Lcom/superbock/bean/AdInfo;

.field private aiLinkDelayMillis:J

.field private aiOtherLink:Lcom/superbock/bean/AdInfo;

.field private aiOtherLinkDelayMillis:J

.field private align:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private autoClose:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private back:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private bgColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private cancel:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private cancelBgColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private cancelColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private confirm:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private confirmBgColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private confirmColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private customId:I

.field private endHour:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private feedBack:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private gravity:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private height:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private hide:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private img:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private link:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private msg:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private msgColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private other:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private otherBgColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private otherColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private otherLink:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pkg:Ljava/lang/String;

.field private preId:Ljava/lang/String;

.field private receiptId:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private showClose:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private startHour:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private startTime:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private stopTime:J
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private taskId:Ljava/lang/String;
    .annotation runtime Lv2/d;
        id = true
    .end annotation
.end field

.field private template:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private templateId:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private titleColor:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private topBar:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private type:I
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private url:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private use:I

.field private width:I
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
    check-cast p1, Lcom/superbock/bean/AdInfo;

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    iget-object p1, p1, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getAiLink()Lcom/superbock/bean/AdInfo;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->aiLink:Lcom/superbock/bean/AdInfo;

    return-object v0
.end method

.method public getAiLinkDelayMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/AdInfo;->aiLinkDelayMillis:J

    return-wide v0
.end method

.method public getAiOtherLink()Lcom/superbock/bean/AdInfo;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->aiOtherLink:Lcom/superbock/bean/AdInfo;

    return-object v0
.end method

.method public getAiOtherLinkDelayMillis()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/AdInfo;->aiOtherLinkDelayMillis:J

    return-wide v0
.end method

.method public getAlign()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->align:I

    return v0
.end method

.method public getAutoClose()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->autoClose:I

    return v0
.end method

.method public getBack()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->back:I

    return v0
.end method

.method public getBgColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->bgColor:Ljava/lang/String;

    return-object v0
.end method

.method public getCancel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->cancel:Ljava/lang/String;

    return-object v0
.end method

.method public getCancelBgColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->cancelBgColor:Ljava/lang/String;

    return-object v0
.end method

.method public getCancelColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->cancelColor:Ljava/lang/String;

    return-object v0
.end method

.method public getConfirm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->confirm:Ljava/lang/String;

    return-object v0
.end method

.method public getConfirmBgColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->confirmBgColor:Ljava/lang/String;

    return-object v0
.end method

.method public getConfirmColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->confirmColor:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomId()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->customId:I

    return v0
.end method

.method public getEndHour()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->endHour:I

    return v0
.end method

.method public getFeedBack()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->feedBack:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->gravity:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->height:I

    return v0
.end method

.method public getHide()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->hide:I

    return v0
.end method

.method public getImg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->img:Ljava/lang/String;

    return-object v0
.end method

.method public getLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->link:Ljava/lang/String;

    return-object v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->msgColor:Ljava/lang/String;

    return-object v0
.end method

.method public getOther()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->other:Ljava/lang/String;

    return-object v0
.end method

.method public getOtherBgColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->otherBgColor:Ljava/lang/String;

    return-object v0
.end method

.method public getOtherColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->otherColor:Ljava/lang/String;

    return-object v0
.end method

.method public getOtherLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->otherLink:Ljava/lang/String;

    return-object v0
.end method

.method public getPkg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->pkg:Ljava/lang/String;

    return-object v0
.end method

.method public getPreId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->preId:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->receiptId:Ljava/lang/String;

    return-object v0
.end method

.method public getShowClose()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->showClose:I

    return v0
.end method

.method public getStartHour()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->startHour:I

    return v0
.end method

.method public getStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/AdInfo;->startTime:J

    return-wide v0
.end method

.method public getStopTime()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/AdInfo;->stopTime:J

    return-wide v0
.end method

.method public getTaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    return-object v0
.end method

.method public getTemplate()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->template:I

    return v0
.end method

.method public getTemplateId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->titleColor:Ljava/lang/String;

    return-object v0
.end method

.method public getTopBar()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->topBar:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->type:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getUse()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->use:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/AdInfo;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public setAiLink(Lcom/superbock/bean/AdInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->aiLink:Lcom/superbock/bean/AdInfo;

    return-void
.end method

.method public setAiLinkDelayMillis(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/AdInfo;->aiLinkDelayMillis:J

    return-void
.end method

.method public setAiOtherLink(Lcom/superbock/bean/AdInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->aiOtherLink:Lcom/superbock/bean/AdInfo;

    return-void
.end method

.method public setAiOtherLinkDelayMillis(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/AdInfo;->aiOtherLinkDelayMillis:J

    return-void
.end method

.method public setAlign(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->align:I

    return-void
.end method

.method public setAutoClose(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->autoClose:I

    return-void
.end method

.method public setBack(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->back:I

    return-void
.end method

.method public setBgColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->bgColor:Ljava/lang/String;

    return-void
.end method

.method public setCancel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->cancel:Ljava/lang/String;

    return-void
.end method

.method public setCancelBgColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->cancelBgColor:Ljava/lang/String;

    return-void
.end method

.method public setCancelColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->cancelColor:Ljava/lang/String;

    return-void
.end method

.method public setConfirm(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->confirm:Ljava/lang/String;

    return-void
.end method

.method public setConfirmBgColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->confirmBgColor:Ljava/lang/String;

    return-void
.end method

.method public setConfirmColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->confirmColor:Ljava/lang/String;

    return-void
.end method

.method public setCustomId(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->customId:I

    return-void
.end method

.method public setEndHour(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->endHour:I

    return-void
.end method

.method public setFeedBack(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->feedBack:I

    return-void
.end method

.method public setGravity(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->gravity:I

    return-void
.end method

.method public setHeight(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->height:I

    return-void
.end method

.method public setHide(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->hide:I

    return-void
.end method

.method public setImg(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->img:Ljava/lang/String;

    return-void
.end method

.method public setLink(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->link:Ljava/lang/String;

    return-void
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->msg:Ljava/lang/String;

    return-void
.end method

.method public setMsgColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->msgColor:Ljava/lang/String;

    return-void
.end method

.method public setOther(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->other:Ljava/lang/String;

    return-void
.end method

.method public setOtherBgColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->otherBgColor:Ljava/lang/String;

    return-void
.end method

.method public setOtherColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->otherColor:Ljava/lang/String;

    return-void
.end method

.method public setOtherLink(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->otherLink:Ljava/lang/String;

    return-void
.end method

.method public setPkg(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->pkg:Ljava/lang/String;

    return-void
.end method

.method public setPreId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->preId:Ljava/lang/String;

    return-void
.end method

.method public setReceiptId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->receiptId:Ljava/lang/String;

    return-void
.end method

.method public setShowClose(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->showClose:I

    return-void
.end method

.method public setStartHour(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->startHour:I

    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/AdInfo;->startTime:J

    return-void
.end method

.method public setStopTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/AdInfo;->stopTime:J

    return-void
.end method

.method public setTaskId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    return-void
.end method

.method public setTemplate(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->template:I

    return-void
.end method

.method public setTemplateId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->templateId:Ljava/lang/String;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->title:Ljava/lang/String;

    return-void
.end method

.method public setTitleColor(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->titleColor:Ljava/lang/String;

    return-void
.end method

.method public setTopBar(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->topBar:I

    return-void
.end method

.method public setType(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->type:I

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/AdInfo;->url:Ljava/lang/String;

    return-void
.end method

.method public setUse(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->use:I

    return-void
.end method

.method public setWidth(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/AdInfo;->width:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "AdInfo{taskId=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->taskId:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", templateId=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->templateId:Ljava/lang/String;

    const-string v3, ", hide="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AdInfo;->hide:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->startHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->endHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/AdInfo;->startTime:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", stopTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/superbock/bean/AdInfo;->stopTime:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", feedBack="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->feedBack:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", receiptId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->receiptId:Ljava/lang/String;

    const-string v3, ", url=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->url:Ljava/lang/String;

    const-string v3, ", template="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AdInfo;->template:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", img=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->img:Ljava/lang/String;

    const-string v3, ", title=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->title:Ljava/lang/String;

    const-string v3, ", titleColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->titleColor:Ljava/lang/String;

    const-string v3, ", msg=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->msg:Ljava/lang/String;

    const-string v3, ", msgColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->msgColor:Ljava/lang/String;

    const-string v3, ", link=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->link:Ljava/lang/String;

    const-string v3, ", bgColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->bgColor:Ljava/lang/String;

    const-string v3, ", autoClose="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AdInfo;->autoClose:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", showClose="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->showClose:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gravity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->gravity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", topBar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->topBar:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", back="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->back:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", align="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/superbock/bean/AdInfo;->align:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", confirm=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->confirm:Ljava/lang/String;

    const-string v3, ", confirmColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->confirmColor:Ljava/lang/String;

    const-string v3, ", confirmBgColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->confirmBgColor:Ljava/lang/String;

    const-string v3, ", cancel=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->cancel:Ljava/lang/String;

    const-string v3, ", cancelColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->cancelColor:Ljava/lang/String;

    const-string v3, ", cancelBgColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->cancelBgColor:Ljava/lang/String;

    const-string v3, ", other=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->other:Ljava/lang/String;

    const-string v3, ", otherColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->otherColor:Ljava/lang/String;

    const-string v3, ", otherBgColor=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->otherBgColor:Ljava/lang/String;

    const-string v3, ", otherLink=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->otherLink:Ljava/lang/String;

    const-string v3, ", customId="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AdInfo;->customId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pkg=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->pkg:Ljava/lang/String;

    const-string v3, ", use="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/AdInfo;->use:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", preId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/AdInfo;->preId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
