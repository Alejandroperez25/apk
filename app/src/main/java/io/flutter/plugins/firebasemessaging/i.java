package io.flutter.plugins.firebasemessaging;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.messaging.c f6222a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f6223b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FlutterFirebaseMessagingService f6224c;

    i(FlutterFirebaseMessagingService flutterFirebaseMessagingService, com.google.firebase.messaging.c cVar, CountDownLatch countDownLatch) {
        this.f6224c = flutterFirebaseMessagingService;
        this.f6222a = cVar;
        this.f6223b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        FlutterFirebaseMessagingService.b(this.f6224c, this.f6222a, this.f6223b);
    }
}
