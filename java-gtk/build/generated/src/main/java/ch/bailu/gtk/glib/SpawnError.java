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
public interface SpawnError {

    /**
     * Fork failed due to lack of memory.
    */
    int FORK = 0;

    /**
     * Read or select on pipes failed.
    */
    int READ = 1;

    /**
     * Changing to working directory failed.
    */
    int CHDIR = 2;

    /**
     * execv() returned `EACCES`
    */
    int ACCES = 3;

    /**
     * execv() returned `EPERM`
    */
    int PERM = 4;

    /**
     * execv() returned `E2BIG`
    */
    int TOO_BIG = 5;

    /**
     * deprecated alias for %G_SPAWN_ERROR_TOO_BIG (deprecated since GLib 2.32)
    */
    int _2BIG = 5;

    /**
     * execv() returned `ENOEXEC`
    */
    int NOEXEC = 6;

    /**
     * execv() returned `ENAMETOOLONG`
    */
    int NAMETOOLONG = 7;

    /**
     * execv() returned `ENOENT`
    */
    int NOENT = 8;

    /**
     * execv() returned `ENOMEM`
    */
    int NOMEM = 9;

    /**
     * execv() returned `ENOTDIR`
    */
    int NOTDIR = 10;

    /**
     * execv() returned `ELOOP`
    */
    int LOOP = 11;

    /**
     * execv() returned `ETXTBUSY`
    */
    int TXTBUSY = 12;

    /**
     * execv() returned `EIO`
    */
    int IO = 13;

    /**
     * execv() returned `ENFILE`
    */
    int NFILE = 14;

    /**
     * execv() returned `EMFILE`
    */
    int MFILE = 15;

    /**
     * execv() returned `EINVAL`
    */
    int INVAL = 16;

    /**
     * execv() returned `EISDIR`
    */
    int ISDIR = 17;

    /**
     * execv() returned `ELIBBAD`
    */
    int LIBBAD = 18;

    /**
     * Some other fatal failure,
     * <br>  `error-&gt;message` should explain.
    */
    int FAILED = 19;

}

/*
enumeration-type
*/
