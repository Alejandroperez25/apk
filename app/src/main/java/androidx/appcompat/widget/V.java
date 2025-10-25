package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a$e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class V extends b.e.a.c implements View.OnClickListener {
    private final SearchManager l;
    private final SearchView m;
    private final SearchableInfo n;
    private final Context o;
    private final WeakHashMap<String, Drawable.ConstantState> p;
    private final int q;
    private boolean r;
    private int s;
    private ColorStateList t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public V(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.r = false;
        this.s = 1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.l = (SearchManager) this.f1177d.getSystemService("search");
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public void a(int i2) {
        this.s = i2;
    }

    @Override // b.e.a.b.a
    public Cursor a(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.m.getVisibility() != 0 || this.m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorA = a(this.n, string, 50);
            if (cursorA != null) {
                cursorA.getCount();
                return cursorA;
            }
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(a());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(a());
    }

    private void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // b.e.a.a, b.e.a.b.a
    public void a(Cursor cursor) {
        if (this.r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.u = cursor.getColumnIndex("suggest_text_1");
                this.v = cursor.getColumnIndex("suggest_text_2");
                this.w = cursor.getColumnIndex("suggest_text_2_url");
                this.x = cursor.getColumnIndex("suggest_icon_1");
                this.y = cursor.getColumnIndex("suggest_icon_2");
                this.z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // b.e.a.c, b.e.a.a
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewA = super.a(context, cursor, viewGroup);
        viewA.setTag(new a(viewA));
        ((ImageView) viewA.findViewById(a$e.edit_query)).setImageResource(this.q);
        return viewA;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f313a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f314b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f315c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f316d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f317e;

        public a(View view) {
            this.f313a = (TextView) view.findViewById(android.R.id.text1);
            this.f314b = (TextView) view.findViewById(android.R.id.text2);
            this.f315c = (ImageView) view.findViewById(android.R.id.icon1);
            this.f316d = (ImageView) view.findViewById(android.R.id.icon2);
            this.f317e = (ImageView) view.findViewById(a$e.edit_query);
        }
    }

    @Override // b.e.a.a
    public void a(View view, Context context, Cursor cursor) {
        CharSequence charSequenceA;
        a aVar = (a) view.getTag();
        int i2 = this.z != -1 ? cursor.getInt(this.z) : 0;
        if (aVar.f313a != null) {
            a(aVar.f313a, a(cursor, this.u));
        }
        if (aVar.f314b != null) {
            String strA = a(cursor, this.w);
            if (strA != null) {
                charSequenceA = b((CharSequence) strA);
            } else {
                charSequenceA = a(cursor, this.v);
            }
            if (TextUtils.isEmpty(charSequenceA)) {
                if (aVar.f313a != null) {
                    aVar.f313a.setSingleLine(false);
                    aVar.f313a.setMaxLines(2);
                }
            } else if (aVar.f313a != null) {
                aVar.f313a.setSingleLine(true);
                aVar.f313a.setMaxLines(1);
            }
            a(aVar.f314b, charSequenceA);
        }
        if (aVar.f315c != null) {
            a(aVar.f315c, d(cursor), 4);
        }
        if (aVar.f316d != null) {
            a(aVar.f316d, e(cursor), 8);
        }
        if (this.s == 2 || (this.s == 1 && (i2 & 1) != 0)) {
            aVar.f317e.setVisibility(0);
            aVar.f317e.setTag(aVar.f313a.getText());
            aVar.f317e.setOnClickListener(this);
            return;
        }
        aVar.f317e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m.a((CharSequence) tag);
        }
    }

    private CharSequence b(CharSequence charSequence) {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.f1177d.getTheme().resolveAttribute(b.a.a$a.textColorSearchUrl, typedValue, true);
            this.t = this.f1177d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private Drawable d(Cursor cursor) throws NumberFormatException, IOException {
        if (this.x == -1) {
            return null;
        }
        Drawable drawableA = a(cursor.getString(this.x));
        return drawableA != null ? drawableA : f(cursor);
    }

    private Drawable e(Cursor cursor) {
        if (this.y == -1) {
            return null;
        }
        return a(cursor.getString(this.y));
    }

    private void a(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // b.e.a.a, b.e.a.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strA;
        String strA2;
        if (cursor == null) {
            return null;
        }
        String strA3 = a(cursor, "suggest_intent_query");
        if (strA3 != null) {
            return strA3;
        }
        if (this.n.shouldRewriteQueryFromData() && (strA2 = a(cursor, "suggest_intent_data")) != null) {
            return strA2;
        }
        if (!this.n.shouldRewriteQueryFromText() || (strA = a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strA;
    }

    @Override // b.e.a.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewA = a(this.f1177d, this.f1176c, viewGroup);
            if (viewA != null) {
                ((a) viewA.getTag()).f313a.setText(e2.toString());
            }
            return viewA;
        }
    }

    @Override // b.e.a.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewB = b(this.f1177d, this.f1176c, viewGroup);
            if (viewB != null) {
                ((a) viewB.getTag()).f313a.setText(e2.toString());
            }
            return viewB;
        }
    }

    private Drawable a(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.o.getPackageName() + "/" + i2;
            Drawable drawableB = b(str2);
            if (drawableB != null) {
                return drawableB;
            }
            Drawable drawableA = androidx.core.content.a.a(this.o, i2);
            a(str2, drawableA);
            return drawableA;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableB2 = b(str);
            if (drawableB2 != null) {
                return drawableB2;
            }
            Drawable drawableB3 = b(Uri.parse(str));
            a(str, drawableB3);
            return drawableB3;
        }
    }

    private Drawable b(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return a(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.o.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable b(String str) {
        Drawable.ConstantState constantState = this.p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.p.put(str, drawable.getConstantState());
        }
    }

    private Drawable f(Cursor cursor) throws PackageManager.NameNotFoundException {
        Drawable drawableA = a(this.n.getSearchActivity());
        return drawableA != null ? drawableA : this.f1177d.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable a(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (this.p.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState = this.p.get(strFlattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.o.getResources());
        }
        Drawable drawableB = b(componentName);
        this.p.put(strFlattenToShortString, drawableB != null ? drawableB.getConstantState() : null);
        return drawableB;
    }

    private Drawable b(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f1177d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("SuggestionsAdapter", e2.toString());
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static String a(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    Drawable a(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1177d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (identifier == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return resourcesForApplication.getDrawable(identifier);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor a(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f1177d.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }
}
