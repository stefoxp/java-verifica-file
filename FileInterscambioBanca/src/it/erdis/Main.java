package it.erdis;

import javax.swing.*;
import java.nio.charset.Charset;

public class Main {


    public static void main(String[] args) {
        /* test
        String path = "c:\\test\\";
        String fileInputName = "file_banca_prova.txt";
        String fileOutputName = "file_banca_prova_corretto.txt";
        Files files = new Files(path + fileInputName, path + fileOutputName);

        files.read();
        files.write();
        // test();
         */
        VerificaFileBanca verificaFileBanca = new VerificaFileBanca();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verificaFileBanca.setVisible(true);
            }
        });

        // verificaFileBanca.
    }

    /*private static void test() {
        String[][] a = {
                {"å", "a"},
                {"à", "a"},
                {"â", "a"},
                {"ã", "a"},
                {"ä", "a"},
                {"æ", "a"},
                {"è", "e"},
                {"é", "e"},
                {"ê", "e"},
                {"ë", "e"},
        };
        String original = "";
        final String charsetFileInput = "windows-1252";

        for (int i = 0; i < a.length; ++i) {
            // original = verifiche.replaceWordChars(a[i][0], charsetFileInput);
            byte[] by = a[i][0].getBytes(Charset.forName(charsetFileInput));
            System.out.println("original: " + a[i][0]); // + " diventa: " + original);
            System.out.println("in byte");
            System.out.println(by);

            //String ans = StandardCharsets.UTF_8.
            // String s = , Charset.forName("UTF-8"));
            System.out.println("ritradotta in stringa: " + a[i][1]);
        }
    }*/

//    private static void converti() {
//        final Charset windowsCharset = Charset.forName("windows-1252");
//        final Charset utfCharset = Charset.forName("UTF-16");
//        final CharBuffer windowsEncoded = windowsCharset.decode(ByteBuffer.wrap(new byte[] {(byte) 0x91}));
//        final byte[] utfEncoded = utfCharset.encode(windowsEncoded).array();
//        System.out.println(new String(utfEncoded, utfCharset.displayName()));
//    }


}
