/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque type representing a list of files.
 * <p><a href="https://docs.gtk.org/gdk4/struct.FileList.html">https://docs.gtk.org/gdk4/struct.FileList.html</a></p>
*/
public class FileList extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileList.class.getCanonicalName());
    }

    public FileList(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new files list container from a singly linked list of
     * <br>`GFile` instances.
     * <br>
     * <br>This function is meant to be used by language bindings
     * @param files a list of files
     * @return the newly created files list
    */
    public static FileList newFromListFileList(@Nonnull ch.bailu.gtk.glib.SList files)  {
        PointerContainer __self = cast(JnaFileList.INST().gdk_file_list_new_from_list(asCPointerNotNull(files)));
        if (__self.isNull()) {
            throw new NullPointerException("FileList:newFromList");
        }
        return new FileList(__self);
    }        
    

    /**
     * Retrieves the list of files inside a `GdkFileList`.
     * <br>
     * <br>This function is meant for language bindings.
     * @return the files inside the list
    */
    public ch.bailu.gtk.glib.SList getFiles()  {
        return new ch.bailu.gtk.glib.SList(new PointerContainer(JnaFileList.INST().gdk_file_list_get_files(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaFileList.INST().gdk_file_list_get_type(); 
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
record-type
all-fields-supported

[MethodModel:java-type-not-supported:newFromArray:[ParameterModel:Supported:{Gg:FileList:{c:GdkFileList*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GFile**}}:{j:}]
        [ParameterModel:Supported:{G_::{c:gsize}}:{j:long}]
*/
