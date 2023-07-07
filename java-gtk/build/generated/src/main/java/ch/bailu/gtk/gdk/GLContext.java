/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GdkGLContext` is an object representing a platform-specific
 * <br>OpenGL draw context.
 * <br>
 * <br>`GdkGLContext`s are created for a surface using
 * <br>[method&#64;Gdk.Surface.create_gl_context], and the context will match
 * <br>the characteristics of the surface.
 * <br>
 * <br>A `GdkGLContext` is not tied to any particular normal framebuffer.
 * <br>For instance, it cannot draw to the surface back buffer. The GDK
 * <br>repaint system is in full control of the painting to that. Instead,
 * <br>you can create render buffers or textures and use [func&#64;cairo_draw_from_gl]
 * <br>in the draw function of your widget to draw them. Then GDK will handle
 * <br>the integration of your rendering with that of other widgets.
 * <br>
 * <br>Support for `GdkGLContext` is platform-specific and context creation
 * <br>can fail, returning %NULL context.
 * <br>
 * <br>A `GdkGLContext` has to be made &quot;current&quot; in order to start using
 * <br>it, otherwise any OpenGL call will be ignored.
 * <br>
 * <br>&#35;&#35; Creating a new OpenGL context
 * <br>
 * <br>In order to create a new `GdkGLContext` instance you need a `GdkSurface`,
 * <br>which you typically get during the realize call of a widget.
 * <br>
 * <br>A `GdkGLContext` is not realized until either [method&#64;Gdk.GLContext.make_current]
 * <br>or [method&#64;Gdk.GLContext.realize] is called. It is possible to specify
 * <br>details of the GL context like the OpenGL version to be used, or whether
 * <br>the GL context should have extra state validation enabled after calling
 * <br>[method&#64;Gdk.Surface.create_gl_context] by calling [method&#64;Gdk.GLContext.realize].
 * <br>If the realization fails you have the option to change the settings of
 * <br>the `GdkGLContext` and try again.
 * <br>
 * <br>&#35;&#35; Using a GdkGLContext
 * <br>
 * <br>You will need to make the `GdkGLContext` the current context before issuing
 * <br>OpenGL calls; the system sends OpenGL commands to whichever context is current.
 * <br>It is possible to have multiple contexts, so you always need to ensure that
 * <br>the one which you want to draw with is the current one before issuing commands:
 * <br>
 * <br>```c
 * <br>gdk_gl_context_make_current (context);
 * <br>```
 * <br>
 * <br>You can now perform your drawing using OpenGL commands.
 * <br>
 * <br>You can check which `GdkGLContext` is the current one by using
 * <br>[func&#64;Gdk.GLContext.get_current]; you can also unset any `GdkGLContext`
 * <br>that is currently set by calling [func&#64;Gdk.GLContext.clear_current].
 * <p><a href="https://docs.gtk.org/gdk4/class.GLContext.html">https://docs.gtk.org/gdk4/class.GLContext.html</a></p>
*/
public class GLContext extends DrawContext {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLContext.class.getCanonicalName());
    }

    public GLContext(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
     * @return the allowed APIs
    */
    public int getAllowedApis()  {
        return JnaGLContext.INST().gdk_gl_context_get_allowed_apis(asCPointer());
    }

    /**
     * Gets the API currently in use.
     * <br>
     * <br>If the renderer has not been realized yet, 0 is returned.
     * @return the currently used API
    */
    public int getApi()  {
        return JnaGLContext.INST().gdk_gl_context_get_api(asCPointer());
    }

    /**
     * Retrieves whether the context is doing extra validations and runtime checking.
     * <br>
     * <br>See [method&#64;Gdk.GLContext.set_debug_enabled].
     * @return %TRUE if debugging is enabled
    */
    public boolean getDebugEnabled()  {
        return JnaGLContext.INST().gdk_gl_context_get_debug_enabled(asCPointer());
    }

    /**
     * Retrieves the display the &#64;context is created for
     * @return a `GdkDisplay`
    */
    public Display getDisplay()  {
        return new Display(new PointerContainer(JnaGLContext.INST().gdk_gl_context_get_display(asCPointer())));
    }

    /**
     * Retrieves whether the context is forward-compatible.
     * <br>
     * <br>See [method&#64;Gdk.GLContext.set_forward_compatible].
     * @return %TRUE if the context should be forward-compatible
    */
    public boolean getForwardCompatible()  {
        return JnaGLContext.INST().gdk_gl_context_get_forward_compatible(asCPointer());
    }

    /**
     * Retrieves required OpenGL version set as a requirement for the &#64;context
     * <br>realization. It will not change even if a greater OpenGL version is supported
     * <br>and used after the &#64;context is realized. See
     * <br>[method&#64;Gdk.GLContext.get_version] for the real version in use.
     * <br>
     * <br>See [method&#64;Gdk.GLContext.set_required_version].
     * @param major return location for the major version to request
     * @param minor return location for the minor version to request
    */
    public void getRequiredVersion(@Nullable ch.bailu.gtk.type.Int major, @Nullable ch.bailu.gtk.type.Int minor)  {
        JnaGLContext.INST().gdk_gl_context_get_required_version(asCPointer(), asCPointer(major), asCPointer(minor));
    }

    /**
     * Retrieves the surface used by the &#64;context.
     * @return a `GdkSurface`
    */
    public Surface getSurface()  {
        return new Surface(new PointerContainer(JnaGLContext.INST().gdk_gl_context_get_surface(asCPointer())));
    }

    /**
     * Checks whether the &#64;context is using an OpenGL or OpenGL ES profile.
     * @return %TRUE if the `GdkGLContext` is using an OpenGL ES profile; %FALSE if other profile is in use of if the &#64;context has not yet been realized.
    */
    public boolean getUseEs()  {
        return JnaGLContext.INST().gdk_gl_context_get_use_es(asCPointer());
    }

    /**
     * Retrieves the OpenGL version of the &#64;context.
     * <br>
     * <br>The &#64;context must be realized prior to calling this function.
     * <br>
     * <br>If the &#64;context has never been made current, the version cannot
     * <br>be known and it will return 0 for both &#64;major and &#64;minor.
     * @param major return location for the major version
     * @param minor return location for the minor version
    */
    public void getVersion(@Nonnull ch.bailu.gtk.type.Int major, @Nonnull ch.bailu.gtk.type.Int minor)  {
        JnaGLContext.INST().gdk_gl_context_get_version(asCPointer(), asCPointerNotNull(major), asCPointerNotNull(minor));
    }

    /**
     * Whether the `GdkGLContext` is in legacy mode or not.
     * <br>
     * <br>The `GdkGLContext` must be realized before calling this function.
     * <br>
     * <br>When realizing a GL context, GDK will try to use the OpenGL 3.2 core
     * <br>profile; this profile removes all the OpenGL API that was deprecated
     * <br>prior to the 3.2 version of the specification. If the realization is
     * <br>successful, this function will return %FALSE.
     * <br>
     * <br>If the underlying OpenGL implementation does not support core profiles,
     * <br>GDK will fall back to a pre-3.2 compatibility profile, and this function
     * <br>will return %TRUE.
     * <br>
     * <br>You can use the value returned by this function to decide which kind
     * <br>of OpenGL API to use, or whether to do extension discovery, or what
     * <br>kind of shader programs to load.
     * @return %TRUE if the GL context is in legacy mode
    */
    public boolean isLegacy()  {
        return JnaGLContext.INST().gdk_gl_context_is_legacy(asCPointer());
    }

    /**
     * Checks if the two GL contexts can share resources.
     * <br>
     * <br>When they can, the texture IDs from &#64;other can be used in &#64;self. This
     * <br>is particularly useful when passing `GdkGLTexture` objects between
     * <br>different contexts.
     * <br>
     * <br>Contexts created for the same display with the same properties will
     * <br>always be compatible, even if they are created for different surfaces.
     * <br>For other contexts it depends on the GL backend.
     * <br>
     * <br>Both contexts must be realized for this check to succeed. If either one
     * <br>is not, this function will return %FALSE.
     * @param other the `GdkGLContext` that should be compatible with &#64;self
     * @return %TRUE if the two GL contexts are compatible.
    */
    public boolean isShared(@Nonnull GLContext other)  {
        return JnaGLContext.INST().gdk_gl_context_is_shared(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Makes the &#64;context the current one.
    */
    public void makeCurrent()  {
        JnaGLContext.INST().gdk_gl_context_make_current(asCPointer());
    }

    /**
     * Realizes the given `GdkGLContext`.
     * <br>
     * <br>It is safe to call this function on a realized `GdkGLContext`.
     * @return %TRUE if the context is realized
    */
    public boolean realize() throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGLContext.INST().gdk_gl_context_realize(asCPointer(), 0L);
    }

    /**
     * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
     * <br>allowed APIs will be tried. If you set this to 0, realizing will always fail.
     * <br>
     * <br>If you set it on a realized context, the property will not have any effect.
     * <br>It is only relevant during gdk_gl_context_realize().
     * <br>
     * <br>By default, all APIs are allowed.
     * @param apis the allowed APIs
    */
    public void setAllowedApis(int apis)  {
        JnaGLContext.INST().gdk_gl_context_set_allowed_apis(asCPointer(), apis);
    }

    /**
     * Sets whether the `GdkGLContext` should perform extra validations and
     * <br>runtime checking.
     * <br>
     * <br>This is useful during development, but has additional overhead.
     * <br>
     * <br>The `GdkGLContext` must not be realized or made current prior to
     * <br>calling this function.
     * @param enabled whether to enable debugging in the context
    */
    public void setDebugEnabled(boolean enabled)  {
        JnaGLContext.INST().gdk_gl_context_set_debug_enabled(asCPointer(), enabled);
    }

    /**
     * Sets whether the `GdkGLContext` should be forward-compatible.
     * <br>
     * <br>Forward-compatible contexts must not support OpenGL functionality that
     * <br>has been marked as deprecated in the requested version; non-forward
     * <br>compatible contexts, on the other hand, must support both deprecated and
     * <br>non deprecated functionality.
     * <br>
     * <br>The `GdkGLContext` must not be realized or made current prior to calling
     * <br>this function.
     * @param compatible whether the context should be forward-compatible
    */
    public void setForwardCompatible(boolean compatible)  {
        JnaGLContext.INST().gdk_gl_context_set_forward_compatible(asCPointer(), compatible);
    }

    /**
     * Sets the major and minor version of OpenGL to request.
     * <br>
     * <br>Setting &#64;major and &#64;minor to zero will use the default values.
     * <br>
     * <br>Setting &#64;major and &#64;minor lower than the minimum versions required
     * <br>by GTK will result in the context choosing the minimum version.
     * <br>
     * <br>The &#64;context must not be realized or made current prior to calling
     * <br>this function.
     * @param major the major version to request
     * @param minor the minor version to request
    */
    public void setRequiredVersion(int major, int minor)  {
        JnaGLContext.INST().gdk_gl_context_set_required_version(asCPointer(), major, minor);
    }

    /**
     * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
     * <br>
     * <br>Not all platforms support OpenGL ES.
     * <br>
     * <br>The &#64;context must not have been realized.
     * <br>
     * <br>By default, GDK will attempt to automatically detect whether the
     * <br>underlying GL implementation is OpenGL or OpenGL ES once the &#64;context
     * <br>is realized.
     * <br>
     * <br>You should check the return value of [method&#64;Gdk.GLContext.get_use_es]
     * <br>after calling [method&#64;Gdk.GLContext.realize] to decide whether to use
     * <br>the OpenGL or OpenGL ES API, extensions, or shaders.
     * @param use_es whether the context should use OpenGL ES instead of OpenGL,   or -1 to allow auto-detection
    */
    public void setUseEs(int use_es)  {
        JnaGLContext.INST().gdk_gl_context_set_use_es(asCPointer(), use_es);
    }

    /**
     * Clears the current `GdkGLContext`.
     * <br>
     * <br>Any OpenGL call after this function returns will be ignored
     * <br>until [method&#64;Gdk.GLContext.make_current] is called.
    */
    public static void clearCurrent()  {
        JnaGLContext.INST().gdk_gl_context_clear_current();
    }

    /**
     * Retrieves the current `GdkGLContext`.
     * @return the current `GdkGLContext`
    */
    public static GLContext getCurrent()  {
        return new GLContext(new PointerContainer(JnaGLContext.INST().gdk_gl_context_get_current()));
    }

    public static long getTypeID() { 
        return JnaGLContext.INST().gdk_gl_context_get_type(); 
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

[MethodModel:cb-deprecated:getSharedContext:[ParameterModel:Supported:{Gg:GLContext:{c:GdkGLContext*}}:{j:long}]]
*/
