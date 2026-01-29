package marmojkfnf.pypwog.devnsrel.jaxdchgv;

import android.content.Context;
import android.content.Intent;
import com.tencent.smtt.sdk.TbsListener;
import fmfjq.twyvy.xjhbp;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Hbkffen;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Jehtxjp;
import marmojkfnf.mnhosc.cswoel.wvfxxn.Turjlocq;

@Turjlocq
/* loaded from: classes23.dex */
public final class Qprpknw {
    public static final Qprpknw INSTANCE;

    static {
        xjhbp.classescxclcy(TbsListener.ErrorCode.RENAME_NO_NEED_SENDREQUEST);
        INSTANCE = new Qprpknw();
    }

    private Qprpknw() {
    }

    public static final native void iilliilili(Context context, Intent intent, String str, boolean z4, boolean z5, Jehtxjp jehtxjp, Hbkffen hbkffen);

    public static /* synthetic */ void iilliilili$default(Context context, Intent intent, String str, boolean z4, boolean z5, Jehtxjp jehtxjp, Hbkffen hbkffen, int i5, Object obj) {
        if ((i5 & 64) != 0) {
            hbkffen = null;
        }
        iilliilili(context, intent, str, z4, z5, jehtxjp, hbkffen);
    }
}
