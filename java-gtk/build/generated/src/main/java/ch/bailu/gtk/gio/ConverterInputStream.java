/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Converter input stream implements &#35;GInputStream and allows
 * <br>conversion of data of various types during reading.
 * <br>
 * <br>As of GLib 2.34, &#35;GConverterInputStream implements
 * <br>&#35;GPollableInputStream.
 * <p><a href="https://docs.gtk.org/gio/class.ConverterInputStream.html">https://docs.gtk.org/gio/class.ConverterInputStream.html</a></p>
*/
public class ConverterInputStream extends FilterInputStream {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConverterInputStream.class.getCanonicalName());
    }

    public ConverterInputStream(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new converter input stream for the &#64;base_stream.
     * @param base_stream a &#35;GInputStream
     * @param converter a &#35;GConverter
    */
    public ConverterInputStream(@Nonnull InputStream base_stream, @Nonnull Converter converter) {
        super(cast(JnaConverterInputStream.INST().g_converter_input_stream_new(asCPointerNotNull(base_stream), asCPointerNotNull(converter))));
    }

    /**
     * Gets the &#35;GConverter that is used by &#64;converter_stream.
     * @return the converter of the converter input stream
    */
    public Converter getConverter()  {
        return new Converter(new PointerContainer(JnaConverterInputStream.INST().g_converter_input_stream_get_converter(asCPointer())));
    }

    /**
     * Implements interface {@link PollableInputStream}. Call this to get access to interface functions.
     * @return {@link PollableInputStream}
    */
    public PollableInputStream asPollableInputStream() {
        return new PollableInputStream(cast());
    }

    public static long getTypeID() { 
        return JnaConverterInputStream.INST().g_converter_input_stream_get_type(); 
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
