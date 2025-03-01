package com.example.guess_the_celebrity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int choCele;
    ImageView imageView;
    ArrayList<String> celeUrls = new ArrayList<>();
    ArrayList<String> celeName = new ArrayList<>();
    String[] ans = new String[4];
    int correctAns = 0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        DownloadTask task = new DownloadTask();

        try {
            task.execute("https://www.imdb.com/list/ls545872826/");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class ImageDownload extends AsyncTask<String , Void , Bitmap>{

        @Override
        protected Bitmap doInBackground(String... urls) {
            try {
                URL url = new URL(urls[0]);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.connect();
                InputStream in = httpURLConnection.getInputStream();

                Bitmap bitmap = BitmapFactory.decodeStream(in);

                return bitmap;

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            StringBuilder result = new StringBuilder();
            URL url;
            HttpURLConnection httpURLConnection = null;
            try {
                url = new URL(urls[0]);
                httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream in = httpURLConnection.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                int data = reader.read();
                while (data != -1) {
                    char current = (char) data;
                    result.append(current);
                    data = reader.read();
                }
                return result.toString();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
            return "Failed";
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            Log.i("Result", result);  // Log the result after task completion
            if (result.equals("Failed")) {
                Log.i("Error", "Failed to retrieve content from the URL.");
                return;
            }
            try {
//                String[] splitt = result.split("class=\"ipc-metadata-list-summary-item\"");


                Pattern namePattern = Pattern.compile("<img alt=\\\"(.*?)\\\"");
                Pattern imgPattern = Pattern.compile("<img[^>]*src=[\\\"']([^\\\"']*)[\\\"'][^>]*>");

                Matcher imgMatcher = imgPattern.matcher(result);
                Matcher nameMatcher = namePattern.matcher(result);

                while (imgMatcher.find()) {
                    String imageUrl = imgMatcher.group(1);

//                    Log.i("Celebrity Image URL", imageUrl);
                    celeUrls.add(imageUrl);
                }
                while (nameMatcher.find()) {
                    String name = nameMatcher.group(1);

//                    Log.i("Celebrity Name", name);
                    celeName.add(name);
                }
                celeUrls.remove(0);
                celeUrls.remove(25);
                celeUrls.remove(25);
                celeName.remove(25);

                newQuestion();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void chCele(View view){
        if(view.getTag().toString().equals(Integer.toString(correctAns))){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Wrong. It Was "+celeName.get(choCele), Toast.LENGTH_SHORT).show();
        }
        newQuestion();
    }

    public void newQuestion(){
        if (celeUrls.isEmpty()) {
            Log.i("Error", "celeUrls is empty. Cannot download image.");
            return;
        }
        ImageDownload task0 = new ImageDownload();
//        celeUrls.remove(0);
//        celeUrls.remove(25);
//        celeUrls.remove(25);
//        celeName.remove(25);
//                celeName.remove(7);
        Random random =new Random();
        int cele = celeUrls.size();
//                int ce = celeName.size();
        choCele = random.nextInt(cele);
        Bitmap myImage;
//                System.out.println(cele);
//                System.out.println(ce);
//                System.out.println(celeName);
//                System.out.println(celeUrls);
        try {
            myImage = task0.execute(celeUrls.get(choCele)).get();
            imageView.setImageBitmap(myImage);

            correctAns = random.nextInt(4);
            int incorr ;
            ArrayList<String> usedNames = new ArrayList<>();
            usedNames.add(celeName.get(choCele)); // Add correct answer to avoid duplication


            for(int i=0;i<4;i++){
                if(i == correctAns){
                    ans[i] = celeName.get(choCele);
                }else {
//                            incorr = random.nextInt(cele);
//
//                            while (incorr == choCele){
//                                incorr = random.nextInt(cele);
//                            }
//                            ans[i] = celeName.get(incorr);
                    do {
                        incorr = random.nextInt(cele);
                    } while (usedNames.contains(celeName.get(incorr))); // Ensure no duplicate names
                    ans[i] = celeName.get(incorr);
                    usedNames.add(celeName.get(incorr));
                }
            }
            button1.setText(ans[0]);
            button2.setText(ans[1]);
            button3.setText(ans[2]);
            button4.setText(ans[3]);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}