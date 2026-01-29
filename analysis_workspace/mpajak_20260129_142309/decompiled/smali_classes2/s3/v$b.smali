.class public final Ls3/v$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/v$b$a;
    }
.end annotation


# static fields
.field public static final c:Ls3/v$b$a;


# instance fields
.field public final a:Ls3/r;

.field public final b:Ld1/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/v$b$a;

    invoke-direct {v0}, Ls3/v$b$a;-><init>()V

    sput-object v0, Ls3/v$b;->c:Ls3/v$b$a;

    return-void
.end method

.method public constructor <init>(Ls3/r;Ld1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/v$b;->a:Ls3/r;

    iput-object p2, p0, Ls3/v$b;->b:Ld1/f;

    return-void
.end method
