package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes9.dex */
public final class ImageUtils {

    /* loaded from: classes13.dex */
    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

        public String value;

        ImageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, boolean z4, float f6, boolean z5) {
        return addBorder(bitmap, f5, i5, z4, new float[]{f6, f6, f6, f6, f6, f6, f6, f6}, z5);
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, boolean z4, float[] fArr, boolean z5) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z5) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i5);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f5);
        if (z4) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f5 / 2.0f), paint);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f6 = f5 / 2.0f;
            rectF.inset(f6, f6);
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        return bitmap;
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5) {
        return addBorder(bitmap, f5, i5, true, 0.0f, false);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, boolean z4) {
        return addBorder(bitmap, f5, i5, true, 0.0f, z4);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, @FloatRange(from = 0.0d) float f6) {
        return addBorder(bitmap, f5, i5, false, f6, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, @FloatRange(from = 0.0d) float f6, boolean z4) {
        return addBorder(bitmap, f5, i5, false, f6, z4);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, float[] fArr) {
        return addBorder(bitmap, f5, i5, false, fArr, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f5, @ColorInt int i5, float[] fArr, boolean z4) {
        return addBorder(bitmap, f5, i5, false, fArr, z4);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i5, int i6, int i7) {
        return addImageWatermark(bitmap, bitmap2, i5, i6, i7, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i5, int i6, int i7, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(copy);
            paint.setAlpha(i7);
            canvas.drawBitmap(bitmap2, i5, i6, paint);
        }
        if (z4 && !bitmap.isRecycled() && copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    public static Bitmap addReflection(Bitmap bitmap, int i5) {
        return addReflection(bitmap, i5, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i5, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height - i5, width, i5, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height + i5, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f5 = height + 0;
        canvas.drawBitmap(createBitmap, 0.0f, f5, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, createBitmap2.getHeight() + 0, 1895825407, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f5, width, createBitmap2.getHeight(), paint);
        if (!createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        if (z4 && !bitmap.isRecycled() && createBitmap2 != bitmap) {
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f5, @ColorInt int i5, float f6, float f7, boolean z4) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(copy);
        paint.setColor(i5);
        paint.setTextSize(f5);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f6, f7 + f5, paint);
        if (z4 && !bitmap.isRecycled() && copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i5, @ColorInt int i6, float f5, float f6) {
        return addTextWatermark(bitmap, str, i5, i6, f5, f6, false);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return bitmap2Bytes(bitmap, Bitmap.CompressFormat.PNG, 100);
    }

    public static byte[] bitmap2Bytes(@Nullable Bitmap bitmap, @NonNull Bitmap.CompressFormat compressFormat, int i5) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i5, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable bitmap2Drawable(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Utils.getApp().getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i5, int i6) {
        int i7 = options.outHeight;
        int i8 = options.outWidth;
        int i9 = 1;
        while (true) {
            if (i7 <= i6 && i8 <= i5) {
                return i9;
            }
            i7 >>= 1;
            i8 >>= 1;
            i9 <<= 1;
        }
    }

    public static Bitmap clip(Bitmap bitmap, int i5, int i6, int i7, int i8) {
        return clip(bitmap, i5, i6, i7, i8, false);
    }

    public static Bitmap clip(Bitmap bitmap, int i5, int i6, int i7, int i8, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i5, i6, i7, i8);
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i5) {
        return compressByQuality(bitmap, i5, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, to = 100) int i5, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z4 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j5) {
        return compressByQuality(bitmap, j5, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j5, boolean z4) {
        int i5 = 0;
        if (isEmptyBitmap(bitmap) || j5 <= 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() > j5) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() < j5) {
                int i7 = 0;
                while (i5 < i6) {
                    i7 = (i5 + i6) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i7, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j5) {
                        break;
                    }
                    if (size > j5) {
                        i6 = i7 - 1;
                    } else {
                        i5 = i7 + 1;
                    }
                }
                if (i6 == i7 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i5, byteArrayOutputStream);
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z4 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i5) {
        return compressBySampleSize(bitmap, i5, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i5, int i6) {
        return compressBySampleSize(bitmap, i5, i6, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i5, int i6, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        if (z4 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i5, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z4 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f5, float f6) {
        return scale(bitmap, f5, f6, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f5, float f6, boolean z4) {
        return scale(bitmap, f5, f6, z4);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i5, int i6) {
        return scale(bitmap, i5, i6, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i5, int i6, boolean z4) {
        return scale(bitmap, i5, i6, z4);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i5) {
        return drawColor(bitmap, i5, false);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i5, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z4) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i5, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static Bitmap drawable2Bitmap(@Nullable Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static byte[] drawable2Bytes(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable));
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i5) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat, i5);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f5, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f6) {
        return fastBlur(bitmap, f5, f6, false, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f5, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f6, boolean z4) {
        return fastBlur(bitmap, f5, f6, z4, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d) float f5, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f6, boolean z4, boolean z5) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f5);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f5, f5);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        Bitmap renderScriptBlur = renderScriptBlur(createBitmap, f6, z4);
        if (f5 == 1.0f || z5) {
            if (z4 && !bitmap.isRecycled() && renderScriptBlur != bitmap) {
                bitmap.recycle();
            }
            return renderScriptBlur;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(renderScriptBlur, width, height, true);
        if (!renderScriptBlur.isRecycled()) {
            renderScriptBlur.recycle();
        }
        if (z4 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap getBitmap(@DrawableRes int i5) {
        Drawable drawable = ContextCompat.getDrawable(Utils.getApp(), i5);
        if (drawable == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getBitmap(@DrawableRes int i5, int i6, int i7) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = Utils.getApp().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i5, options);
        options.inSampleSize = calculateInSampleSize(options, i6, i7);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i5, options);
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static Bitmap getBitmap(File file, int i5, int i6) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i5, int i6) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i5, int i6) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap getBitmap(String str) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap getBitmap(String str, int i5, int i6) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap getBitmap(byte[] bArr, int i5) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i5, bArr.length);
    }

    public static Bitmap getBitmap(byte[] bArr, int i5, int i6, int i7) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i5, bArr.length, options);
        options.inSampleSize = calculateInSampleSize(options, i6, i7);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i5, bArr.length, options);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
    public static ImageType getImageType(File file) {
        FileInputStream fileInputStream;
        ImageType imageType;
        FileInputStream fileInputStream2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                imageType = getImageType(fileInputStream);
            } catch (IOException e6) {
                e = e6;
                e.printStackTrace();
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
        } catch (IOException e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
        if (imageType == null) {
            fileInputStream.close();
            return null;
        }
        try {
            fileInputStream.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        return imageType;
    }

    private static ImageType getImageType(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            if (inputStream.read(bArr) != -1) {
                return getImageType(bArr);
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static ImageType getImageType(String str) {
        return getImageType(UtilsBridge.getFileByPath(str));
    }

    private static ImageType getImageType(byte[] bArr) {
        String upperCase = UtilsBridge.bytes2HexString(bArr).toUpperCase();
        return upperCase.contains("FFD8FF") ? ImageType.TYPE_JPG : upperCase.contains("89504E47") ? ImageType.TYPE_PNG : upperCase.contains("47494638") ? ImageType.TYPE_GIF : (upperCase.contains("49492A00") || upperCase.contains("4D4D002A")) ? ImageType.TYPE_TIFF : upperCase.contains("424D") ? ImageType.TYPE_BMP : (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) ? ImageType.TYPE_WEBP : (upperCase.contains("00000100") || upperCase.contains("00000200")) ? ImageType.TYPE_ICO : ImageType.TYPE_UNKNOWN;
    }

    public static int getRotateDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public static int[] getSize(File file) {
        if (file == null) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static int[] getSize(String str) {
        return getSize(UtilsBridge.getFileByPath(str));
    }

    private static boolean isBMP(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private static boolean isGIF(byte[] bArr) {
        return bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && (bArr[4] == 55 || bArr[4] == 57) && bArr[5] == 97;
    }

    public static boolean isImage(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return isImage(file.getPath());
    }

    public static boolean isImage(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth > 0) {
                return options.outHeight > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean isJPEG(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    private static boolean isPNG(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f5) {
        return renderScriptBlur(bitmap, f5, false);
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, to = 25.0d) float f5, boolean z4) {
        if (!z4) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScript = null;
        try {
            renderScript = RenderScript.create(Utils.getApp());
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setInput(createFromBitmap);
            create.setRadius(f5);
            create.forEach(createTyped);
            createTyped.copyTo(bitmap);
            renderScript.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScript != null) {
                renderScript.destroy();
            }
            throw th;
        }
    }

    public static Bitmap rotate(Bitmap bitmap, int i5, float f5, float f6) {
        return rotate(bitmap, i5, f5, f6, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i5, float f5, float f6, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i5 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i5, f5, f6);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, 100, false);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i5) {
        return save(bitmap, file, compressFormat, i5, false);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0054 -> B:25:0x0069). Please report as a decompilation issue!!! */
    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i5, boolean z4) {
        BufferedOutputStream bufferedOutputStream;
        String str;
        boolean z5 = false;
        if (isEmptyBitmap(bitmap)) {
            str = "bitmap is empty.";
        } else if (bitmap.isRecycled()) {
            str = "bitmap is recycled.";
        } else {
            if (UtilsBridge.createFileByDeleteOldFile(file)) {
                BufferedOutputStream bufferedOutputStream2 = null;
                try {
                    try {
                        try {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    } catch (IOException e6) {
                        e = e6;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    z5 = bitmap.compress(compressFormat, i5, bufferedOutputStream);
                    if (z4 && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    bufferedOutputStream.close();
                } catch (IOException e7) {
                    e = e7;
                    bufferedOutputStream2 = bufferedOutputStream;
                    e.printStackTrace();
                    if (bufferedOutputStream2 != null) {
                        bufferedOutputStream2.close();
                    }
                    return z5;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    throw th;
                }
                return z5;
            }
            str = "create or delete file <" + file + "> failed.";
        }
        Log.e("ImageUtils", str);
        return false;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z4) {
        return save(bitmap, file, compressFormat, 100, z4);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, str, compressFormat, 100, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i5) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i5, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i5, boolean z4) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i5, z4);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z4) {
        return save(bitmap, str, compressFormat, 100, z4);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, "", compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i5) {
        return save2Album(bitmap, "", compressFormat, i5, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i5, boolean z4) {
        return save2Album(bitmap, "", compressFormat, i5, z4);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z4) {
        return save2Album(bitmap, "", compressFormat, 100, z4);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, str, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i5) {
        return save2Album(bitmap, str, compressFormat, i5, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File save2Album(android.graphics.Bitmap r5, java.lang.String r6, android.graphics.Bitmap.CompressFormat r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ImageUtils.save2Album(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int, boolean):java.io.File");
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z4) {
        return save2Album(bitmap, str, compressFormat, 100, z4);
    }

    public static Bitmap scale(Bitmap bitmap, float f5, float f6) {
        return scale(bitmap, f5, f6, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f5, float f6, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f6);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap scale(Bitmap bitmap, int i5, int i6) {
        return scale(bitmap, i5, i6, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i5, int i6, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i5, i6, true);
        if (z4 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f5, float f6) {
        return skew(bitmap, f5, f6, 0.0f, 0.0f, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f5, float f6, float f7, float f8) {
        return skew(bitmap, f5, f6, f7, f8, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f5, float f6, float f7, float f8, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f5, f6, f7, f8);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f5, float f6, boolean z4) {
        return skew(bitmap, f5, f6, 0.0f, 0.0f, z4);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i5) {
        return stackBlur(bitmap, i5, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i5, boolean z4) {
        Bitmap bitmap2;
        int i6;
        int i7;
        int[] iArr;
        int[] iArr2;
        Bitmap copy = z4 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i8 = i5 < 1 ? 1 : i5;
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i9 = width * height;
        int[] iArr3 = new int[i9];
        copy.getPixels(iArr3, 0, width, 0, 0, width, height);
        int i10 = width - 1;
        int i11 = height - 1;
        int i12 = i8 + i8 + 1;
        int[] iArr4 = new int[i9];
        int[] iArr5 = new int[i9];
        int[] iArr6 = new int[i9];
        int[] iArr7 = new int[Math.max(width, height)];
        int i13 = (i12 + 1) >> 1;
        int i14 = i13 * i13;
        int i15 = i14 * 256;
        int[] iArr8 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr8[i16] = i16 / i14;
        }
        int[][] iArr9 = (int[][]) Array.newInstance((Class<?>) int.class, i12, 3);
        int i17 = i8 + 1;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            bitmap2 = copy;
            if (i18 >= height) {
                break;
            }
            int i21 = height;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = -i8;
            int i31 = 0;
            while (true) {
                i7 = i11;
                iArr = iArr7;
                if (i30 > i8) {
                    break;
                }
                int i32 = iArr3[Math.min(i10, Math.max(i30, 0)) + i19];
                int[] iArr10 = iArr9[i30 + i8];
                iArr10[0] = (i32 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[1] = (i32 & 65280) >> 8;
                iArr10[2] = i32 & 255;
                int abs = i17 - Math.abs(i30);
                i31 = (iArr10[0] * abs) + i31;
                i22 = (iArr10[1] * abs) + i22;
                i23 = (iArr10[2] * abs) + i23;
                if (i30 > 0) {
                    i27 += iArr10[0];
                    i28 += iArr10[1];
                    i29 += iArr10[2];
                } else {
                    i24 += iArr10[0];
                    i25 += iArr10[1];
                    i26 += iArr10[2];
                }
                i30++;
                i11 = i7;
                iArr7 = iArr;
            }
            int i33 = i31;
            int i34 = i8;
            int i35 = 0;
            while (i35 < width) {
                iArr4[i19] = iArr8[i33];
                iArr5[i19] = iArr8[i22];
                iArr6[i19] = iArr8[i23];
                int i36 = i33 - i24;
                int i37 = i22 - i25;
                int i38 = i23 - i26;
                int[] iArr11 = iArr9[((i34 - i8) + i12) % i12];
                int i39 = i24 - iArr11[0];
                int i40 = i25 - iArr11[1];
                int i41 = i26 - iArr11[2];
                if (i18 == 0) {
                    iArr2 = iArr8;
                    iArr[i35] = Math.min(i35 + i8 + 1, i10);
                } else {
                    iArr2 = iArr8;
                }
                int i42 = iArr3[i20 + iArr[i35]];
                iArr11[0] = (i42 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr11[1] = (i42 & 65280) >> 8;
                iArr11[2] = i42 & 255;
                int i43 = i27 + iArr11[0];
                int i44 = i28 + iArr11[1];
                int i45 = i29 + iArr11[2];
                i33 = i36 + i43;
                i22 = i37 + i44;
                i23 = i38 + i45;
                i34 = (i34 + 1) % i12;
                int[] iArr12 = iArr9[i34 % i12];
                i24 = i39 + iArr12[0];
                i25 = i40 + iArr12[1];
                i26 = i41 + iArr12[2];
                i27 = i43 - iArr12[0];
                i28 = i44 - iArr12[1];
                i29 = i45 - iArr12[2];
                i19++;
                i35++;
                iArr8 = iArr2;
            }
            i20 += width;
            i18++;
            copy = bitmap2;
            height = i21;
            i11 = i7;
            iArr7 = iArr;
        }
        int i46 = i11;
        int[] iArr13 = iArr7;
        int i47 = height;
        int[] iArr14 = iArr8;
        int i48 = 0;
        while (i48 < width) {
            int i49 = -i8;
            int i50 = i12;
            int[] iArr15 = iArr3;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = i49;
            int i59 = i49 * width;
            int i60 = 0;
            int i61 = 0;
            while (true) {
                i6 = width;
                if (i58 > i8) {
                    break;
                }
                int max = Math.max(0, i59) + i48;
                int[] iArr16 = iArr9[i58 + i8];
                iArr16[0] = iArr4[max];
                iArr16[1] = iArr5[max];
                iArr16[2] = iArr6[max];
                int abs2 = i17 - Math.abs(i58);
                i60 = (iArr4[max] * abs2) + i60;
                i61 = (iArr5[max] * abs2) + i61;
                i51 = (iArr6[max] * abs2) + i51;
                if (i58 > 0) {
                    i55 += iArr16[0];
                    i56 += iArr16[1];
                    i57 += iArr16[2];
                } else {
                    i52 += iArr16[0];
                    i53 += iArr16[1];
                    i54 += iArr16[2];
                }
                int i62 = i46;
                if (i58 < i62) {
                    i59 += i6;
                }
                i58++;
                i46 = i62;
                width = i6;
            }
            int i63 = i46;
            int i64 = i48;
            int i65 = i61;
            int i66 = i8;
            int i67 = i47;
            int i68 = i60;
            int i69 = 0;
            while (i69 < i67) {
                iArr15[i64] = (iArr15[i64] & (-16777216)) | (iArr14[i68] << 16) | (iArr14[i65] << 8) | iArr14[i51];
                int i70 = i68 - i52;
                int i71 = i65 - i53;
                int i72 = i51 - i54;
                int[] iArr17 = iArr9[((i66 - i8) + i50) % i50];
                int i73 = i52 - iArr17[0];
                int i74 = i53 - iArr17[1];
                int i75 = i54 - iArr17[2];
                int i76 = i8;
                if (i48 == 0) {
                    iArr13[i69] = Math.min(i69 + i17, i63) * i6;
                }
                int i77 = iArr13[i69] + i48;
                iArr17[0] = iArr4[i77];
                iArr17[1] = iArr5[i77];
                iArr17[2] = iArr6[i77];
                int i78 = i55 + iArr17[0];
                int i79 = i56 + iArr17[1];
                int i80 = i57 + iArr17[2];
                i68 = i70 + i78;
                i65 = i71 + i79;
                i51 = i72 + i80;
                i66 = (i66 + 1) % i50;
                int[] iArr18 = iArr9[i66];
                i52 = i73 + iArr18[0];
                i53 = i74 + iArr18[1];
                i54 = i75 + iArr18[2];
                i55 = i78 - iArr18[0];
                i56 = i79 - iArr18[1];
                i57 = i80 - iArr18[2];
                i64 += i6;
                i69++;
                i8 = i76;
            }
            i48++;
            i46 = i63;
            i47 = i67;
            i12 = i50;
            iArr3 = iArr15;
            width = i6;
        }
        int i81 = width;
        bitmap2.setPixels(iArr3, 0, i81, 0, 0, i81, i47);
        return bitmap2;
    }

    public static Bitmap toAlpha(Bitmap bitmap) {
        return toAlpha(bitmap, Boolean.FALSE);
    }

    public static Bitmap toAlpha(Bitmap bitmap, Boolean bool) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap extractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled() && extractAlpha != bitmap) {
            bitmap.recycle();
        }
        return extractAlpha;
    }

    public static Bitmap toGray(Bitmap bitmap) {
        return toGray(bitmap, false);
    }

    public static Bitmap toGray(Bitmap bitmap, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap) {
        return toRound(bitmap, 0, 0, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i5, @ColorInt int i6) {
        return toRound(bitmap, i5, i6, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i5, @ColorInt int i6, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f5 = min;
        float f6 = f5 / 2.0f;
        float f7 = width;
        float f8 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f7, f8);
        rectF.inset((width - min) / 2.0f, (height - min) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        if (width != height) {
            matrix.preScale(f5 / f7, f5 / f8);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (i5 > 0) {
            paint.setShader(null);
            paint.setColor(i6);
            paint.setStyle(Paint.Style.STROKE);
            float f9 = i5;
            paint.setStrokeWidth(f9);
            canvas.drawCircle(f7 / 2.0f, f8 / 2.0f, f6 - (f9 / 2.0f), paint);
        }
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z4) {
        return toRound(bitmap, 0, 0, z4);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f5) {
        return toRoundCorner(bitmap, f5, 0.0f, 0, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f5, @FloatRange(from = 0.0d) float f6, @ColorInt int i5) {
        return toRoundCorner(bitmap, f5, f6, i5, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f5, @FloatRange(from = 0.0d) float f6, @ColorInt int i5, boolean z4) {
        return toRoundCorner(bitmap, new float[]{f5, f5, f5, f5, f5, f5, f5, f5}, f6, i5, z4);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f5, boolean z4) {
        return toRoundCorner(bitmap, f5, 0.0f, 0, z4);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f5, @ColorInt int i5) {
        return toRoundCorner(bitmap, fArr, f5, i5, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f5, @ColorInt int i5, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f6 = f5 / 2.0f;
        rectF.inset(f6, f6);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f5 > 0.0f) {
            paint.setShader(null);
            paint.setColor(i5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f5);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z4 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap view2Bitmap(View view) {
        Bitmap createBitmap;
        if (view == null) {
            return null;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.isRecycled()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 == null || drawingCache2.isRecycled()) {
                createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
            } else {
                createBitmap = Bitmap.createBitmap(drawingCache2);
            }
        } else {
            createBitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        return createBitmap;
    }
}
