.class public final Le4/d$f;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le4/d;->m()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Le4/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le4/d;)V
    .locals 0

    iput-object p2, p0, Le4/d$f;->e:Le4/d;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Le4/d$f;->e:Le4/d;

    iget-object v0, v0, Le4/d;->b:Lw3/e;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lw3/e;->d()V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
