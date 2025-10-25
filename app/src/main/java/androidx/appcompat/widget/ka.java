package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class ka implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private static ka f399a;

    /* renamed from: b, reason: collision with root package name */
    private static ka f400b;

    /* renamed from: c, reason: collision with root package name */
    private final View f401c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f402d;

    /* renamed from: e, reason: collision with root package name */
    private final int f403e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f404f = new ia(this);

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f405g = new ja(this);

    /* renamed from: h, reason: collision with root package name */
    private int f406h;

    /* renamed from: i, reason: collision with root package name */
    private int f407i;
    private la j;
    private boolean k;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public static void a(View view, CharSequence charSequence) {
        if (f399a != null && f399a.f401c == view) {
            a((ka) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f400b != null && f400b.f401c == view) {
                f400b.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ka(view, charSequence);
    }

    private ka(View view, CharSequence charSequence) {
        this.f401c = view;
        this.f402d = charSequence;
        this.f403e = b.d.g.w.a(ViewConfiguration.get(this.f401c.getContext()));
        d();
        this.f401c.setOnLongClickListener(this);
        this.f401c.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f406h = view.getWidth() / 2;
        this.f407i = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f401c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                d();
                a();
            }
        } else if (this.f401c.isEnabled() && this.j == null && a(motionEvent)) {
            a(this);
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }

    void a(boolean z) {
        long longPressTimeout;
        if (b.d.g.v.k(this.f401c)) {
            a((ka) null);
            if (f400b != null) {
                f400b.a();
            }
            f400b = this;
            this.k = z;
            this.j = new la(this.f401c.getContext());
            this.j.a(this.f401c, this.f406h, this.f407i, this.k, this.f402d);
            this.f401c.addOnAttachStateChangeListener(this);
            if (this.k) {
                longPressTimeout = 2500;
            } else if ((b.d.g.v.f(this.f401c) & 1) == 1) {
                longPressTimeout = 3000 - ViewConfiguration.getLongPressTimeout();
            } else {
                longPressTimeout = 15000 - ViewConfiguration.getLongPressTimeout();
            }
            this.f401c.removeCallbacks(this.f405g);
            this.f401c.postDelayed(this.f405g, longPressTimeout);
        }
    }

    void a() {
        if (f400b == this) {
            f400b = null;
            if (this.j != null) {
                this.j.a();
                this.j = null;
                d();
                this.f401c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f399a == this) {
            a((ka) null);
        }
        this.f401c.removeCallbacks(this.f405g);
    }

    private static void a(ka kaVar) {
        if (f399a != null) {
            f399a.c();
        }
        f399a = kaVar;
        if (f399a != null) {
            f399a.b();
        }
    }

    private void b() {
        this.f401c.postDelayed(this.f404f, ViewConfiguration.getLongPressTimeout());
    }

    private void c() {
        this.f401c.removeCallbacks(this.f404f);
    }

    private boolean a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f406h) <= this.f403e && Math.abs(y - this.f407i) <= this.f403e) {
            return false;
        }
        this.f406h = x;
        this.f407i = y;
        return true;
    }

    private void d() {
        this.f406h = Integer.MAX_VALUE;
        this.f407i = Integer.MAX_VALUE;
    }
}
