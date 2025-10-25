package c.d.a.b.f.a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC0343c;
import com.google.android.gms.common.internal.AbstractC0348h;
import com.google.android.gms.common.internal.C0344d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;

/* loaded from: classes.dex */
public class a extends AbstractC0348h<g> implements c.d.a.b.f.e {
    private final boolean G;
    private final C0344d H;
    private final Bundle I;
    private Integer J;

    private a(Context context, Looper looper, boolean z, C0344d c0344d, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, c0344d, aVar, bVar);
        this.G = true;
        this.H = c0344d;
        this.I = bundle;
        this.J = c0344d.h();
    }

    @Override // com.google.android.gms.common.api.a.f
    public int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected String i() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected String k() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public a(Context context, Looper looper, boolean z, C0344d c0344d, c.d.a.b.f.a aVar, e.a aVar2, e.b bVar) {
        this(context, looper, true, c0344d, a(c0344d), aVar2, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c, com.google.android.gms.common.api.a.f
    public boolean g() {
        return this.G;
    }

    @Override // c.d.a.b.f.e
    public final void a(e eVar) {
        t.a(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.H.b();
            ((g) s()).a(new i(new u(accountB, this.J.intValue(), "<<default account>>".equals(accountB.name) ? com.google.android.gms.auth.api.signin.a.a.a(m()).a() : null)), eVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.a(new k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected Bundle p() {
        if (!m().getPackageName().equals(this.H.e())) {
            this.I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.H.e());
        }
        return this.I;
    }

    @Override // c.d.a.b.f.e
    public final void connect() {
        a(new AbstractC0343c.d());
    }

    public static Bundle a(C0344d c0344d) {
        c.d.a.b.f.a aVarG = c0344d.g();
        Integer numH = c0344d.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0344d.a());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        if (aVarG != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVarG.a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVarG.b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVarG.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVarG.d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVarG.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVarG.f());
            if (aVarG.g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", aVarG.g().longValue());
            }
            if (aVarG.h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", aVarG.h().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0343c
    protected /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof g) {
            return (g) iInterfaceQueryLocalInterface;
        }
        return new h(iBinder);
    }
}
