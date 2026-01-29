package org.apache.commons.io.input;

import java.io.InputStream;
import java.security.MessageDigest;
import org.apache.commons.io.input.ObservableInputStream;

/* loaded from: classes19.dex */
public class MessageDigestCalculatingInputStream extends ObservableInputStream {
    private final MessageDigest messageDigest;

    /* loaded from: classes9.dex */
    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {
        private final MessageDigest messageDigest;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            this.messageDigest = messageDigest;
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(int i5) {
            this.messageDigest.update((byte) i5);
        }

        @Override // org.apache.commons.io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i5, int i6) {
            this.messageDigest.update(bArr, i5, i6);
        }
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream) {
        this(inputStream, MessageDigest.getInstance("MD5"));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) {
        this(inputStream, MessageDigest.getInstance(str));
    }

    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, new MessageDigestMaintainingObserver(messageDigest));
        this.messageDigest = messageDigest;
    }

    public MessageDigest getMessageDigest() {
        return this.messageDigest;
    }
}
