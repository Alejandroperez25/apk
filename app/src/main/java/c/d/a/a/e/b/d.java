package c.d.a.a.e.b;

import c.d.a.a.m.u;
import c.d.a.a.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private long f1776b;

    @Override // c.d.a.a.e.b.e
    protected boolean a(u uVar) {
        return true;
    }

    public d() {
        super(null);
        this.f1776b = -9223372036854775807L;
    }

    public long a() {
        return this.f1776b;
    }

    @Override // c.d.a.a.e.b.e
    protected void b(u uVar, long j) throws x {
        if (b(uVar) != 2) {
            throw new x();
        }
        if ("onMetaData".equals(e(uVar)) && b(uVar) == 8) {
            HashMap<String, Object> mapH = h(uVar);
            if (mapH.containsKey("duration")) {
                double dDoubleValue = ((Double) mapH.get("duration")).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f1776b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    private static int b(u uVar) {
        return uVar.h();
    }

    private static Boolean c(u uVar) {
        return Boolean.valueOf(uVar.h() == 1);
    }

    private static Double d(u uVar) {
        return Double.valueOf(Double.longBitsToDouble(uVar.r()));
    }

    private static String e(u uVar) {
        int i2 = uVar.i();
        int iD = uVar.d();
        uVar.d(i2);
        return new String(uVar.f3567a, iD, i2);
    }

    private static ArrayList<Object> f(u uVar) {
        int iV = uVar.v();
        ArrayList<Object> arrayList = new ArrayList<>(iV);
        for (int i2 = 0; i2 < iV; i2++) {
            arrayList.add(a(uVar, b(uVar)));
        }
        return arrayList;
    }

    private static HashMap<String, Object> g(u uVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strE = e(uVar);
            int iB = b(uVar);
            if (iB == 9) {
                return map;
            }
            map.put(strE, a(uVar, iB));
        }
    }

    private static HashMap<String, Object> h(u uVar) {
        int iV = uVar.v();
        HashMap<String, Object> map = new HashMap<>(iV);
        for (int i2 = 0; i2 < iV; i2++) {
            map.put(e(uVar), a(uVar, b(uVar)));
        }
        return map;
    }

    private static Date i(u uVar) {
        Date date = new Date((long) d(uVar).doubleValue());
        uVar.d(2);
        return date;
    }

    private static Object a(u uVar, int i2) {
        if (i2 != 8) {
            switch (i2) {
                case 0:
                    return d(uVar);
                case 1:
                    return c(uVar);
                case 2:
                    return e(uVar);
                case 3:
                    return g(uVar);
                default:
                    switch (i2) {
                        case 10:
                            return f(uVar);
                        case 11:
                            return i(uVar);
                        default:
                            return null;
                    }
            }
        }
        return h(uVar);
    }
}
