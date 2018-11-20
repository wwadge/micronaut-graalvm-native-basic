package example.micronaut;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.RecomputeFieldValue.Kind;
import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.JdkLoggerFactory;

@TargetClass(InternalLoggerFactory.class)
final class Target_io_netty_util_internal_logging_InternalLoggerFactory {
    @Substitute
    private static InternalLoggerFactory newDefaultFactory(String name) {
        return JdkLoggerFactory.INSTANCE;
    }
}


@TargetClass(className = "io.micronaut.caffeine.cache.UnsafeRefArrayAccess")
final class Target_io_micronaut_caffeine_cache_UnsafeRefArrayAccess {
    @Alias @RecomputeFieldValue(kind = Kind.ArrayIndexShift, declClass = Object[].class)
    public static int REF_ELEMENT_SHIFT;
}

@TargetClass(className = "io.netty.util.internal.PlatformDependent0")
final class Target_io_netty_util_internal_PlatformDependent0 {
    @Alias @RecomputeFieldValue(kind = Kind.FieldOffset, //
            declClassName = "java.nio.Buffer", //
            name = "address") //
    private static long ADDRESS_FIELD_OFFSET;
}

@TargetClass(className = "io.netty.util.internal.CleanerJava6")
final class Target_io_netty_util_internal_CleanerJava6 {
    @Alias @RecomputeFieldValue(kind = Kind.FieldOffset, //
            declClassName = "java.nio.DirectByteBuffer", //
            name = "cleaner") //
    private static long CLEANER_FIELD_OFFSET;
}

@TargetClass(className = "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess")
final class Target_io_netty_util_internal_shaded_org_jctools_util_UnsafeRefArrayAccess {
    @Alias @RecomputeFieldValue(kind = Kind.ArrayIndexShift, declClass = Object[].class) //
    public static int REF_ELEMENT_SHIFT;
}


//
//@TargetClass(className = "com.google.protobuf.UnsafeUtil")
//final class Target_com_google_protobuf_UnsafeUtil {
//    @Alias @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FromAlias)
//    private static final sun.misc.Unsafe UNSAFE = null;
//
//    @Alias @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FromAlias)
//    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = false;
//
//    @Alias @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FromAlias)
//    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
//
//
//    @Alias @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClass = Buffer.class, name = "address")
//    private static long BUFFER_ADDRESS_OFFSET;
//}

public class MicronautSubstitutions {
}