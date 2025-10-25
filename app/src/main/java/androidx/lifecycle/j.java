package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
/* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f834a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f835b = new int[f.b.values().length];

    static {
        try {
            f835b[f.b.INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f835b[f.b.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f835b[f.b.STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f835b[f.b.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f835b[f.b.DESTROYED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f834a = new int[f.a.values().length];
        try {
            f834a[f.a.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f834a[f.a.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f834a[f.a.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f834a[f.a.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f834a[f.a.ON_RESUME.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f834a[f.a.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f834a[f.a.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
