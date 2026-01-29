package com.blankj.utilcode.util;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public final class FragmentUtils {
    private static final String ARGS_ID = "args_id";
    private static final String ARGS_IS_ADD_STACK = "args_is_add_stack";
    private static final String ARGS_IS_HIDE = "args_is_hide";
    private static final String ARGS_TAG = "args_tag";
    private static final int TYPE_ADD_FRAGMENT = 1;
    private static final int TYPE_HIDE_FRAGMENT = 4;
    private static final int TYPE_REMOVE_FRAGMENT = 32;
    private static final int TYPE_REMOVE_TO_FRAGMENT = 64;
    private static final int TYPE_REPLACE_FRAGMENT = 16;
    private static final int TYPE_SHOW_FRAGMENT = 2;
    private static final int TYPE_SHOW_HIDE_FRAGMENT = 8;

    /* loaded from: classes14.dex */
    public static class Args {
        public final int id;
        public final boolean isAddStack;
        public final boolean isHide;
        public final String tag;

        public Args(int i5, String str, boolean z4, boolean z5) {
            this.id = i5;
            this.tag = str;
            this.isHide = z4;
            this.isAddStack = z5;
        }

        public Args(int i5, boolean z4, boolean z5) {
            this(i5, null, z4, z5);
        }
    }

    /* loaded from: classes2.dex */
    public static class FragmentNode {
        public final Fragment fragment;
        public final List<FragmentNode> next;

        public FragmentNode(Fragment fragment, List<FragmentNode> list) {
            this.fragment = fragment;
            this.next = list;
        }

        public Fragment getFragment() {
            return this.fragment;
        }

        public List<FragmentNode> getNext() {
            return this.next;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fragment.getClass().getSimpleName());
            sb.append("->");
            List<FragmentNode> list = this.next;
            sb.append((list == null || list.isEmpty()) ? "no child" : this.next.toString());
            return sb.toString();
        }
    }

    /* loaded from: classes14.dex */
    public interface OnBackClickListener {
        boolean onBackClick();
    }

    private FragmentUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5) {
        add(fragmentManager, fragment, i5, (String) null, false, false);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        add(fragmentManager, fragment, i5, null, false, i6, i7, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        add(fragmentManager, fragment, i5, null, false, i6, i7, i8, i9);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str) {
        add(fragmentManager, fragment, i5, str, false, false);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        add(fragmentManager, fragment, i5, str, false, i6, i7, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        add(fragmentManager, fragment, i5, str, false, i6, i7, i8, i9);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4) {
        add(fragmentManager, fragment, i5, str, z4, false);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        add(fragmentManager, fragment, i5, str, z4, i6, i7, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i5, str, false, z4));
        addAnim(beginTransaction, i6, i7, i8, i9);
        operate(1, fragmentManager, beginTransaction, null, fragment);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, boolean z5) {
        putArgs(fragment, new Args(i5, str, z4, z5));
        operateNoAnim(1, fragmentManager, null, fragment);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, @NonNull View... viewArr) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i5, str, false, z4));
        addSharedElement(beginTransaction, viewArr);
        operate(1, fragmentManager, beginTransaction, null, fragment);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i5, str, false, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4) {
        add(fragmentManager, fragment, i5, (String) null, z4, false);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        add(fragmentManager, fragment, i5, null, z4, i6, i7, 0, 0);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        add(fragmentManager, fragment, i5, null, z4, i6, i7, i8, i9);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, boolean z5) {
        add(fragmentManager, fragment, i5, (String) null, z4, z5);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i5, (String) null, z4, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, @NonNull View... viewArr) {
        add(fragmentManager, fragment, i5, (String) null, false, viewArr);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull List<Fragment> list, @IdRes int i5, int i6) {
        add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i5, (String[]) null, i6);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull List<Fragment> list, @IdRes int i5, String[] strArr, int i6) {
        add(fragmentManager, (Fragment[]) list.toArray(new Fragment[0]), i5, strArr, i6);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment[] fragmentArr, @IdRes int i5, int i6) {
        add(fragmentManager, fragmentArr, i5, (String[]) null, i6);
    }

    public static void add(@NonNull FragmentManager fragmentManager, @NonNull Fragment[] fragmentArr, @IdRes int i5, String[] strArr, int i6) {
        if (strArr == null) {
            int length = fragmentArr.length;
            int i7 = 0;
            while (i7 < length) {
                putArgs(fragmentArr[i7], new Args(i5, null, i6 != i7, false));
                i7++;
            }
        } else {
            int length2 = fragmentArr.length;
            int i8 = 0;
            while (i8 < length2) {
                putArgs(fragmentArr[i8], new Args(i5, strArr[i8], i6 != i8, false));
                i8++;
            }
        }
        operateNoAnim(1, fragmentManager, null, fragmentArr);
    }

    private static void addAnim(FragmentTransaction fragmentTransaction, int i5, int i6, int i7, int i8) {
        fragmentTransaction.setCustomAnimations(i5, i6, i7, i8);
    }

    private static void addSharedElement(FragmentTransaction fragmentTransaction, View... viewArr) {
        for (View view : viewArr) {
            fragmentTransaction.addSharedElement(view, view.getTransitionName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@NonNull Fragment fragment) {
        return fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof OnBackClickListener) && ((OnBackClickListener) fragment).onBackClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchBackPress(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        if (fragments != null && !fragments.isEmpty()) {
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = fragments.get(size);
                if (fragment != 0 && fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint() && (fragment instanceof OnBackClickListener) && ((OnBackClickListener) fragment).onBackClick()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Fragment findFragment(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls) {
        return fragmentManager.findFragmentByTag(cls.getName());
    }

    public static Fragment findFragment(@NonNull FragmentManager fragmentManager, @NonNull String str) {
        return fragmentManager.findFragmentByTag(str);
    }

    public static List<FragmentNode> getAllFragments(@NonNull FragmentManager fragmentManager) {
        return getAllFragments(fragmentManager, new ArrayList());
    }

    private static List<FragmentNode> getAllFragments(@NonNull FragmentManager fragmentManager, List<FragmentNode> list) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if (fragment != null) {
                list.add(new FragmentNode(fragment, getAllFragments(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    public static List<FragmentNode> getAllFragmentsInStack(@NonNull FragmentManager fragmentManager) {
        return getAllFragmentsInStack(fragmentManager, new ArrayList());
    }

    private static List<FragmentNode> getAllFragmentsInStack(@NonNull FragmentManager fragmentManager, List<FragmentNode> list) {
        Bundle arguments;
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                list.add(new FragmentNode(fragment, getAllFragmentsInStack(fragment.getChildFragmentManager(), new ArrayList())));
            }
        }
        return list;
    }

    private static Args getArgs(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        return new Args(arguments.getInt(ARGS_ID, fragment.getId()), arguments.getBoolean(ARGS_IS_HIDE), arguments.getBoolean(ARGS_IS_ADD_STACK));
    }

    public static List<Fragment> getFragments(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = fragmentManager.getFragments();
        return (fragments == null || fragments.isEmpty()) ? Collections.emptyList() : fragments;
    }

    public static List<Fragment> getFragmentsInStack(@NonNull FragmentManager fragmentManager) {
        Bundle arguments;
        List<Fragment> fragments = getFragments(fragmentManager);
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragments) {
            if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                arrayList.add(fragment);
            }
        }
        return arrayList;
    }

    public static String getSimpleName(Fragment fragment) {
        return fragment == null ? "null" : fragment.getClass().getSimpleName();
    }

    public static Fragment getTop(@NonNull FragmentManager fragmentManager) {
        return getTopIsInStack(fragmentManager, null, false);
    }

    public static Fragment getTopInStack(@NonNull FragmentManager fragmentManager) {
        return getTopIsInStack(fragmentManager, null, true);
    }

    private static Fragment getTopIsInStack(@NonNull FragmentManager fragmentManager, Fragment fragment, boolean z4) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null) {
                if (!z4) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    return getTopIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static Fragment getTopShow(@NonNull FragmentManager fragmentManager) {
        return getTopShowIsInStack(fragmentManager, null, false);
    }

    public static Fragment getTopShowInStack(@NonNull FragmentManager fragmentManager) {
        return getTopShowIsInStack(fragmentManager, null, true);
    }

    private static Fragment getTopShowIsInStack(@NonNull FragmentManager fragmentManager, Fragment fragment, boolean z4) {
        List<Fragment> fragments = getFragments(fragmentManager);
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment2 = fragments.get(size);
            if (fragment2 != null && fragment2.isResumed() && fragment2.isVisible() && fragment2.getUserVisibleHint()) {
                if (!z4) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, false);
                }
                Bundle arguments = fragment2.getArguments();
                if (arguments != null && arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    return getTopShowIsInStack(fragment2.getChildFragmentManager(), fragment2, true);
                }
            }
        }
        return fragment;
    }

    public static void hide(@NonNull Fragment fragment) {
        putArgs(fragment, true);
        operateNoAnim(4, fragment.getFragmentManager(), null, fragment);
    }

    public static void hide(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            putArgs(it.next(), true);
        }
        operateNoAnim(4, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
    }

    private static void operate(int i5, @NonNull FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment... fragmentArr) {
        if (fragment != null && fragment.isRemoving()) {
            Log.e("FragmentUtils", fragment.getClass().getName() + " is isRemoving");
            return;
        }
        int i6 = 0;
        if (i5 == 1) {
            int length = fragmentArr.length;
            while (i6 < length) {
                Fragment fragment2 = fragmentArr[i6];
                Bundle arguments = fragment2.getArguments();
                if (arguments == null) {
                    return;
                }
                String string = arguments.getString(ARGS_TAG, fragment2.getClass().getName());
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag(string);
                if (findFragmentByTag != null && findFragmentByTag.isAdded()) {
                    fragmentTransaction.remove(findFragmentByTag);
                }
                fragmentTransaction.add(arguments.getInt(ARGS_ID), fragment2, string);
                if (arguments.getBoolean(ARGS_IS_HIDE)) {
                    fragmentTransaction.hide(fragment2);
                }
                if (arguments.getBoolean(ARGS_IS_ADD_STACK)) {
                    fragmentTransaction.addToBackStack(string);
                }
                i6++;
            }
        } else if (i5 == 2) {
            int length2 = fragmentArr.length;
            while (i6 < length2) {
                fragmentTransaction.show(fragmentArr[i6]);
                i6++;
            }
        } else if (i5 == 4) {
            int length3 = fragmentArr.length;
            while (i6 < length3) {
                fragmentTransaction.hide(fragmentArr[i6]);
                i6++;
            }
        } else if (i5 == 8) {
            fragmentTransaction.show(fragment);
            int length4 = fragmentArr.length;
            while (i6 < length4) {
                Fragment fragment3 = fragmentArr[i6];
                if (fragment3 != fragment) {
                    fragmentTransaction.hide(fragment3);
                }
                i6++;
            }
        } else if (i5 == 16) {
            Bundle arguments2 = fragmentArr[0].getArguments();
            if (arguments2 == null) {
                return;
            }
            String string2 = arguments2.getString(ARGS_TAG, fragmentArr[0].getClass().getName());
            fragmentTransaction.replace(arguments2.getInt(ARGS_ID), fragmentArr[0], string2);
            if (arguments2.getBoolean(ARGS_IS_ADD_STACK)) {
                fragmentTransaction.addToBackStack(string2);
            }
        } else if (i5 == 32) {
            int length5 = fragmentArr.length;
            while (i6 < length5) {
                Fragment fragment4 = fragmentArr[i6];
                if (fragment4 != fragment) {
                    fragmentTransaction.remove(fragment4);
                }
                i6++;
            }
        } else if (i5 == 64) {
            int length6 = fragmentArr.length - 1;
            while (true) {
                if (length6 < 0) {
                    break;
                }
                Fragment fragment5 = fragmentArr[length6];
                if (fragment5 != fragmentArr[0]) {
                    fragmentTransaction.remove(fragment5);
                    length6--;
                } else if (fragment != null) {
                    fragmentTransaction.remove(fragment5);
                }
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }

    private static void operateNoAnim(int i5, @Nullable FragmentManager fragmentManager, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            return;
        }
        operate(i5, fragmentManager, fragmentManager.beginTransaction(), fragment, fragmentArr);
    }

    public static void pop(@NonNull FragmentManager fragmentManager) {
        pop(fragmentManager, true);
    }

    public static void pop(@NonNull FragmentManager fragmentManager, boolean z4) {
        if (z4) {
            fragmentManager.popBackStackImmediate();
        } else {
            fragmentManager.popBackStack();
        }
    }

    public static void popAll(@NonNull FragmentManager fragmentManager) {
        popAll(fragmentManager, true);
    }

    public static void popAll(@NonNull FragmentManager fragmentManager, boolean z4) {
        if (fragmentManager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(0);
            if (z4) {
                fragmentManager.popBackStackImmediate(backStackEntryAt.getId(), 1);
            } else {
                fragmentManager.popBackStack(backStackEntryAt.getId(), 1);
            }
        }
    }

    public static void popTo(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z4) {
        popTo(fragmentManager, cls, z4, true);
    }

    public static void popTo(@NonNull FragmentManager fragmentManager, Class<? extends Fragment> cls, boolean z4, boolean z5) {
        String name = cls.getName();
        if (z5) {
            fragmentManager.popBackStackImmediate(name, z4 ? 1 : 0);
        } else {
            fragmentManager.popBackStack(name, z4 ? 1 : 0);
        }
    }

    private static void putArgs(Fragment fragment, Args args) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putInt(ARGS_ID, args.id);
        arguments.putBoolean(ARGS_IS_HIDE, args.isHide);
        arguments.putBoolean(ARGS_IS_ADD_STACK, args.isAddStack);
        arguments.putString(ARGS_TAG, args.tag);
    }

    private static void putArgs(Fragment fragment, boolean z4) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putBoolean(ARGS_IS_HIDE, z4);
    }

    public static void remove(@NonNull Fragment fragment) {
        operateNoAnim(32, fragment.getFragmentManager(), null, fragment);
    }

    public static void removeAll(@NonNull FragmentManager fragmentManager) {
        operateNoAnim(32, fragmentManager, null, (Fragment[]) getFragments(fragmentManager).toArray(new Fragment[0]));
    }

    public static void removeTo(@NonNull Fragment fragment, boolean z4) {
        operateNoAnim(64, fragment.getFragmentManager(), z4 ? fragment : null, fragment);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2) {
        replace(fragment, fragment2, (String) null, false);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6) {
        replace(fragment, fragment2, (String) null, false, i5, i6, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        replace(fragment, fragment2, (String) null, false, i5, i6, i7, i8);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str) {
        replace(fragment, fragment2, str, false);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6) {
        replace(fragment, fragment2, str, false, i5, i6, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        replace(fragment, fragment2, str, false, i5, i6, i7, i8);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z4) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).id, str, z4);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z4, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6) {
        replace(fragment, fragment2, str, z4, i5, i6, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z4, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).id, str, z4, i5, i6, i7, i8);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, boolean z4, View... viewArr) {
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        replace(fragmentManager, fragment2, getArgs(fragment).id, str, z4, viewArr);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, String str, View... viewArr) {
        replace(fragment, fragment2, str, false, viewArr);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z4) {
        replace(fragment, fragment2, (String) null, z4);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z4, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6) {
        replace(fragment, fragment2, (String) null, z4, i5, i6, 0, 0);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z4, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        replace(fragment, fragment2, (String) null, z4, i5, i6, i7, i8);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, boolean z4, View... viewArr) {
        replace(fragment, fragment2, (String) null, z4, viewArr);
    }

    public static void replace(@NonNull Fragment fragment, @NonNull Fragment fragment2, View... viewArr) {
        replace(fragment, fragment2, (String) null, false, viewArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5) {
        replace(fragmentManager, fragment, i5, (String) null, false);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        replace(fragmentManager, fragment, i5, null, false, i6, i7, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        replace(fragmentManager, fragment, i5, null, false, i6, i7, i8, i9);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str) {
        replace(fragmentManager, fragment, i5, str, false);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        replace(fragmentManager, fragment, i5, str, false, i6, i7, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        replace(fragmentManager, fragment, i5, str, false, i6, i7, i8, i9);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i5, str, false, z4));
        operate(16, fragmentManager, beginTransaction, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        replace(fragmentManager, fragment, i5, str, z4, i6, i7, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i5, str, false, z4));
        addAnim(beginTransaction, i6, i7, i8, i9);
        operate(16, fragmentManager, beginTransaction, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, boolean z4, View... viewArr) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        putArgs(fragment, new Args(i5, str, false, z4));
        addSharedElement(beginTransaction, viewArr);
        operate(16, fragmentManager, beginTransaction, null, fragment);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, String str, View... viewArr) {
        replace(fragmentManager, fragment, i5, str, false, viewArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4) {
        replace(fragmentManager, fragment, i5, (String) null, z4);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7) {
        replace(fragmentManager, fragment, i5, null, z4, i6, i7, 0, 0);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        replace(fragmentManager, fragment, i5, null, z4, i6, i7, i8, i9);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, boolean z4, View... viewArr) {
        replace(fragmentManager, fragment, i5, (String) null, z4, viewArr);
    }

    public static void replace(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i5, View... viewArr) {
        replace(fragmentManager, fragment, i5, (String) null, false, viewArr);
    }

    public static void setBackground(@NonNull Fragment fragment, Drawable drawable) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        view.setBackground(drawable);
    }

    public static void setBackgroundColor(@NonNull Fragment fragment, @ColorInt int i5) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundColor(i5);
        }
    }

    public static void setBackgroundResource(@NonNull Fragment fragment, @DrawableRes int i5) {
        View view = fragment.getView();
        if (view != null) {
            view.setBackgroundResource(i5);
        }
    }

    public static void show(@NonNull Fragment fragment) {
        putArgs(fragment, false);
        operateNoAnim(2, fragment.getFragmentManager(), null, fragment);
    }

    public static void show(@NonNull FragmentManager fragmentManager) {
        List<Fragment> fragments = getFragments(fragmentManager);
        Iterator<Fragment> it = fragments.iterator();
        while (it.hasNext()) {
            putArgs(it.next(), false);
        }
        operateNoAnim(2, fragmentManager, null, (Fragment[]) fragments.toArray(new Fragment[0]));
    }

    public static void showHide(int i5, @NonNull List<Fragment> list) {
        showHide(list.get(i5), list);
    }

    public static void showHide(int i5, @NonNull List<Fragment> list, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8, @AnimRes @AnimatorRes int i9) {
        showHide(list.get(i5), list, i6, i7, i8, i9);
    }

    public static void showHide(int i5, @NonNull Fragment... fragmentArr) {
        showHide(fragmentArr[i5], fragmentArr);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment fragment2) {
        showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2));
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment fragment2, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        showHide(fragment, (List<Fragment>) Collections.singletonList(fragment2), i5, i6, i7, i8);
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull List<Fragment> list) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                operateNoAnim(8, fragment.getFragmentManager(), fragment, (Fragment[]) list.toArray(new Fragment[0]));
                return;
            }
            Fragment next = it.next();
            if (next != fragment) {
                z4 = true;
            }
            putArgs(next, z4);
        }
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull List<Fragment> list, @AnimRes @AnimatorRes int i5, @AnimRes @AnimatorRes int i6, @AnimRes @AnimatorRes int i7, @AnimRes @AnimatorRes int i8) {
        Iterator<Fragment> it = list.iterator();
        while (true) {
            boolean z4 = false;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != fragment) {
                z4 = true;
            }
            putArgs(next, z4);
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            addAnim(beginTransaction, i5, i6, i7, i8);
            operate(8, fragmentManager, beginTransaction, fragment, (Fragment[]) list.toArray(new Fragment[0]));
        }
    }

    public static void showHide(@NonNull Fragment fragment, @NonNull Fragment... fragmentArr) {
        showHide(fragment, (List<Fragment>) Arrays.asList(fragmentArr));
    }
}
