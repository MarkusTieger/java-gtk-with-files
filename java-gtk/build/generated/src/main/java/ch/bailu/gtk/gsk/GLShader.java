/* this file is machine generated */
package ch.bailu.gtk.gsk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GskGLShader` is a snippet of GLSL that is meant to run in the
 * <br>fragment shader of the rendering pipeline.
 * <br>
 * <br>A fragment shader gets the coordinates being rendered as input and
 * <br>produces the pixel values for that particular pixel. Additionally,
 * <br>the shader can declare a set of other input arguments, called
 * <br>uniforms (as they are uniform over all the calls to your shader in
 * <br>each instance of use). A shader can also receive up to 4
 * <br>textures that it can use as input when producing the pixel data.
 * <br>
 * <br>`GskGLShader` is usually used with gtk_snapshot_push_gl_shader()
 * <br>to produce a [class&#64;Gsk.GLShaderNode] in the rendering hierarchy,
 * <br>and then its input textures are constructed by rendering the child
 * <br>nodes to textures before rendering the shader node itself. (You can
 * <br>pass texture nodes as children if you want to directly use a texture
 * <br>as input).
 * <br>
 * <br>The actual shader code is GLSL code that gets combined with
 * <br>some other code into the fragment shader. Since the exact
 * <br>capabilities of the GPU driver differs between different OpenGL
 * <br>drivers and hardware, GTK adds some defines that you can use
 * <br>to ensure your GLSL code runs on as many drivers as it can.
 * <br>
 * <br>If the OpenGL driver is GLES, then the shader language version
 * <br>is set to 100, and GSK_GLES will be defined in the shader.
 * <br>
 * <br>Otherwise, if the OpenGL driver does not support the 3.2 core profile,
 * <br>then the shader will run with language version 110 for GL2 and 130 for GL3,
 * <br>and GSK_LEGACY will be defined in the shader.
 * <br>
 * <br>If the OpenGL driver supports the 3.2 code profile, it will be used,
 * <br>the shader language version is set to 150, and GSK_GL3 will be defined
 * <br>in the shader.
 * <br>
 * <br>The main function the shader must implement is:
 * <br>
 * <br>```glsl
 * <br> void mainImage(out vec4 fragColor,
 * <br>                in vec2 fragCoord,
 * <br>                in vec2 resolution,
 * <br>                in vec2 uv)
 * <br>```
 * <br>
 * <br>Where the input &#64;fragCoord is the coordinate of the pixel we're
 * <br>currently rendering, relative to the boundary rectangle that was
 * <br>specified in the `GskGLShaderNode`, and &#64;resolution is the width and
 * <br>height of that rectangle. This is in the typical GTK coordinate
 * <br>system with the origin in the top left. &#64;uv contains the u and v
 * <br>coordinates that can be used to index a texture at the
 * <br>corresponding point. These coordinates are in the [0..1]x[0..1]
 * <br>region, with 0, 0 being in the lower left corder (which is typical
 * <br>for OpenGL).
 * <br>
 * <br>The output &#64;fragColor should be a RGBA color (with
 * <br>premultiplied alpha) that will be used as the output for the
 * <br>specified pixel location. Note that this output will be
 * <br>automatically clipped to the clip region of the glshader node.
 * <br>
 * <br>In addition to the function arguments the shader can define
 * <br>up to 4 uniforms for textures which must be called u_textureN
 * <br>(i.e. u_texture1 to u_texture4) as well as any custom uniforms
 * <br>you want of types int, uint, bool, float, vec2, vec3 or vec4.
 * <br>
 * <br>All textures sources contain premultiplied alpha colors, but if some
 * <br>there are outer sources of colors there is a gsk_premultiply() helper
 * <br>to compute premultiplication when needed.
 * <br>
 * <br>Note that GTK parses the uniform declarations, so each uniform has to
 * <br>be on a line by itself with no other code, like so:
 * <br>
 * <br>```glsl
 * <br>uniform float u_time;
 * <br>uniform vec3 u_color;
 * <br>uniform sampler2D u_texture1;
 * <br>uniform sampler2D u_texture2;
 * <br>```
 * <br>
 * <br>GTK uses the &quot;gsk&quot; namespace in the symbols it uses in the
 * <br>shader, so your code should not use any symbols with the prefix gsk
 * <br>or GSK. There are some helper functions declared that you can use:
 * <br>
 * <br>```glsl
 * <br>vec4 GskTexture(sampler2D sampler, vec2 texCoords);
 * <br>```
 * <br>
 * <br>This samples a texture (e.g. u_texture1) at the specified
 * <br>coordinates, and containes some helper ifdefs to ensure that
 * <br>it works on all OpenGL versions.
 * <br>
 * <br>You can compile the shader yourself using [method&#64;Gsk.GLShader.compile],
 * <br>otherwise the GSK renderer will do it when it handling the glshader
 * <br>node. If errors occurs, the returned &#64;error will include the glsl
 * <br>sources, so you can see what GSK was passing to the compiler. You
 * <br>can also set GSK_DEBUG=shaders in the environment to see the sources
 * <br>and other relevant information about all shaders that GSK is handling.
 * <br>
 * <br>&#35; An example shader
 * <br>
 * <br>```glsl
 * <br>uniform float position;
 * <br>uniform sampler2D u_texture1;
 * <br>uniform sampler2D u_texture2;
 * <br>
 * <br>void mainImage(out vec4 fragColor,
 * <br>               in vec2 fragCoord,
 * <br>               in vec2 resolution,
 * <br>               in vec2 uv) {
 * <br>  vec4 source1 = GskTexture(u_texture1, uv);
 * <br>  vec4 source2 = GskTexture(u_texture2, uv);
 * <br>
 * <br>  fragColor = position * source1 + (1.0 - position) * source2;
 * <br>}
 * <br>```
 * <p><a href="https://docs.gtk.org/gsk4/class.GLShader.html">https://docs.gtk.org/gsk4/class.GLShader.html</a></p>
*/
public class GLShader extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GLShader.class.getCanonicalName());
    }

    public GLShader(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     * @param sourcecode GLSL sourcecode for the shader, as a `GBytes`
     * @return A new `GskGLShader`
    */
    public static GLShader newFromBytesGLShader(@Nonnull ch.bailu.gtk.glib.Bytes sourcecode)  {
        PointerContainer __self = cast(JnaGLShader.INST().gsk_gl_shader_new_from_bytes(asCPointerNotNull(sourcecode)));
        if (__self.isNull()) {
            throw new NullPointerException("GLShader:newFromBytes");
        }
        return new GLShader(__self);
    }        
    

    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     * @param resource_path path to a resource that contains the GLSL sourcecode for     the shader
     * @return A new `GskGLShader`
    */
    public static GLShader newFromResourceGLShader(@Nonnull ch.bailu.gtk.type.Str resource_path)  {
        PointerContainer __self = cast(JnaGLShader.INST().gsk_gl_shader_new_from_resource(asCPointerNotNull(resource_path)));
        if (__self.isNull()) {
            throw new NullPointerException("GLShader:newFromResource");
        }
        return new GLShader(__self);
    }        
    

    /**
     * Creates a `GskGLShader` that will render pixels using the specified code.
     * @param resource_path path to a resource that contains the GLSL sourcecode for     the shader
     * @return A new `GskGLShader`
    */
    public static GLShader newFromResourceGLShader(String resource_path)  {
        PointerContainer __self = cast(JnaGLShader.INST().gsk_gl_shader_new_from_resource(resource_path));
        if (__self.isNull()) {
            throw new NullPointerException("GLShader:newFromResource");
        }
        return new GLShader(__self);
    }        
    

    /**
     * Tries to compile the &#64;shader for the given &#64;renderer.
     * <br>
     * <br>If there is a problem, this function returns %FALSE and reports
     * <br>an error. You should use this function before relying on the shader
     * <br>for rendering and use a fallback with a simpler shader or without
     * <br>shaders if it fails.
     * <br>
     * <br>Note that this will modify the rendering state (for example
     * <br>change the current GL context) and requires the renderer to be
     * <br>set up. This means that the widget has to be realized. Commonly you
     * <br>want to call this from the realize signal of a widget, or during
     * <br>widget snapshot.
     * @param renderer a `GskRenderer`
     * @return %TRUE on success, %FALSE if an error occurred
    */
    public boolean compile(@Nonnull Renderer renderer) throws ch.bailu.gtk.type.exception.AllocationError {
        return JnaGLShader.INST().gsk_gl_shader_compile(asCPointer(), asCPointerNotNull(renderer), 0L);
    }

    /**
     * Looks for a uniform by the name &#64;name, and returns the index
     * <br>of the uniform, or -1 if it was not found.
     * @param name uniform name
     * @return The index of the uniform, or -1
    */
    public int findUniformByName(@Nonnull ch.bailu.gtk.type.Str name)  {
        return JnaGLShader.INST().gsk_gl_shader_find_uniform_by_name(asCPointer(), asCPointerNotNull(name));
    }

    /**
     * Looks for a uniform by the name &#64;name, and returns the index
     * <br>of the uniform, or -1 if it was not found.
     * @param name uniform name
     * @return The index of the uniform, or -1
    */
    public int findUniformByName(String name)  {
        return JnaGLShader.INST().gsk_gl_shader_find_uniform_by_name(asCPointer(), name);
    }

    /**
     * Formats the uniform data as needed for feeding the named uniforms
     * <br>values into the shader.
     * <br>
     * <br>The argument list is a list of pairs of names, and values for the types
     * <br>that match the declared uniforms (i.e. double/int/guint/gboolean for
     * <br>primitive values and `graphene_vecN_t *` for vecN uniforms).
     * <br>
     * <br>Any uniforms of the shader that are not included in the argument list
     * <br>are zero-initialized.
     * @param _elipse name-Value pairs for the uniforms of &#64;shader, ending with     a %NULL name
     * @return A newly allocated block of data which can be     passed to [ctor&#64;Gsk.GLShaderNode.new].
    */
    public ch.bailu.gtk.glib.Bytes formatArgs(java.lang.Object... _elipse)  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaGLShader.INST().gsk_gl_shader_format_args(asCPointer(), _elipse)));
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of bool type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
    */
    public boolean getArgBool(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_arg_bool(asCPointer(), asCPointerNotNull(args), idx);
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of float type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
    */
    public float getArgFloat(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_arg_float(asCPointer(), asCPointerNotNull(args), idx);
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of int type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
    */
    public int getArgInt(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_arg_int(asCPointer(), asCPointerNotNull(args), idx);
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of uint type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @return The value
    */
    public int getArgUint(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_arg_uint(asCPointer(), asCPointerNotNull(args), idx);
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of vec2 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param out_value location to store the uniform value in
    */
    public void getArgVec2(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx, @Nonnull ch.bailu.gtk.graphene.Vec2 out_value)  {
        JnaGLShader.INST().gsk_gl_shader_get_arg_vec2(asCPointer(), asCPointerNotNull(args), idx, asCPointerNotNull(out_value));
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of vec3 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param out_value location to store the uniform value in
    */
    public void getArgVec3(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx, @Nonnull ch.bailu.gtk.graphene.Vec3 out_value)  {
        JnaGLShader.INST().gsk_gl_shader_get_arg_vec3(asCPointer(), asCPointerNotNull(args), idx, asCPointerNotNull(out_value));
    }

    /**
     * Gets the value of the uniform &#64;idx in the &#64;args block.
     * <br>
     * <br>The uniform must be of vec4 type.
     * @param args uniform arguments
     * @param idx index of the uniform
     * @param out_value location to store set the uniform value in
    */
    public void getArgVec4(@Nonnull ch.bailu.gtk.glib.Bytes args, int idx, @Nonnull ch.bailu.gtk.graphene.Vec4 out_value)  {
        JnaGLShader.INST().gsk_gl_shader_get_arg_vec4(asCPointer(), asCPointerNotNull(args), idx, asCPointerNotNull(out_value));
    }

    /**
     * Get the size of the data block used to specify arguments for this shader.
     * @return The size of the data block
    */
    public long getArgsSize()  {
        return JnaGLShader.INST().gsk_gl_shader_get_args_size(asCPointer());
    }

    /**
     * Returns the number of textures that the shader requires.
     * <br>
     * <br>This can be used to check that the a passed shader works
     * <br>in your usecase. It is determined by looking at the highest
     * <br>u_textureN value that the shader defines.
     * @return The number of texture inputs required by &#64;shader
    */
    public int getNTextures()  {
        return JnaGLShader.INST().gsk_gl_shader_get_n_textures(asCPointer());
    }

    /**
     * Get the number of declared uniforms for this shader.
     * @return The number of declared uniforms
    */
    public int getNUniforms()  {
        return JnaGLShader.INST().gsk_gl_shader_get_n_uniforms(asCPointer());
    }

    /**
     * Gets the resource path for the GLSL sourcecode being used
     * <br>to render this shader.
     * @return The resource path for the shader
    */
    public ch.bailu.gtk.type.Str getResource()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGLShader.INST().gsk_gl_shader_get_resource(asCPointer())));
    }

    /**
     * Gets the GLSL sourcecode being used to render this shader.
     * @return The source code for the shader
    */
    public ch.bailu.gtk.glib.Bytes getSource()  {
        return new ch.bailu.gtk.glib.Bytes(new PointerContainer(JnaGLShader.INST().gsk_gl_shader_get_source(asCPointer())));
    }

    /**
     * Get the name of the declared uniform for this shader at index &#64;idx.
     * @param idx index of the uniform
     * @return The name of the declared uniform
    */
    public ch.bailu.gtk.type.Str getUniformName(int idx)  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaGLShader.INST().gsk_gl_shader_get_uniform_name(asCPointer(), idx)));
    }

    /**
     * Get the offset into the data block where data for this uniforms is stored.
     * @param idx index of the uniform
     * @return The data offset
    */
    public int getUniformOffset(int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_uniform_offset(asCPointer(), idx);
    }

    /**
     * Get the type of the declared uniform for this shader at index &#64;idx.
     * @param idx index of the uniform
     * @return The type of the declared uniform
    */
    public int getUniformType(int idx)  {
        return JnaGLShader.INST().gsk_gl_shader_get_uniform_type(asCPointer(), idx);
    }

    public static long getTypeID() { 
        return JnaGLShader.INST().gsk_gl_shader_get_type(); 
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

[MethodModel:java-type-not-supported:formatArgsVa:[ParameterModel:Supported:{Gg:Bytes:{c:GBytes*}}:{j:long}]]
        [ParameterModel:java-type-not-supported:{G_::{c:va_list}}:{j:}]
*/
