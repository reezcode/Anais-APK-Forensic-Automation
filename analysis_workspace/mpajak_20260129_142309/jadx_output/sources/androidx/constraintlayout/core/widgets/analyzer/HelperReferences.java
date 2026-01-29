package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* loaded from: classes22.dex */
class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void addDependency(DependencyNode dependencyNode) {
        this.start.dependencies.add(dependencyNode);
        dependencyNode.targets.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        WidgetRun widgetRun;
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            this.start.delegateToWidgetRun = true;
            Barrier barrier = (Barrier) constraintWidget;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i5 = 0;
            if (barrierType == 0) {
                this.start.type = DependencyNode.Type.LEFT;
                while (i5 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget2 = barrier.mWidgets[i5];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.horizontalRun.start;
                        dependencyNode.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode);
                    }
                    i5++;
                }
            } else {
                if (barrierType != 1) {
                    if (barrierType == 2) {
                        this.start.type = DependencyNode.Type.TOP;
                        while (i5 < barrier.mWidgetsCount) {
                            ConstraintWidget constraintWidget3 = barrier.mWidgets[i5];
                            if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                                DependencyNode dependencyNode2 = constraintWidget3.verticalRun.start;
                                dependencyNode2.dependencies.add(this.start);
                                this.start.targets.add(dependencyNode2);
                            }
                            i5++;
                        }
                    } else {
                        if (barrierType != 3) {
                            return;
                        }
                        this.start.type = DependencyNode.Type.BOTTOM;
                        while (i5 < barrier.mWidgetsCount) {
                            ConstraintWidget constraintWidget4 = barrier.mWidgets[i5];
                            if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                                DependencyNode dependencyNode3 = constraintWidget4.verticalRun.end;
                                dependencyNode3.dependencies.add(this.start);
                                this.start.targets.add(dependencyNode3);
                            }
                            i5++;
                        }
                    }
                    addDependency(this.widget.verticalRun.start);
                    widgetRun = this.widget.verticalRun;
                    addDependency(widgetRun.end);
                }
                this.start.type = DependencyNode.Type.RIGHT;
                while (i5 < barrier.mWidgetsCount) {
                    ConstraintWidget constraintWidget5 = barrier.mWidgets[i5];
                    if (allowsGoneWidget || constraintWidget5.getVisibility() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.horizontalRun.end;
                        dependencyNode4.dependencies.add(this.start);
                        this.start.targets.add(dependencyNode4);
                    }
                    i5++;
                }
            }
            addDependency(this.widget.horizontalRun.start);
            widgetRun = this.widget.horizontalRun;
            addDependency(widgetRun.end);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget instanceof Barrier) {
            int barrierType = ((Barrier) constraintWidget).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.widget.setX(this.start.value);
            } else {
                this.widget.setY(this.start.value);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.runGroup = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.start.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        DependencyNode dependencyNode;
        int margin;
        Barrier barrier = (Barrier) this.widget;
        int barrierType = barrier.getBarrierType();
        Iterator<DependencyNode> it = this.start.targets.iterator();
        int i5 = 0;
        int i6 = -1;
        while (it.hasNext()) {
            int i7 = it.next().value;
            if (i6 == -1 || i7 < i6) {
                i6 = i7;
            }
            if (i5 < i7) {
                i5 = i7;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            dependencyNode = this.start;
            margin = barrier.getMargin() + i6;
        } else {
            dependencyNode = this.start;
            margin = barrier.getMargin() + i5;
        }
        dependencyNode.resolve(margin);
    }
}
