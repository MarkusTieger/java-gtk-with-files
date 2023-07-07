/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkTreeIter` is the primary structure
 * <br>for accessing a `GtkTreeModel`. Models are expected to put a unique
 * <br>integer in the &#64;stamp member, and put
 * <br>model-specific data in the three &#64;user_data
 * <br>members.
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreeIter.html">https://docs.gtk.org/gtk4/struct.TreeIter.html</a></p>
*/
public class TreeIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeIter.class.getCanonicalName());
    }

    public TreeIter(PointerContainer pointer) {
        super(pointer);
    }

    public TreeIter() {
        super(cast(JnaTreeIter.allocateStructure()));
    }

    private JnaTreeIter.Fields _fields;
    
    JnaTreeIter.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTreeIter.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * a unique stamp to catch invalid iterators
    */
    public static final String STAMP = "stamp";

    /**
     * a unique stamp to catch invalid iterators
    */
    public void setFieldStamp(int stamp) {
        toFields().stamp = stamp;
        toFields().writeField(STAMP);
    }

    /**
     * a unique stamp to catch invalid iterators
    */
    public int getFieldStamp() {
       toFields().readField(STAMP);
       return toFields().stamp;
    } 

    /**
     * model-specific data
    */
    public static final String USER_DATA = "user_data";

    /**
     * model-specific data
    */
    public void setFieldUserData(ch.bailu.gtk.type.Pointer user_data) {
        toFields().user_data = user_data.asCPointer();
        toFields().writeField(USER_DATA);
    }

    /**
     * model-specific data
    */
    public ch.bailu.gtk.type.Pointer getFieldUserData() {
       toFields().readField(USER_DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().user_data));
    } 

    /**
     * model-specific data
    */
    public static final String USER_DATA2 = "user_data2";

    /**
     * model-specific data
    */
    public void setFieldUserData2(ch.bailu.gtk.type.Pointer user_data2) {
        toFields().user_data2 = user_data2.asCPointer();
        toFields().writeField(USER_DATA2);
    }

    /**
     * model-specific data
    */
    public ch.bailu.gtk.type.Pointer getFieldUserData2() {
       toFields().readField(USER_DATA2);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().user_data2));
    } 

    /**
     * model-specific data
    */
    public static final String USER_DATA3 = "user_data3";

    /**
     * model-specific data
    */
    public void setFieldUserData3(ch.bailu.gtk.type.Pointer user_data3) {
        toFields().user_data3 = user_data3.asCPointer();
        toFields().writeField(USER_DATA3);
    }

    /**
     * model-specific data
    */
    public ch.bailu.gtk.type.Pointer getFieldUserData3() {
       toFields().readField(USER_DATA3);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().user_data3));
    } 

    /**
     * Creates a dynamically allocated tree iterator as a copy of &#64;iter.
     * <br>
     * <br>This function is not intended for use in applications,
     * <br>because you can just copy the structs by value
     * <br>(`GtkTreeIter new_iter = iter;`).
     * <br>You must free this iter with gtk_tree_iter_free().
     * @return a newly-allocated copy of &#64;iter
    */
    public TreeIter copy()  {
        return new TreeIter(new PointerContainer(JnaTreeIter.INST().gtk_tree_iter_copy(asCPointer())));
    }

    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     * <br>
     * <br>This function is mainly used for language bindings.
    */
    public void free()  {
        JnaTreeIter.INST().gtk_tree_iter_free(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTreeIter.INST().gtk_tree_iter_get_type(); 
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
