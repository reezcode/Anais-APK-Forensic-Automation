.class public final Ld3/d;
.super Ljava/lang/Object;


# static fields
.field public static a:Lx2/c;

.field public static final b:[Lv2/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Ld3/d;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Ld3/d;->a:Lx2/c;

    const/4 v0, 0x0

    new-array v0, v0, [Lv2/g;

    sput-object v0, Ld3/d;->b:[Lv2/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lu2/c;Ld3/c;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p1, Ld3/c;->d:[Lv2/g;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v1, v4

    if-eqz p3, :cond_0

    invoke-virtual {v5}, Lv2/g;->k()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lv2/g;->h()Ljava/lang/String;

    move-result-object v6

    :goto_1
    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-nez v7, :cond_2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v5, v5, Lv2/g;->d:Ljava/lang/String;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x80

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    sget-object v4, Ld3/d;->a:Lx2/c;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p1, Ld3/c;->c:Ljava/lang/String;

    const-string v7, "creating index \'{}\' for table \'{}"

    invoke-virtual {v4, v7, v5, v6}, Lx2/c;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "CREATE "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_4

    const-string v4, "UNIQUE "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const-string v4, "INDEX "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "IF NOT EXISTS "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object v5, p0

    check-cast v5, Lu2/a;

    invoke-virtual {v5, v1, v4}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v4, " ON "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Ld3/c;->c:Ljava/lang/String;

    invoke-virtual {v5, v1, v4}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v4, " ( "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x1

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v4, :cond_5

    const/4 v4, 0x0

    goto :goto_5

    :cond_5
    const-string v7, ", "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    invoke-virtual {v5, v1, v6}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    const-string v2, " )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static b(Lc3/c;Ljava/lang/Class;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc3/c;",
            "Ljava/lang/Class<",
            "TT;>;)I"
        }
    .end annotation

    invoke-static {p0, p1}, Lt2/h;->a(Lc3/c;Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    instance-of v1, v0, Lt2/a;

    if-eqz v1, :cond_0

    check-cast v0, Lt2/a;

    iget-object p1, v0, Lt2/a;->g:Ld3/c;

    invoke-static {p0, p1}, Ld3/d;->c(Lc3/c;Ld3/c;)I

    move-result p0

    goto :goto_0

    :cond_0
    new-instance v0, Ld3/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Ld3/c;-><init>(Lc3/c;Lt2/a;Ljava/lang/Class;)V

    invoke-static {p0, v0}, Ld3/d;->c(Lc3/c;Ld3/c;)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static c(Lc3/c;Ld3/c;)I
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lc3/c;",
            "Ld3/c<",
            "TT;TID;>;Z)I"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lq2/b;

    iget-object v2, v1, Lq2/b;->d:Lu2/d;

    sget-object v3, Ld3/d;->a:Lx2/c;

    iget-object v7, v0, Ld3/c;->c:Ljava/lang/String;

    sget-object v4, Lx2/b$a;->e:Lx2/b$a;

    sget-object v9, Lx2/c;->b:Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "creating table \'{}\'"

    const/4 v10, 0x0

    move-object v8, v9

    invoke-virtual/range {v3 .. v10}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x100

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "CREATE TABLE "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "IF NOT EXISTS "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Ld3/c;->c:Ljava/lang/String;

    invoke-virtual {v2, v5, v6}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v6, " ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, v0, Ld3/c;->d:[Lv2/g;

    array-length v10, v9

    const/4 v11, 0x0

    const/4 v12, 0x1

    :goto_0
    const-string v13, ", "

    if-ge v11, v10, :cond_e

    aget-object v14, v9, v11

    iget-object v15, v14, Lv2/g;->e:Lv2/e;

    iget-boolean v15, v15, Lv2/e;->F:Z

    if-eqz v15, :cond_0

    move-object/from16 v18, v4

    move-object/from16 p0, v9

    move/from16 v16, v10

    goto/16 :goto_9

    :cond_0
    if-eqz v12, :cond_1

    const/4 v12, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    iget-object v13, v14, Lv2/g;->e:Lv2/e;

    iget-object v13, v13, Lv2/e;->A:Ljava/lang/String;

    const/16 v15, 0x20

    if-nez v13, :cond_c

    iget-object v13, v14, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v5, v13}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v13, v14, Lv2/g;->l:Lv2/a;

    iget-object v15, v14, Lv2/g;->e:Lv2/e;

    iget v15, v15, Lv2/e;->f:I

    if-nez v15, :cond_2

    invoke-interface {v13}, Lv2/a;->n()I

    :cond_2
    invoke-interface {v13}, Lv2/f;->s()I

    move-result v15

    invoke-static {v15}, Lf/h;->a(I)I

    move-result v15

    move-object/from16 p0, v9

    const-string v9, "INTEGER"

    move/from16 v16, v10

    const-string v10, "BLOB"

    move/from16 v17, v12

    const-string v12, "SMALLINT"

    move-object/from16 v18, v4

    const-string v4, "VARCHAR"

    packed-switch v15, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown SQL-type "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v13}, Lv2/f;->s()I

    move-result v2

    invoke-static {v2}, Landroidx/appcompat/view/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    const-string v4, "NUMERIC"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_2
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_3
    const-string v4, "DOUBLE PRECISION"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_4
    const-string v4, "FLOAT"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_5
    invoke-virtual {v14}, Lv2/g;->i()I

    move-result v4

    const/16 v10, 0xa

    if-ne v4, v10, :cond_3

    iget-boolean v4, v14, Lv2/g;->g:Z

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v9, "BIGINT"

    :goto_2
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_6
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_7
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_8
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_9
    const-string v4, "TINYINT"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_a
    const-string v4, "CHAR"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_b
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_c
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_d
    const-string v4, "TEXT"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_e
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    const/16 v4, 0x20

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Lv2/g;->m()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v14}, Lv2/g;->n()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/sql/SQLException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GeneratedIdSequence is not supported by database "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Android SQLite"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_4
    iget-boolean v4, v14, Lv2/g;->g:Z

    if-eqz v4, :cond_8

    invoke-virtual {v14}, Lv2/g;->n()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v14}, Lv2/g;->i()I

    move-result v4

    const/16 v9, 0x9

    if-eq v4, v9, :cond_7

    invoke-virtual {v14}, Lv2/g;->i()I

    move-result v4

    const/16 v9, 0xa

    if-ne v4, v9, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sqlite requires that auto-increment generated-id be integer or long type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_5
    const-string v4, "PRIMARY KEY AUTOINCREMENT "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-boolean v4, v14, Lv2/g;->g:Z

    if-nez v4, :cond_d

    iget-object v4, v14, Lv2/g;->m:Ljava/lang/Object;

    if-eqz v4, :cond_a

    const-string v9, "DEFAULT "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v14, Lv2/g;->l:Lv2/a;

    invoke-interface {v9}, Lv2/a;->i()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x27

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_9
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_6
    const/16 v4, 0x20

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    iget-object v4, v14, Lv2/g;->e:Lv2/e;

    iget-boolean v4, v4, Lv2/e;->g:Z

    if-eqz v4, :cond_b

    goto :goto_7

    :cond_b
    const-string v4, "NOT NULL "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_7
    iget-object v4, v14, Lv2/g;->e:Lv2/e;

    iget-boolean v4, v4, Lv2/e;->q:Z

    if-eqz v4, :cond_d

    const-string v4, " UNIQUE ("

    invoke-static {v4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v9, v14, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v4, v9}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v9, ")"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_c
    move-object/from16 v18, v4

    move-object/from16 p0, v9

    move/from16 v16, v10

    move/from16 v17, v12

    iget-object v4, v14, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v5, v4}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v4, 0x20

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_d
    :goto_8
    move/from16 v12, v17

    :goto_9
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v9, p0

    move/from16 v10, v16

    move-object/from16 v4, v18

    goto/16 :goto_0

    :cond_e
    move-object/from16 v18, v4

    iget-object v4, v0, Ld3/c;->d:[Lv2/g;

    array-length v9, v4

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_a
    const/16 v12, 0x30

    if-ge v10, v9, :cond_12

    aget-object v14, v4, v10

    iget-boolean v15, v14, Lv2/g;->g:Z

    if-eqz v15, :cond_f

    invoke-virtual {v14}, Lv2/g;->n()Z

    move-result v15

    if-nez v15, :cond_f

    goto :goto_c

    :cond_f
    iget-boolean v15, v14, Lv2/g;->f:Z

    if-eqz v15, :cond_11

    if-nez v11, :cond_10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v12, "PRIMARY KEY ("

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_b

    :cond_10
    const/16 v12, 0x2c

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_b
    iget-object v12, v14, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v11, v12}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_11
    :goto_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_12
    const-string v4, ") "

    if-eqz v11, :cond_13

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    iget-object v9, v0, Ld3/c;->d:[Lv2/g;

    array-length v10, v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_d
    if-ge v12, v10, :cond_16

    aget-object v14, v9, v12

    iget-object v15, v14, Lv2/g;->e:Lv2/e;

    iget-boolean v15, v15, Lv2/e;->r:Z

    if-eqz v15, :cond_15

    if-nez v11, :cond_14

    new-instance v11, Ljava/lang/StringBuilder;

    const/16 v15, 0x30

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v15, "UNIQUE ("

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_14
    const/16 v15, 0x2c

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_e
    iget-object v14, v14, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v2, v11, v14}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_15
    add-int/lit8 v12, v12, 0x1

    goto :goto_d

    :cond_16
    if-eqz v11, :cond_17

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_f

    :cond_18
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v4, 0x0

    invoke-static {v2, v0, v3, v4}, Ld3/d;->a(Lu2/c;Ld3/c;Ljava/util/List;Z)V

    const/4 v4, 0x1

    invoke-static {v2, v0, v3, v4}, Ld3/d;->a(Lu2/c;Ld3/c;Ljava/util/List;Z)V

    invoke-virtual {v1}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    const-string v1, "create"

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Ld3/d;->f(Lc3/d;Ljava/lang/String;Ljava/util/Collection;)I

    move-result v1

    move-object/from16 v2, v18

    invoke-static {v0, v2}, Ld3/d;->d(Lc3/d;Ljava/util/List;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v1, v0

    return v1

    :catchall_0
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static d(Lc3/d;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "Lu2/c;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    :try_start_0
    move-object v4, p0

    check-cast v4, Lq2/c;

    const/4 v5, 0x1

    invoke-virtual {v4, v2, v5}, Lq2/c;->b(Ljava/lang/String;I)Lc3/b;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lq2/a;

    invoke-virtual {v4}, Lq2/a;->e()Lc3/e;

    move-result-object v5

    check-cast v5, Lq2/d;

    invoke-virtual {v5}, Lq2/d;->b()Z

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-eqz v6, :cond_0

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5}, Lq2/d;->g()Z

    move-result v6

    goto :goto_1

    :cond_0
    sget-object v5, Ld3/d;->a:Lx2/c;

    const-string v6, "executing create table after-query got {} results: {}"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v6, v7, v2}, Lx2/c;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v4}, Lq2/a;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception p0

    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "executing create table after-query failed: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p0

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    if-eqz v3, :cond_1

    check-cast v3, Lq2/a;

    invoke-virtual {v3}, Lq2/a;->a()V

    :cond_1
    throw p0

    :cond_2
    return v1
