/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface RenderNodeType {

    /**
     * Error type. No node will ever have this type.
    */
    int NOT_A_RENDER_NODE = 0;

    /**
     * A node containing a stack of children
    */
    int CONTAINER_NODE = 1;

    /**
     * A node drawing a `cairo_surface_t`
    */
    int CAIRO_NODE = 2;

    /**
     * A node drawing a single color rectangle
    */
    int COLOR_NODE = 3;

    /**
     * A node drawing a linear gradient
    */
    int LINEAR_GRADIENT_NODE = 4;

    /**
     * A node drawing a repeating linear gradient
    */
    int REPEATING_LINEAR_GRADIENT_NODE = 5;

    /**
     * A node drawing a radial gradient
    */
    int RADIAL_GRADIENT_NODE = 6;

    /**
     * A node drawing a repeating radial gradient
    */
    int REPEATING_RADIAL_GRADIENT_NODE = 7;

    /**
     * A node drawing a conic gradient
    */
    int CONIC_GRADIENT_NODE = 8;

    /**
     * A node stroking a border around an area
    */
    int BORDER_NODE = 9;

    /**
     * A node drawing a `GdkTexture`
    */
    int TEXTURE_NODE = 10;

    /**
     * A node drawing an inset shadow
    */
    int INSET_SHADOW_NODE = 11;

    /**
     * A node drawing an outset shadow
    */
    int OUTSET_SHADOW_NODE = 12;

    /**
     * A node that renders its child after applying a matrix transform
    */
    int TRANSFORM_NODE = 13;

    /**
     * A node that changes the opacity of its child
    */
    int OPACITY_NODE = 14;

    /**
     * A node that applies a color matrix to every pixel
    */
    int COLOR_MATRIX_NODE = 15;

    /**
     * A node that repeats the child's contents
    */
    int REPEAT_NODE = 16;

    /**
     * A node that clips its child to a rectangular area
    */
    int CLIP_NODE = 17;

    /**
     * A node that clips its child to a rounded rectangle
    */
    int ROUNDED_CLIP_NODE = 18;

    /**
     * A node that draws a shadow below its child
    */
    int SHADOW_NODE = 19;

    /**
     * A node that blends two children together
    */
    int BLEND_NODE = 20;

    /**
     * A node that cross-fades between two children
    */
    int CROSS_FADE_NODE = 21;

    /**
     * A node containing a glyph string
    */
    int TEXT_NODE = 22;

    /**
     * A node that applies a blur
    */
    int BLUR_NODE = 23;

    /**
     * Debug information that does not affect the rendering
    */
    int DEBUG_NODE = 24;

    /**
     * A node that uses OpenGL fragment shaders to render
    */
    int GL_SHADER_NODE = 25;

}

/*
enumeration-type
*/
