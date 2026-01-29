package k4;

import androidx.annotation.NonNull;
import androidx.core.view.PointerIconCompat;
import java.util.Locale;

/* loaded from: classes14.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    /* JADX INFO: Fake field, exist only in values array */
    READ_FAILED(102, "Failed to read from given input"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    /* JADX INFO: Fake field, exist only in values array */
    WRONG_RECORD(107, "Wrong record type detected"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE_FAILED(110, "Failed to close given input"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(111, "Given file was not opened for read"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(112, "Image is defective, decoding aborted"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(113, "Image EOF detected before image complete"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(1000, "No frames found, at least one frame required"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(PointerIconCompat.TYPE_CONTEXT_MENU, "Invalid screen size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(PointerIconCompat.TYPE_HAND, "Invalid image size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(PointerIconCompat.TYPE_HELP, "Image size exceeds screen size"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(PointerIconCompat.TYPE_WAIT, "Input source rewind failed, animation stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");


    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f3905b;

    /* renamed from: c, reason: collision with root package name */
    public int f3906c;

    b(int i5, @NonNull String str) {
        this.f3906c = i5;
        this.f3905b = str;
    }

    public final String a() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f3906c), this.f3905b);
    }
}
