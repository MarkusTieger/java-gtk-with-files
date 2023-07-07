/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GString struct contains the public fields of a GString.
 * <p><a href="https://docs.gtk.org/glib/struct.GString.html">https://docs.gtk.org/glib/struct.GString.html</a></p>
*/
public class GString extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GString.class.getCanonicalName());
    }

    public GString(PointerContainer pointer) {
        super(pointer);
    }

    public GString() {
        super(cast(JnaGString.allocateStructure()));
    }

    private JnaGString.Fields _fields;
    
    JnaGString.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGString.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * points to the character data. It may move as text is added.
     * <br>  The &#64;str field is null-terminated and so
     * <br>  can be used as an ordinary C string.
    */
    public static final String STR = "str";

    /**
     * points to the character data. It may move as text is added.
     * <br>  The &#64;str field is null-terminated and so
     * <br>  can be used as an ordinary C string.
    */
    public void setFieldStr(ch.bailu.gtk.type.Str str) {
        toFields().str = str.asCPointer();
        toFields().writeField(STR);
    }

    /**
     * points to the character data. It may move as text is added.
     * <br>  The &#64;str field is null-terminated and so
     * <br>  can be used as an ordinary C string.
    */
    public ch.bailu.gtk.type.Str getFieldStr() {
       toFields().readField(STR);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().str));
    } 

    /**
     * contains the length of the string, not including the
     * <br>  terminating nul byte.
    */
    public static final String LEN = "len";

    /**
     * contains the length of the string, not including the
     * <br>  terminating nul byte.
    */
    public void setFieldLen(long len) {
        toFields().len = len;
        toFields().writeField(LEN);
    }

    /**
     * contains the length of the string, not including the
     * <br>  terminating nul byte.
    */
    public long getFieldLen() {
       toFields().readField(LEN);
       return toFields().len;
    } 

    /**
     * the number of bytes that can be stored in the
     * <br>  string before it needs to be reallocated. May be larger than &#64;len.
    */
    public static final String ALLOCATED_LEN = "allocated_len";

    /**
     * the number of bytes that can be stored in the
     * <br>  string before it needs to be reallocated. May be larger than &#64;len.
    */
    public void setFieldAllocatedLen(long allocated_len) {
        toFields().allocated_len = allocated_len;
        toFields().writeField(ALLOCATED_LEN);
    }

    /**
     * the number of bytes that can be stored in the
     * <br>  string before it needs to be reallocated. May be larger than &#64;len.
    */
    public long getFieldAllocatedLen() {
       toFields().readField(ALLOCATED_LEN);
       return toFields().allocated_len;
    } 

    /**
     * Creates a new &#35;GString with &#64;len bytes of the &#64;init buffer.
     * <br>Because a length is provided, &#64;init need not be nul-terminated,
     * <br>and can contain embedded nul bytes.
     * <br>
     * <br>Since this function does not stop at nul bytes, it is the caller's
     * <br>responsibility to ensure that &#64;init has at least &#64;len addressable
     * <br>bytes.
     * @param init initial contents of the string
     * @param len length of &#64;init to use
     * @return a new &#35;GString
    */
    public static GString newLenGString(@Nonnull ch.bailu.gtk.type.Str init, long len)  {
        PointerContainer __self = cast(JnaGString.INST().g_string_new_len(asCPointerNotNull(init), len));
        if (__self.isNull()) {
            throw new NullPointerException("GString:newLen");
        }
        return new GString(__self);
    }        
    

    /**
     * Creates a new &#35;GString with &#64;len bytes of the &#64;init buffer.
     * <br>Because a length is provided, &#64;init need not be nul-terminated,
     * <br>and can contain embedded nul bytes.
     * <br>
     * <br>Since this function does not stop at nul bytes, it is the caller's
     * <br>responsibility to ensure that &#64;init has at least &#64;len addressable
     * <br>bytes.
     * @param init initial contents of the string
     * @param len length of &#64;init to use
     * @return a new &#35;GString
    */
    public static GString newLenGString(String init, long len)  {
        PointerContainer __self = cast(JnaGString.INST().g_string_new_len(init, len));
        if (__self.isNull()) {
            throw new NullPointerException("GString:newLen");
        }
        return new GString(__self);
    }        
    

    /**
     * Creates a new &#35;GString, with enough space for &#64;dfl_size
     * <br>bytes. This is useful if you are going to add a lot of
     * <br>text to the string and don't want it to be reallocated
     * <br>too often.
     * @param dfl_size the default size of the space allocated to hold the string
     * @return the new &#35;GString
    */
    public static GString sizedNewGString(long dfl_size)  {
        PointerContainer __self = cast(JnaGString.INST().g_string_sized_new(dfl_size));
        if (__self.isNull()) {
            throw new NullPointerException("GString:sizedNew");
        }
        return new GString(__self);
    }        
    

    /**
     * Creates a new &#35;GString, initialized with the given string.
     * @param init the initial text to copy into the string, or %NULL to   start with an empty string
    */
    public GString(@Nullable ch.bailu.gtk.type.Str init) {
        super(cast(JnaGString.INST().g_string_new(asCPointer(init))));
    }

    /**
     * Creates a new &#35;GString, initialized with the given string.
     * @param init the initial text to copy into the string, or %NULL to   start with an empty string
    */
    public GString(String init) {
        super(cast(JnaGString.INST().g_string_new(init)));
    }

    /**
     * Adds a string onto the end of a &#35;GString, expanding
     * <br>it if necessary.
     * @param val the string to append onto the end of &#64;string
     * @return &#64;string
    */
    public GString append(@Nonnull ch.bailu.gtk.type.Str val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append(asCPointer(), asCPointerNotNull(val))));
    }

    /**
     * Adds a string onto the end of a &#35;GString, expanding
     * <br>it if necessary.
     * @param val the string to append onto the end of &#64;string
     * @return &#64;string
    */
    public GString append(String val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append(asCPointer(), val)));
    }

    /**
     * Adds a byte onto the end of a &#35;GString, expanding
     * <br>it if necessary.
     * @param c the byte to append onto the end of &#64;string
     * @return &#64;string
    */
    public GString appendC(byte c)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_c(asCPointer(), c)));
    }

    /**
     * Appends &#64;len bytes of &#64;val to &#64;string.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length. This
     * <br>makes g_string_append_len() equivalent to g_string_append().
     * @param val bytes to append
     * @param len number of bytes of &#64;val to use, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString appendLen(@Nonnull ch.bailu.gtk.type.Str val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_len(asCPointer(), asCPointerNotNull(val), len)));
    }

    /**
     * Appends &#64;len bytes of &#64;val to &#64;string.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length. This
     * <br>makes g_string_append_len() equivalent to g_string_append().
     * @param val bytes to append
     * @param len number of bytes of &#64;val to use, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString appendLen(String val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_len(asCPointer(), val, len)));
    }

    /**
     * Appends a formatted string onto the end of a &#35;GString.
     * <br>This function is similar to g_string_printf() except
     * <br>that the text is appended to the &#35;GString.
     * @param format the string format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void appendPrintf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGString.INST().g_string_append_printf(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Appends a formatted string onto the end of a &#35;GString.
     * <br>This function is similar to g_string_printf() except
     * <br>that the text is appended to the &#35;GString.
     * @param format the string format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void appendPrintf(String format, java.lang.Object... _elipse)  {
        JnaGString.INST().g_string_append_printf(asCPointer(), format, _elipse);
    }

    /**
     * Converts a Unicode character into UTF-8, and appends it
     * <br>to the string.
     * @param wc a Unicode character
     * @return &#64;string
    */
    public GString appendUnichar(byte wc)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_unichar(asCPointer(), wc)));
    }

    /**
     * Appends &#64;unescaped to &#64;string, escaping any characters that
     * <br>are reserved in URIs using URI-style escape sequences.
     * @param unescaped a string
     * @param reserved_chars_allowed a string of reserved characters allowed     to be used, or %NULL
     * @param allow_utf8 set %TRUE if the escaped string may include UTF8 characters
     * @return &#64;string
    */
    public GString appendUriEscaped(@Nonnull ch.bailu.gtk.type.Str unescaped, @Nonnull ch.bailu.gtk.type.Str reserved_chars_allowed, boolean allow_utf8)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_uri_escaped(asCPointer(), asCPointerNotNull(unescaped), asCPointerNotNull(reserved_chars_allowed), allow_utf8)));
    }

    /**
     * Appends &#64;unescaped to &#64;string, escaping any characters that
     * <br>are reserved in URIs using URI-style escape sequences.
     * @param unescaped a string
     * @param reserved_chars_allowed a string of reserved characters allowed     to be used, or %NULL
     * @param allow_utf8 set %TRUE if the escaped string may include UTF8 characters
     * @return &#64;string
    */
    public GString appendUriEscaped(String unescaped, String reserved_chars_allowed, boolean allow_utf8)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_append_uri_escaped(asCPointer(), unescaped, reserved_chars_allowed, allow_utf8)));
    }

    /**
     * Converts all uppercase ASCII letters to lowercase ASCII letters.
     * @return passed-in &#64;string pointer, with all the     uppercase characters converted to lowercase in place,     with semantics that exactly match g_ascii_tolower().
    */
    public GString asciiDown()  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_ascii_down(asCPointer())));
    }

    /**
     * Converts all lowercase ASCII letters to uppercase ASCII letters.
     * @return passed-in &#64;string pointer, with all the     lowercase characters converted to uppercase in place,     with semantics that exactly match g_ascii_toupper().
    */
    public GString asciiUp()  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_ascii_up(asCPointer())));
    }

    /**
     * Copies the bytes from a string into a &#35;GString,
     * <br>destroying any previous contents. It is rather like
     * <br>the standard strcpy() function, except that you do not
     * <br>have to worry about having enough space to copy the string.
     * @param rval the string to copy into &#64;string
     * @return &#64;string
    */
    public GString assign(@Nonnull ch.bailu.gtk.type.Str rval)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_assign(asCPointer(), asCPointerNotNull(rval))));
    }

    /**
     * Copies the bytes from a string into a &#35;GString,
     * <br>destroying any previous contents. It is rather like
     * <br>the standard strcpy() function, except that you do not
     * <br>have to worry about having enough space to copy the string.
     * @param rval the string to copy into &#64;string
     * @return &#64;string
    */
    public GString assign(String rval)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_assign(asCPointer(), rval)));
    }

    /**
     * Compares two strings for equality, returning %TRUE if they are equal.
     * <br>For use with &#35;GHashTable.
     * @param v2 another &#35;GString
     * @return %TRUE if the strings are the same length and contain the     same bytes
    */
    public boolean equal(@Nonnull GString v2)  {
        return JnaGString.INST().g_string_equal(asCPointer(), asCPointerNotNull(v2));
    }

    /**
     * Removes &#64;len bytes from a &#35;GString, starting at position &#64;pos.
     * <br>The rest of the &#35;GString is shifted down to fill the gap.
     * @param pos the position of the content to remove
     * @param len the number of bytes to remove, or -1 to remove all       following bytes
     * @return &#64;string
    */
    public GString erase(long pos, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_erase(asCPointer(), pos, len)));
    }

    /**
     * Frees the memory allocated for the &#35;GString.
     * <br>If &#64;free_segment is %TRUE it also frees the character data.  If
     * <br>it's %FALSE, the caller gains ownership of the buffer and must
     * <br>free it after use with g_free().
     * @param free_segment if %TRUE, the actual character data is freed as well
     * @return the character data of &#64;string          (i.e. %NULL if &#64;free_segment is %TRUE)
    */
    public ch.bailu.gtk.type.Str free(boolean free_segment)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGString.INST().g_string_free(asCPointer(), free_segment)));
    }

    /**
     * Transfers ownership of the contents of &#64;string to a newly allocated
     * <br>&#35;GBytes.  The &#35;GString structure itself is deallocated, and it is
     * <br>therefore invalid to use &#64;string after invoking this function.
     * <br>
     * <br>Note that while &#35;GString ensures that its buffer always has a
     * <br>trailing nul character (not reflected in its &quot;len&quot;), the returned
     * <br>&#35;GBytes does not include this extra nul; i.e. it has length exactly
     * <br>equal to the &quot;len&quot; member.
     * @return A newly allocated &#35;GBytes containing contents of &#64;string; &#64;string itself is freed
    */
    public Bytes freeToBytes()  {
        return new Bytes(new PointerContainer(JnaGString.INST().g_string_free_to_bytes(asCPointer())));
    }

    /**
     * Creates a hash code for &#64;str; for use with &#35;GHashTable.
     * @return hash code for &#64;str
    */
    public int hash()  {
        return JnaGString.INST().g_string_hash(asCPointer());
    }

    /**
     * Inserts a copy of a string into a &#35;GString,
     * <br>expanding it if necessary.
     * @param pos the position to insert the copy of the string
     * @param val the string to insert
     * @return &#64;string
    */
    public GString insert(long pos, @Nonnull ch.bailu.gtk.type.Str val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert(asCPointer(), pos, asCPointerNotNull(val))));
    }

    /**
     * Inserts a copy of a string into a &#35;GString,
     * <br>expanding it if necessary.
     * @param pos the position to insert the copy of the string
     * @param val the string to insert
     * @return &#64;string
    */
    public GString insert(long pos, String val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert(asCPointer(), pos, val)));
    }

    /**
     * Inserts a byte into a &#35;GString, expanding it if necessary.
     * @param pos the position to insert the byte
     * @param c the byte to insert
     * @return &#64;string
    */
    public GString insertC(long pos, byte c)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert_c(asCPointer(), pos, c)));
    }

    /**
     * Inserts &#64;len bytes of &#64;val into &#64;string at &#64;pos.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length.
     * <br>
     * <br>If &#64;pos is -1, bytes are inserted at the end of the string.
     * @param pos position in &#64;string where insertion should       happen, or -1 for at the end
     * @param val bytes to insert
     * @param len number of bytes of &#64;val to insert, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString insertLen(long pos, @Nonnull ch.bailu.gtk.type.Str val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert_len(asCPointer(), pos, asCPointerNotNull(val), len)));
    }

    /**
     * Inserts &#64;len bytes of &#64;val into &#64;string at &#64;pos.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length.
     * <br>
     * <br>If &#64;pos is -1, bytes are inserted at the end of the string.
     * @param pos position in &#64;string where insertion should       happen, or -1 for at the end
     * @param val bytes to insert
     * @param len number of bytes of &#64;val to insert, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString insertLen(long pos, String val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert_len(asCPointer(), pos, val, len)));
    }

    /**
     * Converts a Unicode character into UTF-8, and insert it
     * <br>into the string at the given position.
     * @param pos the position at which to insert character, or -1     to append at the end of the string
     * @param wc a Unicode character
     * @return &#64;string
    */
    public GString insertUnichar(long pos, byte wc)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_insert_unichar(asCPointer(), pos, wc)));
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the &#64;string starting at &#64;pos
     * @return &#64;string
    */
    public GString overwrite(long pos, @Nonnull ch.bailu.gtk.type.Str val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_overwrite(asCPointer(), pos, asCPointerNotNull(val))));
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the &#64;string starting at &#64;pos
     * @return &#64;string
    */
    public GString overwrite(long pos, String val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_overwrite(asCPointer(), pos, val)));
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     * <br>This function will work with embedded nuls.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the &#64;string starting at &#64;pos
     * @param len the number of bytes to write from &#64;val
     * @return &#64;string
    */
    public GString overwriteLen(long pos, @Nonnull ch.bailu.gtk.type.Str val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_overwrite_len(asCPointer(), pos, asCPointerNotNull(val), len)));
    }

    /**
     * Overwrites part of a string, lengthening it if necessary.
     * <br>This function will work with embedded nuls.
     * @param pos the position at which to start overwriting
     * @param val the string that will overwrite the &#64;string starting at &#64;pos
     * @param len the number of bytes to write from &#64;val
     * @return &#64;string
    */
    public GString overwriteLen(long pos, String val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_overwrite_len(asCPointer(), pos, val, len)));
    }

    /**
     * Adds a string on to the start of a &#35;GString,
     * <br>expanding it if necessary.
     * @param val the string to prepend on the start of &#64;string
     * @return &#64;string
    */
    public GString prepend(@Nonnull ch.bailu.gtk.type.Str val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend(asCPointer(), asCPointerNotNull(val))));
    }

    /**
     * Adds a string on to the start of a &#35;GString,
     * <br>expanding it if necessary.
     * @param val the string to prepend on the start of &#64;string
     * @return &#64;string
    */
    public GString prepend(String val)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend(asCPointer(), val)));
    }

    /**
     * Adds a byte onto the start of a &#35;GString,
     * <br>expanding it if necessary.
     * @param c the byte to prepend on the start of the &#35;GString
     * @return &#64;string
    */
    public GString prependC(byte c)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend_c(asCPointer(), c)));
    }

    /**
     * Prepends &#64;len bytes of &#64;val to &#64;string.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length. This
     * <br>makes g_string_prepend_len() equivalent to g_string_prepend().
     * @param val bytes to prepend
     * @param len number of bytes in &#64;val to prepend, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString prependLen(@Nonnull ch.bailu.gtk.type.Str val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend_len(asCPointer(), asCPointerNotNull(val), len)));
    }

    /**
     * Prepends &#64;len bytes of &#64;val to &#64;string.
     * <br>
     * <br>If &#64;len is positive, &#64;val may contain embedded nuls and need
     * <br>not be nul-terminated. It is the caller's responsibility to
     * <br>ensure that &#64;val has at least &#64;len addressable bytes.
     * <br>
     * <br>If &#64;len is negative, &#64;val must be nul-terminated and &#64;len
     * <br>is considered to request the entire string length. This
     * <br>makes g_string_prepend_len() equivalent to g_string_prepend().
     * @param val bytes to prepend
     * @param len number of bytes in &#64;val to prepend, or -1 for all of &#64;val
     * @return &#64;string
    */
    public GString prependLen(String val, long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend_len(asCPointer(), val, len)));
    }

    /**
     * Converts a Unicode character into UTF-8, and prepends it
     * <br>to the string.
     * @param wc a Unicode character
     * @return &#64;string
    */
    public GString prependUnichar(byte wc)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_prepend_unichar(asCPointer(), wc)));
    }

    /**
     * Writes a formatted string into a &#35;GString.
     * <br>This is similar to the standard sprintf() function,
     * <br>except that the &#35;GString buffer automatically expands
     * <br>to contain the results. The previous contents of the
     * <br>&#35;GString are destroyed.
     * @param format the string format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void printf(@Nonnull ch.bailu.gtk.type.Str format, java.lang.Object... _elipse)  {
        JnaGString.INST().g_string_printf(asCPointer(), asCPointerNotNull(format), _elipse);
    }

    /**
     * Writes a formatted string into a &#35;GString.
     * <br>This is similar to the standard sprintf() function,
     * <br>except that the &#35;GString buffer automatically expands
     * <br>to contain the results. The previous contents of the
     * <br>&#35;GString are destroyed.
     * @param format the string format. See the printf() documentation
     * @param _elipse the parameters to insert into the format string
    */
    public void printf(String format, java.lang.Object... _elipse)  {
        JnaGString.INST().g_string_printf(asCPointer(), format, _elipse);
    }

    /**
     * Replaces the string &#64;find with the string &#64;replace in a &#35;GString up to
     * <br>&#64;limit times. If the number of instances of &#64;find in the &#35;GString is
     * <br>less than &#64;limit, all instances are replaced. If &#64;limit is `0`,
     * <br>all instances of &#64;find are replaced.
     * <br>
     * <br>If &#64;find is the empty string, since versions 2.69.1 and 2.68.4 the
     * <br>replacement will be inserted no more than once per possible position
     * <br>(beginning of string, end of string and between characters). This did
     * <br>not work correctly in earlier versions.
     * @param find the string to find in &#64;string
     * @param replace the string to insert in place of &#64;find
     * @param limit the maximum instances of &#64;find to replace with &#64;replace, or `0` for no limit
     * @return the number of find and replace operations performed.
    */
    public int replace(@Nonnull ch.bailu.gtk.type.Str find, @Nonnull ch.bailu.gtk.type.Str replace, int limit)  {
        return JnaGString.INST().g_string_replace(asCPointer(), asCPointerNotNull(find), asCPointerNotNull(replace), limit);
    }

    /**
     * Replaces the string &#64;find with the string &#64;replace in a &#35;GString up to
     * <br>&#64;limit times. If the number of instances of &#64;find in the &#35;GString is
     * <br>less than &#64;limit, all instances are replaced. If &#64;limit is `0`,
     * <br>all instances of &#64;find are replaced.
     * <br>
     * <br>If &#64;find is the empty string, since versions 2.69.1 and 2.68.4 the
     * <br>replacement will be inserted no more than once per possible position
     * <br>(beginning of string, end of string and between characters). This did
     * <br>not work correctly in earlier versions.
     * @param find the string to find in &#64;string
     * @param replace the string to insert in place of &#64;find
     * @param limit the maximum instances of &#64;find to replace with &#64;replace, or `0` for no limit
     * @return the number of find and replace operations performed.
    */
    public int replace(String find, String replace, int limit)  {
        return JnaGString.INST().g_string_replace(asCPointer(), find, replace, limit);
    }

    /**
     * Sets the length of a &#35;GString. If the length is less than
     * <br>the current length, the string will be truncated. If the
     * <br>length is greater than the current length, the contents
     * <br>of the newly added area are undefined. (However, as
     * <br>always, string-&gt;str[string-&gt;len] will be a nul byte.)
     * @param len the new length
     * @return &#64;string
    */
    public GString setSize(long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_set_size(asCPointer(), len)));
    }

    /**
     * Cuts off the end of the GString, leaving the first &#64;len bytes.
     * @param len the new size of &#64;string
     * @return &#64;string
    */
    public GString truncate(long len)  {
        return new GString(new PointerContainer(JnaGString.INST().g_string_truncate(asCPointer(), len)));
    }

    public static long getTypeID() { 
        return JnaGString.INST().g_gstring_get_type(); 
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
all-fields-supported

[MethodModel:java-type-not-supported:appendVprintf:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]

[MethodModel:cb-deprecated:down:[ParameterModel:Supported:{Gg:GString:{c:GString*}}:{j:long}]]

[MethodModel:cb-deprecated:up:[ParameterModel:Supported:{Gg:GString:{c:GString*}}:{j:long}]]

[MethodModel:java-type-not-supported:vprintf:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const gchar*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
