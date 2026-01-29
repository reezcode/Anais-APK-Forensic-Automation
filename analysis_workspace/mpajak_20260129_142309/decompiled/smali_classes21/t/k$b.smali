.class public final Lt/k$b;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Ljava/security/MessageDigest;

.field public final c:Lm0/d$a;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/d$a;

    invoke-direct {v0}, Lm0/d$a;-><init>()V

    iput-object v0, p0, Lt/k$b;->c:Lm0/d$a;

    iput-object p1, p0, Lt/k$b;->b:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final c()Lm0/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lt/k$b;->c:Lm0/d$a;

    return-object v0
.end method
