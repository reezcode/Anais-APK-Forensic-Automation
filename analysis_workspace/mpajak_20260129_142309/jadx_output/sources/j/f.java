package j;

import i.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes14.dex */
public final class f extends k {

    /* renamed from: c, reason: collision with root package name */
    public s f3372c;

    public f(Class cls, m.c cVar) {
        super(cls, cVar);
    }

    @Override // j.k
    public final int a() {
        s sVar = this.f3372c;
        if (sVar != null) {
            return sVar.e();
        }
        return 2;
    }

    @Override // j.k
    public final void b(i.a aVar, Object obj, Type type, Map<String, Object> map) {
        Object c5;
        m.c cVar;
        int i5;
        if (this.f3372c == null) {
            e(aVar.f3143d);
        }
        s sVar = this.f3372c;
        Type type2 = this.f3377a.f4066g;
        if (type instanceof ParameterizedType) {
            i.h hVar = aVar.f3147h;
            if (hVar != null) {
                hVar.f3224d = type;
            }
            if (type2 != type) {
                type2 = m.c.e(this.f3378b, type, type2);
                sVar = aVar.f3143d.c(type2);
            }
        }
        if (!(sVar instanceof n) || (i5 = (cVar = this.f3377a).f4070k) == 0) {
            m.c cVar2 = this.f3377a;
            String str = cVar2.f4079t;
            c5 = (str == null || !(sVar instanceof e)) ? sVar.c(aVar, type2, cVar2.f4061b) : ((e) sVar).f(aVar, type2, cVar2.f4061b, str);
        } else {
            c5 = ((n) sVar).f(aVar, type2, cVar.f4061b, i5);
        }
        if ((c5 instanceof byte[]) && ("gzip".equals(this.f3377a.f4079t) || "gzip,base64".equals(this.f3377a.f4079t))) {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) c5));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    byte[] bArr = new byte[1024];
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                c5 = byteArrayOutputStream.toByteArray();
            } catch (IOException e5) {
                throw new f.d("unzip bytes error.", e5);
            }
        }
        if (aVar.f3151l == 1) {
            a.C0035a p4 = aVar.p();
            p4.f3157c = this;
            p4.f3158d = aVar.f3147h;
            aVar.f3151l = 0;
            return;
        }
        if (obj == null) {
            map.put(this.f3377a.f4061b, c5);
        } else {
            c(obj, c5);
        }
    }

    public final s e(i.i iVar) {
        if (this.f3372c == null) {
            g.b c5 = this.f3377a.c();
            if (c5 == null || c5.deserializeUsing() == Void.class) {
                m.c cVar = this.f3377a;
                this.f3372c = iVar.b(cVar.f4065f, cVar.f4066g);
            } else {
                try {
                    this.f3372c = (s) c5.deserializeUsing().newInstance();
                } catch (Exception e5) {
                    throw new f.d("create deserializeUsing ObjectDeserializer error", e5);
                }
            }
        }
        return this.f3372c;
    }
}
