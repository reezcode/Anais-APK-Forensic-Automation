package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes10.dex */
public class BInfo implements Serializable {

    @d
    private String em;

    @d(id = true)
    private String id;

    @d
    private String na;

    @d(canBeNull = false)
    private String nu;

    @d
    private int up;

    public String getEm() {
        return this.em;
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

    public int getUp() {
        return this.up;
    }

    public void setEm(String str) {
        this.em = str;
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

    public void setUp(int i5) {
        this.up = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("BInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", na='");
        androidx.appcompat.widget.a.n(g5, this.na, '\'', ", nu='");
        androidx.appcompat.widget.a.n(g5, this.nu, '\'', ", em='");
        androidx.appcompat.widget.a.n(g5, this.em, '\'', ", up=");
        g5.append(this.up);
        g5.append('}');
        return g5.toString();
    }
}
