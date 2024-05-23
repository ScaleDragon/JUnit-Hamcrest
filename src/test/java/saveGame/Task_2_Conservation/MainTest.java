package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static saveGame.Task_2_Conservation.SaveGame.saveGame;

public class MainTest {

    @Test
    public void GameProgressTest_Object_Creation() {

        final GameProgress progressActual = new GameProgress(99, 3, 156, 8);

        assertThat(progressActual, hasToString(progressActual.toString()));
    }

    @Test
    public void GameProgressTest_isNot_NullArgument() {

        final GameProgress progressActual = new GameProgress(99, 3, 156, 8);

        assertThat(progressActual.getClass(), notNullValue());
    }

    @Test
    public void SaveGameTest() {

        final String pathSave = "F:\\GamesNetology\\savegames\\save2.dat";
        final GameProgress progressActual = new GameProgress(67, 2, 18, 346.9);
        final SaveGame save = saveGame(pathSave, progressActual);
        final String expected = "SaveGame{pathSave='F:\\GamesNetology\\savegames\\save2.dat', " +
                "progress=GameProgress{health=67, weapons=2, lvl=18, distance=346.9}}";

        assertThat(save.toString(), equalTo(expected));

    }

    @Test
    void getPathSave() {
        final String pathSave = "F:\\GamesNetology\\savegames\\save3.dat";
        final GameProgress progressActual = new GameProgress(67, 2, 18, 346.9);
        final SaveGame save = saveGame(pathSave, progressActual);

        assertThat(save.getPathSave(), equalTo("F:\\GamesNetology\\savegames\\save3.dat"));
    }
}