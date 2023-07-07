/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontDescription {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_font_description_new();
        boolean pango_font_description_better_match(long _self, long old_match, long new_match);
        long pango_font_description_copy(long _self);
        long pango_font_description_copy_static(long _self);
        boolean pango_font_description_equal(long _self, long desc2);
        void pango_font_description_free(long _self);
        long pango_font_description_get_family(long _self);
        int pango_font_description_get_gravity(long _self);
        int pango_font_description_get_set_fields(long _self);
        int pango_font_description_get_size(long _self);
        boolean pango_font_description_get_size_is_absolute(long _self);
        int pango_font_description_get_stretch(long _self);
        int pango_font_description_get_style(long _self);
        int pango_font_description_get_variant(long _self);
        long pango_font_description_get_variations(long _self);
        int pango_font_description_get_weight(long _self);
        int pango_font_description_hash(long _self);
        void pango_font_description_merge(long _self, long desc_to_merge, boolean replace_existing);
        void pango_font_description_merge_static(long _self, long desc_to_merge, boolean replace_existing);
        void pango_font_description_set_absolute_size(long _self, double size);
        void pango_font_description_set_family(long _self, long family);
        void pango_font_description_set_family(long _self, String family);
        void pango_font_description_set_family_static(long _self, long family);
        void pango_font_description_set_family_static(long _self, String family);
        void pango_font_description_set_gravity(long _self, int gravity);
        void pango_font_description_set_size(long _self, int size);
        void pango_font_description_set_stretch(long _self, int stretch);
        void pango_font_description_set_style(long _self, int style);
        void pango_font_description_set_variant(long _self, int variant);
        void pango_font_description_set_variations(long _self, long variations);
        void pango_font_description_set_variations(long _self, String variations);
        void pango_font_description_set_variations_static(long _self, long variations);
        void pango_font_description_set_variations_static(long _self, String variations);
        void pango_font_description_set_weight(long _self, int weight);
        long pango_font_description_to_filename(long _self);
        long pango_font_description_to_string(long _self);
        void pango_font_description_unset_fields(long _self, int to_unset);
        long pango_font_description_from_string(long str);
        long pango_font_description_get_type();
    }

}
