.class public final Le4/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Lf4/f;

.field public final c:Ljava/util/zip/Deflater;

.field public final d:Lf4/j;

.field public final e:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le4/a;->e:Z

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Le4/a;->b:Lf4/f;

    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object v0, p0, Le4/a;->c:Ljava/util/zip/Deflater;

    new-instance v1, Lf4/j;

    invoke-direct {v1, p1, v0}, Lf4/j;-><init>(Lf4/y;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, Le4/a;->d:Lf4/j;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Le4/a;->d:Lf4/j;

    invoke-virtual {v0}, Lf4/j;->close()V

    return-void
.end method
