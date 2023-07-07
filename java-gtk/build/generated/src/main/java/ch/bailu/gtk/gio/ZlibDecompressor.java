/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GZlibDecompressor is an implementation of &#35;GConverter that
 * <br>decompresses data compressed with zlib.
 * <p><a href="https://docs.gtk.org/gio/class.ZlibDecompressor.html">https://docs.gtk.org/gio/class.ZlibDecompressor.html</a></p>
*/
public class ZlibDecompressor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ZlibDecompressor.class.getCanonicalName());
    }

    public ZlibDecompressor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GZlibDecompressor.
     * @param format The format to use for the compressed data
    */
    public ZlibDecompressor(int format) {
        super(cast(JnaZlibDecompressor.INST().g_zlib_decompressor_new(format)));
    }

    /**
     * Retrieves the &#35;GFileInfo constructed from the GZIP header data
     * <br>of compressed data processed by &#64;compressor, or %NULL if &#64;decompressor's
     * <br>&#35;GZlibDecompressor:format property is not %G_ZLIB_COMPRESSOR_FORMAT_GZIP,
     * <br>or the header data was not fully processed yet, or it not present in the
     * <br>data stream at all.
     * @return a &#35;GFileInfo, or %NULL
    */
    public FileInfo getFileInfo()  {
        return new FileInfo(new PointerContainer(JnaZlibDecompressor.INST().g_zlib_decompressor_get_file_info(asCPointer())));
    }

    /**
     * Implements interface {@link Converter}. Call this to get access to interface functions.
     * @return {@link Converter}
    */
    public Converter asConverter() {
        return new Converter(cast());
    }

    public static long getTypeID() { 
        return JnaZlibDecompressor.INST().g_zlib_decompressor_get_type(); 
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
