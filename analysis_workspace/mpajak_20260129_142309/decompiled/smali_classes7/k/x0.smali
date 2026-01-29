.class public final Lk/x0;
.super Ljava/lang/Object;


# static fields
.field public static final f:Lk/x0;

.field public static g:Z

.field public static h:Z

.field public static i:Z

.field public static j:Z

.field public static k:Z

.field public static l:Z


# instance fields
.field public a:Z

.field public b:Lk/a;

.field public c:Ljava/lang/String;

.field public final d:Lm/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/f<",
            "Ljava/lang/reflect/Type;",
            "Lk/q0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/x0;

    invoke-direct {v0}, Lk/x0;-><init>()V

    sput-object v0, Lk/x0;->f:Lk/x0;

    const/4 v0, 0x0

    sput-boolean v0, Lk/x0;->g:Z

    sput-boolean v0, Lk/x0;->h:Z

    sput-boolean v0, Lk/x0;->i:Z

    sput-boolean v0, Lk/x0;->j:Z

    sput-boolean v0, Lk/x0;->k:Z

    sput-boolean v0, Lk/x0;->l:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v0, Lm/b;->a:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lk/x0;->a:Z

    sget-object v0, Lf/a;->d:Ljava/lang/String;

    iput-object v0, p0, Lk/x0;->c:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lk/x0;->e:Z

    new-instance v1, Lm/f;

    const/16 v2, 0x2000

    invoke-direct {v1, v2}, Lm/f;-><init>(I)V

    iput-object v1, p0, Lk/x0;->d:Lm/f;

    :try_start_0
    iget-boolean v1, p0, Lk/x0;->a:Z

    if-eqz v1, :cond_0

    new-instance v1, Lk/a;

    invoke-direct {v1}, Lk/a;-><init>()V

    iput-object v1, p0, Lk/x0;->b:Lk/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    iput-boolean v0, p0, Lk/x0;->a:Z

    :cond_0
    :goto_0
    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lk/n;->a:Lk/n;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Character;

    sget-object v1, Lk/q;->a:Lk/q;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Byte;

    sget-object v1, Lk/c0;->a:Lk/c0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Short;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Long;

    sget-object v1, Lk/l0;->a:Lk/l0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Float;

    sget-object v1, Lk/a0;->b:Lk/a0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Double;

    sget-object v1, Lk/w;->b:Lk/w;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/math/BigDecimal;

    sget-object v1, Lk/l;->a:Lk/l;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/math/BigInteger;

    sget-object v1, Lk/m;->a:Lk/m;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lk/c1;->a:Lk/c1;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [B

    sget-object v1, Lk/r0;->a:Lk/r0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [S

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [I

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [J

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [F

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [D

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [Z

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [C

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, [Ljava/lang/Object;

    sget-object v1, Lk/p0;->a:Lk/p0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Class;

    sget-object v1, Lk/n0;->b:Lk/n0;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/Currency;

    new-instance v2, Lk/n0;

    invoke-direct {v2}, Lk/n0;-><init>()V

    invoke-virtual {p0, v0, v2}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/TimeZone;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/InetAddress;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/Inet4Address;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/Inet6Address;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/InetSocketAddress;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/io/File;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/Appendable;

    sget-object v1, Lk/e;->a:Lk/e;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/StringBuffer;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/nio/charset/Charset;

    sget-object v1, Lk/d1;->a:Lk/d1;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/regex/Pattern;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/Locale;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/URI;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/net/URL;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/UUID;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v1, Lk/g;->a:Lk/g;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lk/u0;->a:Lk/u0;

    invoke-virtual {p0, v0, v2}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0, v0, v2}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {p0, v0, v2}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    const-class v0, Ljava/util/LinkedList;

    sget-object v1, Lk/s;->a:Lk/s;

    invoke-virtual {p0, v0, v1}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    return-void
.end method


# virtual methods
.method public final a(Lk/w0;)Lk/h0;
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-class v8, Lk/w0;

    iget-object v9, v0, Lk/x0;->b:Lk/a;

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v10, Ljava/lang/String;

    iget-object v11, v7, Lk/w0;->a:Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_36

    const-class v1, Lg/d;

    invoke-static {v11, v1}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lg/d;

    iget-object v13, v7, Lk/w0;->e:[Lm/c;

    array-length v1, v13

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v13, v3

    iget-object v5, v4, Lm/c;->d:Ljava/lang/reflect/Field;

    if-nez v5, :cond_0

    iget-object v4, v4, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v1, Lk/h0;

    invoke-direct {v1, v11}, Lk/h0;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_2d

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v14, v7, Lk/w0;->f:[Lm/c;

    iget-object v1, v7, Lk/w0;->e:[Lm/c;

    const/4 v3, 0x1

    if-ne v14, v1, :cond_2

    const/4 v1, 0x1

    const/4 v15, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_1
    array-length v1, v14

    const/16 v4, 0x100

    if-le v1, v4, :cond_3

    new-instance v1, Lk/h0;

    invoke-direct {v1, v11}, Lk/h0;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_2d

    :cond_3
    array-length v1, v14

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_5

    aget-object v5, v14, v4

    invoke-virtual {v5}, Lm/c;->f()Ljava/lang/reflect/Member;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v1, Lk/h0;

    invoke-direct {v1, v11}, Lk/h0;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_2d

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    const-string v1, "ASMSerializer_"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v4, v9, Lk/a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v4, Lk/a;

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v4, v6, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v2, "."

    invoke-static {v4, v2, v1}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v4, Lh/c;

    invoke-direct {v4}, Lh/c;-><init>()V

    sget-object v1, Lk/a;->h:Ljava/lang/String;

    new-array v2, v3, [Ljava/lang/String;

    sget-object v3, Lk/a;->d:Ljava/lang/String;

    const/16 v16, 0x0

    aput-object v3, v2, v16

    invoke-virtual {v4, v6, v1, v2}, Lh/c;->g(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    array-length v1, v14

    const/4 v2, 0x0

    :goto_3
    const-string v3, "Ljava/lang/reflect/Type;"

    const-string v0, "_asm_fieldType"

    if-ge v2, v1, :cond_9

    move/from16 v16, v1

    aget-object v1, v14, v2

    move-object/from16 v17, v5

    iget-object v5, v1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    move-result v5

    if-nez v5, :cond_8

    iget-object v5, v1, Lm/c;->f:Ljava/lang/Class;

    if-ne v5, v10, :cond_6

    goto :goto_4

    :cond_6
    new-instance v5, Lh/d;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v13

    iget-object v13, v1, Lm/c;->b:Ljava/lang/String;

    invoke-static {v7, v13, v0}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v4, v0, v3}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, Ljava/util/List;

    iget-object v3, v1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lh/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v1, Lm/c;->b:Ljava/lang/String;

    const-string v7, "_asm_list_item_ser_"

    invoke-static {v3, v5, v7}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lk/a;->e:Ljava/lang/String;

    invoke-direct {v0, v4, v3, v5}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    new-instance v0, Lh/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    const-string v5, "_asm_ser_"

    invoke-static {v3, v1, v5}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lk/a;->e:Ljava/lang/String;

    invoke-direct {v0, v4, v1, v3}, Lh/d;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v18, v13

    :goto_5
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v1, v16

    move-object/from16 v5, v17

    move-object/from16 v13, v18

    goto :goto_3

    :cond_9
    move-object/from16 v17, v5

    move-object/from16 v18, v13

    new-instance v1, Lh/h;

    const-string v2, "("

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v8}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ")V"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    const-string v7, "<init>"

    invoke-direct {v1, v4, v7, v2, v5}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v2, 0x19

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Lh/h;->k(II)V

    const/4 v5, 0x1

    invoke-virtual {v1, v2, v5}, Lh/h;->k(II)V

    const/16 v2, 0xb7

    sget-object v5, Lk/a;->h:Ljava/lang/String;

    const-string v7, "("

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v8}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ")V"

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v13, "<init>"

    invoke-virtual {v1, v2, v5, v13, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_6
    array-length v5, v14

    if-ge v2, v5, :cond_d

    aget-object v5, v14, v2

    iget-object v7, v5, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    move-result v7

    if-nez v7, :cond_c

    iget-object v7, v5, Lm/c;->f:Ljava/lang/Class;

    if-ne v7, v10, :cond_a

    goto :goto_8

    :cond_a
    const/4 v7, 0x0

    const/16 v13, 0x19

    invoke-virtual {v1, v13, v7}, Lh/h;->k(II)V

    iget-object v7, v5, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_b

    iget-object v7, v5, Lm/c;->h:Ljava/lang/Class;

    invoke-static {v7}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v7

    invoke-virtual {v1, v7}, Lh/h;->g(Ljava/lang/Object;)V

    iget-object v7, v5, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lh/h;->g(Ljava/lang/Object;)V

    const-class v7, Lm/b;

    invoke-static {v7}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    const-string v13, "getMethodType"

    move-object/from16 v16, v4

    const-string v4, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;"

    move-object/from16 v19, v8

    const/16 v8, 0xb8

    invoke-virtual {v1, v8, v7, v13, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_b
    move-object/from16 v16, v4

    move-object/from16 v19, v8

    const/4 v4, 0x0

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v4, 0xb7

    sget-object v7, Lk/a;->h:Ljava/lang/String;

    const-string v8, "getFieldType"

    const-string v13, "(I)Ljava/lang/reflect/Type;"

    invoke-virtual {v1, v4, v7, v8, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    const/16 v4, 0xb5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v5, Lm/c;->b:Ljava/lang/String;

    invoke-static {v7, v5, v0}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v6, v5, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_c
    :goto_8
    move-object/from16 v16, v4

    move-object/from16 v19, v8

    :goto_9
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v4, v16

    move-object/from16 v8, v19

    goto :goto_6

    :cond_d
    move-object/from16 v16, v4

    move-object/from16 v19, v8

    const/16 v2, 0xb1

    invoke-virtual {v1, v2}, Lh/h;->c(I)V

    const/4 v2, 0x4

    iput v2, v1, Lh/h;->h:I

    iput v2, v1, Lh/h;->i:I

    if-eqz v12, :cond_f

    invoke-interface {v12}, Lg/d;->serialzeFeatures()[Lk/b1;

    move-result-object v1

    array-length v2, v1

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v2, :cond_f

    aget-object v5, v1, v4

    sget-object v7, Lk/b1;->q:Lk/b1;

    if-ne v5, v7, :cond_e

    const/4 v1, 0x1

    const/4 v7, 0x1

    goto :goto_b

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_f
    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_b
    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_c
    const-string v13, "()V"

    const-string v5, "writeNull"

    const-string v4, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    const-string v2, "(L"

    const-string v1, "out"

    move-object/from16 v20, v1

    const/4 v1, 0x3

    if-ge v8, v1, :cond_15

    if-nez v8, :cond_10

    const-string v1, "write"

    move/from16 v21, v7

    goto :goto_d

    :cond_10
    const/4 v1, 0x1

    if-ne v8, v1, :cond_11

    const-string v1, "writeNormal"

    const/16 v21, 0x0

    move-object/from16 v23, v0

    move/from16 v22, v7

    goto :goto_e

    :cond_11
    const-string v1, "writeDirectNonContext"

    const/16 v21, 0x1

    :goto_d
    const/16 v22, 0x1

    move-object/from16 v23, v0

    move/from16 v22, v21

    const/16 v21, 0x1

    :goto_e
    new-instance v0, Lk/a$a;

    move-object/from16 v24, v10

    move-object v10, v1

    move-object/from16 v25, v20

    move-object v1, v0

    move-object/from16 v26, v2

    move-object v2, v14

    move-object/from16 v27, v3

    move-object/from16 v3, p1

    move/from16 v28, v7

    move-object/from16 v7, v16

    move/from16 v16, v8

    move-object v8, v4

    move-object v4, v6

    move-object/from16 v29, v17

    move-object/from16 v17, v9

    move-object v9, v5

    move/from16 v5, v21

    move-object/from16 v21, v14

    move-object v14, v6

    move/from16 v6, v22

    invoke-direct/range {v1 .. v6}, Lk/a$a;-><init>([Lm/c;Lk/w0;Ljava/lang/String;ZZ)V

    new-instance v1, Lh/h;

    invoke-static/range {v26 .. v26}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    invoke-static {v2, v3, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "java/io/IOException"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v7, v10, v2, v4}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    const/4 v4, 0x2

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/16 v4, 0xc7

    invoke-virtual {v1, v4, v2}, Lh/h;->e(ILh/f;)V

    const/4 v4, 0x1

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/16 v6, 0xb6

    invoke-virtual {v1, v6, v3, v9, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xb1

    invoke-virtual {v1, v6}, Lh/h;->c(I)V

    invoke-virtual {v1, v2}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    sget-object v2, Lk/a;->g:Ljava/lang/String;

    const/16 v4, 0xb4

    move-object/from16 v10, v25

    invoke-virtual {v1, v4, v3, v10, v2}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x3a

    invoke-virtual {v1, v4, v2}, Lh/h;->k(II)V

    if-nez v15, :cond_13

    iget-boolean v2, v0, Lk/a$a;->d:Z

    if-nez v2, :cond_13

    if-eqz v12, :cond_12

    invoke-interface {v12}, Lg/d;->alphabetic()Z

    move-result v2

    if-eqz v2, :cond_13

    :cond_12
    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    invoke-virtual {v0, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v6, "isSortField"

    const-string v9, "()Z"

    const/16 v13, 0xb6

    invoke-virtual {v1, v13, v4, v6, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x9a

    invoke-virtual {v1, v4, v2}, Lh/h;->e(ILh/f;)V

    const/4 v4, 0x0

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x1

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x2

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x3

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x4

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x5

    const/16 v5, 0x15

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v6, v26

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "writeUnsorted"

    const/16 v9, 0xb6

    invoke-virtual {v1, v9, v14, v5, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xb1

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v1, v2}, Lh/h;->f(Lh/f;)V

    goto :goto_f

    :cond_13
    move-object/from16 v6, v26

    :goto_f
    iget-boolean v2, v0, Lk/a$a;->d:Z

    if-eqz v2, :cond_14

    if-nez v22, :cond_14

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    const/4 v5, 0x0

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x1

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    sget-object v5, Lk/a;->h:Ljava/lang/String;

    const-string v9, ";)Z"

    invoke-static {v6, v3, v9}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v13, "writeDirect"

    move-object/from16 v22, v12

    const/16 v12, 0xb6

    invoke-virtual {v1, v12, v5, v13, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x9a

    invoke-virtual {v1, v5, v4}, Lh/h;->e(ILh/f;)V

    const/4 v5, 0x0

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x1

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x2

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x3

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x4

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    const/4 v5, 0x5

    const/16 v9, 0x15

    invoke-virtual {v1, v9, v5}, Lh/h;->k(II)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v9, "writeNormal"

    invoke-virtual {v1, v12, v14, v9, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xb1

    invoke-virtual {v1, v5}, Lh/h;->c(I)V

    invoke-virtual {v1, v4}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v0, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    sget-object v4, Lk/b1;->q:Lk/b1;

    iget v4, v4, Lk/b1;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v9, "isEnabled"

    const-string v10, "(I)Z"

    invoke-virtual {v1, v12, v4, v9, v10}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x99

    invoke-virtual {v1, v4, v2}, Lh/h;->e(ILh/f;)V

    const/4 v4, 0x0

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x1

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x2

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x3

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x4

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/4 v4, 0x5

    const/16 v5, 0x15

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "writeDirectNonContext"

    const/16 v5, 0xb6

    invoke-virtual {v1, v5, v14, v4, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xb1

    invoke-virtual {v1, v3}, Lh/h;->c(I)V

    invoke-virtual {v1, v2}, Lh/h;->f(Lh/f;)V

    goto :goto_10

    :cond_14
    move-object/from16 v22, v12

    :goto_10
    const/4 v2, 0x2

    const/16 v3, 0x19

    invoke-virtual {v1, v3, v2}, Lh/h;->k(II)V

    invoke-static {v11}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc0

    invoke-virtual {v1, v4, v3}, Lh/h;->j(ILjava/lang/String;)V

    const-string v3, "entity"

    invoke-virtual {v0, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x3a

    invoke-virtual {v1, v4, v3}, Lh/h;->k(II)V

    move-object/from16 v12, v17

    move-object/from16 v5, v21

    invoke-virtual {v12, v11, v1, v5, v0}, Lk/a;->k(Ljava/lang/Class;Lh/h;[Lm/c;Lk/a$a;)V

    const/16 v3, 0xb1

    invoke-virtual {v1, v3}, Lh/h;->c(I)V

    const/4 v3, 0x7

    iget v0, v0, Lk/a$a;->f:I

    add-int/2addr v0, v2

    iput v3, v1, Lh/h;->h:I

    iput v0, v1, Lh/h;->i:I

    add-int/lit8 v8, v16, 0x1

    move-object/from16 v16, v7

    move-object v9, v12

    move-object v6, v14

    move-object/from16 v12, v22

    move-object/from16 v0, v23

    move-object/from16 v10, v24

    move-object/from16 v3, v27

    move/from16 v7, v28

    move-object/from16 v17, v29

    move-object v14, v5

    goto/16 :goto_c

    :cond_15
    move-object/from16 v23, v0

    move-object/from16 v27, v3

    move-object v8, v4

    move/from16 v28, v7

    move-object v12, v9

    move-object/from16 v24, v10

    move-object/from16 v7, v16

    move-object/from16 v29, v17

    move-object/from16 v10, v20

    move-object v9, v5

    move-object v5, v14

    move-object v14, v6

    move-object v6, v2

    const/4 v0, 0x1

    if-nez v15, :cond_16

    new-instance v15, Lk/a$a;

    const/16 v16, 0x0

    move-object v1, v15

    move-object v2, v5

    move-object/from16 v3, p1

    move-object v4, v14

    move-object/from16 v21, v5

    move/from16 v5, v16

    move-object/from16 v26, v6

    move/from16 v6, v28

    invoke-direct/range {v1 .. v6}, Lk/a$a;-><init>([Lm/c;Lk/w0;Ljava/lang/String;ZZ)V

    new-instance v1, Lh/h;

    invoke-static/range {v26 .. v26}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    invoke-static {v2, v3, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "java/io/IOException"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "writeUnsorted"

    invoke-direct {v1, v7, v5, v2, v4}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v2, 0x19

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->g:Ljava/lang/String;

    const/16 v5, 0xb4

    invoke-virtual {v1, v5, v3, v10, v4}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x3a

    invoke-virtual {v1, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lh/h;->k(II)V

    invoke-static {v11}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0xc0

    invoke-virtual {v1, v5, v2}, Lh/h;->j(ILjava/lang/String;)V

    const-string v2, "entity"

    invoke-virtual {v15, v2}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v4, v2}, Lh/h;->k(II)V

    move-object/from16 v2, v18

    invoke-virtual {v12, v11, v1, v2, v15}, Lk/a;->k(Ljava/lang/Class;Lh/h;[Lm/c;Lk/a$a;)V

    const/16 v2, 0xb1

    invoke-virtual {v1, v2}, Lh/h;->c(I)V

    const/4 v2, 0x7

    iget v4, v15, Lk/a$a;->f:I

    add-int/2addr v4, v3

    iput v2, v1, Lh/h;->h:I

    iput v4, v1, Lh/h;->i:I

    goto :goto_11

    :cond_16
    move-object/from16 v21, v5

    move-object/from16 v26, v6

    :goto_11
    const/4 v1, 0x3

    const/4 v2, 0x0

    move-object v6, v12

    const/4 v15, 0x0

    :goto_12
    if-ge v15, v1, :cond_33

    if-nez v15, :cond_17

    const-string v0, "writeAsArray"

    const/4 v1, 0x1

    move/from16 v16, v28

    const/4 v5, 0x1

    goto :goto_13

    :cond_17
    if-ne v15, v0, :cond_18

    const-string v0, "writeAsArrayNormal"

    const/4 v1, 0x0

    move/from16 v16, v28

    const/4 v5, 0x0

    goto :goto_13

    :cond_18
    const-string v0, "writeAsArrayNonContext"

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v5, 0x1

    const/16 v16, 0x1

    :goto_13
    new-instance v4, Lk/a$a;

    move-object v1, v4

    move-object/from16 v2, v21

    move-object/from16 v3, p1

    move/from16 v17, v15

    move-object v15, v4

    move-object v4, v14

    move-object/from16 v18, v14

    move-object v14, v6

    move/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lk/a$a;-><init>([Lm/c;Lk/w0;Ljava/lang/String;ZZ)V

    new-instance v1, Lh/h;

    invoke-static/range {v26 .. v26}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    invoke-static {v2, v3, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "java/io/IOException"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v7, v0, v2, v4}, Lh/h;-><init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 v0, 0x1

    const/16 v2, 0x19

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->g:Ljava/lang/String;

    const/16 v4, 0xb4

    invoke-virtual {v1, v4, v3, v10, v0}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v3, 0x3a

    invoke-virtual {v1, v3, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    invoke-static {v11}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0xc0

    invoke-virtual {v1, v4, v0}, Lh/h;->j(ILjava/lang/String;)V

    const-string v0, "entity"

    invoke-virtual {v15, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v3, v0}, Lh/h;->k(II)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0x5b

    const/16 v2, 0x10

    invoke-virtual {v1, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const-string v2, "write"

    const-string v3, "(I)V"

    const/16 v4, 0xb6

    invoke-virtual {v1, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v21

    array-length v5, v4

    if-nez v5, :cond_19

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-virtual {v1, v6, v5}, Lh/h;->k(II)V

    const/16 v5, 0x5d

    const/16 v6, 0x10

    invoke-virtual {v1, v6, v5}, Lh/h;->k(II)V

    const/16 v5, 0xb6

    invoke-virtual {v1, v5, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb1

    move-object/from16 v21, v4

    move-object/from16 v22, v7

    move-object/from16 v39, v9

    move-object v3, v10

    move-object/from16 v20, v11

    move-object v5, v12

    move-object/from16 v40, v13

    move-object v6, v14

    move-object/from16 v9, v23

    move-object/from16 v32, v24

    move-object/from16 v11, v27

    move-object v12, v8

    move-object/from16 v8, v26

    goto/16 :goto_2c

    :cond_19
    const/4 v0, 0x0

    move-object v6, v14

    :goto_14
    if-ge v0, v5, :cond_32

    add-int/lit8 v6, v5, -0x1

    if-ne v0, v6, :cond_1a

    const/16 v6, 0x5d

    goto :goto_15

    :cond_1a
    const/16 v6, 0x2c

    :goto_15
    move/from16 v16, v5

    aget-object v5, v4, v0

    move-object/from16 v21, v4

    iget-object v4, v5, Lm/c;->f:Ljava/lang/Class;

    move-object/from16 v20, v11

    iget-object v11, v5, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v11}, Lh/h;->g(Ljava/lang/Object;)V

    const/4 v11, 0x6

    move-object/from16 v22, v7

    const/16 v7, 0x3a

    invoke-virtual {v1, v7, v11}, Lh/h;->k(II)V

    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const/16 v11, 0x59

    if-eq v4, v7, :cond_31

    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v4, v7, :cond_31

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v4, v7, :cond_1b

    goto/16 :goto_2a

    :cond_1b
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v4, v7, :cond_1c

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    invoke-virtual {v1, v11}, Lh/h;->c(I)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeLong"

    const-string v7, "(J)V"

    goto :goto_16

    :cond_1c
    const/16 v7, 0x19

    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v4, v11, :cond_1d

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    const/16 v4, 0x59

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeFloat"

    const-string v7, "(FZ)V"

    goto :goto_16

    :cond_1d
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v4, v7, :cond_1e

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    const/16 v4, 0x59

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeDouble"

    const-string v7, "(DZ)V"

    :goto_16
    move-object v11, v7

    move-object/from16 v7, v24

    :goto_17
    move/from16 v24, v0

    goto/16 :goto_19

    :cond_1e
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v4, v7, :cond_1f

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    const/16 v4, 0x59

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "(Z)V"

    const/16 v7, 0xb6

    invoke-virtual {v1, v7, v4, v2, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x10

    move-object/from16 v7, v24

    move/from16 v24, v0

    const/16 v0, 0xb6

    goto/16 :goto_1a

    :cond_1f
    const/16 v7, 0x19

    sget-object v11, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v4, v11, :cond_20

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v7, v4}, Lh/h;->k(II)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v4, "java/lang/Character"

    const-string v5, "toString"

    const-string v7, "(C)Ljava/lang/String;"

    const/16 v11, 0xb8

    invoke-virtual {v1, v11, v4, v5, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x10

    invoke-virtual {v1, v4, v6}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeString"

    const-string v6, "(Ljava/lang/String;C)V"

    const/16 v7, 0xb6

    invoke-virtual {v1, v7, v4, v5, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v24

    goto :goto_18

    :cond_20
    move-object/from16 v7, v24

    if-ne v4, v7, :cond_21

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v11, 0x19

    invoke-virtual {v1, v11, v4}, Lh/h;->k(II)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/16 v4, 0x10

    invoke-virtual {v1, v4, v6}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeString"

    const-string v6, "(Ljava/lang/String;C)V"

    const/16 v11, 0xb6

    invoke-virtual {v1, v11, v4, v5, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_18
    move/from16 v24, v0

    goto :goto_1b

    :cond_21
    invoke-virtual {v4}, Ljava/lang/Class;->isEnum()Z

    move-result v11

    if-eqz v11, :cond_22

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v11, 0x19

    invoke-virtual {v1, v11, v4}, Lh/h;->k(II)V

    const/16 v4, 0x59

    invoke-virtual {v1, v4}, Lh/h;->c(I)V

    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "writeEnum"

    const-string v11, "(Ljava/lang/Enum;)V"

    goto/16 :goto_17

    :goto_19
    const/16 v0, 0xb6

    invoke-virtual {v1, v0, v4, v5, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x10

    :goto_1a
    invoke-virtual {v1, v5, v6}, Lh/h;->k(II)V

    invoke-virtual {v1, v0, v4, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1b
    move-object v4, v3

    move-object/from16 v32, v7

    move-object/from16 v39, v9

    move-object v3, v10

    move-object/from16 v33, v12

    move-object/from16 v40, v13

    move-object/from16 v9, v23

    move-object/from16 v11, v27

    move-object v12, v8

    move-object/from16 v8, v26

    goto/16 :goto_29

    :cond_22
    move/from16 v24, v0

    const-class v0, Ljava/util/List;

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const-string v11, "writeWithFieldName"

    if-eqz v0, :cond_2d

    iget-object v0, v5, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v4, v0, Ljava/lang/Class;

    if-eqz v4, :cond_23

    const-class v0, Ljava/lang/Object;

    goto :goto_1c

    :cond_23
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v4, 0x0

    aget-object v0, v0, v4

    :goto_1c
    instance-of v4, v0, Ljava/lang/Class;

    if-eqz v4, :cond_24

    move-object v4, v0

    check-cast v4, Ljava/lang/Class;

    move-object/from16 v25, v12

    const-class v12, Ljava/lang/Object;

    if-ne v4, v12, :cond_25

    goto :goto_1d

    :cond_24
    move-object/from16 v25, v12

    :goto_1d
    const/4 v4, 0x0

    :cond_25
    invoke-virtual {v14, v1, v15, v5}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v12, "java/util/List"

    move/from16 v30, v6

    const/16 v6, 0xc0

    invoke-virtual {v1, v6, v12}, Lh/h;->j(ILjava/lang/String;)V

    const-string v6, "list"

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v31, v11

    const/16 v11, 0x3a

    invoke-virtual {v1, v11, v12}, Lh/h;->k(II)V

    if-ne v4, v7, :cond_26

    iget-boolean v11, v15, Lk/a$a;->d:Z

    if-eqz v11, :cond_26

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v4, 0x19

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const-string v4, "(Ljava/util/List;)V"

    const/16 v5, 0xb6

    invoke-virtual {v1, v5, v0, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x19

    const/16 v4, 0x10

    move-object/from16 v32, v7

    move-object v12, v8

    move-object/from16 v39, v9

    move-object/from16 v40, v13

    move-object/from16 v8, v26

    move-object v7, v3

    move-object v3, v10

    goto/16 :goto_24

    :cond_26
    new-instance v11, Lh/f;

    invoke-direct {v11}, Lh/f;-><init>()V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    move-object/from16 v32, v7

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v33, v0

    const/16 v0, 0x19

    invoke-virtual {v1, v0, v7}, Lh/h;->k(II)V

    const/16 v7, 0xc7

    invoke-virtual {v1, v7, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1, v0, v7}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-virtual {v1, v7, v0, v9, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0xa7

    invoke-virtual {v1, v7, v11}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v12}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    const/16 v12, 0x19

    invoke-virtual {v1, v12, v7}, Lh/h;->k(II)V

    const-string v7, "java/util/List"

    const-string v12, "size"

    move-object/from16 v34, v11

    const-string v11, "()I"

    move-object/from16 v35, v8

    const/16 v8, 0xb9

    invoke-virtual {v1, v8, v7, v12, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x36

    const-string v8, "size"

    invoke-virtual {v15, v8}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v1, v7, v8}, Lh/h;->k(II)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    const/16 v8, 0x19

    invoke-virtual {v1, v8, v7}, Lh/h;->k(II)V

    const/16 v7, 0x5b

    const/16 v8, 0x10

    invoke-virtual {v1, v8, v7}, Lh/h;->k(II)V

    const/16 v7, 0xb6

    invoke-virtual {v1, v7, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lh/f;

    invoke-direct {v7}, Lh/f;-><init>()V

    new-instance v8, Lh/f;

    invoke-direct {v8}, Lh/f;-><init>()V

    new-instance v11, Lh/f;

    invoke-direct {v11}, Lh/f;-><init>()V

    const/4 v12, 0x3

    invoke-virtual {v1, v12}, Lh/h;->c(I)V

    const/16 v12, 0x36

    move-object/from16 v36, v5

    const-string v5, "i"

    move-object/from16 v37, v14

    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v1, v12, v14}, Lh/h;->k(II)V

    invoke-virtual {v1, v7}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    const/16 v14, 0x15

    invoke-virtual {v1, v14, v12}, Lh/h;->k(II)V

    const-string v12, "size"

    invoke-virtual {v15, v12}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v1, v14, v12}, Lh/h;->k(II)V

    const/16 v12, 0xa2

    invoke-virtual {v1, v12, v11}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v1, v14, v12}, Lh/h;->k(II)V

    const/16 v12, 0x99

    invoke-virtual {v1, v12, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    const/16 v14, 0x19

    invoke-virtual {v1, v14, v12}, Lh/h;->k(II)V

    const/16 v12, 0x2c

    const/16 v14, 0x10

    invoke-virtual {v1, v14, v12}, Lh/h;->k(II)V

    const/16 v12, 0xb6

    invoke-virtual {v1, v12, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    const/16 v8, 0x19

    invoke-virtual {v1, v8, v6}, Lh/h;->k(II)V

    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    const/16 v8, 0x15

    invoke-virtual {v1, v8, v6}, Lh/h;->k(II)V

    const-string v6, "java/util/List"

    const-string v8, "get"

    const-string v12, "(I)Ljava/lang/Object;"

    const/16 v14, 0xb9

    invoke-virtual {v1, v14, v6, v8, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "list_item"

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v8

    const/16 v12, 0x3a

    invoke-virtual {v1, v12, v8}, Lh/h;->k(II)V

    new-instance v8, Lh/f;

    invoke-direct {v8}, Lh/f;-><init>()V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    move-object/from16 v38, v3

    const/16 v3, 0x19

    invoke-virtual {v1, v3, v14}, Lh/h;->k(II)V

    const/16 v14, 0xc7

    invoke-virtual {v1, v14, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v1, v3, v14}, Lh/h;->k(II)V

    const/16 v3, 0xb6

    invoke-virtual {v1, v3, v0, v9, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xa7

    invoke-virtual {v1, v3, v8}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v12}, Lh/h;->f(Lh/f;)V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    if-eqz v4, :cond_2a

    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v14

    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v14

    if-eqz v14, :cond_2a

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    move-object/from16 v39, v9

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v14}, Lh/h;->k(II)V

    const-string v9, "java/lang/Object"

    const-string v14, "getClass"

    move-object/from16 v40, v13

    const-string v13, "()Ljava/lang/Class;"

    move-object/from16 v41, v0

    const/16 v0, 0xb6

    invoke-virtual {v1, v0, v9, v14, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xa6

    invoke-virtual {v1, v0, v12}, Lh/h;->e(ILh/f;)V

    move-object/from16 v0, v36

    move-object/from16 v14, v37

    invoke-virtual {v14, v15, v1, v0, v4}, Lk/a;->d(Lk/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V

    const-string v9, "list_item_desc"

    invoke-virtual {v15, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x3a

    invoke-virtual {v1, v14, v13}, Lh/h;->k(II)V

    new-instance v13, Lh/f;

    invoke-direct {v13}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    move-object/from16 v36, v10

    iget-boolean v10, v15, Lk/a$a;->d:Z

    if-eqz v10, :cond_28

    invoke-virtual {v15, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v37, v11

    const/16 v11, 0x19

    invoke-virtual {v1, v11, v10}, Lh/h;->k(II)V

    const/16 v10, 0xc1

    sget-object v11, Lk/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v10, v11}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v10, 0x99

    invoke-virtual {v1, v10, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v42, v7

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v10}, Lh/h;->k(II)V

    const/16 v10, 0xc0

    invoke-virtual {v1, v10, v11}, Lh/h;->j(ILjava/lang/String;)V

    const/4 v10, 0x1

    invoke-virtual {v1, v7, v10}, Lh/h;->k(II)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v1, v7, v10}, Lh/h;->k(II)V

    iget-boolean v7, v15, Lk/a$a;->g:Z

    if-eqz v7, :cond_27

    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Lh/h;->c(I)V

    move-object/from16 v43, v8

    move-object/from16 v44, v12

    goto :goto_1e

    :cond_27
    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    const/16 v10, 0x15

    invoke-virtual {v1, v10, v7}, Lh/h;->k(II)V

    const-string v7, "java/lang/Integer"

    const-string v10, "valueOf"

    move-object/from16 v43, v8

    const-string v8, "(I)Ljava/lang/Integer;"

    move-object/from16 v44, v12

    const/16 v12, 0xb8

    invoke-virtual {v1, v12, v7, v10, v8}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1e
    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v7

    invoke-virtual {v1, v7}, Lh/h;->g(Ljava/lang/Object;)V

    iget v7, v0, Lm/c;->j:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v8, v26

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Lk/a;->c:Ljava/lang/String;

    move-object/from16 v12, v35

    invoke-static {v7, v10, v12}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "writeAsArrayNonContext"

    move-object/from16 v26, v3

    const/16 v3, 0xb6

    invoke-virtual {v1, v3, v11, v10, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xa7

    invoke-virtual {v1, v3, v14}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v13}, Lh/h;->f(Lh/f;)V

    goto :goto_1f

    :cond_28
    move-object/from16 v42, v7

    move-object/from16 v43, v8

    move-object/from16 v37, v11

    move-object/from16 v44, v12

    move-object/from16 v8, v26

    move-object/from16 v12, v35

    move-object/from16 v26, v3

    :goto_1f
    invoke-virtual {v15, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v7, 0x19

    invoke-virtual {v1, v7, v3}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {v1, v7, v3}, Lh/h;->k(II)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v1, v7, v9}, Lh/h;->k(II)V

    iget-boolean v7, v15, Lk/a$a;->g:Z

    if-eqz v7, :cond_29

    invoke-virtual {v1, v3}, Lh/h;->c(I)V

    goto :goto_20

    :cond_29
    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v7, 0x15

    invoke-virtual {v1, v7, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Integer"

    const-string v7, "valueOf"

    const-string v9, "(I)Ljava/lang/Integer;"

    const/16 v10, 0xb8

    invoke-virtual {v1, v10, v3, v7, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_20
    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    iget v3, v0, Lm/c;->j:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v3, Lk/a;->d:Ljava/lang/String;

    invoke-static {v8}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v9, Lk/a;->c:Ljava/lang/String;

    invoke-static {v7, v9, v12}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0xb9

    invoke-virtual {v1, v9, v3, v2, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lh/h;->f(Lh/f;)V

    const/16 v3, 0xa7

    move-object/from16 v7, v26

    invoke-virtual {v1, v3, v7}, Lh/h;->e(ILh/f;)V

    goto :goto_21

    :cond_2a
    move-object/from16 v41, v0

    move-object/from16 v42, v7

    move-object/from16 v43, v8

    move-object/from16 v39, v9

    move-object/from16 v37, v11

    move-object/from16 v44, v12

    move-object/from16 v40, v13

    move-object/from16 v8, v26

    move-object/from16 v12, v35

    move-object/from16 v0, v36

    move-object v7, v3

    move-object/from16 v36, v10

    :goto_21
    move-object/from16 v3, v44

    invoke-virtual {v1, v3}, Lh/h;->f(Lh/f;)V

    const/4 v3, 0x1

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v3}, Lh/h;->k(II)V

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v9, v6}, Lh/h;->k(II)V

    iget-boolean v6, v15, Lk/a$a;->g:Z

    if-eqz v6, :cond_2b

    invoke-virtual {v1, v3}, Lh/h;->c(I)V

    goto :goto_22

    :cond_2b
    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v6, 0x15

    invoke-virtual {v1, v6, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Integer"

    const-string v6, "valueOf"

    const-string v9, "(I)Ljava/lang/Integer;"

    const/16 v10, 0xb8

    invoke-virtual {v1, v10, v3, v6, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_22
    if-eqz v4, :cond_2c

    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v3

    if-eqz v3, :cond_2c

    move-object/from16 v3, v33

    check-cast v3, Ljava/lang/Class;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    iget v0, v0, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v3, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    goto :goto_23

    :cond_2c
    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v3, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    :goto_23
    const/16 v4, 0xb6

    move-object/from16 v6, v31

    invoke-virtual {v1, v4, v0, v6, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lh/h;->f(Lh/f;)V

    move-object/from16 v0, v43

    invoke-virtual {v1, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v15, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lh/h;->b(I)V

    const/16 v0, 0xa7

    move-object/from16 v3, v42

    invoke-virtual {v1, v0, v3}, Lh/h;->e(ILh/f;)V

    move-object/from16 v0, v37

    invoke-virtual {v1, v0}, Lh/h;->f(Lh/f;)V

    move-object/from16 v3, v36

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v0}, Lh/h;->k(II)V

    const/16 v0, 0x5d

    const/16 v6, 0x10

    invoke-virtual {v1, v6, v0}, Lh/h;->k(II)V

    move-object/from16 v7, v38

    move-object/from16 v0, v41

    invoke-virtual {v1, v4, v0, v2, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v34

    invoke-virtual {v1, v0}, Lh/h;->f(Lh/f;)V

    const/16 v0, 0x19

    const/16 v4, 0x10

    const/16 v5, 0xb6

    :goto_24
    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v0, v6}, Lh/h;->k(II)V

    move/from16 v9, v30

    invoke-virtual {v1, v4, v9}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v5, v0, v2, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v7

    move-object/from16 v9, v23

    move-object/from16 v33, v25

    move-object/from16 v11, v27

    goto/16 :goto_28

    :cond_2d
    move-object v0, v5

    move-object/from16 v32, v7

    move-object/from16 v39, v9

    move-object/from16 v25, v12

    move-object/from16 v40, v13

    move-object v7, v3

    move v9, v6

    move-object v12, v8

    move-object v3, v10

    move-object v6, v11

    move-object/from16 v8, v26

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    new-instance v10, Lh/f;

    invoke-direct {v10}, Lh/f;-><init>()V

    move-object/from16 v11, v25

    invoke-virtual {v11, v1, v15, v0}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/16 v13, 0x59

    invoke-virtual {v1, v13}, Lh/h;->c(I)V

    const-string v13, "field_"

    invoke-static {v13}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v38, v7

    iget-object v7, v0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x3a

    invoke-virtual {v1, v14, v7}, Lh/h;->k(II)V

    const/16 v7, 0xc7

    invoke-virtual {v1, v7, v10}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x19

    invoke-virtual {v1, v14, v7}, Lh/h;->k(II)V

    sget-object v7, Lk/a;->f:Ljava/lang/String;

    const/16 v14, 0xb6

    move-object/from16 v25, v3

    move/from16 v30, v9

    move-object/from16 v3, v39

    move-object/from16 v9, v40

    invoke-virtual {v1, v14, v7, v3, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v14, 0xa7

    invoke-virtual {v1, v14, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v10}, Lh/h;->f(Lh/f;)V

    new-instance v10, Lh/f;

    invoke-direct {v10}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    invoke-static {v13}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v9, v0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Object"

    const-string v9, "getClass"

    move-object/from16 v26, v7

    const-string v7, "()Ljava/lang/Class;"

    move-object/from16 v31, v5

    const/16 v5, 0xb6

    invoke-virtual {v1, v5, v3, v9, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa6

    invoke-virtual {v1, v3, v14}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v11, v15, v1, v0}, Lk/a;->c(Lk/a$a;Lh/h;Lm/c;)V

    const-string v3, "fied_ser"

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x3a

    invoke-virtual {v1, v7, v5}, Lh/h;->k(II)V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    new-instance v7, Lh/f;

    invoke-direct {v7}, Lh/f;-><init>()V

    iget-boolean v9, v15, Lk/a$a;->d:Z

    if-eqz v9, :cond_2e

    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v9

    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v9

    if-eqz v9, :cond_2e

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v33, v11

    const/16 v11, 0x19

    invoke-virtual {v1, v11, v9}, Lh/h;->k(II)V

    const/16 v9, 0xc1

    sget-object v11, Lk/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v9, v11}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v9, 0x99

    invoke-virtual {v1, v9, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v34, v6

    const/16 v6, 0x19

    invoke-virtual {v1, v6, v9}, Lh/h;->k(II)V

    const/16 v9, 0xc0

    invoke-virtual {v1, v9, v11}, Lh/h;->j(ILjava/lang/String;)V

    const/4 v9, 0x1

    invoke-virtual {v1, v6, v9}, Lh/h;->k(II)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    const/16 v9, 0x19

    invoke-virtual {v1, v9, v6}, Lh/h;->k(II)V

    const/4 v6, 0x6

    invoke-virtual {v1, v9, v6}, Lh/h;->k(II)V

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v6

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    iget v6, v0, Lm/c;->j:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v1, v6}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Lk/a;->c:Ljava/lang/String;

    invoke-static {v6, v9, v12}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "writeAsArrayNonContext"

    move-object/from16 v35, v14

    const/16 v14, 0xb6

    invoke-virtual {v1, v14, v11, v9, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xa7

    invoke-virtual {v1, v6, v7}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v5}, Lh/h;->f(Lh/f;)V

    goto :goto_25

    :cond_2e
    move-object/from16 v34, v6

    move-object/from16 v33, v11

    move-object/from16 v35, v14

    :goto_25
    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v3}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {v1, v5, v3}, Lh/h;->k(II)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v5, v3}, Lh/h;->k(II)V

    const/4 v3, 0x6

    invoke-virtual {v1, v5, v3}, Lh/h;->k(II)V

    invoke-static {v4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    iget v3, v0, Lm/c;->j:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v3, Lk/a;->d:Ljava/lang/String;

    invoke-static {v8}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lk/a;->c:Ljava/lang/String;

    invoke-static {v4, v5, v12}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0xb9

    invoke-virtual {v1, v6, v3, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lh/h;->f(Lh/f;)V

    const/16 v3, 0xa7

    invoke-virtual {v1, v3, v10}, Lh/h;->e(ILh/f;)V

    move-object/from16 v3, v35

    invoke-virtual {v1, v3}, Lh/h;->f(Lh/f;)V

    iget-object v3, v0, Lm/c;->t:Ljava/lang/String;

    const/4 v4, 0x1

    const/16 v6, 0x19

    invoke-virtual {v1, v6, v4}, Lh/h;->k(II)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v6, v4}, Lh/h;->k(II)V

    if-eqz v3, :cond_2f

    invoke-virtual {v1, v3}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v0, "writeWithFormat"

    const-string v3, "(Ljava/lang/Object;Ljava/lang/String;)V"

    const/16 v4, 0xb6

    invoke-virtual {v1, v4, v5, v0, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_26

    :cond_2f
    const/4 v3, 0x6

    const/16 v4, 0xb6

    invoke-virtual {v1, v6, v3}, Lh/h;->k(II)V

    iget-object v3, v0, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v6, v3, Ljava/lang/Class;

    if-eqz v6, :cond_30

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_30

    const-string v0, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    move-object/from16 v3, v34

    invoke-virtual {v1, v4, v5, v3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_26
    const/16 v0, 0xb6

    move-object/from16 v9, v23

    move-object/from16 v11, v27

    goto :goto_27

    :cond_30
    move-object/from16 v3, v34

    const/4 v4, 0x0

    const/16 v6, 0x19

    invoke-virtual {v1, v6, v4}, Lh/h;->k(II)V

    iget-object v4, v15, Lk/a$a;->b:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v9, v23

    invoke-static {v6, v7, v9}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    move-object/from16 v11, v27

    invoke-virtual {v1, v7, v4, v6, v11}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, v0, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v0, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    const/16 v4, 0xb6

    invoke-virtual {v1, v4, v5, v3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb6

    :goto_27
    invoke-virtual {v1, v10}, Lh/h;->f(Lh/f;)V

    move-object/from16 v3, v31

    invoke-virtual {v1, v3}, Lh/h;->f(Lh/f;)V

    move-object/from16 v3, v25

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v4}, Lh/h;->k(II)V

    const/16 v4, 0x10

    move/from16 v6, v30

    invoke-virtual {v1, v4, v6}, Lh/h;->k(II)V

    move-object/from16 v5, v26

    move-object/from16 v4, v38

    invoke-virtual {v1, v0, v5, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_28
    move-object/from16 v14, v33

    :goto_29
    move-object/from16 v5, v33

    goto :goto_2b

    :cond_31
    :goto_2a
    move-object v4, v3

    move-object/from16 v39, v9

    move-object v3, v10

    move-object/from16 v33, v12

    move-object/from16 v40, v13

    move-object/from16 v9, v23

    move-object/from16 v32, v24

    move-object/from16 v11, v27

    move/from16 v24, v0

    move-object v0, v5

    move-object v12, v8

    move-object/from16 v8, v26

    const/16 v5, 0x19

    invoke-virtual {v15, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1, v5, v7}, Lh/h;->k(II)V

    const/16 v5, 0x59

    invoke-virtual {v1, v5}, Lh/h;->c(I)V

    move-object/from16 v5, v33

    invoke-virtual {v5, v1, v15, v0}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const-string v7, "writeInt"

    const/16 v10, 0xb6

    invoke-virtual {v1, v10, v0, v7, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x10

    invoke-virtual {v1, v7, v6}, Lh/h;->k(II)V

    invoke-virtual {v1, v10, v0, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v14, v5

    :goto_2b
    add-int/lit8 v0, v24, 0x1

    move-object v10, v3

    move-object v3, v4

    move-object v6, v5

    move-object/from16 v26, v8

    move-object/from16 v23, v9

    move-object/from16 v27, v11

    move-object v8, v12

    move-object/from16 v11, v20

    move-object/from16 v4, v21

    move-object/from16 v7, v22

    move-object/from16 v24, v32

    move-object/from16 v9, v39

    move-object/from16 v13, v40

    move-object v12, v6

    move/from16 v5, v16

    goto/16 :goto_14

    :cond_32
    move-object/from16 v21, v4

    move-object/from16 v22, v7

    move-object/from16 v39, v9

    move-object v3, v10

    move-object/from16 v20, v11

    move-object v5, v12

    move-object/from16 v40, v13

    move-object/from16 v9, v23

    move-object/from16 v32, v24

    move-object/from16 v11, v27

    move-object v12, v8

    move-object/from16 v8, v26

    const/16 v0, 0xb1

    :goto_2c
    invoke-virtual {v1, v0}, Lh/h;->c(I)V

    const/4 v0, 0x7

    iget v2, v15, Lk/a$a;->f:I

    add-int/lit8 v2, v2, 0x2

    iput v0, v1, Lh/h;->h:I

    iput v2, v1, Lh/h;->i:I

    add-int/lit8 v15, v17, 0x1

    const/4 v1, 0x3

    const/4 v0, 0x1

    move-object v10, v3

    move-object/from16 v26, v8

    move-object/from16 v23, v9

    move-object/from16 v27, v11

    move-object v8, v12

    move-object/from16 v14, v18

    move-object/from16 v11, v20

    move-object/from16 v7, v22

    move-object/from16 v24, v32

    move-object/from16 v9, v39

    move-object/from16 v13, v40

    move-object v12, v5

    goto/16 :goto_12

    :cond_33
    move-object v14, v6

    move-object/from16 v22, v7

    invoke-virtual/range {v22 .. v22}, Lh/c;->f()[B

    move-result-object v0

    iget-object v1, v14, Lk/a;->a:Lm/a;

    array-length v2, v0

    move-object/from16 v3, v29

    invoke-virtual {v1, v3, v0, v2}, Lm/a;->a(Ljava/lang/String;[BI)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v19, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lk/h0;

    :goto_2d
    const/4 v0, 0x0

    :goto_2e
    iget-object v2, v1, Lk/h0;->j:[Lk/z;

    array-length v3, v2

    if-ge v0, v3, :cond_35

    aget-object v2, v2, v0

    iget-object v2, v2, Lk/z;->b:Lm/c;

    iget-object v2, v2, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    move-result v3

    if-eqz v3, :cond_34

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object v2

    instance-of v2, v2, Lk/x;

    goto :goto_2f

    :cond_34
    move-object/from16 v3, p0

    :goto_2f
    add-int/lit8 v0, v0, 0x1

    goto :goto_2e

    :cond_35
    move-object/from16 v3, p0

    return-object v1

    :cond_36
    move-object v3, v0

    move-object/from16 v20, v11

    new-instance v0, Lf/d;

    const-string v1, "unsupportd class "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-static {v2, v1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ljava/lang/Class;)Lk/q0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lk/q0;"
        }
    .end annotation

    iget-boolean v0, p0, Lk/x0;->e:Z

    invoke-static {p1, v0}, Lm/j;->a(Ljava/lang/Class;Z)Lk/w0;

    move-result-object v0

    iget-object v1, v0, Lk/w0;->e:[Lm/c;

    array-length v1, v1

    if-nez v1, :cond_0

    const-class v1, Ljava/lang/Iterable;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lk/n0;->b:Lk/n0;

    return-object p1

    :cond_0
    iget-object p1, v0, Lk/w0;->d:Lg/d;

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lg/d;->serializer()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Void;

    if-eq v2, v3, :cond_1

    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lk/q0;

    if-eqz v3, :cond_1

    check-cast v2, Lk/q0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :catchall_0
    nop

    :cond_1
    invoke-interface {p1}, Lg/d;->asm()Z

    move-result v2

    if-nez v2, :cond_2

    iput-boolean v1, p0, Lk/x0;->a:Z

    :cond_2
    invoke-interface {p1}, Lg/d;->serialzeFeatures()[Lk/b1;

    move-result-object p1

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_5

    aget-object v4, p1, v3

    sget-object v5, Lk/b1;->A:Lk/b1;

    if-eq v5, v4, :cond_4

    sget-object v5, Lk/b1;->f:Lk/b1;

    if-eq v5, v4, :cond_4

    sget-object v5, Lk/b1;->x:Lk/b1;

    if-ne v5, v4, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    iput-boolean v1, p0, Lk/x0;->a:Z

    :cond_5
    iget-object p1, v0, Lk/w0;->a:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-nez v2, :cond_6

    new-instance v2, Lk/h0;

    invoke-direct {v2, v0}, Lk/h0;-><init>(Lk/w0;)V

    goto/16 :goto_9

    :cond_6
    iget-boolean v2, p0, Lk/x0;->a:Z

    if-eqz v2, :cond_7

    iget-boolean v2, p0, Lk/x0;->e:Z

    if-nez v2, :cond_7

    const/4 v2, 0x1

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_8

    iget-object v3, p0, Lk/x0;->b:Lk/a;

    iget-object v3, v3, Lk/a;->a:Lm/a;

    invoke-virtual {v3, p1}, Lm/a;->b(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    const-class v3, Ljava/io/Serializable;

    if-eq p1, v3, :cond_9

    const-class v3, Ljava/lang/Object;

    if-ne p1, v3, :cond_a

    :cond_9
    const/4 v2, 0x0

    :cond_a
    if-eqz v2, :cond_b

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_b

    const/4 v2, 0x0

    :cond_b
    if-eqz v2, :cond_c

    iget-object v3, v0, Lk/w0;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v2, 0x0

    :cond_c
    if-eqz v2, :cond_17

    iget-object v3, v0, Lk/w0;->e:[Lm/c;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_17

    aget-object v6, v3, v5

    iget-object v7, v6, Lm/c;->d:Ljava/lang/reflect/Field;

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v7

    iget-object v8, v6, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto/16 :goto_8

    :cond_d
    iget-object v7, v6, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    iget-object v9, v6, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto/16 :goto_8

    :cond_e
    invoke-virtual {v6}, Lm/c;->c()Lg/b;

    move-result-object v8

    if-nez v8, :cond_f

    goto :goto_6

    :cond_f
    invoke-interface {v8}, Lg/b;->format()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_10

    iget-object v6, v6, Lm/c;->f:Ljava/lang/Class;

    const-class v10, Ljava/lang/String;

    if-ne v6, v10, :cond_18

    const-string v6, "trim"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    :cond_10
    invoke-interface {v8}, Lg/b;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v8}, Lg/b;->jsonDirect()Z

    move-result v6

    if-nez v6, :cond_18

    invoke-interface {v8}, Lg/b;->serializeUsing()Ljava/lang/Class;

    move-result-object v6

    const-class v9, Ljava/lang/Void;

    if-ne v6, v9, :cond_18

    invoke-interface {v8}, Lg/b;->unwrapped()Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_8

    :cond_11
    invoke-interface {v8}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v6

    array-length v8, v6

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_14

    aget-object v10, v6, v9

    sget-object v11, Lk/b1;->A:Lk/b1;

    if-eq v11, v10, :cond_13

    sget-object v11, Lk/b1;->f:Lk/b1;

    if-eq v11, v10, :cond_13

    sget-object v11, Lk/b1;->x:Lk/b1;

    if-eq v11, v10, :cond_13

    sget-object v11, Lk/b1;->p:Lk/b1;

    if-ne v11, v10, :cond_12

    goto :goto_5

    :cond_12
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_13
    :goto_5
    const/4 v2, 0x0

    :cond_14
    invoke-static {v7}, Lm/j;->I(Ljava/lang/reflect/Method;)Z

    move-result v6

    if-nez v6, :cond_16

    invoke-static {v7}, Lm/j;->H(Ljava/lang/reflect/Method;)Z

    move-result v6

    if-eqz v6, :cond_15

    goto :goto_7

    :cond_15
    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    :cond_16
    :goto_7
    const/4 v1, 0x1

    goto :goto_8

    :cond_17
    move v1, v2

    :cond_18
    :goto_8
    if-eqz v1, :cond_19

    :try_start_1
    invoke-virtual {p0, v0}, Lk/x0;->a(Lk/w0;)Lk/h0;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassFormatError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    new-instance v1, Lf/d;

    const-string v2, "create asm serializer error, class "

    invoke-static {v2, p1}, Landroidx/activity/d;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_0
    :cond_19
    new-instance v2, Lk/h0;

    invoke-direct {v2, v0}, Lk/h0;-><init>(Lk/w0;)V

    :goto_9
    return-object v2
.end method

.method public final c(Ljava/lang/Class;)Lk/q0;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lk/q0;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "net.sf.json.JSONNull"

    const-string v3, "springfox.documentation.spring.web.json.Json"

    const-class v4, Lk/h;

    iget-object v5, v0, Lk/x0;->d:Lm/f;

    invoke-virtual {v5, v1}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk/q0;

    if-nez v5, :cond_3

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-static {v4, v5}, Lm/i;->a(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lk/h;

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    check-cast v6, Lk/h;

    invoke-interface {v6}, Lk/h;->a()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Type;

    invoke-virtual {v0, v8, v6}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_2
    iget-object v5, v0, Lk/x0;->d:Lm/f;

    invoke-virtual {v5, v1}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk/q0;

    :cond_3
    if-nez v5, :cond_7

    const-class v6, Lf/a;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    if-eq v6, v7, :cond_7

    :try_start_1
    invoke-static {v4, v6}, Lm/i;->a(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lk/h;

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    check-cast v5, Lk/h;

    invoke-interface {v5}, Lk/h;->a()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/Type;

    invoke-virtual {v0, v7, v5}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    :cond_6
    iget-object v4, v0, Lk/x0;->d:Lm/f;

    invoke-virtual {v4, v1}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lk/q0;

    :cond_7
    if-nez v5, :cond_36

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v2, Lk/m0;->i:Lk/m0;

    goto/16 :goto_17

    :cond_8
    const-class v5, Ljava/util/List;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object v2, Lk/k0;->a:Lk/k0;

    goto/16 :goto_17

    :cond_9
    const-class v5, Ljava/util/Collection;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_a

    sget-object v2, Lk/s;->a:Lk/s;

    goto/16 :goto_17

    :cond_a
    const-class v5, Ljava/util/Date;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v2, Lk/v;->a:Lk/v;

    goto/16 :goto_17

    :cond_b
    const-class v5, Lf/c;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_c

    sget-object v2, Lk/d0;->a:Lk/d0;

    goto/16 :goto_17

    :cond_c
    const-class v5, Lk/e0;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v2, Lk/f0;->a:Lk/f0;

    goto/16 :goto_17

    :cond_d
    const-class v5, Lf/k;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto/16 :goto_16

    :cond_e
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isEnum()Z

    move-result v5

    if-eqz v5, :cond_f

    const-class v2, Lg/d;

    invoke-static {v1, v2}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lg/d;

    if-eqz v2, :cond_10

    invoke-interface {v2}, Lg/d;->serializeEnumAsJavaBean()Z

    move-result v2

    if-eqz v2, :cond_10

    goto/16 :goto_14

    :cond_f
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Ljava/lang/Class;->isEnum()Z

    move-result v6

    if-eqz v6, :cond_11

    const-class v2, Lg/d;

    invoke-static {v5, v2}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lg/d;

    if-eqz v2, :cond_10

    invoke-interface {v2}, Lg/d;->serializeEnumAsJavaBean()Z

    move-result v2

    if-eqz v2, :cond_10

    goto/16 :goto_14

    :cond_10
    sget-object v2, Lk/x;->a:Lk/x;

    goto/16 :goto_17

    :cond_11
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object v3

    new-instance v4, Lk/f;

    invoke-direct {v4, v2, v3}, Lk/f;-><init>(Ljava/lang/Class;Lk/q0;)V

    invoke-virtual {v0, v1, v4}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    move-object v5, v4

    goto/16 :goto_18

    :cond_12
    const-class v5, Ljava/lang/Throwable;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v5, :cond_13

    invoke-static {v1, v7}, Lm/j;->a(Ljava/lang/Class;Z)Lk/w0;

    move-result-object v2

    iget v3, v2, Lk/w0;->g:I

    sget-object v4, Lk/b1;->p:Lk/b1;

    iget v4, v4, Lk/b1;->b:I

    or-int/2addr v3, v4

    iput v3, v2, Lk/w0;->g:I

    new-instance v3, Lk/h0;

    invoke-direct {v3, v2}, Lk/h0;-><init>(Lk/w0;)V

    invoke-virtual {v0, v1, v3}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    move-object v5, v3

    goto/16 :goto_18

    :cond_13
    const-class v5, Ljava/util/TimeZone;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_35

    const-class v5, Ljava/util/Map$Entry;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_14

    goto/16 :goto_16

    :cond_14
    const-class v5, Ljava/lang/Appendable;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_15

    sget-object v2, Lk/e;->a:Lk/e;

    goto/16 :goto_17

    :cond_15
    const-class v5, Ljava/nio/charset/Charset;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_16

    goto :goto_6

    :cond_16
    const-class v5, Ljava/util/Enumeration;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_17

    sget-object v2, Lk/y;->a:Lk/y;

    goto/16 :goto_17

    :cond_17
    const-class v5, Ljava/util/Calendar;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_34

    const-class v5, Ljavax/xml/datatype/XMLGregorianCalendar;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_18

    goto/16 :goto_15

    :cond_18
    const-class v5, Ljava/sql/Clob;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_19

    sget-object v2, Lk/r;->a:Lk/r;

    goto/16 :goto_17

    :cond_19
    sget-object v5, Lm/j;->C:Ljava/lang/Class;

    const/4 v8, 0x1

    if-nez v5, :cond_1a

    sget-boolean v5, Lm/j;->D:Z

    if-nez v5, :cond_1a

    :try_start_2
    const-string v5, "java.nio.file.Path"

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sput-object v5, Lm/j;->C:Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    sput-boolean v8, Lm/j;->D:Z

    :cond_1a
    :goto_4
    sget-object v5, Lm/j;->C:Ljava/lang/Class;

    if-eqz v5, :cond_1b

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    goto :goto_5

    :cond_1b
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_1c

    :goto_6
    sget-object v2, Lk/d1;->a:Lk/d1;

    goto/16 :goto_17

    :cond_1c
    const-class v5, Ljava/util/Iterator;

    invoke-virtual {v5, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1d

    goto/16 :goto_16

    :cond_1d
    const-string v5, "java.awt."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const/4 v9, 0x4

    if-eqz v5, :cond_1f

    invoke-static/range {p1 .. p1}, Lk/i;->j(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1f

    sget-boolean v5, Lk/x0;->g:Z

    if-nez v5, :cond_1f

    :try_start_3
    const-string v5, "java.awt.Color"

    const-string v10, "java.awt.Font"

    const-string v11, "java.awt.Point"

    const-string v12, "java.awt.Rectangle"

    filled-new-array {v5, v10, v11, v12}, [Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    :goto_7
    if-ge v10, v9, :cond_1f

    aget-object v11, v5, v10

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v10, Lk/i;->a:Lk/i;

    invoke-virtual {v0, v5, v10}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_1a

    :cond_1e
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :catchall_1
    sput-boolean v8, Lk/x0;->g:Z

    :cond_1f
    sget-boolean v5, Lk/x0;->h:Z

    const/4 v10, 0x2

    if-nez v5, :cond_26

    const-string v5, "java.time."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-string v11, "java.util.Optional"

    if-nez v5, :cond_20

    invoke-virtual {v4, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_20

    const-string v5, "java.util.concurrent.atomic.LongAdder"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    const-string v5, "java.util.concurrent.atomic.DoubleAdder"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    :cond_20
    const/16 v5, 0xb

    :try_start_4
    const-string v12, "java.time.LocalDateTime"

    const-string v13, "java.time.LocalDate"

    const-string v14, "java.time.LocalTime"

    const-string v15, "java.time.ZonedDateTime"

    const-string v16, "java.time.OffsetDateTime"

    const-string v17, "java.time.OffsetTime"

    const-string v18, "java.time.ZoneOffset"

    const-string v19, "java.time.ZoneRegion"

    const-string v20, "java.time.Period"

    const-string v21, "java.time.Duration"

    const-string v22, "java.time.Instant"

    filled-new-array/range {v12 .. v22}, [Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    :goto_8
    if-ge v13, v5, :cond_22

    aget-object v14, v12, v13

    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_21

    invoke-static {v14}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v11, Lj/p;->a:Lj/p;

    goto :goto_b

    :cond_21
    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    :cond_22
    const-string v5, "java.util.OptionalDouble"

    const-string v12, "java.util.OptionalInt"

    const-string v13, "java.util.OptionalLong"

    filled-new-array {v11, v5, v12, v13}, [Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v9, :cond_24

    aget-object v12, v5, v11

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_23

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v11, Lj/t;->a:Lj/t;

    goto :goto_b

    :cond_23
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_24
    const-string v5, "java.util.concurrent.atomic.LongAdder"

    const-string v11, "java.util.concurrent.atomic.DoubleAdder"

    filled-new-array {v5, v11}, [Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    :goto_a
    if-ge v11, v10, :cond_26

    aget-object v12, v5, v11

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_25

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v11, Lk/b;->a:Lk/b;

    :goto_b
    invoke-virtual {v0, v5, v11}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_d

    :cond_25
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    :catchall_2
    sput-boolean v8, Lk/x0;->h:Z

    :cond_26
    sget-boolean v5, Lk/x0;->i:Z

    if-nez v5, :cond_28

    const-string v5, "oracle.sql."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_28

    :try_start_5
    const-string v5, "oracle.sql.DATE"

    const-string v11, "oracle.sql.TIMESTAMP"

    filled-new-array {v5, v11}, [Ljava/lang/String;

    move-result-object v5

    const/4 v11, 0x0

    :goto_c
    if-ge v11, v10, :cond_28

    aget-object v12, v5, v11

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_27

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    sget-object v11, Lk/v;->a:Lk/v;

    invoke-virtual {v0, v5, v11}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_d
    move-object v10, v11

    goto/16 :goto_1a

    :cond_27
    add-int/lit8 v11, v11, 0x1

    goto :goto_c

    :catchall_3
    sput-boolean v8, Lk/x0;->i:Z

    :cond_28
    sget-boolean v5, Lk/x0;->j:Z

    if-nez v5, :cond_29

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_29

    :try_start_6
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v5, Ll/a;->a:Ll/a;

    invoke-virtual {v0, v3, v5}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_2

    goto/16 :goto_19

    :catch_2
    sput-boolean v8, Lk/x0;->j:Z

    :cond_29
    sget-boolean v3, Lk/x0;->k:Z

    if-nez v3, :cond_2b

    const-string v3, "com.google.common.collect."

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2b

    :try_start_7
    const-string v3, "com.google.common.collect.HashMultimap"

    const-string v5, "com.google.common.collect.LinkedListMultimap"

    const-string v11, "com.google.common.collect.ArrayListMultimap"

    const-string v12, "com.google.common.collect.TreeMultimap"

    filled-new-array {v3, v5, v11, v12}, [Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    :goto_e
    if-ge v5, v9, :cond_2b

    aget-object v11, v3, v5

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2a

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v5, Lk/b0;->a:Lk/b0;

    invoke-virtual {v0, v3, v5}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_3

    goto/16 :goto_19

    :cond_2a
    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :catch_3
    sput-boolean v8, Lk/x0;->k:Z

    :cond_2b
    sget-boolean v3, Lk/x0;->l:Z

    if-nez v3, :cond_2c

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    :try_start_8
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lk/n0;->b:Lk/n0;

    invoke-virtual {v0, v2, v3}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_4

    move-object v10, v3

    goto/16 :goto_1a

    :catch_4
    sput-boolean v8, Lk/x0;->l:Z

    :cond_2c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    if-ne v3, v8, :cond_2d

    aget-object v3, v2, v7

    invoke-virtual {v3}, Ljava/lang/Class;->isAnnotation()Z

    move-result v3

    if-eqz v3, :cond_2d

    sget-object v10, Lk/d;->a:Lk/d;

    goto/16 :goto_1a

    :cond_2d
    invoke-static/range {p1 .. p1}, Lm/j;->N(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_2e

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object v2

    :goto_f
    move-object v10, v2

    goto :goto_13

    :cond_2e
    invoke-static/range {p1 .. p1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_33

    array-length v3, v2

    if-ne v3, v10, :cond_2f

    aget-object v6, v2, v8

    goto :goto_12

    :cond_2f
    array-length v3, v2

    move-object v4, v6

    :goto_10
    if-ge v7, v3, :cond_32

    aget-object v5, v2, v7

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "org.springframework.aop."

    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_30

    goto :goto_11

    :cond_30
    if-eqz v4, :cond_31

    goto :goto_12

    :cond_31
    move-object v4, v5

    :goto_11
    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_32
    move-object v6, v4

    :goto_12
    if-eqz v6, :cond_33

    invoke-virtual {v0, v6}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object v2

    goto :goto_f

    :goto_13
    invoke-virtual {v0, v1, v10}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    goto :goto_1a

    :cond_33
    :goto_14
    invoke-virtual/range {p0 .. p1}, Lk/x0;->b(Ljava/lang/Class;)Lk/q0;

    move-result-object v2

    goto :goto_17

    :cond_34
    :goto_15
    sget-object v2, Lk/o;->b:Lk/o;

    goto :goto_17

    :cond_35
    :goto_16
    sget-object v2, Lk/n0;->b:Lk/n0;

    :goto_17
    invoke-virtual {v0, v1, v2}, Lk/x0;->d(Ljava/lang/reflect/Type;Lk/q0;)Z

    move-object v5, v2

    :goto_18
    if-nez v5, :cond_36

    iget-object v2, v0, Lk/x0;->d:Lm/f;

    invoke-virtual {v2, v1}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lk/q0;

    :cond_36
    :goto_19
    move-object v10, v5

    :goto_1a
    return-object v10
.end method

.method public final d(Ljava/lang/reflect/Type;Lk/q0;)Z
    .locals 1

    iget-object v0, p0, Lk/x0;->d:Lm/f;

    invoke-virtual {v0, p1, p2}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
