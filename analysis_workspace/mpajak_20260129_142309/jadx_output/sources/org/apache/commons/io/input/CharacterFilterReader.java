package org.apache.commons.io.input;

import java.io.Reader;
import java.util.function.IntPredicate;

/* loaded from: classes5.dex */
public class CharacterFilterReader extends AbstractCharacterFilterReader {
    public CharacterFilterReader(Reader reader, final int i5) {
        super(reader, new IntPredicate() { // from class: org.apache.commons.io.input.c
            @Override // java.util.function.IntPredicate
            public final boolean test(int i6) {
                boolean lambda$new$0;
                lambda$new$0 = CharacterFilterReader.lambda$new$0(i5, i6);
                return lambda$new$0;
            }
        });
    }

    public CharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader, intPredicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i5, int i6) {
        return i6 == i5;
    }
}
