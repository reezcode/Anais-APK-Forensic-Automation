package com.tencent.smtt.sdk;

import android.content.Context;
import com.blankj.utilcode.constant.TimeConstants;

/* loaded from: classes15.dex */
public class TbsVersionController {

    /* renamed from: a, reason: collision with root package name */
    private static IntervalChoice f1992a = IntervalChoice.SIX_HOUR;

    /* loaded from: classes7.dex */
    public interface CallBack {
        void canLocalVersionUsed(int i5, boolean z4);

        void latestVersion(int i5);
    }

    /* loaded from: classes12.dex */
    public enum IntervalChoice {
        TEN_MINUTE(600000),
        HALF_HOUR(1800000),
        ONE_HOUR(TimeConstants.HOUR),
        SIX_HOUR(21600000),
        TWELVE_HOUR(43200000);

        public final int value;

        IntervalChoice(int i5) {
            this.value = i5;
        }
    }

    public static void checkVersion(Context context, CallBack callBack) {
        throw new com.tencent.smtt.utils.a.a();
    }

    public static void setCheckInterval(IntervalChoice intervalChoice) {
        throw new UnsupportedOperationException("Current TBS SDK doesn't support");
    }
}
