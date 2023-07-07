/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A dots indicator for [class&#64;Carousel].
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;carousel-indicator-dots-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;carousel-indicator-dots.png&quot; alt=&quot;carousel-indicator-dots&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwCarouselIndicatorDots` widget shows a set of dots for each page of a
 * <br>given [class&#64;Carousel]. The dot representing the carousel's active page is
 * <br>larger and more opaque than the others, the transition to the active and
 * <br>inactive state is gradual to match the carousel's position.
 * <br>
 * <br>See also [class&#64;CarouselIndicatorLines].
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwCarouselIndicatorDots` has a single CSS node with name
 * <br>`carouselindicatordots`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CarouselIndicatorDots.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.CarouselIndicatorDots.html</a></p>
*/
public class CarouselIndicatorDots extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CarouselIndicatorDots.class.getCanonicalName());
    }

    public CarouselIndicatorDots(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwCarouselIndicatorDots`.
    */
    public CarouselIndicatorDots() {
        super(cast(JnaCarouselIndicatorDots.INST().adw_carousel_indicator_dots_new()));
    }

    /**
     * Gets the displayed carousel.
     * @return the displayed carousel
    */
    public Carousel getCarousel()  {
        return new Carousel(new PointerContainer(JnaCarouselIndicatorDots.INST().adw_carousel_indicator_dots_get_carousel(asCPointer())));
    }

    /**
     * Sets the displayed carousel.
     * @param carousel a carousel
    */
    public void setCarousel(@Nullable Carousel carousel)  {
        JnaCarouselIndicatorDots.INST().adw_carousel_indicator_dots_set_carousel(asCPointer(), asCPointer(carousel));
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
        return JnaCarouselIndicatorDots.INST().adw_carousel_indicator_dots_get_type(); 
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
