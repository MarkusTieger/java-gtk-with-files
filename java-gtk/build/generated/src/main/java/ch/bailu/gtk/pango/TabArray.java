/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoTabArray` contains an array of tab stops.
 * <br>
 * <br>`PangoTabArray` can be used to set tab stops in a `PangoLayout`.
 * <br>Each tab stop has an alignment, a position, and optionally
 * <br>a character to use as decimal point.
 * <p><a href="https://docs.gtk.org/Pango/struct.TabArray.html">https://docs.gtk.org/Pango/struct.TabArray.html</a></p>
*/
public class TabArray extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TabArray.class.getCanonicalName());
    }

    public TabArray(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `PangoTabArray` and allows you to specify the alignment
     * <br>and position of each tab stop.
     * <br>
     * <br>You **must** provide an alignment and position for &#64;size tab stops.
     * @param size number of tab stops in the array
     * @param positions_in_pixels whether positions are in pixel units
     * @param first_alignment alignment of first tab stop
     * @param first_position position of first tab stop
     * @param _elipse additional alignment/position pairs
     * @return the newly allocated `PangoTabArray`, which should   be freed with [method&#64;Pango.TabArray.free].
    */
    public static TabArray newWithPositionsTabArray(int size, boolean positions_in_pixels, int first_alignment, int first_position, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaTabArray.INST().pango_tab_array_new_with_positions(size, positions_in_pixels, first_alignment, first_position, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("TabArray:newWithPositions");
        }
        return new TabArray(__self);
    }        
    

    /**
     * Creates an array of &#64;initial_size tab stops.
     * <br>
     * <br>Tab stops are specified in pixel units if &#64;positions_in_pixels is %TRUE,
     * <br>otherwise in Pango units. All stops are initially at position 0.
     * @param initial_size Initial number of tab stops to allocate, can be 0
     * @param positions_in_pixels whether positions are in pixel units
    */
    public TabArray(int initial_size, boolean positions_in_pixels) {
        super(cast(JnaTabArray.INST().pango_tab_array_new(initial_size, positions_in_pixels)));
    }

    /**
     * Copies a `PangoTabArray`.
     * @return the newly allocated `PangoTabArray`, which should   be freed with [method&#64;Pango.TabArray.free].
    */
    public TabArray copy()  {
        return new TabArray(new PointerContainer(JnaTabArray.INST().pango_tab_array_copy(asCPointer())));
    }

    /**
     * Frees a tab array and associated resources.
    */
    public void free()  {
        JnaTabArray.INST().pango_tab_array_free(asCPointer());
    }

    /**
     * Gets the Unicode character to use as decimal point.
     * <br>
     * <br>This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * <br>which align content at the first occurrence of the decimal point
     * <br>character.
     * <br>
     * <br>The default value of 0 means that Pango will use the
     * <br>decimal point according to the current locale.
     * @param tab_index the index of a tab stop
     * @return 
    */
    public byte getDecimalPoint(int tab_index)  {
        return JnaTabArray.INST().pango_tab_array_get_decimal_point(asCPointer(), tab_index);
    }

    /**
     * Returns %TRUE if the tab positions are in pixels,
     * <br>%FALSE if they are in Pango units.
     * @return whether positions are in pixels.
    */
    public boolean getPositionsInPixels()  {
        return JnaTabArray.INST().pango_tab_array_get_positions_in_pixels(asCPointer());
    }

    /**
     * Gets the number of tab stops in &#64;tab_array.
     * @return the number of tab stops in the array.
    */
    public int getSize()  {
        return JnaTabArray.INST().pango_tab_array_get_size(asCPointer());
    }

    /**
     * Gets the alignment and position of a tab stop.
     * @param tab_index tab stop index
     * @param alignment location to store alignment
     * @param location location to store tab position
    */
    public void getTab(int tab_index, @Nullable ch.bailu.gtk.type.Int alignment, @Nullable ch.bailu.gtk.type.Int location)  {
        JnaTabArray.INST().pango_tab_array_get_tab(asCPointer(), tab_index, asCPointer(alignment), asCPointer(location));
    }

    /**
     * Resizes a tab array.
     * <br>
     * <br>You must subsequently initialize any tabs
     * <br>that were added as a result of growing the array.
     * @param new_size new size of the array
    */
    public void resize(int new_size)  {
        JnaTabArray.INST().pango_tab_array_resize(asCPointer(), new_size);
    }

    /**
     * Sets the Unicode character to use as decimal point.
     * <br>
     * <br>This is only relevant for tabs with %PANGO_TAB_DECIMAL alignment,
     * <br>which align content at the first occurrence of the decimal point
     * <br>character.
     * <br>
     * <br>By default, Pango uses the decimal point according
     * <br>to the current locale.
     * @param tab_index the index of a tab stop
     * @param decimal_point the decimal point to use
    */
    public void setDecimalPoint(int tab_index, byte decimal_point)  {
        JnaTabArray.INST().pango_tab_array_set_decimal_point(asCPointer(), tab_index, decimal_point);
    }

    /**
     * Sets whether positions in this array are specified in
     * <br>pixels.
     * @param positions_in_pixels whether positions are in pixels
    */
    public void setPositionsInPixels(boolean positions_in_pixels)  {
        JnaTabArray.INST().pango_tab_array_set_positions_in_pixels(asCPointer(), positions_in_pixels);
    }

    /**
     * Sets the alignment and location of a tab stop.
     * @param tab_index the index of a tab stop
     * @param alignment tab alignment
     * @param location tab location in Pango units
    */
    public void setTab(int tab_index, int alignment, int location)  {
        JnaTabArray.INST().pango_tab_array_set_tab(asCPointer(), tab_index, alignment, location);
    }

    /**
     * Utility function to ensure that the tab stops are in increasing order.
    */
    public void sort()  {
        JnaTabArray.INST().pango_tab_array_sort(asCPointer());
    }

    /**
     * Serializes a `PangoTabArray` to a string.
     * <br>
     * <br>No guarantees are made about the format of the string,
     * <br>it may change between Pango versions.
     * <br>
     * <br>The intended use of this function is testing and
     * <br>debugging. The format is not meant as a permanent
     * <br>storage format.
     * @return a newly allocated string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTabArray.INST().pango_tab_array_to_string(asCPointer())));
    }

    /**
     * Deserializes a `PangoTabArray` from a string.
     * <br>
     * <br>This is the counterpart to [method&#64;Pango.TabArray.to_string].
     * <br>See that functions for details about the format.
     * @param text a string
     * @return a new `PangoTabArray`
    */
    public static TabArray fromString(@Nonnull ch.bailu.gtk.type.Str text)  {
        return new TabArray(new PointerContainer(JnaTabArray.INST().pango_tab_array_from_string(asCPointerNotNull(text))));
    }

    public static long getTypeID() { 
        return JnaTabArray.INST().pango_tab_array_get_type(); 
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

[MethodModel:java-type-not-supported:getTabs:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gw:Int:{c:gint*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gint**}}:{j:}]
*/
