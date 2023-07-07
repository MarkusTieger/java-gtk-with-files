/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkPaintable` is a simple interface used by GTK to represent content that
 * <br>can be painted.
 * <br>
 * <br>The content of a `GdkPaintable` can be painted anywhere at any size
 * <br>without requiring any sort of layout. The interface is inspired by
 * <br>similar concepts elsewhere, such as
 * <br>[ClutterContent](https://developer.gnome.org/clutter/stable/ClutterContent.html),
 * <br>[HTML/CSS Paint Sources](https://www.w3.org/TR/css-images-4/&#35;paint-source),
 * <br>or [SVG Paint Servers](https://www.w3.org/TR/SVG2/pservers.html).
 * <br>
 * <br>A `GdkPaintable` can be snapshot at any time and size using
 * <br>[method&#64;Gdk.Paintable.snapshot]. How the paintable interprets that size and
 * <br>if it scales or centers itself into the given rectangle is implementation
 * <br>defined, though if you are implementing a `GdkPaintable` and don't know what
 * <br>to do, it is suggested that you scale your paintable ignoring any potential
 * <br>aspect ratio.
 * <br>
 * <br>The contents that a `GdkPaintable` produces may depend on the [class&#64;GdkSnapshot]
 * <br>passed to it. For example, paintables may decide to use more detailed images
 * <br>on higher resolution screens or when OpenGL is available. A `GdkPaintable`
 * <br>will however always produce the same output for the same snapshot.
 * <br>
 * <br>A `GdkPaintable` may change its contents, meaning that it will now produce
 * <br>a different output with the same snapshot. Once that happens, it will call
 * <br>[method&#64;Gdk.Paintable.invalidate_contents] which will emit the
 * <br>[signal&#64;GdkPaintable::invalidate-contents] signal. If a paintable is known
 * <br>to never change its contents, it will set the %GDK_PAINTABLE_STATIC_CONTENTS
 * <br>flag. If a consumer cannot deal with changing contents, it may call
 * <br>[method&#64;Gdk.Paintable.get_current_image] which will return a static
 * <br>paintable and use that.
 * <br>
 * <br>A paintable can report an intrinsic (or preferred) size or aspect ratio it
 * <br>wishes to be rendered at, though it doesn't have to. Consumers of the interface
 * <br>can use this information to layout thepaintable appropriately. Just like the
 * <br>contents, the size of a paintable can change. A paintable will indicate this
 * <br>by calling [method&#64;Gdk.Paintable.invalidate_size] which will emit the
 * <br>[signal&#64;GdkPaintable::invalidate-size] signal. And just like for contents,
 * <br>if a paintable is known to never change its size, it will set the
 * <br>%GDK_PAINTABLE_STATIC_SIZE flag.
 * <br>
 * <br>Besides API for applications, there are some functions that are only
 * <br>useful for implementing subclasses and should not be used by applications:
 * <br>[method&#64;Gdk.Paintable.invalidate_contents],
 * <br>[method&#64;Gdk.Paintable.invalidate_size],
 * <br>[func&#64;Gdk.Paintable.new_empty].
 * <p><a href="https://docs.gtk.org/gdk4/iface.Paintable.html">https://docs.gtk.org/gdk4/iface.Paintable.html</a></p>
*/
public class Paintable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Paintable.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnInvalidateContents {
        /**
         * Emitted when the contents of the &#64;paintable change.
         * <br>
         * <br>Examples for such an event would be videos changing to the next frame or
         * <br>the icon theme for an icon changing.
        */
        void onInvalidateContents();
    }
    
    private static com.sun.jna.Callback toOnInvalidateContents(OnInvalidateContents in) {
        return (in == null) ? null: (JnaPaintable.OnInvalidateContents) (__self, __data) -> in.onInvalidateContents();
    }

    @FunctionalInterface
    public interface OnInvalidateSize {
        /**
         * Emitted when the intrinsic size of the &#64;paintable changes.
         * <br>
         * <br>This means the values reported by at least one of
         * <br>[method&#64;Gdk.Paintable.get_intrinsic_width],
         * <br>[method&#64;Gdk.Paintable.get_intrinsic_height] or
         * <br>[method&#64;Gdk.Paintable.get_intrinsic_aspect_ratio]
         * <br>has changed.
         * <br>
         * <br>Examples for such an event would be a paintable displaying
         * <br>the contents of a toplevel surface being resized.
        */
        void onInvalidateSize();
    }
    
    private static com.sun.jna.Callback toOnInvalidateSize(OnInvalidateSize in) {
        return (in == null) ? null: (JnaPaintable.OnInvalidateSize) (__self, __data) -> in.onInvalidateSize();
    }

    public Paintable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets an immutable paintable for the current contents displayed by &#64;paintable.
     * <br>
     * <br>This is useful when you want to retain the current state of an animation,
     * <br>for example to take a screenshot of a running animation.
     * <br>
     * <br>If the &#64;paintable is already immutable, it will return itself.
     * @return An immutable paintable for the current   contents of &#64;paintable
    */
    public Paintable getCurrentImage()  {
        return new Paintable(new PointerContainer(JnaPaintable.INST().gdk_paintable_get_current_image(asCPointer())));
    }

    /**
     * Get flags for the paintable.
     * <br>
     * <br>This is oftentimes useful for optimizations.
     * <br>
     * <br>See [flags&#64;Gdk.PaintableFlags] for the flags and what they mean.
     * @return The `GdkPaintableFlags` for this paintable
    */
    public int getFlags()  {
        return JnaPaintable.INST().gdk_paintable_get_flags(asCPointer());
    }

    /**
     * Gets the preferred aspect ratio the &#64;paintable would like to be displayed at.
     * <br>
     * <br>The aspect ratio is the width divided by the height, so a value of 0.5
     * <br>means that the &#64;paintable prefers to be displayed twice as high as it
     * <br>is wide. Consumers of this interface can use this to preserve aspect
     * <br>ratio when displaying the paintable.
     * <br>
     * <br>This is a purely informational value and does not in any way limit the
     * <br>values that may be passed to [method&#64;Gdk.Paintable.snapshot].
     * <br>
     * <br>Usually when a &#64;paintable returns nonzero values from
     * <br>[method&#64;Gdk.Paintable.get_intrinsic_width] and
     * <br>[method&#64;Gdk.Paintable.get_intrinsic_height] the aspect ratio
     * <br>should conform to those values, though that is not required.
     * <br>
     * <br>If the &#64;paintable does not have a preferred aspect ratio,
     * <br>it returns 0. Negative values are never returned.
     * @return the intrinsic aspect ratio of &#64;paintable or 0 if none.
    */
    public double getIntrinsicAspectRatio()  {
        return JnaPaintable.INST().gdk_paintable_get_intrinsic_aspect_ratio(asCPointer());
    }

    /**
     * Gets the preferred height the &#64;paintable would like to be displayed at.
     * <br>
     * <br>Consumers of this interface can use this to reserve enough space to draw
     * <br>the paintable.
     * <br>
     * <br>This is a purely informational value and does not in any way limit the
     * <br>values that may be passed to [method&#64;Gdk.Paintable.snapshot].
     * <br>
     * <br>If the &#64;paintable does not have a preferred height, it returns 0.
     * <br>Negative values are never returned.
     * @return the intrinsic height of &#64;paintable or 0 if none.
    */
    public int getIntrinsicHeight()  {
        return JnaPaintable.INST().gdk_paintable_get_intrinsic_height(asCPointer());
    }

    /**
     * Gets the preferred width the &#64;paintable would like to be displayed at.
     * <br>
     * <br>Consumers of this interface can use this to reserve enough space to draw
     * <br>the paintable.
     * <br>
     * <br>This is a purely informational value and does not in any way limit the
     * <br>values that may be passed to [method&#64;Gdk.Paintable.snapshot].
     * <br>
     * <br>If the &#64;paintable does not have a preferred width, it returns 0.
     * <br>Negative values are never returned.
     * @return the intrinsic width of &#64;paintable or 0 if none.
    */
    public int getIntrinsicWidth()  {
        return JnaPaintable.INST().gdk_paintable_get_intrinsic_width(asCPointer());
    }

    /**
     * Called by implementations of `GdkPaintable` to invalidate their contents.
     * <br>
     * <br>Unless the contents are invalidated, implementations must guarantee that
     * <br>multiple calls of [method&#64;Gdk.Paintable.snapshot] produce the same output.
     * <br>
     * <br>This function will emit the [signal&#64;Gdk.Paintable::invalidate-contents]
     * <br>signal.
     * <br>
     * <br>If a &#64;paintable reports the %GDK_PAINTABLE_STATIC_CONTENTS flag,
     * <br>it must not call this function.
    */
    public void invalidateContents()  {
        JnaPaintable.INST().gdk_paintable_invalidate_contents(asCPointer());
    }

    /**
     * Called by implementations of `GdkPaintable` to invalidate their size.
     * <br>
     * <br>As long as the size is not invalidated, &#64;paintable must return the same
     * <br>values for its intrinsic width, height and aspect ratio.
     * <br>
     * <br>This function will emit the [signal&#64;Gdk.Paintable::invalidate-size]
     * <br>signal.
     * <br>
     * <br>If a &#64;paintable reports the %GDK_PAINTABLE_STATIC_SIZE flag,
     * <br>it must not call this function.
    */
    public void invalidateSize()  {
        JnaPaintable.INST().gdk_paintable_invalidate_size(asCPointer());
    }

    /**
     * Snapshots the given paintable with the given &#64;width and &#64;height.
     * <br>
     * <br>The paintable is drawn at the current (0,0) offset of the &#64;snapshot.
     * <br>If &#64;width and &#64;height are not larger than zero, this function will
     * <br>do nothing.
     * @param snapshot a `GdkSnapshot` to snapshot to
     * @param width width to snapshot in
     * @param height height to snapshot in
    */
    public void snapshot(@Nonnull Snapshot snapshot, double width, double height)  {
        JnaPaintable.INST().gdk_paintable_snapshot(asCPointer(), asCPointerNotNull(snapshot), width, height);
    }

    public final static String SIGNAL_ON_INVALIDATE_CONTENTS = "invalidate-contents";
    
    /**
     * Connect to signal "invalidate-contents".
     * <br>See {@link OnInvalidateContents#onInvalidateContents} for signal description.
     * <br>Field {@link #SIGNAL_ON_INVALIDATE_CONTENTS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInvalidateContents(OnInvalidateContents signal) {
        return connectSignal(SIGNAL_ON_INVALIDATE_CONTENTS, toOnInvalidateContents(signal));
    }

    public final static String SIGNAL_ON_INVALIDATE_SIZE = "invalidate-size";
    
    /**
     * Connect to signal "invalidate-size".
     * <br>See {@link OnInvalidateSize#onInvalidateSize} for signal description.
     * <br>Field {@link #SIGNAL_ON_INVALIDATE_SIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onInvalidateSize(OnInvalidateSize signal) {
        return connectSignal(SIGNAL_ON_INVALIDATE_SIZE, toOnInvalidateSize(signal));
    }

    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * <br>
     * <br>This is often useful for implementing the
     * <br>[vfunc&#64;Gdk.Paintable.get_current_image] virtual function
     * <br>when the paintable is in an incomplete state (like a
     * <br>[class&#64;Gtk.MediaStream] before receiving the first frame).
     * @param intrinsic_width The intrinsic width to report. Can be 0 for no width.
     * @param intrinsic_height The intrinsic height to report. Can be 0 for no height.
     * @return a `GdkPaintable`
    */
    public static Paintable newEmpty(int intrinsic_width, int intrinsic_height)  {
        return new Paintable(new PointerContainer(JnaPaintable.INST().gdk_paintable_new_empty(intrinsic_width, intrinsic_height)));
    }

    public static long getTypeID() { 
        return JnaPaintable.INST().gdk_paintable_get_type(); 
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
interface-type

[MethodModel:java-type-not-supported:java-type-not-supported:computeConcreteSize:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:Supported:{G_::{c:double}}:{j:double}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
