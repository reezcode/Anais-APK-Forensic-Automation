.class public abstract Lr/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lr/l$a;

.field public static final b:Lr/l$b;

.field public static final c:Lr/l$c;

.field public static final d:Lr/l$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/l$a;

    invoke-direct {v0}, Lr/l$a;-><init>()V

    sput-object v0, Lr/l;->a:Lr/l$a;

    new-instance v0, Lr/l$b;

    invoke-direct {v0}, Lr/l$b;-><init>()V

    sput-object v0, Lr/l;->b:Lr/l$b;

    new-instance v0, Lr/l$c;

    invoke-direct {v0}, Lr/l$c;-><init>()V

    sput-object v0, Lr/l;->c:Lr/l$c;

    new-instance v0, Lr/l$d;

    invoke-direct {v0}, Lr/l$d;-><init>()V

    sput-object v0, Lr/l;->d:Lr/l$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(Lp/a;)Z
.end method

.method public abstract d(ZLp/a;Lp/c;)Z
.end method
