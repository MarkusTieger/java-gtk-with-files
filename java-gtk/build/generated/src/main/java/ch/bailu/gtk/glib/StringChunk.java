/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque data structure representing String Chunks.
 * <br>It should only be accessed by using the following functions.
 * <p><a href="https://docs.gtk.org/glib/struct.StringChunk.html">https://docs.gtk.org/glib/struct.StringChunk.html</a></p>
*/
class StringChunk extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(StringChunk.class.getCanonicalName());
    }

    public StringChunk(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Frees all strings contained within the &#35;GStringChunk.
     * <br>After calling g_string_chunk_clear() it is not safe to
     * <br>access any of the strings which were contained within it.
    */
    public void clear()  {
        JnaStringChunk.INST().g_string_chunk_clear(asCPointer());
    }

    /**
     * Frees all memory allocated by the &#35;GStringChunk.
     * <br>After calling g_string_chunk_free() it is not safe to
     * <br>access any of the strings which were contained within it.
    */
    public void free()  {
        JnaStringChunk.INST().g_string_chunk_free(asCPointer());
    }

    /**
     * Adds a copy of &#64;string to the &#35;GStringChunk.
     * <br>It returns a pointer to the new copy of the string
     * <br>in the &#35;GStringChunk. The characters in the string
     * <br>can be changed, if necessary, though you should not
     * <br>change anything after the end of the string.
     * <br>
     * <br>Unlike g_string_chunk_insert_const(), this function
     * <br>does not check for duplicates. Also strings added
     * <br>with g_string_chunk_insert() will not be searched
     * <br>by g_string_chunk_insert_const() when looking for
     * <br>duplicates.
     * @param string the string to add
     * @return a pointer to the copy of &#64;string within     the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insert(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert(asCPointer(), asCPointerNotNull(string))));
    }

    /**
     * Adds a copy of &#64;string to the &#35;GStringChunk.
     * <br>It returns a pointer to the new copy of the string
     * <br>in the &#35;GStringChunk. The characters in the string
     * <br>can be changed, if necessary, though you should not
     * <br>change anything after the end of the string.
     * <br>
     * <br>Unlike g_string_chunk_insert_const(), this function
     * <br>does not check for duplicates. Also strings added
     * <br>with g_string_chunk_insert() will not be searched
     * <br>by g_string_chunk_insert_const() when looking for
     * <br>duplicates.
     * @param string the string to add
     * @return a pointer to the copy of &#64;string within     the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insert(String string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert(asCPointer(), string)));
    }

    /**
     * Adds a copy of &#64;string to the &#35;GStringChunk, unless the same
     * <br>string has already been added to the &#35;GStringChunk with
     * <br>g_string_chunk_insert_const().
     * <br>
     * <br>This function is useful if you need to copy a large number
     * <br>of strings but do not want to waste space storing duplicates.
     * <br>But you must remember that there may be several pointers to
     * <br>the same string, and so any changes made to the strings
     * <br>should be done very carefully.
     * <br>
     * <br>Note that g_string_chunk_insert_const() will not return a
     * <br>pointer to a string added with g_string_chunk_insert(), even
     * <br>if they do match.
     * @param string the string to add
     * @return a pointer to the new or existing copy of &#64;string     within the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insertConst(@Nonnull ch.bailu.gtk.type.Str string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert_const(asCPointer(), asCPointerNotNull(string))));
    }

    /**
     * Adds a copy of &#64;string to the &#35;GStringChunk, unless the same
     * <br>string has already been added to the &#35;GStringChunk with
     * <br>g_string_chunk_insert_const().
     * <br>
     * <br>This function is useful if you need to copy a large number
     * <br>of strings but do not want to waste space storing duplicates.
     * <br>But you must remember that there may be several pointers to
     * <br>the same string, and so any changes made to the strings
     * <br>should be done very carefully.
     * <br>
     * <br>Note that g_string_chunk_insert_const() will not return a
     * <br>pointer to a string added with g_string_chunk_insert(), even
     * <br>if they do match.
     * @param string the string to add
     * @return a pointer to the new or existing copy of &#64;string     within the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insertConst(String string)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert_const(asCPointer(), string)));
    }

    /**
     * Adds a copy of the first &#64;len bytes of &#64;string to the &#35;GStringChunk.
     * <br>The copy is nul-terminated.
     * <br>
     * <br>Since this function does not stop at nul bytes, it is the caller's
     * <br>responsibility to ensure that &#64;string has at least &#64;len addressable
     * <br>bytes.
     * <br>
     * <br>The characters in the returned string can be changed, if necessary,
     * <br>though you should not change anything after the end of the string.
     * @param string bytes to insert
     * @param len number of bytes of &#64;string to insert, or -1 to insert a     nul-terminated string
     * @return a pointer to the copy of &#64;string within the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insertLen(@Nonnull ch.bailu.gtk.type.Str string, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert_len(asCPointer(), asCPointerNotNull(string), len)));
    }

    /**
     * Adds a copy of the first &#64;len bytes of &#64;string to the &#35;GStringChunk.
     * <br>The copy is nul-terminated.
     * <br>
     * <br>Since this function does not stop at nul bytes, it is the caller's
     * <br>responsibility to ensure that &#64;string has at least &#64;len addressable
     * <br>bytes.
     * <br>
     * <br>The characters in the returned string can be changed, if necessary,
     * <br>though you should not change anything after the end of the string.
     * @param string bytes to insert
     * @param len number of bytes of &#64;string to insert, or -1 to insert a     nul-terminated string
     * @return a pointer to the copy of &#64;string within the &#35;GStringChunk
    */
    public ch.bailu.gtk.type.Str insertLen(String string, long len)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaStringChunk.INST().g_string_chunk_insert_len(asCPointer(), string, len)));
    }

    /**
     * Creates a new &#35;GStringChunk.
     * @param size the default size of the blocks of memory which are     allocated to store the strings. If a particular string     is larger than this default size, a larger block of     memory will be allocated for it.
     * @return a new &#35;GStringChunk
    */
    public static StringChunk _new(long size)  {
        return new StringChunk(new PointerContainer(JnaStringChunk.INST().g_string_chunk_new(size)));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
