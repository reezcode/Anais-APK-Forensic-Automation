package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes2.dex */
public class AInfo implements Serializable {

    @d
    private int co;

    @d
    private String na;

    @d
    private int ni;

    @d(id = true)
    private String pk;

    @d
    private String th;

    @d
    private int ty;

    @d
    private int up;

    @d
    private int up2;

    public int getCo() {
        return this.co;
    }

    public String getNa() {
        return this.na;
    }

    public int getNi() {
        return this.ni;
    }

    public String getPk() {
        return this.pk;
    }

    public String getTh() {
        return this.th;
    }

    public int getTy() {
        return this.ty;
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

    public void setNa(String str) {
        this.na = str;
    }

    public void setNi(int i5) {
        this.ni = i5;
    }

    public void setPk(String str) {
        this.pk = str;
    }

    public void setTh(String str) {
        this.th = str;
    }

    public void setTy(int i5) {
        this.ty = i5;
    }

    public void setUp(int i5) {
        this.up = i5;
    }

    public void setUp2(int i5) {
        this.up2 = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("AInfo{pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", na='");
        androidx.appcompat.widget.a.n(g5, this.na, '\'', ", ty=");
        g5.append(this.ty);
        g5.append(", up=");
        g5.append(this.up);
        g5.append(", ni=");
        g5.append(this.ni);
        g5.append(", th='");
        androidx.appcompat.widget.a.n(g5, this.th, '\'', ", up2=");
        g5.append(this.up2);
        g5.append(", co=");
        g5.append(this.co);
        g5.append('}');
        return g5.toString();
    }
}
