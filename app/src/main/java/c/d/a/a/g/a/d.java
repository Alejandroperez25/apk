package c.d.a.a.g.a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f2403a = new ByteArrayOutputStream(512);

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f2404b = new DataOutputStream(this.f2403a);

    public byte[] a(b bVar) throws IOException {
        this.f2403a.reset();
        try {
            a(this.f2404b, bVar.f2397a);
            a(this.f2404b, bVar.f2398b != null ? bVar.f2398b : "");
            a(this.f2404b, 1000L);
            a(this.f2404b, 0L);
            a(this.f2404b, bVar.f2399c);
            a(this.f2404b, bVar.f2400d);
            this.f2404b.write(bVar.f2401e);
            this.f2404b.flush();
            return this.f2403a.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    private static void a(DataOutputStream dataOutputStream, long j) throws IOException {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
