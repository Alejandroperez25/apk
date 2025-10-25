package c.d.d;

import c.d.d.AbstractC0275a;
import c.d.d.AbstractC0289o;
import c.d.d.AbstractC0289o.a;
import c.d.d.AbstractC0290p;
import c.d.d.C0287m;
import c.d.d.x;
import c.g.a.k$A;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c.d.d.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0289o<MessageType extends AbstractC0289o<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0275a<MessageType, BuilderType> {

    /* renamed from: b, reason: collision with root package name */
    protected J f4423b = J.a();

    /* renamed from: c, reason: collision with root package name */
    protected int f4424c = -1;

    /* renamed from: c.d.d.o$e */
    public interface e<MessageType extends d<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends y {
    }

    /* renamed from: c.d.d.o$f */
    static final class f implements C0287m.a<f> {
        public abstract int a();
    }

    /* renamed from: c.d.d.o$i */
    public enum i {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: c.d.d.o$j */
    protected interface j {
        int a(boolean z, int i2, boolean z2, int i3);

        J a(J j, J j2);

        AbstractC0280f a(boolean z, AbstractC0280f abstractC0280f, boolean z2, AbstractC0280f abstractC0280f2);

        C0287m<f> a(C0287m<f> c0287m, C0287m<f> c0287m2);

        <T> AbstractC0290p.c<T> a(AbstractC0290p.c<T> cVar, AbstractC0290p.c<T> cVar2);

        <K, V> w<K, V> a(w<K, V> wVar, w<K, V> wVar2);

        <T extends x> T a(T t, T t2);

        String a(boolean z, String str, boolean z2, String str2);

        boolean a(boolean z, boolean z2, boolean z3, boolean z4);
    }

    protected abstract Object a(i iVar, Object obj, Object obj2);

    public final A<MessageType> f() {
        return (A) a(i.GET_PARSER);
    }

    @Override // c.d.d.y
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final MessageType a() {
        return (MessageType) a(i.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType h() {
        return (BuilderType) a(i.NEW_BUILDER);
    }

    public String toString() {
        return z.a(this, super.toString());
    }

    public int hashCode() {
        if (this.f4384a == 0) {
            g gVar = new g(null);
            a((j) gVar, (g) this);
            this.f4384a = gVar.f4432a;
        }
        return this.f4384a;
    }

    int a(g gVar) {
        if (this.f4384a == 0) {
            int i2 = gVar.f4432a;
            gVar.f4432a = 0;
            a((j) gVar, (g) this);
            this.f4384a = gVar.f4432a;
            gVar.f4432a = i2;
        }
        return this.f4384a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a().getClass().isInstance(obj)) {
            return false;
        }
        try {
            a((j) c.f4429a, (c) obj);
            return true;
        } catch (c.a unused) {
            return false;
        }
    }

    boolean a(c cVar, x xVar) {
        if (this == xVar) {
            return true;
        }
        if (!a().getClass().isInstance(xVar)) {
            return false;
        }
        a((j) cVar, (c) xVar);
        return true;
    }

    protected void i() {
        a(i.MAKE_IMMUTABLE);
        this.f4423b.b();
    }

    public final boolean j() {
        return a(i.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    @Override // c.d.d.x
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        BuilderType buildertype = (BuilderType) a(i.NEW_BUILDER);
        buildertype.b(this);
        return buildertype;
    }

    protected Object a(i iVar, Object obj) {
        return a(iVar, obj, (Object) null);
    }

    protected Object a(i iVar) {
        return a(iVar, (Object) null, (Object) null);
    }

    void a(j jVar, MessageType messagetype) {
        a(i.VISIT, jVar, messagetype);
        this.f4423b = jVar.a(this.f4423b, messagetype.f4423b);
    }

    /* renamed from: c.d.d.o$a */
    public static abstract class a<MessageType extends AbstractC0289o<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0275a.AbstractC0051a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private final MessageType f4425a;

        /* renamed from: b, reason: collision with root package name */
        protected MessageType f4426b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f4427c = false;

        @Override // c.d.d.AbstractC0275a.AbstractC0051a
        protected /* bridge */ /* synthetic */ AbstractC0275a.AbstractC0051a a(AbstractC0275a abstractC0275a) {
            a((a<MessageType, BuilderType>) abstractC0275a);
            return this;
        }

        @Override // c.d.d.x.a
        public /* bridge */ /* synthetic */ x.a a(C0281g c0281g, C0285k c0285k) throws IOException {
            c(c0281g, c0285k);
            return this;
        }

        @Override // c.d.d.AbstractC0275a.AbstractC0051a
        public /* bridge */ /* synthetic */ AbstractC0275a.AbstractC0051a b(C0281g c0281g, C0285k c0285k) throws IOException {
            c(c0281g, c0285k);
            return this;
        }

        protected a(MessageType messagetype) {
            this.f4425a = messagetype;
            this.f4426b = (MessageType) messagetype.a(i.NEW_MUTABLE_INSTANCE);
        }

        protected void b() {
            if (this.f4427c) {
                MessageType messagetype = (MessageType) this.f4426b.a(i.NEW_MUTABLE_INSTANCE);
                messagetype.a(h.f4433a, this.f4426b);
                this.f4426b = messagetype;
                this.f4427c = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType m4clone() {
            k$A.a aVar = (BuilderType) a().h();
            aVar.b((k$A.a) g());
            return aVar;
        }

        @Override // c.d.d.x.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public MessageType g() {
            if (this.f4427c) {
                return this.f4426b;
            }
            this.f4426b.i();
            this.f4427c = true;
            return this.f4426b;
        }

        @Override // c.d.d.x.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final MessageType f() {
            MessageType messagetype = (MessageType) g();
            if (messagetype.j()) {
                return messagetype;
            }
            throw AbstractC0275a.AbstractC0051a.b(messagetype);
        }

        protected BuilderType a(MessageType messagetype) {
            b((a<MessageType, BuilderType>) messagetype);
            return this;
        }

        public BuilderType b(MessageType messagetype) {
            b();
            this.f4426b.a(h.f4433a, messagetype);
            return this;
        }

        @Override // c.d.d.y
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public MessageType a() {
            return this.f4425a;
        }

        public BuilderType c(C0281g c0281g, C0285k c0285k) throws IOException {
            b();
            try {
                this.f4426b.a(i.MERGE_FROM_STREAM, c0281g, c0285k);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }
    }

    /* renamed from: c.d.d.o$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType extends GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends AbstractC0289o<MessageType, BuilderType> implements e<MessageType, BuilderType> {

        /* renamed from: d, reason: collision with root package name */
        protected C0287m<f> f4431d = C0287m.a();

        @Override // c.d.d.AbstractC0289o, c.d.d.y
        public /* bridge */ /* synthetic */ x a() {
            return super.a();
        }

        @Override // c.d.d.AbstractC0289o, c.d.d.x
        public /* bridge */ /* synthetic */ x.a b() {
            return super.b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // c.d.d.AbstractC0289o
        public final void a(j jVar, MessageType messagetype) {
            super.a(jVar, (j) messagetype);
            this.f4431d = jVar.a(this.f4431d, messagetype.f4431d);
        }

        @Override // c.d.d.AbstractC0289o
        protected final void i() {
            super.i();
            this.f4431d.b();
        }
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <E> AbstractC0290p.c<E> e() {
        return B.d();
    }

    protected static <E> AbstractC0290p.c<E> a(AbstractC0290p.c<E> cVar) {
        int size = cVar.size();
        return cVar.a(size == 0 ? 10 : size * 2);
    }

    /* renamed from: c.d.d.o$b */
    protected static class b<T extends AbstractC0289o<T, ?>> extends AbstractC0276b<T> {

        /* renamed from: b, reason: collision with root package name */
        private T f4428b;

        public b(T t) {
            this.f4428b = t;
        }

        @Override // c.d.d.A
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T a(C0281g c0281g, C0285k c0285k) {
            return (T) AbstractC0289o.a(this.f4428b, c0281g, c0285k);
        }
    }

    static <T extends AbstractC0289o<T, ?>> T a(T t, C0281g c0281g, C0285k c0285k) throws C0291q {
        T t2 = (T) t.a(i.NEW_MUTABLE_INSTANCE);
        try {
            t2.a(i.MERGE_FROM_STREAM, c0281g, c0285k);
            t2.i();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C0291q) {
                throw ((C0291q) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: c.d.d.o$c */
    static class c implements j {

        /* renamed from: a, reason: collision with root package name */
        static final c f4429a = new c();

        /* renamed from: b, reason: collision with root package name */
        static final a f4430b = new a();

        /* renamed from: c.d.d.o$c$a */
        static final class a extends RuntimeException {
            a() {
            }
        }

        private c() {
        }

        @Override // c.d.d.AbstractC0289o.j
        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public int a(boolean z, int i2, boolean z2, int i3) {
            if (z == z2 && i2 == i3) {
                return i2;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public String a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public AbstractC0280f a(boolean z, AbstractC0280f abstractC0280f, boolean z2, AbstractC0280f abstractC0280f2) {
            if (z == z2 && abstractC0280f.equals(abstractC0280f2)) {
                return abstractC0280f;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T extends x> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f4430b;
            }
            ((AbstractC0289o) t).a(this, t2);
            return t;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T> AbstractC0290p.c<T> a(AbstractC0290p.c<T> cVar, AbstractC0290p.c<T> cVar2) {
            if (cVar.equals(cVar2)) {
                return cVar;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public C0287m<f> a(C0287m<f> c0287m, C0287m<f> c0287m2) {
            if (c0287m.equals(c0287m2)) {
                return c0287m;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public J a(J j, J j2) {
            if (j.equals(j2)) {
                return j;
            }
            throw f4430b;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <K, V> w<K, V> a(w<K, V> wVar, w<K, V> wVar2) {
            if (wVar.equals(wVar2)) {
                return wVar;
            }
            throw f4430b;
        }
    }

    /* renamed from: c.d.d.o$g */
    private static class g implements j {

        /* renamed from: a, reason: collision with root package name */
        private int f4432a;

        private g() {
            this.f4432a = 0;
        }

        /* synthetic */ g(C0288n c0288n) {
            this();
        }

        @Override // c.d.d.AbstractC0289o.j
        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f4432a = (this.f4432a * 53) + AbstractC0290p.a(z2);
            return z2;
        }

        @Override // c.d.d.AbstractC0289o.j
        public int a(boolean z, int i2, boolean z2, int i3) {
            this.f4432a = (this.f4432a * 53) + i2;
            return i2;
        }

        @Override // c.d.d.AbstractC0289o.j
        public String a(boolean z, String str, boolean z2, String str2) {
            this.f4432a = (this.f4432a * 53) + str.hashCode();
            return str;
        }

        @Override // c.d.d.AbstractC0289o.j
        public AbstractC0280f a(boolean z, AbstractC0280f abstractC0280f, boolean z2, AbstractC0280f abstractC0280f2) {
            this.f4432a = (this.f4432a * 53) + abstractC0280f.hashCode();
            return abstractC0280f;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T extends x> T a(T t, T t2) {
            int iHashCode;
            if (t == null) {
                iHashCode = 37;
            } else if (t instanceof AbstractC0289o) {
                iHashCode = ((AbstractC0289o) t).a(this);
            } else {
                iHashCode = t.hashCode();
            }
            this.f4432a = (this.f4432a * 53) + iHashCode;
            return t;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T> AbstractC0290p.c<T> a(AbstractC0290p.c<T> cVar, AbstractC0290p.c<T> cVar2) {
            this.f4432a = (this.f4432a * 53) + cVar.hashCode();
            return cVar;
        }

        @Override // c.d.d.AbstractC0289o.j
        public C0287m<f> a(C0287m<f> c0287m, C0287m<f> c0287m2) {
            this.f4432a = (this.f4432a * 53) + c0287m.hashCode();
            return c0287m;
        }

        @Override // c.d.d.AbstractC0289o.j
        public J a(J j, J j2) {
            this.f4432a = (this.f4432a * 53) + j.hashCode();
            return j;
        }

        @Override // c.d.d.AbstractC0289o.j
        public <K, V> w<K, V> a(w<K, V> wVar, w<K, V> wVar2) {
            this.f4432a = (this.f4432a * 53) + wVar.hashCode();
            return wVar;
        }
    }

    /* renamed from: c.d.d.o$h */
    protected static class h implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4433a = new h();

        @Override // c.d.d.AbstractC0289o.j
        public int a(boolean z, int i2, boolean z2, int i3) {
            return z2 ? i3 : i2;
        }

        @Override // c.d.d.AbstractC0289o.j
        public AbstractC0280f a(boolean z, AbstractC0280f abstractC0280f, boolean z2, AbstractC0280f abstractC0280f2) {
            return z2 ? abstractC0280f2 : abstractC0280f;
        }

        @Override // c.d.d.AbstractC0289o.j
        public String a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // c.d.d.AbstractC0289o.j
        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        private h() {
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T extends x> T a(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            x.a aVarB = t.b();
            aVarB.a(t2);
            return (T) aVarB.f();
        }

        @Override // c.d.d.AbstractC0289o.j
        public <T> AbstractC0290p.c<T> a(AbstractC0290p.c<T> cVar, AbstractC0290p.c<T> cVar2) {
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.b()) {
                    cVar = cVar.a(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            return size > 0 ? cVar : cVar2;
        }

        @Override // c.d.d.AbstractC0289o.j
        public C0287m<f> a(C0287m<f> c0287m, C0287m<f> c0287m2) {
            if (c0287m.c()) {
                c0287m = c0287m.m3clone();
            }
            c0287m.a((C0287m) c0287m2);
            return c0287m;
        }

        @Override // c.d.d.AbstractC0289o.j
        public J a(J j, J j2) {
            return j2 == J.a() ? j : J.a(j, j2);
        }

        @Override // c.d.d.AbstractC0289o.j
        public <K, V> w<K, V> a(w<K, V> wVar, w<K, V> wVar2) {
            if (!wVar2.isEmpty()) {
                if (!wVar.d()) {
                    wVar = wVar.b();
                }
                wVar.a((w) wVar2);
            }
            return wVar;
        }
    }
}
