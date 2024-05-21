package saveGame.Task_2_Conservation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OpenProgress {
    public static GameProgress openProgress(String pathSaveProgress) {
        GameProgress progress = null;
        try (FileInputStream fileSaved = new FileInputStream(pathSaveProgress);
             ObjectInputStream fileSavadInput = new ObjectInputStream(fileSaved)) {
            progress = (GameProgress) fileSavadInput.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return progress;
    }
}
