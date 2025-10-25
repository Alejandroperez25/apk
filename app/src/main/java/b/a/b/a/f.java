package b.a.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import b.a.b.a.d;

/* loaded from: classes.dex */
abstract class f extends d {
    private a n;
    private boolean o;

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);

    int[] a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i4 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i4;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.o && super.mutate() == this) {
            this.n.d();
            this.o = true;
        }
        return this;
    }

    static class a extends d.b {
        int[][] J;

        a(a aVar, f fVar, Resources resources) {
            super(aVar, fVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[b()][];
            }
        }

        int a(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }

        int a(int[] iArr) {
            int[][] iArr2 = this.J;
            int iC = c();
            for (int i2 = 0; i2 < iC; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // b.a.b.a.d.b
        public void b(int i2, int i3) {
            super.b(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.J, 0, iArr, 0, i2);
            this.J = iArr;
        }
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // b.a.b.a.d
    protected void a(d.b bVar) {
        super.a(bVar);
        if (bVar instanceof a) {
            this.n = (a) bVar;
        }
    }

    f(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }
}
