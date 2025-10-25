package c.c.a.a.b;

import android.util.Log;
import c.c.a.a.c.i;
import c.c.a.a.c.j;
import c.c.a.a.c.k;
import c.c.a.a.c.l;
import c.c.a.a.c.m;
import c.c.a.a.c.o;
import c.c.a.a.c.p;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private h f1360a;

    public g(h hVar) {
        this.f1360a = hVar;
    }

    public j a(InputStream inputStream) throws IOException {
        j aVar;
        i iVarA = i.a(inputStream, this.f1360a);
        a aVarA = this.f1360a.a(iVarA.a());
        aVarA.a(iVarA);
        if (iVarA.b() > this.f1360a.a()) {
            if (!aVarA.a(inputStream, this.f1360a.a())) {
                return null;
            }
            inputStream = aVarA.f();
        }
        switch (f.f1359a[iVarA.c().ordinal()]) {
            case 1:
                k kVar = new k(iVarA);
                kVar.a(inputStream);
                Log.d("RtmpDecoder", "readPacket(): Setting chunk size to: " + kVar.d());
                this.f1360a.c(kVar.d());
                return null;
            case 2:
                aVar = new c.c.a.a.c.a(iVarA);
                break;
            case 3:
                aVar = new m(iVarA);
                break;
            case 4:
                aVar = new p(iVarA);
                break;
            case 5:
                aVar = new l(iVarA);
                break;
            case 6:
                aVar = new c.c.a.a.c.c(iVarA);
                break;
            case 7:
                aVar = new o(iVarA);
                break;
            case 8:
                aVar = new c.c.a.a.c.d(iVarA);
                break;
            case 9:
                aVar = new c.c.a.a.c.f(iVarA);
                break;
            case 10:
                aVar = new c.c.a.a.c.b(iVarA);
                break;
            default:
                throw new IOException("No packet body implementation for message type: " + iVarA.c());
        }
        aVar.a(inputStream);
        return aVar;
    }
}
