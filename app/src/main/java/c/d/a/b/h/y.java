package c.d.a.b.h;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h f4060a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ x f4061b;

    y(x xVar, h hVar) {
        this.f4061b = xVar;
        this.f4060a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVarA = this.f4061b.f4058b.a(this.f4060a.d());
            if (hVarA == null) {
                this.f4061b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            hVarA.a(j.f4025b, (e) this.f4061b);
            hVarA.a(j.f4025b, (InterfaceC0230d) this.f4061b);
            hVarA.a(j.f4025b, (InterfaceC0228b) this.f4061b);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4061b.a((Exception) e2.getCause());
            } else {
                this.f4061b.a((Exception) e2);
            }
        } catch (CancellationException unused) {
            this.f4061b.a();
        } catch (Exception e3) {
            this.f4061b.a(e3);
        }
    }
}
