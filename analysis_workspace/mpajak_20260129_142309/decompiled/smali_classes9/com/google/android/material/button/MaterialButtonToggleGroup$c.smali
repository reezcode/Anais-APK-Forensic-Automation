.class public final Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/button/MaterialButtonToggleGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final e:Lb2/a;


# instance fields
.field public a:Lb2/c;

.field public b:Lb2/c;

.field public c:Lb2/c;

.field public d:Lb2/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb2/a;-><init>(F)V

    sput-object v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:Lb2/a;

    return-void
.end method

.method public constructor <init>(Lb2/c;Lb2/c;Lb2/c;Lb2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->a:Lb2/c;

    iput-object p3, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->b:Lb2/c;

    iput-object p4, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c:Lb2/c;

    iput-object p2, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d:Lb2/c;

    return-void
.end method
