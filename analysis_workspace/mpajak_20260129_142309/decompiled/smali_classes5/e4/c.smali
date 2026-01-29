.class public final Le4/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Lf4/f;

.field public final c:Ljava/util/zip/Inflater;

.field public final d:Lf4/o;

.field public final e:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le4/c;->e:Z

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Le4/c;->b:Lf4/f;

    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Le4/c;->c:Ljava/util/zip/Inflater;

    new-instance v1, Lf4/o;

    invoke-direct {v1, p1, v0}, Lf4/o;-><init>(Lf4/a0;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Le4/c;->d:Lf4/o;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Le4/c;->d:Lf4/o;

    invoke-virtual {v0}, Lf4/o;->close()V

    return-void
.end method
