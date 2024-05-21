package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static saveGame.Task_2_Conservation.OpenZip.openZip;
import static saveGame.Task_2_Conservation.SaveGame.saveGame;

public class saveGameTest {

    @Test
    public void GameProgress_GameProgressTest_success() {
        final GameProgress progress = new GameProgress(99, 3, 156, 8);
        final String pathSave = "F:\\GamesNetology\\savegames\\save1.dat";
        final SaveGame expected = saveGame(pathSave, progress);
        final SaveGame result = saveGame(pathSave, progress);

        assertThat(expected, hasToString(result.toString()));

    }

    @Test
    public void GameProgressTest_NotNullArgument_throwsException() {
        // given:
        final GameProgress progress = new GameProgress(99, 3, 156, 8);
        final String pathSave = "F:\\GamesNetology\\savegames\\save1.dat";
        final SaveGame expected = saveGame(pathSave, progress);

        assertThat(expected.getPathSave(), notNullValue());
        assertThat(expected.getProgress(), notNullValue());
    }

    @Test
    public void test_Path_openZip() {
        final String pathZip = "F:\\GamesNetology\\savegames\\save1.zip";
        final String pathDirectory = "F:\\GamesNetology\\savegames";
        final OpenZip zip = openZip(pathZip, pathDirectory);
        final String result = zip.toString();
        assertThat(zip, hasToString(result));
    }

    @Test
    public void test_NotNull_openZip() {
        final String pathZip = "F:\\GamesNetology\\savegames\\save1.zip";
        final String pathDirectory = "F:\\GamesNetology\\savegames";
        final OpenZip zip = openZip(pathZip, pathDirectory);
        final String result = zip.toString();
        assertThat(result, not(isEmptyOrNullString()));
    }

}