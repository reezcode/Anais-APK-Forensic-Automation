package org.apache.commons.io;

import java.nio.file.Path;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f4582a = new a();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Path) obj).toFile();
    }
}
