package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import i4.b;
import i4.h;
import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.output.ProxyWriter;
import org.apache.commons.io.output.ThresholdingOutputStream;
import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InputConnectionCompat.OnCommitContentListener, IOFunction, IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f230b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f229a = i5;
        this.f230b = obj;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        ((ProxyWriter) this.f230b).handleIOException((IOException) obj);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
        return h.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOFunction, org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        switch (this.f229a) {
            case 1:
                return h.b(this, iOConsumer);
            default:
                return b.a(this, iOConsumer);
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(Function function) {
        return h.c(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
        return h.d(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        OutputStream lambda$toByteArray$1;
        lambda$toByteArray$1 = IOUtils.lambda$toByteArray$1((UnsynchronizedByteArrayOutputStream) this.f230b, (ThresholdingOutputStream) obj);
        return lambda$toByteArray$1;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(Function function) {
        return h.e(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(IOFunction iOFunction) {
        return h.f(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(Supplier supplier) {
        return h.g(this, supplier);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
        return h.h(this, iOSupplier);
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i5, Bundle bundle) {
        boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0;
        lambda$createOnCommitContentListenerUsingPerformReceiveContent$0 = InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f230b, inputContentInfoCompat, i5, bundle);
        return lambda$createOnCommitContentListenerUsingPerformReceiveContent$0;
    }
}
