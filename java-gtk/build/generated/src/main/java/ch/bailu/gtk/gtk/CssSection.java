/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Defines a part of a CSS document.
 * <br>
 * <br>Because sections are nested into one another, you can use
 * <br>[method&#64;CssSection.get_parent] to get the containing region.
 * <p><a href="https://docs.gtk.org/gtk4/struct.CssSection.html">https://docs.gtk.org/gtk4/struct.CssSection.html</a></p>
*/
public class CssSection extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CssSection.class.getCanonicalName());
    }

    public CssSection(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCssSection` referring to the section
     * <br>in the given `file` from the `start` location to the
     * <br>`end` location.
     * @param file The file this section refers to
     * @param start The start location
     * @param end The end location
    */
    public CssSection(@Nullable ch.bailu.gtk.gio.File file, @Nonnull CssLocation start, @Nonnull CssLocation end) {
        super(cast(JnaCssSection.INST().gtk_css_section_new(asCPointer(file), asCPointerNotNull(start), asCPointerNotNull(end))));
    }

    /**
     * Returns the location in the CSS document where this section ends.
     * @return The end location of   this section
    */
    public CssLocation getEndLocation()  {
        return new CssLocation(new PointerContainer(JnaCssSection.INST().gtk_css_section_get_end_location(asCPointer())));
    }

    /**
     * Gets the file that &#64;section was parsed from.
     * <br>
     * <br>If no such file exists, for example because the CSS was loaded via
     * <br>[method&#64;Gtk.CssProvider.load_from_data], then `NULL` is returned.
     * @return the `GFile` from which the `section`   was parsed
    */
    public ch.bailu.gtk.gio.File getFile()  {
        return new ch.bailu.gtk.gio.File(new PointerContainer(JnaCssSection.INST().gtk_css_section_get_file(asCPointer())));
    }

    /**
     * Gets the parent section for the given `section`.
     * <br>
     * <br>The parent section is the section that contains this `section`. A special
     * <br>case are sections of  type `GTK_CSS_SECTION_DOCUMEN`T. Their parent will
     * <br>either be `NULL` if they are the original CSS document that was loaded by
     * <br>[method&#64;Gtk.CssProvider.load_from_file] or a section of type
     * <br>`GTK_CSS_SECTION_IMPORT` if it was loaded with an `&#64;import` rule from
     * <br>a different file.
     * @return the parent section
    */
    public CssSection getParent()  {
        return new CssSection(new PointerContainer(JnaCssSection.INST().gtk_css_section_get_parent(asCPointer())));
    }

    /**
     * Returns the location in the CSS document where this section starts.
     * @return The start location of   this section
    */
    public CssLocation getStartLocation()  {
        return new CssLocation(new PointerContainer(JnaCssSection.INST().gtk_css_section_get_start_location(asCPointer())));
    }

    /**
     * Prints the `section` into `string` in a human-readable form.
     * <br>
     * <br>This is a form like `gtk.css:32:1-23` to denote line 32, characters
     * <br>1 to 23 in the file `gtk.css`.
     * @param string a `GString` to print to
    */
    public void print(@Nonnull ch.bailu.gtk.glib.GString string)  {
        JnaCssSection.INST().gtk_css_section_print(asCPointer(), asCPointerNotNull(string));
    }

    /**
     * Increments the reference count on `section`.
     * @return the CSS section itself.
    */
    public CssSection ref()  {
        return new CssSection(new PointerContainer(JnaCssSection.INST().gtk_css_section_ref(asCPointer())));
    }

    /**
     * Prints the section into a human-readable text form using
     * <br>[method&#64;Gtk.CssSection.print].
     * @return A new string.
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaCssSection.INST().gtk_css_section_to_string(asCPointer())));
    }

    /**
     * Decrements the reference count on `section`, freeing the
     * <br>structure if the reference count reaches 0.
    */
    public void unref()  {
        JnaCssSection.INST().gtk_css_section_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaCssSection.INST().gtk_css_section_get_type(); 
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
record-type
all-fields-supported
*/
