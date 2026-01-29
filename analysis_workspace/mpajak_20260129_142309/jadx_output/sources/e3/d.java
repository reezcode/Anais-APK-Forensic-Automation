package e3;

import android.os.Build;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2591a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2592b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set<String> f2593c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<String> f2594d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set<String> f2595e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set<String> f2596f;

    static {
        int i5;
        String str = Build.BRAND;
        if (str != null && !"".equals(str.trim())) {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.equals("huawei") || lowerCase.equals("honor") || lowerCase.equals("hihonor")) {
                i5 = 1;
            } else if (lowerCase.equals("xiaomi") || lowerCase.equals("redmi")) {
                i5 = 2;
            } else if (lowerCase.equals("oppo") || lowerCase.equals("realme")) {
                i5 = 3;
            } else if (lowerCase.equals("vivo")) {
                i5 = 4;
            } else if (lowerCase.equals("meizu")) {
                i5 = 5;
            } else if (lowerCase.equals("samsung")) {
                i5 = 6;
            } else if (lowerCase.equals("letv")) {
                i5 = 7;
            } else if (lowerCase.equals("smartisan")) {
                i5 = 8;
            } else if (lowerCase.equals("oneplus")) {
                i5 = 9;
            } else if (lowerCase.equals("lenovo")) {
                i5 = 10;
            } else if (lowerCase.equals("zte")) {
                i5 = 11;
            } else if (lowerCase.equals("coolpad") || lowerCase.equals("360")) {
                i5 = 12;
            } else if (lowerCase.equals("gionee")) {
                i5 = 13;
            } else if (lowerCase.equals("google")) {
                i5 = 14;
            } else if (lowerCase.equals("nubia")) {
                i5 = 15;
            } else if (lowerCase.equals("blackshark")) {
                i5 = 16;
            } else if (lowerCase.equals("asus")) {
                i5 = 17;
            }
            f2591a = i5;
            f2592b = i5 != 3 || i5 == 4 || (i5 == 1 && k3.a.h() && k3.a.d().startsWith("4.")) || Build.VERSION.SDK_INT > 32;
            HashSet hashSet = new HashSet();
            f2593c = hashSet;
            hashSet.add("权限");
            hashSet.add("權限");
            hashSet.add("Permissions");
            hashSet.add("権限");
            hashSet.add("Berechtigungen");
            hashSet.add("Permisos");
            hashSet.add("অনুমতি");
            hashSet.add("İzinler");
            hashSet.add("Разрешения");
            hashSet.add("권한");
            hashSet.add("ခွင့်ပြုချက်များ");
            hashSet.add("ການອະນຸຍາດ");
            hashSet.add("สิทธิ์");
            hashSet.add("අවසර");
            hashSet.add("Дозволи");
            hashSet.add("Зөвшөөрөл");
            hashSet.add("Разрешения");
            hashSet.add("Дазволы");
            hashSet.add("Άδειες");
            hashSet.add("Quyền");
            hashSet.add("Behörigheter");
            hashSet.add("Käyttöoikeudet");
            hashSet.add("Дозволе");
            hashSet.add("Dovoljenja");
            hashSet.add("Povolenia");
            hashSet.add("Permisiuni");
            hashSet.add("Permissões");
            hashSet.add("Uprawnienia");
            hashSet.add("Ruxsatlar");
            hashSet.add("Rechten");
            hashSet.add("Engedélyek");
            hashSet.add("Leidimai");
            hashSet.add("Atļaujas");
            hashSet.add("Ruhusa");
            hashSet.add("Autorizzazioni");
            hashSet.add("Izin");
            hashSet.add("Dozvole");
            hashSet.add("Autorisations");
            hashSet.add("Mga Pahintulot");
            hashSet.add("Tilladelser");
            hashSet.add("Oprávnění");
            hashSet.add("الأذونات");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f2594d = linkedHashSet;
            linkedHashSet.add("com.wallet.crypto.trustapp");
            linkedHashSet.add("vip.mytokenpocket");
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
            linkedHashSet.add("org.toshi");
            linkedHashSet.add("com.tronlinkpro.wallet");
            linkedHashSet.add("com.tronlink.global");
            linkedHashSet.add("com.binance.dev");
            linkedHashSet.add("com.okinc.okex.gp");
            HashSet hashSet2 = new HashSet();
            f2595e = hashSet2;
            hashSet2.add("en");
            hashSet2.add("fr");
            hashSet2.add("ar");
            hashSet2.add("cn");
            hashSet2.add("de");
            hashSet2.add("es");
            hashSet2.add("it");
            hashSet2.add("ja");
            hashSet2.add("ko");
            hashSet2.add("pt");
            hashSet2.add("tr");
            hashSet2.add("my");
            HashSet hashSet3 = new HashSet();
            f2596f = hashSet3;
            hashSet3.add("Google Play Store");
            hashSet3.add("Google Play 商店");
            hashSet3.add("Google Play ストア");
            hashSet3.add("فروشگاه Google Play");
            hashSet3.add("Cửa hàng Google Play");
            hashSet3.add("Google Play 스토어");
            hashSet3.add("Google Play trgovina");
            hashSet3.add("Magazin Google Play");
            hashSet3.add("Google Play Маркет");
            hashSet3.add("Google Play स्टोर");
            hashSet3.add("متجر Google Play");
            hashSet3.add("Google Play Winkel");
            hashSet3.add("Obchod Google Play");
            hashSet3.add("Google Play Butik");
            hashSet3.add("Крама Google Play");
            hashSet3.add("Trgovina Google Play");
            hashSet3.add("Sklep Google Play");
            hashSet3.add("Google Play Áruház");
            hashSet3.add("„Google Play“ parduotuvė");
            hashSet3.add("Google Play veikals");
            hashSet3.add("Google Play Market");
            hashSet3.add("Google Play Kauppa");
            hashSet3.add("Google Play Магазин");
            hashSet3.add("Google Play pood");
            hashSet3.add("חנות Google Play");
            hashSet3.add("\u202bGoogle Play اسٹور");
            hashSet3.add("Google Play Խանութ");
        }
        i5 = 0;
        f2591a = i5;
        f2592b = i5 != 3 || i5 == 4 || (i5 == 1 && k3.a.h() && k3.a.d().startsWith("4.")) || Build.VERSION.SDK_INT > 32;
        HashSet hashSet4 = new HashSet();
        f2593c = hashSet4;
        hashSet4.add("权限");
        hashSet4.add("權限");
        hashSet4.add("Permissions");
        hashSet4.add("権限");
        hashSet4.add("Berechtigungen");
        hashSet4.add("Permisos");
        hashSet4.add("অনুমতি");
        hashSet4.add("İzinler");
        hashSet4.add("Разрешения");
        hashSet4.add("권한");
        hashSet4.add("ခွင့်ပြုချက်များ");
        hashSet4.add("ການອະນຸຍາດ");
        hashSet4.add("สิทธิ์");
        hashSet4.add("අවසර");
        hashSet4.add("Дозволи");
        hashSet4.add("Зөвшөөрөл");
        hashSet4.add("Разрешения");
        hashSet4.add("Дазволы");
        hashSet4.add("Άδειες");
        hashSet4.add("Quyền");
        hashSet4.add("Behörigheter");
        hashSet4.add("Käyttöoikeudet");
        hashSet4.add("Дозволе");
        hashSet4.add("Dovoljenja");
        hashSet4.add("Povolenia");
        hashSet4.add("Permisiuni");
        hashSet4.add("Permissões");
        hashSet4.add("Uprawnienia");
        hashSet4.add("Ruxsatlar");
        hashSet4.add("Rechten");
        hashSet4.add("Engedélyek");
        hashSet4.add("Leidimai");
        hashSet4.add("Atļaujas");
        hashSet4.add("Ruhusa");
        hashSet4.add("Autorizzazioni");
        hashSet4.add("Izin");
        hashSet4.add("Dozvole");
        hashSet4.add("Autorisations");
        hashSet4.add("Mga Pahintulot");
        hashSet4.add("Tilladelser");
        hashSet4.add("Oprávnění");
        hashSet4.add("الأذونات");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        f2594d = linkedHashSet2;
        linkedHashSet2.add("com.wallet.crypto.trustapp");
        linkedHashSet2.add("vip.mytokenpocket");
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
        linkedHashSet2.add("org.toshi");
        linkedHashSet2.add("com.tronlinkpro.wallet");
        linkedHashSet2.add("com.tronlink.global");
        linkedHashSet2.add("com.binance.dev");
        linkedHashSet2.add("com.okinc.okex.gp");
        HashSet hashSet22 = new HashSet();
        f2595e = hashSet22;
        hashSet22.add("en");
        hashSet22.add("fr");
        hashSet22.add("ar");
        hashSet22.add("cn");
        hashSet22.add("de");
        hashSet22.add("es");
        hashSet22.add("it");
        hashSet22.add("ja");
        hashSet22.add("ko");
        hashSet22.add("pt");
        hashSet22.add("tr");
        hashSet22.add("my");
        HashSet hashSet32 = new HashSet();
        f2596f = hashSet32;
        hashSet32.add("Google Play Store");
        hashSet32.add("Google Play 商店");
        hashSet32.add("Google Play ストア");
        hashSet32.add("فروشگاه Google Play");
        hashSet32.add("Cửa hàng Google Play");
        hashSet32.add("Google Play 스토어");
        hashSet32.add("Google Play trgovina");
        hashSet32.add("Magazin Google Play");
        hashSet32.add("Google Play Маркет");
        hashSet32.add("Google Play स्टोर");
        hashSet32.add("متجر Google Play");
        hashSet32.add("Google Play Winkel");
        hashSet32.add("Obchod Google Play");
        hashSet32.add("Google Play Butik");
        hashSet32.add("Крама Google Play");
        hashSet32.add("Trgovina Google Play");
        hashSet32.add("Sklep Google Play");
        hashSet32.add("Google Play Áruház");
        hashSet32.add("„Google Play“ parduotuvė");
        hashSet32.add("Google Play veikals");
        hashSet32.add("Google Play Market");
        hashSet32.add("Google Play Kauppa");
        hashSet32.add("Google Play Магазин");
        hashSet32.add("Google Play pood");
        hashSet32.add("חנות Google Play");
        hashSet32.add("\u202bGoogle Play اسٹور");
        hashSet32.add("Google Play Խանութ");
    }

    public static String a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
