package j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes17.dex */
public final class c extends k {

    /* renamed from: c, reason: collision with root package name */
    public final Type f3369c;

    /* renamed from: d, reason: collision with root package name */
    public int f3370d;

    /* renamed from: e, reason: collision with root package name */
    public s f3371e;

    public c(Class cls, m.c cVar) {
        super(cls, cVar);
        Type type;
        Type type2 = cVar.f4066g;
        if (type2 instanceof ParameterizedType) {
            type = ((ParameterizedType) type2).getActualTypeArguments()[0];
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                if (upperBounds.length == 1) {
                    type = upperBounds[0];
                }
            }
        } else {
            type = Object.class;
        }
        this.f3369c = type;
    }

    @Override // j.k
    public final int a() {
        return 14;
    }

    @Override // j.k
    public final void b(i.a aVar, Object obj, Type type, Map<String, Object> map) {
        Class cls;
        int i5;
        int i6;
        int i7;
        i.c cVar = aVar.f3146g;
        int q4 = cVar.q();
        if (q4 == 8 || (q4 == 4 && cVar.k0().length() == 0)) {
            c(obj, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        i.h hVar = aVar.f3147h;
        aVar.M(hVar, obj, this.f3377a.f4061b);
        Type type2 = this.f3369c;
        s sVar = this.f3371e;
        if (type instanceof ParameterizedType) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type2;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls != null) {
                    int length = cls.getTypeParameters().length;
                    i7 = 0;
                    while (i7 < length) {
                        if (cls.getTypeParameters()[i7].getName().equals(typeVariable.getName())) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                i7 = -1;
                if (i7 != -1) {
                    type2 = parameterizedType.getActualTypeArguments()[i7];
                    if (!type2.equals(this.f3369c)) {
                        sVar = aVar.f3143d.c(type2);
                    }
                }
            } else if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                if (actualTypeArguments.length == 1 && (actualTypeArguments[0] instanceof TypeVariable)) {
                    TypeVariable typeVariable2 = (TypeVariable) actualTypeArguments[0];
                    ParameterizedType parameterizedType3 = (ParameterizedType) type;
                    cls = parameterizedType3.getRawType() instanceof Class ? (Class) parameterizedType3.getRawType() : null;
                    if (cls != null) {
                        int length2 = cls.getTypeParameters().length;
                        i6 = 0;
                        while (i6 < length2) {
                            if (cls.getTypeParameters()[i6].getName().equals(typeVariable2.getName())) {
                                i5 = -1;
                                break;
                            }
                            i6++;
                        }
                    }
                    i5 = -1;
                    i6 = -1;
                    if (i6 != i5) {
                        actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i6];
                        type2 = new m.h(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                    }
                }
            }
        }
        i.c cVar2 = aVar.f3146g;
        if (cVar2.q() == 14) {
            if (sVar == null) {
                sVar = aVar.f3143d.c(type2);
                this.f3371e = sVar;
                this.f3370d = sVar.e();
            }
            s sVar2 = sVar;
            cVar2.Q(this.f3370d);
            int i8 = 0;
            while (true) {
                if (cVar2.A(i.b.AllowArbitraryCommas)) {
                    while (cVar2.q() == 16) {
                        cVar2.y();
                    }
                }
                if (cVar2.q() == 15) {
                    break;
                }
                arrayList.add(sVar2.c(aVar, type2, Integer.valueOf(i8)));
                aVar.c(arrayList);
                if (cVar2.q() == 16) {
                    cVar2.Q(this.f3370d);
                }
                i8++;
            }
            cVar2.Q(16);
        } else {
            if (sVar == null) {
                sVar = aVar.f3143d.c(type2);
                this.f3371e = sVar;
            }
            arrayList.add(sVar.c(aVar, type2, 0));
            aVar.c(arrayList);
        }
        aVar.P(hVar);
        if (obj == null) {
            map.put(this.f3377a.f4061b, arrayList);
        } else {
            c(obj, arrayList);
        }
    }
}
