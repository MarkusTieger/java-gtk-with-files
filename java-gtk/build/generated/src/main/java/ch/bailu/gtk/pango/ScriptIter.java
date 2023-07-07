/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoScriptIter` is used to iterate through a string
 * <br>and identify ranges in different scripts.
 * <p><a href="https://docs.gtk.org/Pango/struct.ScriptIter.html">https://docs.gtk.org/Pango/struct.ScriptIter.html</a></p>
*/
public class ScriptIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScriptIter.class.getCanonicalName());
    }

    public ScriptIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `PangoScriptIter`, used to break a string of
     * <br>Unicode text into runs by Unicode script.
     * <br>
     * <br>No copy is made of &#64;text, so the caller needs to make
     * <br>sure it remains valid until the iterator is freed with
     * <br>[method&#64;Pango.ScriptIter.free].
     * @param text a UTF-8 string
     * @param length length of &#64;text, or -1 if &#64;text is nul-terminated
    */
    public ScriptIter(@Nonnull ch.bailu.gtk.type.Str text, int length) {
        super(cast(JnaScriptIter.INST().pango_script_iter_new(asCPointerNotNull(text), length)));
    }

    /**
     * Create a new `PangoScriptIter`, used to break a string of
     * <br>Unicode text into runs by Unicode script.
     * <br>
     * <br>No copy is made of &#64;text, so the caller needs to make
     * <br>sure it remains valid until the iterator is freed with
     * <br>[method&#64;Pango.ScriptIter.free].
     * @param text a UTF-8 string
     * @param length length of &#64;text, or -1 if &#64;text is nul-terminated
    */
    public ScriptIter(String text, int length) {
        super(cast(JnaScriptIter.INST().pango_script_iter_new(text, length)));
    }

    /**
     * Frees a `PangoScriptIter`.
    */
    public void free()  {
        JnaScriptIter.INST().pango_script_iter_free(asCPointer());
    }

    /**
     * Gets information about the range to which &#64;iter currently points.
     * <br>
     * <br>The range is the set of locations p where *start &lt;= p &lt; *end.
     * <br>(That is, it doesn't include the character stored at *end)
     * <br>
     * <br>Note that while the type of the &#64;script argument is declared
     * <br>as `PangoScript`, as of Pango 1.18, this function simply returns
     * <br>`GUnicodeScript` values. Callers must be prepared to handle unknown
     * <br>values.
     * @param start location to store start position of the range
     * @param end location to store end position of the range
     * @param script location to store script for range
    */
    public void getRange(@Nullable ch.bailu.gtk.type.Strs start, @Nullable ch.bailu.gtk.type.Strs end, @Nullable ch.bailu.gtk.type.Int script)  {
        JnaScriptIter.INST().pango_script_iter_get_range(asCPointer(), asCPointer(start), asCPointer(end), asCPointer(script));
    }

    /**
     * Advances a `PangoScriptIter` to the next range.
     * <br>
     * <br>If &#64;iter is already at the end, it is left unchanged
     * <br>and %FALSE is returned.
     * @return %TRUE if &#64;iter was successfully advanced
    */
    public boolean next()  {
        return JnaScriptIter.INST().pango_script_iter_next(asCPointer());
    }

    public static long getTypeID() { 
        return JnaScriptIter.INST().pango_script_iter_get_type(); 
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
*/
