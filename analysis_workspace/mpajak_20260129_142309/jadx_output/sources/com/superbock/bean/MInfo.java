package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes19.dex */
public class MInfo implements Serializable {

    @d(id = true)
    private String id;

    @d
    private int idx;

    public MInfo() {
    }

    public MInfo(String str, int i5) {
        this.id = str;
        this.idx = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((MInfo) obj).id);
    }

    public String getId() {
        return this.id;
    }

    public int getIdx() {
        return this.idx;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIdx(int i5) {
        this.idx = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("MInfo{id='");
        androidx.appcompat.widget.a.n(g5, this.id, '\'', ", idx=");
        g5.append(this.idx);
        g5.append('}');
        return g5.toString();
    }
}
