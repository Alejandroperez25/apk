package b.k.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d extends i implements b.k.a.a.b {

    /* renamed from: b, reason: collision with root package name */
    private a f1224b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1225c;

    /* renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f1226d;

    /* renamed from: e, reason: collision with root package name */
    private Animator.AnimatorListener f1227e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<Animatable2Compat.AnimationCallback> f1228f;

    /* renamed from: g, reason: collision with root package name */
    final Drawable.Callback f1229g;

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

    d() {
        this(null, null, null);
    }

    private d(Context context) {
        this(context, null, null);
    }

    private d(Context context, a aVar, Resources resources) {
        this.f1226d = null;
        this.f1227e = null;
        this.f1228f = null;
        this.f1229g = new c(this);
        this.f1225c = context;
        if (aVar != null) {
            this.f1224b = aVar;
        } else {
            this.f1224b = new a(context, aVar, this.f1229g, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.f1240a != null) {
            this.f1240a.mutate();
        }
        return this;
    }

    public static d a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        d dVar = new d(context);
        dVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1240a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.f1240a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.f1240a != null) {
            return this.f1240a.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1224b.f1230a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1240a != null) {
            this.f1240a.draw(canvas);
            return;
        }
        this.f1224b.f1231b.draw(canvas);
        if (this.f1224b.f1232c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.f1240a != null) {
            this.f1240a.setBounds(rect);
        } else {
            this.f1224b.f1231b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.f1240a != null) {
            return this.f1240a.setState(iArr);
        }
        return this.f1224b.f1231b.setState(iArr);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        if (this.f1240a != null) {
            return this.f1240a.setLevel(i2);
        }
        return this.f1224b.f1231b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.f1240a != null) {
            return androidx.core.graphics.drawable.a.c(this.f1240a);
        }
        return this.f1224b.f1231b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f1240a != null) {
            this.f1240a.setAlpha(i2);
        } else {
            this.f1224b.f1231b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f1240a != null) {
            this.f1240a.setColorFilter(colorFilter);
        } else {
            this.f1224b.f1231b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, i2);
        } else {
            this.f1224b.f1231b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, colorStateList);
        } else {
            this.f1224b.f1231b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, mode);
        } else {
            this.f1224b.f1231b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.f1240a != null) {
            return this.f1240a.setVisible(z, z2);
        }
        this.f1224b.f1231b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.f1240a != null) {
            return this.f1240a.isStateful();
        }
        return this.f1224b.f1231b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f1240a != null) {
            return this.f1240a.getOpacity();
        }
        return this.f1224b.f1231b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1240a != null) {
            return this.f1240a.getIntrinsicWidth();
        }
        return this.f1224b.f1231b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1240a != null) {
            return this.f1240a.getIntrinsicHeight();
        }
        return this.f1224b.f1231b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.f1240a != null) {
            return androidx.core.graphics.drawable.a.b(this.f1240a);
        }
        return this.f1224b.f1231b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, z);
        } else {
            this.f1224b.f1231b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayA = androidx.core.content.a.i.a(resources, theme, attributeSet, b.k.a.a.a.f1218e);
                    int resourceId = typedArrayA.getResourceId(0, 0);
                    if (resourceId != 0) {
                        k kVarA = k.a(resources, resourceId, theme);
                        kVarA.a(false);
                        kVarA.setCallback(this.f1229g);
                        if (this.f1224b.f1231b != null) {
                            this.f1224b.f1231b.setCallback(null);
                        }
                        this.f1224b.f1231b = kVarA;
                    }
                    typedArrayA.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, b.k.a.a.a.f1219f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f1225c != null) {
                            a(string, f.a(this.f1225c, resourceId2));
                        } else {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f1224b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // b.k.a.a.i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.f1240a != null) {
            androidx.core.graphics.drawable.a.a(this.f1240a, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.f1240a != null) {
            return androidx.core.graphics.drawable.a.d(this.f1240a);
        }
        return false;
    }

    private static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f1235a;

        public b(Drawable.ConstantState constantState) {
            this.f1235a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            d dVar = new d();
            dVar.f1240a = this.f1235a.newDrawable();
            dVar.f1240a.setCallback(dVar.f1229g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            d dVar = new d();
            dVar.f1240a = this.f1235a.newDrawable(resources);
            dVar.f1240a.setCallback(dVar.f1229g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            dVar.f1240a = this.f1235a.newDrawable(resources, theme);
            dVar.f1240a.setCallback(dVar.f1229g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f1235a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1235a.getChangingConfigurations();
        }
    }

    private static class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f1230a;

        /* renamed from: b, reason: collision with root package name */
        k f1231b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f1232c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f1233d;

        /* renamed from: e, reason: collision with root package name */
        b.c.b<Animator, String> f1234e;

        public a(Context context, a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f1230a = aVar.f1230a;
                if (aVar.f1231b != null) {
                    Drawable.ConstantState constantState = aVar.f1231b.getConstantState();
                    if (resources != null) {
                        this.f1231b = (k) constantState.newDrawable(resources);
                    } else {
                        this.f1231b = (k) constantState.newDrawable();
                    }
                    this.f1231b = (k) this.f1231b.mutate();
                    this.f1231b.setCallback(callback);
                    this.f1231b.setBounds(aVar.f1231b.getBounds());
                    this.f1231b.a(false);
                }
                if (aVar.f1233d != null) {
                    int size = aVar.f1233d.size();
                    this.f1233d = new ArrayList<>(size);
                    this.f1234e = new b.c.b<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = aVar.f1233d.get(i2);
                        Animator animatorClone = animator.clone();
                        String str = aVar.f1234e.get(animator);
                        animatorClone.setTarget(this.f1231b.a(str));
                        this.f1233d.add(animatorClone);
                        this.f1234e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1230a;
        }

        public void a() {
            if (this.f1232c == null) {
                this.f1232c = new AnimatorSet();
            }
            this.f1232c.playTogether(this.f1233d);
        }
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                a(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f1226d == null) {
                    this.f1226d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f1226d);
            }
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.f1224b.f1231b.a(str));
        if (Build.VERSION.SDK_INT < 21) {
            a(animator);
        }
        if (this.f1224b.f1233d == null) {
            this.f1224b.f1233d = new ArrayList<>();
            this.f1224b.f1234e = new b.c.b<>();
        }
        this.f1224b.f1233d.add(animator);
        this.f1224b.f1234e.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.f1240a != null) {
            return ((AnimatedVectorDrawable) this.f1240a).isRunning();
        }
        return this.f1224b.f1232c.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f1240a != null) {
            ((AnimatedVectorDrawable) this.f1240a).start();
        } else {
            if (this.f1224b.f1232c.isStarted()) {
                return;
            }
            this.f1224b.f1232c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f1240a != null) {
            ((AnimatedVectorDrawable) this.f1240a).stop();
        } else {
            this.f1224b.f1232c.end();
        }
    }
}
