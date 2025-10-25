package androidx.fragment.app;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC0103d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC0104e f721a;

    RunnableC0103d(AbstractDialogInterfaceOnCancelListenerC0104e abstractDialogInterfaceOnCancelListenerC0104e) {
        this.f721a = abstractDialogInterfaceOnCancelListenerC0104e;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f721a.fa != null) {
            this.f721a.onDismiss(this.f721a.fa);
        }
    }
}
