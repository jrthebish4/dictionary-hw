import util.Dictionary;

import java.util.Arrays;

/**
 * This class is used to determine if a string of characters
 * can be broken into individual valid words from the dictionary
 * Created by Jakob on 10/19/18.
 */
public class WordBreak {

    private Dictionary dictionary = new Dictionary();

    /**
     * Breaks input into substring and checks if valid in dictionary
     * @param inputString - string to be broken down
     * @return true - if string can be broken into valid words
     */
    public boolean findWordsInAString(String inputString) {
        int[] pos = new int[inputString.length() + 1];

        Arrays.fill(pos, -1);

        pos[0] = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (pos[i] != -1) {
                for (int j = i + 1; j <= inputString.length(); j++) {
                    String substring = inputString.substring(i, j);
                    if (dictionary.isEnglishWord(substring)) {
                        pos[j] = i;
                        System.out.println(substring);
                    }
                }
            }
        }

        return pos[inputString.length()] != -1;
    }


    /**
     * main can be used testing as alternative to Junit tests
     */
    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        if (wordBreak.findWordsInAString("testing"))
            System.out.println("All valid words printed.");
        else
            System.out.println("No valid words found.");
    }

}
