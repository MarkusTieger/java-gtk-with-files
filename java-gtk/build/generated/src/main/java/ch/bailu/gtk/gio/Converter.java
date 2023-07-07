/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GConverter is implemented by objects that convert
 * <br>binary data in various ways. The conversion can be
 * <br>stateful and may fail at any place.
 * <br>
 * <br>Some example conversions are: character set conversion,
 * <br>compression, decompression and regular expression
 * <br>replace.
 * <p><a href="https://docs.gtk.org/gio/iface.Converter.html">https://docs.gtk.org/gio/iface.Converter.html</a></p>
*/
public class Converter extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Converter.class.getCanonicalName());
    }

    public Converter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * This is the main operation used when converting data. It is to be called
     * <br>multiple times in a loop, and each time it will do some work, i.e.
     * <br>producing some output (in &#64;outbuf) or consuming some input (from &#64;inbuf) or
     * <br>both. If its not possible to do any work an error is returned.
     * <br>
     * <br>Note that a single call may not consume all input (or any input at all).
     * <br>Also a call may produce output even if given no input, due to state stored
     * <br>in the converter producing output.
     * <br>
     * <br>If any data was either produced or consumed, and then an error happens, then
     * <br>only the successful conversion is reported and the error is returned on the
     * <br>next call.
     * <br>
     * <br>A full conversion loop involves calling this method repeatedly, each time
     * <br>giving it new input and space output space. When there is no more input
     * <br>data after the data in &#64;inbuf, the flag %G_CONVERTER_INPUT_AT_END must be set.
     * <br>The loop will be (unless some error happens) returning %G_CONVERTER_CONVERTED
     * <br>each time until all data is consumed and all output is produced, then
     * <br>%G_CONVERTER_FINISHED is returned instead. Note, that %G_CONVERTER_FINISHED
     * <br>may be returned even if %G_CONVERTER_INPUT_AT_END is not set, for instance
     * <br>in a decompression converter where the end of data is detectable from the
     * <br>data (and there might even be other data after the end of the compressed data).
     * <br>
     * <br>When some data has successfully been converted &#64;bytes_read and is set to
     * <br>the number of bytes read from &#64;inbuf, and &#64;bytes_written is set to indicate
     * <br>how many bytes was written to &#64;outbuf. If there are more data to output
     * <br>or consume (i.e. unless the %G_CONVERTER_INPUT_AT_END is specified) then
     * <br>%G_CONVERTER_CONVERTED is returned, and if no more data is to be output
     * <br>then %G_CONVERTER_FINISHED is returned.
     * <br>
     * <br>On error %G_CONVERTER_ERROR is returned and &#64;error is set accordingly.
     * <br>Some errors need special handling:
     * <br>
     * <br>%G_IO_ERROR_NO_SPACE is returned if there is not enough space
     * <br>to write the resulting converted data, the application should
     * <br>call the function again with a larger &#64;outbuf to continue.
     * <br>
     * <br>%G_IO_ERROR_PARTIAL_INPUT is returned if there is not enough
     * <br>input to fully determine what the conversion should produce,
     * <br>and the %G_CONVERTER_INPUT_AT_END flag is not set. This happens for
     * <br>example with an incomplete multibyte sequence when converting text,
     * <br>or when a regexp matches up to the end of the input (and may match
     * <br>further input). It may also happen when &#64;inbuf_size is zero and
     * <br>there is no more data to produce.
     * <br>
     * <br>When this happens the application should read more input and then
     * <br>call the function again. If further input shows that there is no
     * <br>more data call the function again with the same data but with
     * <br>the %G_CONVERTER_INPUT_AT_END flag set. This may cause the conversion
     * <br>to finish as e.g. in the regexp match case (or, to fail again with
     * <br>%G_IO_ERROR_PARTIAL_INPUT in e.g. a charset conversion where the
     * <br>input is actually partial).
     * <br>
     * <br>After g_converter_convert() has returned %G_CONVERTER_FINISHED the
     * <br>converter object is in an invalid state where its not allowed
     * <br>to call g_converter_convert() anymore. At this time you can only
     * <br>free the object or call g_converter_reset() to reset it to the
     * <br>initial state.
     * <br>
     * <br>If the flag %G_CONVERTER_FLUSH is set then conversion is modified
     * <br>to try to write out all internal state to the output. The application
     * <br>has to call the function multiple times with the flag set, and when
     * <br>the available input has been consumed and all internal state has
     * <br>been produced then %G_CONVERTER_FLUSHED (or %G_CONVERTER_FINISHED if
     * <br>really at the end) is returned instead of %G_CONVERTER_CONVERTED.
     * <br>This is somewhat similar to what happens at the end of the input stream,
     * <br>but done in the middle of the data.
     * <br>
     * <br>This has different meanings for different conversions. For instance
     * <br>in a compression converter it would mean that we flush all the
     * <br>compression state into output such that if you uncompress the
     * <br>compressed data you get back all the input data. Doing this may
     * <br>make the final file larger due to padding though. Another example
     * <br>is a regexp conversion, where if you at the end of the flushed data
     * <br>have a match, but there is also a potential longer match. In the
     * <br>non-flushed case we would ask for more input, but when flushing we
     * <br>treat this as the end of input and do the match.
     * <br>
     * <br>Flushing is not always possible (like if a charset converter flushes
     * <br>at a partial multibyte sequence). Converters are supposed to try
     * <br>to produce as much output as possible and then return an error
     * <br>(typically %G_IO_ERROR_PARTIAL_INPUT).
     * @param inbuf the buffer         containing the data to convert.
     * @param inbuf_size the number of bytes in &#64;inbuf
     * @param outbuf a buffer to write    converted data in.
     * @param outbuf_size the number of bytes in &#64;outbuf, must be at least one
     * @param flags a &#35;GConverterFlags controlling the conversion details
     * @param bytes_read will be set to the number of bytes read from &#64;inbuf on success
     * @param bytes_written will be set to the number of bytes written to &#64;outbuf on success
     * @return a &#35;GConverterResult, %G_CONVERTER_ERROR on error.
    */
    public int convert(@Nonnull ch.bailu.gtk.type.Pointer inbuf, long inbuf_size, @Nonnull ch.bailu.gtk.type.Pointer outbuf, long outbuf_size, int flags, @Nonnull ch.bailu.gtk.type.Int64 bytes_read, @Nonnull ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaConverter.INST().g_converter_convert(asCPointer(), asCPointerNotNull(inbuf), inbuf_size, asCPointerNotNull(outbuf), outbuf_size, flags, asCPointerNotNull(bytes_read), asCPointerNotNull(bytes_written), 0L);
    }

    /**
     * Resets all internal state in the converter, making it behave
     * <br>as if it was just created. If the converter has any internal
     * <br>state that would produce output then that output is lost.
    */
    public void reset()  {
        JnaConverter.INST().g_converter_reset(asCPointer());
    }

    public static long getTypeID() { 
        return JnaConverter.INST().g_converter_get_type(); 
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
interface-type
*/
