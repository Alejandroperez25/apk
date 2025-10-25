package io.flutter.plugin.platform;

import io.flutter.embedding.engine.e.i;

/* loaded from: classes.dex */
/* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f6150a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f6151b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f6152c = new int[i.b.values().length];

    static {
        try {
            f6152c[i.b.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6152c[i.b.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6151b = new int[i.EnumC0072i.values().length];
        try {
            f6151b[i.EnumC0072i.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6151b[i.EnumC0072i.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f6150a = new int[i.e.values().length];
        try {
            f6150a[i.e.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6150a[i.e.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6150a[i.e.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6150a[i.e.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6150a[i.e.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
