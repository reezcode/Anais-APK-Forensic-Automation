package s0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes7.dex */
public abstract class b implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        try {
            f fVar = (f) this;
            Intent intent = fVar.f5123b;
            if (intent != null) {
                fVar.f5124c.startActivityForResult(intent, fVar.f5125d);
            }
        } catch (ActivityNotFoundException e5) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e5);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
