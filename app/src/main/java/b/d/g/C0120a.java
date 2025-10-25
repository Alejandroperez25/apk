package b.d.g;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.d.a$c;
import b.d.g.a.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

/* renamed from: b.d.g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0120a {

    /* renamed from: a, reason: collision with root package name */
    private static final View.AccessibilityDelegate f1116a = new View.AccessibilityDelegate();

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f1117b;

    /* renamed from: c, reason: collision with root package name */
    private final View.AccessibilityDelegate f1118c;

    /* renamed from: b.d.g.a$a, reason: collision with other inner class name */
    static final class C0017a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C0120a f1119a;

        C0017a(C0120a c0120a) {
            this.f1119a = c0120a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1119a.b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1119a.d(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            b.d.g.a.b bVarA = b.d.g.a.b.a(accessibilityNodeInfo);
            bVarA.b(v.l(view));
            bVarA.c(v.n(view));
            bVarA.c(v.m(view));
            this.f1119a.a(view, bVarA);
            bVarA.a(accessibilityNodeInfo.getText(), view);
            List<b.a> listA = C0120a.a(view);
            for (int i2 = 0; i2 < listA.size(); i2++) {
                bVarA.a(listA.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1119a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1119a.a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f1119a.a(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1119a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b.d.g.a.c cVarB = this.f1119a.b(view);
            if (cVarB != null) {
                return (AccessibilityNodeProvider) cVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f1119a.a(view, i2, bundle);
        }
    }

    public C0120a() {
        this(f1116a);
    }

    public C0120a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1117b = accessibilityDelegate;
        this.f1118c = new C0017a(this);
    }

    View.AccessibilityDelegate a() {
        return this.f1118c;
    }

    public void a(View view, int i2) {
        this.f1117b.sendAccessibilityEvent(view, i2);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1117b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1117b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1117b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f1117b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, b.d.g.a.b bVar) {
        this.f1117b.onInitializeAccessibilityNodeInfo(view, bVar.a());
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1117b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public b.d.g.a.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f1117b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new b.d.g.a.c(accessibilityNodeProvider);
    }

    public boolean a(View view, int i2, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<b.a> listA = a(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listA.size()) {
                break;
            }
            b.a aVar = listA.get(i3);
            if (aVar.a() == i2) {
                zPerformAccessibilityAction = aVar.a(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f1117b.performAccessibilityAction(view, i2, bundle);
        }
        return (zPerformAccessibilityAction || i2 != a$c.accessibility_action_clickable_span) ? zPerformAccessibilityAction : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    private boolean a(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a$c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrA = b.d.g.a.b.a(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrA != null && i2 < clickableSpanArrA.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrA[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    static List<b.a> a(View view) {
        List<b.a> list = (List) view.getTag(a$c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }
}
