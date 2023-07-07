/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface FileError {

    /**
     * Operation not permitted; only the owner of
     * <br>    the file (or other resource) or processes with special privileges
     * <br>    can perform the operation.
    */
    int EXIST = 0;

    /**
     * File is a directory; you cannot open a directory
     * <br>    for writing, or create or remove hard links to it.
    */
    int ISDIR = 1;

    /**
     * Permission denied; the file permissions do not
     * <br>    allow the attempted operation.
    */
    int ACCES = 2;

    /**
     * Filename too long.
    */
    int NAMETOOLONG = 3;

    /**
     * No such file or directory. This is a &quot;file
     * <br>    doesn't exist&quot; error for ordinary files that are referenced in
     * <br>    contexts where they are expected to already exist.
    */
    int NOENT = 4;

    /**
     * A file that isn't a directory was specified when
     * <br>    a directory is required.
    */
    int NOTDIR = 5;

    /**
     * No such device or address. The system tried to
     * <br>    use the device represented by a file you specified, and it
     * <br>    couldn't find the device. This can mean that the device file was
     * <br>    installed incorrectly, or that the physical device is missing or
     * <br>    not correctly attached to the computer.
    */
    int NXIO = 6;

    /**
     * The underlying file system of the specified file
     * <br>    does not support memory mapping.
    */
    int NODEV = 7;

    /**
     * The directory containing the new link can't be
     * <br>    modified because it's on a read-only file system.
    */
    int ROFS = 8;

    /**
     * Text file busy.
    */
    int TXTBSY = 9;

    /**
     * You passed in a pointer to bad memory.
     * <br>    (GLib won't reliably return this, don't pass in pointers to bad
     * <br>    memory.)
    */
    int FAULT = 10;

    /**
     * Too many levels of symbolic links were encountered
     * <br>    in looking up a file name. This often indicates a cycle of symbolic
     * <br>    links.
    */
    int LOOP = 11;

    /**
     * No space left on device; write operation on a
     * <br>    file failed because the disk is full.
    */
    int NOSPC = 12;

    /**
     * No memory available. The system cannot allocate
     * <br>    more virtual memory because its capacity is full.
    */
    int NOMEM = 13;

    /**
     * The current process has too many files open and
     * <br>    can't open any more. Duplicate descriptors do count toward this
     * <br>    limit.
    */
    int MFILE = 14;

    /**
     * There are too many distinct file openings in the
     * <br>    entire system.
    */
    int NFILE = 15;

    /**
     * Bad file descriptor; for example, I/O on a
     * <br>    descriptor that has been closed or reading from a descriptor open
     * <br>    only for writing (or vice versa).
    */
    int BADF = 16;

    /**
     * Invalid argument. This is used to indicate
     * <br>    various kinds of problems with passing the wrong argument to a
     * <br>    library function.
    */
    int INVAL = 17;

    /**
     * Broken pipe; there is no process reading from the
     * <br>    other end of a pipe. Every library function that returns this
     * <br>    error code also generates a 'SIGPIPE' signal; this signal
     * <br>    terminates the program if not handled or blocked. Thus, your
     * <br>    program will never actually see this code unless it has handled
     * <br>    or blocked 'SIGPIPE'.
    */
    int PIPE = 18;

    /**
     * Resource temporarily unavailable; the call might
     * <br>    work if you try again later.
    */
    int AGAIN = 19;

    /**
     * Interrupted function call; an asynchronous signal
     * <br>    occurred and prevented completion of the call. When this
     * <br>    happens, you should try the call again.
    */
    int INTR = 20;

    /**
     * Input/output error; usually used for physical read
     * <br>   or write errors. i.e. the disk or other physical device hardware
     * <br>   is returning errors.
    */
    int IO = 21;

    /**
     * Operation not permitted; only the owner of the
     * <br>   file (or other resource) or processes with special privileges can
     * <br>   perform the operation.
    */
    int PERM = 22;

    /**
     * Function not implemented; this indicates that
     * <br>   the system is missing some functionality.
    */
    int NOSYS = 23;

    /**
     * Does not correspond to a UNIX error code; this
     * <br>   is the standard &quot;failed for unspecified reason&quot; error code present
     * <br>   in all &#35;GError error code enumerations. Returned if no specific
     * <br>   code applies.
    */
    int FAILED = 24;

}

/*
enumeration-type
*/
