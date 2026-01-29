.class public Lcom/superbock/bean/JInfo;
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

.field private na:Ljava/lang/String;
    .annotation runtime Lv2/d;
    .end annotation
.end field

.field private pk:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private pw:Ljava/lang/String;
    .annotation runtime Lv2/d;
        canBeNull = false
    .end annotation
.end field

.field private pw2:Ljava/lang/String;
    .annotation runtime Lv2/d;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->id:Ljava/lang/String;

    iput-wide p2, p0, Lcom/superbock/bean/JInfo;->ti:J

    iput-object p4, p0, Lcom/superbock/bean/JInfo;->pk:Ljava/lang/String;

    iput p5, p0, Lcom/superbock/bean/JInfo;->ty:I

    iput-object p6, p0, Lcom/superbock/bean/JInfo;->pw:Ljava/lang/String;

    iput-object p7, p0, Lcom/superbock/bean/JInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/superbock/bean/JInfo;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v1, p7

    iput-object v1, v0, Lcom/superbock/bean/JInfo;->pw2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/JInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getNa()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/JInfo;->na:Ljava/lang/String;

    return-object v0
.end method

.method public getPk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/JInfo;->pk:Ljava/lang/String;

    return-object v0
.end method

.method public getPw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/JInfo;->pw:Ljava/lang/String;

    return-object v0
.end method

.method public getPw2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/superbock/bean/JInfo;->pw2:Ljava/lang/String;

    return-object v0
.end method

.method public getTi()J
    .locals 2

    iget-wide v0, p0, Lcom/superbock/bean/JInfo;->ti:J

    return-wide v0
.end method

.method public getTy()I
    .locals 1

    iget v0, p0, Lcom/superbock/bean/JInfo;->ty:I

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->id:Ljava/lang/String;

    return-void
.end method

.method public setNa(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->na:Ljava/lang/String;

    return-void
.end method

.method public setPk(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->pk:Ljava/lang/String;

    return-void
.end method

.method public setPw(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->pw:Ljava/lang/String;

    return-void
.end method

.method public setPw2(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/bean/JInfo;->pw2:Ljava/lang/String;

    return-void
.end method

.method public setTi(J)V
    .locals 0

    iput-wide p1, p0, Lcom/superbock/bean/JInfo;->ti:J

    return-void
.end method

.method public setTy(I)V
    .locals 0

    iput p1, p0, Lcom/superbock/bean/JInfo;->ty:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "JInfo{id=\'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/bean/JInfo;->id:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", ti="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-wide v3, p0, Lcom/superbock/bean/JInfo;->ti:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pk=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/JInfo;->pk:Ljava/lang/String;

    const-string v3, ", ty="

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Lcom/superbock/bean/JInfo;->ty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pw=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/superbock/bean/JInfo;->pw:Ljava/lang/String;

    const-string v3, ", pw2=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/JInfo;->pw2:Ljava/lang/String;

    const-string v3, ", na=\'"

    invoke-static {v0, v1, v2, v3}, Landroidx/appcompat/widget/a;->n(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Lcom/superbock/bean/JInfo;->na:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
