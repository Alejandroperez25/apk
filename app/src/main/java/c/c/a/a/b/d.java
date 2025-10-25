package c.c.a.a.b;

import c.c.a.a.c.i;
import c.c.a.a.c.m;

/* loaded from: classes.dex */
/* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f1348a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f1349b = new int[i.b.values().length];

    static {
        try {
            f1349b[i.b.ABORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f1349b[i.b.USER_CONTROL_MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f1349b[i.b.WINDOW_ACKNOWLEDGEMENT_SIZE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f1349b[i.b.SET_PEER_BANDWIDTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f1349b[i.b.COMMAND_AMF0.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f1348a = new int[m.a.values().length];
        try {
            f1348a[m.a.STREAM_BEGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f1348a[m.a.PING_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f1348a[m.a.STREAM_EOF.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
