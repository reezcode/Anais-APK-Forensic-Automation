package androidx.work;

import android.annotation.SuppressLint;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;

/* loaded from: classes16.dex */
public interface Operation {

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS;

    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS;

    /* loaded from: classes15.dex */
    public static abstract class State {

        /* loaded from: classes23.dex */
        public static final class FAILURE extends State {
            private final Throwable mThrowable;

            public FAILURE(@NonNull Throwable th) {
                this.mThrowable = th;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.mThrowable;
            }

            @NonNull
            public String toString() {
                StringBuilder g5 = d.g("FAILURE (");
                g5.append(this.mThrowable.getMessage());
                g5.append(")");
                return g5.toString();
            }
        }

        /* loaded from: classes23.dex */
        public static final class IN_PROGRESS extends State {
            private IN_PROGRESS() {
            }

            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes8.dex */
        public static final class SUCCESS extends State {
            private SUCCESS() {
            }

            @NonNull
            public String toString() {
                return "SUCCESS";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public State() {
        }
    }

    static {
        SUCCESS = new State.SUCCESS();
        IN_PROGRESS = new State.IN_PROGRESS();
    }

    @NonNull
    h2.a<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();
}
