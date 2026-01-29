.class public abstract Ll2/d$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/util/Date;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ll2/d$b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll2/d$b<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll2/d$b$a;

    const-class v1, Ljava/util/Date;

    invoke-direct {v0, v1}, Ll2/d$b$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ll2/d$b;->b:Ll2/d$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/d$b;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(II)Li2/a0;
    .locals 2

    new-instance v0, Ll2/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ll2/d;-><init>(Ll2/d$b;IILl2/d$a;)V

    iget-object p1, p0, Ll2/d$b;->a:Ljava/lang/Class;

    sget-object p2, Ll2/q;->a:Li2/y;

    new-instance p2, Ll2/r;

    invoke-direct {p2, p1, v0}, Ll2/r;-><init>(Ljava/lang/Class;Li2/z;)V

    return-object p2
.end method

.method public abstract b(Ljava/util/Date;)Ljava/util/Date;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")TT;"
        }
    .end annotation
.end method
