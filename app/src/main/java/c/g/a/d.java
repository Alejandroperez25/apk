package c.g.a;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import java.util.List;

/* loaded from: classes.dex */
class d extends ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4478a;

    d(h hVar) {
        this.f4478a = hVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i2, ScanResult scanResult) {
        super.onScanResult(i2, scanResult);
        this.f4478a.a("ScanResult", i.a(scanResult.getDevice(), scanResult).d());
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i2) {
        super.onScanFailed(i2);
    }
}
