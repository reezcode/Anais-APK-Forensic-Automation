package q0;

/* loaded from: classes24.dex */
public final class b extends UnsupportedOperationException {

    /* renamed from: b, reason: collision with root package name */
    public final p0.b f4720b;

    public b(p0.b bVar) {
        this.f4720b = bVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.f4720b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
