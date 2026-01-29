package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes17.dex */
public class SysNews implements Serializable {

    @d(canBeNull = false)
    private String lang;

    @d(id = true)
    private String newsId;

    @d
    private long pubDate;

    @d(canBeNull = false)
    private String title;

    @d
    private int total;

    public String getLang() {
        return this.lang;
    }

    public String getNewsId() {
        return this.newsId;
    }

    public long getPubDate() {
        return this.pubDate;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotal() {
        return this.total;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setNewsId(String str) {
        this.newsId = str;
    }

    public void setPubDate(long j5) {
        this.pubDate = j5;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotal(int i5) {
        this.total = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("SysNews{newsId='");
        androidx.appcompat.widget.a.n(g5, this.newsId, '\'', ", lang='");
        androidx.appcompat.widget.a.n(g5, this.lang, '\'', ", title='");
        androidx.appcompat.widget.a.n(g5, this.title, '\'', ", pubDate=");
        g5.append(this.pubDate);
        g5.append(", total=");
        g5.append(this.total);
        g5.append('}');
        return g5.toString();
    }
}
