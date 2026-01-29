.class public final Lk/x;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/x;

    invoke-direct {v0}, Lk/x;-><init>()V

    sput-object v0, Lk/x;->a:Lk/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    check-cast p2, Ljava/lang/Enum;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lk/a1;->E()V

    goto :goto_2

    :cond_0
    const/4 p3, 0x0

    iget-boolean p4, p1, Lk/a1;->m:Z

    if-eqz p4, :cond_1

    iget-boolean p4, p1, Lk/a1;->n:Z

    if-nez p4, :cond_1

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    iget-boolean p4, p1, Lk/a1;->n:Z

    if-eqz p4, :cond_2

    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p3

    :cond_2
    :goto_0
    if-eqz p3, :cond_4

    sget-object p2, Lk/b1;->d:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->l(Lk/b1;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/16 p2, 0x27

    goto :goto_1

    :cond_3
    const/16 p2, 0x22

    :goto_1
    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    invoke-virtual {p1, p3}, Lk/a1;->write(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Lk/a1;->z(I)V

    :goto_2
    return-void
.end method
