package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes22.dex */
public class KeyFrames {
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> hashMap = new HashMap<>();
        sKeyMakers = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e5) {
            Log.e(TAG, "unable to load", e5);
        }
    }

    public KeyFrames() {
    }

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        Key key;
        Exception e5;
        Constructor<? extends Key> constructor;
        Key key2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        try {
                            constructor = sKeyMakers.get(name);
                        } catch (Exception e6) {
                            key = key2;
                            e5 = e6;
                        }
                        if (constructor == null) {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                        key = constructor.newInstance(new Object[0]);
                        try {
                            key.load(context, Xml.asAttributeSet(xmlPullParser));
                            addKey(key);
                        } catch (Exception e7) {
                            e5 = e7;
                            Log.e(TAG, "unable to create ", e5);
                            key2 = key;
                            eventType = xmlPullParser.next();
                        }
                        key2 = key;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (key2 != null) {
                            HashMap<String, ConstraintAttribute> hashMap = key2.mCustomConstraints;
                            if (hashMap == null) {
                            }
                            ConstraintAttribute.parse(context, xmlPullParser, hashMap);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && key2 != null && (hashMap = key2.mCustomConstraints) != null) {
                        ConstraintAttribute.parse(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3 && ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }

    public static String name(int i5, Context context) {
        return context.getResources().getResourceEntryName(i5);
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            while (it.hasNext()) {
                Key next = it.next();
                if (next.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(next);
                }
            }
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i5) {
        return this.mFramesMap.get(Integer.valueOf(i5));
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }
}
