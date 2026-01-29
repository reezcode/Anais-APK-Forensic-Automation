package com.qywl.znkj;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/* loaded from: classes.dex */
public class MainActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968576);
        TextView textView = (TextView) findViewById(2130903040);
        StringBuilder sb = new StringBuilder();
        sb.append("dpt-shell seem not working.\nApplication: ");
        sb.append(getApplication().getClass().getName());
        textView.setText(sb);
    }
}
