package saveGame.Task_2_Conservation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame {
    private String pathSave;
    private GameProgress progress;
    private SaveGame save;

    public SaveGame(String pathSave, GameProgress progress) {
        this.pathSave = pathSave;
        this.progress = progress;
    }

    public static SaveGame saveGame(String pathSave, GameProgress progress) {
        try (ObjectOutputStream saveProgress = new ObjectOutputStream(new FileOutputStream(pathSave))) {
            saveProgress.writeObject(progress);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new SaveGame(pathSave,progress);
    }

    public String getPathSave() {
        return pathSave;
    }

    public GameProgress getProgress() {
        return progress;
    }

    @Override
    public String toString() {
        return "SaveGame{" +
                "pathSave='" + pathSave + '\'' +
                ", progress=" + progress +
                '}';
    }
}
