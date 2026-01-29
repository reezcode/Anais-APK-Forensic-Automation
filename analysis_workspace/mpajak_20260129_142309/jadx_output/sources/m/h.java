package m;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes16.dex */
public final class h implements ParameterizedType {

    /* renamed from: b, reason: collision with root package name */
    public final Type[] f4118b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f4119c;

    /* renamed from: d, reason: collision with root package name */
    public final Type f4120d;

    public h(Type[] typeArr, Type type, Type type2) {
        this.f4118b = typeArr;
        this.f4119c = type;
        this.f4120d = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!Arrays.equals(this.f4118b, hVar.f4118b)) {
            return false;
        }
        Type type = this.f4119c;
        if (type == null ? hVar.f4119c != null : !type.equals(hVar.f4119c)) {
            return false;
        }
        Type type2 = this.f4120d;
        Type type3 = hVar.f4120d;
        return type2 != null ? type2.equals(type3) : type3 == null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f4118b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4119c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4120d;
    }

    public final int hashCode() {
        Type[] typeArr = this.f4118b;
        int hashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f4119c;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f4120d;
        return hashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
