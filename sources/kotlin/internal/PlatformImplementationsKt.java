package kotlin.internal;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: PlatformImplementations.kt */
public final class PlatformImplementationsKt {
    public static final PlatformImplementations IMPLEMENTATIONS;

    static {
        PlatformImplementations platformImplementations;
        Object newInstance;
        Object newInstance2;
        Object newInstance3;
        Object newInstance4;
        int version = getJavaVersion();
        if (version >= 65544) {
            try {
                newInstance4 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                platformImplementations = (PlatformImplementations) newInstance4;
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance4.getClass().getClassLoader();
                ClassLoader classLoader2 = PlatformImplementations.class.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                Intrinsics.checkNotNullExpressionValue(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException e2) {
                try {
                    newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    Intrinsics.checkNotNullExpressionValue(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    platformImplementations = (PlatformImplementations) newInstance3;
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = PlatformImplementations.class.getClassLoader();
                    Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e3);
                    Intrinsics.checkNotNullExpressionValue(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause2;
                } catch (ClassNotFoundException e4) {
                }
            }
            IMPLEMENTATIONS = platformImplementations;
        }
        if (version >= 65543) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                platformImplementations = (PlatformImplementations) newInstance2;
            } catch (ClassCastException e5) {
                ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader6 = PlatformImplementations.class.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e5);
                Intrinsics.checkNotNullExpressionValue(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException e6) {
                try {
                    newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    Intrinsics.checkNotNullExpressionValue(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    platformImplementations = (PlatformImplementations) newInstance;
                } catch (ClassCastException e7) {
                    ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader8 = PlatformImplementations.class.getClassLoader();
                    Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e7);
                    Intrinsics.checkNotNullExpressionValue(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause4;
                } catch (ClassNotFoundException e8) {
                }
            }
            IMPLEMENTATIONS = platformImplementations;
        }
        platformImplementations = new PlatformImplementations();
        IMPLEMENTATIONS = platformImplementations;
    }

    private static final /* synthetic */ <T> T castToBaseType(Object instance) {
        try {
            Intrinsics.reifiedOperationMarker(1, "T");
            return instance;
        } catch (ClassCastException e) {
            ClassLoader instanceCL = instance.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, "T");
            Class<Object> cls = Object.class;
            Class cls2 = cls;
            ClassLoader baseTypeCL = cls.getClassLoader();
            Throwable initCause = new ClassCastException("Instance classloader: " + instanceCL + ", base type classloader: " + baseTypeCL).initCause(e);
            Intrinsics.checkNotNullExpressionValue(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            Throwable th = initCause;
            throw initCause;
        }
    }

    private static final int getJavaVersion() {
        String version = System.getProperty("java.specification.version");
        if (version == null) {
            return 65542;
        }
        int firstDot = StringsKt.indexOf$default((CharSequence) version, '.', 0, false, 6, (Object) null);
        if (firstDot < 0) {
            try {
                return Integer.parseInt(version) * 65536;
            } catch (NumberFormatException e) {
                return 65542;
            }
        } else {
            int secondDot = StringsKt.indexOf$default((CharSequence) version, '.', firstDot + 1, false, 4, (Object) null);
            if (secondDot < 0) {
                secondDot = version.length();
            }
            String firstPart = version.substring(0, firstDot);
            Intrinsics.checkNotNullExpressionValue(firstPart, "this as java.lang.String…ing(startIndex, endIndex)");
            String secondPart = version.substring(firstDot + 1, secondDot);
            Intrinsics.checkNotNullExpressionValue(secondPart, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(firstPart) * 65536) + Integer.parseInt(secondPart);
            } catch (NumberFormatException e2) {
                return 65542;
            }
        }
    }

    public static final boolean apiVersionIsAtLeast(int major, int minor, int patch) {
        return KotlinVersion.CURRENT.isAtLeast(major, minor, patch);
    }
}
