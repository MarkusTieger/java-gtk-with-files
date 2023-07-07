/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrFontFeatures` structure is used to represent OpenType
 * <br>font features as an attribute.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrFontFeatures.html">https://docs.gtk.org/Pango/struct.AttrFontFeatures.html</a></p>
*/
public class AttrFontFeatures extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrFontFeatures.class.getCanonicalName());
    }

    public AttrFontFeatures(PointerContainer pointer) {
        super(pointer);
    }

    public AttrFontFeatures() {
        super(cast(JnaAttrFontFeatures.allocateStructure()));
    }

    private JnaAttrFontFeatures.Fields _fields;
    
    JnaAttrFontFeatures.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrFontFeatures.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the features, as a string in CSS syntax
    */
    public static final String FEATURES = "features";

    /**
     * the features, as a string in CSS syntax
    */
    public void setFieldFeatures(ch.bailu.gtk.type.Str features) {
        toFields().features = features.asCPointer();
        toFields().writeField(FEATURES);
    }

    /**
     * the features, as a string in CSS syntax
    */
    public ch.bailu.gtk.type.Str getFieldFeatures() {
       toFields().readField(FEATURES);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().features));
    } 

    /**
     * Create a new font features tag attribute.
     * <br>
     * <br>You can use this attribute to select OpenType font features like small-caps,
     * <br>alternative glyphs, ligatures, etc. for fonts that support them.
     * @param features a string with OpenType font features, with the syntax of the [CSS font-feature-settings property](https://www.w3.org/TR/css-fonts-4/&#35;font-rend-desc)
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute _new(@Nonnull ch.bailu.gtk.type.Str features)  {
        return new Attribute(new PointerContainer(JnaAttrFontFeatures.INST().pango_attr_font_features_new(asCPointerNotNull(features))));
    }

}

/*
record-type
all-fields-supported
*/
