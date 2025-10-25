package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0346f implements DialogInterface.OnClickListener {
    protected abstract void a();

    public static AbstractDialogInterfaceOnClickListenerC0346f a(Activity activity, Intent intent, int i2) {
        return new y(intent, activity, i2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
