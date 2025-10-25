package com.google.firebase.auth.a.a;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import c.d.a.b.e.c.AbstractC0195k;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AbstractC0403c;
import com.google.firebase.auth.C0434p;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ya {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<Pair<String, String>> f5308a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.d.b.f a(com.google.android.gms.common.api.Status r3) {
        /*
            int r0 = r3.q()
            java.lang.String r1 = b(r0)
            java.lang.String r1 = a(r1, r3)
            switch(r0) {
                case 17004: goto Lec;
                case 17005: goto Le2;
                case 17006: goto Ld8;
                case 17007: goto Lce;
                case 17008: goto Lec;
                case 17009: goto Lec;
                case 17010: goto Lc2;
                case 17011: goto Le2;
                case 17012: goto Lce;
                default: goto Lf;
            }
        Lf:
            switch(r0) {
                case 17014: goto Lb8;
                case 17015: goto Lac;
                case 17016: goto La0;
                case 17017: goto Le2;
                default: goto L12;
            }
        L12:
            switch(r0) {
                case 17020: goto L94;
                case 17021: goto Le2;
                default: goto L15;
            }
        L15:
            switch(r0) {
                case 17024: goto Lec;
                case 17025: goto Lce;
                case 17026: goto L86;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 17028: goto Ld8;
                case 17029: goto L7c;
                case 17030: goto L7c;
                case 17031: goto L72;
                case 17032: goto L72;
                case 17033: goto L72;
                case 17034: goto Lec;
                case 17035: goto Lec;
                default: goto L1b;
            }
        L1b:
            switch(r0) {
                case 17040: goto Ld8;
                case 17041: goto Lec;
                case 17042: goto Lec;
                case 17043: goto Lec;
                case 17044: goto Lec;
                case 17045: goto Lec;
                case 17046: goto Lec;
                default: goto L1e;
            }
        L1e:
            switch(r0) {
                case 17051: goto Lec;
                case 17052: goto L6c;
                default: goto L21;
            }
        L21:
            switch(r0) {
                case 17057: goto L62;
                case 17058: goto L62;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 17061: goto L56;
                case 17062: goto L62;
                case 17063: goto L50;
                case 17064: goto Ld8;
                case 17065: goto L62;
                default: goto L27;
            }
        L27:
            switch(r0) {
                case 17071: goto Ld8;
                case 17072: goto Ld8;
                case 17073: goto Ld8;
                case 17074: goto Ld8;
                case 17075: goto Lec;
                default: goto L2a;
            }
        L2a:
            switch(r0) {
                case 17079: goto Ld8;
                case 17080: goto L50;
                default: goto L2d;
            }
        L2d:
            switch(r0) {
                case 17000: goto Lec;
                case 17002: goto Lec;
                case 17049: goto Lec;
                case 17068: goto Ld8;
                case 17077: goto Lec;
                case 17495: goto L44;
                case 17499: goto L38;
                default: goto L30;
            }
        L30:
            c.d.b.f r3 = new c.d.b.f
            java.lang.String r0 = "An internal error has occurred."
            r3.<init>(r0)
            return r3
        L38:
            java.lang.String r0 = "An internal error has occurred."
            java.lang.String r3 = a(r0, r3)
            c.d.b.f r0 = new c.d.b.f
            r0.<init>(r3)
            return r0
        L44:
            java.lang.String r0 = "Please sign in before trying to get a token."
            java.lang.String r3 = a(r0, r3)
            c.d.b.d.a.a r0 = new c.d.b.d.a.a
            r0.<init>(r3)
            return r0
        L50:
            c.d.b.b r3 = new c.d.b.b
            r3.<init>(r1)
            return r3
        L56:
            java.lang.String r0 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            java.lang.String r3 = a(r0, r3)
            c.d.b.h r0 = new c.d.b.h
            r0.<init>(r3)
            return r0
        L62:
            com.google.firebase.auth.r r3 = new com.google.firebase.auth.r
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        L6c:
            c.d.b.k r3 = new c.d.b.k
            r3.<init>(r1)
            return r3
        L72:
            com.google.firebase.auth.j r3 = new com.google.firebase.auth.j
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        L7c:
            com.google.firebase.auth.i r3 = new com.google.firebase.auth.i
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        L86:
            com.google.firebase.auth.q r2 = new com.google.firebase.auth.q
            java.lang.String r0 = a(r0)
            java.lang.String r3 = r3.o()
            r2.<init>(r0, r1, r3)
            return r2
        L94:
            java.lang.String r0 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            java.lang.String r3 = a(r0, r3)
            c.d.b.h r0 = new c.d.b.h
            r0.<init>(r3)
            return r0
        La0:
            java.lang.String r0 = "User was not linked to an account with the given provider."
            java.lang.String r3 = a(r0, r3)
            c.d.b.f r0 = new c.d.b.f
            r0.<init>(r3)
            return r0
        Lac:
            java.lang.String r0 = "User has already been linked to the given provider."
            java.lang.String r3 = a(r0, r3)
            c.d.b.f r0 = new c.d.b.f
            r0.<init>(r3)
            return r0
        Lb8:
            com.google.firebase.auth.n r3 = new com.google.firebase.auth.n
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        Lc2:
            java.lang.String r0 = "We have blocked all requests from this device due to unusual activity. Try again later."
            java.lang.String r3 = a(r0, r3)
            c.d.b.k r0 = new c.d.b.k
            r0.<init>(r3)
            return r0
        Lce:
            com.google.firebase.auth.p r3 = new com.google.firebase.auth.p
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        Ld8:
            com.google.firebase.auth.k r3 = new com.google.firebase.auth.k
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        Le2:
            com.google.firebase.auth.m r3 = new com.google.firebase.auth.m
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        Lec:
            com.google.firebase.auth.l r3 = new com.google.firebase.auth.l
            java.lang.String r0 = a(r0)
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.a.a.ya.a(com.google.android.gms.common.api.Status):c.d.b.f");
    }

    public static C0434p a(Status status, AbstractC0403c abstractC0403c, String str, String str2) {
        int iQ = status.q();
        C0434p c0434p = new C0434p(a(iQ), a(b(iQ), status));
        c0434p.a(abstractC0403c);
        c0434p.a(str);
        c0434p.b(str2);
        return c0434p;
    }

    public static com.google.firebase.auth.ga a(FirebaseAuth firebaseAuth, c.d.a.b.e.c.Ja ja) {
        AbstractC0195k.a(firebaseAuth);
        AbstractC0195k.a(ja);
        Pair<String, String> pair = f5308a.get(17078);
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        List<com.google.firebase.auth.ja> listQ = ja.q();
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.auth.ja jaVar : listQ) {
            if (jaVar instanceof com.google.firebase.auth.L) {
                arrayList.add((com.google.firebase.auth.L) jaVar);
            }
        }
        return new com.google.firebase.auth.ga(str, str2, new com.google.firebase.auth.internal.H(arrayList, com.google.firebase.auth.internal.J.a(ja.q(), ja.o()), firebaseAuth.c().d(), ja.p()));
    }

    private static String a(String str, Status status) {
        return TextUtils.isEmpty(status.o()) ? str : String.format(String.valueOf(str).concat(" [ %s ]"), status.o());
    }

    private static String a(int i2) {
        Pair<String, String> pair = f5308a.get(i2);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    private static String b(int i2) {
        Pair<String, String> pair = f5308a.get(i2);
        return pair != null ? (String) pair.second : "An internal error has occurred.";
    }

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        f5308a = sparseArray;
        sparseArray.put(17000, new Pair<>("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f5308a.put(17002, new Pair<>("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f5308a.put(17004, new Pair<>("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f5308a.put(17008, new Pair<>("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f5308a.put(17009, new Pair<>("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f5308a.put(17024, new Pair<>("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f5308a.put(17014, new Pair<>("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f5308a.put(17012, new Pair<>("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f5308a.put(17007, new Pair<>("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f5308a.put(17025, new Pair<>("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f5308a.put(17005, new Pair<>("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f5308a.put(17021, new Pair<>("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f5308a.put(17011, new Pair<>("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f5308a.put(17017, new Pair<>("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        f5308a.put(17006, new Pair<>("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        f5308a.put(17026, new Pair<>("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        f5308a.put(17029, new Pair<>("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        f5308a.put(17030, new Pair<>("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        f5308a.put(17031, new Pair<>("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        f5308a.put(17033, new Pair<>("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        f5308a.put(17032, new Pair<>("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        f5308a.put(17034, new Pair<>("ERROR_MISSING_EMAIL", "An email address must be provided."));
        f5308a.put(17035, new Pair<>("ERROR_MISSING_PASSWORD", "A password must be provided."));
        f5308a.put(17041, new Pair<>("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        f5308a.put(17042, new Pair<>("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        f5308a.put(17043, new Pair<>("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        f5308a.put(17044, new Pair<>("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        f5308a.put(17045, new Pair<>("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        f5308a.put(17046, new Pair<>("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        f5308a.put(17049, new Pair<>("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        f5308a.put(17051, new Pair<>("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        f5308a.put(17052, new Pair<>("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded."));
        f5308a.put(17028, new Pair<>("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verifythat the correct package name and SHA-1 are configured in the Firebase Console."));
        f5308a.put(17063, new Pair<>("ERROR_API_NOT_AVAILABLE_WITHOUT_GPS", "The API that you are calling is not available on devices without Google Play Services."));
        f5308a.put(17062, new Pair<>("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        f5308a.put(17064, new Pair<>("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        f5308a.put(17065, new Pair<>("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        f5308a.put(17040, new Pair<>("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        f5308a.put(17068, new Pair<>("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        f5308a.put(17071, new Pair<>("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        f5308a.put(17057, new Pair<>("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        f5308a.put(17058, new Pair<>("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        f5308a.put(17072, new Pair<>("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        f5308a.put(17073, new Pair<>("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        f5308a.put(17074, new Pair<>("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        f5308a.put(17075, new Pair<>("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        f5308a.put(17077, new Pair<>("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        f5308a.put(17079, new Pair<>("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        f5308a.put(17078, new Pair<>("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        f5308a.put(17080, new Pair<>("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
    }
}
