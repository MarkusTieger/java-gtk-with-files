/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttrLanguage` structure is used to represent attributes that
 * <br>are languages.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrLanguage.html">https://docs.gtk.org/Pango/struct.AttrLanguage.html</a></p>
*/
public class AttrLanguage extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrLanguage.class.getCanonicalName());
    }

    public AttrLanguage(PointerContainer pointer) {
        super(pointer);
    }

    public AttrLanguage() {
        super(cast(JnaAttrLanguage.allocateStructure()));
    }

    private JnaAttrLanguage.Fields _fields;
    
    JnaAttrLanguage.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttrLanguage.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the common portion of the attribute
     * <br>Private field: direct-type
    */
    public static final String ATTR = "attr";

    /**
     * the `PangoLanguage` which is the value of the attribute
    */
    public static final String VALUE = "value";

    /**
     * the `PangoLanguage` which is the value of the attribute
    */
    public void setFieldValue(Language value) {
        toFields().value = value.asCPointer();
        toFields().writeField(VALUE);
    }

    /**
     * the `PangoLanguage` which is the value of the attribute
    */
    public Language getFieldValue() {
       toFields().readField(VALUE);
       return new Language(new PointerContainer(toFields().value));
    } 

    /**
     * Create a new language tag attribute.
     * @param language language tag
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy]
    */
    public static Attribute _new(@Nonnull Language language)  {
        return new Attribute(new PointerContainer(JnaAttrLanguage.INST().pango_attr_language_new(asCPointerNotNull(language))));
    }

}

/*
record-type
all-fields-supported
*/
