package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes7.dex */
public class IInfo implements Serializable {

    @d(id = true)
    private String id;

    @d
    private String na;

    @d(canBeNull = false)
    private String pk;

    @d
    private long ti;

    public IInfo() {
    }

    public IInfo(String str, long j5, String str2, String str3) {
        this.id = str;
        this.ti = j5;
        this.pk = str2;
        this.na = str3;
    }

    public String getId() {
        return this.id;
    }

    public String getNa() {
        return this.na;
    }

    public String getPk() {
        return this.pk;
    }

    public long getTi() {
        return this.ti;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNa(String str) {
        this.na = str;
    }

    public void setPk(String str) {
        this.pk = str;
    }

    public void setTi(long j5) {
        this.ti = j5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("IInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ti=");
        g5.append(this.ti);
        g5.append(", pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", na='");
        g5.append(this.na);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
