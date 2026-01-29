package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes22.dex */
public final class WorkSpecKt {
    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "<this>");
        return new WorkGenerationalId(workSpec.id, workSpec.getGeneration());
    }
}
