/* this file is machine generated */
package ch.bailu.gtk.graphene;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://ebassi.github.io/graphene/docs/">https://ebassi.github.io/graphene/docs/</a></p>
*/
public interface GrapheneConstants {

    /**
     * 
    */
    double PI = 3.141593;

    /**
     * 
    */
    double PI_2 = 1.570796;

    /**
     * Evaluates to the number of components of a &#35;graphene_vec2_t.
     * <br>
     * <br>This symbol is useful when declaring a C array of floating
     * <br>point values to be used with graphene_vec2_init_from_float() and
     * <br>graphene_vec2_to_float(), e.g.
     * <br>
     * <pre>
     *   float v[GRAPHENE_VEC2_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec2_to_float (&amp;vec, v);
     * 
     *   for (int i = 0; i &lt; GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, &quot;component %d: %g&#92;n&quot;, i, v[i]);
     * </pre>
    */
    int VEC2_LEN = 2;

    /**
     * Evaluates to the number of components of a &#35;graphene_vec3_t.
     * <br>
     * <br>This symbol is useful when declaring a C array of floating
     * <br>point values to be used with graphene_vec3_init_from_float() and
     * <br>graphene_vec3_to_float(), e.g.
     * <br>
     * <pre>
     *   float v[GRAPHENE_VEC3_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec3_to_float (&amp;vec, v);
     * 
     *   for (int i = 0; i &lt; GRAPHENE_VEC2_LEN; i++)
     *     fprintf (stdout, &quot;component %d: %g&#92;n&quot;, i, v[i]);
     * </pre>
    */
    int VEC3_LEN = 3;

    /**
     * Evaluates to the number of components of a &#35;graphene_vec4_t.
     * <br>
     * <br>This symbol is useful when declaring a C array of floating
     * <br>point values to be used with graphene_vec4_init_from_float() and
     * <br>graphene_vec4_to_float(), e.g.
     * <br>
     * <pre>
     *   float v[GRAPHENE_VEC4_LEN];
     * 
     *   // vec is defined elsewhere
     *   graphene_vec4_to_float (&amp;vec, v);
     * 
     *   for (int i = 0; i &lt; GRAPHENE_VEC4_LEN; i++)
     *     fprintf (stdout, &quot;component %d: %g&#92;n&quot;, i, v[i]);
     * </pre>
    */
    int VEC4_LEN = 4;

}

/*
enumeration-type
*/
