/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base class for input stream implementations that perform some
 * <br>kind of filtering operation on a base stream. Typical examples
 * <br>of filtering operations are character set conversion, compression
 * <br>and byte order flipping.
 * <p><a href="https://docs.gtk.org/gio/class.FilterInputStream.html">https://docs.gtk.org/gio/class.FilterInputStream.html</a></p>
*/
public class FilterInputStream extends InputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FilterInputStream.class.getCanonicalName());
    }

    public FilterInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the base stream for the filter stream.
     * @return a &#35;GInputStream.
    */
    public InputStream getBaseStream()  {
        return new InputStream(new PointerContainer(JnaFilterInputStream.INST().g_filter_input_stream_get_base_stream(asCPointer())));
    }

    /**
     * Returns whether the base stream will be closed when &#64;stream is
     * <br>closed.
     * @return %TRUE if the base stream will be closed.
    */
    public boolean getCloseBaseStream()  {
        return JnaFilterInputStream.INST().g_filter_input_stream_get_close_base_stream(asCPointer());
    }

    /**
     * Sets whether the base stream will be closed when &#64;stream is closed.
     * @param close_base %TRUE to close the base stream.
    */
    public void setCloseBaseStream(boolean close_base)  {
        JnaFilterInputStream.INST().g_filter_input_stream_set_close_base_stream(asCPointer(), close_base);
    }

    public static long getTypeID() { 
        return JnaFilterInputStream.INST().g_filter_input_stream_get_type(); 
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
