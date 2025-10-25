package h.a.a;

import android.os.Process;
import android.util.Log;
import h.a.a.h;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5865a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f5866b;

    f(h hVar, String str) {
        this.f5866b = hVar;
        this.f5865a = str;
    }

    @Override // java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(-1);
        if (this.f5866b.b(this.f5865a)) {
            this.f5866b.q = this.f5866b.p;
            this.f5866b.k.d();
            while (!Thread.interrupted()) {
                try {
                    h.c cVar = (h.c) this.f5866b.j.poll(1L, TimeUnit.SECONDS);
                    if (cVar == null) {
                        Log.i("SrsFlvMuxer", "Skipping iteration, frame null");
                    } else if (cVar.b()) {
                        if (cVar.c()) {
                            this.f5866b.f5874f = cVar;
                            this.f5866b.a(this.f5866b.f5874f);
                        } else if (cVar.d()) {
                            this.f5866b.f5875g = cVar;
                            this.f5866b.a(this.f5866b.f5875g);
                        }
                    } else if (cVar.c() && this.f5866b.f5874f != null) {
                        this.f5866b.a(cVar);
                    } else if (cVar.d() && this.f5866b.f5875g != null) {
                        this.f5866b.a(cVar);
                    }
                } catch (InterruptedException unused) {
                    this.f5866b.f5871c.interrupt();
                }
            }
        }
    }
}
