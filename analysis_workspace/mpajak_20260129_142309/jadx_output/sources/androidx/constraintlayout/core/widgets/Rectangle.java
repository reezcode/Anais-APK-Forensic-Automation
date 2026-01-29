package androidx.constraintlayout.core.widgets;

/* loaded from: classes22.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f157x;

    /* renamed from: y, reason: collision with root package name */
    public int f158y;

    public boolean contains(int i5, int i6) {
        int i7;
        int i8 = this.f157x;
        return i5 >= i8 && i5 < i8 + this.width && i6 >= (i7 = this.f158y) && i6 < i7 + this.height;
    }

    public int getCenterX() {
        return (this.f157x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f158y + this.height) / 2;
    }

    public void grow(int i5, int i6) {
        this.f157x -= i5;
        this.f158y -= i6;
        this.width = (i5 * 2) + this.width;
        this.height = (i6 * 2) + this.height;
    }

    public boolean intersects(Rectangle rectangle) {
        int i5;
        int i6;
        int i7 = this.f157x;
        int i8 = rectangle.f157x;
        return i7 >= i8 && i7 < i8 + rectangle.width && (i5 = this.f158y) >= (i6 = rectangle.f158y) && i5 < i6 + rectangle.height;
    }

    public void setBounds(int i5, int i6, int i7, int i8) {
        this.f157x = i5;
        this.f158y = i6;
        this.width = i7;
        this.height = i8;
    }
}
