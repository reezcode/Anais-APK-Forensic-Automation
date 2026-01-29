package com.blankj.utilcode.util;

import androidx.activity.d;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.Utils;
import java.util.List;

/* loaded from: classes24.dex */
public final class ShellUtils {
    private static final String LINE_SEP = System.getProperty("line.separator");

    /* loaded from: classes17.dex */
    public static class CommandResult {
        public String errorMsg;
        public int result;
        public String successMsg;

        public CommandResult(int i5, String str, String str2) {
            this.result = i5;
            this.successMsg = str;
            this.errorMsg = str2;
        }

        public String toString() {
            StringBuilder g5 = d.g("result: ");
            g5.append(this.result);
            g5.append("\nsuccessMsg: ");
            g5.append(this.successMsg);
            g5.append("\nerrorMsg: ");
            g5.append(this.errorMsg);
            return g5.toString();
        }
    }

    private ShellUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static CommandResult execCmd(String str, List<String> list, boolean z4) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z4, true);
    }

    public static CommandResult execCmd(String str, List<String> list, boolean z4, boolean z5) {
        return execCmd(new String[]{str}, list == null ? null : (String[]) list.toArray(new String[0]), z4, z5);
    }

    public static CommandResult execCmd(String str, boolean z4) {
        return execCmd(new String[]{str}, z4, true);
    }

    public static CommandResult execCmd(String str, boolean z4, boolean z5) {
        return execCmd(new String[]{str}, z4, z5);
    }

    public static CommandResult execCmd(String str, String[] strArr, boolean z4, boolean z5) {
        return execCmd(new String[]{str}, strArr, z4, z5);
    }

    public static CommandResult execCmd(List<String> list, List<String> list2, boolean z4) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), list2 != null ? (String[]) list2.toArray(new String[0]) : null, z4, true);
    }

    public static CommandResult execCmd(List<String> list, boolean z4) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z4, true);
    }

    public static CommandResult execCmd(List<String> list, boolean z4, boolean z5) {
        return execCmd(list == null ? null : (String[]) list.toArray(new String[0]), z4, z5);
    }

    public static CommandResult execCmd(String[] strArr, boolean z4) {
        return execCmd(strArr, z4, true);
    }

    public static CommandResult execCmd(String[] strArr, boolean z4, boolean z5) {
        return execCmd(strArr, (String[]) null, z4, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.blankj.utilcode.util.ShellUtils.CommandResult execCmd(java.lang.String[] r8, java.lang.String[] r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ShellUtils.execCmd(java.lang.String[], java.lang.String[], boolean, boolean):com.blankj.utilcode.util.ShellUtils$CommandResult");
    }

    public static Utils.Task<CommandResult> execCmdAsync(String str, boolean z4, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(new String[]{str}, z4, true, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(String str, boolean z4, boolean z5, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(new String[]{str}, z4, z5, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(List<String> list, boolean z4, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z4, true, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(List<String> list, boolean z4, boolean z5, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(list == null ? null : (String[]) list.toArray(new String[0]), z4, z5, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(String[] strArr, boolean z4, Utils.Consumer<CommandResult> consumer) {
        return execCmdAsync(strArr, z4, true, consumer);
    }

    public static Utils.Task<CommandResult> execCmdAsync(final String[] strArr, final boolean z4, final boolean z5, @NonNull Utils.Consumer<CommandResult> consumer) {
        return UtilsBridge.doAsync(new Utils.Task<CommandResult>(consumer) { // from class: com.blankj.utilcode.util.ShellUtils.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public CommandResult doInBackground() {
                return ShellUtils.execCmd(strArr, z4, z5);
            }
        });
    }
}
