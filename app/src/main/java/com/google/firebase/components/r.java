package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final List<e<?>> f5439a;

    public r(List<e<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f5439a = list;
    }
}
