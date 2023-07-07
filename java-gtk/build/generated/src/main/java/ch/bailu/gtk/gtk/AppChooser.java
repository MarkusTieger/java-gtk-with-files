/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkAppChooser` is an interface for widgets which allow the user to
 * <br>choose an application.
 * <br>
 * <br>The main objects that implement this interface are
 * <br>[class&#64;Gtk.AppChooserWidget],
 * <br>[class&#64;Gtk.AppChooserDialog] and [class&#64;Gtk.AppChooserButton].
 * <br>
 * <br>Applications are represented by GIO `GAppInfo` objects here.
 * <br>GIO has a concept of recommended and fallback applications for a
 * <br>given content type. Recommended applications are those that claim
 * <br>to handle the content type itself, while fallback also includes
 * <br>applications that handle a more generic content type. GIO also
 * <br>knows the default and last-used application for a given content
 * <br>type. The `GtkAppChooserWidget` provides detailed control over
 * <br>whether the shown list of applications should include default,
 * <br>recommended or fallback applications.
 * <br>
 * <br>To obtain the application that has been selected in a `GtkAppChooser`,
 * <br>use [method&#64;Gtk.AppChooser.get_app_info].
 * <p><a href="https://docs.gtk.org/gtk4/iface.AppChooser.html">https://docs.gtk.org/gtk4/iface.AppChooser.html</a></p>
*/
public class AppChooser extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppChooser.class.getCanonicalName());
    }

    public AppChooser(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns the currently selected application.
     * @return a `GAppInfo` for the   currently selected application
    */
    public ch.bailu.gtk.gio.AppInfo getAppInfo()  {
        return new ch.bailu.gtk.gio.AppInfo(new PointerContainer(JnaAppChooser.INST().gtk_app_chooser_get_app_info(asCPointer())));
    }

    /**
     * Returns the content type for which the `GtkAppChooser`
     * <br>shows applications.
     * @return the content type of &#64;self. Free with g_free()
    */
    public ch.bailu.gtk.type.Str getContentType()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaAppChooser.INST().gtk_app_chooser_get_content_type(asCPointer())));
    }

    /**
     * Reloads the list of applications.
    */
    public void refresh()  {
        JnaAppChooser.INST().gtk_app_chooser_refresh(asCPointer());
    }

    public static long getTypeID() { 
        return JnaAppChooser.INST().gtk_app_chooser_get_type(); 
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
*/
