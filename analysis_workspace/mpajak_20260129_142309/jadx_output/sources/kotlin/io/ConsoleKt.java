package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "ConsoleKt")
/* loaded from: classes3.dex */
public final class ConsoleKt {
    @InlineOnly
    private static final void print(byte b5) {
        System.out.print(Byte.valueOf(b5));
    }

    @InlineOnly
    private static final void print(char c5) {
        System.out.print(c5);
    }

    @InlineOnly
    private static final void print(double d5) {
        System.out.print(d5);
    }

    @InlineOnly
    private static final void print(float f5) {
        System.out.print(f5);
    }

    @InlineOnly
    private static final void print(int i5) {
        System.out.print(i5);
    }

    @InlineOnly
    private static final void print(long j5) {
        System.out.print(j5);
    }

    @InlineOnly
    private static final void print(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void print(short s4) {
        System.out.print(Short.valueOf(s4));
    }

    @InlineOnly
    private static final void print(boolean z4) {
        System.out.print(z4);
    }

    @InlineOnly
    private static final void print(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.print(message);
    }

    @InlineOnly
    private static final void println() {
        System.out.println();
    }

    @InlineOnly
    private static final void println(byte b5) {
        System.out.println(Byte.valueOf(b5));
    }

    @InlineOnly
    private static final void println(char c5) {
        System.out.println(c5);
    }

    @InlineOnly
    private static final void println(double d5) {
        System.out.println(d5);
    }

    @InlineOnly
    private static final void println(float f5) {
        System.out.println(f5);
    }

    @InlineOnly
    private static final void println(int i5) {
        System.out.println(i5);
    }

    @InlineOnly
    private static final void println(long j5) {
        System.out.println(j5);
    }

    @InlineOnly
    private static final void println(Object obj) {
        System.out.println(obj);
    }

    @InlineOnly
    private static final void println(short s4) {
        System.out.println(Short.valueOf(s4));
    }

    @InlineOnly
    private static final void println(boolean z4) {
        System.out.println(z4);
    }

    @InlineOnly
    private static final void println(char[] message) {
        Intrinsics.checkNotNullParameter(message, "message");
        System.out.println(message);
    }

    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream inputStream = System.in;
        Intrinsics.checkNotNullExpressionValue(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
        return lineReader.readLine(inputStream, defaultCharset);
    }

    @SinceKotlin(version = "1.6")
    public static final String readln() {
        String readlnOrNull = readlnOrNull();
        if (readlnOrNull != null) {
            return readlnOrNull;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    public static final String readlnOrNull() {
        return readLine();
    }
}
