/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A size.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Size extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Size.class.getCanonicalName());
    }

    public Size(PointerContainer pointer) {
        super(pointer);
    }

    public Size() {
        super(cast(JnaSize.allocateStructure()));
    }

    private JnaSize.Fields _fields;
    
    JnaSize.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaSize.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the width
    */
    public static final String WIDTH = "width";

    /**
     * the width
    */
    public void setFieldWidth(float width) {
        toFields().width = width;
        toFields().writeField(WIDTH);
    }

    /**
     * the width
    */
    public float getFieldWidth() {
       toFields().readField(WIDTH);
       return toFields().width;
    } 

    /**
     * the height
    */
    public static final String HEIGHT = "height";

    /**
     * the height
    */
    public void setFieldHeight(float height) {
        toFields().height = height;
        toFields().writeField(HEIGHT);
    }

    /**
     * the height
    */
    public float getFieldHeight() {
       toFields().readField(HEIGHT);
       return toFields().height;
    } 

    /**
     * Allocates a new &#35;graphene_size_t.
     * <br>
     * <br>The contents of the returned value are undefined.
     * @return the newly allocated &#35;graphene_size_t
    */
    public static Size allocSize()  {
        PointerContainer __self = cast(JnaSize.INST().graphene_size_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Size:alloc");
        }
        return new Size(__self);
    }        
    

    /**
     * Checks whether the two give &#35;graphene_size_t are equal.
     * @param b a &#35;graphene_size_t
     * @return `true` if the sizes are equal
    */
    public boolean equal(@Nonnull Size b)  {
        return JnaSize.INST().graphene_size_equal(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Frees the resources allocated by graphene_size_alloc().
    */
    public void free()  {
        JnaSize.INST().graphene_size_free(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_size_t using the given &#64;width and &#64;height.
     * @param width the width
     * @param height the height
     * @return the initialized &#35;graphene_size_t
    */
    public Size init(float width, float height)  {
        return new Size(new PointerContainer(JnaSize.INST().graphene_size_init(asCPointer(), width, height)));
    }

    /**
     * Initializes a &#35;graphene_size_t using the width and height of
     * <br>the given &#64;src.
     * @param src a &#35;graphene_size_t
     * @return the initialized &#35;graphene_size_t
    */
    public Size initFromSize(@Nonnull Size src)  {
        return new Size(new PointerContainer(JnaSize.INST().graphene_size_init_from_size(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Linearly interpolates the two given &#35;graphene_size_t using the given
     * <br>interpolation &#64;factor.
     * @param b a &#35;graphene_size_t
     * @param factor the linear interpolation factor
     * @param res return location for the interpolated size
    */
    public void interpolate(@Nonnull Size b, double factor, @Nonnull Size res)  {
        JnaSize.INST().graphene_size_interpolate(asCPointer(), asCPointerNotNull(b), factor, asCPointerNotNull(res));
    }

    /**
     * Scales the components of a &#35;graphene_size_t using the given &#64;factor.
     * @param factor the scaling factor
     * @param res return location for the scaled size
    */
    public void scale(float factor, @Nonnull Size res)  {
        JnaSize.INST().graphene_size_scale(asCPointer(), factor, asCPointerNotNull(res));
    }

    /**
     * A constant pointer to a zero &#35;graphene_size_t, useful for
     * <br>equality checks and interpolations.
     * @return a constant size
    */
    public static Size zero()  {
        return new Size(new PointerContainer(JnaSize.INST().graphene_size_zero()));
    }

    public static long getTypeID() { 
        return JnaSize.INST().graphene_size_get_type(); 
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
