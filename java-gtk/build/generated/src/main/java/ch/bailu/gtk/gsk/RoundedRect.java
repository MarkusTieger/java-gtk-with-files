/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A rectangular region with rounded corners.
 * <br>
 * <br>Application code should normalize rectangles using
 * <br>[method&#64;Gsk.RoundedRect.normalize]; this function will ensure that
 * <br>the bounds of the rectangle are normalized and ensure that the corner
 * <br>values are positive and the corners do not overlap.
 * <br>
 * <br>All functions taking a `GskRoundedRect` as an argument will internally
 * <br>operate on a normalized copy; all functions returning a `GskRoundedRect`
 * <br>will always return a normalized one.
 * <br>
 * <br>The algorithm used for normalizing corner sizes is described in
 * <br>[the CSS specification](https://drafts.csswg.org/css-backgrounds-3/&#35;border-radius).
 * <p><a href="https://docs.gtk.org/gsk4/struct.RoundedRect.html">https://docs.gtk.org/gsk4/struct.RoundedRect.html</a></p>
*/
public class RoundedRect extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(RoundedRect.class.getCanonicalName());
    }

    public RoundedRect(PointerContainer pointer) {
        super(pointer);
    }

    private JnaRoundedRect.Fields _fields;
    
    JnaRoundedRect.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaRoundedRect.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * the bounds of the rectangle
     * <br>Private field: direct-type
    */
    public static final String BOUNDS = "bounds";

    /**
     * Checks if the given &#64;point is inside the rounded rectangle.
     * @param point the point to check
     * @return %TRUE if the &#64;point is inside the rounded rectangle
    */
    public boolean containsPoint(@Nonnull ch.bailu.gtk.graphene.Point point)  {
        return JnaRoundedRect.INST().gsk_rounded_rect_contains_point(asCPointer(), asCPointerNotNull(point));
    }

    /**
     * Checks if the given &#64;rect is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return %TRUE if the &#64;rect is fully contained inside the rounded rectangle
    */
    public boolean containsRect(@Nonnull ch.bailu.gtk.graphene.Rect rect)  {
        return JnaRoundedRect.INST().gsk_rounded_rect_contains_rect(asCPointer(), asCPointerNotNull(rect));
    }

    /**
     * Initializes the given `GskRoundedRect` with the given values.
     * <br>
     * <br>This function will implicitly normalize the `GskRoundedRect`
     * <br>before returning.
     * @param bounds a `graphene_rect_t` describing the bounds
     * @param top_left the rounding radius of the top left corner
     * @param top_right the rounding radius of the top right corner
     * @param bottom_right the rounding radius of the bottom right corner
     * @param bottom_left the rounding radius of the bottom left corner
     * @return the initialized rectangle
    */
    public RoundedRect init(@Nonnull ch.bailu.gtk.graphene.Rect bounds, @Nonnull ch.bailu.gtk.graphene.Size top_left, @Nonnull ch.bailu.gtk.graphene.Size top_right, @Nonnull ch.bailu.gtk.graphene.Size bottom_right, @Nonnull ch.bailu.gtk.graphene.Size bottom_left)  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_init(asCPointer(), asCPointerNotNull(bounds), asCPointerNotNull(top_left), asCPointerNotNull(top_right), asCPointerNotNull(bottom_right), asCPointerNotNull(bottom_left))));
    }

    /**
     * Initializes &#64;self using the given &#64;src rectangle.
     * <br>
     * <br>This function will not normalize the `GskRoundedRect`,
     * <br>so make sure the source is normalized.
     * @param src a `GskRoundedRect`
     * @return the initialized rectangle
    */
    public RoundedRect initCopy(@Nonnull RoundedRect src)  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_init_copy(asCPointer(), asCPointerNotNull(src))));
    }

    /**
     * Initializes &#64;self to the given &#64;bounds and sets the radius
     * <br>of all four corners to &#64;radius.
     * @param bounds a `graphene_rect_t`
     * @param radius the border radius
     * @return the initialized rectangle
    */
    public RoundedRect initFromRect(@Nonnull ch.bailu.gtk.graphene.Rect bounds, float radius)  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_init_from_rect(asCPointer(), asCPointerNotNull(bounds), radius)));
    }

    /**
     * Checks if part of the given &#64;rect is contained inside the rounded rectangle.
     * @param rect the rectangle to check
     * @return %TRUE if the &#64;rect intersects with the rounded rectangle
    */
    public boolean intersectsRect(@Nonnull ch.bailu.gtk.graphene.Rect rect)  {
        return JnaRoundedRect.INST().gsk_rounded_rect_intersects_rect(asCPointer(), asCPointerNotNull(rect));
    }

    /**
     * Checks if all corners of &#64;self are right angles and the
     * <br>rectangle covers all of its bounds.
     * <br>
     * <br>This information can be used to decide if [ctor&#64;Gsk.ClipNode.new]
     * <br>or [ctor&#64;Gsk.RoundedClipNode.new] should be called.
     * @return %TRUE if the rectangle is rectilinear
    */
    public boolean isRectilinear()  {
        return JnaRoundedRect.INST().gsk_rounded_rect_is_rectilinear(asCPointer());
    }

    /**
     * Normalizes the passed rectangle.
     * <br>
     * <br>This function will ensure that the bounds of the rectangle
     * <br>are normalized and ensure that the corner values are positive
     * <br>and the corners do not overlap.
     * @return the normalized rectangle
    */
    public RoundedRect normalize()  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_normalize(asCPointer())));
    }

    /**
     * Offsets the bound's origin by &#64;dx and &#64;dy.
     * <br>
     * <br>The size and corners of the rectangle are unchanged.
     * @param dx the horizontal offset
     * @param dy the vertical offset
     * @return the offset rectangle
    */
    public RoundedRect offset(float dx, float dy)  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_offset(asCPointer(), dx, dy)));
    }

    /**
     * Shrinks (or grows) the given rectangle by moving the 4 sides
     * <br>according to the offsets given.
     * <br>
     * <br>The corner radii will be changed in a way that tries to keep
     * <br>the center of the corner circle intact. This emulates CSS behavior.
     * <br>
     * <br>This function also works for growing rectangles if you pass
     * <br>negative values for the &#64;top, &#64;right, &#64;bottom or &#64;left.
     * @param top How far to move the top side downwards
     * @param right How far to move the right side to the left
     * @param bottom How far to move the bottom side upwards
     * @param left How far to move the left side to the right
     * @return the resized `GskRoundedRect`
    */
    public RoundedRect shrink(float top, float right, float bottom, float left)  {
        return new RoundedRect(new PointerContainer(JnaRoundedRect.INST().gsk_rounded_rect_shrink(asCPointer(), top, right, bottom, left)));
    }

}

/*
record-type
some-fields-unsupported

[FieldModel:corner:java-type-not-supported:{G_::{c:void*}}:{j:}]
*/
