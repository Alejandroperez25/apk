package com.google.firebase.auth.a.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b.a.a$i;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC0348h;
import com.google.android.gms.common.internal.C0344d;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
public final class wa extends AbstractC0348h<Ca> implements xa {
    private static c.d.a.b.b.a.a G = new c.d.a.b.b.a.a("FirebaseAuth", "FirebaseAuth:");
    private final Context H;
    private final Ha I;

    public wa(Context context, Looper looper, C0344d c0344d, Ha ha, e.a aVar, e.b bVar) {
        super(context, looper, a$i.AppCompatTheme_windowActionBarOverlay, c0344d, aVar, bVar);
        com.google.android.gms.common.internal.t.a(context);
        this.H = context;
        this.I = ha;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected final String i() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected final String k() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.google.android.gms.common.internal.AbstractC0343c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.String j() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            java.lang.String r0 = "firebear.preference"
            java.lang.String r0 = com.google.firebase.auth.a.a.Ua.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            java.lang.String r0 = "default"
        Le:
            int r1 = r0.hashCode()
            r2 = 103145323(0x625df6b, float:3.1197192E-35)
            r3 = -1
            r4 = 0
            if (r1 == r2) goto L29
            r5 = 1544803905(0x5c13d641, float:1.66449585E17)
            if (r1 == r5) goto L1f
            goto L33
        L1f:
            java.lang.String r1 = "default"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r1 = 1
            goto L34
        L29:
            java.lang.String r1 = "local"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r1 = 0
            goto L34
        L33:
            r1 = -1
        L34:
            switch(r1) {
                case 0: goto L39;
                case 1: goto L39;
                default: goto L37;
            }
        L37:
            java.lang.String r0 = "default"
        L39:
            int r1 = r0.hashCode()
            if (r1 == r2) goto L40
            goto L49
        L40:
            java.lang.String r1 = "local"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L49
            r3 = 0
        L49:
            if (r3 == 0) goto L76
            c.d.a.b.b.a.a r0 = com.google.firebase.auth.a.a.wa.G
            java.lang.String r1 = "Loading module via FirebaseOptions."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.b(r1, r2)
            com.google.firebase.auth.a.a.Ha r0 = r6.I
            boolean r0 = r0.f5276a
            if (r0 == 0) goto L6a
            c.d.a.b.b.a.a r0 = com.google.firebase.auth.a.a.wa.G
            java.lang.String r1 = "Preparing to create service connection to fallback implementation"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.b(r1, r2)
            android.content.Context r0 = r6.H
            java.lang.String r0 = r0.getPackageName()
            return r0
        L6a:
            c.d.a.b.b.a.a r0 = com.google.firebase.auth.a.a.wa.G
            java.lang.String r1 = "Preparing to create service connection to gms implementation"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.b(r1, r2)
            java.lang.String r0 = "com.google.android.gms"
            return r0
        L76:
            c.d.a.b.b.a.a r0 = com.google.firebase.auth.a.a.wa.G
            java.lang.String r1 = "Loading fallback module override."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.b(r1, r2)
            android.content.Context r0 = r6.H
            java.lang.String r0 = r0.getPackageName()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.a.a.wa.j():java.lang.String");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c, com.google.android.gms.common.api.a.f
    public final boolean d() {
        return DynamiteModule.a(this.H, "com.google.firebase.auth") == 0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected final Bundle p() {
        Bundle bundleP = super.p();
        if (bundleP == null) {
            bundleP = new Bundle();
        }
        if (this.I != null) {
            bundleP.putString("com.google.firebase.auth.API_KEY", this.I.c());
        }
        bundleP.putString("com.google.firebase.auth.LIBRARY_VERSION", Ia.a());
        return bundleP;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    public final c.d.a.b.b.c[] o() {
        return c.d.a.b.e.c.Ha.f3814d;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        if (iInterfaceQueryLocalInterface instanceof Ca) {
            return (Ca) iInterfaceQueryLocalInterface;
        }
        return new Da(iBinder);
    }

    @Override // com.google.firebase.auth.a.a.xa
    public final /* synthetic */ Ca h() {
        return (Ca) super.s();
    }
}
