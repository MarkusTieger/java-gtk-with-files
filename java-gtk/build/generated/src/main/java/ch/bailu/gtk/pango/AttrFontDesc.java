/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrFontDesc` structure is used to store an attribute that
 * <br>sets all aspects of the font description at once.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrFontDesc.html">https://docs.gtk.org/Pango/struct.AttrFontDesc.html</a></p>
*/
public class AttrFontDesc extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrFontDesc.class.getCanonicalName());
    }

    public AttrFontDesc(PointerContainer pointer) {
        super(pointer);
    }

    public AttrFontDesc() {
        super(cast(JnaAttrFontDesc.allocateStructure()));
    }

    private JnaAttrFontDesc.Fields _fields;
    
    JnaAttrFontDesc.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrFontDesc.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the font description which is the value of this attribute
    */
    public static final String DESC = "desc";

    /**
     * the font description which is the value of this attribute
    */
    public void setFieldDesc(FontDescription desc) {
        toFields().desc = desc.asCPointer();
        toFields().writeField(DESC);
    }

    /**
     * the font description which is the value of this attribute
    */
    public FontDescription getFieldDesc() {
       toFields().readField(DESC);
       return new FontDescription(new PointerContainer(toFields().desc));
    } 

    /**
     * Create a new font description attribute.
     * <br>
     * <br>This attribute allows setting family, style, weight, variant,
     * <br>stretch, and size simultaneously.
     * @param desc the font description
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute _new(@Nonnull FontDescription desc)  {
        return new Attribute(new PointerContainer(JnaAttrFontDesc.INST().pango_attr_font_desc_new(asCPointerNotNull(desc))));
    }

}

/*
record-type
all-fields-supported
*/
