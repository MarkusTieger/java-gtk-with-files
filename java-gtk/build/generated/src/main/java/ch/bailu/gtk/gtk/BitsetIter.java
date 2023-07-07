/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque, stack-allocated struct for iterating
 * <br>over the elements of a `GtkBitset`.
 * <br>
 * <br>Before a `GtkBitsetIter` can be used, it needs to be initialized with
 * <br>[func&#64;Gtk.BitsetIter.init_first], [func&#64;Gtk.BitsetIter.init_last]
 * <br>or [func&#64;Gtk.BitsetIter.init_at].
 * <p><a href="https://docs.gtk.org/gtk4/struct.BitsetIter.html">https://docs.gtk.org/gtk4/struct.BitsetIter.html</a></p>
*/
public class BitsetIter extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BitsetIter.class.getCanonicalName());
    }

    public BitsetIter(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the current value that &#64;iter points to.
     * <br>
     * <br>If &#64;iter is not valid and [method&#64;Gtk.BitsetIter.is_valid]
     * <br>returns %FALSE, this function returns 0.
     * @return The current value pointer to by &#64;iter
    */
    public int getValue()  {
        return JnaBitsetIter.INST().gtk_bitset_iter_get_value(asCPointer());
    }

    /**
     * Checks if &#64;iter points to a valid value.
     * @return %TRUE if &#64;iter points to a valid value
    */
    public boolean isValid()  {
        return JnaBitsetIter.INST().gtk_bitset_iter_is_valid(asCPointer());
    }

    public static long getTypeID() { 
        return JnaBitsetIter.INST().gtk_bitset_iter_get_type(); 
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
some-fields-unsupported

[MethodModel:java-type-not-supported:next:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:previous:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[FieldModel:private_data:java-type-not-supported:{G_::{c:void*}}:{j:}]

[MethodModel:java-type-not-supported:initAt:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:initFirst:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]

[MethodModel:java-type-not-supported:initLast:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gg:BitsetIter:{c:GtkBitsetIter*}}:{j:long}]
        [ParameterModel:Supported:{Gg:Bitset:{c:const GtkBitset*}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
