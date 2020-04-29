package banca.erdis.it;

import java.io.File;

/**
 *
 * @author stefanop
 * from https://netbeans.org/kb/docs/java/gui-filechooser.html#filechooser
 */
class MyCustomFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }

    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "Text documents (*.txt)";
    }
}
