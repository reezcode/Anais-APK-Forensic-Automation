.class public final Lb4/l;
.super Lb4/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/l$a;
    }
.end annotation


# static fields
.field public static final h:Lb4/l$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/l$a;

    invoke-direct {v0}, Lb4/l$a;-><init>()V

    sput-object v0, Lb4/l;->h:Lb4/l$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocket;",
            ">;",
            "Ljava/lang/Class<",
            "-",
            "Ljavax/net/ssl/SSLSocketFactory;",
            ">;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "sslSocketClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sslSocketFactoryClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "paramClass"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lb4/f;-><init>(Ljava/lang/Class;)V

    return-void
.end method
