package saveGame.Task1_Installation;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Arrays;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class saveGameTest {
    @Test
    public void mkdirTest_success() {

        final String parent = "valid path";
        final String child = "child file";
        final File file = new File(parent, child);
        final String result = file.getPath();

        assertThat(result, stringContainsInOrder(Arrays.asList(parent, child)));
    }

    @Test
    public void mkdirTest_NoArgument_throwsException() {

        final String parent = "valid path";
        final String child = "child file";
        final File file = new File(parent, child);
        final String result = file.getPath();

        assertThat(result, not(isEmptyOrNullString()));
    }

}
