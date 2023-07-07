/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The &#35;GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 * <p><a href="https://docs.gtk.org/glib/struct.Node.html">https://docs.gtk.org/glib/struct.Node.html</a></p>
*/
public class Node extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Node.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnNodeForeachFunc {
        /**
         * Specifies the type of function passed to g_node_children_foreach().
         * <br>The function is called with each child node, together with the user
         * <br>data passed to g_node_children_foreach().
         * @param node a &#35;GNode.
         * @param user_data user data passed to g_node_children_foreach().
        */
        void onNodeForeachFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Node node, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaNode.OnNodeForeachFunc toOnNodeForeachFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnNodeForeachFunc in) {
        JnaNode.OnNodeForeachFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_node, _user_data) -> in.onNodeForeachFunc(__callback, new Node(new PointerContainer(_node)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCopyFunc {
        /**
         * A function of this signature is used to copy the node data
         * <br>when doing a deep-copy of a tree.
         * @param src A pointer to the data which should be copied
         * @param user_data Additional data
         * @return A pointer to the copy
        */
        ch.bailu.gtk.type.Pointer onCopyFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull ch.bailu.gtk.type.Pointer src, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaNode.OnCopyFunc toOnCopyFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCopyFunc in) {
        JnaNode.OnCopyFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_src, _user_data) -> in.onCopyFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_src)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnNodeTraverseFunc {
        /**
         * Specifies the type of function passed to g_node_traverse(). The
         * <br>function is called with each of the nodes visited, together with the
         * <br>user data passed to g_node_traverse(). If the function returns
         * <br>%TRUE, then the traversal is stopped.
         * @param node a &#35;GNode.
         * @param user_data user data passed to g_node_traverse().
         * @return %TRUE to stop the traversal.
        */
        boolean onNodeTraverseFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Node node, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaNode.OnNodeTraverseFunc toOnNodeTraverseFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnNodeTraverseFunc in) {
        JnaNode.OnNodeTraverseFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_node, _user_data) -> in.onNodeTraverseFunc(__callback, new Node(new PointerContainer(_node)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Node(PointerContainer pointer) {
        super(pointer);
    }

    public Node() {
        super(cast(JnaNode.allocateStructure()));
    }

    private JnaNode.Fields _fields;
    
    JnaNode.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaNode.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * contains the actual data of the node.
    */
    public static final String DATA = "data";

    /**
     * contains the actual data of the node.
    */
    public void setFieldData(ch.bailu.gtk.type.Pointer data) {
        toFields().data = data.asCPointer();
        toFields().writeField(DATA);
    }

    /**
     * contains the actual data of the node.
    */
    public ch.bailu.gtk.type.Pointer getFieldData() {
       toFields().readField(DATA);
       return new ch.bailu.gtk.type.Pointer(new PointerContainer(toFields().data));
    } 

    /**
     * points to the node's next sibling (a sibling is another
     * <br>       &#35;GNode with the same parent).
    */
    public static final String NEXT = "next";

    /**
     * points to the node's next sibling (a sibling is another
     * <br>       &#35;GNode with the same parent).
    */
    public void setFieldNext(Node next) {
        toFields().next = next.asCPointer();
        toFields().writeField(NEXT);
    }

    /**
     * points to the node's next sibling (a sibling is another
     * <br>       &#35;GNode with the same parent).
    */
    public Node getFieldNext() {
       toFields().readField(NEXT);
       return new Node(new PointerContainer(toFields().next));
    } 

    /**
     * points to the node's previous sibling.
    */
    public static final String PREV = "prev";

    /**
     * points to the node's previous sibling.
    */
    public void setFieldPrev(Node prev) {
        toFields().prev = prev.asCPointer();
        toFields().writeField(PREV);
    }

    /**
     * points to the node's previous sibling.
    */
    public Node getFieldPrev() {
       toFields().readField(PREV);
       return new Node(new PointerContainer(toFields().prev));
    } 

    /**
     * points to the parent of the &#35;GNode, or is %NULL if the
     * <br>         &#35;GNode is the root of the tree.
    */
    public static final String PARENT = "parent";

    /**
     * points to the parent of the &#35;GNode, or is %NULL if the
     * <br>         &#35;GNode is the root of the tree.
    */
    public void setFieldParent(Node parent) {
        toFields().parent = parent.asCPointer();
        toFields().writeField(PARENT);
    }

    /**
     * points to the parent of the &#35;GNode, or is %NULL if the
     * <br>         &#35;GNode is the root of the tree.
    */
    public Node getFieldParent() {
       toFields().readField(PARENT);
       return new Node(new PointerContainer(toFields().parent));
    } 

    /**
     * points to the first child of the &#35;GNode.  The other
     * <br>           children are accessed by using the &#64;next pointer of each
     * <br>           child.
    */
    public static final String CHILDREN = "children";

    /**
     * points to the first child of the &#35;GNode.  The other
     * <br>           children are accessed by using the &#64;next pointer of each
     * <br>           child.
    */
    public void setFieldChildren(Node children) {
        toFields().children = children.asCPointer();
        toFields().writeField(CHILDREN);
    }

    /**
     * points to the first child of the &#35;GNode.  The other
     * <br>           children are accessed by using the &#64;next pointer of each
     * <br>           child.
    */
    public Node getFieldChildren() {
       toFields().readField(CHILDREN);
       return new Node(new PointerContainer(toFields().children));
    } 

    /**
     * Gets the position of the first child of a &#35;GNode
     * <br>which contains the given data.
     * @param data the data to find
     * @return the index of the child of &#64;node which contains     &#64;data, or -1 if the data is not found
    */
    public int childIndex(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return JnaNode.INST().g_node_child_index(asCPointer(), asCPointer(data));
    }

    /**
     * Gets the position of a &#35;GNode with respect to its siblings.
     * <br>&#64;child must be a child of &#64;node. The first child is numbered 0,
     * <br>the second 1, and so on.
     * @param child a child of &#64;node
     * @return the position of &#64;child with respect to its siblings
    */
    public int childPosition(@Nonnull Node child)  {
        return JnaNode.INST().g_node_child_position(asCPointer(), asCPointerNotNull(child));
    }

    /**
     * Calls a function for each of the children of a &#35;GNode. Note that it
     * <br>doesn't descend beneath the child nodes. &#64;func must not do anything
     * <br>that would modify the structure of the tree.
     * @param flags which types of children are to be visited, one of     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param func the function to call for each visited node
     * @param data user data to pass to the function
    */
    public void childrenForeach(int flags, OnNodeForeachFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaNode.INST().g_node_children_foreach(asCPointer(), flags, toOnNodeForeachFunc(this, "childrenForeach", func), asCPointer(data));
    }

    /**
     * Recursively copies a &#35;GNode (but does not deep-copy the data inside the
     * <br>nodes, see g_node_copy_deep() if you need that).
     * @return a new &#35;GNode containing the same data pointers
    */
    public Node copy()  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_copy(asCPointer())));
    }

    /**
     * Recursively copies a &#35;GNode and its data.
     * @param copy_func the function which is called to copy the data inside each node,   or %NULL to use the original data.
     * @param data data to pass to &#64;copy_func
     * @return a new &#35;GNode containing copies of the data in &#64;node.
    */
    public Node copyDeep(OnCopyFunc copy_func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_copy_deep(asCPointer(), toOnCopyFunc(this, "copyDeep", copy_func), asCPointer(data))));
    }

    /**
     * Gets the depth of a &#35;GNode.
     * <br>
     * <br>If &#64;node is %NULL the depth is 0. The root node has a depth of 1.
     * <br>For the children of the root node the depth is 2. And so on.
     * @return the depth of the &#35;GNode
    */
    public int depth()  {
        return JnaNode.INST().g_node_depth(asCPointer());
    }

    /**
     * Removes &#64;root and its children from the tree, freeing any memory
     * <br>allocated.
    */
    public void destroy()  {
        JnaNode.INST().g_node_destroy(asCPointer());
    }

    /**
     * Finds a &#35;GNode in a tree.
     * @param order the order in which nodes are visited - %G_IN_ORDER,     %G_PRE_ORDER, %G_POST_ORDER, or %G_LEVEL_ORDER
     * @param flags which types of children are to be searched, one of     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param data the data to find
     * @return the found &#35;GNode, or %NULL if the data is not found
    */
    public Node find(int order, int flags, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_find(asCPointer(), order, flags, asCPointer(data))));
    }

    /**
     * Finds the first child of a &#35;GNode with the given data.
     * @param flags which types of children are to be searched, one of     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param data the data to find
     * @return the found child &#35;GNode, or %NULL if the data is not found
    */
    public Node findChild(int flags, @Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_find_child(asCPointer(), flags, asCPointer(data))));
    }

    /**
     * Gets the first sibling of a &#35;GNode.
     * <br>This could possibly be the node itself.
     * @return the first sibling of &#64;node
    */
    public Node firstSibling()  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_first_sibling(asCPointer())));
    }

    /**
     * Gets the root of a tree.
     * @return the root of the tree
    */
    public Node getRoot()  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_get_root(asCPointer())));
    }

    /**
     * Inserts a &#35;GNode beneath the parent at the given position.
     * @param position the position to place &#64;node at, with respect to its siblings     If position is -1, &#64;node is inserted as the last child of &#64;parent
     * @param node the &#35;GNode to insert
     * @return the inserted &#35;GNode
    */
    public Node insert(int position, @Nonnull Node node)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_insert(asCPointer(), position, asCPointerNotNull(node))));
    }

    /**
     * Inserts a &#35;GNode beneath the parent after the given sibling.
     * @param sibling the sibling &#35;GNode to place &#64;node after.     If sibling is %NULL, the node is inserted as the first child of &#64;parent.
     * @param node the &#35;GNode to insert
     * @return the inserted &#35;GNode
    */
    public Node insertAfter(@Nonnull Node sibling, @Nonnull Node node)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_insert_after(asCPointer(), asCPointerNotNull(sibling), asCPointerNotNull(node))));
    }

    /**
     * Inserts a &#35;GNode beneath the parent before the given sibling.
     * @param sibling the sibling &#35;GNode to place &#64;node before.     If sibling is %NULL, the node is inserted as the last child of &#64;parent.
     * @param node the &#35;GNode to insert
     * @return the inserted &#35;GNode
    */
    public Node insertBefore(@Nonnull Node sibling, @Nonnull Node node)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_insert_before(asCPointer(), asCPointerNotNull(sibling), asCPointerNotNull(node))));
    }

    /**
     * Returns %TRUE if &#64;node is an ancestor of &#64;descendant.
     * <br>This is true if node is the parent of &#64;descendant,
     * <br>or if node is the grandparent of &#64;descendant etc.
     * @param descendant a &#35;GNode
     * @return %TRUE if &#64;node is an ancestor of &#64;descendant
    */
    public boolean isAncestor(@Nonnull Node descendant)  {
        return JnaNode.INST().g_node_is_ancestor(asCPointer(), asCPointerNotNull(descendant));
    }

    /**
     * Gets the last child of a &#35;GNode.
     * @return the last child of &#64;node, or %NULL if &#64;node has no children
    */
    public Node lastChild()  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_last_child(asCPointer())));
    }

    /**
     * Gets the last sibling of a &#35;GNode.
     * <br>This could possibly be the node itself.
     * @return the last sibling of &#64;node
    */
    public Node lastSibling()  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_last_sibling(asCPointer())));
    }

    /**
     * Gets the maximum height of all branches beneath a &#35;GNode.
     * <br>This is the maximum distance from the &#35;GNode to all leaf nodes.
     * <br>
     * <br>If &#64;root is %NULL, 0 is returned. If &#64;root has no children,
     * <br>1 is returned. If &#64;root has children, 2 is returned. And so on.
     * @return the maximum height of the tree beneath &#64;root
    */
    public int maxHeight()  {
        return JnaNode.INST().g_node_max_height(asCPointer());
    }

    /**
     * Gets the number of children of a &#35;GNode.
     * @return the number of children of &#64;node
    */
    public int nChildren()  {
        return JnaNode.INST().g_node_n_children(asCPointer());
    }

    /**
     * Gets the number of nodes in a tree.
     * @param flags which types of children are to be counted, one of     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @return the number of nodes in the tree
    */
    public int nNodes(int flags)  {
        return JnaNode.INST().g_node_n_nodes(asCPointer(), flags);
    }

    /**
     * Gets a child of a &#35;GNode, using the given index.
     * <br>The first child is at index 0. If the index is
     * <br>too big, %NULL is returned.
     * @param n the index of the desired child
     * @return the child of &#64;node at index &#64;n
    */
    public Node nthChild(int n)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_nth_child(asCPointer(), n)));
    }

    /**
     * Inserts a &#35;GNode as the first child of the given parent.
     * @param node the &#35;GNode to insert
     * @return the inserted &#35;GNode
    */
    public Node prepend(@Nonnull Node node)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_prepend(asCPointer(), asCPointerNotNull(node))));
    }

    /**
     * Reverses the order of the children of a &#35;GNode.
     * <br>(It doesn't change the order of the grandchildren.)
    */
    public void reverseChildren()  {
        JnaNode.INST().g_node_reverse_children(asCPointer());
    }

    /**
     * Traverses a tree starting at the given root &#35;GNode.
     * <br>It calls the given function for each node visited.
     * <br>The traversal can be halted at any point by returning %TRUE from &#64;func.
     * <br>&#64;func must not do anything that would modify the structure of the tree.
     * @param order the order in which nodes are visited - %G_IN_ORDER,     %G_PRE_ORDER, %G_POST_ORDER, or %G_LEVEL_ORDER.
     * @param flags which types of children are to be visited, one of     %G_TRAVERSE_ALL, %G_TRAVERSE_LEAVES and %G_TRAVERSE_NON_LEAVES
     * @param max_depth the maximum depth of the traversal. Nodes below this     depth will not be visited. If max_depth is -1 all nodes in     the tree are visited. If depth is 1, only the root is visited.     If depth is 2, the root and its children are visited. And so on.
     * @param func the function to call for each visited &#35;GNode
     * @param data user data to pass to the function
    */
    public void traverse(int order, int flags, int max_depth, OnNodeTraverseFunc func, @Nullable ch.bailu.gtk.type.Pointer data)  {
        JnaNode.INST().g_node_traverse(asCPointer(), order, flags, max_depth, toOnNodeTraverseFunc(this, "traverse", func), asCPointer(data));
    }

    /**
     * Unlinks a &#35;GNode from a tree, resulting in two separate trees.
    */
    public void unlink()  {
        JnaNode.INST().g_node_unlink(asCPointer());
    }

    /**
     * Creates a new &#35;GNode containing the given data.
     * <br>Used to create the first node in a tree.
     * @param data the data of the new node
     * @return a new &#35;GNode
    */
    public static Node _new(@Nullable ch.bailu.gtk.type.Pointer data)  {
        return new Node(new PointerContainer(JnaNode.INST().g_node_new(asCPointer(data))));
    }

}

/*
record-type
all-fields-supported
*/
