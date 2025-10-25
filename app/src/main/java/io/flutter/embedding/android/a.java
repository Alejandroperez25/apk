package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.embedding.engine.e.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final io.flutter.embedding.engine.e.c f5964a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a.a.b.c f5965b;

    /* renamed from: c, reason: collision with root package name */
    private int f5966c;

    public a(io.flutter.embedding.engine.e.c cVar, f.a.a.b.c cVar2) {
        this.f5964a = cVar;
        this.f5965b = cVar2;
    }

    public void a(KeyEvent keyEvent) {
        this.f5964a.a(new c.a(keyEvent, a(keyEvent.getUnicodeChar())));
    }

    public void b(KeyEvent keyEvent) {
        if (this.f5965b.d() != null && this.f5965b.a().isAcceptingText()) {
            this.f5965b.d().sendKeyEvent(keyEvent);
        }
        this.f5964a.b(new c.a(keyEvent, a(keyEvent.getUnicodeChar())));
    }

    private Character a(int i2) {
        if (i2 == 0) {
            return null;
        }
        Character chValueOf = Character.valueOf((char) i2);
        if ((Integer.MIN_VALUE & i2) != 0) {
            int i3 = i2 & Integer.MAX_VALUE;
            if (this.f5966c != 0) {
                this.f5966c = KeyCharacterMap.getDeadChar(this.f5966c, i3);
            } else {
                this.f5966c = i3;
            }
        } else if (this.f5966c != 0) {
            int deadChar = KeyCharacterMap.getDeadChar(this.f5966c, i2);
            if (deadChar > 0) {
                chValueOf = Character.valueOf((char) deadChar);
            }
            this.f5966c = 0;
        }
        return chValueOf;
    }
}
