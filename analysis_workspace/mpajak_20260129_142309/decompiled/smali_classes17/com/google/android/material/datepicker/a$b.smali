.class public final Lcom/google/android/material/datepicker/a$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/datepicker/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:J

.field public static final f:J


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/Long;

.field public d:Lcom/google/android/material/datepicker/a$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x76c

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/u;->k(II)Lcom/google/android/material/datepicker/u;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/u;->g:J

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/c0;->a(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/material/datepicker/a$b;->e:J

    const/16 v0, 0x834

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/u;->k(II)Lcom/google/android/material/datepicker/u;

    move-result-object v0

    iget-wide v0, v0, Lcom/google/android/material/datepicker/u;->g:J

    invoke-static {v0, v1}, Lcom/google/android/material/datepicker/c0;->a(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/material/datepicker/a$b;->f:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/datepicker/a;)V
    .locals 2
    .param p1    # Lcom/google/android/material/datepicker/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-wide v0, Lcom/google/android/material/datepicker/a$b;->e:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->a:J

    sget-wide v0, Lcom/google/android/material/datepicker/a$b;->f:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->b:J

    new-instance v0, Lcom/google/android/material/datepicker/f;

    invoke-direct {v0}, Lcom/google/android/material/datepicker/f;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/datepicker/a$b;->d:Lcom/google/android/material/datepicker/a$c;

    iget-object v0, p1, Lcom/google/android/material/datepicker/a;->b:Lcom/google/android/material/datepicker/u;

    iget-wide v0, v0, Lcom/google/android/material/datepicker/u;->g:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->a:J

    iget-object v0, p1, Lcom/google/android/material/datepicker/a;->c:Lcom/google/android/material/datepicker/u;

    iget-wide v0, v0, Lcom/google/android/material/datepicker/u;->g:J

    iput-wide v0, p0, Lcom/google/android/material/datepicker/a$b;->b:J

    iget-object v0, p1, Lcom/google/android/material/datepicker/a;->e:Lcom/google/android/material/datepicker/u;

    iget-wide v0, v0, Lcom/google/android/material/datepicker/u;->g:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/datepicker/a$b;->c:Ljava/lang/Long;

    iget-object p1, p1, Lcom/google/android/material/datepicker/a;->d:Lcom/google/android/material/datepicker/a$c;

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$b;->d:Lcom/google/android/material/datepicker/a$c;

    return-void
.end method
