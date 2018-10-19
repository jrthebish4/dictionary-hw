import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Jake on 10/17/18.
 */
public class DictionaryTest {

    @Test
    public void isEnglishWord() throws Exception {
        Dictionary dictionary = new Dictionary();
        assertTrue(dictionary.isEnglishWord("snake"));
    }

//    public static void main(String args[]) {
//        org.junit.runner.JUnitCore.main("DictionaryTest");
//    }

    @Test
    public void findWordsInAString() throws Exception{
        Dictionary dictionary = new Dictionary();
        StringPermutations stringPermutations = new StringPermutations(dictionary);
        stringPermutations.findWordsInString("12345");
    }


}