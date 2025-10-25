package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class h {

    /* renamed from: b, reason: collision with root package name */
    private static Field f524b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f525c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f523a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f526d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f523a) {
            if (f525c) {
                return null;
            }
            try {
                if (f524b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f525c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f524b = declaredField;
                }
                Bundle bundle = (Bundle) f524b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f524b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f525c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f525c = true;
                return null;
            }
        }
    }

    public static Bundle a(Notification.Builder builder, f.a aVar) {
        builder.addAction(aVar.a(), aVar.b(), aVar.c());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", a(aVar.f()));
        }
        if (aVar.h() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.h()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.e());
        return bundle;
    }

    static Bundle a(f.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", aVar.a());
        bundle2.putCharSequence("title", aVar.b());
        bundle2.putParcelable("actionIntent", aVar.c());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.e());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", a(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.i());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    private static Bundle a(i iVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", iVar.a());
        bundle.putCharSequence("label", iVar.b());
        bundle.putCharSequenceArray("choices", iVar.c());
        bundle.putBoolean("allowFreeFormInput", iVar.e());
        bundle.putBundle("extras", iVar.f());
        Set<String> setD = iVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] a(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[iVarArr.length];
        for (int i2 = 0; i2 < iVarArr.length; i2++) {
            bundleArr[i2] = a(iVarArr[i2]);
        }
        return bundleArr;
    }
}
