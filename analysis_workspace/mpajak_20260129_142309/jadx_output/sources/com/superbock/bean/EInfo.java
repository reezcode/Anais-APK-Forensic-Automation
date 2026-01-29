package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes8.dex */
public class EInfo implements Serializable {

    @d
    private int co;

    @d
    private long da;

    @d(id = true)
    private String id;
    private String me;

    @d
    private long mo;

    @d(canBeNull = false)
    private String na;

    @d(canBeNull = false)
    private String pa;

    @d
    private int sc;
    private String te;
    private String th;

    @d
    private int up;

    @d
    private int up2;

    public int getCo() {
        return this.co;
    }

    public long getDa() {
        return this.da;
    }

    public String getId() {
        return this.id;
    }

    public String getMe() {
        return this.me;
    }

    public long getMo() {
        return this.mo;
    }

    public String getNa() {
        return this.na;
    }

    public String getPa() {
        return this.pa;
    }

    public int getSc() {
        return this.sc;
    }

    public String getTe() {
        return this.te;
    }

    public String getTh() {
        return this.th;
    }

    public int getUp() {
        return this.up;
    }

    public int getUp2() {
        return this.up2;
    }

    public void setCo(int i5) {
        this.co = i5;
    }

    public void setDa(long j5) {
        this.da = j5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMe(String str) {
        this.me = str;
    }

    public void setMo(long j5) {
        this.mo = j5;
    }

    public void setNa(String str) {
        this.na = str;
    }

    public void setPa(String str) {
        this.pa = str;
    }

    public void setSc(int i5) {
        this.sc = i5;
    }

    public void setTe(String str) {
        this.te = str;
    }

    public void setTh(String str) {
        this.th = str;
    }

    public void setUp(int i5) {
        this.up = i5;
    }

    public void setUp2(int i5) {
        this.up2 = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("EInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", na='");
        androidx.appcompat.widget.a.n(g5, this.na, '\'', ", pa='");
        androidx.appcompat.widget.a.n(g5, this.pa, '\'', ", mo=");
        g5.append(this.mo);
        g5.append(", sc=");
        g5.append(this.sc);
        g5.append(", co=");
        g5.append(this.co);
        g5.append(", up=");
        g5.append(this.up);
        g5.append(", da=");
        g5.append(this.da);
        g5.append(", te='");
        androidx.appcompat.widget.a.n(g5, this.te, '\'', ", up2=");
        g5.append(this.up2);
        g5.append(", me='");
        androidx.appcompat.widget.a.n(g5, this.me, '\'', ", th='");
        g5.append(this.th);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
