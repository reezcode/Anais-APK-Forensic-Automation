.class public final Lv/w$a;
.super Ljava/lang/Object;

# interfaces
.implements Lv/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv/p<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field public static final a:Lv/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/w$a<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/w$a;

    invoke-direct {v0}, Lv/w$a;-><init>()V

    sput-object v0, Lv/w$a;->a:Lv/w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lv/s;)Lv/o;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/s;",
            ")",
            "Lv/o<",
            "TModel;TModel;>;"
        }
    .end annotation

    sget-object p1, Lv/w;->a:Lv/w;

    return-object p1
.end method
