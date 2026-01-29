package u2;

import c3.e;
import d1.f;
import v2.g;

/* loaded from: classes7.dex */
public abstract class a implements c {

    /* renamed from: u2.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static class C0071a extends f {
        @Override // d1.f
        public final Object J(g gVar, Object obj, int i5) {
            return ((Byte) obj).byteValue() == 1 ? Boolean.TRUE : Boolean.FALSE;
        }

        @Override // v2.f
        public final Object d(e eVar, int i5) {
            return Byte.valueOf((byte) ((q2.d) eVar).f4744a.getShort(i5));
        }

        @Override // d1.f, v2.f
        public final Object e(g gVar, Object obj) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        }

        @Override // v2.f
        public final int s() {
            return 4;
        }

        @Override // v2.f
        public final Object x(g gVar, String str) {
            return Byte.valueOf(Boolean.parseBoolean(str) ? (byte) 1 : (byte) 0);
        }
    }

    public final void a(StringBuilder sb, String str) {
        sb.append('`');
        sb.append(str);
        sb.append('`');
    }
}
