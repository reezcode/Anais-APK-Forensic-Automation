package i2;

/* loaded from: classes16.dex */
public final class d extends z<Number> {
    @Override // i2.z
    public final Number a(p2.a aVar) {
        if (aVar.N() != 9) {
            return Double.valueOf(aVar.y());
        }
        aVar.I();
        return null;
    }

    @Override // i2.z
    public final void b(p2.b bVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            bVar.q();
        } else {
            i.b(number2.doubleValue());
            bVar.A(number2);
        }
    }
}
