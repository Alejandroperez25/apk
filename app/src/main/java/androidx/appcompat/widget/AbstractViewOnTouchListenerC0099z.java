package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0099z implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f464a;

    /* renamed from: b, reason: collision with root package name */
    private final int f465b;

    /* renamed from: c, reason: collision with root package name */
    private final int f466c;

    /* renamed from: d, reason: collision with root package name */
    final View f467d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f468e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f469f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f470g;

    /* renamed from: h, reason: collision with root package name */
    private int f471h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f472i = new int[2];

    public abstract androidx.appcompat.view.menu.u a();

    protected abstract boolean b();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public AbstractViewOnTouchListenerC0099z(View view) {
        this.f467d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f464a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f465b = ViewConfiguration.getTapTimeout();
        this.f466c = (this.f465b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f470g;
        if (z2) {
            z = b(motionEvent) || !c();
        } else {
            z = a(motionEvent) && b();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f467d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f470g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f470g = false;
        this.f471h = -1;
        if (this.f468e != null) {
            this.f467d.removeCallbacks(this.f468e);
        }
    }

    protected boolean c() {
        androidx.appcompat.view.menu.u uVarA = a();
        if (uVarA == null || !uVarA.c()) {
            return true;
        }
        uVarA.dismiss();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean a(MotionEvent motionEvent) {
        View view = this.f467d;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f471h = motionEvent.getPointerId(0);
                if (this.f468e == null) {
                    this.f468e = new a();
                }
                view.postDelayed(this.f468e, this.f465b);
                if (this.f469f == null) {
                    this.f469f = new b();
                }
                view.postDelayed(this.f469f, this.f466c);
                return false;
            case 1:
            case 3:
                e();
                return false;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f471h);
                if (iFindPointerIndex >= 0 && !a(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f464a)) {
                    e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void e() {
        if (this.f469f != null) {
            this.f467d.removeCallbacks(this.f469f);
        }
        if (this.f468e != null) {
            this.f467d.removeCallbacks(this.f468e);
        }
    }

    void d() {
        e();
        View view = this.f467d;
        if (view.isEnabled() && !view.isLongClickable() && b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f470g = true;
        }
    }

    private boolean b(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        AbstractC0097x abstractC0097x;
        View view = this.f467d;
        androidx.appcompat.view.menu.u uVarA = a();
        if (uVarA == null || !uVarA.c() || (abstractC0097x = (AbstractC0097x) uVarA.d()) == null || !abstractC0097x.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        b(view, motionEventObtainNoHistory);
        a(abstractC0097x, motionEventObtainNoHistory);
        boolean zA = abstractC0097x.a(motionEventObtainNoHistory, this.f471h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zA && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f472i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f472i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: androidx.appcompat.widget.z$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0099z.this.f467d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0099z.this.d();
        }
    }
}
