package c.d.c.b.a;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: c.d.c.b.a.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253t extends c.d.c.H<Time> {

    /* renamed from: a, reason: collision with root package name */
    public static final c.d.c.I f4181a = new C0252s();

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f4182b = new SimpleDateFormat("hh:mm:ss a");

    @Override // c.d.c.H
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(c.d.c.d.b bVar) {
        if (bVar.g() == c.d.c.d.c.NULL) {
            bVar.l();
            return null;
        }
        try {
            return new Time(this.f4182b.parse(bVar.j()).getTime());
        } catch (ParseException e2) {
            throw new c.d.c.C(e2);
        }
    }

    @Override // c.d.c.H
    public synchronized void a(c.d.c.d.d dVar, Time time) {
        dVar.c(time == null ? null : this.f4182b.format((Date) time));
    }
}
