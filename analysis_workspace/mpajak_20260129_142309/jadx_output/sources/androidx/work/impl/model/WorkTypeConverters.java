package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.activity.d;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    public static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    /* loaded from: classes8.dex */
    public static final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    /* loaded from: classes16.dex */
    public static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    /* loaded from: classes10.dex */
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    @JvmStatic
    @TypeConverter
    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i5 = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    @TypeConverter
    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i5 = 0; i5 < readInt; i5++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new Constraints.ContentUriTrigger(uri, readBoolean));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(objectInputStream, null);
                } finally {
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    @JvmStatic
    @TypeConverter
    public static final BackoffPolicy intToBackoffPolicy(int i5) {
        if (i5 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i5 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(d.c("Could not convert ", i5, " to BackoffPolicy"));
    }

    @JvmStatic
    @TypeConverter
    public static final NetworkType intToNetworkType(int i5) {
        if (i5 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i5 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i5 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i5 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i5 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i5 != 5) {
            throw new IllegalArgumentException(d.c("Could not convert ", i5, " to NetworkType"));
        }
        return NetworkType.TEMPORARILY_UNMETERED;
    }

    @JvmStatic
    @TypeConverter
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i5) {
        if (i5 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i5 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(d.c("Could not convert ", i5, " to OutOfQuotaPolicy"));
    }

    @JvmStatic
    @TypeConverter
    public static final WorkInfo.State intToState(int i5) {
        if (i5 == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i5 == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i5 == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i5 == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i5 == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i5 == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException(d.c("Could not convert ", i5, " to State"));
    }

    @JvmStatic
    @TypeConverter
    public static final int networkTypeToInt(NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i5 = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 3) {
            return 2;
        }
        if (i5 == 4) {
            return 3;
        }
        if (i5 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @JvmStatic
    @TypeConverter
    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i5 = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    @TypeConverter
    public static final byte[] setOfTriggersToByteArray(Set<Constraints.ContentUriTrigger> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    @TypeConverter
    public static final int stateToInt(WorkInfo.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
