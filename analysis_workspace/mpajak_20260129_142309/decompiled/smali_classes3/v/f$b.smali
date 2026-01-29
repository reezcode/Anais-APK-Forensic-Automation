.class public final Lv/f$b;
.super Lv/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv/f$a<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lv/f$b$a;

    invoke-direct {v0}, Lv/f$b$a;-><init>()V

    invoke-direct {p0, v0}, Lv/f$a;-><init>(Lv/f$d;)V

    return-void
.end method
