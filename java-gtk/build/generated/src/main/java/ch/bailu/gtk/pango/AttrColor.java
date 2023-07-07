/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrColor` structure is used to represent attributes that
 * <br>are colors.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrColor.html">https://docs.gtk.org/Pango/struct.AttrColor.html</a></p>
*/
public class AttrColor extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrColor.class.getCanonicalName());
    }

    public AttrColor(PointerContainer pointer) {
        super(pointer);
    }

    public AttrColor() {
        super(cast(JnaAttrColor.allocateStructure()));
    }

    private JnaAttrColor.Fields _fields;
    
    JnaAttrColor.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrColor.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the `PangoColor` which is the value of the attribute
     * <br>Private field: direct-type
    */
    public static final String COLOR = "color";

}

/*
record-type
all-fields-supported
*/
