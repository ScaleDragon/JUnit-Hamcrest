package saveGame.Task_2_Conservation;

import static saveGame.Task_2_Conservation.OpenProgress.openProgress;
import static saveGame.Task_2_Conservation.OpenZip.openZip;
import static saveGame.Task_2_Conservation.SaveGame.saveGame;
import static saveGame.Task_2_Conservation.ZipFiles.zipFiles;

public class Main {
    public static void main(String[] args) {
        GameProgress progress1 = new GameProgress(89, 3, 16, 156.6);
        GameProgress progress2 = new GameProgress(67, 2, 18, 346.9);
        GameProgress progress3 = new GameProgress(56, 1, 23, 567.4);

        saveGame("F:\\GamesNetology\\savegames\\save1.dat", progress1);
        saveGame("F:\\GamesNetology\\savegames\\save2.dat", progress2);
        saveGame("F:\\GamesNetology\\savegames\\save3.dat", progress3);

        zipFiles("F:\\GamesNetology\\savegames\\save1.zip",
                "F:\\GamesNetology\\savegames\\save1.dat");
        zipFiles("F:\\GamesNetology\\savegames\\save2.zip",
                "F:\\GamesNetology\\savegames\\save2.dat");
        zipFiles("F:\\GamesNetology\\savegames\\save3.zip",
                "F:\\GamesNetology\\savegames\\save3.dat");

        openZip("F:\\GamesNetology\\savegames\\save1.zip", "F:\\GamesNetology\\savegames");

        System.out.println(openProgress("F:\\GamesNetology\\savegames\\save1.dat"));

    }
}
