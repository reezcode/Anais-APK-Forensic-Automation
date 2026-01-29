.class public final Lz3/f$g;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz3/f;->s(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lz3/f;

.field public final synthetic f:I

.field public final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f;IJ)V
    .locals 0

    iput-object p2, p0, Lz3/f$g;->e:Lz3/f;

    iput p3, p0, Lz3/f$g;->f:I

    iput-wide p4, p0, Lz3/f$g;->g:J

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lz3/f$g;->e:Lz3/f;

    iget-object v0, v0, Lz3/f;->z:Lz3/r;

    iget v1, p0, Lz3/f$g;->f:I

    iget-wide v2, p0, Lz3/f$g;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lz3/r;->p(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lz3/f$g;->e:Lz3/f;

    invoke-static {v1, v0}, Lz3/f;->a(Lz3/f;Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
