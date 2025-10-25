package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.a.a$d;
import b.a.a$g;
import b.a.a$i;

/* loaded from: classes.dex */
public class ga implements InterfaceC0095v {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f370a;

    /* renamed from: b, reason: collision with root package name */
    private int f371b;

    /* renamed from: c, reason: collision with root package name */
    private View f372c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f373d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f374e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f375f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f376g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f377h;

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f378i;
    private CharSequence j;
    Window.Callback k;
    boolean l;
    private int m;
    private int n;
    private Drawable o;

    public ga(Toolbar toolbar, boolean z) {
        this(toolbar, z, a$g.abc_action_bar_up_description, a$d.abc_ic_ab_back_material);
    }

    public ga(Toolbar toolbar, boolean z, int i2, int i3) {
        this.m = 0;
        this.n = 0;
        this.f370a = toolbar;
        this.f377h = toolbar.getTitle();
        this.f378i = toolbar.getSubtitle();
        this.f376g = this.f377h != null;
        this.f375f = toolbar.getNavigationIcon();
        aa aaVarA = aa.a(toolbar.getContext(), null, a$i.ActionBar, b.a.a$a.actionBarStyle, 0);
        this.o = aaVarA.a(a$i.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceB = aaVarA.b(a$i.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceB)) {
                b(charSequenceB);
            }
            CharSequence charSequenceB2 = aaVarA.b(a$i.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceB2)) {
                c(charSequenceB2);
            }
            Drawable drawableA = aaVarA.a(a$i.ActionBar_logo);
            if (drawableA != null) {
                b(drawableA);
            }
            Drawable drawableA2 = aaVarA.a(a$i.ActionBar_icon);
            if (drawableA2 != null) {
                a(drawableA2);
            }
            if (this.f375f == null && this.o != null) {
                c(this.o);
            }
            d(aaVarA.a(a$i.ActionBar_displayOptions, 0));
            int iG = aaVarA.g(a$i.ActionBar_customNavigationLayout, 0);
            if (iG != 0) {
                a(LayoutInflater.from(this.f370a.getContext()).inflate(iG, (ViewGroup) this.f370a, false));
                d(this.f371b | 16);
            }
            int iF = aaVarA.f(a$i.ActionBar_height, 0);
            if (iF > 0) {
                ViewGroup.LayoutParams layoutParams = this.f370a.getLayoutParams();
                layoutParams.height = iF;
                this.f370a.setLayoutParams(layoutParams);
            }
            int iD = aaVarA.d(a$i.ActionBar_contentInsetStart, -1);
            int iD2 = aaVarA.d(a$i.ActionBar_contentInsetEnd, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f370a.a(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iG2 = aaVarA.g(a$i.ActionBar_titleTextStyle, 0);
            if (iG2 != 0) {
                this.f370a.a(this.f370a.getContext(), iG2);
            }
            int iG3 = aaVarA.g(a$i.ActionBar_subtitleTextStyle, 0);
            if (iG3 != 0) {
                this.f370a.b(this.f370a.getContext(), iG3);
            }
            int iG4 = aaVarA.g(a$i.ActionBar_popupTheme, 0);
            if (iG4 != 0) {
                this.f370a.setPopupTheme(iG4);
            }
        } else {
            this.f371b = b();
        }
        aaVarA.a();
        c(i2);
        this.j = this.f370a.getNavigationContentDescription();
        this.f370a.setNavigationOnClickListener(new fa(this));
    }

    public void c(int i2) {
        if (i2 == this.n) {
            return;
        }
        this.n = i2;
        if (TextUtils.isEmpty(this.f370a.getNavigationContentDescription())) {
            e(this.n);
        }
    }

    private int b() {
        if (this.f370a.getNavigationIcon() == null) {
            return 11;
        }
        this.o = this.f370a.getNavigationIcon();
        return 15;
    }

    public Context a() {
        return this.f370a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public void a(Window.Callback callback) {
        this.k = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public void a(CharSequence charSequence) {
        if (this.f376g) {
            return;
        }
        e(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public CharSequence getTitle() {
        return this.f370a.getTitle();
    }

    public void b(CharSequence charSequence) {
        this.f376g = true;
        e(charSequence);
    }

    private void e(CharSequence charSequence) {
        this.f377h = charSequence;
        if ((this.f371b & 8) != 0) {
            this.f370a.setTitle(charSequence);
        }
    }

    public void c(CharSequence charSequence) {
        this.f378i = charSequence;
        if ((this.f371b & 8) != 0) {
            this.f370a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public void b(int i2) {
        a(i2 != 0 ? b.a.a.a.a.b(a(), i2) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public void a(Drawable drawable) {
        this.f373d = drawable;
        c();
    }

    @Override // androidx.appcompat.widget.InterfaceC0095v
    public void a(int i2) {
        b(i2 != 0 ? b.a.a.a.a.b(a(), i2) : null);
    }

    public void b(Drawable drawable) {
        this.f374e = drawable;
        c();
    }

    private void c() {
        Drawable drawable;
        if ((this.f371b & 2) != 0) {
            drawable = ((this.f371b & 1) == 0 || this.f374e == null) ? this.f373d : this.f374e;
        } else {
            drawable = null;
        }
        this.f370a.setLogo(drawable);
    }

    public void d(int i2) {
        int i3 = this.f371b ^ i2;
        this.f371b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    e();
                }
                d();
            }
            if ((i3 & 3) != 0) {
                c();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f370a.setTitle(this.f377h);
                    this.f370a.setSubtitle(this.f378i);
                } else {
                    this.f370a.setTitle((CharSequence) null);
                    this.f370a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || this.f372c == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f370a.addView(this.f372c);
            } else {
                this.f370a.removeView(this.f372c);
            }
        }
    }

    public void a(View view) {
        if (this.f372c != null && (this.f371b & 16) != 0) {
            this.f370a.removeView(this.f372c);
        }
        this.f372c = view;
        if (view == null || (this.f371b & 16) == 0) {
            return;
        }
        this.f370a.addView(this.f372c);
    }

    public void c(Drawable drawable) {
        this.f375f = drawable;
        d();
    }

    private void d() {
        if ((this.f371b & 4) != 0) {
            this.f370a.setNavigationIcon(this.f375f != null ? this.f375f : this.o);
        } else {
            this.f370a.setNavigationIcon((Drawable) null);
        }
    }

    public void d(CharSequence charSequence) {
        this.j = charSequence;
        e();
    }

    public void e(int i2) {
        d(i2 == 0 ? null : a().getString(i2));
    }

    private void e() {
        if ((this.f371b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                this.f370a.setNavigationContentDescription(this.n);
            } else {
                this.f370a.setNavigationContentDescription(this.j);
            }
        }
    }
}
