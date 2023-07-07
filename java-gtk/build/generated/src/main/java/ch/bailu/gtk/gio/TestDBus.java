/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A helper class for testing code which uses D-Bus without touching the user's
 * <br>session bus.
 * <br>
 * <br>Note that &#35;GTestDBus modifies the user’s environment, calling setenv().
 * <br>This is not thread-safe, so all &#35;GTestDBus calls should be completed before
 * <br>threads are spawned, or should have appropriate locking to ensure no access
 * <br>conflicts to environment variables shared between &#35;GTestDBus and other
 * <br>threads.
 * <br>
 * <br>&#35;&#35; Creating unit tests using GTestDBus
 * <br>
 * <br>Testing of D-Bus services can be tricky because normally we only ever run
 * <br>D-Bus services over an existing instance of the D-Bus daemon thus we
 * <br>usually don't activate D-Bus services that are not yet installed into the
 * <br>target system. The &#35;GTestDBus object makes this easier for us by taking care
 * <br>of the lower level tasks such as running a private D-Bus daemon and looking
 * <br>up uninstalled services in customizable locations, typically in your source
 * <br>code tree.
 * <br>
 * <br>The first thing you will need is a separate service description file for the
 * <br>D-Bus daemon. Typically a `services` subdirectory of your `tests` directory
 * <br>is a good place to put this file.
 * <br>
 * <br>The service file should list your service along with an absolute path to the
 * <br>uninstalled service executable in your source tree. Using autotools we would
 * <br>achieve this by adding a file such as `my-server.service.in` in the services
 * <br>directory and have it processed by configure.
 * <pre>
 *     [D-BUS Service]
 *     Name=org.gtk.GDBus.Examples.ObjectManager
 *     Exec=&#64;abs_top_builddir&#64;/gio/tests/gdbus-example-objectmanager-server
 * </pre>
 * <br>You will also need to indicate this service directory in your test
 * <br>fixtures, so you will need to pass the path while compiling your
 * <br>test cases. Typically this is done with autotools with an added
 * <br>preprocessor flag specified to compile your tests such as:
 * <pre>
 *     -DTEST_SERVICES=&#92;&quot;&quot;$(abs_top_builddir)/tests/services&quot;&#92;&quot;
 * </pre>
 * <br>    Once you have a service definition file which is local to your source tree,
 * <br>you can proceed to set up a GTest fixture using the &#35;GTestDBus scaffolding.
 * <br>
 * <br>An example of a test fixture for D-Bus services can be found
 * <br>here:
 * <br>[gdbus-test-fixture.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-test-fixture.c)
 * <br>
 * <br>Note that these examples only deal with isolating the D-Bus aspect of your
 * <br>service. To successfully run isolated unit tests on your service you may need
 * <br>some additional modifications to your test case fixture. For example; if your
 * <br>service uses GSettings and installs a schema then it is important that your test service
 * <br>not load the schema in the ordinary installed location (chances are that your service
 * <br>and schema files are not yet installed, or worse; there is an older version of the
 * <br>schema file sitting in the install location).
 * <br>
 * <br>Most of the time we can work around these obstacles using the
 * <br>environment. Since the environment is inherited by the D-Bus daemon
 * <br>created by &#35;GTestDBus and then in turn inherited by any services the
 * <br>D-Bus daemon activates, using the setup routine for your fixture is
 * <br>a practical place to help sandbox your runtime environment. For the
 * <br>rather typical GSettings case we can work around this by setting
 * <br>`GSETTINGS_SCHEMA_DIR` to the in tree directory holding your schemas
 * <br>in the above fixture_setup() routine.
 * <br>
 * <br>The GSettings schemas need to be locally pre-compiled for this to work. This can be achieved
 * <br>by compiling the schemas locally as a step before running test cases, an autotools setup might
 * <br>do the following in the directory holding schemas:
 * <pre>
 *     all-am:
 *             $(GLIB_COMPILE_SCHEMAS) .
 * 
 *     CLEANFILES += gschemas.compiled
 * </pre>
 * <p><a href="https://docs.gtk.org/gio/class.TestDBus.html">https://docs.gtk.org/gio/class.TestDBus.html</a></p>
