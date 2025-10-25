package f.a.b.c;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import f.a.a.a.o;

/* loaded from: classes.dex */
class a extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences.Editor f5761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o.d f5762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f5763c;

    a(b bVar, SharedPreferences.Editor editor, o.d dVar) {
        this.f5763c = bVar;
        this.f5761a = editor;
        this.f5762b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        return Boolean.valueOf(this.f5761a.commit());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        this.f5762b.a(bool);
    }
}
