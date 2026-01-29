package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

/* loaded from: classes2.dex */
public class AccessibilityRecordCompat {
    private final AccessibilityRecord mRecord;

    @RequiresApi(15)
    /* loaded from: classes13.dex */
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @DoNotInline
        public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @DoNotInline
        public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollX(i5);
        }

        @DoNotInline
        public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollY(i5);
        }
    }

    @RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i5) {
            accessibilityRecord.setSource(view, i5);
        }
    }

    @Deprecated
    public AccessibilityRecordCompat(Object obj) {
        this.mRecord = (AccessibilityRecord) obj;
    }

    public static int getMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord) {
        return Api15Impl.getMaxScrollX(accessibilityRecord);
    }

    public static int getMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord) {
        return Api15Impl.getMaxScrollY(accessibilityRecord);
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat.mRecord));
    }

    public static void setMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord, int i5) {
        Api15Impl.setMaxScrollX(accessibilityRecord, i5);
    }

    public static void setMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord, int i5) {
        Api15Impl.setMaxScrollY(accessibilityRecord, i5);
    }

    public static void setSource(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i5) {
        Api16Impl.setSource(accessibilityRecord, view, i5);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.mRecord;
        AccessibilityRecord accessibilityRecord2 = ((AccessibilityRecordCompat) obj).mRecord;
        return accessibilityRecord == null ? accessibilityRecord2 == null : accessibilityRecord.equals(accessibilityRecord2);
    }

    @Deprecated
    public int getAddedCount() {
        return this.mRecord.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.mRecord.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.mRecord.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.mRecord.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.mRecord.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.mRecord.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.mRecord;
    }

    @Deprecated
    public int getItemCount() {
        return this.mRecord.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.mRecord);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.mRecord);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.mRecord.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.mRecord.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.mRecord.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.mRecord.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.wrapNonNullInstance(this.mRecord.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.mRecord.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.mRecord.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.mRecord.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.mRecord;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.mRecord.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.mRecord.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.mRecord.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.mRecord.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.mRecord.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.mRecord.recycle();
    }

    @Deprecated
    public void setAddedCount(int i5) {
        this.mRecord.setAddedCount(i5);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.mRecord.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z4) {
        this.mRecord.setChecked(z4);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.mRecord.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.mRecord.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i5) {
        this.mRecord.setCurrentItemIndex(i5);
    }

    @Deprecated
    public void setEnabled(boolean z4) {
        this.mRecord.setEnabled(z4);
    }

    @Deprecated
    public void setFromIndex(int i5) {
        this.mRecord.setFromIndex(i5);
    }

    @Deprecated
    public void setFullScreen(boolean z4) {
        this.mRecord.setFullScreen(z4);
    }

    @Deprecated
    public void setItemCount(int i5) {
        this.mRecord.setItemCount(i5);
    }

    @Deprecated
    public void setMaxScrollX(int i5) {
        setMaxScrollX(this.mRecord, i5);
    }

    @Deprecated
    public void setMaxScrollY(int i5) {
        setMaxScrollY(this.mRecord, i5);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.mRecord.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z4) {
        this.mRecord.setPassword(z4);
    }

    @Deprecated
    public void setRemovedCount(int i5) {
        this.mRecord.setRemovedCount(i5);
    }

    @Deprecated
    public void setScrollX(int i5) {
        this.mRecord.setScrollX(i5);
    }

    @Deprecated
    public void setScrollY(int i5) {
        this.mRecord.setScrollY(i5);
    }

    @Deprecated
    public void setScrollable(boolean z4) {
        this.mRecord.setScrollable(z4);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void setSource(View view) {
        this.mRecord.setSource(view);
    }

    @Deprecated
    public void setSource(View view, int i5) {
        setSource(this.mRecord, view, i5);
    }

    @Deprecated
    public void setToIndex(int i5) {
        this.mRecord.setToIndex(i5);
    }
}
