package c.d.a.a.j.h;

import android.text.SpannableStringBuilder;
import c.d.a.a.m.AbstractC0170e;
import c.d.a.a.m.H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class j implements c.d.a.a.j.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<f> f3268a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3269b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f3270c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f3271d;

    public j(List<f> list) {
        this.f3268a = list;
        this.f3269b = list.size();
        this.f3270c = new long[this.f3269b * 2];
        for (int i2 = 0; i2 < this.f3269b; i2++) {
            f fVar = list.get(i2);
            int i3 = i2 * 2;
            this.f3270c[i3] = fVar.o;
            this.f3270c[i3 + 1] = fVar.p;
        }
        this.f3271d = Arrays.copyOf(this.f3270c, this.f3270c.length);
        Arrays.sort(this.f3271d);
    }

    @Override // c.d.a.a.j.d
    public int a(long j) {
        int iB = H.b(this.f3271d, j, false, false);
        if (iB < this.f3271d.length) {
            return iB;
        }
        return -1;
    }

    @Override // c.d.a.a.j.d
    public int a() {
        return this.f3271d.length;
    }

    @Override // c.d.a.a.j.d
    public long a(int i2) {
        AbstractC0170e.a(i2 >= 0);
        AbstractC0170e.a(i2 < this.f3271d.length);
        return this.f3271d[i2];
    }

    @Override // c.d.a.a.j.d
    public List<c.d.a.a.j.a> b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        f fVar = null;
        for (int i2 = 0; i2 < this.f3269b; i2++) {
            int i3 = i2 * 2;
            if (this.f3270c[i3] <= j && j < this.f3270c[i3 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                f fVar2 = this.f3268a.get(i2);
                if (!fVar2.a()) {
                    arrayList.add(fVar2);
                } else if (fVar == null) {
                    fVar = fVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(fVar.f3075a).append((CharSequence) "\n").append(fVar2.f3075a);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append(fVar2.f3075a);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new f(spannableStringBuilder));
        } else if (fVar != null) {
            arrayList.add(fVar);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }
}
