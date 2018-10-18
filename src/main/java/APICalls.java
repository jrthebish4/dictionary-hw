//import javax.net.ssl.HttpsURLConnection;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.URL;
//
///**
// * Created by Jakob on 10/17/18.
// */
//public class APICalls {
//
//    import android.os.Bundle;
//    import android.support.v7.app.AppCompatActivity;
//
//    //add dependencies to your class
//    import java.io.BufferedReader;
//    import java.io.InputStreamReader;
//    import java.net.URL;
//    import javax.net.ssl.HttpsURLConnection;
//    import android.os.AsyncTask;
//
//
//    public class MainActivity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            new CallbackTask().execute(inflections());
//        }
//
//        private String inflections() {
//            final String language = "en";
//            final String word = "Change";
//            final String word_id = word.toLowerCase(); //word id is case sensitive and lowercase is required
//            return "https://od-api.oxforddictionaries.com:443/api/v1/inflections/" + language + "/" + word_id;
//        }
//
//
//        //in android calling network requests on the main thread forbidden by default
//        //create class to do async job
//        private class CallbackTask extends AsyncTask<String, Integer, String> {
//
//            @Override
//            protected String doInBackground(String... params) {
//
//                //TODO: replace with your own app id and app key
//                final String app_id = "932fae3b";
//                final String app_key = "87288283740bf5f5ecfa080b2178abf1";
//                try {
//                    URL url = new URL(params[0]);
//                    HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
//                    urlConnection.setRequestProperty("Accept","application/json");
//                    urlConnection.setRequestProperty("app_id",app_id);
//                    urlConnection.setRequestProperty("app_key",app_key);
//
//                    // read the output from the server
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//                    StringBuilder stringBuilder = new StringBuilder();
//
//                    String line = null;
//                    while ((line = reader.readLine()) != null) {
//                        stringBuilder.append(line + "\n");
//                    }
//
//                    return stringBuilder.toString();
//
//                }
//                catch (Exception e) {
//                    e.printStackTrace();
//                    return e.toString();
//                }
//            }
//
//            @Override
//            protected void onPostExecute(String result) {
//                super.onPostExecute(result);
//
//                System.out.println(result);
//            }
//        }
//    }
//}
