package c.d.a.a.b;

import android.media.AudioTrack;

/* loaded from: classes.dex */
class v extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AudioTrack f1623a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f1624b;

    v(x xVar, AudioTrack audioTrack) {
        this.f1624b = xVar;
        this.f1623a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f1623a.flush();
            this.f1623a.release();
        } finally {
            this.f1624b.j.open();
        }
    }
}
