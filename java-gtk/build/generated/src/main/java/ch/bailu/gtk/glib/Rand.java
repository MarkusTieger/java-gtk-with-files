/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The GRand struct is an opaque data structure. It should only be
 * <br>accessed through the g_rand_* functions.
 * <p><a href="https://docs.gtk.org/glib/struct.Rand.html">https://docs.gtk.org/glib/struct.Rand.html</a></p>
*/
class Rand extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Rand.class.getCanonicalName());
    }

    public Rand(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Copies a &#35;GRand into a new one with the same exact state as before.
     * <br>This way you can take a snapshot of the random number generator for
     * <br>replaying later.
     * @return the new &#35;GRand
    */
    public Rand copy()  {
        return new Rand(new PointerContainer(JnaRand.INST().g_rand_copy(asCPointer())));
    }

    /**
     * Returns the next random &#35;gdouble from &#64;rand_ equally distributed over
     * <br>the range [0..1).
     * @return a random number
    */
    public double _double()  {
        return JnaRand.INST().g_rand_double(asCPointer());
    }

    /**
     * Returns the next random &#35;gdouble from &#64;rand_ equally distributed over
     * <br>the range [&#64;begin..&#64;end).
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
    */
    public double doubleRange(double begin, double end)  {
        return JnaRand.INST().g_rand_double_range(asCPointer(), begin, end);
    }

    /**
     * Frees the memory allocated for the &#35;GRand.
    */
    public void free()  {
        JnaRand.INST().g_rand_free(asCPointer());
    }

    /**
     * Returns the next random &#35;guint32 from &#64;rand_ equally distributed over
     * <br>the range [0..2^32-1].
     * @return a random number
    */
    public int _int()  {
        return JnaRand.INST().g_rand_int(asCPointer());
    }

    /**
     * Returns the next random &#35;gint32 from &#64;rand_ equally distributed over
     * <br>the range [&#64;begin..&#64;end-1].
     * @param begin lower closed bound of the interval
     * @param end upper open bound of the interval
     * @return a random number
    */
    public int intRange(int begin, int end)  {
        return JnaRand.INST().g_rand_int_range(asCPointer(), begin, end);
    }

    /**
     * Sets the seed for the random number generator &#35;GRand to &#64;seed.
     * @param seed a value to reinitialize the random number generator
    */
    public void setSeed(int seed)  {
        JnaRand.INST().g_rand_set_seed(asCPointer(), seed);
    }

    /**
     * Creates a new random number generator initialized with a seed taken
     * <br>either from `/dev/urandom` (if existing) or from the current time
     * <br>(as a fallback).
     * <br>
     * <br>On Windows, the seed is taken from rand_s().
     * @return the new &#35;GRand
    */
    public static Rand _new()  {
        return new Rand(new PointerContainer(JnaRand.INST().g_rand_new()));
    }

    /**
     * Creates a new random number generator initialized with &#64;seed.
     * @param seed a value to initialize the random number generator
     * @return the new &#35;GRand
    */
    public static Rand newWithSeed(int seed)  {
        return new Rand(new PointerContainer(JnaRand.INST().g_rand_new_with_seed(seed)));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:java-type-not-supported:setSeedArray:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint32*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]

[MethodModel:java-type-not-supported:newWithSeedArray:[ParameterModel:Supported:{Gg:Rand:{c:GRand*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:const guint32*}}:{j:}]
        [ParameterModel:Supported:{G_::{c:guint}}:{j:int}]
*/
