package org.apache.commons.io;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class IOExceptionList extends IOException {
    private static final long serialVersionUID = 1;
    private final List<? extends Throwable> causeList;

    public IOExceptionList(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        this.causeList = list == null ? Collections.emptyList() : list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IOExceptionList(java.util.List<? extends java.lang.Throwable> r4) {
        /*
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            if (r4 != 0) goto L8
            r2 = 0
            goto Lc
        L8:
            int r2 = r4.size()
        Lc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            r1 = 1
            r0[r1] = r4
            java.lang.String r1 = "%,d exceptions: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.IOExceptionList.<init>(java.util.List):void");
    }

    public <T extends Throwable> T getCause(int i5) {
        return (T) this.causeList.get(i5);
    }

    public <T extends Throwable> T getCause(int i5, Class<T> cls) {
        return cls.cast(this.causeList.get(i5));
    }

    public <T extends Throwable> List<T> getCauseList() {
        return (List<T>) this.causeList;
    }

    public <T extends Throwable> List<T> getCauseList(Class<T> cls) {
        return (List<T>) this.causeList;
    }
}
