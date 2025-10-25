package io.flutter.embedding.engine.b;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f5995a;

    b(d dVar) {
        this.f5995a = dVar;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(".org.chromium.Chromium.");
    }
}
