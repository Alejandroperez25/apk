package c.d.a.b.b;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.f;
import androidx.fragment.app.ActivityC0109j;
import b.a.a$i;
import c.d.a.b.a.a$a;
import c.d.a.b.a.a$b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractC0345e;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC0346f;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.i;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3745c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final d f3746d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final int f3747e = e.f3751a;

    /* renamed from: f, reason: collision with root package name */
    private String f3748f;

    public static d b() {
        return f3746d;
    }

    @SuppressLint({"HandlerLeak"})
    private class a extends c.d.a.b.e.a.d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f3749a;

        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f3749a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                int iA = d.this.a(this.f3749a);
                if (d.this.a(iA)) {
                    d.this.b(this.f3749a, iA);
                    return;
                }
                return;
            }
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i2);
            Log.w("GoogleApiAvailability", sb.toString());
        }
    }

    public Dialog a(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return a(activity, i2, AbstractDialogInterfaceOnClickListenerC0346f.a(activity, a(activity, i2, "d"), i3), onCancelListener);
    }

    public boolean b(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogA = a(activity, i2, i3, onCancelListener);
        if (dialogA == null) {
            return false;
        }
        a(activity, dialogA, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void b(Context context, int i2) {
        a(context, i2, (String) null, a(context, i2, 0, "n"));
    }

    public final boolean a(Context context, c.d.a.b.b.a aVar, int i2) {
        PendingIntent pendingIntentA = a(context, aVar);
        if (pendingIntentA == null) {
            return false;
        }
        a(context, aVar.q(), (String) null, GoogleApiActivity.a(context, pendingIntentA, i2));
        return true;
    }

    private final String c() {
        String str;
        synchronized (f3745c) {
            str = this.f3748f;
        }
        return str;
    }

    @Override // c.d.a.b.b.e
    public int a(Context context) {
        return super.a(context);
    }

    @Override // c.d.a.b.b.e
    public int a(Context context, int i2) {
        return super.a(context, i2);
    }

    @Override // c.d.a.b.b.e
    public final boolean a(int i2) {
        return super.a(i2);
    }

    @Override // c.d.a.b.b.e
    public Intent a(Context context, int i2, String str) {
        return super.a(context, i2, str);
    }

    @Override // c.d.a.b.b.e
    public PendingIntent a(Context context, int i2, int i3) {
        return super.a(context, i2, i3);
    }

    public PendingIntent a(Context context, c.d.a.b.b.a aVar) {
        if (aVar.o()) {
            return aVar.r();
        }
        return a(context, aVar.q(), 0);
    }

    @Override // c.d.a.b.b.e
    public final String b(int i2) {
        return super.b(i2);
    }

    static Dialog a(Context context, int i2, AbstractDialogInterfaceOnClickListenerC0346f abstractDialogInterfaceOnClickListenerC0346f, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC0345e.c(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strE = AbstractC0345e.e(context, i2);
        if (strE != null) {
            builder.setPositiveButton(strE, abstractDialogInterfaceOnClickListenerC0346f);
        }
        String strA = AbstractC0345e.a(context, i2);
        if (strA != null) {
            builder.setTitle(strA);
        }
        return builder.create();
    }

    static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0109j) {
            j.a(dialog, onCancelListener).a(((ActivityC0109j) activity).h(), str);
        } else {
            b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    @TargetApi(a$i.AppCompatTheme_actionModeCopyDrawable)
    private final void a(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        if (i2 == 18) {
            b(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strB = AbstractC0345e.b(context, i2);
        String strD = AbstractC0345e.d(context, i2);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        f.d dVar = new f.d(context);
        dVar.b(true);
        dVar.a(true);
        dVar.b(strB);
        f.c cVar = new f.c();
        cVar.a(strD);
        dVar.a(cVar);
        if (com.google.android.gms.common.util.g.a(context)) {
            t.a(i.e());
            dVar.a(context.getApplicationInfo().icon);
            dVar.d(2);
            if (com.google.android.gms.common.util.g.b(context)) {
                dVar.a(a$a.common_full_open_on_phone, resources.getString(a$b.common_open_on_phone), pendingIntent);
            } else {
                dVar.a(pendingIntent);
            }
        } else {
            dVar.a(R.drawable.stat_sys_warning);
            dVar.d(resources.getString(a$b.common_google_play_services_notification_ticker));
            dVar.a(System.currentTimeMillis());
            dVar.a(pendingIntent);
            dVar.c(strD);
        }
        if (i.h()) {
            t.a(i.h());
            String strC = c();
            if (strC == null) {
                strC = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strB2 = AbstractC0345e.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", strB2, 4));
                } else if (!strB2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strB2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVar.a(strC);
        }
        Notification notificationB = dVar.b();
        switch (i2) {
            case 1:
            case 2:
            case 3:
                i3 = 10436;
                g.f3755b.set(false);
                break;
            default:
                i3 = 39789;
                break;
        }
        notificationManager.notify(i3, notificationB);
    }

    final void b(Context context) {
        new a(context).sendEmptyMessageDelayed(1, 120000L);
    }
}
