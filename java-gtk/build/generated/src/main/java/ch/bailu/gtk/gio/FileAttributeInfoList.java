/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Acts as a lightweight registry for possible valid file attributes.
 * <br>The registry stores Key-Value pair formats as &#35;GFileAttributeInfos.
 * <p><a href="https://docs.gtk.org/gio/struct.FileAttributeInfoList.html">https://docs.gtk.org/gio/struct.FileAttributeInfoList.html</a></p>
*/
public class FileAttributeInfoList extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileAttributeInfoList.class.getCanonicalName());
    }

    public FileAttributeInfoList(PointerContainer pointer) {
        super(pointer);
    }

    private JnaFileAttributeInfoList.Fields _fields;
    
    JnaFileAttributeInfoList.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaFileAttributeInfoList.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * an array of &#35;GFileAttributeInfos.
    */
    public static final String INFOS = "infos";

    /**
     * an array of &#35;GFileAttributeInfos.
    */
    public void setFieldInfos(FileAttributeInfo infos) {
        toFields().infos = infos.asCPointer();
        toFields().writeField(INFOS);
    }

    /**
     * an array of &#35;GFileAttributeInfos.
    */
    public FileAttributeInfo getFieldInfos() {
       toFields().readField(INFOS);
       return new FileAttributeInfo(new PointerContainer(toFields().infos));
    } 

    /**
     * the number of values in the array.
    */
    public static final String N_INFOS = "n_infos";

    /**
     * the number of values in the array.
    */
    public void setFieldNInfos(int n_infos) {
        toFields().n_infos = n_infos;
        toFields().writeField(N_INFOS);
    }

    /**
     * the number of values in the array.
    */
    public int getFieldNInfos() {
       toFields().readField(N_INFOS);
       return toFields().n_infos;
    } 

    /**
     * Creates a new file attribute info list.
    */
    public FileAttributeInfoList() {
        super(cast(JnaFileAttributeInfoList.INST().g_file_attribute_info_list_new()));
    }

    /**
     * Adds a new attribute with &#64;name to the &#64;list, setting
     * <br>its &#64;type and &#64;flags.
     * @param name the name of the attribute to add.
     * @param type the &#35;GFileAttributeType for the attribute.
     * @param flags &#35;GFileAttributeInfoFlags for the attribute.
    */
    public void add(@Nonnull ch.bailu.gtk.type.Str name, int type, int flags)  {
        JnaFileAttributeInfoList.INST().g_file_attribute_info_list_add(asCPointer(), asCPointerNotNull(name), type, flags);
    }

    /**
     * Adds a new attribute with &#64;name to the &#64;list, setting
     * <br>its &#64;type and &#64;flags.
     * @param name the name of the attribute to add.
     * @param type the &#35;GFileAttributeType for the attribute.
     * @param flags &#35;GFileAttributeInfoFlags for the attribute.
    */
    public void add(String name, int type, int flags)  {
        JnaFileAttributeInfoList.INST().g_file_attribute_info_list_add(asCPointer(), name, type, flags);
    }

    /**
     * Makes a duplicate of a file attribute info list.
     * @return a copy of the given &#64;list.
    */
    public FileAttributeInfoList dup()  {
        return new FileAttributeInfoList(new PointerContainer(JnaFileAttributeInfoList.INST().g_file_attribute_info_list_dup(asCPointer())));
    }

    /**
     * Gets the file attribute with the name &#64;name from &#64;list.
     * @param name the name of the attribute to look up.
     * @return a &#35;GFileAttributeInfo for the &#64;name, or %NULL if an attribute isn't found.
    */
    public FileAttributeInfo lookup(@Nonnull ch.bailu.gtk.type.Str name)  {
        return new FileAttributeInfo(new PointerContainer(JnaFileAttributeInfoList.INST().g_file_attribute_info_list_lookup(asCPointer(), asCPointerNotNull(name))));
    }

    /**
     * Gets the file attribute with the name &#64;name from &#64;list.
     * @param name the name of the attribute to look up.
     * @return a &#35;GFileAttributeInfo for the &#64;name, or %NULL if an attribute isn't found.
    */
    public FileAttributeInfo lookup(String name)  {
        return new FileAttributeInfo(new PointerContainer(JnaFileAttributeInfoList.INST().g_file_attribute_info_list_lookup(asCPointer(), name)));
    }

    /**
     * References a file attribute info list.
     * @return &#35;GFileAttributeInfoList or %NULL on error.
    */
    public FileAttributeInfoList ref()  {
        return new FileAttributeInfoList(new PointerContainer(JnaFileAttributeInfoList.INST().g_file_attribute_info_list_ref(asCPointer())));
    }

    /**
     * Removes a reference from the given &#64;list. If the reference count
     * <br>falls to zero, the &#64;list is deleted.
    */
    public void unref()  {
        JnaFileAttributeInfoList.INST().g_file_attribute_info_list_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFileAttributeInfoList.INST().g_file_attribute_info_list_get_type(); 
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
*/
