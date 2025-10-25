package androidx.media;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f857c = (a) bVar.b((androidx.versionedparcelable.b) audioAttributesCompat.f857c, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bVar.a(false, false);
        bVar.a(audioAttributesCompat.f857c, 1);
    }
}
