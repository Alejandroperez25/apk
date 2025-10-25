package c.d.a.a.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1575a = new k(new int[]{2}, 8);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1576b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1577c;

    public static k a(Context context) {
        return a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static k a(Intent intent) {
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f1575a;
        }
        return new k(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public k(int[] iArr, int i2) {
        if (iArr != null) {
            this.f1576b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f1576b);
        } else {
            this.f1576b = new int[0];
        }
        this.f1577c = i2;
    }

    public boolean a(int i2) {
        return Arrays.binarySearch(this.f1576b, i2) >= 0;
    }

    public int a() {
        return this.f1577c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Arrays.equals(this.f1576b, kVar.f1576b) && this.f1577c == kVar.f1577c;
    }

    public int hashCode() {
        return this.f1577c + (Arrays.hashCode(this.f1576b) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f1577c + ", supportedEncodings=" + Arrays.toString(this.f1576b) + "]";
    }
}
