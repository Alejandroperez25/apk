package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a$c;
import b.a.a$e;
import b.a.a$f;
import b.a.a$g;
import b.a.a$i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends A implements b.a.c.b {
    static final a p = new a();
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    private c L;
    private b M;
    View.OnFocusChangeListener N;
    private d O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    b.e.a.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;
    private int aa;
    private boolean ba;
    private CharSequence ca;
    private CharSequence da;
    private boolean ea;
    private int fa;
    SearchableInfo ga;
    private Bundle ha;
    private final Runnable ia;
    private Runnable ja;
    private final WeakHashMap<String, Drawable.ConstantState> ka;
    private final View.OnClickListener la;
    View.OnKeyListener ma;
    private final TextView.OnEditorActionListener na;
    private final AdapterView.OnItemClickListener oa;
    private final AdapterView.OnItemSelectedListener pa;
    final SearchAutoComplete q;
    private TextWatcher qa;
    private final View r;
    private final View s;
    private final View t;
    final ImageView u;
    final ImageView v;
    final ImageView w;
    final ImageView x;
    private final View y;
    private f z;

    public interface b {
        boolean onClose();
    }

    public interface c {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface d {
        boolean onSuggestionClick(int i2);

        boolean onSuggestionSelect(int i2);
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a$a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.ia = new K(this);
        this.ja = new L(this);
        this.ka = new WeakHashMap<>();
        this.la = new O(this);
        this.ma = new P(this);
        this.na = new Q(this);
        this.oa = new R(this);
        this.pa = new S(this);
        this.qa = new J(this);
        aa aaVarA = aa.a(context, attributeSet, a$i.SearchView, i2, 0);
        LayoutInflater.from(context).inflate(aaVarA.g(a$i.SearchView_layout, a$f.abc_search_view), (ViewGroup) this, true);
        this.q = (SearchAutoComplete) findViewById(a$e.search_src_text);
        this.q.setSearchView(this);
        this.r = findViewById(a$e.search_edit_frame);
        this.s = findViewById(a$e.search_plate);
        this.t = findViewById(a$e.submit_area);
        this.u = (ImageView) findViewById(a$e.search_button);
        this.v = (ImageView) findViewById(a$e.search_go_btn);
        this.w = (ImageView) findViewById(a$e.search_close_btn);
        this.x = (ImageView) findViewById(a$e.search_voice_btn);
        this.E = (ImageView) findViewById(a$e.search_mag_icon);
        b.d.g.v.a(this.s, aaVarA.a(a$i.SearchView_queryBackground));
        b.d.g.v.a(this.t, aaVarA.a(a$i.SearchView_submitBackground));
        this.u.setImageDrawable(aaVarA.a(a$i.SearchView_searchIcon));
        this.v.setImageDrawable(aaVarA.a(a$i.SearchView_goIcon));
        this.w.setImageDrawable(aaVarA.a(a$i.SearchView_closeIcon));
        this.x.setImageDrawable(aaVarA.a(a$i.SearchView_voiceIcon));
        this.E.setImageDrawable(aaVarA.a(a$i.SearchView_searchIcon));
        this.F = aaVarA.a(a$i.SearchView_searchHintIcon);
        ha.a(this.u, getResources().getString(a$g.abc_searchview_description_search));
        this.G = aaVarA.g(a$i.SearchView_suggestionRowLayout, a$f.abc_search_dropdown_item_icons_2line);
        this.H = aaVarA.g(a$i.SearchView_commitIcon, 0);
        this.u.setOnClickListener(this.la);
        this.w.setOnClickListener(this.la);
        this.v.setOnClickListener(this.la);
        this.x.setOnClickListener(this.la);
        this.q.setOnClickListener(this.la);
        this.q.addTextChangedListener(this.qa);
        this.q.setOnEditorActionListener(this.na);
        this.q.setOnItemClickListener(this.oa);
        this.q.setOnItemSelectedListener(this.pa);
        this.q.setOnKeyListener(this.ma);
        this.q.setOnFocusChangeListener(new M(this));
        setIconifiedByDefault(aaVarA.a(a$i.SearchView_iconifiedByDefault, true));
        int iE = aaVarA.e(a$i.SearchView_android_maxWidth, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.K = aaVarA.b(a$i.SearchView_defaultQueryHint);
        this.U = aaVarA.b(a$i.SearchView_queryHint);
        int iA = aaVarA.a(a$i.SearchView_android_imeOptions, -1);
        if (iA != -1) {
            setImeOptions(iA);
        }
        int iA2 = aaVarA.a(a$i.SearchView_android_inputType, -1);
        if (iA2 != -1) {
            setInputType(iA2);
        }
        setFocusable(aaVarA.a(a$i.SearchView_android_focusable, true));
        aaVarA.a();
        this.I = new Intent("android.speech.action.WEB_SEARCH");
        this.I.addFlags(268435456);
        this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J.addFlags(268435456);
        this.y = findViewById(this.q.getDropDownAnchor());
        if (this.y != null) {
            this.y.addOnLayoutChangeListener(new N(this));
        }
        a(this.Q);
        o();
    }

    int getSuggestionRowLayout() {
        return this.G;
    }

    int getSuggestionCommitIconResId() {
        return this.H;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.ga = searchableInfo;
        if (this.ga != null) {
            p();
            o();
        }
        this.ba = j();
        if (this.ba) {
            this.q.setPrivateImeOptions("nm");
        }
        a(a());
    }

    public void setAppSearchData(Bundle bundle) {
        this.ha = bundle;
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (!a()) {
            boolean zRequestFocus = this.q.requestFocus(i2, rect);
            if (zRequestFocus) {
                a(false);
            }
            return zRequestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.W = false;
    }

    public void setOnQueryTextListener(c cVar) {
        this.L = cVar;
    }

    public void setOnCloseListener(b bVar) {
        this.M = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.O = dVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public void a(CharSequence charSequence, boolean z) {
        this.q.setText(charSequence);
        if (charSequence != null) {
            this.q.setSelection(this.q.length());
            this.da = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        c();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        o();
    }

    public CharSequence getQueryHint() {
        if (this.U != null) {
            return this.U;
        }
        if (this.ga != null && this.ga.getHintId() != 0) {
            return getContext().getText(this.ga.getHintId());
        }
        return this.K;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.Q == z) {
            return;
        }
        this.Q = z;
        a(z);
        o();
    }

    public void setIconified(boolean z) {
        if (z) {
            d();
        } else {
            e();
        }
    }

    public boolean a() {
        return this.R;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.T = z;
        a(a());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.V = z;
        if (this.S instanceof V) {
            ((V) this.S).a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(b.e.a.a aVar) {
        this.S = aVar;
        this.q.setAdapter(this.S);
    }

    public b.e.a.a getSuggestionsAdapter() {
        return this.S;
    }

    public void setMaxWidth(int i2) {
        this.aa = i2;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.aa;
    }

    @Override // androidx.appcompat.widget.A, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (a()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = this.aa > 0 ? Math.min(this.aa, size) : Math.min(getPreferredWidth(), size);
        } else if (mode != 0) {
            if (mode == 1073741824 && this.aa > 0) {
                size = Math.min(this.aa, size);
            }
        } else {
            size = this.aa > 0 ? this.aa : getPreferredWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // androidx.appcompat.widget.A, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            a(this.q, this.A);
            this.B.set(this.A.left, 0, this.A.right, i5 - i3);
            if (this.z == null) {
                this.z = new f(this.B, this.A, this.q);
                setTouchDelegate(this.z);
            } else {
                this.z.a(this.B, this.A);
            }
        }
    }

    private void a(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int i2 = this.C[1] - this.D[1];
        int i3 = this.C[0] - this.D[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a$c.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a$c.abc_search_view_preferred_height);
    }

    private void a(boolean z) {
        this.R = z;
        int i2 = 8;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        b(z2);
        this.r.setVisibility(z ? 8 : 0);
        if (this.E.getDrawable() != null && !this.Q) {
            i2 = 0;
        }
        this.E.setVisibility(i2);
        m();
        c(z2 ? false : true);
        l();
    }

    private boolean j() {
        if (this.ga != null && this.ga.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.ga.getVoiceSearchLaunchWebSearch()) {
                intent = this.I;
            } else if (this.ga.getVoiceSearchLaunchRecognizer()) {
                intent = this.J;
            }
            return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        return false;
    }

    private boolean k() {
        return (this.T || this.ba) && !a();
    }

    private void b(boolean z) {
        this.v.setVisibility((this.T && k() && hasFocus() && (z || !this.ba)) ? 0 : 8);
    }

    private void l() {
        this.t.setVisibility((k() && (this.v.getVisibility() == 0 || this.x.getVisibility() == 0)) ? 0 : 8);
    }

    private void m() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.q.getText());
        if (!z2 && (!this.Q || this.ea)) {
            z = false;
        }
        this.w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void n() {
        post(this.ia);
    }

    void b() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.ia);
        post(this.ja);
        super.onDetachedFromWindow();
    }

    void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    boolean a(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.ga != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return a(this.q.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                this.q.setSelection(i2 == 21 ? 0 : this.q.length());
                this.q.setListSelection(0);
                this.q.clearListSelection();
                p.a(this.q, true);
                return true;
            }
            if (i2 != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence c(CharSequence charSequence) {
        if (!this.Q || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (this.q.getTextSize() * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(c(queryHint));
    }

    private void p() {
        this.q.setThreshold(this.ga.getSuggestThreshold());
        this.q.setImeOptions(this.ga.getImeOptions());
        int inputType = this.ga.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.ga.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.q.setInputType(inputType);
        if (this.S != null) {
            this.S.a((Cursor) null);
        }
        if (this.ga.getSuggestAuthority() != null) {
            this.S = new V(getContext(), this, this.ga, this.ka);
            this.q.setAdapter(this.S);
            ((V) this.S).a(this.V ? 2 : 1);
        }
    }

    private void c(boolean z) {
        int i2;
        if (this.ba && !a() && z) {
            i2 = 0;
            this.v.setVisibility(8);
        } else {
            i2 = 8;
        }
        this.x.setVisibility(i2);
    }

    void b(CharSequence charSequence) {
        Editable text = this.q.getText();
        this.da = text;
        boolean z = !TextUtils.isEmpty(text);
        b(z);
        c(z ? false : true);
        m();
        l();
        if (this.L != null && !TextUtils.equals(charSequence, this.ca)) {
            this.L.onQueryTextChange(charSequence.toString());
        }
        this.ca = charSequence.toString();
    }

    void c() {
        Editable text = this.q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.L == null || !this.L.onQueryTextSubmit(text.toString())) {
            if (this.ga != null) {
                a(0, (String) null, text.toString());
            }
            this.q.setImeVisibility(false);
            q();
        }
    }

    private void q() {
        this.q.dismissDropDown();
    }

    void d() {
        if (TextUtils.isEmpty(this.q.getText())) {
            if (this.Q) {
                if (this.M == null || !this.M.onClose()) {
                    clearFocus();
                    a(true);
                    return;
                }
                return;
            }
            return;
        }
        this.q.setText("");
        this.q.requestFocus();
        this.q.setImeVisibility(true);
    }

    void e() {
        a(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        if (this.P != null) {
            this.P.onClick(this);
        }
    }

    void f() {
        if (this.ga == null) {
            return;
        }
        SearchableInfo searchableInfo = this.ga;
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(a(this.I, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(b(this.J, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    void g() {
        a(a());
        n();
        if (this.q.hasFocus()) {
            i();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        n();
    }

    @Override // b.a.c.b
    public void onActionViewCollapsed() {
        a("", false);
        clearFocus();
        a(true);
        this.q.setImeOptions(this.fa);
        this.ea = false;
    }

    @Override // b.a.c.b
    public void onActionViewExpanded() {
        if (this.ea) {
            return;
        }
        this.ea = true;
        this.fa = this.q.getImeOptions();
        this.q.setImeOptions(this.fa | 33554432);
        this.q.setText("");
        setIconified(false);
    }

    static class e extends b.f.a.c {
        public static final Parcelable.Creator<e> CREATOR = new T();

        /* renamed from: a, reason: collision with root package name */
        boolean f290a;

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f290a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // b.f.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f290a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f290a + "}";
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f290a = a();
        return eVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f());
        a(eVar.f290a);
        requestLayout();
    }

    void h() {
        int i2;
        if (this.y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zA = na.a(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(a$c.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(a$c.abc_dropdownitem_text_padding_left) : 0;
            this.q.getDropDownBackground().getPadding(rect);
            if (zA) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.q.setDropDownHorizontalOffset(i2);
            this.q.setDropDownWidth((((this.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    boolean a(int i2, int i3, String str) {
        if (this.O != null && this.O.onSuggestionClick(i2)) {
            return false;
        }
        b(i2, 0, null);
        this.q.setImeVisibility(false);
        q();
        return true;
    }

    boolean d(int i2) {
        if (this.O != null && this.O.onSuggestionSelect(i2)) {
            return false;
        }
        e(i2);
        return true;
    }

    private void e(int i2) {
        Editable text = this.q.getText();
        Cursor cursorA = this.S.a();
        if (cursorA == null) {
            return;
        }
        if (cursorA.moveToPosition(i2)) {
            CharSequence charSequenceConvertToString = this.S.convertToString(cursorA);
            if (charSequenceConvertToString != null) {
                setQuery(charSequenceConvertToString);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private boolean b(int i2, int i3, String str) {
        Cursor cursorA = this.S.a();
        if (cursorA == null || !cursorA.moveToPosition(i2)) {
            return false;
        }
        a(a(cursorA, i3, str));
        return true;
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.da);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.ha != null) {
            intent.putExtra("app_data", this.ha);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.ga.getSearchActivity());
        return intent;
    }

    private Intent a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private Intent b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.ha != null) {
            bundle.putParcelable("app_data", this.ha);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent a(Cursor cursor, int i2, String str) {
        int position;
        String strA;
        try {
            String strA2 = V.a(cursor, "suggest_intent_action");
            if (strA2 == null) {
                strA2 = this.ga.getSuggestIntentAction();
            }
            if (strA2 == null) {
                strA2 = "android.intent.action.SEARCH";
            }
            String str2 = strA2;
            String strA3 = V.a(cursor, "suggest_intent_data");
            if (strA3 == null) {
                strA3 = this.ga.getSuggestIntentData();
            }
            if (strA3 != null && (strA = V.a(cursor, "suggest_intent_data_id")) != null) {
                strA3 = strA3 + "/" + Uri.encode(strA);
            }
            return a(str2, strA3 == null ? null : Uri.parse(strA3), V.a(cursor, "suggest_intent_extra_data"), V.a(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    void i() {
        p.a(this.q);
        p.b(this.q);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private static class f extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f291a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f292b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f293c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f294d;

        /* renamed from: e, reason: collision with root package name */
        private final int f295e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f296f;

        public f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f295e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f292b = new Rect();
            this.f294d = new Rect();
            this.f293c = new Rect();
            a(rect, rect2);
            this.f291a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f292b.set(rect);
            this.f294d.set(rect);
            this.f294d.inset(-this.f295e, -this.f295e);
            this.f293c.set(rect2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // android.view.TouchDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L27;
                    case 1: goto L19;
                    case 2: goto L19;
                    case 3: goto L14;
                    default: goto L13;
                }
            L13:
                goto L33
            L14:
                boolean r2 = r6.f296f
                r6.f296f = r4
                goto L34
            L19:
                boolean r2 = r6.f296f
                if (r2 == 0) goto L34
                android.graphics.Rect r5 = r6.f294d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L34
                r3 = 0
                goto L34
            L27:
                android.graphics.Rect r2 = r6.f292b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L33
                r6.f296f = r3
                r2 = 1
                goto L34
            L33:
                r2 = 0
            L34:
                if (r2 == 0) goto L6b
                if (r3 == 0) goto L56
                android.graphics.Rect r2 = r6.f293c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L56
                android.view.View r0 = r6.f291a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f291a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L65
            L56:
                android.graphics.Rect r2 = r6.f293c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f293c
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L65:
                android.view.View r0 = r6.f291a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L6b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class SearchAutoComplete extends AbstractC0081h {

        /* renamed from: d, reason: collision with root package name */
        private int f283d;

        /* renamed from: e, reason: collision with root package name */
        private SearchView f284e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f285f;

        /* renamed from: g, reason: collision with root package name */
        final Runnable f286g;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, b.a.a$a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f286g = new U(this);
            this.f283d = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(SearchView searchView) {
            this.f284e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f283d = i2;
        }

        boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.f284e.hasFocus() && getVisibility() == 0) {
                this.f285f = true;
                if (SearchView.a(getContext())) {
                    SearchView.p.a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f284e.g();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f283d <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f284e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.AbstractC0081h, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f285f) {
                removeCallbacks(this.f286g);
                post(this.f286g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        void b() {
            if (this.f285f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f285f = false;
            }
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f285f = false;
                removeCallbacks(this.f286g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f285f = false;
                    removeCallbacks(this.f286g);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f285f = true;
            }
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private Method f287a;

        /* renamed from: b, reason: collision with root package name */
        private Method f288b;

        /* renamed from: c, reason: collision with root package name */
        private Method f289c;

        a() {
            try {
                this.f287a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f287a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f288b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f288b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f289c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f289c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f287a != null) {
                try {
                    this.f287a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f288b != null) {
                try {
                    this.f288b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (this.f289c != null) {
                try {
                    this.f289c.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }
}
