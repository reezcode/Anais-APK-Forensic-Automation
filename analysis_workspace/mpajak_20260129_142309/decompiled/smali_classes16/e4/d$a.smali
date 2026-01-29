.class public final Le4/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:Lf4/i;

.field public final c:J


# direct methods
.method public constructor <init>(ILf4/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le4/d$a;->a:I

    iput-object p2, p0, Le4/d$a;->b:Lf4/i;

    const-wide/32 p1, 0xea60

    iput-wide p1, p0, Le4/d$a;->c:J

    return-void
.end method