.end method

.method public static e(Lu2/c;Lc3/c;Ld3/c;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lu2/c;",
            "Lc3/c;",
            "Ld3/c<",
            "TT;TID;>;Z)I"
        }
    .end annotation

    sget-object v0, Ld3/d;->a:Lx2/c;

    iget-object v4, p2, Ld3/c;->c:Ljava/lang/String;

    sget-object v1, Lx2/b$a;->e:Lx2/b$a;

    sget-object v6, Lx2/c;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "dropping table \'{}\'"

    const/4 v7, 0x0

    move-object v5, v6

    invoke-virtual/range {v0 .. v7}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p2, Ld3/c;->d:[Lv2/g;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v2, v5

    invoke-virtual {v6}, Lv2/g;->h()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v1, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v6}, Lv2/g;->k()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x30

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v5, Ld3/d;->a:Lx2/c;

    iget-object v6, p2, Ld3/c;->c:Ljava/lang/String;

    const-string v7, "dropping index \'{}\' for table \'{}"

    invoke-virtual {v5, v7, v3, v6}, Lx2/c;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "DROP INDEX "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v5, p0

    check-cast v5, Lu2/a;

    invoke-virtual {v5, v2, v3}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p2, Ld3/c;->d:[Lv2/g;

    array-length v5, v3

    :goto_2
    if-ge v4, v5, :cond_4

    aget-object v6, v3, v4

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x40

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "DROP TABLE "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Ld3/c;->c:Ljava/lang/String;

    move-object v4, p0

    check-cast v4, Lu2/a;

    invoke-virtual {v4, v3, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p2, 0x20

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    check-cast p1, Lq2/b;

    invoke-virtual {p1}, Lq2/b;->c()Lc3/d;

    move-result-object p1

    :try_start_0
    const-string p2, "drop"

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ld3/d;->f(Lc3/d;Ljava/lang/String;Ljava/util/Collection;)I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    throw p0
.end method

.method public static f(Lc3/d;Ljava/lang/String;Ljava/util/Collection;)I
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/d;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;ZZZ)I"
        }
    .end annotation

    sget-object v0, Lx2/b$a;->e:Lx2/b$a;

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x6

    :try_start_0
    move-object v3, p0

    check-cast v3, Lq2/c;

    invoke-virtual {v3, v11, v2}, Lq2/c;->b(Ljava/lang/String;I)Lc3/b;

    move-result-object v12
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    move-object v13, v12

    check-cast v13, Lq2/a;

    invoke-virtual {v13}, Lq2/a;->d()I

    move-result v14
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v1, Ld3/d;->a:Lx2/c;

    const-string v4, "executed {} table statement changed {} rows: {}"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    move-object/from16 v5, p1

    move-object v7, v11

    invoke-virtual/range {v1 .. v8}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v13}, Lq2/a;->a()V

    if-ltz v14, :cond_0

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/sql/SQLException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SQL statement "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " updated "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " rows, we were expecting >= 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v12

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v1, v12

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    :goto_1
    move-object v12, v1

    :goto_2
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SQL statement failed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object v0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    if-eqz v1, :cond_1

    check-cast v1, Lq2/a;

    invoke-virtual {v1}, Lq2/a;->a()V

    :cond_1
    throw v0

    :cond_2
    return v10
.end method

.method public static g(Lc3/c;Ljava/lang/Class;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lc3/c;",
            "Ljava/lang/Class<",
            "TT;>;Z)I"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Lq2/b;

    iget-object v0, v0, Lq2/b;->d:Lu2/d;

    invoke-static {p0, p1}, Lt2/h;->a(Lc3/c;Ljava/lang/Class;)Lt2/g;

    move-result-object v1

    instance-of v2, v1, Lt2/a;

    if-eqz v2, :cond_0

    check-cast v1, Lt2/a;

    iget-object p1, v1, Lt2/a;->g:Ld3/c;

    invoke-static {v0, p0, p1}, Ld3/d;->e(Lu2/c;Lc3/c;Ld3/c;)I

    move-result p0

    return p0

    :cond_0
    new-instance v1, Ld3/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, p1}, Ld3/c;-><init>(Lc3/c;Lt2/a;Ljava/lang/Class;)V

    invoke-static {v0, p0, v1}, Ld3/d;->e(Lu2/c;Lc3/c;Ld3/c;)I

    move-result p0

    return p0
.end method
