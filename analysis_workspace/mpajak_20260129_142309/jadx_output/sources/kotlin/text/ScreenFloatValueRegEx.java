package kotlin.text;

import androidx.appcompat.widget.a;
import kotlin.jvm.JvmField;

/* loaded from: classes4.dex */
final class ScreenFloatValueRegEx {
    public static final ScreenFloatValueRegEx INSTANCE = new ScreenFloatValueRegEx();

    @JvmField
    public static final Regex value = new Regex(a.j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", "((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+))", ")[fFdD]?))[\\x00-\\x20]*"));

    private ScreenFloatValueRegEx() {
    }
}
