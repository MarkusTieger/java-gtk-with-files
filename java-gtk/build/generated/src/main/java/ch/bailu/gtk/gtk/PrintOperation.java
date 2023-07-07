/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkPrintOperation` is the high-level, portable printing API.
 * <br>
 * <br>It looks a bit different than other GTK dialogs such as the
 * <br>`GtkFileChooser`, since some platforms don’t expose enough
 * <br>infrastructure to implement a good print dialog. On such
 * <br>platforms, `GtkPrintOperation` uses the native print dialog.
 * <br>On platforms which do not provide a native print dialog, GTK
 * <br>uses its own, see [class&#64;Gtk.PrintUnixDialog].
 * <br>
 * <br>The typical way to use the high-level printing API is to create
 * <br>a `GtkPrintOperation` object with [ctor&#64;Gtk.PrintOperation.new]
 * <br>when the user selects to print. Then you set some properties on it,
 * <br>e.g. the page size, any [class&#64;Gtk.PrintSettings] from previous print
 * <br>operations, the number of pages, the current page, etc.
 * <br>
 * <br>Then you start the print operation by calling [method&#64;Gtk.PrintOperation.run].
 * <br>It will then show a dialog, let the user select a printer and options.
 * <br>When the user finished the dialog, various signals will be emitted on
 * <br>the `GtkPrintOperation`, the main one being
 * <br>[signal&#64;Gtk.PrintOperation::draw-page], which you are supposed to handle
 * <br>and render the page on the provided [class&#64;Gtk.PrintContext] using Cairo.
 * <br>
 * <br>&#35; The high-level printing API
 * <br>
 * <br>```c
 * <br>static GtkPrintSettings *settings = NULL;
 * <br>
 * <br>static void
 * <br>do_print (void)
 * <br>{
 * <br>  GtkPrintOperation *print;
 * <br>  GtkPrintOperationResult res;
 * <br>
 * <br>  print = gtk_print_operation_new ();
 * <br>
 * <br>  if (settings != NULL)
 * <br>    gtk_print_operation_set_print_settings (print, settings);
 * <br>
 * <br>  g_signal_connect (print, &quot;begin_print&quot;, G_CALLBACK (begin_print), NULL);
 * <br>  g_signal_connect (print, &quot;draw_page&quot;, G_CALLBACK (draw_page), NULL);
 * <br>
 * <br>  res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
 * <br>                                 GTK_WINDOW (main_window), NULL);
 * <br>
 * <br>  if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
 * <br>    {
 * <br>      if (settings != NULL)
 * <br>        g_object_unref (settings);
 * <br>      settings = g_object_ref (gtk_print_operation_get_print_settings (print));
 * <br>    }
 * <br>
 * <br>  g_object_unref (print);
 * <br>}
 * <br>```
 * <br>
 * <br>By default `GtkPrintOperation` uses an external application to do
 * <br>print preview. To implement a custom print preview, an application
 * <br>must connect to the preview signal. The functions
 * <br>[method&#64;Gtk.PrintOperationPreview.render_page],
 * <br>[method&#64;Gtk.PrintOperationPreview.end_preview] and
 * <br>[method&#64;Gtk.PrintOperationPreview.is_selected]
 * <br>are useful when implementing a print preview.
 * <p><a href="https://docs.gtk.org/gtk4/class.PrintOperation.html">https://docs.gtk.org/gtk4/class.PrintOperation.html</a></p>
*/
public class PrintOperation extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintOperation.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBeginPrint {
        /**
         * Emitted after the user has finished changing print settings
         * <br>in the dialog, before the actual rendering starts.
         * <br>
         * <br>A typical use for ::begin-print is to use the parameters from the
         * <br>[class&#64;Gtk.PrintContext] and paginate the document accordingly,
         * <br>and then set the number of pages with
         * <br>[method&#64;Gtk.PrintOperation.set_n_pages].
         * @param context the `GtkPrintContext` for the current operation
        */
        void onBeginPrint(@Nonnull PrintContext context);
    }
    
    private static com.sun.jna.Callback toOnBeginPrint(OnBeginPrint in) {
        return (in == null) ? null: (JnaPrintOperation.OnBeginPrint) (__self, _context, __data) -> in.onBeginPrint(new PrintContext(new PointerContainer(_context)));
    }

    @FunctionalInterface
    public interface OnCreateCustomWidget {
        /**
         * Emitted when displaying the print dialog.
         * <br>
         * <br>If you return a widget in a handler for this signal it will be
         * <br>added to a custom tab in the print dialog. You typically return a
         * <br>container widget with multiple widgets in it.
         * <br>
         * <br>The print dialog owns the returned widget, and its lifetime is not
         * <br>controlled by the application. However, the widget is guaranteed
         * <br>to stay around until the [signal&#64;Gtk.PrintOperation::custom-widget-apply]
         * <br>signal is emitted on the operation. Then you can read out any
         * <br>information you need from the widgets.
         * @return A custom widget that gets embedded in   the print dialog
        */
        ch.bailu.gtk.gobject.Object onCreateCustomWidget();
    }
    
    private static com.sun.jna.Callback toOnCreateCustomWidget(OnCreateCustomWidget in) {
        return (in == null) ? null: (JnaPrintOperation.OnCreateCustomWidget) (__self, __data) -> in.onCreateCustomWidget().asCPointer();
    }

    @FunctionalInterface
    public interface OnCustomWidgetApply {
        /**
         * Emitted right before ::begin-print if you added
         * <br>a custom widget in the ::create-custom-widget handler.
         * <br>
         * <br>When you get this signal you should read the information from the
         * <br>custom widgets, as the widgets are not guaranteed to be around at a
         * <br>later time.
         * @param widget the custom widget added in ::create-custom-widget
        */
        void onCustomWidgetApply(@Nonnull Widget widget);
    }
    
    private static com.sun.jna.Callback toOnCustomWidgetApply(OnCustomWidgetApply in) {
        return (in == null) ? null: (JnaPrintOperation.OnCustomWidgetApply) (__self, _widget, __data) -> in.onCustomWidgetApply(new Widget(new PointerContainer(_widget)));
    }

    @FunctionalInterface
    public interface OnDone {
        /**
         * Emitted when the print operation run has finished doing
         * <br>everything required for printing.
         * <br>
         * <br>&#64;result gives you information about what happened during the run.
         * <br>If &#64;result is %GTK_PRINT_OPERATION_RESULT_ERROR then you can call
         * <br>[method&#64;Gtk.PrintOperation.get_error] for more information.
         * <br>
         * <br>If you enabled print status tracking then
         * <br>[method&#64;Gtk.PrintOperation.is_finished] may still return %FALSE
         * <br>after the ::done signal was emitted.
         * @param result the result of the print operation
        */
        void onDone(int result);
    }
    
    private static com.sun.jna.Callback toOnDone(OnDone in) {
        return (in == null) ? null: (JnaPrintOperation.OnDone) (__self, _result, __data) -> in.onDone(_result);
    }

    @FunctionalInterface
    public interface OnDrawPage {
        /**
         * Emitted for every page that is printed.
         * <br>
         * <br>The signal handler must render the &#64;page_nr's page onto the cairo
         * <br>context obtained from &#64;context using
         * <br>[method&#64;Gtk.PrintContext.get_cairo_context].
         * <br>
         * <br>```c
         * <br>static void
         * <br>draw_page (GtkPrintOperation *operation,
         * <br>           GtkPrintContext   *context,
         * <br>           int                page_nr,
         * <br>           gpointer           user_data)
         * <br>{
         * <br>  cairo_t *cr;
         * <br>  PangoLayout *layout;
         * <br>  double width, text_height;
         * <br>  int layout_height;
         * <br>  PangoFontDescription *desc;
         * <br>  
         * <br>  cr = gtk_print_context_get_cairo_context (context);
         * <br>  width = gtk_print_context_get_width (context);
         * <br>  
         * <br>  cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
         * <br>  
         * <br>  cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
         * <br>  cairo_fill (cr);
         * <br>  
         * <br>  layout = gtk_print_context_create_pango_layout (context);
         * <br>  
         * <br>  desc = pango_font_description_from_string (&quot;sans 14&quot;);
         * <br>  pango_layout_set_font_description (layout, desc);
         * <br>  pango_font_description_free (desc);
         * <br>  
         * <br>  pango_layout_set_text (layout, &quot;some text&quot;, -1);
         * <br>  pango_layout_set_width (layout, width * PANGO_SCALE);
         * <br>  pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
         * <br>     		      
         * <br>  pango_layout_get_size (layout, NULL, &amp;layout_height);
         * <br>  text_height = (double)layout_height / PANGO_SCALE;
         * <br>  
         * <br>  cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
         * <br>  pango_cairo_show_layout (cr, layout);
         * <br>  
         * <br>  g_object_unref (layout);
         * <br>}
         * <br>```
         * <br>
         * <br>Use [method&#64;Gtk.PrintOperation.set_use_full_page] and
         * <br>[method&#64;Gtk.PrintOperation.set_unit] before starting the print
         * <br>operation to set up the transformation of the cairo context
         * <br>according to your needs.
         * @param context the `GtkPrintContext` for the current operation
         * @param page_nr the number of the currently printed page (0-based)
        */
        void onDrawPage(@Nonnull PrintContext context, int page_nr);
    }
    
    private static com.sun.jna.Callback toOnDrawPage(OnDrawPage in) {
        return (in == null) ? null: (JnaPrintOperation.OnDrawPage) (__self, _context, _page_nr, __data) -> in.onDrawPage(new PrintContext(new PointerContainer(_context)), _page_nr);
    }

    @FunctionalInterface
    public interface OnEndPrint {
        /**
         * Emitted after all pages have been rendered.
         * <br>
         * <br>A handler for this signal can clean up any resources that have
         * <br>been allocated in the [signal&#64;Gtk.PrintOperation::begin-print] handler.
         * @param context the `GtkPrintContext` for the current operation
        */
        void onEndPrint(@Nonnull PrintContext context);
    }
    
    private static com.sun.jna.Callback toOnEndPrint(OnEndPrint in) {
        return (in == null) ? null: (JnaPrintOperation.OnEndPrint) (__self, _context, __data) -> in.onEndPrint(new PrintContext(new PointerContainer(_context)));
    }

    @FunctionalInterface
    public interface OnPaginate {
        /**
         * Emitted after the ::begin-print signal, but before the actual rendering
         * <br>starts.
         * <br>
         * <br>It keeps getting emitted until a connected signal handler returns %TRUE.
         * <br>
         * <br>The ::paginate signal is intended to be used for paginating a document
         * <br>in small chunks, to avoid blocking the user interface for a long
         * <br>time. The signal handler should update the number of pages using
         * <br>[method&#64;Gtk.PrintOperation.set_n_pages], and return %TRUE if the document
         * <br>has been completely paginated.
         * <br>
         * <br>If you don't need to do pagination in chunks, you can simply do
         * <br>it all in the ::begin-print handler, and set the number of pages
         * <br>from there.
         * @param context the `GtkPrintContext` for the current operation
         * @return %TRUE if pagination is complete
        */
        boolean onPaginate(@Nonnull PrintContext context);
    }
    
    private static com.sun.jna.Callback toOnPaginate(OnPaginate in) {
        return (in == null) ? null: (JnaPrintOperation.OnPaginate) (__self, _context, __data) -> in.onPaginate(new PrintContext(new PointerContainer(_context)));
    }

    @FunctionalInterface
    public interface OnPreview {
        /**
         * Gets emitted when a preview is requested from the native dialog.
         * <br>
         * <br>The default handler for this signal uses an external viewer
         * <br>application to preview.
         * <br>
         * <br>To implement a custom print preview, an application must return
         * <br>%TRUE from its handler for this signal. In order to use the
         * <br>provided &#64;context for the preview implementation, it must be
         * <br>given a suitable cairo context with
         * <br>[method&#64;Gtk.PrintContext.set_cairo_context].
         * <br>
         * <br>The custom preview implementation can use
         * <br>[method&#64;Gtk.PrintOperationPreview.is_selected] and
         * <br>[method&#64;Gtk.PrintOperationPreview.render_page] to find pages which
         * <br>are selected for print and render them. The preview must be
         * <br>finished by calling [method&#64;Gtk.PrintOperationPreview.end_preview]
         * <br>(typically in response to the user clicking a close button).
         * @param preview the `GtkPrintOperationPreview` for the current operation
         * @param context the `GtkPrintContext` that will be used
         * @param parent the `GtkWindow` to use as window parent
         * @return %TRUE if the listener wants to take over control of the preview
        */
        boolean onPreview(@Nonnull PrintOperationPreview preview, @Nonnull PrintContext context, @Nullable Window parent);
    }
    
    private static com.sun.jna.Callback toOnPreview(OnPreview in) {
        return (in == null) ? null: (JnaPrintOperation.OnPreview) (__self, _preview, _context, _parent, __data) -> in.onPreview(new PrintOperationPreview(new PointerContainer(_preview)), new PrintContext(new PointerContainer(_context)), new Window(new PointerContainer(_parent)));
    }

    @FunctionalInterface
    public interface OnRequestPageSetup {
        /**
         * Emitted once for every page that is printed.
         * <br>
         * <br>This gives the application a chance to modify the page setup.
         * <br>Any changes done to &#64;setup will be in force only for printing
         * <br>this page.
         * @param context the `GtkPrintContext` for the current operation
         * @param page_nr the number of the currently printed page (0-based)
         * @param setup the `GtkPageSetup`
        */
        void onRequestPageSetup(@Nonnull PrintContext context, int page_nr, @Nonnull PageSetup setup);
    }
    
    private static com.sun.jna.Callback toOnRequestPageSetup(OnRequestPageSetup in) {
        return (in == null) ? null: (JnaPrintOperation.OnRequestPageSetup) (__self, _context, _page_nr, _setup, __data) -> in.onRequestPageSetup(new PrintContext(new PointerContainer(_context)), _page_nr, new PageSetup(new PointerContainer(_setup)));
    }

    @FunctionalInterface
    public interface OnStatusChanged {
        /**
         * Emitted at between the various phases of the print operation.
         * <br>
         * <br>See [enum&#64;Gtk.PrintStatus] for the phases that are being discriminated.
         * <br>Use [method&#64;Gtk.PrintOperation.get_status] to find out the current
         * <br>status.
        */
        void onStatusChanged();
    }
    
    private static com.sun.jna.Callback toOnStatusChanged(OnStatusChanged in) {
        return (in == null) ? null: (JnaPrintOperation.OnStatusChanged) (__self, __data) -> in.onStatusChanged();
    }

    @FunctionalInterface
    public interface OnUpdateCustomWidget {
        /**
         * Emitted after change of selected printer.
         * <br>
         * <br>The actual page setup and print settings are passed to the custom
         * <br>widget, which can actualize itself according to this change.
         * @param widget the custom widget added in ::create-custom-widget
         * @param setup actual page setup
         * @param settings actual print settings
        */
        void onUpdateCustomWidget(@Nonnull Widget widget, @Nonnull PageSetup setup, @Nonnull PrintSettings settings);
    }
    
    private static com.sun.jna.Callback toOnUpdateCustomWidget(OnUpdateCustomWidget in) {
        return (in == null) ? null: (JnaPrintOperation.OnUpdateCustomWidget) (__self, _widget, _setup, _settings, __data) -> in.onUpdateCustomWidget(new Widget(new PointerContainer(_widget)), new PageSetup(new PointerContainer(_setup)), new PrintSettings(new PointerContainer(_settings)));
    }

    public PrintOperation(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPrintOperation`.
    */
    public PrintOperation() {
        super(cast(JnaPrintOperation.INST().gtk_print_operation_new()));
    }

    /**
     * Cancels a running print operation.
     * <br>
     * <br>This function may be called from a [signal&#64;Gtk.PrintOperation::begin-print],
     * <br>[signal&#64;Gtk.PrintOperation::paginate] or [signal&#64;Gtk.PrintOperation::draw-page]
     * <br>signal handler to stop the currently running print operation.
    */
    public void cancel()  {
        JnaPrintOperation.INST().gtk_print_operation_cancel(asCPointer());
    }

    /**
     * Signal that drawing of particular page is complete.
     * <br>
     * <br>It is called after completion of page drawing (e.g. drawing
     * <br>in another thread). If [method&#64;Gtk.PrintOperation.set_defer_drawing]
     * <br>was called before, then this function has to be called by application.
     * <br>Otherwise it is called by GTK itself.
    */
    public void drawPageFinish()  {
        JnaPrintOperation.INST().gtk_print_operation_draw_page_finish(asCPointer());
    }

    /**
     * Returns the default page setup.
     * @return the default page setup
    */
    public PageSetup getDefaultPageSetup()  {
        return new PageSetup(new PointerContainer(JnaPrintOperation.INST().gtk_print_operation_get_default_page_setup(asCPointer())));
    }

    /**
     * Gets whether page setup selection combos are embedded
     * @return whether page setup selection combos are embedded
    */
    public boolean getEmbedPageSetup()  {
        return JnaPrintOperation.INST().gtk_print_operation_get_embed_page_setup(asCPointer());
    }

    /**
     * Call this when the result of a print operation is
     * <br>%GTK_PRINT_OPERATION_RESULT_ERROR.
     * <br>
     * <br>It can be called either after [method&#64;Gtk.PrintOperation.run]
     * <br>returns, or in the [signal&#64;Gtk.PrintOperation::done] signal
     * <br>handler.
     * <br>
     * <br>The returned `GError` will contain more details on what went wrong.
    */
    public void getError() throws ch.bailu.gtk.type.exception.AllocationError {
        JnaPrintOperation.INST().gtk_print_operation_get_error(asCPointer(), 0L);
    }

    /**
     * Gets whether there is a selection.
     * @return whether there is a selection
    */
    public boolean getHasSelection()  {
        return JnaPrintOperation.INST().gtk_print_operation_get_has_selection(asCPointer());
    }

    /**
     * Returns the number of pages that will be printed.
     * <br>
     * <br>Note that this value is set during print preparation phase
     * <br>(%GTK_PRINT_STATUS_PREPARING), so this function should never be
     * <br>called before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA).
     * <br>You can connect to the [signal&#64;Gtk.PrintOperation::status-changed]
     * <br>signal and call gtk_print_operation_get_n_pages_to_print() when
     * <br>print status is %GTK_PRINT_STATUS_GENERATING_DATA.
     * <br>
     * <br>This is typically used to track the progress of print operation.
     * @return the number of pages that will be printed
    */
    public int getNPagesToPrint()  {
        return JnaPrintOperation.INST().gtk_print_operation_get_n_pages_to_print(asCPointer());
    }

    /**
     * Returns the current print settings.
     * <br>
     * <br>Note that the return value is %NULL until either
     * <br>[method&#64;Gtk.PrintOperation.set_print_settings] or
     * <br>[method&#64;Gtk.PrintOperation.run] have been called.
     * @return the current print settings of &#64;op.
    */
    public PrintSettings getPrintSettings()  {
        return new PrintSettings(new PointerContainer(JnaPrintOperation.INST().gtk_print_operation_get_print_settings(asCPointer())));
    }

    /**
     * Returns the status of the print operation.
     * <br>
     * <br>Also see [method&#64;Gtk.PrintOperation.get_status_string].
     * @return the status of the print operation
    */
    public int getStatus()  {
        return JnaPrintOperation.INST().gtk_print_operation_get_status(asCPointer());
    }

    /**
     * Returns a string representation of the status of the
     * <br>print operation.
     * <br>
     * <br>The string is translated and suitable for displaying
     * <br>the print status e.g. in a `GtkStatusbar`.
     * <br>
     * <br>Use [method&#64;Gtk.PrintOperation.get_status] to obtain
     * <br>a status value that is suitable for programmatic use.
     * @return a string representation of the status    of the print operation
    */
    public ch.bailu.gtk.type.Str getStatusString()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintOperation.INST().gtk_print_operation_get_status_string(asCPointer())));
    }

    /**
     * Gets whether the application supports print of selection
     * @return whether the application supports print of selection
    */
    public boolean getSupportSelection()  {
        return JnaPrintOperation.INST().gtk_print_operation_get_support_selection(asCPointer());
    }

    /**
     * A convenience function to find out if the print operation
     * <br>is finished.
     * <br>
     * <br>a print operation is finished if its status is either
     * <br>%GTK_PRINT_STATUS_FINISHED or %GTK_PRINT_STATUS_FINISHED_ABORTED.
     * <br>
     * <br>Note: when you enable print status tracking the print operation
     * <br>can be in a non-finished state even after done has been called, as
     * <br>the operation status then tracks the print job status on the printer.
     * @return %TRUE, if the print operation is finished.
    */
    public boolean isFinished()  {
        return JnaPrintOperation.INST().gtk_print_operation_is_finished(asCPointer());
    }

    /**
     * Runs the print operation.
     * <br>
     * <br>Normally that this function does not return until the rendering
     * <br>of all pages is complete. You can connect to the
     * <br>[signal&#64;Gtk.PrintOperation::status-changed] signal on &#64;op to obtain
     * <br>some information about the progress of the print operation.
     * <br>
     * <br>Furthermore, it may use a recursive mainloop to show the print dialog.
     * <br>
     * <br>If you set the [Gtk.PrintOperation:allow-async] property, the operation
     * <br>will run asynchronously if this is supported on the platform. The
     * <br>[signal&#64;Gtk.PrintOperation::done] signal will be emitted with the result
     * <br>of the operation when the it is done (i.e. when the dialog is canceled,
     * <br>or when the print succeeds or fails).
     * <br>
     * <br>```c
     * <br>if (settings != NULL)
     * <br>  gtk_print_operation_set_print_settings (print, settings);
     * <br>
     * <br>if (page_setup != NULL)
     * <br>  gtk_print_operation_set_default_page_setup (print, page_setup);
     * <br>
     * <br>g_signal_connect (print, &quot;begin-print&quot;,
     * <br>                  G_CALLBACK (begin_print), &amp;data);
     * <br>g_signal_connect (print, &quot;draw-page&quot;,
     * <br>                  G_CALLBACK (draw_page), &amp;data);
     * <br>
     * <br>res = gtk_print_operation_run (print,
     * <br>                               GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
     * <br>                               parent,
     * <br>                               &amp;error);
     * <br>
     * <br>if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
     * <br> {
     * <br>   error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
     * <br>  			                     GTK_DIALOG_DESTROY_WITH_PARENT,
     * <br>					     GTK_MESSAGE_ERROR,
     * <br>					     GTK_BUTTONS_CLOSE,
     * <br>					     &quot;Error printing file:&#92;n%s&quot;,
     * <br>					     error-&gt;message);
     * <br>   g_signal_connect (error_dialog, &quot;response&quot;,
     * <br>                     G_CALLBACK (gtk_window_destroy), NULL);
     * <br>   gtk_widget_show (error_dialog);
     * <br>   g_error_free (error);
     * <br> }
     * <br>else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
     * <br> {
     * <br>   if (settings != NULL)
     * <br>g_object_unref (settings);
     * <br>   settings = g_object_ref (gtk_print_operation_get_print_settings (print));
     * <br> }
     * <br>```
     * <br>
     * <br>Note that gtk_print_operation_run() can only be called once on a
     * <br>given `GtkPrintOperation`.
     * @param action the action to start
     * @param parent Transient parent of the dialog
     * @return the result of the print operation. A return value of   %GTK_PRINT_OPERATION_RESULT_APPLY indicates that the printing was   completed successfully. In this case, it is a good idea to obtain   the used print settings with   [method&#64;Gtk.PrintOperation.get_print_settings]   and store them for reuse with the next print operation. A value of   %GTK_PRINT_OPERATION_RESULT_IN_PROGRESS means the operation is running   asynchronously, and will emit the [signal&#64;Gtk.PrintOperation::done]   signal when done.
    */
    public int run(int action, @Nullable Window parent) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintOperation.INST().gtk_print_operation_run(asCPointer(), action, asCPointer(parent), 0L);
    }

    /**
     * Sets whether gtk_print_operation_run() may return
     * <br>before the print operation is completed.
     * <br>
     * <br>Note that some platforms may not allow asynchronous
     * <br>operation.
     * @param allow_async %TRUE to allow asynchronous operation
    */
    public void setAllowAsync(boolean allow_async)  {
        JnaPrintOperation.INST().gtk_print_operation_set_allow_async(asCPointer(), allow_async);
    }

    /**
     * Sets the current page.
     * <br>
     * <br>If this is called before [method&#64;Gtk.PrintOperation.run],
     * <br>the user will be able to select to print only the current page.
     * <br>
     * <br>Note that this only makes sense for pre-paginated documents.
     * @param current_page the current page, 0-based
    */
    public void setCurrentPage(int current_page)  {
        JnaPrintOperation.INST().gtk_print_operation_set_current_page(asCPointer(), current_page);
    }

    /**
     * Sets the label for the tab holding custom widgets.
     * @param label the label to use, or %NULL to use the default label
    */
    public void setCustomTabLabel(@Nullable ch.bailu.gtk.type.Str label)  {
        JnaPrintOperation.INST().gtk_print_operation_set_custom_tab_label(asCPointer(), asCPointer(label));
    }

    /**
     * Sets the label for the tab holding custom widgets.
     * @param label the label to use, or %NULL to use the default label
    */
    public void setCustomTabLabel(String label)  {
        JnaPrintOperation.INST().gtk_print_operation_set_custom_tab_label(asCPointer(), label);
    }

    /**
     * Makes &#64;default_page_setup the default page setup for &#64;op.
     * <br>
     * <br>This page setup will be used by [method&#64;Gtk.PrintOperation.run],
     * <br>but it can be overridden on a per-page basis by connecting
     * <br>to the [signal&#64;Gtk.PrintOperation::request-page-setup] signal.
     * @param default_page_setup a `GtkPageSetup`
    */
    public void setDefaultPageSetup(@Nullable PageSetup default_page_setup)  {
        JnaPrintOperation.INST().gtk_print_operation_set_default_page_setup(asCPointer(), asCPointer(default_page_setup));
    }

    /**
     * Sets up the `GtkPrintOperation` to wait for calling of
     * <br>[method&#64;Gtk.PrintOperation.draw_page_finish from application.
     * <br>
     * <br>This can be used for drawing page in another thread.
     * <br>
     * <br>This function must be called in the callback of the
     * <br>[signal&#64;Gtk.PrintOperation::draw-page] signal.
    */
    public void setDeferDrawing()  {
        JnaPrintOperation.INST().gtk_print_operation_set_defer_drawing(asCPointer());
    }

    /**
     * Embed page size combo box and orientation combo box into page setup page.
     * <br>
     * <br>Selected page setup is stored as default page setup in `GtkPrintOperation`.
     * @param embed %TRUE to embed page setup selection in the `GtkPrintUnixDialog`
    */
    public void setEmbedPageSetup(boolean embed)  {
        JnaPrintOperation.INST().gtk_print_operation_set_embed_page_setup(asCPointer(), embed);
    }

    /**
     * Sets up the `GtkPrintOperation` to generate a file instead
     * <br>of showing the print dialog.
     * <br>
     * <br>The intended use of this function is for implementing
     * <br>“Export to PDF” actions. Currently, PDF is the only supported
     * <br>format.
     * <br>
     * <br>“Print to PDF” support is independent of this and is done
     * <br>by letting the user pick the “Print to PDF” item from the list
     * <br>of printers in the print dialog.
     * @param filename the filename for the exported file
    */
    public void setExportFilename(@Nonnull ch.bailu.gtk.type.Str filename)  {
        JnaPrintOperation.INST().gtk_print_operation_set_export_filename(asCPointer(), asCPointerNotNull(filename));
    }

    /**
     * Sets up the `GtkPrintOperation` to generate a file instead
     * <br>of showing the print dialog.
     * <br>
     * <br>The intended use of this function is for implementing
     * <br>“Export to PDF” actions. Currently, PDF is the only supported
     * <br>format.
     * <br>
     * <br>“Print to PDF” support is independent of this and is done
     * <br>by letting the user pick the “Print to PDF” item from the list
     * <br>of printers in the print dialog.
     * @param filename the filename for the exported file
    */
    public void setExportFilename(String filename)  {
        JnaPrintOperation.INST().gtk_print_operation_set_export_filename(asCPointer(), filename);
    }

    /**
     * Sets whether there is a selection to print.
     * <br>
     * <br>Application has to set number of pages to which the selection
     * <br>will draw by [method&#64;Gtk.PrintOperation.set_n_pages] in a handler
     * <br>for the [signal&#64;Gtk.PrintOperation::begin-print] signal.
     * @param has_selection %TRUE indicates that a selection exists
    */
    public void setHasSelection(boolean has_selection)  {
        JnaPrintOperation.INST().gtk_print_operation_set_has_selection(asCPointer(), has_selection);
    }

    /**
     * Sets the name of the print job.
     * <br>
     * <br>The name is used to identify the job (e.g. in monitoring
     * <br>applications like eggcups).
     * <br>
     * <br>If you don’t set a job name, GTK picks a default one by
     * <br>numbering successive print jobs.
     * @param job_name a string that identifies the print job
    */
    public void setJobName(@Nonnull ch.bailu.gtk.type.Str job_name)  {
        JnaPrintOperation.INST().gtk_print_operation_set_job_name(asCPointer(), asCPointerNotNull(job_name));
    }

    /**
     * Sets the name of the print job.
     * <br>
     * <br>The name is used to identify the job (e.g. in monitoring
     * <br>applications like eggcups).
     * <br>
     * <br>If you don’t set a job name, GTK picks a default one by
     * <br>numbering successive print jobs.
     * @param job_name a string that identifies the print job
    */
    public void setJobName(String job_name)  {
        JnaPrintOperation.INST().gtk_print_operation_set_job_name(asCPointer(), job_name);
    }

    /**
     * Sets the number of pages in the document.
     * <br>
     * <br>This must be set to a positive number before the rendering
     * <br>starts. It may be set in a [signal&#64;Gtk.PrintOperation::begin-print]
     * <br>signal handler.
     * <br>
     * <br>Note that the page numbers passed to the
     * <br>[signal&#64;Gtk.PrintOperation::request-page-setup]
     * <br>and [signal&#64;Gtk.PrintOperation::draw-page] signals are 0-based, i.e.
     * <br>if the user chooses to print all pages, the last ::draw-page signal
     * <br>will be for page &#64;n_pages - 1.
     * @param n_pages the number of pages
    */
    public void setNPages(int n_pages)  {
        JnaPrintOperation.INST().gtk_print_operation_set_n_pages(asCPointer(), n_pages);
    }

    /**
     * Sets the print settings for &#64;op.
     * <br>
     * <br>This is typically used to re-establish print settings
     * <br>from a previous print operation, see [method&#64;Gtk.PrintOperation.run].
     * @param print_settings `GtkPrintSettings`
    */
    public void setPrintSettings(@Nullable PrintSettings print_settings)  {
        JnaPrintOperation.INST().gtk_print_operation_set_print_settings(asCPointer(), asCPointer(print_settings));
    }

    /**
     * If &#64;show_progress is %TRUE, the print operation will show
     * <br>a progress dialog during the print operation.
     * @param show_progress %TRUE to show a progress dialog
    */
    public void setShowProgress(boolean show_progress)  {
        JnaPrintOperation.INST().gtk_print_operation_set_show_progress(asCPointer(), show_progress);
    }

    /**
     * Sets whether selection is supported by `GtkPrintOperation`.
     * @param support_selection %TRUE to support selection
    */
    public void setSupportSelection(boolean support_selection)  {
        JnaPrintOperation.INST().gtk_print_operation_set_support_selection(asCPointer(), support_selection);
    }

    /**
     * If track_status is %TRUE, the print operation will try to continue
     * <br>report on the status of the print job in the printer queues and printer.
     * <br>
     * <br>This can allow your application to show things like “out of paper”
     * <br>issues, and when the print job actually reaches the printer.
     * <br>
     * <br>This function is often implemented using some form of polling,
     * <br>so it should not be enabled unless needed.
     * @param track_status %TRUE to track status after printing
    */
    public void setTrackPrintStatus(boolean track_status)  {
        JnaPrintOperation.INST().gtk_print_operation_set_track_print_status(asCPointer(), track_status);
    }

    /**
     * Sets up the transformation for the cairo context obtained from
     * <br>`GtkPrintContext` in such a way that distances are measured in
     * <br>units of &#64;unit.
     * @param unit the unit to use
    */
    public void setUnit(int unit)  {
        JnaPrintOperation.INST().gtk_print_operation_set_unit(asCPointer(), unit);
    }

    /**
     * If &#64;full_page is %TRUE, the transformation for the cairo context
     * <br>obtained from `GtkPrintContext` puts the origin at the top left
     * <br>corner of the page.
     * <br>
     * <br>This may not be the top left corner of the sheet, depending on page
     * <br>orientation and the number of pages per sheet). Otherwise, the origin
     * <br>is at the top left corner of the imageable area (i.e. inside the margins).
     * @param full_page %TRUE to set up the `GtkPrintContext` for the full page
    */
    public void setUseFullPage(boolean full_page)  {
        JnaPrintOperation.INST().gtk_print_operation_set_use_full_page(asCPointer(), full_page);
    }

    public final static String SIGNAL_ON_BEGIN_PRINT = "begin-print";
    
    /**
     * Connect to signal "begin-print".
     * <br>See {@link OnBeginPrint#onBeginPrint} for signal description.
     * <br>Field {@link #SIGNAL_ON_BEGIN_PRINT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBeginPrint(OnBeginPrint signal) {
        return connectSignal(SIGNAL_ON_BEGIN_PRINT, toOnBeginPrint(signal));
    }

    public final static String SIGNAL_ON_CREATE_CUSTOM_WIDGET = "create-custom-widget";
    
    /**
     * Connect to signal "create-custom-widget".
     * <br>See {@link OnCreateCustomWidget#onCreateCustomWidget} for signal description.
     * <br>Field {@link #SIGNAL_ON_CREATE_CUSTOM_WIDGET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCreateCustomWidget(OnCreateCustomWidget signal) {
        return connectSignal(SIGNAL_ON_CREATE_CUSTOM_WIDGET, toOnCreateCustomWidget(signal));
    }

    public final static String SIGNAL_ON_CUSTOM_WIDGET_APPLY = "custom-widget-apply";
    
    /**
     * Connect to signal "custom-widget-apply".
     * <br>See {@link OnCustomWidgetApply#onCustomWidgetApply} for signal description.
     * <br>Field {@link #SIGNAL_ON_CUSTOM_WIDGET_APPLY} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCustomWidgetApply(OnCustomWidgetApply signal) {
        return connectSignal(SIGNAL_ON_CUSTOM_WIDGET_APPLY, toOnCustomWidgetApply(signal));
    }

    public final static String SIGNAL_ON_DONE = "done";
    
    /**
     * Connect to signal "done".
     * <br>See {@link OnDone#onDone} for signal description.
     * <br>Field {@link #SIGNAL_ON_DONE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDone(OnDone signal) {
        return connectSignal(SIGNAL_ON_DONE, toOnDone(signal));
    }

    public final static String SIGNAL_ON_DRAW_PAGE = "draw-page";
    
    /**
     * Connect to signal "draw-page".
     * <br>See {@link OnDrawPage#onDrawPage} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRAW_PAGE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDrawPage(OnDrawPage signal) {
        return connectSignal(SIGNAL_ON_DRAW_PAGE, toOnDrawPage(signal));
    }

    public final static String SIGNAL_ON_END_PRINT = "end-print";
    
    /**
     * Connect to signal "end-print".
     * <br>See {@link OnEndPrint#onEndPrint} for signal description.
     * <br>Field {@link #SIGNAL_ON_END_PRINT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEndPrint(OnEndPrint signal) {
        return connectSignal(SIGNAL_ON_END_PRINT, toOnEndPrint(signal));
    }

    public final static String SIGNAL_ON_PAGINATE = "paginate";
    
    /**
     * Connect to signal "paginate".
     * <br>See {@link OnPaginate#onPaginate} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAGINATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPaginate(OnPaginate signal) {
        return connectSignal(SIGNAL_ON_PAGINATE, toOnPaginate(signal));
    }

    public final static String SIGNAL_ON_PREVIEW = "preview";
    
    /**
     * Connect to signal "preview".
     * <br>See {@link OnPreview#onPreview} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREVIEW} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPreview(OnPreview signal) {
        return connectSignal(SIGNAL_ON_PREVIEW, toOnPreview(signal));
    }

    public final static String SIGNAL_ON_REQUEST_PAGE_SETUP = "request-page-setup";
    
    /**
     * Connect to signal "request-page-setup".
     * <br>See {@link OnRequestPageSetup#onRequestPageSetup} for signal description.
     * <br>Field {@link #SIGNAL_ON_REQUEST_PAGE_SETUP} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onRequestPageSetup(OnRequestPageSetup signal) {
        return connectSignal(SIGNAL_ON_REQUEST_PAGE_SETUP, toOnRequestPageSetup(signal));
    }

    public final static String SIGNAL_ON_STATUS_CHANGED = "status-changed";
    
    /**
     * Connect to signal "status-changed".
     * <br>See {@link OnStatusChanged#onStatusChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_STATUS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStatusChanged(OnStatusChanged signal) {
        return connectSignal(SIGNAL_ON_STATUS_CHANGED, toOnStatusChanged(signal));
    }

    public final static String SIGNAL_ON_UPDATE_CUSTOM_WIDGET = "update-custom-widget";
    
    /**
     * Connect to signal "update-custom-widget".
     * <br>See {@link OnUpdateCustomWidget#onUpdateCustomWidget} for signal description.
     * <br>Field {@link #SIGNAL_ON_UPDATE_CUSTOM_WIDGET} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUpdateCustomWidget(OnUpdateCustomWidget signal) {
        return connectSignal(SIGNAL_ON_UPDATE_CUSTOM_WIDGET, toOnUpdateCustomWidget(signal));
    }

    /**
     * Implements interface {@link PrintOperationPreview}. Call this to get access to interface functions.
     * @return {@link PrintOperationPreview}
    */
    public PrintOperationPreview asPrintOperationPreview() {
        return new PrintOperationPreview(cast());
    }

    public static long getTypeID() { 
        return JnaPrintOperation.INST().gtk_print_operation_get_type(); 
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
