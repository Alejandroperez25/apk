package io.flutter.embedding.engine.e;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final f.a.a.a.o f6028a;

    public e(io.flutter.embedding.engine.a.b bVar) {
        this.f6028a = new f.a.a.a.o(bVar, "flutter/localization", f.a.a.a.j.f5662a);
    }

    public void a(List<Locale> list) {
        f.a.a.a("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            f.a.a.a("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "");
            arrayList.add(locale.getVariant());
        }
        this.f6028a.a("setLocale", arrayList);
    }
}
