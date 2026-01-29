.class public interface abstract Lkotlin/time/TimeSource;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/time/TimeSource$Monotonic;,
        Lkotlin/time/TimeSource$Companion;
    }
.end annotation

.annotation build Lkotlin/SinceKotlin;
    version = "1.3"
.end annotation

.annotation build Lkotlin/time/ExperimentalTime;
.end annotation


# static fields
.field public static final Companion:Lkotlin/time/TimeSource$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlin/time/TimeSource$Companion;->$$INSTANCE:Lkotlin/time/TimeSource$Companion;

    sput-object v0, Lkotlin/time/TimeSource;->Companion:Lkotlin/time/TimeSource$Companion;

    return-void
.end method


# virtual methods
.method public abstract markNow()Lkotlin/time/TimeMark;
.end method
