package saveGame.Task_2_Conservation;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {
    private static int numberSave = 1;

    public static void zipFiles(String pathZipArchive, String pathSave) {
        try (ZipOutputStream zipSave = new ZipOutputStream(new FileOutputStream(pathZipArchive));
             FileInputStream saveGame = new FileInputStream(pathSave)) {
            ZipEntry entry = new ZipEntry("save" + numberSave + ".dat");
            numberSave++;
            zipSave.putNextEntry(entry);
            byte[] buffer = new byte[saveGame.available()];
            saveGame.read(buffer);
            zipSave.write(buffer);
            zipSave.closeEntry();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File deletFile = new File(pathSave);
        deletFile.delete();
    }
}
