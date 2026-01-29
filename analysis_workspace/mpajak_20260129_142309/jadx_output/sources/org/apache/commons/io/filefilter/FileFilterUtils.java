package org.apache.commons.io.filefilter;

import androidx.activity.d;
import h4.b;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.IOFileFilter;

/* loaded from: classes14.dex */
public class FileFilterUtils {
    private static final IOFileFilter cvsFilter = notFileFilter(and(directoryFileFilter(), nameFileFilter("CVS")));
    private static final IOFileFilter svnFilter = notFileFilter(and(directoryFileFilter(), nameFileFilter(".svn")));

    public static IOFileFilter ageFileFilter(long j5) {
        return new AgeFileFilter(j5);
    }

    public static IOFileFilter ageFileFilter(long j5, boolean z4) {
        return new AgeFileFilter(j5, z4);
    }

    public static IOFileFilter ageFileFilter(File file) {
        return new AgeFileFilter(file);
    }

    public static IOFileFilter ageFileFilter(File file, boolean z4) {
        return new AgeFileFilter(file, z4);
    }

    public static IOFileFilter ageFileFilter(Date date) {
        return new AgeFileFilter(date);
    }

    public static IOFileFilter ageFileFilter(Date date, boolean z4) {
        return new AgeFileFilter(date, z4);
    }

    public static IOFileFilter and(IOFileFilter... iOFileFilterArr) {
        return new AndFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter andFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new AndFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter asFileFilter(FileFilter fileFilter) {
        return new DelegateFileFilter(fileFilter);
    }

    public static IOFileFilter asFileFilter(FilenameFilter filenameFilter) {
        return new DelegateFileFilter(filenameFilter);
    }

    public static IOFileFilter directoryFileFilter() {
        return DirectoryFileFilter.DIRECTORY;
    }

    public static IOFileFilter falseFileFilter() {
        return FalseFileFilter.FALSE;
    }

    public static IOFileFilter fileFileFilter() {
        return FileFileFilter.INSTANCE;
    }

    public static File[] filter(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return (File[]) filterList(iOFileFilter, iterable).toArray(FileUtils.EMPTY_FILE_ARRAY);
    }

    public static File[] filter(IOFileFilter iOFileFilter, File... fileArr) {
        if (iOFileFilter != null) {
            return fileArr == null ? FileUtils.EMPTY_FILE_ARRAY : (File[]) ((List) filterFiles(iOFileFilter, Stream.of((Object[]) fileArr), Collectors.toList())).toArray(FileUtils.EMPTY_FILE_ARRAY);
        }
        throw new IllegalArgumentException("file filter is null");
    }

    private static <R, A> R filterFiles(final IOFileFilter iOFileFilter, Stream<File> stream, Collector<? super File, A, R> collector) {
        Objects.requireNonNull(collector, "collector");
        if (iOFileFilter != null) {
            return (R) (stream == null ? Stream.empty() : stream.filter(new Predicate() { // from class: h4.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return IOFileFilter.this.accept((File) obj);
                }
            })).collect(collector);
        }
        throw new IllegalArgumentException("file filter is null");
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return iterable == null ? Collections.emptyList() : (List) filterFiles(iOFileFilter, StreamSupport.stream(iterable.spliterator(), false), Collectors.toList());
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, File... fileArr) {
        return Arrays.asList(filter(iOFileFilter, fileArr));
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return iterable == null ? Collections.emptySet() : (Set) filterFiles(iOFileFilter, StreamSupport.stream(iterable.spliterator(), false), Collectors.toSet());
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, File... fileArr) {
        return new HashSet(Arrays.asList(filter(iOFileFilter, fileArr)));
    }

    public static IOFileFilter magicNumberFileFilter(String str) {
        return new MagicNumberFileFilter(str);
    }

    public static IOFileFilter magicNumberFileFilter(String str, long j5) {
        return new MagicNumberFileFilter(str, j5);
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr) {
        return new MagicNumberFileFilter(bArr);
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr, long j5) {
        return new MagicNumberFileFilter(bArr, j5);
    }

    public static IOFileFilter makeCVSAware(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? cvsFilter : and(iOFileFilter, cvsFilter);
    }

    public static IOFileFilter makeDirectoryOnly(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? DirectoryFileFilter.DIRECTORY : DirectoryFileFilter.DIRECTORY.and(iOFileFilter);
    }

    public static IOFileFilter makeFileOnly(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? FileFileFilter.INSTANCE : FileFileFilter.INSTANCE.and(iOFileFilter);
    }

    public static IOFileFilter makeSVNAware(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? svnFilter : and(iOFileFilter, svnFilter);
    }

    public static IOFileFilter nameFileFilter(String str) {
        return new NameFileFilter(str);
    }

    public static IOFileFilter nameFileFilter(String str, IOCase iOCase) {
        return new NameFileFilter(str, iOCase);
    }

    public static IOFileFilter notFileFilter(IOFileFilter iOFileFilter) {
        return iOFileFilter.negate();
    }

    public static IOFileFilter or(IOFileFilter... iOFileFilterArr) {
        return new OrFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter orFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new OrFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter prefixFileFilter(String str) {
        return new PrefixFileFilter(str);
    }

    public static IOFileFilter prefixFileFilter(String str, IOCase iOCase) {
        return new PrefixFileFilter(str, iOCase);
    }

    public static IOFileFilter sizeFileFilter(long j5) {
        return new SizeFileFilter(j5);
    }

    public static IOFileFilter sizeFileFilter(long j5, boolean z4) {
        return new SizeFileFilter(j5, z4);
    }

    public static IOFileFilter sizeRangeFileFilter(long j5, long j6) {
        return b.b(new SizeFileFilter(j5, true), new SizeFileFilter(j6 + 1, false));
    }

    public static IOFileFilter suffixFileFilter(String str) {
        return new SuffixFileFilter(str);
    }

    public static IOFileFilter suffixFileFilter(String str, IOCase iOCase) {
        return new SuffixFileFilter(str, iOCase);
    }

    public static List<IOFileFilter> toList(IOFileFilter... iOFileFilterArr) {
        if (iOFileFilterArr == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arrayList = new ArrayList(iOFileFilterArr.length);
        for (int i5 = 0; i5 < iOFileFilterArr.length; i5++) {
            if (iOFileFilterArr[i5] == null) {
                throw new IllegalArgumentException(d.c("The filter[", i5, "] is null"));
            }
            arrayList.add(iOFileFilterArr[i5]);
        }
        return arrayList;
    }

    public static IOFileFilter trueFileFilter() {
        return TrueFileFilter.TRUE;
    }
}
