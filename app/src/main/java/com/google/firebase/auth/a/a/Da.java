package com.google.firebase.auth.a.a;

import android.os.IBinder;
import android.os.Parcel;
import b.a.a$i;
import c.d.a.b.e.c.AbstractC0225z;
import c.d.a.b.e.c.C0178ba;
import c.d.a.b.e.c.C0182da;
import c.d.a.b.e.c.C0186fa;
import c.d.a.b.e.c.C0190ha;
import c.d.a.b.e.c.C0194ja;
import c.d.a.b.e.c.C0198la;
import c.d.a.b.e.c.C0202na;
import c.d.a.b.e.c.C0204oa;
import c.d.a.b.e.c.C0208qa;
import c.d.a.b.e.c.C0212sa;
import c.d.a.b.e.c.C0216ua;
import c.d.a.b.e.c.C0220wa;
import c.d.a.b.e.c.C0224ya;
import c.d.a.b.e.c.Ya;
import c.d.a.b.e.c.bb;
import com.google.firebase.auth.C0354a;
import com.google.firebase.auth.C0405e;

/* loaded from: classes.dex */
public final class Da extends AbstractC0225z implements Ca {
    Da(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void b(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(1, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void d(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(2, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(bb bbVar, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, bbVar);
        C0204oa.a(parcelH, zaVar);
        a(3, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, com.google.firebase.auth.H h2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, h2);
        C0204oa.a(parcelH, zaVar);
        a(4, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void c(String str, String str2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        C0204oa.a(parcelH, zaVar);
        a(5, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void d(String str, String str2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        C0204oa.a(parcelH, zaVar);
        a(6, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, String str2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        C0204oa.a(parcelH, zaVar);
        a(7, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void b(String str, String str2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        C0204oa.a(parcelH, zaVar);
        a(8, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void c(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(9, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, String str2, String str3, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        C0204oa.a(parcelH, zaVar);
        a(11, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, bb bbVar, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, bbVar);
        C0204oa.a(parcelH, zaVar);
        a(12, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void f(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(13, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void e(String str, String str2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        C0204oa.a(parcelH, zaVar);
        a(14, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void e(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(15, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, zaVar);
        a(16, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, zaVar);
        a(17, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(Ya ya, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, ya);
        C0204oa.a(parcelH, zaVar);
        a(22, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(com.google.firebase.auth.A a2, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, a2);
        C0204oa.a(parcelH, zaVar);
        a(23, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, com.google.firebase.auth.A a2, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, a2);
        C0204oa.a(parcelH, zaVar);
        a(24, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(String str, C0354a c0354a, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, c0354a);
        C0204oa.a(parcelH, zaVar);
        a(26, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void b(String str, C0354a c0354a, za zaVar) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        C0204oa.a(parcelH, c0354a);
        C0204oa.a(parcelH, zaVar);
        a(28, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0405e c0405e, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0405e);
        C0204oa.a(parcelH, zaVar);
        a(29, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.V v, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, v);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_textAppearanceSearchResultSubtitle, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0212sa c0212sa, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0212sa);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_textAppearanceSearchResultTitle, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0208qa c0208qa, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0208qa);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_textAppearanceSmallPopupMenu, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.Ea ea, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, ea);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_textColorAlertDialogListItem, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.N n, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, n);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_textColorSearchUrl, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.P p, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, p);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_toolbarNavigationButtonStyle, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.R r, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, r);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_toolbarStyle, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0216ua c0216ua, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0216ua);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_tooltipForegroundColor, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.X x, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, x);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_tooltipFrameBackground, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.Z z, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, z);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowActionBar, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0178ba c0178ba, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0178ba);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowActionBarOverlay, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.Aa aa, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, aa);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowActionModeOverlay, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.Ca ca, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, ca);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowFixedHeightMajor, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0186fa c0186fa, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0186fa);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowFixedHeightMinor, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0202na c0202na, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0202na);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowFixedWidthMajor, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(c.d.a.b.e.c.T t, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, t);
        C0204oa.a(parcelH, zaVar);
        a(a$i.AppCompatTheme_windowFixedWidthMinor, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0198la c0198la, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0198la);
        C0204oa.a(parcelH, zaVar);
        a(122, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0224ya c0224ya, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0224ya);
        C0204oa.a(parcelH, zaVar);
        a(123, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0182da c0182da, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0182da);
        C0204oa.a(parcelH, zaVar);
        a(124, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0190ha c0190ha, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0190ha);
        C0204oa.a(parcelH, zaVar);
        a(126, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0194ja c0194ja, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0194ja);
        C0204oa.a(parcelH, zaVar);
        a(128, parcelH);
    }

    @Override // com.google.firebase.auth.a.a.Ca
    public final void a(C0220wa c0220wa, za zaVar) {
        Parcel parcelH = h();
        C0204oa.a(parcelH, c0220wa);
        C0204oa.a(parcelH, zaVar);
        a(129, parcelH);
    }
}
