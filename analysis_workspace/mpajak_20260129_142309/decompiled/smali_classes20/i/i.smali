.class public final Li/i;
.super Ljava/lang/Object;


# static fields
.field public static final k:[Ljava/lang/String;

.field public static final l:[Ljava/lang/String;

.field public static final m:Z

.field public static n:Li/i;

.field public static o:Z

.field public static p:Z


# instance fields
.field public final a:Lm/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/f<",
            "Ljava/lang/reflect/Type;",
            "Lj/s;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:Li/j;

.field public d:Lj/a;

.field public e:Z

.field public f:[Ljava/lang/String;

.field public g:[Ljava/lang/String;

.field public h:I

.field public final i:Z

.field public j:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "fastjson.parser.deny"

    invoke-static {v0}, Lm/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    sput-object v0, Li/i;->k:[Ljava/lang/String;

    const-string v0, "fastjson.parser.autoTypeSupport"

    invoke-static {v0}, Lm/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "true"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Li/i;->m:Z

    const-string v0, "fastjson.parser.autoTypeAccept"

    invoke-static {v0}, Lm/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    :cond_1
    const/4 v0, 0x0

    if-nez v2, :cond_2

    new-array v2, v0, [Ljava/lang/String;

    :cond_2
    sput-object v2, Li/i;->l:[Ljava/lang/String;

    new-instance v1, Li/i;

    invoke-direct {v1}, Li/i;-><init>()V

    sput-object v1, Li/i;->n:Li/i;

    sput-boolean v0, Li/i;->o:Z

    sput-boolean v0, Li/i;->p:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/f;

    invoke-direct {v0}, Lm/f;-><init>()V

    iput-object v0, p0, Li/i;->a:Lm/f;

    sget-boolean v0, Lm/b;->a:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p0, Li/i;->b:Z

    new-instance v1, Li/j;

    invoke-direct {v1}, Li/j;-><init>()V

    iput-object v1, p0, Li/i;->c:Li/j;

    sget-boolean v1, Li/i;->m:Z

    iput-boolean v1, p0, Li/i;->e:Z

    const-string v1, "bsh,com.mchange,com.sun.,java.lang.Thread,java.net.Socket,java.rmi,javax.xml,org.apache.bcel,org.apache.commons.beanutils,org.apache.commons.collections.Transformer,org.apache.commons.collections.functors,org.apache.commons.collections4.comparators,org.apache.commons.fileupload,org.apache.myfaces.context.servlet,org.apache.tomcat,org.apache.wicket.util,org.apache.xalan,org.codehaus.groovy.runtime,org.hibernate,org.jboss,org.mozilla.javascript,org.python.core,org.springframework"

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Li/i;->f:[Ljava/lang/String;

    sget-object v1, Li/i;->l:[Ljava/lang/String;

    iput-object v1, p0, Li/i;->g:[Ljava/lang/String;

    const/16 v1, 0x100

    iput v1, p0, Li/i;->h:I

    sget-boolean v1, Lm/j;->a:Z

    iput-boolean v1, p0, Li/i;->j:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Li/i;->i:Z

    if-nez v0, :cond_0

    :try_start_0
    new-instance v0, Lj/a;

    new-instance v2, Lm/a;

    invoke-direct {v2}, Lm/a;-><init>()V

    invoke-direct {v0, v2}, Lj/a;-><init>(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/ExceptionInInitializerError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Li/i;->d:Lj/a;

    if-nez v0, :cond_1

    iput-boolean v1, p0, Li/i;->b:Z

    :cond_1
    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/text/SimpleDateFormat;

    sget-object v3, Lk/n0;->b:Lk/n0;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/sql/Timestamp;

    sget-object v4, Lj/x;->c:Lj/x;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/sql/Date;

    sget-object v4, Lj/x;->b:Lj/x;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/sql/Time;

    sget-object v4, Lj/a0;->a:Lj/a0;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Date;

    sget-object v4, Lk/v;->a:Lk/v;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Calendar;

    sget-object v4, Lk/o;->b:Lk/o;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljavax/xml/datatype/XMLGregorianCalendar;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Lf/e;

    sget-object v4, Lj/q;->a:Lj/q;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Lf/b;

    sget-object v5, Lk/s;->a:Lk/s;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Map;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/HashMap;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/TreeMap;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/List;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/ArrayList;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Object;

    sget-object v4, Lj/o;->a:Lj/o;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/String;

    sget-object v5, Lk/c1;->a:Lk/c1;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/StringBuffer;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    sget-object v5, Lk/q;->a:Lk/q;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Character;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    sget-object v5, Lj/r;->a:Lj/r;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Byte;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Short;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v6, Lk/c0;->a:Lk/c0;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v7, Lk/l0;->a:Lk/l0;

    invoke-virtual {v0, v2, v7}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Long;

    invoke-virtual {v0, v2, v7}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/math/BigInteger;

    sget-object v8, Lk/m;->a:Lk/m;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/math/BigDecimal;

    sget-object v8, Lk/l;->a:Lk/l;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v8, Lk/a0;->b:Lk/a0;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Float;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Double;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v8, Lk/n;->a:Lk/n;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, [C

    new-instance v9, Lk/p;

    invoke-direct {v9}, Lk/p;-><init>()V

    invoke-virtual {v0, v2, v9}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2, v8}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v2, v7}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v6, Lk/u0;->a:Lk/u0;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/ref/SoftReference;

    invoke-virtual {v0, v2, v6}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/UUID;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/TimeZone;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Locale;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/Currency;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/InetAddress;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/Inet4Address;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/Inet6Address;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/io/File;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/URI;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/net/URL;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Lf/g;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Number;

    invoke-virtual {v0, v2, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget-object v3, Lk/g;->a:Lk/g;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/StackTraceElement;

    sget-object v3, Lj/y;->a:Lj/y;

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/io/Serializable;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Cloneable;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/lang/Comparable;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Ljava/io/Closeable;

    invoke-virtual {v0, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Li/i;->a:Lm/f;

    const-class v2, Lf/f;

    new-instance v3, Lj/m;

    invoke-direct {v3}, Lj/m;-><init>()V

    invoke-virtual {v0, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Li/i;->k:[Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const/4 v2, 0x0

    :goto_1
    array-length v3, v0

    if-ge v2, v3, :cond_7

    aget-object v3, v0, v2

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    iget-object v4, p0, Li/i;->f:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_5

    aget-object v7, v4, v6

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    iget-object v4, p0, Li/i;->f:[Ljava/lang/String;

    array-length v5, v4

    add-int/lit8 v5, v5, 0x1

    new-array v6, v5, [Ljava/lang/String;

    array-length v7, v4

    invoke-static {v4, v1, v6, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, -0x1

    aput-object v3, v6, v5

    iput-object v6, p0, Li/i;->f:[Ljava/lang/String;

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    :goto_4
    sget-object v0, Li/i;->l:[Ljava/lang/String;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_5
    array-length v3, v0

    if-ge v2, v3, :cond_d

    aget-object v3, v0, v2

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    iget-object v4, p0, Li/i;->g:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v5, :cond_b

    aget-object v7, v4, v6

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_b
    iget-object v4, p0, Li/i;->g:[Ljava/lang/String;

    array-length v5, v4

    add-int/lit8 v5, v5, 0x1

    new-array v6, v5, [Ljava/lang/String;

    array-length v7, v4

    invoke-static {v4, v1, v6, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v5, -0x1

    aput-object v3, v6, v5

    iput-object v6, p0, Li/i;->g:[Ljava/lang/String;

    :cond_c
    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_d
    :goto_8
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/reflect/Field;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    :cond_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "m_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    :cond_1
    if-nez v0, :cond_4

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7a

    const/16 v4, 0x61

    if-lt v2, v4, :cond_2

    if-gt v2, v3, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    aget-char v5, v0, v1

    add-int/lit8 v5, v5, -0x20

    int-to-char v5, v5

    aput-char v5, v0, v1

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v5, 0x2

    if-le v1, v5, :cond_4

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v5, :cond_4

    if-lt v2, v4, :cond_4

    if-gt v2, v3, :cond_4

    const/16 v2, 0x41

    if-lt v1, v2, :cond_4

    const/16 v2, 0x5a

    if-gt v1, v2, :cond_4

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/Field;

    :cond_4
    return-object v0
.end method

.method public static e(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Character;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Byte;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Short;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Integer;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Long;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Float;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Double;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/math/BigInteger;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/math/BigDecimal;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/String;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/util/Date;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/sql/Date;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/sql/Time;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/sql/Timestamp;

    if-eq p0, v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static f(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Li/i;->f(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Li/i;->h:I

    const-string v3, "autoType is not support. "

    if-ge v1, v2, :cond_20

    const/16 v1, 0x24

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Li/i;->e:Z

    const/4 v4, 0x0

    if-nez v2, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v0

    goto :goto_4

    :cond_2
    :goto_0
    const/4 v2, 0x0

    move-object v5, v0

    :goto_1
    iget-object v6, p0, Li/i;->g:[Ljava/lang/String;

    array-length v7, v6

    if-ge v2, v7, :cond_4

    aget-object v6, v6, v2

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {p1}, Lm/j;->O(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    if-eqz v5, :cond_3

    return-object v5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_2
    iget-object v6, p0, Li/i;->f:[Ljava/lang/String;

    array-length v7, v6

    if-ge v2, v7, :cond_7

    aget-object v6, v6, v2

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    sget-object v6, Lm/j;->B:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    :goto_4
    if-nez v5, :cond_8

    sget-object v2, Lm/j;->B:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    :cond_8
    if-nez v5, :cond_c

    iget-object v2, p0, Li/i;->a:Lm/f;

    const/4 v5, 0x0

    :goto_5
    iget-object v6, v2, Lm/f;->a:[Lm/f$a;

    array-length v7, v6

    if-ge v5, v7, :cond_d

    aget-object v6, v6, v5

    if-nez v6, :cond_9

    goto :goto_7

    :cond_9
    move-object v7, v6

    :goto_6
    if-eqz v7, :cond_b

    iget-object v8, v6, Lm/f$a;->a:Ljava/lang/Object;

    instance-of v9, v8, Ljava/lang/Class;

    if-eqz v9, :cond_a

    check-cast v8, Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    move-object v0, v8

    goto :goto_8

    :cond_a
    iget-object v7, v7, Lm/f$a;->c:Lm/f$a;

    goto :goto_6

    :cond_b
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_c
    move-object v0, v5

    :cond_d
    :goto_8
    const-string v2, " -> "

    const-string v5, "type not match. "

    if-eqz v0, :cond_10

    if-eqz p2, :cond_f

    const-class v1, Ljava/util/HashMap;

    if-eq v0, v1, :cond_f

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_9

    :cond_e
    new-instance v0, Lf/d;

    invoke-static {v5, p1, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_9
    return-object v0

    :cond_10
    iget-boolean v6, p0, Li/i;->e:Z

    if-nez v6, :cond_17

    const/4 v6, 0x0

    :goto_a
    iget-object v7, p0, Li/i;->f:[Ljava/lang/String;

    array-length v8, v7

    if-ge v6, v8, :cond_12

    aget-object v7, v7, v6

    invoke-virtual {v1, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_11

    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_11
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_12
    :goto_b
    iget-object v6, p0, Li/i;->g:[Ljava/lang/String;

    array-length v7, v6

    if-ge v4, v7, :cond_17

    aget-object v6, v6, v4

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    if-nez v0, :cond_13

    invoke-static {p1}, Lm/j;->O(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_13
    if-eqz p2, :cond_15

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_14

    goto :goto_c

    :cond_14
    new-instance v0, Lf/d;

    invoke-static {v5, p1, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_c
    return-object v0

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_17
    if-nez v0, :cond_18

    invoke-static {p1}, Lm/j;->O(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_18
    if-eqz v0, :cond_1e

    const-class v1, Lg/d;

    invoke-static {v0, v1}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-eqz v1, :cond_19

    return-object v0

    :cond_19
    const-class v1, Ljava/lang/ClassLoader;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1d

    const-class v1, Ljavax/sql/DataSource;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1d

    if-eqz p2, :cond_1b

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1a

    return-object v0

    :cond_1a
    new-instance v0, Lf/d;

    invoke-static {v5, p1, v2}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    invoke-static {v0, v0}, Lm/g;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lm/g;

    move-result-object p2

    iget-object p2, p2, Lm/g;->d:Ljava/lang/reflect/Constructor;

    if-eqz p2, :cond_1e

    iget-boolean p2, p0, Li/i;->e:Z

    if-nez p2, :cond_1c

    goto :goto_d

    :cond_1c
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1d
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1e
    :goto_d
    iget-boolean p2, p0, Li/i;->e:Z

    if-eqz p2, :cond_1f

    return-object v0

    :cond_1f
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_20
    new-instance p2, Lf/d;

    invoke-static {v3, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lj/s;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, "java.util.Optional"

    iget-object v4, v1, Li/i;->a:Lm/f;

    invoke-virtual {v4, v0}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/s;

    if-eqz v4, :cond_0

    return-object v4

    :cond_0
    if-nez v0, :cond_1

    move-object v0, v2

    :cond_1
    iget-object v4, v1, Li/i;->a:Lm/f;

    invoke-virtual {v4, v0}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/s;

    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    const-class v5, Lg/d;

    invoke-static {v2, v5}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lg/d;

    if-eqz v5, :cond_3

    invoke-interface {v5}, Lg/d;->mappingTo()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ljava/lang/Void;

    if-eq v5, v6, :cond_3

    invoke-virtual {v1, v5, v5}, Li/i;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v5, v0, Ljava/lang/reflect/WildcardType;

    if-nez v5, :cond_4

    instance-of v5, v0, Ljava/lang/reflect/TypeVariable;

    if-nez v5, :cond_4

    instance-of v5, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_5

    :cond_4
    iget-object v4, v1, Li/i;->a:Lm/f;

    invoke-virtual {v4, v2}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj/s;

    :cond_5
    if-eqz v4, :cond_6

    return-object v4

    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x24

    const/16 v7, 0x2e

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    const-string v6, "java.awt."

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v6, :cond_9

    invoke-static/range {p1 .. p1}, Lk/i;->j(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_9

    sget-boolean v6, Li/i;->o:Z

    if-nez v6, :cond_9

    const-string v4, "java.awt.Point"

    const-string v6, "java.awt.Font"

    const-string v10, "java.awt.Rectangle"

    const-string v11, "java.awt.Color"

    filled-new-array {v4, v6, v10, v11}, [Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v7, :cond_8

    :try_start_0
    aget-object v10, v4, v6

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    iget-object v4, v1, Li/i;->a:Lm/f;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    sget-object v10, Lk/i;->a:Lk/i;

    invoke-virtual {v4, v6, v10}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v10

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    sput-boolean v8, Li/i;->o:Z

    :cond_8
    sget-object v4, Lk/i;->a:Lk/i;

    :cond_9
    sget-boolean v6, Li/i;->p:Z

    if-nez v6, :cond_d

    :try_start_1
    const-string v6, "java.time."

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v3, 0xc

    const-string v10, "java.time.LocalDateTime"

    const-string v11, "java.time.LocalDate"

    const-string v12, "java.time.LocalTime"

    const-string v13, "java.time.ZonedDateTime"

    const-string v14, "java.time.OffsetDateTime"

    const-string v15, "java.time.OffsetTime"

    const-string v16, "java.time.ZoneOffset"

    const-string v17, "java.time.ZoneRegion"

    const-string v18, "java.time.ZoneId"

    const-string v19, "java.time.Period"

    const-string v20, "java.time.Duration"

    const-string v21, "java.time.Instant"

    filled-new-array/range {v10 .. v21}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v3, :cond_d

    aget-object v10, v6, v7

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    iget-object v3, v1, Li/i;->a:Lm/f;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    sget-object v4, Lj/p;->a:Lj/p;

    invoke-virtual {v3, v6, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v4

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_b
    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    const-string v6, "java.util.OptionalDouble"

    const-string v10, "java.util.OptionalInt"

    const-string v11, "java.util.OptionalLong"

    filled-new-array {v3, v6, v10, v11}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v7, :cond_d

    aget-object v10, v3, v6

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    iget-object v3, v1, Li/i;->a:Lm/f;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    sget-object v4, Lj/t;->a:Lj/t;

    invoke-virtual {v3, v6, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object v4

    :cond_c
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :catchall_1
    sput-boolean v8, Li/i;->p:Z

    :cond_d
    const-string v3, "java.nio.file.Path"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v3, v1, Li/i;->a:Lm/f;

    sget-object v4, Lk/n0;->b:Lk/n0;

    invoke-virtual {v3, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_e
    const-class v3, Ljava/util/Map$Entry;

    if-ne v2, v3, :cond_f

    iget-object v3, v1, Li/i;->a:Lm/f;

    sget-object v4, Lk/n0;->b:Lk/n0;

    invoke-virtual {v3, v2, v4}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_f
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    :try_start_2
    const-class v5, Lj/d;

    invoke-static {v5, v3}, Lm/i;->a(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj/d;

    invoke-interface {v5}, Lj/d;->a()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/Type;

    iget-object v10, v1, Li/i;->a:Lm/f;

    invoke-virtual {v10, v7, v5}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    nop

    :cond_11
    if-nez v4, :cond_12

    iget-object v3, v1, Li/i;->a:Lm/f;

    invoke-virtual {v3, v0}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj/s;

    :cond_12
    if-eqz v4, :cond_13

    return-object v4

    :cond_13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isEnum()Z

    move-result v3

    if-eqz v3, :cond_15

    const-class v3, Lg/d;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lg/d;

    if-eqz v3, :cond_14

    invoke-interface {v3}, Lg/d;->deserializer()Ljava/lang/Class;

    move-result-object v3

    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj/s;

    iget-object v4, v1, Li/i;->a:Lm/f;

    invoke-virtual {v4, v2, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-object v3

    :catchall_2
    :cond_14
    new-instance v3, Lj/g;

    invoke-direct {v3, v2}, Lj/g;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_b

    :cond_15
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_16

    sget-object v3, Lk/p0;->a:Lk/p0;

    goto/16 :goto_b

    :cond_16
    const-class v3, Ljava/util/Set;

    if-eq v2, v3, :cond_32

    const-class v3, Ljava/util/HashSet;

    if-eq v2, v3, :cond_32

    const-class v3, Ljava/util/Collection;

    if-eq v2, v3, :cond_32

    const-class v3, Ljava/util/List;

    if-eq v2, v3, :cond_32

    const-class v3, Ljava/util/ArrayList;

    if-ne v2, v3, :cond_17

    goto/16 :goto_a

    :cond_17
    const-class v3, Ljava/util/Collection;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_18

    goto/16 :goto_a

    :cond_18
    const-class v3, Ljava/util/Map;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_19

    sget-object v3, Lj/q;->a:Lj/q;

    goto/16 :goto_b

    :cond_19
    const-class v3, Ljava/lang/Throwable;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1a

    new-instance v3, Lj/z;

    invoke-direct {v3, v1, v2}, Lj/z;-><init>(Li/i;Ljava/lang/Class;)V

    goto/16 :goto_b

    :cond_1a
    const-class v3, Lj/u;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1b

    new-instance v3, Lj/v;

    invoke-direct {v3, v2}, Lj/v;-><init>(Ljava/lang/Class;)V

    goto/16 :goto_b

    :cond_1b
    iget-boolean v3, v1, Li/i;->b:Z

    iget-boolean v4, v1, Li/i;->i:Z

    xor-int/2addr v4, v8

    and-int/2addr v3, v4

    if-eqz v3, :cond_20

    const-class v4, Lg/d;

    invoke-static {v2, v4}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lg/d;

    if-eqz v4, :cond_1d

    invoke-interface {v4}, Lg/d;->deserializer()Ljava/lang/Class;

    move-result-object v3

    const-class v5, Ljava/lang/Void;

    if-eq v3, v5, :cond_1c

    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lj/s;

    if-eqz v5, :cond_1c

    check-cast v3, Lj/s;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto/16 :goto_b

    :catchall_3
    :cond_1c
    invoke-interface {v4}, Lg/d;->asm()Z

    move-result v3

    :cond_1d
    if-eqz v3, :cond_20

    invoke-static {v2, v4}, Lm/g;->e(Ljava/lang/Class;Lg/d;)Ljava/lang/Class;

    move-result-object v4

    if-nez v4, :cond_1e

    move-object v4, v2

    :cond_1e
    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v5

    if-nez v5, :cond_1f

    const/4 v3, 0x0

    goto :goto_4

    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/lang/Object;

    if-eq v4, v5, :cond_20

    if-nez v4, :cond_1e

    :cond_20
    :goto_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v4

    array-length v4, v4

    if-eqz v4, :cond_21

    const/4 v3, 0x0

    :cond_21
    if-eqz v3, :cond_22

    iget-object v4, v1, Li/i;->d:Lj/a;

    if-eqz v4, :cond_22

    iget-object v4, v4, Lj/a;->a:Lm/a;

    invoke-virtual {v4, v2}, Lm/a;->b(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_22

    const/4 v3, 0x0

    :cond_22
    if-eqz v3, :cond_23

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v3

    :cond_23
    if-eqz v3, :cond_2f

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_24

    const/4 v3, 0x0

    :cond_24
    invoke-static {v2, v0}, Lm/g;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lm/g;

    move-result-object v4

    if-eqz v3, :cond_25

    iget-object v5, v4, Lm/g;->h:[Lm/c;

    array-length v5, v5

    const/16 v6, 0xc8

    if-le v5, v6, :cond_25

    const/4 v3, 0x0

    :cond_25
    iget-object v5, v4, Lm/g;->c:Ljava/lang/reflect/Constructor;

    if-eqz v3, :cond_26

    if-nez v5, :cond_26

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isInterface()Z

    move-result v5

    if-nez v5, :cond_26

    const/4 v3, 0x0

    :cond_26
    iget-object v4, v4, Lm/g;->h:[Lm/c;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v5, :cond_2f

    aget-object v7, v4, v6

    iget-boolean v10, v7, Lm/c;->i:Z

    if-eqz v10, :cond_27

    goto/16 :goto_6

    :cond_27
    iget-object v10, v7, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Class;->getModifiers()I

    move-result v11

    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v11

    if-nez v11, :cond_28

    goto :goto_6

    :cond_28
    invoke-virtual {v10}, Ljava/lang/Class;->isMemberClass()Z

    move-result v11

    if-eqz v11, :cond_29

    invoke-virtual {v10}, Ljava/lang/Class;->getModifiers()I

    move-result v11

    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v11

    if-nez v11, :cond_29

    goto :goto_6

    :cond_29
    invoke-virtual {v7}, Lm/c;->f()Ljava/lang/reflect/Member;

    move-result-object v11

    if-eqz v11, :cond_2a

    invoke-virtual {v7}, Lm/c;->f()Ljava/lang/reflect/Member;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2a

    goto :goto_6

    :cond_2a
    invoke-virtual {v7}, Lm/c;->c()Lg/b;

    move-result-object v11

    if-eqz v11, :cond_2b

    invoke-interface {v11}, Lg/b;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lm/b;->a(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2d

    invoke-interface {v11}, Lg/b;->format()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_2d

    invoke-interface {v11}, Lg/b;->deserializeUsing()Ljava/lang/Class;

    move-result-object v12

    const-class v13, Ljava/lang/Void;

    if-ne v12, v13, :cond_2d

    invoke-interface {v11}, Lg/b;->unwrapped()Z

    move-result v11

    if-nez v11, :cond_2d

    :cond_2b
    iget-object v7, v7, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_2c

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v7, v7

    if-le v7, v8, :cond_2c

    goto :goto_6

    :cond_2c
    invoke-virtual {v10}, Ljava/lang/Class;->isEnum()Z

    move-result v7

    if-eqz v7, :cond_2e

    invoke-virtual {v1, v10}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v7

    instance-of v7, v7, Lj/g;

    if-nez v7, :cond_2e

    :cond_2d
    :goto_6
    const/4 v3, 0x0

    goto :goto_7

    :cond_2e
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_5

    :cond_2f
    :goto_7
    if-eqz v3, :cond_30

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isMemberClass()Z

    move-result v4

    if-eqz v4, :cond_30

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-nez v4, :cond_30

    goto :goto_8

    :cond_30
    move v9, v3

    :goto_8
    if-nez v9, :cond_31

    new-instance v3, Lj/n;

    invoke-direct {v3, v1, v2, v0}, Lj/n;-><init>(Li/i;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    goto :goto_b

    :cond_31
    invoke-static {v2, v0}, Lm/g;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lm/g;

    move-result-object v3

    :try_start_5
    iget-object v4, v1, Li/i;->d:Lj/a;

    invoke-virtual {v4, v1, v3}, Lj/a;->p(Li/i;Lm/g;)Lj/s;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Lf/d; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_9

    :catch_1
    move-exception v0

    new-instance v3, Lf/d;

    const-string v4, "create asm deserializer error, "

    invoke-static {v4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_2
    new-instance v2, Lj/n;

    invoke-direct {v2, v1, v3}, Lj/n;-><init>(Li/i;Lm/g;)V

    :goto_9
    move-object v3, v2

    goto :goto_b

    :catch_3
    new-instance v3, Lj/n;

    invoke-direct {v3, v1, v2, v0}, Lj/n;-><init>(Li/i;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    goto :goto_b

    :cond_32
    :goto_a
    sget-object v3, Lk/s;->a:Lk/s;

    :goto_b
    iget-object v2, v1, Li/i;->a:Lm/f;

    invoke-virtual {v2, v0, v3}, Lm/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3
.end method

.method public final c(Ljava/lang/reflect/Type;)Lj/s;
    .locals 2

    iget-object v0, p0, Li/i;->a:Lm/f;

    invoke-virtual {v0, p1}, Lm/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/s;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Li/i;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Li/i;->b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0, v0}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/reflect/WildcardType;

    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p0, p1}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Lj/o;->a:Lj/o;

    return-object p1
.end method
