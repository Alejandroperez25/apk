package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC0325e f4900a;

    @Keep
    private static InterfaceC0325e getChimeraLifecycleFragmentImpl(C0324d c0324d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a() {
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }

    protected static InterfaceC0325e a(C0324d c0324d) {
        if (c0324d.a()) {
            return T.a(c0324d.d());
        }
        if (c0324d.b()) {
            return R.a(c0324d.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC0325e a(Activity activity) {
        return a(new C0324d(activity));
    }

    protected LifecycleCallback(InterfaceC0325e interfaceC0325e) {
        this.f4900a = interfaceC0325e;
    }
}
