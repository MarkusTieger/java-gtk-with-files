/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GZlibCompressor is an implementation of &#35;GConverter that
 * <br>compresses data using zlib.
 * <p><a href="https://docs.gtk.org/gio/class.ZlibCompressor.html">https://docs.gtk.org/gio/class.ZlibCompressor.html</a></p>
*/
public class ZlibCompressor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ZlibCompressor.class.getCanonicalName());
    }

    public ZlibCompressor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GZlibCompressor.
     * @param format The format to use for the compressed data
     * @param level compression level (0-9), -1 for default
    */
    public ZlibCompressor(int format, int level) {
        super(cast(JnaZlibCompressor.INST().g_zlib_compressor_new(format, level)));
    }

    /**
     * Returns the &#35;GZlibCompressor:file-info property.
     * @return a &#35;GFileInfo, or %NULL
    */
    public FileInfo getFileInfo()  {
        return new FileInfo(new PointerContainer(JnaZlibCompressor.INST().g_zlib_compressor_get_file_info(asCPointer())));
    }

    /**
     * Sets &#64;file_info in &#64;compressor. If non-%NULL, and &#64;compressor's
     * <br>&#35;GZlibCompressor:format property is %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
     * <br>it will be used to set the file name and modification time in
     * <br>the GZIP header of the compressed data.
     * <br>
     * <br>Note: it is an error to call this function while a compression is in
     * <br>progress; it may only be called immediately after creation of &#64;compressor,
     * <br>or after resetting it with g_converter_reset().
     * @param file_info a &#35;GFileInfo
    */
    public void setFileInfo(@Nullable FileInfo file_info)  {
        JnaZlibCompressor.INST().g_zlib_compressor_set_file_info(asCPointer(), asCPointer(file_info));
    }

    /**
     * Implements interface {@link Converter}. Call this to get access to interface functions.
     * @return {@link Converter}
    */
    public Converter asConverter() {
        return new Converter(cast());
    }

    public static long getTypeID() { 
        return JnaZlibCompressor.INST().g_zlib_compressor_get_type(); 
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
