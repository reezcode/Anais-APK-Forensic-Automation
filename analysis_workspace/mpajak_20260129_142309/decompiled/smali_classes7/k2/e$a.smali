.class public final Lk2/e$a;
.super Ljava/lang/Object;

# interfaces
.implements Lk2/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/e;->a(Lo2/a;)Lk2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lk2/q<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Li2/k;

.field public final synthetic f:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Li2/k;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lk2/e$a;->e:Li2/k;

    iput-object p2, p0, Lk2/e$a;->f:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lk2/e$a;->e:Li2/k;

    invoke-interface {v0}, Li2/k;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
