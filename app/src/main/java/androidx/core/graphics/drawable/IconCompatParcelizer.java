package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f555b = bVar.b(iconCompat.f555b, 1);
        iconCompat.f557d = bVar.b(iconCompat.f557d, 2);
        iconCompat.f558e = bVar.b((androidx.versionedparcelable.b) iconCompat.f558e, 3);
        iconCompat.f559f = bVar.b(iconCompat.f559f, 4);
        iconCompat.f560g = bVar.b(iconCompat.f560g, 5);
        iconCompat.f561h = (ColorStateList) bVar.b((androidx.versionedparcelable.b) iconCompat.f561h, 6);
        iconCompat.j = bVar.b(iconCompat.j, 7);
        iconCompat.c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.b bVar) {
        bVar.a(true, true);
        iconCompat.a(bVar.a());
        if (-1 != iconCompat.f555b) {
            bVar.a(iconCompat.f555b, 1);
        }
        if (iconCompat.f557d != null) {
            bVar.a(iconCompat.f557d, 2);
        }
        if (iconCompat.f558e != null) {
            bVar.a(iconCompat.f558e, 3);
        }
        if (iconCompat.f559f != 0) {
            bVar.a(iconCompat.f559f, 4);
        }
        if (iconCompat.f560g != 0) {
            bVar.a(iconCompat.f560g, 5);
        }
        if (iconCompat.f561h != null) {
            bVar.a(iconCompat.f561h, 6);
        }
        if (iconCompat.j != null) {
            bVar.a(iconCompat.j, 7);
        }
    }
}
