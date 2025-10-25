package c.d.d;

/* loaded from: classes.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4356a;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    static {
        f4356a = d.a() ? new d() : new b();
    }

    public static boolean a(byte[] bArr, int i2, int i3) {
        return f4356a.a(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        switch (i3 - i2) {
            case 0:
                return b(b2);
            case 1:
                return b(b2, bArr[i2]);
            case 2:
                return b(b2, bArr[i2], bArr[i2 + 1]);
            default:
                throw new AssertionError();
        }
    }

    static class c extends IllegalArgumentException {
        c(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iA = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iA += a(charSequence, i2);
                    break;
                }
                iA += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iA >= length) {
            return iA;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iA + 4294967296L));
    }

    private static int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new c(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    static int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f4356a.a(charSequence, bArr, i2, i3);
    }

    static abstract class a {
        abstract int a(int i2, byte[] bArr, int i3, int i4);

        abstract int a(CharSequence charSequence, byte[] bArr, int i2, int i3);

        a() {
        }

        final boolean a(byte[] bArr, int i2, int i3) {
            return a(0, bArr, i2, i3) == 0;
        }
    }

    static final class b extends a {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
        
            if (r8[r9] > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
        
            if (r8[r7] > (-65)) goto L50;
         */
        @Override // c.d.d.M.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int a(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L7d
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L18
                r7 = -62
                if (r0 < r7) goto L17
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L7e
            L17:
                return r2
            L18:
                r4 = -16
                if (r0 >= r4) goto L45
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L30
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L2d
                int r7 = c.d.d.M.a(r0, r9)
                return r7
            L2d:
                r5 = r9
                r9 = r7
                r7 = r5
            L30:
                if (r7 > r3) goto L44
                r4 = -96
                if (r0 != r1) goto L38
                if (r7 < r4) goto L44
            L38:
                r1 = -19
                if (r0 != r1) goto L3e
                if (r7 >= r4) goto L44
            L3e:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L7e
            L44:
                return r2
            L45:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L57
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = c.d.d.M.a(r0, r1)
                return r7
            L57:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
                r7 = r9
            L5b:
                if (r4 != 0) goto L69
                int r9 = r7 + 1
                r4 = r8[r7]
                if (r9 < r10) goto L68
                int r7 = c.d.d.M.a(r0, r1, r4)
                return r7
            L68:
                r7 = r9
            L69:
                if (r1 > r3) goto L7c
                int r9 = r0 << 28
                int r1 = r1 + 112
                int r9 = r9 + r1
                int r9 = r9 >> 30
                if (r9 != 0) goto L7c
                if (r4 > r3) goto L7c
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L7d
            L7c:
                return r2
            L7d:
                r7 = r9
            L7e:
                int r7 = b(r8, r7, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.d.M.b.a(int, byte[], int, int):int");
        }

        @Override // c.d.d.M.a
        int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char cCharAt;
            int length = charSequence.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) cCharAt;
                i8++;
            }
            if (i8 == length) {
                return i2 + length;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char cCharAt2 = charSequence.charAt(i8);
                if (cCharAt2 >= 128 || i9 >= i7) {
                    if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                        i9 = i10 + 1;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i9 > i7 - 3) {
                            if (i9 <= i7 - 4) {
                                int i11 = i8 + 1;
                                if (i11 != charSequence.length()) {
                                    char cCharAt3 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        int i12 = i9 + 1;
                                        bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                        int i13 = i12 + 1;
                                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i14 = i13 + 1;
                                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i9 = i14 + 1;
                                        bArr[i14] = (byte) ((codePoint & 63) | 128);
                                        i8 = i11;
                                    } else {
                                        i8 = i11;
                                    }
                                }
                                throw new c(i8 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new c(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                        }
                        int i15 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i4 = i16 + 1;
                        bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i8++;
                } else {
                    i4 = i9 + 1;
                    bArr[i9] = (byte) cCharAt2;
                }
                i9 = i4;
                i8++;
            }
            return i9;
        }

        private static int b(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return c(bArr, i2, i3);
        }

        private static int c(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i4 >= i3) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i2 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return M.c(bArr, i4, i3);
                        }
                        int i5 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i4 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return M.c(bArr, i4, i3);
                    }
                    int i7 = i4 + 1;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 = i7 + 1;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                i2 = i4;
            }
            return 0;
        }
    }

    static final class d extends a {
        d() {
        }

        static boolean a() {
            return L.a() && L.b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (c.d.d.L.a(r13, r2) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            if (c.d.d.L.a(r13, r2) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
        
            if (c.d.d.L.a(r13, r2) > (-65)) goto L55;
         */
        @Override // c.d.d.M.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int a(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.d.M.d.a(int, byte[], int, int):int");
        }

        @Override // c.d.d.M.a
        int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            long j;
            int i4;
            char cCharAt;
            long jC = L.c() + i2;
            long j2 = i3 + jC;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (i5 < length && (cCharAt = charSequence.charAt(i5)) < 128) {
                L.a(bArr, jC, (byte) cCharAt);
                i5++;
                jC = 1 + jC;
            }
            if (i5 == length) {
                return (int) (jC - L.c());
            }
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 128 || jC >= j2) {
                    if (cCharAt2 < 2048 && jC <= j2 - 2) {
                        long j3 = jC + 1;
                        L.a(bArr, jC, (byte) ((cCharAt2 >>> 6) | 960));
                        jC = j3 + 1;
                        L.a(bArr, j3, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jC > j2 - 3) {
                            if (jC <= j2 - 4) {
                                int i6 = i5 + 1;
                                if (i6 != length) {
                                    char cCharAt3 = charSequence.charAt(i6);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        long j4 = jC + 1;
                                        L.a(bArr, jC, (byte) ((codePoint >>> 18) | 240));
                                        long j5 = j4 + 1;
                                        L.a(bArr, j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j6 = j5 + 1;
                                        L.a(bArr, j5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        jC = j6 + 1;
                                        L.a(bArr, j6, (byte) ((codePoint & 63) | 128));
                                        i5 = i6;
                                    }
                                } else {
                                    i6 = i5;
                                }
                                throw new c(i6 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new c(i5, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jC);
                        }
                        long j7 = jC + 1;
                        L.a(bArr, jC, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j8 = j7 + 1;
                        L.a(bArr, j7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j = j8 + 1;
                        L.a(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    }
                    i5++;
                } else {
                    j = jC + 1;
                    L.a(bArr, jC, (byte) cCharAt2);
                }
                jC = j;
                i5++;
            }
            return (int) (jC - L.c());
        }

        private static int a(byte[] bArr, long j, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = ((int) j) & 7;
            long j2 = j;
            int i4 = i3;
            while (i4 > 0) {
                long j3 = 1 + j2;
                if (L.a(bArr, j2) < 0) {
                    return i3 - i4;
                }
                i4--;
                j2 = j3;
            }
            int i5 = i2 - i3;
            while (i5 >= 8 && (L.b(bArr, j2) & (-9187201950435737472L)) == 0) {
                j2 += 8;
                i5 -= 8;
            }
            return i2 - i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int b(byte[] r8, long r9, int r11) {
            /*
                int r0 = a(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = c.d.d.L.a(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = c.d.d.L.a(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L65
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = a(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = c.d.d.L.a(r8, r9)
                if (r9 > r4) goto L64
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L64
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L64
            L5c:
                r9 = 0
                long r2 = r2 + r6
                byte r9 = c.d.d.L.a(r8, r6)
                if (r9 <= r4) goto L37
            L64:
                return r5
            L65:
                r0 = 3
                if (r11 >= r0) goto L6d
                int r8 = a(r8, r1, r9, r11)
                return r8
            L6d:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = c.d.d.L.a(r8, r9)
                if (r9 > r4) goto L8f
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8f
                long r9 = r6 + r2
                byte r0 = c.d.d.L.a(r8, r6)
                if (r0 > r4) goto L8f
                long r2 = r2 + r9
                byte r9 = c.d.d.L.a(r8, r9)
                if (r9 <= r4) goto L37
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: c.d.d.M.d.b(byte[], long, int):int");
        }

        private static int a(byte[] bArr, int i2, long j, int i3) {
            switch (i3) {
                case 0:
                    return M.b(i2);
                case 1:
                    return M.b(i2, L.a(bArr, j));
                case 2:
                    return M.b(i2, L.a(bArr, j), L.a(bArr, j + 1));
                default:
                    throw new AssertionError();
            }
        }
    }
}
