.class public final Lx2/a$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/regex/Pattern;

.field public b:Lx2/b$a;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;Lx2/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/a$b;->a:Ljava/util/regex/Pattern;

    iput-object p2, p0, Lx2/a$b;->b:Lx2/b$a;

    return-void
.end method
