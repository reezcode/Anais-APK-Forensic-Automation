.class public final Le4/d$d;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic e:Le4/d;


# direct methods
.method public constructor <init>(Le4/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Le4/d$d;->e:Le4/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Le4/d;->g:Ljava/lang/String;

    const-string v1, " writer"

    invoke-static {v0, p1, v1}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    :try_start_0
    iget-object v0, p0, Le4/d$d;->e:Le4/d;

    invoke-virtual {v0}, Le4/d;->m()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Le4/d$d;->e:Le4/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
