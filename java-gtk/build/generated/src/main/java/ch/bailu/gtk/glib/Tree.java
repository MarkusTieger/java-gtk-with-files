/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GTree struct is an opaque data structure representing a
 * <br>[balanced binary tree][glib-Balanced-Binary-Trees]. It should be
 * <br>accessed only by using the following functions.
 * <p><a href="https://docs.gtk.org/glib/struct.Tree.html">https://docs.gtk.org/glib/struct.Tree.html</a></p>
*/
public class Tree extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Tree.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCompareFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b);
    }
    
    private static JnaTree.OnCompareFunc toOnCompareFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareFunc in) {
        JnaTree.OnCompareFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b) -> in.onCompareFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnCompareDataFunc {
        /**
         * Specifies the type of a comparison function used to compare two
         * <br>values.  The function should return a negative integer if the first
         * <br>value comes before the second, 0 if they are equal, or a positive
         * <br>integer if the first value comes after the second.
         * @param a a value
         * @param b a value to compare with
         * @param user_data user data
         * @return negative value if &#64;a &lt; &#64;b; zero if &#64;a = &#64;b; positive          value if &#64;a &gt; &#64;b
        */
        int onCompareDataFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer a, @Nullable ch.bailu.gtk.type.Pointer b, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTree.OnCompareDataFunc toOnCompareDataFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnCompareDataFunc in) {
        JnaTree.OnCompareDataFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_a, _b, _user_data) -> in.onCompareDataFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_a)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_b)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDestroyNotify {
        /**
         * Specifies the type of function which is called when a data element
         * <br>is destroyed. It is passed the pointer to the data element and
         * <br>should free any memory and resources allocated for it.
         * @param data the data element.
        */
        void onDestroyNotify(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer data);
    }
    
    private static JnaTree.OnDestroyNotify toOnDestroyNotify(ch.bailu.gtk.type.Pointer instance, String methodName, OnDestroyNotify in) {
        JnaTree.OnDestroyNotify out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_data) -> in.onDestroyNotify(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTraverseFunc {
        /**
         * Specifies the type of function passed to g_tree_traverse(). It is
         * <br>passed the key and value of each node, together with the &#64;user_data
         * <br>parameter passed to g_tree_traverse(). If the function returns
         * <br>%TRUE, the traversal is stopped.
         * @param key a key of a &#35;GTree node
         * @param value the value corresponding to the key
         * @param user_data user data passed to g_tree_traverse()
         * @return %TRUE to stop the traversal
        */
        boolean onTraverseFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTree.OnTraverseFunc toOnTraverseFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTraverseFunc in) {
        JnaTree.OnTraverseFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_key, _value, _user_data) -> in.onTraverseFunc(__callback, new ch.bailu.gtk.type.Pointer(new PointerContainer(_key)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_value)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnTraverseNodeFunc {
        /**
         * Specifies the type of function passed to g_tree_foreach_node(). It is
         * <br>passed each node, together with the &#64;user_data parameter passed to
         * <br>g_tree_foreach_node(). If the function returns %TRUE, the traversal is
         * <br>stopped.
         * @param node a &#35;GTreeNode
         * @param user_data user data passed to g_tree_foreach_node()
         * @return %TRUE to stop the traversal
        */
        boolean onTraverseNodeFunc(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull TreeNode node, @Nullable ch.bailu.gtk.type.Pointer user_data);
    }
    
    private static JnaTree.OnTraverseNodeFunc toOnTraverseNodeFunc(ch.bailu.gtk.type.Pointer instance, String methodName, OnTraverseNodeFunc in) {
        JnaTree.OnTraverseNodeFunc out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_node, _user_data) -> in.onTraverseNodeFunc(__callback, new TreeNode(new PointerContainer(_node)), new ch.bailu.gtk.type.Pointer(new PointerContainer(_user_data)));
            __callback.register(out);
        }
        return out;
    }

    public Tree(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new &#35;GTree like g_tree_new() and allows to specify functions
     * <br>to free the memory allocated for the key and value that get called when
     * <br>removing the entry from the &#35;GTree.
     * @param key_compare_func qsort()-style comparison function
     * @param key_compare_data data to pass to comparison function
     * @param key_destroy_func a function to free the memory allocated for the key   used when removing the entry from the &#35;GTree or %NULL if you don't   want to supply such a function
     * @param value_destroy_func a function to free the memory allocated for the   value used when removing the entry from the &#35;GTree or %NULL if you   don't want to supply such a function
     * @return a newly allocated &#35;GTree
    */
    public static Tree newFullTree(OnCompareDataFunc key_compare_func, @Nullable ch.bailu.gtk.type.Pointer key_compare_data, OnDestroyNotify key_destroy_func, OnDestroyNotify value_destroy_func)  {
        PointerContainer __self = cast(JnaTree.INST().g_tree_new_full(toOnCompareDataFunc(getClassHandler().getInstance(), "newFull", key_compare_func), asCPointer(key_compare_data), toOnDestroyNotify(getClassHandler().getInstance(), "newFull", key_destroy_func), toOnDestroyNotify(getClassHandler().getInstance(), "newFull", value_destroy_func)));
        if (__self.isNull()) {
            throw new NullPointerException("Tree:newFull");
        }
        return new Tree(__self);
    }        
    

    /**
     * Creates a new &#35;GTree with a comparison function that accepts user data.
     * <br>See g_tree_new() for more details.
     * @param key_compare_func qsort()-style comparison function
     * @param key_compare_data data to pass to comparison function
     * @return a newly allocated &#35;GTree
    */
    public static Tree newWithDataTree(OnCompareDataFunc key_compare_func, @Nullable ch.bailu.gtk.type.Pointer key_compare_data)  {
        PointerContainer __self = cast(JnaTree.INST().g_tree_new_with_data(toOnCompareDataFunc(getClassHandler().getInstance(), "newWithData", key_compare_func), asCPointer(key_compare_data)));
        if (__self.isNull()) {
            throw new NullPointerException("Tree:newWithData");
        }
        return new Tree(__self);
    }        
    

    /**
     * Creates a new &#35;GTree.
     * @param key_compare_func the function used to order the nodes in the &#35;GTree.   It should return values similar to the standard strcmp() function -   0 if the two arguments are equal, a negative value if the first argument   comes before the second, or a positive value if the first argument comes   after the second.
    */
    public Tree(OnCompareFunc key_compare_func) {
        super(cast(JnaTree.INST().g_tree_new(toOnCompareFunc(getClassHandler().getInstance(), "_new", key_compare_func))));
    }

    /**
     * Removes all keys and values from the &#35;GTree and decreases its
     * <br>reference count by one. If keys and/or values are dynamically
     * <br>allocated, you should either free them first or create the &#35;GTree
     * <br>using g_tree_new_full(). In the latter case the destroy functions
     * <br>you supplied will be called on all keys and values before destroying
     * <br>the &#35;GTree.
    */
    public void destroy()  {
        JnaTree.INST().g_tree_destroy(asCPointer());
    }

    /**
     * Calls the given function for each of the key/value pairs in the &#35;GTree.
     * <br>The function is passed the key and value of each pair, and the given
     * <br>&#64;data parameter. The tree is traversed in sorted order.
     * <br>
     * <br>The tree may not be modified while iterating over it (you can't
     * <br>add/remove items). To remove all items matching a predicate, you need
     * <br>to add each item to a list in your &#35;GTraverseFunc as you walk over
     * <br>the tree, then walk the list and remove each item.
     * @param func the function to call for each node visited.     If this function returns %TRUE, the traversal is stopped.
     * @param user_data user data to pass to the function
    */
    public void foreach(OnTraverseFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTree.INST().g_tree_foreach(asCPointer(), toOnTraverseFunc(this, "foreach", func), asCPointer(user_data));
    }

    /**
     * Calls the given function for each of the nodes in the &#35;GTree.
     * <br>The function is passed the pointer to the particular node, and the given
     * <br>&#64;data parameter. The tree traversal happens in-order.
     * <br>
     * <br>The tree may not be modified while iterating over it (you can't
     * <br>add/remove items). To remove all items matching a predicate, you need
     * <br>to add each item to a list in your &#35;GTraverseFunc as you walk over
     * <br>the tree, then walk the list and remove each item.
     * @param func the function to call for each node visited.     If this function returns %TRUE, the traversal is stopped.
     * @param user_data user data to pass to the function
    */
    public void foreachNode(OnTraverseNodeFunc func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        JnaTree.INST().g_tree_foreach_node(asCPointer(), toOnTraverseNodeFunc(this, "foreachNode", func), asCPointer(user_data));
    }

    /**
     * Gets the height of a &#35;GTree.
     * <br>
     * <br>If the &#35;GTree contains no nodes, the height is 0.
     * <br>If the &#35;GTree contains only one root node the height is 1.
     * <br>If the root node has children the height is 2, etc.
     * @return the height of &#64;tree
    */
    public int height()  {
        return JnaTree.INST().g_tree_height(asCPointer());
    }

    /**
     * Inserts a key/value pair into a &#35;GTree.
     * <br>
     * <br>Inserts a new key and value into a &#35;GTree as g_tree_insert_node() does,
     * <br>only this function does not return the inserted or set node.
     * @param key the key to insert
     * @param value the value corresponding to the key
    */
    public void insert(@Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaTree.INST().g_tree_insert(asCPointer(), asCPointer(key), asCPointer(value));
    }

    /**
     * Inserts a key/value pair into a &#35;GTree.
     * <br>
     * <br>If the given key already exists in the &#35;GTree its corresponding value
     * <br>is set to the new value. If you supplied a &#64;value_destroy_func when
     * <br>creating the &#35;GTree, the old value is freed using that function. If
     * <br>you supplied a &#64;key_destroy_func when creating the &#35;GTree, the passed
     * <br>key is freed using that function.
     * <br>
     * <br>The tree is automatically 'balanced' as new key/value pairs are added,
     * <br>so that the distance from the root to every leaf is as small as possible.
     * <br>The cost of maintaining a balanced tree while inserting new key/value
     * <br>result in a O(n log(n)) operation where most of the other operations
     * <br>are O(log(n)).
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node.
    */
    public TreeNode insertNode(@Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_insert_node(asCPointer(), asCPointer(key), asCPointer(value))));
    }

    /**
     * Gets the value corresponding to the given key. Since a &#35;GTree is
     * <br>automatically balanced as key/value pairs are added, key lookup
     * <br>is O(log n) (where n is the number of key/value pairs in the tree).
     * @param key the key to look up
     * @return the value corresponding to the key, or %NULL     if the key was not found
    */
    public ch.bailu.gtk.type.Pointer lookup(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTree.INST().g_tree_lookup(asCPointer(), asCPointer(key))));
    }

    /**
     * Gets the tree node corresponding to the given key. Since a &#35;GTree is
     * <br>automatically balanced as key/value pairs are added, key lookup
     * <br>is O(log n) (where n is the number of key/value pairs in the tree).
     * @param key the key to look up
     * @return the tree node corresponding to          the key, or %NULL if the key was not found
    */
    public TreeNode lookupNode(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_lookup_node(asCPointer(), asCPointer(key))));
    }

    /**
     * Gets the lower bound node corresponding to the given key,
     * <br>or %NULL if the tree is empty or all the nodes in the tree
     * <br>have keys that are strictly lower than the searched key.
     * <br>
     * <br>The lower bound is the first node that has its key greater
     * <br>than or equal to the searched key.
     * @param key the key to calculate the lower bound for
     * @return the tree node corresponding to          the lower bound, or %NULL if the tree is empty or has only          keys strictly lower than the searched key.
    */
    public TreeNode lowerBound(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_lower_bound(asCPointer(), asCPointer(key))));
    }

    /**
     * Gets the number of nodes in a &#35;GTree.
     * @return the number of nodes in &#64;tree
    */
    public int nnodes()  {
        return JnaTree.INST().g_tree_nnodes(asCPointer());
    }

    /**
     * Returns the first in-order node of the tree, or %NULL
     * <br>for an empty tree.
     * @return the first node in the tree
    */
    public TreeNode nodeFirst()  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_node_first(asCPointer())));
    }

    /**
     * Returns the last in-order node of the tree, or %NULL
     * <br>for an empty tree.
     * @return the last node in the tree
    */
    public TreeNode nodeLast()  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_node_last(asCPointer())));
    }

    /**
     * Increments the reference count of &#64;tree by one.
     * <br>
     * <br>It is safe to call this function from any thread.
     * @return the passed in &#35;GTree
    */
    public Tree ref()  {
        return new Tree(new PointerContainer(JnaTree.INST().g_tree_ref(asCPointer())));
    }

    /**
     * Removes a key/value pair from a &#35;GTree.
     * <br>
     * <br>If the &#35;GTree was created using g_tree_new_full(), the key and value
     * <br>are freed using the supplied destroy functions, otherwise you have to
     * <br>make sure that any dynamically allocated values are freed yourself.
     * <br>If the key does not exist in the &#35;GTree, the function does nothing.
     * <br>
     * <br>The cost of maintaining a balanced tree while removing a key/value
     * <br>result in a O(n log(n)) operation where most of the other operations
     * <br>are O(log(n)).
     * @param key the key to remove
     * @return %TRUE if the key was found (prior to 2.8, this function     returned nothing)
    */
    public boolean remove(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaTree.INST().g_tree_remove(asCPointer(), asCPointer(key));
    }

    /**
     * Removes all nodes from a &#35;GTree and destroys their keys and values,
     * <br>then resets the &#35;GTree’s root to %NULL.
    */
    public void removeAll()  {
        JnaTree.INST().g_tree_remove_all(asCPointer());
    }

    /**
     * Inserts a new key and value into a &#35;GTree as g_tree_replace_node() does,
     * <br>only this function does not return the inserted or set node.
     * @param key the key to insert
     * @param value the value corresponding to the key
    */
    public void replace(@Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        JnaTree.INST().g_tree_replace(asCPointer(), asCPointer(key), asCPointer(value));
    }

    /**
     * Inserts a new key and value into a &#35;GTree similar to g_tree_insert_node().
     * <br>The difference is that if the key already exists in the &#35;GTree, it gets
     * <br>replaced by the new key. If you supplied a &#64;value_destroy_func when
     * <br>creating the &#35;GTree, the old value is freed using that function. If you
     * <br>supplied a &#64;key_destroy_func when creating the &#35;GTree, the old key is
     * <br>freed using that function.
     * <br>
     * <br>The tree is automatically 'balanced' as new key/value pairs are added,
     * <br>so that the distance from the root to every leaf is as small as possible.
     * @param key the key to insert
     * @param value the value corresponding to the key
     * @return the inserted (or set) node.
    */
    public TreeNode replaceNode(@Nullable ch.bailu.gtk.type.Pointer key, @Nullable ch.bailu.gtk.type.Pointer value)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_replace_node(asCPointer(), asCPointer(key), asCPointer(value))));
    }

    /**
     * Searches a &#35;GTree using &#64;search_func.
     * <br>
     * <br>The &#64;search_func is called with a pointer to the key of a key/value
     * <br>pair in the tree, and the passed in &#64;user_data. If &#64;search_func returns
     * <br>0 for a key/value pair, then the corresponding value is returned as
     * <br>the result of g_tree_search(). If &#64;search_func returns -1, searching
     * <br>will proceed among the key/value pairs that have a smaller key; if
     * <br>&#64;search_func returns 1, searching will proceed among the key/value
     * <br>pairs that have a larger key.
     * @param search_func a function used to search the &#35;GTree
     * @param user_data the data passed as the second argument to &#64;search_func
     * @return the value corresponding to the found key, or %NULL     if the key was not found
    */
    public ch.bailu.gtk.type.Pointer search(OnCompareFunc search_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new ch.bailu.gtk.type.Pointer(new PointerContainer(JnaTree.INST().g_tree_search(asCPointer(), toOnCompareFunc(this, "search", search_func), asCPointer(user_data))));
    }

    /**
     * Searches a &#35;GTree using &#64;search_func.
     * <br>
     * <br>The &#64;search_func is called with a pointer to the key of a key/value
     * <br>pair in the tree, and the passed in &#64;user_data. If &#64;search_func returns
     * <br>0 for a key/value pair, then the corresponding node is returned as
     * <br>the result of g_tree_search(). If &#64;search_func returns -1, searching
     * <br>will proceed among the key/value pairs that have a smaller key; if
     * <br>&#64;search_func returns 1, searching will proceed among the key/value
     * <br>pairs that have a larger key.
     * @param search_func a function used to search the &#35;GTree
     * @param user_data the data passed as the second argument to &#64;search_func
     * @return the node corresponding to the          found key, or %NULL if the key was not found
    */
    public TreeNode searchNode(OnCompareFunc search_func, @Nullable ch.bailu.gtk.type.Pointer user_data)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_search_node(asCPointer(), toOnCompareFunc(this, "searchNode", search_func), asCPointer(user_data))));
    }

    /**
     * Removes a key and its associated value from a &#35;GTree without calling
     * <br>the key and value destroy functions.
     * <br>
     * <br>If the key does not exist in the &#35;GTree, the function does nothing.
     * @param key the key to remove
     * @return %TRUE if the key was found (prior to 2.8, this function     returned nothing)
    */
    public boolean steal(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return JnaTree.INST().g_tree_steal(asCPointer(), asCPointer(key));
    }

    /**
     * Decrements the reference count of &#64;tree by one.
     * <br>If the reference count drops to 0, all keys and values will
     * <br>be destroyed (if destroy functions were specified) and all
     * <br>memory allocated by &#64;tree will be released.
     * <br>
     * <br>It is safe to call this function from any thread.
    */
    public void unref()  {
        JnaTree.INST().g_tree_unref(asCPointer());
    }

    /**
     * Gets the upper bound node corresponding to the given key,
     * <br>or %NULL if the tree is empty or all the nodes in the tree
     * <br>have keys that are lower than or equal to the searched key.
     * <br>
     * <br>The upper bound is the first node that has its key strictly greater
     * <br>than the searched key.
     * @param key the key to calculate the upper bound for
     * @return the tree node corresponding to the          upper bound, or %NULL if the tree is empty or has only keys          lower than or equal to the searched key.
    */
    public TreeNode upperBound(@Nullable ch.bailu.gtk.type.Pointer key)  {
        return new TreeNode(new PointerContainer(JnaTree.INST().g_tree_upper_bound(asCPointer(), asCPointer(key))));
    }

    public static long getTypeID() { 
        return JnaTree.INST().g_tree_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:lookupExtended:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gconstpointer}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gpointer*}}:{j:}]

[MethodModel:cb-deprecated:traverse:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:[MethodModel:Supported:TraverseFunc:[ParameterModel:Supported:{G_::{c:gboolean}}:{j:boolean}]]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]]
        [ParameterModel:Supported:{G_::{c:GTraverseType}}:{j:int}]
        [ParameterModel:Supported:{Gw:Pointer:{c:gpointer}}:{j:long}]
*/
