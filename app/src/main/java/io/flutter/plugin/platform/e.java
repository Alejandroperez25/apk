package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.e.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f6153a;

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.i f6154b;

    /* renamed from: c, reason: collision with root package name */
    private i.h f6155c;

    /* renamed from: d, reason: collision with root package name */
    private int f6156d;

    /* renamed from: e, reason: collision with root package name */
    private final i.f f6157e = new c(this);

    public e(Activity activity, io.flutter.embedding.engine.e.i iVar) {
        this.f6153a = activity;
        this.f6154b = iVar;
        this.f6154b.a(this.f6157e);
        this.f6156d = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i.g gVar) {
        if (gVar == i.g.CLICK) {
            this.f6153a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    void a(i.e eVar) {
        View decorView = this.f6153a.getWindow().getDecorView();
        switch (d.f6150a[eVar.ordinal()]) {
            case 1:
                decorView.performHapticFeedback(0);
                break;
            case 2:
                decorView.performHapticFeedback(1);
                break;
            case 3:
                decorView.performHapticFeedback(3);
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 23) {
                    decorView.performHapticFeedback(6);
                    break;
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 21) {
                    decorView.performHapticFeedback(4);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        this.f6153a.setRequestedOrientation(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i.a aVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 && Build.VERSION.SDK_INT > 21) {
            this.f6153a.setTaskDescription(new ActivityManager.TaskDescription(aVar.f6037b, (Bitmap) null, aVar.f6036a));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6153a.setTaskDescription(new ActivityManager.TaskDescription(aVar.f6037b, 0, aVar.f6036a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i.EnumC0072i> list) {
        int i2 = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i3 = 0; i3 < list.size(); i3++) {
            switch (d.f6151b[list.get(i3).ordinal()]) {
                case 1:
                    i2 &= -5;
                    break;
                case 2:
                    i2 = i2 & (-513) & (-3);
                    break;
            }
        }
        this.f6156d = i2;
        a();
    }

    public void a() {
        this.f6153a.getWindow().getDecorView().setSystemUiVisibility(this.f6156d);
        if (this.f6155c != null) {
            a(this.f6155c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i.h hVar) {
        Window window = this.f6153a.getWindow();
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 26) {
            if (hVar.f6064d != null) {
                switch (d.f6152c[hVar.f6064d.ordinal()]) {
                    case 1:
                        systemUiVisibility |= 16;
                        break;
                    case 2:
                        systemUiVisibility &= -17;
                        break;
                }
            }
            if (hVar.f6063c != null) {
                window.setNavigationBarColor(hVar.f6063c.intValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (hVar.f6062b != null) {
                switch (d.f6152c[hVar.f6062b.ordinal()]) {
                    case 1:
                        systemUiVisibility |= 8192;
                        break;
                    case 2:
                        systemUiVisibility &= -8193;
                        break;
                }
            }
            if (hVar.f6061a != null) {
                window.setStatusBarColor(hVar.f6061a.intValue());
            }
        }
        Integer num = hVar.f6065e;
        decorView.setSystemUiVisibility(systemUiVisibility);
        this.f6155c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f6153a.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence a(i.c cVar) {
        ClipData primaryClip = ((ClipboardManager) this.f6153a.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null) {
            return null;
        }
        if (cVar == null || cVar == i.c.PLAIN_TEXT) {
            return primaryClip.getItemAt(0).coerceToText(this.f6153a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ((ClipboardManager) this.f6153a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Rect> d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f6153a.getWindow().getDecorView().getSystemGestureExclusionRects();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<Rect> arrayList) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f6153a.getWindow().getDecorView().setSystemGestureExclusionRects(arrayList);
    }
}
