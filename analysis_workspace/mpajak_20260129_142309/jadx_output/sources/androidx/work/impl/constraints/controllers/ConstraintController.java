package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback callback;
    private T currentValue;
    private final List<String> matchingWorkSpecIds;
    private final List<WorkSpec> matchingWorkSpecs;
    private final ConstraintTracker<T> tracker;

    /* loaded from: classes6.dex */
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(List<WorkSpec> list);

        void onConstraintNotMet(List<WorkSpec> list);
    }

    public ConstraintController(ConstraintTracker<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.matchingWorkSpecs = new ArrayList();
        this.matchingWorkSpecIds = new ArrayList();
    }

    private final void updateCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback, T t4) {
        if (this.matchingWorkSpecs.isEmpty() || onConstraintUpdatedCallback == null) {
            return;
        }
        if (t4 == null || isConstrained(t4)) {
            onConstraintUpdatedCallback.onConstraintNotMet(this.matchingWorkSpecs);
        } else {
            onConstraintUpdatedCallback.onConstraintMet(this.matchingWorkSpecs);
        }
    }

    public final OnConstraintUpdatedCallback getCallback() {
        return this.callback;
    }

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public abstract boolean isConstrained(T t4);

    public final boolean isWorkSpecConstrained(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        T t4 = this.currentValue;
        return t4 != null && isConstrained(t4) && this.matchingWorkSpecIds.contains(workSpecId);
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T t4) {
        this.currentValue = t4;
        updateCallback(this.callback, t4);
    }

    public final void replace(Iterable<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.matchingWorkSpecs.clear();
        this.matchingWorkSpecIds.clear();
        List<WorkSpec> list = this.matchingWorkSpecs;
        for (WorkSpec workSpec : workSpecs) {
            if (hasConstraint(workSpec)) {
                list.add(workSpec);
            }
        }
        List<WorkSpec> list2 = this.matchingWorkSpecs;
        List<String> list3 = this.matchingWorkSpecIds;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((WorkSpec) it.next()).id);
        }
        if (this.matchingWorkSpecs.isEmpty()) {
            this.tracker.removeListener(this);
        } else {
            this.tracker.addListener(this);
        }
        updateCallback(this.callback, this.currentValue);
    }

    public final void reset() {
        if (!this.matchingWorkSpecs.isEmpty()) {
            this.matchingWorkSpecs.clear();
            this.tracker.removeListener(this);
        }
    }

    public final void setCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.callback != onConstraintUpdatedCallback) {
            this.callback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.currentValue);
        }
    }
}
