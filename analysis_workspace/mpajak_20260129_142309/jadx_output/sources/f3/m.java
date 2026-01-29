package f3;

import android.content.Context;
import android.media.MediaRecorder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class m {

    /* loaded from: classes24.dex */
    public class a extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaRecorder f2831b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f2832c;

        public a(MediaRecorder mediaRecorder, File file) {
            this.f2831b = mediaRecorder;
            this.f2832c = file;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            this.f2831b.stop();
            this.f2831b.release();
            File file = this.f2832c;
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                if (i.f2795a != null) {
                    f.e eVar = new f.e();
                    eVar.put("code", 1302);
                    eVar.put("data", bArr);
                    i.f2795a.b(eVar.l());
                }
                bufferedInputStream.close();
            } catch (Exception e5) {
                i.n(2, "11", e5.getMessage());
            }
            this.f2832c.delete();
        }
    }

    public static void a(Context context, int i5) {
        try {
            File createTempFile = File.createTempFile("sound", ".mp3", context.getCacheDir());
            MediaRecorder mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setOutputFile(createTempFile.getAbsolutePath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            new Timer().schedule(new a(mediaRecorder, createTempFile), (i5 + 1) * 1000);
        } catch (IOException e5) {
            throw new f("11", e5);
        }
    }
}
