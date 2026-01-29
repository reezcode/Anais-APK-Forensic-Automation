.class public interface abstract Ls3/n;
.super Ljava/lang/Object;


# static fields
.field public static final c:Lk/j0;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/j0;

    invoke-direct {v0}, Lk/j0;-><init>()V

    sput-object v0, Ls3/n;->c:Lk/j0;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end method
