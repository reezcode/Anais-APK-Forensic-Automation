.class public final Lz3/g;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/f$e;

.field public final synthetic f:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f$e;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    iput-object p2, p0, Lz3/g;->e:Lz3/f$e;

    iput-object p3, p0, Lz3/g;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, Lz3/g;->e:Lz3/f$e;

    iget-object v0, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v0, Lz3/f;->c:Lz3/f$d;

    iget-object v2, p0, Lz3/g;->f:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lz3/u;

    invoke-virtual {v1, v0, v2}, Lz3/f$d;->a(Lz3/f;Lz3/u;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
