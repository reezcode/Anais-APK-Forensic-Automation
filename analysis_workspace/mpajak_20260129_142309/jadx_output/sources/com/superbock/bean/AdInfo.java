package com.superbock.bean;

import d3.a;
import java.io.Serializable;
import v2.d;

@a
/* loaded from: classes5.dex */
public class AdInfo implements Serializable {
    private AdInfo aiLink;
    private long aiLinkDelayMillis;
    private AdInfo aiOtherLink;
    private long aiOtherLinkDelayMillis;

    @d
    private int align;

    @d
    private int autoClose;

    @d
    private int back;

    @d
    private String bgColor;

    @d
    private String cancel;

    @d
    private String cancelBgColor;

    @d
    private String cancelColor;

    @d
    private String confirm;

    @d
    private String confirmBgColor;

    @d
    private String confirmColor;
    private int customId;

    @d
    private int endHour;

    @d
    private int feedBack;

    @d
    private int gravity;

    @d
    private int height;

    @d
    private int hide;

    @d
    private String img;

    @d
    private String link;

    @d
    private String msg;

    @d
    private String msgColor;

    @d
    private String other;

    @d
    private String otherBgColor;

    @d
    private String otherColor;

    @d
    private String otherLink;
    private String pkg;
    private String preId;

    @d
    private String receiptId;

    @d
    private int showClose;

    @d
    private int startHour;

    @d
    private long startTime;

    @d
    private long stopTime;

    @d(id = true)
    private String taskId;

    @d
    private int template;

    @d(canBeNull = false)
    private String templateId;

    @d
    private String title;

    @d
    private String titleColor;

    @d
    private int topBar;

    @d
    private int type;

    @d
    private String url;
    private int use;

