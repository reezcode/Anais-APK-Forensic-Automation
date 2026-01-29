.class public final Lkotlin/collections/ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;
.implements Lkotlin/jvm/internal/markers/KMappedMarker;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/collections/ArraysKt___ArraysKt;->asIterable([J)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Long;",
        ">;",
        "Lkotlin/jvm/internal/markers/KMappedMarker;"
    }
.end annotation


# instance fields
.field public final synthetic $this_asIterable$inlined:[J


# direct methods
.method public constructor <init>([J)V
    .locals 0

    iput-object p1, p0, Lkotlin/collections/ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5;->$this_asIterable$inlined:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/collections/ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5;->$this_asIterable$inlined:[J

    invoke-static {v0}, Lkotlin/jvm/internal/ArrayIteratorsKt;->iterator([J)Lkotlin/collections/LongIterator;

    move-result-object v0

    return-object v0
.end method
