.class public abstract Lc3/a;
.super Ljava/lang/Object;

# interfaces
.implements Lc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/a$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lc3/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public final a()Lc3/d;
    .locals 1

    iget-object v0, p0, Lc3/a;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc3/a$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lc3/a$a;->a:Lc3/d;

    return-object v0
.end method
