package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes23.dex */
public class KeyCache {
    public HashMap<Object, HashMap<String, float[]>> map = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i5) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (this.map.containsKey(obj) && (hashMap = this.map.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i5) {
            return fArr[i5];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i5, float f5) {
        HashMap<String, float[]> hashMap;
        if (this.map.containsKey(obj)) {
            hashMap = this.map.get(obj);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (hashMap.containsKey(str)) {
                float[] fArr = hashMap.get(str);
                if (fArr == null) {
                    fArr = new float[0];
                }
                if (fArr.length <= i5) {
                    fArr = Arrays.copyOf(fArr, i5 + 1);
                }
                fArr[i5] = f5;
                hashMap.put(str, fArr);
                return;
            }
            float[] fArr2 = new float[i5 + 1];
            fArr2[i5] = f5;
            hashMap.put(str, fArr2);
        } else {
            hashMap = new HashMap<>();
            float[] fArr3 = new float[i5 + 1];
            fArr3[i5] = f5;
            hashMap.put(str, fArr3);
        }
        this.map.put(obj, hashMap);
    }
}
