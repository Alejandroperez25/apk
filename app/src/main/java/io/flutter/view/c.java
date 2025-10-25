package io.flutter.view;

import android.view.accessibility.AccessibilityEvent;
import io.flutter.embedding.engine.e.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f6255a;

    c(g gVar) {
        this.f6255a = gVar;
    }

    @Override // io.flutter.embedding.engine.e.b.a
    public void a(String str) {
        this.f6255a.f6261b.announceForAccessibility(str);
    }

    @Override // io.flutter.embedding.engine.e.b.a
    public void a(int i2) {
        this.f6255a.a(i2, 1);
    }

    @Override // io.flutter.embedding.engine.e.b.a
    public void b(int i2) {
        this.f6255a.a(i2, 2);
    }

    @Override // io.flutter.embedding.engine.e.b.a
    public void b(String str) {
        AccessibilityEvent accessibilityEventB = this.f6255a.b(0, 32);
        accessibilityEventB.getText().add(str);
        this.f6255a.a(accessibilityEventB);
    }

    @Override // io.flutter.embedding.engine.FlutterJNI.a
    public void a(ByteBuffer byteBuffer, String[] strArr) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.f6255a.a(byteBuffer, strArr);
    }

    @Override // io.flutter.embedding.engine.FlutterJNI.a
    public void b(ByteBuffer byteBuffer, String[] strArr) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.f6255a.b(byteBuffer, strArr);
    }
}
