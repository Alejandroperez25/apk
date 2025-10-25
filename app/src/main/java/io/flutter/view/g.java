package io.flutter.view;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.a.a$i;
import io.flutter.embedding.engine.e.b;
import io.flutter.view.g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    private static int f6260a = 267386881;

    /* renamed from: b, reason: collision with root package name */
    private final View f6261b;

    /* renamed from: c, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.b f6262c;

    /* renamed from: d, reason: collision with root package name */
    private final AccessibilityManager f6263d;

    /* renamed from: e, reason: collision with root package name */
    private final AccessibilityViewEmbedder f6264e;

    /* renamed from: f, reason: collision with root package name */
    private final io.flutter.plugin.platform.k f6265f;

    /* renamed from: g, reason: collision with root package name */
    private final ContentResolver f6266g;
    private f j;
    private Integer k;
    private Integer l;
    private f n;
    private f o;
    private f p;
    private e t;

    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener w;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Integer, f> f6267h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Map<Integer, c> f6268i = new HashMap();
    private int m = 0;
    private final List<Integer> q = new ArrayList();
    private int r = 0;
    private Integer s = 0;
    private final b.a u = new io.flutter.view.c(this);
    private final AccessibilityManager.AccessibilityStateChangeListener v = new io.flutter.view.d(this);
    private final ContentObserver x = new io.flutter.view.e(this, new Handler());

    public interface e {
        void a(boolean z, boolean z2);
    }

    static /* synthetic */ boolean a(f fVar, f fVar2) {
        return fVar2 == fVar;
    }

    public g(View view, io.flutter.embedding.engine.e.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        this.f6261b = view;
        this.f6262c = bVar;
        this.f6263d = accessibilityManager;
        this.f6266g = contentResolver;
        this.f6265f = kVar;
        this.v.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        this.f6263d.addAccessibilityStateChangeListener(this.v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.w = new io.flutter.view.f(this, accessibilityManager);
            this.w.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            this.f6263d.addTouchExplorationStateChangeListener(this.w);
        } else {
            this.w = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.x.onChange(false);
            this.f6266g.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.x);
        }
        if (kVar != null) {
            kVar.a(this);
        }
        this.f6264e = new AccessibilityViewEmbedder(view, 65536);
    }

    public void a() {
        if (this.f6265f != null) {
            this.f6265f.a();
        }
        a((e) null);
        this.f6263d.removeAccessibilityStateChangeListener(this.v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f6263d.removeTouchExplorationStateChangeListener(this.w);
        }
        this.f6266g.unregisterContentObserver(this.x);
    }

    public boolean b() {
        return this.f6263d.isEnabled();
    }

    public boolean c() {
        return this.f6263d.isTouchExplorationEnabled();
    }

    public void a(e eVar) {
        this.t = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f6262c.a(this.m);
    }

    private boolean b(final f fVar) {
        return fVar.j > 0 && (f.b(this.j, (f.a.c.c<f>) new f.a.c.c() { // from class: io.flutter.view.a
            @Override // f.a.c.c
            public final boolean test(Object obj) {
                return g.a(fVar, (g.f) obj);
            }
        }) || !f.b(this.j, new f.a.c.c() { // from class: io.flutter.view.b
            @Override // f.a.c.c
            public final boolean test(Object obj) {
                return ((g.f) obj).a(g.d.HAS_IMPLICIT_SCROLLING);
            }
        }));
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    @SuppressLint({"NewApi"})
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        if (i2 >= 65536) {
            return this.f6264e.createAccessibilityNodeInfo(i2);
        }
        if (i2 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.f6261b);
            this.f6261b.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (this.f6267h.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(this.f6261b, 0);
            }
            return accessibilityNodeInfoObtain;
        }
        f fVar = this.f6267h.get(Integer.valueOf(i2));
        if (fVar == null) {
            return null;
        }
        if (fVar.f6305i == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(this.f6261b, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                accessibilityNodeInfoObtain2.setViewIdResourceName("");
            }
            accessibilityNodeInfoObtain2.setPackageName(this.f6261b.getContext().getPackageName());
            accessibilityNodeInfoObtain2.setClassName("android.view.View");
            accessibilityNodeInfoObtain2.setSource(this.f6261b, i2);
            accessibilityNodeInfoObtain2.setFocusable(fVar.e());
            if (this.n != null) {
                accessibilityNodeInfoObtain2.setFocused(this.n.f6298b == i2);
            }
            if (this.j != null) {
                accessibilityNodeInfoObtain2.setAccessibilityFocused(this.j.f6298b == i2);
            }
            if (fVar.a(d.IS_TEXT_FIELD)) {
                accessibilityNodeInfoObtain2.setPassword(fVar.a(d.IS_OBSCURED));
                if (!fVar.a(d.IS_READ_ONLY)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    accessibilityNodeInfoObtain2.setEditable(!fVar.a(d.IS_READ_ONLY));
                    if (fVar.f6303g != -1 && fVar.f6304h != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(fVar.f6303g, fVar.f6304h);
                    }
                    if (Build.VERSION.SDK_INT > 18 && this.j != null && this.j.f6298b == i2) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                }
                if (fVar.a(b.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    accessibilityNodeInfoObtain2.addAction(256);
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (fVar.a(b.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    accessibilityNodeInfoObtain2.addAction(512);
                    i3 |= 1;
                }
                if (fVar.a(b.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    accessibilityNodeInfoObtain2.addAction(256);
                    i3 |= 2;
                }
                if (fVar.a(b.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    accessibilityNodeInfoObtain2.addAction(512);
                    i3 |= 2;
                }
                accessibilityNodeInfoObtain2.setMovementGranularities(i3);
                if (Build.VERSION.SDK_INT >= 21 && fVar.f6301e >= 0) {
                    int length = fVar.p == null ? 0 : fVar.p.length();
                    int unused = fVar.f6302f;
                    int unused2 = fVar.f6301e;
                    accessibilityNodeInfoObtain2.setMaxTextLength((length - fVar.f6302f) + fVar.f6301e);
                }
            }
            if (Build.VERSION.SDK_INT > 18) {
                if (fVar.a(b.SET_SELECTION)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (fVar.a(b.COPY)) {
                    accessibilityNodeInfoObtain2.addAction(16384);
                }
                if (fVar.a(b.CUT)) {
                    accessibilityNodeInfoObtain2.addAction(65536);
                }
                if (fVar.a(b.PASTE)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
            }
            if (fVar.a(d.IS_BUTTON) || fVar.a(d.IS_LINK)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
            }
            if (fVar.a(d.IS_IMAGE)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
            }
            if (Build.VERSION.SDK_INT > 18 && fVar.a(b.DISMISS)) {
                accessibilityNodeInfoObtain2.setDismissable(true);
                accessibilityNodeInfoObtain2.addAction(1048576);
            }
            if (fVar.J == null) {
                accessibilityNodeInfoObtain2.setParent(this.f6261b);
            } else {
                accessibilityNodeInfoObtain2.setParent(this.f6261b, fVar.J.f6298b);
            }
            Rect rectD = fVar.d();
            if (fVar.J == null) {
                accessibilityNodeInfoObtain2.setBoundsInParent(rectD);
            } else {
                Rect rectD2 = fVar.J.d();
                Rect rect = new Rect(rectD);
                rect.offset(-rectD2.left, -rectD2.top);
                accessibilityNodeInfoObtain2.setBoundsInParent(rect);
            }
            accessibilityNodeInfoObtain2.setBoundsInScreen(rectD);
            accessibilityNodeInfoObtain2.setVisibleToUser(true);
            accessibilityNodeInfoObtain2.setEnabled(!fVar.a(d.HAS_ENABLED_STATE) || fVar.a(d.IS_ENABLED));
            if (fVar.a(b.TAP)) {
                if (Build.VERSION.SDK_INT >= 21 && fVar.N != null) {
                    accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, fVar.N.f6287e));
                    accessibilityNodeInfoObtain2.setClickable(true);
                } else {
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.setClickable(true);
                }
            }
            if (fVar.a(b.LONG_PRESS)) {
                if (Build.VERSION.SDK_INT >= 21 && fVar.O != null) {
                    accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, fVar.O.f6287e));
                    accessibilityNodeInfoObtain2.setLongClickable(true);
                } else {
                    accessibilityNodeInfoObtain2.addAction(32);
                    accessibilityNodeInfoObtain2.setLongClickable(true);
                }
            }
            if (fVar.a(b.SCROLL_LEFT) || fVar.a(b.SCROLL_UP) || fVar.a(b.SCROLL_RIGHT) || fVar.a(b.SCROLL_DOWN)) {
                accessibilityNodeInfoObtain2.setScrollable(true);
                if (fVar.a(d.HAS_IMPLICIT_SCROLLING)) {
                    if (fVar.a(b.SCROLL_LEFT) || fVar.a(b.SCROLL_RIGHT)) {
                        if (Build.VERSION.SDK_INT > 19 && b(fVar)) {
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, fVar.j, false));
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                        }
                    } else if (Build.VERSION.SDK_INT > 18 && b(fVar)) {
                        accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(fVar.j, 0, false));
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                    }
                }
                if (fVar.a(b.SCROLL_LEFT) || fVar.a(b.SCROLL_UP)) {
                    accessibilityNodeInfoObtain2.addAction(4096);
                }
                if (fVar.a(b.SCROLL_RIGHT) || fVar.a(b.SCROLL_DOWN)) {
                    accessibilityNodeInfoObtain2.addAction(8192);
                }
            }
            if (fVar.a(b.INCREASE) || fVar.a(b.DECREASE)) {
                accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                if (fVar.a(b.INCREASE)) {
                    accessibilityNodeInfoObtain2.addAction(4096);
                }
                if (fVar.a(b.DECREASE)) {
                    accessibilityNodeInfoObtain2.addAction(8192);
                }
            }
            if (fVar.a(d.IS_LIVE_REGION) && Build.VERSION.SDK_INT > 18) {
                accessibilityNodeInfoObtain2.setLiveRegion(1);
            }
            boolean zA = fVar.a(d.HAS_CHECKED_STATE);
            boolean zA2 = fVar.a(d.HAS_TOGGLED_STATE);
            accessibilityNodeInfoObtain2.setCheckable(zA || zA2);
            if (zA) {
                accessibilityNodeInfoObtain2.setChecked(fVar.a(d.IS_CHECKED));
                accessibilityNodeInfoObtain2.setContentDescription(fVar.g());
                if (fVar.a(d.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                } else {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                }
            } else if (zA2) {
                accessibilityNodeInfoObtain2.setChecked(fVar.a(d.IS_TOGGLED));
                accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                accessibilityNodeInfoObtain2.setContentDescription(fVar.g());
            } else if (!fVar.a(d.SCOPES_ROUTE)) {
                accessibilityNodeInfoObtain2.setText(fVar.g());
            }
            accessibilityNodeInfoObtain2.setSelected(fVar.a(d.IS_SELECTED));
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfoObtain2.setHeading(fVar.a(d.IS_HEADER));
            }
            if (this.j != null && this.j.f6298b == i2) {
                accessibilityNodeInfoObtain2.addAction(128);
            } else {
                accessibilityNodeInfoObtain2.addAction(64);
            }
            if (Build.VERSION.SDK_INT >= 21 && fVar.M != null) {
                for (c cVar : fVar.M) {
                    accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(cVar.f6283a, cVar.f6286d));
                }
            }
            for (f fVar2 : fVar.K) {
                if (!fVar2.a(d.IS_HIDDEN)) {
                    accessibilityNodeInfoObtain2.addChild(this.f6261b, fVar2.f6298b);
                }
            }
            return accessibilityNodeInfoObtain2;
        }
        return this.f6264e.getRootNode(this.f6265f.a(Integer.valueOf(fVar.f6305i)), fVar.f6298b, fVar.d());
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean zPerformAction = this.f6264e.performAction(i2, i3, bundle);
            if (zPerformAction && i3 == 128) {
                this.k = null;
            }
            return zPerformAction;
        }
        f fVar = this.f6267h.get(Integer.valueOf(i2));
        boolean z = false;
        if (fVar == null) {
            return false;
        }
        switch (i3) {
            case 16:
                this.f6262c.a(i2, b.TAP);
                return true;
            case a$i.AppCompatTheme_activityChooserViewStyle /* 32 */:
                this.f6262c.a(i2, b.LONG_PRESS);
                return true;
            case a$i.AppCompatTheme_dropDownListViewStyle /* 64 */:
                this.f6262c.a(i2, b.DID_GAIN_ACCESSIBILITY_FOCUS);
                a(i2, 32768);
                if (this.j == null) {
                    this.f6261b.invalidate();
                }
                this.j = fVar;
                if (fVar.a(b.INCREASE) || fVar.a(b.DECREASE)) {
                    a(i2, 4);
                }
                return true;
            case 128:
                this.f6262c.a(i2, b.DID_LOSE_ACCESSIBILITY_FOCUS);
                a(i2, 65536);
                this.j = null;
                this.k = null;
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return a(fVar, i2, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return a(fVar, i2, bundle, false);
            case 4096:
                if (fVar.a(b.SCROLL_UP)) {
                    this.f6262c.a(i2, b.SCROLL_UP);
                } else if (fVar.a(b.SCROLL_LEFT)) {
                    this.f6262c.a(i2, b.SCROLL_LEFT);
                } else {
                    if (!fVar.a(b.INCREASE)) {
                        return false;
                    }
                    fVar.p = fVar.q;
                    a(i2, 4);
                    this.f6262c.a(i2, b.INCREASE);
                }
                return true;
            case 8192:
                if (fVar.a(b.SCROLL_DOWN)) {
                    this.f6262c.a(i2, b.SCROLL_DOWN);
                } else if (fVar.a(b.SCROLL_RIGHT)) {
                    this.f6262c.a(i2, b.SCROLL_RIGHT);
                } else {
                    if (!fVar.a(b.DECREASE)) {
                        return false;
                    }
                    fVar.p = fVar.r;
                    a(i2, 4);
                    this.f6262c.a(i2, b.DECREASE);
                }
                return true;
            case 16384:
                this.f6262c.a(i2, b.COPY);
                return true;
            case 32768:
                this.f6262c.a(i2, b.PASTE);
                return true;
            case 65536:
                this.f6262c.a(i2, b.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap map = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z = true;
                }
                if (z) {
                    map.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map.put("base", Integer.valueOf(fVar.f6304h));
                    map.put("extent", Integer.valueOf(fVar.f6304h));
                }
                this.f6262c.a(i2, b.SET_SELECTION, map);
                return true;
            case 1048576:
                this.f6262c.a(i2, b.DISMISS);
                return true;
            case R.id.accessibilityActionShowOnScreen:
                this.f6262c.a(i2, b.SHOW_ON_SCREEN);
                return true;
            default:
                c cVar = this.f6268i.get(Integer.valueOf(i3 - f6260a));
                if (cVar == null) {
                    return false;
                }
                this.f6262c.a(i2, b.CUSTOM_ACTION, Integer.valueOf(cVar.f6284b));
                return true;
        }
    }

    @TargetApi(18)
    private boolean a(f fVar, int i2, Bundle bundle, boolean z) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        switch (i3) {
            case 1:
                if (z && fVar.a(b.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    this.f6262c.a(i2, b.MOVE_CURSOR_FORWARD_BY_CHARACTER, Boolean.valueOf(z2));
                    break;
                } else if (!z && fVar.a(b.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    this.f6262c.a(i2, b.MOVE_CURSOR_BACKWARD_BY_CHARACTER, Boolean.valueOf(z2));
                    break;
                }
                break;
            case 2:
                if (z && fVar.a(b.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    this.f6262c.a(i2, b.MOVE_CURSOR_FORWARD_BY_WORD, Boolean.valueOf(z2));
                    break;
                } else if (!z && fVar.a(b.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    this.f6262c.a(i2, b.MOVE_CURSOR_BACKWARD_BY_WORD, Boolean.valueOf(z2));
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i2) {
        switch (i2) {
            case 1:
                if (this.n == null) {
                    if (this.l != null) {
                        return createAccessibilityNodeInfo(this.l.intValue());
                    }
                } else {
                    return createAccessibilityNodeInfo(this.n.f6298b);
                }
                break;
            case 2:
                break;
            default:
                return null;
        }
        if (this.j == null) {
            if (this.k != null) {
                return createAccessibilityNodeInfo(this.k.intValue());
            }
            return null;
        }
        return createAccessibilityNodeInfo(this.j.f6298b);
    }

    private f f() {
        return this.f6267h.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f a(int i2) {
        f fVar = this.f6267h.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        fVar2.f6298b = i2;
        this.f6267h.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c b(int i2) {
        c cVar = this.f6268i.get(Integer.valueOf(i2));
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.f6284b = i2;
        cVar2.f6283a = f6260a + i2;
        this.f6268i.put(Integer.valueOf(i2), cVar2);
        return cVar2;
    }

    public boolean a(MotionEvent motionEvent) {
        if (!this.f6263d.isTouchExplorationEnabled() || this.f6267h.isEmpty()) {
            return false;
        }
        f fVarA = f().a(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (fVarA.f6305i != -1) {
            return this.f6264e.onAccessibilityHoverEvent(fVarA.f6298b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            a(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            g();
        } else {
            Log.d("flutter", "unexpected accessibility hover event: " + motionEvent);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.p != null) {
            a(this.p.f6298b, 256);
            this.p = null;
        }
    }

    private void a(float f2, float f3) {
        f fVarA;
        if (this.f6267h.isEmpty() || (fVarA = f().a(new float[]{f2, f3, 0.0f, 1.0f})) == this.p) {
            return;
        }
        if (fVarA != null) {
            a(fVarA.f6298b, 128);
        }
        if (this.p != null) {
            a(this.p.f6298b, 256);
        }
        this.p = fVarA;
    }

    void a(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            c cVarB = b(byteBuffer.getInt());
            cVarB.f6285c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str = null;
            cVarB.f6286d = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str = strArr[i3];
            }
            cVarB.f6287e = str;
        }
    }

    void b(ByteBuffer byteBuffer, String[] strArr) {
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            f fVarA = a(byteBuffer.getInt());
            fVarA.a(byteBuffer, strArr);
            if (!fVarA.a(d.IS_HIDDEN)) {
                if (fVarA.a(d.IS_FOCUSED)) {
                    this.n = fVarA;
                }
                if (fVarA.u) {
                    arrayList.add(fVarA);
                }
            }
        }
        HashSet hashSet = new HashSet();
        f fVarF = f();
        ArrayList<f> arrayList2 = new ArrayList();
        if (fVarF != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if (Build.VERSION.SDK_INT >= 23 && (rootWindowInsets = this.f6261b.getRootWindowInsets()) != null) {
                if (!this.s.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    fVarF.R = true;
                    fVarF.P = true;
                }
                this.s = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, this.s.intValue(), 0.0f, 0.0f);
            }
            fVarF.a(fArr, (Set<f>) hashSet, false);
            fVarF.a(arrayList2);
        }
        f fVar = null;
        for (f fVar2 : arrayList2) {
            if (!this.q.contains(Integer.valueOf(fVar2.f6298b))) {
                fVar = fVar2;
            }
        }
        if (fVar == null && arrayList2.size() > 0) {
            fVar = (f) arrayList2.get(arrayList2.size() - 1);
        }
        if (fVar != null && fVar.f6298b != this.r) {
            this.r = fVar.f6298b;
            c(fVar);
        }
        this.q.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.q.add(Integer.valueOf(((f) it.next()).f6298b));
        }
        Iterator<Map.Entry<Integer, f>> it2 = this.f6267h.entrySet().iterator();
        while (it2.hasNext()) {
            f value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                d(value);
                it2.remove();
            }
        }
        c(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            f fVar3 = (f) it3.next();
            if (fVar3.a()) {
                AccessibilityEvent accessibilityEventB = b(fVar3.f6298b, 4096);
                float f4 = fVar3.l;
                float f5 = fVar3.m;
                if (Float.isInfinite(fVar3.m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(fVar3.n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - fVar3.n;
                    f3 = f4 - fVar3.n;
                }
                if (fVar3.b(b.SCROLL_UP) || fVar3.b(b.SCROLL_DOWN)) {
                    accessibilityEventB.setScrollY((int) f3);
                    accessibilityEventB.setMaxScrollY((int) f2);
                } else if (fVar3.b(b.SCROLL_LEFT) || fVar3.b(b.SCROLL_RIGHT)) {
                    accessibilityEventB.setScrollX((int) f3);
                    accessibilityEventB.setMaxScrollX((int) f2);
                }
                if (fVar3.j > 0) {
                    accessibilityEventB.setItemCount(fVar3.j);
                    accessibilityEventB.setFromIndex(fVar3.k);
                    Iterator it4 = fVar3.L.iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        if (!((f) it4.next()).a(d.IS_HIDDEN)) {
                            i2++;
                        }
                    }
                    accessibilityEventB.setToIndex((fVar3.k + i2) - 1);
                }
                a(accessibilityEventB);
            }
            if (fVar3.a(d.IS_LIVE_REGION) && fVar3.b()) {
                c(fVar3.f6298b);
            }
            if (this.j != null && this.j.f6298b == fVar3.f6298b && !fVar3.b(d.IS_SELECTED) && fVar3.a(d.IS_SELECTED)) {
                AccessibilityEvent accessibilityEventB2 = b(fVar3.f6298b, 4);
                accessibilityEventB2.getText().add(fVar3.o);
                a(accessibilityEventB2);
            }
            if (this.n != null && this.n.f6298b == fVar3.f6298b && (this.o == null || this.o.f6298b != this.n.f6298b)) {
                this.o = this.n;
                a(b(fVar3.f6298b, 8));
            } else if (this.n == null) {
                this.o = null;
            }
            if (this.n != null && this.n.f6298b == fVar3.f6298b && fVar3.b(d.IS_TEXT_FIELD) && fVar3.a(d.IS_TEXT_FIELD) && (this.j == null || this.j.f6298b == this.n.f6298b)) {
                String str = fVar3.C != null ? fVar3.C : "";
                String str2 = fVar3.p != null ? fVar3.p : "";
                AccessibilityEvent accessibilityEventA = a(fVar3.f6298b, str, str2);
                if (accessibilityEventA != null) {
                    a(accessibilityEventA);
                }
                if (fVar3.x != fVar3.f6303g || fVar3.y != fVar3.f6304h) {
                    AccessibilityEvent accessibilityEventB3 = b(fVar3.f6298b, 8192);
                    accessibilityEventB3.getText().add(str2);
                    accessibilityEventB3.setFromIndex(fVar3.f6303g);
                    accessibilityEventB3.setToIndex(fVar3.f6304h);
                    accessibilityEventB3.setItemCount(str2.length());
                    a(accessibilityEventB3);
                }
            }
        }
    }

    private AccessibilityEvent a(int i2, String str, String str2) {
        AccessibilityEvent accessibilityEventB = b(i2, 16);
        accessibilityEventB.setBeforeText(str);
        accessibilityEventB.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 >= str.length() && i3 >= str2.length()) {
            return null;
        }
        accessibilityEventB.setFromIndex(i3);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventB.setRemovedCount((length - i3) + 1);
        accessibilityEventB.setAddedCount((length2 - i3) + 1);
        return accessibilityEventB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, int i3) {
        if (this.f6263d.isEnabled()) {
            a(b(i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AccessibilityEvent accessibilityEvent) {
        if (this.f6263d.isEnabled()) {
            this.f6261b.getParent().requestSendAccessibilityEvent(this.f6261b, accessibilityEvent);
        }
    }

    private void c(f fVar) {
        AccessibilityEvent accessibilityEventB = b(fVar.f6298b, 32);
        accessibilityEventB.getText().add(fVar.f());
        a(accessibilityEventB);
    }

    private void c(int i2) {
        AccessibilityEvent accessibilityEventB = b(i2, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEventB.setContentChangeTypes(1);
        }
        a(accessibilityEventB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent b(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        accessibilityEventObtain.setPackageName(this.f6261b.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f6261b, i2);
        return accessibilityEventObtain;
    }

    private void d(f fVar) {
        fVar.J = null;
        if (this.j == fVar) {
            a(this.j.f6298b, 65536);
            this.j = null;
        }
        if (this.n == fVar) {
            this.n = null;
        }
        if (this.p == fVar) {
            this.p = null;
        }
    }

    public void d() {
        this.f6267h.clear();
        if (this.j != null) {
            a(this.j.f6298b, 65536);
        }
        this.j = null;
        this.p = null;
        c(0);
    }

    public enum b {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576);

        public final int w;

        b(int i2) {
            this.w = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum d {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304);

        final int x;

        d(int i2) {
            this.x = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);


        /* renamed from: e, reason: collision with root package name */
        final int f6273e;

        a(int i2) {
            this.f6273e = i2;
        }
    }

    /* renamed from: io.flutter.view.g$g, reason: collision with other inner class name */
    private enum EnumC0073g {
        UNKNOWN,
        LTR,
        RTL;

        public static EnumC0073g a(int i2) {
            switch (i2) {
                case 1:
                    return RTL;
                case 2:
                    return LTR;
                default:
                    return UNKNOWN;
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private int f6283a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f6284b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f6285c = -1;

        /* renamed from: d, reason: collision with root package name */
        private String f6286d;

        /* renamed from: e, reason: collision with root package name */
        private String f6287e;

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {
        private float A;
        private float B;
        private String C;
        private String D;
        private float E;
        private float F;
        private float G;
        private float H;
        private float[] I;
        private f J;
        private List<c> M;
        private c N;
        private c O;
        private float[] Q;
        private float[] S;
        private Rect T;

        /* renamed from: a, reason: collision with root package name */
        final g f6297a;

        /* renamed from: c, reason: collision with root package name */
        private int f6299c;

        /* renamed from: d, reason: collision with root package name */
        private int f6300d;

        /* renamed from: e, reason: collision with root package name */
        private int f6301e;

        /* renamed from: f, reason: collision with root package name */
        private int f6302f;

        /* renamed from: g, reason: collision with root package name */
        private int f6303g;

        /* renamed from: h, reason: collision with root package name */
        private int f6304h;

        /* renamed from: i, reason: collision with root package name */
        private int f6305i;
        private int j;
        private int k;
        private float l;
        private float m;
        private float n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private EnumC0073g t;
        private int v;
        private int w;
        private int x;
        private int y;
        private float z;

        /* renamed from: b, reason: collision with root package name */
        private int f6298b = -1;
        private boolean u = false;
        private List<f> K = new ArrayList();
        private List<f> L = new ArrayList();
        private boolean P = true;
        private boolean R = true;

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(f fVar, f.a.c.c<f> cVar) {
            return (fVar == null || fVar.a(cVar) == null) ? false : true;
        }

        f(g gVar) {
            this.f6297a = gVar;
        }

        private f a(f.a.c.c<f> cVar) {
            for (f fVar = this.J; fVar != null; fVar = fVar.J) {
                if (cVar.test(fVar)) {
                    return fVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(b bVar) {
            return (bVar.w & this.f6300d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(b bVar) {
            return (bVar.w & this.w) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(d dVar) {
            return (dVar.x & this.f6299c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(d dVar) {
            return (dVar.x & this.v) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return (Float.isNaN(this.l) || Float.isNaN(this.z) || this.z == this.l) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            if (this.o == null && this.D == null) {
                return false;
            }
            return this.o == null || this.D == null || !this.o.equals(this.D);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ByteBuffer byteBuffer, String[] strArr) {
            this.u = true;
            this.C = this.p;
            this.D = this.o;
            this.v = this.f6299c;
            this.w = this.f6300d;
            this.x = this.f6303g;
            this.y = this.f6304h;
            this.z = this.l;
            this.A = this.m;
            this.B = this.n;
            this.f6299c = byteBuffer.getInt();
            this.f6300d = byteBuffer.getInt();
            this.f6301e = byteBuffer.getInt();
            this.f6302f = byteBuffer.getInt();
            this.f6303g = byteBuffer.getInt();
            this.f6304h = byteBuffer.getInt();
            this.f6305i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i2 = byteBuffer.getInt();
            this.o = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            this.p = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            this.q = i4 == -1 ? null : strArr[i4];
            int i5 = byteBuffer.getInt();
            this.r = i5 == -1 ? null : strArr[i5];
            int i6 = byteBuffer.getInt();
            this.s = i6 == -1 ? null : strArr[i6];
            this.t = EnumC0073g.a(byteBuffer.getInt());
            this.E = byteBuffer.getFloat();
            this.F = byteBuffer.getFloat();
            this.G = byteBuffer.getFloat();
            this.H = byteBuffer.getFloat();
            if (this.I == null) {
                this.I = new float[16];
            }
            for (int i7 = 0; i7 < 16; i7++) {
                this.I[i7] = byteBuffer.getFloat();
            }
            this.P = true;
            this.R = true;
            int i8 = byteBuffer.getInt();
            this.K.clear();
            this.L.clear();
            for (int i9 = 0; i9 < i8; i9++) {
                f fVarA = this.f6297a.a(byteBuffer.getInt());
                fVarA.J = this;
                this.K.add(fVarA);
            }
            for (int i10 = 0; i10 < i8; i10++) {
                f fVarA2 = this.f6297a.a(byteBuffer.getInt());
                fVarA2.J = this;
                this.L.add(fVarA2);
            }
            int i11 = byteBuffer.getInt();
            if (i11 == 0) {
                this.M = null;
                return;
            }
            if (this.M == null) {
                this.M = new ArrayList(i11);
            } else {
                this.M.clear();
            }
            for (int i12 = 0; i12 < i11; i12++) {
                c cVarB = this.f6297a.b(byteBuffer.getInt());
                if (cVarB.f6285c != b.TAP.w) {
                    if (cVarB.f6285c == b.LONG_PRESS.w) {
                        this.O = cVarB;
                    } else {
                        this.M.add(cVarB);
                    }
                } else {
                    this.N = cVarB;
                }
                this.M.add(cVarB);
            }
        }

        private void c() {
            if (this.P) {
                this.P = false;
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                if (Matrix.invertM(this.Q, 0, this.I, 0)) {
                    return;
                }
                Arrays.fill(this.Q, 0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect d() {
            return this.T;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public f a(float[] fArr) {
            float f2 = fArr[3];
            float f3 = fArr[0] / f2;
            float f4 = fArr[1] / f2;
            if (f3 < this.E || f3 >= this.G || f4 < this.F || f4 >= this.H) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (f fVar : this.L) {
                if (!fVar.a(d.IS_HIDDEN)) {
                    fVar.c();
                    Matrix.multiplyMV(fArr2, 0, fVar.Q, 0, fArr, 0);
                    f fVarA = fVar.a(fArr2);
                    if (fVarA != null) {
                        return fVarA;
                    }
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            if (a(d.SCOPES_ROUTE)) {
                return false;
            }
            if (a(d.IS_FOCUSABLE)) {
                return true;
            }
            return (((~(((b.SCROLL_RIGHT.w | b.SCROLL_LEFT.w) | b.SCROLL_UP.w) | b.SCROLL_DOWN.w)) & this.f6300d) == 0 && this.f6299c == 0 && (this.o == null || this.o.isEmpty()) && ((this.p == null || this.p.isEmpty()) && (this.s == null || this.s.isEmpty()))) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(List<f> list) {
            if (a(d.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<f> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().a(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String f() {
            if (a(d.NAMES_ROUTE) && this.o != null && !this.o.isEmpty()) {
                return this.o;
            }
            Iterator<f> it = this.K.iterator();
            while (it.hasNext()) {
                String strF = it.next().f();
                if (strF != null && !strF.isEmpty()) {
                    return strF;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(float[] fArr, Set<f> set, boolean z) {
            set.add(this);
            if (this.R) {
                z = true;
            }
            if (z) {
                if (this.S == null) {
                    this.S = new float[16];
                }
                Matrix.multiplyMM(this.S, 0, fArr, 0, this.I, 0);
                float[] fArr2 = {this.E, this.F, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                a(fArr3, this.S, fArr2);
                fArr2[0] = this.G;
                fArr2[1] = this.F;
                a(fArr4, this.S, fArr2);
                fArr2[0] = this.G;
                fArr2[1] = this.H;
                a(fArr5, this.S, fArr2);
                fArr2[0] = this.E;
                fArr2[1] = this.H;
                a(fArr6, this.S, fArr2);
                if (this.T == null) {
                    this.T = new Rect();
                }
                this.T.set(Math.round(a(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(a(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(b(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(b(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.R = false;
            }
            Iterator<f> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().a(this.S, set, z);
            }
        }

        private void a(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f2 = fArr[3];
            fArr[0] = fArr[0] / f2;
            fArr[1] = fArr[1] / f2;
            fArr[2] = fArr[2] / f2;
            fArr[3] = 0.0f;
        }

        private float a(float f2, float f3, float f4, float f5) {
            return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
        }

        private float b(float f2, float f3, float f4, float f5) {
            return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String g() {
            StringBuilder sb = new StringBuilder();
            for (String str : new String[]{this.p, this.o, this.s}) {
                if (str != null && str.length() > 0) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }
    }

    public boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f6264e.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f6264e.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.l = recordFlutterId;
            this.n = null;
            return true;
        }
        if (eventType == 128) {
            this.p = null;
            return true;
        }
        if (eventType == 32768) {
            this.k = recordFlutterId;
            this.j = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.l = null;
        this.k = null;
        return true;
    }
}
