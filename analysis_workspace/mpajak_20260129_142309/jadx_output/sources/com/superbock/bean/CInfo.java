package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes16.dex */
public class CInfo implements Serializable {

    @d(canBeNull = false)
    private String ad;

    @d(canBeNull = false)
    private String bo;

    @d
    private long da;

    @d(id = true)
    private String id;

    @d
    private int up;

    public String getAd() {
        return this.ad;
    }

    public String getBo() {
        return this.bo;
    }

    public long getDa() {
        return this.da;
    }

    public String getId() {
        return this.id;
    }

    public int getUp() {
        return this.up;
    }

    public void setAd(String str) {
        this.ad = str;
    }

    public void setBo(String str) {
        this.bo = str;
    }

    public void setDa(long j5) {
        this.da = j5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setUp(int i5) {
        this.up = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("CInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ad='");
        androidx.appcompat.widget.a.n(g5, this.ad, '\'', ", bo='");
        androidx.appcompat.widget.a.n(g5, this.bo, '\'', ", da=");
        g5.append(this.da);
        g5.append(", up=");
        g5.append(this.up);
        g5.append('}');
        return g5.toString();
    }
}
