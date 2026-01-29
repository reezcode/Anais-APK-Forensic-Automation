.class public final Lq/c;
.super Ljava/lang/Object;


# static fields
.field public static final e:Ld1/c;


# instance fields
.field public final a:Lq/b;

.field public final b:Ls/b;

.field public final c:Landroid/content/ContentResolver;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld1/c;

    invoke-direct {v0}, Ld1/c;-><init>()V

    sput-object v0, Lq/c;->e:Ld1/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lq/b;Ls/b;Landroid/content/ContentResolver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Lq/b;",
            "Ls/b;",
            "Landroid/content/ContentResolver;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq/c;->a:Lq/b;

    iput-object p3, p0, Lq/c;->b:Ls/b;

    iput-object p4, p0, Lq/c;->c:Landroid/content/ContentResolver;

    iput-object p1, p0, Lq/c;->d:Ljava/util/List;

    return-void
.end method
