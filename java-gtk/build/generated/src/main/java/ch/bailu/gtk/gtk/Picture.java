/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkPicture` widget displays a `GdkPaintable`.
 * <br>
 * <br>![An example GtkPicture](picture.png)
 * <br>
 * <br>Many convenience functions are provided to make pictures simple to use.
 * <br>For example, if you want to load an image from a file, and then display
 * <br>it, there’s a convenience function to do this:
 * <br>
 * <br>```c
 * <br>GtkWidget *widget = gtk_picture_new_for_filename (&quot;myfile.png&quot;);
 * <br>```
 * <br>
 * <br>If the file isn’t loaded successfully, the picture will contain a
 * <br>“broken image” icon similar to that used in many web browsers.
 * <br>If you want to handle errors in loading the file yourself,
 * <br>for example by displaying an error message, then load the image with
 * <br>[ctor&#64;Gdk.Texture.new_from_file], then create the `GtkPicture` with
 * <br>[ctor&#64;Gtk.Picture.new_for_paintable].
 * <br>
 * <br>Sometimes an application will want to avoid depending on external data
 * <br>files, such as image files. See the documentation of `GResource` for details.
 * <br>In this case, [ctor&#64;Gtk.Picture.new_for_resource] and
 * <br>[method&#64;Gtk.Picture.set_resource] should be used.
 * <br>
 * <br>`GtkPicture` displays an image at its natural size. See [class&#64;Gtk.Image]
 * <br>if you want to display a fixed-size image, such as an icon.
 * <br>
 * <br>&#35;&#35; Sizing the paintable
 * <br>
 * <br>You can influence how the paintable is displayed inside the `GtkPicture`
 * <br>by changing [property&#64;Gtk.Picture:content-fit]. See [enum&#64;Gtk.ContentFit]
 * <br>for details. [property&#64;Gtk.Picture:can-shrink] can be unset to make sure
 * <br>that paintables are never made smaller than their ideal size - but
 * <br>be careful if you do not know the size of the paintable in use (like
 * <br>when displaying user-loaded images). This can easily cause the picture to
 * <br>grow larger than the screen. And [property&#64;GtkWidget:halign] and
 * <br>[property&#64;GtkWidget:valign] can be used to make sure the paintable doesn't
 * <br>fill all available space but is instead displayed at its original size.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`GtkPicture` has a single CSS node with the name `picture`.
 * <br>
 * <br>&#35;&#35; Accessibility
 * <br>
 * <br>`GtkPicture` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Picture.html">https://docs.gtk.org/gtk4/class.Picture.html</a></p>
*/
public class Picture extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Picture.class.getCanonicalName());
    }

    public Picture(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPicture` displaying the given &#64;file.
     * <br>
     * <br>If the file isn’t found or can’t be loaded, the resulting
     * <br>`GtkPicture` is empty.
     * <br>
     * <br>If you need to detect failures to load the file, use
     * <br>[ctor&#64;Gdk.Texture.new_from_file] to load the file yourself,
     * <br>then create the `GtkPicture` from the texture.
     * @param file a `GFile`
     * @return a new `GtkPicture`
    */
    public static Picture newForFilePicture(@Nullable ch.bailu.gtk.gio.File file)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_file(asCPointer(file)));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForFile");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying the file &#64;filename.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Picture.new_for_file].
     * <br>See that function for details.
     * @param filename a filename
     * @return a new `GtkPicture`
    */
    public static Picture newForFilenamePicture(@Nullable ch.bailu.gtk.type.Str filename)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_filename(asCPointer(filename)));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForFilename");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying the file &#64;filename.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Picture.new_for_file].
     * <br>See that function for details.
     * @param filename a filename
     * @return a new `GtkPicture`
    */
    public static Picture newForFilenamePicture(String filename)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_filename(filename));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForFilename");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying &#64;paintable.
     * <br>
     * <br>The `GtkPicture` will track changes to the &#64;paintable and update
     * <br>its size and contents in response to it.
     * @param paintable a `GdkPaintable`
     * @return a new `GtkPicture`
    */
    public static Picture newForPaintablePicture(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_paintable(asCPointer(paintable)));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForPaintable");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying &#64;pixbuf.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Picture.new_for_paintable],
     * <br>See that function for details.
     * <br>
     * <br>The pixbuf must not be modified after passing it to this function.
     * @param pixbuf a `GdkPixbuf`
     * @return a new `GtkPicture`
    */
    public static Picture newForPixbufPicture(@Nullable ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_pixbuf(asCPointer(pixbuf)));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForPixbuf");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying the resource at &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Picture.new_for_file].
     * <br>See that function for details.
     * @param resource_path resource path to play back
     * @return a new `GtkPicture`
    */
    public static Picture newForResourcePicture(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_resource(asCPointer(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForResource");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new `GtkPicture` displaying the resource at &#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [ctor&#64;Gtk.Picture.new_for_file].
     * <br>See that function for details.
     * @param resource_path resource path to play back
     * @return a new `GtkPicture`
    */
    public static Picture newForResourcePicture(String resource_path)  {
        PointerContainer __self = cast(JnaPicture.INST().gtk_picture_new_for_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("Picture:newForResource");
        }
        return new Picture(__self);
    }        
    

    /**
     * Creates a new empty `GtkPicture` widget.
    */
    public Picture() {
        super(cast(JnaPicture.INST().gtk_picture_new()));
    }

    /**
     * Gets the alternative textual description of the picture.
     * <br>
     * <br>The returned string will be %NULL if the picture cannot be described textually.
     * @return the alternative textual description of &#64;self.
    */
    public ch.bailu.gtk.type.Str getAlternativeText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPicture.INST().gtk_picture_get_alternative_text(asCPointer())));
    }

    /**
     * Returns whether the `GtkPicture` respects its contents size.
     * @return %TRUE if the picture can be made smaller than its contents
    */
    public boolean getCanShrink()  {
        return JnaPicture.INST().gtk_picture_get_can_shrink(asCPointer());
    }

    /**
     * Returns the fit mode for the content of the `GtkPicture`.
     * <br>
     * <br>See [enum&#64;Gtk.ContentFit] for details.
     * @return the content fit mode
    */
    public int getContentFit()  {
        return JnaPicture.INST().gtk_picture_get_content_fit(asCPointer());
    }

    /**
     * Gets the `GFile` currently displayed if &#64;self is displaying a file.
     * <br>
     * <br>If &#64;self is not displaying a file, for example when
     * <br>[method&#64;Gtk.Picture.set_paintable] was used, then %NULL is returned.
     * @return The `GFile` displayed by &#64;self.
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaPicture.INST().gtk_picture_get_file(asCPointer())));
    }

    /**
     * Gets the `GdkPaintable` being displayed by the `GtkPicture`.
     * @return the displayed paintable
    */
    public ch.bailu.gtk.gdk.Paintable getPaintable()  {
        return new ch.bailu.gtk.gdk.Paintable(new PointerContainer(JnaPicture.INST().gtk_picture_get_paintable(asCPointer())));
    }

    /**
     * Sets an alternative textual description for the picture contents.
     * <br>
     * <br>It is equivalent to the &quot;alt&quot; attribute for images on websites.
     * <br>
     * <br>This text will be made available to accessibility tools.
     * <br>
     * <br>If the picture cannot be described textually, set this property to %NULL.
     * @param alternative_text a textual description of the contents
    */
    public void setAlternativeText(@Nullable ch.bailu.gtk.type.Str alternative_text)  {
        JnaPicture.INST().gtk_picture_set_alternative_text(asCPointer(), asCPointer(alternative_text));
    }

    /**
     * Sets an alternative textual description for the picture contents.
     * <br>
     * <br>It is equivalent to the &quot;alt&quot; attribute for images on websites.
     * <br>
     * <br>This text will be made available to accessibility tools.
     * <br>
     * <br>If the picture cannot be described textually, set this property to %NULL.
     * @param alternative_text a textual description of the contents
    */
    public void setAlternativeText(String alternative_text)  {
        JnaPicture.INST().gtk_picture_set_alternative_text(asCPointer(), alternative_text);
    }

    /**
     * If set to %TRUE, the &#64;self can be made smaller than its contents.
     * <br>
     * <br>The contents will then be scaled down when rendering.
     * <br>
     * <br>If you want to still force a minimum size manually, consider using
     * <br>[method&#64;Gtk.Widget.set_size_request].
     * <br>
     * <br>Also of note is that a similar function for growing does not exist
     * <br>because the grow behavior can be controlled via
     * <br>[method&#64;Gtk.Widget.set_halign] and [method&#64;Gtk.Widget.set_valign].
     * @param can_shrink if &#64;self can be made smaller than its contents
    */
    public void setCanShrink(boolean can_shrink)  {
        JnaPicture.INST().gtk_picture_set_can_shrink(asCPointer(), can_shrink);
    }

    /**
     * Sets how the content should be resized to fit the `GtkPicture`.
     * <br>
     * <br>See [enum&#64;Gtk.ContentFit] for details.
     * @param content_fit the content fit mode
    */
    public void setContentFit(int content_fit)  {
        JnaPicture.INST().gtk_picture_set_content_fit(asCPointer(), content_fit);
    }

    /**
     * Makes &#64;self load and display &#64;file.
     * <br>
     * <br>See [ctor&#64;Gtk.Picture.new_for_file] for details.
     * @param file a `GFile`
    */
    public void setFile(@Nullable ch.bailu.gtk.gio.File file)  {
        JnaPicture.INST().gtk_picture_set_file(asCPointer(), asCPointer(file));
    }

    /**
     * Makes &#64;self load and display the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Picture.set_file].
     * @param filename the filename to play
    */
    public void setFilename(@Nullable ch.bailu.gtk.type.Str filename)  {
        JnaPicture.INST().gtk_picture_set_filename(asCPointer(), asCPointer(filename));
    }

    /**
     * Makes &#64;self load and display the given &#64;filename.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Picture.set_file].
     * @param filename the filename to play
    */
    public void setFilename(String filename)  {
        JnaPicture.INST().gtk_picture_set_filename(asCPointer(), filename);
    }

    /**
     * Makes &#64;self display the given &#64;paintable.
     * <br>
     * <br>If &#64;paintable is %NULL, nothing will be displayed.
     * <br>
     * <br>See [ctor&#64;Gtk.Picture.new_for_paintable] for details.
     * @param paintable a `GdkPaintable`
    */
    public void setPaintable(@Nullable ch.bailu.gtk.gdk.Paintable paintable)  {
        JnaPicture.INST().gtk_picture_set_paintable(asCPointer(), asCPointer(paintable));
    }

    /**
     * Sets a `GtkPicture` to show a `GdkPixbuf`.
     * <br>
     * <br>See [ctor&#64;Gtk.Picture.new_for_pixbuf] for details.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Picture.set_paintable].
     * @param pixbuf a `GdkPixbuf`
    */
    public void setPixbuf(@Nullable ch.bailu.gtk.gdkpixbuf.Pixbuf pixbuf)  {
        JnaPicture.INST().gtk_picture_set_pixbuf(asCPointer(), asCPointer(pixbuf));
    }

    /**
     * Makes &#64;self load and display the resource at the given
     * <br>&#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Picture.set_file].
     * @param resource_path the resource to set
    */
    public void setResource(@Nullable ch.bailu.gtk.type.Str resource_path)  {
        JnaPicture.INST().gtk_picture_set_resource(asCPointer(), asCPointer(resource_path));
    }

    /**
     * Makes &#64;self load and display the resource at the given
     * <br>&#64;resource_path.
     * <br>
     * <br>This is a utility function that calls [method&#64;Gtk.Picture.set_file].
     * @param resource_path the resource to set
    */
    public void setResource(String resource_path)  {
        JnaPicture.INST().gtk_picture_set_resource(asCPointer(), resource_path);
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
        return JnaPicture.INST().gtk_picture_get_type(); 
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

[MethodModel:cb-deprecated:getKeepAspectRatio:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]

[MethodModel:cb-deprecated:setKeepAspectRatio:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]
*/
