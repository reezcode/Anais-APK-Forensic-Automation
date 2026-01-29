package k;

import i.a;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Type;

/* loaded from: classes15.dex */
public final class i implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3702a = new i();

    public static boolean j(Class<?> cls) {
        return cls == Point.class || cls == Rectangle.class || cls == Font.class || cls == Color.class;
    }

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        T t4;
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 8) {
            cVar.Q(16);
            return null;
        }
        if (cVar.q() != 12 && cVar.q() != 16) {
            throw new f.d("syntax error");
        }
        cVar.y();
        if (type == Point.class) {
            t4 = (T) h(aVar, obj);
        } else if (type == Rectangle.class) {
            t4 = (T) i(aVar);
        } else if (type == Color.class) {
            t4 = (T) f(aVar);
        } else {
            if (type != Font.class) {
                throw new f.d("not support awt class : " + type);
            }
            t4 = (T) g(aVar);
        }
        i.h hVar = aVar.f3147h;
        aVar.N(t4, obj);
        aVar.P(hVar);
        return t4;
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        int alpha;
        String str;
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.E();
            return;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            a1Var.r(k(a1Var, Point.class), "x", point.x);
            a1Var.r(',', "y", point.y);
        } else {
            if (obj instanceof Font) {
                Font font = (Font) obj;
                a1Var.w(k(a1Var, Font.class), "name", font.getName());
                a1Var.r(',', "style", font.getStyle());
                alpha = font.getSize();
                str = "size";
            } else if (obj instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) obj;
                a1Var.r(k(a1Var, Rectangle.class), "x", rectangle.x);
                a1Var.r(',', "y", rectangle.y);
                a1Var.r(',', "width", rectangle.width);
                alpha = rectangle.height;
                str = "height";
            } else {
                if (!(obj instanceof Color)) {
                    StringBuilder g5 = androidx.activity.d.g("not support awt class : ");
                    g5.append(obj.getClass().getName());
                    throw new f.d(g5.toString());
                }
                Color color = (Color) obj;
                a1Var.r(k(a1Var, Color.class), "r", color.getRed());
                a1Var.r(',', "g", color.getGreen());
                a1Var.r(',', "b", color.getBlue());
                if (color.getAlpha() > 0) {
                    alpha = color.getAlpha();
                    str = "alpha";
                }
            }
            a1Var.r(',', str, alpha);
        }
        a1Var.write(125);
    }

    @Override // j.s
    public final int e() {
        return 12;
    }

    public final Color f(i.a aVar) {
        i.c cVar = aVar.f3146g;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (cVar.q() != 13) {
            if (cVar.q() != 4) {
                throw new f.d("syntax error");
            }
            String k02 = cVar.k0();
            cVar.H();
            if (cVar.q() != 2) {
                throw new f.d("syntax error");
            }
            int I = cVar.I();
            cVar.y();
            if (k02.equalsIgnoreCase("r")) {
                i5 = I;
            } else if (k02.equalsIgnoreCase("g")) {
                i6 = I;
            } else if (k02.equalsIgnoreCase("b")) {
                i7 = I;
            } else {
                if (!k02.equalsIgnoreCase("alpha")) {
                    throw new f.d(androidx.activity.d.f("syntax error, ", k02));
                }
                i8 = I;
            }
            if (cVar.q() == 16) {
                cVar.Q(4);
            }
        }
        cVar.y();
        return new Color(i5, i6, i7, i8);
    }

    public final Font g(i.a aVar) {
        i.c cVar = aVar.f3146g;
        int i5 = 0;
        String str = null;
        int i6 = 0;
        while (cVar.q() != 13) {
            if (cVar.q() != 4) {
                throw new f.d("syntax error");
            }
            String k02 = cVar.k0();
            cVar.H();
            if (k02.equalsIgnoreCase("name")) {
                if (cVar.q() != 4) {
                    throw new f.d("syntax error");
                }
                str = cVar.k0();
            } else if (k02.equalsIgnoreCase("style")) {
                if (cVar.q() != 2) {
                    throw new f.d("syntax error");
                }
                i5 = cVar.I();
            } else {
                if (!k02.equalsIgnoreCase("size")) {
                    throw new f.d(androidx.activity.d.f("syntax error, ", k02));
                }
                if (cVar.q() != 2) {
                    throw new f.d("syntax error");
                }
                i6 = cVar.I();
            }
            cVar.y();
            if (cVar.q() == 16) {
                cVar.Q(4);
            }
        }
        cVar.y();
        return new Font(str, i5, i6);
    }

    public final Point h(i.a aVar, Object obj) {
        int l5;
        i.c cVar = aVar.f3146g;
        int i5 = 0;
        int i6 = 0;
        while (cVar.q() != 13) {
            if (cVar.q() != 4) {
                throw new f.d("syntax error");
            }
            String k02 = cVar.k0();
            if (f.a.f2680d.equals(k02)) {
                i.c cVar2 = aVar.f3146g;
                cVar2.S();
                if (cVar2.q() != 4) {
                    throw new f.d("type not match error");
                }
                if (!"java.awt.Point".equals(cVar2.k0())) {
                    throw new f.d("type not match error");
                }
                cVar2.y();
                if (cVar2.q() == 16) {
                    cVar2.y();
                }
            } else {
                if ("$ref".equals(k02)) {
                    i.c cVar3 = aVar.f3146g;
                    cVar3.H();
                    String k03 = cVar3.k0();
                    aVar.N(aVar.f3147h, obj);
                    aVar.b(new a.C0035a(aVar.f3147h, k03));
                    aVar.J();
                    aVar.f3151l = 1;
                    cVar3.Q(13);
                    aVar.a(13);
                    return null;
                }
                cVar.H();
                int q4 = cVar.q();
                if (q4 == 2) {
                    l5 = cVar.I();
                } else {
                    if (q4 != 3) {
                        StringBuilder g5 = androidx.activity.d.g("syntax error : ");
                        g5.append(cVar.Y());
                        throw new f.d(g5.toString());
                    }
                    l5 = (int) cVar.l();
                }
                cVar.y();
                if (k02.equalsIgnoreCase("x")) {
                    i5 = l5;
                } else {
                    if (!k02.equalsIgnoreCase("y")) {
                        throw new f.d(androidx.activity.d.f("syntax error, ", k02));
                    }
                    i6 = l5;
                }
                if (cVar.q() == 16) {
                    cVar.Q(4);
                }
            }
        }
        cVar.y();
        return new Point(i5, i6);
    }

    public final Rectangle i(i.a aVar) {
        int l5;
        i.c cVar = aVar.f3146g;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (cVar.q() != 13) {
            if (cVar.q() != 4) {
                throw new f.d("syntax error");
            }
            String k02 = cVar.k0();
            cVar.H();
            int q4 = cVar.q();
            if (q4 == 2) {
                l5 = cVar.I();
            } else {
                if (q4 != 3) {
                    throw new f.d("syntax error");
                }
                l5 = (int) cVar.l();
            }
            cVar.y();
            if (k02.equalsIgnoreCase("x")) {
                i5 = l5;
            } else if (k02.equalsIgnoreCase("y")) {
                i6 = l5;
            } else if (k02.equalsIgnoreCase("width")) {
                i7 = l5;
            } else {
                if (!k02.equalsIgnoreCase("height")) {
                    throw new f.d(androidx.activity.d.f("syntax error, ", k02));
                }
                i8 = l5;
            }
            if (cVar.q() == 16) {
                cVar.Q(4);
            }
        }
        cVar.y();
        return new Rectangle(i5, i6, i7, i8);
    }

    public final char k(a1 a1Var, Class cls) {
        if (!a1Var.l(b1.WriteClassName)) {
            return '{';
        }
        a1Var.write(123);
        a1Var.q(f.a.f2680d);
        a1Var.J(cls.getName());
        return ',';
    }
}
