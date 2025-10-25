package f.a.b.e;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class a implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f5810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DisplayManager f5811b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f5812c;

    a(b bVar, ArrayList arrayList, DisplayManager displayManager) {
        this.f5812c = bVar;
        this.f5810a = arrayList;
        this.f5811b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i2) {
        Iterator it = this.f5810a.iterator();
        while (it.hasNext()) {
            ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i2);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i2) {
        Iterator it = this.f5810a.iterator();
        while (it.hasNext()) {
            ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i2);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i2) {
        if (this.f5811b.getDisplay(i2) == null) {
            return;
        }
        Iterator it = this.f5810a.iterator();
        while (it.hasNext()) {
            ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i2);
        }
    }
}
