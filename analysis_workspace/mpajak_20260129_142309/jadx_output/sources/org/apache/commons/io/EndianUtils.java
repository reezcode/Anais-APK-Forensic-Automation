package org.apache.commons.io;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes23.dex */
public class EndianUtils {
    private static int read(InputStream inputStream) {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double readSwappedDouble(InputStream inputStream) {
        return Double.longBitsToDouble(readSwappedLong(inputStream));
    }

    public static double readSwappedDouble(byte[] bArr, int i5) {
        return Double.longBitsToDouble(readSwappedLong(bArr, i5));
    }

    public static float readSwappedFloat(InputStream inputStream) {
        return Float.intBitsToFloat(readSwappedInteger(inputStream));
    }

    public static float readSwappedFloat(byte[] bArr, int i5) {
        return Float.intBitsToFloat(readSwappedInteger(bArr, i5));
    }

    public static int readSwappedInteger(InputStream inputStream) {
        return ((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16) + ((read(inputStream) & 255) << 24);
    }

    public static int readSwappedInteger(byte[] bArr, int i5) {
        return ((bArr[i5 + 0] & 255) << 0) + ((bArr[i5 + 1] & 255) << 8) + ((bArr[i5 + 2] & 255) << 16) + ((bArr[i5 + 3] & 255) << 24);
    }

    public static long readSwappedLong(InputStream inputStream) {
        byte[] bArr = new byte[8];
        for (int i5 = 0; i5 < 8; i5++) {
            bArr[i5] = (byte) read(inputStream);
        }
        return readSwappedLong(bArr, 0);
    }

    public static long readSwappedLong(byte[] bArr, int i5) {
        return (readSwappedInteger(bArr, i5 + 4) << 32) + (readSwappedInteger(bArr, i5) & 4294967295L);
    }

    public static short readSwappedShort(InputStream inputStream) {
        return (short) (((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8));
    }

    public static short readSwappedShort(byte[] bArr, int i5) {
        return (short) (((bArr[i5 + 0] & 255) << 0) + ((bArr[i5 + 1] & 255) << 8));
    }

    public static long readSwappedUnsignedInteger(InputStream inputStream) {
        return ((read(inputStream) & 255) << 24) + ((((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8) + ((read(inputStream) & 255) << 16)) & 4294967295L);
    }

    public static long readSwappedUnsignedInteger(byte[] bArr, int i5) {
        return ((bArr[i5 + 3] & 255) << 24) + ((((bArr[i5 + 0] & 255) << 0) + ((bArr[i5 + 1] & 255) << 8) + ((bArr[i5 + 2] & 255) << 16)) & 4294967295L);
    }

    public static int readSwappedUnsignedShort(InputStream inputStream) {
        return ((read(inputStream) & 255) << 0) + ((read(inputStream) & 255) << 8);
    }

    public static int readSwappedUnsignedShort(byte[] bArr, int i5) {
        return ((bArr[i5 + 0] & 255) << 0) + ((bArr[i5 + 1] & 255) << 8);
    }

    public static double swapDouble(double d5) {
        return Double.longBitsToDouble(swapLong(Double.doubleToLongBits(d5)));
    }

    public static float swapFloat(float f5) {
        return Float.intBitsToFloat(swapInteger(Float.floatToIntBits(f5)));
    }

    public static int swapInteger(int i5) {
        return (((i5 >> 0) & 255) << 24) + (((i5 >> 8) & 255) << 16) + (((i5 >> 16) & 255) << 8) + (((i5 >> 24) & 255) << 0);
    }

    public static long swapLong(long j5) {
        return (((j5 >> 0) & 255) << 56) + (((j5 >> 8) & 255) << 48) + (((j5 >> 16) & 255) << 40) + (((j5 >> 24) & 255) << 32) + (((j5 >> 32) & 255) << 24) + (((j5 >> 40) & 255) << 16) + (((j5 >> 48) & 255) << 8) + (((j5 >> 56) & 255) << 0);
    }

    public static short swapShort(short s4) {
        return (short) ((((s4 >> 0) & 255) << 8) + (((s4 >> 8) & 255) << 0));
    }

    public static void writeSwappedDouble(OutputStream outputStream, double d5) {
        writeSwappedLong(outputStream, Double.doubleToLongBits(d5));
    }

    public static void writeSwappedDouble(byte[] bArr, int i5, double d5) {
        writeSwappedLong(bArr, i5, Double.doubleToLongBits(d5));
    }

    public static void writeSwappedFloat(OutputStream outputStream, float f5) {
        writeSwappedInteger(outputStream, Float.floatToIntBits(f5));
    }

    public static void writeSwappedFloat(byte[] bArr, int i5, float f5) {
        writeSwappedInteger(bArr, i5, Float.floatToIntBits(f5));
    }

    public static void writeSwappedInteger(OutputStream outputStream, int i5) {
        outputStream.write((byte) ((i5 >> 0) & 255));
        outputStream.write((byte) ((i5 >> 8) & 255));
        outputStream.write((byte) ((i5 >> 16) & 255));
        outputStream.write((byte) ((i5 >> 24) & 255));
    }

    public static void writeSwappedInteger(byte[] bArr, int i5, int i6) {
        bArr[i5 + 0] = (byte) ((i6 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((i6 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((i6 >> 16) & 255);
        bArr[i5 + 3] = (byte) ((i6 >> 24) & 255);
    }

    public static void writeSwappedLong(OutputStream outputStream, long j5) {
        outputStream.write((byte) ((j5 >> 0) & 255));
        outputStream.write((byte) ((j5 >> 8) & 255));
        outputStream.write((byte) ((j5 >> 16) & 255));
        outputStream.write((byte) ((j5 >> 24) & 255));
        outputStream.write((byte) ((j5 >> 32) & 255));
        outputStream.write((byte) ((j5 >> 40) & 255));
        outputStream.write((byte) ((j5 >> 48) & 255));
        outputStream.write((byte) ((j5 >> 56) & 255));
    }

    public static void writeSwappedLong(byte[] bArr, int i5, long j5) {
        bArr[i5 + 0] = (byte) ((j5 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((j5 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((j5 >> 16) & 255);
        bArr[i5 + 3] = (byte) ((j5 >> 24) & 255);
        bArr[i5 + 4] = (byte) ((j5 >> 32) & 255);
        bArr[i5 + 5] = (byte) ((j5 >> 40) & 255);
        bArr[i5 + 6] = (byte) ((j5 >> 48) & 255);
        bArr[i5 + 7] = (byte) ((j5 >> 56) & 255);
    }

    public static void writeSwappedShort(OutputStream outputStream, short s4) {
        outputStream.write((byte) ((s4 >> 0) & 255));
        outputStream.write((byte) ((s4 >> 8) & 255));
    }

    public static void writeSwappedShort(byte[] bArr, int i5, short s4) {
        bArr[i5 + 0] = (byte) ((s4 >> 0) & 255);
        bArr[i5 + 1] = (byte) ((s4 >> 8) & 255);
    }
}
