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
public interface DriveStartStopType {

    /**
     * Unknown or drive doesn't support
     * <br>   start/stop.
    */
    int UNKNOWN = 0;

    /**
     * The stop method will physically
     * <br>   shut down the drive and e.g. power down the port the drive is
     * <br>   attached to.
    */
    int SHUTDOWN = 1;

    /**
     * The start/stop methods are used
     * <br>   for connecting/disconnect to the drive over the network.
    */
    int NETWORK = 2;

    /**
     * The start/stop methods will
     * <br>   assemble/disassemble a virtual drive from several physical
     * <br>   drives.
    */
    int MULTIDISK = 3;

    /**
     * The start/stop methods will
     * <br>   unlock/lock the disk (for example using the ATA &lt;quote&gt;SECURITY
     * <br>   UNLOCK DEVICE&lt;/quote&gt; command)
    */
    int PASSWORD = 4;

}

/*
enumeration-type
*/
