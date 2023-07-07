/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A lines indicator for [class&#64;Carousel].
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;carousel-indicator-dots-lines.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;carousel-indicator-lines.png&quot; alt=&quot;carousel-indicator-lines&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwCarouselIndicatorLines` widget shows a set of lines for each page of
 * <br>a given [class&#64;Carousel]. The carousel's active page is shown as another line
 * <br>that moves between them to match the carousel's position.
 * <br>
 * <br>See also [class&#64;CarouselIndicatorDots].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwCarouselIndicatorLines` has a single CSS node with name
 * <br>`carouselindicatorlines`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CarouselIndicatorLines.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CarouselIndicatorLines.html</a></p>
*/
public class CarouselIndicatorLines extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CarouselIndicatorLines.class.getCanonicalName());
    }

    public CarouselIndicatorLines(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwCarouselIndicatorLines`.
    */
    public CarouselIndicatorLines() {
        super(cast(JnaCarouselIndicatorLines.INST().adw_carousel_indicator_lines_new()));
    }

    /**
     * Gets the displayed carousel.
     * @return the displayed carousel
    */
    public Carousel getCarousel()  {
        return new Carousel(new PointerContainer(JnaCarouselIndicatorLines.INST().adw_carousel_indicator_lines_get_carousel(asCPointer())));
    }

    /**
     * Sets the displayed carousel.
     * @param carousel a carousel
    */
    public void setCarousel(@Nullable Carousel carousel)  {
        JnaCarouselIndicatorLines.INST().adw_carousel_indicator_lines_set_carousel(asCPointer(), asCPointer(carousel));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Orientable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Orientable}
    */
    public ch.bailu.gtk.gtk.Orientable asOrientable() {
        return new ch.bailu.gtk.gtk.Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaCarouselIndicatorLines.INST().adw_carousel_indicator_lines_get_type(); 
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
*/
