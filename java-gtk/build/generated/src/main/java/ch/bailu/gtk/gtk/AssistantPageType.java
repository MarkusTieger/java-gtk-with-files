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
public interface AssistantPageType {

    /**
     * The page has regular contents. Both the
     * <br> Back and forward buttons will be shown.
    */
    int CONTENT = 0;

    /**
     * The page contains an introduction to the
     * <br> assistant task. Only the Forward button will be shown if there is a
     * <br>  next page.
    */
    int INTRO = 1;

    /**
     * The page lets the user confirm or deny the
     * <br> changes. The Back and Apply buttons will be shown.
    */
    int CONFIRM = 2;

    /**
     * The page informs the user of the changes
     * <br> done. Only the Close button will be shown.
    */
    int SUMMARY = 3;

    /**
     * Used for tasks that take a long time to
     * <br> complete, blocks the assistant until the page is marked as complete.
     * <br>  Only the back button will be shown.
    */
    int PROGRESS = 4;

    /**
     * Used for when other page types are not
     * <br> appropriate. No buttons will be shown, and the application must
     * <br> add its own buttons through gtk_assistant_add_action_widget().
    */
    int CUSTOM = 5;

}

/*
enumeration-type
*/
