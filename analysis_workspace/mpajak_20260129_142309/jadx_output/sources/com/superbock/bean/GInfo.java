package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes5.dex */
public class GInfo implements Serializable {

    @d(id = true)
    private String id;

    @d(canBeNull = false)
    private String js;

    @d(canBeNull = false)
    private String pk;

    @d
    private int st;

    @d
    private long ti;

    public GInfo() {
    }

    public GInfo(String str, int i5, String str2, String str3) {
        this.id = str;
        this.st = i5;
        this.js = str2;
        this.pk = str3;
        this.ti = System.currentTimeMillis();
    }

    public String getId() {
        return this.id;
    }

    public String getJs() {
        return this.js;
    }

    public String getPk() {
        return this.pk;
    }

    public int getSt() {
        return this.st;
    }

    public long getTi() {
        return this.ti;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setJs(String str) {
        this.js = str;
    }

    public void setPk(String str) {
        this.pk = str;
    }

    public void setSt(int i5) {
        this.st = i5;
    }

    public void setTi(long j5) {
        this.ti = j5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("GInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", st=");
        g5.append(this.st);
        g5.append(", ti=");
        g5.append(this.ti);
        g5.append(", js='");
        androidx.appcompat.widget.a.n(g5, this.js, '\'', ", pk='");
        g5.append(this.pk);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
