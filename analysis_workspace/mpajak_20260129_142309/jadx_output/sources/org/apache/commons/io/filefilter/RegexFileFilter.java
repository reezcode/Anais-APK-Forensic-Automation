package org.apache.commons.io.filefilter;

import androidx.activity.d;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.RegexFileFilter;

/* loaded from: classes18.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final Function<Path, String> pathToString;
    private final Pattern pattern;

    public RegexFileFilter(String str) {
        this(str, 0);
    }

    public RegexFileFilter(String str, int i5) {
        this(compile(str, i5));
    }

    public RegexFileFilter(String str, IOCase iOCase) {
        this(compile(str, toFlags(iOCase)));
    }

    public RegexFileFilter(Pattern pattern) {
        this(pattern, new Function() { // from class: h4.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$new$0;
                lambda$new$0 = RegexFileFilter.lambda$new$0((Path) obj);
                return lambda$new$0;
            }
        });
    }

    public RegexFileFilter(Pattern pattern, Function<Path, String> function) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.pattern = pattern;
        this.pathToString = function;
    }

    private static Pattern compile(String str, int i5) {
        if (str != null) {
            return Pattern.compile(str, i5);
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Path path) {
        return path.getFileName().toString();
    }

    private static int toFlags(IOCase iOCase) {
        return IOCase.isCaseSensitive(iOCase) ? 2 : 0;
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(this.pattern.matcher(this.pathToString.apply(path)).matches(), path);
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.pattern.matcher(str).matches();
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public String toString() {
        StringBuilder g5 = d.g("RegexFileFilter [pattern=");
        g5.append(this.pattern);
        g5.append("]");
        return g5.toString();
    }
}
