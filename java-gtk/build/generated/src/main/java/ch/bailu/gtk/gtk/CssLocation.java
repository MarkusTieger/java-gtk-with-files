/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Represents a location in a file or other source of data parsed
 * <br>by the CSS engine.
 * <br>
 * <br>The &#64;bytes and &#64;line_bytes offsets are meant to be used to
 * <br>programmatically match data. The &#64;lines and &#64;line_chars offsets
 * <br>can be used for printing the location in a file.
 * <br>
 * <br>Note that the &#64;lines parameter starts from 0 and is increased
 * <br>whenever a CSS line break is encountered. (CSS defines the C character
 * <br>sequences &quot;&#92;r&#92;n&quot;, &quot;&#92;r&quot;, &quot;&#92;n&quot; and &quot;&#92;f&quot; as newlines.)
 * <br>If your document uses different rules for line breaking, you might want
 * <br>run into problems here.
 * <p><a href="https://docs.gtk.org/gtk4/struct.CssLocation.html">https://docs.gtk.org/gtk4/struct.CssLocation.html</a></p>
*/
public class CssLocation extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CssLocation.class.getCanonicalName());
    }

    public CssLocation(PointerContainer pointer) {
        super(pointer);
    }

    public CssLocation() {
        super(cast(JnaCssLocation.allocateStructure()));
    }

    private JnaCssLocation.Fields _fields;
    
    JnaCssLocation.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaCssLocation.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * number of bytes parsed since the beginning
    */
    public static final String BYTES = "bytes";

    /**
     * number of bytes parsed since the beginning
    */
    public void setFieldBytes(long bytes) {
        toFields().bytes = bytes;
        toFields().writeField(BYTES);
    }

    /**
     * number of bytes parsed since the beginning
    */
    public long getFieldBytes() {
       toFields().readField(BYTES);
       return toFields().bytes;
    } 

    /**
     * number of characters parsed since the beginning
    */
    public static final String CHARS = "chars";

    /**
     * number of characters parsed since the beginning
    */
    public void setFieldChars(long chars) {
        toFields().chars = chars;
        toFields().writeField(CHARS);
    }

    /**
     * number of characters parsed since the beginning
    */
    public long getFieldChars() {
       toFields().readField(CHARS);
       return toFields().chars;
    } 

    /**
     * number of full lines that have been parsed. If you want to
     * <br>  display this as a line number, you need to add 1 to this.
    */
    public static final String LINES = "lines";

    /**
     * number of full lines that have been parsed. If you want to
     * <br>  display this as a line number, you need to add 1 to this.
    */
    public void setFieldLines(long lines) {
        toFields().lines = lines;
        toFields().writeField(LINES);
    }

    /**
     * number of full lines that have been parsed. If you want to
     * <br>  display this as a line number, you need to add 1 to this.
    */
    public long getFieldLines() {
       toFields().readField(LINES);
       return toFields().lines;
    } 

    /**
     * Number of bytes parsed since the last line break
    */
    public static final String LINE_BYTES = "line_bytes";

    /**
     * Number of bytes parsed since the last line break
    */
    public void setFieldLineBytes(long line_bytes) {
        toFields().line_bytes = line_bytes;
        toFields().writeField(LINE_BYTES);
    }

    /**
     * Number of bytes parsed since the last line break
    */
    public long getFieldLineBytes() {
       toFields().readField(LINE_BYTES);
       return toFields().line_bytes;
    } 

    /**
     * Number of characters parsed since the last line break
    */
    public static final String LINE_CHARS = "line_chars";

    /**
     * Number of characters parsed since the last line break
    */
    public void setFieldLineChars(long line_chars) {
        toFields().line_chars = line_chars;
        toFields().writeField(LINE_CHARS);
    }

    /**
     * Number of characters parsed since the last line break
    */
    public long getFieldLineChars() {
       toFields().readField(LINE_CHARS);
       return toFields().line_chars;
    } 

}

/*
record-type
all-fields-supported
*/
