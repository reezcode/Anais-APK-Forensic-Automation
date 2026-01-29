.class public final Lh/j;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lh/j$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Lh/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh/j$a;

    invoke-direct {v0}, Lh/j$a;-><init>()V

    sput-object v0, Lh/j;->d:Lh/j$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lh/j;->b:[Ljava/lang/Class;

    const/4 p1, 0x0

    iput-object p1, p0, Lh/j;->c:Lh/g;

    return-void
.end method
