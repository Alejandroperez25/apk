package c.d.a.a.j.a;

import android.text.Layout;

/* loaded from: classes.dex */
final class b extends c.d.a.a.j.a implements Comparable<b> {
    public final int o;

    public b(CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z, int i5, int i6) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4, z, i5);
        this.o = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        if (bVar.o < this.o) {
            return -1;
        }
        return bVar.o > this.o ? 1 : 0;
    }
}
