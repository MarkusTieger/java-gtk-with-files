/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkPrintJob` object represents a job that is sent to a printer.
 * <br>
 * <br>You only need to deal directly with print jobs if you use the
 * <br>non-portable [class&#64;Gtk.PrintUnixDialog] API.
 * <br>
 * <br>Use [method&#64;Gtk.PrintJob.get_surface] to obtain the cairo surface
 * <br>onto which the pages must be drawn. Use [method&#64;Gtk.PrintJob.send]
 * <br>to send the finished job to the printer. If you don’t use cairo
 * <br>`GtkPrintJob` also supports printing of manually generated PostScript,
 * <br>via [method&#64;Gtk.PrintJob.set_source_file].
 * <p><a href="https://docs.gtk.org/gtk4/class.PrintJob.html">https://docs.gtk.org/gtk4/class.PrintJob.html</a></p>
*/
public class PrintJob extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PrintJob.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPrintJobCompleteFunc {
        /**
         * The type of callback that is passed to gtk_print_job_send().
         * <br>
         * <br>It is called when the print job has been completely sent.
         * @param print_job the `GtkPrintJob`
         * @param user_data user data that has been passed to gtk_print_job_send()
         * @param error a `GError` that contains error information if the sending   of the print job failed, otherwise %NULL
        */
        void onPrintJobCompleteFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull PrintJob print_job, @Nullable ch.bailu.gtk.type.Pointer user_data, @Nonnull ch.bailu.gtk.glib.Error error);
    }
    
    private static JnaPrintJob.OnPrintJobCompleteFunc toOnPrintJobCompleteFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnPrintJobCompleteFunc in) {
        JnaPrintJob.OnPrintJobCompleteFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_print_job, _user_data, _error) -> in.onPrintJobCompleteFunc(__callback, new PrintJob(new PointerContainer(_print_job)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)), new ch.bailu.gtk.glib.Error(new PointerContainer(_error)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaPrintJob.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaPrintJob.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnStatusChanged {
        /**
         * Emitted when the status of a job changes.
         * <br>
         * <br>The signal handler can use [method&#64;Gtk.PrintJob.get_status]
         * <br>to obtain the new status.
        */
        void onStatusChanged();
    }
    
    private static com.sun.jna.Callback toOnStatusChanged(OnStatusChanged in) {
        return (in == null) ? null: (JnaPrintJob.OnStatusChanged) (__self, __data) -> in.onStatusChanged();
    }

    public PrintJob(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPrintJob`.
     * @param title the job title
     * @param printer a `GtkPrinter`
     * @param settings a `GtkPrintSettings`
     * @param page_setup a `GtkPageSetup`
    */
    public PrintJob(@Nonnull ch.bailu.gtk.type.Str title, @Nonnull Printer printer, @Nonnull PrintSettings settings, @Nonnull PageSetup page_setup) {
        super(cast(JnaPrintJob.INST().gtk_print_job_new(asCPointerNotNull(title), asCPointerNotNull(printer), asCPointerNotNull(settings), asCPointerNotNull(page_setup))));
    }

    /**
     * Creates a new `GtkPrintJob`.
     * @param title the job title
     * @param printer a `GtkPrinter`
     * @param settings a `GtkPrintSettings`
     * @param page_setup a `GtkPageSetup`
    */
    public PrintJob(String title, @Nonnull Printer printer, @Nonnull PrintSettings settings, @Nonnull PageSetup page_setup) {
        super(cast(JnaPrintJob.INST().gtk_print_job_new(title, asCPointerNotNull(printer), asCPointerNotNull(settings), asCPointerNotNull(page_setup))));
    }

    /**
     * Gets whether this job is printed collated.
     * @return whether the job is printed collated
    */
    public boolean getCollate()  {
        return JnaPrintJob.INST().gtk_print_job_get_collate(asCPointer());
    }

    /**
     * Gets the n-up setting for this job.
     * @return the n-up setting
    */
    public int getNUp()  {
        return JnaPrintJob.INST().gtk_print_job_get_n_up(asCPointer());
    }

    /**
     * Gets the n-up layout setting for this job.
     * @return the n-up layout
    */
    public int getNUpLayout()  {
        return JnaPrintJob.INST().gtk_print_job_get_n_up_layout(asCPointer());
    }

    /**
     * Gets the number of copies of this job.
     * @return the number of copies
    */
    public int getNumCopies()  {
        return JnaPrintJob.INST().gtk_print_job_get_num_copies(asCPointer());
    }

    /**
     * Gets the `GtkPageSet` setting for this job.
     * @return the `GtkPageSet` setting
    */
    public int getPageSet()  {
        return JnaPrintJob.INST().gtk_print_job_get_page_set(asCPointer());
    }

    /**
     * Gets the `GtkPrintPages` setting for this job.
     * @return the `GtkPrintPages` setting
    */
    public int getPages()  {
        return JnaPrintJob.INST().gtk_print_job_get_pages(asCPointer());
    }

    /**
     * Gets the `GtkPrinter` of the print job.
     * @return the printer of &#64;job
    */
    public Printer getPrinter()  {
        return new Printer(new PointerContainer(JnaPrintJob.INST().gtk_print_job_get_printer(asCPointer())));
    }

    /**
     * Gets whether this job is printed reversed.
     * @return whether the job is printed reversed.
    */
    public boolean getReverse()  {
        return JnaPrintJob.INST().gtk_print_job_get_reverse(asCPointer());
    }

    /**
     * Gets whether the job is printed rotated.
     * @return whether the job is printed rotated
    */
    public boolean getRotate()  {
        return JnaPrintJob.INST().gtk_print_job_get_rotate(asCPointer());
    }

    /**
     * Gets the scale for this job.
     * @return the scale
    */
    public double getScale()  {
        return JnaPrintJob.INST().gtk_print_job_get_scale(asCPointer());
    }

    /**
     * Gets the `GtkPrintSettings` of the print job.
     * @return the settings of &#64;job
    */
    public PrintSettings getSettings()  {
        return new PrintSettings(new PointerContainer(JnaPrintJob.INST().gtk_print_job_get_settings(asCPointer())));
    }

    /**
     * Gets the status of the print job.
     * @return the status of &#64;job
    */
    public int getStatus()  {
        return JnaPrintJob.INST().gtk_print_job_get_status(asCPointer());
    }

    /**
     * Gets a cairo surface onto which the pages of
     * <br>the print job should be rendered.
     * @return the cairo surface of &#64;job
    */
    public ch.bailu.gtk.cairo.Surface getSurface() throws ch.bailu.gtk.type.exception.AllocationError {
        return new ch.bailu.gtk.cairo.Surface(new PointerContainer(JnaPrintJob.INST().gtk_print_job_get_surface(asCPointer(), 0L)));
    }

    /**
     * Gets the job title.
     * @return the title of &#64;job
    */
    public ch.bailu.gtk.type.Str getTitle()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrintJob.INST().gtk_print_job_get_title(asCPointer())));
    }

    /**
     * Returns whether jobs will be tracked after printing.
     * <br>
     * <br>For details, see [method&#64;Gtk.PrintJob.set_track_print_status].
     * @return %TRUE if print job status will be reported after printing
    */
    public boolean getTrackPrintStatus()  {
        return JnaPrintJob.INST().gtk_print_job_get_track_print_status(asCPointer());
    }

    /**
     * Sends the print job off to the printer.
     * @param callback function to call when the job completes or an error occurs
     * @param user_data user data that gets passed to &#64;callback
     * @param dnotify destroy notify for &#64;user_data
    */
    public void send(OnPrintJobCompleteFunc callback, @Nullable ch.bailu.gtk.type.Pointer user_data, OnDestroyNotify dnotify)  {
        JnaPrintJob.INST().gtk_print_job_send(asCPointer(), toOnPrintJobCompleteFunc(this, "send", callback), asCPointer(user_data), toOnDestroyNotify(this, "send", dnotify));
    }

    /**
     * Sets whether this job is printed collated.
     * @param collate whether the job is printed collated
    */
    public void setCollate(boolean collate)  {
        JnaPrintJob.INST().gtk_print_job_set_collate(asCPointer(), collate);
    }

    /**
     * Sets the n-up setting for this job.
     * @param n_up the n-up value
    */
    public void setNUp(int n_up)  {
        JnaPrintJob.INST().gtk_print_job_set_n_up(asCPointer(), n_up);
    }

    /**
     * Sets the n-up layout setting for this job.
     * @param layout the n-up layout setting
    */
    public void setNUpLayout(int layout)  {
        JnaPrintJob.INST().gtk_print_job_set_n_up_layout(asCPointer(), layout);
    }

    /**
     * Sets the number of copies for this job.
     * @param num_copies the number of copies
    */
    public void setNumCopies(int num_copies)  {
        JnaPrintJob.INST().gtk_print_job_set_num_copies(asCPointer(), num_copies);
    }

    /**
     * Sets the `GtkPageSet` setting for this job.
     * @param page_set a `GtkPageSet` setting
    */
    public void setPageSet(int page_set)  {
        JnaPrintJob.INST().gtk_print_job_set_page_set(asCPointer(), page_set);
    }

    /**
     * Sets the `GtkPrintPages` setting for this job.
     * @param pages the `GtkPrintPages` setting
    */
    public void setPages(int pages)  {
        JnaPrintJob.INST().gtk_print_job_set_pages(asCPointer(), pages);
    }

    /**
     * Sets whether this job is printed reversed.
     * @param reverse whether the job is printed reversed
    */
    public void setReverse(boolean reverse)  {
        JnaPrintJob.INST().gtk_print_job_set_reverse(asCPointer(), reverse);
    }

    /**
     * Sets whether this job is printed rotated.
     * @param rotate whether to print rotated
    */
    public void setRotate(boolean rotate)  {
        JnaPrintJob.INST().gtk_print_job_set_rotate(asCPointer(), rotate);
    }

    /**
     * Sets the scale for this job.
     * <br>
     * <br>1.0 means unscaled.
     * @param scale the scale
    */
    public void setScale(double scale)  {
        JnaPrintJob.INST().gtk_print_job_set_scale(asCPointer(), scale);
    }

    /**
     * Make the `GtkPrintJob` send an existing document to the
     * <br>printing system.
     * <br>
     * <br>The file can be in any format understood by the platforms
     * <br>printing system (typically PostScript, but on many platforms
     * <br>PDF may work too). See [method&#64;Gtk.Printer.accepts_pdf] and
     * <br>[method&#64;Gtk.Printer.accepts_ps].
     * <br>
     * <br>This is similar to [method&#64;Gtk.PrintJob.set_source_file],
     * <br>but takes expects an open file descriptor for the file,
     * <br>instead of a filename.
     * @param fd a file descriptor
     * @return %FALSE if an error occurred
    */
    public boolean setSourceFd(int fd) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintJob.INST().gtk_print_job_set_source_fd(asCPointer(), fd, 0L);
    }

    /**
     * Make the `GtkPrintJob` send an existing document to the
     * <br>printing system.
     * <br>
     * <br>The file can be in any format understood by the platforms
     * <br>printing system (typically PostScript, but on many platforms
     * <br>PDF may work too). See [method&#64;Gtk.Printer.accepts_pdf] and
     * <br>[method&#64;Gtk.Printer.accepts_ps].
     * @param filename the file to be printed
     * @return %FALSE if an error occurred
    */
    public boolean setSourceFile(@Nonnull ch.bailu.gtk.type.Str filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintJob.INST().gtk_print_job_set_source_file(asCPointer(), asCPointerNotNull(filename), 0L);
    }

    /**
     * Make the `GtkPrintJob` send an existing document to the
     * <br>printing system.
     * <br>
     * <br>The file can be in any format understood by the platforms
     * <br>printing system (typically PostScript, but on many platforms
     * <br>PDF may work too). See [method&#64;Gtk.Printer.accepts_pdf] and
     * <br>[method&#64;Gtk.Printer.accepts_ps].
     * @param filename the file to be printed
     * @return %FALSE if an error occurred
    */
    public boolean setSourceFile(String filename) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaPrintJob.INST().gtk_print_job_set_source_file(asCPointer(), filename, 0L);
    }

    /**
     * If track_status is %TRUE, the print job will try to continue report
     * <br>on the status of the print job in the printer queues and printer.
     * <br>
     * <br>This can allow your application to show things like “out of paper”
     * <br>issues, and when the print job actually reaches the printer.
     * <br>
     * <br>This function is often implemented using some form of polling,
     * <br>so it should not be enabled unless needed.
     * @param track_status %TRUE to track status after printing
    */
    public void setTrackPrintStatus(boolean track_status)  {
        JnaPrintJob.INST().gtk_print_job_set_track_print_status(asCPointer(), track_status);
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

    public static long getTypeID() { 
        return JnaPrintJob.INST().gtk_print_job_get_type(); 
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

[MethodModel:cb-return-value-not-supported:getPageRanges:[ParameterModel:java-type-not-supported:{G_::{c:GtkPageRange*}}:{j:}]]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:java-type-not-supported:setPageRanges:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GtkPageRange*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
