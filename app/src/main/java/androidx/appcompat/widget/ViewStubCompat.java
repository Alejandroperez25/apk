package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.a.a$i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f318a;

    /* renamed from: b, reason: collision with root package name */
    private int f319b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<View> f320c;

    /* renamed from: d, reason: collision with root package name */
    private LayoutInflater f321d;

    /* renamed from: e, reason: collision with root package name */
    private a f322e;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f318a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a$i.ViewStubCompat, i2, 0);
        this.f319b = typedArrayObtainStyledAttributes.getResourceId(a$i.ViewStubCompat_android_inflatedId, -1);
        this.f318a = typedArrayObtainStyledAttributes.getResourceId(a$i.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(a$i.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f319b;
    }

    public void setInflatedId(int i2) {
        this.f319b = i2;
    }

    public int getLayoutResource() {
        return this.f318a;
    }

    public void setLayoutResource(int i2) {
        this.f318a = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f321d = layoutInflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f321d;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (this.f320c != null) {
            View view = this.f320c.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public View a() {
        LayoutInflater layoutInflaterFrom;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.f318a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.f321d != null) {
                    layoutInflaterFrom = this.f321d;
                } else {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(this.f318a, viewGroup, false);
                if (this.f319b != -1) {
                    viewInflate.setId(this.f319b);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.f320c = new WeakReference<>(viewInflate);
                if (this.f322e != null) {
                    this.f322e.a(this, viewInflate);
                }
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setOnInflateListener(a aVar) {
        this.f322e = aVar;
    }
}
