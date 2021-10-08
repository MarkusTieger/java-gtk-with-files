package ch.bailu.gtk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ch.bailu.gtk.converter.NamespaceType;
import ch.bailu.gtk.table.AliasTable;

public class TestAlias {

    @Test void testAlias() {
        var from = new NamespaceType("gtk", "Allocation");
        var to = new NamespaceType("gdk", "Rectangle");


        AliasTable.INSTANCE.add(from, to);

        var test = AliasTable.INSTANCE.convert(from);

        assertEquals("Rectangle", test.getName());
        assertEquals("gdk", test.getNamespace());
    }
/*
    @Test void aliasParser() throws IOException, XmlPullParserException {
        var from = new NamespaceType("gdk", "Rectangle");
        var to = new NamespaceType("gtk", "Allocation");

        String[] args = {"-i", "/usr/share/gir-1.0",
                "-j", "library/build/generated/src/main/java/ch/bailu/gtk/",
                "-c", "${project.getRootDir()}/glue/build/generated/src/main/c/"};
        Configuration.init(args);

        App.parse(new AliasBuilder());

        var test = AliasTable.instance().convert(from);

        assertEquals("Rectangle", test.getName());
        assertEquals("gdk", test.getNamespace());


        ClassType classType = new ClassType("glib", "String", "GdkString");
        assertEquals("GString", classType.getFullName());

    }
    */

}
