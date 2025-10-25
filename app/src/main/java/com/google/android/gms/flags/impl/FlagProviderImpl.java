package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends c.d.a.b.d.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5151a = false;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f5152b;

    @Override // c.d.a.b.d.f
    public void init(c.d.a.b.c.a aVar) {
        Context context = (Context) c.d.a.b.c.b.a(aVar);
        if (this.f5151a) {
            return;
        }
        try {
            this.f5152b = j.a(context.createPackageContext("com.google.android.gms", 0));
            this.f5151a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }

    @Override // c.d.a.b.d.f
    public boolean getBooleanFlagValue(String str, boolean z, int i2) {
        return !this.f5151a ? z : b.a(this.f5152b, str, Boolean.valueOf(z)).booleanValue();
    }

    @Override // c.d.a.b.d.f
    public int getIntFlagValue(String str, int i2, int i3) {
        return !this.f5151a ? i2 : d.a(this.f5152b, str, Integer.valueOf(i2)).intValue();
    }

    @Override // c.d.a.b.d.f
    public long getLongFlagValue(String str, long j, int i2) {
        return !this.f5151a ? j : f.a(this.f5152b, str, Long.valueOf(j)).longValue();
    }

    @Override // c.d.a.b.d.f
    public String getStringFlagValue(String str, String str2, int i2) {
        return !this.f5151a ? str2 : h.a(this.f5152b, str, str2);
    }
}
