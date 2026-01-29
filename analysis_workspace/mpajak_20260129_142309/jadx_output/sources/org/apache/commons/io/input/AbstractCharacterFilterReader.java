package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.Reader;
import java.util.function.IntPredicate;

/* loaded from: classes21.dex */
public abstract class AbstractCharacterFilterReader extends FilterReader {
    public static final IntPredicate SKIP_NONE = new IntPredicate() { // from class: org.apache.commons.io.input.a
        @Override // java.util.function.IntPredicate
        public final boolean test(int i5) {
            boolean lambda$static$0;
            lambda$static$0 = AbstractCharacterFilterReader.lambda$static$0(i5);
            return lambda$static$0;
        }
    };
    private final IntPredicate skip;

    public AbstractCharacterFilterReader(Reader reader) {
        this(reader, SKIP_NONE);
    }

    public AbstractCharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader);
        this.skip = intPredicate == null ? SKIP_NONE : intPredicate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(int i5) {
        return false;
    }

    public boolean filter(int i5) {
        return this.skip.test(i5);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() {
        int read;
        do {
            read = ((FilterReader) this).in.read();
            if (read == -1) {
                break;
            }
        } while (filter(read));
        return read;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        int read = super.read(cArr, i5, i6);
        if (read == -1) {
            return -1;
        }
        int i7 = i5 - 1;
        for (int i8 = i5; i8 < i5 + read; i8++) {
            if (!filter(cArr[i8]) && (i7 = i7 + 1) < i8) {
                cArr[i7] = cArr[i8];
            }
        }
        return (i7 - i5) + 1;
    }
}
