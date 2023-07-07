/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A location in a parse buffer.
 * <p><a href="https://docs.gtk.org/gsk4/struct.ParseLocation.html">https://docs.gtk.org/gsk4/struct.ParseLocation.html</a></p>
*/
public class ParseLocation extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ParseLocation.class.getCanonicalName());
    }

    public ParseLocation(PointerContainer pointer) {
        super(pointer);
    }

    public ParseLocation() {
        super(cast(JnaParseLocation.allocateStructure()));
    }

    private JnaParseLocation.Fields _fields;
    
    JnaParseLocation.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaParseLocation.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the offset of the location in the parse buffer, as bytes
    */
    public static final String BYTES = "bytes";

    /**
     * the offset of the location in the parse buffer, as bytes
    */
    public void setFieldBytes(long bytes) {
        toFields().bytes = bytes;
        toFields().writeField(BYTES);
    }

    /**
     * the offset of the location in the parse buffer, as bytes
    */
    public long getFieldBytes() {
       toFields().readField(BYTES);
       return toFields().bytes;
    } 

    /**
     * the offset of the location in the parse buffer, as characters
    */
    public static final String CHARS = "chars";

    /**
     * the offset of the location in the parse buffer, as characters
    */
    public void setFieldChars(long chars) {
        toFields().chars = chars;
        toFields().writeField(CHARS);
    }

    /**
     * the offset of the location in the parse buffer, as characters
    */
    public long getFieldChars() {
       toFields().readField(CHARS);
       return toFields().chars;
    } 

    /**
     * the line of the location in the parse buffer
    */
    public static final String LINES = "lines";

    /**
     * the line of the location in the parse buffer
    */
    public void setFieldLines(long lines) {
        toFields().lines = lines;
        toFields().writeField(LINES);
    }

    /**
     * the line of the location in the parse buffer
    */
    public long getFieldLines() {
       toFields().readField(LINES);
       return toFields().lines;
    } 

    /**
     * the position in the line, as bytes
    */
    public static final String LINE_BYTES = "line_bytes";

    /**
     * the position in the line, as bytes
    */
    public void setFieldLineBytes(long line_bytes) {
        toFields().line_bytes = line_bytes;
        toFields().writeField(LINE_BYTES);
    }

    /**
     * the position in the line, as bytes
    */
    public long getFieldLineBytes() {
       toFields().readField(LINE_BYTES);
       return toFields().line_bytes;
    } 

    /**
     * the position in the line, as characters
    */
    public static final String LINE_CHARS = "line_chars";

    /**
     * the position in the line, as characters
    */
    public void setFieldLineChars(long line_chars) {
        toFields().line_chars = line_chars;
        toFields().writeField(LINE_CHARS);
    }

    /**
     * the position in the line, as characters
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
