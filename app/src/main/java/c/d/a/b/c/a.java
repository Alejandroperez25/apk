package c.d.a.b.c;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c.d.a.b.c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0044a extends c.d.a.b.e.b.b implements a {

        /* renamed from: c.d.a.b.c.a$a$a, reason: collision with other inner class name */
        public static class C0045a extends c.d.a.b.e.b.a implements a {
            C0045a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0044a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iInterfaceQueryLocalInterface instanceof a) {
                return (a) iInterfaceQueryLocalInterface;
            }
            return new C0045a(iBinder);
        }
    }
}
