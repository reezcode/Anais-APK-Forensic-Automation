.class public interface abstract Lv/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lv/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/j$a;

    invoke-direct {v0}, Lv/j$a;-><init>()V

    new-instance v1, Lv/j;

    iget-object v0, v0, Lv/j$a;->a:Ljava/util/Map;

    invoke-direct {v1, v0}, Lv/j;-><init>(Ljava/util/Map;)V

    sput-object v1, Lv/h;->a:Lv/j;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
