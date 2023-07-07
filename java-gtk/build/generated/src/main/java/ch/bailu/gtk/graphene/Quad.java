/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A 4 vertex quadrilateral, as represented by four &#35;graphene_point_t.
 * <br>
 * <br>The contents of a &#35;graphene_quad_t are private and should never be
 * <br>accessed directly.
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public class Quad extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Quad.class.getCanonicalName());
    }

    public Quad(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a new &#35;graphene_quad_t instance.
     * <br>
     * <br>The contents of the returned instance are undefined.
     * @return the newly created &#35;graphene_quad_t instance
    */
    public static Quad allocQuad()  {
        PointerContainer __self = cast(JnaQuad.INST().graphene_quad_alloc());
        if (__self.isNull()) {
            throw new NullPointerException("Quad:alloc");
        }
        return new Quad(__self);
    }        
    

    /**
     * Computes the bounding rectangle of &#64;q and places it into &#64;r.
     * @param r return location for a &#35;graphene_rect_t
    */
    public void bounds(@Nonnull Rect r)  {
        JnaQuad.INST().graphene_quad_bounds(asCPointer(), asCPointerNotNull(r));
    }

    /**
     * Checks if the given &#35;graphene_quad_t contains the given &#35;graphene_point_t.
     * @param p a &#35;graphene_point_t
     * @return `true` if the point is inside the &#35;graphene_quad_t
    */
    public boolean contains(@Nonnull Point p)  {
        return JnaQuad.INST().graphene_quad_contains(asCPointer(), asCPointerNotNull(p));
    }

    /**
     * Frees the resources allocated by graphene_quad_alloc()
    */
    public void free()  {
        JnaQuad.INST().graphene_quad_free(asCPointer());
    }

    /**
     * Initializes a &#35;graphene_quad_t with the given points.
     * @param p1 the first point of the quadrilateral
     * @param p2 the second point of the quadrilateral
     * @param p3 the third point of the quadrilateral
     * @param p4 the fourth point of the quadrilateral
     * @return the initialized &#35;graphene_quad_t
    */
    public Quad init(@Nonnull Point p1, @Nonnull Point p2, @Nonnull Point p3, @Nonnull Point p4)  {
        return new Quad(new PointerContainer(JnaQuad.INST().graphene_quad_init(asCPointer(), asCPointerNotNull(p1), asCPointerNotNull(p2), asCPointerNotNull(p3), asCPointerNotNull(p4))));
    }

    /**
     * Initializes a &#35;graphene_quad_t using the four corners of the
     * <br>given &#35;graphene_rect_t.
     * @param r a &#35;graphene_rect_t
     * @return the initialized &#35;graphene_quad_t
    */
    public Quad initFromRect(@Nonnull Rect r)  {
        return new Quad(new PointerContainer(JnaQuad.INST().graphene_quad_init_from_rect(asCPointer(), asCPointerNotNull(r))));
    }

    public static long getTypeID() { 
        return JnaQuad.INST().graphene_quad_get_type(); 
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

[MethodModel:java-type-not-supported:getPoint:[ParameterModel:Supported:{Gg:Point:{c:const graphene_point_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:unsigned int}}:{j:}]

[MethodModel:java-type-not-supported:initFromPoints:[ParameterModel:Supported:{Gg:Quad:{c:graphene_quad_t*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const graphene_point_t*}}:{j:}]

[FieldModel:points:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
