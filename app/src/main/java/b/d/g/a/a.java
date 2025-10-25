package b.d.g.a;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f1120a;

    /* renamed from: b, reason: collision with root package name */
    private final b f1121b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1122c;

    public a(int i2, b bVar, int i3) {
        this.f1120a = i2;
        this.f1121b = bVar;
        this.f1122c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1120a);
        this.f1121b.a(this.f1122c, bundle);
    }
}
