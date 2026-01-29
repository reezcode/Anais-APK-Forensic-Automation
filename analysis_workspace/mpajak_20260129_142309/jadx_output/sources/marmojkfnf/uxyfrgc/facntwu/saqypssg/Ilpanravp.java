package marmojkfnf.uxyfrgc.facntwu.saqypssg;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes.dex */
public class Ilpanravp extends ContentProvider {
    static {
        xjhbp.classescxclcy(30);
    }

    @Override // android.content.ContentProvider
    public final native int delete(Uri uri, String str, String[] strArr);

    @Override // android.content.ContentProvider
    public final native String getType(Uri uri);

    @Override // android.content.ContentProvider
    public final native Uri insert(Uri uri, ContentValues contentValues);

    @Override // android.content.ContentProvider
    public native boolean onCreate();

    @Override // android.content.ContentProvider
    public final native Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    @Override // android.content.ContentProvider
    public final native int update(Uri uri, ContentValues contentValues, String str, String[] strArr);
}
