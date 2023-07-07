/* this file is machine generated */
package ch.bailu.gtk.cairo;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://www.cairographics.org/manual/">https://www.cairographics.org/manual/</a></p>
*/
public class Context extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Context.class.getCanonicalName());
    }

    public Context(PointerContainer pointer) {
        super(pointer);
    }

    public void save()  {
        JnaContext.INST().cairo_save(asCPointer());
    }

    public void restore()  {
        JnaContext.INST().cairo_restore(asCPointer());
    }

    /**
     * 
     * @param angle 
    */
    public void rotate(double angle)  {
        JnaContext.INST().cairo_rotate(asCPointer(), angle);
    }

    public void paint()  {
        JnaContext.INST().cairo_paint(asCPointer());
    }

    /**
     * 
     * @param alpha 
    */
    public void paintWithAlpha(double alpha)  {
        JnaContext.INST().cairo_paint(asCPointer(), alpha);
    }

    /**
     * 
     * @param surface 
     * @param x 
     * @param y 
    */
    public void setSourceSurface(@Nonnull Surface surface, double x, double y)  {
        JnaContext.INST().cairo_set_source_surface(asCPointer(), asCPointerNotNull(surface), x, y);
    }

    /**
     * 
     * @param source 
    */
    public void setSource(@Nonnull Pattern source)  {
        JnaContext.INST().cairo_set_source(asCPointer(), asCPointerNotNull(source));
    }

    public void closePath()  {
        JnaContext.INST().cairo_close_path(asCPointer());
    }

    /**
     * 
     * @param operator 
    */
    public void setOperator(int operator)  {
        JnaContext.INST().cairo_set_operator(asCPointer(), operator);
    }

    /**
     * 
     * @param width 
    */
    public void setLineWidth(double width)  {
        JnaContext.INST().cairo_set_line_width(asCPointer(), width);
    }

    /**
     * 
     * @param antialias 
    */
    public void setAntialias(int antialias)  {
        JnaContext.INST().cairo_set_antialias(asCPointer(), antialias);
    }

    /**
     * 
     * @param x 
     * @param y 
    */
    public void moveTo(double x, double y)  {
        JnaContext.INST().cairo_move_to(asCPointer(), x, y);
    }

    /**
     * 
     * @param utf8 
     * @param style 
     * @param weight 
    */
    public void selectFontFace(@Nonnull ch.bailu.gtk.type.Str utf8, int style, int weight)  {
        JnaContext.INST().cairo_select_font_face(asCPointer(), asCPointerNotNull(utf8), style, weight);
    }

    /**
     * 
     * @param utf8 
     * @param style 
     * @param weight 
    */
    public void selectFontFace(String utf8, int style, int weight)  {
        JnaContext.INST().cairo_select_font_face(asCPointer(), utf8, style, weight);
    }

    /**
     * 
     * @param size 
    */
    public void setFontSize(double size)  {
        JnaContext.INST().cairo_set_font_size(asCPointer(), size);
    }

    /**
     * 
     * @param x 
     * @param y 
    */
    public void lineTo(double x, double y)  {
        JnaContext.INST().cairo_line_to(asCPointer(), x, y);
    }

    /**
     * 
     * @param xc 
     * @param yc 
     * @param radius 
     * @param angle1 
     * @param angle2 
    */
    public void arc(double xc, double yc, double radius, double angle1, double angle2)  {
        JnaContext.INST().cairo_arc(asCPointer(), xc, yc, radius, angle1, angle2);
    }

    /**
     * 
     * @param fill_rule 
    */
    public void setFillRule(int fill_rule)  {
        JnaContext.INST().cairo_set_fill_rule(asCPointer(), fill_rule);
    }

    /**
     * 
     * @param x1 
     * @param y1 
     * @param x2 
     * @param y2 
     * @param x3 
     * @param y3 
    */
    public void curveTo(double x1, double y1, double x2, double y2, double x3, double y3)  {
        JnaContext.INST().cairo_curve_to(asCPointer(), x1, y1, x2, y2, x3, y3);
    }

    public void stroke()  {
        JnaContext.INST().cairo_stroke(asCPointer());
    }

    public void fill()  {
        JnaContext.INST().cairo_fill(asCPointer());
    }

    public void fillPreserve()  {
        JnaContext.INST().cairo_fill_preserve(asCPointer());
    }

    /**
     * 
     * @param x 
     * @param y 
     * @param width 
     * @param height 
    */
    public void rectangle(double x, double y, double width, double height)  {
        JnaContext.INST().cairo_rectangle(asCPointer(), x, y, width, height);
    }

    /**
     * 
     * @param dashes 
     * @param num_dashes 
     * @param offset 
    */
    public void setDash(@Nonnull ch.bailu.gtk.type.Dbl dashes, int num_dashes, double offset)  {
        JnaContext.INST().cairo_set_dash(asCPointer(), asCPointerNotNull(dashes), num_dashes, offset);
    }

    /**
     * 
     * @param line_cap 
    */
    public void setLineCap(int line_cap)  {
        JnaContext.INST().cairo_set_line_cap(asCPointer(), line_cap);
    }

    /**
     * 
     * @param line_join 
    */
    public void setLineJoin(int line_join)  {
        JnaContext.INST().cairo_set_line_join(asCPointer(), line_join);
    }

    /**
     * 
     * @param red 
     * @param green 
     * @param blue 
     * @param alpha 
    */
    public void setSourceRgba(double red, double green, double blue, double alpha)  {
        JnaContext.INST().cairo_set_source_rgba(asCPointer(), red, green, blue, alpha);
    }

    /**
     * 
     * @param red 
     * @param green 
     * @param blue 
    */
    public void setSourceRgb(double red, double green, double blue)  {
        JnaContext.INST().cairo_set_source_rgb(asCPointer(), red, green, blue);
    }

    public void destroy()  {
        JnaContext.INST().cairo_destroy(asCPointer());
    }

    public void resetClip()  {
        JnaContext.INST().cairo_reset_clip(asCPointer());
    }

    public void clip()  {
        JnaContext.INST().cairo_clip(asCPointer());
    }

    public void newPath()  {
        JnaContext.INST().cairo_new_path(asCPointer());
    }

    /**
     * 
     * @param matrix 
    */
    public void setMatrix(@Nonnull Matrix matrix)  {
        JnaContext.INST().cairo_set_matrix(asCPointer(), asCPointerNotNull(matrix));
    }

    /**
     * 
     * @param matrix 
    */
    public void transform(@Nonnull Matrix matrix)  {
        JnaContext.INST().cairo_transform(asCPointer(), asCPointerNotNull(matrix));
    }

    public void identityMatrix()  {
        JnaContext.INST().cairo_identity_matrix(asCPointer());
    }

    /**
     * 
     * @param utf8 
    */
    public void showText(@Nonnull ch.bailu.gtk.type.Str utf8)  {
        JnaContext.INST().cairo_show_text(asCPointer(), asCPointerNotNull(utf8));
    }

    /**
     * 
     * @param utf8 
    */
    public void showText(String utf8)  {
        JnaContext.INST().cairo_show_text(asCPointer(), utf8);
    }

    /**
     * 
     * @return 
    */
    public Pattern getSource()  {
        return new Pattern(new PointerContainer(JnaContext.INST().cairo_get_source(asCPointer())));
    }

    /**
     * 
     * @param x 
     * @param y 
    */
    public void getCurrentPoint(@Nonnull ch.bailu.gtk.type.Dbl x, @Nonnull ch.bailu.gtk.type.Dbl y)  {
        JnaContext.INST().cairo_get_current_point(asCPointer(), asCPointerNotNull(x), asCPointerNotNull(y));
    }

    /**
     * 
     * @param x 
     * @param y 
    */
    public void translate(double x, double y)  {
        JnaContext.INST().cairo_translate(asCPointer(), x, y);
    }

    /**
     * 
     * @param x 
     * @param y 
    */
    public void scale(double x, double y)  {
        JnaContext.INST().cairo_scale(asCPointer(), x, y);
    }

    public static long getTypeID() { 
        return JnaContext.INST().cairo_gobject_context_get_type(); 
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
