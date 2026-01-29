package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes14.dex */
public final class SerializedCollection implements Externalizable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    /* loaded from: classes24.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }

    public SerializedCollection(Collection<?> collection, int i5) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.collection = collection;
        this.tag = i5;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Collection<?> build;
        Intrinsics.checkNotNullParameter(input, "input");
        byte readByte = input.readByte();
        int i5 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i6 = 0;
        if (i5 == 0) {
            List createListBuilder = CollectionsKt.createListBuilder(readInt);
            while (i6 < readInt) {
                createListBuilder.add(input.readObject());
                i6++;
            }
            build = CollectionsKt.build(createListBuilder);
        } else {
            if (i5 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i5 + FilenameUtils.EXTENSION_SEPARATOR);
            }
            Set createSetBuilder = SetsKt.createSetBuilder(readInt);
            while (i6 < readInt) {
                createSetBuilder.add(input.readObject());
                i6++;
            }
            build = SetsKt.build(createSetBuilder);
        }
        this.collection = build;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
