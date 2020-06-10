package it.erdis;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Files {
    private String fileInputPath;
    private String fileOutputPath;
    private ArrayList<String> fileInputRows;

    public Files(String fileInputPath, String fileOutputPath) {
        setFileInputPath(fileInputPath);
        setFileOutputPath(fileOutputPath);
        setFileInputRows(new ArrayList<String>());
    }

    public void read() {
        // setFileInputPath("c:\\test\\file_banca_prova.txt");
        File file = new File(getFileInputPath());
        String line;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), Charset.forName("windows-1252")))) {
            while ((line = br.readLine()) != null) {
                // salvo la riga
                // OK: byte [] by = line.getBytes(Charset.forName("windows-1252"));
                // System.out.println("riga byte: ");
                // System.out.println(by);
                String[][] a = {
                        {"[åàáâãäæ]", "a"},
                        {"[ÁÀÄÃÅÂ]", "A"},
                        {"[èéêë]", "e"},
                        {"[ÈÉËÊ]", "E"},
                        {"[ìíîï]", "i"},
                        {"[ÍÌÏÎ]", "I"},
                        {"[òóôõö]", "o"},
                        {"[ÓÒÖÔÕ]", "O"},
                        {"[ùúûü]", "u"},
                        {"[ÚÙÛÜ]", "U"},
                        {"[¥]", "N"},
                        {"[ý]", "y"},
                        {"[Š]", "S"},
                        {"[š]", "s"},
                        {"[ç]", "c"},
                        {"[ñ]", "n"},
                        {"[Ñ]", "N"},
                        {"[ž]", "z"},
                        //{"[[]", "{"},
                        //{"[]]", ")"},
                        {"[@]", " "},
                        {"[#]", " "},
                        {"[ø]", " "},
                        // {@"[^\u0000-\u007F]", " "},
                };

                for (int i = 0; i < a.length; ++i) {
                    line = line.replaceAll(a[i][0], a[i][1]);
                }
                // salvo la riga
                getFileInputRows().add(line);
                // stampa a video (solo a scopo debug)
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("problem reading file" + getFileInputPath());
        }
    }

    public void write() {
        File file = new File(getFileOutputPath());
        try {
            OutputStream outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            for(String line: getFileInputRows()) {
                outputStreamWriter.write(line);
                outputStreamWriter.write("\r\n");
            }

            outputStreamWriter.close();
        } catch (IOException ex) {
            System.out.println("problem writing file" + getFileOutputPath());
        }
    }

    private ArrayList<String> getFileInputRows() {
        return fileInputRows;
    }

    private void setFileInputRows(ArrayList<String> fileInputRows) {
        this.fileInputRows = fileInputRows;
    }

    private String getFileInputPath() {
        return fileInputPath;
    }

    private void setFileInputPath(String fileInputPath) {
        this.fileInputPath = fileInputPath;
    }

    private String getFileOutputPath() {
        return fileOutputPath;
    }

    private void setFileOutputPath(String fileOutputPath) {
        this.fileOutputPath = fileOutputPath;
    }
}
