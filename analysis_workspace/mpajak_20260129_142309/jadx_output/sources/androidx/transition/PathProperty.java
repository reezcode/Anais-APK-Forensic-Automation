package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes14.dex */
class PathProperty<T> extends Property<T, Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final PathMeasure mPathMeasure;
    private final PointF mPointF;
    private final float[] mPosition;
    private final Property<T, PointF> mProperty;

    public PathProperty(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.mPosition = new float[2];
        this.mPointF = new PointF();
        this.mProperty = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.mPathMeasure = pathMeasure;
        this.mPathLength = pathMeasure.getLength();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t4) {
        return Float.valueOf(this.mCurrentFraction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(Object obj) {
        return get((PathProperty<T>) obj);
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(T t4, Float f5) {
        this.mCurrentFraction = f5.floatValue();
        this.mPathMeasure.getPosTan(f5.floatValue() * this.mPathLength, this.mPosition, null);
        PointF pointF = this.mPointF;
        float[] fArr = this.mPosition;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.mProperty.set(t4, pointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f5) {
        set2((PathProperty<T>) obj, f5);
    }
}
