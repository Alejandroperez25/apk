package i.a.a;

import android.media.SoundPool;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
class f implements SoundPool.OnLoadCompleteListener {
    f() {
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(SoundPool soundPool, int i2, int i3) {
        Log.d("WSP", "Loaded " + i2);
        g gVar = (g) g.f5933b.get(Integer.valueOf(i2));
        if (gVar != null) {
            g.f5933b.remove(gVar.f5940i);
            synchronized (g.f5934c) {
                for (g gVar2 : (List) g.f5934c.get(gVar.f5937f)) {
                    Log.d("WSP", "Marking " + gVar2 + " as loaded");
                    gVar2.n = false;
                    if (gVar2.k) {
                        Log.d("WSP", "Delayed start of " + gVar2);
                        gVar2.l();
                    }
                }
            }
        }
    }
}
