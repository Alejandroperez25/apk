package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static b read(androidx.versionedparcelable.b bVar) {
        b bVar2 = new b();
        bVar2.f858a = (AudioAttributes) bVar.b((androidx.versionedparcelable.b) bVar2.f858a, 1);
        bVar2.f859b = bVar.b(bVar2.f859b, 2);
        return bVar2;
    }

    public static void write(b bVar, androidx.versionedparcelable.b bVar2) {
        bVar2.a(false, false);
        bVar2.a(bVar.f858a, 1);
        bVar2.a(bVar.f859b, 2);
    }
}
