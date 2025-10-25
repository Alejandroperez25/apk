package c.d.d;

import java.io.IOException;

/* renamed from: c.d.d.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0291q extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private x f4448a;

    public C0291q(String str) {
        super(str);
        this.f4448a = null;
    }

    public C0291q a(x xVar) {
        this.f4448a = xVar;
        return this;
    }

    static C0291q a() {
        return new C0291q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static C0291q b() {
        return new C0291q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C0291q c() {
        return new C0291q("CodedInputStream encountered a malformed varint.");
    }

    static C0291q d() {
        return new C0291q("Protocol message contained an invalid tag (zero).");
    }

    static C0291q e() {
        return new C0291q("Protocol message end-group tag did not match expected tag.");
    }

    static C0291q f() {
        return new C0291q("Protocol message tag had invalid wire type.");
    }

    static C0291q g() {
        return new C0291q("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C0291q h() {
        return new C0291q("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C0291q i() {
        return new C0291q("Protocol message had invalid UTF-8.");
    }
}
