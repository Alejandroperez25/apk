package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0002a extends Binder implements a {
        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof a)) {
                return (a) iInterfaceQueryLocalInterface;
            }
            return new C0003a(iBinder);
        }

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        private static class C0003a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f67a;

            C0003a(IBinder iBinder) {
                this.f67a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f67a;
            }
        }
    }
}
