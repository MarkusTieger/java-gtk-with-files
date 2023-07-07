/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * GSimpleIOStream creates a &#35;GIOStream from an arbitrary &#35;GInputStream and
 * <br>&#35;GOutputStream. This allows any pair of input and output streams to be used
 * <br>with &#35;GIOStream methods.
 * <br>
 * <br>This is useful when you obtained a &#35;GInputStream and a &#35;GOutputStream
 * <br>by other means, for instance creating them with platform specific methods as
 * <br>g_unix_input_stream_new() or g_win32_input_stream_new(), and you want
 * <br>to take advantage of the methods provided by &#35;GIOStream.
 * <p><a href="https://docs.gtk.org/gio/class.SimpleIOStream.html">https://docs.gtk.org/gio/class.SimpleIOStream.html</a></p>
*/
public class SimpleIOStream extends IOStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SimpleIOStream.class.getCanonicalName());
    }

    public SimpleIOStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GSimpleIOStream wrapping &#64;input_stream and &#64;output_stream.
     * <br>See also &#35;GIOStream.
     * @param input_stream a &#35;GInputStream.
     * @param output_stream a &#35;GOutputStream.
    */
    public SimpleIOStream(@Nonnull InputStream input_stream, @Nonnull OutputStream output_stream) {
        super(cast(JnaSimpleIOStream.INST().g_simple_io_stream_new(asCPointerNotNull(input_stream), asCPointerNotNull(output_stream))));
    }

    public static long getTypeID() { 
        return JnaSimpleIOStream.INST().g_simple_io_stream_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
class-type
*/
