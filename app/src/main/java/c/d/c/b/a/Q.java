package c.d.c.b.a;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
class Q extends c.d.c.H<Calendar> {
    Q() {
    }

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Calendar a(c.d.c.d.b bVar) throws NumberFormatException, c.d.c.d.e {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        bVar.d();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (bVar.g() != c.d.c.d.c.END_OBJECT) {
            String strI = bVar.i();
            int iO = bVar.o();
            if ("year".equals(strI)) {
                i2 = iO;
            } else if ("month".equals(strI)) {
                i3 = iO;
            } else if ("dayOfMonth".equals(strI)) {
                i4 = iO;
            } else if ("hourOfDay".equals(strI)) {
                i5 = iO;
            } else if ("minute".equals(strI)) {
                i6 = iO;
            } else if ("second".equals(strI)) {
                i7 = iO;
            }
        }
        bVar.e();
        return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
    }

    @Override // c.d.c.H
    public void a(c.d.c.d.d dVar, Calendar calendar) throws IOException {
        if (calendar == null) {
            dVar.h();
            return;
        }
        dVar.f();
        dVar.b("year");
        dVar.a(calendar.get(1));
        dVar.b("month");
        dVar.a(calendar.get(2));
        dVar.b("dayOfMonth");
        dVar.a(calendar.get(5));
        dVar.b("hourOfDay");
        dVar.a(calendar.get(11));
        dVar.b("minute");
        dVar.a(calendar.get(12));
        dVar.b("second");
        dVar.a(calendar.get(13));
        dVar.g();
    }
}
