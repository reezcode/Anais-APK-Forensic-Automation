package org.apache.commons.io.file;

import org.apache.commons.io.IOUtils;

/* loaded from: classes8.dex */
public enum StandardDeleteOption implements DeleteOption {
    OVERRIDE_READ_ONLY;

    public static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (IOUtils.length(deleteOptionArr) == 0) {
            return false;
        }
        for (DeleteOption deleteOption : deleteOptionArr) {
            if (deleteOption == OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }
}
