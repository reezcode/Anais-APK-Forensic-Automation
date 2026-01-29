.class public final Lm0/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/a$c;,
        Lm0/a$d;,
        Lm0/a$e;,
        Lm0/a$b;
    }
.end annotation


# static fields
.field public static final a:Lm0/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm0/a$e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/a$a;

    invoke-direct {v0}, Lm0/a$a;-><init>()V

    sput-object v0, Lm0/a;->a:Lm0/a$a;

    return-void
.end method

.method public static a(ILm0/a$b;)Landroidx/core/util/Pools$Pool;
    .locals 2
    .param p1    # Lm0/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm0/a$d;",
            ">(I",
            "Lm0/a$b<",
            "TT;>;)",
            "Landroidx/core/util/Pools$Pool<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    invoke-direct {v0, p0}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    sget-object p0, Lm0/a;->a:Lm0/a$a;

    new-instance v1, Lm0/a$c;

    invoke-direct {v1, v0, p1, p0}, Lm0/a$c;-><init>(Landroidx/core/util/Pools$Pool;Lm0/a$b;Lm0/a$e;)V

    return-object v1
.end method
