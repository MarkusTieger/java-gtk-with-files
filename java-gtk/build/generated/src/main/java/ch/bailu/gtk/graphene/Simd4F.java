/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Simd4F extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Simd4F.class.getCanonicalName());
    }

    public Simd4F(PointerContainer pointer) {
        super(pointer);
    }

    public Simd4F() {
        super(cast(JnaSimd4F.allocateStructure()));
    }

    private JnaSimd4F.Fields _fields;
    
    JnaSimd4F.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSimd4F.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
    */
    public static final String X = "x";

    /**
     * 
    */
    public float getFieldX() {
       toFields().readField(X);
       return toFields().x;
    } 

    /**
     * 
    */
    public static final String Y = "y";

    /**
     * 
    */
    public float getFieldY() {
       toFields().readField(Y);
       return toFields().y;
    } 

    /**
     * 
    */
    public static final String Z = "z";

    /**
     * 
    */
    public float getFieldZ() {
       toFields().readField(Z);
       return toFields().z;
    } 

    /**
     * 
    */
    public static final String W = "w";

    /**
     * 
    */
    public float getFieldW() {
       toFields().readField(W);
       return toFields().w;
    } 

}

/*
record-type
all-fields-supported
*/
