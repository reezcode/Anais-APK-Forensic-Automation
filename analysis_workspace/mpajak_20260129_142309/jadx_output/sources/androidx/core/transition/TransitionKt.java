package androidx.core.transition;

import android.annotation.SuppressLint;
import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes24.dex */
public final class TransitionKt {
    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, Function1<? super Transition, Unit> onEnd, Function1<? super Transition, Unit> onStart, Function1<? super Transition, Unit> onCancel, Function1<? super Transition, Unit> onResume, Function1<? super Transition, Unit> onPause) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onResume, "onResume");
        Intrinsics.checkNotNullParameter(onPause, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 onEnd, Function1 function1, Function1 function12, Function1 onResume, Function1 onPause, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            onEnd = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt$addListener$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        if ((i5 & 2) != 0) {
            function1 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt$addListener$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        Function1 onStart = function1;
        if ((i5 & 4) != 0) {
            function12 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt$addListener$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        Function1 onCancel = function12;
        if ((i5 & 8) != 0) {
            onResume = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt$addListener$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        if ((i5 & 16) != 0) {
            onPause = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt$addListener$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onResume, "onResume");
        Intrinsics.checkNotNullParameter(onPause, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, final Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                Function1.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, final Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                Function1.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, final Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                Function1.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, final Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                Function1.this.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, final Function1<? super Transition, Unit> action) {
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                Intrinsics.checkNotNullParameter(transition2, "transition");
                Function1.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
