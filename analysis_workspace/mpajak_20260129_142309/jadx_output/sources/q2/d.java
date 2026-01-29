package q2;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;
import t2.m;

/* loaded from: classes7.dex */
public final class d implements c3.e {

    /* renamed from: e, reason: collision with root package name */
    public static final u2.d f4743e = new u2.d();

    /* renamed from: a, reason: collision with root package name */
    public final Cursor f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final m f4747d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public d(Cursor cursor, m mVar) {
        this.f4744a = cursor;
        String[] columnNames = cursor.getColumnNames();
        this.f4745b = columnNames;
        if (columnNames.length >= 8) {
            this.f4746c = new HashMap();
            int i5 = 0;
            while (true) {
                String[] strArr = this.f4745b;
                if (i5 >= strArr.length) {
                    break;
                }
                this.f4746c.put(strArr[i5], Integer.valueOf(i5));
                i5++;
            }
        } else {
            this.f4746c = null;
        }
        this.f4747d = mVar;
    }

    public final void a() {
        this.f4744a.close();
    }

    public final boolean b() {
        return this.f4744a.moveToFirst();
    }

    public final byte[] c(int i5) {
        return this.f4744a.getBlob(i5);
    }

    public final long d(int i5) {
        return this.f4744a.getLong(i5);
    }

    public final String e(int i5) {
        return this.f4744a.getString(i5);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final int f(String str) {
        ?? r02 = this.f4746c;
        if (r02 != 0) {
            Integer num = (Integer) r02.get(str);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
        int i5 = 0;
        while (true) {
            String[] strArr = this.f4745b;
            if (i5 >= strArr.length) {
                return -1;
            }
            if (strArr[i5].equals(str)) {
                return i5;
            }
            i5++;
        }
    }

    public final boolean g() {
        return this.f4744a.moveToNext();
    }

    public final boolean h(int i5) {
        return this.f4744a.isNull(i5);
    }

    public final String toString() {
        return d.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
