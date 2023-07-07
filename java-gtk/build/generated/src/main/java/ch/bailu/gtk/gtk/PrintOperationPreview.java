/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPrintOperationPreview` is the interface that is used to
 * <br>implement print preview.
 * <br>
 * <br>A `GtkPrintOperationPreview` object is passed to the
 * <br>[signal&#64;Gtk.PrintOperation::preview] signal by
 * <br>[class&#64;Gtk.PrintOperation].
 * <p><a href="https://docs.gtk.org/gtk4/iface.PrintOperationPreview.html">https://docs.gtk.org/gtk4/iface.PrintOperationPreview.html</a></p>
*/
public class PrintOperationPreview extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintOperationPreview.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnGotPageSize {
        /**
         * Emitted once for each page that gets rendered to the preview.
         * <br>
         * <br>A handler for this signal should update the &#64;context
         * <br>according to &#64;page_setup and set up a suitable cairo
         * <br>context, using [method&#64;Gtk.PrintContext.set_cairo_context].
         * @param context the current `GtkPrintContext`
         * @param page_setup the `GtkPageSetup` for the current page
        */
        void onGotPageSize(@Nonnull PrintContext context, @Nonnull PageSetup page_setup);
    }
    
    private static com.sun.jna.Callback toOnGotPageSize(OnGotPageSize in) {
        return (in == null) ? null: (JnaPrintOperationPreview.OnGotPageSize) (__self, _context, _page_setup, __data) -> in.onGotPageSize(new PrintContext(new PointerContainer(_context)), new PageSetup(new PointerContainer(_page_setup)));
    }

    @FunctionalInterface
    public interface OnReady {
        /**
         * The ::ready signal gets emitted once per preview operation,
         * <br>before the first page is rendered.
         * <br>
         * <br>A handler for this signal can be used for setup tasks.
         * @param context the current `GtkPrintContext`
        */
        void onReady(@Nonnull PrintContext context);
    }
    
    private static com.sun.jna.Callback toOnReady(OnReady in) {
        return (in == null) ? null: (JnaPrintOperationPreview.OnReady) (__self, _context, __data) -> in.onReady(new PrintContext(new PointerContainer(_context)));
    }

    public PrintOperationPreview(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Ends a preview.
     * <br>
     * <br>This function must be called to finish a custom print preview.
    */
    public void endPreview()  {
        JnaPrintOperationPreview.INST().gtk_print_operation_preview_end_preview(asCPointer());
    }

    /**
     * Returns whether the given page is included in the set of pages that
     * <br>have been selected for printing.
     * @param page_nr a page number
     * @return %TRUE if the page has been selected for printing
    */
    public boolean isSelected(int page_nr)  {
        return JnaPrintOperationPreview.INST().gtk_print_operation_preview_is_selected(asCPointer(), page_nr);
    }

    /**
     * Renders a page to the preview.
     * <br>
     * <br>This is using the print context that was passed to the
     * <br>[signal&#64;Gtk.PrintOperation::preview] handler together
     * <br>with &#64;preview.
     * <br>
     * <br>A custom print preview should use this function to render
     * <br>the currently selected page.
     * <br>
     * <br>Note that this function requires a suitable cairo context to
     * <br>be associated with the print context.
     * @param page_nr the page to render
    */
    public void renderPage(int page_nr)  {
        JnaPrintOperationPreview.INST().gtk_print_operation_preview_render_page(asCPointer(), page_nr);
    }

    public final static String SIGNAL_ON_GOT_PAGE_SIZE = "got-page-size";
    
    /**
     * Connect to signal "got-page-size".
     * <br>See {@link OnGotPageSize#onGotPageSize} for signal description.
     * <br>Field {@link #SIGNAL_ON_GOT_PAGE_SIZE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onGotPageSize(OnGotPageSize signal) {
        return connectSignal(SIGNAL_ON_GOT_PAGE_SIZE, toOnGotPageSize(signal));
    }

    public final static String SIGNAL_ON_READY = "ready";
    
    /**
     * Connect to signal "ready".
     * <br>See {@link OnReady#onReady} for signal description.
     * <br>Field {@link #SIGNAL_ON_READY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onReady(OnReady signal) {
        return connectSignal(SIGNAL_ON_READY, toOnReady(signal));
    }

    public static long getTypeID() { 
        return JnaPrintOperationPreview.INST().gtk_print_operation_preview_get_type(); 
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
