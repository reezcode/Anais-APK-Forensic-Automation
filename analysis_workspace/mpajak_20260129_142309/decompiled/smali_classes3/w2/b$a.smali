.class public final Lw2/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lw2/b$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw2/b$a$a;

    invoke-direct {v0, p0}, Lw2/b$a$a;-><init>(Lw2/b$a;)V

    iput-object v0, p0, Lw2/b$a;->a:Lw2/b$a$a;

    iput-object p1, p0, Lw2/b$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/text/DateFormat;
    .locals 1

    iget-object v0, p0, Lw2/b$a;->a:Lw2/b$a$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw2/b$a;->b:Ljava/lang/String;

    return-object v0
.end method
