/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkRequisition` represents the desired size of a widget. See
 * <br>[GtkWidget’s geometry management section](class.Widget.html&#35;height-for-width-geometry-management) for
 * <br>more information.
 * <p><a href="https://docs.gtk.org/gtk4/struct.Requisition.html">https://docs.gtk.org/gtk4/struct.Requisition.html</a></p>
*/
public class Requisition extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Requisition.class.getCanonicalName());
    }

    public Requisition(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRequisition.Fields _fields;
    
    JnaRequisition.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRequisition.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the widget’s desired width
    */
    public static final String WIDTH = "width";

    /**
     * the widget’s desired width
    */
    public void setFieldWidth(int width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * the widget’s desired width
    */
    public int getFieldWidth() {
       toFields().readField(WIDTH);
       return toFields().width;
    } 

    /**
     * the widget’s desired height
    */
    public static final String HEIGHT = "height";

    /**
     * the widget’s desired height
    */
    public void setFieldHeight(int height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * the widget’s desired height
    */
    public int getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    /**
     * Allocates a new `GtkRequisition`.
     * <br>
     * <br>The struct is initialized to zero.
    */
    public Requisition() {
        super(cast(JnaRequisition.INST().gtk_requisition_new()));
    }

    /**
     * Copies a `GtkRequisition`.
     * @return a copy of &#64;requisition
    */
    public Requisition copy()  {
        return new Requisition(new PointerContainer(JnaRequisition.INST().gtk_requisition_copy(asCPointer())));
    }

    /**
     * Frees a `GtkRequisition`.
    */
    public void free()  {
        JnaRequisition.INST().gtk_requisition_free(asCPointer());
    }

    public static long getTypeID() { 
        return JnaRequisition.INST().gtk_requisition_get_type(); 
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
