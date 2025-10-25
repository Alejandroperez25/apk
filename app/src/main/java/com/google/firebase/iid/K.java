package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    private Messenger f5488a;

    /* renamed from: b, reason: collision with root package name */
    private T f5489b;

    public static final class a extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.b()) {
                return K.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return K.class;
        }
    }

    public K(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f5488a = new Messenger(iBinder);
        } else {
            this.f5489b = new W(iBinder);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void a(Message message) throws RemoteException {
        if (this.f5488a != null) {
            this.f5488a.send(message);
        } else {
            this.f5489b.a(message);
        }
    }

    private final IBinder f() {
        return this.f5488a != null ? this.f5488a.getBinder() : this.f5489b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return f().equals(((K) obj).f());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return f().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (this.f5488a != null) {
            parcel.writeStrongBinder(this.f5488a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f5489b.asBinder());
        }
    }
}
