package b.k.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import b.a.a$i;
import b.d.a.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: b, reason: collision with root package name */
    static final PorterDuff.Mode f1241b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private g f1242c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f1243d;

    /* renamed from: e, reason: collision with root package name */
    private ColorFilter f1244e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1245f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1246g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable.ConstantState f1247h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f1248i;
    private final Matrix j;
    private final Rect k;

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    k() {
        this.f1246g = true;
        this.f1248i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f1242c = new g();
    }

    k(g gVar) {
        this.f1246g = true;
        this.f1248i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.f1242c = gVar;
        this.f1243d = a(this.f1243d, gVar.f1278c, gVar.f1279d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f1240a != null) {
            this.f1240a.mutate();
            return this;
        }
        if (!this.f1245f && super.mutate() == this) {
            this.f1242c = new g(this.f1242c);
            this.f1245f = true;
        }
        return this;
    }

    Object a(String str) {
        return this.f1242c.f1277b.q.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1240a != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f1240a.getConstantState());
        }
        this.f1242c.f1276a = getChangingConfigurations();
        return this.f1242c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1240a != null) {
            this.f1240a.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() <= 0 || this.k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1244e == null ? this.f1243d : this.f1244e;
        canvas.getMatrix(this.j);
        this.j.getValues(this.f1248i);
        float fAbs = Math.abs(this.f1248i[0]);
        float fAbs2 = Math.abs(this.f1248i[4]);
        float fAbs3 = Math.abs(this.f1248i[1]);
        float fAbs4 = Math.abs(this.f1248i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.k.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.k.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.k.left, this.k.top);
        if (a()) {
            canvas.translate(this.k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.k.offsetTo(0, 0);
        this.f1242c.b(iMin, iMin2);
        if (!this.f1246g) {
            this.f1242c.a(iMin, iMin2);
        } else if (!this.f1242c.b()) {
            this.f1242c.a(iMin, iMin2);
            this.f1242c.c();
        }
        this.f1242c.a(canvas, colorFilter, this.k);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f1240a != null) {
            return androidx.core.graphics.drawable.a.c(this.f1240a);
        }
        return this.f1242c.f1277b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f1240a != null) {
            this.f1240a.setAlpha(i2);
        } else if (this.f1242c.f1277b.getRootAlpha() != i2) {
            this.f1242c.f1277b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1240a != null) {
            this.f1240a.setColorFilter(colorFilter);
        } else {
            this.f1244e = colorFilter;
            invalidateSelf();
        }
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, colorStateList);
            return;
        }
        g gVar = this.f1242c;
        if (gVar.f1278c != colorStateList) {
            gVar.f1278c = colorStateList;
            this.f1243d = a(this.f1243d, colorStateList, gVar.f1279d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, mode);
            return;
        }
        g gVar = this.f1242c;
        if (gVar.f1279d != mode) {
            gVar.f1279d = mode;
            this.f1243d = a(this.f1243d, gVar.f1278c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f1240a != null) {
            return this.f1240a.isStateful();
        }
        return super.isStateful() || (this.f1242c != null && (this.f1242c.d() || (this.f1242c.f1278c != null && this.f1242c.f1278c.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f1240a != null) {
            return this.f1240a.setState(iArr);
        }
        boolean z = false;
        g gVar = this.f1242c;
        if (gVar.f1278c != null && gVar.f1279d != null) {
            this.f1243d = a(this.f1243d, gVar.f1278c, gVar.f1279d);
            invalidateSelf();
            z = true;
        }
        if (!gVar.d() || !gVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f1240a != null) {
            return this.f1240a.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1240a != null) {
            return this.f1240a.getIntrinsicWidth();
        }
        return (int) this.f1242c.f1277b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1240a != null) {
            return this.f1240a.getIntrinsicHeight();
        }
        return (int) this.f1242c.f1277b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f1240a == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.d(this.f1240a);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f1240a != null) {
            return androidx.core.graphics.drawable.a.b(this.f1240a);
        }
        return this.f1242c.f1280e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, z);
        } else {
            this.f1242c.f1280e = z;
        }
    }

    public static k a(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            k kVar = new k();
            kVar.f1240a = androidx.core.content.a.h.a(resources, i2, theme);
            kVar.f1247h = new h(kVar.f1240a.getConstantState());
            return kVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(resources, (XmlPullParser) xml, attributeSetAsAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static k createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        k kVar = new k();
        kVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return kVar;
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f1240a != null) {
            this.f1240a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f1242c;
        gVar.f1277b = new f();
        TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1214a);
        a(typedArrayA, xmlPullParser);
        typedArrayA.recycle();
        gVar.f1276a = getChangingConfigurations();
        gVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.f1243d = a(this.f1243d, gVar.f1278c, gVar.f1279d);
    }

    private static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        g gVar = this.f1242c;
        f fVar = gVar.f1277b;
        gVar.f1279d = a(androidx.core.content.a.i.a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.f1278c = colorStateList;
        }
        gVar.f1280e = androidx.core.content.a.i.a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.f1280e);
        fVar.l = androidx.core.content.a.i.a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.l);
        fVar.m = androidx.core.content.a.i.a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.m);
        if (fVar.l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fVar.m <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        fVar.j = typedArray.getDimension(3, fVar.j);
        fVar.k = typedArray.getDimension(2, fVar.k);
        if (fVar.j <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (fVar.k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        fVar.setAlpha(androidx.core.content.a.i.a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            fVar.o = string;
            fVar.q.put(string, fVar);
        }
    }

    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = this.f1242c;
        f fVar = gVar.f1277b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f1275i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1256b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.q.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.f1276a = bVar.f1266c | gVar.f1276a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1256b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.q.put(aVar.getPathName(), aVar);
                    }
                    gVar.f1276a = aVar.f1266c | gVar.f1276a;
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    cVar2.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f1256b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.q.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f1276a = cVar2.k | gVar.f1276a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    void a(boolean z) {
        this.f1246g = z;
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.g(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f1240a != null) {
            this.f1240a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f1240a != null) {
            return this.f1240a.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1242c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f1240a != null) {
            this.f1240a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f1240a != null) {
            this.f1240a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1240a != null) {
            return this.f1240a.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.f1240a != null) {
            this.f1240a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1285a;

        public h(Drawable.ConstantState constantState) {
            this.f1285a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            k kVar = new k();
            kVar.f1240a = (VectorDrawable) this.f1285a.newDrawable();
            return kVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            k kVar = new k();
            kVar.f1240a = (VectorDrawable) this.f1285a.newDrawable(resources);
            return kVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            k kVar = new k();
            kVar.f1240a = (VectorDrawable) this.f1285a.newDrawable(resources, theme);
            return kVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1285a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1285a.getChangingConfigurations();
        }
    }

    private static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1276a;

        /* renamed from: b, reason: collision with root package name */
        f f1277b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f1278c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f1279d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1280e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f1281f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f1282g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f1283h;

        /* renamed from: i, reason: collision with root package name */
        int f1284i;
        boolean j;
        boolean k;
        Paint l;

        public g(g gVar) {
            this.f1278c = null;
            this.f1279d = k.f1241b;
            if (gVar != null) {
                this.f1276a = gVar.f1276a;
                this.f1277b = new f(gVar.f1277b);
                if (gVar.f1277b.f1272f != null) {
                    this.f1277b.f1272f = new Paint(gVar.f1277b.f1272f);
                }
                if (gVar.f1277b.f1271e != null) {
                    this.f1277b.f1271e = new Paint(gVar.f1277b.f1271e);
                }
                this.f1278c = gVar.f1278c;
                this.f1279d = gVar.f1279d;
                this.f1280e = gVar.f1280e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f1281f, (Rect) null, rect, a(colorFilter));
        }

        public boolean a() {
            return this.f1277b.getRootAlpha() < 255;
        }

        public Paint a(ColorFilter colorFilter) {
            if (!a() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f1277b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public void a(int i2, int i3) {
            this.f1281f.eraseColor(0);
            this.f1277b.a(new Canvas(this.f1281f), i2, i3, (ColorFilter) null);
        }

        public void b(int i2, int i3) {
            if (this.f1281f == null || !c(i2, i3)) {
                this.f1281f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public boolean c(int i2, int i3) {
            return i2 == this.f1281f.getWidth() && i3 == this.f1281f.getHeight();
        }

        public boolean b() {
            return !this.k && this.f1282g == this.f1278c && this.f1283h == this.f1279d && this.j == this.f1280e && this.f1284i == this.f1277b.getRootAlpha();
        }

        public void c() {
            this.f1282g = this.f1278c;
            this.f1283h = this.f1279d;
            this.f1284i = this.f1277b.getRootAlpha();
            this.j = this.f1280e;
            this.k = false;
        }

        public g() {
            this.f1278c = null;
            this.f1279d = k.f1241b;
            this.f1277b = new f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new k(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new k(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1276a;
        }

        public boolean d() {
            return this.f1277b.a();
        }

        public boolean a(int[] iArr) {
            boolean zA = this.f1277b.a(iArr);
            this.k |= zA;
            return zA;
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private static final Matrix f1267a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        private final Path f1268b;

        /* renamed from: c, reason: collision with root package name */
        private final Path f1269c;

        /* renamed from: d, reason: collision with root package name */
        private final Matrix f1270d;

        /* renamed from: e, reason: collision with root package name */
        Paint f1271e;

        /* renamed from: f, reason: collision with root package name */
        Paint f1272f;

        /* renamed from: g, reason: collision with root package name */
        private PathMeasure f1273g;

        /* renamed from: h, reason: collision with root package name */
        private int f1274h;

        /* renamed from: i, reason: collision with root package name */
        final c f1275i;
        float j;
        float k;
        float l;
        float m;
        int n;
        String o;
        Boolean p;
        final b.c.b<String, Object> q;

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        public f() {
            this.f1270d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new b.c.b<>();
            this.f1275i = new c();
            this.f1268b = new Path();
            this.f1269c = new Path();
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public f(f fVar) {
            this.f1270d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new b.c.b<>();
            this.f1275i = new c(fVar.f1275i, this.q);
            this.f1268b = new Path(fVar.f1268b);
            this.f1269c = new Path(fVar.f1269c);
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            this.f1274h = fVar.f1274h;
            this.n = fVar.n;
            this.o = fVar.o;
            if (fVar.o != null) {
                this.q.put(fVar.o, this);
            }
            this.p = fVar.p;
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            cVar.f1255a.set(matrix);
            cVar.f1255a.preConcat(cVar.j);
            canvas.save();
            for (int i4 = 0; i4 < cVar.f1256b.size(); i4++) {
                d dVar = cVar.f1256b.get(i4);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.f1255a, canvas, i2, i3, colorFilter);
                } else if (dVar instanceof e) {
                    a(cVar, (e) dVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.f1275i, f1267a, canvas, i2, i3, colorFilter);
        }

        private void a(c cVar, e eVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.l;
            float f3 = i3 / this.m;
            float fMin = Math.min(f2, f3);
            Matrix matrix = cVar.f1255a;
            this.f1270d.set(matrix);
            this.f1270d.postScale(f2, f3);
            float fA = a(matrix);
            if (fA == 0.0f) {
                return;
            }
            eVar.a(this.f1268b);
            Path path = this.f1268b;
            this.f1269c.reset();
            if (eVar.b()) {
                this.f1269c.addPath(path, this.f1270d);
                canvas.clipPath(this.f1269c);
                return;
            }
            b bVar = (b) eVar;
            if (bVar.k != 0.0f || bVar.l != 1.0f) {
                float f4 = (bVar.k + bVar.m) % 1.0f;
                float f5 = (bVar.l + bVar.m) % 1.0f;
                if (this.f1273g == null) {
                    this.f1273g = new PathMeasure();
                }
                this.f1273g.setPath(this.f1268b, false);
                float length = this.f1273g.getLength();
                float f6 = f4 * length;
                float f7 = f5 * length;
                path.reset();
                if (f6 > f7) {
                    this.f1273g.getSegment(f6, length, path, true);
                    this.f1273g.getSegment(0.0f, f7, path, true);
                } else {
                    this.f1273g.getSegment(f6, f7, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f1269c.addPath(path, this.f1270d);
            if (bVar.f1252g.e()) {
                androidx.core.content.a.b bVar2 = bVar.f1252g;
                if (this.f1272f == null) {
                    this.f1272f = new Paint(1);
                    this.f1272f.setStyle(Paint.Style.FILL);
                }
                Paint paint = this.f1272f;
                if (bVar2.c()) {
                    Shader shaderA = bVar2.a();
                    shaderA.setLocalMatrix(this.f1270d);
                    paint.setShader(shaderA);
                    paint.setAlpha(Math.round(bVar.j * 255.0f));
                } else {
                    paint.setShader(null);
                    paint.setAlpha(255);
                    paint.setColor(k.a(bVar2.b(), bVar.j));
                }
                paint.setColorFilter(colorFilter);
                this.f1269c.setFillType(bVar.f1254i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f1269c, paint);
            }
            if (bVar.f1250e.e()) {
                androidx.core.content.a.b bVar3 = bVar.f1250e;
                if (this.f1271e == null) {
                    this.f1271e = new Paint(1);
                    this.f1271e.setStyle(Paint.Style.STROKE);
                }
                Paint paint2 = this.f1271e;
                if (bVar.o != null) {
                    paint2.setStrokeJoin(bVar.o);
                }
                if (bVar.n != null) {
                    paint2.setStrokeCap(bVar.n);
                }
                paint2.setStrokeMiter(bVar.p);
                if (bVar3.c()) {
                    Shader shaderA2 = bVar3.a();
                    shaderA2.setLocalMatrix(this.f1270d);
                    paint2.setShader(shaderA2);
                    paint2.setAlpha(Math.round(bVar.f1253h * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(k.a(bVar3.b(), bVar.f1253h));
                }
                paint2.setColorFilter(colorFilter);
                paint2.setStrokeWidth(bVar.f1251f * fMin * fA);
                canvas.drawPath(this.f1269c, paint2);
            }
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean a() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.f1275i.a());
            }
            return this.p.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.f1275i.a(iArr);
        }
    }

    private static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }

        private d() {
        }
    }

    private static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f1255a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<d> f1256b;

        /* renamed from: c, reason: collision with root package name */
        float f1257c;

        /* renamed from: d, reason: collision with root package name */
        private float f1258d;

        /* renamed from: e, reason: collision with root package name */
        private float f1259e;

        /* renamed from: f, reason: collision with root package name */
        private float f1260f;

        /* renamed from: g, reason: collision with root package name */
        private float f1261g;

        /* renamed from: h, reason: collision with root package name */
        private float f1262h;

        /* renamed from: i, reason: collision with root package name */
        private float f1263i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public c(c cVar, b.c.b<String, Object> bVar) {
            e aVar;
            super();
            this.f1255a = new Matrix();
            this.f1256b = new ArrayList<>();
            this.f1257c = 0.0f;
            this.f1258d = 0.0f;
            this.f1259e = 0.0f;
            this.f1260f = 1.0f;
            this.f1261g = 1.0f;
            this.f1262h = 0.0f;
            this.f1263i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f1257c = cVar.f1257c;
            this.f1258d = cVar.f1258d;
            this.f1259e = cVar.f1259e;
            this.f1260f = cVar.f1260f;
            this.f1261g = cVar.f1261g;
            this.f1262h = cVar.f1262h;
            this.f1263i = cVar.f1263i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            if (this.m != null) {
                bVar.put(this.m, this);
            }
            this.j.set(cVar.j);
            ArrayList<d> arrayList = cVar.f1256b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                d dVar = arrayList.get(i2);
                if (dVar instanceof c) {
                    this.f1256b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f1256b.add(aVar);
                    if (aVar.f1265b != null) {
                        bVar.put(aVar.f1265b, aVar);
                    }
                }
            }
        }

        public c() {
            super();
            this.f1255a = new Matrix();
            this.f1256b = new ArrayList<>();
            this.f1257c = 0.0f;
            this.f1258d = 0.0f;
            this.f1259e = 0.0f;
            this.f1260f = 1.0f;
            this.f1261g = 1.0f;
            this.f1262h = 0.0f;
            this.f1263i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1215b);
            a(typedArrayA, xmlPullParser);
            typedArrayA.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.f1257c = androidx.core.content.a.i.a(typedArray, xmlPullParser, "rotation", 5, this.f1257c);
            this.f1258d = typedArray.getFloat(1, this.f1258d);
            this.f1259e = typedArray.getFloat(2, this.f1259e);
            this.f1260f = androidx.core.content.a.i.a(typedArray, xmlPullParser, "scaleX", 3, this.f1260f);
            this.f1261g = androidx.core.content.a.i.a(typedArray, xmlPullParser, "scaleY", 4, this.f1261g);
            this.f1262h = androidx.core.content.a.i.a(typedArray, xmlPullParser, "translateX", 6, this.f1262h);
            this.f1263i = androidx.core.content.a.i.a(typedArray, xmlPullParser, "translateY", 7, this.f1263i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.f1258d, -this.f1259e);
            this.j.postScale(this.f1260f, this.f1261g);
            this.j.postRotate(this.f1257c, 0.0f, 0.0f);
            this.j.postTranslate(this.f1262h + this.f1258d, this.f1263i + this.f1259e);
        }

        public float getRotation() {
            return this.f1257c;
        }

        public void setRotation(float f2) {
            if (f2 != this.f1257c) {
                this.f1257c = f2;
                b();
            }
        }

        public float getPivotX() {
            return this.f1258d;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f1258d) {
                this.f1258d = f2;
                b();
            }
        }

        public float getPivotY() {
            return this.f1259e;
        }

        public void setPivotY(float f2) {
            if (f2 != this.f1259e) {
                this.f1259e = f2;
                b();
            }
        }

        public float getScaleX() {
            return this.f1260f;
        }

        public void setScaleX(float f2) {
            if (f2 != this.f1260f) {
                this.f1260f = f2;
                b();
            }
        }

        public float getScaleY() {
            return this.f1261g;
        }

        public void setScaleY(float f2) {
            if (f2 != this.f1261g) {
                this.f1261g = f2;
                b();
            }
        }

        public float getTranslateX() {
            return this.f1262h;
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f1262h) {
                this.f1262h = f2;
                b();
            }
        }

        public float getTranslateY() {
            return this.f1263i;
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f1263i) {
                this.f1263i = f2;
                b();
            }
        }

        @Override // b.k.a.a.k.d
        public boolean a() {
            for (int i2 = 0; i2 < this.f1256b.size(); i2++) {
                if (this.f1256b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // b.k.a.a.k.d
        public boolean a(int[] iArr) {
            boolean zA = false;
            for (int i2 = 0; i2 < this.f1256b.size(); i2++) {
                zA |= this.f1256b.get(i2).a(iArr);
            }
            return zA;
        }
    }

    private static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        protected b.C0014b[] f1264a;

        /* renamed from: b, reason: collision with root package name */
        String f1265b;

        /* renamed from: c, reason: collision with root package name */
        int f1266c;

        public boolean b() {
            return false;
        }

        public e() {
            super();
            this.f1264a = null;
        }

        public e(e eVar) {
            super();
            this.f1264a = null;
            this.f1265b = eVar.f1265b;
            this.f1266c = eVar.f1266c;
            this.f1264a = b.d.a.b.a(eVar.f1264a);
        }

        public void a(Path path) {
            path.reset();
            if (this.f1264a != null) {
                b.C0014b.a(this.f1264a, path);
            }
        }

        public String getPathName() {
            return this.f1265b;
        }

        public b.C0014b[] getPathData() {
            return this.f1264a;
        }

        public void setPathData(b.C0014b[] c0014bArr) {
            if (!b.d.a.b.a(this.f1264a, c0014bArr)) {
                this.f1264a = b.d.a.b.a(c0014bArr);
            } else {
                b.d.a.b.b(this.f1264a, c0014bArr);
            }
        }
    }

    private static class a extends e {
        @Override // b.k.a.a.k.e
        public boolean b() {
            return true;
        }

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.a.i.a(xmlPullParser, "pathData")) {
                TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1217d);
                a(typedArrayA);
                typedArrayA.recycle();
            }
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f1265b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f1264a = b.d.a.b.b(string2);
            }
        }
    }

    private static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        private int[] f1249d;

        /* renamed from: e, reason: collision with root package name */
        androidx.core.content.a.b f1250e;

        /* renamed from: f, reason: collision with root package name */
        float f1251f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.content.a.b f1252g;

        /* renamed from: h, reason: collision with root package name */
        float f1253h;

        /* renamed from: i, reason: collision with root package name */
        int f1254i;
        float j;
        float k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        public b() {
            this.f1251f = 0.0f;
            this.f1253h = 1.0f;
            this.f1254i = 0;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f1251f = 0.0f;
            this.f1253h = 1.0f;
            this.f1254i = 0;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f1249d = bVar.f1249d;
            this.f1250e = bVar.f1250e;
            this.f1251f = bVar.f1251f;
            this.f1253h = bVar.f1253h;
            this.f1252g = bVar.f1252g;
            this.f1254i = bVar.f1254i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
        }

        private Paint.Cap a(int i2, Paint.Cap cap) {
            switch (i2) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private Paint.Join a(int i2, Paint.Join join) {
            switch (i2) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1216c);
            a(typedArrayA, xmlPullParser, theme);
            typedArrayA.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f1249d = null;
            if (androidx.core.content.a.i.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f1265b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f1264a = b.d.a.b.b(string2);
                }
                this.f1252g = androidx.core.content.a.i.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = androidx.core.content.a.i.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = a(androidx.core.content.a.i.a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(androidx.core.content.a.i.a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.a.i.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f1250e = androidx.core.content.a.i.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f1253h = androidx.core.content.a.i.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f1253h);
                this.f1251f = androidx.core.content.a.i.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f1251f);
                this.l = androidx.core.content.a.i.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = androidx.core.content.a.i.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = androidx.core.content.a.i.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.f1254i = androidx.core.content.a.i.a(typedArray, xmlPullParser, "fillType", 13, this.f1254i);
            }
        }

        @Override // b.k.a.a.k.d
        public boolean a() {
            return this.f1252g.d() || this.f1250e.d();
        }

        @Override // b.k.a.a.k.d
        public boolean a(int[] iArr) {
            return this.f1250e.a(iArr) | this.f1252g.a(iArr);
        }

        int getStrokeColor() {
            return this.f1250e.b();
        }

        void setStrokeColor(int i2) {
            this.f1250e.b(i2);
        }

        float getStrokeWidth() {
            return this.f1251f;
        }

        void setStrokeWidth(float f2) {
            this.f1251f = f2;
        }

        float getStrokeAlpha() {
            return this.f1253h;
        }

        void setStrokeAlpha(float f2) {
            this.f1253h = f2;
        }

        int getFillColor() {
            return this.f1252g.b();
        }

        void setFillColor(int i2) {
            this.f1252g.b(i2);
        }

        float getFillAlpha() {
            return this.j;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }
    }
}
