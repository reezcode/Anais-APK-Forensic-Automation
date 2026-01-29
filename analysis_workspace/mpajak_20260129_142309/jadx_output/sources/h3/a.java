package h3;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
public final class a {
    @NonNull
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        }
    }
}
