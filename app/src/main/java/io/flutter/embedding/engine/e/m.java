package io.flutter.embedding.engine.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.d<Object> f6094a;

    public m(io.flutter.embedding.engine.a.b bVar) {
        this.f6094a = new f.a.a.a.d<>(bVar, "flutter/settings", f.a.a.a.i.f5661a);
    }

    public a a() {
        return new a(this.f6094a);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final f.a.a.a.d<Object> f6095a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, Object> f6096b = new HashMap();

        a(f.a.a.a.d<Object> dVar) {
            this.f6095a = dVar;
        }

        public a a(float f2) {
            this.f6096b.put("textScaleFactor", Float.valueOf(f2));
            return this;
        }

        public a a(boolean z) {
            this.f6096b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }

        public a a(b bVar) {
            this.f6096b.put("platformBrightness", bVar.f6100d);
            return this;
        }

        public void a() {
            f.a.a.a("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f6096b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f6096b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f6096b.get("platformBrightness"));
            this.f6095a.a((f.a.a.a.d<Object>) this.f6096b);
        }
    }

    public enum b {
        light("light"),
        dark("dark");


        /* renamed from: d, reason: collision with root package name */
        public String f6100d;

        b(String str) {
            this.f6100d = str;
        }
    }
}
