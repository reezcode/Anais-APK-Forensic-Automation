.class public final Lh1/b$a;
.super Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh1/b;->a(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh1/b;


# direct methods
.method public constructor <init>(Lh1/b;)V
    .locals 0

    iput-object p1, p0, Lh1/b$a;->a:Lh1/b;

    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lh1/b$a;->a:Lh1/b;

    iget-object v0, v0, Lh1/b;->b:Lcom/google/android/material/bottomappbar/BottomAppBar;

    sget v1, Lcom/google/android/material/bottomappbar/BottomAppBar;->k:I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
