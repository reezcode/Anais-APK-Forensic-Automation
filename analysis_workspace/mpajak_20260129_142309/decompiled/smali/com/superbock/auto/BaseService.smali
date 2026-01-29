.class public Lcom/superbock/auto/BaseService;
.super Landroid/accessibilityservice/AccessibilityService;


# static fields
.field public static A:Ljava/lang/String;

.field public static B:Z

.field public static C:Ljava/lang/Boolean;

.field public static D:J

.field public static E:J

.field public static F:Z

.field public static G:Z

.field public static final H:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static I:Lf3/e;

.field public static J:Landroid/view/SurfaceView;

.field public static K:Landroid/view/WindowManager$LayoutParams;

.field public static L:Ljava/lang/Boolean;

.field public static M:Ljava/lang/Integer;

.field public static N:Z

.field public static O:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf3/n;",
            ">;"
        }
    .end annotation
.end field

.field public static P:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static Q:Ljava/lang/String;

.field public static R:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static S:Ljava/lang/String;

.field public static T:J

.field public static U:Ljava/lang/String;

.field public static V:Ljava/lang/String;

.field public static W:J

.field public static X:Z

.field public static Y:Ljava/lang/String;

.field public static Z:J

.field public static a0:Ljava/lang/String;

.field public static b0:J

.field public static c0:Ljava/lang/String;

.field public static d0:J

.field public static e0:Ljava/lang/String;

.field public static f0:J

.field public static g0:Ljava/lang/String;

.field public static h0:J

.field public static i0:Ljava/lang/String;

.field public static j0:J

.field public static k0:Ljava/lang/String;

.field public static l0:Z

.field public static m0:Z

.field public static n0:I

.field public static o0:Z

.field public static p0:Z

.field public static q:J

.field public static q0:Z

.field public static r:Lcom/superbock/auto/BaseService;

.field public static r0:Z

.field public static s:Landroid/view/WindowManager;

.field public static t:Landroid/widget/FrameLayout;

.field public static u:Landroid/view/WindowManager$LayoutParams;

.field public static v:Landroid/widget/FrameLayout;

.field public static w:Landroid/view/WindowManager$LayoutParams;

.field public static x:Landroid/widget/FrameLayout;

.field public static y:Landroid/view/WindowManager$LayoutParams;

.field public static z:Z


# instance fields
.field public b:I

.field public c:I

.field public d:Landroid/app/KeyguardManager;

.field public e:Landroid/view/accessibility/AccessibilityNodeInfo;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Landroid/view/accessibility/AccessibilityEvent;

.field public i:I

.field public j:Ljava/lang/String;

.field public k:Landroid/view/accessibility/AccessibilityNodeInfo;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    sput-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    sput-object v0, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    const-string v0, ""

    sput-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    sput-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->V:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->i0:Ljava/lang/String;

    sput-object v0, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService;-><init>()V

    return-void
.end method

.method public static g()Lcom/superbock/auto/BaseService;
    .locals 2

    sget-object v0, Lcom/superbock/auto/BaseService;->r:Lcom/superbock/auto/BaseService;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lf3/f;

    const-string v1, "1"

    invoke-direct {v0, v1}, Lf3/f;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static l()Z
    .locals 5

    sget-object v0, Lcom/superbock/auto/BaseService;->r:Lcom/superbock/auto/BaseService;

    if-eqz v0, :cond_0

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final A()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "1"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "2"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "3"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "4"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "5"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "6"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "7"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "8"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "9"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "10"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "11"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "12"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sput-object v0, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v0, Lcom/superbock/auto/BaseService;->f0:J

    :cond_0
    return-void
.end method

.method public final B()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "1"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "2"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "3"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "4"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "5"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "6"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "7"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "8"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "9"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "10"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "11"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "12"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "1."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "2."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "3."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "4."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "5."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "6."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "7."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "8."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "9."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "10."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "11."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "12."

    invoke-static {v0, v1}, Li/g;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    sput-object v0, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v0, Lcom/superbock/auto/BaseService;->d0:J

    :cond_2
    return-void
.end method

