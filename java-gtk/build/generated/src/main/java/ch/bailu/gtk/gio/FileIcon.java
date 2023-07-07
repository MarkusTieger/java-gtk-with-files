/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GFileIcon specifies an icon by pointing to an image file
 * <br>to be used as icon.
 * <p><a href="https://docs.gtk.org/gio/class.FileIcon.html">https://docs.gtk.org/gio/class.FileIcon.html</a></p>
*/
public class FileIcon extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileIcon.class.getCanonicalName());
    }

    public FileIcon(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new icon for a file.
     * @param file a &#35;GFile.
    */
    public FileIcon(@Nonnull File file) {
        super(cast(JnaFileIcon.INST().g_file_icon_new(asCPointerNotNull(file))));
    }

    /**
     * Gets the &#35;GFile associated with the given &#64;icon.
     * @return a &#35;GFile.
    */
    public File getFile()  {
        return new File(new PointerContainer(JnaFileIcon.INST().g_file_icon_get_file(asCPointer())));
    }

    /**
     * Implements interface {@link Icon}. Call this to get access to interface functions.
     * @return {@link Icon}
    */
    public Icon asIcon() {
        return new Icon(cast());
    }

    /**
     * Implements interface {@link LoadableIcon}. Call this to get access to interface functions.
     * @return {@link LoadableIcon}
    */
    public LoadableIcon asLoadableIcon() {
        return new LoadableIcon(cast());
    }

    public static long getTypeID() { 
        return JnaFileIcon.INST().g_file_icon_get_type(); 
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
