.class public interface abstract Ls3/l;
.super Ljava/lang/Object;


# static fields
.field public static final b:Ld1/d;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld1/d;

    invoke-direct {v0}, Ld1/d;-><init>()V

    sput-object v0, Ls3/l;->b:Ld1/d;

    return-void
.end method


# virtual methods
.method public abstract a(Ls3/s;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/s;",
            ")",
            "Ljava/util/List<",
            "Ls3/k;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ls3/s;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/s;",
            "Ljava/util/List<",
            "Ls3/k;",
            ">;)V"
        }
    .end annotation
.end method
