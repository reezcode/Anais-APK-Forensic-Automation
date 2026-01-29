package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes18.dex */
public class KInfo implements Serializable {

    @d(id = true)
    private String id;

    @d(canBeNull = false)
    private String js;

    @d
    private String na;

    @d(canBeNull = false)
    private String pk;

    @d
    private long ti;

    @d
    private int ty;

    @d
    private int up;

    public KInfo() {
    }

    public KInfo(String str, int i5, String str2, String str3, String str4) {
        this.id = str;
        this.ty = i5;
        this.js = str2;
        this.pk = str3;
        this.na = str4;
        this.ti = System.currentTimeMillis();
    }

    public String getId() {
        return this.id;
    }

    public String getJs() {
        return this.js;
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

    public int getTy() {
        return this.ty;
    }

    public int getUp() {
        return this.up;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setJs(String str) {
        this.js = str;
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

    public void setTy(int i5) {
        this.ty = i5;
    }

    public void setUp(int i5) {
        this.up = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("KInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ty=");
        g5.append(this.ty);
        g5.append(", ti=");
        g5.append(this.ti);
        g5.append(", js='");
        androidx.appcompat.widget.a.n(g5, this.js, '\'', ", pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", na='");
        g5.append(this.na);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
