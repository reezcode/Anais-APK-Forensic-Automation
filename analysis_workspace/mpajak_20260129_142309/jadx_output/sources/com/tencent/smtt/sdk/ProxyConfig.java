package com.tencent.smtt.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes18.dex */
public final class ProxyConfig {
    public static final String MATCH_ALL_SCHEMES = "*";

    /* renamed from: a, reason: collision with root package name */
    private List<ProxyRule> f1801a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f1802b;

    /* loaded from: classes7.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private List<ProxyRule> f1803a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f1804b;

        public Builder() {
            this.f1803a = new ArrayList();
            this.f1804b = new ArrayList();
        }

        public Builder(ProxyConfig proxyConfig) {
            this.f1803a = proxyConfig.getProxyRules();
            this.f1804b = proxyConfig.getBypassRules();
        }

        private List<ProxyRule> a() {
            return this.f1803a;
        }

        private List<String> b() {
            return this.f1804b;
        }

        public Builder addBypassRule(String str) {
            this.f1804b.add(str);
            return this;
        }

        public Builder addDirect() {
            return addDirect(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        public Builder addDirect(String str) {
            this.f1803a.add(new ProxyRule(str, "direct://"));
            return this;
        }

        public Builder addProxyRule(String str) {
            this.f1803a.add(new ProxyRule(str));
            return this;
        }

        public Builder addProxyRule(String str, String str2) {
            this.f1803a.add(new ProxyRule(str2, str));
            return this;
        }

        public ProxyConfig build() {
            return new ProxyConfig(a(), b());
        }

        public Builder bypassSimpleHostnames() {
            return addBypassRule("<local>");
        }

        public Builder removeImplicitRules() {
            return addBypassRule("<-loopback>");
        }
    }

    /* loaded from: classes4.dex */
    public static final class ProxyRule {

        /* renamed from: a, reason: collision with root package name */
        private String f1805a;

        /* renamed from: b, reason: collision with root package name */
        private String f1806b;

        public ProxyRule(String str) {
            this(ProxyConfig.MATCH_ALL_SCHEMES, str);
        }

        public ProxyRule(String str, String str2) {
            this.f1805a = str;
            this.f1806b = str2;
        }

        public String getSchemeFilter() {
            return this.f1805a;
        }

        public String getUrl() {
            return this.f1806b;
        }
    }

    public ProxyConfig(List<ProxyRule> list, List<String> list2) {
        this.f1801a = list;
        this.f1802b = list2;
    }

    public List<String> getBypassRules() {
        return Collections.unmodifiableList(this.f1802b);
    }

    public List<ProxyRule> getProxyRules() {
        return Collections.unmodifiableList(this.f1801a);
    }
}
