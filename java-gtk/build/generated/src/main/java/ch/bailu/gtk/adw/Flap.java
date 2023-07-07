/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An adaptive container acting like a box or an overlay.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;flap-wide-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;flap-wide.png&quot; alt=&quot;flap-wide&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;flap-narrow-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;flap-narrow.png&quot; alt=&quot;flap-narrow&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>The `AdwFlap` widget can display its children like a [class&#64;Gtk.Box] does or
 * <br>like a [class&#64;Gtk.Overlay] does, according to the
 * <br>[property&#64;Flap:fold-policy] value.
 * <br>
 * <br>`AdwFlap` has at most three children: [property&#64;Flap:content],
 * <br>[property&#64;Flap:flap] and [property&#64;Flap:separator]. Content is the primary
 * <br>child, flap is displayed next to it when unfolded, or overlays it when
 * <br>folded. Flap can be shown or hidden by changing the
 * <br>[property&#64;Flap:reveal-flap] value, as well as via swipe gestures if
 * <br>[property&#64;Flap:swipe-to-open] and/or [property&#64;Flap:swipe-to-close] are set
 * <br>to `TRUE`.
 * <br>
 * <br>Optionally, a separator can be provided, which would be displayed between
 * <br>the content and the flap when there's no shadow to separate them, depending
 * <br>on the transition type.
 * <br>
 * <br>[property&#64;Flap:flap] is transparent by default; add the
 * <br>[`.background`](style-classes.html&#35;background) style class to it if this is
 * <br>unwanted.
 * <br>
 * <br>If [property&#64;Flap:modal] is set to `TRUE`, content becomes completely
 * <br>inaccessible when the flap is revealed while folded.
 * <br>
 * <br>The position of the flap and separator children relative to the content is
 * <br>determined by orientation, as well as the [property&#64;Flap:flap-position]
 * <br>value.
 * <br>
 * <br>Folding the flap will automatically hide the flap widget, and unfolding it
 * <br>will automatically reveal it. If this behavior is not desired, the
 * <br>[property&#64;Flap:locked] property can be used to override it.
 * <br>
 * <br>Common use cases include sidebars, header bars that need to be able to
 * <br>overlap the window content (for example, in fullscreen mode) and bottom
 * <br>sheets.
 * <br>
 * <br>&#35;&#35; AdwFlap as GtkBuildable
 * <br>
 * <br>The `AdwFlap` implementation of the [iface&#64;Gtk.Buildable] interface supports
 * <br>setting the flap child by specifying “flap” as the “type” attribute of a
 * <br>`&lt;child&gt;` element, and separator by specifying “separator”. Specifying
 * <br>“content” child type or omitting it results in setting the content child.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwFlap` has a single CSS node with name `flap`. The node will get the style
 * <br>classes `.folded` when it is folded, and `.unfolded` when it's not.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Flap.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Flap.html</a></p>
*/
public class Flap extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Flap.class.getCanonicalName());
    }

    public Flap(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwFlap`.
    */
    public Flap() {
        super(cast(JnaFlap.INST().adw_flap_new()));
    }

    /**
     * Gets the content widget for &#64;self.
     * @return the content widget for &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getContent()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaFlap.INST().adw_flap_get_content(asCPointer())));
    }

    /**
     * Gets the flap widget for &#64;self.
     * @return the flap widget for &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getFlap()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaFlap.INST().adw_flap_get_flap(asCPointer())));
    }

    /**
     * Gets the flap position for &#64;self.
     * @return the flap position for &#64;self
    */
    public int getFlapPosition()  {
        return JnaFlap.INST().adw_flap_get_flap_position(asCPointer());
    }

    /**
     * Gets the fold transition animation duration for &#64;self, in milliseconds.
     * @return the fold transition duration
    */
    public int getFoldDuration()  {
        return JnaFlap.INST().adw_flap_get_fold_duration(asCPointer());
    }

    /**
     * Gets the fold policy for &#64;self.
     * @return the fold policy for &#64;self
    */
    public int getFoldPolicy()  {
        return JnaFlap.INST().adw_flap_get_fold_policy(asCPointer());
    }

    /**
     * Gets the fold threshold policy for &#64;self.
     * @return 
    */
    public int getFoldThresholdPolicy()  {
        return JnaFlap.INST().adw_flap_get_fold_threshold_policy(asCPointer());
    }

    /**
     * Gets whether &#64;self is currently folded.
     * <br>
     * <br>See [property&#64;Flap:fold-policy].
     * @return `TRUE` if &#64;self is currently folded
    */
    public boolean getFolded()  {
        return JnaFlap.INST().adw_flap_get_folded(asCPointer());
    }

    /**
     * Gets whether &#64;self is locked.
     * @return `TRUE` if &#64;self is locked
    */
    public boolean getLocked()  {
        return JnaFlap.INST().adw_flap_get_locked(asCPointer());
    }

    /**
     * Gets whether &#64;self is modal.
     * @return `TRUE` if &#64;self is modal
    */
    public boolean getModal()  {
        return JnaFlap.INST().adw_flap_get_modal(asCPointer());
    }

    /**
     * Gets whether the flap widget is revealed for &#64;self.
     * @return `TRUE` if the flap widget is revealed
    */
    public boolean getRevealFlap()  {
        return JnaFlap.INST().adw_flap_get_reveal_flap(asCPointer());
    }

    /**
     * Gets the reveal animation spring parameters for &#64;self.
     * @return the reveal animation parameters
    */
    public SpringParams getRevealParams()  {
        return new SpringParams(new PointerContainer(JnaFlap.INST().adw_flap_get_reveal_params(asCPointer())));
    }

    /**
     * Gets the current reveal progress for &#64;self.
     * <br>
     * <br>0 means fully hidden, 1 means fully revealed.
     * <br>
     * <br>See [property&#64;Flap:reveal-flap].
     * @return the current reveal progress for &#64;self
    */
    public double getRevealProgress()  {
        return JnaFlap.INST().adw_flap_get_reveal_progress(asCPointer());
    }

    /**
     * Gets the separator widget for &#64;self.
     * @return the separator widget for &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getSeparator()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaFlap.INST().adw_flap_get_separator(asCPointer())));
    }

    /**
     * Gets whether &#64;self can be closed with a swipe gesture.
     * @return `TRUE` if &#64;self can be closed with a swipe gesture
    */
    public boolean getSwipeToClose()  {
        return JnaFlap.INST().adw_flap_get_swipe_to_close(asCPointer());
    }

    /**
     * Gets whether &#64;self can be opened with a swipe gesture.
     * @return `TRUE` if &#64;self can be opened with a swipe gesture
    */
    public boolean getSwipeToOpen()  {
        return JnaFlap.INST().adw_flap_get_swipe_to_open(asCPointer());
    }

    /**
     * Gets the type of animation used for reveal and fold transitions in &#64;self.
     * @return the current transition type of &#64;self
    */
    public int getTransitionType()  {
        return JnaFlap.INST().adw_flap_get_transition_type(asCPointer());
    }

    /**
     * Sets the content widget for &#64;self.
     * <br>
     * <br>It's always displayed when unfolded, and partially visible when folded.
     * @param content the content widget
    */
    public void setContent(@Nullable ch.bailu.gtk.gtk.Widget content)  {
        JnaFlap.INST().adw_flap_set_content(asCPointer(), asCPointer(content));
    }

    /**
     * Sets the flap widget for &#64;self.
     * <br>
     * <br>It's only visible when [property&#64;Flap:reveal-progress] is greater than 0.
     * @param flap the flap widget
    */
    public void setFlap(@Nullable ch.bailu.gtk.gtk.Widget flap)  {
        JnaFlap.INST().adw_flap_set_flap(asCPointer(), asCPointer(flap));
    }

    /**
     * Sets the flap position for &#64;self.
     * <br>
     * <br>If it's set to `GTK_PACK_START`, the flap is displayed before the content,
     * <br>if `GTK_PACK_END`, it's displayed after the content.
     * @param position the new value
    */
    public void setFlapPosition(int position)  {
        JnaFlap.INST().adw_flap_set_flap_position(asCPointer(), position);
    }

    /**
     * Sets the fold transition animation duration for &#64;self, in milliseconds.
     * @param duration the new duration, in milliseconds
    */
    public void setFoldDuration(int duration)  {
        JnaFlap.INST().adw_flap_set_fold_duration(asCPointer(), duration);
    }

    /**
     * Sets the fold policy for &#64;self.
     * @param policy the fold policy
    */
    public void setFoldPolicy(int policy)  {
        JnaFlap.INST().adw_flap_set_fold_policy(asCPointer(), policy);
    }

    /**
     * Sets the fold threshold policy for &#64;self.
     * <br>
     * <br>If set to `ADW_FOLD_THRESHOLD_POLICY_MINIMUM`, flap will only fold when the
     * <br>children cannot fit anymore. With `ADW_FOLD_THRESHOLD_POLICY_NATURAL`, it
     * <br>will fold as soon as children don't get their natural size.
     * <br>
     * <br>This can be useful if you have a long ellipsizing label and want to let it
     * <br>ellipsize instead of immediately folding.
     * @param policy the policy to use
    */
    public void setFoldThresholdPolicy(int policy)  {
        JnaFlap.INST().adw_flap_set_fold_threshold_policy(asCPointer(), policy);
    }

    /**
     * Sets whether &#64;self is locked.
     * <br>
     * <br>If `FALSE`, folding when the flap is revealed automatically closes it, and
     * <br>unfolding it when the flap is not revealed opens it. If `TRUE`,
     * <br>[property&#64;Flap:reveal-flap] value never changes on its own.
     * @param locked the new value
    */
    public void setLocked(boolean locked)  {
        JnaFlap.INST().adw_flap_set_locked(asCPointer(), locked);
    }

    /**
     * Sets whether &#64;self is modal.
     * <br>
     * <br>If `TRUE`, clicking the content widget while flap is revealed, as well as
     * <br>pressing the &lt;kbd&gt;Esc&lt;/kbd&gt; key, will close the flap. If `FALSE`, clicks are
     * <br>passed through to the content widget.
     * @param modal whether &#64;self is modal
    */
    public void setModal(boolean modal)  {
        JnaFlap.INST().adw_flap_set_modal(asCPointer(), modal);
    }

    /**
     * Sets whether the flap widget is revealed for &#64;self.
     * @param reveal_flap whether to reveal the flap widget
    */
    public void setRevealFlap(boolean reveal_flap)  {
        JnaFlap.INST().adw_flap_set_reveal_flap(asCPointer(), reveal_flap);
    }

    /**
     * Sets the reveal animation spring parameters for &#64;self.
     * <br>
     * <br>The default value is equivalent to:
     * <br>
     * <br>```c
     * <br>adw_spring_params_new (1, 0.5, 500)
     * <br>```
     * @param params the new parameters
    */
    public void setRevealParams(@Nonnull SpringParams params)  {
        JnaFlap.INST().adw_flap_set_reveal_params(asCPointer(), asCPointerNotNull(params));
    }

    /**
     * Sets the separator widget for &#64;self.
     * <br>
     * <br>It's displayed between content and flap when there's no shadow to display.
     * <br>When exactly it's visible depends on the [property&#64;Flap:transition-type]
     * <br>value.
     * @param separator the separator widget
    */
    public void setSeparator(@Nullable ch.bailu.gtk.gtk.Widget separator)  {
        JnaFlap.INST().adw_flap_set_separator(asCPointer(), asCPointer(separator));
    }

    /**
     * Sets whether &#64;self can be closed with a swipe gesture.
     * <br>
     * <br>The area that can be swiped depends on the [property&#64;Flap:transition-type]
     * <br>value.
     * @param swipe_to_close whether &#64;self can be closed with a swipe gesture
    */
    public void setSwipeToClose(boolean swipe_to_close)  {
        JnaFlap.INST().adw_flap_set_swipe_to_close(asCPointer(), swipe_to_close);
    }

    /**
     * Sets whether &#64;self can be opened with a swipe gesture.
     * <br>
     * <br>The area that can be swiped depends on the [property&#64;Flap:transition-type]
     * <br>value.
     * @param swipe_to_open whether &#64;self can be opened with a swipe gesture
    */
    public void setSwipeToOpen(boolean swipe_to_open)  {
        JnaFlap.INST().adw_flap_set_swipe_to_open(asCPointer(), swipe_to_open);
    }

    /**
     * Sets the type of animation used for reveal and fold transitions in &#64;self.
     * <br>
     * <br>[property&#64;Flap:flap] is transparent by default, which means the content will
     * <br>be seen through it with `ADW_FLAP_TRANSITION_TYPE_OVER` transitions; add the
     * <br>[`.background`](style-classes.html&#35;background) style class to it if this is
     * <br>unwanted.
     * @param transition_type the new transition type
    */
    public void setTransitionType(int transition_type)  {
        JnaFlap.INST().adw_flap_set_transition_type(asCPointer(), transition_type);
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
        return JnaFlap.INST().adw_flap_get_type(); 
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
