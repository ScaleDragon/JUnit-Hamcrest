package saveGame.Task1_Installation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder logInfo = new StringBuilder();

        File srcDirectory = new File("F:\\GamesNetology", "src");
        File resDirectory = new File("F:\\GamesNetology", "res");
        File savegamesDirectory = new File("F:\\GamesNetology", "savegames");
        File tempDirectory = new File("F:\\GamesNetology", "temp");

        srcDirectory.mkdir();
        logInfo.append("Directory creation \" src\" successful\n");

        resDirectory.mkdir();
        logInfo.append("Directory creation \" res\" successful\n");

        savegamesDirectory.mkdir();
        logInfo.append("Directory creation \" savegames\" successful\n");

        tempDirectory.mkdir();
        logInfo.append("Directory creation \" temp\" successful\n");


        File mainDirectory = new File("F:\\GamesNetology\\src", "main");
        File testDirectory = new File("F:\\GamesNetology\\src", "test");

        mainDirectory.mkdir();
        logInfo.append("Directory creation \" main\" successful\n");
        testDirectory.mkdir();
        logInfo.append("Directory creation \" test\" successful\n");

        File MainFile = new File("F:\\GamesNetology\\src\\main", "Main.java");
        File UtilsFile = new File("F:\\GamesNetology\\src\\main", "Utils.java");

        try {
            MainFile.createNewFile();
            logInfo.append("File creation \" Main.java\" successful\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            UtilsFile.createNewFile();
            logInfo.append("File creation \" Utils.java\" successful\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File drawablesDirectory = new File("F:\\GamesNetology\\res", "drawables");
        File vectorsDirectory = new File("F:\\GamesNetology\\res", "vectors");
        File iconsDirectory = new File("F:\\GamesNetology\\res", "icons");

        drawablesDirectory.mkdir();
        logInfo.append("Directory creation \" drawables\" successful\n");
        vectorsDirectory.mkdir();
        logInfo.append("Directory creation \" vectors\" successful\n");
        iconsDirectory.mkdir();
        logInfo.append("Directory creation \" icons\" successful\n");

        File tempFile = new File("F:\\GamesNetology\\temp", "temp.txt");
        try {
            tempFile.createNewFile();
            logInfo.append("File creation \" temp.txt\" successful\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter writerTemp = new FileWriter("F:\\GamesNetology\\temp\\temp.txt")) {
            writerTemp.write(String.valueOf(logInfo));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
