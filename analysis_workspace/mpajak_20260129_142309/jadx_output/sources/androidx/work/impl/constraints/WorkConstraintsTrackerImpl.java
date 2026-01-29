package androidx.work.impl.constraints;

import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerImpl implements WorkConstraintsTracker, ConstraintController.OnConstraintUpdatedCallback {
    private final WorkConstraintsCallback callback;
    private final ConstraintController<?>[] constraintControllers;
    private final Object lock;

    @VisibleForTesting
    public WorkConstraintsTrackerImpl(WorkConstraintsCallback workConstraintsCallback, ConstraintController<?>[] constraintControllers) {
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.callback = workConstraintsCallback;
        this.constraintControllers = constraintControllers;
        this.lock = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerImpl(Trackers trackers, WorkConstraintsCallback workConstraintsCallback) {
        this(workConstraintsCallback, (ConstraintController<?>[]) new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker())});
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }

    public final boolean areAllConstraintsMet(String workSpecId) {
        ConstraintController<?> constraintController;
        boolean z4;
        String str;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            ConstraintController<?>[] constraintControllerArr = this.constraintControllers;
            int length = constraintControllerArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    constraintController = null;
                    break;
                }
                constraintController = constraintControllerArr[i5];
                if (constraintController.isWorkSpecConstrained(workSpecId)) {
                    break;
                }
                i5++;
            }
            if (constraintController != null) {
                Logger logger = Logger.get();
                str = WorkConstraintsTrackerKt.TAG;
                logger.debug(str, "Work " + workSpecId + " constrained by " + constraintController.getClass().getSimpleName());
            }
            z4 = constraintController == null;
        }
        return z4;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(List<WorkSpec> workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            ArrayList<WorkSpec> arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (areAllConstraintsMet(((WorkSpec) obj).id)) {
                    arrayList.add(obj);
                }
            }
            for (WorkSpec workSpec : arrayList) {
                Logger logger = Logger.get();
                str = WorkConstraintsTrackerKt.TAG;
                logger.debug(str, "Constraints met for " + workSpec);
            }
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsMet(arrayList);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(List<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsNotMet(workSpecs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void replace(Iterable<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.setCallback(null);
            }
            for (ConstraintController<?> constraintController2 : this.constraintControllers) {
                constraintController2.replace(workSpecs);
            }
            for (ConstraintController<?> constraintController3 : this.constraintControllers) {
                constraintController3.setCallback(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void reset() {
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.reset();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
