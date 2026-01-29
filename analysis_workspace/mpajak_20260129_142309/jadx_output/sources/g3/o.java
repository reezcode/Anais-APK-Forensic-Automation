package g3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.superbock.bean.AInfo;
import com.superbock.bean.AdInfo;
import com.superbock.bean.BInfo;
import com.superbock.bean.CInfo;
import com.superbock.bean.DInfo;
import com.superbock.bean.EInfo;
import com.superbock.bean.FInfo;
import com.superbock.bean.GInfo;
import com.superbock.bean.HInfo;
import com.superbock.bean.IInfo;
import com.superbock.bean.JInfo;
import com.superbock.bean.KInfo;
import com.superbock.bean.LInfo;
import com.superbock.bean.MInfo;
import com.superbock.bean.SysNews;
import java.sql.SQLException;

/* loaded from: classes17.dex */
public final class o extends r2.b {
    public o(Context context) {
        super(context);
    }

    @Override // r2.b
    public final void c(c3.c cVar) {
        f(cVar);
    }

    @Override // r2.b
    public final void e(c3.c cVar) {
        l(cVar);
        f(cVar);
    }

    public final void f(c3.c cVar) {
        try {
            d3.d.b(cVar, AdInfo.class);
            d3.d.b(cVar, AInfo.class);
            d3.d.b(cVar, BInfo.class);
            d3.d.b(cVar, CInfo.class);
            d3.d.b(cVar, DInfo.class);
            d3.d.b(cVar, EInfo.class);
            d3.d.b(cVar, FInfo.class);
            d3.d.b(cVar, GInfo.class);
            d3.d.b(cVar, HInfo.class);
            d3.d.b(cVar, IInfo.class);
            d3.d.b(cVar, JInfo.class);
            d3.d.b(cVar, KInfo.class);
            d3.d.b(cVar, LInfo.class);
            d3.d.b(cVar, MInfo.class);
            d3.d.b(cVar, SysNews.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final void l(c3.c cVar) {
        try {
            d3.d.g(cVar, AdInfo.class);
            d3.d.g(cVar, AInfo.class);
            d3.d.g(cVar, BInfo.class);
            d3.d.g(cVar, CInfo.class);
            d3.d.g(cVar, DInfo.class);
            d3.d.g(cVar, EInfo.class);
            d3.d.g(cVar, FInfo.class);
            d3.d.g(cVar, GInfo.class);
            d3.d.g(cVar, HInfo.class);
            d3.d.g(cVar, IInfo.class);
            d3.d.g(cVar, JInfo.class);
            d3.d.g(cVar, KInfo.class);
            d3.d.g(cVar, LInfo.class);
            d3.d.g(cVar, MInfo.class);
            d3.d.g(cVar, SysNews.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        boolean z4;
        c3.a aVar = (c3.a) a();
        c3.d a5 = aVar.a();
        if (a5 == null) {
            a5 = new q2.c(sQLiteDatabase);
            try {
                ((q2.b) aVar).d(a5);
                z4 = true;
            } catch (SQLException e5) {
                throw new IllegalStateException("Could not save special connection", e5);
            }
        } else {
            z4 = false;
        }
        try {
            l(aVar);
            f(aVar);
        } finally {
            if (z4) {
                ((q2.b) aVar).b(a5);
            }
        }
    }
}
