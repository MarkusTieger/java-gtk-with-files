/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget displaying a single row of a GtkTreeModel
 * <br>
 * <br>A `GtkCellView` displays a single row of a `GtkTreeModel` using a `GtkCellArea`
 * <br>and `GtkCellAreaContext`. A `GtkCellAreaContext` can be provided to the
 * <br>`GtkCellView` at construction time in order to keep the cellview in context
 * <br>of a group of cell views, this ensures that the renderers displayed will
 * <br>be properly aligned with each other (like the aligned cells in the menus
 * <br>of `GtkComboBox`).
 * <br>
 * <br>`GtkCellView` is `GtkOrientable` in order to decide in which orientation
 * <br>the underlying `GtkCellAreaContext` should be allocated. Taking the `GtkComboBox`
 * <br>menu as an example, cellviews should be oriented horizontally if the menus are
 * <br>listed top-to-bottom and thus all share the same width but may have separate
 * <br>individual heights (left-to-right menus should be allocated vertically since
 * <br>they all share the same height but may have variable widths).
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>GtkCellView has a single CSS node with name cellview.
 * <p><a href="https://docs.gtk.org/gtk4/class.CellView.html">https://docs.gtk.org/gtk4/class.CellView.html</a></p>
*/
public class CellView extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CellView.class.getCanonicalName());
    }

    public CellView(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkCellView` widget with a specific `GtkCellArea`
     * <br>to layout cells and a specific `GtkCellAreaContext`.
     * <br>
     * <br>Specifying the same context for a handful of cells lets
     * <br>the underlying area synchronize the geometry for those cells,
     * <br>in this way alignments with cellviews for other rows are
     * <br>possible.
     * @param area the `GtkCellArea` to layout cells
     * @param context the `GtkCellAreaContext` in which to calculate cell geometry
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithContextCellView(@Nonnull CellArea area, @Nonnull CellAreaContext context)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_context(asCPointerNotNull(area), asCPointerNotNull(context)));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithContext");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * <br>to it, and makes it show &#64;markup. The text can be marked up with
     * <br>the [Pango text markup language](https://docs.gtk.org/Pango/pango_markup.html).
     * @param markup the text to display in the cell view
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithMarkupCellView(@Nonnull ch.bailu.gtk.type.Str markup)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_markup(asCPointerNotNull(markup)));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithMarkup");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * <br>to it, and makes it show &#64;markup. The text can be marked up with
     * <br>the [Pango text markup language](https://docs.gtk.org/Pango/pango_markup.html).
     * @param markup the text to display in the cell view
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithMarkupCellView(String markup)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_markup(markup));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithMarkup");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * <br>to it, and makes it show &#64;text.
     * @param text the text to display in the cell view
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithTextCellView(@Nonnull ch.bailu.gtk.type.Str text)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_text(asCPointerNotNull(text)));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithText");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * <br>to it, and makes it show &#64;text.
     * @param text the text to display in the cell view
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithTextCellView(String text)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_text(text));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithText");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererPixbuf`
     * <br>to it, and makes it show &#64;texture.
     * @param texture the image to display in the cell view
     * @return A newly created `GtkCellView` widget.
    */
    public static CellView newWithTextureCellView(@Nonnull ch.bailu.gtk.gdk.Texture texture)  {
        PointerContainer __self = cast(JnaCellView.INST().gtk_cell_view_new_with_texture(asCPointerNotNull(texture)));
        if (__self.isNull()) {
            throw new NullPointerException("CellView:newWithTexture");
        }
        return new CellView(__self);
    }        
    

    /**
     * Creates a new `GtkCellView` widget.
    */
    public CellView() {
        super(cast(JnaCellView.INST().gtk_cell_view_new()));
    }

    /**
     * Returns a `GtkTreePath` referring to the currently
     * <br>displayed row. If no row is currently displayed,
     * <br>%NULL is returned.
     * @return the currently displayed row
    */
    public TreePath getDisplayedRow()  {
        return new TreePath(new PointerContainer(JnaCellView.INST().gtk_cell_view_get_displayed_row(asCPointer())));
    }

    /**
     * Gets whether &#64;cell_view is configured to draw all of its
     * <br>cells in a sensitive state.
     * @return whether &#64;cell_view draws all of its cells in a sensitive state
    */
    public boolean getDrawSensitive()  {
        return JnaCellView.INST().gtk_cell_view_get_draw_sensitive(asCPointer());
    }

    /**
     * Gets whether &#64;cell_view is configured to request space
     * <br>to fit the entire `GtkTreeModel`.
     * @return whether &#64;cell_view requests space to fit the entire `GtkTreeModel`.
    */
    public boolean getFitModel()  {
        return JnaCellView.INST().gtk_cell_view_get_fit_model(asCPointer());
    }

    /**
     * Returns the model for &#64;cell_view. If no model is used %NULL is
     * <br>returned.
     * @return a `GtkTreeModel` used
    */
    public TreeModel getModel()  {
        return new TreeModel(new PointerContainer(JnaCellView.INST().gtk_cell_view_get_model(asCPointer())));
    }

    /**
     * Sets the row of the model that is currently displayed
     * <br>by the `GtkCellView`. If the path is unset, then the
     * <br>contents of the cellview “stick” at their last value;
     * <br>this is not normally a desired result, but may be
     * <br>a needed intermediate state if say, the model for
     * <br>the `GtkCellView` becomes temporarily empty.
     * @param path a `GtkTreePath` or %NULL to unset.
    */
    public void setDisplayedRow(@Nullable TreePath path)  {
        JnaCellView.INST().gtk_cell_view_set_displayed_row(asCPointer(), asCPointer(path));
    }

    /**
     * Sets whether &#64;cell_view should draw all of its
     * <br>cells in a sensitive state, this is used by `GtkComboBox` menus
     * <br>to ensure that rows with insensitive cells that contain
     * <br>children appear sensitive in the parent menu item.
     * @param draw_sensitive whether to draw all cells in a sensitive state.
    */
    public void setDrawSensitive(boolean draw_sensitive)  {
        JnaCellView.INST().gtk_cell_view_set_draw_sensitive(asCPointer(), draw_sensitive);
    }

    /**
     * Sets whether &#64;cell_view should request space to fit the entire `GtkTreeModel`.
     * <br>
     * <br>This is used by `GtkComboBox` to ensure that the cell view displayed on
     * <br>the combo box’s button always gets enough space and does not resize
     * <br>when selection changes.
     * @param fit_model whether &#64;cell_view should request space for the whole model.
    */
    public void setFitModel(boolean fit_model)  {
        JnaCellView.INST().gtk_cell_view_set_fit_model(asCPointer(), fit_model);
    }

    /**
     * Sets the model for &#64;cell_view.  If &#64;cell_view already has a model
     * <br>set, it will remove it before setting the new model.  If &#64;model is
     * <br>%NULL, then it will unset the old model.
     * @param model a `GtkTreeModel`
    */
    public void setModel(@Nullable TreeModel model)  {
        JnaCellView.INST().gtk_cell_view_set_model(asCPointer(), asCPointer(model));
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
     * Implements interface {@link CellLayout}. Call this to get access to interface functions.
     * @return {@link CellLayout}
    */
    public CellLayout asCellLayout() {
        return new CellLayout(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaCellView.INST().gtk_cell_view_get_type(); 
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
