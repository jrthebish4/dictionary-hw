import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Jakob on 10/17/18.
 */
public class DictionaryTest {

    @Test
    public void isEnglishWord() throws Exception {
        Dictionary dictionary = new Dictionary();
        String dog = dictionary.isEnglishWord("dog");

        assertTrue(dog.contains("dog"));
    }

}