    @d
    private int width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.taskId.equals(((AdInfo) obj).taskId);
    }

    public AdInfo getAiLink() {
        return this.aiLink;
    }

    public long getAiLinkDelayMillis() {
        return this.aiLinkDelayMillis;
    }

    public AdInfo getAiOtherLink() {
        return this.aiOtherLink;
    }

    public long getAiOtherLinkDelayMillis() {
        return this.aiOtherLinkDelayMillis;
    }

    public int getAlign() {
        return this.align;
    }

    public int getAutoClose() {
        return this.autoClose;
    }

    public int getBack() {
        return this.back;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public String getCancel() {
        return this.cancel;
    }

    public String getCancelBgColor() {
        return this.cancelBgColor;
    }

    public String getCancelColor() {
        return this.cancelColor;
    }

    public String getConfirm() {
        return this.confirm;
    }

    public String getConfirmBgColor() {
        return this.confirmBgColor;
    }

    public String getConfirmColor() {
        return this.confirmColor;
    }

    public int getCustomId() {
        return this.customId;
    }

    public int getEndHour() {
        return this.endHour;
    }

    public int getFeedBack() {
        return this.feedBack;
    }

    public int getGravity() {
        return this.gravity;
    }

    public int getHeight() {
        return this.height;
    }

    public int getHide() {
        return this.hide;
    }

    public String getImg() {
        return this.img;
    }

    public String getLink() {
        return this.link;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsgColor() {
        return this.msgColor;
    }

    public String getOther() {
        return this.other;
    }

    public String getOtherBgColor() {
        return this.otherBgColor;
    }

    public String getOtherColor() {
        return this.otherColor;
    }

    public String getOtherLink() {
        return this.otherLink;
    }

    public String getPkg() {
        return this.pkg;
    }

    public String getPreId() {
        return this.preId;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public int getShowClose() {
        return this.showClose;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public int getTemplate() {
        return this.template;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleColor() {
        return this.titleColor;
    }

    public int getTopBar() {
        return this.topBar;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int getUse() {
        return this.use;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.taskId.hashCode();
    }

    public void setAiLink(AdInfo adInfo) {
        this.aiLink = adInfo;
    }

    public void setAiLinkDelayMillis(long j5) {
        this.aiLinkDelayMillis = j5;
    }

    public void setAiOtherLink(AdInfo adInfo) {
        this.aiOtherLink = adInfo;
    }

    public void setAiOtherLinkDelayMillis(long j5) {
        this.aiOtherLinkDelayMillis = j5;
    }

    public void setAlign(int i5) {
        this.align = i5;
    }

    public void setAutoClose(int i5) {
        this.autoClose = i5;
    }

    public void setBack(int i5) {
        this.back = i5;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setCancel(String str) {
        this.cancel = str;
    }

    public void setCancelBgColor(String str) {
        this.cancelBgColor = str;
    }

    public void setCancelColor(String str) {
        this.cancelColor = str;
    }

    public void setConfirm(String str) {
        this.confirm = str;
    }

    public void setConfirmBgColor(String str) {
        this.confirmBgColor = str;
    }

    public void setConfirmColor(String str) {
        this.confirmColor = str;
    }

    public void setCustomId(int i5) {
        this.customId = i5;
    }

    public void setEndHour(int i5) {
        this.endHour = i5;
    }

    public void setFeedBack(int i5) {
        this.feedBack = i5;
    }

    public void setGravity(int i5) {
        this.gravity = i5;
    }

    public void setHeight(int i5) {
        this.height = i5;
    }

    public void setHide(int i5) {
        this.hide = i5;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setMsgColor(String str) {
        this.msgColor = str;
    }

    public void setOther(String str) {
        this.other = str;
    }

    public void setOtherBgColor(String str) {
        this.otherBgColor = str;
    }

    public void setOtherColor(String str) {
        this.otherColor = str;
    }

    public void setOtherLink(String str) {
        this.otherLink = str;
    }

    public void setPkg(String str) {
        this.pkg = str;
    }

    public void setPreId(String str) {
        this.preId = str;
    }

    public void setReceiptId(String str) {
        this.receiptId = str;
    }

    public void setShowClose(int i5) {
        this.showClose = i5;
    }

    public void setStartHour(int i5) {
        this.startHour = i5;
    }

    public void setStartTime(long j5) {
        this.startTime = j5;
    }

    public void setStopTime(long j5) {
        this.stopTime = j5;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTemplate(int i5) {
        this.template = i5;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleColor(String str) {
        this.titleColor = str;
    }

    public void setTopBar(int i5) {
        this.topBar = i5;
    }

    public void setType(int i5) {
        this.type = i5;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUse(int i5) {
        this.use = i5;
    }

    public void setWidth(int i5) {
        this.width = i5;
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("AdInfo{taskId='");
        androidx.appcompat.widget.a.n(g5, this.taskId, '\'', ", templateId='");
        androidx.appcompat.widget.a.n(g5, this.templateId, '\'', ", hide=");
        g5.append(this.hide);
        g5.append(", startHour=");
        g5.append(this.startHour);
        g5.append(", endHour=");
        g5.append(this.endHour);
        g5.append(", type=");
        g5.append(this.type);
        g5.append(", startTime=");
        g5.append(this.startTime);
        g5.append(", stopTime=");
        g5.append(this.stopTime);
        g5.append(", feedBack=");
        g5.append(this.feedBack);
        g5.append(", receiptId='");
        androidx.appcompat.widget.a.n(g5, this.receiptId, '\'', ", url='");
        androidx.appcompat.widget.a.n(g5, this.url, '\'', ", template=");
        g5.append(this.template);
        g5.append(", img='");
        androidx.appcompat.widget.a.n(g5, this.img, '\'', ", title='");
        androidx.appcompat.widget.a.n(g5, this.title, '\'', ", titleColor='");
        androidx.appcompat.widget.a.n(g5, this.titleColor, '\'', ", msg='");
        androidx.appcompat.widget.a.n(g5, this.msg, '\'', ", msgColor='");
        androidx.appcompat.widget.a.n(g5, this.msgColor, '\'', ", link='");
        androidx.appcompat.widget.a.n(g5, this.link, '\'', ", bgColor='");
        androidx.appcompat.widget.a.n(g5, this.bgColor, '\'', ", autoClose=");
        g5.append(this.autoClose);
        g5.append(", showClose=");
        g5.append(this.showClose);
        g5.append(", width=");
        g5.append(this.width);
        g5.append(", height=");
        g5.append(this.height);
        g5.append(", gravity=");
        g5.append(this.gravity);
        g5.append(", topBar=");
        g5.append(this.topBar);
        g5.append(", back=");
        g5.append(this.back);
        g5.append(", align=");
        g5.append(this.align);
        g5.append(", confirm='");
        androidx.appcompat.widget.a.n(g5, this.confirm, '\'', ", confirmColor='");
        androidx.appcompat.widget.a.n(g5, this.confirmColor, '\'', ", confirmBgColor='");
        androidx.appcompat.widget.a.n(g5, this.confirmBgColor, '\'', ", cancel='");
        androidx.appcompat.widget.a.n(g5, this.cancel, '\'', ", cancelColor='");
        androidx.appcompat.widget.a.n(g5, this.cancelColor, '\'', ", cancelBgColor='");
        androidx.appcompat.widget.a.n(g5, this.cancelBgColor, '\'', ", other='");
        androidx.appcompat.widget.a.n(g5, this.other, '\'', ", otherColor='");
        androidx.appcompat.widget.a.n(g5, this.otherColor, '\'', ", otherBgColor='");
        androidx.appcompat.widget.a.n(g5, this.otherBgColor, '\'', ", otherLink='");
        androidx.appcompat.widget.a.n(g5, this.otherLink, '\'', ", customId=");
        g5.append(this.customId);
        g5.append(", pkg='");
        androidx.appcompat.widget.a.n(g5, this.pkg, '\'', ", use=");
        g5.append(this.use);
        g5.append(", preId='");
        g5.append(this.preId);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
