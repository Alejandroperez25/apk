package com.apptreesoftware.flutterwebview;

import android.app.Activity;
import android.content.Intent;
import f.a.a.a.m;
import f.a.a.a.o;
import f.a.a.a.q;
import g.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements o.c {

    /* renamed from: a, reason: collision with root package name */
    public static o f4812a;

    /* renamed from: b, reason: collision with root package name */
    private static WebViewActivity f4813b;

    /* renamed from: e, reason: collision with root package name */
    private final Activity f4816e;

    /* renamed from: d, reason: collision with root package name */
    public static final C0057a f4815d = new C0057a(null);

    /* renamed from: c, reason: collision with root package name */
    private static ArrayList<c> f4814c = new ArrayList<>();

    public static final void a(q.d dVar) {
        f4815d.a(dVar);
    }

    /* renamed from: com.apptreesoftware.flutterwebview.a$a, reason: collision with other inner class name */
    public static final class C0057a {
        private C0057a() {
        }

        public /* synthetic */ C0057a(g.b.a.b bVar) {
            this();
        }

        public final o a() {
            o oVar = a.f4812a;
            if (oVar != null) {
                return oVar;
            }
            g.b.a.c.b("channel");
            throw null;
        }

        public final void a(o oVar) {
            g.b.a.c.b(oVar, "<set-?>");
            a.f4812a = oVar;
        }

        public final void a(WebViewActivity webViewActivity) {
            a.f4813b = webViewActivity;
        }

        public final ArrayList<c> b() {
            return a.f4814c;
        }

        public final void a(q.d dVar) {
            g.b.a.c.b(dVar, "registrar");
            C0057a c0057a = this;
            c0057a.a(new o(dVar.f(), "plugins.apptreesoftware.com/web_view"));
            Activity activityD = dVar.d();
            g.b.a.c.a((Object) activityD, "registrar.activity()");
            c0057a.a().a(new a(activityD));
            c0057a.b().clear();
        }

        public final void a(String str) {
            g.b.a.c.b(str, "url");
            a().a("onLoadEvent", h.a(g.c.a("event", "webViewDidStartLoad"), g.c.a("url", str)));
        }

        public final void b(String str) {
            g.b.a.c.b(str, "url");
            a().a("onLoadEvent", h.a(g.c.a("event", "webViewDidLoad"), g.c.a("url", str)));
        }

        public final void c(String str) {
            g.b.a.c.b(str, "error");
            a().a("onError", str);
        }

        public final void d(String str) {
            g.b.a.c.b(str, "url");
            a().a("onRedirect", str);
        }

        public final void a(int i2) {
            a().a("onToolbarAction", Integer.valueOf(i2));
        }
    }

    public a(Activity activity) {
        g.b.a.c.b(activity, "activity");
        this.f4816e = activity;
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        g.b.a.c.b(mVar, "call");
        g.b.a.c.b(dVar, "result");
        String str = mVar.f5663a;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1109843021) {
                if (iHashCode != 3327206) {
                    if (iHashCode != 1671672458) {
                        if (iHashCode == 1993808603 && str.equals("onRedirect")) {
                            String str2 = (String) mVar.a("url");
                            if (str2 == null) {
                                throw new RuntimeException("url must be provided");
                            }
                            g.b.a.c.a((Object) str2, "call.argument<String>(\"u…n(\"url must be provided\")");
                            Boolean bool = (Boolean) mVar.a("stopOnRedirect");
                            if (bool == null) {
                                bool = true;
                            }
                            g.b.a.c.a((Object) bool, "call.argument<Boolean>(\"stopOnRedirect\") ?: true");
                            f4814c.add(new c(str2, bool.booleanValue(), b.PREFIX));
                            dVar.a("");
                            return;
                        }
                    } else if (str.equals("dismiss")) {
                        WebViewActivity webViewActivity = f4813b;
                        if (webViewActivity != null) {
                            webViewActivity.finish();
                        }
                        f4813b = (WebViewActivity) null;
                        return;
                    }
                } else if (str.equals("load")) {
                    String str3 = (String) mVar.a("url");
                    if (str3 == null) {
                        throw new RuntimeException("url must be provided");
                    }
                    g.b.a.c.a((Object) str3, "call.argument<String>(\"u…n(\"url must be provided\")");
                    Map<? extends String, ? extends String> map = (Map) mVar.a("headers");
                    HashMap<String, String> map2 = new HashMap<>();
                    if (map != null) {
                        map2.putAll(map);
                    }
                    WebViewActivity webViewActivity2 = f4813b;
                    if (webViewActivity2 != null) {
                        webViewActivity2.a(str3, map2);
                        return;
                    }
                    return;
                }
            } else if (str.equals("launch")) {
                List list = (List) mVar.a("actions");
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    arrayList.addAll(list);
                }
                String str4 = (String) mVar.a("url");
                Boolean bool2 = (Boolean) mVar.a("javaScriptEnabled");
                boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = (Boolean) mVar.a("inlineMediaEnabled");
                boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = (Boolean) mVar.a("clearCookies");
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                Map map3 = (Map) mVar.a("headers");
                HashMap map4 = new HashMap();
                if (map3 != null) {
                    map4.putAll(map3);
                }
                Intent intent = new Intent(this.f4816e, (Class<?>) WebViewActivity.class);
                intent.putExtra(WebViewActivity.f4810h.a(), str4);
                intent.putExtra(WebViewActivity.f4810h.c(), map4);
                intent.putExtra(WebViewActivity.f4810h.b(), arrayList);
                intent.putExtra(WebViewActivity.f4810h.e(), zBooleanValue);
                intent.putExtra(WebViewActivity.f4810h.d(), zBooleanValue2);
                intent.putExtra(WebViewActivity.f4810h.f(), zBooleanValue3);
                this.f4816e.startActivity(intent);
                dVar.a("");
                return;
            }
        }
        dVar.a();
    }
}
