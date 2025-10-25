package b.e.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b.e.a.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f1174a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f1175b;

    /* renamed from: c, reason: collision with root package name */
    protected Cursor f1176c;

    /* renamed from: d, reason: collision with root package name */
    protected Context f1177d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1178e;

    /* renamed from: f, reason: collision with root package name */
    protected C0020a f1179f;

    /* renamed from: g, reason: collision with root package name */
    protected DataSetObserver f1180g;

    /* renamed from: h, reason: collision with root package name */
    protected b.e.a.b f1181h;

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract CharSequence convertToString(Cursor cursor);

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    void a(Context context, Cursor cursor, int i2) {
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f1175b = true;
        } else {
            this.f1175b = false;
        }
        boolean z = cursor != null;
        this.f1176c = cursor;
        this.f1174a = z;
        this.f1177d = context;
        this.f1178e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f1179f = new C0020a();
            this.f1180g = new b();
        } else {
            this.f1179f = null;
            this.f1180g = null;
        }
        if (z) {
            if (this.f1179f != null) {
                cursor.registerContentObserver(this.f1179f);
            }
            if (this.f1180g != null) {
                cursor.registerDataSetObserver(this.f1180g);
            }
        }
    }

    @Override // b.e.a.b.a
    public Cursor a() {
        return this.f1176c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f1174a || this.f1176c == null) {
            return 0;
        }
        return this.f1176c.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        if (!this.f1174a || this.f1176c == null) {
            return null;
        }
        this.f1176c.moveToPosition(i2);
        return this.f1176c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        if (this.f1174a && this.f1176c != null && this.f1176c.moveToPosition(i2)) {
            return this.f1176c.getLong(this.f1178e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1174a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1176c.moveToPosition(i2)) {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        if (view == null) {
            view = a(this.f1177d, this.f1176c, viewGroup);
        }
        a(view, this.f1177d, this.f1176c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1174a) {
            return null;
        }
        this.f1176c.moveToPosition(i2);
        if (view == null) {
            view = b(this.f1177d, this.f1176c, viewGroup);
        }
        a(view, this.f1177d, this.f1176c);
        return view;
    }

    public void a(Cursor cursor) {
        Cursor cursorB = b(cursor);
        if (cursorB != null) {
            cursorB.close();
        }
    }

    public Cursor b(Cursor cursor) {
        if (cursor == this.f1176c) {
            return null;
        }
        Cursor cursor2 = this.f1176c;
        if (cursor2 != null) {
            if (this.f1179f != null) {
                cursor2.unregisterContentObserver(this.f1179f);
            }
            if (this.f1180g != null) {
                cursor2.unregisterDataSetObserver(this.f1180g);
            }
        }
        this.f1176c = cursor;
        if (cursor != null) {
            if (this.f1179f != null) {
                cursor.registerContentObserver(this.f1179f);
            }
            if (this.f1180g != null) {
                cursor.registerDataSetObserver(this.f1180g);
            }
            this.f1178e = cursor.getColumnIndexOrThrow("_id");
            this.f1174a = true;
            notifyDataSetChanged();
        } else {
            this.f1178e = -1;
            this.f1174a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1181h == null) {
            this.f1181h = new b.e.a.b(this);
        }
        return this.f1181h;
    }

    protected void b() {
        if (!this.f1175b || this.f1176c == null || this.f1176c.isClosed()) {
            return;
        }
        this.f1174a = this.f1176c.requery();
    }

    /* renamed from: b.e.a.a$a, reason: collision with other inner class name */
    private class C0020a extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        C0020a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.b();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a.this.f1174a = true;
            a.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a.this.f1174a = false;
            a.this.notifyDataSetInvalidated();
        }
    }
}
