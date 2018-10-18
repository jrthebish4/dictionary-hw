import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Jake on 10/17/18.
 */
public class Dictionary {

    private String createLookupURL(String word) {
        final String language = "en";
        final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
        return "https://od-api.oxforddictionaries.com:443/api/v1/inflections/" + language + "/" + word_id;
    }

    public String isEnglishWord(String word){

        final String app_id = "932fae3b";
        final String app_key = "87288283740bf5f5ecfa080b2178abf1";

        try {
            URL url = new URL(createLookupURL(word));
            HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestProperty("Accept","application/json");
            urlConnection.setRequestProperty("app_id",app_id);
            urlConnection.setRequestProperty("app_key",app_key);

            // read the output from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }

            return stringBuilder.toString();

        }
        catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

}
