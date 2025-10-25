package io.flutter.embedding.engine.e;

import io.flutter.embedding.engine.e.i;

/* loaded from: classes.dex */
/* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f6031a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f6032b = new int[i.EnumC0072i.values().length];

    static {
        try {
            f6032b[i.EnumC0072i.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6032b[i.EnumC0072i.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6031a = new int[i.d.values().length];
        try {
            f6031a[i.d.PORTRAIT_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6031a[i.d.PORTRAIT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6031a[i.d.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6031a[i.d.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
