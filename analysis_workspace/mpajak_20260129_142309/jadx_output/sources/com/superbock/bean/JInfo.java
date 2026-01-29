package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes13.dex */
public class JInfo implements Serializable {

    @d(id = true)
    private String id;

    @d
    private String na;

    @d(canBeNull = false)
    private String pk;

    @d(canBeNull = false)
    private String pw;

    @d
    private String pw2;

    @d
    private long ti;

    @d
    private int ty;

    public JInfo() {
    }

    public JInfo(String str, long j5, String str2, int i5, String str3, String str4) {
        this.id = str;
        this.ti = j5;
        this.pk = str2;
        this.ty = i5;
        this.pw = str3;
        this.na = str4;
    }

    public JInfo(String str, long j5, String str2, int i5, String str3, String str4, String str5) {
        this(str, j5, str2, i5, str3, str5);
        this.pw2 = str4;
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

    public String getPw() {
        return this.pw;
    }

    public String getPw2() {
        return this.pw2;
    }

    public long getTi() {
        return this.ti;
    }

    public int getTy() {
        return this.ty;
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

    public void setPw(String str) {
        this.pw = str;
    }

    public void setPw2(String str) {
        this.pw2 = str;
    }

    public void setTi(long j5) {
        this.ti = j5;
    }

    public void setTy(int i5) {
        this.ty = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("JInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ti=");
        g5.append(this.ti);
        g5.append(", pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", ty=");
        g5.append(this.ty);
        g5.append(", pw='");
        androidx.appcompat.widget.a.n(g5, this.pw, '\'', ", pw2='");
        androidx.appcompat.widget.a.n(g5, this.pw2, '\'', ", na='");
        g5.append(this.na);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
