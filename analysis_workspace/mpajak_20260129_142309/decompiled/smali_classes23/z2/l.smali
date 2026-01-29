.class public final Lz2/l;
.super Ljava/lang/Object;

# interfaces
.implements Lz2/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lz2/d<",
        "[",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static k:Lx2/c;


# instance fields
.field public final a:Lu2/c;

.field public final b:Ld3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final c:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public d:La3/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La3/f<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public e:La3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:La3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public g:La3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La3/g<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public h:La3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La3/d<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lz2/l;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lz2/l;->k:Lx2/c;

    return-void
.end method

.method public constructor <init>(Lu2/c;Ld3/c;Lt2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Lt2/g<",
            "TT;TID;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/l;->a:Lu2/c;

    iput-object p2, p0, Lz2/l;->b:Ld3/c;

    iput-object p3, p0, Lz2/l;->c:Lt2/g;

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lq2/d;

    iget-object v0, p1, Lq2/d;->a:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Lq2/d;->e(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final b(Lt2/a;Lc3/c;Lz2/g;)Lz2/j;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/a<",
            "TT;TID;>;",
            "Lc3/c;",
            "Lz2/g<",
            "TT;>;",
            "Lt2/m;",
            "I)",
            "Lz2/j<",
            "TT;TID;>;"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v6

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    move-object v4, p3

    check-cast v4, La3/e;

    invoke-virtual {v4, v6, v0}, La3/e;->f(Lc3/d;I)Lc3/b;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v0, Lz2/j;

    iget-object v1, p0, Lz2/l;->b:Ld3/c;

    iget-object v2, v1, Ld3/c;->b:Ljava/lang/Class;

    iget-object v8, v4, La3/b;->d:Ljava/lang/String;

    move-object v1, v0

    move-object v3, p1

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v8}, Lz2/j;-><init>(Ljava/lang/Class;Lt2/g;Lz2/d;Lc3/c;Lc3/d;Lc3/b;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception p1

    move-object v1, p3

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_0

    check-cast v1, Lq2/a;

    invoke-virtual {v1}, Lq2/a;->a()V

    :cond_0
    throw p1
.end method

.method public final c(Lc3/d;Ljava/lang/Object;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "TT;",
            "Lt2/m;",
            ")I"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget-object v0, v1, Lz2/l;->f:La3/c;

    const/4 v3, 0x0

    const/4 v5, 0x0

    if-nez v0, :cond_c

    iget-object v0, v1, Lz2/l;->a:Lu2/c;

    iget-object v7, v1, Lz2/l;->b:Ld3/c;

    sget v6, La3/c;->i:I

    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v8, 0x80

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v8, v7, Ld3/c;->c:Ljava/lang/String;

    const-string v9, "INSERT INTO "

    invoke-static {v0, v6, v9, v8}, La3/b;->c(Lu2/c;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v7, Ld3/c;->d:[Lv2/g;

    array-length v9, v8

    const/4 v10, -0x1

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    aget-object v13, v8, v10

    invoke-static {v0, v13}, La3/c;->g(Lu2/c;Lv2/g;)Z

    move-result v14

    if-eqz v14, :cond_1

    iget-object v13, v13, Lv2/g;->e:Lv2/e;

    iget-boolean v13, v13, Lv2/e;->C:Z

    if-eqz v13, :cond_0

    move v11, v12

    :cond_0
    add-int/lit8 v12, v12, 0x1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    new-array v9, v12, [Lv2/g;

    if-nez v12, :cond_3

    move-object v8, v0

    check-cast v8, Lu2/b;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "DEFAULT VALUES"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_3
    const/16 v8, 0x28

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v8, v7, Ld3/c;->d:[Lv2/g;

    array-length v10, v8

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    :goto_1
    const-string v15, ","

    if-ge v12, v10, :cond_6

    aget-object v4, v8, v12

    invoke-static {v0, v4}, La3/c;->g(Lu2/c;Lv2/g;)Z

    move-result v16

    if-nez v16, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v13, :cond_5

    const/4 v13, 0x0

    goto :goto_2

    :cond_5
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-static {v0, v6, v4}, La3/b;->b(Lu2/c;Ljava/lang/StringBuilder;Lv2/g;)V

    add-int/lit8 v15, v14, 0x1

    aput-object v4, v9, v14

    move v14, v15

    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_6
    const-string v4, ") VALUES ("

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v7, Ld3/c;->d:[Lv2/g;

    array-length v8, v4

    const/4 v10, 0x0

    const/4 v12, 0x1

    :goto_4
    if-ge v10, v8, :cond_9

    aget-object v13, v4, v10

    invoke-static {v0, v13}, La3/c;->g(Lu2/c;Lv2/g;)Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_6

    :cond_7
    if-eqz v12, :cond_8

    const/4 v12, 0x0

    goto :goto_5

    :cond_8
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    const-string v13, "?"

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_9
    const-string v4, ")"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_7
    iget-object v4, v7, Ld3/c;->f:Lv2/g;

    if-nez v4, :cond_a

    goto :goto_8

    :cond_a
    iget-object v4, v4, Lv2/g;->h:Ljava/lang/String;

    if-nez v4, :cond_b

    :goto_8
    move-object v10, v3

    goto :goto_9

    :cond_b
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ""

    move-object v10, v0

    :goto_9
    new-instance v0, La3/c;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, La3/c;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;Ljava/lang/String;I)V

    iput-object v0, v1, Lz2/l;->f:La3/c;

    :cond_c
    iget-object v4, v1, Lz2/l;->f:La3/c;

    iget-object v0, v1, Lz2/l;->a:Lu2/c;

    const-string v6, "insert arguments: {}"

    iget-object v7, v4, La3/b;->c:Lv2/g;

    if-eqz v7, :cond_10

    iget-object v8, v7, Lv2/g;->e:Lv2/e;

    iget-boolean v8, v8, Lv2/e;->z:Z

    if-eqz v8, :cond_d

    invoke-virtual {v7, v2}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Lv2/g;->l(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    const/4 v7, 0x0

    goto :goto_a

    :cond_d
    const/4 v7, 0x1

    :goto_a
    iget-object v8, v4, La3/b;->c:Lv2/g;

    invoke-virtual {v8}, Lv2/g;->n()Z

    move-result v8

    if-eqz v8, :cond_e

    iget-object v8, v4, La3/b;->c:Lv2/g;

    iget-boolean v9, v8, Lv2/g;->g:Z

    if-eqz v9, :cond_e

    if-eqz v7, :cond_10

    iget-object v0, v8, Lv2/g;->l:Lv2/a;

    invoke-interface {v0}, Lv2/a;->q()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v2, v0, v5, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    goto :goto_b

    :cond_e
    iget-object v8, v4, La3/b;->c:Lv2/g;

    invoke-virtual {v8}, Lv2/g;->m()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget-object v0, v4, La3/b;->c:Lv2/g;

    iget-boolean v0, v0, Lv2/g;->g:Z

    if-eqz v0, :cond_10

    if-eqz v7, :cond_10

    new-instance v0, La3/c$a;

    invoke-direct {v0}, La3/c$a;-><init>()V

    goto :goto_c

    :cond_10
    :goto_b
    move-object v0, v3

    :goto_c
    :try_start_0
    iget-object v7, v4, La3/b;->a:Ld3/c;

    iget-boolean v8, v7, Ld3/c;->h:Z

    if-eqz v8, :cond_13

    iget-object v7, v7, Ld3/c;->d:[Lv2/g;

    array-length v8, v7

    const/4 v9, 0x0

    :goto_d
    if-ge v9, v8, :cond_13

    aget-object v10, v7, v9

    iget-object v11, v10, Lv2/g;->e:Lv2/e;

    iget-boolean v11, v11, Lv2/e;->B:Z

    if-nez v11, :cond_11

    goto :goto_e

    :cond_11
    invoke-virtual {v10, v2}, Lv2/g;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_12

    iget-object v12, v10, Lv2/g;->p:Lv2/g;

    invoke-virtual {v12, v11}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v12, v13}, Lv2/g;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    iget-object v10, v10, Lv2/g;->s:Lt2/a;

    invoke-virtual {v10, v11}, Lt2/a;->n(Ljava/lang/Object;)I

    :cond_12
    :goto_e
    add-int/lit8 v9, v9, 0x1

    goto :goto_d

    :cond_13
    invoke-virtual {v4, v2}, La3/b;->e(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    iget v8, v4, La3/c;->h:I

    if-ltz v8, :cond_15

    aget-object v9, v7, v8

    if-nez v9, :cond_15

    iget-object v9, v4, La3/b;->e:[Lv2/g;

    aget-object v8, v9, v8

    iget-object v9, v8, Lv2/g;->l:Lv2/a;

    if-nez v9, :cond_14

    move-object v9, v3

    goto :goto_f

    :cond_14
    invoke-interface {v9, v3}, Lv2/a;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    :goto_f
    iget v10, v4, La3/c;->h:I

    invoke-virtual {v8, v9}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v7, v10
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_10

    :cond_15
    move-object v9, v3

    :goto_10
    :try_start_1
    iget-object v8, v4, La3/b;->d:Ljava/lang/String;

    iget-object v10, v4, La3/b;->e:[Lv2/g;

    move-object/from16 v11, p1

    check-cast v11, Lq2/c;

    invoke-virtual {v11, v8, v7, v10, v0}, Lq2/c;->c(Ljava/lang/String;[Ljava/lang/Object;[Lv2/g;Lc3/f;)V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    sget-object v8, La3/b;->f:Lx2/c;

    const-string v10, "insert data with statement \'{}\' and {} args, changed {} rows"

    iget-object v11, v4, La3/b;->d:Ljava/lang/String;

    array-length v12, v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/4 v13, 0x1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v10, v11, v12, v13}, Lx2/c;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v8, v7

    if-lez v8, :cond_16

    sget-object v8, La3/b;->f:Lx2/c;

    invoke-virtual {v8, v6, v7}, Lx2/c;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_16
    if-eqz v9, :cond_17

    iget-object v6, v4, La3/b;->e:[Lv2/g;

    iget v7, v4, La3/c;->h:I

    aget-object v6, v6, v7

    invoke-virtual {v6, v2, v9, v5, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    :cond_17
    if-eqz v0, :cond_1a

    iget-object v0, v0, La3/c$a;->a:Ljava/lang/Number;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-eqz v3, :cond_18

    const-string v3, "keyholder"

    invoke-virtual {v4, v2, v0, v3}, La3/c;->f(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;)V

    goto :goto_11

    :cond_18
    new-instance v0, Ljava/sql/SQLException;

    const-string v3, "generated-id key must not be 0 value"

    invoke-direct {v0, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/sql/SQLException;

    const-string v3, "generated-id key was not set by the update call"

    invoke-direct {v0, v3}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    :goto_11
    return-void

    :catch_0
    move-exception v0

    sget-object v3, La3/b;->f:Lx2/c;

    const-string v5, "insert data with statement \'{}\' and {} args, threw exception: {}"

    iget-object v8, v4, La3/b;->d:Ljava/lang/String;

    array-length v9, v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v3, v5, v8, v9, v0}, Lx2/c;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v3, v7

    if-lez v3, :cond_1b

    sget-object v3, La3/b;->f:Lx2/c;

    invoke-virtual {v3, v6, v7}, Lx2/c;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1b
    throw v0
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to run insert stmt on object "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v4, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0
.end method

.method public final d(Lc3/d;Ljava/lang/Object;Lt2/m;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "TT;",
            "Lt2/m;",
            ")I"
        }
    .end annotation

    iget-object p3, p0, Lz2/l;->h:La3/d;

    if-nez p3, :cond_1

    iget-object p3, p0, Lz2/l;->a:Lu2/c;

    iget-object v0, p0, Lz2/l;->b:Ld3/c;

    sget v1, La3/d;->g:I

    iget-object v1, v0, Ld3/c;->f:Lv2/g;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x40

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v3, v0, Ld3/c;->c:Ljava/lang/String;

    const-string v4, "DELETE FROM "

    invoke-static {p3, v2, v4, v3}, La3/b;->c(Lu2/c;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p3, v1, v2}, La3/b;->d(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;)V

    new-instance p3, La3/d;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lv2/g;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-direct {p3, v0, v2, v3}, La3/d;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;)V

    iput-object p3, p0, Lz2/l;->h:La3/d;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "Cannot delete from "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object p3, v0, Ld3/c;->b:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " because it doesn\'t have an id field"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object p3, p0, Lz2/l;->h:La3/d;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p3, p2}, La3/b;->e(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p3, La3/b;->d:Ljava/lang/String;

    iget-object v2, p3, La3/b;->e:[Lv2/g;

    check-cast p1, Lq2/c;

    const-string v3, "deleted"

    invoke-virtual {p1, v1, v0, v2, v3}, Lq2/c;->f(Ljava/lang/String;[Ljava/lang/Object;[Lv2/g;Ljava/lang/String;)I

    move-result p1

    sget-object v1, La3/b;->f:Lx2/c;

    const-string v2, "delete data with statement \'{}\' and {} args, changed {} rows"

    iget-object v3, p3, La3/b;->d:Ljava/lang/String;

    array-length v4, v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lx2/c;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v1, v0

    if-lez v1, :cond_2

    sget-object v1, La3/b;->f:Lx2/c;

    const-string v2, "delete arguments: {}"

    invoke-virtual {v1, v2, v0}, Lx2/c;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to run delete stmt on object "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p3, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

.method public final e(Lc3/d;Ljava/lang/Object;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "TID;)Z"
        }
    .end annotation

    iget-object v0, p0, Lz2/l;->j:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    new-instance v0, Lz2/h;

    iget-object v3, p0, Lz2/l;->a:Lu2/c;

    iget-object v4, p0, Lz2/l;->b:Ld3/c;

    iget-object v5, p0, Lz2/l;->c:Lt2/g;

    invoke-direct {v0, v3, v4, v5}, Lz2/h;-><init>(Lu2/c;Ld3/c;Lt2/g;)V

    const-string v3, "COUNT(*)"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lz2/h;->j:Ljava/util/ArrayList;

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lz2/h;->j:Ljava/util/ArrayList;

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v3, v4

    iget-object v6, v0, Lz2/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v3

    iget-object v4, p0, Lz2/l;->b:Ld3/c;

    iget-object v4, v4, Ld3/c;->f:Lv2/g;

    iget-object v4, v4, Lv2/g;->d:Ljava/lang/String;

    new-instance v5, Lz2/i;

    invoke-direct {v5}, Lz2/i;-><init>()V

    invoke-virtual {v3, v4, v5}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Lz2/k;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lz2/l;->j:Ljava/lang/String;

    iget-object v0, p0, Lz2/l;->b:Ld3/c;

    iget-object v0, v0, Ld3/c;->f:Lv2/g;

    :cond_2
    iget-object v0, p0, Lz2/l;->j:Ljava/lang/String;

    new-array v3, v2, [Ljava/lang/Object;

    aput-object p2, v3, v1

    check-cast p1, Lq2/c;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p2, 0x0

    :try_start_0
    iget-object v4, p1, Lq2/c;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1, v3}, Lq2/c;->e([Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/16 v5, 0x8

    if-lt v4, v5, :cond_3

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    const/4 v5, 0x0

    :goto_1
    array-length v6, v3

    if-ge v5, v6, :cond_3

    aget-object v6, v3, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    goto :goto_2

    :cond_4
    move-wide v6, v4

    :goto_2
    sget-object v3, Lq2/c;->d:Lx2/c;

    const-string v8, "{}: query for long raw query returned {}: {}"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v8, p1, v9, v0}, Lx2/c;->i(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    sget-object p1, Lz2/l;->k:Lx2/c;

    iget-object p2, p0, Lz2/l;->j:Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v3, "query of \'{}\' returned {}"

    invoke-virtual {p1, v3, p2, v0}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    cmp-long p1, v6, v4

    if-eqz p1, :cond_5

    const/4 v1, 0x1

    :cond_5
    return v1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryForLong from database failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    if-eqz p2, :cond_6

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    :cond_6
    throw p1
.end method

.method public final f(Lc3/d;)J
    .locals 5

    iget-object v0, p0, Lz2/l;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "SELECT COUNT(*) FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz2/l;->a:Lu2/c;

    iget-object v2, p0, Lz2/l;->b:Ld3/c;

    iget-object v2, v2, Ld3/c;->c:Ljava/lang/String;

    check-cast v1, Lu2/a;

    invoke-virtual {v1, v0, v2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lz2/l;->i:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lz2/l;->i:Ljava/lang/String;

    check-cast p1, Lq2/c;

    invoke-virtual {p1, v0}, Lq2/c;->d(Ljava/lang/String;)J

    move-result-wide v0

    sget-object p1, Lz2/l;->k:Lx2/c;

    iget-object v2, p0, Lz2/l;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "query of \'{}\' returned {}"

    invoke-virtual {p1, v4, v2, v3}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-wide v0
.end method

.method public final g(Lc3/d;Lz2/g;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "Lz2/g<",
            "TT;>;",
            "Lt2/m;",
            ")TT;"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, La3/e;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, La3/e;->f(Lc3/d;I)Lc3/b;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    move-object v1, p1

    check-cast v1, Lq2/a;

    invoke-virtual {v1}, Lq2/a;->e()Lc3/e;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    move-object v2, v1

    check-cast v2, Lq2/d;

    invoke-virtual {v2}, Lq2/d;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v0, Lz2/l;->k:Lx2/c;

    const-string v3, "query-for-first of \'{}\' returned at least 1 result"

    move-object v4, p2

    check-cast v4, La3/e;

    iget-object v4, v4, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Lx2/c;->b(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p2, La3/a;

    invoke-virtual {p2, v1}, La3/a;->a(Lc3/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Lq2/d;->a()V

    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    return-object p2

    :cond_0
    :try_start_2
    sget-object v3, Lz2/l;->k:Lx2/c;

    const-string v4, "query-for-first of \'{}\' returned at 0 results"

    check-cast p2, La3/e;

    iget-object p2, p2, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v3, v4, p2}, Lx2/c;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v2}, Lq2/d;->a()V

    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    return-object v0

    :catchall_0
    move-exception p2

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p2

    :goto_0
    if-eqz v0, :cond_1

    check-cast v0, Lq2/d;

    invoke-virtual {v0}, Lq2/d;->a()V

    :cond_1
    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    throw p2
.end method

.method public final h(Lc3/d;Lz2/g;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "Lz2/g<",
            "TT;>;)J"
        }
    .end annotation

    move-object v0, p2

    check-cast v0, La3/e;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, La3/e;->f(Lc3/d;I)Lc3/b;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_0
    move-object v1, p1

    check-cast v1, Lq2/a;

    invoke-virtual {v1}, Lq2/a;->e()Lc3/e;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq2/d;

    invoke-virtual {v1}, Lq2/d;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Lq2/d;->d(I)J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lq2/d;->a()V

    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    return-wide v2

    :cond_0
    :try_start_1
    new-instance v1, Ljava/sql/SQLException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No result found in queryForLong: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p2, La3/e;

    iget-object p2, p2, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p2

    if-eqz v0, :cond_1

    check-cast v0, Lq2/d;

    invoke-virtual {v0}, Lq2/d;->a()V

    :cond_1
    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    throw p2
.end method

.method public final i(Lc3/d;Ljava/lang/Object;Lt2/m;)I
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "TT;",
            "Lt2/m;",
            ")I"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget-object v0, v1, Lz2/l;->g:La3/g;

    if-nez v0, :cond_e

    iget-object v0, v1, Lz2/l;->a:Lu2/c;

    iget-object v4, v1, Lz2/l;->b:Ld3/c;

    sget v3, La3/g;->i:I

    iget-object v3, v4, Ld3/c;->f:Lv2/g;

    if-eqz v3, :cond_d

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x40

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v6, v4, Ld3/c;->c:Ljava/lang/String;

    const-string v7, "UPDATE "

    invoke-static {v0, v5, v7, v6}, La3/b;->c(Lu2/c;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v4, Ld3/c;->d:[Lv2/g;

    array-length v7, v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v7, :cond_4

    aget-object v12, v6, v10

    if-eq v12, v3, :cond_1

    iget-object v13, v12, Lv2/g;->e:Lv2/e;

    iget-boolean v14, v13, Lv2/e;->F:Z

    if-nez v14, :cond_1

    iget-boolean v13, v13, Lv2/e;->E:Z

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    const/4 v13, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v13, 0x0

    :goto_2
    if-eqz v13, :cond_3

    iget-object v13, v12, Lv2/g;->e:Lv2/e;

    iget-boolean v13, v13, Lv2/e;->C:Z

    if-eqz v13, :cond_2

    move v9, v11

    move-object v8, v12

    :cond_2
    add-int/lit8 v11, v11, 0x1

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_4
    add-int/lit8 v11, v11, 0x1

    if-eqz v8, :cond_5

    add-int/lit8 v11, v11, 0x1

    :cond_5
    new-array v6, v11, [Lv2/g;

    iget-object v7, v4, Ld3/c;->d:[Lv2/g;

    array-length v10, v7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    :goto_3
    const-string v14, "= ?"

    if-ge v11, v10, :cond_b

    aget-object v15, v7, v11

    if-eq v15, v3, :cond_7

    move-object/from16 p3, v7

    iget-object v7, v15, Lv2/g;->e:Lv2/e;

    move/from16 v16, v10

    iget-boolean v10, v7, Lv2/e;->F:Z

    if-nez v10, :cond_8

    iget-boolean v7, v7, Lv2/e;->E:Z

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move-object/from16 p3, v7

    move/from16 v16, v10

    :cond_8
    :goto_4
    const/4 v7, 0x0

    :goto_5
    if-nez v7, :cond_9

    goto :goto_7

    :cond_9
    if-eqz v13, :cond_a

    const-string v7, "SET "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    const-string v7, ", "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_6
    invoke-static {v0, v5, v15}, La3/b;->b(Lu2/c;Ljava/lang/StringBuilder;Lv2/g;)V

    add-int/lit8 v7, v12, 0x1

    aput-object v15, v6, v12

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v12, v7

    :goto_7
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v7, p3

    move/from16 v10, v16

    goto :goto_3

    :cond_b
    const/16 v7, 0x20

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0, v3, v5}, La3/b;->d(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;)V

    add-int/lit8 v7, v12, 0x1

    aput-object v3, v6, v12

    if-eqz v8, :cond_c

    const-string v3, " AND "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v5, v8}, La3/b;->b(Lu2/c;Ljava/lang/StringBuilder;Lv2/g;)V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aput-object v8, v6, v7

    :cond_c
    new-instance v0, La3/g;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v3, v0

    move-object v7, v8

    move v8, v9

    invoke-direct/range {v3 .. v8}, La3/g;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;Lv2/g;I)V

    iput-object v0, v1, Lz2/l;->g:La3/g;

    goto :goto_8

    :cond_d
    new-instance v0, Ljava/sql/SQLException;

    const-string v2, "Cannot update "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Ld3/c;->b:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " because it doesn\'t have an id field"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_8
    iget-object v3, v1, Lz2/l;->g:La3/g;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v3, La3/b;->e:[Lv2/g;

    array-length v0, v0

    const/4 v4, 0x1

    if-gt v0, v4, :cond_f

    const/4 v0, 0x0

    goto :goto_b

    :cond_f
    invoke-virtual {v3, v2}, La3/b;->e(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v4, v3, La3/g;->g:Lv2/g;

    if-eqz v4, :cond_11

    invoke-virtual {v4, v2}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v3, La3/g;->g:Lv2/g;

    iget-object v5, v5, Lv2/g;->l:Lv2/a;

    if-nez v5, :cond_10

    const/4 v4, 0x0

    goto :goto_9

    :cond_10
    invoke-interface {v5, v4}, Lv2/a;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_9
    iget v5, v3, La3/g;->h:I

    iget-object v6, v3, La3/g;->g:Lv2/g;

    invoke-virtual {v6, v4}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v0, v5

    goto :goto_a

    :cond_11
    const/4 v4, 0x0

    :goto_a
    iget-object v5, v3, La3/b;->d:Ljava/lang/String;

    iget-object v6, v3, La3/b;->e:[Lv2/g;

    move-object/from16 v7, p1

    check-cast v7, Lq2/c;

    const-string v8, "updated"

    invoke-virtual {v7, v5, v0, v6, v8}, Lq2/c;->f(Ljava/lang/String;[Ljava/lang/Object;[Lv2/g;Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_12

    if-eqz v4, :cond_12

    iget-object v6, v3, La3/g;->g:Lv2/g;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {v6, v2, v4, v8, v7}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    :cond_12
    sget-object v4, La3/b;->f:Lx2/c;

    const-string v6, "update data with statement \'{}\' and {} args, changed {} rows"

    iget-object v7, v3, La3/b;->d:Ljava/lang/String;

    array-length v8, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v4, v6, v7, v8, v9}, Lx2/c;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v4, v0

    if-lez v4, :cond_13

    sget-object v4, La3/b;->f:Lx2/c;

    const-string v6, "update arguments: {}"

    invoke-virtual {v4, v6, v0}, Lx2/c;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_13
    move v0, v5

    :goto_b
    return v0

    :catch_0
    move-exception v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unable to run update stmt on object "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v3, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0
.end method
