package c.d.c.b.a;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: c.d.c.b.a.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251r extends c.d.c.H<Date> {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.I f4179a = new C0250q();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f4180b = new SimpleDateFormat("MMM d, yyyy");

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return new Date(this.f4180b.parse(bVar.j()).getTime());
        } catch (ParseException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public synchronized void a(c.d.c.d.d dVar, Date date) {
        dVar.c(date == null ? null : this.f4180b.format((java.util.Date) date));
    }
}