*/
public class TestDBus extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TestDBus.class.getCanonicalName());
    }

    public TestDBus(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a new &#35;GTestDBus object.
     * @param flags a &#35;GTestDBusFlags
    */
    public TestDBus(int flags) {
        super(cast(JnaTestDBus.INST().g_test_dbus_new(flags)));
    }

    /**
     * Add a path where dbus-daemon will look up .service files. This can't be
     * <br>called after g_test_dbus_up().
     * @param path path to a directory containing .service files
    */
    public void addServiceDir(@Nonnull ch.bailu.gtk.type.Str path)  {
        JnaTestDBus.INST().g_test_dbus_add_service_dir(asCPointer(), asCPointerNotNull(path));
    }

    /**
     * Add a path where dbus-daemon will look up .service files. This can't be
     * <br>called after g_test_dbus_up().
     * @param path path to a directory containing .service files
    */
    public void addServiceDir(String path)  {
        JnaTestDBus.INST().g_test_dbus_add_service_dir(asCPointer(), path);
    }

    /**
     * Stop the session bus started by g_test_dbus_up().
     * <br>
     * <br>This will wait for the singleton returned by g_bus_get() or g_bus_get_sync()
     * <br>to be destroyed. This is done to ensure that the next unit test won't get a
     * <br>leaked singleton from this test.
    */
    public void down()  {
        JnaTestDBus.INST().g_test_dbus_down(asCPointer());
    }

    /**
     * Get the address on which dbus-daemon is running. If g_test_dbus_up() has not
     * <br>been called yet, %NULL is returned. This can be used with
     * <br>g_dbus_connection_new_for_address().
     * @return the address of the bus, or %NULL.
    */
    public ch.bailu.gtk.type.Str getBusAddress()  {
        return new ch.bailu.gtk.type.Str(new PointerContainer(JnaTestDBus.INST().g_test_dbus_get_bus_address(asCPointer())));
    }

    /**
     * Get the flags of the &#35;GTestDBus object.
     * @return the value of &#35;GTestDBus:flags property
    */
    public int getFlags()  {
        return JnaTestDBus.INST().g_test_dbus_get_flags(asCPointer());
    }

    /**
     * Stop the session bus started by g_test_dbus_up().
     * <br>
     * <br>Unlike g_test_dbus_down(), this won't verify the &#35;GDBusConnection
     * <br>singleton returned by g_bus_get() or g_bus_get_sync() is destroyed. Unit
     * <br>tests wanting to verify behaviour after the session bus has been stopped
     * <br>can use this function but should still call g_test_dbus_down() when done.
    */
    public void stop()  {
        JnaTestDBus.INST().g_test_dbus_stop(asCPointer());
    }

    /**
     * Start a dbus-daemon instance and set DBUS_SESSION_BUS_ADDRESS. After this
     * <br>call, it is safe for unit tests to start sending messages on the session bus.
     * <br>
     * <br>If this function is called from setup callback of g_test_add(),
     * <br>g_test_dbus_down() must be called in its teardown callback.
     * <br>
     * <br>If this function is called from unit test's main(), then g_test_dbus_down()
     * <br>must be called after g_test_run().
    */
    public void up()  {
        JnaTestDBus.INST().g_test_dbus_up(asCPointer());
    }

    /**
     * Unset DISPLAY and DBUS_SESSION_BUS_ADDRESS env variables to ensure the test
     * <br>won't use user's session bus.
     * <br>
     * <br>This is useful for unit tests that want to verify behaviour when no session
     * <br>bus is running. It is not necessary to call this if unit test already calls
     * <br>g_test_dbus_up() before acquiring the session bus.
    */
    public static void unset()  {
        JnaTestDBus.INST().g_test_dbus_unset();
    }

    public static long getTypeID() { 
        return JnaTestDBus.INST().g_test_dbus_get_type(); 
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
*/
