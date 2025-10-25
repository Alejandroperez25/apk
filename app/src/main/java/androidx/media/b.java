package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: classes.dex */
class b implements a {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f858a;

    /* renamed from: b, reason: collision with root package name */
    int f859b = -1;

    b() {
    }

    public int hashCode() {
        return this.f858a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f858a.equals(((b) obj).f858a);
        }
        return false;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f858a;
    }
}
