/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoAttrList` represents a list of attributes that apply to a section
 * <br>of text.
 * <br>
 * <br>The attributes in a `PangoAttrList` are, in general, allowed to overlap in
 * <br>an arbitrary fashion. However, if the attributes are manipulated only through
 * <br>[method&#64;Pango.AttrList.change], the overlap between properties will meet
 * <br>stricter criteria.
 * <br>
 * <br>Since the `PangoAttrList` structure is stored as a linear list, it is not
 * <br>suitable for storing attributes for large amounts of text. In general, you
 * <br>should not use a single `PangoAttrList` for more than one paragraph of text.
 * <p><a href="https://docs.gtk.org/Pango/struct.AttrList.html">https://docs.gtk.org/Pango/struct.AttrList.html</a></p>
*/
public class AttrList extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AttrList.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAttrFilterFunc {
        /**
         * Type of a function filtering a list of attributes.
         * @param attribute a Pango attribute
         * @param user_data user data passed to the function
         * @return %TRUE if the attribute should be selected for   filtering, %FALSE otherwise.
        */
        boolean onAttrFilterFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Attribute attribute, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaAttrList.OnAttrFilterFunc toOnAttrFilterFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnAttrFilterFunc in) {
        JnaAttrList.OnAttrFilterFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_attribute, _user_data) -> in.onAttrFilterFunc(__callback, new Attribute(new PointerContainer(_attribute)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public AttrList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new empty attribute list with a reference
     * <br>count of one.
    */
    public AttrList() {
        super(cast(JnaAttrList.INST().pango_attr_list_new()));
    }

    /**
     * Insert the given attribute into the `PangoAttrList`.
     * <br>
     * <br>It will replace any attributes of the same type
     * <br>on that segment and be merged with any adjoining
     * <br>attributes that are identical.
     * <br>
     * <br>This function is slower than [method&#64;Pango.AttrList.insert]
     * <br>for creating an attribute list in order (potentially
     * <br>much slower for large lists). However,
     * <br>[method&#64;Pango.AttrList.insert] is not suitable for
     * <br>continually changing a set of attributes since it
     * <br>never removes or combines existing attributes.
     * @param attr the attribute to insert
    */
    public void change(@Nonnull Attribute attr)  {
        JnaAttrList.INST().pango_attr_list_change(asCPointer(), asCPointerNotNull(attr));
    }

    /**
     * Copy &#64;list and return an identical new list.
     * @return the newly allocated   `PangoAttrList`, with a reference count of one,   which should be freed with [method&#64;Pango.AttrList.unref].   Returns %NULL if &#64;list was %NULL.
    */
    public AttrList copy()  {
        return new AttrList(new PointerContainer(JnaAttrList.INST().pango_attr_list_copy(asCPointer())));
    }

    /**
     * Checks whether &#64;list and &#64;other_list contain the same
     * <br>attributes and whether those attributes apply to the
     * <br>same ranges.
     * <br>
     * <br>Beware that this will return wrong values if any list
     * <br>contains duplicates.
     * @param other_list the other `PangoAttrList`
     * @return %TRUE if the lists are equal, %FALSE if   they aren't
    */
    public boolean equal(@Nonnull AttrList other_list)  {
        return JnaAttrList.INST().pango_attr_list_equal(asCPointer(), asCPointerNotNull(other_list));
    }

    /**
     * Given a `PangoAttrList` and callback function, removes
     * <br>any elements of &#64;list for which &#64;func returns %TRUE and
     * <br>inserts them into a new list.
     * @param func callback function;   returns %TRUE if an attribute should be filtered out
     * @param data Data to be passed to &#64;func
     * @return the new   `PangoAttrList` or %NULL if no attributes of the   given types were found
    */
    public AttrList filter(OnAttrFilterFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new AttrList(new PointerContainer(JnaAttrList.INST().pango_attr_list_filter(asCPointer(), toOnAttrFilterFunc(this, "filter", func), asCPointer(data))));
    }

    /**
     * Gets a list of all attributes in &#64;list.
     * @return    a list of all attributes in &#64;list. To free this value,   call [method&#64;Pango.Attribute.destroy] on each value and   g_slist_free() on the list.
    */
    public ch.bailu.gtk.glib.SList getAttributes()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaAttrList.INST().pango_attr_list_get_attributes(asCPointer())));
    }

    /**
     * Create a iterator initialized to the beginning of the list.
     * <br>
     * <br>&#64;list must not be modified until this iterator is freed.
     * @return the newly allocated   `PangoAttrIterator`, which should be freed with   [method&#64;Pango.AttrIterator.destroy]
    */
    public AttrIterator getIterator()  {
        return new AttrIterator(new PointerContainer(JnaAttrList.INST().pango_attr_list_get_iterator(asCPointer())));
    }

    /**
     * Insert the given attribute into the `PangoAttrList`.
     * <br>
     * <br>It will be inserted after all other attributes with a
     * <br>matching &#64;start_index.
     * @param attr the attribute to insert
    */
    public void insert(@Nonnull Attribute attr)  {
        JnaAttrList.INST().pango_attr_list_insert(asCPointer(), asCPointerNotNull(attr));
    }

    /**
     * Insert the given attribute into the `PangoAttrList`.
     * <br>
     * <br>It will be inserted before all other attributes with a
     * <br>matching &#64;start_index.
     * @param attr the attribute to insert
    */
    public void insertBefore(@Nonnull Attribute attr)  {
        JnaAttrList.INST().pango_attr_list_insert_before(asCPointer(), asCPointerNotNull(attr));
    }

    /**
     * Increase the reference count of the given attribute
     * <br>list by one.
     * @return The attribute list passed in
    */
    public AttrList ref()  {
        return new AttrList(new PointerContainer(JnaAttrList.INST().pango_attr_list_ref(asCPointer())));
    }

    /**
     * This function opens up a hole in &#64;list, fills it
     * <br>in with attributes from the left, and then merges
     * <br>&#64;other on top of the hole.
     * <br>
     * <br>This operation is equivalent to stretching every attribute
     * <br>that applies at position &#64;pos in &#64;list by an amount &#64;len,
     * <br>and then calling [method&#64;Pango.AttrList.change] with a copy
     * <br>of each attribute in &#64;other in sequence (offset in position
     * <br>by &#64;pos, and limited in length to &#64;len).
     * <br>
     * <br>This operation proves useful for, for instance, inserting
     * <br>a pre-edit string in the middle of an edit buffer.
     * <br>
     * <br>For backwards compatibility, the function behaves differently
     * <br>when &#64;len is 0. In this case, the attributes from &#64;other are
     * <br>not imited to &#64;len, and are just overlayed on top of &#64;list.
     * <br>
     * <br>This mode is useful for merging two lists of attributes together.
     * @param other another `PangoAttrList`
     * @param pos the position in &#64;list at which to insert &#64;other
     * @param len the length of the spliced segment. (Note that this   must be specified since the attributes in &#64;other may only   be present at some subsection of this range)
    */
    public void splice(@Nonnull AttrList other, int pos, int len)  {
        JnaAttrList.INST().pango_attr_list_splice(asCPointer(), asCPointerNotNull(other), pos, len);
    }

    /**
     * Serializes a `PangoAttrList` to a string.
     * <br>
     * <br>In the resulting string, serialized attributes are separated by newlines or commas.
     * <br>Individual attributes are serialized to a string of the form
     * <br>
     * <br>  START END TYPE VALUE
     * <br>
     * <br>Where START and END are the indices (with -1 being accepted in place
     * <br>of MAXUINT), TYPE is the nickname of the attribute value type, e.g.
     * <br>_weight_ or _stretch_, and the value is serialized according to its type:
     * <br>
     * <br>- enum values as nick or numeric value
     * <br>- boolean values as _true_ or _false_
     * <br>- integers and floats as numbers
     * <br>- strings as string, optionally quoted
     * <br>- font features as quoted string
     * <br>- PangoLanguage as string
     * <br>- PangoFontDescription as serialized by [method&#64;Pango.FontDescription.to_string], quoted
     * <br>- PangoColor as serialized by [method&#64;Pango.Color.to_string]
     * <br>
     * <br>Examples:
     * <br>
     * <br>```
     * <br>0 10 foreground red, 5 15 weight bold, 0 200 font-desc &quot;Sans 10&quot;
     * <br>```
     * <br>
     * <br>```
     * <br>0 -1 weight 700
     * <br>0 100 family Times
     * <br>```
     * <br>
     * <br>To parse the returned value, use [func&#64;Pango.AttrList.from_string].
     * <br>
     * <br>Note that shape attributes can not be serialized.
     * @return a newly allocated string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAttrList.INST().pango_attr_list_to_string(asCPointer())));
    }

    /**
     * Decrease the reference count of the given attribute
     * <br>list by one.
     * <br>
     * <br>If the result is zero, free the attribute list
     * <br>and the attributes it contains.
    */
    public void unref()  {
        JnaAttrList.INST().pango_attr_list_unref(asCPointer());
    }

    /**
     * Update indices of attributes in &#64;list for a change in the
     * <br>text they refer to.
     * <br>
     * <br>The change that this function applies is removing &#64;remove
     * <br>bytes at position &#64;pos and inserting &#64;add bytes instead.
     * <br>
     * <br>Attributes that fall entirely in the (&#64;pos, &#64;pos + &#64;remove)
     * <br>range are removed.
     * <br>
     * <br>Attributes that start or end inside the (&#64;pos, &#64;pos + &#64;remove)
     * <br>range are shortened to reflect the removal.
     * <br>
     * <br>Attributes start and end positions are updated if they are
     * <br>behind &#64;pos + &#64;remove.
     * @param pos the position of the change
     * @param remove the number of removed bytes
     * @param add the number of added bytes
    */
    public void update(int pos, int remove, int add)  {
        JnaAttrList.INST().pango_attr_list_update(asCPointer(), pos, remove, add);
    }

    /**
     * Deserializes a `PangoAttrList` from a string.
     * <br>
     * <br>This is the counterpart to [method&#64;Pango.AttrList.to_string].
     * <br>See that functions for details about the format.
     * @param text a string
     * @return a new `PangoAttrList`
    */
    public static AttrList fromString(@Nonnull ch.bailu.gtk.type.Str text)  {
        return new AttrList(new PointerContainer(JnaAttrList.INST().pango_attr_list_from_string(asCPointerNotNull(text))));
    }

    public static long getTypeID() { 
        return JnaAttrList.INST().pango_attr_list_get_type(); 
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
