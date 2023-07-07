/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GMappedFile represents a file mapping created with
 * <br>g_mapped_file_new(). It has only private members and should
 * <br>not be accessed directly.
 * <p><a href="https://docs.gtk.org/glib/struct.MappedFile.html">https://docs.gtk.org/glib/struct.MappedFile.html</a></p>
*/
public class MappedFile extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MappedFile.class.getCanonicalName());
    }

    public MappedFile(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * <br>
     * <br>If &#64;writable is %TRUE, the mapped buffer may be modified, otherwise
     * <br>it is an error to modify the mapped buffer. Modifications to the buffer
     * <br>are not visible to other processes mapping the same file, and are not
     * <br>written back to the file.
     * <br>
     * <br>Note that modifications of the underlying file might affect the contents
     * <br>of the &#35;GMappedFile. Therefore, mapping should only be used if the file
     * <br>will not be modified, or if all modifications of the file are done
     * <br>atomically (e.g. using g_file_set_contents()).
     * @param fd The file descriptor of the file to load
     * @param writable whether the mapping should be writable
     * @return a newly allocated &#35;GMappedFile which must be unref'd    with g_mapped_file_unref(), or %NULL if the mapping failed.
    */
    public static MappedFile newFromFdMappedFile(int fd, boolean writable) throws ch.bailu.gtk.type.exception.AllocationError {
        PointerContainer __self = cast(JnaMappedFile.INST().g_mapped_file_new_from_fd(fd, writable, 0L));
        if (__self.isNull()) {
            throw new ch.bailu.gtk.type.exception.AllocationError("MappedFile:newFromFd");
        }
        return new MappedFile(__self);
    }        
    

    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * <br>
     * <br>If &#64;writable is %TRUE, the mapped buffer may be modified, otherwise
     * <br>it is an error to modify the mapped buffer. Modifications to the buffer
     * <br>are not visible to other processes mapping the same file, and are not
     * <br>written back to the file.
     * <br>
     * <br>Note that modifications of the underlying file might affect the contents
     * <br>of the &#35;GMappedFile. Therefore, mapping should only be used if the file
     * <br>will not be modified, or if all modifications of the file are done
     * <br>atomically (e.g. using g_file_set_contents()).
     * <br>
     * <br>If &#64;filename is the name of an empty, regular file, the function
     * <br>will successfully return an empty &#35;GMappedFile. In other cases of
     * <br>size 0 (e.g. device files such as /dev/null), &#64;error will be set
     * <br>to the &#35;GFileError value %G_FILE_ERROR_INVAL.
     * @param filename The path of the file to load, in the GLib     filename encoding
     * @param writable whether the mapping should be writable
    */
    public MappedFile(@Nonnull ch.bailu.gtk.type.Str filename, boolean writable) {
        super(cast(JnaMappedFile.INST().g_mapped_file_new(asCPointerNotNull(filename), writable, 0L)));
    }

    /**
     * Maps a file into memory. On UNIX, this is using the mmap() function.
     * <br>
     * <br>If &#64;writable is %TRUE, the mapped buffer may be modified, otherwise
     * <br>it is an error to modify the mapped buffer. Modifications to the buffer
     * <br>are not visible to other processes mapping the same file, and are not
     * <br>written back to the file.
     * <br>
     * <br>Note that modifications of the underlying file might affect the contents
     * <br>of the &#35;GMappedFile. Therefore, mapping should only be used if the file
     * <br>will not be modified, or if all modifications of the file are done
     * <br>atomically (e.g. using g_file_set_contents()).
     * <br>
     * <br>If &#64;filename is the name of an empty, regular file, the function
     * <br>will successfully return an empty &#35;GMappedFile. In other cases of
     * <br>size 0 (e.g. device files such as /dev/null), &#64;error will be set
     * <br>to the &#35;GFileError value %G_FILE_ERROR_INVAL.
     * @param filename The path of the file to load, in the GLib     filename encoding
     * @param writable whether the mapping should be writable
    */
    public MappedFile(String filename, boolean writable) {
        super(cast(JnaMappedFile.INST().g_mapped_file_new(filename, writable, 0L)));
    }

    /**
     * Creates a new &#35;GBytes which references the data mapped from &#64;file.
     * <br>The mapped contents of the file must not be modified after creating this
     * <br>bytes object, because a &#35;GBytes should be immutable.
     * @return A newly allocated &#35;GBytes referencing data     from &#64;file
    */
    public Bytes getBytes()  {
        return new Bytes(new PointerContainer(JnaMappedFile.INST().g_mapped_file_get_bytes(asCPointer())));
    }

    /**
     * Returns the contents of a &#35;GMappedFile.
     * <br>
     * <br>Note that the contents may not be zero-terminated,
     * <br>even if the &#35;GMappedFile is backed by a text file.
     * <br>
     * <br>If the file is empty then %NULL is returned.
     * @return the contents of &#64;file, or %NULL.
    */
    public ch.bailu.gtk.type.Str getContents()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaMappedFile.INST().g_mapped_file_get_contents(asCPointer())));
    }

    /**
     * Returns the length of the contents of a &#35;GMappedFile.
     * @return the length of the contents of &#64;file.
    */
    public long getLength()  {
        return JnaMappedFile.INST().g_mapped_file_get_length(asCPointer());
    }

    /**
     * Increments the reference count of &#64;file by one.  It is safe to call
     * <br>this function from any thread.
     * @return the passed in &#35;GMappedFile.
    */
    public MappedFile ref()  {
        return new MappedFile(new PointerContainer(JnaMappedFile.INST().g_mapped_file_ref(asCPointer())));
    }

    /**
     * Decrements the reference count of &#64;file by one.  If the reference count
     * <br>drops to 0, unmaps the buffer of &#64;file and frees it.
     * <br>
     * <br>It is safe to call this function from any thread.
     * <br>
     * <br>Since 2.22
    */
    public void unref()  {
        JnaMappedFile.INST().g_mapped_file_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaMappedFile.INST().g_mapped_file_get_type(); 
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

[MethodModel:cb-deprecated:free:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
*/
