.class public Lcom/superbock/ui/custom/InputWordsTrustActivity;
.super Landroid/app/Activity;


# instance fields
.field public b:Lcom/superbock/bean/AdInfo;

.field public c:J

.field public d:Landroid/view/View;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/EditText;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/widget/LinearLayout;

.field public k:Landroid/widget/TextView;

.field public l:Landroid/widget/LinearLayout;

.field public m:Landroid/widget/TextView;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:I

.field public x:Lj3/a4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static a(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V
    .locals 14

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x4

    const/16 v3, 0x8

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_d

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v4, "\\s+"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v5, v1

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    aget-object v5, v1, v5

    const-string v7, "^[a-z]+$"

    invoke-virtual {v5, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    const v9, 0x7f0f008e

    const/4 v10, 0x0

    if-nez v8, :cond_1

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->k:Landroid/widget/TextView;

    new-array v1, v6, [Ljava/lang/Object;

    aput-object v5, v1, v10

    invoke-virtual {p0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :cond_1
    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v8

    invoke-virtual {v8, v5}, Lg3/n;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_10

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_2

    goto/16 :goto_b

    :cond_2
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->m:Landroid/widget/TextView;

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/superbock/bean/MInfo;

    invoke-virtual {v11}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/4 v11, 0x2

    if-lt v5, v11, :cond_3

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->n:Landroid/widget/TextView;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/superbock/bean/MInfo;

    invoke-virtual {v12}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_3
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/4 v12, 0x3

    if-lt v5, v12, :cond_4

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/superbock/bean/MInfo;

    invoke-virtual {v13}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_4
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    if-lt v5, v2, :cond_5

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->p:Landroid/widget/TextView;

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/superbock/bean/MInfo;

    invoke-virtual {v12}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_5
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/4 v12, 0x5

    if-lt v5, v12, :cond_6

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->q:Landroid/widget/TextView;

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/superbock/bean/MInfo;

    invoke-virtual {v13}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_6
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/4 v13, 0x6

    if-lt v5, v13, :cond_7

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->r:Landroid/widget/TextView;

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/superbock/bean/MInfo;

    invoke-virtual {v12}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_7
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/4 v12, 0x7

    if-lt v5, v12, :cond_8

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->s:Landroid/widget/TextView;

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/superbock/bean/MInfo;

    invoke-virtual {v13}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    :cond_8
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    if-lt v5, v3, :cond_9

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->t:Landroid/widget/TextView;

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/superbock/bean/MInfo;

    invoke-virtual {v12}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_6

    :cond_9
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_6
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/16 v12, 0x9

    if-lt v5, v12, :cond_a

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->u:Landroid/widget/TextView;

    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/superbock/bean/MInfo;

    invoke-virtual {v13}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    :cond_a
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_7
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    const/16 v13, 0xa

    if-lt v5, v13, :cond_b

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->v:Landroid/widget/TextView;

    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/superbock/bean/MInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/MInfo;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_b
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_8
    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    array-length v2, v1

    const/4 v5, -0x1

    if-lt v2, v11, :cond_e

    array-length v2, v1

    sub-int/2addr v2, v11

    :goto_9
    if-ltz v2, :cond_e

    aget-object v8, v1, v2

    invoke-virtual {v8, v7}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v11

    invoke-virtual {v11, v8}, Lg3/n;->b(Ljava/lang/String;)I

    move-result v11

    if-ne v11, v5, :cond_c

    goto :goto_a

    :cond_c
    add-int/lit8 v2, v2, -0x1

    goto :goto_9

    :cond_d
    :goto_a
    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->k:Landroid/widget/TextView;

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v8, v7, v10

    invoke-virtual {p0, v9, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const-string v7, " "

    if-nez v2, :cond_f

    invoke-virtual {v0, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v2

    array-length v8, v1

    sub-int/2addr v8, v6

    aget-object v1, v1, v8

    invoke-virtual {v2, v1}, Lg3/n;->b(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v5, :cond_f

    iget-object v1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    iget-object v1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk3/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0f010f

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.wallet.crypto.trustapp"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_d

    :cond_10
    :goto_b
    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->k:Landroid/widget/TextView;

    new-array v1, v6, [Ljava/lang/Object;

    aput-object v5, v1, v10

    invoke-virtual {p0, v9, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_c
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v10}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    :goto_d
    return-void
.end method

.method public static b(Lcom/superbock/ui/custom/InputWordsTrustActivity;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, ""

    :goto_0
    array-length v3, v0

    add-int/lit8 v3, v3, -0x1

    const-string v4, " "

    if-ge v1, v3, :cond_0

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-static {v2, v3, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2, p1, v4}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 3

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getBack()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0c0018

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0f010f

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0f010d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0f0003

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/superbock/ui/custom/InputWordsTrustActivity$b;

    invoke-direct {v2, p0}, Lcom/superbock/ui/custom/InputWordsTrustActivity$b;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0f0001

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/superbock/ui/custom/InputWordsTrustActivity$a;

    invoke-direct {v2}, Lcom/superbock/ui/custom/InputWordsTrustActivity$a;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    :goto_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0047

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "adInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    return-void

    :cond_0
    const-string v0, "com.wallet.crypto.trustapp"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f050013

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    const p1, 0x7f0801bd

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->d:Landroid/view/View;

    const p1, 0x7f0800b4

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->e:Landroid/widget/ImageView;

    const p1, 0x7f0800b6

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->f:Landroid/widget/TextView;

    const p1, 0x7f080109

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    const p1, 0x7f0800b3

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->h:Landroid/widget/TextView;

    const p1, 0x7f0800b8

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->i:Landroid/widget/TextView;

    const p1, 0x7f080222

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->j:Landroid/widget/LinearLayout;

    const p1, 0x7f080223

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->k:Landroid/widget/TextView;

    const p1, 0x7f0801b4

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->l:Landroid/widget/LinearLayout;

    const p1, 0x7f080250

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->m:Landroid/widget/TextView;

    const p1, 0x7f080251

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->n:Landroid/widget/TextView;

    const p1, 0x7f080252

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    const p1, 0x7f080253

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->p:Landroid/widget/TextView;

    const p1, 0x7f080254

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->q:Landroid/widget/TextView;

    const p1, 0x7f080255

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->r:Landroid/widget/TextView;

    const p1, 0x7f080256

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->s:Landroid/widget/TextView;

    const p1, 0x7f080257

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->t:Landroid/widget/TextView;

    const p1, 0x7f080258

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->u:Landroid/widget/TextView;

    const p1, 0x7f080259

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->v:Landroid/widget/TextView;

    new-instance p1, Lj3/a4;

    invoke-direct {p1, p0}, Lj3/a4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->x:Lj3/a4;

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->x:Lj3/a4;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    new-instance v0, Lj3/b4;

    invoke-direct {v0, p0}, Lj3/b4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->g:Landroid/widget/EditText;

    new-instance v0, Lj3/c4;

    invoke-direct {v0, p0}, Lj3/c4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->i:Landroid/widget/TextView;

    new-instance v0, Lj3/d4;

    invoke-direct {v0, p0}, Lj3/d4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->e:Landroid/widget/ImageView;

    new-instance v0, Lj3/e4;

    invoke-direct {v0, p0}, Lj3/e4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->f:Landroid/widget/TextView;

    new-instance v0, Lj3/f4;

    invoke-direct {v0, p0}, Lj3/f4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->h:Landroid/widget/TextView;

    new-instance v0, Lj3/g4;

    invoke-direct {v0, p0}, Lj3/g4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->m:Landroid/widget/TextView;

    new-instance v0, Lj3/h4;

    invoke-direct {v0, p0}, Lj3/h4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->n:Landroid/widget/TextView;

    new-instance v0, Lj3/i4;

    invoke-direct {v0, p0}, Lj3/i4;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    new-instance v0, Lj3/r3;

    invoke-direct {v0, p0}, Lj3/r3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->p:Landroid/widget/TextView;

    new-instance v0, Lj3/s3;

    invoke-direct {v0, p0}, Lj3/s3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->q:Landroid/widget/TextView;

    new-instance v0, Lj3/t3;

    invoke-direct {v0, p0}, Lj3/t3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->r:Landroid/widget/TextView;

    new-instance v0, Lj3/u3;

    invoke-direct {v0, p0}, Lj3/u3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->s:Landroid/widget/TextView;

    new-instance v0, Lj3/v3;

    invoke-direct {v0, p0}, Lj3/v3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->t:Landroid/widget/TextView;

    new-instance v0, Lj3/w3;

    invoke-direct {v0, p0}, Lj3/w3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->u:Landroid/widget/TextView;

    new-instance v0, Lj3/x3;

    invoke-direct {v0, p0}, Lj3/x3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->v:Landroid/widget/TextView;

    new-instance v0, Lj3/y3;

    invoke-direct {v0, p0}, Lj3/y3;-><init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 4

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->x:Lj3/a4;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->x:Lj3/a4;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sput-boolean v1, Lcom/superbock/App;->c:Z

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v3, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v3, v2, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final onPause()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method

.method public final onStart()V
    .locals 5

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-wide v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->c:J

    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2, v0, v1}, Lcom/superbock/bean/AdInfo;->setStartTime(J)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "39"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    iget-object v0, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    const-string v2, "40"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v2, p0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v2, v1, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :goto_0
    return-void
.end method
