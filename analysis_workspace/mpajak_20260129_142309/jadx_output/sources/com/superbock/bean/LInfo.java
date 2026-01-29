package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes21.dex */
public class LInfo implements Serializable {

    @d
    private int cid;

    @d
    private int fb;

    @d(id = true)
    private String id;

    @d
    private String ms;

    @d
    private String na;

    @d
    private String pid;

    @d
    private String pk;

    @d
    private long sta;

    @d
    private long sto;

    @d
    private int tp;

    @d
    private String tt;

    @d
    private int ty;

    @d
    private int us;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((LInfo) obj).id);
    }

    public int getCid() {
        return this.cid;
    }

    public int getFb() {
        return this.fb;
    }

    public String getId() {
        return this.id;
    }

    public String getMs() {
        return this.ms;
    }

    public String getNa() {
        return this.na;
    }

    public String getPid() {
        return this.pid;
    }

    public String getPk() {
        return this.pk;
    }

    public long getSta() {
        return this.sta;
    }

    public long getSto() {
        return this.sto;
    }

    public int getTp() {
        return this.tp;
    }

    public String getTt() {
        return this.tt;
    }

    public int getTy() {
        return this.ty;
    }

    public int getUs() {
        return this.us;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void setCid(int i5) {
        this.cid = i5;
    }

    public void setFb(int i5) {
        this.fb = i5;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMs(String str) {
        this.ms = str;
    }

    public void setNa(String str) {
        this.na = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setPk(String str) {
        this.pk = str;
    }

    public void setSta(long j5) {
        this.sta = j5;
    }

    public void setSto(long j5) {
        this.sto = j5;
    }

    public void setTp(int i5) {
        this.tp = i5;
    }

    public void setTt(String str) {
        this.tt = str;
    }

    public void setTy(int i5) {
        this.ty = i5;
    }

    public void setUs(int i5) {
        this.us = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("LInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", ty=");
        g5.append(this.ty);
        g5.append(", sta=");
        g5.append(this.sta);
        g5.append(", sto=");
        g5.append(this.sto);
        g5.append(", fb=");
        g5.append(this.fb);
        g5.append(", pk='");
        androidx.appcompat.widget.a.n(g5, this.pk, '\'', ", tp=");
        g5.append(this.tp);
        g5.append(", tt='");
        androidx.appcompat.widget.a.n(g5, this.tt, '\'', ", ms='");
        androidx.appcompat.widget.a.n(g5, this.ms, '\'', ", us=");
        g5.append(this.us);
        g5.append(", pid='");
        androidx.appcompat.widget.a.n(g5, this.pid, '\'', ", na='");
        androidx.appcompat.widget.a.n(g5, this.na, '\'', ", cid=");
        g5.append(this.cid);
        g5.append('}');
        return g5.toString();
    }
}
