package c.d.d;

/* loaded from: classes.dex */
abstract class H {

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        byte a(int i2);

        int size();
    }

    static String a(a aVar) {
        StringBuilder sb = new StringBuilder(aVar.size());
        for (int i2 = 0; i2 < aVar.size(); i2++) {
            byte bA = aVar.a(i2);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA >= 32 && bA <= 126) {
                            sb.append((char) bA);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String a(AbstractC0280f abstractC0280f) {
        return a(new G(abstractC0280f));
    }

    static String a(String str) {
        return a(AbstractC0280f.a(str));
    }
}
