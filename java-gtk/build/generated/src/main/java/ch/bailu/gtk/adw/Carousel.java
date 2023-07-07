/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A paginated scrolling widget.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;carousel-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;carousel.png&quot; alt=&quot;carousel&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwCarousel` widget can be used to display a set of pages with
 * <br>swipe-based navigation between them.
 * <br>
 * <br>[class&#64;CarouselIndicatorDots] and [class&#64;CarouselIndicatorLines] can be used
 * <br>to provide page indicators for `AdwCarousel`.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwCarousel` has a single CSS node with name `carousel`.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Carousel.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Carousel.html</a></p>
*/
public class Carousel extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Carousel.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPageChanged {
        /**
         * This signal is emitted after a page has been changed.
         * <br>
         * <br>It can be used to implement &quot;infinite scrolling&quot; by amending the pages
         * <br>after every scroll.
         * @param index current page
        */
        void onPageChanged(int index);
    }
    
    private static com.sun.jna.Callback toOnPageChanged(OnPageChanged in) {
        return (in == null) ? null: (JnaCarousel.OnPageChanged) (__self, _index, __data) -> in.onPageChanged(_index);
    }

    public Carousel(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwCarousel`.
    */
    public Carousel() {
        super(cast(JnaCarousel.INST().adw_carousel_new()));
    }

    /**
     * Appends &#64;child to &#64;self.
     * @param child a widget to add
    */
    public void append(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaCarousel.INST().adw_carousel_append(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Gets whether to allow swiping for more than one page at a time.
     * @return `TRUE` if long swipes are allowed
    */
    public boolean getAllowLongSwipes()  {
        return JnaCarousel.INST().adw_carousel_get_allow_long_swipes(asCPointer());
    }

    /**
     * Sets whether &#64;self can be dragged with mouse pointer.
     * @return whether &#64;self can be dragged with mouse pointer
    */
    public boolean getAllowMouseDrag()  {
        return JnaCarousel.INST().adw_carousel_get_allow_mouse_drag(asCPointer());
    }

    /**
     * Gets whether &#64;self will respond to scroll wheel events.
     * @return `TRUE` if &#64;self will respond to scroll wheel events
    */
    public boolean getAllowScrollWheel()  {
        return JnaCarousel.INST().adw_carousel_get_allow_scroll_wheel(asCPointer());
    }

    /**
     * Gets whether &#64;self can be navigated.
     * @return whether &#64;self can be navigated
    */
    public boolean getInteractive()  {
        return JnaCarousel.INST().adw_carousel_get_interactive(asCPointer());
    }

    /**
     * Gets the number of pages in &#64;self.
     * @return the number of pages in &#64;self
    */
    public int getNPages()  {
        return JnaCarousel.INST().adw_carousel_get_n_pages(asCPointer());
    }

    /**
     * Gets the page at position &#64;n.
     * @param n index of the page
     * @return the page
    */
    public ch.bailu.gtk.gtk.Widget getNthPage(int n)  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaCarousel.INST().adw_carousel_get_nth_page(asCPointer(), n)));
    }

    /**
     * Gets current scroll position in &#64;self, unitless.
     * <br>
     * <br>1 matches 1 page. Use [method&#64;Carousel.scroll_to] for changing it.
     * @return the scroll position
    */
    public double getPosition()  {
        return JnaCarousel.INST().adw_carousel_get_position(asCPointer());
    }

    /**
     * Gets the page reveal duration, in milliseconds.
     * @return the duration
    */
    public int getRevealDuration()  {
        return JnaCarousel.INST().adw_carousel_get_reveal_duration(asCPointer());
    }

    /**
     * Gets the scroll animation spring parameters for &#64;self.
     * @return the animation parameters
    */
    public SpringParams getScrollParams()  {
        return new SpringParams(new PointerContainer(JnaCarousel.INST().adw_carousel_get_scroll_params(asCPointer())));
    }

    /**
     * Gets spacing between pages in pixels.
     * @return spacing between pages
    */
    public int getSpacing()  {
        return JnaCarousel.INST().adw_carousel_get_spacing(asCPointer());
    }

    /**
     * Inserts &#64;child into &#64;self at position &#64;position.
     * <br>
     * <br>If position is -1, or larger than the number of pages,
     * <br>&#64;child will be appended to the end.
     * @param child a widget to add
     * @param position the position to insert &#64;child at
    */
    public void insert(@Nonnull ch.bailu.gtk.gtk.Widget child, int position)  {
        JnaCarousel.INST().adw_carousel_insert(asCPointer(), asCPointerNotNull(child), position);
    }

    /**
     * Prepends &#64;child to &#64;self.
     * @param child a widget to add
    */
    public void prepend(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaCarousel.INST().adw_carousel_prepend(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Removes &#64;child from &#64;self.
     * @param child a widget to remove
    */
    public void remove(@Nonnull ch.bailu.gtk.gtk.Widget child)  {
        JnaCarousel.INST().adw_carousel_remove(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Moves &#64;child into position &#64;position.
     * <br>
     * <br>If position is -1, or larger than the number of pages, &#64;child will be moved
     * <br>at the end.
     * @param child a widget to add
     * @param position the position to move &#64;child to
    */
    public void reorder(@Nonnull ch.bailu.gtk.gtk.Widget child, int position)  {
        JnaCarousel.INST().adw_carousel_reorder(asCPointer(), asCPointerNotNull(child), position);
    }

    /**
     * Scrolls to &#64;widget.
     * <br>
     * <br>If &#64;animate is `TRUE`, the transition will be animated.
     * @param widget a child of &#64;self
     * @param animate whether to animate the transition
    */
    public void scrollTo(@Nonnull ch.bailu.gtk.gtk.Widget widget, boolean animate)  {
        JnaCarousel.INST().adw_carousel_scroll_to(asCPointer(), asCPointerNotNull(widget), animate);
    }

    /**
     * Sets whether to allow swiping for more than one page at a time.
     * <br>
     * <br>If &#64;allow_long_swipes is `FALSE`, each swipe can only move to the adjacent
     * <br>pages.
     * @param allow_long_swipes whether to allow long swipes
    */
    public void setAllowLongSwipes(boolean allow_long_swipes)  {
        JnaCarousel.INST().adw_carousel_set_allow_long_swipes(asCPointer(), allow_long_swipes);
    }

    /**
     * Sets whether &#64;self can be dragged with mouse pointer.
     * <br>
     * <br>If &#64;allow_mouse_drag is `FALSE`, dragging is only available on touch.
     * @param allow_mouse_drag whether &#64;self can be dragged with mouse pointer
    */
    public void setAllowMouseDrag(boolean allow_mouse_drag)  {
        JnaCarousel.INST().adw_carousel_set_allow_mouse_drag(asCPointer(), allow_mouse_drag);
    }

    /**
     * Sets whether &#64;self will respond to scroll wheel events.
     * <br>
     * <br>If &#64;allow_scroll_wheel is `FALSE`, wheel events will be ignored.
     * @param allow_scroll_wheel whether &#64;self will respond to scroll wheel events
    */
    public void setAllowScrollWheel(boolean allow_scroll_wheel)  {
        JnaCarousel.INST().adw_carousel_set_allow_scroll_wheel(asCPointer(), allow_scroll_wheel);
    }

    /**
     * Sets whether &#64;self can be navigated.
     * <br>
     * <br>This can be used to temporarily disable the carousel to only allow navigating
     * <br>it in a certain state.
     * @param interactive whether &#64;self can be navigated
    */
    public void setInteractive(boolean interactive)  {
        JnaCarousel.INST().adw_carousel_set_interactive(asCPointer(), interactive);
    }

    /**
     * Sets the page reveal duration, in milliseconds.
     * <br>
     * <br>Reveal duration is used when animating adding or removing pages.
     * @param reveal_duration the new reveal duration value
    */
    public void setRevealDuration(int reveal_duration)  {
        JnaCarousel.INST().adw_carousel_set_reveal_duration(asCPointer(), reveal_duration);
    }

    /**
     * Sets the scroll animation spring parameters for &#64;self.
     * <br>
     * <br>The default value is equivalent to:
     * <br>
     * <br>```c
     * <br>adw_spring_params_new (1, 0.5, 500)
     * <br>```
     * @param params the new parameters
    */
    public void setScrollParams(@Nonnull SpringParams params)  {
        JnaCarousel.INST().adw_carousel_set_scroll_params(asCPointer(), asCPointerNotNull(params));
    }

    /**
     * Sets spacing between pages in pixels.
     * @param spacing the new spacing value
    */
    public void setSpacing(int spacing)  {
        JnaCarousel.INST().adw_carousel_set_spacing(asCPointer(), spacing);
    }

    public final static String SIGNAL_ON_PAGE_CHANGED = "page-changed";
    
    /**
     * Connect to signal "page-changed".
     * <br>See {@link OnPageChanged#onPageChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPageChanged(OnPageChanged signal) {
        return connectSignal(SIGNAL_ON_PAGE_CHANGED, toOnPageChanged(signal));
    }

    /**
     * Implements interface {@link Swipeable}. Call this to get access to interface functions.
     * @return {@link Swipeable}
    */
    public Swipeable asSwipeable() {
        return new Swipeable(cast());
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
        return JnaCarousel.INST().adw_carousel_get_type(); 
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
