/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An opaque type which identifies a specific node in a &#35;GTree.
 * <p><a href="https://docs.gtk.org/glib/struct.TreeNode.html">https://docs.gtk.org/glib/struct.TreeNode.html</a></p>
*/
class TreeNode extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TreeNode.class.getCanonicalName());
    }

    public TreeNode(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the key stored at a particular tree node.
     * @return the key at the node.
    */
    public ch.bailu.gtk.type.Pointer key()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTreeNode.INST().g_tree_node_key(asCPointer())));
    }

    /**
     * Returns the next in-order node of the tree, or %NULL
     * <br>if the passed node was already the last one.
     * @return the next node in the tree
    */
    public TreeNode next()  {
        return new TreeNode(new PointerContainer(JnaTreeNode.INST().g_tree_node_next(asCPointer())));
    }

    /**
     * Returns the previous in-order node of the tree, or %NULL
     * <br>if the passed node was already the first one.
     * @return the previous node in the tree
    */
    public TreeNode previous()  {
        return new TreeNode(new PointerContainer(JnaTreeNode.INST().g_tree_node_previous(asCPointer())));
    }

    /**
     * Gets the value stored at a particular tree node.
     * @return the value at the node.
    */
    public ch.bailu.gtk.type.Pointer value()  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTreeNode.INST().g_tree_node_value(asCPointer())));
    }

}

/*
record-type
flag-disguised
all-fields-supported
*/
