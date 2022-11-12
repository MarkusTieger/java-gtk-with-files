package ch.bailu.gtk

import ch.bailu.gtk.builder.AliasBuilder
import ch.bailu.gtk.builder.BuilderInterface
import ch.bailu.gtk.builder.ModelBuilder
import ch.bailu.gtk.log.Logable
import ch.bailu.gtk.parser.Parser
import ch.bailu.gtk.table.AliasTable
import ch.bailu.gtk.table.CallbackTable
import ch.bailu.gtk.table.EnumTable
import ch.bailu.gtk.table.StructureTable
import org.xmlpull.v1.XmlPullParserException
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException


fun main(args: Array<String>) {
    try {
        val directories = Directories(args)

        println("==> fill tables")
        parse(directories, AliasBuilder())

        println("==> log tables")
        logTables()

        println("==> build model and write code files")
        parse(directories, ModelBuilder(directories))

    } catch (e: Exception) {
        e.printStackTrace()
    }
}

@Throws(IOException::class, XmlPullParserException::class)
fun parse(directories: Directories, builder: BuilderInterface) {
    Configuration.NAMESPACES.forEach {Parser(directories, it, builder)}
}

@Throws(IOException::class)
private fun logTables() {
    logTable(StructureTable, Configuration.LOG_STRUCTURE_TABLE_FILE)
    logTable(AliasTable,     Configuration.LOG_ALIAS_TABLE_FILE)
    logTable(CallbackTable,  Configuration.LOG_CALLBACK_TABLE_FILE)
    logTable(EnumTable,      Configuration.LOG_ENUM_TABLE_FILE)
}

@Throws(IOException::class)
private fun logTable(logable: Logable, file: String) {
    println("  --> $file")
    BufferedWriter(FileWriter(file)).use {
        logable.log(it)
    }
}
