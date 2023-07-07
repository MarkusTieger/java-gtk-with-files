/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoGlyphItem` is a pair of a `PangoItem` and the glyphs
 * <br>resulting from shaping the items text.
 * <br>
 * <br>As an example of the usage of `PangoGlyphItem`, the results
 * <br>of shaping text with `PangoLayout` is a list of `PangoLayoutLine`,
 * <br>each of which contains a list of `PangoGlyphItem`.
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphItem.html">https://docs.gtk.org/Pango/struct.GlyphItem.html</a></p>
*/
public class GlyphItem extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphItem.class.getCanonicalName());
    }

    public GlyphItem(PointerContainer pointer) {
        super(pointer);
    }

    public GlyphItem() {
        super(cast(JnaGlyphItem.allocateStructure()));
    }

    private JnaGlyphItem.Fields _fields;
    
    JnaGlyphItem.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGlyphItem.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * corresponding `PangoItem`
    */
    public static final String ITEM = "item";

    /**
     * corresponding `PangoItem`
    */
    public void setFieldItem(Item item) {
        toFields().item = item.asCPointer();
        toFields().writeField(ITEM);
    }

    /**
     * corresponding `PangoItem`
    */
    public Item getFieldItem() {
       toFields().readField(ITEM);
       return new Item(new PointerContainer(toFields().item));
    } 

    /**
     * corresponding `PangoGlyphString`
    */
    public static final String GLYPHS = "glyphs";

    /**
     * corresponding `PangoGlyphString`
    */
    public void setFieldGlyphs(GlyphString glyphs) {
        toFields().glyphs = glyphs.asCPointer();
        toFields().writeField(GLYPHS);
    }

    /**
     * corresponding `PangoGlyphString`
    */
    public GlyphString getFieldGlyphs() {
       toFields().readField(GLYPHS);
       return new GlyphString(new PointerContainer(toFields().glyphs));
    } 

    /**
     * shift of the baseline, relative to the baseline
     * <br>  of the containing line. Positive values shift upwards
    */
    public static final String Y_OFFSET = "y_offset";

    /**
     * shift of the baseline, relative to the baseline
     * <br>  of the containing line. Positive values shift upwards
    */
    public void setFieldYOffset(int y_offset) {
        toFields().y_offset = y_offset;
        toFields().writeField(Y_OFFSET);
    }

    /**
     * shift of the baseline, relative to the baseline
     * <br>  of the containing line. Positive values shift upwards
    */
    public int getFieldYOffset() {
       toFields().readField(Y_OFFSET);
       return toFields().y_offset;
    } 

    /**
     * horizontal displacement to apply before the
     * <br>  glyph item. Positive values shift right
    */
    public static final String START_X_OFFSET = "start_x_offset";

    /**
     * horizontal displacement to apply before the
     * <br>  glyph item. Positive values shift right
    */
    public void setFieldStartXOffset(int start_x_offset) {
        toFields().start_x_offset = start_x_offset;
        toFields().writeField(START_X_OFFSET);
    }

    /**
     * horizontal displacement to apply before the
     * <br>  glyph item. Positive values shift right
    */
    public int getFieldStartXOffset() {
       toFields().readField(START_X_OFFSET);
       return toFields().start_x_offset;
    } 

    /**
     * horizontal displacement to apply after th
     * <br>  glyph item. Positive values shift right
    */
    public static final String END_X_OFFSET = "end_x_offset";

    /**
     * horizontal displacement to apply after th
     * <br>  glyph item. Positive values shift right
    */
    public void setFieldEndXOffset(int end_x_offset) {
        toFields().end_x_offset = end_x_offset;
        toFields().writeField(END_X_OFFSET);
    }

    /**
     * horizontal displacement to apply after th
     * <br>  glyph item. Positive values shift right
    */
    public int getFieldEndXOffset() {
       toFields().readField(END_X_OFFSET);
       return toFields().end_x_offset;
    } 

    /**
     * Splits a shaped item (`PangoGlyphItem`) into multiple items based
     * <br>on an attribute list.
     * <br>
     * <br>The idea is that if you have attributes that don't affect shaping,
     * <br>such as color or underline, to avoid affecting shaping, you filter
     * <br>them out ([method&#64;Pango.AttrList.filter]), apply the shaping process
     * <br>and then reapply them to the result using this function.
     * <br>
     * <br>All attributes that start or end inside a cluster are applied
     * <br>to that cluster; for instance, if half of a cluster is underlined
     * <br>and the other-half strikethrough, then the cluster will end
     * <br>up with both underline and strikethrough attributes. In these
     * <br>cases, it may happen that &#64;item-&gt;extra_attrs for some of the
     * <br>result items can have multiple attributes of the same type.
     * <br>
     * <br>This function takes ownership of &#64;glyph_item; it will be reused
     * <br>as one of the elements in the list.
     * @param text text that &#64;list applies to
     * @param list a `PangoAttrList`
     * @return a   list of glyph items resulting from splitting &#64;glyph_item. Free   the elements using [method&#64;Pango.GlyphItem.free], the list using   g_slist_free().
    */
    public ch.bailu.gtk.glib.SList applyAttrs(@Nonnull ch.bailu.gtk.type.Str text, @Nonnull AttrList list)  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaGlyphItem.INST().pango_glyph_item_apply_attrs(asCPointer(), asCPointerNotNull(text), asCPointerNotNull(list))));
    }

    /**
     * Splits a shaped item (`PangoGlyphItem`) into multiple items based
     * <br>on an attribute list.
     * <br>
     * <br>The idea is that if you have attributes that don't affect shaping,
     * <br>such as color or underline, to avoid affecting shaping, you filter
     * <br>them out ([method&#64;Pango.AttrList.filter]), apply the shaping process
     * <br>and then reapply them to the result using this function.
     * <br>
     * <br>All attributes that start or end inside a cluster are applied
     * <br>to that cluster; for instance, if half of a cluster is underlined
     * <br>and the other-half strikethrough, then the cluster will end
     * <br>up with both underline and strikethrough attributes. In these
     * <br>cases, it may happen that &#64;item-&gt;extra_attrs for some of the
     * <br>result items can have multiple attributes of the same type.
     * <br>
     * <br>This function takes ownership of &#64;glyph_item; it will be reused
     * <br>as one of the elements in the list.
     * @param text text that &#64;list applies to
     * @param list a `PangoAttrList`
     * @return a   list of glyph items resulting from splitting &#64;glyph_item. Free   the elements using [method&#64;Pango.GlyphItem.free], the list using   g_slist_free().
    */
    public ch.bailu.gtk.glib.SList applyAttrs(String text, @Nonnull AttrList list)  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaGlyphItem.INST().pango_glyph_item_apply_attrs(asCPointer(), text, asCPointerNotNull(list))));
    }

    /**
     * Make a deep copy of an existing `PangoGlyphItem` structure.
     * @return the newly allocated `PangoGlyphItem`
    */
    public GlyphItem copy()  {
        return new GlyphItem(new PointerContainer(JnaGlyphItem.INST().pango_glyph_item_copy(asCPointer())));
    }

    /**
     * Frees a `PangoGlyphItem` and resources to which it points.
    */
    public void free()  {
        JnaGlyphItem.INST().pango_glyph_item_free(asCPointer());
    }

    /**
     * Given a `PangoGlyphItem` and the corresponding text, determine the
     * <br>width corresponding to each character.
     * <br>
     * <br>When multiple characters compose a single cluster, the width of the
     * <br>entire cluster is divided equally among the characters.
     * <br>
     * <br>See also [method&#64;Pango.GlyphString.get_logical_widths].
     * @param text text that &#64;glyph_item corresponds to   (glyph_item-&gt;item-&gt;offset is an offset from the   start of &#64;text)
     * @param logical_widths an array whose length is the number of   characters in glyph_item (equal to glyph_item-&gt;item-&gt;num_chars)   to be filled in with the resulting character widths.
    */
    public void getLogicalWidths(@Nonnull ch.bailu.gtk.type.Str text, @Nonnull ch.bailu.gtk.type.Int logical_widths)  {
        JnaGlyphItem.INST().pango_glyph_item_get_logical_widths(asCPointer(), asCPointerNotNull(text), asCPointerNotNull(logical_widths));
    }

    /**
     * Given a `PangoGlyphItem` and the corresponding text, determine the
     * <br>width corresponding to each character.
     * <br>
     * <br>When multiple characters compose a single cluster, the width of the
     * <br>entire cluster is divided equally among the characters.
     * <br>
     * <br>See also [method&#64;Pango.GlyphString.get_logical_widths].
     * @param text text that &#64;glyph_item corresponds to   (glyph_item-&gt;item-&gt;offset is an offset from the   start of &#64;text)
     * @param logical_widths an array whose length is the number of   characters in glyph_item (equal to glyph_item-&gt;item-&gt;num_chars)   to be filled in with the resulting character widths.
    */
    public void getLogicalWidths(String text, @Nonnull ch.bailu.gtk.type.Int logical_widths)  {
        JnaGlyphItem.INST().pango_glyph_item_get_logical_widths(asCPointer(), text, asCPointerNotNull(logical_widths));
    }

    /**
     * Modifies &#64;orig to cover only the text after &#64;split_index, and
     * <br>returns a new item that covers the text before &#64;split_index that
     * <br>used to be in &#64;orig.
     * <br>
     * <br>You can think of &#64;split_index as the length of the returned item.
     * <br>&#64;split_index may not be 0, and it may not be greater than or equal
     * <br>to the length of &#64;orig (that is, there must be at least one byte
     * <br>assigned to each item, you can't create a zero-length item).
     * <br>
     * <br>This function is similar in function to pango_item_split() (and uses
     * <br>it internally.)
     * @param text text to which positions in &#64;orig apply
     * @param split_index byte index of position to split item, relative to the   start of the item
     * @return the newly allocated item   representing text before &#64;split_index, which should be freed   with pango_glyph_item_free().
    */
    public GlyphItem split(@Nonnull ch.bailu.gtk.type.Str text, int split_index)  {
        return new GlyphItem(new PointerContainer(JnaGlyphItem.INST().pango_glyph_item_split(asCPointer(), asCPointerNotNull(text), split_index)));
    }

    /**
     * Modifies &#64;orig to cover only the text after &#64;split_index, and
     * <br>returns a new item that covers the text before &#64;split_index that
     * <br>used to be in &#64;orig.
     * <br>
     * <br>You can think of &#64;split_index as the length of the returned item.
     * <br>&#64;split_index may not be 0, and it may not be greater than or equal
     * <br>to the length of &#64;orig (that is, there must be at least one byte
     * <br>assigned to each item, you can't create a zero-length item).
     * <br>
     * <br>This function is similar in function to pango_item_split() (and uses
     * <br>it internally.)
     * @param text text to which positions in &#64;orig apply
     * @param split_index byte index of position to split item, relative to the   start of the item
     * @return the newly allocated item   representing text before &#64;split_index, which should be freed   with pango_glyph_item_free().
    */
    public GlyphItem split(String text, int split_index)  {
        return new GlyphItem(new PointerContainer(JnaGlyphItem.INST().pango_glyph_item_split(asCPointer(), text, split_index)));
    }

    public static long getTypeID() { 
        return JnaGlyphItem.INST().pango_glyph_item_get_type(); 
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

[MethodModel:java-type-not-supported:letterSpace:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:PangoLogAttr*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
