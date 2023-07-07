/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrSize` structure is used to represent attributes which
 * <br>set font size.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrSize.html">https://docs.gtk.org/Pango/struct.AttrSize.html</a></p>
*/
public class AttrSize extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrSize.class.getCanonicalName());
    }

    public AttrSize(PointerContainer pointer) {
        super(pointer);
    }

    public AttrSize() {
        super(cast(JnaAttrSize.allocateStructure()));
    }

    private JnaAttrSize.Fields _fields;
    
    JnaAttrSize.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrSize.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * size of font, in units of 1/%PANGO_SCALE of a point (for
     * <br>  %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
    */
    public static final String SIZE = "size";

    /**
     * size of font, in units of 1/%PANGO_SCALE of a point (for
     * <br>  %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
    */
    public void setFieldSize(int size) {
        toFields().size = size;
        toFields().writeField(SIZE);
    }

    /**
     * size of font, in units of 1/%PANGO_SCALE of a point (for
     * <br>  %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
    */
    public int getFieldSize() {
       toFields().readField(SIZE);
       return toFields().size;
    } 

    /**
     * whether the font size is in device units or points.
     * <br>  This field is only present for compatibility with Pango-1.8.0
     * <br>  (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     * <br>  be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
    */
    public static final String ABSOLUTE = "absolute";

    /**
     * whether the font size is in device units or points.
     * <br>  This field is only present for compatibility with Pango-1.8.0
     * <br>  (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     * <br>  be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
    */
    public void setFieldAbsolute(int absolute) {
        toFields().absolute = absolute;
        toFields().writeField(ABSOLUTE);
    }

    /**
     * whether the font size is in device units or points.
     * <br>  This field is only present for compatibility with Pango-1.8.0
     * <br>  (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will
     * <br>  be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
    */
    public int getFieldAbsolute() {
       toFields().readField(ABSOLUTE);
       return toFields().absolute;
    } 

    /**
     * Create a new font-size attribute in fractional points.
     * @param size the font size, in %PANGO_SCALE-ths of a point
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute _new(int size)  {
        return new Attribute(new PointerContainer(JnaAttrSize.INST().pango_attr_size_new(size)));
    }

    /**
     * Create a new font-size attribute in device units.
     * @param size the font size, in %PANGO_SCALE-ths of a device unit
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute newAbsolute(int size)  {
        return new Attribute(new PointerContainer(JnaAttrSize.INST().pango_attr_size_new_absolute(size)));
    }

}

/*
record-type
all-fields-supported
*/
