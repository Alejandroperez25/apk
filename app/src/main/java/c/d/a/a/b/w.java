package c.d.a.a.b;

import android.media.AudioTrack;

/* loaded from: classes.dex */
class w extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AudioTrack f1625a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f1626b;

    w(x xVar, AudioTrack audioTrack) {
        this.f1626b = xVar;
        this.f1625a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f1625a.release();
    }
}
