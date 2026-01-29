.class public final Lw2/b$a$a;
.super Ljava/lang/ThreadLocal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljava/text/DateFormat;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lw2/b$a;


# direct methods
.method public constructor <init>(Lw2/b$a;)V
    .locals 0

    iput-object p1, p0, Lw2/b$a$a;->a:Lw2/b$a;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lw2/b$a$a;->a:Lw2/b$a;

    iget-object v1, v1, Lw2/b$a;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
