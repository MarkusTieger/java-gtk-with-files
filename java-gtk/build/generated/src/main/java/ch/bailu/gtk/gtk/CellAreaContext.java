/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Stores geometrical information for a series of rows in a GtkCellArea
 * <br>
 * <br>The `GtkCellAreaContext` object is created by a given `GtkCellArea`
 * <br>implementation via its `GtkCellAreaClass.create_context()` virtual
 * <br>method and is used to store cell sizes and alignments for a series of
 * <br>`GtkTreeModel` rows that are requested and rendered in the same context.
 * <br>
 * <br>`GtkCellLayout` widgets can create any number of contexts in which to
 * <br>request and render groups of data rows. However, it’s important that the
 * <br>same context which was used to request sizes for a given `GtkTreeModel`
 * <br>row also be used for the same row when calling other `GtkCellArea` APIs
 * <br>such as gtk_cell_area_render() and gtk_cell_area_event().
 * <p><a href="https://docs.gtk.org/gtk4/class.CellAreaContext.html">https://docs.gtk.org/gtk4/class.CellAreaContext.html</a></p>
*/
public class CellAreaContext extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellAreaContext.class.getCanonicalName());
    }

    public CellAreaContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a width and/or a height for all rows which are to be
     * <br>rendered with &#64;context.
     * <br>
     * <br>Usually allocation is performed only horizontally or sometimes
     * <br>vertically since a group of rows are usually rendered side by
     * <br>side vertically or horizontally and share either the same width
     * <br>or the same height. Sometimes they are allocated in both horizontal
     * <br>and vertical orientations producing a homogeneous effect of the
     * <br>rows. This is generally the case for `GtkTreeView` when
     * <br>`GtkTreeView:fixed-height-mode` is enabled.
     * @param width the allocated width for all `GtkTreeModel` rows rendered   with &#64;context, or -1
     * @param height the allocated height for all `GtkTreeModel` rows rendered   with &#64;context, or -1
    */
    public void allocate(int width, int height)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_allocate(asCPointer(), width, height);
    }

    /**
     * Fetches the current allocation size for &#64;context.
     * <br>
     * <br>If the context was not allocated in width or height, or if the
     * <br>context was recently reset with gtk_cell_area_context_reset(),
     * <br>the returned value will be -1.
     * @param width location to store the allocated width
     * @param height location to store the allocated height
    */
    public void getAllocation(@Nullable ch.bailu.gtk.type.Int width, @Nullable ch.bailu.gtk.type.Int height)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_get_allocation(asCPointer(), asCPointer(width), asCPointer(height));
    }

    /**
     * Fetches the `GtkCellArea` this &#64;context was created by.
     * <br>
     * <br>This is generally unneeded by layouting widgets; however,
     * <br>it is important for the context implementation itself to
     * <br>fetch information about the area it is being used for.
     * <br>
     * <br>For instance at `GtkCellAreaContextClass.allocate()` time
     * <br>it’s important to know details about any cell spacing
     * <br>that the `GtkCellArea` is configured with in order to
     * <br>compute a proper allocation.
     * @return the `GtkCellArea` this context was created by.
    */
    public CellArea getArea()  {
        return new CellArea(new PointerContainer(JnaCellAreaContext.INST().gtk_cell_area_context_get_area(asCPointer())));
    }

    /**
     * Gets the accumulative preferred height for all rows which have been
     * <br>requested with this context.
     * <br>
     * <br>After gtk_cell_area_context_reset() is called and/or before ever
     * <br>requesting the size of a `GtkCellArea`, the returned values are 0.
     * @param minimum_height location to store the minimum height
     * @param natural_height location to store the natural height
    */
    public void getPreferredHeight(@Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_get_preferred_height(asCPointer(), asCPointer(minimum_height), asCPointer(natural_height));
    }

    /**
     * Gets the accumulative preferred height for &#64;width for all rows
     * <br>which have been requested for the same said &#64;width with this context.
     * <br>
     * <br>After gtk_cell_area_context_reset() is called and/or before ever
     * <br>requesting the size of a `GtkCellArea`, the returned values are -1.
     * @param width a proposed width for allocation
     * @param minimum_height location to store the minimum height
     * @param natural_height location to store the natural height
    */
    public void getPreferredHeightForWidth(int width, @Nullable ch.bailu.gtk.type.Int minimum_height, @Nullable ch.bailu.gtk.type.Int natural_height)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_get_preferred_height_for_width(asCPointer(), width, asCPointer(minimum_height), asCPointer(natural_height));
    }

    /**
     * Gets the accumulative preferred width for all rows which have been
     * <br>requested with this context.
     * <br>
     * <br>After gtk_cell_area_context_reset() is called and/or before ever
     * <br>requesting the size of a `GtkCellArea`, the returned values are 0.
     * @param minimum_width location to store the minimum width
     * @param natural_width location to store the natural width
    */
    public void getPreferredWidth(@Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_get_preferred_width(asCPointer(), asCPointer(minimum_width), asCPointer(natural_width));
    }

    /**
     * Gets the accumulative preferred width for &#64;height for all rows which
     * <br>have been requested for the same said &#64;height with this context.
     * <br>
     * <br>After gtk_cell_area_context_reset() is called and/or before ever
     * <br>requesting the size of a `GtkCellArea`, the returned values are -1.
     * @param height a proposed height for allocation
     * @param minimum_width location to store the minimum width
     * @param natural_width location to store the natural width
    */
    public void getPreferredWidthForHeight(int height, @Nullable ch.bailu.gtk.type.Int minimum_width, @Nullable ch.bailu.gtk.type.Int natural_width)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_get_preferred_width_for_height(asCPointer(), height, asCPointer(minimum_width), asCPointer(natural_width));
    }

    /**
     * Causes the minimum and/or natural height to grow if the new
     * <br>proposed sizes exceed the current minimum and natural height.
     * <br>
     * <br>This is used by `GtkCellAreaContext` implementations during
     * <br>the request process over a series of `GtkTreeModel` rows to
     * <br>progressively push the requested height over a series of
     * <br>gtk_cell_area_get_preferred_height() requests.
     * @param minimum_height the proposed new minimum height for &#64;context
     * @param natural_height the proposed new natural height for &#64;context
    */
    public void pushPreferredHeight(int minimum_height, int natural_height)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_push_preferred_height(asCPointer(), minimum_height, natural_height);
    }

    /**
     * Causes the minimum and/or natural width to grow if the new
     * <br>proposed sizes exceed the current minimum and natural width.
     * <br>
     * <br>This is used by `GtkCellAreaContext` implementations during
     * <br>the request process over a series of `GtkTreeModel` rows to
     * <br>progressively push the requested width over a series of
     * <br>gtk_cell_area_get_preferred_width() requests.
     * @param minimum_width the proposed new minimum width for &#64;context
     * @param natural_width the proposed new natural width for &#64;context
    */
    public void pushPreferredWidth(int minimum_width, int natural_width)  {
        JnaCellAreaContext.INST().gtk_cell_area_context_push_preferred_width(asCPointer(), minimum_width, natural_width);
    }

    /**
     * Resets any previously cached request and allocation
     * <br>data.
     * <br>
     * <br>When underlying `GtkTreeModel` data changes its
     * <br>important to reset the context if the content
     * <br>size is allowed to shrink. If the content size
     * <br>is only allowed to grow (this is usually an option
     * <br>for views rendering large data stores as a measure
     * <br>of optimization), then only the row that changed
     * <br>or was inserted needs to be (re)requested with
     * <br>gtk_cell_area_get_preferred_width().
     * <br>
     * <br>When the new overall size of the context requires
     * <br>that the allocated size changes (or whenever this
     * <br>allocation changes at all), the variable row
     * <br>sizes need to be re-requested for every row.
     * <br>
     * <br>For instance, if the rows are displayed all with
     * <br>the same width from top to bottom then a change
     * <br>in the allocated width necessitates a recalculation
     * <br>of all the displayed row heights using
     * <br>gtk_cell_area_get_preferred_height_for_width().
    */
    public void reset()  {
        JnaCellAreaContext.INST().gtk_cell_area_context_reset(asCPointer());
    }

    public static long getTypeID() { 
        return JnaCellAreaContext.INST().gtk_cell_area_context_get_type(); 
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
