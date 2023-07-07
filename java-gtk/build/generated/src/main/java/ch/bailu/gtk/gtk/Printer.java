/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkPrinter` object represents a printer.
 * <br>
 * <br>You only need to deal directly with printers if you use the
 * <br>non-portable [class&#64;Gtk.PrintUnixDialog] API.
 * <br>
 * <br>A `GtkPrinter` allows to get status information about the printer,
 * <br>such as its description, its location, the number of queued jobs,
 * <br>etc. Most importantly, a `GtkPrinter` object can be used to create
 * <br>a [class&#64;Gtk.PrintJob] object, which lets you print to the printer.
 * <p><a href="https://docs.gtk.org/gtk4/class.Printer.html">https://docs.gtk.org/gtk4/class.Printer.html</a></p>
*/
public class Printer extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Printer.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDetailsAcquired {
        /**
         * Emitted in response to a request for detailed information
         * <br>about a printer from the print backend.
         * <br>
         * <br>The &#64;success parameter indicates if the information was
         * <br>actually obtained.
         * @param success %TRUE if the details were successfully acquired
        */
        void onDetailsAcquired(boolean success);
    }
    
    private static com.sun.jna.Callback toOnDetailsAcquired(OnDetailsAcquired in) {
        return (in == null) ? null: (JnaPrinter.OnDetailsAcquired) (__self, _success, __data) -> in.onDetailsAcquired(_success);
    }

    public Printer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkPrinter`.
     * @param name the name of the printer
     * @param backend a `GtkPrintBackend`
     * @param virtual_ whether the printer is virtual
    */
    public Printer(@Nonnull ch.bailu.gtk.type.Str name, @Nonnull PrintBackend backend, boolean virtual_) {
        super(cast(JnaPrinter.INST().gtk_printer_new(asCPointerNotNull(name), asCPointerNotNull(backend), virtual_)));
    }

    /**
     * Creates a new `GtkPrinter`.
     * @param name the name of the printer
     * @param backend a `GtkPrintBackend`
     * @param virtual_ whether the printer is virtual
    */
    public Printer(String name, @Nonnull PrintBackend backend, boolean virtual_) {
        super(cast(JnaPrinter.INST().gtk_printer_new(name, asCPointerNotNull(backend), virtual_)));
    }

    /**
     * Returns whether the printer accepts input in
     * <br>PDF format.
     * @return %TRUE if &#64;printer accepts PDF
    */
    public boolean acceptsPdf()  {
        return JnaPrinter.INST().gtk_printer_accepts_pdf(asCPointer());
    }

    /**
     * Returns whether the printer accepts input in
     * <br>PostScript format.
     * @return %TRUE if &#64;printer accepts PostScript
    */
    public boolean acceptsPs()  {
        return JnaPrinter.INST().gtk_printer_accepts_ps(asCPointer());
    }

    /**
     * Compares two printers.
     * @param b another `GtkPrinter`
     * @return 0 if the printer match, a negative value if &#64;a &lt; &#64;b,   or a positive value if &#64;a &gt; &#64;b
    */
    public int compare(@Nonnull Printer b)  {
        return JnaPrinter.INST().gtk_printer_compare(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Returns the backend of the printer.
     * @return the backend of &#64;printer
    */
    public PrintBackend getBackend()  {
        return new PrintBackend(new PointerContainer(JnaPrinter.INST().gtk_printer_get_backend(asCPointer())));
    }

    /**
     * Returns the printer’s capabilities.
     * <br>
     * <br>This is useful when you’re using `GtkPrintUnixDialog`’s
     * <br>manual-capabilities setting and need to know which settings
     * <br>the printer can handle and which you must handle yourself.
     * <br>
     * <br>This will return 0 unless the printer’s details are
     * <br>available, see [method&#64;Gtk.Printer.has_details] and
     * <br>[method&#64;Gtk.Printer.request_details].
     * @return the printer’s capabilities
    */
    public int getCapabilities()  {
        return JnaPrinter.INST().gtk_printer_get_capabilities(asCPointer());
    }

    /**
     * Returns default page size of &#64;printer.
     * @return a newly allocated `GtkPageSetup` with default page size   of the printer.
    */
    public PageSetup getDefaultPageSize()  {
        return new PageSetup(new PointerContainer(JnaPrinter.INST().gtk_printer_get_default_page_size(asCPointer())));
    }

    /**
     * Gets the description of the printer.
     * @return the description of &#64;printer
    */
    public ch.bailu.gtk.type.Str getDescription()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrinter.INST().gtk_printer_get_description(asCPointer())));
    }

    /**
     * Gets the name of the icon to use for the printer.
     * @return the icon name for &#64;printer
    */
    public ch.bailu.gtk.type.Str getIconName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrinter.INST().gtk_printer_get_icon_name(asCPointer())));
    }

    /**
     * Gets the number of jobs currently queued on the printer.
     * @return the number of jobs on &#64;printer
    */
    public int getJobCount()  {
        return JnaPrinter.INST().gtk_printer_get_job_count(asCPointer());
    }

    /**
     * Returns a description of the location of the printer.
     * @return the location of &#64;printer
    */
    public ch.bailu.gtk.type.Str getLocation()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrinter.INST().gtk_printer_get_location(asCPointer())));
    }

    /**
     * Returns the name of the printer.
     * @return the name of &#64;printer
    */
    public ch.bailu.gtk.type.Str getName()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrinter.INST().gtk_printer_get_name(asCPointer())));
    }

    /**
     * Returns the state message describing the current state
     * <br>of the printer.
     * @return the state message of &#64;printer
    */
    public ch.bailu.gtk.type.Str getStateMessage()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaPrinter.INST().gtk_printer_get_state_message(asCPointer())));
    }

    /**
     * Returns whether the printer details are available.
     * @return %TRUE if &#64;printer details are available
    */
    public boolean hasDetails()  {
        return JnaPrinter.INST().gtk_printer_has_details(asCPointer());
    }

    /**
     * Returns whether the printer is accepting jobs
     * @return %TRUE if &#64;printer is accepting jobs
    */
    public boolean isAcceptingJobs()  {
        return JnaPrinter.INST().gtk_printer_is_accepting_jobs(asCPointer());
    }

    /**
     * Returns whether the printer is currently active (i.e.
     * <br>accepts new jobs).
     * @return %TRUE if &#64;printer is active
    */
    public boolean isActive()  {
        return JnaPrinter.INST().gtk_printer_is_active(asCPointer());
    }

    /**
     * Returns whether the printer is the default printer.
     * @return %TRUE if &#64;printer is the default
    */
    public boolean isDefault()  {
        return JnaPrinter.INST().gtk_printer_is_default(asCPointer());
    }

    /**
     * Returns whether the printer is currently paused.
     * <br>
     * <br>A paused printer still accepts jobs, but it is not
     * <br>printing them.
     * @return %TRUE if &#64;printer is paused
    */
    public boolean isPaused()  {
        return JnaPrinter.INST().gtk_printer_is_paused(asCPointer());
    }

    /**
     * Returns whether the printer is virtual (i.e. does not
     * <br>represent actual printer hardware, but something like
     * <br>a CUPS class).
     * @return %TRUE if &#64;printer is virtual
    */
    public boolean isVirtual()  {
        return JnaPrinter.INST().gtk_printer_is_virtual(asCPointer());
    }

    /**
     * Lists all the paper sizes &#64;printer supports.
     * <br>
     * <br>This will return and empty list unless the printer’s details
     * <br>are available, see [method&#64;Gtk.Printer.has_details] and
     * <br>[method&#64;Gtk.Printer.request_details].
     * @return a newly   allocated list of newly allocated `GtkPageSetup`s.
    */
    public ch.bailu.gtk.glib.List listPapers()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaPrinter.INST().gtk_printer_list_papers(asCPointer())));
    }

    /**
     * Requests the printer details.
     * <br>
     * <br>When the details are available, the
     * <br>[signal&#64;Gtk.Printer::details-acquired] signal
     * <br>will be emitted on &#64;printer.
    */
    public void requestDetails()  {
        JnaPrinter.INST().gtk_printer_request_details(asCPointer());
    }

    public final static String SIGNAL_ON_DETAILS_ACQUIRED = "details-acquired";
    
    /**
     * Connect to signal "details-acquired".
     * <br>See {@link OnDetailsAcquired#onDetailsAcquired} for signal description.
     * <br>Field {@link #SIGNAL_ON_DETAILS_ACQUIRED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDetailsAcquired(OnDetailsAcquired signal) {
        return connectSignal(SIGNAL_ON_DETAILS_ACQUIRED, toOnDetailsAcquired(signal));
    }

    public static long getTypeID() { 
        return JnaPrinter.INST().gtk_printer_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:getHardMargins:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:java-type-not-supported:java-type-not-supported:getHardMarginsForPaperSize:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:PaperSize:{c:GtkPaperSize*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
