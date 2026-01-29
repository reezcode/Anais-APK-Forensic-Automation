package androidx.constraintlayout.motion.widget;

/* loaded from: classes11.dex */
interface ProxyInterface {
    int designAccess(int i5, String str, Object obj, float[] fArr, int i6, float[] fArr2, int i7);

    float getKeyFramePosition(Object obj, int i5, float f5, float f6);

    Object getKeyframeAtLocation(Object obj, float f5, float f6);

    Boolean getPositionKeyframe(Object obj, Object obj2, float f5, float f6, String[] strArr, float[] fArr);

    long getTransitionTimeMs();

    void setAttributes(int i5, String str, Object obj, Object obj2);

    void setKeyFrame(Object obj, int i5, String str, Object obj2);

    boolean setKeyFramePosition(Object obj, int i5, int i6, float f5, float f6);

    void setToolPosition(float f5);
}
