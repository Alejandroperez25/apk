package io.flutter.embedding.engine.a;

import f.a.a.a.e;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class c implements e, d {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f5978a;

    /* renamed from: d, reason: collision with root package name */
    private int f5981d = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, e.a> f5979b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, e.b> f5980c = new HashMap();

    c(FlutterJNI flutterJNI) {
        this.f5978a = flutterJNI;
    }

    @Override // f.a.a.a.e
    public void a(String str, e.a aVar) {
        if (aVar == null) {
            f.a.a.a("DartMessenger", "Removing handler for channel '" + str + "'");
            this.f5979b.remove(str);
            return;
        }
        f.a.a.a("DartMessenger", "Setting handler for channel '" + str + "'");
        this.f5979b.put(str, aVar);
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer) {
        f.a.a.a("DartMessenger", "Sending message over channel '" + str + "'");
        a(str, byteBuffer, (e.b) null);
    }

    @Override // f.a.a.a.e
    public void a(String str, ByteBuffer byteBuffer, e.b bVar) {
        int i2;
        f.a.a.a("DartMessenger", "Sending message with callback over channel '" + str + "'");
        if (bVar != null) {
            i2 = this.f5981d;
            this.f5981d = i2 + 1;
            this.f5980c.put(Integer.valueOf(i2), bVar);
        } else {
            i2 = 0;
        }
        if (byteBuffer == null) {
            this.f5978a.dispatchEmptyPlatformMessage(str, i2);
        } else {
            this.f5978a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
        }
    }

    @Override // io.flutter.embedding.engine.a.d
    public void a(String str, byte[] bArr, int i2) {
        f.a.a.a("DartMessenger", "Received message from Dart over channel '" + str + "'");
        e.a aVar = this.f5979b.get(str);
        if (aVar != null) {
            try {
                f.a.a.a("DartMessenger", "Deferring to registered handler to process message.");
                aVar.a(bArr == null ? null : ByteBuffer.wrap(bArr), new a(this.f5978a, i2));
                return;
            } catch (Exception e2) {
                f.a.a.a("DartMessenger", "Uncaught exception in binary message listener", e2);
                this.f5978a.invokePlatformMessageEmptyResponseCallback(i2);
                return;
            }
        }
        f.a.a.a("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        this.f5978a.invokePlatformMessageEmptyResponseCallback(i2);
    }

    @Override // io.flutter.embedding.engine.a.d
    public void a(int i2, byte[] bArr) {
        f.a.a.a("DartMessenger", "Received message reply from Dart.");
        e.b bVarRemove = this.f5980c.remove(Integer.valueOf(i2));
        if (bVarRemove != null) {
            try {
                f.a.a.a("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVarRemove.a(bArr == null ? null : ByteBuffer.wrap(bArr));
            } catch (Exception e2) {
                f.a.a.a("DartMessenger", "Uncaught exception in binary message reply handler", e2);
            }
        }
    }

    private static class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        private final FlutterJNI f5982a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5983b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f5984c = new AtomicBoolean(false);

        a(FlutterJNI flutterJNI, int i2) {
            this.f5982a = flutterJNI;
            this.f5983b = i2;
        }

        @Override // f.a.a.a.e.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f5984c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f5982a.invokePlatformMessageEmptyResponseCallback(this.f5983b);
            } else {
                this.f5982a.invokePlatformMessageResponseCallback(this.f5983b, byteBuffer, byteBuffer.position());
            }
        }
    }
}
