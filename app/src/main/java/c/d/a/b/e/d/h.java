package c.d.a.b.e.d;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class h extends OutputStream {
    h() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        g.a(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        g.a(bArr);
    }
}
