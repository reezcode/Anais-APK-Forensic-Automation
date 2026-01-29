package marmojkfnf.ybdrbn.txsrhukl.rwgsop;

import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import fmfjq.twyvy.xjhbp;

/* loaded from: classes.dex */
public class Ulennxoi extends WallpaperService {

    /* loaded from: classes5.dex */
    public final class a extends WallpaperService.Engine {
        static {
            xjhbp.classescxclcy(35);
        }

        public a(Ulennxoi ulennxoi) {
            super(ulennxoi);
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public final native void onCreate(SurfaceHolder surfaceHolder);

        @Override // android.service.wallpaper.WallpaperService.Engine
        public final native void onVisibilityChanged(boolean z4);
    }

    static {
        xjhbp.classescxclcy(61);
    }

    @Override // android.service.wallpaper.WallpaperService, android.app.Service
    public final native void onCreate();

    @Override // android.service.wallpaper.WallpaperService
    public final native WallpaperService.Engine onCreateEngine();
}
