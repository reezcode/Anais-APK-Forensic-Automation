.class public final Ll0/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ll0/e$a;

.field public static final b:Ll0/e$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll0/e$a;

    invoke-direct {v0}, Ll0/e$a;-><init>()V

    sput-object v0, Ll0/e;->a:Ll0/e$a;

    new-instance v0, Ll0/e$b;

    invoke-direct {v0}, Ll0/e$b;-><init>()V

    sput-object v0, Ll0/e;->b:Ll0/e$b;

    return-void
.end method
