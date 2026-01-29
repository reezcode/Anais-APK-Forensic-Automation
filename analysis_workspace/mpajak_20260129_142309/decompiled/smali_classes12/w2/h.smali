.class public final Lw2/h;
.super Lw2/g;


# static fields
.field public static final e:Lw2/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/h;

    invoke-direct {v0}, Lw2/h;-><init>()V

    sput-object v0, Lw2/h;->e:Lw2/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/g;-><init>([Ljava/lang/Class;)V

    return-void
.end method
