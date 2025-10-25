package io.flutter.embedding.engine.a;

import f.a.a.a.e;
import f.a.a.a.t;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class a implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f5968a;

    a(b bVar) {
        this.f5968a = bVar;
    }

    @Override // f.a.a.a.e.a
    public void a(ByteBuffer byteBuffer, e.b bVar) {
        this.f5968a.f5974f = t.f5680b.a(byteBuffer);
        if (this.f5968a.f5975g != null) {
            this.f5968a.f5975g.a(this.f5968a.f5974f);
        }
    }
}
