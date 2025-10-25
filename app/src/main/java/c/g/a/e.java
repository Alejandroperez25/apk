package c.g.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* loaded from: classes.dex */
class e implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4479a;

    e(h hVar) {
        this.f4479a = hVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
        this.f4479a.a("ScanResult", i.a(bluetoothDevice, bArr, i2).d());
    }
}
