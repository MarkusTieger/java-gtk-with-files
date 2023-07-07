/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A data structure representing an IO Channel. The fields should be
 * <br>considered private and should only be accessed with the following
 * <br>functions.
 * <p><a href="https://docs.gtk.org/glib/struct.IOChannel.html">https://docs.gtk.org/glib/struct.IOChannel.html</a></p>
*/
public class IOChannel extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(IOChannel.class.getCanonicalName());
    }

    public IOChannel(PointerContainer pointer) {
        super(pointer);
    }

    private JnaIOChannel.Fields _fields;
    
    JnaIOChannel.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaIOChannel.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String REF_COUNT = "ref_count";

    /**
     * 
    */
    public int getFieldRefCount() {
       toFields().readField(REF_COUNT);
       return toFields().ref_count;
    } 

    /**
     * 
    */
    public static final String FUNCS = "funcs";

    /**
     * 
    */
    public IOFuncs getFieldFuncs() {
       toFields().readField(FUNCS);
       return new IOFuncs(new PointerContainer(toFields().funcs));
    } 

    /**
     * 
    */
    public static final String ENCODING = "encoding";

    /**
     * 
    */
    public ch.bailu.gtk.type.Str getFieldEncoding() {
       toFields().readField(ENCODING);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().encoding));
    } 

    /**
     * Open a file &#64;filename as a &#35;GIOChannel using mode &#64;mode. This
     * <br>channel will be closed when the last reference to it is dropped,
     * <br>so there is no need to call g_io_channel_close() (though doing
     * <br>so will not cause problems, as long as no attempt is made to
     * <br>access the channel after it is closed).
     * @param filename A string containing the name of a file
     * @param mode One of &quot;r&quot;, &quot;w&quot;, &quot;a&quot;, &quot;r+&quot;, &quot;w+&quot;, &quot;a+&quot;. These have        the same meaning as in fopen()
     * @return A &#35;GIOChannel on success, %NULL on failure.
    */
    public static IOChannel newFileIOChannel(@Nonnull ch.bailu.gtk.type.Str filename, @Nonnull ch.bailu.gtk.type.Str mode) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaIOChannel.INST().g_io_channel_new_file(asCPointerNotNull(filename), asCPointerNotNull(mode), 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("IOChannel:newFile");
        }
        return new IOChannel(__self);
    }        
    

    /**
     * Open a file &#64;filename as a &#35;GIOChannel using mode &#64;mode. This
     * <br>channel will be closed when the last reference to it is dropped,
     * <br>so there is no need to call g_io_channel_close() (though doing
     * <br>so will not cause problems, as long as no attempt is made to
     * <br>access the channel after it is closed).
     * @param filename A string containing the name of a file
     * @param mode One of &quot;r&quot;, &quot;w&quot;, &quot;a&quot;, &quot;r+&quot;, &quot;w+&quot;, &quot;a+&quot;. These have        the same meaning as in fopen()
     * @return A &#35;GIOChannel on success, %NULL on failure.
    */
    public static IOChannel newFileIOChannel(String filename, String mode) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaIOChannel.INST().g_io_channel_new_file(filename, mode, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("IOChannel:newFile");
        }
        return new IOChannel(__self);
    }        
    

    /**
     * Creates a new &#35;GIOChannel given a file descriptor. On UNIX systems
     * <br>this works for plain files, pipes, and sockets.
     * <br>
     * <br>The returned &#35;GIOChannel has a reference count of 1.
     * <br>
     * <br>The default encoding for &#35;GIOChannel is UTF-8. If your application
     * <br>is reading output from a command using via pipe, you may need to set
     * <br>the encoding to the encoding of the current locale (see
     * <br>g_get_charset()) with the g_io_channel_set_encoding() function.
     * <br>By default, the fd passed will not be closed when the final reference
     * <br>to the &#35;GIOChannel data structure is dropped.
     * <br>
     * <br>If you want to read raw binary data without interpretation, then
     * <br>call the g_io_channel_set_encoding() function with %NULL for the
     * <br>encoding argument.
     * <br>
     * <br>This function is available in GLib on Windows, too, but you should
     * <br>avoid using it on Windows. The domain of file descriptors and
     * <br>sockets overlap. There is no way for GLib to know which one you mean
     * <br>in case the argument you pass to this function happens to be both a
     * <br>valid file descriptor and socket. If that happens a warning is
     * <br>issued, and GLib assumes that it is the file descriptor you mean.
     * @param fd a file descriptor.
     * @return a new &#35;GIOChannel.
    */
    public static IOChannel unixNewIOChannel(int fd)  {
        PointerContainer __self = cast(JnaIOChannel.INST().g_io_channel_unix_new(fd));
        if (__self.isNull()) {
            throw new NullPointerException("IOChannel:unixNew");
        }
        return new IOChannel(__self);
    }        
    

    /**
     * Flushes the write buffer for the GIOChannel.
     * @return the status of the operation: One of   %G_IO_STATUS_NORMAL, %G_IO_STATUS_AGAIN, or   %G_IO_STATUS_ERROR.
    */
    public int flush() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_flush(asCPointer(), 0L);
    }

    /**
     * This function returns a &#35;GIOCondition depending on whether there
     * <br>is data to be read/space to write data in the internal buffers in
     * <br>the &#35;GIOChannel. Only the flags %G_IO_IN and %G_IO_OUT may be set.
     * @return A &#35;GIOCondition
    */
    public int getBufferCondition()  {
        return JnaIOChannel.INST().g_io_channel_get_buffer_condition(asCPointer());
    }

    /**
     * Gets the buffer size.
     * @return the size of the buffer.
    */
    public long getBufferSize()  {
        return JnaIOChannel.INST().g_io_channel_get_buffer_size(asCPointer());
    }

    /**
     * Returns whether &#64;channel is buffered.
     * @return %TRUE if the &#64;channel is buffered.
    */
    public boolean getBuffered()  {
        return JnaIOChannel.INST().g_io_channel_get_buffered(asCPointer());
    }

    /**
     * Returns whether the file/socket/whatever associated with &#64;channel
     * <br>will be closed when &#64;channel receives its final unref and is
     * <br>destroyed. The default value of this is %TRUE for channels created
     * <br>by g_io_channel_new_file (), and %FALSE for all other channels.
     * @return %TRUE if the channel will be closed, %FALSE otherwise.
    */
    public boolean getCloseOnUnref()  {
        return JnaIOChannel.INST().g_io_channel_get_close_on_unref(asCPointer());
    }

    /**
     * Gets the encoding for the input/output of the channel.
     * <br>The internal encoding is always UTF-8. The encoding %NULL
     * <br>makes the channel safe for binary data.
     * @return A string containing the encoding, this string is   owned by GLib and must not be freed.
    */
    public ch.bailu.gtk.type.Str getEncoding()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIOChannel.INST().g_io_channel_get_encoding(asCPointer())));
    }

    /**
     * Gets the current flags for a &#35;GIOChannel, including read-only
     * <br>flags such as %G_IO_FLAG_IS_READABLE.
     * <br>
     * <br>The values of the flags %G_IO_FLAG_IS_READABLE and %G_IO_FLAG_IS_WRITABLE
     * <br>are cached for internal use by the channel when it is created.
     * <br>If they should change at some later point (e.g. partial shutdown
     * <br>of a socket with the UNIX shutdown() function), the user
     * <br>should immediately call g_io_channel_get_flags() to update
     * <br>the internal values of these flags.
     * @return the flags which are set on the channel
    */
    public int getFlags()  {
        return JnaIOChannel.INST().g_io_channel_get_flags(asCPointer());
    }

    /**
     * This returns the string that &#35;GIOChannel uses to determine
     * <br>where in the file a line break occurs. A value of %NULL
     * <br>indicates autodetection.
     * @param length a location to return the length of the line terminator
     * @return The line termination string. This value   is owned by GLib and must not be freed.
    */
    public ch.bailu.gtk.type.Str getLineTerm(@Nonnull ch.bailu.gtk.type.Int length)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaIOChannel.INST().g_io_channel_get_line_term(asCPointer(), asCPointerNotNull(length))));
    }

    /**
     * Initializes a &#35;GIOChannel struct.
     * <br>
     * <br>This is called by each of the above functions when creating a
     * <br>&#35;GIOChannel, and so is not often needed by the application
     * <br>programmer (unless you are creating a new type of &#35;GIOChannel).
    */
    public void init()  {
        JnaIOChannel.INST().g_io_channel_init(asCPointer());
    }

    /**
     * Replacement for g_io_channel_read() with the new API.
     * @param buf      a buffer to read data into
     * @param count the size of the buffer. Note that the buffer may not be     completely filled even if there is data in the buffer if the     remaining data is not a complete character.
     * @param bytes_read The number of bytes read. This may be     zero even on success if count &lt; 6 and the channel's encoding     is non-%NULL. This indicates that the next UTF-8 character is     too wide for the buffer.
     * @return the status of the operation.
    */
    public int readChars(@Nonnull ch.bailu.gtk.type.Str buf, long count, @Nullable ch.bailu.gtk.type.Int64 bytes_read) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_read_chars(asCPointer(), asCPointerNotNull(buf), count, asCPointer(bytes_read), 0L);
    }

    /**
     * Reads a line from a &#35;GIOChannel, using a &#35;GString as a buffer.
     * @param buffer a &#35;GString into which the line will be written.          If &#64;buffer already contains data, the old data will          be overwritten.
     * @param terminator_pos location to store position of line terminator, or %NULL
     * @return the status of the operation.
    */
    public int readLineString(@Nonnull GString buffer, @Nullable ch.bailu.gtk.type.Int64 terminator_pos) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_read_line_string(asCPointer(), asCPointerNotNull(buffer), asCPointer(terminator_pos), 0L);
    }

    /**
     * Increments the reference count of a &#35;GIOChannel.
     * @return the &#64;channel that was passed in (since 2.6)
    */
    public IOChannel ref()  {
        return new IOChannel(new PointerContainer(JnaIOChannel.INST().g_io_channel_ref(asCPointer())));
    }

    /**
     * Replacement for g_io_channel_seek() with the new API.
     * @param offset The offset in bytes from the position specified by &#64;type
     * @param type a &#35;GSeekType. The type %G_SEEK_CUR is only allowed in those                      cases where a call to g_io_channel_set_encoding ()                      is allowed. See the documentation for                      g_io_channel_set_encoding () for details.
     * @return the status of the operation.
    */
    public int seekPosition(long offset, int type) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_seek_position(asCPointer(), offset, type, 0L);
    }

    /**
     * Sets the buffer size.
     * @param size the size of the buffer, or 0 to let GLib pick a good size
    */
    public void setBufferSize(long size)  {
        JnaIOChannel.INST().g_io_channel_set_buffer_size(asCPointer(), size);
    }

    /**
     * The buffering state can only be set if the channel's encoding
     * <br>is %NULL. For any other encoding, the channel must be buffered.
     * <br>
     * <br>A buffered channel can only be set unbuffered if the channel's
     * <br>internal buffers have been flushed. Newly created channels or
     * <br>channels which have returned %G_IO_STATUS_EOF
     * <br>not require such a flush. For write-only channels, a call to
     * <br>g_io_channel_flush () is sufficient. For all other channels,
     * <br>the buffers may be flushed by a call to g_io_channel_seek_position ().
     * <br>This includes the possibility of seeking with seek type %G_SEEK_CUR
     * <br>and an offset of zero. Note that this means that socket-based
     * <br>channels cannot be set unbuffered once they have had data
     * <br>read from them.
     * <br>
     * <br>On unbuffered channels, it is safe to mix read and write
     * <br>calls from the new and old APIs, if this is necessary for
     * <br>maintaining old code.
     * <br>
     * <br>The default state of the channel is buffered.
     * @param buffered whether to set the channel buffered or unbuffered
    */
    public void setBuffered(boolean buffered)  {
        JnaIOChannel.INST().g_io_channel_set_buffered(asCPointer(), buffered);
    }

    /**
     * Whether to close the channel on the final unref of the &#35;GIOChannel
     * <br>data structure. The default value of this is %TRUE for channels
     * <br>created by g_io_channel_new_file (), and %FALSE for all other channels.
     * <br>
     * <br>Setting this flag to %TRUE for a channel you have already closed
     * <br>can cause problems when the final reference to the &#35;GIOChannel is dropped.
     * @param do_close Whether to close the channel on the final unref of            the GIOChannel data structure.
    */
    public void setCloseOnUnref(boolean do_close)  {
        JnaIOChannel.INST().g_io_channel_set_close_on_unref(asCPointer(), do_close);
    }

    /**
     * Sets the encoding for the input/output of the channel.
     * <br>The internal encoding is always UTF-8. The default encoding
     * <br>for the external file is UTF-8.
     * <br>
     * <br>The encoding %NULL is safe to use with binary data.
     * <br>
     * <br>The encoding can only be set if one of the following conditions
     * <br>is true:
     * <br>
     * <br>- The channel was just created, and has not been written to or read from yet.
     * <br>
     * <br>- The channel is write-only.
     * <br>
     * <br>- The channel is a file, and the file pointer was just repositioned
     * <br>  by a call to g_io_channel_seek_position(). (This flushes all the
     * <br>  internal buffers.)
     * <br>
     * <br>- The current encoding is %NULL or UTF-8.
     * <br>
     * <br>- One of the (new API) read functions has just returned %G_IO_STATUS_EOF
     * <br>  (or, in the case of g_io_channel_read_to_end(), %G_IO_STATUS_NORMAL).
     * <br>
     * <br>-  One of the functions g_io_channel_read_chars() or
     * <br>   g_io_channel_read_unichar() has returned %G_IO_STATUS_AGAIN or
     * <br>   %G_IO_STATUS_ERROR. This may be useful in the case of
     * <br>   %G_CONVERT_ERROR_ILLEGAL_SEQUENCE.
     * <br>   Returning one of these statuses from g_io_channel_read_line(),
     * <br>   g_io_channel_read_line_string(), or g_io_channel_read_to_end()
     * <br>   does not guarantee that the encoding can be changed.
     * <br>
     * <br>Channels which do not meet one of the above conditions cannot call
     * <br>g_io_channel_seek_position() with an offset of %G_SEEK_CUR, and, if
     * <br>they are &quot;seekable&quot;, cannot call g_io_channel_write_chars() after
     * <br>calling one of the API &quot;read&quot; functions.
     * @param encoding the encoding type
     * @return %G_IO_STATUS_NORMAL if the encoding was successfully set
    */
    public int setEncoding(@Nullable ch.bailu.gtk.type.Str encoding) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_set_encoding(asCPointer(), asCPointer(encoding), 0L);
    }

    /**
     * Sets the encoding for the input/output of the channel.
     * <br>The internal encoding is always UTF-8. The default encoding
     * <br>for the external file is UTF-8.
     * <br>
     * <br>The encoding %NULL is safe to use with binary data.
     * <br>
     * <br>The encoding can only be set if one of the following conditions
     * <br>is true:
     * <br>
     * <br>- The channel was just created, and has not been written to or read from yet.
     * <br>
     * <br>- The channel is write-only.
     * <br>
     * <br>- The channel is a file, and the file pointer was just repositioned
     * <br>  by a call to g_io_channel_seek_position(). (This flushes all the
     * <br>  internal buffers.)
     * <br>
     * <br>- The current encoding is %NULL or UTF-8.
     * <br>
     * <br>- One of the (new API) read functions has just returned %G_IO_STATUS_EOF
     * <br>  (or, in the case of g_io_channel_read_to_end(), %G_IO_STATUS_NORMAL).
     * <br>
     * <br>-  One of the functions g_io_channel_read_chars() or
     * <br>   g_io_channel_read_unichar() has returned %G_IO_STATUS_AGAIN or
     * <br>   %G_IO_STATUS_ERROR. This may be useful in the case of
     * <br>   %G_CONVERT_ERROR_ILLEGAL_SEQUENCE.
     * <br>   Returning one of these statuses from g_io_channel_read_line(),
     * <br>   g_io_channel_read_line_string(), or g_io_channel_read_to_end()
     * <br>   does not guarantee that the encoding can be changed.
     * <br>
     * <br>Channels which do not meet one of the above conditions cannot call
     * <br>g_io_channel_seek_position() with an offset of %G_SEEK_CUR, and, if
     * <br>they are &quot;seekable&quot;, cannot call g_io_channel_write_chars() after
     * <br>calling one of the API &quot;read&quot; functions.
     * @param encoding the encoding type
     * @return %G_IO_STATUS_NORMAL if the encoding was successfully set
    */
    public int setEncoding(String encoding) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_set_encoding(asCPointer(), encoding, 0L);
    }

    /**
     * Sets the (writeable) flags in &#64;channel to (&#64;flags &amp; %G_IO_FLAG_SET_MASK).
     * @param flags the flags to set on the IO channel
     * @return the status of the operation.
    */
    public int setFlags(int flags) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_set_flags(asCPointer(), flags, 0L);
    }

    /**
     * This sets the string that &#35;GIOChannel uses to determine
     * <br>where in the file a line break occurs.
     * @param line_term The line termination string. Use %NULL for             autodetect.  Autodetection breaks on &quot;&#92;n&quot;, &quot;&#92;r&#92;n&quot;, &quot;&#92;r&quot;, &quot;&#92;0&quot;,             and the Unicode paragraph separator. Autodetection should not be             used for anything other than file-based channels.
     * @param length The length of the termination string. If -1 is passed, the          string is assumed to be nul-terminated. This option allows          termination strings with embedded nuls.
    */
    public void setLineTerm(@Nullable ch.bailu.gtk.type.Str line_term, int length)  {
        JnaIOChannel.INST().g_io_channel_set_line_term(asCPointer(), asCPointer(line_term), length);
    }

    /**
     * This sets the string that &#35;GIOChannel uses to determine
     * <br>where in the file a line break occurs.
     * @param line_term The line termination string. Use %NULL for             autodetect.  Autodetection breaks on &quot;&#92;n&quot;, &quot;&#92;r&#92;n&quot;, &quot;&#92;r&quot;, &quot;&#92;0&quot;,             and the Unicode paragraph separator. Autodetection should not be             used for anything other than file-based channels.
     * @param length The length of the termination string. If -1 is passed, the          string is assumed to be nul-terminated. This option allows          termination strings with embedded nuls.
    */
    public void setLineTerm(String line_term, int length)  {
        JnaIOChannel.INST().g_io_channel_set_line_term(asCPointer(), line_term, length);
    }

    /**
     * Close an IO channel. Any pending data to be written will be
     * <br>flushed if &#64;flush is %TRUE. The channel will not be freed until the
     * <br>last reference is dropped using g_io_channel_unref().
     * @param flush if %TRUE, flush pending
     * @return the status of the operation.
    */
    public int shutdown(boolean flush) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_shutdown(asCPointer(), flush, 0L);
    }

    /**
     * Returns the file descriptor of the &#35;GIOChannel.
     * <br>
     * <br>On Windows this function returns the file descriptor or socket of
     * <br>the &#35;GIOChannel.
     * @return the file descriptor of the &#35;GIOChannel.
    */
    public int unixGetFd()  {
        return JnaIOChannel.INST().g_io_channel_unix_get_fd(asCPointer());
    }

    /**
     * Decrements the reference count of a &#35;GIOChannel.
    */
    public void unref()  {
        JnaIOChannel.INST().g_io_channel_unref(asCPointer());
    }

    /**
     * Replacement for g_io_channel_write() with the new API.
     * <br>
     * <br>On seekable channels with encodings other than %NULL or UTF-8, generic
     * <br>mixing of reading and writing is not allowed. A call to g_io_channel_write_chars ()
     * <br>may only be made on a channel from which data has been read in the
     * <br>cases described in the documentation for g_io_channel_set_encoding ().
     * @param buf a buffer to write data from
     * @param count the size of the buffer. If -1, the buffer         is taken to be a nul-terminated string.
     * @param bytes_written The number of bytes written. This can be nonzero                 even if the return value is not %G_IO_STATUS_NORMAL.                 If the return value is %G_IO_STATUS_NORMAL and the                 channel is blocking, this will always be equal                 to &#64;count if &#64;count &gt;= 0.
     * @return the status of the operation.
    */
    public int writeChars(@Nonnull ch.bailu.gtk.type.Str buf, long count, @Nonnull ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_write_chars(asCPointer(), asCPointerNotNull(buf), count, asCPointerNotNull(bytes_written), 0L);
    }

    /**
     * Replacement for g_io_channel_write() with the new API.
     * <br>
     * <br>On seekable channels with encodings other than %NULL or UTF-8, generic
     * <br>mixing of reading and writing is not allowed. A call to g_io_channel_write_chars ()
     * <br>may only be made on a channel from which data has been read in the
     * <br>cases described in the documentation for g_io_channel_set_encoding ().
     * @param buf a buffer to write data from
     * @param count the size of the buffer. If -1, the buffer         is taken to be a nul-terminated string.
     * @param bytes_written The number of bytes written. This can be nonzero                 even if the return value is not %G_IO_STATUS_NORMAL.                 If the return value is %G_IO_STATUS_NORMAL and the                 channel is blocking, this will always be equal                 to &#64;count if &#64;count &gt;= 0.
     * @return the status of the operation.
    */
    public int writeChars(String buf, long count, @Nonnull ch.bailu.gtk.type.Int64 bytes_written) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_write_chars(asCPointer(), buf, count, asCPointerNotNull(bytes_written), 0L);
    }

    /**
     * Writes a Unicode character to &#64;channel.
     * <br>This function cannot be called on a channel with %NULL encoding.
     * @param thechar a character
     * @return a &#35;GIOStatus
    */
    public int writeUnichar(byte thechar) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaIOChannel.INST().g_io_channel_write_unichar(asCPointer(), thechar, 0L);
    }

    /**
     * Converts an `errno` error number to a &#35;GIOChannelError.
     * @param en an `errno` error number, e.g. `EINVAL`
     * @return a &#35;GIOChannelError error number, e.g.      %G_IO_CHANNEL_ERROR_INVAL.
    */
    public static int errorFromErrno(int en)  {
        return JnaIOChannel.INST().g_io_channel_error_from_errno(en);
    }

    /**
     * 
     * @return 
    */
    public static int errorQuark()  {
        return JnaIOChannel.INST().g_io_channel_error_quark();
    }

    public static long getTypeID() { 
        return JnaIOChannel.INST().g_io_channel_get_type(); 
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
record-type
some-fields-unsupported

[MethodModel:cb-deprecated:close:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:read:[ParameterModel:Supported:{G_::{c:GIOError}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:readLine:[ParameterModel:Supported:{G_::{c:GIOStatus}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:readToEnd:[ParameterModel:Supported:{G_::{c:GIOStatus}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[MethodModel:java-type-not-supported:readUnichar:[ParameterModel:Supported:{G_::{c:GIOStatus}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gunichar*}}:{j:}]

[MethodModel:cb-deprecated:seek:[ParameterModel:Supported:{G_::{c:GIOError}}:{j:int}]]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:GSeekType}}:{j:int}]

[MethodModel:cb-deprecated:write:[ParameterModel:Supported:{G_::{c:GIOError}}:{j:int}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
        [ParameterModel:Supported:{Gw:Int64:{c:gsize*}}:{j:long}]

[FieldModel:read_cd:direct-type:{Gg:IConv:{c:GIConv}}:{j:long}]

[FieldModel:write_cd:direct-type:previous-field-unsupported:{Gg:IConv:{c:GIConv}}:{j:long}]

[FieldModel:line_term:previous-field-unsupported:{Gw:Str:{c:gchar*}}:{j:long}]

[FieldModel:line_term_len:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:buf_size:previous-field-unsupported:{G_::{c:gsize}}:{j:long}]

[FieldModel:read_buf:previous-field-unsupported:{Gg:GString:{c:GString*}}:{j:long}]

[FieldModel:encoded_read_buf:previous-field-unsupported:{Gg:GString:{c:GString*}}:{j:long}]

[FieldModel:write_buf:previous-field-unsupported:{Gg:GString:{c:GString*}}:{j:long}]

[FieldModel:partial_write_buf:java-type-not-supported:previous-field-unsupported:{G_::{c:void*}}:{j:}]

[FieldModel:use_buffer:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:do_encode:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:close_on_unref:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:is_readable:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:is_writeable:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:is_seekable:previous-field-unsupported:{G_::{c:guint}}:{j:int}]

[FieldModel:reserved1:previous-field-unsupported:{Gw:Pointer:{c:gpointer}}:{j:long}]

[FieldModel:reserved2:previous-field-unsupported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
