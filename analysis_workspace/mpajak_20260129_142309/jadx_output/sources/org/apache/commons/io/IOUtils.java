package org.apache.commons.io;

import androidx.activity.d;
import androidx.constraintlayout.core.state.e;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.output.AppendableWriter;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

/* loaded from: classes21.dex */
public class IOUtils {
    public static final int CR = 13;
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final char DIR_SEPARATOR_UNIX = '/';
    public static final char DIR_SEPARATOR_WINDOWS = '\\';
    public static final int EOF = -1;
    public static final int LF = 10;
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    @Deprecated
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static final String LINE_SEPARATOR_UNIX = StandardLineSeparator.LF.getString();
    public static final String LINE_SEPARATOR_WINDOWS = StandardLineSeparator.CRLF.getString();
    private static final ThreadLocal<byte[]> SKIP_BYTE_BUFFER = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.commons.io.b
        @Override // java.util.function.Supplier
        public final Object get() {
            return IOUtils.byteArray();
        }
    });
    private static final ThreadLocal<char[]> SKIP_CHAR_BUFFER = ThreadLocal.withInitial(c.f4584b);

    public static BufferedInputStream buffer(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static BufferedInputStream buffer(InputStream inputStream, int i5) {
        Objects.requireNonNull(inputStream, "inputStream");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i5);
    }

    public static BufferedOutputStream buffer(OutputStream outputStream) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static BufferedOutputStream buffer(OutputStream outputStream, int i5) {
        Objects.requireNonNull(outputStream, "outputStream");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i5);
    }

    public static BufferedReader buffer(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static BufferedReader buffer(Reader reader, int i5) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i5);
    }

    public static BufferedWriter buffer(Writer writer) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }

    public static BufferedWriter buffer(Writer writer, int i5) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i5);
    }

    public static byte[] byteArray() {
        return byteArray(8192);
    }

    public static byte[] byteArray(int i5) {
        return new byte[i5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static char[] charArray() {
        return charArray(8192);
    }

    private static char[] charArray(int i5) {
        return new char[i5];
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            closeable.close();
        }
    }

    public static void close(Closeable closeable, IOConsumer<IOException> iOConsumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                if (iOConsumer != null) {
                    iOConsumer.accept(e5);
                }
            }
        }
    }

    public static void close(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static void close(Closeable... closeableArr) {
        if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                close(closeable);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static void closeQuietly(Closeable closeable, Consumer<IOException> consumer) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                if (consumer != null) {
                    consumer.accept(e5);
                }
            }
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(OutputStream outputStream) {
        closeQuietly((Closeable) outputStream);
    }

    public static void closeQuietly(Reader reader) {
        closeQuietly((Closeable) reader);
    }

    public static void closeQuietly(Writer writer) {
        closeQuietly((Closeable) writer);
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        closeQuietly((Closeable) serverSocket);
    }

    public static void closeQuietly(Socket socket) {
        closeQuietly((Closeable) socket);
    }

    public static void closeQuietly(Selector selector) {
        closeQuietly((Closeable) selector);
    }

    public static void closeQuietly(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            closeQuietly(closeable);
        }
    }

    public static long consume(InputStream inputStream) {
        return copyLarge(inputStream, NullOutputStream.NULL_OUTPUT_STREAM, getByteArray());
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) {
        int read;
        int read2;
        if (inputStream == inputStream2) {
            return true;
        }
        if (inputStream == null || inputStream2 == null) {
            return false;
        }
        byte[] byteArray = getByteArray();
        byte[] byteArray2 = byteArray();
        while (true) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < 8192) {
                if (i6 == i5) {
                    do {
                        read2 = inputStream.read(byteArray, i6, 8192 - i6);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i7 == i5 && inputStream2.read() == -1;
                    }
                    i6 += read2;
                }
                if (i7 == i5) {
                    do {
                        read = inputStream2.read(byteArray2, i7, 8192 - i7);
                    } while (read == 0);
                    if (read == -1) {
                        return i6 == i5 && inputStream.read() == -1;
                    }
                    i7 += read;
                }
                if (byteArray[i5] != byteArray2[i5]) {
                    return false;
                }
                i5++;
            }
        }
    }

    public static boolean contentEquals(Reader reader, Reader reader2) {
        int read;
        int read2;
        if (reader == reader2) {
            return true;
        }
        if (reader == null || reader2 == null) {
            return false;
        }
        char[] charArray = getCharArray();
        char[] charArray2 = charArray();
        while (true) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < 8192) {
                if (i6 == i5) {
                    do {
                        read2 = reader.read(charArray, i6, 8192 - i6);
                    } while (read2 == 0);
                    if (read2 == -1) {
                        return i7 == i5 && reader2.read() == -1;
                    }
                    i6 += read2;
                }
                if (i7 == i5) {
                    do {
                        read = reader2.read(charArray2, i7, 8192 - i7);
                    } while (read == 0);
                    if (read == -1) {
                        return i6 == i5 && reader.read() == -1;
                    }
                    i7 += read;
                }
                if (charArray[i5] != charArray2[i5]) {
                    return false;
                }
                i5++;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader2) {
        String readLine;
        String readLine2;
        if (reader == reader2) {
            return true;
        }
        if ((reader2 == null) ^ (reader == null)) {
            return false;
        }
        BufferedReader bufferedReader = toBufferedReader(reader);
        BufferedReader bufferedReader2 = toBufferedReader(reader2);
        do {
            readLine = bufferedReader.readLine();
            readLine2 = bufferedReader2.readLine();
            if (readLine == null) {
                break;
            }
        } while (readLine.equals(readLine2));
        return Objects.equals(readLine, readLine2);
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static int copy(Reader reader, Writer writer) {
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, int i5) {
        return copyLarge(inputStream, outputStream, byteArray(i5));
    }

    public static long copy(Reader reader, Appendable appendable) {
        return copy(reader, appendable, CharBuffer.allocate(8192));
    }

    public static long copy(Reader reader, Appendable appendable, CharBuffer charBuffer) {
        long j5 = 0;
        while (true) {
            int read = reader.read(charBuffer);
            if (-1 == read) {
                return j5;
            }
            charBuffer.flip();
            appendable.append(charBuffer, 0, read);
            j5 += read;
        }
    }

    public static long copy(URL url, File file) {
        Objects.requireNonNull(file, "file");
        OutputStream newOutputStream = Files.newOutputStream(file.toPath(), new OpenOption[0]);
        try {
            long copy = copy(url, newOutputStream);
            if (newOutputStream != null) {
                newOutputStream.close();
            }
            return copy;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newOutputStream != null) {
                    try {
                        newOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static long copy(URL url, OutputStream outputStream) {
        Objects.requireNonNull(url, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_URL);
        InputStream openStream = url.openStream();
        try {
            long copyLarge = copyLarge(openStream, outputStream);
            if (openStream != null) {
                openStream.close();
            }
            return copyLarge;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static void copy(InputStream inputStream, Writer writer) {
        copy(inputStream, writer, Charset.defaultCharset());
    }

    public static void copy(InputStream inputStream, Writer writer, String str) {
        copy(inputStream, writer, Charsets.toCharset(str));
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) {
        copy((Reader) new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    @Deprecated
    public static void copy(Reader reader, OutputStream outputStream) {
        copy(reader, outputStream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) {
        copy(reader, outputStream, Charsets.toCharset(str));
    }

    public static void copy(Reader reader, OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, Charsets.toCharset(charset));
        copy(reader, (Writer) outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, 8192);
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j5, long j6) {
        return copyLarge(inputStream, outputStream, j5, j6, getByteArray());
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, long j5, long j6, byte[] bArr) {
        long j7 = 0;
        if (j5 > 0) {
            skipFully(inputStream, j5);
        }
        if (j6 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int i5 = (j6 <= 0 || j6 >= ((long) length)) ? length : (int) j6;
        while (i5 > 0) {
            int read = inputStream.read(bArr, 0, i5);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j7 += read;
            if (j6 > 0) {
                i5 = (int) Math.min(j6 - j7, length);
            }
        }
        return j7;
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j5;
            }
            outputStream.write(bArr, 0, read);
            j5 += read;
        }
    }

    public static long copyLarge(Reader reader, Writer writer) {
        return copyLarge(reader, writer, getCharArray());
    }

    public static long copyLarge(Reader reader, Writer writer, long j5, long j6) {
        return copyLarge(reader, writer, j5, j6, getCharArray());
    }

    public static long copyLarge(Reader reader, Writer writer, long j5, long j6, char[] cArr) {
        long j7 = 0;
        if (j5 > 0) {
            skipFully(reader, j5);
        }
        if (j6 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j6 > 0 && j6 < cArr.length) {
            length = (int) j6;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j7 += read;
            if (j6 > 0) {
                length = (int) Math.min(j6 - j7, cArr.length);
            }
        }
        return j7;
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) {
        long j5 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j5;
            }
            writer.write(cArr, 0, read);
            j5 += read;
        }
    }

    public static byte[] getByteArray() {
        return SKIP_BYTE_BUFFER.get();
    }

    public static char[] getCharArray() {
        return SKIP_CHAR_BUFFER.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toByteArray$0(ThresholdingOutputStream thresholdingOutputStream) {
        throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OutputStream lambda$toByteArray$1(UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream, ThresholdingOutputStream thresholdingOutputStream) {
        return unsynchronizedByteArrayOutputStream;
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static int length(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public static int length(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    public static int length(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public static LineIterator lineIterator(InputStream inputStream, String str) {
        return lineIterator(inputStream, Charsets.toCharset(str));
    }

    public static LineIterator lineIterator(InputStream inputStream, Charset charset) {
        return new LineIterator(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static LineIterator lineIterator(Reader reader) {
        return new LineIterator(reader);
    }

    public static int read(InputStream inputStream, byte[] bArr) {
        return read(inputStream, bArr, 0, bArr.length);
    }

    public static int read(InputStream inputStream, byte[] bArr, int i5, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Length must not be negative: ", i6));
        }
        int i7 = i6;
        while (i7 > 0) {
            int read = inputStream.read(bArr, (i6 - i7) + i5, i7);
            if (-1 == read) {
                break;
            }
            i7 -= read;
        }
        return i6 - i7;
    }

    public static int read(Reader reader, char[] cArr) {
        return read(reader, cArr, 0, cArr.length);
    }

    public static int read(Reader reader, char[] cArr, int i5, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Length must not be negative: ", i6));
        }
        int i7 = i6;
        while (i7 > 0) {
            int read = reader.read(cArr, (i6 - i7) + i5, i7);
            if (-1 == read) {
                break;
            }
            i7 -= read;
        }
        return i6 - i7;
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        while (byteBuffer.remaining() > 0 && -1 != readableByteChannel.read(byteBuffer)) {
        }
        return remaining - byteBuffer.remaining();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i5, int i6) {
        int read = read(inputStream, bArr, i5, i6);
        if (read != i6) {
            throw new EOFException(d.d("Length to read: ", i6, " actual: ", read));
        }
    }

    public static void readFully(Reader reader, char[] cArr) {
        readFully(reader, cArr, 0, cArr.length);
    }

    public static void readFully(Reader reader, char[] cArr, int i5, int i6) {
        int read = read(reader, cArr, i5, i6);
        if (read != i6) {
            throw new EOFException(d.d("Length to read: ", i6, " actual: ", read));
        }
    }

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int read = read(readableByteChannel, byteBuffer);
        if (read != remaining) {
            throw new EOFException(d.d("Length to read: ", remaining, " actual: ", read));
        }
    }

    public static byte[] readFully(InputStream inputStream, int i5) {
        byte[] byteArray = byteArray(i5);
        readFully(inputStream, byteArray, 0, byteArray.length);
        return byteArray;
    }

    @Deprecated
    public static List<String> readLines(InputStream inputStream) {
        return readLines(inputStream, Charset.defaultCharset());
    }

    public static List<String> readLines(InputStream inputStream, String str) {
        return readLines(inputStream, Charsets.toCharset(str));
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) {
        return readLines(new InputStreamReader(inputStream, Charsets.toCharset(charset)));
    }

    public static List<String> readLines(Reader reader) {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            arrayList.add(readLine);
        }
    }

    public static byte[] resourceToByteArray(String str) {
        return resourceToByteArray(str, null);
    }

    public static byte[] resourceToByteArray(String str, ClassLoader classLoader) {
        return toByteArray(resourceToURL(str, classLoader));
    }

    public static String resourceToString(String str, Charset charset) {
        return resourceToString(str, charset, null);
    }

    public static String resourceToString(String str, Charset charset, ClassLoader classLoader) {
        return toString(resourceToURL(str, classLoader), charset);
    }

    public static URL resourceToURL(String str) {
        return resourceToURL(str, null);
    }

    public static URL resourceToURL(String str, ClassLoader classLoader) {
        URL resource = classLoader == null ? IOUtils.class.getResource(str) : classLoader.getResource(str);
        if (resource != null) {
            return resource;
        }
        throw new IOException(d.f("Resource not found: ", str));
    }

    public static long skip(InputStream inputStream, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Skip count must be non-negative, actual: ", j5));
        }
        long j6 = j5;
        while (j6 > 0) {
            long read = inputStream.read(getByteArray(), 0, (int) Math.min(j6, r4.length));
            if (read < 0) {
                break;
            }
            j6 -= read;
        }
        return j5 - j6;
    }

    public static long skip(Reader reader, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Skip count must be non-negative, actual: ", j5));
        }
        long j6 = j5;
        while (j6 > 0) {
            long read = reader.read(getCharArray(), 0, (int) Math.min(j6, r4.length));
            if (read < 0) {
                break;
            }
            j6 -= read;
        }
        return j5 - j6;
    }

    public static long skip(ReadableByteChannel readableByteChannel, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Skip count must be non-negative, actual: ", j5));
        }
        ByteBuffer allocate = ByteBuffer.allocate((int) Math.min(j5, 8192L));
        long j6 = j5;
        while (j6 > 0) {
            allocate.position(0);
            allocate.limit((int) Math.min(j6, 8192L));
            int read = readableByteChannel.read(allocate);
            if (read == -1) {
                break;
            }
            j6 -= read;
        }
        return j5 - j6;
    }

    public static void skipFully(InputStream inputStream, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Bytes to skip must not be negative: ", j5));
        }
        long skip = skip(inputStream, j5);
        if (skip == j5) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j5 + " actual: " + skip);
    }

    public static void skipFully(Reader reader, long j5) {
        long skip = skip(reader, j5);
        if (skip == j5) {
            return;
        }
        throw new EOFException("Chars to skip: " + j5 + " actual: " + skip);
    }

    public static void skipFully(ReadableByteChannel readableByteChannel, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("Bytes to skip must not be negative: ", j5));
        }
        long skip = skip(readableByteChannel, j5);
        if (skip == j5) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j5 + " actual: " + skip);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i5) {
        return ByteArrayOutputStream.toBufferedInputStream(inputStream, i5);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static BufferedReader toBufferedReader(Reader reader, int i5) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i5);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = new UnsynchronizedByteArrayOutputStream();
        try {
            ThresholdingOutputStream thresholdingOutputStream = new ThresholdingOutputStream(Integer.MAX_VALUE, e.f150c, new androidx.core.view.inputmethod.a(unsynchronizedByteArrayOutputStream, 1));
            try {
                copy(inputStream, thresholdingOutputStream);
                byte[] byteArray = unsynchronizedByteArrayOutputStream.toByteArray();
                thresholdingOutputStream.close();
                unsynchronizedByteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Size must be equal or greater than zero: ", i5));
        }
        if (i5 == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        byte[] byteArray = byteArray(i5);
        int i6 = 0;
        while (i6 < i5) {
            int read = inputStream.read(byteArray, i6, i5 - i6);
            if (read == -1) {
                break;
            }
            i6 += read;
        }
        if (i6 == i5) {
            return byteArray;
        }
        throw new IOException(d.d("Unexpected read size, current: ", i6, ", expected: ", i5));
    }

    public static byte[] toByteArray(InputStream inputStream, long j5) {
        if (j5 <= 2147483647L) {
            return toByteArray(inputStream, (int) j5);
        }
        throw new IllegalArgumentException(androidx.activity.result.a.d("Size cannot be greater than Integer max value: ", j5));
    }

    @Deprecated
    public static byte[] toByteArray(Reader reader) {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, String str) {
        return toByteArray(reader, Charsets.toCharset(str));
    }

    public static byte[] toByteArray(Reader reader, Charset charset) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            copy(reader, byteArrayOutputStream, charset);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static byte[] toByteArray(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri) {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url) {
        URLConnection openConnection = url.openConnection();
        try {
            return toByteArray(openConnection);
        } finally {
            close(openConnection);
        }
    }

    public static byte[] toByteArray(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            byte[] byteArray = toByteArray(inputStream);
            if (inputStream != null) {
                inputStream.close();
            }
            return byteArray;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static char[] toCharArray(InputStream inputStream) {
        return toCharArray(inputStream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputStream, String str) {
        return toCharArray(inputStream, Charsets.toCharset(str));
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static char[] toCharArray(Reader reader) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, (Writer) charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    @Deprecated
    public static InputStream toInputStream(CharSequence charSequence) {
        return toInputStream(charSequence, Charset.defaultCharset());
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charsets.toCharset(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return toInputStream(charSequence.toString(), charset);
    }

    @Deprecated
    public static InputStream toInputStream(String str) {
        return toInputStream(str, Charset.defaultCharset());
    }

    public static InputStream toInputStream(String str, String str2) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(str2)));
    }

    public static InputStream toInputStream(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(Charsets.toCharset(charset)));
    }

    @Deprecated
    public static String toString(InputStream inputStream) {
        return toString(inputStream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputStream, String str) {
        return toString(inputStream, Charsets.toCharset(str));
    }

    public static String toString(InputStream inputStream, Charset charset) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static String toString(Reader reader) {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(reader, (Writer) stringBuilderWriter);
            String stringBuilderWriter2 = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return stringBuilderWriter2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    stringBuilderWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static String toString(URI uri) {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, String str) {
        return toString(uri, Charsets.toCharset(str));
    }

    public static String toString(URI uri, Charset charset) {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    @Deprecated
    public static String toString(URL url) {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, String str) {
        return toString(url, Charsets.toCharset(str));
    }

    public static String toString(URL url, Charset charset) {
        InputStream openStream = url.openStream();
        try {
            String iOUtils = toString(openStream, charset);
            if (openStream != null) {
                openStream.close();
            }
            return iOUtils;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Deprecated
    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.defaultCharset());
    }

    public static String toString(byte[] bArr, String str) {
        return new String(bArr, Charsets.toCharset(str));
    }

    @Deprecated
    public static void write(CharSequence charSequence, OutputStream outputStream) {
        write(charSequence, outputStream, Charset.defaultCharset());
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, String str) {
        write(charSequence, outputStream, Charsets.toCharset(str));
    }

    public static void write(CharSequence charSequence, OutputStream outputStream, Charset charset) {
        if (charSequence != null) {
            write(charSequence.toString(), outputStream, charset);
        }
    }

    public static void write(CharSequence charSequence, Writer writer) {
        if (charSequence != null) {
            write(charSequence.toString(), writer);
        }
    }

    @Deprecated
    public static void write(String str, OutputStream outputStream) {
        write(str, outputStream, Charset.defaultCharset());
    }

    public static void write(String str, OutputStream outputStream, String str2) {
        write(str, outputStream, Charsets.toCharset(str2));
    }

    public static void write(String str, OutputStream outputStream, Charset charset) {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(String str, Writer writer) {
        if (str != null) {
            writer.write(str);
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream) {
        write(stringBuffer, outputStream, (String) null);
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(Charsets.toCharset(str)));
        }
    }

    @Deprecated
    public static void write(StringBuffer stringBuffer, Writer writer) {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void write(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    @Deprecated
    public static void write(byte[] bArr, Writer writer) {
        write(bArr, writer, Charset.defaultCharset());
    }

    public static void write(byte[] bArr, Writer writer, String str) {
        write(bArr, writer, Charsets.toCharset(str));
    }

    public static void write(byte[] bArr, Writer writer, Charset charset) {
        if (bArr != null) {
            writer.write(new String(bArr, Charsets.toCharset(charset)));
        }
    }

    @Deprecated
    public static void write(char[] cArr, OutputStream outputStream) {
        write(cArr, outputStream, Charset.defaultCharset());
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) {
        write(cArr, outputStream, Charsets.toCharset(str));
    }

    public static void write(char[] cArr, OutputStream outputStream, Charset charset) {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(char[] cArr, Writer writer) {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void writeChunked(byte[] bArr, OutputStream outputStream) {
        if (bArr != null) {
            int length = bArr.length;
            int i5 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                outputStream.write(bArr, i5, min);
                length -= min;
                i5 += min;
            }
        }
    }

    public static void writeChunked(char[] cArr, Writer writer) {
        if (cArr != null) {
            int length = cArr.length;
            int i5 = 0;
            while (length > 0) {
                int min = Math.min(length, 8192);
                writer.write(cArr, i5, min);
                length -= min;
                i5 += min;
            }
        }
    }

    @Deprecated
    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream) {
        writeLines(collection, str, outputStream, Charset.defaultCharset());
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, String str2) {
        writeLines(collection, str, outputStream, Charsets.toCharset(str2));
    }

    public static void writeLines(Collection<?> collection, String str, OutputStream outputStream, Charset charset) {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        Charset charset2 = Charsets.toCharset(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(charset2));
            }
            outputStream.write(str.getBytes(charset2));
        }
    }

    public static void writeLines(Collection<?> collection, String str, Writer writer) {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = System.lineSeparator();
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static Writer writer(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        return appendable instanceof Writer ? (Writer) appendable : appendable instanceof StringBuilder ? new StringBuilderWriter((StringBuilder) appendable) : new AppendableWriter(appendable);
    }
}
