/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `PangoItem` structure stores information about a segment of text.
 * <br>
 * <br>You typically obtain `PangoItems` by itemizing a piece of text
 * <br>with [func&#64;itemize].
 * <p><a href="https://docs.gtk.org/Pango/struct.Item.html">https://docs.gtk.org/Pango/struct.Item.html</a></p>
*/
public class Item extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Item.class.getCanonicalName());
    }

    public Item(PointerContainer pointer) {
        super(pointer);
    }

    private JnaItem.Fields _fields;
    
    JnaItem.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaItem.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * byte offset of the start of this item in text.
    */
    public static final String OFFSET = "offset";

    /**
     * byte offset of the start of this item in text.
    */
    public void setFieldOffset(int offset) {
        toFields().offset = offset;
        toFields().writeField(OFFSET);
    }

    /**
     * byte offset of the start of this item in text.
    */
    public int getFieldOffset() {
       toFields().readField(OFFSET);
       return toFields().offset;
    } 

    /**
     * length of this item in bytes.
    */
    public static final String LENGTH = "length";

    /**
     * length of this item in bytes.
    */
    public void setFieldLength(int length) {
        toFields().length = length;
        toFields().writeField(LENGTH);
    }

    /**
     * length of this item in bytes.
    */
    public int getFieldLength() {
       toFields().readField(LENGTH);
       return toFields().length;
    } 

    /**
     * number of Unicode characters in the item.
    */
    public static final String NUM_CHARS = "num_chars";

    /**
     * number of Unicode characters in the item.
    */
    public void setFieldNumChars(int num_chars) {
        toFields().num_chars = num_chars;
        toFields().writeField(NUM_CHARS);
    }

    /**
     * number of Unicode characters in the item.
    */
    public int getFieldNumChars() {
       toFields().readField(NUM_CHARS);
       return toFields().num_chars;
    } 

    /**
     * Creates a new `PangoItem` structure initialized to default values.
    */
    public Item() {
        super(cast(JnaItem.INST().pango_item_new()));
    }

    /**
     * Add attributes to a `PangoItem`.
     * <br>
     * <br>The idea is that you have attributes that don't affect itemization,
     * <br>such as font features, so you filter them out using
     * <br>[method&#64;Pango.AttrList.filter], itemize your text, then reapply the
     * <br>attributes to the resulting items using this function.
     * <br>
     * <br>The &#64;iter should be positioned before the range of the item,
     * <br>and will be advanced past it. This function is meant to be called
     * <br>in a loop over the items resulting from itemization, while passing
     * <br>the iter to each call.
     * @param iter a `PangoAttrIterator`
    */
    public void applyAttrs(@Nonnull AttrIterator iter)  {
        JnaItem.INST().pango_item_apply_attrs(asCPointer(), asCPointerNotNull(iter));
    }

    /**
     * Copy an existing `PangoItem` structure.
     * @return the newly allocated `PangoItem`
    */
    public Item copy()  {
        return new Item(new PointerContainer(JnaItem.INST().pango_item_copy(asCPointer())));
    }

    /**
     * Free a `PangoItem` and all associated memory.
    */
    public void free()  {
        JnaItem.INST().pango_item_free(asCPointer());
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
     * <br>&#64;split_offset is the length of the first item in chars, and must be
     * <br>provided because the text used to generate the item isn't available,
     * <br>so `pango_item_split()` can't count the char length of the split items
     * <br>itself.
     * @param split_index byte index of position to split item, relative to the   start of the item
     * @param split_offset number of chars between start of &#64;orig and &#64;split_index
     * @return new item representing text before &#64;split_index, which   should be freed with [method&#64;Pango.Item.free].
    */
    public Item split(int split_index, int split_offset)  {
        return new Item(new PointerContainer(JnaItem.INST().pango_item_split(asCPointer(), split_index, split_offset)));
    }

    public static long getTypeID() { 
        return JnaItem.INST().pango_item_get_type(); 
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
some-fields-unsupported

[FieldModel:analysis:direct-type:{Gg:Analysis:{c:PangoAnalysis}}:{j:long}]
*/
