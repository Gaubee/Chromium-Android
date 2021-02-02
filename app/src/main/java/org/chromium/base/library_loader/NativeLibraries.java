// This file is autogenerated by
//     build/android/gyp/write_native_libraries_java.py
// Please do not change its content.

package org.chromium.base.library_loader;

public class NativeLibraries {
    public static final int CPU_FAMILY_UNKNOWN = 0;
    public static final int CPU_FAMILY_ARM = 1;
    public static final int CPU_FAMILY_MIPS = 2;
    public static final int CPU_FAMILY_X86 = 3;

    // Set to true to enable the use of the Chromium Linker.
    public static final boolean sUseLinker = true;
    public static final boolean sUseLibraryInZipFile = true;
    public static final boolean sUseModernLinker = false;

    // This is the list of native libraries to be loaded (in the correct order)
    // by LibraryLoader.java.
    // TODO(cjhopman): This is public since it is referenced by NativeTestActivity.java
    // directly. The two ways of library loading should be refactored into one.
    public static final String[] LIBRARIES = {"chrome"};

    // This is the expected version of the 'main' native library, which is the one that
    // implements the initial set of base JNI functions including
    // base::android::nativeGetVersionName()
    // TODO(torne): This is public to work around classloader issues in Trichrome
    // where NativeLibraries is not in the same dex as LibraryLoader.
    // We should instead split up Java code along package boundaries.
    public static final String sVersionNumber = "90.0.4395.0";

    public static final int sCpuFamily = CPU_FAMILY_ARM;
}
