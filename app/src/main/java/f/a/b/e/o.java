package f.a.b.e;

import android.content.Context;
import android.view.View;
import f.a.a.a.r;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends io.flutter.plugin.platform.h {

    /* renamed from: b, reason: collision with root package name */
    private final f.a.a.a.e f5847b;

    /* renamed from: c, reason: collision with root package name */
    private final View f5848c;

    o(f.a.a.a.e eVar, View view) {
        super(r.f5674a);
        this.f5847b = eVar;
        this.f5848c = view;
    }

    @Override // io.flutter.plugin.platform.h
    public io.flutter.plugin.platform.g a(Context context, int i2, Object obj) {
        return new f(context, this.f5847b, i2, (Map) obj, this.f5848c);
    }
}
