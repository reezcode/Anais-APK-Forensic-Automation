.class public final La3/g;
.super La3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "La3/b<",
        "TT;TID;>;"
    }
.end annotation


# static fields
.field public static final synthetic i:I


# instance fields
.field public final g:Lv2/g;

.field public final h:I


# direct methods
.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;Lv2/g;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            "Lv2/g;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, La3/b;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;)V

    iput-object p4, p0, La3/g;->g:Lv2/g;

    iput p5, p0, La3/g;->h:I

    return-void
.end method
