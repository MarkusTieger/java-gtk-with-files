/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkBitset` represents a set of unsigned integers.
 * <br>
 * <br>Another name for this data structure is &quot;bitmap&quot;.
 * <br>
 * <br>The current implementation is based on [roaring bitmaps](https://roaringbitmap.org/).
 * <br>
 * <br>A bitset allows adding a set of integers and provides support for set operations
 * <br>like unions, intersections and checks for equality or if a value is contained
 * <br>in the set. `GtkBitset` also contains various functions to query metadata about
 * <br>the bitset, such as the minimum or maximum values or its size.
 * <br>
 * <br>The fastest way to iterate values in a bitset is [struct&#64;Gtk.BitsetIter].
 * <br>
 * <br>The main use case for `GtkBitset` is implementing complex selections for
 * <br>[iface&#64;Gtk.SelectionModel].
 * <p><a href="https://docs.gtk.org/gtk4/struct.Bitset.html">https://docs.gtk.org/gtk4/struct.Bitset.html</a></p>
*/
public class Bitset extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Bitset.class.getCanonicalName());
    }

    public Bitset(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new empty bitset.
     * @return A new empty bitset
    */
    public static Bitset newEmptyBitset()  {
        PointerContainer __self = cast(JnaBitset.INST().gtk_bitset_new_empty());
        if (__self.isNull()) {
            throw new NullPointerException("Bitset:newEmpty");
        }
        return new Bitset(__self);
    }        
    

    /**
     * Creates a bitset with the given range set.
     * @param start first value to add
     * @param n_items number of consecutive values to add
     * @return A new bitset
    */
    public static Bitset newRangeBitset(int start, int n_items)  {
        PointerContainer __self = cast(JnaBitset.INST().gtk_bitset_new_range(start, n_items));
        if (__self.isNull()) {
            throw new NullPointerException("Bitset:newRange");
        }
        return new Bitset(__self);
    }        
    

    /**
     * Adds &#64;value to &#64;self if it wasn't part of it before.
     * @param value value to add
     * @return %TRUE if &#64;value was not part of &#64;self and &#64;self   was changed
    */
    public boolean add(int value)  {
        return JnaBitset.INST().gtk_bitset_add(asCPointer(), value);
    }

    /**
     * Adds all values from &#64;start (inclusive) to &#64;start + &#64;n_items
     * <br>(exclusive) in &#64;self.
     * @param start first value to add
     * @param n_items number of consecutive values to add
    */
    public void addRange(int start, int n_items)  {
        JnaBitset.INST().gtk_bitset_add_range(asCPointer(), start, n_items);
    }

    /**
     * Adds the closed range [&#64;first, &#64;last], so &#64;first, &#64;last and all
     * <br>values in between. &#64;first must be smaller than &#64;last.
     * @param first first value to add
     * @param last last value to add
    */
    public void addRangeClosed(int first, int last)  {
        JnaBitset.INST().gtk_bitset_add_range_closed(asCPointer(), first, last);
    }

    /**
     * Interprets the values as a 2-dimensional boolean grid with the given &#64;stride
     * <br>and inside that grid, adds a rectangle with the given &#64;width and &#64;height.
     * @param start first value to add
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
    */
    public void addRectangle(int start, int width, int height, int stride)  {
        JnaBitset.INST().gtk_bitset_add_rectangle(asCPointer(), start, width, height, stride);
    }

    /**
     * Checks if the given &#64;value has been added to &#64;self
     * @param value the value to check
     * @return %TRUE if &#64;self contains &#64;value
    */
    public boolean contains(int value)  {
        return JnaBitset.INST().gtk_bitset_contains(asCPointer(), value);
    }

    /**
     * Creates a copy of &#64;self.
     * @return A new bitset that contains the same   values as &#64;self
    */
    public Bitset copy()  {
        return new Bitset(new PointerContainer(JnaBitset.INST().gtk_bitset_copy(asCPointer())));
    }

    /**
     * Sets &#64;self to be the symmetric difference of &#64;self and &#64;other.
     * <br>
     * <br>The symmetric difference is set &#64;self to contain all values that
     * <br>were either contained in &#64;self or in &#64;other, but not in both.
     * <br>This operation is also called an XOR.
     * <br>
     * <br>It is allowed for &#64;self and &#64;other to be the same bitset. The bitset
     * <br>will be emptied in that case.
     * @param other the `GtkBitset` to compute the difference from
    */
    public void difference(@Nonnull Bitset other)  {
        JnaBitset.INST().gtk_bitset_difference(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Returns %TRUE if &#64;self and &#64;other contain the same values.
     * @param other another `GtkBitset`
     * @return %TRUE if &#64;self and &#64;other contain the same values
    */
    public boolean equals(@Nonnull Bitset other)  {
        return JnaBitset.INST().gtk_bitset_equals(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Returns the largest value in &#64;self.
     * <br>
     * <br>If &#64;self is empty, 0 is returned.
     * @return The largest value in &#64;self
    */
    public int getMaximum()  {
        return JnaBitset.INST().gtk_bitset_get_maximum(asCPointer());
    }

    /**
     * Returns the smallest value in &#64;self.
     * <br>
     * <br>If &#64;self is empty, `G_MAXUINT` is returned.
     * @return The smallest value in &#64;self
    */
    public int getMinimum()  {
        return JnaBitset.INST().gtk_bitset_get_minimum(asCPointer());
    }

    /**
     * Returns the value of the &#64;nth item in self.
     * <br>
     * <br>If &#64;nth is &gt;= the size of &#64;self, 0 is returned.
     * @param nth index of the item to get
     * @return the value of the &#64;nth item in &#64;self
    */
    public int getNth(int nth)  {
        return JnaBitset.INST().gtk_bitset_get_nth(asCPointer(), nth);
    }

    /**
     * Gets the number of values that were added to the set.
     * <br>
     * <br>For example, if the set is empty, 0 is returned.
     * <br>
     * <br>Note that this function returns a `guint64`, because when all
     * <br>values are set, the return value is `G_MAXUINT + 1`. Unless you
     * <br>are sure this cannot happen (it can't with `GListModel`), be sure
     * <br>to use a 64bit type.
     * @return The number of values in the set.
    */
    public long getSize()  {
        return JnaBitset.INST().gtk_bitset_get_size(asCPointer());
    }

    /**
     * Gets the number of values that are part of the set from &#64;first to &#64;last
     * <br>(inclusive).
     * <br>
     * <br>Note that this function returns a `guint64`, because when all values are
     * <br>set, the return value is `G_MAXUINT + 1`. Unless you are sure this cannot
     * <br>happen (it can't with `GListModel`), be sure to use a 64bit type.
     * @param first the first element to include
     * @param last the last element to include
     * @return The number of values in the set from &#64;first to &#64;last.
    */
    public long getSizeInRange(int first, int last)  {
        return JnaBitset.INST().gtk_bitset_get_size_in_range(asCPointer(), first, last);
    }

    /**
     * Sets &#64;self to be the intersection of &#64;self and &#64;other.
     * <br>
     * <br>In other words, remove all values from &#64;self that are not part of &#64;other.
     * <br>
     * <br>It is allowed for &#64;self and &#64;other to be the same bitset. Nothing will
     * <br>happen in that case.
     * @param other the `GtkBitset` to intersect with
    */
    public void intersect(@Nonnull Bitset other)  {
        JnaBitset.INST().gtk_bitset_intersect(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Check if no value is contained in bitset.
     * @return %TRUE if &#64;self is empty
    */
    public boolean isEmpty()  {
        return JnaBitset.INST().gtk_bitset_is_empty(asCPointer());
    }

    /**
     * Acquires a reference on the given `GtkBitset`.
     * @return the `GtkBitset` with an additional reference
    */
    public Bitset ref()  {
        return new Bitset(new PointerContainer(JnaBitset.INST().gtk_bitset_ref(asCPointer())));
    }

    /**
     * Removes &#64;value from &#64;self if it was part of it before.
     * @param value value to add
     * @return %TRUE if &#64;value was part of &#64;self and &#64;self   was changed
    */
    public boolean remove(int value)  {
        return JnaBitset.INST().gtk_bitset_remove(asCPointer(), value);
    }

    /**
     * Removes all values from the bitset so that it is empty again.
    */
    public void removeAll()  {
        JnaBitset.INST().gtk_bitset_remove_all(asCPointer());
    }

    /**
     * Removes all values from &#64;start (inclusive) to &#64;start + &#64;n_items (exclusive)
     * <br>in &#64;self.
     * @param start first value to remove
     * @param n_items number of consecutive values to remove
    */
    public void removeRange(int start, int n_items)  {
        JnaBitset.INST().gtk_bitset_remove_range(asCPointer(), start, n_items);
    }

    /**
     * Removes the closed range [&#64;first, &#64;last], so &#64;first, &#64;last and all
     * <br>values in between. &#64;first must be smaller than &#64;last.
     * @param first first value to remove
     * @param last last value to remove
    */
    public void removeRangeClosed(int first, int last)  {
        JnaBitset.INST().gtk_bitset_remove_range_closed(asCPointer(), first, last);
    }

    /**
     * Interprets the values as a 2-dimensional boolean grid with the given &#64;stride
     * <br>and inside that grid, removes a rectangle with the given &#64;width and &#64;height.
     * @param start first value to remove
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @param stride row stride of the grid
    */
    public void removeRectangle(int start, int width, int height, int stride)  {
        JnaBitset.INST().gtk_bitset_remove_rectangle(asCPointer(), start, width, height, stride);
    }

    /**
     * Shifts all values in &#64;self to the left by &#64;amount.
     * <br>
     * <br>Values smaller than &#64;amount are discarded.
     * @param amount amount to shift all values to the left
    */
    public void shiftLeft(int amount)  {
        JnaBitset.INST().gtk_bitset_shift_left(asCPointer(), amount);
    }

    /**
     * Shifts all values in &#64;self to the right by &#64;amount.
     * <br>
     * <br>Values that end up too large to be held in a &#35;guint are discarded.
     * @param amount amount to shift all values to the right
    */
    public void shiftRight(int amount)  {
        JnaBitset.INST().gtk_bitset_shift_right(asCPointer(), amount);
    }

    /**
     * This is a support function for `GListModel` handling, by mirroring
     * <br>the `GlistModel::items-changed` signal.
     * <br>
     * <br>First, it &quot;cuts&quot; the values from &#64;position to &#64;removed from
     * <br>the bitset. That is, it removes all those values and shifts
     * <br>all larger values to the left by &#64;removed places.
     * <br>
     * <br>Then, it &quot;pastes&quot; new room into the bitset by shifting all values
     * <br>larger than &#64;position by &#64;added spaces to the right. This frees
     * <br>up space that can then be filled.
     * @param position position at which to slice
     * @param removed number of values to remove
     * @param added number of values to add
    */
    public void splice(int position, int removed, int added)  {
        JnaBitset.INST().gtk_bitset_splice(asCPointer(), position, removed, added);
    }

    /**
     * Sets &#64;self to be the subtraction of &#64;other from &#64;self.
     * <br>
     * <br>In other words, remove all values from &#64;self that are part of &#64;other.
     * <br>
     * <br>It is allowed for &#64;self and &#64;other to be the same bitset. The bitset
     * <br>will be emptied in that case.
     * @param other the `GtkBitset` to subtract
    */
    public void subtract(@Nonnull Bitset other)  {
        JnaBitset.INST().gtk_bitset_subtract(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Sets &#64;self to be the union of &#64;self and &#64;other.
     * <br>
     * <br>That is, add all values from &#64;other into &#64;self that weren't part of it.
     * <br>
     * <br>It is allowed for &#64;self and &#64;other to be the same bitset. Nothing will
     * <br>happen in that case.
     * @param other the `GtkBitset` to union with
    */
    public void union(@Nonnull Bitset other)  {
        JnaBitset.INST().gtk_bitset_union(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Releases a reference on the given `GtkBitset`.
     * <br>
     * <br>If the reference was the last, the resources associated to the &#64;self are
     * <br>freed.
    */
    public void unref()  {
        JnaBitset.INST().gtk_bitset_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaBitset.INST().gtk_bitset_get_type(); 
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
