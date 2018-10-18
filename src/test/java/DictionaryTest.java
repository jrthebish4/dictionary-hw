import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Jake on 10/17/18.
 */
public class DictionaryTest {

    @Test
    public void isEnglishWord() throws Exception {
        Dictionary dictionary = new Dictionary();
        String dog = dictionary.isEnglishWord("dog");
        System.out.print(dog);
        assertTrue(dog.contains("dog"));
    }

//    public static void main(String args[]) {
//        org.junit.runner.JUnitCore.main("DictionaryTest");
//    }

}