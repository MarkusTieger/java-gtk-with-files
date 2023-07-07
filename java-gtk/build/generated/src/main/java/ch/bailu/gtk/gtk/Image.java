/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkImage` widget displays an image.
 * <br>
 * <br>![An example GtkImage](image.png)
 * <br>
 * <br>Various kinds of object can be displayed as an image; most typically,
 * <br>you would load a `GdkTexture` from a file, using the convenience function
 * <br>[ctor&#64;Gtk.Image.new_from_file], for instance:
 * <br>
 * <br>```c
 * <br>GtkWidget *image = gtk_image_new_from_file (&quot;myfile.png&quot;);
 * <br>```
 * <br>
 * <br>If the file isn’t loaded successfully, the image will contain a
 * <br>“broken image” icon similar to that used in many web browsers.
 * <br>
 * <br>If you want to handle errors in loading the file yourself,
 * <br>for example by displaying an error message, then load the image with
 * <br>[ctor&#64;Gdk.Texture.new_from_file], then create the `GtkImage` with
 * <br>[ctor&#64;Gtk.Image.new_from_paintable].
 * <br>
 * <br>Sometimes an application will want to avoid depending on external data
 * <br>files, such as image files. See the documentation of `GResource` inside
 * <br>GIO, for details. In this case, [property&#64;Gtk.Image:resource],
 * <br>[ctor&#64;Gtk.Image.new_from_resource], and [method&#64;Gtk.Image.set_from_resource]
 * <br>should be used.
 * <br>
 * <br>`GtkImage` displays its image as an icon, with a size that is determined
 * <br>by the application. See [class&#64;Gtk.Picture] if you want to show an image
 * <br>at is actual size.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`GtkImage` has a single CSS node with the name `image`. The style classes
 * <br>`.normal-icons` or `.large-icons` may appear, depending on the
 * <br>[property&#64;Gtk.Image:icon-size] property.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`GtkImage` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Image.html">https://docs.gtk.org/gtk4/class.Image.html</a></p>
*/
public class Image extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Image.class.getCanonicalName());
    }

    public Image(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkImage` displaying the file &#64;filename.
     * <br>
     * <br>If the file isn’t found or can’t be loaded, the resulting `GtkImage`
     * <br>will display a “broken image” icon. This function never returns %NULL,
     * <br>it always returns a valid `GtkImage` widget.
     * <br>
     * <br>If you need to detect failures to load the file, use
     * <br>[ctor&#64;Gdk.Texture.new_from_file] to load the file yourself,
     * <br>then create the `GtkImage` from the texture.
     * <br>
     * <br>The storage type (see [method&#64;Gtk.Image.get_storage_type])
     * <br>of the returned image is not defined, it will be whatever
     * <br>is appropriate for displaying the file.
     * @param filename a filename
     * @return a new `GtkImage`
    */
    public static Image newFromFileImage(@Nonnull ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_file(asCPointerNotNull(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromFile");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new `GtkImage` displaying the file &#64;filename.
     * <br>
     * <br>If the file isn’t found or can’t be loaded, the resulting `GtkImage`
     * <br>will display a “broken image” icon. This function never returns %NULL,
     * <br>it always returns a valid `GtkImage` widget.
     * <br>
     * <br>If you need to detect failures to load the file, use
     * <br>[ctor&#64;Gdk.Texture.new_from_file] to load the file yourself,
     * <br>then create the `GtkImage` from the texture.
     * <br>
     * <br>The storage type (see [method&#64;Gtk.Image.get_storage_type])
     * <br>of the returned image is not defined, it will be whatever
     * <br>is appropriate for displaying the file.
     * @param filename a filename
     * @return a new `GtkImage`
    */
    public static Image newFromFileImage(String filename)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_file(filename));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromFile");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead. If the current icon theme is changed, the icon
     * <br>will be updated appropriately.
     * @param icon an icon
     * @return a new `GtkImage` displaying the themed icon
    */
    public static Image newFromGiconImage(@Nonnull ch.bailu.gtk.gio.Icon icon)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_gicon(asCPointerNotNull(icon)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromGicon");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead. If the current icon theme is changed, the icon
     * <br>will be updated appropriately.
     * @param icon_name an icon name
     * @return a new `GtkImage` displaying the themed icon
    */
    public static Image newFromIconNameImage(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_icon_name(asCPointer(icon_name)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromIconName");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     * <br>
     * <br>If the icon name isn’t known, a “broken image” icon will be
     * <br>displayed instead. If the current icon theme is changed, the icon
     * <br>will be updated appropriately.
     * @param icon_name an icon name
     * @return a new `GtkImage` displaying the themed icon
    */
    public static Image newFromIconNameImage(String icon_name)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_icon_name(icon_name));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromIconName");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new `GtkImage` displaying &#64;paintable.
     * <br>
     * <br>The `GtkImage` does not assume a reference to the paintable; you still
     * <br>need to unref it if you own references. `GtkImage` will add its own
     * <br>reference rather than adopting yours.
     * <br>
     * <br>The `GtkImage` will track changes to the &#64;paintable and update
     * <br>its size and contents in response to it.
     * @param paintable a `GdkPaintable`
     * @return a new `GtkImage`
    */
    public static Image newFromPaintableImage(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_paintable(asCPointer(paintable)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromPaintable");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new `GtkImage` displaying &#64;pixbuf.
     * <br>
     * <br>The `GtkImage` does not assume a reference to the pixbuf; you still
     * <br>need to unref it if you own references. `GtkImage` will add its own
     * <br>reference rather than adopting yours.
     * <br>
     * <br>This is a helper for [ctor&#64;Gtk.Image.new_from_paintable], and you can't
     * <br>get back the exact pixbuf once this is called, only a texture.
     * <br>
     * <br>Note that this function just creates an `GtkImage` from the pixbuf.
     * <br>The `GtkImage` created will not react to state changes. Should you
     * <br>want that, you should use [ctor&#64;Gtk.Image.new_from_icon_name].
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GtkImage`
    */
    public static Image newFromPixbufImage(@Nullable ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_pixbuf(asCPointer(pixbuf)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromPixbuf");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new `GtkImage` displaying the resource file &#64;resource_path.
     * <br>
     * <br>If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
     * <br>display a “broken image” icon. This function never returns %NULL,
     * <br>it always returns a valid `GtkImage` widget.
     * <br>
     * <br>If you need to detect failures to load the file, use
     * <br>[ctor&#64;GdkPixbuf.Pixbuf.new_from_file] to load the file yourself,
     * <br>then create the `GtkImage` from the pixbuf.
     * <br>
     * <br>The storage type (see [method&#64;Gtk.Image.get_storage_type]) of
     * <br>the returned image is not defined, it will be whatever is
     * <br>appropriate for displaying the file.
     * @param resource_path a resource path
     * @return a new `GtkImage`
    */
    public static Image newFromResourceImage(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_resource(asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromResource");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new `GtkImage` displaying the resource file &#64;resource_path.
     * <br>
     * <br>If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
     * <br>display a “broken image” icon. This function never returns %NULL,
     * <br>it always returns a valid `GtkImage` widget.
     * <br>
     * <br>If you need to detect failures to load the file, use
     * <br>[ctor&#64;GdkPixbuf.Pixbuf.new_from_file] to load the file yourself,
     * <br>then create the `GtkImage` from the pixbuf.
     * <br>
     * <br>The storage type (see [method&#64;Gtk.Image.get_storage_type]) of
     * <br>the returned image is not defined, it will be whatever is
     * <br>appropriate for displaying the file.
     * @param resource_path a resource path
     * @return a new `GtkImage`
    */
    public static Image newFromResourceImage(String resource_path)  {
        PointerContainer __self = cast(JnaImage.INST().gtk_image_new_from_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("Image:newFromResource");
        }
        return new Image(__self);
    }        
    

    /**
     * Creates a new empty `GtkImage` widget.
    */
    public Image() {
        super(cast(JnaImage.INST().gtk_image_new()));
    }

    /**
     * Resets the image to be empty.
    */
    public void clear()  {
        JnaImage.INST().gtk_image_clear(asCPointer());
    }

    /**
     * Gets the `GIcon` being displayed by the `GtkImage`.
     * <br>
     * <br>The storage type of the image must be %GTK_IMAGE_EMPTY or
     * <br>%GTK_IMAGE_GICON (see [method&#64;Gtk.Image.get_storage_type]).
     * <br>The caller of this function does not own a reference to the
     * <br>returned `GIcon`.
     * @return a `GIcon`
    */
    public ch.bailu.gtk.gio.Icon getGicon()  {
        return new ch.bailu.gtk.gio.Icon(new PointerContainer(JnaImage.INST().gtk_image_get_gicon(asCPointer())));
    }

    /**
     * Gets the icon name and size being displayed by the `GtkImage`.
     * <br>
     * <br>The storage type of the image must be %GTK_IMAGE_EMPTY or
     * <br>%GTK_IMAGE_ICON_NAME (see [method&#64;Gtk.Image.get_storage_type]).
     * <br>The returned string is owned by the `GtkImage` and should not
     * <br>be freed.
     * @return the icon name
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaImage.INST().gtk_image_get_icon_name(asCPointer())));
    }

    /**
     * Gets the icon size used by the &#64;image when rendering icons.
     * @return the image size used by icons
    */
    public int getIconSize()  {
        return JnaImage.INST().gtk_image_get_icon_size(asCPointer());
    }

    /**
     * Gets the image `GdkPaintable` being displayed by the `GtkImage`.
     * <br>
     * <br>The storage type of the image must be %GTK_IMAGE_EMPTY or
     * <br>%GTK_IMAGE_PAINTABLE (see [method&#64;Gtk.Image.get_storage_type]).
     * <br>The caller of this function does not own a reference to the
     * <br>returned paintable.
     * @return the displayed paintable
    */
    public ch.bailu.gtk.gdk.Paintable getPaintable()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaImage.INST().gtk_image_get_paintable(asCPointer())));
    }

    /**
     * Gets the pixel size used for named icons.
     * @return the pixel size used for named icons.
    */
    public int getPixelSize()  {
        return JnaImage.INST().gtk_image_get_pixel_size(asCPointer());
    }

    /**
     * Gets the type of representation being used by the `GtkImage`
     * <br>to store image data.
     * <br>
     * <br>If the `GtkImage` has no image data, the return value will
     * <br>be %GTK_IMAGE_EMPTY.
     * @return image representation being used
    */
    public int getStorageType()  {
        return JnaImage.INST().gtk_image_get_storage_type(asCPointer());
    }

    /**
     * Sets a `GtkImage` to show a file.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_file] for details.
     * @param filename a filename
    */
    public void setFromFile(@Nullable ch.bailu.gtk.type.Str filename)  {
        JnaImage.INST().gtk_image_set_from_file(asCPointer(), asCPointer(filename));
    }

    /**
     * Sets a `GtkImage` to show a file.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_file] for details.
     * @param filename a filename
    */
    public void setFromFile(String filename)  {
        JnaImage.INST().gtk_image_set_from_file(asCPointer(), filename);
    }

    /**
     * Sets a `GtkImage` to show a `GIcon`.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_gicon] for details.
     * @param icon an icon
    */
    public void setFromGicon(@Nonnull ch.bailu.gtk.gio.Icon icon)  {
        JnaImage.INST().gtk_image_set_from_gicon(asCPointer(), asCPointerNotNull(icon));
    }

    /**
     * Sets a `GtkImage` to show a named icon.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_icon_name] for details.
     * @param icon_name an icon name
    */
    public void setFromIconName(@Nullable ch.bailu.gtk.type.Str icon_name)  {
        JnaImage.INST().gtk_image_set_from_icon_name(asCPointer(), asCPointer(icon_name));
    }

    /**
     * Sets a `GtkImage` to show a named icon.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_icon_name] for details.
     * @param icon_name an icon name
    */
    public void setFromIconName(String icon_name)  {
        JnaImage.INST().gtk_image_set_from_icon_name(asCPointer(), icon_name);
    }

    /**
     * Sets a `GtkImage` to show a `GdkPaintable`.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_paintable] for details.
     * @param paintable a `GdkPaintable`
    */
    public void setFromPaintable(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaImage.INST().gtk_image_set_from_paintable(asCPointer(), asCPointer(paintable));
    }

    /**
     * Sets a `GtkImage` to show a `GdkPixbuf`.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_pixbuf] for details.
     * <br>
     * <br>Note: This is a helper for [method&#64;Gtk.Image.set_from_paintable],
     * <br>and you can't get back the exact pixbuf once this is called,
     * <br>only a paintable.
     * @param pixbuf a `GdkPixbuf` or `NULL`
    */
    public void setFromPixbuf(@Nullable ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf)  {
        JnaImage.INST().gtk_image_set_from_pixbuf(asCPointer(), asCPointer(pixbuf));
    }

    /**
     * Sets a `GtkImage` to show a resource.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_resource] for details.
     * @param resource_path a resource path
    */
    public void setFromResource(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        JnaImage.INST().gtk_image_set_from_resource(asCPointer(), asCPointer(resource_path));
    }

    /**
     * Sets a `GtkImage` to show a resource.
     * <br>
     * <br>See [ctor&#64;Gtk.Image.new_from_resource] for details.
     * @param resource_path a resource path
    */
    public void setFromResource(String resource_path)  {
        JnaImage.INST().gtk_image_set_from_resource(asCPointer(), resource_path);
    }

    /**
     * Suggests an icon size to the theme for named icons.
     * @param icon_size the new icon size
    */
    public void setIconSize(int icon_size)  {
        JnaImage.INST().gtk_image_set_icon_size(asCPointer(), icon_size);
    }

    /**
     * Sets the pixel size to use for named icons.
     * <br>
     * <br>If the pixel size is set to a value != -1, it is used instead
     * <br>of the icon size set by [method&#64;Gtk.Image.set_from_icon_name].
     * @param pixel_size the new pixel size
    */
    public void setPixelSize(int pixel_size)  {
        JnaImage.INST().gtk_image_set_pixel_size(asCPointer(), pixel_size);
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    public static long getTypeID() { 
        return JnaImage.INST().gtk_image_get_type(); 
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
