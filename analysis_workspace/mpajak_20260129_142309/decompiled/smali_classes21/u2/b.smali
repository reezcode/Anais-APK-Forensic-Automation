.class public abstract Lu2/b;
.super Lu2/a;


# static fields
.field public static final a:Lu2/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu2/a$a;

    invoke-direct {v0}, Lu2/a$a;-><init>()V

    sput-object v0, Lu2/b;->a:Lu2/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lu2/a;-><init>()V

    return-void
.end method
