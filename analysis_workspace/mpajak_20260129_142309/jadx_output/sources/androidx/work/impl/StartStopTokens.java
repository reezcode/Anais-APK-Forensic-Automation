package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class StartStopTokens {
    private final Object lock = new Object();
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    public final boolean contains(WorkGenerationalId id) {
        boolean containsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            containsKey = this.runs.containsKey(id);
        }
        return containsKey;
    }

    public final StartStopToken remove(WorkGenerationalId id) {
        StartStopToken remove;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            remove = this.runs.remove(id);
        }
        return remove;
    }

    public final StartStopToken remove(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }

    public final List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            Map<WorkGenerationalId, StartStopToken> map = this.runs;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
                if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                this.runs.remove((WorkGenerationalId) it.next());
            }
            list = CollectionsKt.toList(linkedHashMap.values());
        }
        return list;
    }

    public final StartStopToken tokenFor(WorkGenerationalId id) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.lock) {
            Map<WorkGenerationalId, StartStopToken> map = this.runs;
            StartStopToken startStopToken2 = map.get(id);
            if (startStopToken2 == null) {
                startStopToken2 = new StartStopToken(id);
                map.put(id, startStopToken2);
            }
            startStopToken = startStopToken2;
        }
        return startStopToken;
    }

    public final StartStopToken tokenFor(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }
}
