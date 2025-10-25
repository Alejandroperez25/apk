package f.a.b.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import f.a.a.a.m;
import f.a.a.a.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class b implements o.c {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f5764a;

    b(Context context) {
        this.f5764a = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    @Override // f.a.a.a.o.c
    public void a(m mVar, o.d dVar) {
        String str = (String) mVar.a("key");
        try {
            switch (mVar.f5663a) {
                case "setBool":
                    a(this.f5764a.edit().putBoolean(str, ((Boolean) mVar.a("value")).booleanValue()), dVar);
                    break;
                case "setDouble":
                    String string = Double.toString(((Number) mVar.a("value")).doubleValue());
                    a(this.f5764a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string), dVar);
                    break;
                case "setInt":
                    Number number = (Number) mVar.a("value");
                    if (number instanceof BigInteger) {
                        a(this.f5764a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36)), dVar);
                        break;
                    } else {
                        a(this.f5764a.edit().putLong(str, number.longValue()), dVar);
                        break;
                    }
                case "setString":
                    String str2 = (String) mVar.a("value");
                    if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        a(this.f5764a.edit().putString(str, str2), dVar);
                        break;
                    }
                    dVar.a("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    break;
                case "setStringList":
                    List<String> list = (List) mVar.a("value");
                    a(this.f5764a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + a(list)), dVar);
                    break;
                case "commit":
                    dVar.a(true);
                    break;
                case "getAll":
                    dVar.a(a());
                    break;
                case "remove":
                    a(this.f5764a.edit().remove(str), dVar);
                    break;
                case "clear":
                    Set<String> setKeySet = a().keySet();
                    SharedPreferences.Editor editorEdit = this.f5764a.edit();
                    Iterator<String> it = setKeySet.iterator();
                    while (it.hasNext()) {
                        editorEdit.remove(it.next());
                    }
                    a(editorEdit, dVar);
                    break;
                default:
                    dVar.a();
                    break;
            }
        } catch (IOException e2) {
            dVar.a("IOException encountered", mVar.f5663a, e2);
        }
    }

    private void a(SharedPreferences.Editor editor, o.d dVar) {
        new a(this, editor, dVar).execute(new Void[0]);
    }

    private List<String> a(String str) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                try {
                    List<String> list = (List) objectInputStream2.readObject();
                    objectInputStream2.close();
                    return list;
                } catch (ClassNotFoundException e2) {
                    e = e2;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (ClassNotFoundException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private String a(List<String> list) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                objectOutputStream2.close();
                return strEncodeToString;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Map<String, Object> a() throws Throwable {
        Object bigInteger;
        Map<String, ?> all = this.f5764a.getAll();
        HashMap map = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object objValueOf = all.get(str);
                if (objValueOf instanceof String) {
                    String str2 = (String) objValueOf;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        objValueOf = a(str2.substring("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".length()));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str2.substring("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy".length()), 36);
                        objValueOf = bigInteger;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        objValueOf = Double.valueOf(str2.substring("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu".length()));
                    }
                    map.put(str, objValueOf);
                } else {
                    if (objValueOf instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) objValueOf);
                        bigInteger = arrayList;
                        if (!this.f5764a.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + a(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        objValueOf = bigInteger;
                    }
                    map.put(str, objValueOf);
                }
            }
        }
        return map;
    }
}
