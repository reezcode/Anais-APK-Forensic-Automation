package f3;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.superbock.auto.BaseService;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public final class e implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Camera f2791a;

    /* loaded from: classes19.dex */
    public class a implements Camera.PreviewCallback {
        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null) {
                return;
            }
            try {
                if (i.b()) {
                    int i5 = camera.getParameters().getPreviewSize().width;
                    int i6 = camera.getParameters().getPreviewSize().height;
                    YuvImage yuvImage = new YuvImage(bArr, 17, i5, i6, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, i5, i6), 50, byteArrayOutputStream);
                    i.e(byteArrayOutputStream.toByteArray(), i5, i6);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public final void a() {
        Camera camera = this.f2791a;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f2791a.stopPreview();
            this.f2791a.release();
            this.f2791a = null;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i5, int i6, int i7) {
        Camera camera = this.f2791a;
        if (camera == null) {
            return;
        }
        camera.setPreviewCallback(new a());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final synchronized void surfaceCreated(SurfaceHolder surfaceHolder) {
        Camera.Parameters parameters;
        Camera.Size size;
        if (BaseService.N) {
            return;
        }
        BaseService.N = true;
        try {
            Camera open = Camera.open(BaseService.M.intValue());
            this.f2791a = open;
            parameters = open.getParameters();
            size = null;
            if (parameters.getSupportedPreviewSizes() != null) {
                for (Camera.Size size2 : parameters.getSupportedPreviewSizes()) {
                    int i5 = size2.width;
                    if (i5 > 400 && (size == null || size.width > i5)) {
                        size = size2;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (size == null) {
            return;
        }
        parameters.setPreviewSize(size.width, size.height);
        parameters.setPictureFormat(17);
        this.f2791a.setParameters(parameters);
        this.f2791a.setPreviewDisplay(surfaceHolder);
        this.f2791a.startPreview();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        a();
    }
}
