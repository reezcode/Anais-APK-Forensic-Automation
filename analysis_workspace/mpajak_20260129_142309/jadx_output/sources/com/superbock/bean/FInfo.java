package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes20.dex */
public class FInfo implements Serializable {

    @d
    private int ac;

    @d(id = true)
    private String id;

    @d
    private long ti;

    public int getAc() {
        return this.ac;
    }

    public String getId() {
        return this.id;
    }

    public long getTi() {
        return this.ti;
    }

    public void setAc(int i5) {
        this.ac = i5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTi(long j5) {
        this.ti = j5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("FInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ac=");
        g5.append(this.ac);
        g5.append(", ti=");
        g5.append(this.ti);
        g5.append('}');
        return g5.toString();
    }
}
