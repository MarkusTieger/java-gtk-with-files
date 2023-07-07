/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Class structure for `PangoRenderer`.
 * <br>
 * <br>The following vfuncs take user space coordinates in Pango units
 * <br>and have default implementations:
 * <br>- draw_glyphs
 * <br>- draw_rectangle
 * <br>- draw_error_underline
 * <br>- draw_shape
 * <br>- draw_glyph_item
 * <br>
 * <br>The default draw_shape implementation draws nothing.
 * <br>
 * <br>The following vfuncs take device space coordinates as doubles
 * <br>and must be implemented:
 * <br>- draw_trapezoid
 * <br>- draw_glyph
 * <p><a href="https://docs.gtk.org/Pango/struct.RendererClass.html">https://docs.gtk.org/Pango/struct.RendererClass.html</a></p>
*/
public class RendererClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RendererClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDrawGlyphs {
        /**
         * 
         * @param renderer a `PangoRenderer`
         * @param font a `PangoFont`
         * @param glyphs a `PangoGlyphString`
         * @param x X position of left edge of baseline, in user space coordinates   in Pango units.
         * @param y Y position of left edge of baseline, in user space coordinates   in Pango units.
        */
        void onDrawGlyphs(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Renderer renderer, @Nonnull Font font, @Nonnull GlyphString glyphs, int x, int y);
    }
    
    private static JnaRendererClass.OnDrawGlyphs toOnDrawGlyphs(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawGlyphs in) {
        JnaRendererClass.OnDrawGlyphs out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _font, _glyphs, _x, _y) -> in.onDrawGlyphs(__callback, new Renderer(new PointerContainer(_renderer)), new Font(new PointerContainer(_font)), new GlyphString(new PointerContainer(_glyphs)), _x, _y);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDrawRectangle {
        /**
         * 
         * @param renderer a `PangoRenderer`
         * @param part type of object this rectangle is part of
         * @param x X position at which to draw rectangle, in user space coordinates   in Pango units
         * @param y Y position at which to draw rectangle, in user space coordinates   in Pango units
         * @param width width of rectangle in Pango units
         * @param height height of rectangle in Pango units
        */
        void onDrawRectangle(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Renderer renderer, int part, int x, int y, int width, int height);
    }
    
    private static JnaRendererClass.OnDrawRectangle toOnDrawRectangle(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawRectangle in) {
        JnaRendererClass.OnDrawRectangle out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _part, _x, _y, _width, _height) -> in.onDrawRectangle(__callback, new Renderer(new PointerContainer(_renderer)), _part, _x, _y, _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDrawErrorUnderline {
        /**
         * 
         * @param renderer a `PangoRenderer`
         * @param x X coordinate of underline, in Pango units in user coordinate system
         * @param y Y coordinate of underline, in Pango units in user coordinate system
         * @param width width of underline, in Pango units in user coordinate system
         * @param height height of underline, in Pango units in user coordinate system
        */
        void onDrawErrorUnderline(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Renderer renderer, int x, int y, int width, int height);
    }
    
    private static JnaRendererClass.OnDrawErrorUnderline toOnDrawErrorUnderline(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawErrorUnderline in) {
        JnaRendererClass.OnDrawErrorUnderline out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _x, _y, _width, _height) -> in.onDrawErrorUnderline(__callback, new Renderer(new PointerContainer(_renderer)), _x, _y, _width, _height);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDrawShape {
        /**
         * 
         * @param renderer 
         * @param attr 
         * @param x 
         * @param y 
        */
        void onDrawShape(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Renderer renderer, @Nonnull AttrShape attr, int x, int y);
    }
    
    private static JnaRendererClass.OnDrawShape toOnDrawShape(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawShape in) {
        JnaRendererClass.OnDrawShape out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _attr, _x, _y) -> in.onDrawShape(__callback, new Renderer(new PointerContainer(_renderer)), new AttrShape(new PointerContainer(_attr)), _x, _y);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDrawTrapezoid {
        /**
         * 
         * @param renderer a `PangoRenderer`
         * @param part type of object this trapezoid is part of
         * @param y1_ Y coordinate of top of trapezoid
         * @param x11 X coordinate of left end of top of trapezoid
         * @param x21 X coordinate of right end of top of trapezoid
         * @param y2 Y coordinate of bottom of trapezoid
         * @param x12 X coordinate of left end of bottom of trapezoid
         * @param x22 X coordinate of right end of bottom of trapezoid
        */
        void onDrawTrapezoid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Renderer renderer, int part, double y1_, double x11, double x21, double y2, double x12, double x22);
    }
    
    private static JnaRendererClass.OnDrawTrapezoid toOnDrawTrapezoid(ch.bailu.gtk.type.Pointer instance, String methodName, OnDrawTrapezoid in) {
        JnaRendererClass.OnDrawTrapezoid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_renderer, _part, _y1_, _x11, _x21, _y2, _x12, _x22) -> in.onDrawTrapezoid(__callback, new Renderer(new PointerContainer(_renderer)), _part, _y1_, _x11, _x21, _y2, _x12, _x22);
            __callback.register(out);
        }
        return out;
    }

    public RendererClass(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRendererClass.Fields _fields;
    
    JnaRendererClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRendererClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnDrawGlyphs#onDrawGlyphs}
    */
    public static final String DRAW_GLYPHS = "draw_glyphs";

    /**
     * 
     * <br>See {@link OnDrawGlyphs#onDrawGlyphs}
    */
    public void setFieldDrawGlyphs(OnDrawGlyphs draw_glyphs) {
        toFields().draw_glyphs = toOnDrawGlyphs(this, DRAW_GLYPHS, draw_glyphs);
        toFields().writeField(DRAW_GLYPHS);
    }

    /**
     * 
     * <br>See {@link OnDrawGlyphs#onDrawGlyphs}
    */
    public JnaRendererClass.OnDrawGlyphs getFieldDrawGlyphs() {
       toFields().readField(DRAW_GLYPHS);
       return toFields().draw_glyphs;
    } 

    /**
     * 
     * <br>See {@link OnDrawRectangle#onDrawRectangle}
    */
    public static final String DRAW_RECTANGLE = "draw_rectangle";

    /**
     * 
     * <br>See {@link OnDrawRectangle#onDrawRectangle}
    */
    public void setFieldDrawRectangle(OnDrawRectangle draw_rectangle) {
        toFields().draw_rectangle = toOnDrawRectangle(this, DRAW_RECTANGLE, draw_rectangle);
        toFields().writeField(DRAW_RECTANGLE);
    }

    /**
     * 
     * <br>See {@link OnDrawRectangle#onDrawRectangle}
    */
    public JnaRendererClass.OnDrawRectangle getFieldDrawRectangle() {
       toFields().readField(DRAW_RECTANGLE);
       return toFields().draw_rectangle;
    } 

    /**
     * 
     * <br>See {@link OnDrawErrorUnderline#onDrawErrorUnderline}
    */
    public static final String DRAW_ERROR_UNDERLINE = "draw_error_underline";

    /**
     * 
     * <br>See {@link OnDrawErrorUnderline#onDrawErrorUnderline}
    */
    public void setFieldDrawErrorUnderline(OnDrawErrorUnderline draw_error_underline) {
        toFields().draw_error_underline = toOnDrawErrorUnderline(this, DRAW_ERROR_UNDERLINE, draw_error_underline);
        toFields().writeField(DRAW_ERROR_UNDERLINE);
    }

    /**
     * 
     * <br>See {@link OnDrawErrorUnderline#onDrawErrorUnderline}
    */
    public JnaRendererClass.OnDrawErrorUnderline getFieldDrawErrorUnderline() {
       toFields().readField(DRAW_ERROR_UNDERLINE);
       return toFields().draw_error_underline;
    } 

    /**
     * 
     * <br>See {@link OnDrawShape#onDrawShape}
    */
    public static final String DRAW_SHAPE = "draw_shape";

    /**
     * 
     * <br>See {@link OnDrawShape#onDrawShape}
    */
    public void setFieldDrawShape(OnDrawShape draw_shape) {
        toFields().draw_shape = toOnDrawShape(this, DRAW_SHAPE, draw_shape);
        toFields().writeField(DRAW_SHAPE);
    }

    /**
     * 
     * <br>See {@link OnDrawShape#onDrawShape}
    */
    public JnaRendererClass.OnDrawShape getFieldDrawShape() {
       toFields().readField(DRAW_SHAPE);
       return toFields().draw_shape;
    } 

    /**
     * 
     * <br>See {@link OnDrawTrapezoid#onDrawTrapezoid}
    */
    public static final String DRAW_TRAPEZOID = "draw_trapezoid";

    /**
     * 
     * <br>See {@link OnDrawTrapezoid#onDrawTrapezoid}
    */
    public void setFieldDrawTrapezoid(OnDrawTrapezoid draw_trapezoid) {
        toFields().draw_trapezoid = toOnDrawTrapezoid(this, DRAW_TRAPEZOID, draw_trapezoid);
        toFields().writeField(DRAW_TRAPEZOID);
    }

    /**
     * 
     * <br>See {@link OnDrawTrapezoid#onDrawTrapezoid}
    */
    public JnaRendererClass.OnDrawTrapezoid getFieldDrawTrapezoid() {
       toFields().readField(DRAW_TRAPEZOID);
       return toFields().draw_trapezoid;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Renderer.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(Renderer.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:draw_glyph:java-type-not-supported:{G_::{c:void*}}:{j:}]

[FieldModel:part_changed:previous-field-unsupported:[MethodModel:Supported:partChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:PangoRenderPart}}:{j:int}]]

