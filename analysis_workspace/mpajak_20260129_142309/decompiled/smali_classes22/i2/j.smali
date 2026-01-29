.class public final Li2/j;
.super Ljava/lang/Object;


# instance fields
.field public a:Lk2/m;

.field public b:Li2/v$a;

.field public c:Li2/b$a;

.field public final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Li2/k<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/a0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/a0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Li2/w$a;

.field public n:Li2/w$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lk2/m;->d:Lk2/m;

    iput-object v0, p0, Li2/j;->a:Lk2/m;

    sget-object v0, Li2/v;->b:Li2/v$a;

    iput-object v0, p0, Li2/j;->b:Li2/v$a;

    sget-object v0, Li2/b;->b:Li2/b$a;

    iput-object v0, p0, Li2/j;->c:Li2/b$a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li2/j;->d:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li2/j;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li2/j;->f:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Li2/j;->g:Z

    sget-object v1, Li2/i;->l:Lo2/a;

    const/4 v1, 0x2

    iput v1, p0, Li2/j;->h:I

    iput v1, p0, Li2/j;->i:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Li2/j;->j:Z

    iput-boolean v0, p0, Li2/j;->k:Z

    iput-boolean v1, p0, Li2/j;->l:Z

    sget-object v0, Li2/w;->b:Li2/w$a;

    iput-object v0, p0, Li2/j;->m:Li2/w$a;

    sget-object v0, Li2/w;->c:Li2/w$b;

    iput-object v0, p0, Li2/j;->n:Li2/w$b;

    return-void
.end method


# virtual methods
.method public final a()Li2/i;
    .locals 13

    new-instance v9, Ljava/util/ArrayList;

    iget-object v0, p0, Li2/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Li2/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x3

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Li2/j;->e:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v9}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Li2/j;->f:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget v0, p0, Li2/j;->h:I

    iget v1, p0, Li2/j;->i:I

    sget-boolean v2, Ln2/d;->a:Z

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    if-eq v1, v3, :cond_1

    sget-object v3, Ll2/d$b;->b:Ll2/d$b$a;

    invoke-virtual {v3, v0, v1}, Ll2/d$b;->a(II)Li2/a0;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    sget-object v4, Ln2/d;->c:Ln2/d$b;

    invoke-virtual {v4, v0, v1}, Ll2/d$b;->a(II)Li2/a0;

    move-result-object v4

    sget-object v5, Ln2/d;->b:Ln2/d$a;

    invoke-virtual {v5, v0, v1}, Ll2/d$b;->a(II)Li2/a0;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v2, :cond_1

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v12, Li2/i;

    iget-object v1, p0, Li2/j;->a:Lk2/m;

    iget-object v2, p0, Li2/j;->c:Li2/b$a;

    iget-object v3, p0, Li2/j;->d:Ljava/util/HashMap;

    iget-boolean v4, p0, Li2/j;->g:Z

    iget-boolean v5, p0, Li2/j;->j:Z

    iget-boolean v6, p0, Li2/j;->k:Z

    iget-boolean v7, p0, Li2/j;->l:Z

    iget-object v8, p0, Li2/j;->b:Li2/v$a;

    iget-object v10, p0, Li2/j;->m:Li2/w$a;

    iget-object v11, p0, Li2/j;->n:Li2/w$b;

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Li2/i;-><init>(Lk2/m;Li2/c;Ljava/util/Map;ZZZZLi2/v;Ljava/util/List;Li2/x;Li2/x;)V

    return-object v12
.end method
