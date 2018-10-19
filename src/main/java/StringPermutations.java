import java.util.ArrayList;

/**
 * Created by Jakob on 10/19/18.
 */
public class StringPermutations {

    private Dictionary dictionary;
    private ArrayList<String> permutations = new ArrayList<String>();


    public StringPermutations(Dictionary dictionary) {
        this.dictionary = dictionary;
    }


    public void findWordsInString(String characters) {
        int n = characters.length();

        permute(characters, 0, n - 1);

        for (String permutation : this.permutations) {
            if (dictionary.isEnglishWord(permutation)) {
                System.out.println(permutation);
            }
        }
    }


    /**
     * Find permutations of a string
     * @param str string to calculate permutation for
     * @param l   starting index
     * @param r   end index
     * @author Mihir Joshi
     */
    private void permute(String str, int l, int r) {
        if (l == r) {
            permutations.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }


    /**
     * Swap characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     * @author Mihir Joshi
     */
    private String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


}