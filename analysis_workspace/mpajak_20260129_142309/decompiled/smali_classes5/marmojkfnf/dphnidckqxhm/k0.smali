.class public final Lmarmojkfnf/dphnidckqxhm/k0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/os/Parcel;

.field public c:Landroid/os/IBinder;

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x66

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cGFja2FnZU5hbWU="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/k0;->a:Ljava/lang/String;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p1

    const-string v0, "b2J0YWluKCk="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/k0;->b:Landroid/os/Parcel;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/k0;->b()V

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/k0;->a()V

    const-string p1, "VFJBTlNBQ1RJT05fc3RhcnRTZXJ2aWNl"

    invoke-static {p1}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "U1RBUlRfU0VSVklDRV9UUkFOU0FDVElPTg=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lmarmojkfnf/dphnidckqxhm/k0;->a(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "VFJBTlNBQ1RJT05fYnJvYWRjYXN0SW50ZW50"

    invoke-static {p1}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "QlJPQURDQVNUX0lOVEVOVF9UUkFOU0FDVElPTg=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lmarmojkfnf/dphnidckqxhm/k0;->a(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "VFJBTlNBQ1RJT05fc3RhcnRJbnN0cnVtZW50YXRpb24="

    invoke-static {p1}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "U1RBUlRfSU5TVFJVTUVOVEFUSU9OX1RSQU5TQUNUSU9O"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lmarmojkfnf/dphnidckqxhm/k0;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lmarmojkfnf/dphnidckqxhm/k0;->d:I

    return-void
.end method


# virtual methods
.method public final native a(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public final native a()V
.end method

.method public final native b()V
.end method

.method public final native run()V
.end method
