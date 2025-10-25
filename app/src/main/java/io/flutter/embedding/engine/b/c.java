package io.flutter.embedding.engine.b;

import android.os.AsyncTask;
import io.flutter.embedding.engine.b.d;

/* loaded from: classes.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d.a f5996a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f5997b;

    c(d dVar, d.a aVar) {
        this.f5997b = dVar;
        this.f5996a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5996a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
