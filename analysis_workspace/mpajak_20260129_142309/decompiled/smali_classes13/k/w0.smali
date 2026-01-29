.class public final Lk/w0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lg/d;

.field public final e:[Lm/c;

.field public final f:[Lm/c;

.field public g:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lg/d;Ljava/lang/String;Ljava/lang/String;I[Lm/c;[Lm/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lg/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I[",
            "Lm/c;",
            "[",
            "Lm/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/w0;->a:Ljava/lang/Class;

    iput-object p2, p0, Lk/w0;->d:Lg/d;

    iput-object p3, p0, Lk/w0;->b:Ljava/lang/String;

    iput-object p4, p0, Lk/w0;->c:Ljava/lang/String;

    iput p5, p0, Lk/w0;->g:I

    iput-object p6, p0, Lk/w0;->e:[Lm/c;

    iput-object p7, p0, Lk/w0;->f:[Lm/c;

    return-void
.end method
