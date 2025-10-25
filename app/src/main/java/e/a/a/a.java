package e.a.a;

import android.os.Vibrator;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;

/* loaded from: classes.dex */
public class a implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private Vibrator f5641a;

    private a(q.d dVar) {
        this.f5641a = (Vibrator) dVar.b().getSystemService("vibrator");
    }

    public static void a(q.d dVar) {
        new o(dVar.f(), "vibrate").a(new a(dVar));
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        if (mVar.f5663a.equals("vibrate")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(((Integer) mVar.a("duration")).intValue());
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("canVibrate")) {
            dVar.a(Boolean.valueOf(this.f5641a.hasVibrator()));
            return;
        }
        if (mVar.f5663a.equals("impact")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(1L);
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("selection")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(3L);
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("success")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(50);
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("warning")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(250);
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("error")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(500);
            }
            dVar.a(null);
            return;
        }
        if (mVar.f5663a.equals("heavy")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(100);
            }
            dVar.a(null);
        } else if (mVar.f5663a.equals("medium")) {
            if (this.f5641a.hasVibrator()) {
                this.f5641a.vibrate(40);
            }
            dVar.a(null);
        } else {
            if (mVar.f5663a.equals("light")) {
                if (this.f5641a.hasVibrator()) {
                    this.f5641a.vibrate(10);
                }
                dVar.a(null);
                return;
            }
            dVar.a();
        }
    }
}
