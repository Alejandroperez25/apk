package f.a.a.b;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.provider.Settings;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.e.p;

/* loaded from: classes.dex */
class a extends BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    private final View f5681a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5682b;

    /* renamed from: c, reason: collision with root package name */
    private final p f5683c;

    /* renamed from: d, reason: collision with root package name */
    private final Editable f5684d;

    /* renamed from: e, reason: collision with root package name */
    private final EditorInfo f5685e;

    /* renamed from: f, reason: collision with root package name */
    private int f5686f;

    /* renamed from: g, reason: collision with root package name */
    private InputMethodManager f5687g;

    /* renamed from: h, reason: collision with root package name */
    private final Layout f5688h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f5689i;

    public a(View view, int i2, p pVar, Editable editable, EditorInfo editorInfo) {
        super(view, true);
        this.f5681a = view;
        this.f5682b = i2;
        this.f5683c = pVar;
        this.f5684d = editable;
        this.f5685e = editorInfo;
        this.f5686f = 0;
        this.f5688h = new DynamicLayout(this.f5684d, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f5687g = (InputMethodManager) view.getContext().getSystemService("input_method");
        this.f5689i = b();
    }

    private void a() {
        if (this.f5686f > 0) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(this.f5684d);
        int selectionEnd = Selection.getSelectionEnd(this.f5684d);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this.f5684d);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this.f5684d);
        this.f5687g.updateSelection(this.f5681a, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
        this.f5683c.a(this.f5682b, this.f5684d.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f5684d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f5686f++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f5686f--;
        a();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i2) {
        boolean zCommitText = super.commitText(charSequence, i2);
        a();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        if (Selection.getSelectionStart(this.f5684d) == -1) {
            return true;
        }
        boolean zDeleteSurroundingText = super.deleteSurroundingText(i2, i3);
        a();
        return zDeleteSurroundingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i2, int i3) {
        boolean composingRegion = super.setComposingRegion(i2, i3);
        a();
        return composingRegion;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i2) {
        boolean composingText;
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, i2);
        } else {
            composingText = super.setComposingText(charSequence, i2);
        }
        a();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean zFinishComposingText = super.finishComposingText();
        if (this.f5689i && Build.VERSION.SDK_INT >= 21) {
            CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
            builder.setComposingText(-1, "");
            this.f5687g.updateCursorAnchorInfo(this.f5681a, builder.build());
        }
        a();
        return zFinishComposingText;
    }

    @SuppressLint({"NewApi"})
    private boolean b() {
        if (this.f5687g.getCurrentInputMethodSubtype() == null || Build.VERSION.SDK_INT < 21 || !Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        return Settings.Secure.getString(this.f5681a.getContext().getContentResolver(), "default_input_method").contains("Samsung");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i2, int i3) {
        boolean selection = super.setSelection(i2, i3);
        a();
        return selection;
    }

    private static int a(int i2, Editable editable) {
        int iMax = Math.max(0, Math.min(editable.length(), i2));
        if (iMax != i2) {
            f.a.a.b("flutter", "Text selection index was clamped (" + i2 + "->" + iMax + ") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
        }
        return iMax;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                int iA = a(Selection.getSelectionStart(this.f5684d), this.f5684d);
                int iA2 = a(Selection.getSelectionEnd(this.f5684d), this.f5684d);
                if (iA2 > iA) {
                    Selection.setSelection(this.f5684d, iA);
                    this.f5684d.delete(iA, iA2);
                    a();
                    return true;
                }
                if (iA > 0) {
                    try {
                        if (this.f5688h.isRtlCharAt(this.f5688h.getLineForOffset(iA))) {
                            Selection.extendRight(this.f5684d, this.f5688h);
                        } else {
                            Selection.extendLeft(this.f5684d, this.f5688h);
                        }
                    } catch (IndexOutOfBoundsException unused) {
                        Selection.setSelection(this.f5684d, iA, iA - 1);
                    }
                    int iA3 = a(Selection.getSelectionStart(this.f5684d), this.f5684d);
                    int iA4 = a(Selection.getSelectionEnd(this.f5684d), this.f5684d);
                    Selection.setSelection(this.f5684d, Math.min(iA3, iA4));
                    this.f5684d.delete(Math.min(iA3, iA4), Math.max(iA3, iA4));
                    a();
                    return true;
                }
            } else {
                if (keyEvent.getKeyCode() == 21) {
                    int selectionStart = Selection.getSelectionStart(this.f5684d);
                    int selectionEnd = Selection.getSelectionEnd(this.f5684d);
                    if (selectionStart == selectionEnd && !keyEvent.isShiftPressed()) {
                        int iMax = Math.max(selectionStart - 1, 0);
                        setSelection(iMax, iMax);
                    } else {
                        setSelection(selectionStart, Math.max(selectionEnd - 1, 0));
                    }
                    return true;
                }
                if (keyEvent.getKeyCode() == 22) {
                    int selectionStart2 = Selection.getSelectionStart(this.f5684d);
                    int selectionEnd2 = Selection.getSelectionEnd(this.f5684d);
                    if (selectionStart2 == selectionEnd2 && !keyEvent.isShiftPressed()) {
                        int iMin = Math.min(selectionStart2 + 1, this.f5684d.length());
                        setSelection(iMin, iMin);
                    } else {
                        setSelection(selectionStart2, Math.min(selectionEnd2 + 1, this.f5684d.length()));
                    }
                    return true;
                }
                if (keyEvent.getKeyCode() == 19) {
                    if (Selection.getSelectionStart(this.f5684d) == Selection.getSelectionEnd(this.f5684d) && !keyEvent.isShiftPressed()) {
                        Selection.moveUp(this.f5684d, this.f5688h);
                        int selectionStart3 = Selection.getSelectionStart(this.f5684d);
                        setSelection(selectionStart3, selectionStart3);
                    } else {
                        Selection.extendUp(this.f5684d, this.f5688h);
                        setSelection(Selection.getSelectionStart(this.f5684d), Selection.getSelectionEnd(this.f5684d));
                    }
                    return true;
                }
                if (keyEvent.getKeyCode() == 20) {
                    if (Selection.getSelectionStart(this.f5684d) == Selection.getSelectionEnd(this.f5684d) && !keyEvent.isShiftPressed()) {
                        Selection.moveDown(this.f5684d, this.f5688h);
                        int selectionStart4 = Selection.getSelectionStart(this.f5684d);
                        setSelection(selectionStart4, selectionStart4);
                    } else {
                        Selection.extendDown(this.f5684d, this.f5688h);
                        setSelection(Selection.getSelectionStart(this.f5684d), Selection.getSelectionEnd(this.f5684d));
                    }
                    return true;
                }
                if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && (131072 & this.f5685e.inputType) == 0) {
                    performEditorAction(this.f5685e.imeOptions & 255);
                    return true;
                }
                int unicodeChar = keyEvent.getUnicodeChar();
                if (unicodeChar != 0) {
                    int iMax2 = Math.max(0, Selection.getSelectionStart(this.f5684d));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f5684d));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        this.f5684d.delete(iMin2, iMax4);
                    }
                    this.f5684d.insert(iMin2, String.valueOf((char) unicodeChar));
                    int i2 = iMin2 + 1;
                    setSelection(i2, i2);
                }
                return true;
            }
        }
        if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        }
        int selectionEnd3 = Selection.getSelectionEnd(this.f5684d);
        setSelection(selectionEnd3, selectionEnd3);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i2) {
        if (i2 == 16908319) {
            setSelection(0, this.f5684d.length());
            return true;
        }
        if (i2 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f5684d);
            int selectionEnd = Selection.getSelectionEnd(this.f5684d);
            if (selectionStart != selectionEnd) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f5681a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f5684d.subSequence(iMin, iMax)));
                this.f5684d.delete(iMin, iMax);
                setSelection(iMin, iMin);
            }
            return true;
        }
        if (i2 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f5684d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f5684d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f5681a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f5684d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i2 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f5681a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.f5681a.getContext());
            int iMax2 = Math.max(0, Selection.getSelectionStart(this.f5684d));
            int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f5684d));
            int iMin2 = Math.min(iMax2, iMax3);
            int iMax4 = Math.max(iMax2, iMax3);
            if (iMin2 != iMax4) {
                this.f5684d.delete(iMin2, iMax4);
            }
            this.f5684d.insert(iMin2, charSequenceCoerceToText);
            int length = iMin2 + charSequenceCoerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i2) {
        if (i2 != 7) {
            switch (i2) {
                case 0:
                    this.f5683c.h(this.f5682b);
                    break;
                case 1:
                    this.f5683c.a(this.f5682b);
                    break;
                case 2:
                    this.f5683c.b(this.f5682b);
                    break;
                case 3:
                    this.f5683c.c(this.f5682b);
                    break;
                case 4:
                    this.f5683c.d(this.f5682b);
                    break;
                case 5:
                    this.f5683c.f(this.f5682b);
                    break;
                default:
                    this.f5683c.e(this.f5682b);
                    break;
            }
            return true;
        }
        this.f5683c.g(this.f5682b);
        return true;
    }
}
