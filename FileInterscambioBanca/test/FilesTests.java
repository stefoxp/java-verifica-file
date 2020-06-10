import it.erdis.Files;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilesTests {
    private Files files;

    @Before
    public void setUp() throws Exception {
        String path = "c:\\test\\";
        String fileInputName = "file_banca_prova.txt";
        String fileOutputName = "file_banca_prova_corretto.txt";
        this.files = new Files(path + fileInputName, path + fileOutputName);
    }

    @After
    public void tearDown() throws Exception {
        this.files = null;
    }

    @Test
    public void testRead() {
        this.files.read();
    }

    @Test
    public void testWrite() {
        this.files.write();
    }
}
