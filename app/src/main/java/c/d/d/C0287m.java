package c.d.d;

import b.a.a$i;
import c.d.d.AbstractC0290p;
import c.d.d.AbstractC0293s;
import c.d.d.C0287m.a;
import c.d.d.S;
import c.d.d.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: c.d.d.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0287m<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: a, reason: collision with root package name */
    private static final C0287m f4418a = new C0287m(true);

    /* renamed from: c, reason: collision with root package name */
    private boolean f4420c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4421d = false;

    /* renamed from: b, reason: collision with root package name */
    private final F<FieldDescriptorType, Object> f4419b = F.a(16);

    /* renamed from: c.d.d.m$a */
    public interface a<T extends a<T>> extends Comparable<T> {
        x.a a(x.a aVar, x xVar);

        boolean h();

        S.a i();

        S.b j();
    }

    private C0287m() {
    }

    private C0287m(boolean z) {
        b();
    }

    public static <T extends a<T>> C0287m<T> a() {
        return new C0287m<>();
    }

    public void b() {
        if (this.f4420c) {
            return;
        }
        this.f4419b.a();
        this.f4420c = true;
    }

    public boolean c() {
        return this.f4420c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0287m) {
            return this.f4419b.equals(((C0287m) obj).f4419b);
        }
        return false;
    }

    public int hashCode() {
        return this.f4419b.hashCode();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C0287m<FieldDescriptorType> m3clone() {
        C0287m<FieldDescriptorType> c0287mA = a();
        for (int i2 = 0; i2 < this.f4419b.c(); i2++) {
            Map.Entry<K, Object> entryB = this.f4419b.b(i2);
            c0287mA.a((C0287m<FieldDescriptorType>) entryB.getKey(), entryB.getValue());
        }
        Iterator it = this.f4419b.e().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0287mA.a((C0287m<FieldDescriptorType>) entry.getKey(), entry.getValue());
        }
        c0287mA.f4421d = this.f4421d;
        return c0287mA;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> d() {
        if (this.f4421d) {
            return new AbstractC0293s.b(this.f4419b.entrySet().iterator());
        }
        return this.f4419b.entrySet().iterator();
    }

    public Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f4419b.get(fielddescriptortype);
        return obj instanceof AbstractC0293s ? ((AbstractC0293s) obj).b() : obj;
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.h()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b(fielddescriptortype.i(), it.next());
            }
            obj = arrayList;
        } else {
            b(fielddescriptortype.i(), obj);
        }
        if (obj instanceof AbstractC0293s) {
            this.f4421d = true;
        }
        this.f4419b.a((F<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(c.d.d.S.a r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L4c
            int[] r0 = c.d.d.C0286l.f4416a
            c.d.d.S$b r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L30;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L14;
                default: goto L13;
            }
        L13:
            goto L41
        L14:
            boolean r2 = r3 instanceof c.d.d.x
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof c.d.d.AbstractC0293s
            if (r2 == 0) goto L41
        L1c:
            r1 = 1
            goto L41
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof c.d.d.AbstractC0290p.a
            if (r2 == 0) goto L41
            goto L1c
        L27:
            boolean r2 = r3 instanceof c.d.d.AbstractC0280f
            if (r2 != 0) goto L1c
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L41
            goto L1c
        L30:
            boolean r1 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r1 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r1 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r1 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r1 = r3 instanceof java.lang.Integer
        L41:
            if (r1 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L4c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.d.C0287m.b(c.d.d.S$a, java.lang.Object):void");
    }

    static int a(S.a aVar, boolean z) {
        if (z) {
            return 2;
        }
        return aVar.b();
    }

    public void a(C0287m<FieldDescriptorType> c0287m) {
        for (int i2 = 0; i2 < c0287m.f4419b.c(); i2++) {
            a((Map.Entry) c0287m.f4419b.b(i2));
        }
        Iterator it = c0287m.f4419b.e().iterator();
        while (it.hasNext()) {
            a((Map.Entry) it.next());
        }
    }

    private Object a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void a(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof AbstractC0293s) {
            value = ((AbstractC0293s) value).b();
        }
        if (key.h()) {
            Object objA = a((C0287m<FieldDescriptorType>) key);
            if (objA == null) {
                objA = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objA).add(a(it.next()));
            }
            this.f4419b.a((F<FieldDescriptorType, Object>) key, (FieldDescriptorType) objA);
            return;
        }
        if (key.j() == S.b.MESSAGE) {
            Object objA2 = a((C0287m<FieldDescriptorType>) key);
            if (objA2 == null) {
                this.f4419b.a((F<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
                return;
            } else {
                this.f4419b.a((F<FieldDescriptorType, Object>) key, (FieldDescriptorType) key.a(((x) objA2).b(), (x) value).f());
                return;
            }
        }
        this.f4419b.a((F<FieldDescriptorType, Object>) key, (FieldDescriptorType) a(value));
    }

    public static Object a(C0281g c0281g, S.a aVar, boolean z) {
        if (z) {
            return S.a(c0281g, aVar, S.c.f4381b);
        }
        return S.a(c0281g, aVar, S.c.f4380a);
    }

    static void a(AbstractC0283i abstractC0283i, S.a aVar, int i2, Object obj) {
        if (aVar == S.a.j) {
            abstractC0283i.c(i2, (x) obj);
        } else {
            abstractC0283i.c(i2, a(aVar, false));
            a(abstractC0283i, aVar, obj);
        }
    }

    static void a(AbstractC0283i abstractC0283i, S.a aVar, Object obj) {
        switch (C0286l.f4417b[aVar.ordinal()]) {
            case 1:
                abstractC0283i.b(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC0283i.b(((Float) obj).floatValue());
                break;
            case 3:
                abstractC0283i.g(((Long) obj).longValue());
                break;
            case 4:
                abstractC0283i.h(((Long) obj).longValue());
                break;
            case 5:
                abstractC0283i.j(((Integer) obj).intValue());
                break;
            case 6:
                abstractC0283i.j(((Long) obj).longValue());
                break;
            case 7:
                abstractC0283i.m(((Integer) obj).intValue());
                break;
            case 8:
                abstractC0283i.b(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC0283i.d((x) obj);
                break;
            case 10:
                abstractC0283i.c((x) obj);
                break;
            case 11:
                if (obj instanceof AbstractC0280f) {
                    abstractC0283i.b((AbstractC0280f) obj);
                    break;
                } else {
                    abstractC0283i.b((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof AbstractC0280f) {
                    abstractC0283i.b((AbstractC0280f) obj);
                    break;
                } else {
                    abstractC0283i.c((byte[]) obj);
                    break;
                }
            case 13:
                abstractC0283i.k(((Integer) obj).intValue());
                break;
            case 14:
                abstractC0283i.n(((Integer) obj).intValue());
                break;
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                abstractC0283i.k(((Long) obj).longValue());
                break;
            case 16:
                abstractC0283i.l(((Integer) obj).intValue());
                break;
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                abstractC0283i.i(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof AbstractC0290p.a) {
                    abstractC0283i.o(((AbstractC0290p.a) obj).a());
                    break;
                } else {
                    abstractC0283i.o(((Integer) obj).intValue());
                    break;
                }
        }
    }

    static int a(S.a aVar, int i2, Object obj) {
        int iA = AbstractC0283i.a(i2);
        if (aVar == S.a.j) {
            iA *= 2;
        }
        return iA + a(aVar, obj);
    }

    static int a(S.a aVar, Object obj) {
        switch (C0286l.f4417b[aVar.ordinal()]) {
            case 1:
                return AbstractC0283i.a(((Double) obj).doubleValue());
            case 2:
                return AbstractC0283i.a(((Float) obj).floatValue());
            case 3:
                return AbstractC0283i.a(((Long) obj).longValue());
            case 4:
                return AbstractC0283i.b(((Long) obj).longValue());
            case 5:
                return AbstractC0283i.b(((Integer) obj).intValue());
            case 6:
                return AbstractC0283i.d(((Long) obj).longValue());
            case 7:
                return AbstractC0283i.e(((Integer) obj).intValue());
            case 8:
                return AbstractC0283i.a(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0283i.b((x) obj);
            case 10:
                if (obj instanceof AbstractC0293s) {
                    return AbstractC0283i.a((AbstractC0293s) obj);
                }
                return AbstractC0283i.a((x) obj);
            case 11:
                if (obj instanceof AbstractC0280f) {
                    return AbstractC0283i.a((AbstractC0280f) obj);
                }
                return AbstractC0283i.a((String) obj);
            case 12:
                if (obj instanceof AbstractC0280f) {
                    return AbstractC0283i.a((AbstractC0280f) obj);
                }
                return AbstractC0283i.b((byte[]) obj);
            case 13:
                return AbstractC0283i.c(((Integer) obj).intValue());
            case 14:
                return AbstractC0283i.f(((Integer) obj).intValue());
            case a$i.AppCompatTheme_actionMenuTextAppearance /* 15 */:
                return AbstractC0283i.e(((Long) obj).longValue());
            case 16:
                return AbstractC0283i.d(((Integer) obj).intValue());
            case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                return AbstractC0283i.c(((Long) obj).longValue());
            case 18:
                if (obj instanceof AbstractC0290p.a) {
                    return AbstractC0283i.g(((AbstractC0290p.a) obj).a());
                }
                return AbstractC0283i.g(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
