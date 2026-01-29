.class public final Lr3/k;
.super Ljava/lang/Object;


# static fields
.field public static final a:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final b:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final c:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final d:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static e:Lr3/e;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final f:Lr3/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final g:Lr3/i;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v1, 0x186a0

    invoke-static {v0, v1, v2}, Li/g;->D(Ljava/lang/String;J)J

    move-result-wide v0

    sput-wide v0, Lr3/k;->a:J

    sget v0, Lq3/s;->a:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    const-string v1, "kotlinx.coroutines.scheduler.core.pool.size"

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x8

    invoke-static {v1, v0, v2, v3, v4}, Li/g;->C(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lr3/k;->b:I

    const-string v0, "kotlinx.coroutines.scheduler.max.pool.size"

    const v1, 0x1ffffe

    const/4 v4, 0x4

    invoke-static {v0, v1, v3, v1, v4}, Li/g;->C(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lr3/k;->c:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v1, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v4, 0x3c

    invoke-static {v1, v4, v5}, Li/g;->D(Ljava/lang/String;J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lr3/k;->d:J

    sget-object v0, Lr3/e;->b:Lr3/e;

    sput-object v0, Lr3/k;->e:Lr3/e;

    new-instance v0, Lr3/i;

    invoke-direct {v0, v3}, Lr3/i;-><init>(I)V

    sput-object v0, Lr3/k;->f:Lr3/i;

    new-instance v0, Lr3/i;

    invoke-direct {v0, v2}, Lr3/i;-><init>(I)V

    sput-object v0, Lr3/k;->g:Lr3/i;

    return-void
.end method
