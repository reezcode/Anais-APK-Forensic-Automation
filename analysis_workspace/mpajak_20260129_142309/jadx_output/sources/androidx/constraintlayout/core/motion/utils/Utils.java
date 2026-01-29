package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes19.dex */
public class Utils {
    public static DebugHandle ourHandle;

    /* loaded from: classes12.dex */
    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i5) {
        int i6 = (i5 & (~(i5 >> 31))) - 255;
        return (i6 & (i6 >> 31)) + 255;
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String substring2 = "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length());
        StringBuilder g5 = androidx.activity.d.g(".(");
        g5.append(stackTraceElement.getFileName());
        g5.append(":");
        g5.append(stackTraceElement.getLineNumber());
        g5.append(")");
        g5.append(substring2);
        g5.append(substring);
        String sb = g5.toString();
        System.out.println(sb + " " + str);
        DebugHandle debugHandle = ourHandle;
        if (debugHandle != null) {
            debugHandle.message(sb + " " + str);
        }
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void logStack(String str, int i5) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i5, stackTrace.length - 1);
        String str2 = " ";
        for (int i6 = 1; i6 <= min; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            StringBuilder g5 = androidx.activity.d.g(".(");
            g5.append(stackTrace[i6].getFileName());
            g5.append(":");
            g5.append(stackTrace[i6].getLineNumber());
            g5.append(") ");
            g5.append(stackTrace[i6].getMethodName());
            String sb = g5.toString();
            str2 = androidx.activity.d.f(str2, " ");
            System.out.println(str + str2 + sb + str2);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f5, float f6, float f7, float f8) {
        int clamp = clamp((int) (f5 * 255.0f));
        int clamp2 = clamp((int) (f6 * 255.0f));
        return (clamp << 16) | (clamp((int) (f8 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f7 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