[MethodModel:Supported:partChanged:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:PangoRenderPart}}:{j:int}]

[FieldModel:begin:previous-field-unsupported:[MethodModel:Supported:begin:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]]

[MethodModel:Supported:begin:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]

[FieldModel:end:previous-field-unsupported:[MethodModel:Supported:end:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]]

[MethodModel:Supported:end:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]

[FieldModel:prepare_run:previous-field-unsupported:[MethodModel:Supported:prepareRun:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gg:GlyphItem:{c:PangoLayoutRun*}}:{j:long}]]

[MethodModel:Supported:prepareRun:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gg:GlyphItem:{c:PangoLayoutRun*}}:{j:long}]

[FieldModel:draw_glyph_item:previous-field-unsupported:[MethodModel:Supported:drawGlyphItem:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:GlyphItem:{c:PangoGlyphItem*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]]

[MethodModel:Supported:drawGlyphItem:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Renderer:{c:PangoRenderer*}}:{j:long}]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
        [ParameterModel:Supported:{Gg:GlyphItem:{c:PangoGlyphItem*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]

[FieldModel:_pango_reserved2:previous-field-unsupported:[MethodModel:Supported:pangoReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved2:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_pango_reserved3:previous-field-unsupported:[MethodModel:Supported:pangoReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved3:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[FieldModel:_pango_reserved4:previous-field-unsupported:[MethodModel:Supported:pangoReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]

[MethodModel:Supported:pangoReserved4:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
