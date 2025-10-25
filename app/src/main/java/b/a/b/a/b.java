package b.a.b.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.core.content.a.i;
import b.a.a$i;
import b.a.b.a.d;
import b.a.b.a.f;
import b.c.j;
import b.k.a.a.k;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b extends b.a.b.a.f {
    private C0012b p;
    private f q;
    private int r;
    private int s;
    private boolean t;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.a.b.a.f, b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public b() {
        this(null, null);
    }

    b(C0012b c0012b, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        a(new C0012b(c0012b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        b bVar = new b();
        bVar.b(context, resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    public void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayA = i.a(resources, theme, attributeSet, a$i.AnimatedStateListDrawableCompat);
        setVisible(typedArrayA.getBoolean(a$i.AnimatedStateListDrawableCompat_android_visible, true), true);
        a(typedArrayA);
        a(resources);
        typedArrayA.recycle();
        c(context, resources, xmlPullParser, attributeSet, theme);
        d();
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // b.a.b.a.d, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.q != null) {
            this.q.b();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // b.a.b.a.f, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iB = this.p.b(iArr);
        boolean z = iB != a() && (b(iB) || a(iB));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    private boolean b(int i2) {
        int iA;
        int iC;
        f aVar;
        f fVar = this.q;
        if (fVar != null) {
            if (i2 == this.r) {
                return true;
            }
            if (i2 == this.s && fVar.d()) {
                fVar.c();
                this.r = this.s;
                this.s = i2;
                return true;
            }
            iA = this.r;
            fVar.b();
        } else {
            iA = a();
        }
        this.q = null;
        this.s = -1;
        this.r = -1;
        C0012b c0012b = this.p;
        int iD = c0012b.d(iA);
        int iD2 = c0012b.d(i2);
        if (iD2 == 0 || iD == 0 || (iC = c0012b.c(iD, iD2)) < 0) {
            return false;
        }
        boolean zE = c0012b.e(iD, iD2);
        a(iC);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            aVar = new d((AnimationDrawable) current, c0012b.d(iD, iD2), zE);
        } else if (current instanceof b.k.a.a.d) {
            aVar = new c((b.k.a.a.d) current);
        } else {
            if (!(current instanceof Animatable)) {
                return false;
            }
            aVar = new a((Animatable) current);
        }
        aVar.a();
        this.q = aVar;
        this.s = iA;
        this.r = i2;
        return true;
    }

    private static abstract class f {
        public abstract void a();

        public abstract void b();

        public void c() {
        }

        public boolean d() {
            return false;
        }

        private f() {
        }
    }

    private static class a extends f {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f907a;

        a(Animatable animatable) {
            super();
            this.f907a = animatable;
        }

        @Override // b.a.b.a.b.f
        public void a() {
            this.f907a.start();
        }

        @Override // b.a.b.a.b.f
        public void b() {
            this.f907a.stop();
        }
    }

    private static class d extends f {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f909a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f910b;

        d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                objectAnimatorOfInt.setAutoCancel(true);
            }
            objectAnimatorOfInt.setDuration(eVar.a());
            objectAnimatorOfInt.setInterpolator(eVar);
            this.f910b = z2;
            this.f909a = objectAnimatorOfInt;
        }

        @Override // b.a.b.a.b.f
        public boolean d() {
            return this.f910b;
        }

        @Override // b.a.b.a.b.f
        public void a() {
            this.f909a.start();
        }

        @Override // b.a.b.a.b.f
        public void c() {
            this.f909a.reverse();
        }

        @Override // b.a.b.a.b.f
        public void b() {
            this.f909a.cancel();
        }
    }

    private static class c extends f {

        /* renamed from: a, reason: collision with root package name */
        private final b.k.a.a.d f908a;

        c(b.k.a.a.d dVar) {
            super();
            this.f908a = dVar;
        }

        @Override // b.a.b.a.b.f
        public void a() {
            this.f908a.start();
        }

        @Override // b.a.b.a.b.f
        public void b() {
            this.f908a.stop();
        }
    }

    private void a(TypedArray typedArray) {
        C0012b c0012b = this.p;
        if (Build.VERSION.SDK_INT >= 21) {
            c0012b.f928d |= typedArray.getChangingConfigurations();
        }
        c0012b.a(typedArray.getBoolean(a$i.AnimatedStateListDrawableCompat_android_variablePadding, c0012b.f933i));
        c0012b.b(typedArray.getBoolean(a$i.AnimatedStateListDrawableCompat_android_constantSize, c0012b.l));
        c0012b.b(typedArray.getInt(a$i.AnimatedStateListDrawableCompat_android_enterFadeDuration, c0012b.A));
        c0012b.c(typedArray.getInt(a$i.AnimatedStateListDrawableCompat_android_exitFadeDuration, c0012b.B));
        setDither(typedArray.getBoolean(a$i.AnimatedStateListDrawableCompat_android_dither, c0012b.x));
    }

    private void d() {
        onStateChange(getState());
    }

    private void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    e(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    d(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private int d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        TypedArray typedArrayA = i.a(resources, theme, attributeSet, a$i.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayA.getResourceId(a$i.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayA.getResourceId(a$i.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayA.getResourceId(a$i.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawableB = resourceId3 > 0 ? b.a.a.a.a.b(context, resourceId3) : null;
        boolean z = typedArrayA.getBoolean(a$i.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayA.recycle();
        if (drawableB == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawableB = b.k.a.a.d.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawableB = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawableB = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawableB == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId == -1 || resourceId2 == -1) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        return this.p.a(resourceId, resourceId2, drawableB, z);
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayA = i.a(resources, theme, attributeSet, a$i.AnimatedStateListDrawableItem);
        int resourceId = typedArrayA.getResourceId(a$i.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayA.getResourceId(a$i.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawableB = resourceId2 > 0 ? b.a.a.a.a.b(context, resourceId2) : null;
        typedArrayA.recycle();
        int[] iArrA = a(attributeSet);
        if (drawableB == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            if (xmlPullParser.getName().equals("vector")) {
                drawableB = k.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawableB = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawableB = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawableB == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        return this.p.a(iArrA, drawableB, resourceId);
    }

    @Override // b.a.b.a.f, b.a.b.a.d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t && super.mutate() == this) {
            this.p.d();
            this.t = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.a.b.a.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0012b b() {
        return new C0012b(this.p, this, null);
    }

    /* renamed from: b.a.b.a.b$b, reason: collision with other inner class name */
    static class C0012b extends f.a {
        b.c.f<Long> K;
        j<Integer> L;

        private static long f(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        C0012b(C0012b c0012b, b bVar, Resources resources) {
            super(c0012b, bVar, resources);
            if (c0012b != null) {
                this.K = c0012b.K;
                this.L = c0012b.L;
            } else {
                this.K = new b.c.f<>();
                this.L = new j<>();
            }
        }

        @Override // b.a.b.a.d.b
        void d() {
            this.K = this.K.m0clone();
            this.L = this.L.m1clone();
        }

        int a(int i2, int i3, Drawable drawable, boolean z) {
            int iA = super.a(drawable);
            long jF = f(i2, i3);
            long j = z ? 8589934592L : 0L;
            long j2 = iA;
            this.K.c(jF, Long.valueOf(j2 | j));
            if (z) {
                this.K.c(f(i3, i2), Long.valueOf(4294967296L | j2 | j));
            }
            return iA;
        }

        int a(int[] iArr, Drawable drawable, int i2) {
            int iA = super.a(iArr, drawable);
            this.L.b(iA, Integer.valueOf(i2));
            return iA;
        }

        int b(int[] iArr) {
            int iA = super.a(iArr);
            return iA >= 0 ? iA : super.a(StateSet.WILD_CARD);
        }

        int d(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.a(i2, 0).intValue();
        }

        int c(int i2, int i3) {
            return (int) this.K.a(f(i2, i3), -1L).longValue();
        }

        boolean d(int i2, int i3) {
            return (this.K.a(f(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        boolean e(int i2, int i3) {
            return (this.K.a(f(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new b(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new b(this, resources);
        }
    }

    @Override // b.a.b.a.f, b.a.b.a.d
    protected void a(d.b bVar) {
        super.a(bVar);
        if (bVar instanceof C0012b) {
            this.p = (C0012b) bVar;
        }
    }

    private static class e implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f911a;

        /* renamed from: b, reason: collision with root package name */
        private int f912b;

        /* renamed from: c, reason: collision with root package name */
        private int f913c;

        e(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f912b = numberOfFrames;
            if (this.f911a == null || this.f911a.length < numberOfFrames) {
                this.f911a = new int[numberOfFrames];
            }
            int[] iArr = this.f911a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr[i3] = duration;
                i2 += duration;
            }
            this.f913c = i2;
            return i2;
        }

        int a() {
            return this.f913c;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f913c) + 0.5f);
            int i3 = this.f912b;
            int[] iArr = this.f911a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f913c : 0.0f);
        }
    }
}
