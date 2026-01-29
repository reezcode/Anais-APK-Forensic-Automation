.class public final synthetic Lorg/apache/commons/io/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Supplier;


# static fields
.field public static final synthetic b:Lorg/apache/commons/io/c;

.field public static final synthetic c:Lorg/apache/commons/io/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/apache/commons/io/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/commons/io/c;-><init>(I)V

    sput-object v0, Lorg/apache/commons/io/c;->b:Lorg/apache/commons/io/c;

    new-instance v0, Lorg/apache/commons/io/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/apache/commons/io/c;-><init>(I)V

    sput-object v0, Lorg/apache/commons/io/c;->c:Lorg/apache/commons/io/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lorg/apache/commons/io/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lorg/apache/commons/io/c;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {}, Lorg/apache/commons/io/IOUtils;->c()[C

    move-result-object v0

    return-object v0

    :goto_0
    invoke-static {}, Lorg/apache/commons/io/input/ReadAheadInputStream;->c()[B

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
