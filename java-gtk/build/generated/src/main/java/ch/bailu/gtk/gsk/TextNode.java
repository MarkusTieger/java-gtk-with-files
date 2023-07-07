/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A render node drawing a set of glyphs.
 * <p><a href="https://docs.gtk.org/gsk4/class.TextNode.html">https://docs.gtk.org/gsk4/class.TextNode.html</a></p>
*/
public class TextNode extends RenderNode {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TextNode.class.getCanonicalName());
    }

    public TextNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a render node that renders the given glyphs.
     * <br>
     * <br>Note that &#64;color may not be used if the font contains
     * <br>color glyphs.
     * @param font the `PangoFont` containing the glyphs
     * @param glyphs the `PangoGlyphString` to render
     * @param color the foreground color to render with
     * @param offset offset of the baseline
    */
    public TextNode(@Nonnull ch.bailu.gtk.pango.Font font, @Nonnull ch.bailu.gtk.pango.GlyphString glyphs, @Nonnull ch.bailu.gtk.gdk.RGBA color, @Nonnull ch.bailu.gtk.graphene.Point offset) {
        super(cast(JnaTextNode.INST().gsk_text_node_new(asCPointerNotNull(font), asCPointerNotNull(glyphs), asCPointerNotNull(color), asCPointerNotNull(offset))));
    }

    /**
     * Retrieves the color used by the text &#64;node.
     * @return the text color
    */
    public ch.bailu.gtk.gdk.RGBA getColor()  {
        return new ch.bailu.gtk.gdk.RGBA(new PointerContainer(JnaTextNode.INST().gsk_text_node_get_color(asCPointer())));
    }

    /**
     * Returns the font used by the text &#64;node.
     * @return the font
    */
    public ch.bailu.gtk.pango.Font getFont()  {
        return new ch.bailu.gtk.pango.Font(new PointerContainer(JnaTextNode.INST().gsk_text_node_get_font(asCPointer())));
    }

    /**
     * Retrieves the number of glyphs in the text node.
     * @return the number of glyphs
    */
    public int getNumGlyphs()  {
        return JnaTextNode.INST().gsk_text_node_get_num_glyphs(asCPointer());
    }

    /**
     * Retrieves the offset applied to the text.
     * @return a point with the horizontal and vertical offsets
    */
    public ch.bailu.gtk.graphene.Point getOffset()  {
        return new ch.bailu.gtk.graphene.Point(new PointerContainer(JnaTextNode.INST().gsk_text_node_get_offset(asCPointer())));
    }

    /**
     * Checks whether the text &#64;node has color glyphs.
     * @return %TRUE if the text node has color glyphs
    */
    public boolean hasColorGlyphs()  {
        return JnaTextNode.INST().gsk_text_node_has_color_glyphs(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTextNode.INST().gsk_text_node_get_type(); 
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
class-type

[MethodModel:cb-return-value-not-supported:java-type-not-supported:getGlyphs:[ParameterModel:java-type-not-supported:{G_::{c:const PangoGlyphInfo*}}:{j:}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
