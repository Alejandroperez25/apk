package b.i.a;

import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import b.c.j;
import b.i.b.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends b.i.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final i f1195a;

    /* renamed from: b, reason: collision with root package name */
    private final C0021b f1196b;

    public static class a<D> extends p<D> implements a.InterfaceC0022a<D> {
        abstract b.i.b.a<D> a(boolean z);

        public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        abstract void c();

        public abstract String toString();
    }

    /* renamed from: b.i.a.b$b, reason: collision with other inner class name */
    static class C0021b extends t {

        /* renamed from: c, reason: collision with root package name */
        private static final u.a f1197c = new c();

        /* renamed from: d, reason: collision with root package name */
        private j<a> f1198d = new j<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f1199e = false;

        C0021b() {
        }

        static C0021b a(v vVar) {
            return (C0021b) new u(vVar, f1197c).a(C0021b.class);
        }

        void c() {
            int iA = this.f1198d.a();
            for (int i2 = 0; i2 < iA; i2++) {
                this.f1198d.d(i2).c();
            }
        }

        @Override // androidx.lifecycle.t
        protected void a() {
            super.a();
            int iA = this.f1198d.a();
            for (int i2 = 0; i2 < iA; i2++) {
                this.f1198d.d(i2).a(true);
            }
            this.f1198d.b();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1198d.a() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f1198d.a(); i2++) {
                    a aVarD = this.f1198d.d(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1198d.c(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarD.toString());
                    aVarD.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    b(i iVar, v vVar) {
        this.f1195a = iVar;
        this.f1196b = C0021b.a(vVar);
    }

    @Override // b.i.a.a
    public void a() {
        this.f1196b.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.d.f.a.a(this.f1195a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // b.i.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1196b.a(str, fileDescriptor, printWriter, strArr);
    }
}
