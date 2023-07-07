/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque structure representing a path to a row in a model.
 * <p><a href="https://docs.gtk.org/gtk4/struct.TreePath.html">https://docs.gtk.org/gtk4/struct.TreePath.html</a></p>
*/
public class TreePath extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreePath.class.getCanonicalName());
    }

    public TreePath(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkTreePath`.
     * <br>
     * <br>The string representation of this path is “0”.
     * @return A new `GtkTreePath`
    */
    public static TreePath newFirstTreePath()  {
        PointerContainer __self = cast(JnaTreePath.INST().gtk_tree_path_new_first());
        if (__self.isNull()) {
            throw new NullPointerException("TreePath:newFirst");
        }
        return new TreePath(__self);
    }        
    

    /**
     * Creates a new path with &#64;first_index and &#64;varargs as indices.
     * @param first_index first integer
     * @param _elipse list of integers terminated by -1
     * @return A newly created `GtkTreePath`
    */
    public static TreePath newFromIndicesTreePath(int first_index, java.lang.Object... _elipse)  {
        PointerContainer __self = cast(JnaTreePath.INST().gtk_tree_path_new_from_indices(first_index, _elipse));
        if (__self.isNull()) {
            throw new NullPointerException("TreePath:newFromIndices");
        }
        return new TreePath(__self);
    }        
    

    /**
     * Creates a new path with the given &#64;indices array of &#64;length.
     * @param indices array of indices
     * @param length length of &#64;indices array
     * @return A newly created `GtkTreePath`
    */
    public static TreePath newFromIndicesvTreePath(@Nonnull ch.bailu.gtk.type.Int indices, long length)  {
        PointerContainer __self = cast(JnaTreePath.INST().gtk_tree_path_new_from_indicesv(asCPointerNotNull(indices), length));
        if (__self.isNull()) {
            throw new NullPointerException("TreePath:newFromIndicesv");
        }
        return new TreePath(__self);
    }        
    

    /**
     * Creates a new `GtkTreePath` initialized to &#64;path.
     * <br>
     * <br>&#64;path is expected to be a colon separated list of numbers.
     * <br>For example, the string “10:4:0” would create a path of depth
     * <br>3 pointing to the 11th child of the root node, the 5th
     * <br>child of that 11th child, and the 1st child of that 5th child.
     * <br>If an invalid path string is passed in, %NULL is returned.
     * @param path The string representation of a path
     * @return A newly-created `GtkTreePath`
    */
    public static TreePath newFromStringTreePath(@Nonnull ch.bailu.gtk.type.Str path)  {
        PointerContainer __self = cast(JnaTreePath.INST().gtk_tree_path_new_from_string(asCPointerNotNull(path)));
        if (__self.isNull()) {
            throw new NullPointerException("TreePath:newFromString");
        }
        return new TreePath(__self);
    }        
    

    /**
     * Creates a new `GtkTreePath` initialized to &#64;path.
     * <br>
     * <br>&#64;path is expected to be a colon separated list of numbers.
     * <br>For example, the string “10:4:0” would create a path of depth
     * <br>3 pointing to the 11th child of the root node, the 5th
     * <br>child of that 11th child, and the 1st child of that 5th child.
     * <br>If an invalid path string is passed in, %NULL is returned.
     * @param path The string representation of a path
     * @return A newly-created `GtkTreePath`
    */
    public static TreePath newFromStringTreePath(String path)  {
        PointerContainer __self = cast(JnaTreePath.INST().gtk_tree_path_new_from_string(path));
        if (__self.isNull()) {
            throw new NullPointerException("TreePath:newFromString");
        }
        return new TreePath(__self);
    }        
    

    /**
     * Creates a new `GtkTreePath`
     * <br>This refers to a row.
    */
    public TreePath() {
        super(cast(JnaTreePath.INST().gtk_tree_path_new()));
    }

    /**
     * Appends a new index to a path.
     * <br>
     * <br>As a result, the depth of the path is increased.
     * @param index_ the index
    */
    public void appendIndex(int index_)  {
        JnaTreePath.INST().gtk_tree_path_append_index(asCPointer(), index_);
    }

    /**
     * Compares two paths.
     * <br>
     * <br>If &#64;a appears before &#64;b in a tree, then -1 is returned.
     * <br>If &#64;b appears before &#64;a, then 1 is returned.
     * <br>If the two nodes are equal, then 0 is returned.
     * @param b a `GtkTreePath` to compare with
     * @return the relative positions of &#64;a and &#64;b
    */
    public int compare(@Nonnull TreePath b)  {
        return JnaTreePath.INST().gtk_tree_path_compare(asCPointer(), asCPointerNotNull(b));
    }

    /**
     * Creates a new `GtkTreePath` as a copy of &#64;path.
     * @return a new `GtkTreePath`
    */
    public TreePath copy()  {
        return new TreePath(new PointerContainer(JnaTreePath.INST().gtk_tree_path_copy(asCPointer())));
    }

    /**
     * Moves &#64;path to point to the first child of the current path.
    */
    public void down()  {
        JnaTreePath.INST().gtk_tree_path_down(asCPointer());
    }

    /**
     * Frees &#64;path. If &#64;path is %NULL, it simply returns.
    */
    public void free()  {
        JnaTreePath.INST().gtk_tree_path_free(asCPointer());
    }

    /**
     * Returns the current depth of &#64;path.
     * @return The depth of &#64;path
    */
    public int getDepth()  {
        return JnaTreePath.INST().gtk_tree_path_get_depth(asCPointer());
    }

    /**
     * Returns the current indices of &#64;path.
     * <br>
     * <br>This is an array of integers, each representing a node in a tree.
     * <br>This value should not be freed.
     * <br>
     * <br>The length of the array can be obtained with gtk_tree_path_get_depth().
     * @return The current indices
    */
    public ch.bailu.gtk.type.Int getIndices()  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaTreePath.INST().gtk_tree_path_get_indices(asCPointer())));
    }

    /**
     * Returns the current indices of &#64;path.
     * <br>
     * <br>This is an array of integers, each representing a node in a tree.
     * <br>It also returns the number of elements in the array.
     * <br>The array should not be freed.
     * @param depth return location for number of elements   returned in the integer array
     * @return The current   indices
    */
    public ch.bailu.gtk.type.Int getIndicesWithDepth(@Nullable ch.bailu.gtk.type.Int depth)  {
        return new ch.bailu.gtk.type.Int(new PointerContainer(JnaTreePath.INST().gtk_tree_path_get_indices_with_depth(asCPointer(), asCPointer(depth))));
    }

    /**
     * Returns %TRUE if &#64;descendant is a descendant of &#64;path.
     * @param descendant another `GtkTreePath`
     * @return %TRUE if &#64;descendant is contained inside &#64;path
    */
    public boolean isAncestor(@Nonnull TreePath descendant)  {
        return JnaTreePath.INST().gtk_tree_path_is_ancestor(asCPointer(), asCPointerNotNull(descendant));
    }

    /**
     * Returns %TRUE if &#64;path is a descendant of &#64;ancestor.
     * @param ancestor another `GtkTreePath`
     * @return %TRUE if &#64;ancestor contains &#64;path somewhere below it
    */
    public boolean isDescendant(@Nonnull TreePath ancestor)  {
        return JnaTreePath.INST().gtk_tree_path_is_descendant(asCPointer(), asCPointerNotNull(ancestor));
    }

    /**
     * Moves the &#64;path to point to the next node at the current depth.
    */
    public void next()  {
        JnaTreePath.INST().gtk_tree_path_next(asCPointer());
    }

    /**
     * Prepends a new index to a path.
     * <br>
     * <br>As a result, the depth of the path is increased.
     * @param index_ the index
    */
    public void prependIndex(int index_)  {
        JnaTreePath.INST().gtk_tree_path_prepend_index(asCPointer(), index_);
    }

    /**
     * Moves the &#64;path to point to the previous node at the
     * <br>current depth, if it exists.
     * @return %TRUE if &#64;path has a previous node, and   the move was made
    */
    public boolean prev()  {
        return JnaTreePath.INST().gtk_tree_path_prev(asCPointer());
    }

    /**
     * Generates a string representation of the path.
     * <br>
     * <br>This string is a “:” separated list of numbers.
     * <br>For example, “4:10:0:3” would be an acceptable
     * <br>return value for this string. If the path has
     * <br>depth 0, %NULL is returned.
     * @return A newly-allocated string
    */
    public ch.bailu.gtk.type.Str toStr()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTreePath.INST().gtk_tree_path_to_string(asCPointer())));
    }

    /**
     * Moves the &#64;path to point to its parent node, if it has a parent.
     * @return %TRUE if &#64;path has a parent, and the move was made
    */
    public boolean up()  {
        return JnaTreePath.INST().gtk_tree_path_up(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTreePath.INST().gtk_tree_path_get_type(); 
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
