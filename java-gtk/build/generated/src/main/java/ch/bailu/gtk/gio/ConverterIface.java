/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Provides an interface for converting data from one type
 * <br>to another type. The conversion can be stateful
 * <br>and may fail at any place.
 * <p><a href="https://docs.gtk.org/gio/struct.ConverterIface.html">https://docs.gtk.org/gio/struct.ConverterIface.html</a></p>
*/
public class ConverterIface extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConverterIface.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnConvert {
        /**
         * 
         * @param converter a &#35;GConverter.
         * @param inbuf the buffer         containing the data to convert.
         * @param inbuf_size the number of bytes in &#64;inbuf
         * @param outbuf a buffer to write    converted data in.
         * @param outbuf_size the number of bytes in &#64;outbuf, must be at least one
         * @param flags a &#35;GConverterFlags controlling the conversion details
         * @param bytes_read will be set to the number of bytes read from &#64;inbuf on success
         * @param bytes_written will be set to the number of bytes written to &#64;outbuf on success
         * @return a &#35;GConverterResult, %G_CONVERTER_ERROR on error.
        */
        int onConvert(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Converter converter, @Nullable ch.bailu.gtk.type.Pointer inbuf, long inbuf_size, @Nullable ch.bailu.gtk.type.Pointer outbuf, long outbuf_size, int flags, @Nonnull ch.bailu.gtk.type.Int64 bytes_read, @Nonnull ch.bailu.gtk.type.Int64 bytes_written);
    }
    
    private static JnaConverterIface.OnConvert toOnConvert(ch.bailu.gtk.type.Pointer instance, String methodName, OnConvert in) {
        JnaConverterIface.OnConvert out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_converter, _inbuf, _inbuf_size, _outbuf, _outbuf_size, _flags, _bytes_read, _bytes_written, _error) -> in.onConvert(__callback, new Converter(new PointerContainer(_converter)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_inbuf)), _inbuf_size, new ch.bailu.gtk.type.Pointer(new PointerContainer(_outbuf)), _outbuf_size, _flags, new ch.bailu.gtk.type.Int64(new PointerContainer(_bytes_read)), new ch.bailu.gtk.type.Int64(new PointerContainer(_bytes_written)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnReset {
        /**
         * 
         * @param converter a &#35;GConverter.
        */
        void onReset(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Converter converter);
    }
    
    private static JnaConverterIface.OnReset toOnReset(ch.bailu.gtk.type.Pointer instance, String methodName, OnReset in) {
        JnaConverterIface.OnReset out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_converter) -> in.onReset(__callback, new Converter(new PointerContainer(_converter)));
            __callback.register(out);
        }
        return out;
    }

    public ConverterIface(PointerContainer pointer) {
        super(pointer);
    }

    public ConverterIface() {
        super(cast(JnaConverterIface.allocateStructure()));
    }

    private JnaConverterIface.Fields _fields;
    
    JnaConverterIface.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaConverterIface.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * The parent interface.
     * <br>Private field: direct-type
    */
    public static final String G_IFACE = "g_iface";

    /**
     * 
     * <br>See {@link OnConvert#onConvert}
    */
    public static final String CONVERT = "convert";

    /**
     * 
     * <br>See {@link OnConvert#onConvert}
    */
    public void setFieldConvert(OnConvert convert) {
        toFields().convert = toOnConvert(this, CONVERT, convert);
        toFields().writeField(CONVERT);
    }

    /**
     * 
     * <br>See {@link OnConvert#onConvert}
    */
    public JnaConverterIface.OnConvert getFieldConvert() {
       toFields().readField(CONVERT);
       return toFields().convert;
    } 

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public static final String RESET = "reset";

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public void setFieldReset(OnReset reset) {
        toFields().reset = toOnReset(this, RESET, reset);
        toFields().writeField(RESET);
    }

    /**
     * 
     * <br>See {@link OnReset#onReset}
    */
    public JnaConverterIface.OnReset getFieldReset() {
       toFields().readField(RESET);
       return toFields().reset;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Converter.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Converter.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
