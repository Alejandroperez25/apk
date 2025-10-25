package c.d.d;

import c.d.d.AbstractC0289o;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
abstract class z {
    static String a(x xVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(xVar, sb, 0);
        return sb.toString();
    }

    private static void a(x xVar, StringBuilder sb, int i2) throws SecurityException {
        boolean zBooleanValue;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : xVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String strReplaceFirst = ((String) it.next()).replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList")) {
                String str = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - "List".length());
                Method method2 = (Method) map.get("get" + strReplaceFirst);
                if (method2 != null) {
                    a(sb, i2, a(str), AbstractC0289o.a(method2, xVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - "Bytes".length()))) {
                    }
                }
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method3 = (Method) map.get("get" + strReplaceFirst);
                Method method4 = (Method) map.get("has" + strReplaceFirst);
                if (method3 != null) {
                    Object objA = AbstractC0289o.a(method3, xVar, new Object[0]);
                    if (method4 == null) {
                        zBooleanValue = !a(objA);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC0289o.a(method4, xVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        a(sb, i2, a(str2), objA);
                    }
                }
            }
        }
        if (xVar instanceof AbstractC0289o.d) {
            Iterator<Map.Entry<FieldDescriptorType, Object>> itD = ((AbstractC0289o.d) xVar).f4431d.d();
            while (itD.hasNext()) {
                Map.Entry entry = (Map.Entry) itD.next();
                a(sb, i2, "[" + ((AbstractC0289o.f) entry.getKey()).a() + "]", entry.getValue());
            }
        }
        AbstractC0289o abstractC0289o = (AbstractC0289o) xVar;
        if (abstractC0289o.f4423b != null) {
            abstractC0289o.f4423b.a(sb, i2);
        }
    }

    private static boolean a(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AbstractC0280f) {
            return obj.equals(AbstractC0280f.f4390a);
        }
        return obj instanceof x ? obj == ((x) obj).a() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i2, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(H.a((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0280f) {
            sb.append(": \"");
            sb.append(H.a((AbstractC0280f) obj));
            sb.append('\"');
        } else {
            if (obj instanceof AbstractC0289o) {
                sb.append(" {");
                a((AbstractC0289o) obj, sb, i2 + 2);
                sb.append("\n");
                for (int i4 = 0; i4 < i2; i4++) {
                    sb.append(' ');
                }
                sb.append("}");
                return;
            }
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
