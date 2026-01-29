.class public final Lw3/e$c;
.super Lf4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw3/e;-><init>(Ls3/w;Ls3/y;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic l:Lw3/e;


# direct methods
.method public constructor <init>(Lw3/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lw3/e$c;->l:Lw3/e;

    invoke-direct {p0}, Lf4/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 1

    iget-object v0, p0, Lw3/e$c;->l:Lw3/e;

    invoke-virtual {v0}, Lw3/e;->d()V

    return-void
.end method
