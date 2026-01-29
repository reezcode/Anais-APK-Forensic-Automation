package androidx.constraintlayout.core.widgets.analyzer;

import androidx.appcompat.graphics.drawable.a;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    public int direction;
    public WidgetRun firstRun;
    public int groupIndex;
    public WidgetRun lastRun;
    public int position = 0;
    public boolean dual = false;
    public ArrayList<WidgetRun> runs = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i5) {
        this.firstRun = null;
        this.lastRun = null;
        int i6 = index;
        this.groupIndex = i6;
        index = i6 + 1;
        this.firstRun = widgetRun;
        this.lastRun = widgetRun;
        this.direction = i5;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i5) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.widget.isTerminalWidget[i5]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.dependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).run) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).widgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i5);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i5] = false;
                }
                defineTerminalWidget(dependencyNode2.run, i5);
            }
        }
        for (Dependency dependency2 : widgetRun.end.dependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).run) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).widgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i5);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.widget.isTerminalWidget[i5] = false;
                }
                defineTerminalWidget(dependencyNode.run, i5);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j5) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j5;
        }
        int size = dependencyNode.dependencies.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            Dependency dependency = dependencyNode.dependencies.get(i5);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j6 = Math.min(j6, traverseEnd(dependencyNode2, dependencyNode2.margin + j5));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j6;
        }
        long wrapDimension = j5 - widgetRun.getWrapDimension();
        return Math.min(Math.min(j6, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.margin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j5) {
        WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun instanceof HelperReferences) {
            return j5;
        }
        int size = dependencyNode.dependencies.size();
        long j6 = j5;
        for (int i5 = 0; i5 < size; i5++) {
            Dependency dependency = dependencyNode.dependencies.get(i5);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.run != widgetRun) {
                    j6 = Math.max(j6, traverseStart(dependencyNode2, dependencyNode2.margin + j5));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j6;
        }
        long wrapDimension = j5 + widgetRun.getWrapDimension();
        return Math.max(Math.max(j6, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.margin);
    }

    public void add(WidgetRun widgetRun) {
        this.runs.add(widgetRun);
        this.lastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i5) {
        long j5;
        long j6;
        WidgetRun widgetRun = this.firstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i5) {
                return 0L;
            }
        } else if (i5 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i5 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).start;
        DependencyNode dependencyNode2 = (i5 == 0 ? constraintWidgetContainer.horizontalRun : constraintWidgetContainer.verticalRun).end;
        boolean contains = widgetRun.start.targets.contains(dependencyNode);
        boolean contains2 = this.firstRun.end.targets.contains(dependencyNode2);
        long wrapDimension = this.firstRun.getWrapDimension();
        if (!contains || !contains2) {
            if (contains) {
                j6 = traverseStart(this.firstRun.start, r13.margin);
                j5 = this.firstRun.start.margin + wrapDimension;
            } else {
                if (!contains2) {
                    return (this.firstRun.getWrapDimension() + r13.start.margin) - this.firstRun.end.margin;
                }
                j5 = (-this.firstRun.end.margin) + wrapDimension;
                j6 = -traverseEnd(this.firstRun.end, r13.margin);
            }
            return Math.max(j6, j5);
        }
        long traverseStart = traverseStart(this.firstRun.start, 0L);
        long traverseEnd = traverseEnd(this.firstRun.end, 0L);
        long j7 = traverseStart - wrapDimension;
        WidgetRun widgetRun2 = this.firstRun;
        int i6 = widgetRun2.end.margin;
        if (j7 >= (-i6)) {
            j7 += i6;
        }
        int i7 = widgetRun2.start.margin;
        long j8 = ((-traverseEnd) - wrapDimension) - i7;
        if (j8 >= i7) {
            j8 -= i7;
        }
        float biasPercent = widgetRun2.widget.getBiasPercent(i5);
        float f5 = biasPercent > 0.0f ? (long) ((j7 / (1.0f - biasPercent)) + (j8 / biasPercent)) : 0L;
        long a5 = ((long) ((f5 * biasPercent) + 0.5f)) + wrapDimension + ((long) a.a(1.0f, biasPercent, f5, 0.5f));
        WidgetRun widgetRun3 = this.firstRun;
        return (widgetRun3.start.margin + a5) - widgetRun3.end.margin;
    }

    public void defineTerminalWidgets(boolean z4, boolean z5) {
        if (z4) {
            WidgetRun widgetRun = this.firstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z5) {
            WidgetRun widgetRun2 = this.firstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
