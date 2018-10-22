import org.junit.Test;
import util.Dictionary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests the Dictionary class
 * Created by Jake on 10/19/18.
 */
public class DictionaryTest {

    @Test
    public void isEnglishWord() throws Exception {
        Dictionary dictionary = new Dictionary();
        assertTrue(dictionary.isEnglishWord("run"));
        assertTrue(dictionary.isEnglishWord("climb"));
        assertTrue(dictionary.isEnglishWord("jump"));

        assertFalse(dictionary.isEnglishWord("notaword"));
        assertFalse(dictionary.isEnglishWord("alsonotaword"));
        assertFalse(dictionary.isEnglishWord("definitelynotaword"));
    }

}