package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt;

/* loaded from: classes13.dex */
final class LinkFollowing {
    public static final LinkFollowing INSTANCE = new LinkFollowing();
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};
    private static final LinkOption[] followLinkOption = new LinkOption[0];
    private static final Set<FileVisitOption> nofollowVisitOption = SetsKt.emptySet();
    private static final Set<FileVisitOption> followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    public final LinkOption[] toLinkOptions(boolean z4) {
        return z4 ? followLinkOption : nofollowLinkOption;
    }

    public final Set<FileVisitOption> toVisitOptions(boolean z4) {
        return z4 ? followVisitOption : nofollowVisitOption;
    }
}
