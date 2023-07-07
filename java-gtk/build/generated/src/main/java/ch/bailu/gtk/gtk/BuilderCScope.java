/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GtkBuilderScope` implementation for the C language.
 * <br>
 * <br>`GtkBuilderCScope` instances use symbols explicitly added to &#64;builder
 * <br>with prior calls to [method&#64;Gtk.BuilderCScope.add_callback_symbol].
 * <br>If developers want to do that, they are encouraged to create their
 * <br>own scopes for that purpose.
 * <br>
 * <br>In the case that symbols are not explicitly added; GTK will uses
 * <br>`GModule`’s introspective features (by opening the module %NULL) to
 * <br>look at the application’s symbol table. From here it tries to match
 * <br>the signal function names given in the interface description with
 * <br>symbols in the application.
 * <br>
 * <br>Note that unless [method&#64;Gtk.BuilderCScope.add_callback_symbol] is
 * <br>called for all signal callbacks which are referenced by the loaded XML,
 * <br>this functionality will require that `GModule` be supported on the platform.
 * <p><a href="https://docs.gtk.org/gtk4/class.BuilderCScope.html">https://docs.gtk.org/gtk4/class.BuilderCScope.html</a></p>
*/
public class BuilderCScope extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(BuilderCScope.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCallback {
        /**
         * The type used for callback functions in structure definitions and function
         * <br>signatures.
         * <br>
         * <br>This doesn't mean that all callback functions must take no  parameters and
         * <br>return void. The required signature of a callback function is determined by
         * <br>the context in which is used (e.g. the signal to which it is connected).
         * <br>
         * <br>Use G_CALLBACK() to cast the callback function to a &#35;GCallback.
        */
        void onCallback(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaBuilderCScope.OnCallback toOnCallback(ch.bailu.gtk.type.Pointer instance, String methodName, OnCallback in) {
        JnaBuilderCScope.OnCallback out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onCallback(__callback);
            __callback.register(out);
        }
        return out;
    }

    public BuilderCScope(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkBuilderCScope` object to use with future
     * <br>`GtkBuilder` instances.
     * <br>
     * <br>Calling this function is only necessary if you want to add
     * <br>custom callbacks via [method&#64;Gtk.BuilderCScope.add_callback_symbol].
    */
    public BuilderCScope() {
        super(cast(JnaBuilderCScope.INST().gtk_builder_cscope_new()));
    }

    /**
     * Adds the &#64;callback_symbol to the scope of &#64;builder under the
     * <br>given &#64;callback_name.
     * <br>
     * <br>Using this function overrides the behavior of
     * <br>[method&#64;Gtk.Builder.create_closure] for any callback symbols that
     * <br>are added. Using this method allows for better encapsulation as it
     * <br>does not require that callback symbols be declared in the global
     * <br>namespace.
     * @param callback_name The name of the callback, as expected in the XML
     * @param callback_symbol The callback pointer
    */
    public void addCallbackSymbol(@Nonnull ch.bailu.gtk.type.Str callback_name, OnCallback callback_symbol)  {
        JnaBuilderCScope.INST().gtk_builder_cscope_add_callback_symbol(asCPointer(), asCPointerNotNull(callback_name), toOnCallback(this, "addCallbackSymbol", callback_symbol));
    }

    /**
     * Adds the &#64;callback_symbol to the scope of &#64;builder under the
     * <br>given &#64;callback_name.
     * <br>
     * <br>Using this function overrides the behavior of
     * <br>[method&#64;Gtk.Builder.create_closure] for any callback symbols that
     * <br>are added. Using this method allows for better encapsulation as it
     * <br>does not require that callback symbols be declared in the global
     * <br>namespace.
     * @param callback_name The name of the callback, as expected in the XML
     * @param callback_symbol The callback pointer
    */
    public void addCallbackSymbol(String callback_name, OnCallback callback_symbol)  {
        JnaBuilderCScope.INST().gtk_builder_cscope_add_callback_symbol(asCPointer(), callback_name, toOnCallback(this, "addCallbackSymbol", callback_symbol));
    }

    /**
     * A convenience function to add many callbacks.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.BuilderCScope.add_callback_symbol]
     * <br>for each symbol.
     * @param first_callback_name The name of the callback, as expected in the XML
     * @param first_callback_symbol The callback pointer
     * @param _elipse A list of callback name and callback symbol pairs terminated with %NULL
    */
    public void addCallbackSymbols(@Nonnull ch.bailu.gtk.type.Str first_callback_name, OnCallback first_callback_symbol, java.lang.Object... _elipse)  {
        JnaBuilderCScope.INST().gtk_builder_cscope_add_callback_symbols(asCPointer(), asCPointerNotNull(first_callback_name), toOnCallback(this, "addCallbackSymbols", first_callback_symbol), _elipse);
    }

    /**
     * A convenience function to add many callbacks.
     * <br>
     * <br>This is equivalent to calling [method&#64;Gtk.BuilderCScope.add_callback_symbol]
     * <br>for each symbol.
     * @param first_callback_name The name of the callback, as expected in the XML
     * @param first_callback_symbol The callback pointer
     * @param _elipse A list of callback name and callback symbol pairs terminated with %NULL
    */
    public void addCallbackSymbols(String first_callback_name, OnCallback first_callback_symbol, java.lang.Object... _elipse)  {
        JnaBuilderCScope.INST().gtk_builder_cscope_add_callback_symbols(asCPointer(), first_callback_name, toOnCallback(this, "addCallbackSymbols", first_callback_symbol), _elipse);
    }

    /**
     * Implements interface {@link BuilderScope}. Call this to get access to interface functions.
     * @return {@link BuilderScope}
    */
    public BuilderScope asBuilderScope() {
        return new BuilderScope(cast());
    }

    public static long getTypeID() { 
        return JnaBuilderCScope.INST().gtk_builder_cscope_get_type(); 
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
class-type

[MethodModel:cb-returns-callback:lookupCallbackSymbol:[ParameterModel:Supported:[MethodModel:Supported:Callback:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]]]
        [ParameterModel:Supported:{Gw:Str:{c:const char*}}:{j:long}]
*/
