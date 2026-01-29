package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes10.dex */
public class HInfo implements Serializable {

    @d
    private int et;

    @d(id = true)
    private String id;

    @d
    private String na;

    @d
    private int pa;

    @d(canBeNull = false)
    private String pk;

    @d(canBeNull = false)
    private String te;

    @d
    private long ti;

    public HInfo() {
    }

    public HInfo(String str, int i5, int i6, long j5, String str2, String str3, String str4) {
        this.id = str;
        this.et = i5;
        this.pa = i6;
        this.ti = j5;
        this.te = str2;
        this.pk = str3;
        this.na = str4;
    }

    public int getEt() {
        return this.et;
    }

    public String getId() {
        return this.id;
    }

    public String getNa() {
        return this.na;
    }

    public int getPa() {
        return this.pa;
    }

    public String getPk() {
        return this.pk;
    }

    public String getTe() {
        return this.te;
    }

    public long getTi() {
        return this.ti;
    }

    public void setEt(int i5) {
        this.et = i5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNa(String str) {
        this.na = str;
    }

    public void setPa(int i5) {
        this.pa = i5;
    }

    public void setPk(String str) {
        this.pk = str;
    }

    public void setTe(String str) {
        this.te = str;
    }

    public void setTi(long j5) {
        this.ti = j5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("HInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", et=");
        g5.append(this.et);
        g5.append(", pa=");
        g5.append(this.pa);
        g5.append(", ti=");
        g5.append(this.ti);
        g5.append(", te='");
        androidx.appcompat.widget.a.n(g5, this.te, '\'', ", pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", na='");
        g5.append(this.na);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
