package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes22.dex */
public class DInfo implements Serializable {

    @d
    private long da;

    @d
    private long du;

    @d(id = true)
    private String id;

    @d
    private String na;

    @d(canBeNull = false)
    private String nu;

    @d
    private int ty;

    @d
    private int up;

    public long getDa() {
        return this.da;
    }

    public long getDu() {
        return this.du;
    }

    public String getId() {
        return this.id;
    }

    public String getNa() {
        return this.na;
    }

    public String getNu() {
        return this.nu;
    }

    public int getTy() {
        return this.ty;
    }

    public int getUp() {
        return this.up;
    }

    public void setDa(long j5) {
        this.da = j5;
    }

    public void setDu(long j5) {
        this.du = j5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNa(String str) {
        this.na = str;
    }

    public void setNu(String str) {
        this.nu = str;
    }

    public void setTy(int i5) {
        this.ty = i5;
    }

    public void setUp(int i5) {
        this.up = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("DInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", nu='");
        androidx.appcompat.widget.a.n(g5, this.nu, '\'', ", na='");
        androidx.appcompat.widget.a.n(g5, this.na, '\'', ", da=");
        g5.append(this.da);
        g5.append(", du=");
        g5.append(this.du);
        g5.append(", ty=");
        g5.append(this.ty);
        g5.append(", up=");
        g5.append(this.up);
        g5.append('}');
        return g5.toString();
    }
}
