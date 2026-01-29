.class public Lt/d;
.super Ljava/lang/Object;

# interfaces
.implements Lt/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/d$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lt/d$a;


# direct methods
.method public constructor <init>(Lt/d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xfa00000

    iput-wide v0, p0, Lt/d;->a:J

    iput-object p1, p0, Lt/d;->b:Lt/d$a;

    return-void
.end method
