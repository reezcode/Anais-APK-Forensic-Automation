.class public final Lz0/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final c:Lg3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg3/a;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, La1/b;->b()La1/b;

    move-result-object v0

    invoke-virtual {v0}, La1/b;->a()Lg3/a;

    move-result-object v0

    sput-object v0, Lz0/k;->c:Lg3/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lz0/k;->c:Lg3/a;

    iget-object v0, v0, Lg3/a;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lz0/k;->b:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x7f

    if-gt v0, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    iget-boolean v0, p0, Lz0/k;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_0
    return-void
.end method
