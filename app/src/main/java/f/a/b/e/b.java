package f.a.b.e;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(19)
/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<DisplayManager.DisplayListener> f5813a;

    b() {
    }

    void a(DisplayManager displayManager) {
        this.f5813a = c(displayManager);
    }

    void b(DisplayManager displayManager) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        ArrayList<DisplayManager.DisplayListener> arrayListC = c(displayManager);
        arrayListC.removeAll(this.f5813a);
        if (arrayListC.isEmpty()) {
            return;
        }
        Iterator<DisplayManager.DisplayListener> it = arrayListC.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener(it.next());
            displayManager.registerDisplayListener(new a(this, arrayListC, displayManager), null);
        }
    }

    private static ArrayList<DisplayManager.DisplayListener> c(DisplayManager displayManager) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e2);
            return new ArrayList<>();
        }
    }
}
