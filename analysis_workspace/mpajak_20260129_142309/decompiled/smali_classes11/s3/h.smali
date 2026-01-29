.class public final Ls3/h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/h$b;
    }
.end annotation


# static fields
.field public static final b:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ls3/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final e:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final f:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final g:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final h:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final i:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final j:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final k:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final l:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final m:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final n:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final o:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final p:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final q:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final r:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final s:Ls3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final t:Ls3/h$b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls3/h$b;

    invoke-direct {v0}, Ls3/h$b;-><init>()V

    sput-object v0, Ls3/h;->t:Ls3/h$b;

    new-instance v1, Ls3/h$a;

    invoke-direct {v1}, Ls3/h$a;-><init>()V

    sput-object v1, Ls3/h;->b:Ls3/h$a;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, Ls3/h;->c:Ljava/util/LinkedHashMap;

    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->d:Ls3/h;

    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->e:Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->f:Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->g:Ls3/h;

    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->h:Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_FALLBACK_SCSV"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->i:Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->j:Ls3/h;

    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->k:Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->l:Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->m:Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->n:Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->o:Ls3/h;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->p:Ls3/h;

    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->q:Ls3/h;

    const-string v1, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->r:Ls3/h;

    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    move-result-object v1

    sput-object v1, Ls3/h;->s:Ls3/h;

    const-string v1, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    invoke-static {v0, v1}, Ls3/h$b;->a(Ls3/h$b;Ljava/lang/String;)Ls3/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/h;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/h;->a:Ljava/lang/String;

    return-object v0
.end method
