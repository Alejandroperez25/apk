package c.d.c.b.a;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: c.d.c.b.a.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238e extends c.d.c.H<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.I f4140a = new C0237d();

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f4141b = new ArrayList();

    public C0238e() {
        this.f4141b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f4141b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (c.d.c.b.t.b()) {
            this.f4141b.add(c.d.c.b.B.a(2, 2));
        }
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        return a(bVar.j());
    }

    private synchronized Date a(String str) {
        Iterator<DateFormat> it = this.f4141b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return c.d.c.b.a.a.a.a(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new c.d.c.C(str, e2);
        }
    }

    @Override // c.d.c.H
    public synchronized void a(c.d.c.d.d dVar, Date date) {
        if (date == null) {
            dVar.h();
        } else {
            dVar.c(this.f4141b.get(0).format(date));
        }
    }
}
