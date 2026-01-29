package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.List;

/* loaded from: classes24.dex */
public final class FileIOUtils {
    private static int sBufferSize = 524288;

    /* loaded from: classes18.dex */
    public interface OnProgressUpdateListener {
        void onProgressUpdate(double d5);
    }

    private FileIOUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByChannel(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    while (fileChannel.read(allocate) > 0) {
                    }
                    byte[] array = allocate.array();
                    try {
                        fileChannel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return array;
                } catch (IOException e7) {
                    e = e7;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e9) {
                e = e9;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(UtilsBridge.getFileByPath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static byte[] readFile2BytesByMap(File file) {
        FileChannel fileChannel;
        ?? r12 = 0;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                fileChannel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (fileChannel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) fileChannel.size();
                    byte[] bArr2 = new byte[size];
                    fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    try {
                        fileChannel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return bArr2;
                } catch (IOException e7) {
                    e = e7;
                    e.printStackTrace();
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e9) {
                e = e9;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r12 = file;
        }
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(UtilsBridge.getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(File file) {
        return readFile2BytesByStream(file, (OnProgressUpdateListener) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[Catch: FileNotFoundException -> 0x0090, SYNTHETIC, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x0090, blocks: (B:6:0x0008, B:24:0x005b, B:27:0x0053, B:44:0x0078, B:47:0x006e, B:59:0x008f, B:58:0x008c, B:63:0x0082, B:20:0x0056, B:41:0x0073, B:51:0x007d, B:18:0x004e, B:37:0x0069, B:54:0x0087), top: B:5:0x0008, inners: #1, #3, #5, #6, #8, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] readFile2BytesByStream(java.io.File r10, com.blankj.utilcode.util.FileIOUtils.OnProgressUpdateListener r11) {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.io.FileNotFoundException -> L90
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L90
            r2.<init>(r10)     // Catch: java.io.FileNotFoundException -> L90
            int r10 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.FileNotFoundException -> L90
            r0.<init>(r2, r10)     // Catch: java.io.FileNotFoundException -> L90
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            int r2 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r3 = -1
            r4 = 0
            if (r11 != 0) goto L2d
        L21:
            int r11 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r11 = r0.read(r2, r4, r11)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            if (r11 == r3) goto L4a
            r10.write(r2, r4, r11)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            goto L21
        L2d:
            int r5 = r0.available()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            double r5 = (double) r5     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r7 = 0
            r11.onProgressUpdate(r7)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r7 = 0
        L38:
            int r8 = com.blankj.utilcode.util.FileIOUtils.sBufferSize     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r8 = r0.read(r2, r4, r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            if (r8 == r3) goto L4a
            r10.write(r2, r4, r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            int r7 = r7 + r8
            double r8 = (double) r7     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            double r8 = r8 / r5
            r11.onProgressUpdate(r8)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            goto L38
        L4a:
            byte[] r11 = r10.toByteArray()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7c
            r0.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L56:
            r10.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L5e:
            return r11
        L5f:
            r11 = move-exception
            goto L66
        L61:
            r11 = move-exception
            r10 = r1
            goto L7d
        L64:
            r11 = move-exception
            r10 = r1
        L66:
            r11.printStackTrace()     // Catch: java.lang.Throwable -> L7c
            r0.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r11 = move-exception
            r11.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L71:
            if (r10 == 0) goto L7b
            r10.close()     // Catch: java.io.IOException -> L77
            goto L7b
        L77:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L7b:
            return r1
        L7c:
            r11 = move-exception
        L7d:
            r0.close()     // Catch: java.io.IOException -> L81
            goto L85
        L81:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L85:
            if (r10 == 0) goto L8f
            r10.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.io.FileNotFoundException -> L90
        L8f:
            throw r11     // Catch: java.io.FileNotFoundException -> L90
        L90:
            r10 = move-exception
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2BytesByStream(java.io.File, com.blankj.utilcode.util.FileIOUtils$OnProgressUpdateListener):byte[]");
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), (OnProgressUpdateListener) null);
    }

    public static byte[] readFile2BytesByStream(String str, OnProgressUpdateListener onProgressUpdateListener) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), onProgressUpdateListener);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Integer.MAX_VALUE, (String) null);
    }

    public static List<String> readFile2List(File file, int i5, int i6) {
        return readFile2List(file, i5, i6, (String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> readFile2List(java.io.File r6, int r7, int r8, java.lang.String r9) {
        /*
            boolean r0 = com.blankj.utilcode.util.UtilsBridge.isFileExists(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r7 <= r8) goto Lb
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            boolean r2 = com.blankj.utilcode.util.UtilsBridge.isSpace(r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r3 = 1
            if (r2 == 0) goto L27
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            goto L37
        L27:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r4.<init>(r5, r9)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r9 = r2
        L37:
            java.lang.String r6 = r9.readLine()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L67
            if (r6 == 0) goto L4a
            if (r3 <= r8) goto L40
            goto L4a
        L40:
            if (r7 > r3) goto L47
            if (r3 > r8) goto L47
            r0.add(r6)     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L67
        L47:
            int r3 = r3 + 1
            goto L37
        L4a:
            r9.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r6 = move-exception
            r6.printStackTrace()
        L52:
            return r0
        L53:
            r6 = move-exception
            goto L59
        L55:
            r6 = move-exception
            goto L69
        L57:
            r6 = move-exception
            r9 = r1
        L59:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L66
            r9.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r6 = move-exception
            r6.printStackTrace()
        L66:
            return r1
        L67:
            r6 = move-exception
            r1 = r9
        L69:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r7 = move-exception
            r7.printStackTrace()
        L73:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.FileIOUtils.readFile2List(java.io.File, int, int, java.lang.String):java.util.List");
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Integer.MAX_VALUE, str);
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static List<String> readFile2List(String str, int i5, int i6) {
        return readFile2List(UtilsBridge.getFileByPath(str), i5, i6, (String) null);
    }

    public static List<String> readFile2List(String str, int i5, int i6, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), i5, i6, str2);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), str2);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static String readFile2String(File file, String str) {
        byte[] readFile2BytesByStream = readFile2BytesByStream(file);
        if (readFile2BytesByStream == null) {
            return null;
        }
        if (UtilsBridge.isSpace(str)) {
            return new String(readFile2BytesByStream);
        }
        try {
            return new String(readFile2BytesByStream, str);
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static String readFile2String(String str) {
        return readFile2String(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(UtilsBridge.getFileByPath(str), str2);
    }

    public static void setBufferSize(int i5) {
        sBufferSize = i5;
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z4) {
        return writeFileFromBytesByChannel(file, bArr, false, z4);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z4, boolean z5) {
        String str;
        if (bArr == null) {
            str = "bytes is null.";
        } else {
            if (UtilsBridge.createOrExistsFile(file)) {
                AbstractInterruptibleChannel abstractInterruptibleChannel = null;
                try {
                    try {
                        FileChannel channel = new FileOutputStream(file, z4).getChannel();
                        if (channel == null) {
                            Log.e("FileIOUtils", "fc is null.");
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            return false;
                        }
                        channel.position(channel.size());
                        channel.write(ByteBuffer.wrap(bArr));
                        if (z5) {
                            channel.force(true);
                        }
                        try {
                            channel.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        return true;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                abstractInterruptibleChannel.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                    if (0 != 0) {
                        try {
                            abstractInterruptibleChannel.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    return false;
                }
            }
            str = "create file <" + file + "> failed.";
        }
        Log.e("FileIOUtils", str);
        return false;
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z4) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, false, z4);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z4, boolean z5) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, z4, z5);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z4) {
        return writeFileFromBytesByMap(file, bArr, false, z4);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z4, boolean z5) {
        if (bArr == null || !UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z4).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    return false;
                }
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                map.put(bArr);
                if (z5) {
                    map.force();
                }
                try {
                    channel.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return true;
            } catch (IOException e7) {
                e7.printStackTrace();
                if (0 != 0) {
                    try {
                        abstractInterruptibleChannel.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    abstractInterruptibleChannel.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z4) {
        return writeFileFromBytesByMap(str, bArr, false, z4);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z4, boolean z5) {
        return writeFileFromBytesByMap(UtilsBridge.getFileByPath(str), bArr, z4, z5);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(file, bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z4) {
        return writeFileFromBytesByStream(file, bArr, z4, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z4, OnProgressUpdateListener onProgressUpdateListener) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bArr), z4, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z4) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z4, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z4, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z4, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(file, inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z4) {
        return writeFileFromIS(file, inputStream, z4, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z4, OnProgressUpdateListener onProgressUpdateListener) {
        BufferedOutputStream bufferedOutputStream;
        if (inputStream == null || !UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z4), sBufferSize);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e = e5;
        }
        try {
            if (onProgressUpdateListener != null) {
                double available = inputStream.available();
                onProgressUpdateListener.onProgressUpdate(0.0d);
                byte[] bArr = new byte[sBufferSize];
                int i5 = 0;
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    i5 += read;
                    onProgressUpdateListener.onProgressUpdate(i5 / available);
                }
            } else {
                byte[] bArr2 = new byte[sBufferSize];
                while (true) {
                    int read2 = inputStream.read(bArr2);
                    if (read2 == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr2, 0, read2);
                }
            }
            try {
                inputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return true;
        } catch (IOException e8) {
            e = e8;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            try {
                inputStream.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                inputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            if (bufferedOutputStream2 == null) {
                throw th;
            }
            try {
                bufferedOutputStream2.close();
                throw th;
            } catch (IOException e12) {
                e12.printStackTrace();
                throw th;
            }
        }
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z4) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z4, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z4, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z4, onProgressUpdateListener);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    public static boolean writeFileFromString(File file, String str, boolean z4) {
        BufferedWriter bufferedWriter;
        if (file == null || str == null) {
            return false;
        }
        if (!UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, z4));
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            try {
                bufferedWriter.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            return true;
        } catch (IOException e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, false);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z4) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, z4);
    }
}
