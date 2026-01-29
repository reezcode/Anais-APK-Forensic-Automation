.class public final Lc3/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lc3/d;

.field public b:I


# direct methods
.method public constructor <init>(Lc3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/a$a;->a:Lc3/d;

    const/4 p1, 0x1

    iput p1, p0, Lc3/a$a;->b:I

    return-void
.end method
