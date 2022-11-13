package ch.bailu.gtk.lib.bridge.menu;

import javax.annotation.Nullable;

import ch.bailu.gtk.gio.Action;
import ch.bailu.gtk.gio.SimpleAction;
import ch.bailu.gtk.glib.Variant;
import ch.bailu.gtk.glib.VariantType;
import ch.bailu.gtk.gtk.Application;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.Strs;

/**
 * https://manpagez.com/html/glib/glib-2.40.0/gvariant-format-strings.php#gvariant-format-strings-numeric-types
 */
public class Actions {

    private final static Str INTEGER = new Str("i");

    private final Application app;
    private final String name;

    private final ActionResources actions;

    public Actions(Application app) {
        this.name = "app";
        this.app = app;
        this.actions = new ActionResources(app);
    }

    public void add(String name, SimpleAction.OnActivate run) {
        var str = new Str(name);
        var action = new SimpleAction(str, null);
        action.onActivate(run);
        actions.add(name, action);
        str.destroy();

    }

    public void add(String name, boolean initial, SimpleAction.OnActivate run) {

        var strName = new Str(name);
        var action = SimpleAction.newStatefulSimpleAction(strName, null, Variant.newBooleanVariant(initial));
        strName.destroy();

        var runWrapper = new SimpleAction.OnActivate() {
            @Override
            public void onActivate(@Nullable Variant parameter) {
                toggleState(name);
                run.onActivate(parameter);
            }
        };

        action.onActivate(runWrapper);
        actions.add(name, action);
    }

    public void add(String name, int initial, SimpleAction.OnActivate run) {
        var strName = new Str(name);
        var action = SimpleAction.newStatefulSimpleAction(strName, new VariantType(INTEGER), Variant.newInt32Variant(initial));
        strName.destroy();

        var runWrapper = new SimpleAction.OnActivate() {
            @Override
            public void onActivate(@Nullable Variant parameter) {
                if (parameter != null) {
                    action.setState(parameter);
                    run.onActivate(parameter);
                }
            }
        };
        action.onActivate(runWrapper);
        actions.add(name, action);
    }

    public void changeState(String name, boolean checked) {
        Action action = actions.get(name);

        if (action != null) {
            action.changeState(Variant.newBooleanVariant(checked));
        }
    }

    public boolean toggleState(String name) {
        Action action = actions.get(name);

        if (action != null) {
            action.changeState(Variant.newBooleanVariant(action.getState().getBoolean()));
            return getBooleanState(name);
        }
        return false;
    }

    public int getState(String name) {
        Action action = actions.get(name);
        if (action != null) {
            return action.getState().getInt32();
        }
        return 0;
    }

    public boolean getBooleanState(String name) {
        Action action = actions.get(name);

        if (action != null) {
            return action.getState().getBoolean();
        }
        return false;
    }

    public void setAccels(String name, String[] accels) {
        if (accels != null && accels.length > 1 && accels[accels.length - 1] == null) {
            app.setAccelsForAction(new Str(this.name + "." + name), new Strs(accels));
        }
    }
}