/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Converter output stream implements &#35;GOutputStream and allows
 * <br>conversion of data of various types during reading.
 * <br>
 * <br>As of GLib 2.34, &#35;GConverterOutputStream implements
 * <br>&#35;GPollableOutputStream.
 * <p><a href="https://docs.gtk.org/gio/class.ConverterOutputStream.html">https://docs.gtk.org/gio/class.ConverterOutputStream.html</a></p>
*/
public class ConverterOutputStream extends FilterOutputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConverterOutputStream.class.getCanonicalName());
    }

    public ConverterOutputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new converter output stream for the &#64;base_stream.
     * @param base_stream a &#35;GOutputStream
     * @param converter a &#35;GConverter
    */
    public ConverterOutputStream(@Nonnull OutputStream base_stream, @Nonnull Converter converter) {
        super(cast(JnaConverterOutputStream.INST().g_converter_output_stream_new(asCPointerNotNull(base_stream), asCPointerNotNull(converter))));
    }

    /**
     * Gets the &#35;GConverter that is used by &#64;converter_stream.
     * @return the converter of the converter output stream
    */
    public Converter getConverter()  {
        return new Converter(new PointerContainer(JnaConverterOutputStream.INST().g_converter_output_stream_get_converter(asCPointer())));
    }

    /**
     * Implements interface {@link PollableOutputStream}. Call this to get access to interface functions.
     * @return {@link PollableOutputStream}
    */
    public PollableOutputStream asPollableOutputStream() {
        return new PollableOutputStream(cast());
    }

    public static long getTypeID() { 
        return JnaConverterOutputStream.INST().g_converter_output_stream_get_type(); 
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
