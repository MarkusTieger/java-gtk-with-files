/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface PrintStatus {

    /**
     * The printing has not started yet; this
     * <br>  status is set initially, and while the print dialog is shown.
    */
    int INITIAL = 0;

    /**
     * This status is set while the begin-print
     * <br>  signal is emitted and during pagination.
    */
    int PREPARING = 1;

    /**
     * This status is set while the
     * <br>  pages are being rendered.
    */
    int GENERATING_DATA = 2;

    /**
     * The print job is being sent off to the
     * <br>  printer.
    */
    int SENDING_DATA = 3;

    /**
     * The print job has been sent to the printer,
     * <br>  but is not printed for some reason, e.g. the printer may be stopped.
    */
    int PENDING = 4;

    /**
     * Some problem has occurred during
     * <br>  printing, e.g. a paper jam.
    */
    int PENDING_ISSUE = 5;

    /**
     * The printer is processing the print job.
    */
    int PRINTING = 6;

    /**
     * The printing has been completed successfully.
    */
    int FINISHED = 7;

    /**
     * The printing has been aborted.
    */
    int FINISHED_ABORTED = 8;

}

/*
enumeration-type
*/
