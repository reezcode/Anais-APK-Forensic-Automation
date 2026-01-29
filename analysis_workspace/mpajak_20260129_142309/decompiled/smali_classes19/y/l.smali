.class public abstract Ly/l;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/l$a;,
        Ly/l$d;,
        Ly/l$b;,
        Ly/l$c;
    }
.end annotation


# static fields
.field public static final a:Ly/l$c;

.field public static final b:Ly/l$a;

.field public static final c:Ly/l$b;

.field public static final d:Ly/l$d;

.field public static final e:Ly/l$b;

.field public static final f:Lp/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/g<",
            "Ly/l;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly/l$c;

    invoke-direct {v0}, Ly/l$c;-><init>()V

    sput-object v0, Ly/l;->a:Ly/l$c;

    new-instance v0, Ly/l$a;

    invoke-direct {v0}, Ly/l$a;-><init>()V

    sput-object v0, Ly/l;->b:Ly/l$a;

    new-instance v0, Ly/l$b;

    invoke-direct {v0}, Ly/l$b;-><init>()V

    sput-object v0, Ly/l;->c:Ly/l$b;

    new-instance v1, Ly/l$d;

    invoke-direct {v1}, Ly/l$d;-><init>()V

    sput-object v1, Ly/l;->d:Ly/l$d;

    sput-object v0, Ly/l;->e:Ly/l$b;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    invoke-static {v1, v0}, Lp/g;->a(Ljava/lang/String;Ljava/lang/Object;)Lp/g;

    move-result-object v0

    sput-object v0, Ly/l;->f:Lp/g;

    const/4 v0, 0x1

    sput-boolean v0, Ly/l;->g:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(IIII)I
.end method

.method public abstract b(IIII)F
.end method
