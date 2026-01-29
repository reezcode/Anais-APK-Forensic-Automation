# 🚨 Security Findings (SAST)

**Analysis Date:** 2026-01-29 14:26:31

**APK:** coretax.apk


[← Back to Main Report](./report.md)


---

### Summary

| Severity | Count |
|----------|-------|
| 🔴 Critical | 6 |
| 🟠 High | 3 |
| 🟡 Medium | 4 |
| 🔵 Low | 0 |

**Total Findings:** 13


## 🔴 CRITICAL Severity Findings


### Remote Code Execution (6 issues)

**1. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a/b.java`
- **Line:** 5

```java

import android.app.AppComponentFactory;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ AppComponentFactory a(Object obj) {
        return (AppComponentFactory) obj;
```

**2. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a/a.java`
- **Line:** 10

```java
import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
```

**3. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/com/jx/shell/JniBridge.java`
- **Line:** 7

```java
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class JniBridge {
    public static void a(String str, String str2) {
        String[] strArr = {"libdpt.so"};
```

**4. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/com/jx/shell/ProxyApplication.java`
- **Line:** 13

```java
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class ProxyApplication extends Application {

    /* renamed from: a, reason: collision with root package name */
```

**5. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/com/jx/shell/ProxyComponentFactory.java`
- **Line:** 17

```java
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class ProxyComponentFactory extends AppComponentFactory {

    /* renamed from: a, reason: collision with root package name */
```

**6. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/com/qywl/znkj/MainActivity.java`
- **Line:** 7

```java
import android.os.Bundle;
import android.widget.TextView;

/* loaded from: classes.dex */
public class MainActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
```


## 🟠 HIGH Severity Findings


### Insecure Crypto (3 issues)

**1. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `resources/go/Seq.java`
- **Line:** 102

```java
	public static native void incGoRef(int refnum, GoObject ref);

	// Informs the Go ref tracker that Java is done with this refnum.
	static native void destroyRef(int refnum);

	// decRef is called from seq.FinalizeRef
	static void decRef(int refnum) {
```

**2. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `resources/go/Seq.java`
- **Line:** 121

```java
		int incRefnum();
	}
	// A Proxy is a Java object that proxies a Go object. Proxies, unlike
	// GoObjects, are unwrapped to their Go counterpart when deserialized
	// in Go.
	public interface Proxy extends GoObject {}

```

**3. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `resources/go/Seq.java`
- **Line:** 268

```java
						try {
							GoRef ref = (GoRef)remove();
							refs.remove(ref);
							destroyRef(ref.refnum);
							ref.clear();
						} catch (InterruptedException e) {
							// Ignore
```


## 🟡 MEDIUM Severity Findings


### Logging Sensitive Data (4 issues)

**1. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/a/a.java`
- **Line:** 22

```java
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```

**2. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/a/a.java`
- **Line:** 65

```java
            declaredField3.setAccessible(true);
            return (ApplicationInfo) declaredField3.get(obj2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
```

**3. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/a/a.java`
- **Line:** 201

```java
            goto Lef
        Leb:
            r10 = move-exception
            r10.printStackTrace()
        Lef:
            java.lang.System.currentTimeMillis()
            return
```

**4. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/com/jx/shell/ProxyApplication.java`
- **Line:** 51

```java
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f1a = byteArrayOutputStream.toString();
            if (a.f0a) {
```
