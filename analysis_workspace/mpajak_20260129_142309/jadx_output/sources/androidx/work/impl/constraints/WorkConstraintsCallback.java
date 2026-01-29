package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* loaded from: classes13.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List<WorkSpec> list);

    void onAllConstraintsNotMet(List<WorkSpec> list);
}
