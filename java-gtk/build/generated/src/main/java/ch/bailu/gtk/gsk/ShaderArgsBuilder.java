/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An object to build the uniforms data for a `GskGLShader`.
 * <p><a href="https://docs.gtk.org/gsk4/struct.ShaderArgsBuilder.html">https://docs.gtk.org/gsk4/struct.ShaderArgsBuilder.html</a></p>
*/
public class ShaderArgsBuilder extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ShaderArgsBuilder.class.getCanonicalName());
    }

    public ShaderArgsBuilder(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Allocates a builder that can be used to construct a new uniform data
     * <br>chunk.
     * @param shader a `GskGLShader`
     * @param initial_values optional `GBytes` with initial values
    */
    public ShaderArgsBuilder(@Nonnull GLShader shader, @Nullable ch.bailu.gtk.glib.Bytes initial_values) {
        super(cast(JnaShaderArgsBuilder.INST().gsk_shader_args_builder_new(asCPointerNotNull(shader), asCPointer(initial_values))));
    }

    /**
     * Creates a new `GBytes` args from the current state of the
     * <br>given &#64;builder, and frees the &#64;builder instance.
     * <br>
     * <br>Any uniforms of the shader that have not been explicitly set
     * <br>on the &#64;builder are zero-initialized.
     * @return the newly allocated buffer with   all the args added to &#64;builder
    */
    public ch.bailu.gtk.glib.Bytes freeToArgs()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaShaderArgsBuilder.INST().gsk_shader_args_builder_free_to_args(asCPointer())));
    }

    /**
     * Increases the reference count of a `GskShaderArgsBuilder` by one.
     * @return the passed in `GskShaderArgsBuilder`
    */
    public ShaderArgsBuilder ref()  {
        return new ShaderArgsBuilder(new PointerContainer(JnaShaderArgsBuilder.INST().gsk_shader_args_builder_ref(asCPointer())));
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of bool type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
    */
    public void setBool(int idx, boolean value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_bool(asCPointer(), idx, value);
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of float type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
    */
    public void setFloat(int idx, float value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_float(asCPointer(), idx, value);
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of int type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
    */
    public void setInt(int idx, int value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_int(asCPointer(), idx, value);
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of uint type.
     * @param idx index of the uniform
     * @param value value to set the uniform to
    */
    public void setUint(int idx, int value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_uint(asCPointer(), idx, value);
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of vec2 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
    */
    public void setVec2(int idx, @Nonnull ch.bailu.gtk.graphene.Vec2 value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_vec2(asCPointer(), idx, asCPointerNotNull(value));
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of vec3 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
    */
    public void setVec3(int idx, @Nonnull ch.bailu.gtk.graphene.Vec3 value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_vec3(asCPointer(), idx, asCPointerNotNull(value));
    }

    /**
     * Sets the value of the uniform &#64;idx.
     * <br>
     * <br>The uniform must be of vec4 type.
     * @param idx index of the uniform
     * @param value value to set the uniform too
    */
    public void setVec4(int idx, @Nonnull ch.bailu.gtk.graphene.Vec4 value)  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_set_vec4(asCPointer(), idx, asCPointerNotNull(value));
    }

    /**
     * Creates a new `GBytes` args from the current state of the
     * <br>given &#64;builder.
     * <br>
     * <br>Any uniforms of the shader that have not been explicitly set on
     * <br>the &#64;builder are zero-initialized.
     * <br>
     * <br>The given `GskShaderArgsBuilder` is reset once this function returns;
     * <br>you cannot call this function multiple times on the same &#64;builder instance.
     * <br>
     * <br>This function is intended primarily for bindings. C code should use
     * <br>[method&#64;Gsk.ShaderArgsBuilder.free_to_args].
     * @return the newly allocated buffer with   all the args added to &#64;builder
    */
    public ch.bailu.gtk.glib.Bytes toArgs()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaShaderArgsBuilder.INST().gsk_shader_args_builder_to_args(asCPointer())));
    }

    /**
     * Decreases the reference count of a `GskShaderArgBuilder` by one.
     * <br>
     * <br>If the resulting reference count is zero, frees the builder.
    */
    public void unref()  {
        JnaShaderArgsBuilder.INST().gsk_shader_args_builder_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaShaderArgsBuilder.INST().gsk_shader_args_builder_get_type(); 
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
