/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A range of pages to print.
 * <br>
 * <br>See also [method&#64;Gtk.PrintSettings.set_page_ranges].
 * <p><a href="https://docs.gtk.org/gtk4/struct.PageRange.html">https://docs.gtk.org/gtk4/struct.PageRange.html</a></p>
*/
public class PageRange extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PageRange.class.getCanonicalName());
    }

    public PageRange(PointerContainer pointer) {
        super(pointer);
    }

    public PageRange() {
        super(cast(JnaPageRange.allocateStructure()));
    }

    private JnaPageRange.Fields _fields;
    
    JnaPageRange.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaPageRange.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * start of page range.
    */
    public static final String START = "start";

    /**
     * start of page range.
    */
    public void setFieldStart(int start) {
        toFields().start = start;
        toFields().writeField(START);
    }

    /**
     * start of page range.
    */
    public int getFieldStart() {
       toFields().readField(START);
       return toFields().start;
    } 

    /**
     * end of page range.
    */
    public static final String END = "end";

    /**
     * end of page range.
    */
    public void setFieldEnd(int end) {
        toFields().end = end;
        toFields().writeField(END);
    }

    /**
     * end of page range.
    */
    public int getFieldEnd() {
       toFields().readField(END);
       return toFields().end;
    } 

}

/*
record-type
all-fields-supported
*/
