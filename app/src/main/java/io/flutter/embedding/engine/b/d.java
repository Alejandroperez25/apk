package io.flutter.embedding.engine.b;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.io.File;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5998a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        private final File[] f5999a;

        a(File[] fileArr) {
            this.f5999a = fileArr;
        }

        boolean a() {
            return this.f5999a != null && this.f5999a.length > 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            for (File file : this.f5999a) {
                if (file.exists()) {
                    a(file);
                }
            }
            return null;
        }

        private void a(File file) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
            file.delete();
        }
    }

    d(Context context) {
        this.f5998a = context;
    }

    void a() {
        File cacheDir = this.f5998a.getCacheDir();
        if (cacheDir == null) {
            return;
        }
        a aVar = new a(cacheDir.listFiles(new b(this)));
        if (aVar.a()) {
            new Handler().postDelayed(new c(this, aVar), 5000L);
        }
    }
}
