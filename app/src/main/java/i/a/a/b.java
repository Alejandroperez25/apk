package i.a.a;

import android.content.Context;
import android.os.Handler;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class b implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5908a = Logger.getLogger(b.class.getCanonicalName());

    /* renamed from: b, reason: collision with root package name */
    private final o f5909b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, c> f5910c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Handler f5911d = new Handler();

    /* renamed from: e, reason: collision with root package name */
    private Runnable f5912e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f5913f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5914g;

    public static void a(q.d dVar) {
        o oVar = new o(dVar.f(), "xyz.luan/audioplayers");
        oVar.a(new b(oVar, dVar.e()));
    }

    private b(o oVar, Context context) {
        this.f5909b = oVar;
        this.f5909b.a(this);
        this.f5913f = context;
        this.f5914g = false;
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        try {
            b(mVar, dVar);
        } catch (Exception e2) {
            f5908a.log(Level.SEVERE, "Unexpected error!", (Throwable) e2);
            dVar.a("Unexpected error!", e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(f.a.a.a.m r11, f.a.a.a.o.d r12) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.a.b.b(f.a.a.a.m, f.a.a.a.o$d):void");
    }

    private c a(String str, String str2) {
        if (!this.f5910c.containsKey(str)) {
            this.f5910c.put(str, str2.equalsIgnoreCase("PlayerMode.MEDIA_PLAYER") ? new e(this, str) : new g(this, str));
        }
        return this.f5910c.get(str);
    }

    public void a(c cVar) {
        a();
    }

    public void b(c cVar) {
        this.f5909b.a("audio.onDuration", b(cVar.a(), Integer.valueOf(cVar.e())));
    }

    public void c(c cVar) {
        this.f5909b.a("audio.onComplete", b(cVar.a(), (Object) true));
    }

    public void d(c cVar) {
        this.f5914g = true;
    }

    private void a() {
        if (this.f5912e != null) {
            return;
        }
        this.f5912e = new a(this.f5910c, this.f5909b, this.f5911d, this);
        this.f5911d.post(this.f5912e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f5912e = null;
        this.f5911d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(String str, Object obj) {
        HashMap map = new HashMap();
        map.put("playerId", str);
        map.put("value", obj);
        return map;
    }

    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Map<String, c>> f5915a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<o> f5916b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference<Handler> f5917c;

        /* renamed from: d, reason: collision with root package name */
        private final WeakReference<b> f5918d;

        private a(Map<String, c> map, o oVar, Handler handler, b bVar) {
            this.f5915a = new WeakReference<>(map);
            this.f5916b = new WeakReference<>(oVar);
            this.f5917c = new WeakReference<>(handler);
            this.f5918d = new WeakReference<>(bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, c> map = this.f5915a.get();
            o oVar = this.f5916b.get();
            Handler handler = this.f5917c.get();
            b bVar = this.f5918d.get();
            if (map == null || oVar == null || handler == null || bVar == null) {
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            }
            boolean z = true;
            for (c cVar : map.values()) {
                if (cVar.g()) {
                    try {
                        String strA = cVar.a();
                        int iE = cVar.e();
                        int iF = cVar.f();
                        oVar.a("audio.onDuration", b.b(strA, Integer.valueOf(iE)));
                        oVar.a("audio.onCurrentPosition", b.b(strA, Integer.valueOf(iF)));
                        if (bVar.f5914g) {
                            oVar.a("audio.onSeekComplete", b.b(cVar.a(), (Object) true));
                            bVar.f5914g = false;
                        }
                    } catch (UnsupportedOperationException unused) {
                    }
                    z = false;
                }
            }
            if (z) {
                bVar.b();
            } else {
                handler.postDelayed(this, 200L);
            }
        }
    }
}
