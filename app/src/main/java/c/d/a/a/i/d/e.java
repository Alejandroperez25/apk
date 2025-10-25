package c.d.a.a.i.d;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import c.d.a.a.e.h.C0138e;
import c.d.a.a.e.h.C0140g;
import c.d.a.a.e.h.C0142i;
import c.d.a.a.e.h.F;
import c.d.a.a.m.E;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    private final int f2813a;

    public e() {
        this(0);
    }

    public e(int i2) {
        this.f2813a = i2;
    }

    @Override // c.d.a.a.i.d.h
    public Pair<c.d.a.a.e.g, Boolean> a(c.d.a.a.e.g gVar, Uri uri, c.d.a.a.q qVar, List<c.d.a.a.q> list, c.d.a.a.d.f fVar, E e2, Map<String, List<String>> map, c.d.a.a.e.h hVar) {
        if (gVar != null) {
            if ((gVar instanceof F) || (gVar instanceof c.d.a.a.e.e.h)) {
                return a(gVar);
            }
            if (gVar instanceof r) {
                return a(new r(qVar.z, e2));
            }
            if (gVar instanceof C0140g) {
                return a(new C0140g());
            }
            if (gVar instanceof C0138e) {
                return a(new C0138e());
            }
            if (gVar instanceof c.d.a.a.e.d.e) {
                return a(new c.d.a.a.e.d.e());
            }
            throw new IllegalArgumentException("Unexpected previousExtractor type: " + gVar.getClass().getSimpleName());
        }
        c.d.a.a.e.g gVarA = a(uri, qVar, list, fVar, e2);
        hVar.b();
        if (a(gVarA, hVar)) {
            return a(gVarA);
        }
        if (!(gVarA instanceof r)) {
            r rVar = new r(qVar.z, e2);
            if (a(rVar, hVar)) {
                return a(rVar);
            }
        }
        if (!(gVarA instanceof C0140g)) {
            C0140g c0140g = new C0140g();
            if (a(c0140g, hVar)) {
                return a(c0140g);
            }
        }
        if (!(gVarA instanceof C0138e)) {
            C0138e c0138e = new C0138e();
            if (a(c0138e, hVar)) {
                return a(c0138e);
            }
        }
        if (!(gVarA instanceof c.d.a.a.e.d.e)) {
            c.d.a.a.e.d.e eVar = new c.d.a.a.e.d.e(0, 0L);
            if (a(eVar, hVar)) {
                return a(eVar);
            }
        }
        if (!(gVarA instanceof c.d.a.a.e.e.h)) {
            c.d.a.a.e.e.h hVar2 = new c.d.a.a.e.e.h(0, e2, null, fVar, list != null ? list : Collections.emptyList());
            if (a(hVar2, hVar)) {
                return a(hVar2);
            }
        }
        if (!(gVarA instanceof F)) {
            F fA = a(this.f2813a, qVar, list, e2);
            if (a(fA, hVar)) {
                return a(fA);
            }
        }
        return a(gVarA);
    }

    private c.d.a.a.e.g a(Uri uri, c.d.a.a.q qVar, List<c.d.a.a.q> list, c.d.a.a.d.f fVar, E e2) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(qVar.f3682g) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            return new r(qVar.z, e2);
        }
        if (lastPathSegment.endsWith(".aac")) {
            return new C0140g();
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return new C0138e();
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return new c.d.a.a.e.d.e(0, 0L);
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            if (list == null) {
                list = Collections.emptyList();
            }
            return new c.d.a.a.e.e.h(0, e2, null, fVar, list);
        }
        return a(this.f2813a, qVar, list, e2);
    }

    private static F a(int i2, c.d.a.a.q qVar, List<c.d.a.a.q> list, E e2) {
        int i3 = i2 | 16;
        if (list != null) {
            i3 |= 32;
        } else {
            list = Collections.singletonList(c.d.a.a.q.a(null, "application/cea-608", 0, null));
        }
        String str = qVar.f3679d;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(c.d.a.a.m.r.e(str))) {
                i3 |= 2;
            }
            if (!"video/avc".equals(c.d.a.a.m.r.d(str))) {
                i3 |= 4;
            }
        }
        return new F(2, e2, new C0142i(i3, list));
    }

    private static Pair<c.d.a.a.e.g, Boolean> a(c.d.a.a.e.g gVar) {
        return new Pair<>(gVar, Boolean.valueOf((gVar instanceof C0140g) || (gVar instanceof C0138e) || (gVar instanceof c.d.a.a.e.d.e)));
    }

    private static boolean a(c.d.a.a.e.g gVar, c.d.a.a.e.h hVar) {
        try {
            boolean zA = gVar.a(hVar);
            hVar.b();
            return zA;
        } catch (EOFException unused) {
            hVar.b();
            return false;
        } catch (Throwable th) {
            hVar.b();
            throw th;
        }
    }
}
