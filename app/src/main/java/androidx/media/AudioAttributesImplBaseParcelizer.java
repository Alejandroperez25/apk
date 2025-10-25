package androidx.media;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static c read(androidx.versionedparcelable.b bVar) {
        c cVar = new c();
        cVar.f860a = bVar.b(cVar.f860a, 1);
        cVar.f861b = bVar.b(cVar.f861b, 2);
        cVar.f862c = bVar.b(cVar.f862c, 3);
        cVar.f863d = bVar.b(cVar.f863d, 4);
        return cVar;
    }

    public static void write(c cVar, androidx.versionedparcelable.b bVar) {
        bVar.a(false, false);
        bVar.a(cVar.f860a, 1);
        bVar.a(cVar.f861b, 2);
        bVar.a(cVar.f862c, 3);
        bVar.a(cVar.f863d, 4);
    }
}
