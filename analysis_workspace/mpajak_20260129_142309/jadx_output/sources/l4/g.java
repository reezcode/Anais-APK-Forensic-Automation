package l4;

/* loaded from: classes19.dex */
public final class g implements d {
    public final String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
