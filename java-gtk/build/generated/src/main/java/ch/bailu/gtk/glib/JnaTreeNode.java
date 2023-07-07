/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaTreeNode {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_tree_node_key(long _self);
        long g_tree_node_next(long _self);
        long g_tree_node_previous(long _self);
        long g_tree_node_value(long _self);
    }

}
