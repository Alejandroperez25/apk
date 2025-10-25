package io.flutter.plugins.firebasemessaging;

import f.a.a.a.o;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
class j implements o.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f6225a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f6226b;

    j(k kVar, CountDownLatch countDownLatch) {
        this.f6226b = kVar;
        this.f6225a = countDownLatch;
    }

    @Override // f.a.a.a.o.d
    public void a(Object obj) {
        this.f6225a.countDown();
    }

    @Override // f.a.a.a.o.d
    public void a(String str, String str2, Object obj) {
        this.f6225a.countDown();
    }

    @Override // f.a.a.a.o.d
    public void a() {
        this.f6225a.countDown();
    }
}
