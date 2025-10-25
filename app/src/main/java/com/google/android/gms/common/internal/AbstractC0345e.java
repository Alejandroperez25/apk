package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import b.a.a$i;
import b.c.i;
import c.d.a.b.a.a$b;

/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345e {

    /* renamed from: a, reason: collision with root package name */
    private static final i<String, String> f5038a = new i<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r3, int r4) {
        /*
            android.content.res.Resources r0 = r3.getResources()
            r1 = 20
            if (r4 == r1) goto L90
            r1 = 0
            switch(r4) {
                case 1: goto L89;
                case 2: goto L82;
                case 3: goto L7b;
                case 4: goto L7a;
                case 5: goto L6c;
                case 6: goto L7a;
                case 7: goto L5e;
                case 8: goto L56;
                case 9: goto L4e;
                case 10: goto L46;
                case 11: goto L3e;
                default: goto Lc;
            }
        Lc:
            switch(r4) {
                case 16: goto L36;
                case 17: goto L28;
                case 18: goto L7a;
                default: goto Lf;
            }
        Lf:
            java.lang.String r3 = "GoogleApiAvailability"
            r0 = 33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Unexpected error code "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            android.util.Log.e(r3, r4)
            return r1
        L28:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r3 = a(r3, r4)
            return r3
        L36:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "One of the API components you attempted to connect to is not available."
            android.util.Log.e(r3, r4)
            return r1
        L3e:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "The application is not licensed to the user."
            android.util.Log.e(r3, r4)
            return r1
        L46:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Developer error occurred. Please see logs for detailed information"
            android.util.Log.e(r3, r4)
            return r1
        L4e:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Google Play services is invalid. Cannot recover."
            android.util.Log.e(r3, r4)
            return r1
        L56:
            java.lang.String r3 = "GoogleApiAvailability"
            java.lang.String r4 = "Internal error occurred. Please see logs for detailed information"
            android.util.Log.e(r3, r4)
            return r1
        L5e:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_network_error_title"
            java.lang.String r3 = a(r3, r4)
            return r3
        L6c:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_invalid_account_title"
            java.lang.String r3 = a(r3, r4)
            return r3
        L7a:
            return r1
        L7b:
            int r3 = c.d.a.b.a.a$b.common_google_play_services_enable_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L82:
            int r3 = c.d.a.b.a.a$b.common_google_play_services_update_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L89:
            int r3 = c.d.a.b.a.a$b.common_google_play_services_install_title
            java.lang.String r3 = r0.getString(r3)
            return r3
        L90:
            java.lang.String r4 = "GoogleApiAvailability"
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r4, r0)
            java.lang.String r4 = "common_google_play_services_restricted_profile_title"
            java.lang.String r3 = a(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC0345e.a(android.content.Context, int):java.lang.String");
    }

    public static String b(Context context, int i2) {
        String strA;
        if (i2 == 6) {
            strA = a(context, "common_google_play_services_resolution_required_title");
        } else {
            strA = a(context, i2);
        }
        return strA == null ? context.getResources().getString(a$b.common_google_play_services_notification_ticker) : strA;
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i2 == 5) {
            return a(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i2 == 7) {
            return a(context, "common_google_play_services_network_error_text", strA);
        }
        if (i2 == 9) {
            return resources.getString(a$b.common_google_play_services_unsupported_text, strA);
        }
        if (i2 != 20) {
            switch (i2) {
                case 1:
                    return resources.getString(a$b.common_google_play_services_install_text, strA);
                case 2:
                    return com.google.android.gms.common.util.g.b(context) ? resources.getString(a$b.common_google_play_services_wear_update_text) : resources.getString(a$b.common_google_play_services_update_text, strA);
                case 3:
                    return resources.getString(a$b.common_google_play_services_enable_text, strA);
                default:
                    switch (i2) {
                        case 16:
                            return a(context, "common_google_play_services_api_unavailable_text", strA);
                        case a$i.AppCompatTheme_actionModeBackground /* 17 */:
                            return a(context, "common_google_play_services_sign_in_failed_text", strA);
                        case 18:
                            return resources.getString(a$b.common_google_play_services_updating_text, strA);
                        default:
                            return resources.getString(c.d.a.b.b.i$a.common_google_play_services_unknown_issue, strA);
                    }
            }
        }
        return a(context, "common_google_play_services_restricted_profile_text", strA);
    }

    public static String d(Context context, int i2) {
        if (i2 == 6) {
            return a(context, "common_google_play_services_resolution_required_text", a(context));
        }
        return c(context, i2);
    }

    public static String e(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(a$b.common_google_play_services_install_button);
            case 2:
                return resources.getString(a$b.common_google_play_services_update_button);
            case 3:
                return resources.getString(a$b.common_google_play_services_enable_button);
            default:
                return resources.getString(R.string.ok);
        }
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.d.a.b.b.c.b.a(context).a(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String a(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strA = a(context, str);
        if (strA == null) {
            strA = resources.getString(c.d.a.b.b.i$a.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strA, str2);
    }

    private static String a(Context context, String str) {
        synchronized (f5038a) {
            String str2 = f5038a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesA = c.d.a.b.b.f.a(context);
            if (resourcesA == null) {
                return null;
            }
            int identifier = resourcesA.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String strValueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesA.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String strValueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
                return null;
            }
            f5038a.put(str, string);
            return string;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(a$b.common_google_play_services_notification_channel_name);
    }
}
