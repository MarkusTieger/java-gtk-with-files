/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkCursor` is used to create and destroy cursors.
 * <br>
 * <br>Cursors are immutable objects, so once you created them, there is no way
 * <br>to modify them later. You should create a new cursor when you want to change
 * <br>something about it.
 * <br>
 * <br>Cursors by themselves are not very interesting: they must be bound to a
 * <br>window for users to see them. This is done with [method&#64;Gdk.Surface.set_cursor]
 * <br>or [method&#64;Gdk.Surface.set_device_cursor]. Applications will typically
 * <br>use higher-level GTK functions such as [method&#64;Gtk.Widget.set_cursor] instead.
 * <br>
 * <br>Cursors are not bound to a given [class&#64;Gdk.Display], so they can be shared.
 * <br>However, the appearance of cursors may vary when used on different
 * <br>platforms.
 * <br>
 * <br>&#35;&#35; Named and texture cursors
 * <br>
 * <br>There are multiple ways to create cursors. The platform's own cursors
 * <br>can be created with [ctor&#64;Gdk.Cursor.new_from_name]. That function lists
 * <br>the commonly available names that are shared with the CSS specification.
 * <br>Other names may be available, depending on the platform in use. On some
 * <br>platforms, what images are used for named cursors may be influenced by
 * <br>the cursor theme.
 * <br>
 * <br>Another option to create a cursor is to use [ctor&#64;Gdk.Cursor.new_from_texture]
 * <br>and provide an image to use for the cursor.
 * <br>
 * <br>To ease work with unsupported cursors, a fallback cursor can be provided.
 * <br>If a [class&#64;Gdk.Surface] cannot use a cursor because of the reasons mentioned
 * <br>above, it will try the fallback cursor. Fallback cursors can themselves have
 * <br>fallback cursors again, so it is possible to provide a chain of progressively
 * <br>easier to support cursors. If none of the provided cursors can be supported,
 * <br>the default cursor will be the ultimate fallback.
 * <p><a href="https://docs.gtk.org/gdk4/class.Cursor.html">https://docs.gtk.org/gdk4/class.Cursor.html</a></p>
*/
public class Cursor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Cursor.class.getCanonicalName());
    }

    public Cursor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new cursor by looking up &#64;name in the current cursor
     * <br>theme.
     * <br>
     * <br>A recommended set of cursor names that will work across different
     * <br>platforms can be found in the CSS specification:
     * <br>
     * <br>| | | | |
     * <br>| --- | --- | ---- | --- |
     * <br>| &quot;none&quot; | ![](default_cursor.png) &quot;default&quot; | ![](help_cursor.png) &quot;help&quot; | ![](pointer_cursor.png) &quot;pointer&quot; |
     * <br>| ![](context_menu_cursor.png) &quot;context-menu&quot; | ![](progress_cursor.png) &quot;progress&quot; | ![](wait_cursor.png) &quot;wait&quot; | ![](cell_cursor.png) &quot;cell&quot; |
     * <br>| ![](crosshair_cursor.png) &quot;crosshair&quot; | ![](text_cursor.png) &quot;text&quot; | ![](vertical_text_cursor.png) &quot;vertical-text&quot; | ![](alias_cursor.png) &quot;alias&quot; |
     * <br>| ![](copy_cursor.png) &quot;copy&quot; | ![](no_drop_cursor.png) &quot;no-drop&quot; | ![](move_cursor.png) &quot;move&quot; | ![](not_allowed_cursor.png) &quot;not-allowed&quot; |
     * <br>| ![](grab_cursor.png) &quot;grab&quot; | ![](grabbing_cursor.png) &quot;grabbing&quot; | ![](all_scroll_cursor.png) &quot;all-scroll&quot; | ![](col_resize_cursor.png) &quot;col-resize&quot; |
     * <br>| ![](row_resize_cursor.png) &quot;row-resize&quot; | ![](n_resize_cursor.png) &quot;n-resize&quot; | ![](e_resize_cursor.png) &quot;e-resize&quot; | ![](s_resize_cursor.png) &quot;s-resize&quot; |
     * <br>| ![](w_resize_cursor.png) &quot;w-resize&quot; | ![](ne_resize_cursor.png) &quot;ne-resize&quot; | ![](nw_resize_cursor.png) &quot;nw-resize&quot; | ![](sw_resize_cursor.png) &quot;sw-resize&quot; |
     * <br>| ![](se_resize_cursor.png) &quot;se-resize&quot; | ![](ew_resize_cursor.png) &quot;ew-resize&quot; | ![](ns_resize_cursor.png) &quot;ns-resize&quot; | ![](nesw_resize_cursor.png) &quot;nesw-resize&quot; |
     * <br>| ![](nwse_resize_cursor.png) &quot;nwse-resize&quot; | ![](zoom_in_cursor.png) &quot;zoom-in&quot; | ![](zoom_out_cursor.png) &quot;zoom-out&quot; | |
     * @param name the name of the cursor
     * @param fallback %NULL or the `GdkCursor` to fall back to when   this one cannot be supported
     * @return a new `GdkCursor`, or %NULL if there is no   cursor with the given name
    */
    public static Cursor newFromNameCursor(@Nonnull ch.bailu.gtk.type.Str name, @Nullable Cursor fallback)  {
        PointerContainer __self = cast(JnaCursor.INST().gdk_cursor_new_from_name(asCPointerNotNull(name), asCPointer(fallback)));
        if (__self.isNull()) {
            throw new NullPointerException("Cursor:newFromName");
        }
        return new Cursor(__self);
    }        
    

    /**
     * Creates a new cursor by looking up &#64;name in the current cursor
     * <br>theme.
     * <br>
     * <br>A recommended set of cursor names that will work across different
     * <br>platforms can be found in the CSS specification:
     * <br>
     * <br>| | | | |
     * <br>| --- | --- | ---- | --- |
     * <br>| &quot;none&quot; | ![](default_cursor.png) &quot;default&quot; | ![](help_cursor.png) &quot;help&quot; | ![](pointer_cursor.png) &quot;pointer&quot; |
     * <br>| ![](context_menu_cursor.png) &quot;context-menu&quot; | ![](progress_cursor.png) &quot;progress&quot; | ![](wait_cursor.png) &quot;wait&quot; | ![](cell_cursor.png) &quot;cell&quot; |
     * <br>| ![](crosshair_cursor.png) &quot;crosshair&quot; | ![](text_cursor.png) &quot;text&quot; | ![](vertical_text_cursor.png) &quot;vertical-text&quot; | ![](alias_cursor.png) &quot;alias&quot; |
     * <br>| ![](copy_cursor.png) &quot;copy&quot; | ![](no_drop_cursor.png) &quot;no-drop&quot; | ![](move_cursor.png) &quot;move&quot; | ![](not_allowed_cursor.png) &quot;not-allowed&quot; |
     * <br>| ![](grab_cursor.png) &quot;grab&quot; | ![](grabbing_cursor.png) &quot;grabbing&quot; | ![](all_scroll_cursor.png) &quot;all-scroll&quot; | ![](col_resize_cursor.png) &quot;col-resize&quot; |
     * <br>| ![](row_resize_cursor.png) &quot;row-resize&quot; | ![](n_resize_cursor.png) &quot;n-resize&quot; | ![](e_resize_cursor.png) &quot;e-resize&quot; | ![](s_resize_cursor.png) &quot;s-resize&quot; |
     * <br>| ![](w_resize_cursor.png) &quot;w-resize&quot; | ![](ne_resize_cursor.png) &quot;ne-resize&quot; | ![](nw_resize_cursor.png) &quot;nw-resize&quot; | ![](sw_resize_cursor.png) &quot;sw-resize&quot; |
     * <br>| ![](se_resize_cursor.png) &quot;se-resize&quot; | ![](ew_resize_cursor.png) &quot;ew-resize&quot; | ![](ns_resize_cursor.png) &quot;ns-resize&quot; | ![](nesw_resize_cursor.png) &quot;nesw-resize&quot; |
     * <br>| ![](nwse_resize_cursor.png) &quot;nwse-resize&quot; | ![](zoom_in_cursor.png) &quot;zoom-in&quot; | ![](zoom_out_cursor.png) &quot;zoom-out&quot; | |
     * @param name the name of the cursor
     * @param fallback %NULL or the `GdkCursor` to fall back to when   this one cannot be supported
     * @return a new `GdkCursor`, or %NULL if there is no   cursor with the given name
    */
    public static Cursor newFromNameCursor(String name, @Nullable Cursor fallback)  {
        PointerContainer __self = cast(JnaCursor.INST().gdk_cursor_new_from_name(name, asCPointer(fallback)));
        if (__self.isNull()) {
            throw new NullPointerException("Cursor:newFromName");
        }
        return new Cursor(__self);
    }        
    

    /**
     * Creates a new cursor from a `GdkTexture`.
     * @param texture the texture providing the pixel data
     * @param hotspot_x the horizontal offset of the “hotspot” of the cursor
     * @param hotspot_y the vertical offset of the “hotspot” of the cursor
     * @param fallback the `GdkCursor` to fall back to when   this one cannot be supported
     * @return a new `GdkCursor`
    */
    public static Cursor newFromTextureCursor(@Nonnull Texture texture, int hotspot_x, int hotspot_y, @Nullable Cursor fallback)  {
        PointerContainer __self = cast(JnaCursor.INST().gdk_cursor_new_from_texture(asCPointerNotNull(texture), hotspot_x, hotspot_y, asCPointer(fallback)));
        if (__self.isNull()) {
            throw new NullPointerException("Cursor:newFromTexture");
        }
        return new Cursor(__self);
    }        
    

    /**
     * Returns the fallback for this &#64;cursor.
     * <br>
     * <br>The fallback will be used if this cursor is not available on a given
     * <br>`GdkDisplay`. For named cursors, this can happen when using nonstandard
     * <br>names or when using an incomplete cursor theme. For textured cursors,
     * <br>this can happen when the texture is too large or when the `GdkDisplay`
     * <br>it is used on does not support textured cursors.
     * @return the fallback of the cursor or %NULL   to use the default cursor as fallback
    */
    public Cursor getFallback()  {
        return new Cursor(new PointerContainer(JnaCursor.INST().gdk_cursor_get_fallback(asCPointer())));
    }

    /**
     * Returns the horizontal offset of the hotspot.
     * <br>
     * <br>The hotspot indicates the pixel that will be directly above the cursor.
     * <br>
     * <br>Note that named cursors may have a nonzero hotspot, but this function
     * <br>will only return the hotspot position for cursors created with
     * <br>[ctor&#64;Gdk.Cursor.new_from_texture].
     * @return the horizontal offset of the hotspot or 0 for named cursors
    */
    public int getHotspotX()  {
        return JnaCursor.INST().gdk_cursor_get_hotspot_x(asCPointer());
    }

    /**
     * Returns the vertical offset of the hotspot.
     * <br>
     * <br>The hotspot indicates the pixel that will be directly above the cursor.
     * <br>
     * <br>Note that named cursors may have a nonzero hotspot, but this function
     * <br>will only return the hotspot position for cursors created with
     * <br>[ctor&#64;Gdk.Cursor.new_from_texture].
     * @return the vertical offset of the hotspot or 0 for named cursors
    */
    public int getHotspotY()  {
        return JnaCursor.INST().gdk_cursor_get_hotspot_y(asCPointer());
    }

    /**
     * Returns the name of the cursor.
     * <br>
     * <br>If the cursor is not a named cursor, %NULL will be returned.
     * @return the name of the cursor or %NULL   if it is not a named cursor
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCursor.INST().gdk_cursor_get_name(asCPointer())));
    }

    /**
     * Returns the texture for the cursor.
     * <br>
     * <br>If the cursor is a named cursor, %NULL will be returned.
     * @return the texture for cursor or %NULL   if it is a named cursor
    */
    public Texture getTexture()  {
        return new Texture(new PointerContainer(JnaCursor.INST().gdk_cursor_get_texture(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaCursor.INST().gdk_cursor_get_type(); 
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
