package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes15.dex */
public abstract class WidgetRun implements Dependency {
    public ConstraintWidget.DimensionBehaviour dimensionBehavior;
    public int matchConstraintsType;
    public RunGroup runGroup;
    public ConstraintWidget widget;
    public DimensionDependency dimension = new DimensionDependency(this);
    public int orientation = 0;
    public boolean resolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    public RunType mRunType = RunType.NONE;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes25.dex */
    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.widget = constraintWidget;
    }

    private void resolveDimension(int i5, int i6) {
        DimensionDependency dimensionDependency;
        int limitedDimension;
        int i7 = this.matchConstraintsType;
        if (i7 != 0) {
            if (i7 == 1) {
                int limitedDimension2 = getLimitedDimension(this.dimension.wrapValue, i5);
                dimensionDependency = this.dimension;
                limitedDimension = Math.min(limitedDimension2, i6);
                dimensionDependency.resolve(limitedDimension);
            }
            if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                ConstraintWidget constraintWidget = this.widget;
                WidgetRun widgetRun = constraintWidget.horizontalRun;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.dimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget.verticalRun;
                    if (verticalWidgetRun.dimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                        return;
                    }
                }
                if (i5 == 0) {
                    widgetRun = constraintWidget.verticalRun;
                }
                if (widgetRun.dimension.resolved) {
                    float dimensionRatio = constraintWidget.getDimensionRatio();
                    this.dimension.resolve(i5 == 1 ? (int) ((widgetRun.dimension.value / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * widgetRun.dimension.value) + 0.5f));
                    return;
                }
                return;
            }
            ConstraintWidget parent = this.widget.getParent();
            if (parent == null) {
                return;
            }
            if (!(i5 == 0 ? parent.horizontalRun : parent.verticalRun).dimension.resolved) {
                return;
            }
            ConstraintWidget constraintWidget2 = this.widget;
            i6 = (int) ((r9.value * (i5 == 0 ? constraintWidget2.mMatchConstraintPercentWidth : constraintWidget2.mMatchConstraintPercentHeight)) + 0.5f);
        }
        dimensionDependency = this.dimension;
        limitedDimension = getLimitedDimension(i6, i5);
        dimensionDependency.resolve(limitedDimension);
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i5) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.margin = i5;
        dependencyNode2.dependencies.add(dependencyNode);
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i5, DimensionDependency dimensionDependency) {
        dependencyNode.targets.add(dependencyNode2);
        dependencyNode.targets.add(this.dimension);
        dependencyNode.marginFactor = i5;
        dependencyNode.marginDependency = dimensionDependency;
        dependencyNode2.dependencies.add(dependencyNode);
        dimensionDependency.dependencies.add(dependencyNode);
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final int getLimitedDimension(int i5, int i6) {
        int max;
        if (i6 == 0) {
            ConstraintWidget constraintWidget = this.widget;
            int i7 = constraintWidget.mMatchConstraintMaxWidth;
            max = Math.max(constraintWidget.mMatchConstraintMinWidth, i5);
            if (i7 > 0) {
                max = Math.min(i7, i5);
            }
            if (max == i5) {
                return i5;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.widget;
            int i8 = constraintWidget2.mMatchConstraintMaxHeight;
            max = Math.max(constraintWidget2.mMatchConstraintMinHeight, i5);
            if (i8 > 0) {
                max = Math.min(i8, i5);
            }
            if (max == i5) {
                return i5;
            }
        }
        return max;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                widgetRun2 = constraintWidget.horizontalRun;
            } else if (i5 == 3) {
                widgetRun = constraintWidget.verticalRun;
            } else {
                if (i5 == 4) {
                    return constraintWidget.verticalRun.baseline;
                }
                if (i5 != 5) {
                    return null;
                }
                widgetRun2 = constraintWidget.verticalRun;
            }
            return widgetRun2.end;
        }
        widgetRun = constraintWidget.horizontalRun;
        return widgetRun.start;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i5) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i5 == 0 ? constraintWidget.horizontalRun : constraintWidget.verticalRun;
        int i6 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }

    public long getWrapDimension() {
        if (this.dimension.resolved) {
            return r0.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.targets.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            if (this.start.targets.get(i6).run != this) {
                i5++;
            }
        }
        int size2 = this.end.targets.size();
        for (int i7 = 0; i7 < size2; i7++) {
            if (this.end.targets.get(i7).run != this) {
                i5++;
            }
        }
        return i5 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.dimension.resolved;
    }

    public boolean isResolved() {
        return this.resolved;
    }

    public abstract void reset();

    public abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i5) {
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = constraintAnchor.getMargin() + target.value;
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i6 = margin2 - margin;
            if (!this.dimension.resolved && this.dimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i5, i6);
            }
            DimensionDependency dimensionDependency = this.dimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i6) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                ConstraintWidget constraintWidget = this.widget;
                float horizontalBiasPercent = i5 == 0 ? constraintWidget.getHorizontalBiasPercent() : constraintWidget.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) ((((margin2 - margin) - this.dimension.value) * horizontalBiasPercent) + margin + 0.5f));
                this.end.resolve(this.start.value + this.dimension.value);
            }
        }
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i5) {
        int i6;
        DimensionDependency dimensionDependency = this.dimension;
        if (!dimensionDependency.resolved) {
            return 0L;
        }
        long j5 = dimensionDependency.value;
        if (isCenterConnection()) {
            i6 = this.start.margin - this.end.margin;
        } else {
            if (i5 != 0) {
                return j5 - this.end.margin;
            }
            i6 = this.start.margin;
        }
        return j5 + i6;
    }
}
