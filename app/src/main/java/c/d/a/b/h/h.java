package c.d.a.b.h;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h<TResult> {
    public abstract h<TResult> a(InterfaceC0230d interfaceC0230d);

    public abstract h<TResult> a(Executor executor, InterfaceC0230d interfaceC0230d);

    public abstract h<TResult> a(Executor executor, e<? super TResult> eVar);

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract TResult d();

    public abstract Exception e();

    public h<TResult> a(InterfaceC0229c<TResult> interfaceC0229c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> a(Executor executor, InterfaceC0229c<TResult> interfaceC0229c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public h<TResult> a(Executor executor, InterfaceC0228b interfaceC0228b) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> a(Executor executor, InterfaceC0227a<TResult, TContinuationResult> interfaceC0227a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> a(InterfaceC0227a<TResult, h<TContinuationResult>> interfaceC0227a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> b(Executor executor, InterfaceC0227a<TResult, h<TContinuationResult>> interfaceC0227a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> h<TContinuationResult> a(Executor executor, g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
