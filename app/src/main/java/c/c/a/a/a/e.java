package c.c.a.a.a;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class e {
    public static c a(InputStream inputStream) {
        c hVar;
        k kVarA = k.a((byte) inputStream.read());
        switch (d.f1323a[kVarA.ordinal()]) {
            case 1:
                hVar = new h();
                break;
            case 2:
                hVar = new b();
                break;
            case 3:
                hVar = new j();
                break;
            case 4:
                hVar = new i();
                break;
            case 5:
                return new g();
            case 6:
                return new l();
            case 7:
                hVar = new f();
                break;
            case 8:
                hVar = new a();
                break;
            default:
                throw new IOException("Unknown/unimplemented AMF data type: " + kVarA);
        }
        hVar.a(inputStream);
        return hVar;
    }
}
