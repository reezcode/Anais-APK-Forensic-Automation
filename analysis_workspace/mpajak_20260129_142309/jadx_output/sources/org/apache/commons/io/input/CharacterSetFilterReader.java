package org.apache.commons.io.input;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;

/* loaded from: classes22.dex */
public class CharacterSetFilterReader extends AbstractCharacterFilterReader {
    public CharacterSetFilterReader(Reader reader, Set<Integer> set) {
        super(reader, toIntPredicate(set));
    }

    public CharacterSetFilterReader(Reader reader, Integer... numArr) {
        this(reader, new HashSet(Arrays.asList(numArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$toIntPredicate$0(Set set, int i5) {
        return set.contains(Integer.valueOf(i5));
    }

    private static IntPredicate toIntPredicate(Set<Integer> set) {
        if (set == null) {
            return AbstractCharacterFilterReader.SKIP_NONE;
        }
        final Set unmodifiableSet = Collections.unmodifiableSet(set);
        return new IntPredicate() { // from class: org.apache.commons.io.input.d
            @Override // java.util.function.IntPredicate
            public final boolean test(int i5) {
                boolean lambda$toIntPredicate$0;
                lambda$toIntPredicate$0 = CharacterSetFilterReader.lambda$toIntPredicate$0(unmodifiableSet, i5);
                return lambda$toIntPredicate$0;
            }
        };
    }
}
