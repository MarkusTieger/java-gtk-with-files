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
public class Cairo extends ch.bailu.gtk.type.Package {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Cairo.class.getCanonicalName());
    }

    /**
     * 
     * @param format 
     * @param width 
     * @param height 
     * @return 
    */
    public static Surface imageSurfaceCreate(int format, int width, int height)  {
        return new Surface(new PointerContainer(JnaCairo.INST().cairo_image_surface_create(format, width, height)));
    }

    /**
     * 
     * @param data 
     * @param format 
     * @param width 
     * @param height 
     * @param stride 
     * @return 
    */
    public static Surface imageSurfaceCreateForData(@Nonnull ch.bailu.gtk.type.Bytes data, int format, int width, int height, int stride)  {
        return new Surface(new PointerContainer(JnaCairo.INST().cairo_image_surface_create_for_data(asCPointerNotNull(data), format, width, height, stride)));
    }

    /**
     * 
     * @param format 
     * @param width 
     * @return 
    */
    public static int formatStrideForWidth(int format, int width)  {
        return JnaCairo.INST().cairo_format_stride_for_width(format, width);
    }

}

/*
package-type
*/
