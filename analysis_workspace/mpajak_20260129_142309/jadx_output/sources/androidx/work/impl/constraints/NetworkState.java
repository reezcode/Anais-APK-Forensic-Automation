package androidx.work.impl.constraints;

import androidx.activity.d;

/* loaded from: classes13.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z4, boolean z5, boolean z6, boolean z7) {
        this.isConnected = z4;
        this.isValidated = z5;
        this.isMetered = z6;
        this.isNotRoaming = z7;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z4, boolean z5, boolean z6, boolean z7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = networkState.isConnected;
        }
        if ((i5 & 2) != 0) {
            z5 = networkState.isValidated;
        }
        if ((i5 & 4) != 0) {
            z6 = networkState.isMetered;
        }
        if ((i5 & 8) != 0) {
            z7 = networkState.isNotRoaming;
        }
        return networkState.copy(z4, z5, z6, z7);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z4, boolean z5, boolean z6, boolean z7) {
        return new NetworkState(z4, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.isConnected;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        ?? r22 = this.isValidated;
        int i6 = r22;
        if (r22 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r23 = this.isMetered;
        int i8 = r23;
        if (r23 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z5 = this.isNotRoaming;
        return i9 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        StringBuilder g5 = d.g("NetworkState(isConnected=");
        g5.append(this.isConnected);
        g5.append(", isValidated=");
        g5.append(this.isValidated);
        g5.append(", isMetered=");
        g5.append(this.isMetered);
        g5.append(", isNotRoaming=");
        g5.append(this.isNotRoaming);
        g5.append(')');
        return g5.toString();
    }
}
