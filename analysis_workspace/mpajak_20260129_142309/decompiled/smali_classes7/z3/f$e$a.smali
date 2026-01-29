.class public final Lz3/f$e$a;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz3/f$e;->d(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lz3/f$e;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f$e;II)V
    .locals 0

    iput-object p2, p0, Lz3/f$e$a;->e:Lz3/f$e;

    iput p3, p0, Lz3/f$e$a;->f:I

    iput p4, p0, Lz3/f$e$a;->g:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    iget-object v0, p0, Lz3/f$e$a;->e:Lz3/f$e;

    iget-object v0, v0, Lz3/f$e;->c:Lz3/f;

    iget v1, p0, Lz3/f$e$a;->f:I

    iget v2, p0, Lz3/f$e$a;->g:I

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lz3/f;->q(ZII)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
