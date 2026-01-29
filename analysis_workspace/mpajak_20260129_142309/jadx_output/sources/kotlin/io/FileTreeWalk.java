package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes2.dex */
public final class FileTreeWalk implements Sequence<File> {
    private final FileWalkDirection direction;
    private final int maxDepth;
    private final Function1<File, Boolean> onEnter;
    private final Function2<File, IOException, Unit> onFail;
    private final Function1<File, Unit> onLeave;
    private final File start;

    /* loaded from: classes21.dex */
    public static abstract class DirectoryState extends WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* loaded from: classes20.dex */
    public final class FileTreeWalkIterator extends AbstractIterator<File> {
        private final ArrayDeque<WalkState> state;

        /* loaded from: classes5.dex */
        public final class BottomUpDirectoryState extends DirectoryState {
            private boolean failed;
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            public final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = FileTreeWalk.this.onEnter;
                    boolean z4 = false;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        z4 = true;
                    }
                    if (z4) {
                        return null;
                    }
                    File[] listFiles = getRoot().listFiles();
                    this.fileList = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = FileTreeWalk.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i5 = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i5 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.checkNotNull(fileArr2);
                        int i6 = this.fileIndex;
                        this.fileIndex = i6 + 1;
                        return fileArr2[i6];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function12 = FileTreeWalk.this.onLeave;
                if (function12 != null) {
                    function12.invoke(getRoot());
                }
                return null;
            }
        }

        /* loaded from: classes18.dex */
        public final class SingleFileState extends WalkState {
            public final /* synthetic */ FileTreeWalkIterator this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* loaded from: classes10.dex */
        public final class TopDownDirectoryState extends DirectoryState {
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            public final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File step() {
                /*
                    r10 = this;
                    boolean r0 = r10.rootVisited
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = 1
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.rootVisited = r3
                    java.io.File r0 = r10.getRoot()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L4b
                    int r2 = r10.fileIndex
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.fileList
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.fileList = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.getRoot()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.getRoot()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.fileList
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.fileList
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.fileIndex
                    int r2 = r1 + 1
                    r10.fileIndex = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.step():java.io.File");
            }
        }

        /* loaded from: classes19.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<WalkState> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(directoryState(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new SingleFileState(this, FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        private final DirectoryState directoryState(File file) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()];
            if (i5 == 1) {
                return new TopDownDirectoryState(this, file);
            }
            if (i5 == 2) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File gotoNext() {
            File step;
            while (true) {
                WalkState peek = this.state.peek();
                if (peek == null) {
                    return null;
                }
                step = peek.step();
                if (step == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.areEqual(step, peek.getRoot()) || !step.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                        break;
                    }
                    this.state.push(directoryState(step));
                }
            }
            return step;
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File gotoNext = gotoNext();
            if (gotoNext != null) {
                setNext(gotoNext);
            } else {
                done();
            }
        }
    }

    /* loaded from: classes11.dex */
    public static abstract class WalkState {
        private final File root;

        public WalkState(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final File getRoot() {
            return this.root;
        }

        public abstract File step();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i5 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i5) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function12;
        this.onFail = function2;
        this.maxDepth = i5;
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i6 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i6 & 32) != 0 ? Integer.MAX_VALUE : i5);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    public final FileTreeWalk maxDepth(int i5) {
        if (i5 > 0) {
            return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, i5);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i5 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public final FileTreeWalk onEnter(Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    public final FileTreeWalk onFail(Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    public final FileTreeWalk onLeave(Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }
}
