.class public final Lw2/a0;
.super Lw2/h0;


# static fields
.field public static final e:Lw2/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/a0;

    invoke-direct {v0}, Lw2/a0;-><init>()V

    sput-object v0, Lw2/a0;->e:Lw2/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-direct {p0, v0}, Lw2/h0;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final h()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, Ljava/lang/String;

    return-object v0
.end method

.method public final n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
