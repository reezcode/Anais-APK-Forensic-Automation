package com.superbock.auto;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import f3.i;

/* loaded from: classes.dex */
public class ScreenActivity extends Activity {
    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i6 != -1 || i5 != 1) {
            i.k(i.f2796b);
            finish();
            return;
        }
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) ScreenService.class);
        intent2.putExtra("code", i6);
        intent2.putExtra("data", intent);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent(), 1);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }
}
