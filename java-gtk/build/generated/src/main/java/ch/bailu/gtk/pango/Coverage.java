/* this file is machine generated */
package ch.bailu.gtk.pango;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `PangoCoverage` structure is a map from Unicode characters
 * <br>to [enum&#64;Pango.CoverageLevel] values.
 * <br>
 * <br>It is often necessary in Pango to determine if a particular
 * <br>font can represent a particular character, and also how well
 * <br>it can represent that character. The `PangoCoverage` is a data
 * <br>structure that is used to represent that information. It is an
 * <br>opaque structure with no public fields.
 * <p><a href="https://docs.gtk.org/Pango/class.Coverage.html">https://docs.gtk.org/Pango/class.Coverage.html</a></p>
*/
public class Coverage extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Coverage.class.getCanonicalName());
    }

    public Coverage(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new `PangoCoverage`
    */
    public Coverage() {
        super(cast(JnaCoverage.INST().pango_coverage_new()));
    }

    /**
     * Copy an existing `PangoCoverage`.
     * @return the newly allocated `PangoCoverage`,   with a reference count of one, which should be freed with   [method&#64;Pango.Coverage.unref].
    */
    public Coverage copy()  {
        return new Coverage(new PointerContainer(JnaCoverage.INST().pango_coverage_copy(asCPointer())));
    }

    /**
     * Determine whether a particular index is covered by &#64;coverage.
     * @param index_ the index to check
     * @return the coverage level of &#64;coverage for character &#64;index_.
    */
    public int get(int index_)  {
        return JnaCoverage.INST().pango_coverage_get(asCPointer(), index_);
    }

    /**
     * Modify a particular index within &#64;coverage
     * @param index_ the index to modify
     * @param level the new level for &#64;index_
    */
    public void set(int index_, int level)  {
        JnaCoverage.INST().pango_coverage_set(asCPointer(), index_, level);
    }

    public static long getTypeID() { 
        return JnaCoverage.INST().pango_coverage_get_type(); 
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

[MethodModel:cb-deprecated:max:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{Gg:Coverage:{c:PangoCoverage*}}:{j:long}]

[MethodModel:cb-deprecated:ref:[ParameterModel:Supported:{Gg:Coverage:{c:PangoCoverage*}}:{j:long}]]

[MethodModel:cb-deprecated:java-type-not-supported:toBytes:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar**}}:{j:}]
        [ParameterModel:Supported:{Gw:Int:{c:int*}}:{j:long}]

[MethodModel:cb-deprecated:unref:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]

[MethodModel:cb-deprecated:java-type-not-supported:fromBytes:[ParameterModel:Supported:{Gg:Coverage:{c:PangoCoverage*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guchar*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
