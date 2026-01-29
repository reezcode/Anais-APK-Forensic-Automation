package org.apache.commons.io.input;

import java.time.Duration;
import java.time.Instant;
import org.apache.commons.io.input.ObservableInputStream;

/* loaded from: classes15.dex */
public class TimestampedObserver extends ObservableInputStream.Observer {
    private volatile Instant closeInstant;
    private final Instant openInstant = Instant.now();

    @Override // org.apache.commons.io.input.ObservableInputStream.Observer
    public void closed() {
        this.closeInstant = Instant.now();
    }

    public Instant getCloseInstant() {
        return this.closeInstant;
    }

    public Instant getOpenInstant() {
        return this.openInstant;
    }

    public Duration getOpenToCloseDuration() {
        return Duration.between(this.openInstant, this.closeInstant);
    }

    public Duration getOpenToNowDuration() {
        return Duration.between(this.openInstant, Instant.now());
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("TimestampedObserver [openInstant=");
        g5.append(this.openInstant);
        g5.append(", closeInstant=");
        g5.append(this.closeInstant);
        g5.append("]");
        return g5.toString();
    }
}