.method public final a()V
    .locals 20
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v1, p0

    sget-boolean v0, Lcom/superbock/auto/BaseService;->F:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-wide v2, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    const/4 v6, 0x2

    cmp-long v7, v2, v4

    if-lez v7, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v7, Lcom/superbock/auto/BaseService;->E:J

    sub-long/2addr v2, v7

    const-wide/16 v7, 0x3a98

    cmp-long v9, v2, v7

    if-lez v9, :cond_2

    invoke-virtual {v1, v6}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    sput-boolean v0, Lcom/superbock/auto/BaseService;->F:Z

    sput-boolean v0, Lcom/superbock/auto/BaseService;->G:Z

    sget-boolean v2, Lcom/superbock/auto/BaseService;->z:Z

    if-eqz v2, :cond_1

    sput-boolean v0, Lcom/superbock/auto/BaseService;->z:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->s()V

    :cond_1
    return-void

    :cond_2
    sget v2, Lcom/superbock/ui/StartupActivity;->i:I

    const/16 v3, 0x8

    const/4 v7, 0x6

    const-wide/16 v8, 0x1388

    const-wide/16 v10, 0x3e8

    const/4 v12, 0x5

    const/4 v13, 0x4

    const/4 v14, 0x3

    const/4 v15, 0x1

    if-eq v2, v14, :cond_37

    if-ne v2, v13, :cond_3

    goto/16 :goto_12

    :cond_3
    const-wide/16 v16, 0xc8

    const-wide/16 v18, 0x1f4

    if-ne v2, v12, :cond_14

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v10, "com.android.settings:id/apps_list"

    invoke-static {v2, v10}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v10, "android:id/list"

    invoke-static {v2, v10}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_4
    sget-boolean v10, Lcom/superbock/auto/BaseService;->p0:Z

    if-eqz v10, :cond_5

    if-eqz v2, :cond_46

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sget-wide v13, Lcom/superbock/auto/BaseService;->E:J

    sub-long/2addr v10, v13

    const-wide/16 v13, 0xbb8

    cmp-long v0, v10, v13

    if-lez v0, :cond_46

    :catch_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sput-wide v10, Lcom/superbock/auto/BaseService;->E:J

    :catch_1
    :goto_1
    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_15

    :cond_5
    iget-object v10, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "android:id/switch_widget"

    invoke-static {v10, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v10

    if-nez v10, :cond_6

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "com.android.settings:id/switchWidget"

    invoke-static {v10, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v10

    :cond_6
    if-nez v10, :cond_7

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "android:id/checkbox"

    invoke-static {v10, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v10

    :cond_7
    if-eqz v2, :cond_c

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_3

    :cond_8
    if-nez v10, :cond_9

    sput-boolean v15, Lcom/superbock/auto/BaseService;->o0:Z

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sput-wide v10, Lcom/superbock/auto/BaseService;->E:J

    :try_start_0
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_15

    :catch_2
    nop

    goto/16 :goto_15

    :cond_9
    sput-boolean v15, Lcom/superbock/auto/BaseService;->p0:Z

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v15, :cond_a

    goto :goto_2

    :cond_a
    move-object v10, v0

    :goto_2
    invoke-virtual {v1, v10}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :try_start_1
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_b
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->x()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sput-wide v10, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_15

    :cond_c
    if-eqz v10, :cond_d

    if-nez v2, :cond_d

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v15, :cond_d

    sput-boolean v15, Lcom/superbock/auto/BaseService;->p0:Z

    :try_start_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    :catch_3
    invoke-virtual {v1, v10}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :try_start_3
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_4

    :catch_4
    nop

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    sget-boolean v0, Lcom/superbock/auto/BaseService;->o0:Z

    if-eqz v0, :cond_46

    :try_start_4
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_1

    :cond_d
    sget v4, Le3/d;->a:I

    if-ne v4, v6, :cond_e

    sget-boolean v5, Lcom/superbock/auto/BaseService;->o0:Z

    if-eqz v5, :cond_e

    sget-boolean v5, Lcom/superbock/auto/BaseService;->p0:Z

    if-nez v5, :cond_e

    if-nez v10, :cond_e

    if-nez v2, :cond_e

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.settings:id/action_bar_title_expand"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_46

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "android:id/title"

    invoke-static {v4, v5}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    if-eqz v4, :cond_46

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v2, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->p0:Z

    const-wide/16 v10, 0x12c

    :try_start_5
    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    iget v4, v5, Landroid/graphics/Rect;->bottom:I

    iget v5, v1, Lcom/superbock/auto/BaseService;->b:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v0

    div-int/2addr v5, v6

    add-int/2addr v5, v0

    int-to-float v0, v5

    sub-int/2addr v2, v4

    div-int/2addr v2, v6

    add-int/2addr v2, v4

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2}, Lcom/superbock/auto/BaseService;->m(FF)V

    :try_start_6
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_1

    :cond_e
    if-ne v4, v13, :cond_12

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.vivo.permissionmanager:id/section_list_view"

    invoke-static {v0, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_7

    :cond_f
    invoke-static {v0, v15}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z

    move-result v2

    if-eqz v2, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    :goto_6
    :try_start_7
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_2

    goto/16 :goto_15

    :cond_10
    sput-boolean v15, Lcom/superbock/auto/BaseService;->p0:Z

    goto :goto_5

    :cond_11
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->x()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_15

    :cond_12
    if-ne v4, v14, :cond_46

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.coloros.safecenter:id/recycler_view"

    invoke-static {v0, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_46

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_7

    :cond_13
    invoke-static {v0, v15}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z

    move-result v2

    if-eqz v2, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto :goto_6

    :cond_14
    if-ne v2, v7, :cond_15

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->b()V

    goto/16 :goto_15

    :cond_15
    const/4 v4, 0x7

    if-ne v2, v4, :cond_31

    monitor-enter p0

    :try_start_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v16, Lcom/superbock/auto/BaseService;->E:J

    sub-long v4, v4, v16

    cmp-long v2, v4, v8

    if-lez v2, :cond_17

    sget-boolean v0, Lcom/superbock/ui/StartupActivity;->g:Z

    :catch_7
    :goto_8
    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catch_8
    :cond_16
    :goto_9
    monitor-exit p0

    goto/16 :goto_15

    :cond_17
    :try_start_9
    sget v2, Le3/d;->a:I

    const/16 v4, 0x1e

    if-ne v2, v15, :cond_1d

    sget-boolean v0, Lcom/superbock/auto/BaseService;->l0:Z

    if-nez v0, :cond_16

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->right:I

    iget v5, v1, Lcom/superbock/auto/BaseService;->b:I

    if-ne v0, v5, :cond_18

    iget v0, v2, Landroid/graphics/Rect;->left:I

    :cond_18
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int v2, v5, v2

    if-gtz v2, :cond_19

    goto :goto_a

    :cond_19
    move v4, v2

    :goto_a
    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v5

    iget v2, v1, Lcom/superbock/auto/BaseService;->c:I

    if-lt v4, v2, :cond_1a

    add-int/lit8 v4, v2, -0x32

    :cond_1a
    add-int/lit16 v5, v4, 0x1f4

    if-le v5, v2, :cond_1b

    add-int/lit8 v5, v2, -0xa

    :cond_1b
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v10, ":id/lock_task"

    invoke-static {v2, v10, v15}, Li/g;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_1c

    sput-boolean v15, Lcom/superbock/auto/BaseService;->l0:Z

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v5, "lockTask"

    invoke-virtual {v2, v5, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-boolean v2, Lcom/superbock/ui/StartupActivity;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sput-wide v10, Lcom/superbock/auto/BaseService;->E:J

    int-to-float v0, v0

    int-to-float v2, v4

    invoke-virtual {v1, v0, v2}, Lcom/superbock/auto/BaseService;->m(FF)V

    goto :goto_9

    :cond_1c
    sget v2, Lcom/superbock/auto/BaseService;->n0:I

    if-ge v2, v12, :cond_16

    int-to-float v0, v0

    int-to-float v2, v4

    int-to-float v4, v5

    invoke-virtual {v1, v0, v2, v0, v4}, Lcom/superbock/auto/BaseService;->q(FFFF)V

    sget v0, Lcom/superbock/auto/BaseService;->n0:I

    add-int/2addr v0, v15

    sput v0, Lcom/superbock/auto/BaseService;->n0:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    :goto_b
    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_f

    :cond_1d
    if-ne v2, v13, :cond_22

    sget-boolean v0, Lcom/superbock/auto/BaseService;->l0:Z

    if-nez v0, :cond_16

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->right:I

    iget v5, v1, Lcom/superbock/auto/BaseService;->b:I

    if-ne v0, v5, :cond_1e

    iget v0, v2, Landroid/graphics/Rect;->left:I

    :cond_1e
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int v2, v5, v2

    if-gtz v2, :cond_1f

    goto :goto_c

    :cond_1f
    move v4, v2

    :goto_c
    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v5

    iget v2, v1, Lcom/superbock/auto/BaseService;->c:I

    if-lt v4, v2, :cond_20

    add-int/lit8 v4, v2, -0x32

    :cond_20
    add-int/lit16 v5, v4, 0x1f4

    if-le v5, v2, :cond_21

    add-int/lit8 v5, v2, -0xa

    :cond_21
    int-to-float v0, v0

    int-to-float v2, v4

    int-to-float v4, v5

    invoke-virtual {v1, v0, v2, v0, v4}, Lcom/superbock/auto/BaseService;->q(FFFF)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->l0:Z

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "lockTask"

    invoke-virtual {v4, v5, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-boolean v4, Lcom/superbock/ui/StartupActivity;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :catch_9
    :try_start_b
    invoke-virtual {v1, v0, v2}, Lcom/superbock/auto/BaseService;->m(FF)V

    goto/16 :goto_9

    :cond_22
    if-ne v2, v6, :cond_2a

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v5, "lockTask"

    invoke-virtual {v2, v5, v0}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v15, :cond_23

    goto/16 :goto_9

    :cond_23
    sget-boolean v2, Lcom/superbock/auto/BaseService;->l0:Z

    if-nez v2, :cond_28

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v5, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v2, v5, v15}, Li/g;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_16

    sput-boolean v15, Lcom/superbock/auto/BaseService;->l0:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_c
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_a
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_a
    :try_start_d
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v5, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v2, v5, v15}, Li/g;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_27

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    iget v2, v0, Landroid/graphics/Rect;->right:I

    iget v5, v1, Lcom/superbock/auto/BaseService;->b:I

    if-ne v2, v5, :cond_24

    iget v2, v0, Landroid/graphics/Rect;->left:I

    :cond_24
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    sub-int v0, v5, v0

    if-gtz v0, :cond_25

    goto :goto_d

    :cond_25
    move v4, v0

    :goto_d
    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v5

    iget v0, v1, Lcom/superbock/auto/BaseService;->c:I

    if-lt v4, v0, :cond_26

    add-int/lit8 v4, v0, -0x32

    :cond_26
    int-to-float v0, v2

    int-to-float v2, v4

    invoke-virtual {v1, v0, v2, v10, v11}, Lcom/superbock/auto/BaseService;->p(FFJ)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_9

    :cond_27
    sput-boolean v0, Lcom/superbock/auto/BaseService;->l0:Z

    goto/16 :goto_9

    :cond_28
    sget-boolean v2, Lcom/superbock/auto/BaseService;->m0:Z

    if-nez v2, :cond_16

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.miui.home:id/menu_item_lock"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_16

    sput-boolean v15, Lcom/superbock/auto/BaseService;->m0:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :try_start_e
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_b
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :catch_b
    :try_start_f
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.miui.home:id/menu_item_lock"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_29

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "lockTask"

    invoke-virtual {v4, v5, v0}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v15, :cond_16

    invoke-virtual {v1, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "lockTask"

    invoke-virtual {v0, v2, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-boolean v0, Lcom/superbock/ui/StartupActivity;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_8

    :cond_29
    sput-boolean v0, Lcom/superbock/auto/BaseService;->m0:Z

    goto/16 :goto_9

    :cond_2a
    const/16 v0, 0x9

    if-ne v2, v0, :cond_2f

    sget-boolean v0, Lcom/superbock/auto/BaseService;->l0:Z

    if-nez v0, :cond_2e

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    iget v0, v2, Landroid/graphics/Rect;->right:I

    iget v4, v1, Lcom/superbock/auto/BaseService;->b:I

    if-ne v0, v4, :cond_2b

    iget v0, v2, Landroid/graphics/Rect;->left:I

    :cond_2b
    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int v2, v4, v2

    if-gtz v2, :cond_2c

    const/16 v2, 0x32

    :cond_2c
    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v4

    iget v4, v1, Lcom/superbock/auto/BaseService;->c:I

    if-lt v2, v4, :cond_2d

    add-int/lit8 v2, v4, -0x32

    :cond_2d
    int-to-float v0, v0

    int-to-float v2, v2

    invoke-virtual {v1, v0, v2, v10, v11}, Lcom/superbock/auto/BaseService;->p(FFJ)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->l0:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    goto/16 :goto_b

    :cond_2e
    sget-boolean v0, Lcom/superbock/auto/BaseService;->m0:Z

    if-nez v0, :cond_16

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "net.oneplus.launcher:id/text"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->m0:Z

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "lockTask"

    invoke-virtual {v0, v2, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-boolean v0, Lcom/superbock/ui/StartupActivity;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :goto_e
    :try_start_10
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_10
    .catch Ljava/lang/InterruptedException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto/16 :goto_8

    :cond_2f
    if-ne v2, v14, :cond_16

    :try_start_11
    sget-boolean v0, Lcom/superbock/auto/BaseService;->l0:Z

    if-nez v0, :cond_30

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v2, v15}, Li/g;->j(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    const-string v2, "menu_button"

    invoke-static {v0, v2, v15}, Li/g;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->l0:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    goto/16 :goto_b

    :goto_f
    :try_start_12
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_12
    .catch Ljava/lang/InterruptedException; {:try_start_12 .. :try_end_12} :catch_8
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    goto/16 :goto_9

    :cond_30
    :try_start_13
    sget-boolean v0, Lcom/superbock/auto/BaseService;->m0:Z

    if-nez v0, :cond_16

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "launcher:id/text"

    invoke-static {v0, v2, v15}, Li/g;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sput-boolean v15, Lcom/superbock/auto/BaseService;->m0:Z

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "lockTask"

    invoke-virtual {v0, v2, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-boolean v0, Lcom/superbock/ui/StartupActivity;->g:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    goto :goto_e

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_31
    if-ne v2, v3, :cond_46

    sget-boolean v0, Lcom/superbock/auto/BaseService;->q0:Z

    if-nez v0, :cond_35

    const/4 v0, 0x0

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.settings:id/entity_header_title"

    invoke-static {v2, v4}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v2

    const-string v4, "com.android.settings:id/left_button"

    if-eqz v2, :cond_32

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.android.settings:id/button2"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-nez v0, :cond_34

    goto :goto_10

    :cond_32
    sget v2, Le3/d;->a:I

    if-ne v2, v15, :cond_33

    :goto_10
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    goto :goto_11

    :cond_33
    if-ne v2, v14, :cond_34

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.android.settings:id/right_button"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :cond_34
    :goto_11
    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v2

    if-eqz v2, :cond_36

    sput-boolean v15, Lcom/superbock/auto/BaseService;->q0:Z

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    :try_start_14
    invoke-static/range {v16 .. v17}, Ljava/lang/Thread;->sleep(J)V
    :try_end_14
    .catch Ljava/lang/InterruptedException; {:try_start_14 .. :try_end_14} :catch_2

    goto/16 :goto_15

    :cond_35
    sget-boolean v0, Lcom/superbock/auto/BaseService;->r0:Z

    if-nez v0, :cond_46

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "android:id/message"

    invoke-static {v0, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_46

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "android:id/button1"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_46

    sput-boolean v15, Lcom/superbock/auto/BaseService;->r0:Z

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    :try_start_15
    invoke-static/range {v18 .. v19}, Ljava/lang/Thread;->sleep(J)V
    :try_end_15
    .catch Ljava/lang/InterruptedException; {:try_start_15 .. :try_end_15} :catch_c

    :catch_c
    :cond_36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_15

    :cond_37
    :goto_12
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.permissioncontroller:id/permission_allow_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_38

    sget v4, Le3/d;->a:I

    if-ne v4, v6, :cond_38

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.lbe.security.miui:id/permission_allow_button_1"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_38
    if-nez v2, :cond_39

    sget v4, Le3/d;->a:I

    if-ne v4, v6, :cond_39

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.lbe.security.miui:id/permission_allow_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_39
    if-nez v2, :cond_3a

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.packageinstaller:id/permission_allow_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_3a
    if-nez v2, :cond_3b

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.permissioncontroller:id/permission_allow_foreground_only_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_3b
    if-nez v2, :cond_3c

    sget v4, Le3/d;->a:I

    if-ne v4, v6, :cond_3c

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.lbe.security.miui:id/permission_allow_foreground_only_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_3c
    if-nez v2, :cond_3d

    sget v4, Le3/d;->a:I

    if-ne v4, v6, :cond_3d

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "com.lbe.security.miui:id/permission_group_title"

    invoke-static {v4, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3d

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v4

    sub-int/2addr v4, v15

    invoke-virtual {v2, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_3d
    if-nez v2, :cond_3e

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.packageinstaller:id/permission_allow_foreground_only_button"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_3e
    if-nez v2, :cond_41

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "android:id/button2"

    invoke-static {v4, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_41

    sget v2, Le3/d;->a:I

    if-ne v2, v15, :cond_40

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.huawei.systemmanager:id/virus_checkbox"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_40

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v4

    if-nez v4, :cond_3f

    invoke-virtual {v1, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :cond_3f
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v5}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    goto :goto_13

    :cond_40
    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "android:id/button1"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_41
    :goto_13
    if-nez v2, :cond_42

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "com.android.settings:id/btn_negative"

    invoke-static {v4, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_42

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.settings:id/btn_positive"

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_42
    if-eqz v2, :cond_43

    goto :goto_14

    :cond_43
    sget v2, Le3/d;->a:I

    if-ne v2, v6, :cond_46

    sget v2, Lcom/superbock/ui/StartupActivity;->i:I

    if-ne v2, v14, :cond_45

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, ":id/up"

    invoke-static {v2, v4, v15}, Li/g;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_46

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "android:id/summary"

    invoke-static {v4, v5}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    if-eqz v4, :cond_46

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-static {v5, v4}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    if-eqz v4, :cond_44

    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v5

    if-nez v5, :cond_44

    invoke-virtual {v1, v4}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :try_start_16
    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_16
    .catch Ljava/lang/InterruptedException; {:try_start_16 .. :try_end_16} :catch_d

    goto :goto_14

    :cond_44
    if-eqz v4, :cond_46

    invoke-virtual {v4, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_46

    goto :goto_14

    :cond_45
    if-ne v2, v13, :cond_46

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.lbe.security.miui:id/alertTitle"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-static {v2, v0}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v2

    if-lez v2, :cond_46

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v2

    sub-int/2addr v2, v15

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :catch_d
    :goto_14
    invoke-virtual {v1, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    :cond_46
    :goto_15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v10, Lcom/superbock/auto/BaseService;->E:J

    sub-long/2addr v4, v10

    cmp-long v0, v4, v8

    if-lez v0, :cond_4b

    sget v0, Lcom/superbock/ui/StartupActivity;->i:I

    if-eq v0, v12, :cond_47

    if-eq v0, v7, :cond_47

    if-ne v0, v3, :cond_4b

    :cond_47
    if-ne v0, v12, :cond_48

    sput-boolean v15, Lcom/superbock/auto/BaseService;->p0:Z

    :cond_48
    iget-wide v2, v1, Lcom/superbock/auto/BaseService;->p:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_49

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v1, Lcom/superbock/auto/BaseService;->p:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7d0

    cmp-long v0, v2, v4

    if-lez v0, :cond_4b

    :cond_49
    sget v0, Le3/d;->a:I

    if-ne v0, v6, :cond_4a

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, ":id/up"

    invoke-static {v0, v2, v15}, Li/g;->q(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_4a

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_16

    :cond_4a
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v2, 0x15

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0xd

    int-to-float v2, v2

    const v3, 0x3a83126f    # 0.001f

    mul-float v2, v2, v3

    const/16 v4, 0x1f

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x24

    int-to-float v0, v0

    mul-float v0, v0, v3

    const v3, 0x3df5c28f    # 0.12f

    add-float/2addr v3, v2

    const v4, 0x3d75c28f    # 0.06f

    add-float/2addr v4, v0

    iget v5, v1, Lcom/superbock/auto/BaseService;->b:I

    int-to-float v5, v5

    mul-float v2, v2, v5

    float-to-int v2, v2

    iget v7, v1, Lcom/superbock/auto/BaseService;->c:I

    int-to-float v7, v7

    mul-float v0, v0, v7

    float-to-int v0, v0

    mul-float v3, v3, v5

    float-to-int v3, v3

    mul-float v4, v4, v7

    float-to-int v4, v4

    sub-int/2addr v3, v2

    div-int/2addr v3, v6

    add-int/2addr v3, v2

    int-to-float v2, v3

    sub-int/2addr v4, v0

    div-int/2addr v4, v6

    add-int/2addr v4, v0

    int-to-float v0, v4

    invoke-virtual {v1, v2, v0}, Lcom/superbock/auto/BaseService;->m(FF)V

    :goto_16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/superbock/auto/BaseService;->p:J

    :cond_4b
    return-void
.end method

.method public final b()V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v0, p0

    sget-boolean v1, Lcom/superbock/auto/BaseService;->G:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget v1, Le3/d;->a:I

    const-string v2, "3"

    const-string v3, "android:id/button1"

    const-string v4, "2"

    const-string v5, "1"

    const-wide/16 v6, 0x12c

    const-string v8, "4"

    const/4 v9, 0x2

    const-wide/16 v11, 0x2bc

    const/4 v13, 0x1

    if-ne v1, v13, :cond_d

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v14, "com.huawei.systemmanager:id/entry_view_layout4"

    invoke-static {v1, v14}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v14, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v14, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :try_start_0
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    sput-wide v11, Lcom/superbock/auto/BaseService;->E:J

    :cond_1
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "android:id/search_src_text"

    invoke-static {v1, v5}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v5, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "android:id/search_close_btn"

    invoke-static {v5, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    if-nez v5, :cond_4

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto/16 :goto_2

    :cond_2
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_3
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v4, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    const-string v5, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {v2, v5, v4}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const/high16 v4, 0x200000

    invoke-virtual {v1, v4, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    goto/16 :goto_2

    :cond_4
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v5, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByText(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v5, v9}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_1

    :cond_6
    const/4 v4, 0x2

    goto :goto_0

    :cond_7
    :goto_1
    if-ne v4, v13, :cond_9

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v9}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v0, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    goto :goto_3

    :cond_9
    if-ne v4, v9, :cond_a

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->e()V

    :cond_a
    :goto_3
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_46

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "android:id/select_dialog_listview"

    invoke-static {v2, v3}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_46

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "com.huawei.systemmanager:id/switcher"

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_46

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_46

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v0, v3}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lcom/superbock/auto/BaseService;->E:J

    :try_start_1
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v13, 0x0

    goto :goto_4

    :cond_c
    if-eqz v13, :cond_46

    goto/16 :goto_20

    :cond_d
    const-wide/16 v14, 0x1f4

    const/4 v10, 0x5

    if-ne v1, v9, :cond_1b

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_f

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "com.miui.securitycenter:id/message"

    invoke-static {v2, v3}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "miui:id/message"

    invoke-static {v2, v3}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    :cond_e
    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    :cond_f
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.miui.securitycenter:id/sliding_button"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    const-string v3, "com.miui.securitycenter:id/up"

    const-string v4, "miui:id/up"

    if-eqz v1, :cond_15

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v5, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v1, v5, v13}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-nez v1, :cond_11

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v10, :cond_10

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->x()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    :cond_10
    return-void

    :cond_11
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    invoke-static {v5, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    :cond_12
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-nez v1, :cond_13

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    :cond_13
    :try_start_2
    invoke-static {v14, v15}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    nop

    :goto_5
    if-eqz v1, :cond_14

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_6

    :cond_14
    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->e()V

    return-void

    :cond_15
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.miui.securitycenter:id/app_manager_details_applabel"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.miui.securitycenter:id/am_switch"

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_17

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_16
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v0, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sput-wide v5, Lcom/superbock/auto/BaseService;->E:J

    goto :goto_7

    :cond_17
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_18

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    :cond_18
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-nez v1, :cond_19

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    :cond_19
    :try_start_3
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_8

    :catch_3
    nop

    :goto_8
    if-eqz v1, :cond_1a

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_9

    :cond_1a
    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    goto/16 :goto_1f

    :cond_1b
    const-string v11, "com.android.settings:id/button1_negative"

    const-string v12, "com.android.settings:id/button1"

    const-string v6, "android:id/switch_widget"

    const-string v7, "com.android.settings:id/left_button"

    const-string v13, "com.android.settings:id/entity_header_title"

    const-string v9, "android:id/title"

    const-string v14, "android:id/message"

    const-string v15, "com.android.settings:id/button2_negative"

    const-string v10, "com.android.settings:id/button2"

    move-object/from16 v16, v8

    const-string v8, "com.android.settings:id/app_name"

    move-object/from16 v17, v2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_26

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1d

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1d

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x1f4

    :try_start_4
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_a

    :catch_4
    nop

    :cond_1c
    :goto_a
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_46

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    goto/16 :goto_1a

    :cond_1d
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "oppo:id/color_tail_mark"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    :goto_b
    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-static {v2, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x1f4

    :try_start_5
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_6

    goto/16 :goto_1f

    :cond_1e
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.coloros.oppoguardelf:id/color_tail_mark"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_b

    :cond_1f
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v13}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v12}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v10}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-lt v2, v3, :cond_46

    goto :goto_c

    :cond_20
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v13}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v11}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v15}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-le v2, v3, :cond_21

    :goto_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    :goto_d
    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    :goto_e
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_15

    :cond_21
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-gt v2, v3, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    goto :goto_d

    :cond_22
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v14}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_23

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_23

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "android:id/button2"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_23

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    goto/16 :goto_1a

    :cond_23
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    :goto_f
    if-ltz v2, :cond_44

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_24

    if-gt v2, v3, :cond_24

    goto/16 :goto_1f

    :cond_24
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v4

    if-nez v4, :cond_25

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-static {v4, v3}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v3, 0x1f4

    :try_start_6
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    :cond_25
    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x1

    goto :goto_f

    :cond_26
    const/4 v2, 0x4

    if-ne v1, v2, :cond_3c

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v13}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const-string v2, "com.android.permissioncontroller:id/collapsing_toolbar"

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "com.android.settings:id/right_button"

    invoke-static {v1, v3}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_28

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    const/4 v10, 0x0

    :goto_10
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v10, v2, :cond_46

    sget-object v2, Le3/d;->c:Ljava/util/HashSet;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    :goto_11
    move v4, v10

    goto/16 :goto_14

    :cond_27
    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_28
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v12}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v10}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2a

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    const/4 v10, 0x0

    :goto_12
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v10, v2, :cond_46

    sget-object v2, Le3/d;->c:Ljava/util/HashSet;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_11

    :cond_29
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    :cond_2a
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v11}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v15}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2c

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    const/4 v10, 0x0

    :goto_13
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v10, v2, :cond_46

    sget-object v2, Le3/d;->c:Ljava/util/HashSet;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    goto/16 :goto_11

    :goto_14
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    goto/16 :goto_e

    :goto_15
    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    goto/16 :goto_1a

    :cond_2b
    add-int/lit8 v10, v10, 0x1

    goto :goto_13

    :cond_2c
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v2

    if-lez v2, :cond_46

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_19

    :cond_2d
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.vivo.permissionmanager:id/list_view"

    invoke-static {v1, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_30

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_2f

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_2e

    goto :goto_17

    :cond_2e
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-static {v2, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const-string v2, "com.vivo.permissionmanager:id/move_btn"

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_44

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x12c

    :goto_16
    :try_start_7
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_6

    goto/16 :goto_1f

    :cond_2f
    :goto_17
    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->x()V

    goto/16 :goto_21

    :cond_30
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "com.android.permissioncontroller:id/name"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_33

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_31

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_32

    :cond_31
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.android.permissioncontroller:id/title"

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    :cond_32
    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_37

    goto :goto_18

    :cond_33
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "com.android.packageinstaller:id/name"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    const/4 v6, -0x1

    if-eqz v1, :cond_35

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v5}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-static {v1, v6}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_34

    goto :goto_1a

    :cond_34
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z

    move-result v2

    if-nez v2, :cond_37

    :goto_18
    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->x()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    return-void

    :cond_35
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v5, "com.android.permissioncontroller:id/entity_header_title"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v3, "com.android.permissioncontroller:id/recycler_view"

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_36

    iget-object v3, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v3, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_36

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v6}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    goto :goto_1a

    :cond_36
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v2

    if-lez v2, :cond_46

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_19
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    :cond_37
    :goto_1a
    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x1f4

    :try_start_8
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_7

    goto/16 :goto_22

    :cond_38
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.vivo.permissionmanager:id/move_btn1"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_39

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    move-object/from16 v4, v17

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_44

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    :goto_1b
    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x2bc

    goto/16 :goto_16

    :cond_39
    move-object/from16 v4, v17

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.vivo.permissionmanager:id/subtitle"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3a

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_46

    const/4 v2, 0x1

    invoke-static {v1, v2}, Li/g;->t(Landroid/view/accessibility/AccessibilityNodeInfo;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z

    move-result v2

    if-eqz v2, :cond_46

    sget-object v2, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v1, 0x2bc

    :try_start_9
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_9
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_7

    goto/16 :goto_22

    :cond_3a
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.vivo.permissionmanager:id/loading"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3b

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_22

    :cond_3b
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v14}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "android:id/buttonPanel"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto/16 :goto_22

    :cond_3c
    const/16 v2, 0x9

    if-ne v1, v2, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v13}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const-string v2, "android:id/checkbox"

    if-eqz v1, :cond_40

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3d

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    :goto_1c
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-static {v2, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    goto/16 :goto_1b

    :cond_3d
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v11}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x4

    if-lt v2, v3, :cond_46

    const/4 v2, 0x3

    goto :goto_1e

    :cond_3e
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v12}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-gt v2, v3, :cond_3f

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v2

    :goto_1d
    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v3, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    goto/16 :goto_20

    :cond_3f
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-le v2, v3, :cond_46

    const/4 v2, 0x4

    :goto_1e
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1d

    :cond_40
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v10, "com.android.settings:id/widget_text1"

    invoke-static {v1, v10}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_41

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_41

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_41

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x5

    if-lt v10, v11, :cond_41

    const/4 v10, 0x4

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v11

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v11, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sput-wide v10, Lcom/superbock/auto/BaseService;->E:J

    :cond_41
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_42

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_42

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_42

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x3

    if-lt v5, v7, :cond_42

    const/4 v5, 0x2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v7

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v7, v1}, Li/g;->r(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sput-wide v7, Lcom/superbock/auto/BaseService;->E:J

    :cond_42
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_43

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    goto/16 :goto_1c

    :cond_43
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_45

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_46

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_44

    goto/16 :goto_1c

    :catch_6
    :cond_44
    :goto_1f
    invoke-virtual/range {p0 .. p0}, Lcom/superbock/auto/BaseService;->e()V

    goto :goto_22

    :cond_45
    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.oplus.battery:id/alertTitle"

    invoke-static {v1, v2}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_46

    iget-object v1, v0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v1, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    :goto_20
    invoke-virtual {v0, v1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :goto_21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sput-wide v1, Lcom/superbock/auto/BaseService;->E:J

    :catch_7
    :cond_46
    :goto_22
    return-void
.end method

.method public final c()V
    .locals 14
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    sget-boolean v0, Lcom/superbock/auto/BaseService;->F:Z

    if-nez v0, :cond_35

    sget-wide v0, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v4, Lcom/superbock/auto/BaseService;->E:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x3a98

    cmp-long v6, v0, v4

    if-lez v6, :cond_35

    :cond_0
    sget-wide v0, Lcom/superbock/auto/BaseService;->D:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/superbock/auto/BaseService;->D:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v1, ".android.packageinstaller"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x3

    const-string v6, "android:id/button2"

    const-string v7, "android:id/button1"

    const/4 v8, 0x1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v9, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v9, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_5

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v2, v6, v8}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    :goto_0
    const/4 v2, 0x0

    const/4 v6, 0x1

    goto/16 :goto_3

    :cond_2
    const/4 v2, 0x1

    :goto_1
    const/4 v6, 0x0

    goto/16 :goto_3

    :cond_3
    move-object v9, v2

    goto :goto_2

    :cond_4
    move-object v0, v2

    move-object v9, v0

    :cond_5
    :goto_2
    sget v10, Le3/d;->a:I

    const/16 v11, 0xe

    const-string v12, "android:id/alertTitle"

    if-ne v10, v11, :cond_7

    iget-object v11, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v13, "com.google.android.apps.nexuslauncher"

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v9, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v9, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_7

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v6, v12}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    :cond_6
    if-eqz v2, :cond_f

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_7
    if-ne v10, v8, :cond_8

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v11, "com.huawei.android.launcher"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_8

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.huawei.android.launcher:id/delete_item"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_8
    if-ne v10, v8, :cond_9

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v11, "com.hihonor.android.launcher"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_9

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.hihonor.android.launcher:id/delete_item"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_9
    if-ne v10, v4, :cond_a

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_a

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.miui.home:id/title"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_a
    if-ne v10, v5, :cond_b

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_b

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v12}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_b
    if-ne v10, v5, :cond_c

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v11, "com.oppo.launcher"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.oppo.launcher:id/btn_positive"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v9, "com.oppo.launcher:id/btn_negative"

    invoke-static {v2, v9}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_c

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.oppo.launcher:id/txt_uninstall_main_title"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_c
    if-ne v10, v5, :cond_d

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v11, "com.android.launcher"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "com.android.launcher:id/btn_positive"

    invoke-static {v0, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v9, "com.android.launcher:id/btn_negative"

    invoke-static {v2, v9}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_d

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.launcher:id/txt_uninstall_main_title"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_d
    if-ne v10, v1, :cond_f

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v7}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v6}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v9

    if-eqz v9, :cond_f

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2, v12}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.bbk.launcher2:id/uninstall_title"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_e
    if-eqz v2, :cond_f

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->d(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_f
    const/4 v2, 0x0

    goto/16 :goto_1

    :goto_3
    if-eqz v6, :cond_15

    sget-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    if-nez v1, :cond_13

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    if-nez v1, :cond_13

    sget-boolean v1, Lcom/superbock/auto/BaseService;->X:Z

    if-nez v1, :cond_13

    sget v1, Le3/d;->a:I

    if-ne v1, v5, :cond_10

    goto :goto_4

    :cond_10
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_11

    sget-object v0, Lcom/superbock/auto/BaseService;->y:Landroid/view/WindowManager$LayoutParams;

    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget v3, v1, Landroid/graphics/Rect;->left:I

    if-ne v2, v3, :cond_11

    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iget v4, v1, Landroid/graphics/Rect;->top:I

    if-ne v2, v4, :cond_11

    iget v2, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iget v5, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v3

    if-ne v2, v5, :cond_11

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v2, v4

    if-eq v0, v2, :cond_14

    :cond_11
    sget-object v0, Lcom/superbock/auto/BaseService;->y:Landroid/view/WindowManager$LayoutParams;

    iget v2, v1, Landroid/graphics/Rect;->right:I

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    sget-object v0, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_12

    sget-object v0, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v1, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_12
    sget-object v0, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v1, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    sget-object v2, Lcom/superbock/auto/BaseService;->y:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_13
    :goto_4
    invoke-virtual {p0, v9}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->j()V

    :cond_14
    :goto_5
    return-void

    :cond_15
    if-eqz v2, :cond_16

    return-void

    :cond_16
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v2, "com.android.settings"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/reset_soft_button"

    invoke-static {v0, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/initiate_reset_settings"

    invoke-static {v0, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/master_clear_scrollview"

    invoke-static {v0, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/main_clear_scrollview"

    invoke-static {v0, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/execute_master_clear"

    invoke-static {v0, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/entity_header_title"

    invoke-static {v0, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    :cond_17
    const/4 v3, 0x1

    :cond_18
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v6, "com.android.permissioncontroller"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.permissioncontroller:id/entity_header_title"

    invoke-static {v0, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    :cond_19
    :goto_6
    const/4 v3, 0x1

    goto/16 :goto_7

    :cond_1a
    sget v0, Le3/d;->a:I

    if-ne v0, v8, :cond_1b

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v7, "com.android.settings:id/left_button"

    invoke-static {v6, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1b

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v7, "android:id/title"

    invoke-static {v6, v7}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/superbock/auto/BaseService;->f(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1b

    goto :goto_6

    :cond_1b
    if-ne v0, v8, :cond_1f

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v7, "com.huawei.systemmanager"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.huawei.systemmanager:id/listitem_all_auto"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_6

    :cond_1c
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.huawei.systemmanager:id/optimize_button"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_6

    :cond_1d
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.huawei.systemmanager:id/power_mode_switch_scrollview"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_6

    :cond_1e
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.huawei.systemmanager:id/app_name"

    invoke-static {v0, v1}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_34

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.huawei.systemmanager:id/consumption_hint_switch"

    invoke-static {v0, v1}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto/16 :goto_6

    :cond_1f
    if-ne v0, v4, :cond_25

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v7, "com.miui.securitycenter"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/app_manager_details_applabel"

    invoke-static {v0, v1}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    goto/16 :goto_6

    :cond_20
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/all_behavior_record_list"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto/16 :goto_6

    :cond_21
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/auto_start_list"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    goto/16 :goto_6

    :cond_22
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/battery_scan_text"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    goto/16 :goto_6

    :cond_23
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/scan_result_page_text"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    goto/16 :goto_6

    :cond_24
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.miui.securitycenter:id/score"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_34

    goto/16 :goto_6

    :cond_25
    if-ne v0, v4, :cond_27

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v7, "com.miui.cleanmaster"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_26

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v7, "com.miui.cleaner"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_27

    :cond_26
    iget-object v6, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v7, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v6, v7, v8}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v6

    if-eqz v6, :cond_27

    goto/16 :goto_6

    :cond_27
    if-ne v0, v5, :cond_28

    iget-object v6, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/right_button"

    invoke-static {v2, v6}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_28

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v6, "com.android.settings:id/app_name"

    invoke-static {v2, v6}, Li/g;->s(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->f(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_28

    goto/16 :goto_6

    :cond_28
    if-ne v0, v5, :cond_2a

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v5, "com.oplus.battery"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v5, "com.oplus.securitypermission"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    :cond_29
    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v5, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v2, v5, v8}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-eqz v2, :cond_2a

    goto/16 :goto_6

    :cond_2a
    if-ne v0, v1, :cond_2c

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v2, "com.iqoo.secure"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v2, "com.iqoo.powersaving"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v2, "com.vivo.abe"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2c

    :cond_2b
    iget-object v1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v1, v2, v8}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_2c

    goto/16 :goto_6

    :cond_2c
    const/4 v1, 0x6

    if-ne v0, v1, :cond_30

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v5, "com.samsung.android.sm_cn"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_30

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm_cn:id/score_info_text"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2d

    goto/16 :goto_6

    :cond_2d
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto/16 :goto_6

    :cond_2e
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm_cn:id/battery_scroll_container"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    goto/16 :goto_6

    :cond_2f
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm_cn:id/security_main_scroll"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_34

    goto/16 :goto_6

    :cond_30
    if-ne v0, v1, :cond_33

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v5, "com.samsung.android.sm"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm:id/score_info_text"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_31

    goto/16 :goto_6

    :cond_31
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm:id/battery_scroll_container"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_32

    goto/16 :goto_6

    :cond_32
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "com.samsung.android.sm:id/security_main_scroll"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_34

    goto/16 :goto_6

    :cond_33
    if-ne v0, v1, :cond_34

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    const-string v1, "com.samsung.android.lool"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-static {v0, v1, v8}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_34

    goto/16 :goto_6

    :cond_34
    :goto_7
    if-eqz v3, :cond_35

    invoke-virtual {p0, v8}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    invoke-virtual {p0, v4}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :cond_35
    :goto_8
    return-void
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-boolean v0, Lcom/superbock/auto/BaseService;->X:Z

    if-eqz v0, :cond_0

    const-string v0, "\u2064"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    sget-object v0, Lcom/superbock/auto/BaseService;->Y:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/superbock/auto/BaseService;->Y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final e()V
    .locals 5

    const/4 v0, 0x0

    sput-boolean v0, Lcom/superbock/auto/BaseService;->G:Z

    sget-object v1, Lcom/superbock/auto/BaseService;->H:Ljava/util/HashSet;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    :goto_0
    if-ge v0, v2, :cond_0

    const/4 v3, 0x1

    invoke-virtual {p0, v3}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lcom/superbock/auto/BaseService;->E:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x2bc

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    :try_start_2
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Le3/d;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lk3/f;->k(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Ljava/util/HashMap;

    const-string v0, "isPlayStore"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "1"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "isEnabled"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    sget-object v0, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x9

    if-gt v0, v1, :cond_3

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "com.android.systemui:id/key"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "com.android.systemui:id/VivoPinkey"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v4, v5}, Li/g;->i(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4, v5}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    sget-object v2, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    invoke-static {v3, v0}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Li/g;->u(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    sget-object v0, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final i()Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getRootInActiveWindow()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object v0
.end method

.method public final j()V
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/superbock/auto/BaseService;->X:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto :goto_2

    :cond_0
    sget v0, Le3/d;->a:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/16 v2, 0xe

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lk3/d;->b(Landroid/content/Context;I)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    invoke-static {p0, v1}, Lk3/d;->b(Landroid/content/Context;I)V

    :goto_1
    invoke-static {p0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->o:Ljava/lang/String;

    sget-object v1, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v1, p0, v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->showTips(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-virtual {v0}, Lcom/superbock/App;->f()V

    :cond_3
    :goto_2
    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "1"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "2"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "3"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "4"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "5"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "6"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "7"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "8"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "9"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "10"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "11"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "12"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sput-object v0, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v0, Lcom/superbock/auto/BaseService;->Z:J

    :cond_0
    return-void
.end method

.method public final m(FF)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, p1, v1

    sub-float v3, p2, v1

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    add-float/2addr p1, v1

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    const-wide/16 p1, 0x64

    invoke-virtual {p0, v0, p1, p2}, Lcom/superbock/auto/BaseService;->o(Landroid/graphics/Path;J)V

    return-void
.end method

.method public final n(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    iget p1, v0, Landroid/graphics/Rect;->left:I

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, p1

    int-to-float p1, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/superbock/auto/BaseService;->m(FF)V

    return-void
.end method

.method public final o(Landroid/graphics/Path;J)V
    .locals 8
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    new-instance v0, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {v0}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    new-instance v7, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v3, 0x0

    move-object v1, v7

    move-object v2, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJ)V

    invoke-virtual {v0, v7}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p2}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    return-void
.end method

.method public final onAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 6
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/superbock/auto/BaseService;->q:J

    :try_start_0
    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->s()V

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->t()V

    iput-object p1, p0, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-eqz p1, :cond_0

    :try_start_1
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_0
    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result p1

    iput p1, p0, Lcom/superbock/auto/BaseService;->i:I

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getSource()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/auto/BaseService;->k:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v0, 0x0

    if-nez p1, :cond_2

    move-object p1, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/superbock/auto/BaseService;->l:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/accessibilityservice/AccessibilityService;->getRootInActiveWindow()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->r()V

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez p1, :cond_4

    if-eqz p1, :cond_3

    :try_start_3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :cond_3
    return-void

    :cond_4
    :try_start_4
    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    iput-object v1, p0, Lcom/superbock/auto/BaseService;->g:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->g:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string p1, "im.token.app"

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->k()V

    goto :goto_2

    :cond_5
    const-string p1, "vip.mytokenpocket"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->y()V

    goto :goto_2

    :cond_6
    const-string p1, "com.wallet.crypto.trustapp"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->B()V

    goto :goto_2

    :cond_7
    const-string p1, "com.tronlinkpro.wallet"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->A()V

    goto :goto_2

    :cond_8
    const-string p1, "com.tronlink.global"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->z()V

    goto :goto_2

    :cond_9
    const-string p1, "io.metamask"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1, v1}, Li/g;->l(Landroid/view/accessibility/AccessibilityNodeInfo;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_1

    :cond_a
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1, v0}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    sput-object p1, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    sget-wide v2, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v2, Lcom/superbock/auto/BaseService;->j0:J

    :cond_b
    :goto_2
    sget-wide v2, Lcom/superbock/auto/BaseService;->D:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_c

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lcom/superbock/auto/BaseService;->D:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0xea60

    cmp-long p1, v2, v4

    if-gtz p1, :cond_c

    goto :goto_3

    :cond_c
    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const v0, 0x7f0f004f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Li/g;->o(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const v0, 0x7f0f004c

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Li/g;->n(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    invoke-virtual {p0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :cond_d
    :goto_3
    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->c()V

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->a()V

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->w()V

    invoke-virtual {p0}, Lcom/superbock/auto/BaseService;->v()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-eqz p1, :cond_e

    goto :goto_4

    :catchall_2
    nop

    iget-object p1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-eqz p1, :cond_e

    :goto_4
    :try_start_5
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :cond_e
    return-void
.end method

.method public final onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/superbock/auto/BaseService;->b:I

    invoke-static {p0}, Lk3/h;->a(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/superbock/auto/BaseService;->c:I

    const-string v0, "keyguard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    iput-object v0, p0, Lcom/superbock/auto/BaseService;->d:Landroid/app/KeyguardManager;

    invoke-static {p0}, Lk3/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const v0, 0x7f0f0111

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/superbock/auto/BaseService;->o:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/superbock/auto/BaseService;->X:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lk3/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lcom/superbock/auto/BaseService;->Y:Ljava/lang/String;

    return-void
.end method

.method public final onDestroy()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lg3/h;->b()Lg3/h;

    move-result-object v1

    new-instance v2, Lcom/superbock/bean/GInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x63

    iget-object v5, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/superbock/bean/GInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lg3/h;->a(Lcom/superbock/bean/GInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/superbock/auto/BaseService;->r:Lcom/superbock/auto/BaseService;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/superbock/auto/BaseService;->q:J

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->u(I)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onInterrupt()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lg3/h;->b()Lg3/h;

    move-result-object v1

    new-instance v2, Lcom/superbock/bean/GInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x62

    iget-object v5, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v0, v5}, Lcom/superbock/bean/GInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lg3/h;->a(Lcom/superbock/bean/GInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/superbock/auto/BaseService;->r:Lcom/superbock/auto/BaseService;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/superbock/auto/BaseService;->q:J

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->u(I)V

    return-void
.end method

.method public final onKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    sget-boolean v0, Lcom/superbock/auto/BaseService;->B:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0xa4

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x19

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x18

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService;->onKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onServiceConnected()V
    .locals 12

    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onServiceConnected()V

    sput-object p0, Lcom/superbock/auto/BaseService;->r:Lcom/superbock/auto/BaseService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/superbock/auto/BaseService;->q:J

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/superbock/auto/BaseService;->X:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lk3/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lcom/superbock/auto/BaseService;->Y:Ljava/lang/String;

    invoke-static {}, Lk3/f;->a()V

    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    sput-object v0, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    new-instance v0, Landroid/view/SurfaceView;

    invoke-direct {v0, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/superbock/auto/BaseService;->J:Landroid/view/SurfaceView;

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/16 v4, 0x7f0

    const v5, -0x7fb3fb68

    const/4 v6, -0x3

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    sput-object v0, Lcom/superbock/auto/BaseService;->K:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050054

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    sget-object v0, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    sget-object v0, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v3, 0xff

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    iget v5, p0, Lcom/superbock/auto/BaseService;->b:I

    iget v6, p0, Lcom/superbock/auto/BaseService;->c:I

    const/16 v7, 0x7f0

    const v8, -0x7fb3f9e8

    const/4 v9, 0x1

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    sput-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_1

    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    :cond_1
    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const/16 v5, 0x33

    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    sget v4, Le3/d;->a:I

    if-ne v4, v2, :cond_2

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "ScreenRecorderTimer"

    goto/16 :goto_3

    :cond_2
    const/4 v6, 0x2

    if-ne v4, v6, :cond_3

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    iget v4, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v4, v4, 0x1000

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const-string v4, "com.miui.screenrecorder"

    goto/16 :goto_3

    :cond_3
    const/4 v6, 0x3

    if-ne v4, v6, :cond_4

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "com.oplus.screenrecorder.FloatView"

    goto/16 :goto_3

    :cond_4
    const/4 v6, 0x4

    if-ne v4, v6, :cond_5

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "screen_record_menu"

    goto/16 :goto_3

    :cond_5
    const/4 v6, 0x5

    if-ne v4, v6, :cond_6

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "SysScreenRecorder"

    invoke-virtual {v0, v4}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    :try_start_0
    const-string v0, "android.view.MeizuLayoutParams"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v4, "flags"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    iget v6, v6, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v4, v0, v6}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "meizuParams"

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    sget-object v6, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v4, v6, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    :goto_1
    :try_start_1
    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "meizuFlags"

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v6, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    iget v7, v6, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-virtual {v4, v6, v7}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    goto/16 :goto_4

    :cond_6
    const/4 v6, 0x6

    if-ne v4, v6, :cond_7

    :try_start_2
    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v4, "semAddExtensionFlags"

    new-array v6, v2, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "semAddPrivateFlags"

    new-array v9, v2, [Ljava/lang/Class;

    aput-object v7, v9, v8

    invoke-virtual {v4, v6, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sget-object v6, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    new-array v7, v2, [Ljava/lang/Object;

    const/high16 v9, -0x7ffe0000

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v0, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    new-array v6, v2, [Ljava/lang/Object;

    iget v7, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-virtual {v4, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto/16 :goto_4

    :catch_4
    move-exception v0

    goto :goto_2

    :cond_7
    const/16 v6, 0x9

    if-ne v4, v6, :cond_8

    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v6, "op_screenrecord"

    invoke-virtual {v4, v6}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    const/16 v4, 0x1e

    if-ne v0, v4, :cond_b

    :try_start_3
    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v4, "PRIVATE_FLAG_IS_ROUNDED_CORNERS_OVERLAY"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v4, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "privateFlags"

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v6, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v6, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_4

    :catch_5
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :cond_8
    const/16 v0, 0xf

    if-ne v4, v0, :cond_9

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "NubiaScreenDecorOverlay"

    goto :goto_3

    :cond_9
    const/16 v0, 0x10

    if-ne v4, v0, :cond_a

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "com.blackshark.screenrecorder"

    :goto_3
    invoke-virtual {v0, v4}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_a
    const/16 v0, 0x11

    if-ne v4, v0, :cond_b

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    const-string v4, "com.asus.force.layer.transparent.SR.floatingpanel"

    invoke-virtual {v0, v4}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    iget v4, v0, Landroid/view/WindowManager$LayoutParams;->memoryType:I

    const/high16 v6, 0x10000000

    or-int/2addr v4, v6

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->memoryType:I

    :cond_b
    :goto_4
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    iget v7, p0, Lcom/superbock/auto/BaseService;->b:I

    iget v8, p0, Lcom/superbock/auto/BaseService;->c:I

    const/16 v9, 0x7f0

    const v10, -0x7fb3f8f8

    const/4 v11, -0x3

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    sput-object v0, Lcom/superbock/auto/BaseService;->w:Landroid/view/WindowManager$LayoutParams;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_c

    sget-object v0, Lcom/superbock/auto/BaseService;->w:Landroid/view/WindowManager$LayoutParams;

    iput v2, v0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    :cond_c
    sget-object v0, Lcom/superbock/auto/BaseService;->w:Landroid/view/WindowManager$LayoutParams;

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/view/View;->setKeepScreenOn(Z)V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v7, 0xc8

    const/16 v8, 0xc8

    const/16 v9, 0x7f0

    const v10, -0x7fb3f8f8

    const/4 v11, -0x3

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    sput-object v0, Lcom/superbock/auto/BaseService;->y:Landroid/view/WindowManager$LayoutParams;

    iput v5, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    sget-object v0, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    new-instance v1, Lf3/a;

    invoke-direct {v1}, Lf3/a;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    new-instance v1, Lf3/b;

    invoke-direct {v1}, Lf3/b;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    sget-object v0, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    new-instance v1, Lf3/c;

    invoke-direct {v1, p0}, Lf3/c;-><init>(Lcom/superbock/auto/BaseService;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0, v2}, Lcom/superbock/auto/BaseService;->u(I)V

    return-void
.end method

.method public final p(FFJ)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v2, p1, v1

    sub-float v3, p2, v1

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    add-float/2addr p1, v1

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p0, v0, p3, p4}, Lcom/superbock/auto/BaseService;->o(Landroid/graphics/Path;J)V

    return-void
.end method

.method public final q(FFFF)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v0, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    const-wide/16 p1, 0xc8

    invoke-virtual {p0, v0, p1, p2}, Lcom/superbock/auto/BaseService;->o(Landroid/graphics/Path;J)V

    return-void
.end method

.method public final r()V
    .locals 31

    move-object/from16 v1, p0

    iget v0, v1, Lcom/superbock/auto/BaseService;->i:I

    const/4 v2, 0x1

    const/16 v3, 0x2000

    const/4 v4, 0x0

    if-eq v0, v2, :cond_5

    const/16 v5, 0x10

    if-eq v0, v5, :cond_2

    if-eq v0, v3, :cond_2

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    iget-object v5, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_4

    :cond_1
    invoke-static {}, Lf3/i;->a()Z

    move-result v5

    if-eqz v5, :cond_4

    iget v5, v1, Lcom/superbock/auto/BaseService;->i:I

    iget-object v6, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v6

    sget-wide v7, Lcom/superbock/auto/BaseService;->q:J

    iget-object v9, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v9}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :cond_7

    goto/16 :goto_4

    :cond_2
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lf3/i;->a()Z

    move-result v5

    if-eqz v5, :cond_4

    iget v5, v1, Lcom/superbock/auto/BaseService;->i:I

    iget-object v6, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v6

    sget-wide v7, Lcom/superbock/auto/BaseService;->q:J

    iget-object v9, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v10

    if-eqz v10, :cond_3

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_3
    move-object v10, v4

    :goto_1
    sget-object v11, Lk3/f;->l:Ljava/util/HashMap;

    iget-object v12, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    move-object/from16 v17, v0

    move v13, v5

    move v14, v6

    move-wide v15, v7

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v20, v11

    goto/16 :goto_7

    :cond_4
    :goto_2
    move-object/from16 v27, v0

    goto/16 :goto_8

    :cond_5
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {}, Lf3/i;->a()Z

    move-result v5

    if-eqz v5, :cond_4

    iget v5, v1, Lcom/superbock/auto/BaseService;->i:I

    iget-object v6, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v6

    sget-wide v7, Lcom/superbock/auto/BaseService;->q:J

    iget-object v9, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v9}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :cond_7

    :goto_4
    iget-object v11, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v11

    :goto_5
    move/from16 v30, v5

    move-object v5, v0

    move-object v0, v9

    move-wide v8, v7

    move v7, v6

    move/from16 v6, v30

    goto :goto_6

    :cond_7
    move-object v11, v4

    goto :goto_5

    :goto_6
    sget-object v12, Lk3/f;->l:Ljava/util/HashMap;

    iget-object v13, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    move-object/from16 v17, v0

    move-object v0, v5

    move v13, v6

    move v14, v7

    move-wide v15, v8

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    move-object/from16 v20, v12

    :goto_7
    invoke-static/range {v13 .. v20}, Lf3/i;->i(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :goto_8
    if-eqz v27, :cond_8

    invoke-static {}, Lg3/i;->a()Lg3/i;

    move-result-object v0

    new-instance v5, Lcom/superbock/bean/HInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v22

    iget v6, v1, Lcom/superbock/auto/BaseService;->i:I

    iget-object v7, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v24

    sget-wide v25, Lcom/superbock/auto/BaseService;->q:J

    iget-object v7, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    sget-object v8, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v29, v8

    check-cast v29, Ljava/lang/String;

    move-object/from16 v21, v5

    move/from16 v23, v6

    move-object/from16 v28, v7

    invoke-direct/range {v21 .. v29}, Lcom/superbock/bean/HInfo;-><init>(Ljava/lang/String;IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v0, Lg3/i;->a:Lt2/g;

    invoke-interface {v0, v5}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_8
    :goto_9
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    const-string v5, "com.android.systemui"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v5, "[\u2022]"

    const-string v6, ""

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    if-eqz v0, :cond_33

    sget-object v0, Lf3/i;->a:Ls3/g0;

    const-wide/16 v10, 0x2710

    if-eqz v0, :cond_9

    sget-wide v12, Lf3/i;->e:J

    cmp-long v0, v12, v7

    if-lez v0, :cond_9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sget-wide v14, Lf3/i;->e:J

    sub-long/2addr v12, v14

    cmp-long v0, v12, v10

    if-gez v0, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    if-eqz v0, :cond_a

    goto/16 :goto_1b

    :cond_a
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->d:Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->isKeyguardLocked()Z

    move-result v0

    sget-wide v12, Lcom/superbock/auto/BaseService;->T:J

    cmp-long v14, v12, v7

    if-lez v14, :cond_b

    sget-wide v14, Lcom/superbock/auto/BaseService;->q:J

    sub-long/2addr v14, v12

    cmp-long v12, v14, v10

    if-gez v12, :cond_b

    const/4 v10, 0x1

    goto :goto_b

    :cond_b
    const/4 v10, 0x0

    :goto_b
    if-eqz v0, :cond_c

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->d:Landroid/app/KeyguardManager;

    invoke-virtual {v11}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v11

    if-nez v11, :cond_d

    goto/16 :goto_1b

    :cond_c
    if-nez v10, :cond_d

    goto/16 :goto_1b

    :cond_d
    iget-object v11, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v12, "com.android.systemui:id/keyguard_host_view"

    invoke-static {v11, v12}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v11

    const-string v12, "com.android.systemui:id/passwordEntry"

    if-nez v11, :cond_10

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v13, "com.android.systemui:id/keyguard_security_container"

    invoke-static {v11, v13}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_10

    iget-object v11, v1, Lcom/superbock/auto/BaseService;->l:Ljava/lang/String;

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    if-eqz v0, :cond_f

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sput-object v6, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v0, Lcom/superbock/auto/BaseService;->R:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    sput-wide v7, Lcom/superbock/auto/BaseService;->T:J

    :cond_e
    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_f

    sput-object v6, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    sput-wide v7, Lcom/superbock/auto/BaseService;->T:J

    :cond_f
    if-nez v10, :cond_10

    goto/16 :goto_1b

    :cond_10
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "com.android.systemui:id/lockPatternView"

    invoke-static {v0, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-nez v0, :cond_11

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "com.android.systemui:id/lock_pattern_view"

    invoke-static {v0, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :cond_11
    const/4 v11, 0x3

    if-nez v0, :cond_12

    sget v13, Le3/d;->a:I

    if-ne v13, v11, :cond_12

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v13, "com.android.systemui:id/colorLockPatternView"

    invoke-static {v0, v13}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :cond_12
    const/4 v13, 0x4

    if-nez v0, :cond_13

    sget v14, Le3/d;->a:I

    if-ne v14, v13, :cond_13

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v14, "com.android.systemui:id/vivo_lock_pattern_view"

    invoke-static {v0, v14}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :cond_13
    const/4 v14, 0x2

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I

    move-result v4

    const/16 v10, 0x9

    if-eq v4, v10, :cond_14

    goto/16 :goto_1b

    :cond_14
    invoke-virtual {v0, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v0, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v0, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v0, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v4, 0x5

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v4, 0x6

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v4

    if-eqz v4, :cond_15

    sget-object v0, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    goto/16 :goto_17

    :cond_15
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    const/4 v11, 0x0

    :goto_c
    if-ge v11, v10, :cond_33

    invoke-virtual {v0, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v12

    invoke-virtual {v12, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    invoke-static {v4}, Li/g;->u(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lf3/n;

    add-int/lit8 v14, v11, 0x1

    invoke-direct {v13, v14, v12}, Lf3/n;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z

    move-result v11

    if-nez v11, :cond_16

    sget-object v11, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    sget-object v11, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    sget-object v11, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_17

    sget-object v11, Lcom/superbock/auto/BaseService;->O:Ljava/util/ArrayList;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_d
    sget-wide v11, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v11, Lcom/superbock/auto/BaseService;->T:J

    :cond_17
    move v11, v14

    goto :goto_c

    :cond_18
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v11, "com.android.systemui:id/pinEntry"

    invoke-static {v0, v11}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    const-string v11, "[0-9]{1}"

    if-nez v0, :cond_2c

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v15, "com.android.systemui:id/fixedPinEntry"

    invoke-static {v0, v15}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-nez v0, :cond_2c

    if-eqz v10, :cond_19

    goto/16 :goto_14

    :cond_19
    sget v0, Le3/d;->a:I

    if-ne v0, v13, :cond_1f

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v15, "com.android.systemui:id/vivo_pin_view"

    invoke-static {v10, v15}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1f

    iget v0, v1, Lcom/superbock/auto/BaseService;->i:I

    if-eq v0, v2, :cond_1a

    goto/16 :goto_1b

    :cond_1a
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1b

    goto :goto_e

    :cond_1b
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    :goto_e
    if-nez v4, :cond_1c

    goto/16 :goto_1b

    :cond_1c
    const-string v0, "["

    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "]"

    invoke-virtual {v0, v4, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1d

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-static {v4, v10, v0}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sput-object v4, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v4, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Lcom/superbock/auto/BaseService;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1a

    :cond_1d
    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_1e

    goto/16 :goto_16

    :cond_1e
    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_33

    goto/16 :goto_19

    :cond_1f
    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v4, v12}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_25

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v10, "com.android.systemui:id/securityEditText"

    invoke-static {v4, v10}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_25

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->l:Ljava/lang/String;

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    goto :goto_f

    :cond_20
    if-ne v0, v13, :cond_33

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v4, "com.android.systemui:id/MixPwEntry"

    invoke-static {v0, v4}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    if-nez v4, :cond_21

    goto/16 :goto_1b

    :cond_21
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_22

    goto/16 :goto_12

    :cond_22
    if-ne v4, v2, :cond_23

    const-string v10, "\u2022"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_23

    goto/16 :goto_13

    :cond_23
    sget-object v10, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    sub-int v10, v4, v10

    if-ne v10, v2, :cond_24

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    sub-int/2addr v10, v2

    goto :goto_10

    :cond_24
    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    if-ne v0, v2, :cond_33

    goto :goto_11

    :cond_25
    :goto_f
    iget v0, v1, Lcom/superbock/auto/BaseService;->i:I

    if-eq v0, v3, :cond_26

    goto/16 :goto_1b

    :cond_26
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityRecord;->getItemCount()I

    move-result v4

    iget-object v10, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v10

    if-eqz v10, :cond_2a

    if-nez v4, :cond_27

    goto :goto_12

    :cond_27
    if-ne v4, v2, :cond_28

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_28

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v14

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_28
    sget-object v10, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    sub-int v10, v4, v10

    if-ne v10, v2, :cond_29

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    sub-int/2addr v10, v14

    :goto_10
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_29
    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v4

    if-ne v0, v2, :cond_33

    :goto_11
    sget-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_13

    :cond_2a
    if-nez v4, :cond_2b

    :goto_12
    sput-object v6, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    goto/16 :goto_18

    :cond_2b
    add-int/2addr v4, v2

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_13
    sput-object v0, Lcom/superbock/auto/BaseService;->S:Ljava/lang/String;

    goto/16 :goto_1a

    :cond_2c
    :goto_14
    iget v10, v1, Lcom/superbock/auto/BaseService;->i:I

    if-eq v10, v2, :cond_2d

    goto/16 :goto_1b

    :cond_2d
    iget-object v10, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v10}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v10

    if-nez v10, :cond_2e

    goto :goto_15

    :cond_2e
    iget-object v4, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityRecord;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    :goto_15
    if-eqz v4, :cond_2f

    invoke-virtual {v4, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2f

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-static {v10, v11, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sput-object v10, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v10, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Lcom/superbock/auto/BaseService;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-wide v10, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v10, Lcom/superbock/auto/BaseService;->T:J

    if-eqz v0, :cond_33

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v10

    if-eqz v10, :cond_33

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_33

    sput-object v4, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Lcom/superbock/auto/BaseService;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_2f
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->k:Landroid/view/accessibility/AccessibilityNodeInfo;

    if-eqz v0, :cond_33

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->l:Ljava/lang/String;

    if-nez v0, :cond_30

    goto :goto_1b

    :cond_30
    const-string v10, "delete"

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_32

    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_31

    :goto_16
    sput-object v6, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    :goto_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_18
    sput-wide v7, Lcom/superbock/auto/BaseService;->T:J

    goto :goto_1b

    :cond_31
    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_33

    :goto_19
    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v0, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    sget-object v0, Lcom/superbock/auto/BaseService;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1a

    :cond_32
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->l:Ljava/lang/String;

    const-string v10, "enter"

    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_33

    sget-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v0, v13, :cond_33

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    invoke-static {v0, v10, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/superbock/auto/BaseService;->Q:Ljava/lang/String;

    :goto_1a
    sget-wide v10, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v10, Lcom/superbock/auto/BaseService;->T:J

    :cond_33
    :goto_1b
    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->isPassword()Z

    move-result v0

    if-eqz v0, :cond_38

    iget v0, v1, Lcom/superbock/auto/BaseService;->i:I

    if-ne v0, v3, :cond_38

    iget-object v0, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, v1, Lcom/superbock/auto/BaseService;->h:Landroid/view/accessibility/AccessibilityEvent;

    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityRecord;->getItemCount()I

    move-result v3

    const-string v4, "[com.jungly.gridpasswordview"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_34

    goto :goto_1e

    :cond_34
    if-nez v3, :cond_35

    sget-object v4, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v2, :cond_35

    sput-object v6, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    sput-wide v7, Lcom/superbock/auto/BaseService;->W:J

    goto :goto_1d

    :cond_35
    if-ne v3, v2, :cond_36

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_36

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1c

    :cond_36
    sget-object v4, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    sub-int v4, v3, v4

    if-ne v4, v2, :cond_37

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1c

    :cond_37
    sget-object v0, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    if-ne v0, v2, :cond_38

    sget-object v0, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-virtual {v0, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_1c
    sput-object v0, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    sget-wide v2, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v2, Lcom/superbock/auto/BaseService;->W:J

    iget-object v6, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    :goto_1d
    sput-object v6, Lcom/superbock/auto/BaseService;->V:Ljava/lang/String;

    :cond_38
    :goto_1e
    sget-object v0, Lk3/f;->l:Ljava/util/HashMap;

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_39

    iget-object v2, v1, Lcom/superbock/auto/BaseService;->m:Ljava/lang/String;

    iget-object v3, v1, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    iput-object v3, v1, Lcom/superbock/auto/BaseService;->m:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_39

    invoke-static {}, Lg3/j;->a()Lg3/j;

    move-result-object v2

    new-instance v9, Lcom/superbock/bean/IInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v4

    sget-wide v5, Lcom/superbock/auto/BaseService;->q:J

    iget-object v7, v1, Lcom/superbock/auto/BaseService;->m:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/superbock/bean/IInfo;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, v2, Lg3/j;->b:Ljava/lang/Object;

    check-cast v0, Lt2/g;

    invoke-interface {v0, v9}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1f

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_39
    :goto_1f
    return-void
.end method

.method public final s()V
    .locals 7

    sget-object v0, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v1, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    sget-object v1, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v2, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    invoke-interface {v1, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_1
    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v4, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-interface {v1, v4}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    sget-boolean v4, Lcom/superbock/auto/BaseService;->z:Z

    if-nez v4, :cond_3

    sget-boolean v5, Lcom/superbock/auto/BaseService;->B:Z

    if-nez v5, :cond_3

    invoke-static {v4}, Lf3/i;->d(Z)V

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    invoke-static {v1}, Lf3/i;->g(Z)V

    monitor-exit v0

    return-void

    :cond_3
    if-eqz v4, :cond_7

    sget-boolean v2, Lcom/superbock/auto/BaseService;->F:Z

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0b002e

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_2

    :cond_4
    sget-object v2, Lcom/superbock/auto/BaseService;->A:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v5, 0x7f0b002f

    invoke-virtual {v2, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v4, 0x7f0800ac

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/bumptech/glide/b;->g(Landroid/view/View;)Lcom/bumptech/glide/i;

    move-result-object v5

    sget-object v6, Lcom/superbock/auto/BaseService;->A:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/i;->n(Ljava/lang/String;)Lcom/bumptech/glide/h;

    move-result-object v5

    sget-object v6, Lr/l;->c:Lr/l$c;

    invoke-virtual {v5, v6}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v5

    check-cast v5, Lcom/bumptech/glide/h;

    invoke-virtual {v5, v4}, Lcom/bumptech/glide/h;->v(Landroid/widget/ImageView;)Li0/i;

    if-eqz v1, :cond_5

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v1, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v1, 0xc8

    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    invoke-virtual {p0, v3}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    monitor-exit v0

    return-void

    :cond_5
    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    goto :goto_1

    :cond_6
    :goto_2
    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    :cond_7
    sget-object v1, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_3
    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v2, Lcom/superbock/auto/BaseService;->t:Landroid/widget/FrameLayout;

    sget-object v3, Lcom/superbock/auto/BaseService;->u:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v1, v2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    if-eqz v1, :cond_8

    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v2, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    sget-object v3, Lcom/superbock/auto/BaseService;->w:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v1, v2, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    sget-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    invoke-static {v1}, Lf3/i;->d(Z)V

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    invoke-static {v1}, Lf3/i;->g(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final t()V
    .locals 6

    sget-object v0, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v1, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    sget-object v1, Lcom/superbock/auto/BaseService;->I:Lf3/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lf3/e;->a()V

    sput-object v2, Lcom/superbock/auto/BaseService;->I:Lf3/e;

    :cond_1
    sget-object v1, Lcom/superbock/auto/BaseService;->J:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v3, Lcom/superbock/auto/BaseService;->J:Landroid/view/SurfaceView;

    invoke-interface {v1, v3}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_2
    sget-object v1, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v1, :cond_3

    const-string v1, "21"

    invoke-static {v3, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_3
    sget-object v1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v4, Lcom/superbock/auto/BaseService;->J:Landroid/view/SurfaceView;

    sget-object v5, Lcom/superbock/auto/BaseService;->K:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v1, v4, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Lf3/e;

    invoke-direct {v1}, Lf3/e;-><init>()V

    sput-object v1, Lcom/superbock/auto/BaseService;->I:Lf3/e;

    sget-object v1, Lcom/superbock/auto/BaseService;->J:Landroid/view/SurfaceView;

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    sget-object v4, Lcom/superbock/auto/BaseService;->I:Lf3/e;

    invoke-interface {v1, v4}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    const-string v1, "20"

    invoke-static {v3, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final u(I)V
    .locals 3

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const-string v1, "action"

    const-string v2, "saveDev"

    invoke-virtual {v0, v1, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "step"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "deviceId"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "accessibility"

    invoke-virtual {v0, v1, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/superbock/auto/BaseService$a;

    invoke-direct {p1}, Lcom/superbock/auto/BaseService$a;-><init>()V

    invoke-static {v0, p1}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public final v()V
    .locals 6

    sget-boolean v0, Lcom/superbock/auto/BaseService;->F:Z

    if-eqz v0, :cond_0

    sget-wide v0, Lcom/superbock/auto/BaseService;->E:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    sget-wide v2, Lcom/superbock/auto/BaseService;->q:J

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x2710

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    sget v0, Lcom/superbock/ui/StartupActivity;->i:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lf3/i;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    iget-object v1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v2, Lf3/i;->a:Ls3/g0;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lf/e;

    invoke-direct {v2}, Lf/e;-><init>()V

    const/16 v3, 0x3eb

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "code"

    invoke-virtual {v2, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "data"

    invoke-virtual {v2, v3, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "t"

    invoke-virtual {v2, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v2}, Lf/a;->l()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ls3/g0;->b(Ljava/lang/String;)Z

    :goto_1
    if-eqz v0, :cond_3

    invoke-static {}, Lg3/h;->b()Lg3/h;

    move-result-object v0

    new-instance v2, Lcom/superbock/bean/GInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/superbock/ui/StartupActivity;->i:I

    iget-object v5, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v1, v5}, Lcom/superbock/bean/GInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lg3/h;->a(Lcom/superbock/bean/GInfo;)V

    :cond_3
    return-void
.end method

.method public final w()V
    .locals 5

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->j:Ljava/lang/String;

    const-string v1, "com.android.systemui"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lf3/i;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-wide v0, Lf3/i;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lf3/i;->c:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "android:id/button1"

    invoke-static {v0, v1}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v2, "android:id/checkbox"

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z

    move-result v2

    if-nez v2, :cond_1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(I)Z

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_2

    invoke-virtual {p0, v0}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final x()V
    .locals 5
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    iget v0, p0, Lcom/superbock/auto/BaseService;->b:I

    int-to-float v1, v0

    const v2, 0x3f028f5c    # 0.51f

    mul-float v1, v1, v2

    iget v2, p0, Lcom/superbock/auto/BaseService;->c:I

    int-to-float v3, v2

    const v4, 0x3f30a3d7    # 0.69f

    mul-float v3, v3, v4

    int-to-float v0, v0

    const v4, 0x3efae148    # 0.49f

    mul-float v0, v0, v4

    int-to-float v2, v2

    const v4, 0x3e9eb852    # 0.31f

    mul-float v2, v2, v4

    invoke-virtual {p0, v1, v3, v0, v2}, Lcom/superbock/auto/BaseService;->q(FFFF)V

    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final y()V
    .locals 3

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "vip.mytokenpocket:id/tv_copy"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "vip.mytokenpocket:id/tv_next"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "vip.mytokenpocket:id/tv_text"

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :cond_1
    :goto_0
    const/16 v0, 0xc

    if-lt v1, v0, :cond_2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    sput-object v0, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v0, Lcom/superbock/auto/BaseService;->b0:J

    :cond_2
    return-void
.end method

.method public final z()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "1"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "2"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "3"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "4"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "5"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "6"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "7"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "8"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "9"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "10"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "11"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "12"

    invoke-static {v0, v1}, Li/g;->h(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sput-object v0, Lcom/superbock/auto/BaseService;->i0:Ljava/lang/String;

    sget-wide v0, Lcom/superbock/auto/BaseService;->q:J

    sput-wide v0, Lcom/superbock/auto/BaseService;->h0:J

    :cond_0
    return-void
.end method
