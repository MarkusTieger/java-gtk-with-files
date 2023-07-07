/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoAttribute` structure represents the common portions of all
 * <br>attributes.
 * <br>
 * <br>Particular types of attributes include this structure as their initial
 * <br>portion. The common portion of the attribute holds the range to which
 * <br>the value in the type-specific part of the attribute applies and should
 * <br>be initialized using [method&#64;Pango.Attribute.init]. By default, an attribute
 * <br>will have an all-inclusive range of [0,%G_MAXUINT].
 * <p><a href="https://docs.gtk.org/Pango/struct.Attribute.html">https://docs.gtk.org/Pango/struct.Attribute.html</a></p>
*/
public class Attribute extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Attribute.class.getCanonicalName());
    }

    public Attribute(PointerContainer pointer) {
        super(pointer);
    }

    public Attribute() {
        super(cast(JnaAttribute.allocateStructure()));
    }

    private JnaAttribute.Fields _fields;
    
    JnaAttribute.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaAttribute.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the class structure holding information about the type of the attribute
    */
    public static final String KLASS = "klass";

    /**
     * the class structure holding information about the type of the attribute
    */
    public void setFieldKlass(AttrClass klass) {
        toFields().klass = klass.asCPointer();
        toFields().writeField(KLASS);
    }

    /**
     * the class structure holding information about the type of the attribute
    */
    public AttrClass getFieldKlass() {
       toFields().readField(KLASS);
       return new AttrClass(new PointerContainer(toFields().klass));
    } 

    /**
     * the start index of the range (in bytes).
    */
    public static final String START_INDEX = "start_index";

    /**
     * the start index of the range (in bytes).
    */
    public void setFieldStartIndex(int start_index) {
        toFields().start_index = start_index;
        toFields().writeField(START_INDEX);
    }

    /**
     * the start index of the range (in bytes).
    */
    public int getFieldStartIndex() {
       toFields().readField(START_INDEX);
       return toFields().start_index;
    } 

    /**
     * end index of the range (in bytes). The character at this index
     * <br>  is not included in the range.
    */
    public static final String END_INDEX = "end_index";

    /**
     * end index of the range (in bytes). The character at this index
     * <br>  is not included in the range.
    */
    public void setFieldEndIndex(int end_index) {
        toFields().end_index = end_index;
        toFields().writeField(END_INDEX);
    }

    /**
     * end index of the range (in bytes). The character at this index
     * <br>  is not included in the range.
    */
    public int getFieldEndIndex() {
       toFields().readField(END_INDEX);
       return toFields().end_index;
    } 

    /**
     * Returns the attribute cast to `PangoAttrColor`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrColor`,   or %NULL if it's not a color attribute
    */
    public AttrColor asColor()  {
        return new AttrColor(new PointerContainer(JnaAttribute.INST().pango_attribute_as_color(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrFloat`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrFloat`,   or %NULL if it's not a floating point attribute
    */
    public AttrFloat asFloat()  {
        return new AttrFloat(new PointerContainer(JnaAttribute.INST().pango_attribute_as_float(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrFontDesc`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrFontDesc`,   or %NULL if it's not a font description attribute
    */
    public AttrFontDesc asFontDesc()  {
        return new AttrFontDesc(new PointerContainer(JnaAttribute.INST().pango_attribute_as_font_desc(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrFontFeatures`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrFontFeatures`,   or %NULL if it's not a font features attribute
    */
    public AttrFontFeatures asFontFeatures()  {
        return new AttrFontFeatures(new PointerContainer(JnaAttribute.INST().pango_attribute_as_font_features(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrInt`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrInt`,   or %NULL if it's not an integer attribute
    */
    public AttrInt asInt()  {
        return new AttrInt(new PointerContainer(JnaAttribute.INST().pango_attribute_as_int(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrLanguage`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrLanguage`,   or %NULL if it's not a language attribute
    */
    public AttrLanguage asLanguage()  {
        return new AttrLanguage(new PointerContainer(JnaAttribute.INST().pango_attribute_as_language(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrShape`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrShape`,   or %NULL if it's not a shape attribute
    */
    public AttrShape asShape()  {
        return new AttrShape(new PointerContainer(JnaAttribute.INST().pango_attribute_as_shape(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrSize`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrSize`,   or NULL if it's not a size attribute
    */
    public AttrSize asSize()  {
        return new AttrSize(new PointerContainer(JnaAttribute.INST().pango_attribute_as_size(asCPointer())));
    }

    /**
     * Returns the attribute cast to `PangoAttrString`.
     * <br>
     * <br>This is mainly useful for language bindings.
     * @return The attribute as `PangoAttrString`,   or %NULL if it's not a string attribute
    */
    public AttrString asString()  {
        return new AttrString(new PointerContainer(JnaAttribute.INST().pango_attribute_as_string(asCPointer())));
    }

    /**
     * Make a copy of an attribute.
     * @return the newly allocated   `PangoAttribute`, which should be freed with   [method&#64;Pango.Attribute.destroy].
    */
    public Attribute copy()  {
        return new Attribute(new PointerContainer(JnaAttribute.INST().pango_attribute_copy(asCPointer())));
    }

    /**
     * Destroy a `PangoAttribute` and free all associated memory.
    */
    public void destroy()  {
        JnaAttribute.INST().pango_attribute_destroy(asCPointer());
    }

    /**
     * Compare two attributes for equality.
     * <br>
     * <br>This compares only the actual value of the two
     * <br>attributes and not the ranges that the attributes
     * <br>apply to.
     * @param attr2 another `PangoAttribute`
     * @return %TRUE if the two attributes have the same value
    */
    public boolean equal(@Nonnull Attribute attr2)  {
        return JnaAttribute.INST().pango_attribute_equal(asCPointer(), asCPointerNotNull(attr2));
    }

    /**
     * Initializes &#64;attr's klass to &#64;klass, it's start_index to
     * <br>%PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING and end_index to
     * <br>%PANGO_ATTR_INDEX_TO_TEXT_END such that the attribute applies
     * <br>to the entire text by default.
     * @param klass a `PangoAttrClass`
    */
    public void init(@Nonnull AttrClass klass)  {
        JnaAttribute.INST().pango_attribute_init(asCPointer(), asCPointerNotNull(klass));
    }

    public static long getTypeID() { 
        return JnaAttribute.INST().pango_attribute_get_type(); 
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
