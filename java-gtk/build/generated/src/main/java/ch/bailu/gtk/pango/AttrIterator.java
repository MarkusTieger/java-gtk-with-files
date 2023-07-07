/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoAttrIterator` is used to iterate through a `PangoAttrList`.
 * <br>
 * <br>A new iterator is created with [method&#64;Pango.AttrList.get_iterator].
 * <br>Once the iterator is created, it can be advanced through the style
 * <br>changes in the text using [method&#64;Pango.AttrIterator.next]. At each
 * <br>style change, the range of the current style segment and the attributes
 * <br>currently in effect can be queried.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrIterator.html">https://docs.gtk.org/Pango/struct.AttrIterator.html</a></p>
*/
public class AttrIterator extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrIterator.class.getCanonicalName());
    }

    public AttrIterator(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Copy a `PangoAttrIterator`.
     * @return the newly allocated   `PangoAttrIterator`, which should be freed with   [method&#64;Pango.AttrIterator.destroy]
    */
    public AttrIterator copy()  {
        return new AttrIterator(new PointerContainer(JnaAttrIterator.INST().pango_attr_iterator_copy(asCPointer())));
    }

    /**
     * Destroy a `PangoAttrIterator` and free all associated memory.
    */
    public void destroy()  {
        JnaAttrIterator.INST().pango_attr_iterator_destroy(asCPointer());
    }

    /**
     * Find the current attribute of a particular type
     * <br>at the iterator location.
     * <br>
     * <br>When multiple attributes of the same type overlap,
     * <br>the attribute whose range starts closest to the
     * <br>current location is used.
     * @param type the type of attribute to find
     * @return the current   attribute of the given type, or %NULL if no attribute   of that type applies to the current location.
    */
    public Attribute get(int type)  {
        return new Attribute(new PointerContainer(JnaAttrIterator.INST().pango_attr_iterator_get(asCPointer(), type)));
    }

    /**
     * Gets a list of all attributes at the current position of the
     * <br>iterator.
     * @return    a list of all attributes for the current range. To free   this value, call [method&#64;Pango.Attribute.destroy] on each   value and g_slist_free() on the list.
    */
    public ch.bailu.gtk.glib.SList getAttrs()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaAttrIterator.INST().pango_attr_iterator_get_attrs(asCPointer())));
    }

    /**
     * Advance the iterator until the next change of style.
     * @return %FALSE if the iterator is at the end   of the list, otherwise %TRUE
    */
    public boolean next()  {
        return JnaAttrIterator.INST().pango_attr_iterator_next(asCPointer());
    }

    /**
     * Get the range of the current segment.
     * <br>
     * <br>Note that the stored return values are signed, not unsigned
     * <br>like the values in `PangoAttribute`. To deal with this API
     * <br>oversight, stored return values that wouldn't fit into
     * <br>a signed integer are clamped to %G_MAXINT.
     * @param start location to store the start of the range
     * @param end location to store the end of the range
    */
    public void range(@Nonnull ch.bailu.gtk.type.Int start, @Nonnull ch.bailu.gtk.type.Int end)  {
        JnaAttrIterator.INST().pango_attr_iterator_range(asCPointer(), asCPointerNotNull(start), asCPointerNotNull(end));
    }

    public static long getTypeID() { 
        return JnaAttrIterator.INST().pango_attr_iterator_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getFont:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:FontDescription:{c:PangoFontDescription*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLanguage**}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:GSList**}}:{j:}]
*/
