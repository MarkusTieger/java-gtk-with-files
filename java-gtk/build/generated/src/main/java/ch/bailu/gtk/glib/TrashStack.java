/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Each piece of memory that is pushed onto the stack
 * <br>is cast to a GTrashStack*.
 * <p><a href="https://docs.gtk.org/glib/struct.TrashStack.html">https://docs.gtk.org/glib/struct.TrashStack.html</a></p>
*/
public class TrashStack extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TrashStack.class.getCanonicalName());
    }

    public TrashStack(PointerContainer pointer) {
        super(pointer);
    }

    public TrashStack() {
        super(cast(JnaTrashStack.allocateStructure()));
    }

    private JnaTrashStack.Fields _fields;
    
    JnaTrashStack.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaTrashStack.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * pointer to the previous element of the stack,
     * <br>    gets stored in the first `sizeof (gpointer)`
     * <br>    bytes of the element
    */
    public static final String NEXT = "next";

    /**
     * pointer to the previous element of the stack,
     * <br>    gets stored in the first `sizeof (gpointer)`
     * <br>    bytes of the element
    */
    public void setFieldNext(TrashStack next) {
        toFields().next = next.asCPointer();
        toFields().writeField(NEXT);
    }

    /**
     * pointer to the previous element of the stack,
     * <br>    gets stored in the first `sizeof (gpointer)`
     * <br>    bytes of the element
    */
    public TrashStack getFieldNext() {
       toFields().readField(NEXT);
       return new TrashStack(new PointerContainer(toFields().next));
    } 

}

/*
record-type
all-fields-supported

[MethodModel:cb-deprecated:java-type-not-supported:height:[ParameterModel:Supported:{G_::{c:guint}}:{j:int}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:peek:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:pop:[ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]

[MethodModel:cb-deprecated:java-type-not-supported:push:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:GTrashStack**}}:{j:}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
