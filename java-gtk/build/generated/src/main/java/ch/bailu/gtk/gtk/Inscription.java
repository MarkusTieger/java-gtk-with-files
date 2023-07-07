/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkInscription` is a widget to show text in a predefined area.
 * <br>
 * <br>You likely want to use `GtkLabel` instead as this widget is intended only
 * <br>for a small subset of use cases. The main scenario envisaged is inside lists
 * <br>such as `GtkColumnView`.
 * <br>
 * <br>While a `GtkLabel` sizes itself depending on the text that is displayed,
 * <br>`GtkInscription` is given a size and inscribes the given text into that
 * <br>space as well as it can.
 * <br>
 * <br>Users of this widget should take care to plan behaviour for the common case
 * <br>where the text doesn't fit exactly in the allocated space, .
 * <p><a href="https://docs.gtk.org/gtk4/class.Inscription.html">https://docs.gtk.org/gtk4/class.Inscription.html</a></p>
*/
public class Inscription extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Inscription.class.getCanonicalName());
    }

    public Inscription(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkInscription` with the given text.
     * @param text The text to display.
    */
    public Inscription(@Nullable ch.bailu.gtk.type.Str text) {
        super(cast(JnaInscription.INST().gtk_inscription_new(asCPointer(text))));
    }

    /**
     * Creates a new `GtkInscription` with the given text.
     * @param text The text to display.
    */
    public Inscription(String text) {
        super(cast(JnaInscription.INST().gtk_inscription_new(text)));
    }

    /**
     * Gets the inscription's attribute list.
     * @return the attribute list
    */
    public ch.bailu.gtk.pango.AttrList getAttributes()  {
        return new ch.bailu.gtk.pango.AttrList(new PointerContainer(JnaInscription.INST().gtk_inscription_get_attributes(asCPointer())));
    }

    /**
     * Gets the `min-chars` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:min-chars] property.
     * @return the min-chars property
    */
    public int getMinChars()  {
        return JnaInscription.INST().gtk_inscription_get_min_chars(asCPointer());
    }

    /**
     * Gets the `min-lines` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:min-lines] property.
     * @return the min-lines property
    */
    public int getMinLines()  {
        return JnaInscription.INST().gtk_inscription_get_min_lines(asCPointer());
    }

    /**
     * Gets the `nat-chars` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:nat-chars] property.
     * @return the nat-chars property
    */
    public int getNatChars()  {
        return JnaInscription.INST().gtk_inscription_get_nat_chars(asCPointer());
    }

    /**
     * Gets the `nat-lines` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:nat-lines] property.
     * @return the nat-lines property
    */
    public int getNatLines()  {
        return JnaInscription.INST().gtk_inscription_get_nat_lines(asCPointer());
    }

    /**
     * Gets the text that is displayed.
     * @return The displayed text
    */
    public ch.bailu.gtk.type.Str getText()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaInscription.INST().gtk_inscription_get_text(asCPointer())));
    }

    /**
     * Gets the inscription's overflow method.
     * @return the overflow method
    */
    public int getTextOverflow()  {
        return JnaInscription.INST().gtk_inscription_get_text_overflow(asCPointer());
    }

    /**
     * Returns line wrap mode used by the inscription.
     * <br>
     * <br>See [method&#64;Gtk.Inscription.set_wrap_mode].
     * @return the line wrap mode
    */
    public int getWrapMode()  {
        return JnaInscription.INST().gtk_inscription_get_wrap_mode(asCPointer());
    }

    /**
     * Gets the `xalign` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:xalign] property.
     * @return the xalign property
    */
    public float getXalign()  {
        return JnaInscription.INST().gtk_inscription_get_xalign(asCPointer());
    }

    /**
     * Gets the `yalign` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:yalign] property.
     * @return the yalign property
    */
    public float getYalign()  {
        return JnaInscription.INST().gtk_inscription_get_yalign(asCPointer());
    }

    /**
     * Apply attributes to the inscription text.
     * <br>
     * <br>These attributes will not be evaluated for sizing the inscription.
     * @param attrs a [struct&#64;Pango.AttrList]
    */
    public void setAttributes(@Nullable ch.bailu.gtk.pango.AttrList attrs)  {
        JnaInscription.INST().gtk_inscription_set_attributes(asCPointer(), asCPointer(attrs));
    }

    /**
     * Utility function to set the text and attributes to be displayed.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:markup] property.
     * @param markup The markup to display
    */
    public void setMarkup(@Nullable ch.bailu.gtk.type.Str markup)  {
        JnaInscription.INST().gtk_inscription_set_markup(asCPointer(), asCPointer(markup));
    }

    /**
     * Utility function to set the text and attributes to be displayed.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:markup] property.
     * @param markup The markup to display
    */
    public void setMarkup(String markup)  {
        JnaInscription.INST().gtk_inscription_set_markup(asCPointer(), markup);
    }

    /**
     * Sets the `min-chars` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:min-chars] property.
     * @param min_chars the minimum number of characters that should fit, approximately
    */
    public void setMinChars(int min_chars)  {
        JnaInscription.INST().gtk_inscription_set_min_chars(asCPointer(), min_chars);
    }

    /**
     * Sets the `min-lines` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:min-lines] property.
     * @param min_lines the minimum number of lines that should fit, approximately
    */
    public void setMinLines(int min_lines)  {
        JnaInscription.INST().gtk_inscription_set_min_lines(asCPointer(), min_lines);
    }

    /**
     * Sets the `nat-chars` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:nat-chars] property.
     * @param nat_chars the number of characters that should ideally fit, approximately
    */
    public void setNatChars(int nat_chars)  {
        JnaInscription.INST().gtk_inscription_set_nat_chars(asCPointer(), nat_chars);
    }

    /**
     * Sets the `nat-lines` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:nat-lines] property.
     * @param nat_lines the number of lines that should ideally fit
    */
    public void setNatLines(int nat_lines)  {
        JnaInscription.INST().gtk_inscription_set_nat_lines(asCPointer(), nat_lines);
    }

    /**
     * Sets the text to be displayed.
     * @param text The text to display
    */
    public void setText(@Nullable ch.bailu.gtk.type.Str text)  {
        JnaInscription.INST().gtk_inscription_set_text(asCPointer(), asCPointer(text));
    }

    /**
     * Sets the text to be displayed.
     * @param text The text to display
    */
    public void setText(String text)  {
        JnaInscription.INST().gtk_inscription_set_text(asCPointer(), text);
    }

    /**
     * Sets what to do when the text doesn't fit.
     * @param overflow the overflow method to use
    */
    public void setTextOverflow(int overflow)  {
        JnaInscription.INST().gtk_inscription_set_text_overflow(asCPointer(), overflow);
    }

    /**
     * Controls how line wrapping is done.
     * @param wrap_mode the line wrapping mode
    */
    public void setWrapMode(int wrap_mode)  {
        JnaInscription.INST().gtk_inscription_set_wrap_mode(asCPointer(), wrap_mode);
    }

    /**
     * Sets the `xalign` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:xalign] property.
     * @param xalign the new xalign value, between 0 and 1
    */
    public void setXalign(float xalign)  {
        JnaInscription.INST().gtk_inscription_set_xalign(asCPointer(), xalign);
    }

    /**
     * Sets the `yalign` of the inscription.
     * <br>
     * <br>See the [property&#64;Gtk.Inscription:yalign] property.
     * @param yalign the new yalign value, between 0 and 1
    */
    public void setYalign(float yalign)  {
        JnaInscription.INST().gtk_inscription_set_yalign(asCPointer(), yalign);
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
        return JnaInscription.INST().gtk_inscription_get_type(); 
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
