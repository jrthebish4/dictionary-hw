import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

/**
 * Created by Jake on 10/17/18.
 */
public class Dictionary {

    private static final String DICTIONARY_API_BASE_URL = "https://od-api.oxforddictionaries.com:443/api/v1/";
    private static final String API_ID = "932fae3b";
    private static final String API_KEY = "87288283740bf5f5ecfa080b2178abf1";


    private String createLookupURL(String word) {
        final String lookupType = "entries"; //entry lookup
        final String language = "en"; //english dictionary
        final String wordId = word.toLowerCase(); //word must be lowercase
        return DICTIONARY_API_BASE_URL + lookupType + "/" + language + "/" + wordId;
    }


    public Boolean isEnglishWord(String word) {

        Boolean isRealWord = false;

        try {
            URL url = new URL(createLookupURL(word));
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setRequestProperty("app_id", API_ID);
            urlConnection.setRequestProperty("app_key", API_KEY);

            int responseCode = urlConnection.getResponseCode();

            isRealWord = (responseCode == 200); //API returns a 200 response if word is in dictionary

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isRealWord;
    }

}