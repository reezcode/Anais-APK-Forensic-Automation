package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.activity.result.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, float f5, float f6, float f7, float f8, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.clipRect(f5, f6, f7, f8);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withClip(Canvas canvas, int i5, int i6, int i7, int i8, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.clipRect(i5, i6, i7, i8);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withClip(Canvas canvas, Path clipPath, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(clipPath, "clipPath");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.clipPath(clipPath);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withClip(Canvas canvas, Rect clipRect, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(clipRect, "clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withClip(Canvas canvas, RectF clipRect, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(clipRect, "clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.clipRect(clipRect);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            matrix = new Matrix();
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withRotation(Canvas canvas, float f5, float f6, float f7, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.rotate(f5, f6, f7);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f5, float f6, float f7, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.rotate(f5, f6, f7);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withSave(Canvas canvas, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withScale(Canvas canvas, float f5, float f6, float f7, float f8, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.scale(f5, f6, f7, f8);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f5, float f6, float f7, float f8, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 1.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((i5 & 8) != 0) {
            f8 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.scale(f5, f6, f7, f8);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withSkew(Canvas canvas, float f5, float f6, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.skew(f5, f6);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f5, float f6, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.skew(f5, f6);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f5, float f6, Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.translate(f5, f6);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f5, float f6, Function1 block, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        canvas.translate(f5, f6);
        try {
            block.invoke(canvas);
        } finally {
            a.h(1, canvas, save, 1);
        }
    }
}
