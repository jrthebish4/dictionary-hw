import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests the WordBreak class
 * Created by Jakob on 10/19/18.
 */
public class WordBreakTest {

    @Test
    public void findWordInAString() throws Exception {
        WordBreak wordBreak = new WordBreak();

        assertTrue(wordBreak.findWordsInAString("testing"));
    }

}
