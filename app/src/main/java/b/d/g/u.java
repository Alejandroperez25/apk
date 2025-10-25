package b.d.g;

import android.view.View;
import b.d.g.v;

/* loaded from: classes.dex */
class u extends v.b<Boolean> {
    u(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.d.g.v.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }
}
