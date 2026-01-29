package org.apache.commons.io;

import java.util.function.Supplier;
import org.apache.commons.io.input.ReadAheadInputStream;

/* loaded from: classes13.dex */
public final /* synthetic */ class c implements Supplier {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f4584b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c f4585c = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4586a;

    public /* synthetic */ c(int i5) {
        this.f4586a = i5;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        byte[] lambda$static$0;
        char[] charArray;
        switch (this.f4586a) {
            case 0:
                charArray = IOUtils.charArray();
                return charArray;
            default:
                lambda$static$0 = ReadAheadInputStream.lambda$static$0();
                return lambda$static$0;
        }
    }
}
