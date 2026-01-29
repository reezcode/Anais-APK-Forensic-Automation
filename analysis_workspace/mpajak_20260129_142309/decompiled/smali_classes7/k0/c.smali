.class public final Lk0/c;
.super Ljava/lang/Object;

# interfaces
.implements Lp/f;


# static fields
.field public static final b:Lk0/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/c;

    invoke-direct {v0}, Lk0/c;-><init>()V

    sput-object v0, Lk0/c;->b:Lk0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 0
    .param p1    # Ljava/security/MessageDigest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
