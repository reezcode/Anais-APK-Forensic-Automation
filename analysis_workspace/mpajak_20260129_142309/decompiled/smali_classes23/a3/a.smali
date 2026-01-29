.class public abstract La3/a;
.super La3/b;

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
        "La3/b<",
        "TT;TID;>;",
        "Lz2/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final g:[Lv2/g;

.field public h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            "[",
            "Lv2/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, La3/b;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;)V

    const/4 p1, 0x0

    iput-object p1, p0, La3/a;->h:Ljava/util/Map;

    iput-object p1, p0, La3/a;->i:Ljava/lang/Object;

    iput-object p1, p0, La3/a;->j:Ljava/lang/Object;

    iput-object p4, p0, La3/a;->g:[Lv2/g;

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/e;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, La3/a;->h:Ljava/util/Map;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    move-object v3, v0

    check-cast v3, Lq2/d;

    iget-object v3, v3, Lq2/d;->d:Lt2/m;

    if-eqz v3, :cond_1

    iget-object v4, v1, La3/b;->c:Lv2/g;

    invoke-virtual {v4, v0, v2}, Lv2/g;->o(Lc3/e;Ljava/util/Map;)Ljava/lang/Object;

    invoke-interface {v3}, Lt2/m;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    return-object v4

    :cond_1
    iget-object v4, v1, La3/b;->a:Ld3/c;

    invoke-virtual {v4}, Ld3/c;->a()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, La3/a;->g:[Lv2/g;

    array-length v6, v5

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    aget-object v9, v5, v7

    iget-object v10, v9, Lv2/g;->e:Lv2/e;

    iget-boolean v10, v10, Lv2/e;->F:Z

    const/4 v11, 0x1

    if-eqz v10, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v9, v0, v2}, Lv2/g;->o(Lc3/e;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_3

    iget-object v15, v1, La3/a;->i:Ljava/lang/Object;

    if-eqz v15, :cond_3

    iget-object v15, v9, Lv2/g;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v15

    iget-object v12, v1, La3/a;->i:Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    if-ne v15, v12, :cond_3

    iget-object v12, v1, La3/a;->j:Ljava/lang/Object;

    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    iget-object v12, v1, La3/a;->i:Ljava/lang/Object;

    invoke-virtual {v9, v4, v12, v11, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9, v4, v10, v13, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    :goto_1
    iget-object v11, v1, La3/b;->c:Lv2/g;

    if-ne v9, v11, :cond_4

    move-object v14, v10

    :cond_4
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    if-eqz v8, :cond_c

    iget-object v0, v1, La3/a;->g:[Lv2/g;

    array-length v12, v0

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v12, :cond_c

    aget-object v11, v0, v15

    iget-object v5, v11, Lv2/g;->e:Lv2/e;

    iget-boolean v6, v5, Lv2/e;->F:Z

    if-eqz v6, :cond_a

    iget-object v9, v11, Lv2/g;->r:Lv2/g;

    if-nez v9, :cond_6

    move-object v13, v11

    move/from16 p1, v12

    const/4 v5, 0x0

    goto/16 :goto_6

    :cond_6
    iget-object v6, v11, Lv2/g;->s:Lt2/a;

    iget-boolean v7, v5, Lv2/e;->G:Z

    if-nez v7, :cond_7

    new-instance v16, Lt2/l;

    iget-object v10, v5, Lv2/e;->I:Ljava/lang/String;

    iget-boolean v8, v5, Lv2/e;->J:Z

    move-object/from16 v5, v16

    move-object v7, v4

    move/from16 v17, v8

    move-object v8, v14

    move-object v13, v11

    move/from16 v11, v17

    invoke-direct/range {v5 .. v11}, Lt2/l;-><init>(Lt2/g;Ljava/lang/Object;Ljava/lang/Object;Lv2/g;Ljava/lang/String;Z)V

    goto :goto_4

    :cond_7
    move-object v13, v11

    sget-object v5, Lv2/g;->u:Lv2/g$a;

    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lv2/g$b;

    iget v5, v11, Lv2/g$b;->c:I

    if-nez v5, :cond_8

    iget-object v7, v13, Lv2/g;->e:Lv2/e;

    iget v7, v7, Lv2/e;->H:I

    iput v7, v11, Lv2/g$b;->d:I

    :cond_8
    iget v7, v11, Lv2/g$b;->d:I

    if-lt v5, v7, :cond_9

    new-instance v16, Lt2/l;

    iget-object v9, v13, Lv2/g;->r:Lv2/g;

    iget-object v5, v13, Lv2/g;->e:Lv2/e;

    iget-object v10, v5, Lv2/e;->I:Ljava/lang/String;

    iget-boolean v11, v5, Lv2/e;->J:Z

    move-object/from16 v5, v16

    move-object v7, v4

    move-object v8, v14

    invoke-direct/range {v5 .. v11}, Lt2/l;-><init>(Lt2/g;Ljava/lang/Object;Ljava/lang/Object;Lv2/g;Ljava/lang/String;Z)V

    :goto_4
    move/from16 p1, v12

    :goto_5
    move-object/from16 v5, v16

    goto :goto_6

    :cond_9
    add-int/lit8 v5, v5, 0x1

    iput v5, v11, Lv2/g$b;->c:I

    :try_start_0
    new-instance v16, Lt2/j;

    iget-object v9, v13, Lv2/g;->r:Lv2/g;

    iget-object v5, v13, Lv2/g;->e:Lv2/e;

    iget-object v10, v5, Lv2/e;->I:Ljava/lang/String;

    iget-boolean v8, v5, Lv2/e;->J:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v5, v16

    move-object v7, v4

    move/from16 v17, v8

    move-object v8, v14

    move/from16 p1, v12

    move-object v12, v11

    move/from16 v11, v17

    :try_start_1
    invoke-direct/range {v5 .. v11}, Lt2/j;-><init>(Lt2/g;Ljava/lang/Object;Ljava/lang/Object;Lv2/g;Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget v5, v12, Lv2/g$b;->c:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v12, Lv2/g$b;->c:I

    goto :goto_5

    :goto_6
    const/4 v6, 0x0

    if-eqz v5, :cond_b

    invoke-virtual {v13, v4, v5, v6, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v12, v11

    :goto_7
    iget v2, v12, Lv2/g$b;->c:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v12, Lv2/g$b;->c:I

    throw v0

    :cond_a
    move/from16 p1, v12

    const/4 v6, 0x0

    :cond_b
    :goto_8
    add-int/lit8 v15, v15, 0x1

    move/from16 v12, p1

    const/4 v13, 0x0

    goto/16 :goto_3

    :cond_c
    if-eqz v3, :cond_d

    if-eqz v14, :cond_d

    invoke-interface {v3}, Lt2/m;->a()V

    :cond_d
    iget-object v0, v1, La3/a;->h:Ljava/util/Map;

    if-nez v0, :cond_e

    iput-object v2, v1, La3/a;->h:Ljava/util/Map;

    :cond_e
    return-object v4
.end method
