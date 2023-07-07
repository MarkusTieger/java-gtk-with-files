/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface NotificationPriority {

    /**
     * the default priority, to be used for the
     * <br>  majority of notifications (for example email messages, software updates,
     * <br>  completed download/sync operations)
    */
    int NORMAL = 0;

    /**
     * for notifications that do not require
     * <br>  immediate attention - typically used for contextual background
     * <br>  information, such as contact birthdays or local weather
    */
    int LOW = 1;

    /**
     * for events that require more attention,
     * <br>  usually because responses are time-sensitive (for example chat and SMS
     * <br>  messages or alarms)
    */
    int HIGH = 2;

    /**
     * for urgent notifications, or notifications
     * <br>  that require a response in a short space of time (for example phone calls
     * <br>  or emergency warnings)
    */
    int URGENT = 3;

}

/*
enumeration-type
*/
