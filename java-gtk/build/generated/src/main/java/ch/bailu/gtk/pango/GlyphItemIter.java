/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoGlyphItemIter` is an iterator over the clusters in a
 * <br>`PangoGlyphItem`.
 * <br>
 * <br>The *forward direction* of the iterator is the logical direction of text.
 * <br>That is, with increasing &#64;start_index and &#64;start_char values. If &#64;glyph_item
 * <br>is right-to-left (that is, if `glyph_item-&gt;item-&gt;analysis.level` is odd),
 * <br>then &#64;start_glyph decreases as the iterator moves forward.  Moreover,
 * <br>in right-to-left cases, &#64;start_glyph is greater than &#64;end_glyph.
 * <br>
 * <br>An iterator should be initialized using either
 * <br>pango_glyph_item_iter_init_start() or
 * <br>pango_glyph_item_iter_init_end(), for forward and backward iteration
 * <br>respectively, and walked over using any desired mixture of
 * <br>pango_glyph_item_iter_next_cluster() and
 * <br>pango_glyph_item_iter_prev_cluster().
 * <br>
 * <br>A common idiom for doing a forward iteration over the clusters is:
 * <br>
 * <br>```
 * <br>PangoGlyphItemIter cluster_iter;
 * <br>gboolean have_cluster;
 * <br>
 * <br>for (have_cluster = pango_glyph_item_iter_init_start (&amp;cluster_iter,
 * <br>                                                      glyph_item, text);
 * <br>     have_cluster;
 * <br>     have_cluster = pango_glyph_item_iter_next_cluster (&amp;cluster_iter))
 * <br>{
 * <br>  ...
 * <br>}
 * <br>```
 * <br>
 * <br>Note that &#64;text is the start of the text for layout, which is then
 * <br>indexed by `glyph_item-&gt;item-&gt;offset` to get to the text of &#64;glyph_item.
 * <br>The &#64;start_index and &#64;end_index values can directly index into &#64;text. The
 * <br>&#64;start_glyph, &#64;end_glyph, &#64;start_char, and &#64;end_char values however are
 * <br>zero-based for the &#64;glyph_item.  For each cluster, the item pointed at by
 * <br>the start variables is included in the cluster while the one pointed at by
 * <br>end variables is not.
 * <br>
 * <br>None of the members of a `PangoGlyphItemIter` should be modified manually.
 * <p><a href="https://docs.gtk.org/Pango/struct.GlyphItemIter.html">https://docs.gtk.org/Pango/struct.GlyphItemIter.html</a></p>
*/
public class GlyphItemIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GlyphItemIter.class.getCanonicalName());
    }

    public GlyphItemIter(PointerContainer pointer) {
        super(pointer);
    }

    public GlyphItemIter() {
        super(cast(JnaGlyphItemIter.allocateStructure()));
    }

    private JnaGlyphItemIter.Fields _fields;
    
    JnaGlyphItemIter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaGlyphItemIter.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String GLYPH_ITEM = "glyph_item";

    /**
     * 
    */
    public void setFieldGlyphItem(GlyphItem glyph_item) {
        toFields().glyph_item = glyph_item.asCPointer();
        toFields().writeField(GLYPH_ITEM);
    }

    /**
     * 
    */
    public GlyphItem getFieldGlyphItem() {
       toFields().readField(GLYPH_ITEM);
       return new GlyphItem(new PointerContainer(toFields().glyph_item));
    } 

    /**
     * 
    */
    public static final String TEXT = "text";

    /**
     * 
    */
    public void setFieldText(ch.bailu.gtk.type.Str text) {
        toFields().text = text.asCPointer();
        toFields().writeField(TEXT);
    }

    /**
     * 
    */
    public ch.bailu.gtk.type.Str getFieldText() {
       toFields().readField(TEXT);
       return new ch.bailu.gtk.type.Str(new PointerContainer(toFields().text));
    } 

    /**
     * 
    */
    public static final String START_GLYPH = "start_glyph";

    /**
     * 
    */
    public void setFieldStartGlyph(int start_glyph) {
        toFields().start_glyph = start_glyph;
        toFields().writeField(START_GLYPH);
    }

    /**
     * 
    */
    public int getFieldStartGlyph() {
       toFields().readField(START_GLYPH);
       return toFields().start_glyph;
    } 

    /**
     * 
    */
    public static final String START_INDEX = "start_index";

    /**
     * 
    */
    public void setFieldStartIndex(int start_index) {
        toFields().start_index = start_index;
        toFields().writeField(START_INDEX);
    }

    /**
     * 
    */
    public int getFieldStartIndex() {
       toFields().readField(START_INDEX);
       return toFields().start_index;
    } 

    /**
     * 
    */
    public static final String START_CHAR = "start_char";

    /**
     * 
    */
    public void setFieldStartChar(int start_char) {
        toFields().start_char = start_char;
        toFields().writeField(START_CHAR);
    }

    /**
     * 
    */
    public int getFieldStartChar() {
       toFields().readField(START_CHAR);
       return toFields().start_char;
    } 

    /**
     * 
    */
    public static final String END_GLYPH = "end_glyph";

    /**
     * 
    */
    public void setFieldEndGlyph(int end_glyph) {
        toFields().end_glyph = end_glyph;
        toFields().writeField(END_GLYPH);
    }

    /**
     * 
    */
    public int getFieldEndGlyph() {
       toFields().readField(END_GLYPH);
       return toFields().end_glyph;
    } 

    /**
     * 
    */
    public static final String END_INDEX = "end_index";

    /**
     * 
    */
    public void setFieldEndIndex(int end_index) {
        toFields().end_index = end_index;
        toFields().writeField(END_INDEX);
    }

    /**
     * 
    */
    public int getFieldEndIndex() {
       toFields().readField(END_INDEX);
       return toFields().end_index;
    } 

    /**
     * 
    */
    public static final String END_CHAR = "end_char";

    /**
     * 
    */
    public void setFieldEndChar(int end_char) {
        toFields().end_char = end_char;
        toFields().writeField(END_CHAR);
    }

    /**
     * 
    */
    public int getFieldEndChar() {
       toFields().readField(END_CHAR);
       return toFields().end_char;
    } 

    /**
     * Make a shallow copy of an existing `PangoGlyphItemIter` structure.
     * @return the newly allocated `PangoGlyphItemIter`
    */
    public GlyphItemIter copy()  {
        return new GlyphItemIter(new PointerContainer(JnaGlyphItemIter.INST().pango_glyph_item_iter_copy(asCPointer())));
    }

    /**
     * Frees a `PangoGlyphItem`Iter.
    */
    public void free()  {
        JnaGlyphItemIter.INST().pango_glyph_item_iter_free(asCPointer());
    }

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * <br>last cluster in a glyph item.
     * <br>
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @param glyph_item the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return %FALSE if there are no clusters in the glyph item
    */
    public boolean initEnd(@Nonnull GlyphItem glyph_item, @Nonnull ch.bailu.gtk.type.Str text)  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_init_end(asCPointer(), asCPointerNotNull(glyph_item), asCPointerNotNull(text));
    }

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * <br>last cluster in a glyph item.
     * <br>
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @param glyph_item the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return %FALSE if there are no clusters in the glyph item
    */
    public boolean initEnd(@Nonnull GlyphItem glyph_item, String text)  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_init_end(asCPointer(), asCPointerNotNull(glyph_item), text);
    }

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * <br>first cluster in a glyph item.
     * <br>
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @param glyph_item the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return %FALSE if there are no clusters in the glyph item
    */
    public boolean initStart(@Nonnull GlyphItem glyph_item, @Nonnull ch.bailu.gtk.type.Str text)  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_init_start(asCPointer(), asCPointerNotNull(glyph_item), asCPointerNotNull(text));
    }

    /**
     * Initializes a `PangoGlyphItemIter` structure to point to the
     * <br>first cluster in a glyph item.
     * <br>
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @param glyph_item the glyph item to iterate over
     * @param text text corresponding to the glyph item
     * @return %FALSE if there are no clusters in the glyph item
    */
    public boolean initStart(@Nonnull GlyphItem glyph_item, String text)  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_init_start(asCPointer(), asCPointerNotNull(glyph_item), text);
    }

    /**
     * Advances the iterator to the next cluster in the glyph item.
     * <br>
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @return %TRUE if the iterator was advanced,   %FALSE if we were already on the  last cluster.
    */
    public boolean nextCluster()  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_next_cluster(asCPointer());
    }

    /**
     * Moves the iterator to the preceding cluster in the glyph item.
     * <br>See `PangoGlyphItemIter` for details of cluster orders.
     * @return %TRUE if the iterator was moved,   %FALSE if we were already on the first cluster.
    */
    public boolean prevCluster()  {
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_prev_cluster(asCPointer());
    }

    public static long getTypeID() { 
        return JnaGlyphItemIter.INST().pango_glyph_item_iter_get_type(); 
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
