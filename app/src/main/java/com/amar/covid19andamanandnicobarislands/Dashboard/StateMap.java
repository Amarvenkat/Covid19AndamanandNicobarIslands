package com.amar.covid19andamanandnicobarislands.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;

import com.amar.covid19andamanandnicobarislands.ApiInterface.ApiCovid19;
import com.amar.covid19andamanandnicobarislands.Apiclients.ApiClient;
import com.amar.covid19andamanandnicobarislands.R;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.Covid19Main;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.StateWise;
import com.amar.covid19andamanandnicobarislands.RetrofitClass.TelanganaDistrictData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StateMap extends AppCompatActivity {
    List<StateWise> state;
    WebView view;
    Button knowmore,telustate,zone;
    @SuppressLint("SetJavaScriptEnabled")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_map);

        telustate = (Button) findViewById(R.id.telustate);
        knowmore = (Button) findViewById(R.id.knowmore);
        view = (WebView) findViewById(R.id.webview);
        zone = (Button) findViewById(R.id.btnzone);

        view.getSettings().setJavaScriptEnabled(true);
        // this function is used to access javascript from html page
        view.addJavascriptInterface(new JavaScriptInterface(this), "AndroidNativeCode");
        // load file from assets folder

        view.loadUrl("file:///android_asset/map.html");


        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);

        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                state = response.body().getState();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        knowmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StateMap.this, LiveReport.class);
                startActivity(intent);


            }
        });

        telustate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StateMap.this, TelanganaDistrictData.class);
                startActivity(intent);

            }
        });
        zone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Bundle bundle = new Bundle();
                bundle.putString(THIRD,"third");
                */Intent intent = new Intent(StateMap.this, ZoneState.class);
                /*intent.putExtras(bundle);
                */startActivity(intent);
            }
        });
    }


    public class JavaScriptInterface {
        Context mContext;


        JavaScriptInterface(Context c) {
            mContext = c;
        }


        // method to send JsonArray to HTML
        @JavascriptInterface
        public void getValueJson() throws JSONException {
            final JSONArray jArray = new JSONArray();


            JSONObject jObject = new JSONObject();

            for (int position = 1; position < state.size(); position++) {

                jObject = new JSONObject();
                jObject.put("State", state.get(position).getState());
                jObject.put("Total", state.get(position).getConfirmed());
                jObject.put("Active", state.get(position).getActive());
                jObject.put("Dead", state.get(position).getDeaths());
                jObject.put("Recovered", state.get(position).getRecovered());

                jArray.put(jObject);

            }


            System.out.println(jArray.toString());
            // send value from java class to html javascript function
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    view.loadUrl("javascript:setJson(" + jArray + ")");
                }
            });

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        view = (WebView) findViewById(R.id.webview);

        view.getSettings().setJavaScriptEnabled(true);
        // this function is used to access javascript from html page
        view.addJavascriptInterface(new JavaScriptInterface(this), "AndroidNativeCode");
        // load file from assets folder

        view.loadUrl("file:///android_asset/map.html");


        ApiCovid19 apiService =
                ApiClient.getClient().create(ApiCovid19.class);

        Call<Covid19Main> call = apiService.getReport();
        call.enqueue(new Callback<Covid19Main>() {
            @Override
            public void onResponse(Response<Covid19Main> response) {

                state = response.body().getState();
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

}
