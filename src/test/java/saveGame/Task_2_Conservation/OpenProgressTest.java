package saveGame.Task_2_Conservation;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static saveGame.Task_2_Conservation.OpenProgress.openProgress;

class OpenProgressTest {

    @Test
    public void openProgressTest() {

        GameProgress progressActual = openProgress("F:\\GamesNetology\\savegames\\save1.dat");

        assertThat("GameProgress{health=89, weapons=3, lvl=16, distance=156.6}",
                equalTo(progressActual.toString()));
    }
}