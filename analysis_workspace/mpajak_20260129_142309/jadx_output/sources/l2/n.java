package l2;

import i2.a0;
import i2.z;
import java.util.Map;

/* loaded from: classes25.dex */
public final class n implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final k2.e f3992b;

    /* renamed from: c, reason: collision with root package name */
    public final i2.c f3993c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.m f3994d;

    /* renamed from: e, reason: collision with root package name */
    public final e f3995e;

    /* loaded from: classes21.dex */
    public static final class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
        public final k2.q<T> f3996a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, b> f3997b;

        public a(k2.q<T> qVar, Map<String, b> map) {
            this.f3996a = qVar;
            this.f3997b = map;
        }

        @Override // i2.z
        public final T a(p2.a aVar) {
            if (aVar.N() == 9) {
                aVar.I();
                return null;
            }
            T c5 = this.f3996a.c();
            try {
                aVar.b();
                while (aVar.r()) {
                    b bVar = this.f3997b.get(aVar.E());
                    if (bVar != null && bVar.f4000c) {
                        bVar.a(aVar, c5);
                    }
                    aVar.U();
                }
                aVar.l();
                return c5;
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (IllegalStateException e6) {
                throw new i2.u(e6);
            }
        }

        @Override // i2.z
        public final void b(p2.b bVar, T t4) {
            if (t4 == null) {
                bVar.q();
                return;
            }
            bVar.c();
            try {
                for (b bVar2 : this.f3997b.values()) {
                    if (bVar2.c(t4)) {
                        bVar.n(bVar2.f3998a);
                        bVar2.b(bVar, t4);
                    }
                }
                bVar.l();
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    /* loaded from: classes20.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f3998a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3999b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4000c;

        public b(String str, boolean z4, boolean z5) {
            this.f3998a = str;
            this.f3999b = z4;
            this.f4000c = z5;
        }

        public abstract void a(p2.a aVar, Object obj);

        public abstract void b(p2.b bVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public n(k2.e eVar, i2.c cVar, k2.m mVar, e eVar2) {
        this.f3992b = eVar;
        this.f3993c = cVar;
        this.f3994d = mVar;
        this.f3995e = eVar2;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // i2.a0
    public final <T> i2.z<T> a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.reflect.Field r6, boolean r7) {
        /*
            r5 = this;
            k2.m r0 = r5.f3994d
            java.lang.Class r1 = r6.getType()
            boolean r2 = r0.c(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L17
            boolean r1 = r0.b(r1, r7)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L63
            int r1 = r6.getModifiers()
            r1 = r1 & 136(0x88, float:1.9E-43)
            if (r1 == 0) goto L23
            goto L5d
        L23:
            boolean r1 = r6.isSynthetic()
            if (r1 == 0) goto L2a
            goto L5d
        L2a:
            java.lang.Class r1 = r6.getType()
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L35
            goto L5d
        L35:
            if (r7 == 0) goto L3a
            java.util.List<i2.a> r7 = r0.f3824b
            goto L3c
        L3a:
            java.util.List<i2.a> r7 = r0.f3825c
        L3c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5f
            g3.j r0 = new g3.j
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5f
            java.lang.Object r7 = r6.next()
            i2.a r7 = (i2.a) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L4b
        L5d:
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r6 != 0) goto L63
            r3 = 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.n.b(java.lang.reflect.Field, boolean):boolean");
    }
}
