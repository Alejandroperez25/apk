package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f239a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f240b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f241c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f242d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f243e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f244f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f245g;

    /* renamed from: h, reason: collision with root package name */
    private a f246h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f245g = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public void setAttachListener(a aVar) {
        this.f246h = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue getMinWidthMajor() {
        if (this.f239a == null) {
            this.f239a = new TypedValue();
        }
        return this.f239a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f240b == null) {
            this.f240b = new TypedValue();
        }
        return this.f240b;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f241c == null) {
            this.f241c = new TypedValue();
        }
        return this.f241c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f242d == null) {
            this.f242d = new TypedValue();
        }
        return this.f242d;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f243e == null) {
            this.f243e = new TypedValue();
        }
        return this.f243e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f244f == null) {
            this.f244f = new TypedValue();
        }
        return this.f244f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f246h != null) {
            this.f246h.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f246h != null) {
            this.f246h.onDetachedFromWindow();
        }
    }
}
