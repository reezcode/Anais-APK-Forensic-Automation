.class public final Li/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Li/h;

.field public final b:Ljava/lang/String;

.field public c:Lj/k;

.field public d:Li/h;


# direct methods
.method public constructor <init>(Li/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li/a$a;->a:Li/h;

    iput-object p2, p0, Li/a$a;->b:Ljava/lang/String;

    return-void
.end method
